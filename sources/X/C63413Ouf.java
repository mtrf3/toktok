package X;

import com.bytedance.im.core.proto.ConversationCheckInfoV2;
import kotlin.jvm.internal.o;

/* renamed from: X.Ouf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63413Ouf extends AbstractC65781Prl implements InterfaceC88472Yns<ConversationCheckInfoV2, CharSequence> {
    public static final C63413Ouf LJLIL = new C63413Ouf();

    public C63413Ouf() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(ConversationCheckInfoV2 conversationCheckInfoV2) {
        ConversationCheckInfoV2 it = conversationCheckInfoV2;
        o.LJIIIZ(it, "it");
        String str = it.conv_id;
        o.LJIIIIZZ(str, "it.conv_id");
        return str;
    }
}
