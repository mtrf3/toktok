package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.Trn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75975Trn {
    public final RecyclerView LIZ;
    public final AbstractC76019TsV LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final HashSet<String> LJ = new HashSet<>();
    public final HashSet<String> LJFF = new HashSet<>();
    public final HashSet<String> LJI = new HashSet<>();
    public final HashSet<String> LJII = new HashSet<>();
    public final HashSet<String> LJIIIIZZ = new HashSet<>();
    public final HashSet<String> LJIIIZ = new HashSet<>();
    public final HashSet<String> LJIIJ = new HashSet<>();
    public final HashSet<String> LJIIJJI = new HashSet<>();
    public final HashMap<String, Long> LJIIL = new HashMap<>();

    public final java.util.Map<String, String> LIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put("follow_ranking_show_cnts", String.valueOf(this.LJFF.size()));
        hashMap.put("follow_topic_show_cnts", String.valueOf(this.LJI.size()));
        hashMap.put("recommend_show_cnts", String.valueOf(this.LJ.size()));
        hashMap.put("recommend_ranking_show_cnts", String.valueOf(this.LJII.size()));
        hashMap.put("recommend_topic_show_cnts", String.valueOf(this.LJIIIIZZ.size()));
        hashMap.put("mutual_could_apply_cnts", String.valueOf(this.LJIIIZ.size()));
        hashMap.put("mutual_could_invite_cnts", String.valueOf(this.LJIIJ.size()));
        hashMap.put("mutual_actual_see_cnts", String.valueOf(this.LJIIJJI.size()));
        return hashMap;
    }

    public C75975Trn(RunnableC31065CHd runnableC31065CHd, AbstractC76019TsV abstractC76019TsV, boolean z, boolean z2) {
        this.LIZ = runnableC31065CHd;
        this.LIZIZ = abstractC76019TsV;
        this.LIZJ = z;
        this.LIZLLL = z2;
        C75974Trm c75974Trm = new C75974Trm(this);
        runnableC31065CHd.LJIIJJI(c75974Trm);
        AbstractC029409q adapter = runnableC31065CHd.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new C75983Trv(c75974Trm, this));
        }
    }
}
