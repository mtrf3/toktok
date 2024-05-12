package X;

import com.bytedance.im.core.proto.ConversationCheckInfoV2;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Oue, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63412Oue extends F9E {
    public final List<ConversationCheckInfoV2> LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
    }

    public C63412Oue(List<ConversationCheckInfoV2> conversationCheckInfoList, boolean z, boolean z2) {
        o.LJIIIZ(conversationCheckInfoList, "conversationCheckInfoList");
        this.LJLIL = conversationCheckInfoList;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }
}
