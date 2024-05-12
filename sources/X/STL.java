package X;

import com.ss.android.ugc.aweme.aigc.AIGCQuota;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcProgressAssem;
import java.util.List;

/* loaded from: classes13.dex */
public final class STL<T1, T2> implements InterfaceC73459SsJ {
    public final /* synthetic */ ProfileAigcProgressAssem LJLIL;

    public STL(ProfileAigcProgressAssem profileAigcProgressAssem) {
        this.LJLIL = profileAigcProgressAssem;
    }

    @Override // X.InterfaceC73459SsJ
    public final void accept(Object obj, Object obj2) {
        List<AIGCQuota> list = (List) obj;
        ProfileAigcProgressAssem profileAigcProgressAssem = this.LJLIL;
        profileAigcProgressAssem.LJZL = list;
        profileAigcProgressAssem.LJZI.onNext(list);
    }
}
