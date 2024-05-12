package q03;

import X.C145995oB;
import X.C1JI;
import X.C43001GuD;
import X.C98T;
import X.FMX;
import X.HQU;
import X.InterfaceC88472Yns;
import android.view.View;
import com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.UGCPreviewActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDaS486S0100000_7 extends C98T {
    public final int $t;
    public Object l0;

    @Override // X.C98T
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS486S0100000_7(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(IDaS486S0100000_7 iDaS486S0100000_7, View view) {
        if (view != null) {
            ((UGCPreviewActivity) iDaS486S0100000_7.l0).finish();
            HQU hqu = ((UGCPreviewActivity) iDaS486S0100000_7.l0).LJLJLLL;
            if (hqu != null) {
                String shootWay = hqu.LIZJ();
                o.LJIIIZ(shootWay, "shootWay");
                FMX.LJIIL("exit_template_preview_page", C43001GuD.LJIIIZ(shootWay).LIZ);
                HQU hqu2 = ((UGCPreviewActivity) iDaS486S0100000_7.l0).LJLJLLL;
                if (hqu2 != null) {
                    String aid = hqu2.LIZ().getAid();
                    UGCPreviewActivity uGCPreviewActivity = (UGCPreviewActivity) iDaS486S0100000_7.l0;
                    long j = uGCPreviewActivity.LJLL;
                    HQU hqu3 = uGCPreviewActivity.LJLJLLL;
                    if (hqu3 != null) {
                        C43001GuD.LJIILL(1, aid, hqu3.LIZJ(), j);
                        return;
                    } else {
                        o.LJIJI("previewContext");
                        throw null;
                    }
                }
                o.LJIJI("previewContext");
                throw null;
            }
            o.LJIJI("previewContext");
            throw null;
        }
    }

    public static final void LIZ$1(IDaS486S0100000_7 iDaS486S0100000_7, View view) {
        if (view != null) {
            UGCPreviewActivity uGCPreviewActivity = (UGCPreviewActivity) iDaS486S0100000_7.l0;
            HQU hqu = uGCPreviewActivity.LJLJLLL;
            if (hqu != null) {
                C1JI.LJIJ(uGCPreviewActivity, hqu, 0);
                HQU hqu2 = ((UGCPreviewActivity) iDaS486S0100000_7.l0).LJLJLLL;
                if (hqu2 != null) {
                    String shootWay = hqu2.LIZJ();
                    o.LJIIIZ(shootWay, "shootWay");
                    C145995oB LJIIIZ = C43001GuD.LJIIIZ(shootWay);
                    LJIIIZ.LJI("enter_method", "click_add_media");
                    FMX.LJIIL("add_clips", LJIIIZ.LIZ);
                    HQU hqu3 = ((UGCPreviewActivity) iDaS486S0100000_7.l0).LJLJLLL;
                    if (hqu3 != null) {
                        String aid = hqu3.LIZ().getAid();
                        UGCPreviewActivity uGCPreviewActivity2 = (UGCPreviewActivity) iDaS486S0100000_7.l0;
                        long j = uGCPreviewActivity2.LJLL;
                        HQU hqu4 = uGCPreviewActivity2.LJLJLLL;
                        if (hqu4 != null) {
                            C43001GuD.LJIILL(0, aid, hqu4.LIZJ(), j);
                            return;
                        } else {
                            o.LJIJI("previewContext");
                            throw null;
                        }
                    }
                    o.LJIJI("previewContext");
                    throw null;
                }
                o.LJIJI("previewContext");
                throw null;
            }
            o.LJIJI("previewContext");
            throw null;
        }
    }

    public static final void LIZ$2(IDaS486S0100000_7 iDaS486S0100000_7, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) iDaS486S0100000_7.l0).invoke(view);
        }
    }
}
