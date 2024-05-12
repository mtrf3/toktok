package X;

import com.bytedance.im.core.proto.MessageCheckInfoV2;
import kotlin.jvm.internal.o;

/* renamed from: X.OuQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63398OuQ extends AbstractC65781Prl implements InterfaceC88472Yns<MessageCheckInfoV2, CharSequence> {
    public static final C63398OuQ LJLIL = new C63398OuQ();

    public C63398OuQ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(MessageCheckInfoV2 messageCheckInfoV2) {
        MessageCheckInfoV2 it = messageCheckInfoV2;
        o.LJIIIZ(it, "it");
        return String.valueOf(it.msg_id);
    }
}
