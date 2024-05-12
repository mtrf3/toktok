package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Hb6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44364Hb6 implements IEffectDownloadProgressListener {
    public final IFetchEffectListener LIZ;
    public long LIZIZ;
    public long LIZJ;

    public C44364Hb6(C44366Hb8 c44366Hb8) {
        this.LIZ = c44366Hb8;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.LIZIZ = System.currentTimeMillis();
        this.LIZJ = 0L;
        IFetchEffectListener iFetchEffectListener = this.LIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onStart(effect);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:5|(2:18|(7:22|8|(1:17)|10|11|12|13))|7|8|(0)|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00cc, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(com.ss.android.ugc.effectmanager.effect.model.Effect r16) {
        /*
            r15 = this;
            r8 = r16
            com.ss.android.ugc.effectmanager.effect.model.Effect r8 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r8
            r3 = 0
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> Le3
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> Le3
            if (r0 == 0) goto Le3
            r2 = 1
            if (r8 != 0) goto Lac
        L10:
            r7 = 0
        L11:
            long r11 = java.lang.System.currentTimeMillis()
            long r0 = r15.LIZIZ
            long r11 = r11 - r0
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.6mr r5 = r0.LJJIIZI()
            X.6BK r6 = new X.6BK
            r6.<init>()
            java.lang.String r4 = java.lang.String.valueOf(r7)
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r6.LIZ
            java.lang.String r0 = "type"
            r1.put(r0, r4)
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            com.google.gson.Gson r1 = r0.LIZ()
            com.ss.android.ugc.effectmanager.common.model.UrlModel r0 = r8.getFileUrl()
            java.lang.String r4 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r1, r0)
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r6.LIZ
            java.lang.String r0 = "url"
            r1.put(r0, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r6.LIZ
            java.lang.String r0 = "zip_model"
            r1.put(r0, r4)
            java.lang.String r1 = java.lang.String.valueOf(r11)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r6.LIZ
            java.lang.String r4 = "duration"
            r0.put(r4, r1)
            org.json.JSONObject r1 = r6.LJ()
            java.lang.String r0 = "sticker_download_error_rate"
            r5.LJIIL(r3, r0, r1)
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.6mr r6 = r0.LJJIIZI()
            X.6BK r5 = new X.6BK
            r5.<init>()
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r5.LIZ
            r0.put(r4, r1)
            if (r7 != r2) goto Laa
        L7e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r5.LIZ
            java.lang.String r0 = "isAr"
            r1.put(r0, r2)
            org.json.JSONObject r1 = r5.LJ()
            java.lang.String r0 = "type_av_sticker_download_time"
            r6.LJIJ(r0, r1)
            X.6BK r2 = new X.6BK
            r2.<init>()
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r2.LIZ
            r0.put(r4, r1)
            org.json.JSONObject r4 = r2.LJ()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            goto Lc3
        Laa:
            r2 = 0
            goto L7e
        Lac:
            java.util.List r1 = r8.getTypes()
            boolean r0 = X.C79004UzY.LJJIFFI(r1)
            if (r0 == 0) goto Lb8
            goto L10
        Lb8:
            java.lang.String r0 = "AR"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L10
            r7 = 1
            goto L11
        Lc3:
            java.lang.String r1 = "tag"
            java.lang.String r0 = "ttlive_sdk"
            r2.put(r1, r0)     // Catch: org.json.JSONException -> Lcb
            goto Lcf
        Lcb:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        Lcf:
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.6mr r1 = r0.LJJIIZI()
            java.lang.String r0 = "ttlive_download_sticker_all"
            r1.LIZLLL(r0, r3, r4, r2)
            long r9 = r15.LIZJ
            r13 = 0
            r14 = 0
            X.C60903NvH.LJIIJ(r8, r9, r11, r13, r14)
        Le3:
            com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener r0 = r15.LIZ
            if (r0 == 0) goto Lea
            r0.onSuccess(r8)
        Lea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44364Hb6.onSuccess(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        Object obj;
        String effectId;
        try {
            if (C2NU.LIZ.LIZIZ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(exceptionResult.getMsg());
                String str = "";
                if (exceptionResult.getErrorCode() != -1) {
                    obj = "";
                } else {
                    obj = exceptionResult.getException().getStackTrace();
                }
                LIZ.append(obj);
                String LIZIZ = X1D.LIZIZ(LIZ);
                InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
                C6BK c6bk = new C6BK();
                if (effect == null) {
                    effectId = "";
                } else {
                    effectId = effect.getEffectId();
                }
                c6bk.LIZ.put("sticker_id", effectId);
                c6bk.LIZ.put("errorCode", String.valueOf(exceptionResult.getErrorCode()));
                c6bk.LIZ.put("errorMsg", LIZIZ);
                c6bk.LIZ.put("zip_model", 0);
                if (effect != null) {
                    str = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), effect.getFileUrl());
                }
                c6bk.LIZ.put("url", str);
                LJJIIZI.LJIIL(1, "sticker_download_error_rate", c6bk.LJ());
                C6BK c6bk2 = new C6BK();
                c6bk2.LIZ.put("error_code", Integer.valueOf(exceptionResult.getErrorCode()));
                c6bk2.LIZ.put("error_msg", LIZIZ);
                JSONObject LJ = c6bk2.LJ();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("tag", "ttlive_sdk");
                    if (LJ != null) {
                        jSONObject.put("extra", LJ);
                    }
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                C60903NvH.LJIIJJI().LJJIIZI().LIZLLL("ttlive_download_sticker_all", 1, null, jSONObject);
                C60903NvH.LJIIJJI().LJJIIZI().LJIIL(1, "ttlive_download_sticker_error", LJ);
            }
        } catch (Exception unused) {
        }
        C60903NvH.LJIIJ(effect, this.LIZJ, System.currentTimeMillis() - this.LIZIZ, -1, exceptionResult);
        IFetchEffectListener iFetchEffectListener = this.LIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onFail(effect, exceptionResult);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        if (this.LIZJ == 0) {
            this.LIZJ = j;
            C60903NvH.LJJIJL(effect, j);
        }
        IFetchEffectListener iFetchEffectListener = this.LIZ;
        if (iFetchEffectListener instanceof IEffectDownloadProgressListener) {
            ((IEffectDownloadProgressListener) iFetchEffectListener).onProgress(effect, i, j);
        }
    }
}
