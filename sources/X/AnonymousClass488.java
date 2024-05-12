package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.488, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass488 extends LinearLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public TuxTextView LJLJL;
    public boolean LJLJLJ;
    public Drawable LJLJLLL;
    public boolean LJLL;
    public final int LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public CharSequence LJLLJ;
    public final C62822Ol8 LJLLL;
    public TuxTextView LJLLLL;
    public TuxIconView LJLLLLLL;
    public View.OnClickListener LJLZ;
    public InterfaceC1039746f LJZ;
    public final C62822Ol8 LJZI;

    private final GradientDrawable getChatPageRedesignQuotedTextBgDrawable() {
        return (GradientDrawable) this.LJLLILLLL.getValue();
    }

    private final int getPlaceholderCover() {
        return ((Number) this.LJLLL.getValue()).intValue();
    }

    private final TuxIconView getPlayIcon() {
        return (TuxIconView) this.LJLILLLLZI.getValue();
    }

    private final LinearLayout getQuoteContent() {
        return (LinearLayout) this.LJLJJL.getValue();
    }

    private final CardView getQuoteLine() {
        return (CardView) this.LJLJI.getValue();
    }

    private final TuxTextView getQuotedTextTv() {
        return (TuxTextView) this.LJLJJLL.getValue();
    }

    private final TextView getTextView() {
        return (TextView) this.LJLJJI.getValue();
    }

    public final C16230kN getGestureDetector() {
        return (C16230kN) this.LJZI.getValue();
    }

    public final C62846OlW getVideoCover() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-videoCover>(...)");
        return (C62846OlW) value;
    }

    public final CharSequence getReplyText() {
        return this.LJLLJ;
    }

    private final void setQuotedText(CharSequence charSequence) {
        TuxTextView quotedTextTv = getQuotedTextTv();
        if (quotedTextTv != null && !o.LJ(quotedTextTv.getText(), charSequence)) {
            quotedTextTv.setText(charSequence);
            quotedTextTv.requestLayout();
        }
    }

    private final void setReplyQuote(int i) {
        String string = getContext().getString(i);
        o.LJIIIIZZ(string, "context.getString(resId)");
        setReplyText(string);
        LIZIZ(8, 8);
        setBackground(C04270Et.LIZIZ(getContext(), R.drawable.bh1));
    }

    public final String LIZJ(C109544Rq c109544Rq) {
        boolean z;
        String str;
        String str2;
        String string;
        String displayName;
        String displayName2;
        String displayName3;
        String str3;
        String string2;
        String displayName4;
        IMUser LJIIJ = C80533Eb.LJIIJ(String.valueOf(c109544Rq.getSender()), c109544Rq.getSecSender());
        if (c109544Rq.getConversationType() == AbstractC63505Ow9.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        String str4 = null;
        String str5 = "";
        if (C36L.LIZJ(LJIIJ)) {
            if (C93793mB.LJIIJ(c109544Rq)) {
                String string3 = getContext().getString(R.string.eu_);
                o.LJIIIIZZ(string3, "{\n                contex…e_receiver)\n            }");
                return string3;
            }
            if (z) {
                ReferenceInfoHint LJIIZILJ = C1DJ.LJIIZILJ(c109544Rq);
                if (LJIIZILJ != null) {
                    str4 = LJIIZILJ.getRefmsg_uid();
                    str3 = LJIIZILJ.getRefmsg_sec_uid();
                } else {
                    str3 = null;
                }
                IMUser LJIIJ2 = C80533Eb.LJIIJ(str4, str3);
                if (C36L.LIZJ(LJIIJ2)) {
                    string2 = getContext().getString(R.string.h00);
                } else {
                    Context context = getContext();
                    Object[] objArr = new Object[1];
                    if (LJIIJ2 != null && (displayName4 = LJIIJ2.getDisplayName()) != null) {
                        str5 = displayName4;
                    }
                    objArr[0] = str5;
                    string2 = context.getString(R.string.gzz, objArr);
                }
                o.LJIIIIZZ(string2, "{\n                val qu…         }\n\n            }");
                return string2;
            }
            String string4 = getContext().getString(R.string.gzw);
            o.LJIIIIZZ(string4, "{\n                contex…ou_private)\n            }");
            return string4;
        }
        ReferenceInfoHint LJIIZILJ2 = C1DJ.LJIIZILJ(c109544Rq);
        if (LJIIZILJ2 != null) {
            str4 = LJIIZILJ2.getRefmsg_uid();
            str = LJIIZILJ2.getRefmsg_sec_uid();
        } else {
            str = null;
        }
        IMUser LJIIJ3 = C80533Eb.LJIIJ(str4, str);
        if (C93793mB.LJIIJ(c109544Rq)) {
            String string5 = getContext().getString(R.string.eua);
            o.LJIIIIZZ(string5, "{\n                contex…age_sender)\n            }");
            return string5;
        }
        if (o.LJ(LJIIJ3, LJIIJ)) {
            Context context2 = getContext();
            Object[] objArr2 = new Object[1];
            if (LJIIJ != null && (displayName3 = LJIIJ.getDisplayName()) != null) {
                str5 = displayName3;
            }
            objArr2[0] = str5;
            String string6 = context2.getString(R.string.gzv, objArr2);
            o.LJIIIIZZ(string6, "{\n                // me …Name ?: \"\")\n            }");
            return string6;
        }
        if (z) {
            if (C36L.LIZJ(LJIIJ3)) {
                Context context3 = getContext();
                Object[] objArr3 = new Object[1];
                if (LJIIJ != null && (displayName2 = LJIIJ.getDisplayName()) != null) {
                    str5 = displayName2;
                }
                objArr3[0] = str5;
                string = context3.getString(R.string.gzt, objArr3);
            } else {
                Context context4 = getContext();
                Object[] objArr4 = new Object[2];
                if (LJIIJ == null || (str2 = LJIIJ.getDisplayName()) == null) {
                    str2 = "";
                }
                objArr4[0] = str2;
                if (LJIIJ3 != null && (displayName = LJIIJ3.getDisplayName()) != null) {
                    str5 = displayName;
                }
                objArr4[1] = str5;
                string = context4.getString(R.string.gzs, objArr4);
            }
            o.LJIIIIZZ(string, "{\n                if (Ap…          }\n            }");
            return string;
        }
        String string7 = getContext().getString(R.string.gzu);
        o.LJIIIIZZ(string7, "{\n                contex…ly_private)\n            }");
        return string7;
    }

    public final void setBackgroundOutside(Drawable drawable) {
        o.LJIIIZ(drawable, "drawable");
        LIZ(drawable, this.LJLJLJ);
        this.LJLJLLL = drawable;
    }

    public final void setReplyText(CharSequence charSequence) {
        TextView textView = getTextView();
        if (!o.LJ(textView.getText(), charSequence)) {
            textView.setText(charSequence);
            textView.requestLayout();
        }
        this.LJLLJ = charSequence;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass488(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        a1.LJFF(context, "context");
        int i2 = 0;
        this.LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 12));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 7));
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 9));
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 11));
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 8));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 10));
        this.LJLLILLLL = C221108m2.LIZIZ(C49U.LJLIL);
        this.LJLLL = C221108m2.LIZIZ(C48F.LJLIL);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a__});
        try {
            int i3 = obtainStyledAttributes.getInt(0, 1);
            this.LJLLI = i3;
            obtainStyledAttributes.recycle();
            LinearLayout.inflate(context, R.layout.b8a, this);
            TextView textView = getTextView();
            Integer LJI = C79045V0n.LJI(R.attr.gv, context);
            if (LJI != null) {
                textView.setTextColor(LJI.intValue());
            }
            C16880lQ.LJIJI(textView, new ACListenerS21S0100000_1(this, 7));
            TuxTextView quotedTextTv = getQuotedTextTv();
            if (quotedTextTv != null) {
                Integer LJI2 = C79045V0n.LJI(R.attr.gv, context);
                if (LJI2 != null) {
                    quotedTextTv.setTextColor(LJI2.intValue());
                }
                C16880lQ.LJJJJI(quotedTextTv, new ACListenerS21S0100000_1(this, 8));
            }
            setOrientation(1);
            if (i3 == 0) {
                i = 8388613;
            } else {
                i = 8388611;
            }
            setGravity(i);
            LinearLayout quoteContent = getQuoteContent();
            if (quoteContent != null) {
                if ((!C90193gN.LIZ() && i3 == 0) || (C90193gN.LIZ() && i3 == 1)) {
                    i2 = 1;
                }
                quoteContent.setLayoutDirection(i2);
            }
            TuxTextView quotedTextTv2 = getQuotedTextTv();
            if (quotedTextTv2 != null) {
                quotedTextTv2.setBackground(getChatPageRedesignQuotedTextBgDrawable());
            }
            this.LJZI = C221108m2.LIZIZ(new AqS148S0200000_1(context, this, 0));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void LIZ(Drawable drawable, boolean z) {
        if (z) {
            if (this.LJLLI == 0) {
                C26338AVi.LJIIIZ(this, Integer.valueOf(C1DF.LJIIIZ(12)), null, 0, null, 26);
            } else {
                C26338AVi.LJIIIZ(this, 0, null, Integer.valueOf(C1DF.LJIIIZ(12)), null, 26);
            }
            setBackground(null);
            return;
        }
        if (drawable != null) {
            C26338AVi.LJIIIZ(this, Integer.valueOf(C1DF.LJIIIZ(12)), null, Integer.valueOf(C1DF.LJIIIZ(12)), null, 26);
            setBackground(drawable);
        } else {
            C26338AVi.LJIIIZ(this, Integer.valueOf(C1DF.LJIIIZ(12)), null, Integer.valueOf(C1DF.LJIIIZ(12)), null, 26);
        }
    }

    public final void LIZIZ(int i, int i2) {
        boolean z;
        TuxTextView tuxTextView;
        if (i == 0 || i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJLJ = z;
        LIZ(this.LJLJLLL, z);
        getVideoCover().setVisibility(i);
        TuxIconView playIcon = getPlayIcon();
        if (playIcon != null) {
            playIcon.setVisibility(i);
        }
        TuxTextView quotedTextTv = getQuotedTextTv();
        if (quotedTextTv != null) {
            quotedTextTv.setVisibility(i2);
        }
        if (this.LJLJLJ) {
            LinearLayout quoteContent = getQuoteContent();
            if (quoteContent != null) {
                C17N.LJJLIIIJJI(quoteContent);
            }
            CardView quoteLine = getQuoteLine();
            if (quoteLine != null) {
                C17N.LJJLIIIJJI(quoteLine);
            }
        } else {
            LinearLayout quoteContent2 = getQuoteContent();
            if (quoteContent2 != null) {
                C17N.LJJIIJZLJL(quoteContent2);
            }
            CardView quoteLine2 = getQuoteLine();
            if (quoteLine2 != null) {
                C17N.LJJIIJZLJL(quoteLine2);
            }
        }
        if (i != 0 && (tuxTextView = this.LJLJL) != null && tuxTextView.getVisibility() == 0) {
            TuxTextView tuxTextView2 = this.LJLJL;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(8);
            }
            TuxTextView tuxTextView3 = this.LJLLLL;
            if (tuxTextView3 != null) {
                tuxTextView3.setVisibility(0);
            }
            LJFF(this.LJLLLLLL, true);
        }
    }

    public final void LJFF(TuxIconView tuxIconView, boolean z) {
        int i;
        if (z) {
            i = R.id.bst;
        } else {
            i = R.id.iwd;
        }
        if (tuxIconView != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if (layoutParams != null) {
                C018905p c018905p = (C018905p) layoutParams;
                c018905p.topToTop = i;
                c018905p.bottomToBottom = i;
                if (this.LJLL) {
                    c018905p.endToEnd = i;
                } else {
                    c018905p.startToStart = i;
                }
                tuxIconView.setLayoutParams(c018905p);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    public final void LIZLLL(C109544Rq msg, BaseContent.ReferenceVideo referenceVideo, View.OnClickListener onClickListener) {
        o.LJIIIZ(msg, "msg");
        setTag(50331648, 54);
        setTag(67108864, new C1042647i(referenceVideo.getRefVideoId(), referenceVideo.getRefVideoAuthorUid(), referenceVideo.getRefVideoAuthorSecUid(), Boolean.valueOf(referenceVideo.getRefVideoIsStory())));
        setTag(100663296, Integer.valueOf(referenceVideo.getRefVideoAwemeType()));
        C16880lQ.LJJJJZ(this, onClickListener);
        setReplyText(LIZJ(msg));
        LIZIZ(0, 8);
        C4AS.LJIIIIZZ(getVideoCover(), referenceVideo.getRefVideoCoverUrl(), "ReplyMessageLayout:FeedDMReply", getPlaceholderCover(), getPlaceholderCover(), null, new C4AY() { // from class: X.3jC
            @Override // X.C4AY
            public final /* synthetic */ void LIZ() {
            }

            @Override // X.W4Z
            public final /* synthetic */ void LIZIZ(String str, Throwable th) {
            }

            @Override // X.W4Z
            public final /* synthetic */ void LIZJ(String str) {
            }

            @Override // X.W4Z
            public final /* bridge */ /* synthetic */ void LIZLLL(Object obj, String str) {
                LIZ();
            }

            @Override // X.W4Z
            public final /* synthetic */ void LJI(Object obj, String str) {
            }

            @Override // X.W4Z
            public final void LJ(String str, Throwable th) {
                if (th == null) {
                    return;
                }
                C34B.LJ("ReplyMessageLayout", th);
            }

            @Override // X.W4Z
            public final /* bridge */ /* synthetic */ void LJFF(String str, InterfaceC81599W0t interfaceC81599W0t, Animatable animatable) {
            }
        }, 0, 0, 928);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0286, code lost:
    
        if (r12 != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0108, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d3, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C109544Rq r23, com.bytedance.im.core.proto.ReferenceInfo r24, android.view.View.OnClickListener r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass488.LJ(X.4Rq, com.bytedance.im.core.proto.ReferenceInfo, android.view.View$OnClickListener, boolean):void");
    }
}
