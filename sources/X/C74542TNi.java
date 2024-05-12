package X;

import android.app.Application;
import kotlin.jvm.internal.o;

/* renamed from: X.TNi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74542TNi extends AbstractC65781Prl implements InterfaceC65784Pro<C74549TNp> {
    public static final C74542TNi LJLIL = new C74542TNi();

    public C74542TNi() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C74549TNp invoke() {
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        return new C74549TNp(application, C74541TNh.LJLIL, C74543TNj.LJLIL);
    }
}
