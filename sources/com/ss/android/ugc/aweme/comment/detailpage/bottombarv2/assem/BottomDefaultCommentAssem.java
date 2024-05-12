package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem;

import X.AnonymousClass636;
import X.C018905p;
import X.C16880lQ;
import X.C175276uJ;
import X.C176996x5;
import X.C177056xB;
import X.C177156xL;
import X.C177216xR;
import X.C177326xc;
import X.C1793872g;
import X.C221108m2;
import X.C224748ru;
import X.C62822Ol8;
import X.C74Z;
import X.C77321UWf;
import X.C79045V0n;
import X.EnumC177736yH;
import X.HG3;
import X.M89;
import X.RBX;
import X.X1D;
import Y.ACListenerS23S0100000_3;
import Y.IDCSpanS29S0100000_3;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import defpackage.q;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BottomDefaultCommentAssem extends AbstractBottomInputPriorityComponent {
    public C177326xc LJLJJLL;
    public C224748ru LJLJL;
    public TuxIconView LJLJLJ;
    public TuxIconView LJLJLLL;
    public TuxIconView LJLL;
    public TuxIconView LJLLI;
    public TuxIconView LJLLILLLL;
    public TuxTextView LJLLJ;
    public final C62822Ol8 LJLLL;
    public String LJLLLL;

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarProtocol
    public final boolean LJJLIIJ() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomInputPriorityComponent
    public final void O3() {
        W3(this, false, false);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final boolean v3(M89 m89) {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "default_comment";
    }

    public BottomDefaultCommentAssem() {
        new LinkedHashMap();
        this.LJLLL = C221108m2.LIZIZ(C177216xR.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void E3() {
        Editable editable;
        C176996x5 EJ;
        String str;
        C224748ru c224748ru = this.LJLJL;
        String str2 = null;
        if (c224748ru != null) {
            editable = c224748ru.getText();
        } else {
            editable = null;
        }
        boolean z = true;
        if ((editable == null || editable.length() == 0) && ((EJ = EJ()) == null || EJ.LJZL == null)) {
            z = false;
        }
        W3(this, false, z);
        if (C77321UWf.LIZLLL(getAweme(), false)) {
            Aweme aweme = getAweme();
            if (aweme != null) {
                str2 = aweme.getAid();
            }
            if (!o.LJ(str2, this.LJLLLL)) {
                C74Z.LJJIIJ(getEnterFrom());
                Aweme aweme2 = getAweme();
                if (aweme2 == null || (str = aweme2.getAid()) == null) {
                    str = "";
                }
                this.LJLLLL = str;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomInputPriorityComponent
    public final C177056xB M3() {
        String str;
        View findViewById = getContainerView().findViewById(R.id.fi1);
        C224748ru c224748ru = this.LJLJL;
        TuxIconView tuxIconView = this.LJLJLJ;
        TuxIconView tuxIconView2 = this.LJLL;
        TuxIconView tuxIconView3 = this.LJLJLLL;
        TextView textView = (TextView) getContainerView().findViewById(R.id.bjt);
        String x3 = x3();
        String enterFrom = getEnterFrom();
        EnumC177736yH enumC177736yH = EnumC177736yH.DEFAULT;
        Aweme aweme = getAweme();
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        return new C177056xB(findViewById, c224748ru, tuxIconView, tuxIconView2, tuxIconView3, textView, x3, enterFrom, enumC177736yH, str, 256);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomInputPriorityComponent
    public final void Q3() {
        boolean z;
        C176996x5 EJ;
        C224748ru c224748ru = this.LJLJL;
        Editable editable = null;
        if (c224748ru != null) {
            editable = c224748ru.getText();
        }
        if (!TextUtils.isEmpty(editable) || ((EJ = EJ()) != null && EJ.LJZL != null)) {
            z = true;
        } else {
            z = false;
        }
        U3(false, false, z);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void H3() {
        C176996x5 EJ;
        Editable text;
        boolean z = true;
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            C224748ru c224748ru = this.LJLJL;
            if (c224748ru != null) {
                c224748ru.setFocusable(false);
            }
        } else {
            C224748ru c224748ru2 = this.LJLJL;
            if (c224748ru2 != null) {
                c224748ru2.setFocusable(true);
            }
            C224748ru c224748ru3 = this.LJLJL;
            if (c224748ru3 != null) {
                c224748ru3.setFocusableInTouchMode(true);
            }
            C224748ru c224748ru4 = this.LJLJL;
            if (c224748ru4 != null) {
                c224748ru4.requestFocus();
            }
        }
        Aweme aweme = getAweme();
        if (aweme != null && aweme.isProhibited()) {
            C224748ru c224748ru5 = this.LJLJL;
            if (c224748ru5 != null) {
                c224748ru5.setEnabled(false);
            }
            C224748ru c224748ru6 = this.LJLJL;
            if (c224748ru6 != null) {
                c224748ru6.setHint(R.string.dkl);
                return;
            }
            return;
        }
        C224748ru c224748ru7 = this.LJLJL;
        if (c224748ru7 != null) {
            c224748ru7.setEnabled(true);
        }
        C176996x5 EJ2 = EJ();
        if (EJ2 != null) {
            EJ2.LJJJLL();
        }
        C224748ru c224748ru8 = this.LJLJL;
        if ((c224748ru8 == null || (text = c224748ru8.getText()) == null || text.length() == 0) && ((EJ = EJ()) == null || EJ.LJZL == null)) {
            z = false;
        }
        W3(this, false, z);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomInputPriorityComponent
    public final void R3() {
        long j;
        List<CommentImageModel> list;
        Aweme aweme;
        Aweme aweme2;
        AwemeStatistics statistics;
        if (getAweme() != null && (aweme = getAweme()) != null && aweme.getStatistics() != null && (aweme2 = getAweme()) != null && (statistics = aweme2.getStatistics()) != null) {
            j = statistics.getCommentCount();
        } else {
            j = 0;
        }
        C1793872g.LJII(getEnterFrom(), getAweme(), "", "bottom_comment_box", null, j, 1);
        Aweme aweme3 = getAweme();
        if (aweme3 != null && C77321UWf.LIZLLL(aweme3, false)) {
            C176996x5 EJ = EJ();
            if (EJ == null || (list = EJ.LJZL) == null || list.isEmpty()) {
                C74Z.LJJIIJ(getEnterFrom());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void X5() {
        Editable text;
        Aweme aweme = getAweme();
        boolean z = true;
        if (aweme != null && aweme.isProhibited()) {
            C224748ru c224748ru = this.LJLJL;
            if (c224748ru != null) {
                c224748ru.setEnabled(false);
            }
            C224748ru c224748ru2 = this.LJLJL;
            if (c224748ru2 != null) {
                c224748ru2.setHint(R.string.dkl);
                return;
            }
            return;
        }
        C224748ru c224748ru3 = this.LJLJL;
        if (c224748ru3 != null) {
            c224748ru3.setEnabled(true);
        }
        C176996x5 EJ = EJ();
        if (EJ != null) {
            EJ.LJJJLL();
        }
        C224748ru c224748ru4 = this.LJLJL;
        if (c224748ru4 == null || (text = c224748ru4.getText()) == null || text.length() <= 0) {
            z = false;
        }
        W3(this, z, false);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void I3(boolean z) {
        C224748ru c224748ru = this.LJLJL;
        if (c224748ru == null) {
            return;
        }
        c224748ru.setEnabled(!z);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer LJI;
        String str;
        int i;
        String string;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            C16880lQ.LLLZIIL(R.layout.p_, C16880lQ.LLZIL(viewGroup.getContext()), viewGroup).setId(R.id.c8x);
        }
        this.LJLJL = (C224748ru) view.findViewById(R.id.bk7);
        this.LJLJLJ = (TuxIconView) view.findViewById(R.id.ey8);
        this.LJLJLLL = (TuxIconView) view.findViewById(R.id.f3r);
        this.LJLL = (TuxIconView) view.findViewById(R.id.f2i);
        this.LJLLI = (TuxIconView) view.findViewById(R.id.f59);
        this.LJLLILLLL = (TuxIconView) view.findViewById(R.id.blk);
        this.LJLLJ = (TuxTextView) view.findViewById(R.id.blf);
        TextView textView = (TextView) view.findViewById(R.id.bjt);
        if (textView != null) {
            StringBuilder LIZ = X1D.LIZ();
            Context context = getContext();
            String str2 = "";
            if (context == null || (str = context.getString(R.string.dj2)) == null) {
                str = "";
            }
            String LIZIZ = q.LIZIZ(LIZ, str, ' ', LIZ);
            Context context2 = getContext();
            if (context2 != null && (string = context2.getString(R.string.tqv)) != null) {
                str2 = string;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i0.LJFF(LIZIZ, str2));
            spannableStringBuilder.setSpan(new IDCSpanS29S0100000_3(this, 5), LIZIZ.length(), spannableStringBuilder.length(), 18);
            Context context3 = getContext();
            if (context3 != null) {
                i = AnonymousClass636.LJIIIIZZ(R.attr.dj, context3);
            } else {
                i = 0;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), LIZIZ.length(), spannableStringBuilder.length(), 18);
            spannableStringBuilder.setSpan(new StyleSpan(1), LIZIZ.length(), spannableStringBuilder.length(), 18);
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(new LinkMovementMethod());
        }
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.bk5);
        if (viewGroup2 != null) {
            this.LJLJJLL = new C177326xc(viewGroup2);
        }
        C177326xc c177326xc = this.LJLJJLL;
        if (c177326xc != null) {
            c177326xc.LJ(0, false);
        }
        C224748ru c224748ru = this.LJLJL;
        if (c224748ru != null) {
            c224748ru.setCursorVisible(false);
        }
        C224748ru c224748ru2 = this.LJLJL;
        if (c224748ru2 != null) {
            ViewGroup.LayoutParams layoutParams = c224748ru2.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams instanceof C018905p) {
                    C018905p c018905p = (C018905p) layoutParams;
                    c018905p.topToTop = R.id.fi1;
                    c018905p.bottomToTop = -1;
                }
                c224748ru2.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        Context context4 = getContext();
        if (context4 != null && (LJI = C79045V0n.LJI(R.attr.dl, context4)) != null) {
            int intValue = LJI.intValue();
            C224748ru c224748ru3 = this.LJLJL;
            if (c224748ru3 != null) {
                c224748ru3.setHintTextColor(intValue);
            }
        }
        TuxIconView tuxIconView = this.LJLLILLLL;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS23S0100000_3(this, 262));
        }
        if (C175276uJ.LIZJ()) {
            TuxIconView tuxIconView2 = this.LJLLI;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(0);
            }
            TuxIconView tuxIconView3 = this.LJLLI;
            if (tuxIconView3 != null) {
                C16880lQ.LJJJ(tuxIconView3, new ACListenerS23S0100000_3(this, 263));
            }
        } else {
            TuxIconView tuxIconView4 = this.LJLLI;
            if (tuxIconView4 != null) {
                tuxIconView4.setVisibility(8);
            }
        }
        C176996x5 EJ = EJ();
        if (EJ != null) {
            EJ.LJIIIIZZ(this.LJLJL);
        }
    }

    public static /* synthetic */ void W3(BottomDefaultCommentAssem bottomDefaultCommentAssem, boolean z, boolean z2) {
        bottomDefaultCommentAssem.U3(C176996x5.LJJL(bottomDefaultCommentAssem.getAweme()), z, z2);
    }

    public final void U3(boolean z, boolean z2, boolean z3) {
        C176996x5 EJ;
        int i = 8;
        if (this.LJLJI) {
            TuxIconView tuxIconView = this.LJLJLLL;
            if (tuxIconView == null) {
                return;
            }
            tuxIconView.setVisibility(8);
            return;
        }
        if (this.LJLJLLL != null) {
            IVideoGiftService iVideoGiftService = (IVideoGiftService) this.LJLLL.getValue();
            if (iVideoGiftService != null && iVideoGiftService.LIZ(getAweme())) {
                TuxIconView tuxIconView2 = this.LJLJLLL;
                if (tuxIconView2 != null) {
                    tuxIconView2.setVisibility(0);
                }
            } else {
                TuxIconView tuxIconView3 = this.LJLJLLL;
                if (tuxIconView3 != null) {
                    tuxIconView3.setVisibility(8);
                }
            }
        }
        if (z) {
            TuxIconView tuxIconView4 = this.LJLJLJ;
            if (tuxIconView4 != null) {
                tuxIconView4.setVisibility(8);
            }
            TuxIconView tuxIconView5 = this.LJLL;
            if (tuxIconView5 != null) {
                tuxIconView5.setVisibility(8);
            }
            TuxIconView tuxIconView6 = this.LJLLI;
            if (tuxIconView6 != null) {
                tuxIconView6.setVisibility(8);
            }
            TuxIconView tuxIconView7 = this.LJLJLLL;
            if (tuxIconView7 != null) {
                tuxIconView7.setVisibility(8);
            }
            C177326xc c177326xc = this.LJLJJLL;
            if (c177326xc != null) {
                c177326xc.LJI(false, false, false, false);
                return;
            }
            return;
        }
        TuxIconView tuxIconView8 = this.LJLJLJ;
        if (tuxIconView8 != null) {
            tuxIconView8.setVisibility(0);
        }
        TuxIconView tuxIconView9 = this.LJLL;
        if (tuxIconView9 != null) {
            tuxIconView9.setVisibility(0);
        }
        TuxIconView tuxIconView10 = this.LJLLI;
        if (tuxIconView10 != null) {
            if (C77321UWf.LIZLLL(getAweme(), false)) {
                i = 0;
            }
            tuxIconView10.setVisibility(i);
        }
        C177326xc c177326xc2 = this.LJLJJLL;
        if (c177326xc2 != null) {
            c177326xc2.LJI(z3, z2, false, false);
        }
        if (!z3 && this.LJLJL != null && (EJ = EJ()) != null) {
            EJ.LJJJLL();
        }
        C224748ru c224748ru = this.LJLJL;
        if (c224748ru != null) {
            c224748ru.setFocusable(true);
        }
        C224748ru c224748ru2 = this.LJLJL;
        if (c224748ru2 != null) {
            c224748ru2.setFocusableInTouchMode(true);
        }
        C224748ru c224748ru3 = this.LJLJL;
        if (c224748ru3 != null) {
            c224748ru3.requestFocus();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomInputPriorityComponent
    public final void P3(int i, int i2, CharSequence content, C177156xL eventTrackingBundle) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(eventTrackingBundle, "eventTrackingBundle");
        super.P3(i, i2, content, eventTrackingBundle);
        U3(false, true, false);
    }
}
