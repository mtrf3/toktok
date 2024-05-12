package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TIF implements InterfaceC46243ICx<Effect> {
    public final Effect LIZ;
    public final int LIZIZ;
    public final EnumC44267HYx LIZJ;
    public final Bundle LIZLLL;

    @Override // X.InterfaceC46243ICx
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC46243ICx
    public final EnumC44267HYx LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC46243ICx
    public final /* bridge */ /* synthetic */ Effect LIZJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC46243ICx
    public final int getPosition() {
        return this.LIZIZ;
    }

    public TIF(Effect effect, int i, EnumC44267HYx requestSource, Bundle bundle) {
        o.LJIIIZ(requestSource, "requestSource");
        this.LIZ = effect;
        this.LIZIZ = i;
        this.LIZJ = requestSource;
        this.LIZLLL = bundle;
    }
}
