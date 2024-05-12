package X;

import Y.AObserverS77S0100000_9;
import Y.IDDListenerS103S0200000_9;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.notification.bean.NotificationSubscribeSettingsList;
import com.ss.android.ugc.aweme.notification.bean.UnSubscribeSettingsData;
import com.ss.android.ugc.aweme.notification.vh.SubscribeSettingsCell;
import com.ss.android.ugc.aweme.notification.vm.SubscribeSettingVM;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MbC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57110MbC {
    public final Fragment LIZ;
    public final int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public TuxSheet LJ;
    public final C5H3 LJFF;
    public NotificationSubscribeSettingsList LJI;

    public final void LIZIZ() {
        NotificationSubscribeSettingsList notificationSubscribeSettingsList = this.LJI;
        if (notificationSubscribeSettingsList != null) {
            TuxSheet tuxSheet = this.LJ;
            if (tuxSheet == null) {
                View inflate = View.inflate(this.LIZ.getContext(), R.layout.sq, null);
                SYL syl = (SYL) inflate.findViewById(R.id.kq5);
                syl.LLLF.LJZL(SubscribeSettingsCell.class);
                ArrayList arrayList = new ArrayList();
                List<UnSubscribeSettingsData> list = notificationSubscribeSettingsList.unSubscribeSettingList;
                if (list != null) {
                    for (UnSubscribeSettingsData unSubscribeSettingsData : list) {
                        arrayList.add(new C57113MbF(unSubscribeSettingsData.labelTitle, unSubscribeSettingsData.subscribePrompt, unSubscribeSettingsData.group, Boolean.valueOf(unSubscribeSettingsData.isUnsubscribe), unSubscribeSettingsData.unsubscribePrompt, unSubscribeSettingsData.label));
                    }
                }
                if (!arrayList.isEmpty()) {
                    syl.getState().LJFF();
                    syl.getState().LJ(arrayList);
                    C235119Kp c235119Kp = new C235119Kp();
                    c235119Kp.LIZLLL = true;
                    C9KF c9kf = new C9KF();
                    String string = this.LIZ.getString(R.string.hca);
                    o.LJIIIIZZ(string, "context.getString(R.stri…fication_setting_heading)");
                    c9kf.LIZJ = string;
                    c235119Kp.LIZJ = c9kf;
                    C234529Ii LIZJ = s1.LIZJ();
                    LIZJ.LIZJ = R.raw.icon_x_mark_small;
                    LIZJ.LIZIZ(new AqS156S0200000_9(this, inflate, 68));
                    c235119Kp.LIZIZ(LIZJ);
                    ASL asl = new ASL();
                    asl.LIZ.LJLLI = inflate;
                    asl.LJI(1);
                    TuxSheet tuxSheet2 = asl.LIZ;
                    tuxSheet2.LJLLL = c235119Kp;
                    tuxSheet2.LJLILLLLZI = new IDDListenerS103S0200000_9(this, notificationSubscribeSettingsList, 3);
                    this.LJ = tuxSheet2;
                }
                tuxSheet = this.LJ;
                if (tuxSheet == null) {
                    return;
                }
            }
            this.LIZJ = false;
            ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
            o.LJII(mo49getActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentManager supportFragmentManager = mo49getActivity.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "context.activity as Frag…y).supportFragmentManager");
            tuxSheet.show(supportFragmentManager, "notification_subscribe_settings");
            LIZ("show_inbox_notification_setting", this.LIZIZ, "", this.LJI);
            return;
        }
        this.LIZLLL = true;
        ((SubscribeSettingVM) this.LJFF.getValue()).gv0(this.LIZIZ);
    }

    public C57110MbC(int i, Fragment context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = i;
        C5H3 LJZI = V1B.LJZI(new AqS159S0100000_9(this, 803));
        this.LJFF = LJZI;
        ((SubscribeSettingVM) LJZI.getValue()).LJLILLLLZI.observe(context, new AObserverS77S0100000_9(this, 64));
    }

    public static void LIZ(String str, int i, String str2, NotificationSubscribeSettingsList notificationSubscribeSettingsList) {
        String str3;
        List<UnSubscribeSettingsData> list;
        String str4;
        if (i != 81) {
            if (i != 82) {
                str3 = "other";
            } else {
                str3 = "business_account";
            }
        } else {
            str3 = "promote_assistant";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJI("channel_type", str3);
        c188727au.LIZLLL(i, "notice_group");
        if (!TextUtils.isEmpty(str2)) {
            c188727au.LJI("action_type", str2);
        }
        if (notificationSubscribeSettingsList != null && (list = notificationSubscribeSettingsList.unSubscribeSettingList) != null) {
            for (UnSubscribeSettingsData unSubscribeSettingsData : list) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setting_type_label_");
                LIZ.append(unSubscribeSettingsData.label);
                String LIZIZ = X1D.LIZIZ(LIZ);
                if (unSubscribeSettingsData.isUnsubscribe) {
                    str4 = "unsubscribed";
                } else {
                    str4 = "subscribed";
                }
                c188727au.LJI(LIZIZ, str4);
            }
        }
        FMX.LJIIL(str, c188727au.LIZ);
    }
}
