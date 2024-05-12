package X;

import com.bytedance.im.core.proto.ConversationSettingInfo;

/* renamed from: X.Opt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63117Opt implements InterfaceC63352Otg<C63120Opw> {
    public final /* synthetic */ ConversationSettingInfo LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    @Override // X.InterfaceC63352Otg
    public final C63120Opw LIZIZ() {
        boolean LJ = C63113Opp.LJ(C63081OpJ.LJIIJ(C63113Opp.LIZJ(this.LJLIL.conversation_id), this.LJLIL));
        if (this.LJLILLLLZI) {
            C63133Oq9.LJIIIZ(this.LJLIL.conversation_id, true);
            C63308Osy.LJI().LIZLLL().getClass();
            C63133Oq9.LJIJI(System.currentTimeMillis(), this.LJLIL.conversation_id);
        }
        if (LJ) {
            return C63133Oq9.LJIIIZ(this.LJLIL.conversation_id, true);
        }
        return null;
    }

    public C63117Opt(ConversationSettingInfo conversationSettingInfo, boolean z) {
        this.LJLIL = conversationSettingInfo;
        this.LJLILLLLZI = z;
    }
}
