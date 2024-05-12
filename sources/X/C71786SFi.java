package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.SFi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71786SFi extends LinearLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    private final C33681DJt getProgressBar() {
        return (C33681DJt) this.LJLIL.getValue();
    }

    private final TuxTextView getStatusView() {
        return (TuxTextView) this.LJLILLLLZI.getValue();
    }

    private final void setStatusText(String str) {
        String string = getContext().getString(R.string.rdv, str);
        o.LJIIIIZZ(string, "context.getString(R.stri…d_strength, statusString)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int LJJLIIIJL = s.LJJLIIIJL(string, str, 0, false, 6);
        if (LJJLIIIJL >= 0) {
            spannableStringBuilder.setSpan(new StyleSpan(1), LJJLIIIJL, str.length() + LJJLIIIJL, 33);
        }
        getStatusView().setText(spannableStringBuilder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.EnumC71789SFl r6) {
        /*
            r5 = this;
            java.lang.String r0 = "complexity"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.DJt r1 = r5.getProgressBar()
            r1.getClass()
            int[] r2 = X.C71787SFj.LIZ
            int r0 = r6.ordinal()
            r0 = r2[r0]
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == r2) goto L75
            if (r0 == r3) goto L6c
            if (r0 == r4) goto L63
            r0 = 4
            r1.LJLJI = r0
            X.DvX r0 = X.EnumC35439DvX.INIT
            r1.LJLIL = r0
        L24:
            r1.invalidate()
            int[] r1 = X.C71788SFk.LIZ
            int r0 = r6.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L43
            if (r0 == r3) goto L4b
            if (r0 == r4) goto L3b
        L35:
            java.lang.String r0 = ""
        L37:
            r5.setStatusText(r0)
            return
        L3b:
            r0 = 2131845504(0x7f116180, float:1.932443E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L52
        L43:
            r0 = 2131845505(0x7f116181, float:1.9324433E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L52
        L4b:
            r0 = 2131845503(0x7f11617f, float:1.9324429E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L52:
            if (r0 == 0) goto L35
            int r1 = r0.intValue()
            android.content.Context r0 = r5.getContext()
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L37
            goto L35
        L63:
            r0 = 300(0x12c, float:4.2E-43)
            r1.LJLJI = r0
            X.DvX r0 = X.EnumC35439DvX.POSITIVE
            r1.LJLIL = r0
            goto L24
        L6c:
            r0 = 200(0xc8, float:2.8E-43)
            r1.LJLJI = r0
            X.DvX r0 = X.EnumC35439DvX.POSITIVE
            r1.LJLIL = r0
            goto L24
        L75:
            r0 = 90
            r1.LJLJI = r0
            X.DvX r0 = X.EnumC35439DvX.WARNING
            r1.LJLIL = r0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71786SFi.LIZ(X.SFl):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71786SFi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 27));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 28));
        View.inflate(context, R.layout.nw, this);
        setOrientation(1);
    }
}
