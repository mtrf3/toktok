package X;

import com.bytedance.vcloud.abrmodule.ISegmentItem;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EXO implements ISegmentItem {
    public static boolean LJII;
    public static Class<?> LJIIIIZZ;
    public static Method LJIIIZ;
    public static Method LJIIJ;
    public static Method LJIIJJI;
    public static Method LJIIL;
    public static Method LJIILIIL;
    public final Object LIZ;
    public final boolean LIZIZ;
    public Integer LIZJ;
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "3943399752942141813"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentItem
    public final long getDuration() {
        Method method;
        Long l = this.LJFF;
        if (l != null) {
            return l.longValue();
        }
        long j = -1;
        if (!this.LIZIZ || (method = LJIIL) == null) {
            return -1L;
        }
        try {
            Long l2 = (Long) LIZ(this.LIZ, method, new Object[0]);
            this.LJFF = l2;
            j = l2.longValue();
            return j;
        } catch (Exception unused) {
            this.LJFF = Long.valueOf(j);
            return j;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentItem
    public final int getIndex() {
        Method method;
        Integer num = this.LIZJ;
        if (num != null) {
            return num.intValue();
        }
        int i = -1;
        if (!this.LIZIZ || (method = LJIIIZ) == null) {
            return -1;
        }
        try {
            Integer num2 = (Integer) LIZ(this.LIZ, method, new Object[0]);
            this.LIZJ = num2;
            i = num2.intValue();
            return i;
        } catch (Exception unused) {
            this.LIZJ = Integer.valueOf(i);
            return i;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentItem
    public final long getOffset() {
        Method method;
        Long l = this.LIZLLL;
        if (l != null) {
            return l.longValue();
        }
        long j = -1;
        if (!this.LIZIZ || (method = LJIIJ) == null) {
            return -1L;
        }
        try {
            Long l2 = (Long) LIZ(this.LIZ, method, new Object[0]);
            this.LIZLLL = l2;
            j = l2.longValue();
            return j;
        } catch (Exception unused) {
            this.LIZLLL = Long.valueOf(j);
            return j;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentItem
    public final long getSize() {
        Method method;
        Long l = this.LJI;
        if (l != null) {
            return l.longValue();
        }
        long j = -1;
        if (!this.LIZIZ || (method = LJIILIIL) == null) {
            return -1L;
        }
        try {
            Long l2 = (Long) LIZ(this.LIZ, method, new Object[0]);
            this.LJI = l2;
            j = l2.longValue();
            return j;
        } catch (Exception unused) {
            this.LJI = Long.valueOf(j);
            return j;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentItem
    public final long getTimestamp() {
        Method method;
        Long l = this.LJ;
        if (l != null) {
            return l.longValue();
        }
        long j = -1;
        if (!this.LIZIZ || (method = LJIIJJI) == null) {
            return -1L;
        }
        try {
            Long l2 = (Long) LIZ(this.LIZ, method, new Object[0]);
            this.LJ = l2;
            j = l2.longValue();
            return j;
        } catch (Exception unused) {
            this.LJ = Long.valueOf(j);
            return j;
        }
    }

    public EXO(Object obj) {
        this.LIZ = obj;
        if (LJIIIIZZ == null) {
            if (!LJII) {
                try {
                    Class<?> LJI = C47756Ioi.LJI(200, "com.ss.ttm.player.SidxListObject$SidxItem");
                    LJIIIIZZ = LJI;
                    LJIIIZ = LJI.getMethod("getIndex", new Class[0]);
                    LJIIJ = LJIIIIZZ.getMethod("getOffset", new Class[0]);
                    LJIIJJI = LJIIIIZZ.getMethod("getTimestamp", new Class[0]);
                    LJIIL = LJIIIIZZ.getMethod("getDuration", new Class[0]);
                    LJIILIIL = LJIIIIZZ.getMethod("getSize", new Class[0]);
                } catch (Exception unused) {
                    this.LIZ = null;
                    LJII = true;
                }
            } else {
                this.LIZ = null;
            }
        }
        Object obj2 = this.LIZ;
        if (obj2 != null && obj2.getClass().equals(LJIIIIZZ)) {
            this.LIZIZ = true;
        }
    }
}
