package X;

import com.bytedance.im.core.proto.GetRecentMessageRespBody;

/* renamed from: X.Osu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63304Osu implements InterfaceC63352Otg<C63303Ost> {
    public final /* synthetic */ GetRecentMessageRespBody LJLIL;
    public final /* synthetic */ C63622Oy2 LJLILLLLZI;
    public final /* synthetic */ C63301Osr LJLJI;

    @Override // X.InterfaceC63352Otg
    public final C63303Ost LIZIZ() {
        C63303Ost c63303Ost = new C63303Ost();
        try {
            C78847Ux1.LJJLIIIJJI("GetRecentMsgHandler.handleResponse()");
            this.LJLJI.LJIJ(c63303Ost, this.LJLIL.messages, this.LJLILLLLZI.LJIIIIZZ());
            C78847Ux1.LJIJJLI("GetRecentMsgHandler.handleResponse()", true);
            this.LJLJI.LJIJI(c63303Ost, this.LJLIL.next_conversation_version);
        } catch (Exception e) {
            C63322OtC.LJ("GetRecentMsgHandler handleResponse saveMessage error", e);
            C78847Ux1.LJIJJLI("GetRecentMsgHandler.handleResponse()", false);
            C63337OtR.LJFF(e);
            C63272OsO.LJIIL(4, e);
            C63291Osh LIZ = C63291Osh.LIZ();
            int i = this.LJLJI.LIZJ;
            LIZ.getClass();
            if (C63291Osh.LJIILL(i)) {
                this.LJLJI.LJIJI(c63303Ost, this.LJLIL.next_conversation_version);
            } else {
                C63322OtC.LIZLLL("GetRecentMsgHandler handleResponse forbid to update version");
            }
        }
        return c63303Ost;
    }

    public C63304Osu(C63301Osr c63301Osr, GetRecentMessageRespBody getRecentMessageRespBody, C63622Oy2 c63622Oy2) {
        this.LJLJI = c63301Osr;
        this.LJLIL = getRecentMessageRespBody;
        this.LJLILLLLZI = c63622Oy2;
    }
}
