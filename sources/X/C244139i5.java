package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.profile.api.ProfileAdvancedFeaturesOrderUpdateAPI;

/* renamed from: X.9i5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244139i5 extends AbstractC65781Prl implements InterfaceC65784Pro<ProfileAdvancedFeaturesOrderUpdateAPI> {
    public static final C244139i5 LJLIL = new C244139i5();

    public C244139i5() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.profile.api.ProfileAdvancedFeaturesOrderUpdateAPI] */
    @Override // X.InterfaceC65784Pro
    public final ProfileAdvancedFeaturesOrderUpdateAPI invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(ProfileAdvancedFeaturesOrderUpdateAPI.class);
    }
}
