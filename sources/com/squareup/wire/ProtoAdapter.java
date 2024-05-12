package com.squareup.wire;

import X.AnonymousClass028;
import X.C16880lQ;
import X.C64533PUj;
import X.C64535PUl;
import X.C64537PUn;
import X.PU7;
import X.PVU;
import X.PW3;
import X.X1D;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.squareup.wire.Message;
import defpackage.i0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class ProtoAdapter<E> {
    public static final ProtoAdapter<Boolean> BOOL;
    public static final ProtoAdapter<C64537PUn> BYTES;
    public static final ProtoAdapter<Double> DOUBLE;
    public static final ProtoAdapter<Integer> FIXED32;
    public static final ProtoAdapter<Long> FIXED64;
    public static final ProtoAdapter<Float> FLOAT;
    public static final ProtoAdapter<Integer> INT32;
    public static final ProtoAdapter<Long> INT64;
    public static final ProtoAdapter<Integer> SFIXED32;
    public static final ProtoAdapter<Long> SFIXED64;
    public static final ProtoAdapter<Integer> SINT32;
    public static final ProtoAdapter<Long> SINT64;
    public static final ProtoAdapter<String> STRING;
    public static final ProtoAdapter<Integer> UINT32;
    public static final ProtoAdapter<Long> UINT64;
    public final FieldEncoding LIZ;
    public final Class<?> LIZIZ;
    public ProtoAdapter<List<E>> LIZJ;
    public ProtoAdapter<List<E>> LIZLLL;

    public abstract E decode(ProtoReader protoReader);

    public abstract void encode(ProtoWriter protoWriter, E e);

    public abstract int encodedSize(E e);

    public E redact(E e) {
        return null;
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        BOOL = new ProtoAdapter<Boolean>(fieldEncoding, Boolean.class) { // from class: com.squareup.wire.ProtoAdapter.1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Boolean bool) {
                return 1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Boolean decode(ProtoReader protoReader) {
                int readVarint32 = protoReader.readVarint32();
                if (readVarint32 == 0) {
                    return Boolean.FALSE;
                }
                if (readVarint32 == 1) {
                    return Boolean.TRUE;
                }
                throw new IOException(C16880lQ.LLLZ("Invalid boolean value 0x%02x", new Object[]{Integer.valueOf(readVarint32)}));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Boolean bool) {
                protoWriter.writeVarint32(bool.booleanValue() ? 1 : 0);
            }
        };
        INT32 = new ProtoAdapter<Integer>(fieldEncoding, Integer.class) { // from class: com.squareup.wire.ProtoAdapter.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) {
                return Integer.valueOf(protoReader.readVarint32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                int intValue = num.intValue();
                if (intValue >= 0) {
                    return ProtoWriter.LIZ(intValue);
                }
                return 10;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) {
                int intValue = num.intValue();
                if (intValue >= 0) {
                    protoWriter.writeVarint32(intValue);
                } else {
                    protoWriter.writeVarint64(intValue);
                }
            }
        };
        UINT32 = new ProtoAdapter<Integer>(fieldEncoding, Integer.class) { // from class: com.squareup.wire.ProtoAdapter.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) {
                return Integer.valueOf(protoReader.readVarint32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                return ProtoWriter.LIZ(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) {
                protoWriter.writeVarint32(num.intValue());
            }
        };
        SINT32 = new ProtoAdapter<Integer>(fieldEncoding, Integer.class) { // from class: com.squareup.wire.ProtoAdapter.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) {
                int readVarint32 = protoReader.readVarint32();
                return Integer.valueOf((-(readVarint32 & 1)) ^ (readVarint32 >>> 1));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                int intValue = num.intValue();
                return ProtoWriter.LIZ((intValue >> 31) ^ (intValue << 1));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) {
                int intValue = num.intValue();
                protoWriter.writeVarint32((intValue >> 31) ^ (intValue << 1));
            }
        };
        FieldEncoding fieldEncoding2 = FieldEncoding.FIXED32;
        ProtoAdapter<Integer> protoAdapter = new ProtoAdapter<Integer>(fieldEncoding2, Integer.class) { // from class: com.squareup.wire.ProtoAdapter.5
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                return 4;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) {
                return Integer.valueOf(protoReader.readFixed32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) {
                protoWriter.writeFixed32(num.intValue());
            }
        };
        FIXED32 = protoAdapter;
        SFIXED32 = protoAdapter;
        INT64 = new ProtoAdapter<Long>(fieldEncoding, Long.class) { // from class: com.squareup.wire.ProtoAdapter.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) {
                return Long.valueOf(protoReader.readVarint64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l) {
                return ProtoWriter.LIZIZ(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l) {
                protoWriter.writeVarint64(l.longValue());
            }
        };
        UINT64 = new ProtoAdapter<Long>(fieldEncoding, Long.class) { // from class: com.squareup.wire.ProtoAdapter.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) {
                return Long.valueOf(protoReader.readVarint64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l) {
                return ProtoWriter.LIZIZ(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l) {
                protoWriter.writeVarint64(l.longValue());
            }
        };
        SINT64 = new ProtoAdapter<Long>(fieldEncoding, Long.class) { // from class: com.squareup.wire.ProtoAdapter.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) {
                long readVarint64 = protoReader.readVarint64();
                return Long.valueOf((-(readVarint64 & 1)) ^ (readVarint64 >>> 1));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l) {
                long longValue = l.longValue();
                return ProtoWriter.LIZIZ((longValue >> 63) ^ (longValue << 1));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l) {
                long longValue = l.longValue();
                protoWriter.writeVarint64((longValue >> 63) ^ (longValue << 1));
            }
        };
        FieldEncoding fieldEncoding3 = FieldEncoding.FIXED64;
        ProtoAdapter<Long> protoAdapter2 = new ProtoAdapter<Long>(fieldEncoding3, Long.class) { // from class: com.squareup.wire.ProtoAdapter.9
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l) {
                return 8;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) {
                return Long.valueOf(protoReader.readFixed64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l) {
                protoWriter.writeFixed64(l.longValue());
            }
        };
        FIXED64 = protoAdapter2;
        SFIXED64 = protoAdapter2;
        FLOAT = new ProtoAdapter<Float>(fieldEncoding2, Float.class) { // from class: com.squareup.wire.ProtoAdapter.10
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Float f) {
                return 4;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Float decode(ProtoReader protoReader) {
                return Float.valueOf(Float.intBitsToFloat(protoReader.readFixed32()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Float f) {
                protoWriter.writeFixed32(Float.floatToIntBits(f.floatValue()));
            }
        };
        DOUBLE = new ProtoAdapter<Double>(fieldEncoding3, Double.class) { // from class: com.squareup.wire.ProtoAdapter.11
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Double d) {
                return 8;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Double decode(ProtoReader protoReader) {
                return Double.valueOf(Double.longBitsToDouble(protoReader.readFixed64()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Double d) {
                protoWriter.writeFixed64(Double.doubleToLongBits(d.doubleValue()));
            }
        };
        FieldEncoding fieldEncoding4 = FieldEncoding.LENGTH_DELIMITED;
        STRING = new ProtoAdapter<String>(fieldEncoding4, String.class) { // from class: com.squareup.wire.ProtoAdapter.12
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(String str) {
                int i;
                int length = str.length();
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    char charAt = str.charAt(i2);
                    if (charAt >= 128) {
                        if (charAt < 2048) {
                            i3 += 2;
                        } else if (charAt < 55296 || charAt > 57343) {
                            i3 += 3;
                        } else if (charAt <= 56319 && (i = i2 + 1) < length && str.charAt(i) >= 56320 && str.charAt(i) <= 57343) {
                            i3 += 4;
                            i2 = i;
                        }
                        i2++;
                    }
                    i3++;
                    i2++;
                }
                return i3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public String decode(ProtoReader protoReader) {
                return protoReader.readString();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, String str) {
                protoWriter.writeString(str);
            }
        };
        BYTES = new ProtoAdapter<C64537PUn>(fieldEncoding4, C64537PUn.class) { // from class: com.squareup.wire.ProtoAdapter.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public C64537PUn decode(ProtoReader protoReader) {
                return protoReader.readBytes();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(C64537PUn c64537PUn) {
                return c64537PUn.size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, C64537PUn c64537PUn) {
                protoWriter.writeBytes(c64537PUn);
            }
        };
    }

    public final ProtoAdapter<List<E>> asPacked() {
        ProtoAdapter<List<E>> protoAdapter = this.LIZJ;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        FieldEncoding fieldEncoding = this.LIZ;
        FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
        if (fieldEncoding != fieldEncoding2) {
            ProtoAdapter<List<E>> protoAdapter2 = (ProtoAdapter<List<E>>) new ProtoAdapter<List<Object>>(fieldEncoding2, List.class) { // from class: com.squareup.wire.ProtoAdapter.14
                @Override // com.squareup.wire.ProtoAdapter
                public List<Object> decode(ProtoReader protoReader) {
                    return Collections.singletonList(ProtoAdapter.this.decode(protoReader));
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(List<Object> list) {
                    int size = list.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        i += ProtoAdapter.this.encodedSize(ListProtector.get(list, i2));
                    }
                    return i;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public List<Object> redact(List<Object> list) {
                    return Collections.emptyList();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter protoWriter, List<Object> list) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ProtoAdapter.this.encode(protoWriter, (ProtoWriter) ListProtector.get(list, i));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSizeWithTag(int i, List<Object> list) {
                    if (list.isEmpty()) {
                        return 0;
                    }
                    return super.encodedSizeWithTag(i, (int) list);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encodeWithTag(ProtoWriter protoWriter, int i, List<Object> list) {
                    if (!list.isEmpty()) {
                        super.encodeWithTag(protoWriter, i, (int) list);
                    }
                }
            };
            this.LIZJ = protoAdapter2;
            return protoAdapter2;
        }
        throw new IllegalArgumentException("Unable to pack a length-delimited type.");
    }

    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.LIZLLL;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> protoAdapter2 = (ProtoAdapter<List<E>>) new ProtoAdapter<List<Object>>(this.LIZ, List.class) { // from class: com.squareup.wire.ProtoAdapter.15
            @Override // com.squareup.wire.ProtoAdapter
            public List<Object> decode(ProtoReader protoReader) {
                return Collections.singletonList(ProtoAdapter.this.decode(protoReader));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(List<Object> list) {
                throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<Object> redact(List<Object> list) {
                return Collections.emptyList();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, List<Object> list) {
                throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int i, List<Object> list) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i2 += ProtoAdapter.this.encodedSizeWithTag(i, ListProtector.get(list, i3));
                }
                return i2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ProtoWriter protoWriter, int i, List<Object> list) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ProtoAdapter.this.encodeWithTag(protoWriter, i, ListProtector.get(list, i2));
                }
            }
        };
        this.LIZLLL = protoAdapter2;
        return protoAdapter2;
    }

    /* loaded from: classes12.dex */
    public static final class MapEntryProtoAdapter<K, V> extends ProtoAdapter<Map.Entry<K, V>> {
        public final ProtoAdapter<K> LJ;
        public final ProtoAdapter<V> LJFF;

        @Override // com.squareup.wire.ProtoAdapter
        public Map.Entry<K, V> decode(ProtoReader protoReader) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Map.Entry<K, V> entry) {
            return this.LJFF.encodedSizeWithTag(2, entry.getValue()) + this.LJ.encodedSizeWithTag(1, entry.getKey());
        }

        public MapEntryProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.LJ = protoAdapter;
            this.LJFF = protoAdapter2;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Map.Entry<K, V> entry) {
            this.LJ.encodeWithTag(protoWriter, 1, entry.getKey());
            this.LJFF.encodeWithTag(protoWriter, 2, entry.getValue());
        }
    }

    /* loaded from: classes12.dex */
    public static final class MapProtoAdapter<K, V> extends ProtoAdapter<Map<K, V>> {
        public final MapEntryProtoAdapter<K, V> LJ;

        @Override // com.squareup.wire.ProtoAdapter
        public Map<K, V> decode(ProtoReader protoReader) {
            long beginMessage = protoReader.beginMessage();
            K k = null;
            V v = null;
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    break;
                }
                if (nextTag != 1) {
                    if (nextTag == 2) {
                        v = this.LJ.LJFF.decode(protoReader);
                    }
                } else {
                    k = this.LJ.LJ.decode(protoReader);
                }
            }
            protoReader.endMessage(beginMessage);
            if (k != null) {
                if (v != null) {
                    return Collections.singletonMap(k, v);
                }
                throw new IllegalStateException("Map entry with null value");
            }
            throw new IllegalStateException("Map entry with null key");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Map<K, V> redact(Map<K, V> map) {
            return Collections.emptyMap();
        }

        public MapProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.LJ = new MapEntryProtoAdapter<>(protoAdapter, protoAdapter2);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSizeWithTag(int i, Map<K, V> map) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                i2 += this.LJ.encodedSizeWithTag(i, it.next());
            }
            return i2;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encodeWithTag(ProtoWriter protoWriter, int i, Map<K, V> map) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                this.LJ.encodeWithTag(protoWriter, i, it.next());
            }
        }
    }

    public static ProtoAdapter<?> get(String str) {
        try {
            int indexOf = str.indexOf(35);
            String substring = str.substring(0, indexOf);
            return (ProtoAdapter) Class.forName(substring).getField(str.substring(indexOf + 1)).get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            throw new IllegalArgumentException(i0.LJFF("failed to access ", str), e);
        }
    }

    public static <E extends WireEnum> RuntimeEnumAdapter<E> newEnumAdapter(Class<E> cls) {
        return new RuntimeEnumAdapter<>(cls);
    }

    public static <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls) {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(cls.getName());
            LIZ.append("$Builder");
            Class<?> cls2 = Class.forName(X1D.LIZIZ(LIZ));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Field field : cls.getDeclaredFields()) {
                WireField wireField = (WireField) field.getAnnotation(WireField.class);
                if (wireField != null) {
                    linkedHashMap.put(Integer.valueOf(wireField.tag()), new FieldBinding(wireField, field, cls2));
                }
            }
            return new RuntimeMessageAdapter(cls, cls2, Collections.unmodifiableMap(linkedHashMap));
        } catch (ClassNotFoundException unused) {
            StringBuilder LIZ2 = X1D.LIZ();
            throw new IllegalArgumentException(AnonymousClass028.LIZLLL(LIZ2, "No builder class found for message type ", cls, LIZ2));
        }
    }

    public final E decode(C64537PUn c64537PUn) {
        Preconditions.LIZ(c64537PUn, "bytes == null");
        C64533PUj c64533PUj = new C64533PUj();
        c64537PUn.write$jvm(c64533PUj);
        return decode(c64533PUj);
    }

    public final byte[] encode(E e) {
        Preconditions.LIZ(e, "value == null");
        C64533PUj c64533PUj = new C64533PUj();
        try {
            encode((PVU) c64533PUj, (C64533PUj) e);
            return c64533PUj.LLLLIIL();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public String toString(E e) {
        return e.toString();
    }

    public static <M> ProtoAdapter<M> get(Class<M> cls) {
        try {
            return (ProtoAdapter) cls.getField("ADAPTER").get(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("failed to access ");
            LIZ.append(cls.getName());
            LIZ.append("#ADAPTER");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ), e);
        }
    }

    public final E decode(InputStream inputStream) {
        Preconditions.LIZ(inputStream, "stream == null");
        return decode(PU7.LIZ(PU7.LJII(inputStream)));
    }

    public static <M extends Message> ProtoAdapter<M> get(M m) {
        return get(m.getClass());
    }

    public final E decode(byte[] bArr) {
        Preconditions.LIZ(bArr, "bytes == null");
        C64533PUj c64533PUj = new C64533PUj();
        c64533PUj.m27write(bArr);
        return decode(c64533PUj);
    }

    public final E decode(PW3 pw3) {
        Preconditions.LIZ(pw3, "source == null");
        return decode(new ProtoReader(pw3));
    }

    /* loaded from: classes9.dex */
    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public EnumConstantNotFoundException(int r3, java.lang.Class<?> r4) {
            /*
                r2 = this;
                java.lang.String r1 = "Unknown enum tag "
                java.lang.String r0 = " for "
                java.lang.StringBuilder r1 = X.C7MY.LJ(r1, r3, r0)
                java.lang.String r0 = X.C16880lQ.LJLLILLLL(r4)
                r1.append(r0)
                java.lang.String r0 = X.X1D.LIZIZ(r1)
                r2.<init>(r0)
                r2.value = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException.<init>(int, java.lang.Class):void");
        }
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls) {
        this.LIZ = fieldEncoding;
        this.LIZIZ = cls;
    }

    public static <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return new MapProtoAdapter(protoAdapter, protoAdapter2);
    }

    public final void encode(OutputStream outputStream, E e) {
        Preconditions.LIZ(e, "value == null");
        Preconditions.LIZ(outputStream, "stream == null");
        C64535PUl c64535PUl = new C64535PUl(PU7.LIZLLL(outputStream));
        encode((PVU) c64535PUl, (C64535PUl) e);
        c64535PUl.LLLZIL();
    }

    public int encodedSizeWithTag(int i, E e) {
        if (e == null) {
            return 0;
        }
        int encodedSize = encodedSize(e);
        if (this.LIZ == FieldEncoding.LENGTH_DELIMITED) {
            encodedSize += ProtoWriter.LIZ(encodedSize);
        }
        return ProtoWriter.LIZ((i << 3) | FieldEncoding.VARINT.LJLIL) + encodedSize;
    }

    public final void encode(PVU pvu, E e) {
        Preconditions.LIZ(e, "value == null");
        Preconditions.LIZ(pvu, "sink == null");
        encode(new ProtoWriter(pvu), (ProtoWriter) e);
    }

    public void encodeWithTag(ProtoWriter protoWriter, int i, E e) {
        if (e == null) {
            return;
        }
        protoWriter.writeTag(i, this.LIZ);
        if (this.LIZ == FieldEncoding.LENGTH_DELIMITED) {
            protoWriter.writeVarint32(encodedSize(e));
        }
        encode(protoWriter, (ProtoWriter) e);
    }
}
