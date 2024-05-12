package com.google.gson.internal.bind;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.internal.l;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.u;
import defpackage.i0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes12.dex */
public final class TypeAdapters {
    public static final u LIZ = new AnonymousClass32(Class.class, new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
        @Override // com.google.gson.TypeAdapter
        public final Class read(C65385PlN c65385PlN) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C65403Plf c65403Plf, Class cls) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Attempted to serialize java.lang.Class: ");
            LIZ2.append(cls.getName());
            LIZ2.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(X1D.LIZIZ(LIZ2));
        }
    }.nullSafe());
    public static final u LIZIZ = new AnonymousClass32(BitSet.class, new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0031, code lost:
        
            if (r7.LJIJI() != 0) goto L20;
         */
        @Override // com.google.gson.TypeAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.BitSet read(X.C65385PlN r7) {
            /*
                r6 = this;
                java.util.BitSet r5 = new java.util.BitSet
                r5.<init>()
                r7.LIZ()
                X.PlO r4 = r7.LJJIJIL()
                r3 = 0
            Ld:
                X.PlO r0 = X.EnumC65386PlO.END_ARRAY
                if (r4 == r0) goto L68
                int[] r1 = com.google.gson.internal.bind.TypeAdapters.a.LIZ
                int r0 = r4.ordinal()
                r2 = r1[r0]
                r1 = 1
                if (r2 == r1) goto L2d
                r0 = 2
                if (r2 == r0) goto L36
                r0 = 3
                if (r2 != r0) goto L52
                java.lang.String r2 = r7.LJJIIZI()
                int r0 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L46
                if (r0 == 0) goto L34
                goto L3a
            L2d:
                int r0 = r7.LJIJI()
                if (r0 == 0) goto L34
                goto L3a
            L34:
                r1 = 0
                goto L3a
            L36:
                boolean r1 = r7.LJIILL()
            L3a:
                if (r1 == 0) goto L3f
                r5.set(r3)
            L3f:
                int r3 = r3 + 1
                X.PlO r4 = r7.LJJIJIL()
                goto Ld
            L46:
                com.google.gson.s r1 = new com.google.gson.s
                java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                java.lang.String r0 = defpackage.i0.LJFF(r0, r2)
                r1.<init>(r0)
                throw r1
            L52:
                com.google.gson.s r2 = new com.google.gson.s
                java.lang.StringBuilder r1 = X.X1D.LIZ()
                java.lang.String r0 = "Invalid bitset value type: "
                r1.append(r0)
                r1.append(r4)
                java.lang.String r0 = X.X1D.LIZIZ(r1)
                r2.<init>(r0)
                throw r2
            L68:
                r7.LJ()
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.AnonymousClass2.read(X.PlN):java.lang.Object");
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C65403Plf c65403Plf, BitSet bitSet) {
            BitSet bitSet2 = bitSet;
            c65403Plf.LIZIZ();
            int length = bitSet2.length();
            for (int i = 0; i < length; i++) {
                c65403Plf.LJIJ(bitSet2.get(i) ? 1L : 0L);
            }
            c65403Plf.LJ();
        }
    }.nullSafe());
    public static final TypeAdapter<Boolean> LIZJ;
    public static final u LIZLLL;
    public static final u LJ;
    public static final u LJFF;
    public static final u LJI;
    public static final u LJII;
    public static final u LJIIIIZZ;
    public static final u LJIIIZ;
    public static final TypeAdapter<Number> LJIIJ;
    public static final TypeAdapter<Number> LJIIJJI;
    public static final TypeAdapter<Number> LJIIL;
    public static final u LJIILIIL;
    public static final u LJIILJJIL;
    public static final TypeAdapter<BigDecimal> LJIILL;
    public static final TypeAdapter<BigInteger> LJIILLIIL;
    public static final u LJIIZILJ;
    public static final u LJIJ;
    public static final u LJIJI;
    public static final u LJIJJ;
    public static final u LJIJJLI;
    public static final u LJIL;
    public static final u LJJ;
    public static final u LJJI;
    public static final u LJJIFFI;
    public static final u LJJII;
    public static final u LJJIII;
    public static final TypeAdapter<j> LJJIIJ;
    public static final u LJJIIJZLJL;
    public static final u LJJIIZ;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$32, reason: invalid class name */
    /* loaded from: classes12.dex */
    public final class AnonymousClass32 implements u {
        public final /* synthetic */ Class LJLIL;
        public final /* synthetic */ TypeAdapter LJLILLLLZI;

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Factory[type=");
            LIZ.append(this.LJLIL.getName());
            LIZ.append(",adapter=");
            LIZ.append(this.LJLILLLLZI);
            LIZ.append("]");
            return X1D.LIZIZ(LIZ);
        }

        public AnonymousClass32(Class cls, TypeAdapter typeAdapter) {
            this.LJLIL = cls;
            this.LJLILLLLZI = typeAdapter;
        }

        @Override // com.google.gson.u
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == this.LJLIL) {
                return this.LJLILLLLZI;
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$33, reason: invalid class name */
    /* loaded from: classes12.dex */
    public final class AnonymousClass33 implements u {
        public final /* synthetic */ Class LJLIL;
        public final /* synthetic */ Class LJLILLLLZI;
        public final /* synthetic */ TypeAdapter LJLJI;

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Factory[type=");
            LIZ.append(this.LJLILLLLZI.getName());
            LIZ.append("+");
            LIZ.append(this.LJLIL.getName());
            LIZ.append(",adapter=");
            LIZ.append(this.LJLJI);
            LIZ.append("]");
            return X1D.LIZIZ(LIZ);
        }

        @Override // com.google.gson.u
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Class<? super T> rawType = typeToken.getRawType();
            if (rawType == this.LJLIL || rawType == this.LJLILLLLZI) {
                return this.LJLJI;
            }
            return null;
        }

        public AnonymousClass33(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.LJLIL = cls;
            this.LJLILLLLZI = cls2;
            this.LJLJI = typeAdapter;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$35, reason: invalid class name */
    /* loaded from: classes12.dex */
    public final class AnonymousClass35 implements u {
        public final /* synthetic */ Class LJLIL;
        public final /* synthetic */ TypeAdapter LJLILLLLZI;

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Factory[typeHierarchy=");
            LIZ.append(this.LJLIL.getName());
            LIZ.append(",adapter=");
            LIZ.append(this.LJLILLLLZI);
            LIZ.append("]");
            return X1D.LIZIZ(LIZ);
        }

        public AnonymousClass35(Class cls, TypeAdapter typeAdapter) {
            this.LJLIL = cls;
            this.LJLILLLLZI = typeAdapter;
        }

        @Override // com.google.gson.u
        public final <T2> TypeAdapter<T2> create(Gson gson, TypeToken<T2> typeToken) {
            final Class<? super T2> rawType = typeToken.getRawType();
            if (!this.LJLIL.isAssignableFrom(rawType)) {
                return null;
            }
            return (TypeAdapter<T2>) new TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.35.1
                @Override // com.google.gson.TypeAdapter
                public final T1 read(C65385PlN c65385PlN) {
                    T1 t1 = (T1) AnonymousClass35.this.LJLILLLLZI.read(c65385PlN);
                    if (t1 == null || rawType.isInstance(t1)) {
                        return t1;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Expected a ");
                    LIZ.append(rawType.getName());
                    LIZ.append(" but was ");
                    LIZ.append(t1.getClass().getName());
                    throw new s(X1D.LIZIZ(LIZ));
                }

                @Override // com.google.gson.TypeAdapter
                public final void write(C65403Plf c65403Plf, T1 t1) {
                    AnonymousClass35.this.LJLILLLLZI.write(c65403Plf, t1);
                }
            };
        }
    }

    /* loaded from: classes12.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] LIZ;

        static {
            int[] iArr = new int[EnumC65386PlO.values().length];
            LIZ = iArr;
            try {
                iArr[EnumC65386PlO.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LIZ[EnumC65386PlO.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LIZ[EnumC65386PlO.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LIZ[EnumC65386PlO.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LIZ[EnumC65386PlO.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                LIZ[EnumC65386PlO.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                LIZ[EnumC65386PlO.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                LIZ[EnumC65386PlO.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                LIZ[EnumC65386PlO.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                LIZ[EnumC65386PlO.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            public final Boolean read(C65385PlN c65385PlN) {
                EnumC65386PlO LJJIJIL = c65385PlN.LJJIJIL();
                if (LJJIJIL == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                if (LJJIJIL == EnumC65386PlO.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(c65385PlN.LJJIIZI()));
                }
                return Boolean.valueOf(c65385PlN.LJIILL());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, Boolean bool) {
                c65403Plf.LJIJI(bool);
            }
        };
        LIZJ = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            public final Boolean read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                return Boolean.valueOf(c65385PlN.LJJIIZI());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, Boolean bool) {
                String bool2;
                Boolean bool3 = bool;
                if (bool3 == null) {
                    bool2 = "null";
                } else {
                    bool2 = bool3.toString();
                }
                c65403Plf.LJJ(bool2);
            }
        };
        LIZLLL = new AnonymousClass33(Boolean.TYPE, Boolean.class, typeAdapter);
        LJ = new AnonymousClass33(Byte.TYPE, Byte.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            public final Number read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) c65385PlN.LJIJI());
                } catch (NumberFormatException e) {
                    throw new s(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, Number number) {
                c65403Plf.LJIJJ(number);
            }
        });
        LJFF = new AnonymousClass33(Short.TYPE, Short.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            public final Number read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                try {
                    return Short.valueOf((short) c65385PlN.LJIJI());
                } catch (NumberFormatException e) {
                    throw new s(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, Number number) {
                c65403Plf.LJIJJ(number);
            }
        });
        LJI = new AnonymousClass33(Integer.TYPE, Integer.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            public final Number read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                try {
                    return Integer.valueOf(c65385PlN.LJIJI());
                } catch (NumberFormatException e) {
                    throw new s(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, Number number) {
                c65403Plf.LJIJJ(number);
            }
        });
        LJII = new AnonymousClass32(AtomicInteger.class, new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            public final AtomicInteger read(C65385PlN c65385PlN) {
                try {
                    return new AtomicInteger(c65385PlN.LJIJI());
                } catch (NumberFormatException e) {
                    throw new s(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, AtomicInteger atomicInteger) {
                c65403Plf.LJIJ(atomicInteger.get());
            }
        }.nullSafe());
        LJIIIIZZ = new AnonymousClass32(AtomicBoolean.class, new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            public final AtomicBoolean read(C65385PlN c65385PlN) {
                return new AtomicBoolean(c65385PlN.LJIILL());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, AtomicBoolean atomicBoolean) {
                c65403Plf.LJJIII(atomicBoolean.get());
            }
        }.nullSafe());
        LJIIIZ = new AnonymousClass32(AtomicIntegerArray.class, new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            public final AtomicIntegerArray read(C65385PlN c65385PlN) {
                ArrayList arrayList = new ArrayList();
                c65385PlN.LIZ();
                while (c65385PlN.LJIIJJI()) {
                    try {
                        arrayList.add(Integer.valueOf(c65385PlN.LJIJI()));
                    } catch (NumberFormatException e) {
                        throw new s(e);
                    }
                }
                c65385PlN.LJ();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, AtomicIntegerArray atomicIntegerArray) {
                c65403Plf.LIZIZ();
                int length = atomicIntegerArray.length();
                for (int i = 0; i < length; i++) {
                    c65403Plf.LJIJ(r6.get(i));
                }
                c65403Plf.LJ();
            }
        }.nullSafe());
        LJIIJ = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            public final Number read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                try {
                    return Long.valueOf(c65385PlN.LJIJJ());
                } catch (NumberFormatException e) {
                    throw new s(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, Number number) {
                c65403Plf.LJIJJ(number);
            }
        };
        LJIIJJI = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            public final Number read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                return Float.valueOf((float) c65385PlN.LJIJ());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, Number number) {
                c65403Plf.LJIJJ(number);
            }
        };
        LJIIL = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            public final Number read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                return Double.valueOf(c65385PlN.LJIJ());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, Number number) {
                c65403Plf.LJIJJ(number);
            }
        };
        LJIILIIL = new AnonymousClass32(Number.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            public final Number read(C65385PlN c65385PlN) {
                EnumC65386PlO LJJIJIL = c65385PlN.LJJIJIL();
                int i = a.LIZ[LJJIJIL.ordinal()];
                if (i != 1 && i != 3) {
                    if (i == 4) {
                        c65385PlN.LJJIIJ();
                        return null;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Expecting number, got: ");
                    LIZ2.append(LJJIJIL);
                    throw new s(X1D.LIZIZ(LIZ2));
                }
                return new l(c65385PlN.LJJIIZI());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, Number number) {
                c65403Plf.LJIJJ(number);
            }
        });
        LJIILJJIL = new AnonymousClass33(Character.TYPE, Character.class, new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            public final Character read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                String LJJIIZI = c65385PlN.LJJIIZI();
                if (LJJIIZI.length() == 1) {
                    return Character.valueOf(LJJIIZI.charAt(0));
                }
                throw new s(i0.LJFF("Expecting character, got: ", LJJIIZI));
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, Character ch) {
                String valueOf;
                if (ch == null) {
                    valueOf = null;
                } else {
                    valueOf = String.valueOf(ch);
                }
                c65403Plf.LJJ(valueOf);
            }
        });
        TypeAdapter<String> typeAdapter2 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            public final String read(C65385PlN c65385PlN) {
                EnumC65386PlO LJJIJIL = c65385PlN.LJJIJIL();
                if (LJJIJIL == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                if (LJJIJIL == EnumC65386PlO.BOOLEAN) {
                    return Boolean.toString(c65385PlN.LJIILL());
                }
                return c65385PlN.LJJIIZI();
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, String str) {
                c65403Plf.LJJ(str);
            }
        };
        LJIILL = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            public final BigDecimal read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                try {
                    return new BigDecimal(c65385PlN.LJJIIZI());
                } catch (NumberFormatException e) {
                    throw new s(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, BigDecimal bigDecimal) {
                c65403Plf.LJIJJ(bigDecimal);
            }
        };
        LJIILLIIL = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            public final BigInteger read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                try {
                    return new BigInteger(c65385PlN.LJJIIZI());
                } catch (NumberFormatException e) {
                    throw new s(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, BigInteger bigInteger) {
                c65403Plf.LJIJJ(bigInteger);
            }
        };
        LJIIZILJ = new AnonymousClass32(String.class, typeAdapter2);
        LJIJ = new AnonymousClass32(StringBuilder.class, new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            public final StringBuilder read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                return new StringBuilder(c65385PlN.LJJIIZI());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, StringBuilder sb) {
                String sb2;
                StringBuilder sb3 = sb;
                if (sb3 == null) {
                    sb2 = null;
                } else {
                    sb2 = sb3.toString();
                }
                c65403Plf.LJJ(sb2);
            }
        });
        LJIJI = new AnonymousClass32(StringBuffer.class, new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            public final StringBuffer read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                return new StringBuffer(c65385PlN.LJJIIZI());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, StringBuffer stringBuffer) {
                String stringBuffer2;
                StringBuffer stringBuffer3 = stringBuffer;
                if (stringBuffer3 == null) {
                    stringBuffer2 = null;
                } else {
                    stringBuffer2 = stringBuffer3.toString();
                }
                c65403Plf.LJJ(stringBuffer2);
            }
        });
        LJIJJ = new AnonymousClass32(URL.class, new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            public final URL read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                String LJJIIZI = c65385PlN.LJJIIZI();
                if ("null".equals(LJJIIZI)) {
                    return null;
                }
                return new URL(LJJIIZI);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, URL url) {
                String externalForm;
                URL url2 = url;
                if (url2 == null) {
                    externalForm = null;
                } else {
                    externalForm = url2.toExternalForm();
                }
                c65403Plf.LJJ(externalForm);
            }
        });
        LJIJJLI = new AnonymousClass32(URI.class, new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            public final URI read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                try {
                    String LJJIIZI = c65385PlN.LJJIIZI();
                    if ("null".equals(LJJIIZI)) {
                        return null;
                    }
                    return new URI(LJJIIZI);
                } catch (URISyntaxException e) {
                    throw new k(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, URI uri) {
                String aSCIIString;
                URI uri2 = uri;
                if (uri2 == null) {
                    aSCIIString = null;
                } else {
                    aSCIIString = uri2.toASCIIString();
                }
                c65403Plf.LJJ(aSCIIString);
            }
        });
        LJIL = new AnonymousClass35(InetAddress.class, new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            public final InetAddress read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                return InetAddress.getByName(c65385PlN.LJJIIZI());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, InetAddress inetAddress) {
                String hostAddress;
                InetAddress inetAddress2 = inetAddress;
                if (inetAddress2 == null) {
                    hostAddress = null;
                } else {
                    hostAddress = inetAddress2.getHostAddress();
                }
                c65403Plf.LJJ(hostAddress);
            }
        });
        LJJ = new AnonymousClass32(UUID.class, new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            public final UUID read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                return UUID.fromString(c65385PlN.LJJIIZI());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, UUID uuid) {
                String uuid2;
                UUID uuid3 = uuid;
                if (uuid3 == null) {
                    uuid2 = null;
                } else {
                    uuid2 = uuid3.toString();
                }
                c65403Plf.LJJ(uuid2);
            }
        });
        LJJI = new AnonymousClass32(Currency.class, new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            public final Currency read(C65385PlN c65385PlN) {
                return Currency.getInstance(c65385PlN.LJJIIZI());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, Currency currency) {
                c65403Plf.LJJ(currency.getCurrencyCode());
            }
        }.nullSafe());
        LJJIFFI = new u() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.u
            public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.getRawType() != Timestamp.class) {
                    return null;
                }
                final TypeAdapter<T> LJIIJ2 = gson.LJIIJ(Date.class);
                return (TypeAdapter<T>) new TypeAdapter<Timestamp>() { // from class: com.google.gson.internal.bind.TypeAdapters.26.1
                    @Override // com.google.gson.TypeAdapter
                    public final Timestamp read(C65385PlN c65385PlN) {
                        Date date = (Date) TypeAdapter.this.read(c65385PlN);
                        if (date != null) {
                            return new Timestamp(date.getTime());
                        }
                        return null;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public final void write(C65403Plf c65403Plf, Timestamp timestamp) {
                        TypeAdapter.this.write(c65403Plf, timestamp);
                    }
                };
            }
        };
        final TypeAdapter<Calendar> typeAdapter3 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            public final Calendar read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                c65385PlN.LIZIZ();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (c65385PlN.LJJIJIL() != EnumC65386PlO.END_OBJECT) {
                    String LJJ2 = c65385PlN.LJJ();
                    int LJIJI2 = c65385PlN.LJIJI();
                    if ("year".equals(LJJ2)) {
                        i = LJIJI2;
                    } else if ("month".equals(LJJ2)) {
                        i2 = LJIJI2;
                    } else if ("dayOfMonth".equals(LJJ2)) {
                        i3 = LJIJI2;
                    } else if ("hourOfDay".equals(LJJ2)) {
                        i4 = LJIJI2;
                    } else if ("minute".equals(LJJ2)) {
                        i5 = LJIJI2;
                    } else if ("second".equals(LJJ2)) {
                        i6 = LJIJI2;
                    }
                }
                c65385PlN.LJFF();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, Calendar calendar) {
                if (calendar == null) {
                    c65403Plf.LJIIJJI();
                    return;
                }
                c65403Plf.LIZJ();
                c65403Plf.LJI("year");
                c65403Plf.LJIJ(r4.get(1));
                c65403Plf.LJI("month");
                c65403Plf.LJIJ(r4.get(2));
                c65403Plf.LJI("dayOfMonth");
                c65403Plf.LJIJ(r4.get(5));
                c65403Plf.LJI("hourOfDay");
                c65403Plf.LJIJ(r4.get(11));
                c65403Plf.LJI("minute");
                c65403Plf.LJIJ(r4.get(12));
                c65403Plf.LJI("second");
                c65403Plf.LJIJ(r4.get(13));
                c65403Plf.LJFF();
            }
        };
        final Class<Calendar> cls = Calendar.class;
        final Class<GregorianCalendar> cls2 = GregorianCalendar.class;
        LJJII = new u() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            public final String toString() {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Factory[type=");
                LIZ2.append(cls.getName());
                LIZ2.append("+");
                LIZ2.append(cls2.getName());
                LIZ2.append(",adapter=");
                LIZ2.append(typeAdapter3);
                LIZ2.append("]");
                return X1D.LIZIZ(LIZ2);
            }

            @Override // com.google.gson.u
            public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter3;
                }
                return null;
            }
        };
        LJJIII = new AnonymousClass32(Locale.class, new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // com.google.gson.TypeAdapter
            public final Locale read(C65385PlN c65385PlN) {
                String str;
                String str2;
                String str3 = null;
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(c65385PlN.LJJIIZI(), "_");
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                } else {
                    str = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str2 = stringTokenizer.nextToken();
                } else {
                    str2 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str3 = stringTokenizer.nextToken();
                }
                if (str2 == null) {
                    if (str3 == null) {
                        return new Locale(str);
                    }
                } else if (str3 == null) {
                    return new Locale(str, str2);
                }
                return new Locale(str, str2, str3);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, Locale locale) {
                String locale2;
                Locale locale3 = locale;
                if (locale3 == null) {
                    locale2 = null;
                } else {
                    locale2 = locale3.toString();
                }
                c65403Plf.LJJ(locale2);
            }
        });
        TypeAdapter<j> typeAdapter4 = new TypeAdapter<j>() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.TypeAdapter
            /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
            public final j read(C65385PlN c65385PlN) {
                switch (a.LIZ[c65385PlN.LJJIJIL().ordinal()]) {
                    case 1:
                        return new p((Number) new l(c65385PlN.LJJIIZI()));
                    case 2:
                        return new p(Boolean.valueOf(c65385PlN.LJIILL()));
                    case 3:
                        return new p(c65385PlN.LJJIIZI());
                    case 4:
                        c65385PlN.LJJIIJ();
                        return com.google.gson.l.LJLIL;
                    case 5:
                        g gVar = new g();
                        c65385PlN.LIZ();
                        while (c65385PlN.LJIIJJI()) {
                            gVar.LJJII(read(c65385PlN));
                        }
                        c65385PlN.LJ();
                        return gVar;
                    case 6:
                        m mVar = new m();
                        c65385PlN.LIZIZ();
                        while (c65385PlN.LJIIJJI()) {
                            mVar.LJJII(c65385PlN.LJJ(), read(c65385PlN));
                        }
                        c65385PlN.LJFF();
                        return mVar;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
            public final void write(j jVar, C65403Plf c65403Plf) {
                if (jVar == null || (jVar instanceof com.google.gson.l)) {
                    c65403Plf.LJIIJJI();
                    return;
                }
                if (jVar instanceof p) {
                    p LJIJ2 = jVar.LJIJ();
                    Object obj = LJIJ2.LJLIL;
                    if (obj instanceof Number) {
                        c65403Plf.LJIJJ(LJIJ2.LJIL());
                        return;
                    } else if (obj instanceof Boolean) {
                        c65403Plf.LJJIII(LJIJ2.LJFF());
                        return;
                    } else {
                        c65403Plf.LJJ(LJIJ2.LJJIFFI());
                        return;
                    }
                }
                if (jVar instanceof g) {
                    c65403Plf.LIZIZ();
                    Iterator<j> it = jVar.LJIILLIIL().iterator();
                    while (it.hasNext()) {
                        write(it.next(), c65403Plf);
                    }
                    c65403Plf.LJ();
                    return;
                }
                if (jVar instanceof m) {
                    c65403Plf.LIZJ();
                    for (Map.Entry<String, j> entry : jVar.LJIIZILJ().entrySet()) {
                        c65403Plf.LJI(entry.getKey());
                        write(entry.getValue(), c65403Plf);
                    }
                    c65403Plf.LJFF();
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Couldn't write ");
                LIZ2.append(jVar.getClass());
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
            }
        };
        LJJIIJ = typeAdapter4;
        LJJIIJZLJL = new AnonymousClass35(j.class, typeAdapter4);
        LJJIIZ = new u() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.u
            public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new EnumTypeAdapter(rawType);
            }
        };
    }

    /* loaded from: classes12.dex */
    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {
        public final Map<String, T> LIZ = new HashMap();
        public final Map<T, String> LIZIZ = new HashMap();

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (T t : cls.getEnumConstants()) {
                    String name = t.name();
                    InterfaceC65349Pkn interfaceC65349Pkn = (InterfaceC65349Pkn) cls.getField(name).getAnnotation(InterfaceC65349Pkn.class);
                    if (interfaceC65349Pkn != null) {
                        name = interfaceC65349Pkn.value();
                        for (String str : interfaceC65349Pkn.alternate()) {
                            this.LIZ.put(str, t);
                        }
                    }
                    this.LIZ.put(name, t);
                    this.LIZIZ.put(t, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final Object read(C65385PlN c65385PlN) {
            if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                c65385PlN.LJJIIJ();
                return null;
            }
            return ((HashMap) this.LIZ).get(c65385PlN.LJJIIZI());
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C65403Plf c65403Plf, Object obj) {
            String str;
            if (obj == null) {
                str = null;
            } else {
                str = (String) ((HashMap) this.LIZIZ).get(obj);
            }
            c65403Plf.LJJ(str);
        }
    }

    public static <TT> u LIZ(final TypeToken<TT> typeToken, final TypeAdapter<TT> typeAdapter) {
        return new u() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.u
            public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken2) {
                if (typeToken2.equals(TypeToken.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> u LIZIZ(Class<TT> cls, TypeAdapter<TT> typeAdapter) {
        return new AnonymousClass32(cls, typeAdapter);
    }

    public static <T1> u LIZLLL(Class<T1> cls, TypeAdapter<T1> typeAdapter) {
        return new AnonymousClass35(cls, typeAdapter);
    }

    public static <TT> u LIZJ(Class<TT> cls, Class<TT> cls2, TypeAdapter<? super TT> typeAdapter) {
        return new AnonymousClass33(cls, cls2, typeAdapter);
    }
}
