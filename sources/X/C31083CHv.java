package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.dataChannel.EmoteBaseInformationListChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CHv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31083CHv implements InterfaceC31091CId {
    public final /* synthetic */ C30926CBu LIZ;
    public final /* synthetic */ CommentWidget LIZIZ;

    @Override // X.InterfaceC31091CId
    public final void LIZ() {
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LIZIZ.LLILLIZIL;
        liveEmojiInputDialogFragment.Rl();
        liveEmojiInputDialogFragment.LLFII.setIconAttr(R.attr.arm);
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment2 = this.LIZIZ.LLILLIZIL;
        EmoteModel emoteModel = this.LIZ.LJIIJ;
        if (emoteModel == null) {
            liveEmojiInputDialogFragment2.Rl();
            liveEmojiInputDialogFragment2.LLFII.setIconAttr(R.attr.arm);
            return;
        }
        for (int i = 0; i < ((ArrayList) liveEmojiInputDialogFragment2.LLJJI).size(); i++) {
            C0Y5 c0y5 = (C0Y5) ListProtector.get(liveEmojiInputDialogFragment2.LLJJI, i);
            if (c0y5 instanceof C32181Oc) {
                liveEmojiInputDialogFragment2.Pl(i);
                liveEmojiInputDialogFragment2.LLIIZ.setCurrentItem(i);
                CJ0 cj0 = ((C32181Oc) c0y5).LJIIIZ;
                if (cj0 != null) {
                    AbstractC029409q adapter = cj0.getRecyclerView().getAdapter();
                    C31413CUn c31413CUn = (C31413CUn) adapter;
                    List<?> list = c31413CUn.LJLIL;
                    if (list.isEmpty()) {
                        DataChannelGlobal.LJLJJI.qv0(liveEmojiInputDialogFragment2, liveEmojiInputDialogFragment2, EmoteBaseInformationListChannel.class, new CID(liveEmojiInputDialogFragment2, emoteModel, cj0, adapter, list));
                    } else {
                        LiveEmojiInputDialogFragment.xl(emoteModel, cj0, c31413CUn, list);
                    }
                }
            }
        }
    }

    public C31083CHv(CommentWidget commentWidget, C30926CBu c30926CBu) {
        this.LIZIZ = commentWidget;
        this.LIZ = c30926CBu;
    }
}
