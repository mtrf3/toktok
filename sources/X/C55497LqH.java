package X;

import com.bytedance.ies.ugc.aweme.commercialize.intelligence.IntelligenceModuleImpl;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.LqH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55497LqH implements InterfaceC55510LqU {
    public final /* synthetic */ C55495LqF LIZ;

    public C55497LqH(C55495LqF c55495LqF) {
        this.LIZ = c55495LqF;
    }

    @Override // X.InterfaceC55510LqU
    public final void LIZ(String tag, String label, String creativeId, JSONObject extraJson) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(label, "label");
        o.LJIIIZ(creativeId, "creativeId");
        o.LJIIIZ(extraJson, "extraJson");
        InterfaceC55496LqG interfaceC55496LqG = this.LIZ.LIZIZ;
        if (interfaceC55496LqG != null) {
            interfaceC55496LqG.LJJIJLIJ(tag, label, extraJson);
            C55495LqF c55495LqF = this.LIZ;
            InterfaceC55496LqG interfaceC55496LqG2 = c55495LqF.LIZIZ;
            if (interfaceC55496LqG2 != null) {
                C29S c29s = c55495LqF.LIZJ;
                if (c29s != null) {
                    interfaceC55496LqG2.LJJJJ(c29s, tag, label);
                    InterfaceC55496LqG interfaceC55496LqG3 = this.LIZ.LIZIZ;
                    if (interfaceC55496LqG3 != null) {
                        interfaceC55496LqG3.LJJIJIL(label, creativeId);
                        this.LIZ.LJJIIZI(new AqS159S0100000_9(extraJson, 921), tag, label);
                        this.LIZ.getClass();
                        IntelligenceModuleImpl.LIZIZ().LIZ();
                        C55383LoR.LIZ(tag, label, extraJson);
                        return;
                    }
                    o.LJIJI("mainAdSceneCallBack");
                    throw null;
                }
                o.LJIJI("mActivity");
                throw null;
            }
            o.LJIJI("mainAdSceneCallBack");
            throw null;
        }
        o.LJIJI("mainAdSceneCallBack");
        throw null;
    }
}
