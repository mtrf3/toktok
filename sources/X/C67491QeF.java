package X;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.QeF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67491QeF implements InterfaceC67543Qf5, InterfaceC67510QeY {
    public boolean LIZ = true;
    public final JsonWriter LIZIZ;
    public final java.util.Map<Class<?>, InterfaceC67508QeW<?>> LIZJ;
    public final java.util.Map<Class<?>, InterfaceC67507QeV<?>> LIZLLL;
    public final InterfaceC67508QeW<Object> LJ;
    public final boolean LJFF;

    public final void LJII() {
        if (this.LIZ) {
        } else {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    @Override // X.InterfaceC67510QeY
    public final InterfaceC67510QeY LIZ(String str) {
        LJII();
        this.LIZIZ.value(str);
        return this;
    }

    @Override // X.InterfaceC67510QeY
    public final InterfaceC67510QeY LIZJ(boolean z) {
        LJII();
        this.LIZIZ.value(z);
        return this;
    }

    public final C67491QeF LJFF(Object obj) {
        if (obj == null) {
            this.LIZIZ.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.LIZIZ.value((Number) obj);
            return this;
        }
        int i = 0;
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                LJII();
                this.LIZIZ.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            this.LIZIZ.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.LIZIZ.value(r9[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    long j = jArr[i];
                    LJII();
                    this.LIZIZ.value(j);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.LIZIZ.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.LIZIZ.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i < length5) {
                    LJFF(numberArr[i]);
                    i++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i < length6) {
                    LJFF(objArr[i]);
                    i++;
                }
            }
            this.LIZIZ.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            this.LIZIZ.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                LJFF(it.next());
            }
            this.LIZIZ.endArray();
            return this;
        }
        if (obj instanceof java.util.Map) {
            this.LIZIZ.beginObject();
            for (Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    LJI(entry.getValue(), (String) key);
                } catch (ClassCastException e) {
                    throw new C67504QeS(C16880lQ.LLLZ("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                }
            }
            this.LIZIZ.endObject();
            return this;
        }
        InterfaceC67508QeW<?> interfaceC67508QeW = this.LIZJ.get(obj.getClass());
        if (interfaceC67508QeW != null) {
            this.LIZIZ.beginObject();
            interfaceC67508QeW.LIZ(obj, this);
            this.LIZIZ.endObject();
            return this;
        }
        InterfaceC67507QeV<?> interfaceC67507QeV = this.LIZLLL.get(obj.getClass());
        if (interfaceC67507QeV != null) {
            interfaceC67507QeV.LIZ(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            String name = ((Enum) obj).name();
            LJII();
            this.LIZIZ.value(name);
            return this;
        }
        InterfaceC67508QeW<Object> interfaceC67508QeW2 = this.LJ;
        this.LIZIZ.beginObject();
        interfaceC67508QeW2.LIZ(obj, this);
        this.LIZIZ.endObject();
        return this;
    }

    @Override // X.InterfaceC67543Qf5
    public final InterfaceC67543Qf5 LIZIZ(C48260Iwq c48260Iwq, Object obj) {
        LJI(obj, c48260Iwq.LIZ);
        return this;
    }

    @Override // X.InterfaceC67543Qf5
    public final InterfaceC67543Qf5 LIZLLL(C48260Iwq c48260Iwq, long j) {
        String str = c48260Iwq.LIZ;
        LJII();
        this.LIZIZ.name(str);
        LJII();
        this.LIZIZ.value(j);
        return this;
    }

    @Override // X.InterfaceC67543Qf5
    public final InterfaceC67543Qf5 LJ(C48260Iwq c48260Iwq, int i) {
        String str = c48260Iwq.LIZ;
        LJII();
        this.LIZIZ.name(str);
        LJII();
        this.LIZIZ.value(i);
        return this;
    }

    public final C67491QeF LJI(Object obj, String str) {
        if (this.LJFF) {
            if (obj != null) {
                LJII();
                this.LIZIZ.name(str);
                LJFF(obj);
            }
            return this;
        }
        LJII();
        this.LIZIZ.name(str);
        if (obj == null) {
            this.LIZIZ.nullValue();
        } else {
            LJFF(obj);
        }
        return this;
    }

    public C67491QeF(Writer writer, java.util.Map map, java.util.Map map2, C67497QeL c67497QeL, boolean z) {
        this.LIZIZ = new JsonWriter(writer);
        this.LIZJ = map;
        this.LIZLLL = map2;
        this.LJ = c67497QeL;
        this.LJFF = z;
    }
}
