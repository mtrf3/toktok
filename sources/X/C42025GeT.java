package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.scene.navigation.NavigationScene;
import kotlin.jvm.internal.o;

/* renamed from: X.GeT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42025GeT {
    public static NavigationScene LIZ(AbstractC42651GoZ abstractC42651GoZ) {
        HJO hjo = new HJO((Bundle) null, WMH.class);
        hjo.LIZJ = false;
        hjo.LIZLLL = false;
        hjo.LJ = 0;
        WM7 LIZ = C65531Pnj.LIZ(hjo.LIZ(), NavigationScene.class);
        o.LJII(LIZ, "null cannot be cast to non-null type com.bytedance.scene.navigation.NavigationScene");
        NavigationScene navigationScene = (NavigationScene) LIZ;
        navigationScene.LJLILLLLZI = new C42026GeU(abstractC42651GoZ);
        return navigationScene;
    }

    public static final OSZ<NavigationScene, WMA<?>> LIZIZ(Activity activity, Class<? extends WMH> containerScene, Bundle bundle, int i) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(containerScene, "containerScene");
        o.LJIIIZ(bundle, "bundle");
        HJO hjo = new HJO(bundle, containerScene);
        hjo.LIZJ = false;
        hjo.LIZLLL = false;
        hjo.LJ = 0;
        WM7 LIZ = C65531Pnj.LIZ(hjo.LIZ(), NavigationScene.class);
        o.LJII(LIZ, "null cannot be cast to non-null type com.bytedance.scene.navigation.NavigationScene");
        return new OSZ<>(LIZ, new WMA(i, new C42024GeS(activity), LIZ, new C42030GeY(), new C42330GjO(), true));
    }
}
