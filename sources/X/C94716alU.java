package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.music.app.auth.report.api.ActionReportApi;
import kotlin.jvm.internal.o;

/* renamed from: X.alU, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94716alU extends AbstractC65781Prl implements InterfaceC65784Pro<ActionReportApi> {
    public static final C94716alU LJLIL = new C94716alU();

    public C94716alU() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.music.app.auth.report.api.ActionReportApi] */
    @Override // X.InterfaceC65784Pro
    public final ActionReportApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        return LIZLLL.create(API_URL_PREFIX_SI).create(ActionReportApi.class);
    }
}
