package X;

import com.ss.android.ugc.aweme.property.bytebench.PhotoMVByteBenchStrategy;

/* renamed from: X.HhZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44765HhZ implements InterfaceC44777Hhl {
    public static final /* synthetic */ C44765HhZ LJIILL = new C44765HhZ();
    public final /* synthetic */ InterfaceC44777Hhl LJIILJJIL;

    @Override // X.InterfaceC44777Hhl
    public final boolean enableMvBindingHDSwitch() {
        return this.LJIILJJIL.enableMvBindingHDSwitch();
    }

    @Override // X.InterfaceC44777Hhl
    public final boolean enableSynthesisMvTo1080p() {
        return this.LJIILJJIL.enableSynthesisMvTo1080p();
    }

    @Override // X.InterfaceC44777Hhl
    public final int mvDynamicResolutionStrategy() {
        return this.LJIILJJIL.mvDynamicResolutionStrategy();
    }

    @Override // X.InterfaceC44777Hhl
    public final int mvFastImportStrategy() {
        return this.LJIILJJIL.mvFastImportStrategy();
    }

    @Override // X.InterfaceC44777Hhl
    public final String mvSynthesisSettingsFor1080p() {
        return this.LJIILJJIL.mvSynthesisSettingsFor1080p();
    }

    public C44765HhZ() {
        InterfaceC44777Hhl interfaceC44777Hhl;
        InterfaceC09240Xw LIZIZ = C09580Ze.LIZJ().LIZIZ(EF7.LJIIIZ);
        this.LJIILJJIL = (LIZIZ == null || (interfaceC44777Hhl = (InterfaceC44777Hhl) LIZIZ.LJIILJJIL(PhotoMVByteBenchStrategy.class)) == null) ? C44764HhY.LJIILJJIL : interfaceC44777Hhl;
    }
}
