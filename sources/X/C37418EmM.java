package X;

import com.bytedance.pia.core.PiaManifest;
import com.bytedance.pia.core.plugins.BridgeDowngradePlugin;
import com.bytedance.pia.core.plugins.BridgePlugin;
import com.bytedance.pia.core.plugins.NsrPlugin;
import com.bytedance.pia.core.plugins.PrefetchPlugin;
import com.bytedance.pia.core.plugins.SnapshotPlugin;
import com.bytedance.pia.core.setting.Settings;

/* renamed from: X.EmM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37418EmM extends C37420EmO {
    @Override // X.C37420EmO
    public final void LIZ(C37499Enf c37499Enf) {
        PiaManifest LIZ;
        super.LIZ(c37499Enf);
        C37477EnJ c37477EnJ = c37499Enf.LJII;
        EnumC37419EmN enumC37419EmN = EnumC37419EmN.NSR_ENABLED;
        c37477EnJ.LIZJ(enumC37419EmN, 0);
        C37477EnJ c37477EnJ2 = c37499Enf.LJII;
        EnumC37419EmN enumC37419EmN2 = EnumC37419EmN.SNAPSHOT_ENABLED;
        c37477EnJ2.LIZJ(enumC37419EmN2, 0);
        C37477EnJ c37477EnJ3 = c37499Enf.LJII;
        EnumC37419EmN enumC37419EmN3 = EnumC37419EmN.PREFETCH_ENABLED;
        c37477EnJ3.LIZJ(enumC37419EmN3, 0);
        if (!c37499Enf.LJ.getBooleanQueryParameter("__pia_manifest__", false) || (LIZ = C37422EmQ.LIZ(c37499Enf, c37499Enf.LJ.toString())) == null) {
            return;
        }
        android.net.Uri uri = LIZ.LIZJ;
        if (!Settings.LIZ().LIZIZ(uri)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[CompatPluginRegistry]: register failed, public path not support. Public path = ");
            LIZ2.append(uri);
            C37238EjS.LJIIIIZZ(6, X1D.LIZIZ(LIZ2), null);
            return;
        }
        c37499Enf.LJIIIIZZ(BridgePlugin.class, null);
        c37499Enf.LJIIIIZZ(BridgeDowngradePlugin.class, LIZ);
        if (LIZ.LJFF && Settings.LIZ().isNsrV1Enabled) {
            c37499Enf.LJIIIIZZ(NsrPlugin.class, LIZ);
            c37499Enf.LJII.LIZJ(enumC37419EmN, 1);
        }
        if (LIZ.LJ && Settings.LIZ().isSnapshotV1Enabled) {
            c37499Enf.LJIIIIZZ(SnapshotPlugin.class, LIZ);
            c37499Enf.LJII.LIZJ(enumC37419EmN2, 1);
        }
        if (LIZ.LIZLLL && Settings.LIZ().isPrefetchV1Enabled) {
            c37499Enf.LJIIIIZZ(PrefetchPlugin.class, LIZ);
            c37499Enf.LJII.LIZJ(enumC37419EmN3, 1);
        }
        C37238EjS.LJIIIIZZ(6, "[CompatPluginRegistry]: register success.", null);
    }
}
