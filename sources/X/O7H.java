package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O7H extends C1TB {
    public final /* synthetic */ O7E LJLILLLLZI;
    public final /* synthetic */ O7W LJLJI;

    @Override // X.InterfaceC48019Isx
    public final void LIZ(boolean z) {
        Object obj;
        int i = 2;
        this.LJLJI.LJII(2);
        O7W o7w = this.LJLJI;
        o7w.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("show_expected", o7w.LLIFFJFJJ.LJLJLLL);
            jSONObject.put("show_type", "not_real_time");
            int i2 = C61359O6h.LJJIJIIJI;
            if (i2 != -1) {
                if (i2 == 1) {
                    i = 1;
                }
                jSONObject.put("awemelaunch", i);
            }
            jSONObject.put("load_type", o7w.LLIFFJFJJ.LLII);
            if (O77.LJIJJ(o7w.LLIFFJFJJ)) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_topview", obj);
            jSONObject.put("ad_sequence", O76.LJI().LJII());
            jSONObject2.putOpt("ad_extra_data", jSONObject);
            jSONObject2.putOpt("is_ad_event", "1");
            if (!C78983UzD.LJJJI(o7w.LLIFFJFJJ.LJLZ)) {
                jSONObject2.put("log_extra", o7w.LLIFFJFJJ.LJLZ);
            }
            jSONObject2.put("ad_fetch_time", o7w.LLIFFJFJJ.LJLILLLLZI);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            jSONObject2 = null;
        }
        O79.LIZIZ().LIZLLL("splash_ad", "play", jSONObject2, o7w.LLIFFJFJJ.LJLL);
        if (o7w.LLIFFJFJJ.LLI != null) {
            C61404O8a LJFF = C61404O8a.LJFF();
            O7E o7e = o7w.LLIFFJFJJ;
            LJFF.LIZLLL(null, o7e.LJLL, o7e.LLI.LIZ, o7e.LJLZ, true, -1L, null);
        }
        this.LJLJI.LLFZ = true;
        long currentTimeMillis = System.currentTimeMillis();
        O7W o7w2 = this.LJLJI;
        long j = currentTimeMillis - o7w2.LLILLIZIL;
        O7E o7e2 = this.LJLILLLLZI;
        o7w2.LLIL.LIZLLL();
        int LJIJJLI = (int) O5Y.LJIJJLI(O77.LJIIZILJ(this.LJLILLLLZI.LLI));
        O7G o7g = o7e2.LLI;
        HashMap<String, Object> hashMap = new HashMap<>();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(o7g.LJFF);
        LIZ.append("x");
        LIZ.append(o7g.LJ);
        hashMap.put("video_density", X1D.LIZIZ(LIZ));
        hashMap.put("display_density", o7e2.LLJJIJI);
        hashMap.put("is_tt_player", "1");
        hashMap.put("is_encrypt", CardStruct.IStatusCode.DEFAULT);
        hashMap.put("is_nssr", CardStruct.IStatusCode.DEFAULT);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJIJJLI);
        LIZ2.append("");
        hashMap.put("cache_size", X1D.LIZIZ(LIZ2));
        hashMap.put("is_h265", CardStruct.IStatusCode.DEFAULT);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(j);
        LIZ3.append("");
        hashMap.put("render_duration", X1D.LIZIZ(LIZ3));
        O79.LIZIZ().LJI(o7e2, 0L, "splash_video_quality", null, hashMap);
        InterfaceC61396O7s LJ = C61359O6h.LJ();
        long duration = this.LJLJI.LLIL.getDuration();
        this.LJLJI.LLIL.getVolume();
        this.LJLJI.LLIL.LJ();
        LJ.LJIIIIZZ(duration);
    }

    @Override // X.InterfaceC48019Isx
    public final void LJI(int i) {
        this.LJLJI.LLILLIZIL = System.currentTimeMillis();
        O7E o7e = this.LJLILLLLZI;
        if (o7e.LJZI == 1) {
            this.LJLJI.LJIIIZ(o7e.LJIIIIZZ());
        } else {
            this.LJLJI.LJIIIZ(i);
        }
    }

    public O7H(O7W o7w, O7E o7e) {
        this.LJLJI = o7w;
        this.LJLILLLLZI = o7e;
    }

    @Override // X.InterfaceC48019Isx
    public final void LIZIZ(int i, int i2) {
        String str = "1";
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            long j = i;
            jSONObject.put("duration", Long.toString(j));
            jSONObject.put("percent", O8V.LIZ(j, i2));
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("category", "umeng");
            jSONObject.put("ad_fetch_time", this.LJLILLLLZI.LJLILLLLZI);
            jSONObject.put("break_reason", this.LJLJI.LLFFF);
            if (!C78983UzD.LJJJI(this.LJLILLLLZI.LJLZ)) {
                jSONObject.put("log_extra", this.LJLILLLLZI.LJLZ);
            }
            jSONObject2.put("break_reason", this.LJLJI.LLFFF);
            jSONObject2.put("load_type", this.LJLILLLLZI.LLII);
            if (!O77.LJIJJ(this.LJLILLLLZI)) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject2.put("is_topview", str);
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            jSONObject = null;
        }
        O79.LIZIZ().LIZLLL("splash_ad", "play_break", jSONObject, this.LJLILLLLZI.LJLL);
    }

    @Override // X.InterfaceC48019Isx
    public final void LIZJ(int i, boolean z) {
        Object obj;
        this.LJLJI.LLIL.LIZLLL();
        int LIZJ = this.LJLJI.LLIL.LIZJ();
        if (C61359O6h.LJII().LJIIJ) {
            this.LJLJI.LJIIJ(true);
            return;
        }
        C1TB.LJII(i, this.LJLILLLLZI);
        O7E o7e = this.LJLILLLLZI;
        if (o7e.LLI != null) {
            C61404O8a.LJFF().LIZJ(null, o7e.LJLL, o7e.LLI.LIZIZ, o7e.LJLZ, true, -1L, null);
        }
        O7E o7e2 = this.LJLILLLLZI;
        int LJIJJLI = (int) O5Y.LJIJJLI(O77.LJIIZILJ(o7e2.LLI));
        boolean z2 = this.LJLJI.LLFZ;
        long j = i;
        O7G o7g = o7e2.LLI;
        HashMap<String, Object> hashMap = new HashMap<>();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(o7g.LJFF);
        LIZ.append("x");
        LIZ.append(o7g.LJ);
        hashMap.put("video_density", X1D.LIZIZ(LIZ));
        hashMap.put("display_density", o7e2.LLJJIJI);
        String str = "1";
        hashMap.put("is_tt_player", "1");
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_encrypt", obj);
        hashMap.put("is_nssr", CardStruct.IStatusCode.DEFAULT);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJIJJLI);
        LIZ2.append("");
        hashMap.put("cache_size", X1D.LIZIZ(LIZ2));
        if (!z2) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("play_success", str);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(j);
        LIZ3.append("");
        hashMap.put("duration", X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(100);
        LIZ4.append("");
        hashMap.put("percent", X1D.LIZIZ(LIZ4));
        hashMap.put("is_h265", CardStruct.IStatusCode.DEFAULT);
        hashMap.put("sr_error_code", Integer.valueOf(LIZJ));
        O79.LIZIZ().LJI(o7e2, 0L, "splash_video_end", null, hashMap);
        ((O7F) this.LJLJI.LLII).LJFF(this.LJLILLLLZI);
        ((O7F) this.LJLJI.LLII).LJ();
    }

    @Override // X.InterfaceC48019Isx
    public final void LIZLLL(int i, String str, boolean z) {
        O7E o7e = this.LJLILLLLZI;
        O7W o7w = this.LJLJI;
        o7w.getClass();
        o7w.LLIL.LIZLLL();
        int LJIJJLI = (int) O5Y.LJIJJLI(O77.LJIIZILJ(this.LJLILLLLZI.LLI));
        boolean z2 = this.LJLJI.LLFZ;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJI.LLI;
        O7G o7g = o7e.LLI;
        HashMap<String, Object> hashMap = new HashMap<>();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(o7g.LJFF);
        LIZ.append("x");
        LIZ.append(o7g.LJ);
        hashMap.put("video_density", X1D.LIZIZ(LIZ));
        hashMap.put("display_density", o7e.LLJJIJI);
        String str2 = "1";
        hashMap.put("is_tt_player", "1");
        hashMap.put("is_encrypt", CardStruct.IStatusCode.DEFAULT);
        hashMap.put("is_nssr", CardStruct.IStatusCode.DEFAULT);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJIJJLI);
        LIZ2.append("");
        hashMap.put("cache_size", X1D.LIZIZ(LIZ2));
        if (!z2) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("play_success", str2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(currentTimeMillis);
        LIZ3.append("");
        hashMap.put("duration", X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(100);
        LIZ4.append("");
        hashMap.put("percent", X1D.LIZIZ(LIZ4));
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(i);
        LIZ5.append("");
        hashMap.put("errorCode", X1D.LIZIZ(LIZ5));
        hashMap.put("errorDesc", str);
        hashMap.put("is_h265", CardStruct.IStatusCode.DEFAULT);
        O79.LIZIZ().LJI(o7e, 0L, "splash_video_failed", new HashMap<>(), hashMap);
        ((O7F) this.LJLJI.LLII).LIZJ();
    }

    public final void LJIIIIZZ(int i, int i2, String str) {
        String str2 = "1";
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            long j = i2;
            jSONObject.put("duration", Long.toString(j));
            jSONObject.put("percent", O8V.LIZ(i, j));
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("ad_fetch_time", this.LJLILLLLZI.LJLILLLLZI);
            jSONObject2.put("load_type", this.LJLILLLLZI.LLII);
            if (!O77.LJIJJ(this.LJLILLLLZI)) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject2.put("is_topview", str2);
            if (!TextUtils.isEmpty(this.LJLILLLLZI.LJLZ)) {
                jSONObject.put("log_extra", this.LJLILLLLZI.LJLZ);
            }
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (Throwable unused) {
        }
        O79.LIZIZ().LIZLLL("splash_ad", str, jSONObject, this.LJLILLLLZI.LJLL);
    }
}
