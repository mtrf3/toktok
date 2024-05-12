package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GLc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41360GLc extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public /* synthetic */ C41360GLc(String str) {
        this(str, "un_know");
    }

    public C41360GLc(String scene, String deleteScene) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(deleteScene, "deleteScene");
        this.LJLIL = scene;
        this.LJLILLLLZI = deleteScene;
    }
}
