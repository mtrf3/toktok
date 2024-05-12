package X;

import android.graphics.Typeface;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public class VP2 implements VEF {
    public final WeakReference<ShadowNode> LIZ;

    public VP2(ShadowNode shadowNode) {
        this.LIZ = new WeakReference<>(shadowNode);
    }

    @Override // X.VEF
    public final void LIZ(Typeface typeface, int i) {
        ShadowNode shadowNode = this.LIZ.get();
        if (shadowNode == null || shadowNode.LJIILJJIL) {
            return;
        }
        shadowNode.LJIIIIZZ();
    }
}
