package X;

import Y.AObjectS42S0101000_5;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* renamed from: X.XoR, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableC85959XoR implements Runnable {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ ALY LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Runnable LJLJJLL = null;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ InterfaceC85967XoZ LJLJLJ;
    public final /* synthetic */ ALS LJLJLLL;

    public final void LIZ() {
        String LIZ;
        C26231ARf LJI;
        AlertDialog alertDialog;
        final ActivityC45651qj activityC45651qj = this.LJLIL;
        final boolean z = this.LJLILLLLZI;
        final ALY aly = this.LJLJI;
        final boolean z2 = this.LJLJJI;
        final String str = this.LJLJJL;
        final Runnable runnable = this.LJLJJLL;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.XoT
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC45651qj activityC45651qj2 = ActivityC45651qj.this;
                boolean z3 = z;
                ALY aly2 = aly;
                boolean z4 = z2;
                String str2 = str;
                Runnable runnable2 = runnable;
                try {
                    C40322Fs6.LJ(activityC45651qj2);
                } catch (Exception unused) {
                    C16880lQ.LIZLLL(activityC45651qj2, new Intent("android.settings.SETTINGS"));
                }
                if (z3) {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", "notification_setting_page");
                    FMX.LJIIL("notification_setting_alert_click", c188727au.LIZ);
                } else if (aly2 != null) {
                    C188727au c188727au2 = new C188727au();
                    c188727au2.LJIIIZ("enter_from", aly2.LIZJ);
                    c188727au2.LJIIIZ("enter_method", aly2.LIZLLL);
                    c188727au2.LJIIIZ("room_id", aly2.LIZ);
                    c188727au2.LJIIIZ("anchor_id", aly2.LIZIZ);
                    c188727au2.LJIIIZ("enter_reason", "general");
                    FMX.LJIIL("push_pre_permission_auth", c188727au2.LIZ);
                } else if (z4) {
                    C188727au c188727au3 = new C188727au();
                    c188727au3.LJIIIZ("enter_from", str2);
                    c188727au3.LJIIIZ("enter_method", "notification_bell");
                    c188727au3.LJIIIZ("enter_reason", "general");
                    FMX.LJIIL("push_pre_permission_auth", c188727au3.LIZ);
                } else {
                    FMX.LJIIL("push_pre_permission_auth", new C188727au().LIZ);
                }
                SharedPreferences LIZIZ = F9J.LIZIZ(activityC45651qj2, 0, "NotificationGuide");
                SharedPreferences.Editor edit = LIZIZ.edit();
                edit.putInt("guide_show_times", LIZIZ.getInt("guide_show_times", 0) + 1);
                edit.putLong("guide_last_time", System.currentTimeMillis());
                edit.apply();
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: X.XoV
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                boolean z3 = z;
                ALY aly2 = aly;
                boolean z4 = z2;
                String str2 = str;
                ActivityC45651qj activityC45651qj2 = activityC45651qj;
                Runnable runnable2 = runnable;
                dialogInterface.dismiss();
                if (z3) {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", "notification_setting_page");
                    FMX.LJIIL("notification_setting_alert_close", c188727au.LIZ);
                } else if (aly2 != null) {
                    C188727au c188727au2 = new C188727au();
                    c188727au2.LJIIIZ("enter_from", aly2.LIZJ);
                    c188727au2.LJIIIZ("enter_method", aly2.LIZLLL);
                    c188727au2.LJIIIZ("room_id", aly2.LIZ);
                    c188727au2.LJIIIZ("anchor_id", aly2.LIZIZ);
                    c188727au2.LJIIIZ("enter_reason", "general");
                    FMX.LJIIL("push_pre_permission_deny", c188727au2.LIZ);
                } else if (z4) {
                    C188727au c188727au3 = new C188727au();
                    c188727au3.LJIIIZ("enter_from", str2);
                    c188727au3.LJIIIZ("enter_method", "notification_bell");
                    c188727au3.LJIIIZ("enter_reason", "general");
                    FMX.LJIIL("push_pre_permission_deny", c188727au3.LIZ);
                } else {
                    FMX.LJIIL("push_pre_permission_deny", new C188727au().LIZ);
                }
                SharedPreferences LIZIZ = F9J.LIZIZ(activityC45651qj2, 0, "NotificationGuide");
                SharedPreferences.Editor edit = LIZIZ.edit();
                edit.putInt("guide_show_times", LIZIZ.getInt("guide_show_times", 0) + 1);
                edit.putLong("guide_last_time", System.currentTimeMillis());
                edit.apply();
                if (runnable2 != null) {
                    runnable2.run();
                }
                C2U8.LIZ(new C2KZ());
            }
        };
        if (this.LJLJL) {
            alertDialog = new AlertDialog.Builder(this.LJLIL).setTitle(R.string.r16).setMessage(R.string.r19).setPositiveButton(R.string.r18, onClickListener).setNegativeButton(R.string.r17, onClickListener2).create();
            alertDialog.setOnShowListener(new DialogInterfaceOnShowListenerC85965XoX());
            alertDialog.setCanceledOnTouchOutside(false);
            LJI = null;
        } else {
            C26227ARb c26227ARb = new C26227ARb(activityC45651qj);
            c26227ARb.LJIIIZ = new C73310Spu(R.drawable.a9p, 0, this.LJLIL);
            ActivityC45651qj activityC45651qj2 = this.LJLIL;
            String LIZ2 = SharePrefCache.inst().getRequestNotificationTitle().LIZ();
            if (TextUtils.isEmpty(LIZ2)) {
                LIZ2 = activityC45651qj2.getString(R.string.sdw);
            }
            c26227ARb.LJFF(LIZ2);
            ActivityC45651qj activityC45651qj3 = this.LJLIL;
            if (this.LJLILLLLZI) {
                LIZ = activityC45651qj3.getString(R.string.egr);
            } else {
                LIZ = SharePrefCache.inst().getRequestNotificationText().LIZ();
                if (TextUtils.isEmpty(LIZ)) {
                    LIZ = activityC45651qj3.getString(R.string.egq);
                }
            }
            c26227ARb.LIZIZ(LIZ);
            ARI ari = new ARI(this.LJLIL);
            ari.LJI(R.string.ce_, new AObjectS42S0101000_5(5, onClickListener, 32));
            ari.LJIIIIZZ(R.string.hq_, new AObjectS42S0101000_5(2, onClickListener2, 5));
            c26227ARb.LJIIL = ari;
            c26227ARb.LJII = false;
            final InterfaceC85967XoZ interfaceC85967XoZ = this.LJLJLJ;
            final ALS als = this.LJLJLLL;
            c26227ARb.LIZLLL = new DialogInterface.OnDismissListener() { // from class: X.XoW
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    InterfaceC85967XoZ interfaceC85967XoZ2 = InterfaceC85967XoZ.this;
                    ALS als2 = als;
                    WeakReference<C26231ARf> weakReference = C85962XoU.LIZ;
                    if (weakReference != null) {
                        weakReference.clear();
                    }
                    if (interfaceC85967XoZ2 != null) {
                        interfaceC85967XoZ2.onCancel();
                    }
                    if (als2 != null) {
                        als2.LIZ();
                    }
                }
            };
            LJI = c26227ARb.LJI();
            C85962XoU.LIZ = new WeakReference<>(LJI);
            alertDialog = null;
        }
        if (activityC45651qj.isFinishing()) {
            return;
        }
        try {
            PopupManager.LJIIL(new C85960XoS(this.LJLIL, this.LJLJL, alertDialog, LJI, new C85966XoY(this)));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC85959XoR(ActivityC45651qj activityC45651qj, boolean z, ALY aly, boolean z2, String str, boolean z3, InterfaceC85967XoZ interfaceC85967XoZ, ALS als) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = z;
        this.LJLJI = aly;
        this.LJLJJI = z2;
        this.LJLJJL = str;
        this.LJLJL = z3;
        this.LJLJLJ = interfaceC85967XoZ;
        this.LJLJLLL = als;
    }
}
