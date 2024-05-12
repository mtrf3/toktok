package X;

import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G7S implements InterfaceC41042G8w {
    public final /* synthetic */ G7B LIZ;

    public G7S(G7B g7b) {
        this.LIZ = g7b;
    }

    @Override // X.InterfaceC41042G8w
    public final void LIZ(List<TranslatedRegion> selected) {
        o.LJIIIZ(selected, "selected");
        this.LIZ.LIZIZ.setValue(selected);
    }
}
