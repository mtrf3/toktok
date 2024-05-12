package Y;

import X.ASQ;
import X.ActivityC45651qj;
import X.C145075mh;
import X.C178596zf;
import X.C2U8;
import X.C55274Lmg;
import X.C57110MbC;
import X.C57111MbD;
import X.C57183McN;
import X.C8RO;
import X.M78;
import X.MCX;
import X.MS0;
import X.MS3;
import X.ViewOnClickListenerC57173McD;
import X.X1D;
import X.Z9N;
import android.content.DialogInterface;
import android.view.View;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notification.bean.NotificationSubscribeSettingsList;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.trending.ui.detailpage.BottomBarAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDDListenerS103S0200000_9 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return;
        }
    }

    public static final void onDismiss$0(IDDListenerS103S0200000_9 iDDListenerS103S0200000_9, DialogInterface dialogInterface) {
        ((BottomBarAssem) iDDListenerS103S0200000_9.l0).A3().LJL();
        ((View) iDDListenerS103S0200000_9.l1).setEnabled(true);
    }

    public static final void onDismiss$1(IDDListenerS103S0200000_9 iDDListenerS103S0200000_9, DialogInterface dialogInterface) {
        ((M78) iDDListenerS103S0200000_9.l0).LIZ();
        MCX mcx = (MCX) iDDListenerS103S0200000_9.l1;
        C145075mh.LIZ(mcx.LJLILLLLZI, mcx.LJLJI, mcx.LJLJJI, mcx.LJLJJL, "cancel");
    }

    public static final void onDismiss$2(IDDListenerS103S0200000_9 iDDListenerS103S0200000_9, DialogInterface it) {
        String str;
        String str2;
        ViewOnClickListenerC57173McD viewOnClickListenerC57173McD = ((MS0) iDDListenerS103S0200000_9.l0).LJLILLLLZI;
        o.LJIIIIZZ(it, "it");
        viewOnClickListenerC57173McD.getClass();
        viewOnClickListenerC57173McD.LJLLL = false;
        if (viewOnClickListenerC57173McD.LJLLLLLL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (o.LJ(ASQ.LJIIIIZZ(it), C57183McN.LIZ)) {
            str2 = "confirm";
        } else {
            str2 = "cancel";
        }
        ViewOnClickListenerC57173McD.LJFF(viewOnClickListenerC57173McD, "click_push_permission_pop_up", str, str2, null, 8);
        viewOnClickListenerC57173McD.LJZI = false;
        ((M78) iDDListenerS103S0200000_9.l1).LIZ();
        MS3 ms3 = ((MS0) iDDListenerS103S0200000_9.l0).LJLJI;
        if (ms3 != null) {
            ms3.invoke();
        }
    }

    public static final void onDismiss$3(IDDListenerS103S0200000_9 iDDListenerS103S0200000_9, DialogInterface dialogInterface) {
        String str;
        C57110MbC c57110MbC = (C57110MbC) iDDListenerS103S0200000_9.l0;
        int i = c57110MbC.LIZIZ;
        if (c57110MbC.LIZJ) {
            str = "button";
        } else {
            str = "other";
        }
        C57110MbC.LIZ("close_inbox_notification_setting", i, str, (NotificationSubscribeSettingsList) iDDListenerS103S0200000_9.l1);
    }

    public static final void onDismiss$4(IDDListenerS103S0200000_9 iDDListenerS103S0200000_9, DialogInterface dialogInterface) {
        String str;
        C57111MbD c57111MbD = (C57111MbD) iDDListenerS103S0200000_9.l0;
        int i = c57111MbD.LIZIZ;
        if (c57111MbD.LIZJ) {
            str = "button";
        } else {
            str = "other";
        }
        C57111MbD.LIZ("close_inbox_notification_setting", i, str, (NotificationSubscribeSettingsList) iDDListenerS103S0200000_9.l1);
    }

    public static final void onDismiss$5(IDDListenerS103S0200000_9 iDDListenerS103S0200000_9, DialogInterface dialogInterface) {
        DetailPageComponent detailPageComponent = (DetailPageComponent) iDDListenerS103S0200000_9.l0;
        ActivityC45651qj activity = detailPageComponent.getActivity();
        if (activity == null) {
            detailPageComponent.LLIFFJFJJ.LJIIL("[exitFullScreenCleanMode] activity null");
        } else {
            View view = detailPageComponent.LJLLI;
            if (view != null) {
                C178596zf.LIZ(view.getAlpha(), 1.0f, view);
            }
            Z9N.LIZIZ.LLJLLL(detailPageComponent.getFragment(), false);
            C2U8.LIZ(new C55274Lmg(false, 2, 1, activity.hashCode()));
            C8RO c8ro = detailPageComponent.LLIFFJFJJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[exitFullScreenCleanMode] ");
            LIZ.append(true);
            c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
        }
        ShareExtServiceImpl.LJJLIIJ().LJIIJ((Aweme) iDDListenerS103S0200000_9.l1);
        ((DetailPageComponent) iDDListenerS103S0200000_9.l0).getClass();
    }

    public IDDListenerS103S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
