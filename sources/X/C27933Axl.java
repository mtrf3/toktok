package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Axl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27933Axl implements InterfaceC72822Si2 {
    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        if (o.LJ(c199097rd.LJLIL, "music_ttm_attribution_af_info") && (interfaceC78280Uns = c199097rd.LJLILLLLZI) != null && interfaceC78280Uns.hasKey("store")) {
            C27932Axk.LIZJ(interfaceC78280Uns.getString("store"));
        }
    }
}
