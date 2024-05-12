package X;

import Y.AObjectS145S0100000_7;
import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import kotlin.jvm.internal.o;

/* renamed from: X.GMo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class HandlerC41398GMo extends Handler {
    public final InterfaceC88472Yns<AvatarUri, C76800UCe> LIZ;

    public HandlerC41398GMo(AObjectS145S0100000_7 aObjectS145S0100000_7) {
        super(C16880lQ.LLJJJJ());
        this.LIZ = aObjectS145S0100000_7;
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
