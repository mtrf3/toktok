package X;

import com.ss.android.ugc.aweme.mvtemplate.api.MovieDetailAPi;
import com.ss.android.ugc.aweme.mvtemplate.model.MvDetailModel;
import kotlin.jvm.internal.o;

/* renamed from: X.8BN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8BN extends AbstractC65781Prl implements InterfaceC65784Pro<MvDetailModel> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8BN(String str, int i, int i2) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // X.InterfaceC65784Pro
    public final MvDetailModel invoke() {
        Object obj;
        String mvId = this.LJLIL;
        int i = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        o.LJIIIZ(mvId, "mvId");
        String str = MovieDetailAPi.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "URL_MOVIE_DETAIL", str);
        if (LJI != null) {
            obj = LJI.create(MovieDetailAPi.MvDetail.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        MvDetailModel response = ((MovieDetailAPi.MvDetail) obj).getMvDetail(mvId, i, i2).get();
        o.LJIIIIZZ(response, "response");
        return response;
    }
}
