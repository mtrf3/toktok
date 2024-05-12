package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0CY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0CY {
    public static final C0CY LIZIZ;
    public final java.util.Map<String, Object> LIZ;

    static {
        C0VW.LIZIZ("Data");
        LIZIZ = new C0CX().LIZ();
    }

    public final long LIZIZ() {
        Object obj = ((HashMap) this.LIZ).get("scheduled_timestamp");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return 0L;
    }

    public final int hashCode() {
        return this.LIZ.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.LIZ.isEmpty()) {
            for (String str : this.LIZ.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.LIZ.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public C0CY() {
    }

    public C0CY(C0CY c0cy) {
        this.LIZ = new HashMap(c0cy.LIZ);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x003e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public static X.C0CY LIZ(byte[] r6) {
        /*
            int r1 = r6.length
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r0) goto L47
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            r4.<init>(r6)
            r0 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L39
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L39
            int r2 = r3.readInt()     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L32
        L19:
            if (r2 <= 0) goto L29
            java.lang.String r1 = r3.readUTF()     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L32
            java.lang.Object r0 = r3.readObject()     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L32
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L32
            int r2 = r2 + (-1)
            goto L19
        L29:
            r3.close()     // Catch: java.io.IOException -> L3e
            goto L3e
        L2d:
            r0 = move-exception
            r3.close()     // Catch: java.io.IOException -> L35
            goto L35
        L32:
            r0 = r3
            goto L3b
        L34:
            r0 = move-exception
        L35:
            r4.close()     // Catch: java.io.IOException -> L38
        L38:
            throw r0
        L39:
            if (r0 == 0) goto L3e
        L3b:
            r0.close()     // Catch: java.io.IOException -> L3e
        L3e:
            r4.close()     // Catch: java.io.IOException -> L41
        L41:
            X.0CY r0 = new X.0CY
            r0.<init>(r5)
            return r0
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CY.LIZ(byte[]):X.0CY");
    }

    public static byte[] LIZLLL(C0CY c0cy) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            objectOutputStream.writeInt(((HashMap) c0cy.LIZ).size());
            for (Map.Entry entry : ((HashMap) c0cy.LIZ).entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException unused2) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused3) {
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException unused4) {
            objectOutputStream2 = objectOutputStream;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException unused5) {
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused6) {
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException unused7) {
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException unused8) {
                throw th;
            }
        }
    }

    public final String LIZJ(String str) {
        Object obj = ((HashMap) this.LIZ).get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0CY.class != obj.getClass()) {
            return false;
        }
        C0CY c0cy = (C0CY) obj;
        java.util.Set<String> keySet = this.LIZ.keySet();
        if (!keySet.equals(c0cy.LIZ.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.LIZ.get(str);
            Object obj3 = c0cy.LIZ.get(str);
            if (obj2 != null) {
                if (obj3 != null) {
                    if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                        equals = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                    } else {
                        equals = obj2.equals(obj3);
                    }
                    if (!equals) {
                    }
                }
                return false;
            }
            if (obj2 != obj3) {
                return false;
            }
        }
        return true;
    }

    public C0CY(java.util.Map<String, ?> map) {
        this.LIZ = new HashMap(map);
    }
}
