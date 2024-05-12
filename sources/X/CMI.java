package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CMI implements O99 {
    @Override // X.O99
    public final String LIZIZ(Context context, String str) {
        return C29706BlG.LIZIZ(str);
    }

    @Override // X.O99
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ(Context context, String schema, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(schema, "schema");
        return ((IHybridContainerService) CN1.LIZ(IHybridContainerService.class)).cZ(context, schema, false, interfaceC88472Yns);
    }
}
