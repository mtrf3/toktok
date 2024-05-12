package Y;

import X.BEF;
import X.BZT;
import X.C29078Bb8;
import X.C30868C9o;
import X.CI1;
import X.EnumC12540eQ;
import X.EnumC30204BtI;
import X.InterfaceC30237Btp;
import X.InterfaceC88472Yns;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.utils.EmoteFixTextHelper;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AObjectS86S0300000_5 implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS86S0300000_5 aObjectS86S0300000_5, Object obj) {
        BZT bzt = (BZT) aObjectS86S0300000_5.l0;
        DataChannel dataChannel = (DataChannel) aObjectS86S0300000_5.l1;
        InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) aObjectS86S0300000_5.l2;
        bzt.getClass();
        BEF bef = (BEF) dataChannel.kv0(LiveBanCapabilityChannel.class);
        if ((obj != EnumC12540eQ.ON && bzt.LJLILLLLZI.mRoom.cppVersion == 1) || (bef != null && bef.LJLJI)) {
            interfaceC30237Btp.setAlpha(0.34f);
            return null;
        }
        interfaceC30237Btp.setAlpha(1.0f);
        return null;
    }

    public static final Object invoke$1(AObjectS86S0300000_5 aObjectS86S0300000_5, Object obj) {
        int i;
        String string;
        CI1 ci1 = (CI1) aObjectS86S0300000_5.l0;
        Editable editable = (Editable) aObjectS86S0300000_5.l1;
        EmoteModel emote = (EmoteModel) aObjectS86S0300000_5.l2;
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = ci1.LIZ;
        int LIZ = liveEmojiInputDialogFragment.LLILII.LIZ() + liveEmojiInputDialogFragment.LLILII.emoteLength;
        boolean z = liveEmojiInputDialogFragment.LJLLJ;
        if (z) {
            i = 15;
        } else {
            i = 100;
        }
        if (LIZ > i) {
            if (z) {
                string = liveEmojiInputDialogFragment.getString(R.string.knl);
            } else {
                string = liveEmojiInputDialogFragment.getString(R.string.knl);
            }
            C30868C9o.LJI(string);
            return null;
        }
        liveEmojiInputDialogFragment.LLJIJIL = false;
        int selectionStart = liveEmojiInputDialogFragment.LLI.getSelectionStart();
        liveEmojiInputDialogFragment.LLJILJIL = true;
        editable.insert(selectionStart, spannableStringBuilder);
        liveEmojiInputDialogFragment.LLJILJIL = false;
        if (liveEmojiInputDialogFragment.LLJI) {
            return null;
        }
        EmoteFixTextHelper emoteFixTextHelper = liveEmojiInputDialogFragment.LLILII;
        emoteFixTextHelper.getClass();
        o.LJIIIZ(emote, "emote");
        if (!emoteFixTextHelper.isReceiveInput || selectionStart > emoteFixTextHelper.list.size() || selectionStart < 0) {
            return null;
        }
        ListProtector.add(emoteFixTextHelper.list, selectionStart, new EmoteFixTextHelper.EmoteText(1, emote, null, null, 12));
        return null;
    }

    public static final Object invoke$2(AObjectS86S0300000_5 aObjectS86S0300000_5, Object obj) {
        C29078Bb8 c29078Bb8 = (C29078Bb8) aObjectS86S0300000_5.l0;
        DataChannel dataChannel = (DataChannel) aObjectS86S0300000_5.l1;
        InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) aObjectS86S0300000_5.l2;
        EnumC12540eQ enumC12540eQ = (EnumC12540eQ) obj;
        c29078Bb8.LJLJJI = enumC12540eQ;
        BEF bef = (BEF) dataChannel.kv0(LiveBanCapabilityChannel.class);
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        if (room == null) {
            return null;
        }
        if ((enumC12540eQ != EnumC12540eQ.ON && room.cppVersion == 1) || (bef != null && bef.LJLILLLLZI)) {
            interfaceC30237Btp.setAlpha(0.34f);
            return null;
        }
        interfaceC30237Btp.setAlpha(1.0f);
        EnumC30204BtI.INTRO.setRedDotVisible(dataChannel, false);
        return null;
    }

    public AObjectS86S0300000_5(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
