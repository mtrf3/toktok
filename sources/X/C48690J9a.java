package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import defpackage.b1;
import kotlin.jvm.internal.o;
import n.b;
import o7a.m;
import p8.a;

/* renamed from: X.J9a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C48690J9a implements RTU {
    public static String LIZ() {
        if (!C47047IdH.LIZIZ()) {
            Object value = IZ8.P0.getValue();
            o.LJIIIIZZ(value, "<get-videoViewLogPrintTrace>(...)");
            if (!((Boolean) value).booleanValue()) {
                return "-_-";
            }
        }
        StackTraceElement[] stackTrace = C16880lQ.LLLLIIIILLL().getStackTrace();
        StringBuilder sb = new StringBuilder();
        Object value2 = IZ8.Q0.getValue();
        o.LJIIIIZZ(value2, "<get-videoViewLogTraceStart>(...)");
        int intValue = ((Number) value2).intValue();
        while (true) {
            Object value3 = IZ8.R0.getValue();
            o.LJIIIIZZ(value3, "<get-videoViewLogTraceEnd>(...)");
            if (intValue > ((Number) value3).intValue() || intValue >= stackTrace.length) {
                break;
            }
            sb.append(stackTrace[intValue].getClassName());
            sb.append(":");
            sb.append(stackTrace[intValue].getMethodName());
            sb.append("->");
            intValue++;
        }
        return sb.toString();
    }

    public static int LIZIZ(Context context) {
        return C259710f.LIZ.LJFF(context);
    }

    public static void LJIIIZ(InterfaceC47678InS interfaceC47678InS) {
        if (!interfaceC47678InS.LIZIZ()) {
            return;
        }
        SimRadar.keyScan("VideoView", "stAnim", interfaceC47678InS.getStackTraceString());
    }

    public static boolean LIZJ(InterfaceC12810er interfaceC12810er, Context context) {
        int themeOverlay = interfaceC12810er.getThemeOverlay(context);
        C259810g c259810g = C259710f.LIZ;
        if (themeOverlay == c259810g.LJFF(context) && !c259810g.LJII(context)) {
            return true;
        }
        return false;
    }

    public static void LJ(InterfaceC47678InS interfaceC47678InS, float f) {
        if (f == 1.0f || !interfaceC47678InS.LIZIZ()) {
            return;
        }
        String stackTraceString = interfaceC47678InS.getStackTraceString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(stackTraceString);
        LIZ.append(":");
        LIZ.append(f);
        SimRadar.keyScan("VideoView", "scaleX", X1D.LIZIZ(LIZ));
    }

    public static void LJFF(InterfaceC47678InS interfaceC47678InS, float f) {
        if (f == 1.0f || !interfaceC47678InS.LIZIZ()) {
            return;
        }
        String stackTraceString = interfaceC47678InS.getStackTraceString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(stackTraceString);
        LIZ.append(":");
        LIZ.append(f);
        SimRadar.keyScan("VideoView", "scaleY", X1D.LIZIZ(LIZ));
    }

    public static void LJII(InterfaceC47678InS interfaceC47678InS, float f) {
        if (f == 0.0f || !interfaceC47678InS.LIZIZ()) {
            return;
        }
        String stackTraceString = interfaceC47678InS.getStackTraceString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(stackTraceString);
        LIZ.append(":");
        LIZ.append(f);
        SimRadar.keyScan("VideoView", "transY", X1D.LIZIZ(LIZ));
    }

    public static void LJIIIIZZ(InterfaceC47678InS interfaceC47678InS, int i) {
        if (i == 0 || !interfaceC47678InS.LIZIZ()) {
            return;
        }
        SimRadar.keyScan("VideoView", "visible", YE1.LIZIZ(interfaceC47678InS.getStackTraceString(), ":", i));
    }

    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        return new C48691J9b((ITpcConsentService) obj, (Activity) obj2);
    }

    public static void LIZLLL(InterfaceC47678InS interfaceC47678InS, String str, ViewGroup.LayoutParams layoutParams) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            i = ((FrameLayout.LayoutParams) layoutParams).gravity;
        } else {
            i = 17;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 = marginLayoutParams.leftMargin;
            i4 = marginLayoutParams.rightMargin;
            i5 = marginLayoutParams.topMargin;
            i2 = marginLayoutParams.bottomMargin;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if ((i == 17 && i3 == 0 && i4 == 0 && i5 == 0 && i2 == 0) || !interfaceC47678InS.LIZIZ()) {
            return;
        }
        StringBuilder LIZJ = b1.LIZJ(str, ",w:");
        LIZJ.append(layoutParams.width);
        LIZJ.append(",h:");
        C15890jp.LIZIZ(LIZJ, layoutParams.height, ",g:", i, ",m:[");
        C15890jp.LIZIZ(LIZJ, i3, ",", i5, ",");
        C15890jp.LIZIZ(LIZJ, i4, ",", i2, "]");
        SimRadar.keyScan("VideoView", "setLp", X1D.LIZIZ(LIZJ));
    }

    public static void LJI(InterfaceC47678InS interfaceC47678InS, String str, float f) {
        if (f == 0.0f || !interfaceC47678InS.LIZIZ()) {
            return;
        }
        if ("UNKNOWN".equals(str)) {
            str = interfaceC47678InS.getStackTraceString();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(":");
        LIZ.append(f);
        SimRadar.keyScan("VideoView", "transX", X1D.LIZIZ(LIZ));
    }

    public static void LJIIL(StringBuilder sb, String str, StringBuilder sb2, String str2) {
        sb.append(str);
        C34B.LJI(str2, X1D.LIZIZ(sb2));
    }

    public static ViewParent LJIIJ(String str, String str2, TuxTextView tuxTextView, C018905p c018905p, TuxTextView tuxTextView2) {
        new m();
        m.LIZ(str2, new a.c(str), tuxTextView, c018905p);
        b.LIZ(tuxTextView2);
        return tuxTextView.getParent();
    }

    public static String LJIIJJI(String str, int i, String str2, int i2, String str3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(i);
        LIZ.append(str2);
        LIZ.append(i2);
        LIZ.append(str3);
        return X1D.LIZIZ(LIZ);
    }
}
