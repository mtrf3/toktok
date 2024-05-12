package X;

import com.ss.android.ugc.aweme.legoImpl.task.dynamic_feature_plugin.AbstractPluginInitTask;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E6V implements QJ8 {
    public final /* synthetic */ AbstractPluginInitTask LJLIL;

    public E6V(AbstractPluginInitTask abstractPluginInitTask) {
        this.LJLIL = abstractPluginInitTask;
    }

    @Override // X.QJ8
    public final void LIZ(boolean z) {
        this.LJLIL.LJ(z);
    }

    @Override // X.QJ8
    public final void LIZIZ(String did, String iid) {
        o.LJIIIZ(did, "did");
        o.LJIIIZ(iid, "iid");
        this.LJLIL.LJ(true);
    }

    @Override // X.QJ8
    public final void LIZJ(boolean z, boolean z2) {
        this.LJLIL.LJ(z);
    }
}
