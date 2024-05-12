package X;

import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XDo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84480XDo implements XDR<EffectChannelResponse> {
    public final /* synthetic */ XCT LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ XDR LIZJ;

    @Override // X.XDR
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        EffectChannelResponse response = effectChannelResponse;
        o.LJIIJ(response, "response");
        ((XEA) this.LIZ.LJ.getValue()).LIZ.LIZ = response;
        if (this.LIZIZ) {
            XCT xct = this.LIZ;
            List<Effect> all_category_effects = response.getAll_category_effects();
            xct.getClass();
            ArrayList arrayList = new ArrayList();
            for (Effect effect : all_category_effects) {
                XCM xcm = xct.LJFF.LJJIZ;
                String LJIL = C78966Uyw.LJIL(effect);
                xcm.getClass();
                if (!XCM.LIZLLL(LJIL)) {
                    arrayList.add(effect);
                }
            }
            this.LIZ.LIZJ(new C84481XDp(this, response), null, arrayList);
            return;
        }
        XDR xdr = this.LIZJ;
        if (xdr != null) {
            xdr.onSuccess(response);
        }
    }

    @Override // X.XDR
    public final void preProcess(EffectChannelResponse effectChannelResponse) {
        XDR xdr = this.LIZJ;
        if (xdr != null) {
            xdr.preProcess(effectChannelResponse);
        }
    }

    @Override // X.XDR
    public final void onFail(EffectChannelResponse effectChannelResponse, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        XDR xdr = this.LIZJ;
        if (xdr != null) {
            xdr.onFail(effectChannelResponse, exception);
        }
    }

    public C84480XDo(XCT xct, boolean z, XDR xdr) {
        this.LIZ = xct;
        this.LIZIZ = z;
        this.LIZJ = xdr;
    }
}
