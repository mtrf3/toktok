package X;

import com.bytedance.android.livesdk.model.message.RankUpdate;
import com.bytedance.android.livesdk.model.message.RankUpdateMessage;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.RankEntrance;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3Response;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CYg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31510CYg {
    public boolean LIZJ;
    public boolean LIZLLL;
    public List<RankTabInfo> LJFF;
    public List<RankTabInfo> LJI;
    public long LIZ = Long.MAX_VALUE;
    public EnumC31514CYk LIZIZ = EnumC31514CYk.DEFAULT;
    public List<C31516CYm> LJ = new ArrayList();

    public final C31510CYg LIZ() {
        C31510CYg c31510CYg = new C31510CYg();
        c31510CYg.LIZ = this.LIZ;
        c31510CYg.LIZIZ = this.LIZIZ;
        c31510CYg.LIZJ = this.LIZJ;
        c31510CYg.LIZLLL = this.LIZLLL;
        c31510CYg.LJ = this.LJ;
        c31510CYg.LJFF = this.LJFF;
        c31510CYg.LJI = this.LJI;
        return c31510CYg;
    }

    public final void LIZIZ(RankUpdateMessage rankUpdateMessage) {
        o.LJIIIZ(rankUpdateMessage, "rankUpdateMessage");
        this.LIZ = rankUpdateMessage.rankPriority;
        C31513CYj c31513CYj = EnumC31514CYk.Companion;
        int i = rankUpdateMessage.groupType;
        c31513CYj.getClass();
        this.LIZIZ = C31513CYj.LIZ(i);
        this.LIZJ = rankUpdateMessage.loop;
        this.LIZLLL = rankUpdateMessage.animationLoopForOff;
        this.LJ.clear();
        int shortVersionCode = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getShortVersionCode();
        List<RankUpdate> list = rankUpdateMessage.updates;
        if (list != null) {
            for (RankUpdate rankUpdate : list) {
                if (rankUpdate.supportedVersion <= shortVersionCode) {
                    this.LJ.add(new C31516CYm(rankUpdate, this.LIZIZ, this.LIZJ, this.LIZLLL));
                    C28652BMi.LIZLLL(rankUpdate.rankType, rankUpdate.ownRank, false);
                    if (rankUpdate.rankType == RankTypeV2.LJII.type) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new RankTabInfo());
                        this.LJI = arrayList;
                    }
                }
            }
        }
        List<RankTabInfo> list2 = rankUpdateMessage.tabInfo;
        if (list2 != null && (!list2.isEmpty())) {
            this.LJFF = list2;
        }
    }

    public final void LIZJ(RankEntranceV3Response.EntranceGroup entranceGroup) {
        List<RankTabInfo> list;
        List<RankEntrance> list2;
        this.LIZ = entranceGroup.priority;
        C31513CYj c31513CYj = EnumC31514CYk.Companion;
        int i = entranceGroup.groupType;
        c31513CYj.getClass();
        this.LIZIZ = C31513CYj.LIZ(i);
        this.LIZJ = entranceGroup.loop;
        this.LIZLLL = entranceGroup.animationLoopForOff;
        RankEntranceV3Response.EntranceGroup.Data data = entranceGroup.data;
        if (data != null && (list2 = data.entrances) != null) {
            for (RankEntrance it : list2) {
                List<C31516CYm> list3 = this.LJ;
                o.LJIIIIZZ(it, "it");
                list3.add(new C31516CYm(it, this.LIZIZ, this.LIZJ, this.LIZLLL));
                C28652BMi.LIZLLL(it.rankType, it.ownerRankIdx, false);
                if (it.rankType == RankTypeV2.LJII.type) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new RankTabInfo());
                    this.LJI = arrayList;
                }
            }
        }
        RankEntranceV3Response.EntranceGroup.Data data2 = entranceGroup.data;
        if (data2 != null) {
            list = data2.tabs;
        } else {
            list = null;
        }
        this.LJFF = list;
    }
}
