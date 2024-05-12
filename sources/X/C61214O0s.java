package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.O0s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61214O0s extends AbstractC61215O0t {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String str;
        InterfaceC61216O0u interfaceC61216O0u = (InterfaceC61216O0u) xBaseParamModel;
        o.LJIIIZ(type, "type");
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(interfaceC61216O0u.getPackageName(), interfaceC61216O0u.getActivityName()));
        for (Map.Entry<String, Object> entry : interfaceC61216O0u.getExtra().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                intent.putExtra(key, ((Number) value).intValue());
            } else if (value instanceof Long) {
                intent.putExtra(key, ((Number) value).longValue());
            } else if (value instanceof Boolean) {
                intent.putExtra(key, ((Boolean) value).booleanValue());
            } else if (value instanceof String) {
                intent.putExtra(key, (String) value);
            }
        }
        Activity LJI = C79043V0l.LJI(this);
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC61217O0v.class, null);
        InterfaceC61217O0v interfaceC61217O0v = (InterfaceC61217O0v) LIZJ;
        if (LJI == null) {
            str = "error";
        } else {
            str = "success";
        }
        interfaceC61217O0v.setResultCode(str);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
        if (LJI != null) {
            C16880lQ.LIZIZ(LJI, intent);
        }
    }
}
