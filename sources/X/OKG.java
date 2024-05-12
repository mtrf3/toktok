package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.kakao.sdk.network.KakaoRetrofitConverterFactory;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final /* synthetic */ class OKG implements InterfaceC65017PfR, HQ8 {
    @Override // X.InterfaceC65017PfR
    public Object LIZ(Object obj) {
        return KakaoRetrofitConverterFactory.m101stringConverter$lambda5(obj);
    }

    public static void LIZLLL(C40342FsQ c40342FsQ, Context context, SparkContext sparkContext) {
        c40342FsQ.getClass();
        C40342FsQ.LIZ(context, sparkContext).LIZIZ();
    }

    public static String LIZIZ(String str, String str2, Context context, int i, String str3) {
        o.LJIIIIZZ(str, str2);
        String string = context.getString(i);
        o.LJIIIIZZ(string, str3);
        return string;
    }

    public static String LIZJ(Locale locale, String str, String str2, Locale locale2, String str3) {
        o.LJIIIIZZ(locale, str);
        String upperCase = str2.toUpperCase(locale2);
        o.LJIIIIZZ(upperCase, str3);
        return upperCase;
    }
}
