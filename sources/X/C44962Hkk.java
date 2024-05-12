package X;

import com.ss.android.ugc.aweme.setting.performance.videoquality.StickerDowngradeStrategy;
import com.ss.android.ugc.aweme.setting.performance.videoquality.StickerPreviewResolutionConfig;

/* renamed from: X.Hkk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44962Hkk implements InterfaceC44963Hkl {
    public static final /* synthetic */ C44962Hkk LJIILL = new C44962Hkk();
    public final /* synthetic */ InterfaceC44963Hkl LJIILJJIL;

    @Override // X.InterfaceC44963Hkl
    public final boolean enableUseDynamicEffectLabel() {
        return this.LJIILJJIL.enableUseDynamicEffectLabel();
    }

    @Override // X.InterfaceC44963Hkl
    public final StickerPreviewResolutionConfig getResolutionConfig() {
        return this.LJIILJJIL.getResolutionConfig();
    }

    public C44962Hkk() {
        InterfaceC44963Hkl interfaceC44963Hkl;
        InterfaceC09240Xw LIZIZ = C09580Ze.LIZJ().LIZIZ(EF7.LJIIIZ);
        this.LJIILJJIL = (LIZIZ == null || (interfaceC44963Hkl = (InterfaceC44963Hkl) LIZIZ.LJIILJJIL(StickerDowngradeStrategy.class)) == null) ? C44964Hkm.LJIILJJIL : interfaceC44963Hkl;
    }
}
