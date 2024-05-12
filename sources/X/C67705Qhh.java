package X;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Qhh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67705Qhh extends AbstractC67715Qhr {
    @Override // X.AbstractC67686QhO
    public final /* bridge */ /* synthetic */ List LIZ(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.LJJJJL();
    }

    @Override // X.AbstractC67715Qhr
    public final /* synthetic */ InterfaceC67836Qjo LIZIZ(Context context, Looper looper, C67736QiC c67736QiC, Object obj, InterfaceC67706Qhi interfaceC67706Qhi, InterfaceC67707Qhj interfaceC67707Qhj) {
        return new C67704Qhg(context, looper, c67736QiC, (GoogleSignInOptions) obj, interfaceC67706Qhi, interfaceC67707Qhj);
    }
}
