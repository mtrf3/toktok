package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC55642Lsc("inbox_activity_status_init_pop")
/* renamed from: X.4Jj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107394Jj extends AbstractC56327M8t<DialogFragment> {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLILLLLZI;
    public final int LJLJI;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJI;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        boolean z;
        o.LJIIIZ(context, "context");
        AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(this, 10);
        ActivityC45651qj activityC45651qj = this.LJLIL;
        C107404Jk c107404Jk = new C107404Jk(activityC45651qj, activityC45651qj.getSupportFragmentManager());
        c107404Jk.LJIIL = true;
        c107404Jk.LJIIIZ = aqS167S0100000_1;
        String LIZIZ = C85990Xow.LIZIZ();
        if (ujb.o.LJJJJJL(LIZIZ)) {
            LIZIZ = C85990Xow.LJFF();
        }
        String LIZJ = C31461Li.LIZJ("activity_status_guide_region_set_string", "AL,AD,AT,BE,BG,HR,CZ,DK,BG,HR,CZ,DK,BG,HR,CZ,DK,BG,HR,CZ,DK,EE,FO,FI,FR,DE,GI,GR,GG,VA,HU,IS,IE,IM,IT,JE,LV,LI,LT,LU,MT,MC,NL,MK,NO,PL,PT,RO,SM,RS,SK,SI,ES,SJ,SE,CH,GB,AX", "getInstance().getStringV…StatusRegion::class.java)");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("current region: ");
        LIZ.append(LIZIZ);
        LIZ.append(", eu region: ");
        LIZ.append(LIZJ);
        C34B.LIZIZ("ActivityStatusSheetImpl", X1D.LIZIZ(LIZ));
        if (LIZIZ.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && s.LJJJLZIJ(LIZJ, LIZIZ, false)) {
            c107404Jk.LJIIJ = true;
            View view = c107404Jk.LJFF;
            if (view != null) {
                view.setVisibility(8);
                TuxTextView tuxTextView = c107404Jk.LJIIIIZZ;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                    ARV arv = c107404Jk.LIZLLL;
                    if (arv != null) {
                        arv.setVisibility(8);
                        LinearLayout linearLayout = c107404Jk.LJ;
                        if (linearLayout != null) {
                            C17N.LJJLIIIJJI(linearLayout);
                            ARV arv2 = c107404Jk.LIZLLL;
                            if (arv2 != null) {
                                arv2.setChecked(true);
                                c107404Jk.LJIIJJI = false;
                                SY4 sy4 = c107404Jk.LJII;
                                if (sy4 != null) {
                                    C17N.LJJIIJZLJL(sy4);
                                } else {
                                    o.LJIJI("buttonSave");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("switch");
                                throw null;
                            }
                        } else {
                            o.LJIJI("eUButtonContainer");
                            throw null;
                        }
                    } else {
                        o.LJIJI("switch");
                        throw null;
                    }
                } else {
                    o.LJIJI("activityStatusButtonDesc");
                    throw null;
                }
            } else {
                o.LJIJI("dividerView");
                throw null;
            }
        } else {
            LinearLayout linearLayout2 = c107404Jk.LJ;
            if (linearLayout2 != null) {
                C17N.LJJIIJZLJL(linearLayout2);
                ARV arv3 = c107404Jk.LIZLLL;
                if (arv3 != null) {
                    arv3.setChecked(true);
                    c107404Jk.LJIIJJI = true;
                } else {
                    o.LJIJI("switch");
                    throw null;
                }
            } else {
                o.LJIJI("eUButtonContainer");
                throw null;
            }
        }
        TuxSheet LIZ2 = c107404Jk.LIZ();
        c107404Jk.LIZIZ = LIZ2;
        IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJIIZILJ.postValue(Boolean.FALSE);
        LIZ2.show(this.LJLIL.getSupportFragmentManager(), "ActivityStatusInitPop");
        IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics().LJI(EnumC107414Jl.INTRO_PANEL);
        return LIZ2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C107394Jj(ActivityC45651qj activityC45651qj, InboxFragment popupScene, AqS167S0100000_1 aqS167S0100000_1) {
        super(popupScene);
        o.LJIIIZ(popupScene, "popupScene");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = aqS167S0100000_1;
        this.LJLJI = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
    }
}
