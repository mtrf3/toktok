package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.model.InputAttrs;
import com.bytedance.android.livesdk.chatroom.model.ReplyInfo;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.utils.EmoteFixTextHelper;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.goodybag.GoodyBagCommentBlockHot;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CHt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31081CHt implements TextWatcher {
    public int LJLIL = -1;
    public int LJLILLLLZI = -1;
    public boolean LJLJI;
    public final /* synthetic */ LiveEmojiInputDialogFragment LJLJJI;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C31081CHt(LiveEmojiInputDialogFragment liveEmojiInputDialogFragment) {
        this.LJLJJI = liveEmojiInputDialogFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C31089CIb c31089CIb;
        String obj;
        InterfaceC31092CIe interfaceC31092CIe;
        boolean z;
        int i;
        String string;
        boolean z2;
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LJLJJI;
        if (!liveEmojiInputDialogFragment.LJLJI || (c31089CIb = liveEmojiInputDialogFragment.LLI) == null) {
            return;
        }
        Editable text = c31089CIb.getText();
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment2 = this.LJLJJI;
        if (text == null) {
            obj = "";
        } else {
            obj = text.toString();
        }
        liveEmojiInputDialogFragment2.LJZI = obj;
        boolean isEmpty = TextUtils.isEmpty(this.LJLJJI.LJZI);
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment3 = this.LJLJJI;
        InterfaceC31092CIe interfaceC31092CIe2 = liveEmojiInputDialogFragment3.LJLJJL;
        if (interfaceC31092CIe2 != null && !liveEmojiInputDialogFragment3.LLJI) {
            String str = liveEmojiInputDialogFragment3.LJZI;
            CIO cio = (CIO) interfaceC31092CIe2;
            boolean value = GoodyBagCommentBlockHot.INSTANCE.getValue();
            JSONObject jSONObject = cio.LIZJ.LLILLL.trackInfo;
            if (jSONObject != null && jSONObject.optInt("is_from_goody_bag", 0) == 1) {
                C0NB.LIZIZ("tianweirui1", "isfromgoodybag");
                z2 = true;
            } else {
                z2 = false;
            }
            if (cio.LIZJ.LLILZIL.isEnabled() && (!value || !z2)) {
                cio.LIZJ.LLILZIL.notifyCommentInputChanged(str);
            }
        }
        if (isEmpty) {
            this.LJLJJI.LLII.setVisibility(0);
            this.LJLJJI.LLIFFJFJJ.setVisibility(8);
            this.LJLJJI.LLIFFJFJJ.setText("");
            this.LJLJJI.LLFZ.setClickable(false);
        } else {
            this.LJLJJI.LLII.setVisibility(8);
            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment4 = this.LJLJJI;
            if (!liveEmojiInputDialogFragment4.LLJ && (interfaceC31092CIe = liveEmojiInputDialogFragment4.LJLJJL) != null) {
                liveEmojiInputDialogFragment4.LLJ = true;
                CommentWidget commentWidget = ((CIO) interfaceC31092CIe).LIZJ;
                DataChannel dataChannel = commentWidget.dataChannel;
                InputAttrs inputAttrs = commentWidget.LLILLL;
                o.LJIIIZ(inputAttrs, "inputAttrs");
                if (dataChannel != null && LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_comment_input", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
                    Boolean bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
                    if (bool != null) {
                        z = bool.booleanValue();
                    } else {
                        z = false;
                    }
                    BZI LIZ = C28787BRn.LIZ("comment_input");
                    LIZ.LJIILLIIL(dataChannel);
                    LIZ.LJIJJ(dataChannel.kv0(C29434Bgs.class), "input_from");
                    if (dataChannel.kv0(LiveExtendedScreenStatus.class) == EnumC31158CKs.SHOW) {
                        LIZ.LJIJJ("live_extended_comment_filed", "event_page");
                    }
                    if (z) {
                        LIZ.LJIJJ("more", "click_method");
                    }
                    LIZ.LJIJJ(inputAttrs.mCommentMethod, "method");
                    ReplyInfo replyInfo = inputAttrs.replyInfo;
                    if (replyInfo != null && replyInfo.replyToId > 0) {
                        LIZ.LJIJJ(Long.valueOf(replyInfo.msgId), "reply_message_id");
                        LIZ.LJIJJ(Long.valueOf(replyInfo.releaseId), "reply_message_release_id");
                    }
                    C31079CHr.LJFF(LIZ, dataChannel);
                    ISendCommentEvent.Sender sender = inputAttrs.sender;
                    if (sender != null && sender == ISendCommentEvent.Sender.COMMENT_COMBO_TRAY) {
                        LIZ.LJJIFFI(sender.getLogArgs());
                    }
                    LIZ.LJJIIJZLJL();
                }
            }
            this.LJLJJI.LLFZ.setClickable(true);
        }
        this.LJLJJI.Yl(isEmpty);
        int LIZ2 = this.LJLJJI.LLILII.LIZ();
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment5 = this.LJLJJI;
        int i2 = 100;
        if (liveEmojiInputDialogFragment5.LJLLJ) {
            i = 15;
        } else {
            i = 100;
        }
        if (LIZ2 > i && !liveEmojiInputDialogFragment5.LLILLJJLI.booleanValue()) {
            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment6 = this.LJLJJI;
            C31089CIb et = liveEmojiInputDialogFragment6.LLI;
            int length = liveEmojiInputDialogFragment6.LJZI.length();
            o.LJIIIZ(et, "et");
            InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(length);
            InputFilter[] inputFilters = et.getFilters();
            o.LJIIIIZZ(inputFilters, "inputFilters");
            ArrayList arrayList = (ArrayList) ORY.LJLIIIL(inputFilters);
            arrayList.add(lengthFilter);
            et.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
            liveEmojiInputDialogFragment6.LJLLILLLL = lengthFilter;
        } else {
            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment7 = this.LJLJJI;
            CI8.LIZ(liveEmojiInputDialogFragment7.LLI, liveEmojiInputDialogFragment7.LJLLILLLL);
            liveEmojiInputDialogFragment7.LJLLILLLL = null;
        }
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment8 = this.LJLJJI;
        if (liveEmojiInputDialogFragment8.LJLLJ) {
            i2 = 15;
        }
        if (LIZ2 > i2 && !liveEmojiInputDialogFragment8.LLILLJJLI.booleanValue()) {
            this.LJLJI = false;
            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment9 = this.LJLJJI;
            if (liveEmojiInputDialogFragment9.LJLLJ) {
                string = liveEmojiInputDialogFragment9.getString(R.string.ssc);
            } else {
                string = liveEmojiInputDialogFragment9.getString(R.string.knl);
            }
            C30868C9o.LJI(string);
            EmoteFixTextHelper emoteFixTextHelper = this.LJLJJI.LLILII;
            int i3 = emoteFixTextHelper.recordInputIndex;
            text.delete(i3, emoteFixTextHelper.recordLength + i3);
            try {
                LiveEmojiInputDialogFragment liveEmojiInputDialogFragment10 = this.LJLJJI;
                liveEmojiInputDialogFragment10.LLI.setSelection(liveEmojiInputDialogFragment10.LLILII.recordInputIndex);
            } catch (Exception e) {
                HashMap hashMap = new HashMap();
                hashMap.put("error", e.getMessage());
                C0K2.LJII(1, "ttlive_emoji_fragment_error", hashMap);
            }
        } else {
            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment11 = this.LJLJJI;
            if (!liveEmojiInputDialogFragment11.LLJILJIL && this.LJLJI && !liveEmojiInputDialogFragment11.LLJI) {
                this.LJLJI = false;
                int i4 = this.LJLIL;
                if (i4 < this.LJLILLLLZI + i4 && liveEmojiInputDialogFragment11.LJZI.length() >= this.LJLIL + this.LJLILLLLZI) {
                    int length2 = text.length();
                    int i5 = this.LJLIL;
                    int i6 = this.LJLILLLLZI + i5;
                    if (length2 >= i6) {
                        String replace = this.LJLJJI.LJZI.substring(i5, i6).replace((char) 65532, ' ');
                        int i7 = this.LJLIL;
                        text.replace(i7, this.LJLILLLLZI + i7, replace);
                    }
                }
            }
        }
        this.LJLJJI.LLJLIL.getClass();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LJLJJI;
        if (liveEmojiInputDialogFragment.LLJI) {
            return;
        }
        if (i2 != 0) {
            EmoteFixTextHelper emoteFixTextHelper = liveEmojiInputDialogFragment.LLILII;
            int i4 = i2 + i;
            if (emoteFixTextHelper.isReceiveInput && i >= 0 && i < i4 && i4 <= emoteFixTextHelper.list.size()) {
                emoteFixTextHelper.list.subList(i, i4).clear();
            }
        }
        if (i3 != 0) {
            EmoteFixTextHelper emoteFixTextHelper2 = this.LJLJJI.LLILII;
            emoteFixTextHelper2.recordInputIndex = i;
            emoteFixTextHelper2.recordLength = i3;
            for (int i5 = i; i5 < i + i3; i5++) {
                if (charSequence.charAt(i5) != 65532 || this.LJLJJI.LLJIJIL) {
                    EmoteFixTextHelper emoteFixTextHelper3 = this.LJLJJI.LLILII;
                    CharSequence c = charSequence.subSequence(i5, i5 + 1);
                    emoteFixTextHelper3.getClass();
                    o.LJIIIZ(c, "c");
                    if (emoteFixTextHelper3.isReceiveInput && i5 <= emoteFixTextHelper3.list.size() && i5 >= 0) {
                        ListProtector.add(emoteFixTextHelper3.list, i5, new EmoteFixTextHelper.EmoteText(0, null, c, null, 10));
                    }
                }
            }
        }
        if (!this.LJLJJI.LLJILJIL && i3 != 0) {
            int i6 = i;
            while (true) {
                if (i6 >= i + i3) {
                    break;
                }
                if (charSequence.charAt(i6) == 65532) {
                    this.LJLJI = true;
                    break;
                }
                i6++;
            }
            this.LJLIL = i;
            this.LJLILLLLZI = i3;
        }
        this.LJLJJI.LLJIJIL = true;
    }
}
