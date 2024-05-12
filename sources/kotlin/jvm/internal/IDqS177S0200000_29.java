package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C68322mC;
import X.C76800UCe;
import X.C91198Zqk;
import X.C91203Zqp;
import X.C91246ZrW;
import X.C91323Zsl;
import X.C91325Zsn;
import X.C91328Zsq;
import X.C91330Zss;
import X.C91476ZvE;
import X.EnumC91310ZsY;
import X.EnumC91326Zso;
import X.FMX;
import X.InterfaceC65784Pro;
import X.L41;
import X.X1D;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment;
import com.ss.android.ugc.aweme.dsp.v2.TTDspFragmentV2;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes22.dex */
public class IDqS177S0200000_29 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS177S0200000_29 iDqS177S0200000_29) {
        ((C91330Zss) iDqS177S0200000_29.l0).LJLIL.onPlaybackStateChanged((EnumC91310ZsY) iDqS177S0200000_29.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS177S0200000_29 iDqS177S0200000_29) {
        return ((TTDspFragmentV2) iDqS177S0200000_29.l0).Il((ActivityC45651qj) iDqS177S0200000_29.l1).LJLILLLLZI;
    }

    public static final Object invoke$2(IDqS177S0200000_29 iDqS177S0200000_29) {
        return ((TTDspFragmentV2) iDqS177S0200000_29.l0).Il((ActivityC45651qj) iDqS177S0200000_29.l1).LJLJJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (X.YBM.LIZJ() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.IDqS177S0200000_29 r4) {
        /*
            com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager r0 = com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager.INSTANCE
            boolean r0 = r0.isTodayPlayableLimited()
            if (r0 == 0) goto L16
            X.YBM r0 = X.YBM.LIZ
            r0.getClass()
            boolean r0 = X.YBM.LIZJ()
            if (r0 != 0) goto L16
        L13:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L16:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "tryToShowXTabFromColdStart ability is "
            r1.append(r0)
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility r0 = (com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility) r0
            r1.append(r0)
            java.lang.String r0 = " call showPanelWithSelectedTab"
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            boolean r0 = X.C91203Zqp.LIZIZ
            if (r0 != 0) goto L13
            r0 = 1
            X.C91203Zqp.LIZIZ = r0
            java.lang.Object r3 = r4.l0
            com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility r3 = (com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility) r3
            java.lang.Object r2 = r4.l1
            android.content.Context r2 = (android.content.Context) r2
            X.IJs r1 = X.C91203Zqp.LIZIZ()
            r0 = 1002(0x3ea, float:1.404E-42)
            r3.wh(r2, r1, r0)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS177S0200000_29.invoke$3(kotlin.jvm.internal.IDqS177S0200000_29):java.lang.Object");
    }

    public static final Object invoke$4(IDqS177S0200000_29 iDqS177S0200000_29) {
        C91203Zqp.LIZLLL((IXTabPanelAbility) iDqS177S0200000_29.l0);
        Keva keva = C91198Zqk.LIZ;
        if (!keva.getBoolean("show_xtab_menu_by_coolected_song", false)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("tryToShowXTabFromUserCollectAction ability is ");
            LIZ.append((IXTabPanelAbility) iDqS177S0200000_29.l0);
            LIZ.append(" call showPanel");
            X1D.LIZIZ(LIZ);
            ((IXTabPanelAbility) iDqS177S0200000_29.l0).wh((Context) iDqS177S0200000_29.l1, C91203Zqp.LIZIZ(), 1001);
            keva.storeBoolean("show_xtab_menu_by_coolected_song", true);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(IDqS177S0200000_29 iDqS177S0200000_29) {
        String LLLZ;
        ((BasePlayerFragment) iDqS177S0200000_29.l0).getClass();
        Keva repo = Keva.getRepo("music_dsp_guide_repo");
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        if (com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null || com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() == 0) {
            com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = CardStruct.IStatusCode.DEFAULT;
        }
        L41.LIZ.getClass();
        if (L41.LIZ()) {
            LLLZ = C16880lQ.LLLZ("can_play_background_guide_%s", Arrays.copyOf(new Object[]{com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
        } else {
            LLLZ = C16880lQ.LLLZ("cannot_play_background_guide_%s", Arrays.copyOf(new Object[]{com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
        }
        repo.storeBoolean(LLLZ, true);
        C91246ZrW c91246ZrW = (C91246ZrW) ((C68322mC) iDqS177S0200000_29.l1).element;
        if (c91246ZrW != null) {
            String enterFrom = c91246ZrW.LIZ;
            String enterMethod = c91246ZrW.LIZIZ;
            o.LJIIIZ(enterFrom, "enterFrom");
            o.LJIIIZ(enterMethod, "enterMethod");
            HashMap hashMap = new HashMap();
            hashMap.put("show_reason", "backward_guidance");
            hashMap.put("enter_from", enterFrom);
            hashMap.put("enter_method", enterMethod);
            FMX.LJIIL("dsp_action_sheet_show", hashMap);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS177S0200000_29 iDqS177S0200000_29) {
        C91328Zsq c91328Zsq = ((C91476ZvE) iDqS177S0200000_29.l0).LJLLLLLL;
        EnumC91326Zso mode = (EnumC91326Zso) iDqS177S0200000_29.l1;
        c91328Zsq.getClass();
        o.LJIIIZ(mode, "mode");
        if (c91328Zsq.LIZIZ != mode) {
            c91328Zsq.LIZIZ = mode;
            c91328Zsq.LIZJ.requestLayout();
            c91328Zsq.LIZJ.invalidate();
        }
        C91325Zsn c91325Zsn = ((C91476ZvE) iDqS177S0200000_29.l0).LJLLLL;
        EnumC91326Zso mode2 = (EnumC91326Zso) iDqS177S0200000_29.l1;
        c91325Zsn.getClass();
        o.LJIIIZ(mode2, "mode");
        if (c91325Zsn.LIZ != mode2) {
            c91325Zsn.LIZ = mode2;
            int i = C91323Zsl.LIZ[mode2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (c91325Zsn.LJI.isRunning()) {
                            c91325Zsn.LJI.cancel();
                        }
                        c91325Zsn.LJI.start();
                    }
                } else {
                    if (c91325Zsn.LJI.isRunning()) {
                        c91325Zsn.LJI.cancel();
                    }
                    c91325Zsn.LIZLLL = -1.0f;
                }
            } else {
                if (c91325Zsn.LJI.isRunning()) {
                    c91325Zsn.LJI.cancel();
                }
                c91325Zsn.LIZLLL = -1.0f;
            }
            c91325Zsn.LJIIIIZZ.requestLayout();
            c91325Zsn.LJIIIIZZ.invalidate();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS177S0200000_29(C91330Zss c91330Zss, EnumC91310ZsY enumC91310ZsY, int i) {
        super(0);
        this.$t = i;
        this.l0 = c91330Zss;
        this.l1 = enumC91310ZsY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS177S0200000_29(C91476ZvE c91476ZvE, EnumC91326Zso enumC91326Zso, int i) {
        super(0);
        this.$t = i;
        this.l0 = c91476ZvE;
        this.l1 = enumC91326Zso;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS177S0200000_29(BasePlayerFragment basePlayerFragment, BasePlayerFragment basePlayerFragment2, C68322mC<C91246ZrW> c68322mC) {
        super(0);
        this.$t = c68322mC;
        this.l0 = basePlayerFragment;
        this.l1 = basePlayerFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS177S0200000_29(TTDspFragmentV2 tTDspFragmentV2, ActivityC45651qj activityC45651qj, int i) {
        super(0);
        this.$t = i;
        this.l0 = tTDspFragmentV2;
        this.l1 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS177S0200000_29(IXTabPanelAbility iXTabPanelAbility, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = iXTabPanelAbility;
        this.l1 = context;
    }
}
