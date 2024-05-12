package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I80 {
    public static void LIZIZ(boolean z) {
        GGO ggo;
        if (z) {
            ggo = GGO.SHOW;
        } else {
            ggo = GGO.DISMISS;
        }
        C42303Gix.LIZ(1505, ggo, EnumC42283Gid.PROGRESS_WITH_MESSAGE, EnumC42282Gic.CLOSE_GONE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, android.app.Dialog, java.lang.Object, X.A90] */
    public static void LIZ(InterfaceC65784Pro interfaceC65784Pro, Context context, String materialId, InterfaceC88472Yns interfaceC88472Yns, int i) {
        boolean z;
        boolean z2;
        String str;
        ProviderEffect providerEffect;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        o.LJIIIZ(context, "context");
        o.LJIIIZ(materialId, "materialId");
        if (C74501TLt.LIZ) {
            long currentTimeMillis = System.currentTimeMillis();
            E47 e47 = (E47) ((C35979EAd) C74502TLu.LIZJ.getValue()).LIZIZ(materialId);
            if (e47 != null && currentTimeMillis - e47.LIZ <= C74502TLu.LIZIZ && (providerEffect = e47.LIZJ) != null) {
                interfaceC88472Yns.invoke(new C45705Hwj(false, true, 100, providerEffect));
                return;
            }
        }
        C68322mC c68322mC = new C68322mC();
        if (z2) {
            ?? a90 = new A90(context);
            Resources resources = context.getResources();
            if (resources != null) {
                str = resources.getString(R.string.hvo);
            } else {
                str = null;
            }
            a90.LIZJ(str);
            a90.LIZLLL(0.0f);
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingProgressHUD", "show", a90, new Object[0], "void", new C65300Pk0(false, "()V", "5008921118808937229")).LIZ) {
                a90.show();
            }
            c68322mC.element = a90;
            LIZIZ(true);
        }
        C84488XDw.LIZ(context, null).LJJJJLL(materialId, (String) interfaceC65784Pro.invoke(), z, new I81(interfaceC88472Yns, c68322mC, materialId));
    }
}
