package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import java.util.List;

/* loaded from: classes6.dex */
public final class CID implements InterfaceC88472Yns<List<? extends EmoteModel>, C76800UCe> {
    public final /* synthetic */ EmoteModel LJLIL;
    public final /* synthetic */ CJ0 LJLILLLLZI;
    public final /* synthetic */ AbstractC029409q LJLJI;
    public final /* synthetic */ List LJLJJI;
    public final /* synthetic */ LiveEmojiInputDialogFragment LJLJJL;

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<? extends EmoteModel> list) {
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LJLJJL;
        EmoteModel emoteModel = this.LJLIL;
        CJ0 cj0 = this.LJLILLLLZI;
        C31413CUn c31413CUn = (C31413CUn) this.LJLJI;
        List list2 = this.LJLJJI;
        liveEmojiInputDialogFragment.getClass();
        LiveEmojiInputDialogFragment.xl(emoteModel, cj0, c31413CUn, list2);
        return null;
    }

    public CID(LiveEmojiInputDialogFragment liveEmojiInputDialogFragment, EmoteModel emoteModel, CJ0 cj0, AbstractC029409q abstractC029409q, List list) {
        this.LJLJJL = liveEmojiInputDialogFragment;
        this.LJLIL = emoteModel;
        this.LJLILLLLZI = cj0;
        this.LJLJI = abstractC029409q;
        this.LJLJJI = list;
    }
}
