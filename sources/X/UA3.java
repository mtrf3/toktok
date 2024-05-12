package X;

import java.util.List;
import org.json.JSONObject;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupChannelUser;

/* loaded from: classes14.dex */
public final class UA3 implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ GroupChannelAllUser LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    public UA3(U7T u7t, GroupChannelAllUser groupChannelAllUser, long j, long j2, long j3, long j4) {
        this.LJLIL = u7t;
        this.LJLILLLLZI = groupChannelAllUser;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = j3;
        this.LJLJJLL = j4;
    }

    public final void LIZ() {
        List list;
        List<GroupChannelUser> list2;
        JSONObject LJIJI = UC0.LJIJI(this.LJLIL);
        GroupChannelAllUser groupChannelAllUser = this.LJLILLLLZI;
        if (groupChannelAllUser != null && (list2 = groupChannelAllUser.user) != null) {
            list = UA9.LIZIZ(list2);
        } else {
            list = null;
        }
        UA9.LJFF().LIZIZ(new UA4(list, this.LJLIL, LJIJI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLILLLLZI));
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
