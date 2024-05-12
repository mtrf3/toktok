package X;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import kotlin.jvm.internal.o;

/* renamed from: X.GMp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class HandlerC41399GMp extends Handler {
    public final InterfaceC88472Yns<AvatarUri, C76800UCe> LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HandlerC41399GMp(InterfaceC88472Yns<? super AvatarUri, C76800UCe> callback) {
        super(C16880lQ.LLJJJJ());
        o.LJIIIZ(callback, "callback");
        this.LIZ = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        Object obj = msg.obj;
        if (obj instanceof AvatarUri) {
            InterfaceC88472Yns<AvatarUri, C76800UCe> interfaceC88472Yns = this.LIZ;
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
            interfaceC88472Yns.invoke(obj);
        }
    }
}
