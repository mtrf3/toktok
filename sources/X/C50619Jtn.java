package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchBehaviorSignalState;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.Jtn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50619Jtn implements KG6 {
    public static final C5H3<C50619Jtn> LIZLLL = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C50621Jtp.LJLIL);
    public final LinkedList<LastSearch> LIZ = new LinkedList<>();
    public final int LIZIZ = Q7K.LIZIZ("query_list_local_storage", 10);
    public final Gson LIZJ = new Gson();

    public final String LIZIZ() {
        LinkedList<LastSearch> item = this.LIZ;
        Gson gson = this.LIZJ;
        o.LJIIIZ(item, "item");
        o.LJIIIZ(gson, "gson");
        C17N.LJJJJLL().kO().LIZ(new K3W(item));
        SearchBehaviorSignalState LIZJ = C17N.LJJJJLL().kO().LIZJ();
        LIZJ.getClass();
        String json = GsonProtectorUtils.toJson(gson, LIZJ);
        o.LJIIIIZZ(json, "gson.toJson(this)");
        return json;
    }

    @Override // X.KG6
    public final String LIZ() {
        LinkedList<LastSearch> linkedList = this.LIZ;
        if (linkedList == null || linkedList.isEmpty()) {
            return "";
        }
        String json = GsonProtectorUtils.toJson(this.LIZJ, this.LIZ);
        o.LJIIIIZZ(json, "gson.toJson(items)");
        return json;
    }

    @Override // X.KG6
    public final void LIZJ(LastSearch lastSearch) {
        LinkedList<LastSearch> linkedList = this.LIZ;
        if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
            Iterator<LastSearch> it = linkedList.iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next().search_id, lastSearch.search_id)) {
                    return;
                }
            }
        }
        C17N.LJJJJLL().kO().LIZ(new C50623Jtr(lastSearch));
        if (C34905Dmv.LIZ()) {
            C17N.LJJJJLL().j4(new C50462JrG(lastSearch));
        }
        if (this.LIZ.size() < this.LIZIZ) {
            this.LIZ.addFirst(lastSearch);
        } else {
            ORS.LJJZ(this.LIZ);
            this.LIZ.addFirst(lastSearch);
        }
    }
}
