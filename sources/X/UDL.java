package X;

import Y.IDCListenerS53S0200000_13;
import Y.IDCListenerS80S0000000_13;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public abstract class UDL implements InterfaceC77281UUr {
    public abstract String LIZJ(Activity activity, String... strArr);

    public abstract String LIZLLL(Activity activity, String... strArr);

    public abstract String LJ(Activity activity);

    public void LJFF() {
    }

    public void LJI() {
    }

    public String LIZIZ(Activity activity) {
        return activity.getString(R.string.snz);
    }

    @Override // X.InterfaceC77281UUr
    public final void LIZ(Activity activity, final UDJ udj, String[] strArr) {
        C77437UaH c77437UaH = new C77437UaH(activity);
        c77437UaH.LIZJ = LIZLLL(activity, strArr);
        c77437UaH.LJI = LIZJ(activity, strArr);
        c77437UaH.LJFF(new IDCListenerS53S0200000_13(this, udj, 7), LJ(activity), false);
        c77437UaH.LIZLLL(new IDCListenerS80S0000000_13(2), LIZIZ(activity), false);
        c77437UaH.LJJIIZ = new DialogInterface.OnKeyListener() { // from class: X.UDM
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i == 4) {
                    if (keyEvent.getAction() != 1) {
                        return true;
                    }
                    dialogInterface.cancel();
                    return true;
                }
                return false;
            }
        };
        c77437UaH.LJJII = false;
        c77437UaH.LJJIIZI = new DialogInterface.OnCancelListener() { // from class: X.UDK
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                UDL udl = UDL.this;
                UDJ udj2 = udj;
                udl.getClass();
                udj2.cancel();
                udl.LJFF();
            }
        };
        DialogC77438UaI LIZ = c77437UaH.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-4549890139849735752")).LIZ) {
            return;
        }
        LIZ.show();
    }
}
