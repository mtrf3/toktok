package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.FdL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39407FdL implements InterfaceC39411FdP {
    public final /* synthetic */ Locale LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.InterfaceC39411FdP
    public final void LIZ(int i) {
        if (i == 1) {
            String localeString = C39406FdK.LJ(this.LIZ);
            String releaseBuild = this.LIZIZ;
            o.LJIIIZ(localeString, "localeString");
            o.LJIIIZ(releaseBuild, "releaseBuild");
            C39408FdM.LIZ.storeString(localeString, releaseBuild);
        }
    }

    public C39407FdL(String str, Locale locale) {
        this.LIZ = locale;
        this.LIZIZ = str;
    }
}
