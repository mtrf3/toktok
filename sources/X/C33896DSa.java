package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.track.TTNetCommerceControlModel;

/* renamed from: X.DSa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33896DSa extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33896DSa LJLIL = new C33896DSa();

    public C33896DSa() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Boolean bool;
        boolean z;
        try {
            TTNetCommerceControlModel tTNetCommerceControlModel = null;
            Object LJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("ttnet_commerce_control", TTNetCommerceControlModel.class, null);
            if (LJIIIIZZ instanceof TTNetCommerceControlModel) {
                tTNetCommerceControlModel = (TTNetCommerceControlModel) LJIIIIZZ;
            }
            if (tTNetCommerceControlModel == null) {
                z = false;
            } else {
                z = tTNetCommerceControlModel.getEnable3rdTrackerUsingTTNet();
            }
            Boolean valueOf = Boolean.valueOf(z);
            C3C5.m7constructorimpl(valueOf);
            bool = valueOf;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            bool = LIZ;
        }
        if (C3C5.m10exceptionOrNullimpl(bool) == null) {
            return bool;
        }
        return Boolean.FALSE;
    }
}
