package X;

import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IWT implements InterfaceC46942Iba {
    @Override // X.InterfaceC46942Iba
    public final void LJL() {
    }

    @Override // X.InterfaceC46942Iba
    public final void LJJLL() {
        SystemClock.elapsedRealtime();
        C56662Kg.LIZ().LIZJ("player_precreate_duration", false);
        C56662Kg.LIZ().LIZJ("player_precreate_msg_duration", false);
        C56662Kg.LIZ().LJFF("cold_boot_start_to_precreate", false);
        C56662Kg.LIZ().LJFF("player_init_to_precreate", false);
    }

    @Override // X.InterfaceC46942Iba
    public final void LJJZ() {
        SystemClock.elapsedRealtime();
        C56662Kg.LIZ().LJFF("player_precreate_msg_duration", false);
        C56662Kg.LIZ().LIZJ("player_precreate_get_config_duration", false);
    }

    @Override // X.InterfaceC46942Iba
    public final void LJJZZIII() {
        SystemClock.elapsedRealtime();
        C56662Kg.LIZ().LJFF("player_precreate_ttvideoengine_create_duration", false);
        C56662Kg.LIZ().LJFF("feed_get_cache_to_render", false);
        if (!C56662Kg.LIZ().LJIIIIZZ("player_precreate_end_to_prerender_start")) {
            C56662Kg.LIZ().LJFF("player_precreate_end_to_prerender_start", false);
        }
        C56662Kg.LIZ().LIZJ("player_prerender_duration", false);
        C56662Kg.LIZ().LIZJ("player_prerender_dataprocesss_duration", false);
        C56662Kg.LIZ().LIZJ("player_prerender_real_duration", false);
    }

    @Override // X.InterfaceC46942Iba
    public final void LJJLJ() {
        SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC46942Iba
    public final void LJLI() {
        SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC46942Iba
    public final void LJLIL() {
        SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC46942Iba
    public final void LJJLJLI(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            FMX.LJIILJJIL("pre_start_end_time", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC46942Iba
    public final void LJJZZI(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            FMX.LJIILJJIL("pre_on_render_start_time", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC46942Iba
    public final void LJLIIIL(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            FMX.LJIILJJIL("pre_on_prepared_time", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC46942Iba
    public final void LJLIIL(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            FMX.LJIILJJIL("pre_set_surface_end_time", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC46942Iba
    public final void LJLILLLLZI(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            FMX.LJIILJJIL("pre_pause_end_time", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
