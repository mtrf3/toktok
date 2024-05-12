package X;

import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NxQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61036NxQ extends AbstractC61039NxT implements NZN {
    public final C5H3 LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;

    @Override // X.F1B
    public final void onViewAttachedToWindow() {
        this.LJIIJ = System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    @Override // X.F1B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewDetachedFromWindow(android.view.View r13) {
        /*
            r12 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r6 = r12
            r6.LJIIJJI = r0
            X.NqR r1 = r6.LJJIJIIJIL()
            r0 = 0
            if (r1 == 0) goto La6
            boolean r1 = r1.LJ()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r2.booleanValue()
            if (r1 == 0) goto La6
            r2.booleanValue()
            long r2 = java.lang.System.currentTimeMillis()
            X.Nxc r0 = X.C61119Nyl.LIZ(r13)
            int r1 = r0.LIZ
            r0 = 1
            if (r1 != r0) goto La4
        L2c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Long r5 = X.C44847Hit.LIZ(r2)
        L34:
            java.lang.String r7 = "hybrid_app_monitor_rn_blank_screen"
            X.NxV r8 = r6.LJJIJIIJI()
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            if (r0 == 0) goto L4e
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "isBlank"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.put(r1, r0)
        L4e:
            java.lang.String r1 = "pageFinish"
            java.lang.String r0 = "false"
            r9.put(r1, r0)
            long r1 = r6.LJIIIZ
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L98
            java.lang.String r1 = "load_url"
        L5f:
            java.lang.String r0 = "trigger"
            r9.put(r0, r1)
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            if (r5 == 0) goto L74
            long r0 = r5.longValue()
            java.lang.String r2 = "detectDuration"
            r10.put(r2, r0)
        L74:
            long r0 = r6.LJIIJ
            long r2 = r6.LJIIIZ
            long r0 = r0 - r2
            java.lang.String r2 = "loadUrlToAttachedWindow"
            r10.put(r2, r0)
            long r0 = r6.LJIIJJI
            long r2 = r6.LJIIJ
            long r0 = r0 - r2
            java.lang.String r2 = "attachedWindowToDetachWindow"
            r10.put(r2, r0)
            long r0 = r6.LJIIJJI
            long r2 = r6.LJIIIZ
            long r0 = r0 - r2
            java.lang.String r2 = "loadUrlToDetachWindow"
            r10.put(r2, r0)
            r11 = 16
            X.AbstractC61039NxT.LJJIJL(r6, r7, r8, r9, r10, r11)
            return
        L98:
            long r1 = r6.LJIIJ
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto La1
            java.lang.String r1 = "attach_window"
            goto L5f
        La1:
            java.lang.String r1 = "none"
            goto L5f
        La4:
            r0 = 0
            goto L2c
        La6:
            r5 = r0
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61036NxQ.onViewDetachedFromWindow(android.view.View):void");
    }

    @Override // X.AbstractC59640Nau, X.InterfaceC59877Nej
    public final void LJJ(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = true;
        this.LJIIIZ = System.currentTimeMillis();
        AbstractC61039NxT.LJJIJL(this, "hybrid_app_monitor_load_url_event", LJJI(), C65232Piu.LIZJ("trigger", "load_url"), null, 24);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61036NxQ(android.net.Uri uri, C59869Neb providerFactory, java.util.Map<String, String> customCategories) {
        super(uri, providerFactory, customCategories);
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(providerFactory, "providerFactory");
        o.LJIIIZ(customCategories, "customCategories");
        this.LJIIIIZZ = C221108m2.LIZ(EnumC221088m0.NONE, new AqS160S0100000_10(this, 380));
    }

    @Override // X.F1B
    public final void LJIILJJIL(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C61040NxU LJJI = LJJI();
        JSONObject LIZJ = C65232Piu.LIZJ("trigger", str2);
        if (jSONObject != null) {
            C78983UzD.LJJLIIIJLLLLLLLZ(LIZJ, jSONObject);
        }
        LJJIJIL(LJJI, str, LIZJ, jSONObject2, jSONObject3);
    }

    @Override // X.AbstractC61039NxT
    public final void LJJIJIL(AbstractC61044NxY identifier, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        o.LJIIIZ(identifier, "identifier");
        try {
            LJJIL(identifier, str, jSONObject, jSONObject2, jSONObject3);
        } catch (Exception e) {
            LJJIJLIJ(identifier.getUrl(), "rn", e);
        }
    }

    public final void LJJIL(AbstractC61044NxY abstractC61044NxY, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str2;
        Object value = this.LJIIIIZZ.getValue();
        o.LJIIIIZZ(value, "<get-monitorHelper>(...)");
        InterfaceC61047Nxb interfaceC61047Nxb = (InterfaceC61047Nxb) value;
        String url = abstractC61044NxY.getUrl();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("type", "rn");
        if (this.LJ.LIZ(InterfaceC61046Nxa.class) == null) {
            str2 = "origin";
        } else {
            str2 = "fallback";
        }
        jSONObject.put("is_fallback", str2);
        C78983UzD.LJJLIIIJLLLLLLLZ(jSONObject, abstractC61044NxY.getFormatData());
        InterfaceC61046Nxa interfaceC61046Nxa = (InterfaceC61046Nxa) this.LJ.LIZ(InterfaceC61046Nxa.class);
        if (interfaceC61046Nxa != null) {
            C78983UzD.LJJLIIIJLLLLLLLZ(jSONObject, new C61040NxU(interfaceC61046Nxa.LJJI().LJLILLLLZI, "original_", null, 4).getFormatData());
        }
        String jSONObject4 = jSONObject.toString();
        JSONObject jSONObject5 = new JSONObject();
        if (jSONObject2 != null) {
            C78983UzD.LJJLIIIJLLLLLLLZ(jSONObject5, jSONObject2);
        }
        String jSONObject6 = jSONObject5.toString();
        JSONObject jSONObject7 = new JSONObject();
        if (jSONObject3 != null) {
            C78983UzD.LJJLIIIJLLLLLLLZ(jSONObject7, jSONObject3);
        }
        interfaceC61047Nxb.LJIIJJI(null, url, str, jSONObject4, jSONObject6, jSONObject7.toString());
        Object value2 = this.LJIIIIZZ.getValue();
        o.LJIIIIZZ(value2, "<get-monitorHelper>(...)");
        ((InterfaceC60279NlD) value2).LJFF();
    }
}
