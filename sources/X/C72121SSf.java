package X;

import com.ss.android.ugc.aweme.aigc.AIGCQuota;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SSf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72121SSf implements Serializable {
    public List<String> LJLIL = C61878OQg.INSTANCE;
    public List<AIGCQuota> LJLILLLLZI;
    public String LJLJI;
    public OPL LJLJJI;

    public final List<String> getAvatarUris() {
        return this.LJLIL;
    }

    public final OPL getPathMode() {
        return this.LJLJJI;
    }

    public final List<AIGCQuota> getRemainingQuota() {
        return this.LJLILLLLZI;
    }

    public final String getTaskId() {
        return this.LJLJI;
    }

    public final OPL getPathMode(String jobType) {
        o.LJIIIZ(jobType, "jobType");
        if (o.LJ(jobType, "fast")) {
            return OPL.FAST;
        }
        if (o.LJ(jobType, "slow")) {
            return OPL.SLOW;
        }
        return null;
    }

    public final void setAvatarUris(List<String> list) {
        this.LJLIL = list;
    }

    public final void setPathMode(OPL opl) {
        this.LJLJJI = opl;
    }

    public final void setRemainingQuota(List<AIGCQuota> list) {
        this.LJLILLLLZI = list;
    }

    public final void setTaskId(String str) {
        this.LJLJI = str;
    }
}
