package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.trill.setting.DoNotTranslateSettingApi;

/* renamed from: X.AAx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25807AAx extends AbstractC65781Prl implements InterfaceC65784Pro<DoNotTranslateSettingApi> {
    public static final C25807AAx LJLIL = new C25807AAx();

    public C25807AAx() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.trill.setting.DoNotTranslateSettingApi] */
    @Override // X.InterfaceC65784Pro
    public final DoNotTranslateSettingApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, DoNotTranslateSettingApi.class);
    }
}
