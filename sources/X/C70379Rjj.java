package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Rjj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70379Rjj extends AbstractC70272Ri0<C70288RiG> {
    public final TuxTextView LJLIL;
    public final LinearLayout LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70379Rjj(ViewGroup parent) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.a7t, parent, false));
        o.LJIIIZ(parent, "parent");
        this.LJLIL = (TuxTextView) this.itemView.findViewById(R.id.as7);
        this.LJLILLLLZI = (LinearLayout) this.itemView.findViewById(R.id.k9a);
    }

    @Override // X.AbstractC70272Ri0
    public final void L(int i, Object obj) {
        int noStockTextBg;
        C70288RiG c70288RiG = (C70288RiG) obj;
        ISpecUiStyle iSpecUiStyle = c70288RiG.LJLJJI;
        this.itemView.getContext();
        this.LJLIL.setText(c70288RiG.LJLIL);
        this.LJLIL.setTuxFont(iSpecUiStyle.getSpecTextFont());
        LinearLayout specContainer = this.LJLILLLLZI;
        o.LJIIIIZZ(specContainer, "specContainer");
        C26338AVi.LJIIIZ(specContainer, Integer.valueOf(iSpecUiStyle.getSpecTextPadding()), Integer.valueOf(this.LJLILLLLZI.getPaddingTop()), Integer.valueOf(iSpecUiStyle.getSpecTextPadding()), Integer.valueOf(this.LJLILLLLZI.getPaddingBottom()), 16);
        if (c70288RiG.LJLJI) {
            if (c70288RiG.LJLILLLLZI) {
                noStockTextBg = iSpecUiStyle.getCheckedTextBg();
            } else {
                noStockTextBg = iSpecUiStyle.getNoStockAndCheckedTextBg();
            }
        } else if (c70288RiG.LJLILLLLZI) {
            noStockTextBg = iSpecUiStyle.getNormalTextBg();
        } else {
            noStockTextBg = iSpecUiStyle.getNoStockTextBg();
        }
        this.LJLILLLLZI.setBackgroundResource(noStockTextBg);
        this.LJLIL.getPaint().setFlags(0);
        if (c70288RiG.LJLJI) {
            if (c70288RiG.LJLILLLLZI) {
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                Integer LJI = C79045V0n.LJI(iSpecUiStyle.getTextCheckedColor(), context);
                if (LJI != null) {
                    this.LJLIL.setTextColor(LJI.intValue());
                }
            } else {
                Context context2 = this.itemView.getContext();
                o.LJIIIIZZ(context2, "itemView.context");
                Integer LJI2 = C79045V0n.LJI(iSpecUiStyle.getTextNoStockAndCheckColor(), context2);
                if (LJI2 != null) {
                    this.LJLIL.setTextColor(LJI2.intValue());
                }
                if (iSpecUiStyle.getTextStrikeThrough()) {
                    this.LJLIL.getPaint().setFlags(16);
                    this.LJLIL.getPaint().setAntiAlias(true);
                }
            }
        } else if (c70288RiG.LJLILLLLZI) {
            Context context3 = this.itemView.getContext();
            o.LJIIIIZZ(context3, "itemView.context");
            Integer LJI3 = C79045V0n.LJI(iSpecUiStyle.getTextNormalColor(), context3);
            if (LJI3 != null) {
                this.LJLIL.setTextColor(LJI3.intValue());
            }
        } else {
            Context context4 = this.itemView.getContext();
            o.LJIIIIZZ(context4, "itemView.context");
            Integer LJI4 = C79045V0n.LJI(iSpecUiStyle.getTextNoStockColor(), context4);
            if (LJI4 != null) {
                this.LJLIL.setTextColor(LJI4.intValue());
            }
            if (iSpecUiStyle.getTextStrikeThrough()) {
                this.LJLIL.getPaint().setFlags(16);
                this.LJLIL.getPaint().setAntiAlias(true);
            }
        }
        int LJJIIZ = (C27162AlK.LIZ - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)) * 2)) - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)) * 2);
        if (LJJIIZ > 0) {
            this.LJLIL.setMaxWidth(LJJIIZ);
        }
        this.LJLILLLLZI.setMinimumWidth(0);
        if (iSpecUiStyle.getNormalSpecMinWidth() > 0) {
            this.LJLILLLLZI.setMinimumWidth(iSpecUiStyle.getNormalSpecMinWidth());
        }
        if (iSpecUiStyle.getNormalSpecMinHeight() > 0) {
            this.LJLILLLLZI.setMinimumHeight(iSpecUiStyle.getNormalSpecMinHeight());
        }
    }
}
