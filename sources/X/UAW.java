package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.realx.base.NetworkTypeUtils;
import java.util.List;
import org.json.JSONObject;
import tikcast.linkmic.common.GroupChannelUser;

/* loaded from: classes14.dex */
public final class UAW implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ java.util.Map<Long, List<GroupChannelUser>> LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ OSZ<Long, String> LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ long LJLL;

    public UAW(long j, long j2, long j3, long j4, long j5, U7T u7t, String str, String str2, java.util.Map map, OSZ osz) {
        this.LJLIL = u7t;
        this.LJLILLLLZI = j;
        this.LJLJI = map;
        this.LJLJJI = j2;
        this.LJLJJL = j3;
        this.LJLJJLL = j4;
        this.LJLJL = str;
        this.LJLJLJ = osz;
        this.LJLJLLL = str2;
        this.LJLL = j5;
    }

    public final void LIZ() {
        JSONObject LJIJI = UC0.LJIJI(this.LJLIL);
        boolean isNetworkAvailable = NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context());
        if (((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() == this.LJLILLLLZI) {
            UA9.LJFF().LIZIZ(new UAX(UA9.LIZIZ(this.LJLJI.get(Long.valueOf(this.LJLJJI))), this.LJLIL, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, LJIJI, this.LJLJLLL, isNetworkAvailable, this.LJLJJI, this.LJLL));
            return;
        }
        UAS LIZJ = UA9.LIZLLL().LIZJ(this.LJLIL, String.valueOf(this.LJLILLLLZI), null);
        if (LIZJ == null) {
            return;
        }
        long j = this.LJLJJL;
        long j2 = this.LJLJJLL;
        String str = this.LJLJL;
        OSZ<Long, String> osz = this.LJLJLJ;
        String str2 = this.LJLJLLL;
        long j3 = this.LJLJJI;
        long j4 = this.LJLL;
        UAR.LIZIZ(LIZJ, "kick_out", j - j2, str, osz.getFirst().longValue());
        C76786UBq LJ = UA9.LJ();
        UC0.LJJLIIIJJI(LJIJI, LIZJ);
        JSONObject LJIILLIIL = UC0.LJIILLIIL(osz.getFirst(), osz.getSecond(), str);
        LJIILLIIL.put("leave_group_channel_id", j3);
        LJIILLIIL.put("stay_group_channel_id", j4);
        LJIILLIIL.put("source", str2);
        C77119UOl.LJIJJLI(LJ, LIZJ, LJIJI, "kick_out", LJIILLIIL, j2, j);
        if (osz.getFirst().longValue() != 0) {
            return;
        }
        C77119UOl.LJJ(UA9.LJ(), LIZJ, 1);
        UAR.LJFF(osz.getFirst().longValue(), j, LIZJ, "kick_out", str2, isNetworkAvailable);
        UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
