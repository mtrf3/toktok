package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.UhV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77885UhV extends AbstractC77886UhW {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Activity LIZLLL;
        boolean z;
        InterfaceC77887UhX interfaceC77887UhX = (InterfaceC77887UhX) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || (LIZLLL = interfaceC38263Ezz.LIZLLL()) == null) {
            return;
        }
        String title = interfaceC77887UhX.getTitle();
        String notes = interfaceC77887UhX.getNotes();
        long longValue = interfaceC77887UhX.getStartDate().longValue();
        long longValue2 = interfaceC77887UhX.getEndDate().longValue();
        Boolean allDay = interfaceC77887UhX.getAllDay();
        if (allDay != null) {
            z = allDay.booleanValue();
        } else {
            z = false;
        }
        C77880UhQ c77880UhQ = new C77880UhQ(title, notes, longValue, longValue2, "", -1, -1, z);
        InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
        if (interfaceC38263Ezz2 == null || interfaceC38263Ezz2.getContext() == null) {
            return;
        }
        if (C77879UhP.LIZ(c77880UhQ, LIZLLL, null, null)) {
            c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC77888UhY.class, null), "");
        } else {
            c37356ElM.onFailure(0, "System calendar app is not installed", null);
        }
    }
}
