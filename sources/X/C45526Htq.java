package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Htq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45526Htq {
    public static final View LIZ(InterfaceC45601Hv3 asyncInflaterOwner, int i, WM7 containerScene) {
        o.LJIIIZ(asyncInflaterOwner, "asyncInflaterOwner");
        o.LJIIIZ(containerScene, "containerScene");
        View LIZ = asyncInflaterOwner.getInflater().LIZ(i);
        if (!o.LJ(LIZ.getContext(), containerScene.requireSceneContext())) {
            containerScene.setTheme(0);
        }
        return LIZ;
    }
}
