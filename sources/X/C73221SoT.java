package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.profile.effect.EffectProfileState;
import kotlin.jvm.internal.o;

/* renamed from: X.SoT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73221SoT extends AbstractC65781Prl implements InterfaceC88471Ynr<EffectProfileState, Bundle, EffectProfileState> {
    public static final C73221SoT INSTANCE = new C73221SoT();

    public C73221SoT() {
        super(2);
    }

    public final EffectProfileState invoke(EffectProfileState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ EffectProfileState invoke(EffectProfileState effectProfileState, Bundle bundle) {
        EffectProfileState effectProfileState2 = effectProfileState;
        invoke(effectProfileState2, bundle);
        return effectProfileState2;
    }
}
