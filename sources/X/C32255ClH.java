package X;

import Y.ARunnableS41S0100000_5;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.ClH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32255ClH {
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C32254ClG.LJLIL);
    public final String LIZ;
    public final boolean LIZIZ;
    public final java.util.Map<String, String> LIZJ;

    public final void LIZ() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZJ);
        if (!this.LIZIZ || o.LJJJLIIL(this.LIZ, "livesdk_", false)) {
            str = this.LIZ;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("livesdk_");
            LIZ.append(this.LIZ);
            str = X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onEvent name=");
        LIZ2.append(str);
        LIZ2.append(", param = ");
        LIZ2.append(linkedHashMap);
        C32444CoK.LIZ("ttlive_gift_render", X1D.LIZIZ(LIZ2));
        InterfaceC28588BJw interfaceC28588BJw = (InterfaceC28588BJw) C32260ClM.LIZ(InterfaceC28588BJw.class);
        if (interfaceC28588BJw != null) {
            interfaceC28588BJw.onEvent(str, linkedHashMap);
        }
    }

    public final void LIZIZ() {
        HashMap<String, String> LIZ;
        InterfaceC28588BJw interfaceC28588BJw = (InterfaceC28588BJw) C32260ClM.LIZ(InterfaceC28588BJw.class);
        if (interfaceC28588BJw != null && (LIZ = interfaceC28588BJw.LIZ()) != null) {
            this.LIZJ.putAll(LIZ);
        }
    }

    public final void LJI() {
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            C39202Fa2.LIZJ().submit(new ARunnableS41S0100000_5(this, 11));
        } else {
            ((Handler) LIZLLL.getValue()).post(new ARunnableS41S0100000_5(this, 12));
        }
    }

    public C32255ClH(String eventName) {
        kotlin.jvm.internal.o.LJIIIZ(eventName, "eventName");
        this.LIZ = eventName;
        this.LIZIZ = true;
        this.LIZJ = new LinkedHashMap();
    }

    public final void LJ(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        kotlin.jvm.internal.o.LJIIIIZZ(keys, "obj.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            kotlin.jvm.internal.o.LJIIIIZZ(key, "key");
            LIZLLL(jSONObject.opt(key), key);
        }
    }

    public final void LJFF(java.util.Map map) {
        if (map != null) {
            this.LIZJ.putAll(map);
        }
    }

    public final void LIZJ(long j, String key) {
        kotlin.jvm.internal.o.LJIIIZ(key, "key");
        LIZLLL(Long.valueOf(j), key);
    }

    public final void LIZLLL(Object obj, String str) {
        if (obj != null) {
            this.LIZJ.put(str, obj.toString());
        }
    }
}
