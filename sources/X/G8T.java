package X;

import Y.IDCListenerS160S0100000_7;
import android.app.Activity;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class G8T {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Activity activity, InterfaceC65784Pro interfaceC65784Pro) {
        if (activity.isFinishing()) {
            interfaceC65784Pro.invoke();
            return;
        }
        C62905OmT c62905OmT = new C62905OmT(activity);
        c62905OmT.LIZ(R.string.fjt);
        c62905OmT.LJII(R.string.fjm, null);
        c62905OmT.LJIIJ(R.string.fjs, new IDCListenerS160S0100000_7(interfaceC65784Pro, 12));
        new C62906OmU(c62905OmT).LIZLLL();
    }
}
