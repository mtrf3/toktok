package X;

import com.bytedance.vcloud.abrmodule.ISegmentInfo;
import com.bytedance.vcloud.abrmodule.ISegmentItem;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class EXN implements ISegmentInfo {
    public static boolean LJIIIIZZ;
    public static Class<?> LJIIIZ;
    public static Method LJIIJ;
    public static Method LJIIJJI;
    public static Method LJIIL;
    public static Method LJIILIIL;
    public static Method LJIILJJIL;
    public static Method LJIILL;
    public static Method LJIILLIIL;
    public final Object LIZ;
    public final boolean LIZIZ;
    public Integer LIZJ;
    public Integer LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public Long LJI;
    public String LJII;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "3943399752942136080"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final long getBitrate() {
        Method method;
        Long l = this.LJI;
        if (l != null) {
            return l.longValue();
        }
        long j = -1;
        if (!this.LIZIZ || (method = LJIILJJIL) == null) {
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

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final int getEndIndex() {
        Method method;
        Integer num = this.LJFF;
        if (num != null) {
            return num.intValue();
        }
        if (!this.LIZIZ || (method = LJIILIIL) == null) {
            return 0;
        }
        try {
            Integer num2 = (Integer) LIZ(this.LIZ, method, new Object[0]);
            this.LJFF = num2;
            return num2.intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final String getFileId() {
        Method method;
        String str = this.LJII;
        if (str != null) {
            return str;
        }
        if (this.LIZIZ && (method = LJIILL) != null) {
            try {
                this.LJII = (String) LIZ(this.LIZ, method, new Object[0]);
            } catch (Exception unused) {
                this.LJII = null;
            }
        }
        return this.LJII;
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final List<? extends ISegmentItem> getItems() {
        ArrayList arrayList = new ArrayList();
        if (this.LIZIZ && LJIILLIIL != null) {
            for (int i = 0; getStartIndex() + i <= getEndIndex(); i++) {
                try {
                    arrayList.add(new EXO(LIZ(this.LIZ, LJIILLIIL, new Object[]{Integer.valueOf(i)})));
                } catch (Exception unused) {
                    return null;
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final int getMediaType() {
        Method method;
        Integer num = this.LIZJ;
        if (num != null) {
            return num.intValue();
        }
        int i = -1;
        if (!this.LIZIZ || (method = LJIIJ) == null) {
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

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final int getStartIndex() {
        Method method;
        Integer num = this.LJ;
        if (num != null) {
            return num.intValue();
        }
        if (!this.LIZIZ || (method = LJIIL) == null) {
            return 0;
        }
        try {
            Integer num2 = (Integer) LIZ(this.LIZ, method, new Object[0]);
            this.LJ = num2;
            return num2.intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final int getTotalNum() {
        Method method;
        Integer num = this.LIZLLL;
        if (num != null) {
            return num.intValue();
        }
        int i = -1;
        if (!this.LIZIZ || (method = LJIIJJI) == null) {
            return -1;
        }
        try {
            Integer num2 = (Integer) LIZ(this.LIZ, method, new Object[0]);
            this.LIZLLL = num2;
            i = num2.intValue();
            return i;
        } catch (Exception unused) {
            this.LIZLLL = Integer.valueOf(i);
            return i;
        }
    }

    public EXN(Object obj) {
        this.LIZ = obj;
        if (LJIIIZ == null) {
            if (!LJIIIIZZ) {
                try {
                    Class<?> LJI = C47756Ioi.LJI(200, "com.ss.ttm.player.SidxListObject");
                    LJIIIZ = LJI;
                    LJIIJ = LJI.getMethod("getMediaType", new Class[0]);
                    LJIIJJI = LJIIIZ.getMethod("getTotalNum", new Class[0]);
                    LJIIL = LJIIIZ.getMethod("getStartIndex", new Class[0]);
                    LJIILIIL = LJIIIZ.getMethod("getEndIndex", new Class[0]);
                    LJIILJJIL = LJIIIZ.getMethod("getBitrate", new Class[0]);
                    LJIILL = LJIIIZ.getMethod("getFileId", new Class[0]);
                    LJIILLIIL = LJIIIZ.getMethod("getItem", Integer.TYPE);
                } catch (Exception unused) {
                    this.LIZ = null;
                    LJIIIIZZ = true;
                }
            } else {
                this.LIZ = null;
            }
        }
        Object obj2 = this.LIZ;
        if (obj2 != null && obj2.getClass().equals(LJIIIZ)) {
            this.LIZIZ = true;
        }
    }
}
