package X;

import com.ss.android.ugc.aweme.duet.model.DuetAwemeList;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.3IP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3IP<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI = 20;
    public final /* synthetic */ String LJLJJI;

    public C3IP(String str, String str2, long j) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJJI = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj;
        String awemeId = this.LJLIL;
        long j = this.LJLILLLLZI;
        long j2 = this.LJLJI;
        String str = this.LJLJJI;
        o.LJIIIZ(awemeId, "awemeId");
        String str2 = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str2, "API_URL_PREFIX_SI", str2);
        if (LJI != null) {
            obj = LJI.create(com.ss.android.ugc.aweme.duet.api.API.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        DuetAwemeList duetAwemeList = ((com.ss.android.ugc.aweme.duet.api.API) obj).getDuetDetailList(awemeId, j, j2, str, 37).get();
        o.LJIIIIZZ(duetAwemeList, "api.getDuetDetailList(aw…, DUET_ANCHOR_TYPE).get()");
        return duetAwemeList;
    }
}
