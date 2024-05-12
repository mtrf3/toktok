package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import kotlin.jvm.internal.o;

/* renamed from: X.NiX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60113NiX implements InterfaceC60115NiZ {
    public final /* synthetic */ C60116Nia LIZ;

    @Override // X.InterfaceC60115NiZ
    public final void LIZ() {
        String str = this.LIZ.LJLJI;
        if (o.LJ(str, "not_secure") || o.LJ(str, "protection")) {
            return;
        }
        SparkContext sparkContext = this.LIZ.LJLJJI;
        if (sparkContext != null) {
            WebKitView LJJIII = C78939UyV.LJJIII(sparkContext);
            if (LJJIII == null) {
                return;
            }
            LJJIII.reload();
            return;
        }
        o.LJIJI("sparkContext");
        throw null;
    }

    public C60113NiX(C60116Nia c60116Nia) {
        this.LIZ = c60116Nia;
    }
}
