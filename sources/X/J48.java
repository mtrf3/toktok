package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.common.MLCommonServiceImpl;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class J48<V> implements Callable {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ MLCommonServiceImpl LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ ArrayList<J4G> LJLJJL;

    public J48(Aweme aweme, MLCommonServiceImpl mLCommonServiceImpl, String str, String str2, ArrayList arrayList) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = mLCommonServiceImpl;
        this.LJLJJI = str2;
        this.LJLJJL = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        J4A j4a;
        Aweme aweme = this.LJLIL;
        if (aweme != null) {
            j4a = new J4A(aweme, this.LJLILLLLZI);
        } else {
            j4a = null;
        }
        MLCommonServiceImpl mLCommonServiceImpl = this.LJLJI;
        String str = this.LJLJJI;
        ArrayList<J4G> arrayList = this.LJLJJL;
        mLCommonServiceImpl.getClass();
        MLCommonServiceImpl.LIZJ(str, j4a, arrayList);
        return C76800UCe.LIZ;
    }
}
