package X;

import Y.AUListenerS103S0100000_16;
import Y.AUListenerS76S0101000_16;
import android.animation.ValueAnimator;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.YdL, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87819YdL extends AbstractC87817YdJ {
    public final ViewStub LJIILJJIL;
    public ViewGroup LJIILL;
    public ImageView LJIILLIIL;
    public ViewGroup LJIIZILJ;
    public TextView LJIJ;
    public TextView LJIJI;
    public TextView LJIJJ;
    public ImageView LJIJJLI;
    public final float LJIL;
    public final int LJJ;

    public static C87837Ydd LJIILIIL(String str) {
        int length = str.length();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (Character.isDigit(str.charAt(i3))) {
                if (i == -1) {
                    i = i3;
                }
                i2 = i3;
            } else if (i != -1) {
                break;
            }
        }
        if (i >= 0 && i < str.length() && i2 >= 0 && i2 < str.length()) {
            String substring = str.substring(0, i);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int i4 = i2 + 1;
            String substring2 = str.substring(i, i4);
            o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring3 = str.substring(i4, str.length());
            o.LJIIIIZZ(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
            try {
                return new C87837Ydd(CastIntegerProtector.parseInt(substring2), substring, substring3);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @Override // X.AbstractC87817YdJ
    public final void LJ(C31521CYr textInfo) {
        int i;
        int i2;
        boolean z;
        int i3;
        o.LJIIIZ(textInfo, "textInfo");
        if (this.LIZIZ.LIZJ) {
            CharSequence text = this.LJI.getText();
            this.LJI.setText(textInfo.LIZIZ);
            TextView textView = this.LJI;
            CharSequence text2 = textView.getText();
            int length = text2.length();
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < length; i6++) {
                if (Character.isDigit(text2.charAt(i6))) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                } else if (i4 != -1) {
                    break;
                }
            }
            if (i4 >= 0 && i4 < text2.length() && i5 >= 0 && i5 < text2.length()) {
                textView.setText(text2.subSequence(0, i5 + 1).toString());
                AbstractC87817YdJ.LJFF(textView);
                int lineWidth = (int) textView.getLayout().getLineWidth(0);
                textView.setText(text2);
                if (lineWidth - textView.getWidth() > 50) {
                    C87838Yde c87838Yde = new C87838Yde(i4, i5);
                    RankAnimationInfo rankAnimationInfo = textInfo.LJFF;
                    if (rankAnimationInfo != null && rankAnimationInfo.type == EnumC31519CYp.RISE.getType()) {
                        i3 = this.LJJ;
                    } else {
                        i3 = this.LIZIZ.LJII;
                    }
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i3);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textInfo.LIZIZ);
                    spannableStringBuilder.setSpan(foregroundColorSpan, c87838Yde.LIZ, c87838Yde.LIZIZ + 1, 33);
                    LJIIIZ(YZJ.RESET, this.LJI, spannableStringBuilder, -1L, new C87836Ydc(this));
                    return;
                }
            }
            this.LJI.setText(text);
        }
        ViewStub viewStub = this.LJIILJJIL;
        if (viewStub != null && viewStub.getParent() != null) {
            View inflate = this.LJIILJJIL.inflate();
            View findViewById = inflate.findViewById(R.id.h92);
            o.LJIIIIZZ(findViewById, "stub.findViewById(R.id.num_container)");
            this.LJIILL = (ViewGroup) findViewById;
            View findViewById2 = inflate.findViewById(R.id.h93);
            o.LJIIIIZZ(findViewById2, "stub.findViewById(R.id.num_icon)");
            this.LJIILLIIL = (ImageView) findViewById2;
            View findViewById3 = inflate.findViewById(R.id.l4c);
            o.LJIIIIZZ(findViewById3, "stub.findViewById(R.id.text_group)");
            this.LJIIZILJ = (ViewGroup) findViewById3;
            View findViewById4 = inflate.findViewById(R.id.h96);
            o.LJIIIIZZ(findViewById4, "stub.findViewById(R.id.num_text1)");
            this.LJIJ = (TextView) findViewById4;
            View findViewById5 = inflate.findViewById(R.id.h97);
            o.LJIIIIZZ(findViewById5, "stub.findViewById(R.id.num_text2)");
            this.LJIJI = (TextView) findViewById5;
            View findViewById6 = inflate.findViewById(R.id.h98);
            o.LJIIIIZZ(findViewById6, "stub.findViewById(R.id.num_text3)");
            this.LJIJJ = (TextView) findViewById6;
            View findViewById7 = inflate.findViewById(R.id.h91);
            o.LJIIIIZZ(findViewById7, "stub.findViewById(R.id.num_arrow)");
            this.LJIJJLI = (ImageView) findViewById7;
        }
        C87837Ydd LJIILIIL = LJIILIIL(this.LJI.getText().toString());
        C87837Ydd LJIILIIL2 = LJIILIIL(textInfo.LIZIZ);
        if (LJIILIIL != null && LJIILIIL2 != null && o.LJ(LJIILIIL.LIZ, LJIILIIL2.LIZ) && o.LJ(LJIILIIL.LIZJ, LJIILIIL2.LIZJ) && (i = LJIILIIL.LIZIZ) != (i2 = LJIILIIL2.LIZIZ)) {
            if (i2 < i) {
                z = true;
            } else {
                z = false;
            }
            int width = this.LJ.getWidth();
            this.LJ.setVisibility(8);
            ViewGroup viewGroup = this.LJIILL;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                TextView textView2 = this.LJIJ;
                if (textView2 != null) {
                    textView2.setText(LJIILIIL.LIZ);
                    TextView textView3 = this.LJIJI;
                    if (textView3 != null) {
                        textView3.setText(String.valueOf(LJIILIIL.LIZIZ));
                        TextView textView4 = this.LJIJJ;
                        if (textView4 != null) {
                            textView4.setText(LJIILIIL.LIZJ);
                            ImageView imageView = this.LJIILLIIL;
                            if (imageView != null) {
                                AbstractC87817YdJ.LJI(imageView, textInfo);
                                LJIIL(textInfo);
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                                ofFloat.setDuration(300L);
                                ofFloat.setInterpolator(C18950ol.LIZIZ(0.01f, -0.0f, 0.18f, 1.0f));
                                ofFloat.addUpdateListener(new AUListenerS76S0101000_16(this, width, 0));
                                ofFloat.start();
                                float[] fArr = new float[2];
                                float f = this.LJIL;
                                if (!z) {
                                    f *= -1.0f;
                                }
                                fArr[0] = f;
                                fArr[1] = 0.0f;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
                                ofFloat2.setDuration(300L);
                                ofFloat2.setInterpolator(C18950ol.LIZIZ(0.01f, -0.0f, 0.18f, 1.0f));
                                ofFloat2.addListener(new C87828YdU(this, z));
                                ofFloat2.addUpdateListener(new AUListenerS76S0101000_16(this, width, 1));
                                ofFloat2.setStartDelay(100L);
                                ofFloat2.start();
                                float[] fArr2 = new float[2];
                                fArr2[0] = 0.0f;
                                float f2 = this.LJIL;
                                if (z) {
                                    f2 *= -1.0f;
                                }
                                fArr2[1] = f2;
                                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
                                ofFloat3.setDuration(400L);
                                ofFloat3.setInterpolator(C18950ol.LIZIZ(0.01f, -0.0f, 0.18f, 1.0f));
                                ofFloat3.addUpdateListener(new AUListenerS103S0100000_16(this, 24));
                                ofFloat3.setStartDelay(800L);
                                ofFloat3.start();
                                float[] fArr3 = new float[2];
                                float f3 = this.LIZIZ.LJIIJ;
                                if (!z) {
                                    f3 *= -1.0f;
                                }
                                fArr3[0] = f3;
                                fArr3[1] = 0.0f;
                                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr3);
                                ofFloat4.setDuration(400L);
                                ofFloat4.addListener(new C87826YdS(this, LJIILIIL2, z));
                                ofFloat4.addUpdateListener(new AUListenerS76S0101000_16(this, width, 2));
                                ofFloat4.setStartDelay(1000L);
                                ofFloat4.start();
                                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(1.3f, 1.0f);
                                ofFloat5.setDuration(200L);
                                ofFloat5.addUpdateListener(new AUListenerS76S0101000_16(this, width, 3));
                                ofFloat5.setStartDelay(1700L);
                                ofFloat5.start();
                                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat6.setDuration(200L);
                                ofFloat6.addUpdateListener(new C87825YdR(this, width, z));
                                ofFloat6.addListener(new C87829YdV(this));
                                ofFloat6.setStartDelay(2200L);
                                ofFloat6.start();
                                return;
                            }
                            o.LJIJI("numIcon");
                            throw null;
                        }
                        o.LJIJI("numText3");
                        throw null;
                    }
                    o.LJIJI("numText2");
                    throw null;
                }
                o.LJIJI("numText1");
                throw null;
            }
            o.LJIJI("numContainer");
            throw null;
        }
        LJII(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87819YdL(CardView contentView, C87818YdK dataHolder) {
        super(contentView, dataHolder);
        o.LJIIIZ(contentView, "contentView");
        o.LJIIIZ(dataHolder, "dataHolder");
        ViewStub viewStub = (ViewStub) contentView.findViewById(R.id.h95);
        this.LJIILJJIL = viewStub;
        this.LJIL = C15380j0.LIZ(14.0f);
        this.LJJ = C15380j0.LIZIZ(R.color.a_c);
        if (viewStub == null) {
            View findViewById = contentView.findViewById(R.id.h92);
            o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.num_container)");
            this.LJIILL = (ViewGroup) findViewById;
            View findViewById2 = contentView.findViewById(R.id.h96);
            o.LJIIIIZZ(findViewById2, "contentView.findViewById(R.id.num_text1)");
            this.LJIJ = (TextView) findViewById2;
            View findViewById3 = contentView.findViewById(R.id.h97);
            o.LJIIIIZZ(findViewById3, "contentView.findViewById(R.id.num_text2)");
            this.LJIJI = (TextView) findViewById3;
            View findViewById4 = contentView.findViewById(R.id.h98);
            o.LJIIIIZZ(findViewById4, "contentView.findViewById(R.id.num_text3)");
            this.LJIJJ = (TextView) findViewById4;
            View findViewById5 = contentView.findViewById(R.id.h91);
            o.LJIIIIZZ(findViewById5, "contentView.findViewById(R.id.num_arrow)");
            this.LJIJJLI = (ImageView) findViewById5;
        }
    }
}
