package X;

import android.view.LayoutInflater;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.KGs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51438KGs extends AbstractC51439KGt {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        LayoutInflater.Factory LJ;
        String str;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (((interfaceC38263Ezz != null && (LJ = interfaceC38263Ezz.LIZLLL()) != null) || (LJ = C50989Jzl.LJ()) != null) && (LJ instanceof SearchResultActivity)) {
            C17N.LJJJJJL((LifecycleOwner) LJ).iL().LIZ(new K63(true));
            InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
            if (interfaceC38263Ezz2 != null) {
                str = interfaceC38263Ezz2.LIZIZ();
            } else {
                str = null;
            }
            c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC51441KGv.class, str), "");
            return;
        }
        C31626Cb8.LIZ(c37356ElM, 0, "Container's activity is null or not SearchResultActivity!", 4);
    }
}
