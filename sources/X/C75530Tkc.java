package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Tkc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75530Tkc implements InterfaceC19890qH {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ C75525TkX LJLILLLLZI;

    public C75530Tkc(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C75525TkX c75525TkX) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = c75525TkX;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Boolean, O] */
    @Override // X.InterfaceC19890qH
    public final void onShow() {
        this.LJLIL.invoke();
        DataChannel dataChannel = this.LJLILLLLZI.LLFZ;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C75480Tjo.class)).LIZ = Boolean.TRUE;
        }
    }
}
