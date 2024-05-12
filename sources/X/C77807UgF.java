package X;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.CalendarContract;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.UgF, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77807UgF extends AbstractC77804UgC {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String str;
        String str2;
        Number number;
        Number number2;
        Activity LIZLLL;
        PackageManager packageManager;
        Activity LIZLLL2;
        InterfaceC77805UgD interfaceC77805UgD = (InterfaceC77805UgD) xBaseParamModel;
        o.LJIIIZ(type, "type");
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setData(CalendarContract.Events.CONTENT_URI);
        InterfaceC77808UgG event = interfaceC77805UgD.getEvent();
        if (event != null) {
            str = event.getTitle();
        } else {
            str = null;
        }
        intent.putExtra("title", str);
        InterfaceC77808UgG event2 = interfaceC77805UgD.getEvent();
        if (event2 != null) {
            str2 = event2.getNote();
        } else {
            str2 = null;
        }
        intent.putExtra("description", str2);
        InterfaceC77808UgG event3 = interfaceC77805UgD.getEvent();
        if (event3 != null) {
            number = event3.getStartTime();
        } else {
            number = null;
        }
        intent.putExtra("beginTime", number);
        InterfaceC77808UgG event4 = interfaceC77805UgD.getEvent();
        if (event4 != null) {
            number2 = event4.getEndTime();
        } else {
            number2 = null;
        }
        intent.putExtra("endTime", number2);
        intent.putExtra("pns.sandbox.dataflow_id", 1207964929);
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (LIZLLL = interfaceC38263Ezz.LIZLLL()) != null && (packageManager = LIZLLL.getPackageManager()) != null && intent.resolveActivity(packageManager) != null) {
            c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC77803UgB.class, null), "");
            intent.putExtra("pns.sandbox.dataflow_id", 1207964929);
            InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
            if (interfaceC38263Ezz2 != null && (LIZLLL2 = interfaceC38263Ezz2.LIZLLL()) != null) {
                C16880lQ.LIZIZ(LIZLLL2, intent);
                return;
            }
            return;
        }
        c37356ElM.onFailure(0, "no calendar app", null);
    }
}
