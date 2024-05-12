package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Wtp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83745Wtp implements IFetchEffectChannelListener {
    public final IFetchEffectChannelListener LIZ;
    public final C44428Hc8 LIZIZ = C44428Hc8.LIZ();
    public final String LIZJ;
    public java.util.Map<String, Object> LIZLLL;
    public int LJ;

    public final void LIZ() {
        if (this.LJ == 0) {
            if (C60903NvH.LJIIJJI().LJJIIZI().LJII()) {
                this.LJ = 1;
            } else {
                this.LJ = -1;
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        int errorCode;
        String msg;
        int i;
        if (exceptionResult == null) {
            errorCode = -2;
            msg = "unknow error";
        } else {
            errorCode = exceptionResult.getErrorCode();
            msg = exceptionResult.getMsg();
        }
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZLLL()) {
            IFetchEffectChannelListener iFetchEffectChannelListener = this.LIZ;
            if (iFetchEffectChannelListener != null) {
                iFetchEffectChannelListener.onFail(exceptionResult);
                return;
            }
            return;
        }
        java.util.Map<String, Object> map = this.LIZLLL;
        if (map != null && map.containsKey("is_story")) {
            i = ((Integer) this.LIZLLL.get("is_story")).intValue();
        } else {
            i = 0;
        }
        if (C48331Ixz.LJ() || C48331Ixz.LIZLLL()) {
            InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("errorCode", Integer.valueOf(errorCode));
            c6bk.LIZ.put("errorDesc", msg);
            c6bk.LIZ.put("panel", this.LIZJ);
            c6bk.LIZ.put("is_story", Integer.valueOf(i));
            LJJIIZI.LJIIL(1, "sticker_list_error_rate", c6bk.LJ());
        }
        if (C48331Ixz.LJ()) {
            C6BK c6bk2 = new C6BK();
            c6bk2.LIZ.put("error_code", Integer.valueOf(errorCode));
            c6bk2.LIZ.put("error_msg", msg);
            c6bk2.LIZ.put("panel_type", this.LIZJ);
            JSONObject LJ = c6bk2.LJ();
            LIZ();
            if (this.LJ >= 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("tag", "ttlive_sdk");
                    if (LJ != null) {
                        jSONObject.put("extra", LJ);
                    }
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                C60903NvH.LJIIJJI().LJJIIZI().LIZLLL("ttlive_load_sticker_list_all", 1, null, jSONObject);
            }
            C60903NvH.LJIIJJI().LJJIIZI().LJIIL(1, "ttlive_load_sticker_list_error", LJ);
        }
        IFetchEffectChannelListener iFetchEffectChannelListener2 = this.LIZ;
        if (iFetchEffectChannelListener2 != null) {
            iFetchEffectChannelListener2.onFail(exceptionResult);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        int i;
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZLLL()) {
            IFetchEffectChannelListener iFetchEffectChannelListener = this.LIZ;
            if (iFetchEffectChannelListener != null) {
                iFetchEffectChannelListener.onSuccess(effectChannelResponse);
                return;
            }
            return;
        }
        long LIZIZ = this.LIZIZ.LIZIZ(TimeUnit.MILLISECONDS);
        java.util.Map<String, Object> map = this.LIZLLL;
        if (map != null && map.containsKey("is_story")) {
            i = ((Integer) this.LIZLLL.get("is_story")).intValue();
        } else {
            i = 0;
        }
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("duration", Long.valueOf(LIZIZ));
        c6bk.LIZ.put("is_story", Integer.valueOf(i));
        c6bk.LIZ.put("panel", this.LIZJ);
        JSONObject LJ = c6bk.LJ();
        java.util.Map<String, Object> map2 = this.LIZLLL;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                try {
                    LJ.put(str, this.LIZLLL.get(str).toString());
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        if (C48331Ixz.LJ() || C48331Ixz.LIZLLL()) {
            C60903NvH.LJIIJJI().LJJIIZI().LJIIL(0, "sticker_list_error_rate", LJ);
        }
        if (C48331Ixz.LJ()) {
            LIZ();
            if (this.LJ >= 0) {
                C6BK c6bk2 = new C6BK();
                c6bk2.LIZ.put("panel_type", this.LIZJ);
                JSONObject LJ2 = c6bk2.LJ();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("tag", "ttlive_sdk");
                    if (LJ2 != null) {
                        jSONObject.put("extra", LJ2);
                    }
                } catch (JSONException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
                C60903NvH.LJIIJJI().LJJIIZI().LIZLLL("ttlive_load_sticker_list_all", 0, LJ, jSONObject);
            }
        }
        IFetchEffectChannelListener iFetchEffectChannelListener2 = this.LIZ;
        if (iFetchEffectChannelListener2 == null) {
            return;
        }
        iFetchEffectChannelListener2.onSuccess(effectChannelResponse);
    }

    public C83745Wtp(String str, C83753Wtx c83753Wtx) {
        this.LIZ = c83753Wtx;
        this.LIZJ = str;
    }
}
