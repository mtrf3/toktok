package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9gl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243319gl extends F9E implements C33Q {
    public final EnumC243389gs LJLIL;
    public final boolean LJLILLLLZI;

    public C243319gl() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public /* synthetic */ C243319gl(int i) {
        this(EnumC243389gs.DEFAULT, false);
    }

    public C243319gl(EnumC243389gs loadingStatus, boolean z) {
        o.LJIIIZ(loadingStatus, "loadingStatus");
        this.LJLIL = loadingStatus;
        this.LJLILLLLZI = z;
    }

    public static C243319gl L(C243319gl c243319gl, EnumC243389gs loadingStatus) {
        boolean z = c243319gl.LJLILLLLZI;
        c243319gl.getClass();
        o.LJIIIZ(loadingStatus, "loadingStatus");
        return new C243319gl(loadingStatus, z);
    }
}
