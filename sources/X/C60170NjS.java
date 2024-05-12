package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.commercialize.track.RawURLGetter;

/* renamed from: X.NjS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60170NjS extends AbstractC65781Prl implements InterfaceC65784Pro<RawURLGetter.RawUrlApi> {
    public static final C60170NjS LJLIL = new C60170NjS();

    public C60170NjS() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.ss.android.ugc.aweme.commercialize.track.RawURLGetter$RawUrlApi] */
    @Override // X.InterfaceC65784Pro
    public final RawURLGetter.RawUrlApi invoke() {
        C65087PgZ LIZ = RetrofitFactory.LIZLLL().LIZ(C61161NzR.LIZIZ.LJFF());
        LIZ.LIZJ = true;
        return LIZ.LJFF().LIZ.LIZ(RawURLGetter.RawUrlApi.class);
    }
}
