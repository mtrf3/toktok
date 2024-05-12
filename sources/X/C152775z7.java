package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5z7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152775z7 extends F9E {
    public final EnumC152835zD LJLIL;
    public final C152855zF LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C152775z7(EnumC152835zD captionState, C152855zF c152855zF) {
        o.LJIIIZ(captionState, "captionState");
        this.LJLIL = captionState;
        this.LJLILLLLZI = c152855zF;
    }

    public static C152775z7 L(C152775z7 c152775z7, EnumC152835zD captionState, C152855zF containerInfo, int i) {
        if ((i & 1) != 0) {
            captionState = c152775z7.LJLIL;
        }
        if ((i & 2) != 0) {
            containerInfo = c152775z7.LJLILLLLZI;
        }
        c152775z7.getClass();
        o.LJIIIZ(captionState, "captionState");
        o.LJIIIZ(containerInfo, "containerInfo");
        return new C152775z7(captionState, containerInfo);
    }
}
