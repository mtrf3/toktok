package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import org.json.JSONObject;

/* renamed from: X.Tn7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75685Tn7 implements InterfaceC75706TnS<OLV> {
    public final /* synthetic */ LinkCrossRoomDataHolder LJLIL;

    public C75685Tn7(LinkCrossRoomDataHolder linkCrossRoomDataHolder) {
        this.LJLIL = linkCrossRoomDataHolder;
    }

    @Override // X.InterfaceC75706TnS
    public final void LJFF(OFV ofv) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("auto match invite result -->");
        LIZ.append(ofv);
        C0NB.LJIIIZ("QuickPairManager", X1D.LIZIZ(LIZ));
        RandomLinkMicManager randomLinkMicManager = RandomLinkMicManager.LJLIL;
        EnumC75692TnE enumC75692TnE = EnumC75692TnE.INVITING;
        randomLinkMicManager.getClass();
        RandomLinkMicManager.LJIJI(enumC75692TnE);
    }

    @Override // X.InterfaceC75706TnS
    public final void LIZLLL(C76003TsF c76003TsF, Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invite failed error ");
        LIZ.append(th);
        C0NB.LJ("QuickPairManager", X1D.LIZIZ(LIZ));
        this.LJLIL.LJJJJJ = false;
        C75877TqD.LJIILLIIL = "normal";
        B5G.LIZIZ().LJIILIIL(EnumC75636TmK.MATCH);
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "end_reason", "invite_failed");
        C58416MwG.LIZLLL.LIZIZ(2, jSONObject);
        BPP.LJ(C15380j0.LIZLLL(), th);
        if (th != null) {
            C75516TkO.LIZ.LIZIZ(111, "quick linkmic invite failed", th, null);
        }
    }
}
