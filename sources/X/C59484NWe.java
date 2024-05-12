package X;

import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;

/* renamed from: X.NWe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59484NWe implements NTL {
    public final InterfaceC59488NWi LIZ;
    public final BusinessService LIZIZ = new BusinessService(this);

    public C59484NWe(InterfaceC59488NWi interfaceC59488NWi) {
        this.LIZ = interfaceC59488NWi;
    }

    public final <T extends BusinessService.Business> T LIZ(Class<T> cls) {
        return (T) this.LIZIZ.LIZ(cls);
    }
}
