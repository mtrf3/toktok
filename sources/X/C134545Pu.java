package X;

import com.ss.android.ugc.gamora.editorpro.crop.croppanel.CropPanelScene;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Pu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134545Pu extends AbstractC48231ut<C5PX, CropPanelScene, C134525Ps, C134555Pv> implements InterfaceC135635Tz, C5PX {
    public final C82622Wbi LJLL;
    public InterfaceC134575Px LJLLI;

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C134555Pv> LJJLIIIJJIZ() {
        return new AqS152S0100000_2(this, 7);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C134525Ps> LJJLIIIJJI() {
        return C134565Pw.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    @Override // X.C5PX
    public void Ee0(C5PL cropMode) {
        o.LJIIIZ(cropMode, "cropMode");
        LJJZZI(new AqS168S0100000_2(cropMode, 2));
    }

    @Override // X.C5PX
    public void LJLJLLL(boolean z) {
        LJJZZI(new AqS7S0010000_2(z, 0));
    }

    @Override // X.C5PX
    public void k10(InterfaceC134575Px listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLI = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C134545Pu(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
    }
}
