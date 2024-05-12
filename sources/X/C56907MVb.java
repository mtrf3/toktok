package X;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MVb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56907MVb extends MVY {
    public final View LJLIL;
    public final AP9 LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;
    public final C62846OlW LJLJJL;
    public DuetNotice LJLJJLL;

    @Override // X.MVY
    public final User getUserFromNotice() {
        Aweme aweme;
        DuetNotice duetNotice = this.LJLJJLL;
        if (duetNotice != null && (aweme = duetNotice.getAweme()) != null) {
            return aweme.getAuthor();
        }
        return null;
    }

    @Override // X.MVV
    public final void reportShowEvent() {
        super.reportShowEvent();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null) {
            interfaceC56771MPv.vP(this.mMTBaseNotice, new AqS159S0100000_9(this, 472));
        }
    }

    public C56907MVb(View view) {
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
        TextView textView = (TextView) findViewById3;
        this.LJLJI = textView;
        View findViewById4 = view.findViewById(R.id.h4l);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.LJLJJI = (TextView) findViewById4;
        C62846OlW c62846OlW = (C62846OlW) view.findViewById(R.id.h4n);
        if (c62846OlW == null) {
            View findViewById5 = view.findViewById(R.id.h4p);
            o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.…notification_cover_right)");
            c62846OlW = (C62846OlW) findViewById5;
        }
        this.LJLJJL = c62846OlW;
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(findViewById, MVP.CELL, 0.0f);
            SmartAvatarImageView avatarImageView = ap9.getAvatarImageView();
            MVP mvp = MVP.AVATAR;
            MVR.LIZ(avatarImageView, mvp, 0.0f);
            MVR.LIZ(c62846OlW, mvp, C32151Nz.LJIIZILJ(2));
            MVR.LIZ(textView, MVP.USERNAME, 0.0f);
        } else {
            C56812MRk.LIZ(findViewById);
            C7FA.LIZIZ(ap9);
            C7FA.LIZIZ(c62846OlW);
        }
        if (C99W.LIZ) {
            c62846OlW.setCornerRadius(C32151Nz.LJIIZILJ(4));
        }
        C16880lQ.LJJJJJL(c62846OlW, this);
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJJJJJ(ap9, this);
        ap9.setRequestImgSize(J7H.LIZ(101));
    }

    @Override // X.MVV
    public final void applyNewCover(int i) {
        super.applyNewCover(i);
        C62846OlW c62846OlW = this.LJLJJL;
        if (c62846OlW != null) {
            applyCoverSize(i, c62846OlW);
        }
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
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017f, code lost:
    
        if (r5 == null) goto L67;
     */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r12) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56907MVb.onClick(android.view.View):void");
    }

    @Override // X.C56906MVa
    public final void setNotificationGuideBundle(int i) {
        UrlModel urlModel;
        Bundle LIZ = C141415gn.LIZ("from_where", i);
        LIZ.putString("username", this.LJLJI.getText().toString());
        DuetNotice duetNotice = this.LJLJJLL;
        if (duetNotice != null) {
            User fromUser = duetNotice.getFromUser();
            if (fromUser != null) {
                urlModel = fromUser.getAvatarThumb();
            } else {
                urlModel = null;
            }
            LIZ.putString("content", this.mContext.getString(R.string.iwe));
            LIZ.putSerializable("avatar_thumb", urlModel);
        }
        this.mNotificationGuideBundle = LIZ;
        this.isRecordNotificationGuideInto = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x015e, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56907MVb.M(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice, boolean):void");
    }
}
