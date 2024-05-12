package X;

import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.RandomGiftPanelBanner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* renamed from: X.Cjy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32174Cjy extends FrameLayout implements InterfaceC76931UHf {
    public boolean LJLIL;
    public final ImageView LJLILLLLZI;
    public final ImageView LJLJI;
    public final C141485gu LJLJJI;
    public final C47121t6 LJLJJL;
    public final ImageView LJLJJLL;
    public final View LJLJL;

    @Override // X.InterfaceC76931UHf
    public final boolean LJJLIL() {
        if (!this.LJLIL || this.LJLJL.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC76931UHf
    public final boolean LJIL(int i) {
        LJJLIL();
        return false;
    }

    public final void setBannerClickListener(InterfaceC65784Pro<C76800UCe> clickListener) {
        o.LJIIIZ(clickListener, "clickListener");
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS25S0100000_5(clickListener, 156)));
    }

    public final void setData(RandomGiftPanelBanner data) {
        String str;
        boolean z;
        GradientDrawable gradientDrawable;
        o.LJIIIZ(data, "data");
        if (!CollectionUtil.isListEmpty(data.bgColors)) {
            List<String> list = data.bgColors;
            String str2 = null;
            if (list != null) {
                str = (String) ListProtector.get(list, 0);
            } else {
                str = null;
            }
            List<String> list2 = data.bgColors;
            if (list2 != null) {
                str2 = (String) ListProtector.get(list2, 1);
            }
            if (str != null && ((str.length() == 7 || str.length() == 9) && Pattern.matches("#[0-9a-fA-F]+", str))) {
                ImageView imageView = this.LJLJJLL;
                int parseColor = ColorProtector.parseColor(str);
                int parseColor2 = ColorProtector.parseColor(str2);
                if (C16310kV.LIZLLL(this) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{parseColor, parseColor2});
                } else {
                    gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{parseColor, parseColor2});
                }
                imageView.setImageDrawable(gradientDrawable);
                this.LJLIL = true;
            }
        } else {
            setBackgroundResource(R.drawable.cem);
            this.LJLIL = false;
        }
        ImageModel imageModel = data.shadingImage;
        if (imageModel != null) {
            C78609UtB.LJJJJL(this.LJLJI, imageModel, getLayoutParams().width, getLayoutParams().height);
        }
        ImageModel imageModel2 = data.leftIcon;
        if (imageModel2 != null) {
            C78609UtB.LJJJJLI(this.LJLILLLLZI, imageModel2, R.drawable.d4o, getLayoutParams().width, getLayoutParams().height);
        }
        String str3 = data.displayText;
        if (str3 != null) {
            this.LJLJJL.setText(str3);
            this.LJLJJL.setHorizontalFadingEdgeEnabled(true);
            this.LJLJJL.setWillNotDraw(false);
            C32173Cjx.LIZ(this.LJLJJL);
        }
        if (data.round == 1) {
            if (data.collectNum != 0) {
                this.LJLJJI.setVisibility(0);
                this.LJLJJI.setProgress((((float) data.collectNum) / ((float) data.targetNum)) * 100);
                return;
            } else {
                this.LJLJJI.setVisibility(8);
                return;
            }
        }
        this.LJLJJI.setVisibility(0);
        long j = data.collectNum;
        if (j != 0) {
            this.LJLJJI.setProgress((((float) j) / ((float) data.targetNum)) * 100);
        } else {
            this.LJLJJI.setProgress((0.5f / ((float) data.targetNum)) * 100);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32174Cjy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        FrameLayout.inflate(context, R.layout.dox, this);
        View findViewById = findViewById(R.id.fow);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.left_icon)");
        this.LJLILLLLZI = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.js7);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.shading_image)");
        this.LJLJI = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.ib8);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.progress_view)");
        this.LJLJJI = (C141485gu) findViewById3;
        View findViewById4 = findViewById(R.id.dsn);
        ((TextView) findViewById4).setTypeface(C49616Jdc.LIZIZ().LIZLLL("medium"));
        o.LJIIIIZZ(findViewById4, "findViewById<LiveTextVie…ontName.MEDIUM)\n        }");
        this.LJLJJL = (C47121t6) findViewById4;
        View findViewById5 = findViewById(R.id.ajf);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.bg_image)");
        this.LJLJJLL = (ImageView) findViewById5;
        View findViewById6 = findViewById(R.id.kqd);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.subscription_button)");
        this.LJLJL = findViewById6;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (C16310kV.LIZLLL(this) == 1) {
            this.LJLILLLLZI.setScaleX(-1.0f);
            this.LJLJI.setScaleX(-1.0f);
        }
    }
}
