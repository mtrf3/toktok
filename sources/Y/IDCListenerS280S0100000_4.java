package Y;

import X.ALS;
import X.AbstractDialogInterfaceC26236ARk;
import X.C26244ARs;
import X.C3C5;
import X.C58655N0h;
import X.C58704N2e;
import X.C73040SlY;
import X.C76800UCe;
import X.C86184Xs4;
import X.DialogC26282ATe;
import X.EnumC26324AUu;
import X.InterfaceC65784Pro;
import X.SYL;
import X.XJL;
import android.content.DialogInterface;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.prompt.panel.PromptCheckerFragment;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog;
import com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.ui.SearchBarEllipsisAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDCListenerS280S0100000_4 implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                return;
            case 1:
                onCancel$1(this, dialogInterface);
                return;
            case 2:
                onCancel$2(this, dialogInterface);
                return;
            case 3:
                onCancel$3(this, dialogInterface);
                return;
            case 4:
                onCancel$4(this, dialogInterface);
                return;
            case 5:
                onCancel$5(this, dialogInterface);
                return;
            case 6:
                onCancel$6(this, dialogInterface);
                return;
            case 7:
                onCancel$7(this, dialogInterface);
                return;
            case 8:
                onCancel$8(this, dialogInterface);
                return;
            case 9:
                onCancel$9(this, dialogInterface);
                return;
            case 10:
                onCancel$10(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDCListenerS280S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(IDCListenerS280S0100000_4 iDCListenerS280S0100000_4, DialogInterface dialogInterface) {
        SearchBarEllipsisAssem searchBarEllipsisAssem = (SearchBarEllipsisAssem) iDCListenerS280S0100000_4.l0;
        searchBarEllipsisAssem.LJLJJI = false;
        SYL syl = searchBarEllipsisAssem.LJLILLLLZI;
        if (syl != null) {
            syl.getState().LJFF();
            ((SearchBarEllipsisAssem) iDCListenerS280S0100000_4.l0).v3(Lifecycle.State.RESUMED);
        } else {
            o.LJIJI("sheetPowerList");
            throw null;
        }
    }

    public static final void onCancel$1(IDCListenerS280S0100000_4 iDCListenerS280S0100000_4, DialogInterface dialogInterface) {
        XJL xjl = (XJL) iDCListenerS280S0100000_4.l0;
        C3C5.m7constructorimpl(3);
        xjl.resumeWith(3);
    }

    public static final void onCancel$10(IDCListenerS280S0100000_4 iDCListenerS280S0100000_4, DialogInterface dialogInterface) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDCListenerS280S0100000_4.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onCancel$2(IDCListenerS280S0100000_4 iDCListenerS280S0100000_4, DialogInterface dialogInterface) {
        PromptCheckerFragment promptCheckerFragment = (PromptCheckerFragment) iDCListenerS280S0100000_4.l0;
        if (!promptCheckerFragment.LJLJLLL) {
            return;
        }
        String str = promptCheckerFragment.LJLIL;
        String str2 = promptCheckerFragment.LJLJJLL;
        if (str2 == null) {
            str2 = "panel";
        }
        C26244ARs.LIZJ(str, "click_blank", str2);
    }

    public static final void onCancel$3(IDCListenerS280S0100000_4 iDCListenerS280S0100000_4, DialogInterface dialogInterface) {
        ALS als = ((NotificationLiveBottomDialog) iDCListenerS280S0100000_4.l0).LJLL;
        if (als != null) {
            als.LIZ();
        }
        View _$_findCachedViewById = ((NotificationLiveBottomDialog) iDCListenerS280S0100000_4.l0)._$_findCachedViewById(R.id.igd);
        if (_$_findCachedViewById != null && _$_findCachedViewById.getVisibility() == 0) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("homepage_ad", "otherclick", ((NotificationLiveBottomDialog) iDCListenerS280S0100000_4.l0).LJLJLJ);
            LIZLLL.LIZJ("manage_page", "refer");
            LIZLLL.LIZIZ(((NotificationLiveBottomDialog) iDCListenerS280S0100000_4.l0).LJLJL, "enter_from");
            LIZLLL.LIZIZ(2, "notification_choose_type");
            LIZLLL.LJI();
        }
    }

    public static final void onCancel$4(IDCListenerS280S0100000_4 iDCListenerS280S0100000_4, DialogInterface dialogInterface) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((DialogC26282ATe) iDCListenerS280S0100000_4.l0).LJLLILLLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onCancel$5(IDCListenerS280S0100000_4 iDCListenerS280S0100000_4, DialogInterface dialogInterface) {
        AbstractDialogInterfaceC26236ARk abstractDialogInterfaceC26236ARk = (AbstractDialogInterfaceC26236ARk) iDCListenerS280S0100000_4.l0;
        DialogInterface.OnCancelListener onCancelListener = abstractDialogInterfaceC26236ARk.LJLJJL;
        if (onCancelListener != null) {
            onCancelListener.onCancel(abstractDialogInterfaceC26236ARk);
        }
    }

    public static final void onCancel$6(IDCListenerS280S0100000_4 iDCListenerS280S0100000_4, DialogInterface dialogInterface) {
        C73040SlY.LJII(((C86184Xs4) iDCListenerS280S0100000_4.l0).LIZJ, "live_image_popup", "cancel");
    }

    public static final void onCancel$7(IDCListenerS280S0100000_4 iDCListenerS280S0100000_4, DialogInterface dialogInterface) {
        C86184Xs4 c86184Xs4 = (C86184Xs4) iDCListenerS280S0100000_4.l0;
        if (c86184Xs4.LIZJ()) {
            return;
        }
        C73040SlY.LJII(c86184Xs4.LIZJ, "live_image_popup", "cancel");
    }

    public static final void onCancel$8(IDCListenerS280S0100000_4 iDCListenerS280S0100000_4, DialogInterface dialogInterface) {
        C86184Xs4 c86184Xs4 = (C86184Xs4) iDCListenerS280S0100000_4.l0;
        c86184Xs4.LJIIL.LIZIZ(EnumC26324AUu.CANCEL, c86184Xs4.LIZJ);
    }

    public static final void onCancel$9(IDCListenerS280S0100000_4 iDCListenerS280S0100000_4, DialogInterface dialogInterface) {
        ((RssIntroAssem) iDCListenerS280S0100000_4.l0).x3();
    }
}
