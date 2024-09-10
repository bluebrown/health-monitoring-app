/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.simulator.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class HealthRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6767980100257165395L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HealthRecord\",\"namespace\":\"com.simulator.avro\",\"fields\":[{\"name\":\"device_id\",\"type\":\"string\"},{\"name\":\"heart_rate\",\"type\":\"int\"},{\"name\":\"temperature\",\"type\":\"double\"},{\"name\":\"spo2\",\"type\":\"int\"},{\"name\":\"timestamp\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<HealthRecord> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<HealthRecord> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<HealthRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<HealthRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<HealthRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this HealthRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a HealthRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a HealthRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static HealthRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence device_id;
  private int heart_rate;
  private double temperature;
  private int spo2;
  private java.lang.CharSequence timestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public HealthRecord() {}

  /**
   * All-args constructor.
   * @param device_id The new value for device_id
   * @param heart_rate The new value for heart_rate
   * @param temperature The new value for temperature
   * @param spo2 The new value for spo2
   * @param timestamp The new value for timestamp
   */
  public HealthRecord(java.lang.CharSequence device_id, java.lang.Integer heart_rate, java.lang.Double temperature, java.lang.Integer spo2, java.lang.CharSequence timestamp) {
    this.device_id = device_id;
    this.heart_rate = heart_rate;
    this.temperature = temperature;
    this.spo2 = spo2;
    this.timestamp = timestamp;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return device_id;
    case 1: return heart_rate;
    case 2: return temperature;
    case 3: return spo2;
    case 4: return timestamp;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: device_id = (java.lang.CharSequence)value$; break;
    case 1: heart_rate = (java.lang.Integer)value$; break;
    case 2: temperature = (java.lang.Double)value$; break;
    case 3: spo2 = (java.lang.Integer)value$; break;
    case 4: timestamp = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'device_id' field.
   * @return The value of the 'device_id' field.
   */
  public java.lang.CharSequence getDeviceId() {
    return device_id;
  }


  /**
   * Sets the value of the 'device_id' field.
   * @param value the value to set.
   */
  public void setDeviceId(java.lang.CharSequence value) {
    this.device_id = value;
  }

  /**
   * Gets the value of the 'heart_rate' field.
   * @return The value of the 'heart_rate' field.
   */
  public int getHeartRate() {
    return heart_rate;
  }


  /**
   * Sets the value of the 'heart_rate' field.
   * @param value the value to set.
   */
  public void setHeartRate(int value) {
    this.heart_rate = value;
  }

  /**
   * Gets the value of the 'temperature' field.
   * @return The value of the 'temperature' field.
   */
  public double getTemperature() {
    return temperature;
  }


  /**
   * Sets the value of the 'temperature' field.
   * @param value the value to set.
   */
  public void setTemperature(double value) {
    this.temperature = value;
  }

  /**
   * Gets the value of the 'spo2' field.
   * @return The value of the 'spo2' field.
   */
  public int getSpo2() {
    return spo2;
  }


  /**
   * Sets the value of the 'spo2' field.
   * @param value the value to set.
   */
  public void setSpo2(int value) {
    this.spo2 = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.CharSequence getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.CharSequence value) {
    this.timestamp = value;
  }

  /**
   * Creates a new HealthRecord RecordBuilder.
   * @return A new HealthRecord RecordBuilder
   */
  public static com.simulator.avro.HealthRecord.Builder newBuilder() {
    return new com.simulator.avro.HealthRecord.Builder();
  }

  /**
   * Creates a new HealthRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new HealthRecord RecordBuilder
   */
  public static com.simulator.avro.HealthRecord.Builder newBuilder(com.simulator.avro.HealthRecord.Builder other) {
    if (other == null) {
      return new com.simulator.avro.HealthRecord.Builder();
    } else {
      return new com.simulator.avro.HealthRecord.Builder(other);
    }
  }

  /**
   * Creates a new HealthRecord RecordBuilder by copying an existing HealthRecord instance.
   * @param other The existing instance to copy.
   * @return A new HealthRecord RecordBuilder
   */
  public static com.simulator.avro.HealthRecord.Builder newBuilder(com.simulator.avro.HealthRecord other) {
    if (other == null) {
      return new com.simulator.avro.HealthRecord.Builder();
    } else {
      return new com.simulator.avro.HealthRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for HealthRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HealthRecord>
    implements org.apache.avro.data.RecordBuilder<HealthRecord> {

    private java.lang.CharSequence device_id;
    private int heart_rate;
    private double temperature;
    private int spo2;
    private java.lang.CharSequence timestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.simulator.avro.HealthRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.device_id)) {
        this.device_id = data().deepCopy(fields()[0].schema(), other.device_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.heart_rate)) {
        this.heart_rate = data().deepCopy(fields()[1].schema(), other.heart_rate);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.temperature)) {
        this.temperature = data().deepCopy(fields()[2].schema(), other.temperature);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.spo2)) {
        this.spo2 = data().deepCopy(fields()[3].schema(), other.spo2);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[4].schema(), other.timestamp);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing HealthRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(com.simulator.avro.HealthRecord other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.device_id)) {
        this.device_id = data().deepCopy(fields()[0].schema(), other.device_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.heart_rate)) {
        this.heart_rate = data().deepCopy(fields()[1].schema(), other.heart_rate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.temperature)) {
        this.temperature = data().deepCopy(fields()[2].schema(), other.temperature);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.spo2)) {
        this.spo2 = data().deepCopy(fields()[3].schema(), other.spo2);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[4].schema(), other.timestamp);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'device_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getDeviceId() {
      return device_id;
    }


    /**
      * Sets the value of the 'device_id' field.
      * @param value The value of 'device_id'.
      * @return This builder.
      */
    public com.simulator.avro.HealthRecord.Builder setDeviceId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.device_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'device_id' field has been set.
      * @return True if the 'device_id' field has been set, false otherwise.
      */
    public boolean hasDeviceId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'device_id' field.
      * @return This builder.
      */
    public com.simulator.avro.HealthRecord.Builder clearDeviceId() {
      device_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'heart_rate' field.
      * @return The value.
      */
    public int getHeartRate() {
      return heart_rate;
    }


    /**
      * Sets the value of the 'heart_rate' field.
      * @param value The value of 'heart_rate'.
      * @return This builder.
      */
    public com.simulator.avro.HealthRecord.Builder setHeartRate(int value) {
      validate(fields()[1], value);
      this.heart_rate = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'heart_rate' field has been set.
      * @return True if the 'heart_rate' field has been set, false otherwise.
      */
    public boolean hasHeartRate() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'heart_rate' field.
      * @return This builder.
      */
    public com.simulator.avro.HealthRecord.Builder clearHeartRate() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'temperature' field.
      * @return The value.
      */
    public double getTemperature() {
      return temperature;
    }


    /**
      * Sets the value of the 'temperature' field.
      * @param value The value of 'temperature'.
      * @return This builder.
      */
    public com.simulator.avro.HealthRecord.Builder setTemperature(double value) {
      validate(fields()[2], value);
      this.temperature = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'temperature' field has been set.
      * @return True if the 'temperature' field has been set, false otherwise.
      */
    public boolean hasTemperature() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'temperature' field.
      * @return This builder.
      */
    public com.simulator.avro.HealthRecord.Builder clearTemperature() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'spo2' field.
      * @return The value.
      */
    public int getSpo2() {
      return spo2;
    }


    /**
      * Sets the value of the 'spo2' field.
      * @param value The value of 'spo2'.
      * @return This builder.
      */
    public com.simulator.avro.HealthRecord.Builder setSpo2(int value) {
      validate(fields()[3], value);
      this.spo2 = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'spo2' field has been set.
      * @return True if the 'spo2' field has been set, false otherwise.
      */
    public boolean hasSpo2() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'spo2' field.
      * @return This builder.
      */
    public com.simulator.avro.HealthRecord.Builder clearSpo2() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.CharSequence getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public com.simulator.avro.HealthRecord.Builder setTimestamp(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.timestamp = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public com.simulator.avro.HealthRecord.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public HealthRecord build() {
      try {
        HealthRecord record = new HealthRecord();
        record.device_id = fieldSetFlags()[0] ? this.device_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.heart_rate = fieldSetFlags()[1] ? this.heart_rate : (java.lang.Integer) defaultValue(fields()[1]);
        record.temperature = fieldSetFlags()[2] ? this.temperature : (java.lang.Double) defaultValue(fields()[2]);
        record.spo2 = fieldSetFlags()[3] ? this.spo2 : (java.lang.Integer) defaultValue(fields()[3]);
        record.timestamp = fieldSetFlags()[4] ? this.timestamp : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<HealthRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<HealthRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<HealthRecord>
    READER$ = (org.apache.avro.io.DatumReader<HealthRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.device_id);

    out.writeInt(this.heart_rate);

    out.writeDouble(this.temperature);

    out.writeInt(this.spo2);

    out.writeString(this.timestamp);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.device_id = in.readString(this.device_id instanceof Utf8 ? (Utf8)this.device_id : null);

      this.heart_rate = in.readInt();

      this.temperature = in.readDouble();

      this.spo2 = in.readInt();

      this.timestamp = in.readString(this.timestamp instanceof Utf8 ? (Utf8)this.timestamp : null);

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.device_id = in.readString(this.device_id instanceof Utf8 ? (Utf8)this.device_id : null);
          break;

        case 1:
          this.heart_rate = in.readInt();
          break;

        case 2:
          this.temperature = in.readDouble();
          break;

        case 3:
          this.spo2 = in.readInt();
          break;

        case 4:
          this.timestamp = in.readString(this.timestamp instanceof Utf8 ? (Utf8)this.timestamp : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










