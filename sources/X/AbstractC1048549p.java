package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.49p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1048549p<CONTENT extends BaseContent> extends AnonymousClass460<CONTENT> {
    public final C62822Ol8 LLIIIL;
    public final View LLIIIZ;
    public final C113084cC LLIIJI;
    public final SmartImageView LLIIJLIL;
    public final SmartImageView LLIIL;
    public final SmartImageView LLIILII;
    public final TuxTextView LLIILZL;
    public final TuxTextView LLIIZ;
    public final View LLIL;
    public final TuxIconView LLILII;
    public final C62846OlW LLILIL;
    public final TuxTextView LLILL;

    public final C1049249w s0() {
        return (C1049249w) this.LLIIIL.getValue();
    }

    @Override // X.AnonymousClass460
    public final void o0() {
        View view;
        int m0 = m0();
        if (m0 > 0) {
            AnonymousClass470 anonymousClass470 = this.LJLJJI;
            if (anonymousClass470 != null && (view = anonymousClass470.LIZ) != null) {
                AnonymousClass636.LJIJ(view, Integer.valueOf(m0), null, 2);
            }
            AnonymousClass636.LJIJ(this.LLIIJI, null, Integer.valueOf((int) ((m0 * 118.0f) / 260)), 1);
        }
    }

    public final void v0(int i) {
        this.LLILIL.setVisibility(8);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LJFF = Integer.valueOf(R.attr.dz);
        c110614Vt.LIZJ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
        c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
        this.LLILII.setBackground(C06460Ne.LIZ(this.itemView, "itemView.context", c110614Vt));
        this.LLILII.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
        this.LLILII.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
        this.LLILII.setTintColorRes(R.attr.go);
        this.LLILII.setIconRes(i);
        this.LLILII.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1048549p(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        this.LLIIIL = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 820));
        View findViewById = itemView.findViewById(R.id.btt);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content_layout)");
        this.LLIIIZ = findViewById;
        View findViewById2 = itemView.findViewById(R.id.ej7);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.img_container)");
        this.LLIIJI = (C113084cC) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.eir);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.img1)");
        this.LLIIJLIL = (SmartImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.eis);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.img2)");
        this.LLIIL = (SmartImageView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.eit);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.img3)");
        this.LLIILII = (SmartImageView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.lao);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.title_tv)");
        this.LLIILZL = (TuxTextView) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.c7z);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.desc_tv)");
        this.LLIIZ = (TuxTextView) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.ecv);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.icon_tux)");
        this.LLILII = (TuxIconView) findViewById8;
        View findViewById9 = itemView.findViewById(R.id.ebu);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.icon_iv)");
        this.LLILIL = (C62846OlW) findViewById9;
        View findViewById10 = itemView.findViewById(R.id.eb4);
        o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.icon_container)");
        this.LLIL = findViewById10;
        View findViewById11 = itemView.findViewById(R.id.dky);
        o.LJIIIIZZ(findViewById11, "itemView.findViewById(R.id.follow_tv)");
        this.LLILL = (TuxTextView) findViewById11;
    }

    public final void t0(String str, List<? extends UrlModel> list, Drawable drawable) {
        UrlModel urlModel;
        UrlModel urlModel2;
        UrlModel urlModel3;
        UrlModel urlModel4;
        UrlModel urlModel5;
        UrlModel urlModel6;
        if (drawable == null) {
            if (list != null) {
                urlModel4 = (UrlModel) ORZ.LJLLLLLL(0, list);
            } else {
                urlModel4 = null;
            }
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel4));
            LJII.LJJIIJ = this.LLIIJLIL;
            C43659HBn.LJIJ(LJII, i0.LJFF(str, ":img1"), false, null, 6);
            if (list != null) {
                urlModel5 = (UrlModel) ORZ.LJLLLLLL(1, list);
            } else {
                urlModel5 = null;
            }
            W5F LJII2 = W5U.LJII(C78939UyV.LJ(urlModel5));
            LJII2.LJJIIJ = this.LLIIL;
            C43659HBn.LJIJ(LJII2, i0.LJFF(str, ":img2"), false, null, 6);
            if (list != null) {
                urlModel6 = (UrlModel) ORZ.LJLLLLLL(2, list);
            } else {
                urlModel6 = null;
            }
            W5F LJII3 = W5U.LJII(C78939UyV.LJ(urlModel6));
            LJII3.LJJIIJ = this.LLIILII;
            C43659HBn.LJIJ(LJII3, i0.LJFF(str, ":img3"), false, null, 6);
            return;
        }
        if (list != null) {
            urlModel = (UrlModel) ORZ.LJLLLLLL(0, list);
        } else {
            urlModel = null;
        }
        W5F LJII4 = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII4.LJJIIJ = this.LLIIJLIL;
        LJII4.LJIILIIL = drawable;
        LJII4.LJIILLIIL = drawable;
        C43659HBn.LJIJ(LJII4, i0.LJFF(str, ":img1"), false, null, 6);
        if (list != null) {
            urlModel2 = (UrlModel) ORZ.LJLLLLLL(1, list);
        } else {
            urlModel2 = null;
        }
        W5F LJII5 = W5U.LJII(C78939UyV.LJ(urlModel2));
        LJII5.LJJIIJ = this.LLIIL;
        LJII5.LJIILIIL = drawable;
        LJII5.LJIILLIIL = drawable;
        C43659HBn.LJIJ(LJII5, i0.LJFF(str, ":img2"), false, null, 6);
        if (list != null) {
            urlModel3 = (UrlModel) ORZ.LJLLLLLL(2, list);
        } else {
            urlModel3 = null;
        }
        W5F LJII6 = W5U.LJII(C78939UyV.LJ(urlModel3));
        LJII6.LJJIIJ = this.LLIILII;
        LJII6.LJIILIIL = drawable;
        LJII6.LJIILLIIL = drawable;
        C43659HBn.LJIJ(LJII6, i0.LJFF(str, ":img3"), false, null, 6);
    }

    @Override // X.AbstractC1041546x
    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        C4AH c4ah;
        o.LJIIIZ(msg, "msg");
        C113084cC c113084cC = this.LLIIJI;
        C4AH c4ah2 = c49v.LIZ;
        if (c4ah2 != null) {
            c4ah = C4AH.L(c4ah2, 12);
        } else {
            c4ah = null;
        }
        c113084cC.setRoundingParams(c4ah);
        View view = this.LLIIIZ;
        GradientDrawable gradientDrawable = new GradientDrawable();
        C77413UZt.LJFF(gradientDrawable, c49v);
        view.setBackground(gradientDrawable);
    }
}
