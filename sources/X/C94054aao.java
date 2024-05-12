package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.aao, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94054aao extends F9E {
    public final ProviderEffect LJLIL;
    public final EnumC93416aQW LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C94054aao(ProviderEffect providerEffect, EnumC93416aQW status) {
        o.LJIIIZ(providerEffect, "providerEffect");
        o.LJIIIZ(status, "status");
        this.LJLIL = providerEffect;
        this.LJLILLLLZI = status;
    }
}
