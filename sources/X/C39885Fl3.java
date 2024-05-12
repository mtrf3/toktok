package X;

import android.content.Context;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.ISSPService;
import kotlin.jvm.internal.o;

/* renamed from: X.Fl3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39885Fl3 extends C39887Fl5 implements ISSPService {
    public final InterfaceC39860Fke LIZIZ;

    public C39885Fl3(InterfaceC39860Fke interfaceC39860Fke) {
        this.LIZIZ = interfaceC39860Fke;
    }

    @Override // com.bytedance.lynx.hybrid.service.ISSPService
    public final AbstractC60673NrZ bootSSPLifecycle(Context context, C60737Nsb hybridContext, HybridSchemaParam schemaParams) {
        o.LJIIJ(context, "context");
        o.LJIIJ(hybridContext, "hybridContext");
        o.LJIIJ(schemaParams, "schemaParams");
        InterfaceC39860Fke interfaceC39860Fke = this.LIZIZ;
        if (interfaceC39860Fke != null) {
            return interfaceC39860Fke.bootSSPLifecycle(context, hybridContext, schemaParams);
        }
        return null;
    }
}
