package X;

import com.bytedance.mota.storage.motacache.IMotaCache;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionCountAgent;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionCountCache;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeFavoriteCache;
import com.ss.android.ugc.aweme.state.base.StateAgentCache;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XHo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84584XHo extends AbstractC65781Prl implements InterfaceC88473Ynt<String, InterfaceC199277rv, Boolean, List<? extends IMotaCache>> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ AwemeCollectionAgent LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84584XHo(String str, AwemeCollectionAgent awemeCollectionAgent, boolean z) {
        super(3);
        this.LJLIL = str;
        this.LJLILLLLZI = awemeCollectionAgent;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC88473Ynt
    public final List<? extends IMotaCache> invoke(String str, InterfaceC199277rv interfaceC199277rv, Boolean bool) {
        Object LJ;
        long longValue;
        int i;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(str, "<anonymous parameter 0>");
        o.LJIIIZ(interfaceC199277rv, "<anonymous parameter 1>");
        StateAgentCache[] stateAgentCacheArr = new StateAgentCache[2];
        String str2 = this.LJLIL;
        AwemeCollectionAgent awemeCollectionAgent = this.LJLILLLLZI;
        if (booleanValue) {
            LJ = awemeCollectionAgent.LJIILL(awemeCollectionAgent.LJ(str2));
        } else {
            LJ = awemeCollectionAgent.LJ(str2);
        }
        stateAgentCacheArr[0] = new AwemeFavoriteCache(str2, ((Boolean) LJ).booleanValue());
        String str3 = this.LJLIL;
        if (booleanValue) {
            long longValue2 = AwemeCollectionCountAgent.LJIILJJIL().LJ(this.LJLIL).longValue();
            if (this.LJLJI) {
                i = 1;
            } else {
                i = -1;
            }
            longValue = longValue2 + i;
        } else {
            longValue = AwemeCollectionCountAgent.LJIILJJIL().LJ(this.LJLIL).longValue();
        }
        stateAgentCacheArr[1] = new AwemeCollectionCountCache(str3, longValue);
        return C47261Igj.LJJIJIIJI(stateAgentCacheArr);
    }
}
