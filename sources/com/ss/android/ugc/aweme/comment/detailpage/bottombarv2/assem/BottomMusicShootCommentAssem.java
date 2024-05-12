package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C176996x5;
import X.C177056xB;
import X.C224748ru;
import X.C71Y;
import X.C79045V0n;
import X.EnumC177736yH;
import X.InterfaceC212198Ul;
import X.M89;
import X.X1D;
import X.Z9N;
import Y.IDCSpanS29S0100000_3;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.Au2S14S0100000_3;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import defpackage.q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BottomMusicShootCommentAssem extends AbstractBottomInputPriorityComponent {
    public C224748ru LJLJJLL;
    public View LJLJL;
    public String LJLJLJ;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "music_shoot_comment";
    }

    public BottomMusicShootCommentAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomInputPriorityComponent
    public final C177056xB M3() {
        String str;
        View findViewById = getContainerView().findViewById(R.id.fi1);
        C224748ru c224748ru = this.LJLJJLL;
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
        return new C177056xB(findViewById, c224748ru, (TuxIconView) null, (TuxIconView) null, (TuxIconView) null, textView, x3, enterFrom, enumC177736yH, str, 256);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void E3() {
        Editable editable;
        CharSequence charSequence;
        String str;
        Integer LJI;
        String str2;
        int i;
        String string;
        View containerView = getContainerView();
        if ((containerView instanceof ViewGroup) && containerView.findViewById(R.id.c8y) == null) {
            ViewGroup viewGroup = (ViewGroup) containerView;
            C16880lQ.LLLZIIL(R.layout.pa, C16880lQ.LLZIL(viewGroup.getContext()), viewGroup).setId(R.id.c8y);
            this.LJLJJLL = (C224748ru) containerView.findViewById(R.id.bk7);
            View findViewById = containerView.findViewById(R.id.bl3);
            this.LJLJL = findViewById;
            if (findViewById != null) {
                C16880lQ.LJIIJ(new Au2S14S0100000_3(this, 10), findViewById);
            }
            TextView textView = (TextView) containerView.findViewById(R.id.bjt);
            if (textView != null) {
                StringBuilder LIZ = X1D.LIZ();
                Context context = getContext();
                String str3 = "";
                if (context == null || (str2 = context.getString(R.string.dj2)) == null) {
                    str2 = "";
                }
                String LIZIZ = q.LIZIZ(LIZ, str2, ' ', LIZ);
                Context context2 = getContext();
                if (context2 != null && (string = context2.getString(R.string.tqv)) != null) {
                    str3 = string;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i0.LJFF(LIZIZ, str3));
                spannableStringBuilder.setSpan(new IDCSpanS29S0100000_3(this, 6), LIZIZ.length(), spannableStringBuilder.length(), 18);
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
            C224748ru c224748ru = this.LJLJJLL;
            if (c224748ru != null) {
                c224748ru.setCursorVisible(false);
            }
            Context context4 = getContext();
            if (context4 != null && (LJI = C79045V0n.LJI(R.attr.dl, context4)) != null) {
                int intValue = LJI.intValue();
                C224748ru c224748ru2 = this.LJLJJLL;
                if (c224748ru2 != null) {
                    c224748ru2.setHintTextColor(intValue);
                }
            }
        }
        C224748ru c224748ru3 = this.LJLJJLL;
        if (c224748ru3 != null) {
            c224748ru3.requestFocus();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("text = ");
        C224748ru c224748ru4 = this.LJLJJLL;
        String str4 = null;
        if (c224748ru4 != null) {
            editable = c224748ru4.getText();
        } else {
            editable = null;
        }
        LIZ2.append((Object) editable);
        LIZ2.append(", hint = ");
        C224748ru c224748ru5 = this.LJLJJLL;
        if (c224748ru5 != null) {
            charSequence = c224748ru5.getHint();
        } else {
            charSequence = null;
        }
        LIZ2.append((Object) charSequence);
        C71Y.LIZ("BottomMusicShootCommentAssem", X1D.LIZIZ(LIZ2));
        if (!o.LJ(this.LJLJLJ, x3())) {
            this.LJLJLJ = x3();
            InterfaceC212198Ul LLILZ = Z9N.LIZIZ.LLILZ();
            String x3 = x3();
            M89 qT = qT();
            if (qT != null) {
                str = qT.getEventType();
            } else {
                str = null;
            }
            Aweme aweme = getAweme();
            if (aweme != null) {
                str4 = aweme.getAuthorUid();
            }
            LLILZ.LJIIIZ(x3, str, str4);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarProtocol
    public final boolean LJJLIIJ() {
        Aweme aweme;
        if (!v3(qT()) || (aweme = getAweme()) == null || !aweme.hasCreationIntention() || !Z9N.LIZIZ.LLILZ().LIZJ(getAweme())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void X5() {
        Aweme aweme = getAweme();
        if (aweme != null && aweme.isProhibited()) {
            C224748ru c224748ru = this.LJLJJLL;
            if (c224748ru != null) {
                c224748ru.setEnabled(false);
            }
            C224748ru c224748ru2 = this.LJLJJLL;
            if (c224748ru2 != null) {
                c224748ru2.setHint(R.string.dkl);
                return;
            }
            return;
        }
        C224748ru c224748ru3 = this.LJLJJLL;
        if (c224748ru3 != null) {
            c224748ru3.setEnabled(true);
        }
        C176996x5 EJ = EJ();
        if (EJ == null) {
            return;
        }
        EJ.LJJJLL();
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final boolean v3(M89 m89) {
        String str;
        InterfaceC212198Ul LLILZ = Z9N.LIZIZ.LLILZ();
        if (m89 != null) {
            str = m89.getEventType();
        } else {
            str = null;
        }
        return LLILZ.LJIIJ(str);
    }
}
