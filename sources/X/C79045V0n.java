package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.e;
import com.ss.android.ugc.aweme.services.external.IAVTransformModelService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.zhiliaoapp.musically.R;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.V0n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C79045V0n implements InterfaceC73592SuS, AnonymousClass100, IAVTransformModelService {
    public static final C79045V0n LJLIL = new C79045V0n();

    public void LIZJ(int i, int i2, View composeView) {
        o.LJIIIZ(composeView, "composeView");
    }

    public static final String LIZLLL(InterfaceC79048V0q convertToString) {
        o.LJIIJ(convertToString, "$this$convertToString");
        if (!convertToString.available()) {
            return "";
        }
        C10790bb c10790bb = new C10790bb(32);
        byte[] bArr = new byte[1024];
        int read = convertToString.read(bArr, 0, 1024);
        while (read >= 0) {
            c10790bb.LIZ(bArr, 0, read);
            read = convertToString.read(bArr, 0, 1024);
        }
        convertToString.close();
        byte[] copyOf = Arrays.copyOf(c10790bb.LIZ, c10790bb.LIZIZ);
        o.LJFF(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return XC9.LIZ(copyOf, EnumC10800bc.Utf8);
    }

    public static final Float LJIIIZ(Context context) {
        o.LJIIIZ(context, "<this>");
        return (Float) LJFF(R.attr.lo, context, C79046V0o.LJLIL);
    }

    public static final CharSequence LJIIJJI(Context context) {
        o.LJIIIZ(context, "<this>");
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.bu7, typedValue, true)) {
            return null;
        }
        return typedValue.string;
    }

    public static boolean LJIILIIL(android.net.Uri uri) {
        String str;
        try {
            str = UriProtector.getQueryParameter(uri, "is_paid_event");
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!"1".equals(str) && !"true".equals(str)) {
            return false;
        }
        return true;
    }

    public static final String LJIJI(ArrayList models) {
        o.LJIIIZ(models, "models");
        ArrayList arrayList = new ArrayList(models.size());
        Iterator it = models.iterator();
        while (it.hasNext()) {
            arrayList.add(((TimeSpeedModelExtension) it.next()).toJson(C82891Wg3.LIZJ()));
        }
        e eVar = new e();
        eVar.LJI = true;
        return GsonProtectorUtils.toJson(eVar.LIZ(), arrayList);
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        return !ujb.o.LJJJJIZL(FVR.LJFF, it, true);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVTransformModelService
    public AVMusic transformMusicModel(MusicModel musicModel) {
        new I9Q();
        return I9Q.LIZ(musicModel);
    }

    public static final Integer LJ(int i, Context context) {
        o.LJIIIZ(context, "<this>");
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        return Integer.valueOf(typedValue.data);
    }

    public static final Integer LJI(int i, Context context) {
        o.LJIIIZ(context, "<this>");
        return (Integer) LJFF(i, context, C79047V0p.LJLIL);
    }

    public static final Drawable LJIIIIZZ(int i, Context context) {
        o.LJIIIZ(context, "<this>");
        return (Drawable) LJFF(i, context, new AqS179S0100000_13(context, 59));
    }

    @Override // X.AnonymousClass100
    public void LIZIZ(Rect outRect, View composeView) {
        o.LJIIIZ(composeView, "composeView");
        o.LJIIIZ(outRect, "outRect");
        composeView.getWindowVisibleDisplayFrame(outRect);
    }

    public static final Object LJFF(int i, Context context, InterfaceC88472Yns interfaceC88472Yns) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        o.LJIIIIZZ(theme, "theme");
        return LJIIJ(theme, i, typedValue, interfaceC88472Yns);
    }

    public static final Integer LJII(Context context, int[] iArr, int i) {
        o.LJIIIZ(context, "<this>");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.kw, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "obtainStyledAttributes(null, arrays, defAttr, 0)");
        int color = obtainStyledAttributes.getColor(i, 1);
        obtainStyledAttributes.recycle();
        if (color == 1) {
            return null;
        }
        return Integer.valueOf(color);
    }

    @Override // X.AnonymousClass100
    public void LIZ(WindowManager windowManager, View popupView, ViewGroup.LayoutParams params) {
        o.LJIIIZ(windowManager, "windowManager");
        o.LJIIIZ(popupView, "popupView");
        o.LJIIIZ(params, "params");
        windowManager.updateViewLayout(popupView, params);
    }

    public static final Object LJIIJ(Resources.Theme theme, int i, TypedValue typedValue, InterfaceC88472Yns interfaceC88472Yns) {
        if (!theme.resolveAttribute(i, typedValue, true)) {
            return null;
        }
        if (typedValue.type == 2) {
            return LJIIJ(theme, typedValue.data, typedValue, interfaceC88472Yns);
        }
        return interfaceC88472Yns.invoke(typedValue);
    }

    public static boolean LJIIL(float f, float f2, RectF rectF, float f3) {
        if (Math.abs(f3) <= 0.0f) {
            return rectF.contains(f, f2);
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        double d = -f3;
        float sin = (float) Math.sin(Math.toRadians(d));
        float cos = (float) Math.cos(Math.toRadians(d));
        float f4 = f - centerX;
        float f5 = f2 - centerY;
        return rectF.contains(((f4 * cos) + centerX) - (f5 * sin), (f4 * sin) + (f5 * cos) + centerY);
    }

    public static final void LJIILJJIL(Spannable spannable, long j, int i, int i2) {
        if (j != C11850dJ.LJI) {
            LJIJ(spannable, new BackgroundColorSpan(C78897Uxp.LJJJZ(j)), i, i2);
        }
    }

    public static final void LJIILL(Spannable spannable, long j, int i, int i2) {
        if (j != C11850dJ.LJI) {
            LJIJ(spannable, new ForegroundColorSpan(C78897Uxp.LJJJZ(j)), i, i2);
        }
    }

    public static final void LJIIZILJ(Spannable spannable, C33861Uo c33861Uo, int i, int i2) {
        C16030k3 c16030k3;
        Object localeSpan;
        if (c33861Uo != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = C18940ok.LIZ(c33861Uo);
            } else {
                if (c33861Uo.isEmpty()) {
                    c16030k3 = new C16030k3((InterfaceC16050k5) ListProtector.get(C16070k7.LIZ.LIZ(), 0));
                } else {
                    c16030k3 = (C16030k3) ListProtector.get(c33861Uo.LJLIL, 0);
                }
                localeSpan = new LocaleSpan(OUP.LJJJZ(c16030k3));
            }
            LJIJ(spannable, localeSpan, i, i2);
        }
    }

    public static final void LJIJ(Spannable spannable, Object span, int i, int i2) {
        o.LJIIIZ(spannable, "<this>");
        o.LJIIIZ(span, "span");
        spannable.setSpan(span, i, i2, 33);
    }

    public static final void LJIILLIIL(Spannable spannable, long j, InterfaceC23370vt density, int i, int i2) {
        o.LJIIIZ(density, "density");
        long LIZIZ = C23520w8.LIZIZ(j);
        if (C23540wA.LIZ(LIZIZ, 4294967296L)) {
            LJIJ(spannable, new AbsoluteSizeSpan(O6R.LJJIIZ(density.LJJIJL(j)), false), i, i2);
        } else {
            if (!C23540wA.LIZ(LIZIZ, 8589934592L)) {
                return;
            }
            LJIJ(spannable, new RelativeSizeSpan(C23520w8.LIZJ(j)), i, i2);
        }
    }
}
