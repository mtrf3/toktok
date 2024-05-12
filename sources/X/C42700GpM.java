package X;

import android.os.Bundle;
import com.bytedance.scene.navigation.NavigationScene;
import kotlin.jvm.internal.o;

/* renamed from: X.GpM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42700GpM {
    public static final NavigationScene LIZ(C44216HWy c44216HWy) {
        HJO hjo = new HJO((Bundle) null, C44216HWy.class);
        hjo.LIZJ = false;
        hjo.LIZLLL = false;
        hjo.LJ = 0;
        WM7 LIZ = C65531Pnj.LIZ(hjo.LIZ(), NavigationScene.class);
        o.LJII(LIZ, "null cannot be cast to non-null type com.bytedance.scene.navigation.NavigationScene");
        NavigationScene navigationScene = (NavigationScene) LIZ;
        navigationScene.LJLILLLLZI = new C42701GpN(c44216HWy);
        navigationScene.mRootScopeFactory = new V1M();
        return navigationScene;
    }
}
