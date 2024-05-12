package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes13.dex */
public final class TD2 extends TDE {
    public C8HN LLJJIJI;
    public C8HN LLJJIJIIJIL;

    @Override // X.TDE, X.TDG
    public final int LJI() {
        return R.layout.crf;
    }

    public final C8HN getStickerTitleText() {
        C8HN c8hn = this.LLJJIJI;
        if (c8hn != null) {
            return c8hn;
        }
        o.LJIJI("stickerTitleText");
        throw null;
    }

    public final C8HN getStickerUseNumberText() {
        C8HN c8hn = this.LLJJIJIIJIL;
        if (c8hn != null) {
            return c8hn;
        }
        o.LJIJI("stickerUseNumberText");
        throw null;
    }

    @Override // X.TDE, X.TDG
    public final View LJFF(Context context) {
        o.LJIIIZ(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.crf, frameLayout, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        View findViewById = LLLLIILL.findViewById(R.id.jho);
        o.LJIIIIZZ(findViewById, "content.findViewById(R.i…earch_sticker_title_view)");
        this.LLJJIJI = (C8HN) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.jhp);
        o.LJIIIIZZ(findViewById2, "content.findViewById(R.i…earch_sticker_use_number)");
        this.LLJJIJIIJIL = (C8HN) findViewById2;
        LLLLIILL.setLayoutParams(layoutParams);
        frameLayout.addView(LLLLIILL);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return frameLayout;
    }

    @Override // X.TDE, X.TDG
    public final View LJII(Context context) {
        o.LJIIIZ(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        C8HN c8hn = new C8HN(context);
        c8hn.setLayoutParams(layoutParams);
        c8hn.setGravity(8388611);
        return c8hn;
    }

    public final void LJJ(String str) {
        OSZ osz;
        int i;
        o.LJIIIZ(str, "str");
        C8HN c8hn = this.LLJJIJI;
        if (c8hn != null) {
            CharSequence text = c8hn.getText();
            SpannableString spannableString = new SpannableString(text);
            String charSequence = text.toString();
            Locale locale = Locale.ROOT;
            o.LJIIIIZZ(locale, "Locale.ROOT");
            if (charSequence != null) {
                String lowerCase = charSequence.toLowerCase(locale);
                o.LJIIIIZZ(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String lowerCase2 = str.toLowerCase(locale);
                o.LJIIIIZZ(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                spannableString.setSpan(new StyleSpan(0), 0, text.length(), 33);
                spannableString.setSpan(new ForegroundColorSpan(ColorProtector.parseColor("#BFFFFFFF")), 0, text.length(), 33);
                if (s.LJJJLZIJ(lowerCase, lowerCase2, false) || s.LJJJLZIJ(new OJD("\\s+").replace(lowerCase, ""), lowerCase2, false)) {
                    String pattern = text.toString();
                    o.LJIIIZ(pattern, "pattern");
                    int length = pattern.length();
                    loop0: for (int i2 = 0; i2 < length && str.length() + i2 <= pattern.length(); i2++) {
                        int length2 = str.length();
                        int i3 = 0;
                        for (int i4 = 0; i4 < length2; i4++) {
                            while (true) {
                                i = i2 + i4 + i3;
                                if (i >= pattern.length() || !Character.isSpaceChar(pattern.charAt(i)) || Character.isSpaceChar(str.charAt(i4))) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            if (i >= pattern.length() || !C17N.LJIILLIIL(pattern.charAt(i), str.charAt(i4), true)) {
                            }
                        }
                        osz = new OSZ(Integer.valueOf(i2), Integer.valueOf(i3));
                    }
                    osz = new OSZ(-1, -1);
                    int intValue = ((Number) osz.getFirst()).intValue();
                    int intValue2 = ((Number) osz.getSecond()).intValue();
                    if (intValue <= C1FL.LIZ(str, intValue, intValue2)) {
                        int length3 = text.length();
                        if (intValue >= 0 && length3 >= intValue) {
                            int length4 = text.length();
                            int LIZ = C1FL.LIZ(str, intValue, intValue2);
                            if (LIZ >= 0 && length4 >= LIZ) {
                                spannableString.setSpan(new StyleSpan(1), intValue, str.length() + intValue + intValue2, 33);
                                spannableString.setSpan(new ForegroundColorSpan(-1), intValue, str.length() + intValue + intValue2, 33);
                            }
                        }
                    }
                    C8HN c8hn2 = this.LLJJIJI;
                    if (c8hn2 != null) {
                        c8hn2.setText(spannableString);
                        return;
                    } else {
                        o.LJIJI("stickerTitleText");
                        throw null;
                    }
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        o.LJIJI("stickerTitleText");
        throw null;
    }

    public final void setStickerTitleText(C8HN c8hn) {
        o.LJIIIZ(c8hn, "<set-?>");
        this.LLJJIJI = c8hn;
    }

    public final void setStickerUseNumberText(C8HN c8hn) {
        o.LJIIIZ(c8hn, "<set-?>");
        this.LLJJIJIIJIL = c8hn;
    }

    @Override // X.TDG
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
        C8HN c8hn = this.LLJJIJI;
        if (c8hn != null) {
            c8hn.setText(charSequence);
        } else {
            o.LJIJI("stickerTitleText");
            throw null;
        }
    }

    @Override // X.TDG
    public final void LIZIZ(LinearLayout linearLayout, boolean z) {
        int i;
        if (z) {
            i = -1;
        } else {
            i = -2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, -2);
        layoutParams.gravity = 17;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
    }

    @Override // X.TDG
    public final void LJIIIZ(View imageViewContainer, FrameLayout frameLayout, int i, int i2, boolean z) {
        o.LJIIIZ(imageViewContainer, "imageViewContainer");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        frameLayout.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(imageViewContainer.getLayoutParams());
        layoutParams2.gravity = 17;
        imageViewContainer.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TD2(Context context, boolean z, int i, int i2, int i3, int i4, boolean z2, int i5, int i6, int i7, boolean z3, boolean z4, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z5, boolean z6) {
        super(context, z, i, i2, i3, 0, 0, i4, z2, 0, 0, i5, i6, 0, 0, i7, z3, z4, i8, i9, i10, i11, i12, i13, i14, z5, z6, false, false, false, false, false, false, false, false, 0, 2013267552, 31);
        o.LJIIIZ(context, "context");
    }
}
