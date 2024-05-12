package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.FrescoImageLoaderDelegate;
import kotlin.jvm.internal.o;

/* renamed from: X.19N, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C19N implements InterfaceC48038ItG, V20 {
    @Override // X.V20
    public boolean LIZ(android.net.Uri uri) {
        return FrescoImageLoaderDelegate.LIZIZ(uri);
    }

    public static boolean LIZLLL() {
        C29556Biq.LIZ().getClass();
        return C74983Tbn.LJIILIIL();
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        return ((BaseResponse) obj).data;
    }

    public static boolean LJ(String str, boolean z) {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ(str, z);
    }

    public static Integer LIZIZ(View view, String str, int i) {
        Context context = view.getContext();
        o.LJIIIIZZ(context, str);
        return C79045V0n.LJI(i, context);
    }

    public static void LIZJ(Keva keva, String str, int i, int i2, String str2) {
        keva.storeInt(str2, keva.getInt(str, i) + i2);
    }
}
