package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XaU, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85094XaU implements InterfaceC46853Ia9 {
    public final /* synthetic */ C85089XaP LJLIL;

    public C85094XaU(C85089XaP c85089XaP) {
        this.LJLIL = c85089XaP;
    }

    @Override // X.InterfaceC46853Ia9
    public final void onVideoEngineInfos(C47620ImW c47620ImW) {
        if (c47620ImW != null && o.LJ(c47620ImW.LIZ, "mdlhitcachesize")) {
            this.LJLIL.LJFF.LIZ = (int) (c47620ImW.LJ / 1024);
        }
    }
}
