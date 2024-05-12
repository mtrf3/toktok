package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Tkf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75533Tkf implements InterfaceC19880qG {
    public final /* synthetic */ C75525TkX LIZ;

    public C75533Tkf(C75525TkX c75525TkX) {
        this.LIZ = c75525TkX;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Boolean, O] */
    @Override // X.InterfaceC19880qG
    public final void LIZ(int i) {
        DataChannel dataChannel = this.LIZ.LLFZ;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C75480Tjo.class)).LIZ = Boolean.FALSE;
        }
    }
}
