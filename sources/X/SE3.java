package X;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SE3 extends AbstractC024907x<SE5> {
    public final /* synthetic */ C71739SDn LIZ;

    public SE3(C71739SDn c71739SDn) {
        this.LIZ = c71739SDn;
    }

    @Override // X.AbstractC024907x
    public final void LIZ(SE5 se5) {
        if (se5 != null) {
            C71739SDn c71739SDn = this.LIZ;
            c71739SDn.getClass();
            C68249QqT c68249QqT = c71739SDn.LJLJL;
            if (c68249QqT != null) {
                for (SDK sdk : (List) c68249QqT.LIZ) {
                    View view = se5.LJLJJI;
                    o.LJIIIIZZ(view, "binding.root");
                    sdk.LIZLLL(view);
                }
            }
        }
    }
}
