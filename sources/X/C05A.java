package X;

import android.view.RenderNode;
import kotlin.jvm.internal.o;

/* renamed from: X.05A, reason: invalid class name */
/* loaded from: classes.dex */
public final class C05A {
    public static final C05A LIZ = new C05A();

    public static final int LIZ(RenderNode renderNode) {
        o.LJIIIZ(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    public static final int LIZIZ(RenderNode renderNode) {
        o.LJIIIZ(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    public static final void LIZJ(RenderNode renderNode, int i) {
        o.LJIIIZ(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i);
    }

    public static final void LIZLLL(RenderNode renderNode, int i) {
        o.LJIIIZ(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i);
    }
}
