package o53;

import X.C41051G9f;
import X.C45470Hsw;
import X.C46026I4o;
import X.HO7;
import X.W4V;
import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDdS474S0100000_7 extends W4V {
    public final int $t;
    public Object l0;

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJFF$0(this, str, obj, animatable);
                return;
            case 1:
                LJFF$1(this, str, obj, animatable);
                return;
            case 2:
                LJFF$2(this, str, obj, animatable);
                return;
            default:
                super.LJFF(str, obj, animatable);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJI(Object obj, String str) {
        switch (this.$t) {
            case 2:
                LJI$0(this, obj, str);
                return;
            default:
                super.LJI(obj, str);
                return;
        }
    }

    public IDdS474S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJI$0(IDdS474S0100000_7 iDdS474S0100000_7, Object callerContext, String id) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(callerContext, "callerContext");
        C45470Hsw c45470Hsw = (C45470Hsw) ((HO7) iDdS474S0100000_7.l0);
        c45470Hsw.getClass();
        c45470Hsw.LIZ = System.currentTimeMillis();
    }

    public static final void LJFF$0(IDdS474S0100000_7 iDdS474S0100000_7, String str, Object obj, Animatable animatable) {
        ((C41051G9f) iDdS474S0100000_7.l0).LLFF = true;
    }

    public static final void LJFF$1(IDdS474S0100000_7 iDdS474S0100000_7, String str, Object obj, Animatable animatable) {
        ((C46026I4o) iDdS474S0100000_7.l0).LIZIZ();
    }

    public static final void LJFF$2(IDdS474S0100000_7 iDdS474S0100000_7, String id, Object obj, Animatable animatable) {
        o.LJIIIZ(id, "id");
        ((C45470Hsw) ((HO7) iDdS474S0100000_7.l0)).LIZ();
    }
}
