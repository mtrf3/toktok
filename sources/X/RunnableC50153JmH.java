package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;

/* renamed from: X.JmH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC50153JmH implements Runnable {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    public RunnableC50153JmH(Context context, String str, long j, String str2) {
        this.LJLIL = context;
        this.LJLILLLLZI = j;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    public final void LIZ() {
        Activity activity;
        C50699Jv5 c50699Jv5;
        Context context = this.LJLIL;
        if (context != null) {
            activity = C45804HyK.LJIJJ(context);
        } else {
            activity = null;
        }
        if (activity instanceof SearchResultActivity) {
            Context context2 = this.LJLIL;
            if (context2 != null) {
                c50699Jv5 = new C50699Jv5(context2);
            } else {
                c50699Jv5 = new C50699Jv5();
            }
        } else {
            c50699Jv5 = new C50699Jv5();
        }
        c50699Jv5.LIZIZ(new C50318Jow(this.LJLILLLLZI, this.LJLJI, this.LJLJJI));
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
}
