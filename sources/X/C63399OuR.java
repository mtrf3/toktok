package X;

import com.bytedance.im.core.proto.MessageCheckInfoV2;
import kotlin.jvm.internal.o;

/* renamed from: X.OuR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63399OuR extends AbstractC65781Prl implements InterfaceC88472Yns<MessageCheckInfoV2, CharSequence> {
    public static final C63399OuR LJLIL = new C63399OuR();

    public C63399OuR() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(MessageCheckInfoV2 messageCheckInfoV2) {
        MessageCheckInfoV2 it = messageCheckInfoV2;
        o.LJIIIZ(it, "it");
        return String.valueOf(it.msg_id);
    }
}
