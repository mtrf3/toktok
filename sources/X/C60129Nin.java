package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import kotlin.jvm.internal.o;

/* renamed from: X.Nin, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60129Nin implements InterfaceC60132Niq {
    public final /* synthetic */ C60126Nik LIZ;

    @Override // X.InterfaceC60132Niq
    public final void LIZ() {
        C60977NwT.LJ("refresh");
        String str = this.LIZ.LJLJI;
        if (o.LJ(str, "not_secure") || o.LJ(str, "protection")) {
            return;
        }
        SparkContext sparkContext = this.LIZ.LJLJJI;
        if (sparkContext != null) {
            WebKitView LJJIJLIJ = C78983UzD.LJJIJLIJ(sparkContext);
            if (LJJIJLIJ != null) {
                LJJIJLIJ.reload();
            }
            C35975E9z.LJ = true;
            C60986Nwc.LIZ = true;
            return;
        }
        o.LJIJI("sparkContext");
        throw null;
    }

    public C60129Nin(C60126Nik c60126Nik) {
        this.LIZ = c60126Nik;
    }
}
