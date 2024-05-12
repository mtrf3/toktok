package X;

import com.bytedance.pia.core.plugins.BootPlugin;
import com.bytedance.pia.core.plugins.BridgePlugin;
import com.bytedance.pia.core.plugins.HtmlPlugin;
import com.bytedance.pia.core.plugins.ManifestPlugin;
import com.bytedance.pia.core.plugins.PiaPropsPlugin;
import com.bytedance.pia.core.plugins.StreamingPlugin;

/* renamed from: X.EmT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37425EmT extends C37420EmO {
    @Override // X.C37420EmO
    public final void LIZ(C37499Enf c37499Enf) {
        super.LIZ(c37499Enf);
        if (c37499Enf.LJIIIZ()) {
            c37499Enf.LJIIIIZZ(BridgePlugin.class, null);
            c37499Enf.LJIIIIZZ(PiaPropsPlugin.class, null);
            if (c37499Enf.LIZJ.LIZJ()) {
                c37499Enf.LJIIIIZZ(StreamingPlugin.class, null);
            } else {
                c37499Enf.LJIIIIZZ(HtmlPlugin.class, null);
                c37499Enf.LJIIIIZZ(BootPlugin.class, null);
            }
            c37499Enf.LJIIIIZZ(ManifestPlugin.class, null);
        }
    }
}
