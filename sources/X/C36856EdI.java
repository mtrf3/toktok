package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import org.json.JSONObject;

/* renamed from: X.EdI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36856EdI implements InterfaceC170656mr {
    @Override // X.InterfaceC170656mr
    public final boolean LJII() {
        LiveOuterService.LJJJLL().LJJIZ().LJJJJIZL();
        return C62046OWs.LJ("ttlive_load_sticker_list_all", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
    }

    @Override // X.InterfaceC170656mr
    public final void LIZ(Throwable th) {
        C36922EeM.LJFF(th);
    }

    @Override // X.InterfaceC170656mr
    public final void LIZJ(Exception exc) {
        C36922EeM.LIZ(exc);
    }

    @Override // X.InterfaceC170656mr
    public final void LJ(String str) {
        C36922EeM.LJ(str);
    }

    @Override // X.InterfaceC170656mr
    public final void LJIIIIZZ(String str) {
        C36922EeM.LIZLLL(2, "EffectHelper", str);
    }

    @Override // X.InterfaceC170656mr
    public final void LJIIJJI(Exception exc) {
        C36922EeM.LIZ(exc);
    }

    @Override // X.InterfaceC170656mr
    public final void LJIIZILJ(String str) {
        PEH.LIZIZ(str);
    }

    @Override // X.InterfaceC170656mr
    public final void LIZIZ(String str, java.util.Map<String, String> map) {
        C38836FMa.LIZLLL(str, map);
    }

    @Override // X.InterfaceC170656mr
    public final void LJIIIZ(String str, Throwable th) {
        PEH.LIZLLL(th, str);
    }

    @Override // X.InterfaceC170656mr
    public final void LJIILJJIL(String str, JSONObject jSONObject) {
        FMX.LJIILJJIL(str, jSONObject);
    }

    @Override // X.InterfaceC170656mr
    public final void LJIJ(String str, JSONObject jSONObject) {
        FUA.LIZJ(str, jSONObject);
    }

    @Override // X.InterfaceC170656mr
    public final void LJIIJ(int i, String str, String str2) {
        C36922EeM.LIZLLL(i, str, str2);
    }

    @Override // X.InterfaceC170656mr
    public final void LJIIL(int i, String str, JSONObject jSONObject) {
        C09900aA.LJIIJJI(str, i, jSONObject);
        C65842iC.LIZIZ(str, Integer.valueOf(i), null, jSONObject, null, 52);
    }

    @Override // X.InterfaceC170656mr
    public final void LJIILIIL(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C09900aA.LJFF(str, jSONObject, jSONObject2);
        C65842iC.LIZIZ(str, null, jSONObject, jSONObject2, null, 50);
    }

    @Override // X.InterfaceC170656mr
    public final void LJIILL(String str, String str2, float f) {
        FUA.LJFF(str, str2, f);
    }

    @Override // X.InterfaceC170656mr
    public final void LJIILLIIL(String str, String str2, JSONObject jSONObject) {
        FUA.LIZIZ(str, str2, jSONObject);
        C65842iC.LIZIZ(str2, null, null, jSONObject, str, 38);
    }

    @Override // X.InterfaceC170656mr
    public final void LIZLLL(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C09900aA.LJIIIZ(str, i, jSONObject, jSONObject2);
        C65842iC.LIZIZ(str, Integer.valueOf(i), jSONObject, jSONObject2, null, 48);
    }

    @Override // X.InterfaceC170656mr
    public final void LJFF(String str, int i, JSONObject jSONObject, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        C09900aA.LJIIJJI(str, i, jSONObject);
        if (booleanValue) {
            C65842iC.LIZIZ(str, Integer.valueOf(i), null, jSONObject, null, 52);
        }
    }

    @Override // X.InterfaceC170656mr
    public final void LJI(String str, int i, JSONObject jSONObject, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        C09900aA.LJIIJJI(str, i, jSONObject);
        if (booleanValue) {
            C65842iC.LIZIZ(str, Integer.valueOf(i), null, jSONObject, null, 20);
        }
    }
}
