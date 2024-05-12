package Y;

import X.ActivityC45651qj;
import X.C82890Wg2;
import X.C83551Wqh;
import X.C83556Wqm;
import X.C83560Wqq;
import X.TMB;
import X.VEY;
import android.text.TextUtils;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.core.ExternalSourceLoader;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ARunnableS5S1201000_14 implements Runnable {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS5S1201000_14 aRunnableS5S1201000_14) {
        boolean LIZ;
        VEY vey;
        try {
            LynxTemplateRender lynxTemplateRender = ((ExternalSourceLoader) aRunnableS5S1201000_14.l2).LIZLLL.get();
            if (lynxTemplateRender != null) {
                String str = aRunnableS5S1201000_14.s0;
                byte[] bArr = (byte[]) aRunnableS5S1201000_14.l1;
                int i = aRunnableS5S1201000_14.i3;
                if (bArr != null && bArr.length > 0 && (vey = lynxTemplateRender.LJJIJL) != null) {
                    vey.LIZ("last_lynx_async_component_url", str);
                }
                TemplateAssembler templateAssembler = lynxTemplateRender.LIZ;
                if (templateAssembler != null) {
                    templateAssembler.LJII(i, str, bArr);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS5S1201000_14 aRunnableS5S1201000_14) {
        C83560Wqq c83560Wqq = (C83560Wqq) aRunnableS5S1201000_14.l1;
        Integer num = (Integer) aRunnableS5S1201000_14.l2;
        int i = aRunnableS5S1201000_14.i3;
        String string = aRunnableS5S1201000_14.s0;
        c83560Wqq.getClass();
        int intValue = num.intValue();
        c83560Wqq.LJII = intValue;
        if (intValue <= 0 && i == 1) {
            ActivityC45651qj activityC45651qj = c83560Wqq.LJFF;
            TMB.LIZLLL(C82890Wg2.LJFF, activityC45651qj, activityC45651qj.getResources().getString(R.string.pvn)).LIZ();
            return;
        }
        if (!TextUtils.isEmpty(string)) {
            int i2 = c83560Wqq.LJII;
            o.LJIIIZ(string, "string");
            c83560Wqq.LJII = string.length() + i2;
        }
        C83551Wqh c83551Wqh = c83560Wqq.LIZ;
        if (c83551Wqh == null) {
            return;
        }
        c83551Wqh.setMaxTextCount(c83560Wqq.LJII);
    }

    public static final void run$2(ARunnableS5S1201000_14 aRunnableS5S1201000_14) {
        C83556Wqm c83556Wqm = (C83556Wqm) aRunnableS5S1201000_14.l1;
        Integer num = (Integer) aRunnableS5S1201000_14.l2;
        int i = aRunnableS5S1201000_14.i3;
        String string = aRunnableS5S1201000_14.s0;
        c83556Wqm.getClass();
        int intValue = num.intValue();
        c83556Wqm.LJII = intValue;
        if (intValue <= 0 && i == 1) {
            ActivityC45651qj activityC45651qj = c83556Wqm.LJFF;
            TMB.LIZLLL(C82890Wg2.LJFF, activityC45651qj, activityC45651qj.getResources().getString(R.string.pvn)).LIZ();
            return;
        }
        if (!TextUtils.isEmpty(string)) {
            int i2 = c83556Wqm.LJII;
            o.LJIIIZ(string, "string");
            c83556Wqm.LJII = string.length() + i2;
        }
        C83551Wqh c83551Wqh = c83556Wqm.LIZ;
        if (c83551Wqh == null) {
            return;
        }
        c83551Wqh.setMaxTextCount(c83556Wqm.LJII);
    }

    public ARunnableS5S1201000_14(int i, Object obj, Object obj2, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.l2 = obj2;
        this.i3 = i;
        this.s0 = str;
    }
}
