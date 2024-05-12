package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.personalized.ReportHybridABApi;
import defpackage.i0;

/* renamed from: X.2wr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74932wr extends AbstractC65781Prl implements InterfaceC65784Pro<ReportHybridABApi> {
    public static final C74932wr LJLIL = new C74932wr();

    public C74932wr() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.personalized.ReportHybridABApi] */
    @Override // X.InterfaceC65784Pro
    public final ReportHybridABApi invoke() {
        return RetrofitFactory.LIZLLL().create(i0.LJFF("https://", EF7.LJI.LIZ)).create(ReportHybridABApi.class);
    }
}
