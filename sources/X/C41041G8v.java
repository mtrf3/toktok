package X;

import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusFragment;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.G8v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41041G8v implements InterfaceC41042G8w {
    public final /* synthetic */ GeoFencingStatusFragment LIZ;

    public C41041G8v(GeoFencingStatusFragment geoFencingStatusFragment) {
        this.LIZ = geoFencingStatusFragment;
    }

    @Override // X.InterfaceC41042G8w
    public final void LIZ(List<TranslatedRegion> selected) {
        o.LJIIIZ(selected, "selected");
        if (!selected.isEmpty()) {
            GAX gax = this.LIZ.LJLIL;
            if (gax != null) {
                gax.LJLJI = ORZ.LLJILJILJ(selected);
                gax.notifyDataSetChanged();
            } else {
                o.LJIJI("regionDeleteAdapter");
                throw null;
            }
        }
    }
}
