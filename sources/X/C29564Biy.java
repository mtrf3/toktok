package X;

import Y.ACListenerS25S0100000_5;
import Y.ACListenerS31S0300000_5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.livesdk.livesetting.publicscreen.CapsuleViewExpandDisable;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Biy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29564Biy extends CSX<C29568Bj2> {
    public final View LJLJLLL;
    public final ImageView LJLL;
    public final C47121t6 LJLLI;
    public final C47121t6 LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29564Biy(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.bst);
        o.LJIIIIZZ(findViewById, "itemView.findViewById<View>(R.id.content)");
        this.LJLJLLL = findViewById;
        View findViewById2 = itemView.findViewById(R.id.brd);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.connect)");
        this.LJLL = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.e0n);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.guide_content)");
        this.LJLLI = (C47121t6) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.erq);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.invite)");
        this.LJLLILLLL = (C47121t6) findViewById4;
    }

    @Override // X.CSF
    public final void L(CQQ cqq, CRD crd) {
        LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide linkMicAudienceInviteGuide;
        int followStatus;
        CQO model = (CQO) crd;
        o.LJIIIZ(model, "model");
        LinkMicAudienceNoticeMessage linkMicAudienceNoticeMessage = (LinkMicAudienceNoticeMessage) model.LJIJJLI;
        int i = linkMicAudienceNoticeMessage.noticeType;
        if (i == 0) {
            LinkMicAudienceNoticeMessage.LinkMicAudienceTurnOnGuide linkMicAudienceTurnOnGuide = linkMicAudienceNoticeMessage.turnOnGuide;
            if (linkMicAudienceTurnOnGuide == null || linkMicAudienceTurnOnGuide.content == null || linkMicAudienceTurnOnGuide.buttonContent == null) {
                return;
            }
            this.LJLL.setImageResource(R.drawable.cue);
            this.LJLLI.setText(linkMicAudienceTurnOnGuide.content.text);
            this.LJLLILLLL.setText(linkMicAudienceTurnOnGuide.buttonContent.text);
            ACListenerS25S0100000_5 aCListenerS25S0100000_5 = new ACListenerS25S0100000_5(cqq, 397);
            if (CapsuleViewExpandDisable.INSTANCE.disable()) {
                C16880lQ.LJJIIZ(this.LJLLILLLL, aCListenerS25S0100000_5);
            } else {
                C16880lQ.LJIIJ(aCListenerS25S0100000_5, this.LJLJLLL);
            }
            C0Y4.LIZ("livesdk_anchor_invite_guest_popup_show");
            return;
        }
        if (i != 1 || (linkMicAudienceInviteGuide = linkMicAudienceNoticeMessage.inviteGuide) == null || linkMicAudienceInviteGuide.user == null || linkMicAudienceInviteGuide.user.getAvatarThumb() == null || linkMicAudienceInviteGuide.buttonContent == null || linkMicAudienceInviteGuide.content == null) {
            return;
        }
        long id = linkMicAudienceInviteGuide.user.getId();
        EnumC74778TWk LIZLLL = CL8.LIZLLL();
        FollowInfo followInfo = linkMicAudienceInviteGuide.user.getFollowInfo();
        if (followInfo == null) {
            followStatus = 0;
        } else {
            followStatus = (int) followInfo.getFollowStatus();
        }
        C75017TcL.LJIJJ(followStatus, id, LIZLLL, false);
        this.LJLJLLL.setBackgroundResource(R.drawable.cg6);
        ViewGroup.LayoutParams layoutParams = this.LJLL.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = C15380j0.LIZ(32.0f);
        marginLayoutParams.height = C15380j0.LIZ(32.0f);
        marginLayoutParams.leftMargin = C15380j0.LIZ(8.0f);
        marginLayoutParams.rightMargin = C15380j0.LIZ(8.0f);
        this.LJLL.setLayoutParams(marginLayoutParams);
        C31665Cbl.LJIIJ(this.LJLL, linkMicAudienceInviteGuide.user.getAvatarThumb(), this.LJLL.getWidth(), this.LJLL.getHeight(), R.drawable.cuk);
        this.LJLLI.setText(linkMicAudienceInviteGuide.content.text);
        this.LJLLILLLL.setText(linkMicAudienceInviteGuide.buttonContent.text);
        ACListenerS31S0300000_5 aCListenerS31S0300000_5 = new ACListenerS31S0300000_5(linkMicAudienceInviteGuide, this, cqq, 34);
        if (CapsuleViewExpandDisable.INSTANCE.disable()) {
            C16880lQ.LJJIIZ(this.LJLLILLLL, aCListenerS31S0300000_5);
        } else {
            C16880lQ.LJIIJ(aCListenerS31S0300000_5, this.LJLJLLL);
        }
    }
}
