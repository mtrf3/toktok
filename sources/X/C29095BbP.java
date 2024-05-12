package X;

import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.o;

/* renamed from: X.BbP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29095BbP extends TBS implements InterfaceC88472Yns<Cert, C76800UCe> {
    public C29095BbP(Object obj) {
        super(1, obj, VoiceChatBroadcastFragment.class, "onFinishBroadcastConfirmClick", "onFinishBroadcastConfirmClick(Lcom/bytedance/bpea/basics/Cert;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Cert cert) {
        Cert p0 = cert;
        o.LJIIIZ(p0, "p0");
        ((VoiceChatBroadcastFragment) this.receiver).dm(p0);
        return C76800UCe.LIZ;
    }
}
