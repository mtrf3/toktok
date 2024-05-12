package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.P2f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63801P2f<T> implements InterfaceC64592gB {
    public final /* synthetic */ boolean LJLIL;

    public C63801P2f(boolean z) {
        this.LJLIL = z;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Activity LIZIZ;
        List list = (List) obj;
        if (this.LJLIL && list.contains(2) && (LIZIZ = FKM.LIZIZ()) != null) {
            AnonymousClass114.LIZ(LIZIZ, R.string.sec);
        }
        new C243529h6("login_onboarding", "login", true, "facebook").LIZLLL(null);
    }
}
