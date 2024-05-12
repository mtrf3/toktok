package X;

import com.ss.ttm.player.SubInfo;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ily, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47586Ily extends SubInfo {
    public final /* synthetic */ TTVideoEngineImpl LIZJ;

    public C47586Ily(TTVideoEngineImpl tTVideoEngineImpl) {
        this.LIZJ = tTVideoEngineImpl;
    }

    @Override // com.ss.ttm.player.SubInfo
    public final void onSubLoadFinished(int i) {
        int i2;
        C47750Ioc c47750Ioc;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZJ;
        if (tTVideoEngineImpl.LLZLL != null && tTVideoEngineImpl.t5 > 0) {
            TTVideoEngineLog.d("TTVideoEngine", "subtitle call back: finished old did call back");
            if (i >= 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.LIZJ.LLZLL.LJIIL(i2);
            if (i2 == 1 && (c47750Ioc = this.LIZJ.e) != null) {
                c47750Ioc.LJJJJZI(1, "sub_thread_enable");
                return;
            }
            return;
        }
        C78253UnR.LIZLLL("TTVideoEngine", "mSubInfoCallBack is null or mEnableSub == 0");
    }

    @Override // com.ss.ttm.player.SubInfo
    public final void onSubInfoCallback2(int i, String str) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZJ;
        C36071bH c36071bH = tTVideoEngineImpl.LLZLL;
        if (c36071bH != null && tTVideoEngineImpl.t5 > 0) {
            c36071bH.LJIIJ(i, str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("subtitle: callback2: ");
            LIZ.append(str);
            TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ));
            return;
        }
        C78253UnR.LIZLLL("TTVideoEngine", "mSubInfoCallBack is null or mEnableSub == 0");
    }

    @Override // com.ss.ttm.player.SubInfo
    public final int onSubInfoCallbackWithRet(int i, String str) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZJ;
        C36071bH c36071bH = tTVideoEngineImpl.LLZLL;
        if (c36071bH != null && tTVideoEngineImpl.t5 > 0) {
            return c36071bH.LJIIJJI(i, str);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mSubInfoCallBack is null, mEnableSub:");
        LIZ.append(this.LIZJ.t5);
        C78253UnR.LIZLLL("TTVideoEngine", X1D.LIZIZ(LIZ));
        return -9927;
    }

    @Override // com.ss.ttm.player.SubInfo
    public final void onSubLoadFinished2(int i, String str) {
        int i2;
        C47750Ioc c47750Ioc;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZJ;
        if (tTVideoEngineImpl.LLZLL != null && tTVideoEngineImpl.t5 > 0) {
            TTVideoEngineLog.d("TTVideoEngine", "subtitle: call back: finished did call back");
            if (i >= 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (i2 == 1) {
                    i = 0;
                }
                jSONObject.put("code", i);
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            this.LIZJ.LLZLL.LJIILIIL(i2, str);
            if (i2 == 1 && (c47750Ioc = this.LIZJ.e) != null) {
                c47750Ioc.LJJJJZI(1, "sub_thread_enable");
                return;
            }
            return;
        }
        C78253UnR.LIZLLL("TTVideoEngine", "mSubInfoCallBack is null or mEnableSub == 0");
    }

    @Override // com.ss.ttm.player.SubInfo
    public final void onSubSwitchCompleted(int i, String str) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZJ;
        C36071bH c36071bH = tTVideoEngineImpl.LLZLL;
        if (c36071bH != null && tTVideoEngineImpl.t5 > 0) {
            c36071bH.LJIILLIIL(i, str);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mSubInfoCallBack is null, mEnableSub:");
        LIZ.append(this.LIZJ.t5);
        C78253UnR.LIZLLL("TTVideoEngine", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ttm.player.SubInfo
    public final void onSubSwitchCompleted(int i, int i2) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZJ;
        C36071bH c36071bH = tTVideoEngineImpl.LLZLL;
        if (c36071bH != null && tTVideoEngineImpl.t5 > 0) {
            c36071bH.LJIILL(i, i2);
        } else {
            C78253UnR.LIZLLL("TTVideoEngine", "mSubInfoCallBack is null");
        }
    }

    @Override // com.ss.ttm.player.SubInfo
    public final void onSubInfoCallback(int i, int i2, String str) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZJ;
        if (tTVideoEngineImpl.LLZLL != null && tTVideoEngineImpl.t5 > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("info", str);
                jSONObject.put("pts", i2);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("subtitle: callback: ");
                LIZ.append(str);
                TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ));
                this.LIZJ.LLZLL.LJIIJ(i, jSONObject.toString());
                return;
            } catch (JSONException unused) {
                C78253UnR.LIZLLL("TTVideoEngine", "put content field failed");
                return;
            }
        }
        C78253UnR.LIZLLL("TTVideoEngine", "mSubInfoCallBack is null");
    }
}
