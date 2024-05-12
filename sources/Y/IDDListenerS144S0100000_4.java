package Y;

import X.A7S;
import X.AKH;
import X.ALS;
import X.AQM;
import X.ASQ;
import X.AST;
import X.ASW;
import X.ASX;
import X.ASY;
import X.ATB;
import X.ATN;
import X.AbstractDialogInterfaceC26236ARk;
import X.C116484hg;
import X.C221018lt;
import X.C252109uw;
import X.C25696A6q;
import X.C58655N0h;
import X.C58704N2e;
import X.C73318Sq2;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.M78;
import X.SYL;
import android.content.DialogInterface;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog;
import com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetComponent;
import com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.ui.SearchBarEllipsisAssem;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushOffReasonBottomSheetFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDDListenerS144S0100000_4 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            case 2:
                onDismiss$2(this, dialogInterface);
                return;
            case 3:
                onDismiss$3(this, dialogInterface);
                return;
            case 4:
                onDismiss$4(this, dialogInterface);
                return;
            case 5:
                onDismiss$5(this, dialogInterface);
                return;
            case 6:
                onDismiss$6(this, dialogInterface);
                return;
            case 7:
                onDismiss$7(this, dialogInterface);
                return;
            case 8:
                onDismiss$8(this, dialogInterface);
                return;
            case 9:
                onDismiss$9(this, dialogInterface);
                return;
            case 10:
                onDismiss$10(this, dialogInterface);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onDismiss$11(this, dialogInterface);
                return;
            case 12:
                onDismiss$12(this, dialogInterface);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onDismiss$13(this, dialogInterface);
                return;
            case 14:
                onDismiss$14(this, dialogInterface);
                return;
            case 15:
                onDismiss$15(this, dialogInterface);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onDismiss$16(this, dialogInterface);
                return;
            case 17:
                onDismiss$17(this, dialogInterface);
                return;
            case 18:
                onDismiss$18(this, dialogInterface);
                return;
            case 19:
                onDismiss$19(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDDListenerS144S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
        SearchBarEllipsisAssem searchBarEllipsisAssem = (SearchBarEllipsisAssem) iDDListenerS144S0100000_4.l0;
        searchBarEllipsisAssem.LJLJJI = false;
        SYL syl = searchBarEllipsisAssem.LJLILLLLZI;
        if (syl != null) {
            syl.getState().LJFF();
            ((SearchBarEllipsisAssem) iDDListenerS144S0100000_4.l0).v3(Lifecycle.State.RESUMED);
        } else {
            o.LJIJI("sheetPowerList");
            throw null;
        }
    }

    public static final void onDismiss$1(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
        C116484hg.LIZ("result", "close", "confirm_link_privacy_pop_up");
        ((AKH) iDDListenerS144S0100000_4.l0).LIZ();
    }

    public static final void onDismiss$10(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDDListenerS144S0100000_4.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onDismiss$12(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
        ((C25696A6q) iDDListenerS144S0100000_4.l0).LJIIIZ();
    }

    public static final void onDismiss$13(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
        AbstractDialogInterfaceC26236ARk abstractDialogInterfaceC26236ARk = (AbstractDialogInterfaceC26236ARk) iDDListenerS144S0100000_4.l0;
        DialogInterface.OnDismissListener onDismissListener = abstractDialogInterfaceC26236ARk.LJLJJI;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(abstractDialogInterfaceC26236ARk);
        }
    }

    public static final void onDismiss$14(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
        ((InterfaceC88472Yns) iDDListenerS144S0100000_4.l0).invoke(dialogInterface);
    }

    public static final void onDismiss$15(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDDListenerS144S0100000_4.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onDismiss$16(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
        ((M78) iDDListenerS144S0100000_4.l0).LIZ();
    }

    public static final void onDismiss$17(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
        ((M78) iDDListenerS144S0100000_4.l0).LIZ();
    }

    public static final void onDismiss$18(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
        ((C73318Sq2) iDDListenerS144S0100000_4.l0).dispose();
    }

    public static final void onDismiss$19(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
        ((M78) iDDListenerS144S0100000_4.l0).LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onDismiss$2(Y.IDDListenerS144S0100000_4 r2, android.content.DialogInterface r3) {
        /*
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            X.AST r1 = X.ASQ.LJIIIIZZ(r3)
            X.ASX r0 = X.ASX.LIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L1e
        L12:
            java.lang.String r1 = "Default"
        L14:
            java.lang.Object r0 = r2.l0
            X.A7O r0 = (X.A7O) r0
            if (r0 == 0) goto L1d
            r0.LIZIZ(r1)
        L1d:
            return
        L1e:
            X.ASW r0 = X.ASW.LIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L29
            java.lang.String r1 = "BackPressed"
            goto L14
        L29:
            X.ASY r0 = X.ASY.LIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L34
            java.lang.String r1 = "FromNavBar"
            goto L14
        L34:
            X.ASZ r0 = X.ASZ.LIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L12
            java.lang.String r1 = "Done"
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDDListenerS144S0100000_4.onDismiss$2(Y.IDDListenerS144S0100000_4, android.content.DialogInterface):void");
    }

    public static final void onDismiss$3(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface it) {
        String str;
        o.LJIIIIZZ(it, "it");
        AST LJIIIIZZ = ASQ.LJIIIIZZ(it);
        if (!o.LJ(LJIIIIZZ, ASX.LIZ)) {
            if (o.LJ(LJIIIIZZ, ASW.LIZ)) {
                str = "BackPressed";
            } else if (o.LJ(LJIIIIZZ, ASY.LIZ)) {
                str = "FromNavBar";
            } else if (o.LJ(LJIIIIZZ, AQM.LIZ)) {
                str = "Done";
            }
            ((A7S) iDDListenerS144S0100000_4.l0).LIZIZ(str);
        }
        str = "Default";
        ((A7S) iDDListenerS144S0100000_4.l0).LIZIZ(str);
    }

    public static final void onDismiss$4(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
        ALS als = ((NotificationLiveBottomDialog) iDDListenerS144S0100000_4.l0).LJLL;
        if (als != null) {
            als.LIZ();
        }
        View _$_findCachedViewById = ((NotificationLiveBottomDialog) iDDListenerS144S0100000_4.l0)._$_findCachedViewById(R.id.igd);
        if (_$_findCachedViewById != null && _$_findCachedViewById.getVisibility() == 0) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("homepage_ad", "otherclick", ((NotificationLiveBottomDialog) iDDListenerS144S0100000_4.l0).LJLJLJ);
            LIZLLL.LIZJ("manage_page", "refer");
            LIZLLL.LIZIZ(((NotificationLiveBottomDialog) iDDListenerS144S0100000_4.l0).LJLJL, "enter_from");
            LIZLLL.LIZIZ(2, "notification_choose_type");
            LIZLLL.LJI();
        }
    }

    public static final void onDismiss$5(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
        ((OfflineModeSheetComponent) iDDListenerS144S0100000_4.l0).v3().vv0(false);
        ((OfflineModeSheetComponent) iDDListenerS144S0100000_4.l0).v3().nv0(null);
        ((OfflineModeSheetComponent) iDDListenerS144S0100000_4.l0).LJLILLLLZI = null;
    }

    public static final void onDismiss$6(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
        ((PushOffReasonBottomSheetFragment) iDDListenerS144S0100000_4.l0).xl("close");
    }

    public static final void onDismiss$7(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = ((ATB) iDDListenerS144S0100000_4.l0).LLFFF;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        ATN atn = ((ATB) iDDListenerS144S0100000_4.l0).LLFF;
        if (atn != null) {
            atn.dismissDialog();
        }
    }

    public static final void onDismiss$8(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
        C221018lt.LIZ("ProfileAigcIntroPagePopupTask", "profile aigc intro dialog dismissed");
        ((C252109uw) iDDListenerS144S0100000_4.l0).LJLJI.invoke();
    }

    public static final void onDismiss$9(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
        ((C73318Sq2) iDDListenerS144S0100000_4.l0).dispose();
    }

    public static final void onDismiss$11(IDDListenerS144S0100000_4 iDDListenerS144S0100000_4, DialogInterface dialogInterface) {
    }
}
