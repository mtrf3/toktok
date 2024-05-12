package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aeM, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94274aeM extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C94274aeM(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    public static C94274aeM L(C94274aeM c94274aeM, String featureId, String iconGenerateStrategy, int i) {
        if ((i & 1) != 0) {
            featureId = c94274aeM.LJLIL;
        }
        if ((i & 2) != 0) {
            iconGenerateStrategy = c94274aeM.LJLILLLLZI;
        }
        c94274aeM.getClass();
        o.LJIIIZ(featureId, "featureId");
        o.LJIIIZ(iconGenerateStrategy, "iconGenerateStrategy");
        return new C94274aeM(featureId, iconGenerateStrategy);
    }
}
