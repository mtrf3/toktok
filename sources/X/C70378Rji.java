package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Rji, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70378Rji extends AbstractC70272Ri0<C70289RiH> {
    public final LinearLayout LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final SmartImageView LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70378Rji(ViewGroup parent) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.a7h, parent, false));
        o.LJIIIZ(parent, "parent");
        this.LJLIL = (LinearLayout) this.itemView.findViewById(R.id.k9a);
        this.LJLILLLLZI = (TuxTextView) this.itemView.findViewById(R.id.k34);
        this.LJLJI = (SmartImageView) this.itemView.findViewById(R.id.k32);
    }

    @Override // X.AbstractC70272Ri0
    public final void L(int i, Object obj) {
        float f;
        int noStockBg;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C70289RiH c70289RiH = (C70289RiH) obj;
        ISpecUiStyle iSpecUiStyle = c70289RiH.LJLJJL;
        this.itemView.getContext();
        LinearLayout linearLayout = this.LJLIL;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(iSpecUiStyle.getSpecHorizontalMargin());
        linearLayout.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.LJLJI.getLayoutParams();
        int specImageSize = iSpecUiStyle.getSpecImageSize();
        float f2 = specImageSize;
        Image image = c70289RiH.LJLIL;
        if (image != null) {
            f = image.getRadio();
        } else {
            f = 1.0f;
        }
        layoutParams2.width = specImageSize;
        layoutParams2.height = (int) (f2 / f);
        int specImagePadding = iSpecUiStyle.getSpecImagePadding();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.setMarginStart(specImagePadding);
            marginLayoutParams.setMarginEnd(specImagePadding);
            marginLayoutParams.topMargin = specImagePadding;
        }
        this.LJLJI.setLayoutParams(layoutParams2);
        C27583As7 c27583As7 = new C27583As7();
        c27583As7.LIZJ = "sku_detail";
        c27583As7.LIZ(i);
        c27583As7.LIZIZ(c70289RiH.LJLIL.toThumbFirstImageUrlModel());
        W5F LJ = C70759Rpr.LJ(c70289RiH.LJLIL);
        LJ.LJIJJ = EnumC72807Shn.CENTER_CROP;
        S3I s3i = new S3I();
        s3i.LIZLLL = iSpecUiStyle.getSpecImageRadius();
        LJ.LJIJJLI = new S3L(s3i);
        LJ.LJIILIIL = C7MY.LIZJ(this.itemView, "itemView.context", R.attr.cj);
        LJ.LJJIIJ = this.LJLJI;
        L9G.LIZIZ(LJ, new C70397Rk1(c27583As7));
        this.LJLILLLLZI.setText(c70289RiH.LJLILLLLZI);
        if (c70289RiH.LJLJJI) {
            if (c70289RiH.LJLJI) {
                noStockBg = iSpecUiStyle.getCheckedBg();
            } else {
                noStockBg = iSpecUiStyle.getNoStockAndCheckedBg();
            }
        } else if (c70289RiH.LJLJI) {
            noStockBg = iSpecUiStyle.getNormalBg();
        } else {
            noStockBg = iSpecUiStyle.getNoStockBg();
        }
        this.LJLIL.setBackgroundResource(noStockBg);
        this.LJLILLLLZI.getPaint().setFlags(0);
        if (c70289RiH.LJLJJI) {
            if (c70289RiH.LJLJI) {
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                Integer LJI = C79045V0n.LJI(iSpecUiStyle.getTextCheckedColor(), context);
                if (LJI != null) {
                    this.LJLILLLLZI.setTextColor(LJI.intValue());
                }
                this.LJLJI.setAlpha(1.0f);
                return;
            }
            Context context2 = this.itemView.getContext();
            o.LJIIIIZZ(context2, "itemView.context");
            Integer LJI2 = C79045V0n.LJI(iSpecUiStyle.getTextNoStockAndCheckColor(), context2);
            if (LJI2 != null) {
                this.LJLILLLLZI.setTextColor(LJI2.intValue());
            }
            this.LJLJI.setAlpha(0.5f);
            if (!iSpecUiStyle.getTextStrikeThrough()) {
                return;
            }
            this.LJLILLLLZI.getPaint().setFlags(16);
            this.LJLILLLLZI.getPaint().setAntiAlias(true);
            return;
        }
        if (c70289RiH.LJLJI) {
            Context context3 = this.itemView.getContext();
            o.LJIIIIZZ(context3, "itemView.context");
            Integer LJI3 = C79045V0n.LJI(iSpecUiStyle.getTextNormalColor(), context3);
            if (LJI3 != null) {
                this.LJLILLLLZI.setTextColor(LJI3.intValue());
            }
            this.LJLJI.setAlpha(1.0f);
            return;
        }
        Context context4 = this.itemView.getContext();
        o.LJIIIIZZ(context4, "itemView.context");
        Integer LJI4 = C79045V0n.LJI(iSpecUiStyle.getTextNoStockColor(), context4);
        if (LJI4 != null) {
            this.LJLILLLLZI.setTextColor(LJI4.intValue());
        }
        this.LJLJI.setAlpha(0.5f);
        if (!iSpecUiStyle.getTextStrikeThrough()) {
            return;
        }
        this.LJLILLLLZI.getPaint().setFlags(16);
        this.LJLILLLLZI.getPaint().setAntiAlias(true);
    }
}
