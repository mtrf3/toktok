package X;

import android.app.Application;
import com.ss.android.ugc.aweme.property.AVPreferences;
import kotlin.jvm.internal.o;

/* renamed from: X.Gde, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41974Gde extends AbstractC65781Prl implements InterfaceC65784Pro<AVPreferences> {
    public static final C41974Gde LJLIL = new C41974Gde();

    public C41974Gde() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.property.AVPreferences, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final AVPreferences invoke() {
        C44350Has c44350Has = new C44350Has(0);
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        return c44350Has.LIZ(application, AVPreferences.class);
    }
}
