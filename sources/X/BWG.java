package X;

import Y.ACListenerS25S0100000_5;
import Y.ACListenerS31S0300000_5;
import Y.ACListenerS40S0200000_5;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.model.message.QuestionMessage;
import com.bytedance.android.livesdk.qa.CurrentQuestionPinChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BWG extends CSX<BWH> {
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public DataChannel LJLLILLLL;
    public Question LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BWG(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        C29306Beo.LIZIZ(itemView.getContext());
    }

    public final void P(Question question) {
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_qa_question_pin");
        LIZ.LJIIZILJ();
        C30869C9p.LIZ(question.questionId, LIZ, "question_id");
        DataChannel dataChannel = this.LJLLILLLL;
        if (dataChannel != null) {
            dataChannel.rv0(CurrentQuestionPinChannel.class, question);
        }
    }

    @Override // X.CSF
    public final void L(CQQ cqq, CRD crd) {
        User user;
        boolean z;
        boolean z2;
        int i;
        List<String> urls;
        User user2;
        UserAttr userAttr;
        Boolean bool;
        Boolean bool2;
        BWH model = (BWH) crd;
        o.LJIIIZ(model, "model");
        this.LJLLILLLL = cqq.LJIIIIZZ;
        Question question = ((QuestionMessage) model.LJIJJLI).question;
        if (question == null || (user = model.getUser()) == null) {
            return;
        }
        DataChannel dataChannel = this.LJLLILLLL;
        if (dataChannel != null && (bool2 = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        this.LJLL = z;
        DataChannel dataChannel2 = this.LJLLILLLL;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(BCW.class)) != null) {
            bool.booleanValue();
        }
        DataChannel dataChannel3 = this.LJLLILLLL;
        if (dataChannel3 != null && (user2 = (User) dataChannel3.kv0(RoomUserChannel.class)) != null && (userAttr = user2.getUserAttr()) != null) {
            z2 = userAttr.isAdmin;
        } else {
            z2 = false;
        }
        this.LJLLI = z2;
        this.LJLLJ = question;
        ((LiveIconView) this.itemView.findViewById(R.id.ijz)).setIconAttr(R.attr.av8);
        C47121t6 c47121t6 = (C47121t6) this.itemView.findViewById(R.id.gvs);
        CQQ cqq2 = this.LJLILLLLZI;
        if (cqq2 != null) {
            o.LJIIIIZZ(c47121t6, "this");
            cqq2.LIZ(c47121t6);
        }
        if (((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).m90() != null) {
            i = R.color.aao;
        } else {
            i = 0;
        }
        SpannableString spannableString = new SpannableString(C15380j0.LJIILL(R.string.ko8, C05170If.LIZ(user)));
        spannableString.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(i)), 0, spannableString.length(), 18);
        c47121t6.setText(spannableString);
        C16880lQ.LJJIIZ(c47121t6, new ACListenerS40S0200000_5(user, this, 41));
        c47121t6.setHighlightColor(0);
        DataChannel dataChannel4 = this.LJLLILLLL;
        C47121t6 c47121t62 = (C47121t6) this.itemView.findViewById(R.id.bst);
        CQQ cqq3 = this.LJLILLLLZI;
        if (cqq3 != null) {
            o.LJIIIIZZ(c47121t62, "this");
            cqq3.LIZ(c47121t62);
        }
        c47121t62.setText(question.content);
        if (!BV1.LJ(dataChannel4) || (BV1.LJ(dataChannel4) && BV1.LIZLLL(dataChannel4))) {
            C16880lQ.LJJIIZ(c47121t62, new ACListenerS25S0100000_5(dataChannel4, 304));
        }
        c47121t62.setOnLongClickListener(new ViewOnLongClickListenerC28867BUp(question, dataChannel4, this));
        if (this.LJLL) {
            if (!BV1.LJ(this.LJLLILLLL) || BV1.LIZLLL(this.LJLLILLLL)) {
                LiveIconView liveIconView = (LiveIconView) this.itemView.findViewById(R.id.fqt);
                ((LiveIconView) this.itemView.findViewById(R.id.fqt)).setIconAttr(R.attr.av2);
                liveIconView.setVisibility(0);
                C16880lQ.LJJII(liveIconView, new ACListenerS31S0300000_5(this, question, cqq, 23));
            }
        } else {
            LiveIconView liveIconView2 = (LiveIconView) this.itemView.findViewById(R.id.fqt);
            liveIconView2.setVisibility(0);
            C16880lQ.LJJII(liveIconView2, new ACListenerS40S0200000_5(question, this, 40));
        }
        if (!this.LJLJJI || cqq.LJFF) {
            ImageModel avatarThumb = user.getAvatarThumb();
            if (avatarThumb != null && (urls = avatarThumb.getUrls()) != null && !urls.isEmpty()) {
                C31665Cbl.LJ(user.getAvatarThumb(), (C47061t0) this.itemView.findViewById(R.id.ijn));
            } else {
                ((W5G) this.itemView.findViewById(R.id.ijn)).setImageResource(R.drawable.d2a);
            }
            C16880lQ.LJJI((C47061t0) this.itemView.findViewById(R.id.ijn), new ACListenerS40S0200000_5(user, this, 39));
        } else {
            ((ImageView) this.itemView.findViewById(R.id.ijn)).setVisibility(8);
        }
        if (user.getId() != ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            return;
        }
        C0Y4.LIZ("livesdk_audience_qa_message");
    }

    public final void N(User user, String str) {
        long j;
        String str2;
        C73943T0h LIZ = C73943T0h.LIZ();
        UserProfileEvent userProfileEvent = new UserProfileEvent(user);
        Question question = this.LJLLJ;
        if (question != null) {
            j = question.questionId;
        } else {
            j = 0;
        }
        userProfileEvent.msgId = j;
        if (question != null) {
            str2 = question.content;
        } else {
            str2 = null;
        }
        userProfileEvent.content = str2;
        userProfileEvent.chatType = "3";
        userProfileEvent.mReportType = "report_question";
        userProfileEvent.setClickModule(str);
        userProfileEvent.setClickUserPosition("qa_comment");
        LIZ.LIZIZ(userProfileEvent);
    }
}
