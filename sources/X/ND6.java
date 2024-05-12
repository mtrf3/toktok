package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ND6 extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public ND6(String accessKey, String scene) {
        o.LJIIIZ(accessKey, "accessKey");
        o.LJIIIZ(scene, "scene");
        this.LJLIL = accessKey;
        this.LJLILLLLZI = scene;
    }
}
