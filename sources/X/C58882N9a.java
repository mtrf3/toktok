package X;

import android.app.Activity;
import android.os.Build;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.N9a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58882N9a extends AbstractC58883N9b {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Boolean bool;
        boolean z;
        Activity LIZLLL;
        o.LJIIIZ(type, "type");
        InterfaceC58884N9c interfaceC58884N9c = (InterfaceC58884N9c) ED5.LIZJ(InterfaceC58884N9c.class, null);
        if (Build.VERSION.SDK_INT >= 24) {
            InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
            if (interfaceC38263Ezz != null && (LIZLLL = interfaceC38263Ezz.LIZLLL()) != null) {
                z = LIZLLL.isInMultiWindowMode();
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = Boolean.FALSE;
        }
        interfaceC58884N9c.setInMultiWindowMode(bool);
        c37356ElM.onSuccess(interfaceC58884N9c, "");
    }
}
