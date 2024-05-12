package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.CRe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31326CRe implements InterfaceC31288CPs {
    public final /* synthetic */ CR2 LIZ;

    public C31326CRe(CR2 cr2) {
        this.LIZ = cr2;
    }

    @Override // X.InterfaceC31288CPs
    public final void LIZ(IMessage message) {
        o.LJIIIZ(message, "message");
        this.LIZ.onMessage(message);
    }
}
