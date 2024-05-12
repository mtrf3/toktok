package com.ss.android.ugc.aweme.inbox.skylight.template;

import X.C116114h5;
import X.C16880lQ;
import X.C71799SFv;
import X.C78939UyV;
import X.ORZ;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SkylightFriendPostNormalCell extends PowerCell<C116114h5> {
    public C71799SFv LJLIL;
    public TuxTextView LJLILLLLZI;
    public ImageView LJLJI;
    public Aweme LJLJJI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.tx;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r1 == true) goto L22;
     */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewAttachedToWindow() {
        /*
            r9 = this;
            r2 = r9
            super.onViewAttachedToWindow()
            X.Mm4 r0 = r2.getItem()
            X.4h5 r0 = (X.C116114h5) r0
            r4 = 0
            if (r0 == 0) goto L13
            X.2ao r0 = r0.LJLIL
            if (r0 == 0) goto L13
            java.lang.String r4 = r0.LIZ
        L13:
            X.Mm4 r0 = r2.getItem()
            X.4h5 r0 = (X.C116114h5) r0
            if (r0 == 0) goto L64
            X.2ao r0 = r0.LJLIL
            if (r0 == 0) goto L64
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.LIZJ
            if (r0 == 0) goto L64
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L64
            int r5 = r0.getFollowStatus()
        L2f:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            X.Mm4 r0 = r2.getItem()
            X.4h5 r0 = (X.C116114h5) r0
            if (r0 == 0) goto L62
            X.2ao r0 = r0.LJLIL
            if (r0 == 0) goto L62
            boolean r1 = r0.LIZIZ
            r0 = 1
            if (r1 != r0) goto L62
        L45:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_read"
            r7.put(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.LJLJJI
            if (r0 == 0) goto L58
            java.lang.String r6 = r0.getGroupId()
            if (r6 != 0) goto L5a
        L58:
            java.lang.String r6 = ""
        L5a:
            java.lang.String r3 = "post"
            r8 = 18
            X.C77357UXp.LJJIJIIJIL(r2, r3, r4, r5, r6, r7, r8)
            return
        L62:
            r0 = 0
            goto L45
        L64:
            r5 = -1
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.skylight.template.SkylightFriendPostNormalCell.onViewAttachedToWindow():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r2 == true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            r7 = this;
            X.Mm4 r1 = r7.getItem()
            X.4h5 r1 = (X.C116114h5) r1
            r0 = 0
            if (r1 == 0) goto L6b
            X.2ao r1 = r1.LJLIL
            if (r1 == 0) goto L6b
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r6 = r1.LIZJ
        Lf:
            X.Mm4 r1 = r7.getItem()
            X.4h5 r1 = (X.C116114h5) r1
            r5 = 0
            if (r1 == 0) goto L69
            X.2ao r1 = r1.LJLIL
            if (r1 == 0) goto L69
            boolean r2 = r1.LIZIZ
            r1 = 1
            if (r2 != r1) goto L69
        L21:
            java.lang.String r4 = "badgeView"
            if (r1 == 0) goto L39
            android.widget.ImageView r2 = r7.LJLJI
            if (r2 == 0) goto L6d
            r1 = 8
            r2.setVisibility(r1)
            if (r6 == 0) goto L36
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r5, r6)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
        L36:
            r7.LJLJJI = r0
            return
        L39:
            android.widget.ImageView r3 = r7.LJLJI
            if (r3 == 0) goto L75
            android.content.Context r2 = r3.getContext()
            r1 = 2131231217(0x7f0801f1, float:1.8078509E38)
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r1)
            r3.setImageDrawable(r1)
            android.widget.ImageView r1 = r7.LJLJI
            if (r1 == 0) goto L71
            r1.setVisibility(r5)
            if (r6 == 0) goto L36
            X.Mm4 r0 = r7.getItem()
            X.4h5 r0 = (X.C116114h5) r0
            if (r0 == 0) goto L62
            X.2ao r0 = r0.LJLIL
            if (r0 == 0) goto L62
            int r5 = r0.LJ
        L62:
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r5, r6)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            goto L36
        L69:
            r1 = 0
            goto L21
        L6b:
            r6 = r0
            goto Lf
        L6d:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r0
        L71:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r0
        L75:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.skylight.template.SkylightFriendPostNormalCell.L():void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.acf);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.avatar_iv)");
        this.LJLIL = (C71799SFv) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.gw7);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.name_tv)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.afu);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.badge_iv)");
        this.LJLJI = (ImageView) findViewById3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C116114h5 c116114h5) {
        User author;
        C116114h5 t = c116114h5;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        Aweme aweme = (Aweme) ORZ.LJLLLL(t.LJLIL.LIZJ);
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            return;
        }
        C71799SFv c71799SFv = this.LJLIL;
        if (c71799SFv != null) {
            C71799SFv.LJIIJ(c71799SFv, C78939UyV.LJ(author.getAvatarMedium()), null, false, null, 126);
            TuxTextView tuxTextView = this.LJLILLLLZI;
            if (tuxTextView != null) {
                tuxTextView.setText(author.getNickname());
                L();
                C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 167), this.itemView);
                return;
            }
            o.LJIJI("userName");
            throw null;
        }
        o.LJIJI("avatarView");
        throw null;
    }
}
