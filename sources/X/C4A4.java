package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4A4, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4A4<CONTENT extends BaseContent> extends AnonymousClass460<CONTENT> {
    public final C62822Ol8 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final Drawable LLIIJI;
    public final C113084cC LLIIJLIL;
    public final SmartImageView LLIIL;
    public final TuxIconView LLIILII;
    public final TuxTextView LLIILZL;
    public final TuxTextView LLIIZ;
    public final TextView LLIL;
    public final View LLILII;

    @Override // X.AbstractC1041546x
    public void M() {
        float dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.tu);
        TuxIconView tuxIconView = this.LLIILII;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(t0().LIZIZ);
        if (C1049149v.LIZ()) {
            C17N.LJJJJZ(this.LLIIL, new float[]{dimensionPixelSize, 0.0f, 0.0f, dimensionPixelSize}, Integer.valueOf(t0().LIZ));
            c110614Vt.LJIIIIZZ = Float.valueOf(dimensionPixelSize);
            c110614Vt.LJIIJ = Float.valueOf(dimensionPixelSize);
        } else {
            C17N.LJJJJZ(this.LLIIL, new float[]{0.0f, dimensionPixelSize, dimensionPixelSize, 0.0f}, Integer.valueOf(t0().LIZ));
            c110614Vt.LJIIIZ = Float.valueOf(dimensionPixelSize);
            c110614Vt.LJIIJJI = Float.valueOf(dimensionPixelSize);
        }
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        tuxIconView.setBackground(c110614Vt.LIZ(context));
    }

    public final boolean s0() {
        return ((Boolean) this.LLIIIL.getValue()).booleanValue();
    }

    public final C1048949t t0() {
        return (C1048949t) this.LLIIIZ.getValue();
    }

    @Override // X.AnonymousClass460
    public final void o0() {
        AnonymousClass470 anonymousClass470;
        View view;
        int m0 = m0();
        if (m0 > 0 && (anonymousClass470 = this.LJLJJI) != null && (view = anonymousClass470.LIZ) != null) {
            AnonymousClass636.LJIJ(view, Integer.valueOf(m0), null, 2);
        }
    }

    public final void w0(int i) {
        this.LLIIL.setVisibility(8);
        this.LLIILII.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
        this.LLIILII.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
        this.LLIILII.setTintColorRes(R.attr.go);
        this.LLIILII.setIconRes(i);
        this.LLIILII.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4A4(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        this.LLIIIL = C221108m2.LIZIZ(C4A9.LJLIL);
        this.LLIIIZ = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 803));
        View findViewById = itemView.findViewById(R.id.btt);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content_layout)");
        this.LLIIJLIL = (C113084cC) findViewById;
        View findViewById2 = itemView.findViewById(R.id.ebu);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.icon_iv)");
        this.LLIIL = (SmartImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.ecv);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.icon_tux)");
        this.LLIILII = (TuxIconView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.lao);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.title_tv)");
        this.LLIILZL = (TuxTextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.c7z);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.desc_tv)");
        this.LLIIZ = (TuxTextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.l0i);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.tag_tv)");
        this.LLIL = (TextView) findViewById6;
        this.LLIIJI = t0().LIZJ;
        View findViewById7 = itemView.findViewById(R.id.b67);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.card_share_divider)");
        this.LLILII = findViewById7;
    }

    public final void x0(int i, boolean z) {
        this.LLIIL.setVisibility(8);
        this.LLIILII.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
        this.LLIILII.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
        this.LLIILII.setVisibility(0);
        if (!z) {
            this.LLIILII.setTintColorRes(R.attr.go);
            this.LLIILII.setIconRes(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if ((!r0.isEmpty()) == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0(com.ss.android.ugc.aweme.base.model.UrlModel r13, java.lang.String r14, X.VA3 r15) {
        /*
            r12 = this;
            r3 = 0
            r4 = r13
            if (r4 == 0) goto L4f
            java.util.List r0 = r4.getUrlList()
            if (r0 == 0) goto L4f
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            if (r0 != r2) goto L4f
        L13:
            r1 = 8
            if (r2 != 0) goto L22
            com.bytedance.tux.icon.TuxIconView r0 = r12.LLIILII
            r0.setVisibility(r3)
            com.bytedance.lighten.loader.SmartImageView r0 = r12.LLIIL
            r0.setVisibility(r1)
        L21:
            return
        L22:
            boolean r0 = r12.s0()
            if (r0 == 0) goto L45
            com.bytedance.lighten.loader.SmartImageView r0 = r12.LLIIL
            r0.setVisibility(r3)
            com.bytedance.tux.icon.TuxIconView r0 = r12.LLIILII
            r0.setVisibility(r1)
        L32:
            com.bytedance.lighten.loader.SmartImageView r3 = r12.LLIIL
            android.graphics.drawable.Drawable r6 = r12.LLIIJI
            X.4A7 r9 = new X.4A7
            r9.<init>(r12)
            r10 = 0
            r11 = 896(0x380, float:1.256E-42)
            r5 = r14
            r8 = r15
            r7 = r6
            X.C4AS.LJI(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L21
        L45:
            com.bytedance.lighten.loader.SmartImageView r1 = r12.LLIIL
            r1.setVisibility(r3)
            r0 = 0
            r1.setAlpha(r0)
            goto L32
        L4f:
            r2 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4A4.v0(com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String, X.VA3):void");
    }

    @Override // X.AbstractC1041546x
    public void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        o.LJIIIZ(msg, "msg");
        this.LLIIJLIL.setRoundingParams(c49v.LIZ);
        C113084cC c113084cC = this.LLIIJLIL;
        GradientDrawable gradientDrawable = new GradientDrawable();
        C77413UZt.LJFF(gradientDrawable, c49v);
        c113084cC.setBackground(gradientDrawable);
    }
}
