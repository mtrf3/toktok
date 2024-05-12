package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.9Kc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C234989Kc extends F9E implements C33Q {
    public final AbstractC72932td<User> LJLIL;
    public final EnumC235129Kq LJLILLLLZI;

    public C234989Kc() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public /* synthetic */ C234989Kc(int i) {
        this(C33X.LIZ, EnumC235129Kq.NORMAL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C234989Kc(AbstractC72932td<? extends User> request, EnumC235129Kq action) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(action, "action");
        this.LJLIL = request;
        this.LJLILLLLZI = action;
    }
}
