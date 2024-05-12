package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.tiktok.addyours.api.IAddYoursApiDefinition;

/* renamed from: X.30O, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30O extends AbstractC65781Prl implements InterfaceC65784Pro<IAddYoursApiDefinition> {
    public static final C30O LJLIL = new C30O();

    public C30O() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.tiktok.addyours.api.IAddYoursApiDefinition, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final IAddYoursApiDefinition invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(IAddYoursApiDefinition.class);
    }
}
