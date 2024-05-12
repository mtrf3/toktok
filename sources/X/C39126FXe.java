package X;

import com.orbu.core.TTKOrbu;
import com.orbu.core.adapter.TTKResponse;
import com.orbu.core.adapter.TTKResponseKt;
import com.orbu.core.adapter.TTKSystemApiRequest;
import java.util.LinkedHashMap;

/* renamed from: X.FXe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39126FXe implements InterfaceC39128FXg {
    @Override // X.InterfaceC39128FXg
    public final C66300Q0i LIZ(C39127FXf c39127FXf) {
        Integer num;
        String str;
        TTKOrbu tTKOrbu = TTKOrbu.INSTANCE;
        if (!tTKOrbu.enableInterceptor()) {
            return new C66300Q0i(0, null, 7);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer num2 = c39127FXf.LJLIL;
        if (num2 != null) {
            linkedHashMap.put("x-tt-dataflow-id", String.valueOf(num2.intValue()));
        }
        String str2 = c39127FXf.LJLILLLLZI;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = c39127FXf.LJLJI;
        if (str4 != null) {
            str3 = str4;
        }
        TTKResponse shouldInterceptTTKRequest = tTKOrbu.shouldInterceptTTKRequest(new TTKSystemApiRequest(str2, str3, c39127FXf.LJLJJI, linkedHashMap));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("end check >> code:$");
        if (shouldInterceptTTKRequest != null) {
            num = Integer.valueOf(shouldInterceptTTKRequest.getStatusCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append("  des:");
        if (shouldInterceptTTKRequest != null) {
            str = shouldInterceptTTKRequest.getDescription();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (!TTKResponseKt.isBlock(shouldInterceptTTKRequest)) {
            return new C66300Q0i(0, null, 7);
        }
        throw new Q0C(-4003, "sandbox blocked");
    }
}
