package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TID implements InterfaceC46243ICx<Effect> {
    public final boolean LIZ;
    public final Effect LIZIZ;
    public final int LIZJ;
    public final EnumC44267HYx LIZLLL;
    public final List<Effect> LJ;
    public final Bundle LJFF;
    public final InterfaceC74398THu LJI;
    public final InterfaceC43949HMr LJII;
    public final int LJIIIIZZ;
    public final boolean LJIIIZ;
    public final TNY LJIIJ;

    @Override // X.InterfaceC46243ICx
    public final boolean LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC46243ICx
    public final EnumC44267HYx LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC46243ICx
    public final /* bridge */ /* synthetic */ Effect LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC46243ICx
    public final int getPosition() {
        return this.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TID(Effect sticker, int i, EnumC44267HYx requestSource, List<? extends Effect> list, Bundle bundle, InterfaceC74398THu interfaceC74398THu, InterfaceC43949HMr interfaceC43949HMr, int i2, boolean z, TNY tny) {
        o.LJIIIZ(sticker, "sticker");
        o.LJIIIZ(requestSource, "requestSource");
        this.LIZIZ = sticker;
        this.LIZJ = i;
        this.LIZLLL = requestSource;
        this.LJ = list;
        this.LJFF = bundle;
        this.LJI = interfaceC74398THu;
        this.LJII = interfaceC43949HMr;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = z;
        this.LJIIJ = tny;
        this.LIZ = true;
    }
}
