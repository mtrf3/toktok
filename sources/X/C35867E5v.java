package X;

import com.ss.android.ugc.aweme.data.HybridABApi;
import kotlin.jvm.internal.o;

/* renamed from: X.E5v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35867E5v<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ E71 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;

    public C35867E5v(E71 e71, String str, int i, String str2) {
        this.LJLIL = e71;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = str2;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        boolean z;
        HybridABApi.HybridABBody body = (HybridABApi.HybridABBody) obj;
        o.LJIIIZ(body, "body");
        HybridABApi hybridABApi = (HybridABApi) this.LJLIL.LIZIZ.getValue();
        String str = this.LJLILLLLZI;
        if (this.LJLJI == 0) {
            z = true;
        } else {
            z = false;
        }
        return hybridABApi.getHybridExperimentsByPost(str, z, E73.LIZ(), this.LJLJJI, null, body);
    }
}
