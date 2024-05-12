package X;

import com.lingo.caption.LingoCaptionInnerImpl;
import com.lingo.caption.api.LingoCaptionInnerApi;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NzC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61146NzC implements LingoCaptionInnerApi {
    public static final C61146NzC LIZIZ = new C61146NzC();
    public final /* synthetic */ LingoCaptionInnerApi LIZ;

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final InterfaceC61155NzL LIZ(String str) {
        return this.LIZ.LIZ(str);
    }

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final void LIZIZ(String id, String str, JSONObject jSONObject) {
        o.LJIIIZ(id, "id");
        this.LIZ.LIZIZ(id, str, jSONObject);
    }

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final C25836ACa LIZJ(String id) {
        o.LJIIIZ(id, "id");
        return this.LIZ.LIZJ(id);
    }

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final C61150NzG LIZLLL(String id) {
        o.LJIIIZ(id, "id");
        return this.LIZ.LIZLLL(id);
    }

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final AD1 LJ(String id) {
        o.LJIIIZ(id, "id");
        return this.LIZ.LJ(id);
    }

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final void LJFF(C61145NzB c61145NzB, C61150NzG c61150NzG, ACL acl, ACZ acz, C25836ACa initData, AD1 debugInfo) {
        o.LJIIIZ(initData, "initData");
        o.LJIIIZ(debugInfo, "debugInfo");
        this.LIZ.LJFF(c61145NzB, c61150NzG, acl, acz, initData, debugInfo);
    }

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final void LJI(String id) {
        o.LJIIIZ(id, "id");
        this.LIZ.LJI(id);
    }

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final Y7M LJII(String id) {
        o.LJIIIZ(id, "id");
        return this.LIZ.LJII(id);
    }

    @Override // com.lingo.caption.api.LingoCaptionInnerApi
    public final ACZ LJIIIIZZ(String id) {
        o.LJIIIZ(id, "id");
        return this.LIZ.LJIIIIZZ(id);
    }

    public C61146NzC() {
        LingoCaptionInnerApi lingoCaptionInnerApi;
        Object LIZ = C58096Mr6.LIZ(LingoCaptionInnerApi.class, false);
        if (LIZ != null) {
            lingoCaptionInnerApi = (LingoCaptionInnerApi) LIZ;
        } else {
            if (C58096Mr6.LJJJIL == null) {
                synchronized (LingoCaptionInnerApi.class) {
                    if (C58096Mr6.LJJJIL == null) {
                        C58096Mr6.LJJJIL = new LingoCaptionInnerImpl();
                    }
                }
            }
            lingoCaptionInnerApi = C58096Mr6.LJJJIL;
        }
        this.LIZ = lingoCaptionInnerApi;
    }
}
