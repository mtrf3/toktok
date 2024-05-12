package X;

import android.content.Context;
import android.graphics.Paint;
import com.bytedance.hybrid.spark.SparkContext;

/* loaded from: classes9.dex */
public final /* synthetic */ class KMP implements T01 {
    @Override // X.T01
    public InterfaceC73445Ss5 LIZ() {
        return C115724gS.LJLIL;
    }

    public static Paint LIZIZ(Paint paint, int i) {
        paint.setColor(i);
        return new Paint();
    }

    public static String LJ(String str, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(i);
        return X1D.LIZIZ(LIZ);
    }

    public static SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZJ(C40342FsQ c40342FsQ, Context context, SparkContext sparkContext) {
        c40342FsQ.getClass();
        return C40343FsR.LIZ(C40342FsQ.LIZ(context, sparkContext));
    }

    public static C26227ARb LIZLLL(Context context, int i, int i2) {
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJ(i);
        c26227ARb.LIZ(i2);
        return c26227ARb;
    }

    public static String LJFF(StringBuilder sb, String str, Exception exc, StringBuilder sb2) {
        sb.append(str);
        sb.append(exc.getMessage());
        return X1D.LIZIZ(sb2);
    }
}
