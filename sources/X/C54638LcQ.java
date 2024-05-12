package X;

import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import kotlin.jvm.internal.o;

/* renamed from: X.LcQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54638LcQ extends F9E implements InterfaceC57784Mm4 {
    public final LocationRegion LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C54638LcQ(LocationRegion region) {
        o.LJIIIZ(region, "region");
        this.LJLIL = region;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
