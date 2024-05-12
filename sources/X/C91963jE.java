package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3jE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91963jE extends LinearLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public View.OnClickListener LJLJI;

    private final TuxIconView getCloseButton() {
        return (TuxIconView) this.LJLILLLLZI.getValue();
    }

    private final TextView getTextView() {
        return (TextView) this.LJLIL.getValue();
    }

    public final View.OnClickListener getCloseButtonOnClick() {
        return this.LJLJI;
    }

    private final void setReplyText(CharSequence charSequence) {
        TextView textView = getTextView();
        if (!o.LJ(textView.getText(), charSequence)) {
            textView.setText(charSequence);
            textView.requestLayout();
        }
    }

    public final void setCloseButtonOnClick(View.OnClickListener onClickListener) {
        int i;
        TuxIconView closeButton = getCloseButton();
        if (onClickListener != null) {
            i = 0;
        } else {
            i = 8;
        }
        closeButton.setVisibility(i);
        C16880lQ.LJJJ(getCloseButton(), onClickListener);
        this.LJLJI = onClickListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (r3 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setReplyHintInInputView(X.C109544Rq r9) {
        /*
            r8 = this;
            java.lang.String r0 = "quotedMessage"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            long r0 = r9.getSender()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r9.getSecSender()
            com.ss.android.ugc.aweme.im.service.model.IMUser r7 = X.C80533Eb.LJIIJ(r1, r0)
            boolean r0 = X.C93793mB.LJIILL(r9)
            r4 = 0
            java.lang.String r5 = ""
            if (r0 == 0) goto L82
            com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r0 = X.C1DJ.LJIILL(r9)
            if (r0 == 0) goto L80
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r0 = r0.LLZLL()
            if (r0 == 0) goto L80
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r0 = r0.quotePreviewText
            if (r0 == 0) goto L80
            java.lang.String r3 = r0.text
            if (r3 == 0) goto L80
        L32:
            android.content.Context r6 = r8.getContext()
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            boolean r0 = X.C36L.LIZJ(r7)
            if (r0 == 0) goto L75
            android.content.Context r1 = r8.getContext()
            r0 = 2131831430(0x7f112a86, float:1.9295885E38)
            java.lang.String r5 = r1.getString(r0)
            java.lang.String r0 = "context.getString(R.string.im_quote_you)"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
        L4f:
            r2[r4] = r5
            r0 = 2131831122(0x7f112952, float:1.929526E38)
            java.lang.String r2 = r6.getString(r0, r2)
            java.lang.String r0 = "context.getString(\n     …layName(sender)\n        )"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r8.setReplyText(r0)
            return
        L75:
            if (r7 == 0) goto L4f
            java.lang.String r0 = r7.getDisplayName()
            if (r0 != 0) goto L7e
            goto L4f
        L7e:
            r5 = r0
            goto L4f
        L80:
            r3 = r5
            goto L32
        L82:
            X.4Tx r0 = X.EnumC110124Tw.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r2 = X.C110134Tx.LIZJ(r9)
            if (r2 == 0) goto L9c
            android.content.Context r1 = r8.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r3 = r2.getQuoteHint(r1)
            if (r3 != 0) goto L9d
        L9c:
            r3 = r5
        L9d:
            int r1 = r3.length()
            r0 = 100
            if (r1 <= r0) goto L32
            X.FvF r0 = X.C78842Uww.LJJ(r4, r0)
            java.lang.String r3 = ujb.s.LJLL(r3, r0)
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91963jE.setReplyHintInInputView(X.4Rq):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91963jE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 6));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 5));
        LinearLayout.inflate(context, R.layout.b85, this);
        TextView textView = getTextView();
        textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context));
        C16880lQ.LJIJI(textView, new ACListenerS21S0100000_1(this, 6));
    }
}
