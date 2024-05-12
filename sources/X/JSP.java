package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.delegate.LifecycleDelegate;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class JSP extends JSQ {
    public static final /* synthetic */ int LJLJJL = 0;
    public final LifecycleDelegate LJLJI;
    public final C50098JlO LJLJJI;

    public JSP(JTS jts) {
        super(jts);
        LifecycleDelegate lifecycleDelegate = new LifecycleDelegate(jts);
        this.LJLJI = lifecycleDelegate;
        C50098JlO c50098JlO = new C50098JlO(jts);
        this.LJLJJI = c50098JlO;
        ((ArrayList) this.LJLILLLLZI).add(c50098JlO);
        ((ArrayList) this.LJLILLLLZI).add(lifecycleDelegate);
    }
}
