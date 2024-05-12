package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Rjh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70377Rjh extends AbstractC70272Ri0<C70252Rhg> {
    public final LinearLayout LJLIL;
    public final SmartImageView LJLILLLLZI;
    public final TuxTextView LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70377Rjh(ViewGroup parent) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.a7g, parent, false));
        o.LJIIIZ(parent, "parent");
        this.LJLIL = (LinearLayout) this.itemView.findViewById(R.id.k30);
        this.LJLILLLLZI = (SmartImageView) this.itemView.findViewById(R.id.k31);
        this.LJLJI = (TuxTextView) this.itemView.findViewById(R.id.k33);
    }

    @Override // X.AbstractC70272Ri0
    public final void L(int i, Object obj) {
        int noStockBg;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C70252Rhg c70252Rhg = (C70252Rhg) obj;
        Context context = this.itemView.getContext();
        ISpecUiStyle iSpecUiStyle = c70252Rhg.LJLJJL;
        LinearLayout linearLayout = this.LJLIL;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(iSpecUiStyle.getSpecHorizontalMargin());
        linearLayout.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.LJLILLLLZI.getLayoutParams();
        int specHorizontalImageMargin = iSpecUiStyle.getSpecHorizontalImageMargin();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.setMarginStart(specHorizontalImageMargin);
            marginLayoutParams.topMargin = specHorizontalImageMargin;
            marginLayoutParams.bottomMargin = specHorizontalImageMargin;
        }
        this.LJLILLLLZI.setLayoutParams(layoutParams2);
        C27583As7 c27583As7 = new C27583As7();
        c27583As7.LIZJ = "sku_detail";
        c27583As7.LIZ(i);
        c27583As7.LIZIZ(c70252Rhg.LJLIL.toThumbFirstImageUrlModel());
        S3I s3i = new S3I();
        s3i.LIZLLL = iSpecUiStyle.getSpecImageRadius();
        o.LJIIIIZZ(context, "context");
        s3i.LIZJ = AnonymousClass636.LJIIIIZZ(R.attr.dz, context);
        S3L s3l = new S3L(s3i);
        W5F LJ = C70759Rpr.LJ(c70252Rhg.LJLIL);
        LJ.LJIJJ = EnumC72807Shn.CENTER_CROP;
        LJ.LJIJJLI = s3l;
        LJ.LJIILIIL = C7MY.LIZJ(this.itemView, "itemView.context", R.attr.cj);
        LJ.LJJIIJ = this.LJLILLLLZI;
        L9G.LIZIZ(LJ, new C70396Rk0(c27583As7));
        this.LJLJI.setText(c70252Rhg.LJLILLLLZI);
        if (c70252Rhg.LJLJJI) {
            if (c70252Rhg.LJLJI) {
                noStockBg = iSpecUiStyle.getCheckedBg();
            } else {
                noStockBg = iSpecUiStyle.getNoStockAndCheckedBg();
            }
        } else if (c70252Rhg.LJLJI) {
            noStockBg = iSpecUiStyle.getNormalBg();
        } else {
            noStockBg = iSpecUiStyle.getNoStockBg();
        }
        this.LJLIL.setBackgroundResource(noStockBg);
        this.LJLJI.getPaint().setFlags(0);
        if (c70252Rhg.LJLJJI) {
            if (c70252Rhg.LJLJI) {
                Context context2 = this.itemView.getContext();
                o.LJIIIIZZ(context2, "itemView.context");
                Integer LJI = C79045V0n.LJI(iSpecUiStyle.getTextCheckedColor(), context2);
                if (LJI != null) {
                    this.LJLJI.setTextColor(LJI.intValue());
                }
                this.LJLILLLLZI.setAlpha(1.0f);
                return;
            }
            Context context3 = this.itemView.getContext();
            o.LJIIIIZZ(context3, "itemView.context");
            Integer LJI2 = C79045V0n.LJI(iSpecUiStyle.getTextNoStockAndCheckColor(), context3);
            if (LJI2 != null) {
                this.LJLJI.setTextColor(LJI2.intValue());
            }
            this.LJLILLLLZI.setAlpha(0.5f);
            if (!iSpecUiStyle.getTextStrikeThrough()) {
                return;
            }
            this.LJLJI.getPaint().setFlags(16);
            this.LJLJI.getPaint().setAntiAlias(true);
            return;
        }
        if (c70252Rhg.LJLJI) {
            Context context4 = this.itemView.getContext();
            o.LJIIIIZZ(context4, "itemView.context");
            Integer LJI3 = C79045V0n.LJI(iSpecUiStyle.getTextNormalColor(), context4);
            if (LJI3 != null) {
                this.LJLJI.setTextColor(LJI3.intValue());
            }
            this.LJLILLLLZI.setAlpha(1.0f);
            return;
        }
        Context context5 = this.itemView.getContext();
        o.LJIIIIZZ(context5, "itemView.context");
        Integer LJI4 = C79045V0n.LJI(iSpecUiStyle.getTextNoStockColor(), context5);
        if (LJI4 != null) {
            this.LJLJI.setTextColor(LJI4.intValue());
        }
        this.LJLILLLLZI.setAlpha(0.5f);
        if (!iSpecUiStyle.getTextStrikeThrough()) {
            return;
        }
        this.LJLJI.getPaint().setFlags(16);
        this.LJLJI.getPaint().setAntiAlias(true);
    }
}
