package X;

import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HDR<T> implements InterfaceC66992k3 {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public HDR(String str, int i, String str2, boolean z, boolean z2) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = z2;
        this.LJLJJL = str2;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<ChallengeDetail> interfaceC65052gv) {
        try {
            if (!this.LJLIL) {
                MH2 mh2 = MH2.LIZ;
                String str = this.LJLILLLLZI;
                int i = this.LJLJI;
                boolean z = this.LJLJJI;
                mh2.getClass();
                ChallengeDetail LIZIZ = MH2.LIZIZ(i, str, z);
                if (LIZIZ != null) {
                    ((C73578SuE) interfaceC65052gv).onSuccess(LIZIZ);
                }
            }
            String str2 = this.LJLILLLLZI;
            ChallengeDetail data = ChallengeApi.LIZ(this.LJLJI, str2, this.LJLJJL, this.LJLJJI);
            ((C73578SuE) interfaceC65052gv).onSuccess(data);
            MH2 mh22 = MH2.LIZ;
            String str3 = this.LJLILLLLZI;
            int i2 = this.LJLJI;
            boolean z2 = this.LJLJJI;
            o.LJIIIIZZ(data, "data");
            mh22.getClass();
            MH2.LIZJ(str3, i2, z2, data);
        } catch (Throwable th) {
            C73578SuE c73578SuE = (C73578SuE) interfaceC65052gv;
            if (!c73578SuE.isDisposed()) {
                c73578SuE.onError(th);
            }
        }
    }
}
