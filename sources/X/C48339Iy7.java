package X;

import android.content.Context;
import com.bytedance.tux.icon.TuxIconView;

/* renamed from: X.Iy7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C48339Iy7 implements InterfaceC56535MGt {
    @Override // X.InterfaceC56535MGt
    public void onEvent(java.util.Map map) {
        FMX.LJIIL("power_preload_duration_key", map);
    }

    public static C1HQ LIZIZ(String str, String str2) {
        C1HQ c1hq = new C1HQ();
        c1hq.put(str, str2);
        return c1hq;
    }

    public static TuxIconView LIZ(Context context, int i, int i2) {
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(i);
        tuxIconView.setVisibility(i2);
        return tuxIconView;
    }

    public static String LIZJ(StringBuilder sb, boolean z, char c, StringBuilder sb2) {
        sb.append(z);
        sb.append(c);
        return X1D.LIZIZ(sb2);
    }

    public static void LIZLLL(long j, long j2, StringBuilder sb, String str) {
        sb.append(j - j2);
        sb.append(str);
    }
}
