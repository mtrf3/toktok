package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.NpC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60526NpC extends AbstractC60528NpE {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        Activity activity = null;
        if (interfaceC38263Ezz != null) {
            context = interfaceC38263Ezz.getContext();
        } else {
            context = null;
        }
        C60529NpF c60529NpF = new C60529NpF(c37356ElM);
        InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
        if (context != null) {
            activity = C45804HyK.LJIJJ(context);
        }
        LJIIIIZZ.openCountryListActivity(activity, c60529NpF);
    }
}
