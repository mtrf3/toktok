package X;

import Y.ACListenerS45S0200000_10;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.component.ctacomponent.AnolFeedCtaButtonData;
import com.ss.android.ugc.aweme.component.ctacomponent.AnoleFeedCTAData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NCz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58985NCz extends AbstractC58982NCw {
    public View LJLLLL;
    public boolean LJLLLLLL;
    public final C62822Ol8 LJLZ;

    public final AnoleFeedCTAData LJIIJJI() {
        return (AnoleFeedCTAData) this.LJLZ.getValue();
    }

    @Override // X.AbstractC58982NCw, X.NC9
    public final C58983NCx isReady() {
        return new C58983NCx(true, null);
    }

    @Override // X.AbstractC58982NCw
    public final String LJII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnoleCTAComponent,type:");
        LIZ.append(this.LJLIL.getType());
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC58982NCw
    public final void LJIIJ() {
        super.LJIIJ();
        AnoleFeedCTAData LJIIJJI = LJIIJJI();
        if (LJIIJJI != null) {
            C73030SlO.LJIIJ(this, LJIIJJI.getInitialBackgroundColor());
        }
        this.LJLLLLLL = false;
    }

    @Override // X.AbstractC58982NCw
    public final void LIZLLL(AnoleComponentAppearModel appearModel) {
        String str;
        String str2;
        Long l;
        AnolFeedCtaButtonData ctaButtonData;
        AnoleModel anoleModel;
        o.LJIIIZ(appearModel, "appearModel");
        super.LIZLLL(appearModel);
        AnoleLogInfo logInfo = this.LJLIL.getLogInfo();
        if (logInfo == null || (str = logInfo.getTag()) == null) {
            str = "anole_ad";
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL(str, "othershow", this.LJLILLLLZI.getAwemeRawAd());
        AnoleLogInfo logInfo2 = this.LJLIL.getLogInfo();
        if (logInfo2 == null || (str2 = logInfo2.getRefer()) == null) {
            str2 = "anole_cta";
        }
        LIZLLL.LIZJ(str2, "refer");
        LIZLLL.LIZIZ(Long.valueOf(this.LJLIL.getID()), "component_id");
        AwemeRawAd awemeRawAd = this.LJLILLLLZI.getAwemeRawAd();
        Integer num = null;
        if (awemeRawAd != null && (anoleModel = awemeRawAd.getAnoleModel()) != null) {
            l = Long.valueOf(anoleModel.getTemplateID());
        } else {
            l = null;
        }
        LIZLLL.LIZIZ(l, "template_id");
        LIZLLL.LIZIZ(this.LJLIL.getType(), "component_type");
        LIZLLL.LIZIZ(0, "is_lynx");
        AnoleFeedCTAData LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (ctaButtonData = LJIIJJI.getCtaButtonData()) != null) {
            num = ctaButtonData.getButtonType();
        }
        LIZLLL.LIZIZ(num, "buttonType");
        LIZLLL.LJI();
    }

    @Override // X.AbstractC58982NCw, X.NC9
    public final void Q0(NCI event) {
        int i;
        Float colorShowTime;
        o.LJIIIZ(event, "event");
        if (event instanceof C58961NCb) {
            AnoleFeedCTAData LJIIJJI = LJIIJJI();
            if (LJIIJJI != null && (colorShowTime = LJIIJJI.getColorShowTime()) != null) {
                i = (int) colorShowTime.floatValue();
            } else {
                i = 0;
            }
            LJII();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("registerChangeButtonColor playProgress: ");
            LIZ.append(i);
            C242549fW.LIZ(X1D.LIZIZ(LIZ));
            InterfaceC58979NCt interfaceC58979NCt = this.LJLJI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LJLIL.getType());
            LIZ2.append('-');
            LIZ2.append(i);
            LIZ2.append("-button-change");
            interfaceC58979NCt.LJ(new ARunnableS46S0100000_10(this, 159), i, X1D.LIZIZ(LIZ2));
        }
    }

    @Override // X.AbstractC58982NCw, X.NC9
    public final void K0(ViewGroup viewGroup, InterfaceC58980NCu interfaceC58980NCu) {
        String buttonText;
        View view;
        TextView textView;
        C62846OlW c62846OlW;
        super.K0(viewGroup, interfaceC58980NCu);
        AnoleFeedCTAData LJIIJJI = LJIIJJI();
        if (LJIIJJI == null || (buttonText = LJIIJJI.getButtonText()) == null) {
            return;
        }
        LJII();
        C242549fW.LIZ("initButtonLayout ");
        int i = 0;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLJJI), R.layout.h3, this.LJLJL, false);
        this.LJLJLJ = LLLLIILL;
        ImageView imageView = null;
        if (LLLLIILL != null) {
            view = LLLLIILL.findViewById(R.id.a5r);
        } else {
            view = null;
        }
        this.LJLLLL = view;
        View view2 = this.LJLJLJ;
        if (view2 != null) {
            textView = (TextView) view2.findViewById(R.id.a5q);
        } else {
            textView = null;
        }
        View view3 = this.LJLJLJ;
        if (view3 != null) {
            c62846OlW = (C62846OlW) view3.findViewById(R.id.a5p);
        } else {
            c62846OlW = null;
        }
        View view4 = this.LJLJLJ;
        if (view4 != null) {
            imageView = (ImageView) view4.findViewById(R.id.a5n);
        }
        View view5 = this.LJLLLL;
        if (view5 != null) {
            ViewGroup.LayoutParams layoutParams = view5.getLayoutParams();
            layoutParams.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(LJIIJJI.getHeight())));
            view5.setLayoutParams(layoutParams);
            C16880lQ.LJIIJ(new ACListenerS45S0200000_10(this, LJIIJJI, 31), view5);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C32151Nz.LJIIZILJ(6));
            gradientDrawable.setShape(0);
            view5.setBackground(gradientDrawable);
            C73030SlO.LJIIJ(this, LJIIJJI.getInitialBackgroundColor());
        }
        if (textView != null) {
            textView.setText(buttonText);
        }
        if (c62846OlW != null) {
            String iconURL = LJIIJJI.getIconURL();
            if (iconURL != null && iconURL.length() > 0) {
                if (ujb.o.LJJJJ(iconURL, ".webp", false)) {
                    C78765Uvh.LIZJ(c62846OlW, iconURL, -1, -1, false);
                } else {
                    C78765Uvh.LJIIIZ(c62846OlW, iconURL, -1, -1);
                }
                c62846OlW.setVisibility(0);
            } else {
                c62846OlW.setVisibility(8);
            }
        }
        if (imageView == null) {
            return;
        }
        AnolFeedCtaButtonData ctaButtonData = LJIIJJI.getCtaButtonData();
        if (ctaButtonData == null || !o.LJ(ctaButtonData.getHaveArrow(), Boolean.TRUE)) {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58985NCz(AnoleComponentModel anoleComponentModel, Aweme awemeModel, InterfaceC58979NCt delegate, Context context) {
        super(anoleComponentModel, awemeModel, delegate, context);
        o.LJIIIZ(awemeModel, "awemeModel");
        o.LJIIIZ(delegate, "delegate");
        o.LJIIIZ(context, "context");
        this.LJLZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 506));
    }
}
