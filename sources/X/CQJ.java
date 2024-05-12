package X;

import Y.AObjectS42S0101000_5;
import Y.ARunnableS18S0101000_14;
import Y.ARunnableS9S0101000_5;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.RoomSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveBeingAtConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveSdkPublicScreenMessageScheduleStrategySetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.CommentQualityScore;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.MsgFilter;
import webcast.data.UserIdentity;

/* loaded from: classes6.dex */
public class CQJ extends AbstractC31075CHn<ChatMessage> implements CSC, CTT, CS1 {
    public static final /* synthetic */ int LJJJJZ = 0;
    public boolean LJJIIZI;
    public boolean LJJIJ;
    public CharSequence LJJIJIIJI;
    public final C31304CQi LJJIJIIJIL;
    public long LJJIJIL;
    public boolean LJJIJL;
    public boolean LJJIJLIJ;
    public SpannableStringBuilder LJJIL;
    public java.util.Map<Long, Long> LJJIZ;
    public final ArrayList<EmoteWithIndex> LJJJ;
    public SpannableStringBuilder LJJJI;
    public boolean LJJJIL;
    public CS1 LJJJJ;
    public final CQI LJJJJI;
    public final int LJJJJIZL;
    public final AObjectS42S0101000_5 LJJJJJ;
    public CommentQualityScore LJJJJJL;
    public final AObjectS42S0101000_5 LJJJJL;
    public final AObjectS42S0101000_5 LJJJJLI;
    public final ARunnableS9S0101000_5 LJJJJLL;

    @Override // X.CTT
    public final void LJIIJJI() {
        this.LJJIJLIJ = true;
    }

    @Override // X.CTT
    public boolean LJJJJI() {
        return !(this instanceof CQM);
    }

    @Override // X.CQL
    public boolean LJLJL() {
        return !(this instanceof CQM);
    }

    @Override // X.AbstractC31075CHn
    public boolean LLIILII() {
        return !(this instanceof CQM);
    }

    public void LLILL(SpannableStringBuilder spannableStringBuilder) {
    }

    public void LLILLIZIL(SpannableStringBuilder spannableStringBuilder) {
    }

    @Override // X.CQO, X.CRD
    public final UserIdentity LIZ() {
        return ((ChatMessage) this.LJIJJLI).userIdentity;
    }

    @Override // X.CQL, X.CRD
    public final boolean LJIIIIZZ() {
        return !this.LIZJ;
    }

    @Override // X.InterfaceC31380CTg
    public final MsgFilter LJIIJ() {
        return ((ChatMessage) this.LJIJJLI).msgFilter;
    }

    @Override // X.CQK, X.InterfaceC31337CRp
    public final User LJJI() {
        return ((ChatMessage) this.LJIJJLI).userInfo;
    }

    @Override // X.CQK, X.InterfaceC31337CRp
    public final User LJJJJZI() {
        User user = ((ChatMessage) this.LJIJJLI).atUser;
        if (user != null && user.getId() != this.LJIIJJI.LIZLLL() && LiveBeingAtConfigSetting.getValue().checkUser) {
            return null;
        }
        return user;
    }

    @Override // X.CSC
    public final CharSequence LJJJLIIL() {
        SpannableStringBuilder spannableStringBuilder = this.LJJJI;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        if (TextUtils.isEmpty(this.LJJIJIIJI)) {
            return "";
        }
        SpannableStringBuilder LIZ = C31418CUs.LIZ(this.LJJJ, CQW.PUBLICSCREEN_MESSAGE_TYPE, String.valueOf(this.LJJIJIIJI), this.LJJJJLI, this.LJJIIJ, this.LJJJJL, null, false);
        this.LJJJI = LIZ;
        LLILLIZIL(LIZ);
        return this.LJJJI;
    }

    @Override // X.CSC
    public final CharSequence LJJLIIIJJIZ() {
        return ((ChatMessage) this.LJIJJLI).content;
    }

    @Override // X.CQK
    public final String LLI() {
        MESSAGE message = this.LJIJJLI;
        if (((ChatMessage) message).content != null) {
            return ((ChatMessage) message).content;
        }
        return "";
    }

    @Override // X.CQK
    public final List<EmoteWithIndex> LLIFFJFJJ() {
        MESSAGE message = this.LJIJJLI;
        if (((ChatMessage) message).f117emotes != null) {
            return ((ChatMessage) message).f117emotes;
        }
        return new ArrayList();
    }

    @Override // X.CQK
    public final void LLIIIJ() {
        BZI LIZ = C28787BRn.LIZ("livesdk_message_click");
        LIZ.LJIILLIIL(LJLIIL().LJIIIIZZ);
        LIZ.LJIJJ(Long.valueOf(this.LJIJJLI.getMessageId()), "message_id");
        LIZ.LJIJJ("comment", "message_type");
        LIZ.LJIJJ(Long.valueOf(this.LJIILLIIL.LIZ), "message_release_id");
        LIZ.LJIJJ(Long.valueOf(LJLILLLLZI()), "to_user_id");
        LIZ.LJIJJ(LLD(), "admin_type");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.CQK
    public final void LLIIIL() {
        MESSAGE message = this.LJIJJLI;
        if (((ChatMessage) message).communityflaggedStatus == 1) {
            CQQ cqq = this.LJIIJJI;
            if (cqq != null) {
                ChatMessage message2 = (ChatMessage) message;
                o.LJIIIZ(message2, "message");
                cqq.LJIIJ.LJJIJL(message2, this);
                return;
            }
            return;
        }
        super.LLIIIL();
    }

    @Override // X.CQK
    public final void LLIIIZ() {
        if (C29232Bdc.LJFF(this.LJIIJJI.LJIIIIZZ)) {
            return;
        }
        super.LLIIIZ();
    }

    @Override // X.AbstractC31075CHn
    public final String LLIIJLIL() {
        MESSAGE message = this.LJIJJLI;
        if (message == 0 || ((ChatMessage) message).content == null) {
            return "";
        }
        return ((ChatMessage) message).content;
    }

    @Override // X.AbstractC31075CHn
    public final int LLIIL() {
        MESSAGE message = this.LJIJJLI;
        if (message == 0 || ((ChatMessage) message).f117emotes == null) {
            return 0;
        }
        return ((ChatMessage) message).f117emotes.size();
    }

    @Override // X.AbstractC31075CHn
    public final void LLIIZ() {
        MESSAGE message = this.LJIJJLI;
        if (message == 0 || ((ChatMessage) message).f117emotes == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((ChatMessage) this.LJIJJLI).f117emotes.size(); i++) {
            EmoteModel emoteModel = ((EmoteWithIndex) ListProtector.get(((ChatMessage) this.LJIJJLI).f117emotes, i)).emoteModel;
            if (emoteModel != null) {
                arrayList.add(emoteModel);
            }
        }
        if (this.LJJJJIZL == 0) {
            C31418CUs.LIZJ(arrayList, CQW.PUBLICSCREEN_MESSAGE_TYPE);
        } else {
            B73.LIZ().post(new ARunnableS18S0101000_14(0, arrayList, 16));
        }
    }

    public SpannableStringBuilder LLILII() {
        SpannableStringBuilder spannableStringBuilder = this.LJJIL;
        if (spannableStringBuilder == null) {
            String LIZIZ = C0YG.LIZIZ(((ChatMessage) this.LJIJJLI).content);
            if (LIZIZ == null) {
                LIZIZ = "";
            }
            return C31418CUs.LIZ(((ChatMessage) this.LJIJJLI).f117emotes, CQW.PUBLICSCREEN_MESSAGE_TYPE, LIZIZ, this.LJJJJLI, this.LJJIIJ, this.LJJJJJ, null, false);
        }
        return spannableStringBuilder;
    }

    @Override // X.CQK, X.InterfaceC31337CRp
    public final long getCreateTime() {
        return this.LJIJJLI.localTimestamp;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return ((ChatMessage) this.LJIJJLI).userInfo;
    }

    @Override // X.CSC
    public final boolean LJJLIIIJLJLI() {
        CharSequence content = getContent();
        if (content == null) {
            return false;
        }
        for (int i = 0; i < content.length(); i++) {
            char charAt = content.charAt(i);
            if (charAt != ' ' && charAt != 65532) {
                return true;
            }
        }
        return false;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        return LLILII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CommentQualityScore LLIL() {
        CommentQualityScore commentQualityScore;
        Room room;
        List list;
        CommentQualityScore commentQualityScore2;
        if (RoomSlowFunctionOptSetting.watchOpt() && (commentQualityScore2 = this.LJJJJJL) != null) {
            return commentQualityScore2;
        }
        List arrayList = new ArrayList();
        DataChannel dataChannel = this.LJIIJJI.LJIIIIZZ;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (list = room.rankCommentGroups) != null) {
            arrayList = list;
        }
        if (this.LJIIIZ && !this.LJIIJJI.LJFF && !arrayList.isEmpty()) {
            Object obj = this.LJIJJLI;
            if (((ChatMessage) obj).commentQualityScores != null && !((ChatMessage) obj).commentQualityScores.isEmpty()) {
                HashMap hashMap = new HashMap();
                for (int i = 0; i < ((ChatMessage) this.LJIJJLI).commentQualityScores.size(); i++) {
                    CommentQualityScore commentQualityScore3 = (CommentQualityScore) ListProtector.get(((ChatMessage) this.LJIJJLI).commentQualityScores, i);
                    hashMap.put(commentQualityScore3.version, commentQualityScore3);
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Object obj2 = ListProtector.get(arrayList, size);
                    if (hashMap.containsKey(obj2) && (commentQualityScore = (CommentQualityScore) hashMap.get(obj2)) != null) {
                        this.LJJJJJL = commentQualityScore;
                        return commentQualityScore;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void LLILIL() {
        CQQ cqq;
        if (LJJJJZI() == null || this.LJJIJIIJIL.LIZ || (cqq = this.LJIIJJI) == null || cqq.LJIIJ == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        this.LJIIJJI.LJIIJ.LJJIJ(this);
        this.LJIIJJI.LJIIJ.LJIILJJIL(arrayList);
    }

    @Override // X.CQK, X.CQL, X.CRD
    public void dispose() {
        super.dispose();
        this.LJJIIZI = false;
    }

    @Override // X.CQO, X.InterfaceC31346CRy
    public final long getPriority() {
        CommentQualityScore LLIL = LLIL();
        if (LLIL != null) {
            return LLIL.score;
        }
        return super.getPriority();
    }

    @Override // X.CQL, X.InterfaceC31368CSu
    public final void onAttach() {
        CQQ cqq;
        CQP cqp;
        super.onAttach();
        if (LJJJJZI() != null && !this.LJJIJIIJIL.LIZ && (cqq = this.LJIIJJI) != null && (cqp = cqq.LJIIJ) != null && !cqp.LJJIJIIJI().contains(this)) {
            this.LJIIJJI.LJIIJ.LJJIJIIJI().add(this);
        }
    }

    @Override // X.CS1
    public final CS1 LIZJ() {
        return this.LJJJJ;
    }

    @Override // X.CS1
    public final boolean LJIILIIL() {
        return this.LJJJIL;
    }

    @Override // X.CTT
    public final boolean LJIILL() {
        return this.LJJIJLIJ;
    }

    @Override // X.CSC
    public final boolean LJIIZILJ() {
        return this.LJJIIZI;
    }

    @Override // X.CS1
    public final CQI LJJIJIIJI() {
        return this.LJJJJI;
    }

    @Override // X.CTT
    public final boolean LJJJJLL() {
        return this.LJJIJL;
    }

    @Override // X.CSC
    public final boolean LJJLIIIJLLLLLLLZ() {
        return this.LJJIJ;
    }

    @Override // X.CQK, X.InterfaceC31337CRp
    public final C31304CQi LJJLJLI() {
        return this.LJJIJIIJIL;
    }

    public CQJ(ChatMessage chatMessage) {
        super(chatMessage);
        this.LJJIJIIJIL = new C31304CQi();
        this.LJJIJL = false;
        this.LJJIJLIJ = false;
        this.LJJJ = new ArrayList<>();
        this.LJJJJI = new CQI();
        this.LJJJJIZL = LiveSdkPublicScreenMessageScheduleStrategySetting.getMessageScheduleStrategy();
        this.LJJJJJ = new AObjectS42S0101000_5(1, this, 48);
        this.LJJJJL = new AObjectS42S0101000_5(0, this, 21);
        this.LJJJJLI = new AObjectS42S0101000_5(1, this, 49);
        this.LJJJJLL = new ARunnableS9S0101000_5(0, this, 12);
        if (chatMessage.communityflaggedStatus == 1) {
            this.LJIILL.LIZ = false;
        }
    }

    @Override // X.AbstractC31075CHn, X.CQL, X.InterfaceC31368CSu
    public final void LJII(boolean z) {
        CQP cqp;
        CQP cqp2;
        super.LJII(z);
        if (LJJJJZI() != null && this.LJJIJIL != 0) {
            C15610jN.LIZ().removeCallbacks(this.LJJJJLL);
            if (SystemClock.elapsedRealtime() - this.LJJIJIL < LiveBeingAtConfigSetting.getValue().flagReadThreshold && !this.LJJIJIIJIL.LIZ) {
                CQQ cqq = this.LJIIJJI;
                if (cqq != null && (cqp2 = cqq.LJIIJ) != null) {
                    cqp2.LJJ(this, true);
                }
            } else {
                LLILIL();
            }
            CQQ cqq2 = this.LJIIJJI;
            if (cqq2 != null && (cqp = cqq2.LJIIJ) != null) {
                cqp.LJJIJIIJI().remove(this);
            }
            this.LJJIJIL = 0L;
        }
    }

    @Override // X.CSC
    public final void LJJIIJ(boolean z) {
        this.LJJIIZI = z;
    }

    @Override // X.CTT
    public final void LJJIJLIJ(boolean z) {
        this.LJJIJL = z;
    }

    @Override // X.CSC
    public final void LJJIZ(boolean z) {
        this.LJJIJ = z;
    }

    @Override // X.CSC
    public final void LJJJJL(CharSequence charSequence) {
        this.LJJIJIIJI = charSequence;
    }

    @Override // X.CSC
    public final void LJJL(java.util.Map<Long, Long> map) {
        MESSAGE message;
        this.LJJIZ = map;
        if (map != null && !map.isEmpty() && (message = this.LJIJJLI) != 0 && ((ChatMessage) message).f117emotes != null && !((ChatMessage) message).f117emotes.isEmpty()) {
            this.LJJJ.clear();
            for (int i = 0; i < ((ChatMessage) this.LJIJJLI).f117emotes.size(); i++) {
                EmoteWithIndex emoteWithIndex = new EmoteWithIndex();
                EmoteWithIndex emoteWithIndex2 = (EmoteWithIndex) ListProtector.get(((ChatMessage) this.LJIJJLI).f117emotes, i);
                Long l = this.LJJIZ.get(Long.valueOf(emoteWithIndex2.index));
                if (l != null) {
                    emoteWithIndex.index = l.intValue();
                    emoteWithIndex.emoteModel = emoteWithIndex2.emoteModel;
                    this.LJJJ.add(emoteWithIndex);
                }
            }
        }
    }

    @Override // X.CQL
    public final void LJLLI(BadgeStruct badgeStruct) {
        String str;
        if (C29514BiA.LIZ(badgeStruct)) {
            long LJLILLLLZI = LJLILLLLZI();
            if (LJLJJL()) {
                str = "anchor";
            } else {
                str = "user";
            }
            C29514BiA.LIZJ(LJLILLLLZI, "livesdk_top_active_user_rank_badge_click", "comment_area_user_comment", str);
        }
        if (C29514BiA.LIZIZ(badgeStruct)) {
            C29514BiA.LJ(LJLILLLLZI(), "comment_area_user_comment", LJLJJL());
        }
    }

    @Override // X.CQL
    public final void LJLLILLLL(BadgeStruct badgeStruct) {
        String str;
        if (C29514BiA.LIZ(badgeStruct)) {
            long LJLILLLLZI = LJLILLLLZI();
            if (LJLJJL()) {
                str = "anchor";
            } else {
                str = "user";
            }
            C29514BiA.LIZJ(LJLILLLLZI, "livesdk_top_active_user_rank_badge_show", "comment_area_user_comment", str);
        }
        if (C29514BiA.LIZIZ(badgeStruct)) {
            C29514BiA.LJFF(LJLILLLLZI(), "comment_area_user_comment", LJLJJL());
        }
    }

    @Override // X.CQK
    public final void LLIIIILZ(boolean z) {
        this.LJJIJIL = SystemClock.elapsedRealtime();
        if (!z) {
            C15610jN.LIZ().postDelayed(this.LJJJJLL, LiveBeingAtConfigSetting.getValue().flagReadThreshold);
        } else {
            LLILIL();
        }
    }
}
