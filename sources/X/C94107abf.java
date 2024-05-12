package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.abf, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94107abf implements InterfaceC93663aUV<Effect> {
    public final /* synthetic */ InterfaceC93663aUV LIZ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        this.LIZ.onFail();
    }

    public C94107abf(InterfaceC93663aUV interfaceC93663aUV) {
        this.LIZ = interfaceC93663aUV;
    }

    @Override // X.InterfaceC93663aUV
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        if (effect2 != null) {
            C93726aVW.LIZ().downloadRes(effect2.getEffectId(), this.LIZ);
        } else {
            this.LIZ.onFail();
        }
    }
}
