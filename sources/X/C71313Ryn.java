package X;

import android.content.Context;
import android.view.View;
import com.kakao.sdk.network.KakaoRetrofitConverterFactory;
import kotlin.jvm.internal.o;

/* renamed from: X.Ryn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C71313Ryn implements InterfaceC65017PfR, InterfaceC47125IeX {
    @Override // X.InterfaceC47125IeX
    public Object apply(Object obj) {
        return obj;
    }

    @Override // X.InterfaceC65017PfR
    public Object LIZ(Object obj) {
        return KakaoRetrofitConverterFactory.m100stringConverter$lambda4$lambda3((java.util.Map) obj);
    }

    public static void LIZIZ(View view, String str, C110614Vt c110614Vt, View view2) {
        Context context = view.getContext();
        o.LJIIIIZZ(context, str);
        view2.setBackground(c110614Vt.LIZ(context));
    }

    public static void LIZJ(String str, Exception exc, C12310e3 c12310e3, String str2, Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(exc);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZIZ(str2, LIZIZ, th);
    }

    public static void LIZLLL(C27943Axv c27943Axv, String str, String str2, String str3, String str4, String str5) {
        o.LJIIIZ(c27943Axv, str);
        c27943Axv.LIZLLL(str2, str3);
        c27943Axv.LIZLLL(str4, str5);
    }
}
