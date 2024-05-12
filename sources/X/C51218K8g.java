package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.K8g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51218K8g implements KG6 {
    public static final C5H3<C51218K8g> LIZLLL = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C51235K8x.LJLIL);
    public final LinkedList<LastSearch> LIZ = new LinkedList<>();
    public final int LIZIZ = 10;
    public final Gson LIZJ = GsonHolder.LIZLLL().LIZ();

    @Override // X.KG6
    public final String LIZ() {
        return "";
    }

    public final String LIZIZ() {
        String json = GsonProtectorUtils.toJson(this.LIZJ, this.LIZ);
        o.LJIIIIZZ(json, "gson.toJson(items)");
        return json;
    }

    @Override // X.KG6
    public final void LIZJ(LastSearch lastSearch) {
        if (this.LIZ.size() < this.LIZIZ) {
            this.LIZ.addFirst(lastSearch);
        } else {
            ORS.LJJZ(this.LIZ);
            this.LIZ.addFirst(lastSearch);
        }
    }
}
