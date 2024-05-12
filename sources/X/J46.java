package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.common.MLCommonServiceImpl;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class J46<V> implements Callable {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ MLCommonServiceImpl LJLJJI;
    public final /* synthetic */ ArrayList<J4G> LJLJJL;

    public J46(Aweme aweme, String str, int i, JSONObject jSONObject, MLCommonServiceImpl mLCommonServiceImpl, ArrayList<J4G> arrayList) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = jSONObject;
        this.LJLJJI = mLCommonServiceImpl;
        this.LJLJJL = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Aweme aweme = this.LJLIL;
        String str = this.LJLILLLLZI;
        J4A j4a = new J4A(aweme, str);
        j4a.LIZIZ = str;
        j4a.LIZLLL = this.LJLJI;
        MLCommonServiceImpl mLCommonServiceImpl = this.LJLJJI;
        ArrayList<J4G> arrayList = this.LJLJJL;
        mLCommonServiceImpl.getClass();
        MLCommonServiceImpl.LIZJ("on_view_pager_selected", j4a, arrayList);
        return C76800UCe.LIZ;
    }
}
