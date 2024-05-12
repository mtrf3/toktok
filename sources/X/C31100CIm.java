package X;

import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.CIm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31100CIm<T> implements InterfaceC73592SuS {
    public final /* synthetic */ ISendCommentEvent LJLIL;

    public C31100CIm(ISendCommentEvent iSendCommentEvent) {
        this.LJLIL = iSendCommentEvent;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        C31099CIl it = (C31099CIl) obj;
        o.LJIIIZ(it, "it");
        if (it.LJLIL == this.LJLIL) {
            return true;
        }
        return false;
    }
}
