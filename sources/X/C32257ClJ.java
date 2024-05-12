package X;

import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.ClJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32257ClJ {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static final C32225Ckn LIZIZ() {
        C32225Ckn c32225Ckn = (C32225Ckn) C32260ClM.LIZ(C32225Ckn.class);
        if (c32225Ckn == null) {
            return new C32225Ckn(new C32222Ckk());
        }
        return c32225Ckn;
    }

    public static final InterfaceC32251ClD LIZJ() {
        return (InterfaceC32251ClD) C32260ClM.LIZ(InterfaceC32251ClD.class);
    }

    public static final InterfaceC32216Cke LIZLLL() {
        InterfaceC32216Cke interfaceC32216Cke = (InterfaceC32216Cke) C32260ClM.LIZ(InterfaceC32216Cke.class);
        if (interfaceC32216Cke == null) {
            return new C32259ClL();
        }
        return interfaceC32216Cke;
    }

    public static final Long LJ() {
        InterfaceC32258ClK interfaceC32258ClK = (InterfaceC32258ClK) C32260ClM.LIZ(InterfaceC32258ClK.class);
        if (interfaceC32258ClK != null) {
            return Long.valueOf(interfaceC32258ClK.getUserId());
        }
        return null;
    }

    public static final int LJFF() {
        C32240Cl2 roomInfo;
        Long LJ = LJ();
        InterfaceC32258ClK interfaceC32258ClK = (InterfaceC32258ClK) C32260ClM.LIZ(InterfaceC32258ClK.class);
        Long l = null;
        if (interfaceC32258ClK != null && (roomInfo = interfaceC32258ClK.getRoomInfo()) != null) {
            l = Long.valueOf(roomInfo.LIZJ);
        }
        return o.LJ(LJ, l) ? 1 : 0;
    }

    public static final boolean LJI() {
        C32240Cl2 roomInfo;
        Long LJ = LJ();
        InterfaceC32258ClK interfaceC32258ClK = (InterfaceC32258ClK) C32260ClM.LIZ(InterfaceC32258ClK.class);
        Long l = null;
        if (interfaceC32258ClK != null && (roomInfo = interfaceC32258ClK.getRoomInfo()) != null) {
            l = Long.valueOf(roomInfo.LIZJ);
        }
        return o.LJ(LJ, l);
    }

    public static final ActivityC45651qj LIZ(Context context) {
        if (context instanceof ActivityC45651qj) {
            return (ActivityC45651qj) context;
        }
        if (context instanceof ContextWrapper) {
            return LIZ(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final JSONObject LJII(java.util.Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (Exception e) {
                C32444CoK.LIZJ(e);
            }
        }
        return jSONObject;
    }

    public static final void LJIIIIZZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (!o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            LIZ.post(new ARunnableS41S0100000_5(interfaceC65784Pro, LiveCoverMinSizeSetting.DEFAULT));
        } else {
            interfaceC65784Pro.invoke();
        }
    }
}
