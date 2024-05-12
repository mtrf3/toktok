package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MVl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56917MVl extends MVY {
    public final View LJLIL;
    public final AP9 LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final TextView LJLJJI;
    public FollowApproveNotice LJLJJL;

    @Override // X.MVY
    public final User getUserFromNotice() {
        FollowApproveNotice followApproveNotice = this.LJLJJL;
        if (followApproveNotice != null) {
            return followApproveNotice.getUser();
        }
        return null;
    }

    @Override // X.MVV
    public final void reportShowEvent() {
        super.reportShowEvent();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null) {
            interfaceC56771MPv.vP(this.mMTBaseNotice, new AqS159S0100000_9(this, 434));
        }
    }

    public C56917MVl(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.h5p);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.notification_root)");
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.h4v);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.notification_head)");
        AP9 ap9 = (AP9) findViewById2;
        this.LJLILLLLZI = ap9;
        View findViewById3 = view.findViewById(R.id.h5f);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.notification_name)");
        TuxTextView tuxTextView = (TuxTextView) findViewById3;
        this.LJLJI = tuxTextView;
        View findViewById4 = view.findViewById(R.id.h4l);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.LJLJJI = (TextView) findViewById4;
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(findViewById, MVP.CELL, 0.0f);
            MVR.LIZ(ap9.getAvatarImageView(), MVP.AVATAR, 0.0f);
            MVR.LIZ(tuxTextView, MVP.USERNAME, 0.0f);
        } else {
            C56812MRk.LIZ(findViewById);
            C7FA.LIZIZ(ap9);
        }
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJJJJJ(ap9, this);
    }

    @Override // X.MVY, X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLILLLLZI);
        applyTitleSize(c96533qb, this.LJLJI);
        applyContentColor(c96533qb, this.LJLJJI);
        if (c96533qb != null && c96533qb.LJFF == 16) {
            resetViewTopMargin(this.LJLJJI, MVV.NEW_CONTENT_TITLE_SPACE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L5;
     */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            X.EF7.LIZIZ()
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> Lb
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> Lb
            if (r0 != 0) goto L29
        Lb:
            X.MGN r0 = X.MGN.LJLILLLLZI
            boolean r0 = r0.isStandardUIEnable()
            if (r0 != 0) goto L29
            X.AKb r2 = new X.AKb
            android.view.View r1 = r6.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            r0 = 2131833361(0x7f113211, float:1.9299802E38)
            r2.LJIIIIZZ(r0)
            r2.LJIIJ()
            return
        L29:
            r6.onItemClick()
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r0 = r6.mMTBaseNotice
            java.lang.String r2 = r0.getAccountType()
            int r1 = r6.mPosition
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice r0 = r6.LJLJJL
            r5 = 0
            if (r0 == 0) goto L86
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
        L3d:
            r6.logNotificationClick(r2, r1, r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice r0 = r6.LJLJJL
            if (r0 == 0) goto L51
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.getUser()
            if (r1 == 0) goto L51
            com.ss.android.ugc.aweme.profile.util.IUserProfilePreload r0 = com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper.LJIIIIZZ()
            r0.LIZJ(r1)
        L51:
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice r0 = r6.LJLJJL
            if (r0 == 0) goto L80
            com.ss.android.ugc.aweme.profile.model.User r4 = r0.getUser()
            if (r4 == 0) goto L80
            java.lang.String r3 = r4.getUid()
            java.lang.String r2 = r4.getSecUid()
            r0 = 1
            java.util.HashMap r1 = X.C56906MVa.buildOpenAwemeLogExtra$default(r6, r5, r0, r5)
            java.lang.String r0 = "message"
            X.C78857UxB.LJJIFFI(r3, r2, r0, r1)
            java.lang.String r2 = r4.getUid()
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r0 = r6.mMTBaseNotice
            if (r0 == 0) goto L79
            java.lang.String r5 = r0.getAccountType()
        L79:
            java.lang.String r1 = "notification_page"
            java.lang.String r0 = "click_head"
            X.ViewOnClickListenerC56908MVc.logEnterPersonalDetail(r2, r1, r0, r5)
        L80:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r0 = r6.mMTBaseNotice
            r6.markHasRead(r0)
            return
        L86:
            r0 = r5
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56917MVl.onClick(android.view.View):void");
    }

    public final void M(MusNotice notice, boolean z) {
        boolean z2;
        o.LJIIIZ(notice, "notice");
        FollowApproveNotice followApproveNotice = notice.followApproveNotice;
        if (followApproveNotice == null) {
            return;
        }
        this.LJLJJL = followApproveNotice;
        User user = followApproveNotice.getUser();
        if (user != null) {
            this.LJLILLLLZI.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
            this.LJLILLLLZI.LIZ();
            TuxTextView tuxTextView = this.LJLJI;
            tuxTextView.LJLLJ = true;
            C56906MVa.setClickableNameText$default(this, tuxTextView, user, null, null, null, 28, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.mContext.getResources().getString(R.string.iw9));
            addCreateTimeSpan(spannableStringBuilder, notice);
            this.LJLJJI.setText(spannableStringBuilder);
            this.mTvNameAppendContainer.setVisibility(8);
            C57446Mgc c57446Mgc = this.nameAppendFollowText;
            C7YW c7yw = new C7YW();
            c7yw.LIZ = user;
            c7yw.LIZIZ(EnumC57119MbL.NORMAL);
            c7yw.LJFF = requireLifeCycleOwner();
            c57446Mgc.LJLILLLLZI.LJJJJJL(c7yw.LIZ());
            C57434MgQ.LIZIZ.contains(Integer.valueOf(user.getFollowStatus()));
            C57446Mgc nameAppendFollowText = this.nameAppendFollowText;
            o.LJIIIIZZ(nameAppendFollowText, "nameAppendFollowText");
            C26338AVi.LJI(nameAppendFollowText, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), null, null, null, false, 30);
            C57446Mgc nameAppendFollowText2 = this.nameAppendFollowText;
            o.LJIIIIZZ(nameAppendFollowText2, "nameAppendFollowText");
            ctrlFollowTextVisibilityAndMob$awemenotice_release(nameAppendFollowText2, "follow", C47261Igj.LJJIJ(user), true);
            TuxTextView tuxTextView2 = this.LJLJI;
            if (this.mTvNameAppendContainer.getVisibility() == 0 || this.nameAppendFollowText.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C56906MVa.resetTitleMaxLine$default(this, tuxTextView2, z2, false, 4, null);
        }
        MVY.checkAndGetStory$default(this, false, 1, null);
        markUnreadIfNeed(notice.hasRead, this.itemView, z);
    }
}
