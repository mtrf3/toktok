package X;

import kotlin.jvm.internal.o;

/* renamed from: X.YRk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87388YRk implements YRT {
    public EnumC87389YRl LIZ = EnumC87389YRl.INITED;

    @Override // X.YRT
    public final void startPrefetchMessage() {
    }

    @Override // X.YRT
    public final void LIZ() {
        this.LIZ = EnumC87389YRl.READY;
    }

    @Override // X.YRT
    public final void onDestroy() {
        this.LIZ = EnumC87389YRl.DESTROYED;
    }

    @Override // X.YRT
    public final void onRelease() {
        this.LIZ = EnumC87389YRl.RELEASED;
    }

    @Override // X.YRT
    public final void onStart() {
        this.LIZ = EnumC87389YRl.STARTED;
    }

    @Override // X.YRT
    public final void LIZLLL(C32075CiN configuration) {
        o.LJIIIZ(configuration, "configuration");
        this.LIZ = EnumC87389YRl.INITED;
    }

    @Override // X.YRT
    public final void LJIIIIZZ(C30176Bsq stopMessageConfig) {
        o.LJIIIZ(stopMessageConfig, "stopMessageConfig");
        this.LIZ = EnumC87389YRl.STOPED;
    }

    public final boolean LJIIIZ(EnumC87389YRl compState) {
        o.LJIIIZ(compState, "compState");
        if (this.LIZ == compState) {
            return true;
        }
        return false;
    }

    @Override // X.YRT
    public final void LJ(long j, C32075CiN currentConfiguration) {
        o.LJIIIZ(currentConfiguration, "currentConfiguration");
    }
}
