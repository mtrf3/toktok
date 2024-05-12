package X;

import com.bytedance.keva.Keva;
import com.kakao.sdk.network.KakaoRetrofitConverterFactory;
import com.ss.android.vesdk.VEConfigCenter;
import java.util.HashMap;

/* renamed from: X.Pm5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C65429Pm5 implements InterfaceC65017PfR {
    public static Integer LIZIZ(float f) {
        return Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(f))));
    }

    @Override // X.InterfaceC65017PfR
    public Object LIZ(Object obj) {
        return KakaoRetrofitConverterFactory.m98stringConverter$lambda0((Enum) obj);
    }

    public static boolean LJFF(String str, boolean z) {
        return VEConfigCenter.getInstance().getValue(str, z).booleanValue();
    }

    public static void LJ(String str, String str2, Keva keva, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        keva.storeBoolean(X1D.LIZIZ(LIZ), z);
    }

    public static String LIZJ(StringBuilder sb, String str, String str2, Object obj, StringBuilder sb2) {
        sb.append(str);
        sb.append(str2);
        sb.append(obj.getClass());
        return X1D.LIZIZ(sb2);
    }

    public static String LIZLLL(StringBuilder sb, String str, String str2, StringBuilder sb2, HashMap hashMap) {
        sb.append(str);
        sb.append(str2);
        return C61597OFl.LIZ(hashMap, X1D.LIZIZ(sb2));
    }
}
