package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.common.MLCommonServiceImpl;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class J47<V> implements Callable {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ MLCommonServiceImpl LJLJI;
    public final /* synthetic */ ArrayList<J4G> LJLJJI;

    public J47(Aweme aweme, String str, boolean z, MLCommonServiceImpl mLCommonServiceImpl, ArrayList<J4G> arrayList) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = mLCommonServiceImpl;
        this.LJLJJI = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        J4A j4a = new J4A(this.LJLIL, this.LJLILLLLZI);
        MLCommonServiceImpl mLCommonServiceImpl = this.LJLJI;
        ArrayList<J4G> arrayList = this.LJLJJI;
        mLCommonServiceImpl.getClass();
        MLCommonServiceImpl.LIZJ("play_pause", j4a, arrayList);
        return C76800UCe.LIZ;
    }
}
