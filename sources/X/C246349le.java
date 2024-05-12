package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.poplayer.core.PopupManager;
import kotlin.jvm.internal.AqS104S0101000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9le, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C246349le {
    public static AKH LIZ;
    public static String LIZIZ = "cross";
    public static M78 LIZJ;
    public static InterfaceC246329lc LIZLLL;

    public static String LIZJ(String str) {
        StringBuilder LJFF = C72972SkS.LJFF(str, '_');
        LJFF.append(((RBX) HG3.LJIILL()).getCurSecUserId());
        return X1D.LIZIZ(LJFF);
    }

    public static void LIZ(AqS104S0101000_4 aqS104S0101000_4, C246299lZ c246299lZ, View view, final C235769Nc c235769Nc) {
        int LIZ2;
        LIZIZ = "cross";
        if (view instanceof ViewGroup) {
            if (C53765L8f.LJIIJJI()) {
                LIZ2 = 0;
            } else {
                C57092Lx.LIZ.getClass();
                LIZ2 = C61447O9r.LIZ();
            }
            final C246429lm c246429lm = new C246429lm(LIZ2, view, aqS104S0101000_4);
            PopupManager.LJIIL(new M71(c235769Nc, c246429lm) { // from class: X.9lg
                public final InterfaceC88472Yns<M78, C76800UCe> LJLIL;

                @Override // X.M74
                public final boolean canShow() {
                    return true;
                }

                @Override // X.InterfaceC56321M8n
                public final int getPriority() {
                    return 444;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(c235769Nc);
                    o.LJIIIZ(c235769Nc, "scene");
                    this.LJLIL = c246429lm;
                }

                @Override // X.M72
                public final void LIZLLL(C54082LKk context, M78 wrapper) {
                    o.LJIIIZ(context, "context");
                    o.LJIIIZ(wrapper, "wrapper");
                    this.LJLIL.invoke(wrapper);
                }
            });
            return;
        }
        if (c246299lZ == null) {
            return;
        }
        c246299lZ.invoke();
    }

    public static void LIZIZ(AqS104S0101000_4 aqS104S0101000_4, C246299lZ c246299lZ, ActivityC45651qj activityC45651qj, final InterfaceC56322M8o interfaceC56322M8o) {
        String LIZJ2 = C31461Li.LIZJ("new_release_guide_url", "", "getInstance().getStringV…ightGuideUrl::class.java)");
        if (LIZJ2.length() == 0) {
            if (c246299lZ != null) {
                c246299lZ.invoke();
            }
        } else {
            final AqS47S1200000_4 aqS47S1200000_4 = new AqS47S1200000_4(activityC45651qj, LIZJ2, aqS104S0101000_4, 29);
            PopupManager.LJIIL(new M71(interfaceC56322M8o, aqS47S1200000_4) { // from class: X.9li
                public final InterfaceC88472Yns<M78, C76800UCe> LJLIL;

                @Override // X.M74
                public final boolean canShow() {
                    return true;
                }

                @Override // X.InterfaceC56321M8n
                public final int getPriority() {
                    return 444;
                }

                {
                    this.LJLIL = aqS47S1200000_4;
                }

                @Override // X.M72
                public final void LIZLLL(C54082LKk context, M78 wrapper) {
                    o.LJIIIZ(context, "context");
                    o.LJIIIZ(wrapper, "wrapper");
                    this.LJLIL.invoke(wrapper);
                }
            });
        }
    }
}
