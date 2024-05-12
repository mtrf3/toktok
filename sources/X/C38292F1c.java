package X;

import Y.ARunnableS10S0400000_6;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.F1c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38292F1c extends C38280F0q implements InterfaceC38012Evw {
    public final C38049EwX LJLILLLLZI;
    public String LJLJI;

    @QD3
    public void onEvent(C38293F1d c38293F1d) {
        String str = c38293F1d.LJLIL;
        JSONObject jSONObject = c38293F1d.LJLILLLLZI;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C38049EwX c38049EwX = this.LJLILLLLZI;
        if (c38049EwX != null) {
            c38049EwX.LJIIIIZZ("H5_nativeEvent", jSONObject2);
        }
        EventBus.LIZJ().LJIJ(this);
    }

    public C38292F1c(WeakReference<Context> weakReference, C38049EwX c38049EwX) {
        super(weakReference);
        this.LJLILLLLZI = c38049EwX;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        JSONObject jSONObject2;
        WeakReference<Context> weakReference;
        String string = JSONObjectProtectorUtils.getString(c38048EwW.LIZLLL, "type");
        c38048EwW.LIZJ = "open";
        c38048EwW.LIZLLL.put("type", string);
        this.LJLJI = c38048EwW.LIZIZ;
        if (!c38048EwW.LIZLLL.has("args") || (jSONObject2 = JSONObjectProtectorUtils.getJSONObject(c38048EwW.LIZLLL, "args")) == null) {
            jSONObject2 = new JSONObject();
            c38048EwW.LIZLLL.put("args", jSONObject2);
        }
        if ("item".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("item_id"));
        } else if ("profile".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("user_id"));
        } else if ("challenge".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("challenge_id"));
        } else if ("music".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("music_id"));
        } else if ("collection".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("collection_id"));
        } else {
            if ("live".equals(string)) {
                c38048EwW.LJIIJ = false;
                C38816FLg.LJ(new ARunnableS10S0400000_6(jSONObject2, c38048EwW, jSONObject, this, 8));
                return;
            }
            if ("login".equals(string)) {
                String optString = jSONObject2.optString("enter_from");
                if (HG3.LJIILL().isLogin() || (weakReference = this.LJLIL) == null) {
                    return;
                }
                Activity LIZ = C38280F0q.LIZ(weakReference.get());
                EventBus.LIZJ().LJIILJJIL(this);
                try {
                    J9P.LIZIZ(LIZ, optString, "", null, null);
                    return;
                } catch (Throwable unused) {
                    EventBus.LIZJ().LJIJ(this);
                    return;
                }
            }
            if ("webview".equals(string)) {
                try {
                    if (TextUtils.equals("1", UriProtector.getQueryParameter(UriProtector.parse(JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(c38048EwW.LIZLLL, "args"), "url")), "live_half_charge_dialog"))) {
                        C38049EwX c38049EwX = this.LJLILLLLZI;
                        if (c38049EwX != null) {
                            c38049EwX.LIZLLL(this.LJLJI, jSONObject);
                            return;
                        }
                        return;
                    }
                } catch (Exception unused2) {
                }
            }
        }
        EventBus.LIZJ().LJIILJJIL(this);
        jSONObject2.put("group", CardStruct.IStatusCode.DEFAULT);
        LIZJ(c38048EwW.LIZLLL);
        jSONObject.put("code", 1);
    }
}
