package X;

import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* renamed from: X.CpF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32501CpF extends ConstraintLayout implements InterfaceC76931UHf {
    public boolean LJLIL;
    public final ImageView LJLILLLLZI;
    public final ImageView LJLJI;
    public final C47121t6 LJLJJI;

    @Override // X.InterfaceC76931UHf
    public final boolean LJJLIL() {
        if (this.LJLIL || this.LJLJI.getVisibility() == 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC76931UHf
    public final boolean LJIL(int i) {
        if (this.LJLJI.getVisibility() == 0) {
            return false;
        }
        int[] iArr = new int[2];
        this.LJLJJI.getLocationInWindow(iArr);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("shouldShowDivider# mGiftDescriptionTv loc = ");
        LIZ.append(iArr[0]);
        LIZ.append(", ");
        LIZ.append(this.LJLJJI.getWidth());
        C0NB.LIZIZ("BannerParentLayout", X1D.LIZIZ(LIZ));
        if (CCJ.LIZ(getContext())) {
            if (iArr[0] <= i) {
                return true;
            }
            return false;
        }
        if (this.LJLJJI.getWidth() + iArr[0] >= i) {
            return true;
        }
        return false;
    }

    public final void setBannerClickListener(InterfaceC65784Pro<C76800UCe> clickListener) {
        o.LJIIIZ(clickListener, "clickListener");
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS25S0100000_5(clickListener, 155)));
    }

    public final void setData(GiftPanelBanner banner) {
        int i;
        int i2;
        float f;
        TextFormat textFormat;
        Integer num;
        String str;
        int LJIIIZ;
        List<String> list;
        o.LJIIIZ(banner, "banner");
        C78609UtB.LJJJJL(this.LJLILLLLZI, banner.leftIcon, getLayoutParams().width, getLayoutParams().height);
        ImageView imageView = this.LJLILLLLZI;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ImageModel imageModel = banner.leftIcon;
        if (imageModel != null) {
            i = imageModel.height;
        } else {
            i = 48;
        }
        marginLayoutParams.height = C87277YNd.LJIIJJI(i);
        ImageModel imageModel2 = banner.leftIcon;
        if (imageModel2 != null) {
            i2 = imageModel2.width;
        } else {
            i2 = 48;
        }
        marginLayoutParams.width = C87277YNd.LJIIJJI(i2);
        int i3 = marginLayoutParams.height;
        if (i3 == 0) {
            i3 = C87277YNd.LJIIJJI(48);
        }
        marginLayoutParams.height = i3;
        int i4 = marginLayoutParams.width;
        if (i4 == 0) {
            i4 = C87277YNd.LJIIJJI(48);
        }
        marginLayoutParams.width = i4;
        C16530kr.LJII(marginLayoutParams, 0);
        imageView.setLayoutParams(marginLayoutParams);
        if (!CollectionUtil.isListEmpty(banner.bgColors)) {
            List<String> list2 = banner.bgColors;
            String str2 = null;
            if (list2 != null) {
                str = (String) ListProtector.get(list2, 0);
            } else {
                str = null;
            }
            List<String> list3 = banner.bgColors;
            if (list3 != null && list3.size() > 1 && (list = banner.bgColors) != null) {
                str2 = (String) ListProtector.get(list, 1);
            }
            if (str != null && ((str.length() == 7 || str.length() == 9) && Pattern.matches("#[0-9a-fA-F]+", str))) {
                int parseColor = ColorProtector.parseColor(str);
                if (str2 == null || ((str2.length() != 7 && str2.length() != 9) || !Pattern.matches("#[0-9a-fA-F]+", str2))) {
                    LJIIIZ = C07290Qj.LJIIIZ(C07290Qj.LJIIL(parseColor, 153), -13816531);
                } else {
                    LJIIIZ = ColorProtector.parseColor(str2);
                }
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{parseColor, LJIIIZ});
                gradientDrawable.setShape(0);
                float f2 = 8;
                gradientDrawable.setCornerRadii(new float[]{C87277YNd.LJIIJ(f2), C87277YNd.LJIIJ(f2), C87277YNd.LJIIJ(f2), C87277YNd.LJIIJ(f2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                setBackground(gradientDrawable);
            }
            this.LJLIL = true;
        } else {
            setBackgroundResource(R.drawable.cem);
            this.LJLIL = false;
        }
        this.LJLJJI.setText(C32499CpD.LIZ(banner.displayText));
        C47121t6 c47121t6 = this.LJLJJI;
        Text text = banner.displayText;
        if (text != null && (textFormat = text.defaultFormat) != null && (num = textFormat.fontSize) != null) {
            f = num.intValue();
        } else {
            f = 12.0f;
        }
        c47121t6.setTextSize(1, f);
        this.LJLJJI.setHorizontalFadingEdgeEnabled(true);
        this.LJLJJI.setWillNotDraw(false);
        C32173Cjx.LIZ(this.LJLJJI);
        if (C29306Beo.LJIJJLI(banner.schemaUrl)) {
            this.LJLJJI.setFadingEdgeLength(C15380j0.LIZ(25.0f));
            this.LJLJI.setVisibility(0);
            ViewGroup.LayoutParams layoutParams2 = this.LJLJJI.getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.width = 0;
            layoutParams3.weight = 1.0f;
        } else {
            this.LJLJJI.setFadingEdgeLength(C15380j0.LIZ(22.0f));
            this.LJLJI.setVisibility(8);
            this.LJLJJI.getLayoutParams().width = -2;
            ViewGroup.LayoutParams layoutParams4 = this.LJLJJI.getLayoutParams();
            o.LJII(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
            layoutParams5.width = -2;
            layoutParams5.weight = 0.0f;
        }
        if (LJJLIL()) {
            C78609UtB.LJJIJIL(0, this.LJLJJI);
        } else {
            C78609UtB.LJJIJIL(C87277YNd.LJIIJJI(8), this.LJLJJI);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32501CpF(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32501CpF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        ViewGroup.inflate(context, R.layout.dow, this);
        View findViewById = findViewById(R.id.fow);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.left_icon)");
        this.LJLILLLLZI = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.kqd);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.subscription_button)");
        this.LJLJI = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.dsn);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.gift_description)");
        this.LJLJJI = (C47121t6) findViewById3;
    }
}
