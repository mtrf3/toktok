package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class GJM extends C41273GHt {
    public final /* synthetic */ Activity LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GJM(Activity activity) {
        super(activity);
        this.LIZJ = activity;
    }

    @Override // X.InterfaceC42064Gf6
    public final void LIZ(android.net.Uri uri) {
        DialogC25756A8y dialogC25756A8y = this.LIZIZ;
        if (dialogC25756A8y != null && dialogC25756A8y.isShowing()) {
            dialogC25756A8y.dismiss();
        }
        C5S1 c5s1 = new C5S1(this.LIZJ);
        c5s1.LIZJ(R.string.rrp);
        c5s1.LJ();
    }
}
