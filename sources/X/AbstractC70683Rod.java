package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.IReviewCellStyle;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Rod, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC70683Rod extends ConstraintLayout {
    public abstract SmartAvatarImageView getIvAvatar();

    public abstract int getLayoutResId();

    public abstract LTF getRsStar();

    public abstract TuxTextView getTvSku();

    public abstract TuxTextView getTvUserName();

    public final void setAvatar(Image image) {
        W5F LJ = C70759Rpr.LJ(image);
        LJ.LJIIJJI = R.drawable.dds;
        LJ.LJJIIJ = getIvAvatar();
        C16880lQ.LLJJJ(LJ);
    }

    public final void setSku(String skuText) {
        o.LJIIIZ(skuText, "skuText");
        getTvSku().setVisibility(0);
        getTvSku().setText(skuText);
    }

    public final void setStarRate(float f) {
        getRsStar().setRate(f);
    }

    public final void setUiStyle(IReviewCellStyle style) {
        o.LJIIIZ(style, "style");
        if (o.LJ(null, style)) {
            return;
        }
        SmartAvatarImageView ivAvatar = getIvAvatar();
        ViewGroup.LayoutParams layoutParams = ivAvatar.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(ivAvatar.getContext(), (AttributeSet) null);
        }
        layoutParams.width = style.getAvatarWidth();
        layoutParams.height = style.getAvatarHeight();
        ivAvatar.setLayoutParams(layoutParams);
        getTvUserName().setTuxFont(style.getUserNameFont());
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(style.getUserNameColor(), context);
        if (LJI != null) {
            getTvUserName().setTextColor(LJI.intValue());
        }
        Integer userNameMarginStart = style.getUserNameMarginStart();
        if (userNameMarginStart != null) {
            C45804HyK.LJJLIIIIJ(userNameMarginStart.intValue(), getTvUserName());
        }
        Integer starMarginTop = style.getStarMarginTop();
        if (starMarginTop != null) {
            C45804HyK.LJJLIIIJ(starMarginTop.intValue(), getRsStar());
        }
        Integer starMarginStart = style.getStarMarginStart();
        if (starMarginStart != null) {
            C45804HyK.LJJLIIIIJ(starMarginStart.intValue(), getRsStar());
        }
        getRsStar().setStarSize(style.getStarSize());
        getTvSku().setTuxFont(style.getSkuTextFont());
    }

    public final void setUsername(String name) {
        o.LJIIIZ(name, "name");
        getTvUserName().setText(name);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC70683Rod(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC70683Rod(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), getLayoutResId(), this, true);
    }
}
