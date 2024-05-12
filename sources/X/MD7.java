package X;

import Y.ARunnableS39S0100000_3;
import Y.ARunnableS45S0100000_9;
import Y.AfS0S0112000_9;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MD7 {
    public static TuxSheet LIZ;
    public static C72433Sbl LIZIZ;
    public static TuxTextView LIZJ;
    public static TuxTextView LIZLLL;
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(MD8.LJLIL);
    public static GroupUnsubscribeSetting LJFF;

    public static void LIZ(String str) {
        GroupUnsubscribeSetting groupUnsubscribeSetting = LJFF;
        if (groupUnsubscribeSetting == null) {
            return;
        }
        FMX.LIZIZ().execute(new ARunnableS45S0100000_9(C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page"), new OSZ("account_type", groupUnsubscribeSetting.accountType), new OSZ("action_type", str)), 133));
    }

    public static void LIZJ(Fragment fragment, GroupUnsubscribeSetting groupUnsubscribeSetting) {
        o.LJIIIZ(fragment, "fragment");
        if (LIZ == null) {
            View inflate = View.inflate(fragment.getContext(), R.layout.u3, null);
            LIZIZ = (C72433Sbl) inflate.findViewById(R.id.ewd);
            LIZJ = (TuxTextView) inflate.findViewById(R.id.lwu);
            LIZLLL = (TuxTextView) inflate.findViewById(R.id.lw7);
            View findViewById = inflate.findViewById(R.id.isf);
            o.LJIIIIZZ(findViewById, "customView.findViewById(R.id.recyclerView)");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            fragment.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setAdapter((AbstractC029409q) LJ.getValue());
            C235119Kp c235119Kp = new C235119Kp();
            C234529Ii LIZJ2 = s1.LIZJ();
            LIZJ2.LIZJ = R.raw.icon_x_mark_small;
            LIZJ2.LIZIZ(new AqS159S0100000_9(inflate, 802));
            c235119Kp.LIZIZ(LIZJ2);
            ASL asl = new ASL();
            asl.LIZ.LJLLI = inflate;
            asl.LJI(1);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLL = c235119Kp;
            tuxSheet.LJLIL = MD6.LJLIL;
            LIZ = tuxSheet;
        }
        LJFF = groupUnsubscribeSetting;
        C72433Sbl c72433Sbl = LIZIZ;
        if (c72433Sbl != null) {
            Activity topActivity = ActivityStack.getTopActivity();
            o.LJIIIIZZ(topActivity, "getTopActivity()");
            if (AnonymousClass636.LJIILJJIL(topActivity)) {
                C78765Uvh.LJFF(c72433Sbl, groupUnsubscribeSetting.imageUrlDark);
            } else {
                C78765Uvh.LJFF(c72433Sbl, groupUnsubscribeSetting.imageUrl);
            }
        }
        TuxTextView tuxTextView = LIZJ;
        if (tuxTextView != null) {
            tuxTextView.setText(groupUnsubscribeSetting.name);
        }
        TuxTextView tuxTextView2 = LIZLLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(groupUnsubscribeSetting.desc);
        }
        MDB mdb = (MDB) LJ.getValue();
        if (mdb != null) {
            mdb.LJLILLLLZI = groupUnsubscribeSetting;
            mdb.LJLJI = groupUnsubscribeSetting.unsubscribeCategoryList;
            mdb.notifyDataSetChanged();
        }
        TuxSheet tuxSheet2 = LIZ;
        if (tuxSheet2 != null) {
            ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
            o.LJII(mo49getActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentManager supportFragmentManager = mo49getActivity.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "fragment.activity as Fra…y).supportFragmentManager");
            tuxSheet2.show(supportFragmentManager, "SNUnsubscribeSheetHelper");
        }
        FMX.LIZIZ().execute(new ARunnableS39S0100000_3(C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page"), new OSZ("account_type", groupUnsubscribeSetting.accountType)), 164));
    }

    public static void LIZIZ(int i, int i2, boolean z, InterfaceC88473Ynt interfaceC88473Ynt, AqS159S0100000_9 aqS159S0100000_9, C73318Sq2 disposables) {
        o.LJIIIZ(disposables, "disposables");
        boolean z2 = !z;
        C78999UzT.LJFF(NotificationApi.LIZ().updateSubscribeSettingsgStatus(i, i2, z2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS0S0112000_9(i, i2, interfaceC88473Ynt, z2, 0), new AfS0S0112000_9(i, i2, aqS159S0100000_9, z2, 1)), disposables);
    }
}
