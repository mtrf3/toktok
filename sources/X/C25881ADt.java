package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creatortools.AdAuthorizationApi;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ADt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25881ADt {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C25883ADv.LJLIL);

    public static void LIZ(Context context, boolean z, InterfaceC25880ADs interfaceC25880ADs, boolean z2) {
        o.LJIIIZ(context, "context");
        HashMap hashMap = new HashMap();
        hashMap.put("ad_authorization", Boolean.valueOf(z));
        hashMap.put("confirmed", Boolean.valueOf(z2));
        if (interfaceC25880ADs != null) {
            interfaceC25880ADs.onLoading();
        }
        AdAuthorizationApi.LIZ.getClass();
        C25882ADu.LIZIZ.requestAdAuthorization(hashMap).enqueue(new C25879ADr(context, interfaceC25880ADs, z));
    }
}
