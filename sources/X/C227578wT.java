package X;

import android.app.Application;
import android.widget.Space;
import kotlin.jvm.internal.o;

/* renamed from: X.8wT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227578wT extends AbstractC65781Prl implements InterfaceC65784Pro<Space> {
    public static final C227578wT LJLIL = new C227578wT();

    public C227578wT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Space invoke() {
        Application application = C227568wS.LIZIZ;
        if (application != null) {
            return new Space(application);
        }
        o.LJIJI("app");
        throw null;
    }
}
