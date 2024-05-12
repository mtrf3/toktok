package X;

import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BnV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29845BnV implements InterfaceC31330CRi<CapsuleMessage> {
    @Override // X.InterfaceC31330CRi
    public final boolean LIZ(CapsuleMessage capsuleMessage, CQQ context) {
        Boolean bool;
        CapsuleMessage message = capsuleMessage;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        List<InterfaceC29848BnY> hr0 = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).hr0(message.capsuleType);
        boolean z = false;
        if (hr0 != null) {
            for (InterfaceC29848BnY interfaceC29848BnY : hr0) {
                if (interfaceC29848BnY != null) {
                    bool = Boolean.valueOf(interfaceC29848BnY.LJFF(context, message));
                } else {
                    bool = null;
                }
                if (C29306Beo.LJJIFFI(bool)) {
                    z = true;
                }
            }
        }
        return z;
    }
}
