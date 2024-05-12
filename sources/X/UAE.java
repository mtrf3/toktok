package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.realx.base.NetworkTypeUtils;
import java.util.List;
import org.json.JSONObject;
import tikcast.linkmic.common.GroupChannelUser;

/* loaded from: classes14.dex */
public final class UAE implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ java.util.Map<Long, List<GroupChannelUser>> LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ long LJLJL;

    public UAE(long j, long j2, long j3, long j4, U7T u7t, String str, java.util.Map map) {
        this.LJLIL = u7t;
        this.LJLILLLLZI = map;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = j3;
        this.LJLJJLL = str;
        this.LJLJL = j4;
    }

    public final void LIZ() {
        JSONObject LJIJI = UC0.LJIJI(this.LJLIL);
        boolean isNetworkAvailable = NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context());
        UA9.LJFF().LIZIZ(new UAF(UA9.LIZIZ(this.LJLILLLLZI.get(Long.valueOf(this.LJLJI))), this.LJLIL, LJIJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, isNetworkAvailable, this.LJLJL, this.LJLJI));
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
