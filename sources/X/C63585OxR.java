package X;

import com.bytedance.im.core.proto.InputStatusNotify;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.OxR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63585OxR extends AbstractC63234Orm {
    public C63585OxR() {
        super(EnumC63625Oy5.NEW_INPUT_STATUS_NOTIFY.getValue());
    }

    @Override // X.AbstractC63234Orm
    public final void LJIILIIL(int i, ResponseBody responseBody, EP1 ep1) {
        Long l;
        InputStatusNotify inputStatusNotify;
        Long l2;
        String str;
        Long l3;
        EnumC63506OwA enumC63506OwA;
        Long l4;
        InputStatusNotify inputStatusNotify2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleResponse create ts: ");
        if (responseBody != null && (inputStatusNotify2 = responseBody.input_status_notify) != null) {
            l = inputStatusNotify2.create_time;
        } else {
            l = null;
        }
        LIZ.append(l);
        C63322OtC.LJI("NewInputStatusNotifyHandler", X1D.LIZIZ(LIZ), null);
        if (responseBody == null || (inputStatusNotify = responseBody.input_status_notify) == null || (l2 = inputStatusNotify.sender) == null) {
            return;
        }
        long longValue = l2.longValue();
        InputStatusNotify inputStatusNotify3 = responseBody.input_status_notify;
        if (inputStatusNotify3 == null || (str = inputStatusNotify3.conversation_id) == null || inputStatusNotify3 == null || (l3 = inputStatusNotify3.conversation_short_id) == null) {
            return;
        }
        l3.longValue();
        InputStatusNotify inputStatusNotify4 = responseBody.input_status_notify;
        if (inputStatusNotify4 == null || (enumC63506OwA = inputStatusNotify4.conversation_type) == null || (l4 = inputStatusNotify4.create_time) == null) {
            return;
        }
        long longValue2 = l4.longValue();
        C63309Osz LIZLLL = C63309Osz.LIZLLL();
        enumC63506OwA.getValue();
        Iterator it = ((CopyOnWriteArraySet) LIZLLL.LJII).iterator();
        while (it.hasNext()) {
            C4ZE c4ze = (C4ZE) it.next();
            if (c4ze != null) {
                c4ze.LIZ(Long.valueOf(longValue2), Long.valueOf(longValue), str);
            }
        }
    }
}
