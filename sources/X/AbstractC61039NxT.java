package X;

import defpackage.a1;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NxT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC61039NxT extends AbstractC59640Nau implements InterfaceC61046Nxa {
    public final android.net.Uri LIZLLL;
    public final C59869Neb LJ;
    public final java.util.Map<String, String> LJFF;
    public final C5H3 LJI;
    public final C5H3 LJII;

    @Override // X.InterfaceC61046Nxa
    public final void LJIIZILJ() {
    }

    @Override // X.InterfaceC61046Nxa
    public final void LJIJJLI() {
    }

    public abstract void LJJIJIL(AbstractC61044NxY abstractC61044NxY, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    @Override // X.InterfaceC61046Nxa
    public final C61040NxU LJJI() {
        return (C61040NxU) this.LJI.getValue();
    }

    public final C61041NxV LJJIJIIJI() {
        return (C61041NxV) this.LJII.getValue();
    }

    public final InterfaceC60603NqR LJJIJIIJIL() {
        return (InterfaceC60603NqR) this.LJ.LIZ(InterfaceC60603NqR.class);
    }

    public AbstractC61039NxT(android.net.Uri uri, C59869Neb providerFactory, java.util.Map<String, String> customCategories) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(providerFactory, "providerFactory");
        o.LJIIIZ(customCategories, "customCategories");
        this.LIZLLL = uri;
        this.LJ = providerFactory;
        this.LJFF = customCategories;
        EnumC221088m0 enumC221088m0 = EnumC221088m0.SYNCHRONIZED;
        this.LJI = C221108m2.LIZ(enumC221088m0, new AqS160S0100000_10(this, 375));
        this.LJII = C221108m2.LIZ(enumC221088m0, new AqS160S0100000_10(this, 374));
    }

    public final void LJJIJLIJ(String url, String str, Exception exc) {
        o.LJIIIZ(url, "url");
        C16880lQ.LLLLIIL(exc);
        InterfaceC58236MtM interfaceC58236MtM = (InterfaceC58236MtM) this.LJ.LIZ(InterfaceC58236MtM.class);
        if (interfaceC58236MtM != null) {
            interfaceC58236MtM.LIZLLL(exc, a1.LJ("hybrid ", str, " report failed"), JF1.LIZIZ("url", url, "type", str));
        }
    }

    public static /* synthetic */ void LJJIJL(AbstractC61039NxT abstractC61039NxT, String str, AbstractC61044NxY abstractC61044NxY, JSONObject jSONObject, JSONObject jSONObject2, int i) {
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObject4 = jSONObject2;
        if ((i & 4) != 0) {
            jSONObject3 = null;
        }
        if ((i & 8) != 0) {
            jSONObject4 = null;
        }
        abstractC61039NxT.LJJIJIL(abstractC61044NxY, str, jSONObject3, jSONObject4, null);
    }
}
