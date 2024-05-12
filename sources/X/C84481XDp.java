package X;

import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XDp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84481XDp implements InterfaceC84446XCg<List<? extends Effect>> {
    public final C0FT LIZ = new C0FT((Object) null);
    public final /* synthetic */ C84480XDo LIZIZ;
    public final /* synthetic */ EffectChannelResponse LIZJ;

    @Override // X.InterfaceC84446XCg
    public final void onFinally() {
        InterfaceC84458XCs interfaceC84458XCs;
        String str = (String) this.LIZ.LIZ;
        if (str != null && (interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LIZIZ.LIZ.LJFF.LJJIFFI)) != null) {
            interfaceC84458XCs.save(XDN.LJIIIIZZ(this.LIZIZ.LIZ.LJFF.LJFF, this.LIZJ.getPanel()), str);
        }
    }

    @Override // X.InterfaceC84446XCg
    public final void onStart() {
        String str;
        String LJIIIIZZ = XDN.LJIIIIZZ(this.LIZIZ.LIZ.LJFF.LJFF, this.LIZJ.getPanel());
        InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LIZIZ.LIZ.LJFF.LJJIFFI);
        if (interfaceC84458XCs != null) {
            str = interfaceC84458XCs.queryToValue(LJIIIIZZ);
        } else {
            str = null;
        }
        C78685UuP.LJJLJ(this.LIZ, str);
        InterfaceC84458XCs interfaceC84458XCs2 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LIZIZ.LIZ.LJFF.LJJIFFI);
        if (interfaceC84458XCs2 != null) {
            interfaceC84458XCs2.remove(LJIIIIZZ);
        }
    }

    @Override // X.XDR
    public final void onSuccess(Object obj) {
        List<? extends Effect> responseEffect = (List) obj;
        o.LJIIJ(responseEffect, "responseEffect");
        EffectChannelResponse effectChannelResponse = this.LIZJ;
        effectChannelResponse.setAll_category_effects(responseEffect);
        for (EffectCategoryResponse effectCategoryResponse : effectChannelResponse.getCategory_responses()) {
            ArrayList arrayList = new ArrayList();
            List<Effect> total_effects = effectCategoryResponse.getTotal_effects();
            if (total_effects != null) {
                for (Effect effect : total_effects) {
                    if (responseEffect.contains(effect)) {
                        arrayList.add(effect);
                    }
                }
            }
            effectCategoryResponse.setTotal_effects(arrayList);
        }
        XDR xdr = this.LIZIZ.LIZJ;
        if (xdr != null) {
            xdr.onSuccess(effectChannelResponse);
        }
    }

    @Override // X.XDR
    public final void preProcess(Object obj) {
    }

    public C84481XDp(C84480XDo c84480XDo, EffectChannelResponse effectChannelResponse) {
        this.LIZIZ = c84480XDo;
        this.LIZJ = effectChannelResponse;
    }

    @Override // X.XDR
    public final void onFail(Object obj, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        XDR xdr = this.LIZIZ.LIZJ;
        if (xdr != null) {
            xdr.onFail(null, exception);
        }
    }
}
