package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Qem, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67524Qem implements InterfaceC67543Qf5 {
    public static final Charset LJFF = Charset.forName("UTF-8");
    public static final C48260Iwq LJI;
    public static final C48260Iwq LJII;
    public static final C67536Qey LJIIIIZZ;
    public OutputStream LIZ;
    public final java.util.Map<Class<?>, InterfaceC67508QeW<?>> LIZIZ;
    public final java.util.Map<Class<?>, InterfaceC67507QeV<?>> LIZJ;
    public final InterfaceC67508QeW<Object> LIZLLL;
    public final C67537Qez LJ = new C67537Qez(this);

    /* JADX WARN: Type inference failed for: r0v8, types: [X.Qey] */
    static {
        C61329O5d c61329O5d = new C61329O5d("key");
        C67541Qf3 c67541Qf3 = new C67541Qf3();
        c67541Qf3.LIZ = 1;
        LJI = C61328O5c.LJFF(c67541Qf3, c61329O5d);
        C61329O5d c61329O5d2 = new C61329O5d("value");
        C67541Qf3 c67541Qf32 = new C67541Qf3();
        c67541Qf32.LIZ = 2;
        LJII = C61328O5c.LJFF(c67541Qf32, c61329O5d2);
        LJIIIIZZ = new InterfaceC67508QeW() { // from class: X.Qey
            @Override // X.InterfaceC67511QeZ
            public final void LIZ(Object obj, InterfaceC67543Qf5 interfaceC67543Qf5) {
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC67543Qf5 interfaceC67543Qf52 = interfaceC67543Qf5;
                interfaceC67543Qf52.LIZIZ(C67524Qem.LJI, entry.getKey());
                interfaceC67543Qf52.LIZIZ(C67524Qem.LJII, entry.getValue());
            }
        };
    }

    public static int LJII(C48260Iwq c48260Iwq) {
        InterfaceC67542Qf4 interfaceC67542Qf4 = (InterfaceC67542Qf4) ((Annotation) c48260Iwq.LIZIZ.get(InterfaceC67542Qf4.class));
        if (interfaceC67542Qf4 != null) {
            return ((C67527Qep) interfaceC67542Qf4).LJIIIIZZ;
        }
        throw new C67504QeS("Field has no @Protobuf config");
    }

    public final void LJIIIIZZ(int i) {
        while ((i & (-128)) != 0) {
            this.LIZ.write((i & 127) | 128);
            i >>>= 7;
        }
        this.LIZ.write(i & 127);
    }

    public final void LJIIIZ(long j) {
        while (((-128) & j) != 0) {
            this.LIZ.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.LIZ.write(((int) j) & 127);
    }

    @Override // X.InterfaceC67543Qf5
    public final InterfaceC67543Qf5 LIZIZ(C48260Iwq c48260Iwq, Object obj) {
        LIZ(c48260Iwq, obj, true);
        return this;
    }

    @Override // X.InterfaceC67543Qf5
    public final InterfaceC67543Qf5 LIZLLL(C48260Iwq c48260Iwq, long j) {
        LJFF(c48260Iwq, j, true);
        return this;
    }

    @Override // X.InterfaceC67543Qf5
    public final InterfaceC67543Qf5 LJ(C48260Iwq c48260Iwq, int i) {
        LIZJ(c48260Iwq, i, true);
        return this;
    }

    public final C67524Qem LIZ(C48260Iwq c48260Iwq, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            LJIIIIZZ((LJII(c48260Iwq) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(LJFF);
            LJIIIIZZ(bytes.length);
            this.LIZ.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                LIZ(c48260Iwq, it.next(), false);
            }
            return this;
        }
        if (obj instanceof java.util.Map) {
            Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                LJI(LJIIIIZZ, c48260Iwq, it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z || doubleValue != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                LJIIIIZZ((LJII(c48260Iwq) << 3) | 1);
                OutputStream outputStream = this.LIZ;
                ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
                order.putDouble(doubleValue);
                outputStream.write(order.array());
            }
            return this;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z || floatValue != 0.0f) {
                LJIIIIZZ((LJII(c48260Iwq) << 3) | 5);
                OutputStream outputStream2 = this.LIZ;
                ByteBuffer order2 = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
                order2.putFloat(floatValue);
                outputStream2.write(order2.array());
            }
            return this;
        }
        if (obj instanceof Number) {
            LJFF(c48260Iwq, ((Number) obj).longValue(), z);
            return this;
        }
        if (obj instanceof Boolean) {
            LIZJ(c48260Iwq, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            LJIIIIZZ((LJII(c48260Iwq) << 3) | 2);
            LJIIIIZZ(bArr.length);
            this.LIZ.write(bArr);
            return this;
        }
        InterfaceC67508QeW<?> interfaceC67508QeW = this.LIZIZ.get(obj.getClass());
        if (interfaceC67508QeW != null) {
            LJI(interfaceC67508QeW, c48260Iwq, obj, z);
            return this;
        }
        InterfaceC67507QeV<?> interfaceC67507QeV = this.LIZJ.get(obj.getClass());
        if (interfaceC67507QeV != null) {
            C67537Qez c67537Qez = this.LJ;
            c67537Qez.LIZ = false;
            c67537Qez.LIZJ = c48260Iwq;
            c67537Qez.LIZIZ = z;
            interfaceC67507QeV.LIZ(obj, c67537Qez);
            return this;
        }
        if (obj instanceof InterfaceC67490QeE) {
            LIZJ(c48260Iwq, ((InterfaceC67490QeE) obj).getNumber(), true);
            return this;
        }
        if (obj instanceof Enum) {
            LIZJ(c48260Iwq, ((Enum) obj).ordinal(), true);
            return this;
        }
        LJI(this.LIZLLL, c48260Iwq, obj, z);
        return this;
    }

    public final void LIZJ(C48260Iwq c48260Iwq, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        InterfaceC67542Qf4 interfaceC67542Qf4 = (InterfaceC67542Qf4) ((Annotation) c48260Iwq.LIZIZ.get(InterfaceC67542Qf4.class));
        if (interfaceC67542Qf4 != null) {
            C67527Qep c67527Qep = (C67527Qep) interfaceC67542Qf4;
            int i2 = C67539Qf1.LIZ[c67527Qep.LJIIIZ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                    LJIIIIZZ((c67527Qep.LJIIIIZZ << 3) | 5);
                    OutputStream outputStream = this.LIZ;
                    ByteBuffer order = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
                    order.putInt(i);
                    outputStream.write(order.array());
                    return;
                }
                LJIIIIZZ(c67527Qep.LJIIIIZZ << 3);
                LJIIIIZZ((i << 1) ^ (i >> 31));
                return;
            }
            LJIIIIZZ(c67527Qep.LJIIIIZZ << 3);
            LJIIIIZZ(i);
            return;
        }
        throw new C67504QeS("Field has no @Protobuf config");
    }

    public final void LJFF(C48260Iwq c48260Iwq, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        InterfaceC67542Qf4 interfaceC67542Qf4 = (InterfaceC67542Qf4) ((Annotation) c48260Iwq.LIZIZ.get(InterfaceC67542Qf4.class));
        if (interfaceC67542Qf4 != null) {
            C67527Qep c67527Qep = (C67527Qep) interfaceC67542Qf4;
            int i = C67539Qf1.LIZ[c67527Qep.LJIIIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    LJIIIIZZ((c67527Qep.LJIIIIZZ << 3) | 1);
                    OutputStream outputStream = this.LIZ;
                    ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
                    order.putLong(j);
                    outputStream.write(order.array());
                    return;
                }
                LJIIIIZZ(c67527Qep.LJIIIIZZ << 3);
                LJIIIZ((j >> 63) ^ (j << 1));
                return;
            }
            LJIIIIZZ(c67527Qep.LJIIIIZZ << 3);
            LJIIIZ(j);
            return;
        }
        throw new C67504QeS("Field has no @Protobuf config");
    }

    public C67524Qem(OutputStream outputStream, java.util.Map<Class<?>, InterfaceC67508QeW<?>> map, java.util.Map<Class<?>, InterfaceC67507QeV<?>> map2, InterfaceC67508QeW<Object> interfaceC67508QeW) {
        this.LIZ = outputStream;
        this.LIZIZ = map;
        this.LIZJ = map2;
        this.LIZLLL = interfaceC67508QeW;
    }

    public final void LJI(InterfaceC67508QeW interfaceC67508QeW, C48260Iwq c48260Iwq, Object obj, boolean z) {
        C67538Qf0 c67538Qf0 = new C67538Qf0();
        try {
            OutputStream outputStream = this.LIZ;
            this.LIZ = c67538Qf0;
            try {
                interfaceC67508QeW.LIZ(obj, this);
                this.LIZ = outputStream;
                long j = c67538Qf0.LJLIL;
                c67538Qf0.close();
                if (z && j == 0) {
                    return;
                }
                LJIIIIZZ((LJII(c48260Iwq) << 3) | 2);
                LJIIIZ(j);
                interfaceC67508QeW.LIZ(obj, this);
            } catch (Throwable th) {
                this.LIZ = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c67538Qf0.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
