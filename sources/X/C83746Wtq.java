package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Wtq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83746Wtq implements IFetchPanelInfoListener {
    public final String LIZ;
    public final IFetchPanelInfoListener LIZIZ;
    public java.util.Map<String, ? extends Object> LIZLLL;
    public final C44428Hc8 LIZJ = C44428Hc8.LIZ();
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C170686mu.LJLIL);

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
    public final void onFail(ExceptionResult exceptionResult) {
        int errorCode;
        Object obj;
        int i;
        Integer num;
        String str = "unknown error";
        if (exceptionResult == null) {
            errorCode = -2;
        } else {
            errorCode = exceptionResult.getErrorCode();
            String msg = exceptionResult.getMsg();
            if (msg != null) {
                str = msg;
            }
        }
        if (C48331Ixz.LJ() || C48331Ixz.LIZLLL()) {
            InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("errorCode", Integer.valueOf(errorCode));
            c6bk.LIZ.put("errorDesc", str);
            c6bk.LIZ.put("panel", this.LIZ);
            java.util.Map<String, ? extends Object> map = this.LIZLLL;
            if (map != null) {
                obj = map.get("is_story");
            } else {
                obj = null;
            }
            if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            c6bk.LIZ.put("is_story", Integer.valueOf(i));
            LJJIIZI.LJIIL(1, "sticker_list_error_rate", c6bk.LJ());
        }
        if (C48331Ixz.LJ()) {
            C6BK c6bk2 = new C6BK();
            c6bk2.LIZ.put("error_code", Integer.valueOf(errorCode));
            c6bk2.LIZ.put("error_msg", str);
            c6bk2.LIZ.put("panel_type", this.LIZ);
            JSONObject LJ = c6bk2.LJ();
            if (((Boolean) this.LJ.getValue()).booleanValue()) {
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
        IFetchPanelInfoListener iFetchPanelInfoListener = this.LIZIZ;
        if (iFetchPanelInfoListener != null) {
            iFetchPanelInfoListener.onFail(exceptionResult);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(PanelInfoModel panelInfoModel) {
        Object obj;
        int i;
        long LIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
        IFetchPanelInfoListener iFetchPanelInfoListener = this.LIZIZ;
        if (iFetchPanelInfoListener != null) {
            iFetchPanelInfoListener.onSuccess(panelInfoModel);
        }
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZLLL()) {
            return;
        }
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("duration", Long.valueOf(LIZIZ));
        c6bk.LIZ.put("abParam", 2);
        c6bk.LIZ.put("panel", this.LIZ);
        java.util.Map<String, ? extends Object> map = this.LIZLLL;
        Integer num = null;
        if (map != null) {
            obj = map.get("is_story");
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        c6bk.LIZ.put("is_story", Integer.valueOf(i));
        JSONObject LJ = c6bk.LJ();
        if (C48331Ixz.LJ() || C48331Ixz.LIZLLL()) {
            C60903NvH.LJIIJJI().LJJIIZI().LJIIL(0, "sticker_list_error_rate", LJ);
        }
        if (!C48331Ixz.LJ() || !((Boolean) this.LJ.getValue()).booleanValue()) {
            return;
        }
        C6BK c6bk2 = new C6BK();
        c6bk2.LIZ.put("panel_type", this.LIZ);
        JSONObject LJ2 = c6bk2.LJ();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tag", "ttlive_sdk");
            if (LJ2 != null) {
                jSONObject.put("extra", LJ2);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C60903NvH.LJIIJJI().LJJIIZI().LIZLLL("ttlive_load_sticker_list_all", 0, LJ, jSONObject);
    }

    public C83746Wtq(String str, C83751Wtv c83751Wtv) {
        this.LIZ = str;
        this.LIZIZ = c83751Wtv;
    }

    public static final C83746Wtq LIZ(String panel, IFetchPanelInfoListener listener) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(listener, "listener");
        return new C83746Wtq(panel, new C83751Wtv(panel, listener));
    }
}
