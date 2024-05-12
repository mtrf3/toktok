package X;

import com.ss.android.ugc.aweme.ui.NearbySkylightBaseAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.LbM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54572LbM implements LDY {
    public final /* synthetic */ NearbySkylightBaseAssem LJLIL;

    public C54572LbM(NearbySkylightBaseAssem nearbySkylightBaseAssem) {
        this.LJLIL = nearbySkylightBaseAssem;
    }

    @Override // X.LDY
    public final void LIZ(String str, String to) {
        o.LJIIIZ(to, "to");
        if (o.LJ(str, "Nearby")) {
            this.LJLIL.I3(null);
        }
    }
}
