package X;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* renamed from: X.QZr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class CallableC67219QZr implements Callable {
    public final /* synthetic */ FirebaseAnalytics LJLIL;

    public CallableC67219QZr(FirebaseAnalytics firebaseAnalytics) {
        this.LJLIL = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C68074Qne c68074Qne = this.LJLIL.LIZ;
        c68074Qne.getClass();
        BinderC68193QpZ binderC68193QpZ = new BinderC68193QpZ();
        c68074Qne.LIZIZ(new C68160Qp2(c68074Qne, binderC68193QpZ));
        return binderC68193QpZ.LLJJIII(120000L);
    }
}
