package X;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.Nsn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC60749Nsn implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C60737Nsb LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public RunnableC60749Nsn(String str, C60737Nsb c60737Nsb, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = c60737Nsb;
        this.LJLJI = z;
    }

    public final void LIZ() {
        ConcurrentHashMap<String, EnumC60750Nso> concurrentHashMap = C60748Nsm.LIZIZ;
        EnumC60750Nso enumC60750Nso = concurrentHashMap.get(this.LJLIL);
        if (enumC60750Nso != null) {
            int ordinal = enumC60750Nso.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    if (this.LJLJI) {
                        C60737Nsb c60737Nsb = this.LJLILLLLZI;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type", "appResignActive");
                        c60737Nsb.LJIIJJI(jSONObject, "viewDisappearedWithType");
                    } else {
                        C60737Nsb c60737Nsb2 = this.LJLILLLLZI;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", "covered");
                        c60737Nsb2.LJIIJJI(jSONObject2, "viewDisappearedWithType");
                    }
                    this.LJLILLLLZI.LJIIJJI(null, "viewAppeared");
                }
            } else if (C60748Nsm.LIZJ) {
                C60737Nsb c60737Nsb3 = this.LJLILLLLZI;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("type", "appResignActive");
                c60737Nsb3.LJIIJJI(jSONObject3, "viewDisappearedWithType");
            } else {
                C60737Nsb c60737Nsb4 = this.LJLILLLLZI;
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("type", "covered");
                c60737Nsb4.LJIIJJI(jSONObject4, "viewDisappearedWithType");
            }
            concurrentHashMap.remove(this.LJLIL);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
