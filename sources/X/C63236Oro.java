package X;

import android.util.Pair;
import com.bytedance.im.core.proto.ConversationInfoV2;

/* renamed from: X.Oro, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63236Oro implements InterfaceC63352Otg<Pair<C63120Opw, Boolean>> {
    public final /* synthetic */ ConversationInfoV2 LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    @Override // X.InterfaceC63352Otg
    public final Pair<C63120Opw, Boolean> LIZIZ() {
        int i;
        Integer num = this.LJLIL.conversation_core_info.inbox_type;
        if (num != null && this.LJLILLLLZI == 3) {
            i = num.intValue();
        } else {
            i = this.LJLILLLLZI;
        }
        return C63217OrV.LJIIZILJ(i, this.LJLJI, this.LJLIL);
    }

    public C63236Oro(ConversationInfoV2 conversationInfoV2, int i, long j) {
        this.LJLIL = conversationInfoV2;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
    }
}
