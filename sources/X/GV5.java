package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final /* synthetic */ class GV5 implements Callable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.LJLIL) {
            case 0:
                String str = this.LJLILLLLZI;
                Activity validTopActivity = ActivityStack.getValidTopActivity();
                if (validTopActivity == null) {
                    return null;
                }
                C26045AKb c26045AKb = new C26045AKb(validTopActivity);
                c26045AKb.LJ(R.style.ul);
                c26045AKb.LJIIIZ(str);
                c26045AKb.LJIIJ();
                return null;
            default:
                return C1DG.LJFF().LJ(new C41363GLf(new CreativeInfo(this.LJLILLLLZI), true));
        }
    }

    public /* synthetic */ GV5(String str, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
