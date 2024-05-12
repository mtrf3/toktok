package Y;

import X.ASQ;
import X.ASY;
import X.AbstractC91339Zt1;
import X.AbstractC91590Zx4;
import X.C76800UCe;
import X.C91071Zoh;
import X.C91109ZpJ;
import X.C91197Zqj;
import X.C91287ZsB;
import X.C91299ZsN;
import X.C91496ZvY;
import X.C91510Zvm;
import X.EnumC91310ZsY;
import X.InterfaceC55112Lk4;
import X.InterfaceC88471Ynr;
import X.InterfaceC88473Ynt;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.audioinfo.AudioInfoAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.seekbar.AudioSeekBarAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public class IDCListenerS137S0100000_29 implements View.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            case 12:
                onClick$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, view);
                return;
            default:
                return;
        }
    }

    public IDCListenerS137S0100000_29(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCListenerS137S0100000_29 iDCListenerS137S0100000_29, View view) {
        Boolean bool;
        AbstractC91590Zx4 playerController;
        EnumC91310ZsY LJIJI;
        AbstractC91339Zt1 abstractC91339Zt1 = (AbstractC91339Zt1) iDCListenerS137S0100000_29.l0;
        C91109ZpJ c91109ZpJ = abstractC91339Zt1.LJLLILLLL;
        if (c91109ZpJ != null) {
            abstractC91339Zt1.LJLJLJ = c91109ZpJ.getSeekTime();
            AbstractC91590Zx4 playerController2 = abstractC91339Zt1.getPlayerController();
            if (playerController2 != null) {
                playerController2.LJLILLLLZI.LJJI(abstractC91339Zt1.LJLJLJ);
            }
            AbstractC91590Zx4 playerController3 = abstractC91339Zt1.getPlayerController();
            if (playerController3 != null && (LJIJI = playerController3.LJIJI()) != null) {
                bool = Boolean.valueOf(LJIJI.isPlayingState());
            } else {
                bool = null;
            }
            if (o.LJ(bool, Boolean.FALSE) && (playerController = abstractC91339Zt1.getPlayerController()) != null) {
                C91287ZsB.LIZ(playerController, null, 3);
            }
        }
        ((AbstractC91339Zt1) iDCListenerS137S0100000_29.l0).LIZLLL();
    }

    public static final void onClick$1(IDCListenerS137S0100000_29 iDCListenerS137S0100000_29, View view) {
        InterfaceC55112Lk4 interfaceC55112Lk4 = ((C91071Zoh) iDCListenerS137S0100000_29.l0).LJLJLLL;
        if (interfaceC55112Lk4 != null) {
            interfaceC55112Lk4.LJJIJIL();
        }
    }

    public static final void onClick$10(IDCListenerS137S0100000_29 iDCListenerS137S0100000_29, View view) {
        ((Activity) iDCListenerS137S0100000_29.l0).finish();
    }

    public static final void onClick$11(IDCListenerS137S0100000_29 iDCListenerS137S0100000_29, View view) {
        C91510Zvm c91510Zvm = (C91510Zvm) iDCListenerS137S0100000_29.l0;
        InterfaceC88471Ynr<String, Context, C76800UCe> interfaceC88471Ynr = c91510Zvm.LJLJJLL;
        if (interfaceC88471Ynr != null) {
            String str = c91510Zvm.LJLIL;
            Context context = view.getContext();
            o.LJIIIIZZ(context, "it.context");
            interfaceC88471Ynr.invoke(str, context);
        }
    }

    public static final void onClick$12(IDCListenerS137S0100000_29 iDCListenerS137S0100000_29, View view) {
        View contentView = (View) iDCListenerS137S0100000_29.l0;
        o.LJIIIIZZ(contentView, "contentView");
        ASQ.LIZLLL(contentView, ASY.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r5.LJZL == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$13(Y.IDCListenerS137S0100000_29 r9, android.view.View r10) {
        /*
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.dsp.playpage.card.upsell.UpsellLandingPageSlotAssem r0 = (com.ss.android.ugc.aweme.dsp.playpage.card.upsell.UpsellLandingPageSlotAssem) r0
            android.content.Context r6 = r0.getContext()
            if (r6 == 0) goto L5d
            java.lang.Object r3 = r9.l0
            com.ss.android.ugc.aweme.dsp.playpage.card.upsell.UpsellLandingPageSlotAssem r3 = (com.ss.android.ugc.aweme.dsp.playpage.card.upsell.UpsellLandingPageSlotAssem) r3
            X.Ztv r5 = r3.LLIIJLIL
            r4 = 0
            if (r5 == 0) goto L6c
            boolean r1 = r5.LJZL
            r0 = 1
            if (r1 != r0) goto L6c
        L18:
            r2 = 0
            if (r0 == 0) goto L67
        L1b:
            r1 = r2
        L1c:
            r0 = 12
            X.C91218Zr4.LJFF(r6, r1, r4, r0)
            boolean r0 = X.C91218Zr4.LIZLLL(r6)
            if (r0 == 0) goto L64
            java.lang.String r7 = "open_resso"
        L29:
            X.Ztv r1 = r3.LLIIJLIL
            if (r1 == 0) goto L5d
        L2e:
            X.ZvB r0 = r3.x5()
            if (r0 == 0) goto L36
            java.lang.String r2 = r0.LJLIL
        L36:
            java.lang.String r0 = "dsp_player"
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 == 0) goto L61
            java.lang.String r4 = "my_playlist"
        L40:
            X.ZsP r5 = r1.LJLJJI
            java.lang.String r6 = "stream_limit"
            boolean r0 = r1.LJZL
            if (r0 == 0) goto L5e
            com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility r0 = X.C91264Zro.LJ(r3)
            if (r0 == 0) goto L54
            java.lang.String r8 = r0.getEnterMethod()
            if (r8 != 0) goto L56
        L54:
            java.lang.String r8 = ""
        L56:
            java.lang.String r9 = "button"
            r10 = 64
            X.C91249ZrZ.LJIILL(r4, r5, r6, r7, r8, r9, r10)
        L5d:
            return
        L5e:
            java.lang.String r8 = r5.LJ
            goto L56
        L61:
            java.lang.String r4 = "track_reco"
            goto L40
        L64:
            java.lang.String r7 = "download_resso"
            goto L29
        L67:
            if (r5 == 0) goto L1b
            com.ss.android.ugc.aweme.dsp.common.model.DspUpsellRessoStruct r1 = r5.LJLJI
            goto L1c
        L6c:
            r0 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDCListenerS137S0100000_29.onClick$13(Y.IDCListenerS137S0100000_29, android.view.View):void");
    }

    public static final void onClick$2(IDCListenerS137S0100000_29 iDCListenerS137S0100000_29, View view) {
        ((AudioInfoAssem) iDCListenerS137S0100000_29.l0).k4();
    }

    public static final void onClick$3(IDCListenerS137S0100000_29 iDCListenerS137S0100000_29, View view) {
        ((AudioInfoAssem) iDCListenerS137S0100000_29.l0).k4();
    }

    public static final void onClick$4(IDCListenerS137S0100000_29 iDCListenerS137S0100000_29, View view) {
        IAudioPlayerAbility Z3;
        AbstractC91590Zx4 HS;
        if (!((AudioSeekBarAssem) iDCListenerS137S0100000_29.l0).b4() || (Z3 = ((AudioSeekBarAssem) iDCListenerS137S0100000_29.l0).Z3()) == null || (HS = Z3.HS()) == null) {
            return;
        }
        EnumC91310ZsY LJIJI = HS.LJIJI();
        if (LJIJI.isPlayingState()) {
            HS.LJIL(new C91299ZsN("PAUSE_FROM_USER_PAUSE"));
        } else if (LJIJI.isPauseState()) {
            HS.LJJ(new C91299ZsN("RESUME_FROM_USER_RESUME"));
        } else {
            C91287ZsB.LIZ(HS, new C91299ZsN("RESUME_FROM_USER_RESUME"), 2);
        }
    }

    public static final void onClick$5(IDCListenerS137S0100000_29 iDCListenerS137S0100000_29, View view) {
        C91496ZvY c91496ZvY = (C91496ZvY) iDCListenerS137S0100000_29.l0;
        InterfaceC88473Ynt<String, String, Context, C76800UCe> interfaceC88473Ynt = c91496ZvY.LJLJLJ;
        if (interfaceC88473Ynt != null) {
            String str = c91496ZvY.LJLIL;
            String str2 = c91496ZvY.LJLILLLLZI;
            Context context = view.getContext();
            o.LJIIIIZZ(context, "it.context");
            interfaceC88473Ynt.invoke(str, str2, context);
        }
    }

    public static final void onClick$6(IDCListenerS137S0100000_29 iDCListenerS137S0100000_29, View view) {
        ((C91197Zqj) iDCListenerS137S0100000_29.l0).LIZJ();
    }

    public static final void onClick$7(IDCListenerS137S0100000_29 iDCListenerS137S0100000_29, View view) {
        ((C91197Zqj) iDCListenerS137S0100000_29.l0).LIZLLL();
    }

    public static final void onClick$8(IDCListenerS137S0100000_29 iDCListenerS137S0100000_29, View view) {
        ((C91197Zqj) iDCListenerS137S0100000_29.l0).LIZIZ();
    }

    public static final void onClick$9(IDCListenerS137S0100000_29 iDCListenerS137S0100000_29, View view) {
        ((AudioInfoAssem) iDCListenerS137S0100000_29.l0).e4();
    }
}
