package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.UhT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77883UhT extends AbstractC77882UhS {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Activity activity;
        boolean z;
        InterfaceC77884UhU interfaceC77884UhU = (InterfaceC77884UhU) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            activity = interfaceC38263Ezz.LIZLLL();
        } else {
            activity = null;
        }
        if (activity == null) {
            C31626Cb8.LIZ(c37356ElM, 0, "activity ref is released!", 4);
            return;
        }
        String title = interfaceC77884UhU.getTitle();
        String notes = interfaceC77884UhU.getNotes();
        long longValue = interfaceC77884UhU.getStartDate().longValue();
        long longValue2 = interfaceC77884UhU.getEndDate().longValue();
        String repeatFrequency = interfaceC77884UhU.getRepeatFrequency();
        int intValue = interfaceC77884UhU.getRepeatInterval().intValue();
        int intValue2 = interfaceC77884UhU.getRepeatCount().intValue();
        Boolean allDay = interfaceC77884UhU.getAllDay();
        if (allDay != null) {
            z = allDay.booleanValue();
        } else {
            z = false;
        }
        C77880UhQ c77880UhQ = new C77880UhQ(title, notes, longValue, longValue2, repeatFrequency, intValue, intValue2, z);
        InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
        if (interfaceC38263Ezz2 == null || interfaceC38263Ezz2.getContext() == null) {
            return;
        }
        if (C77879UhP.LIZ(c77880UhQ, activity, 1207964929, LJ(type))) {
            c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC77889UhZ.class, null), "");
        } else {
            c37356ElM.onFailure(0, "System calendar app is not installed", null);
        }
    }
}
