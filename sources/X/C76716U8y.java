package X;

import webcast.im.PermitJoinGroupContent;

/* renamed from: X.U8y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76716U8y implements InterfaceC75941TrF {
    public final /* synthetic */ U7T LIZ;
    public final /* synthetic */ PermitJoinGroupContent LIZIZ;

    @Override // X.InterfaceC75941TrF
    public final void joinChannel() {
        String str;
        U7T u7t = this.LIZ;
        U7U u7u = u7t.LJIIIZ;
        String LJJI = U7T.LJJI(u7t.LJIIJ);
        if (this.LIZIZ.type == 102) {
            str = "business_multi_host_handle_reply_invite_msg";
        } else {
            str = "business_multi_host_handle_permit_apply_msg";
        }
        U7U.LJIIZILJ(u7u, u7t, LJJI, true, true, false, false, str, null, 128);
    }

    public C76716U8y(U7T u7t, PermitJoinGroupContent permitJoinGroupContent) {
        this.LIZ = u7t;
        this.LIZIZ = permitJoinGroupContent;
    }
}
