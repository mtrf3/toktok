package com.lingo.caption;

import X.ACL;
import X.ACZ;
import X.AD1;
import X.C25836ACa;
import X.C47135Ieh;
import X.C61145NzB;
import X.C61147NzD;
import X.C61148NzE;
import X.C61150NzG;
import X.C72818Shy;
import X.C76052yf;
import X.C78529Urt;
import X.C78540Us4;
import X.InterfaceC61155NzL;
import X.Y7M;
import com.lingo.caption.api.LingoCaptionInnerApi;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class LingoCaptionInnerImpl implements LingoCaptionInnerApi {
    public final ConcurrentHashMap<String, C61148NzE> LIZ = new ConcurrentHashMap<>();

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final InterfaceC61155NzL LIZ(String str) {
        C61148NzE c61148NzE = (C61148NzE) C78540Us4.LJJIFFI(str, this.LIZ);
        if (c61148NzE != null) {
            return c61148NzE.LJLIL;
        }
        return null;
    }

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final C25836ACa LIZJ(String id) {
        o.LJIIIZ(id, "id");
        C61148NzE c61148NzE = (C61148NzE) C78540Us4.LJJIFFI(id, this.LIZ);
        if (c61148NzE != null) {
            return c61148NzE.LJLJJL;
        }
        return null;
    }

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final C61150NzG LIZLLL(String id) {
        o.LJIIIZ(id, "id");
        C61148NzE c61148NzE = (C61148NzE) C78540Us4.LJJIFFI(id, this.LIZ);
        if (c61148NzE != null) {
            return c61148NzE.LJLILLLLZI;
        }
        return null;
    }

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final AD1 LJ(String id) {
        o.LJIIIZ(id, "id");
        C61148NzE c61148NzE = (C61148NzE) C78540Us4.LJJIFFI(id, this.LIZ);
        if (c61148NzE != null) {
            return c61148NzE.LJLJJLL;
        }
        return null;
    }

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final void LJI(String id) {
        o.LJIIIZ(id, "id");
        this.LIZ.remove(id);
    }

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final Y7M LJII(String id) {
        o.LJIIIZ(id, "id");
        C61148NzE c61148NzE = (C61148NzE) C78540Us4.LJJIFFI(id, this.LIZ);
        if (c61148NzE != null) {
            return c61148NzE.LJLJI;
        }
        return null;
    }

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final ACZ LJIIIIZZ(String id) {
        o.LJIIIZ(id, "id");
        C61148NzE c61148NzE = (C61148NzE) C78540Us4.LJJIFFI(id, this.LIZ);
        if (c61148NzE != null) {
            return c61148NzE.LJLJJI;
        }
        return null;
    }

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final void LIZIZ(String id, String str, JSONObject jSONObject) {
        o.LJIIIZ(id, "id");
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject LJ = C47135Ieh.LJ("id", id, "eventName", str);
        LJ.put("params", jSONObject);
        C72818Shy.LIZ(new C76052yf(currentTimeMillis, new C78529Urt(LJ), "onCaptionLog"));
    }

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final void LJFF(C61145NzB c61145NzB, C61150NzG c61150NzG, ACL acl, ACZ acz, C25836ACa initData, AD1 debugInfo) {
        o.LJIIIZ(initData, "initData");
        o.LJIIIZ(debugInfo, "debugInfo");
        this.LIZ.put(c61150NzG.LJLIL, new C61148NzE(c61145NzB, c61150NzG, acl, acz, initData, debugInfo));
        acl.LIZIZ(new C61147NzD(this, c61150NzG));
    }
}
