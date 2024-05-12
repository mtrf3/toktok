package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Zsz, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91337Zsz implements InterfaceC46853Ia9 {
    public final /* synthetic */ C91061ZoX LJLIL;

    public C91337Zsz(C91061ZoX c91061ZoX) {
        this.LJLIL = c91061ZoX;
    }

    @Override // X.InterfaceC46853Ia9
    public final void onVideoEngineInfos(C47620ImW c47620ImW) {
        if (c47620ImW != null && o.LJ(c47620ImW.LIZ, "mdlhitcachesize")) {
            this.LJLIL.LJFF.LIZ = (int) (c47620ImW.LJ / 1024);
        }
    }
}
