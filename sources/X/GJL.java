package X;

import android.app.Activity;
import android.content.Context;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class GJL extends C41272GHs {
    public final /* synthetic */ Context LIZJ;

    @Override // X.C41272GHs, X.InterfaceC42062Gf4
    public final void onSuccess(String str) {
        super.onSuccess(str);
        C5S1 c5s1 = new C5S1(this.LIZJ);
        c5s1.LIZJ(R.string.rrp);
        c5s1.LJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GJL(Activity activity, Context context) {
        super(activity);
        this.LIZJ = context;
    }
}
