package X;

import Y.ARunnableS38S0100000_2;
import Y.IDObjectS119S0200000_2;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.67f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1551967f extends C1545664u {
    public static final /* synthetic */ int LLJJJJ = 0;
    public View.OnClickListener LLJJIJIIJIL;
    public final Handler LLJJIJIL;
    public ARunnableS38S0100000_2 LLJJJ;
    public int LLJJJIL;

    @Override // X.C1545664u
    public final void LJIIZILJ() {
    }

    @Override // X.C1545664u
    public final void LJJIII() {
    }

    @Override // X.C1545664u
    public final void LJJIIJ() {
    }

    @Override // X.C1545664u
    public final void LJJIIJZLJL() {
    }

    @Override // X.C1545664u
    public int getLayoutRes() {
        return R.layout.aud;
    }

    @Override // X.C1545664u
    public final void LJIILLIIL() {
        C6B9 c6b9;
        View view = this.LJLILLLLZI;
        if (view != null) {
            c6b9 = (C6B9) view.findViewById(R.id.l56);
        } else {
            c6b9 = null;
        }
        this.LLIZLLLIL = c6b9;
        if (c6b9 != null) {
            c6b9.setOnTextSizeChangedListener(new C6BH() { // from class: X.685
                @Override // X.C6BH
                public final void LIZ() {
                    C1551767d c1551767d = C1551967f.this.LJLJI;
                    if (c1551767d != null) {
                        c1551767d.LLFZ = false;
                    }
                }
            });
        }
        int[] iArr = C68F.LIZ;
        try {
            SettingsManager.LIZLLL().getClass();
            int[] iArr2 = (int[]) SettingsManager.LJII("textmode_font_size_slider_value_range", int[].class);
            if (iArr2 != null) {
                iArr = iArr2;
            }
        } catch (Throwable unused) {
        }
        this.LLIZLLLIL.LIZJ(ORY.LJJJJ(0, iArr), ORY.LJJJJ(1, iArr), 20);
        this.LJLJI.setMinTextSize(15);
    }

    @Override // X.C1545664u
    public int getSafeAreaHeight() {
        int i = this.LLJJJIL;
        if (i > 0) {
            return i;
        }
        Context context = getContext();
        if (context == null) {
            return 0;
        }
        return JF5.LIZIZ(context) - ((JF5.LIZLLL(context) + ((int) C170576mj.LJ(context, 56.0f))) + ((int) C170576mj.LJ(context, 185.0f)));
    }

    @Override // X.C1545664u
    public final int LJI() {
        if (C90193gN.LIZIZ(getContext())) {
            return 3;
        }
        return 1;
    }

    @Override // X.C1545664u
    public final void LJIILJJIL() {
        super.LJIILJJIL();
        ImageView imageView = this.LJLLILLLL;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        View view = this.LJLJJI;
        if (view != null) {
            view.setVisibility(8);
        }
        TextView textView = (TextView) this.LJLILLLLZI.findViewById(R.id.mm5);
        C1551767d c1551767d = this.LJLJI;
        if (c1551767d != null) {
            c1551767d.addTextChangedListener(new IDObjectS119S0200000_2(this, textView, 0));
        }
    }

    @Override // X.C1545664u
    public int getScene() {
        return super.getScene();
    }

    private final void setRealSafeAreaHeight(int i) {
        C1551867e c1551867e;
        this.LLJJJIL = i;
        C1551767d c1551767d = this.LJLJI;
        if ((c1551767d instanceof C1551867e) && (c1551867e = (C1551867e) c1551767d) != null) {
            c1551867e.setSafeAreaHeight(i);
        }
    }

    @Override // X.C1545664u
    public final void LIZIZ(int i) {
        C1551767d c1551767d = this.LJLJI;
        if (c1551767d != null) {
            c1551767d.LJIILJJIL(this.LJLLJ, i);
        }
        this.LJLLLLLL = i;
        OI2.LJ = Integer.valueOf(i);
        OI2.LJIIIIZZ().storeInt("text_color", i);
    }

    @Override // X.C1545664u
    public final void LIZJ(TextFontStyleData textFontStyleData) {
        String str;
        String str2;
        String str3;
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("name:");
        String str4 = null;
        if (textFontStyleData != null) {
            str = textFontStyleData.fileName;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", type: ");
        if (textFontStyleData != null) {
            str2 = textFontStyleData.fontName;
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        if (textFontStyleData != null) {
            str3 = textFontStyleData.fileName;
        } else {
            str3 = null;
        }
        OI2.LIZLLL = str3;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            OI2.LJIIIIZZ().erase("font_name");
        } else {
            OI2.LJIIIIZZ().storeString("font_name", str3);
        }
        C1551767d c1551767d = this.LJLJI;
        if (c1551767d != null) {
            if (textFontStyleData != null) {
                str4 = textFontStyleData.fileName;
            }
            c1551767d.LJIIIZ(str4);
        }
    }

    @Override // X.C1545664u
    public final int LIZLLL(int i) {
        int LJI = LJI();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return LJI;
                }
                return 1;
            }
            return 3;
        }
        return 2;
    }

    @Override // X.C1545664u
    public final String LJIIJJI(List<TextStickerTextWrap> list) {
        boolean z;
        int i = 0;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        if (list.size() > 1) {
            int size = list.size() - 2;
            if (size >= 0) {
                while (true) {
                    sb.append(((TextStickerTextWrap) ListProtector.get(list, i)).safeStrPair().first);
                    sb.append("\n");
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
            sb.append(((TextStickerTextWrap) DIX.LIZJ(list, 1, list)).safeStrPair().first);
        } else {
            sb.append(((TextStickerTextWrap) ListProtector.get(list, 0)).safeStrPair().first);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "result.toString()");
        return sb2;
    }

    @Override // X.C1545664u
    public final void LJIILL(View view) {
        ImageView imageView;
        if (view != null && (imageView = (ImageView) view.findViewById(R.id.eys)) != null) {
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.axo);
            C16880lQ.LJIILLIIL(imageView, new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 19));
        }
    }

    public final void setBackEventCallBack(View.OnClickListener onClickListener) {
        this.LLJJIJIIJIL = onClickListener;
    }

    @Override // X.C1545664u
    public void setSafeAreaHeight(int i) {
        setRealSafeAreaHeight(i - ((int) C170576mj.LJ(getContext(), 140.0f)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1551967f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LLJJIJIL = new Handler(C16880lQ.LLJJJJ());
    }

    @Override // X.C1545664u
    public final void LJIJJLI(List<TextStickerTextWrap> list, List<? extends InlineRichTextStyleData> list2, int i, int i2, int i3, String str, boolean z, int i4, int i5, Integer num, boolean z2, boolean z3) {
        if (TextUtils.isEmpty(str) && (str = OI2.LIZLLL) == null) {
            str = OI2.LJIIIIZZ().getString("font_name", null);
        }
        if (TextUtils.isEmpty(str)) {
            str = C68M.LJIIJ().LJII();
        }
        if (TextUtils.isEmpty(str)) {
            str = "default";
        }
        if (z) {
            C1556068u c1556068u = this.LJLJLLL;
            if (c1556068u != null) {
                c1556068u.LIZIZ();
                c1556068u.setSelectColorView(i2);
            }
            LJ();
            i3 = LJI();
            Integer num2 = OI2.LJ;
            if (num2 != null || (num2 = Integer.valueOf(OI2.LJIIIIZZ().getInt("text_color", -1))) != null) {
                i2 = num2.intValue();
            }
            if (this.LJLJI.getEditFontSize() > 0) {
                i4 = this.LJLJI.getEditFontSize();
            } else {
                i4 = 20;
            }
            i = 1;
        }
        super.LJIJJLI(list, list2, i, i2, i3, str, false, i4, i5, null, false, false);
    }

    @Override // X.C1545664u
    public final void LJJIFFI(List<TextStickerTextWrap> list, List<? extends InlineRichTextStyleData> list2, int i, int i2, int i3, String str, boolean z, int i4, int i5, String str2, Integer num, boolean z2, boolean z3) {
        super.LJJIFFI(list, list2, i, i2, i3, str, z, i4, i5, str2, null, false, false);
        ImageView imageView = this.LJLLILLLL;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        View view = this.LJLJJI;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }
}
