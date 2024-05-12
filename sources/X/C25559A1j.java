package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.business.hideaccount.HideAccountApi;
import kotlin.jvm.internal.o;

/* renamed from: X.A1j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25559A1j {
    public static final /* synthetic */ C25559A1j LIZ = new C25559A1j();
    public static final HideAccountApi LIZIZ = (HideAccountApi) RetrofitFactory.LIZLLL().create(C778533t.LIZ).create(HideAccountApi.class);

    public static C73422Sri LIZ(String pageToken) {
        o.LJIIIZ(pageToken, "pageToken");
        return LIZIZ.fetchHiddenAccounts(pageToken, 20).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(C25560A1k.LJLIL).LJIJJ(C25564A1o.LJLIL);
    }
}
