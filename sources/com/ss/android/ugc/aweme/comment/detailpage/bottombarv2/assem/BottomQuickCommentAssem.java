package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem;

import X.C176996x5;
import X.C177056xB;
import X.C177156xL;
import X.C178316zD;
import X.C178566zc;
import X.C178616zh;
import X.C178626zi;
import X.C221108m2;
import X.C224748ru;
import X.C62822Ol8;
import X.C74Z;
import X.C76T;
import X.C7AL;
import X.EnumC177736yH;
import X.InterfaceC178516zX;
import X.ORZ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BottomQuickCommentAssem extends AbstractBottomInputPriorityComponent {
    public C76T LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "quick_comment";
    }

    public BottomQuickCommentAssem() {
        new LinkedHashMap();
        this.LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 90));
        this.LJLJLJ = C221108m2.LIZIZ(C178566zc.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void H3() {
        Aweme aweme;
        C76T c76t = this.LJLJJLL;
        if (c76t != null) {
            boolean z = false;
            if (getAweme() != null && (aweme = getAweme()) != null && aweme.isProhibited()) {
                z = true;
            }
            c76t.setEditStatus(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomInputPriorityComponent
    public final C177056xB M3() {
        C224748ru c224748ru;
        C76T c76t = this.LJLJJLL;
        String str = null;
        if (c76t != null) {
            c224748ru = c76t.getEditText();
        } else {
            c224748ru = null;
        }
        String x3 = x3();
        String enterFrom = getEnterFrom();
        Aweme aweme = getAweme();
        if (aweme != null) {
            str = aweme.getAuthorUid();
        }
        return new C177056xB(c224748ru, c224748ru, (TuxIconView) null, (TuxIconView) null, (TuxIconView) null, (TextView) null, x3, enterFrom, (EnumC177736yH) null, str, 768);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomInputPriorityComponent
    public final void O3() {
        C76T c76t = this.LJLJJLL;
        if (c76t != null) {
            c76t.LJJLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomInputPriorityComponent
    public final void Q3() {
        C76T c76t;
        C76T c76t2 = this.LJLJJLL;
        if (c76t2 != null) {
            c76t2.LJJLL();
        }
        C176996x5 EJ = EJ();
        if (EJ != null && EJ.LJI() && (c76t = this.LJLJJLL) != null) {
            c76t.LJJZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void E3() {
        View containerView = getContainerView();
        if ((containerView instanceof ViewGroup) && containerView.findViewById(R.id.ikm) == null) {
            ViewGroup viewGroup = (ViewGroup) containerView;
            Context context = viewGroup.getContext();
            o.LJIIIIZZ(context, "view.context");
            C76T c76t = new C76T(context, null, 0);
            c76t.setId(R.id.ikm);
            c76t.setOnEdit(new C178626zi(this));
            c76t.setOnClickEmoji(new C178616zh(this));
            this.LJLJJLL = c76t;
            viewGroup.addView(this.LJLJJLL, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomInputPriorityComponent
    public final void L3() {
        DetailBottomBarAbility A3 = A3();
        if (A3 != null) {
            A3.IT();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarProtocol
    public final boolean LJJLIIJ() {
        return C178316zD.LIZ(getAweme());
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void X5() {
        Aweme aweme = getAweme();
        boolean z = false;
        if (aweme != null && aweme.isProhibited()) {
            z = true;
        }
        C76T c76t = this.LJLJJLL;
        if (c76t != null) {
            c76t.setEditStatus(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void I3(boolean z) {
        C76T c76t = this.LJLJJLL;
        if (c76t != null) {
            c76t.setEditable(!z);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomInputPriorityComponent
    public final void onCommentInputPublishStart(Comment comment) {
        int i;
        if (comment == null) {
            return;
        }
        super.onCommentInputPublishStart(comment);
        String text = comment.getText();
        if (text != null) {
            String text2 = comment.getText();
            if (text2 != null) {
                i = text2.length();
            } else {
                i = 0;
            }
            String substring = text.substring(0, i / 3);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            C7AL c7al = ((InterfaceC178516zX) this.LJLJLJ.getValue()).get(x3());
            Set LLJILLL = ORZ.LLJILLL(c7al.LJLJI);
            LLJILLL.add(substring);
            ((InterfaceC178516zX) this.LJLJLJ.getValue()).LIZ(x3(), C7AL.L(c7al, false, false, LLJILLL, 3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x007f, code lost:
    
        if (r9 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v3(X.M89 r9) {
        /*
            r8 = this;
            int r0 = X.C7DU.LIZ()
            r1 = 2
            r0 = r0 & 2
            r7 = 0
            r4 = 1
            if (r0 != r1) goto Lc
            return r7
        Lc:
            X.Ol8 r0 = X.C181497Aj.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 3
            if (r1 != r0) goto L86
            r6 = 1
        L1c:
            if (r9 == 0) goto L84
            boolean r0 = r9.isFromPostList()
            if (r0 != r4) goto L84
            r0 = 1
        L25:
            java.lang.String r5 = "others_homepage"
            if (r0 == 0) goto L7e
            java.lang.String r0 = r9.getEventType()
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r0)
            if (r0 == 0) goto L7e
            r3 = 1
        L34:
            boolean r0 = r9.isStoryPage()
            if (r0 != r4) goto L82
            java.lang.String r1 = "chat_list"
            java.lang.String r0 = r9.getEventType()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L82
            r2 = 1
        L47:
            r1 = 0
            if (r9 == 0) goto L7c
            java.lang.String r0 = r9.getEventType()
        L4e:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r5)
            if (r0 != 0) goto L62
            if (r9 == 0) goto L5a
            java.lang.String r1 = r9.getEventType()
        L5a:
            java.lang.String r0 = "homepage_hot"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L7a
        L62:
            r1 = 1
        L63:
            if (r9 == 0) goto L78
            boolean r0 = r9.isChain()
            if (r0 != r4) goto L78
            if (r1 == 0) goto L78
            r0 = 1
        L6e:
            if (r6 == 0) goto L77
            if (r3 != 0) goto L76
            if (r2 != 0) goto L76
            if (r0 == 0) goto L77
        L76:
            r7 = 1
        L77:
            return r7
        L78:
            r0 = 0
            goto L6e
        L7a:
            r1 = 0
            goto L63
        L7c:
            r0 = r1
            goto L4e
        L7e:
            r3 = 0
            if (r9 == 0) goto L82
            goto L34
        L82:
            r2 = 0
            goto L47
        L84:
            r0 = 0
            goto L25
        L86:
            r6 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomQuickCommentAssem.v3(X.M89):boolean");
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomInputPriorityComponent
    public final void P3(int i, int i2, CharSequence content, C177156xL eventTrackingBundle) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(eventTrackingBundle, "eventTrackingBundle");
        Aweme aweme = getAweme();
        if (aweme != null) {
            C74Z.LJJI(aweme, content, getEnterFrom(), "", null, null, null, String.valueOf(i2), "click_quick_panel", i, null, eventTrackingBundle, -134219264);
        }
    }
}
