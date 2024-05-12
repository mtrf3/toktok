package X;

import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.net.GifProviderEffectListResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XDs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84484XDs implements InterfaceC84461XCv {
    public final List<ProviderEffect> LIZ = new ArrayList();
    public final List<ProviderEffect> LIZIZ = new ArrayList();
    public final int LIZJ;
    public final /* synthetic */ C84471XDf LIZLLL;
    public final /* synthetic */ GifProviderEffectListResponse LJ;
    public final /* synthetic */ List LJFF;

    @Override // X.InterfaceC84461XCv
    public final void onProgress(ProviderEffect providerEffect, int i, long j) {
    }

    public final void LIZJ() {
        if (((ArrayList) this.LIZIZ).size() > 0) {
            C84471XDf c84471XDf = this.LIZLLL;
            GifProviderEffectListResponse gifProviderEffectListResponse = this.LJ;
            C84418XBe c84418XBe = new C84418XBe(1);
            XDR LIZ = c84471XDf.LJIIL.LJJJ.LIZ(c84471XDf.LJIILIIL);
            if (LIZ instanceof XE9) {
                ((XE9) LIZ).LIZIZ(c84418XBe);
            } else if (LIZ != null) {
                LIZ.onFail(gifProviderEffectListResponse, c84418XBe);
            }
            c84471XDf.LJIIL.LJJJ.LIZJ(c84471XDf.LJIILIIL);
            return;
        }
        C84471XDf c84471XDf2 = this.LIZLLL;
        GifProviderEffectListResponse gifProviderEffectListResponse2 = this.LJ;
        List<? extends ProviderEffect> list = this.LJFF;
        XDR LIZ2 = c84471XDf2.LJIIL.LJJJ.LIZ(c84471XDf2.LJIILIIL);
        if (LIZ2 instanceof XE9) {
            ((XE9) LIZ2).LIZ(list);
        } else if (LIZ2 != null) {
            LIZ2.onSuccess(gifProviderEffectListResponse2);
        }
        c84471XDf2.LJIIL.LJJJ.LIZJ(c84471XDf2.LJIILIIL);
    }

    @Override // X.XDR
    public final void onSuccess(ProviderEffect response) {
        o.LJIIJ(response, "response");
        ((ArrayList) this.LIZ).add(response);
        if (((ArrayList) this.LIZIZ).size() + ((ArrayList) this.LIZ).size() == this.LIZJ) {
            LIZJ();
        }
    }

    @Override // X.XDR
    public final void preProcess(ProviderEffect providerEffect) {
    }

    @Override // X.XDR
    public final void onFail(ProviderEffect providerEffect, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        ((ArrayList) this.LIZIZ).add(providerEffect);
        if (((ArrayList) this.LIZIZ).size() + ((ArrayList) this.LIZ).size() == this.LIZJ) {
            LIZJ();
        }
    }

    public C84484XDs(C84471XDf c84471XDf, GifProviderEffectListResponse gifProviderEffectListResponse, List list) {
        this.LIZLLL = c84471XDf;
        this.LJ = gifProviderEffectListResponse;
        this.LJFF = list;
        this.LIZJ = list.size();
    }
}
