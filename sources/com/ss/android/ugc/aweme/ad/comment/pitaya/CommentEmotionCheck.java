package com.ss.android.ugc.aweme.ad.comment.pitaya;

import X.C10K;
import X.C59835Ne3;
import X.C78983UzD;
import X.CallableC38428F6i;
import X.EF7;
import X.InterfaceC183977Jx;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class CommentEmotionCheck {
    public final IPitayaCore LIZIZ() {
        return PitayaCoreFactory.getCore(String.valueOf(EF7.LJIIIZ));
    }

    public final boolean LIZJ() {
        if (LIZIZ().isReady()) {
            return true;
        }
        try {
            C10K.LIZJ(CallableC38428F6i.LJLIL);
            return false;
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            return false;
        }
    }

    public final boolean LIZLLL() {
        return LIZIZ().isReady();
    }

    public final void LIZ(String comment, final InterfaceC183977Jx interfaceC183977Jx, IPitayaCore pitayaModel) {
        String str;
        String language;
        o.LJIIIZ(comment, "comment");
        o.LJIIIZ(pitayaModel, "pitayaModel");
        IHostContextDepend LIZIZ = C59835Ne3.LIZIZ();
        String str2 = "unknown";
        if (LIZIZ == null || (str = LIZIZ.getRegion()) == null) {
            str = "unknown";
        }
        IHostContextDepend LIZIZ2 = C59835Ne3.LIZIZ();
        if (LIZIZ2 != null && (language = LIZIZ2.getLanguage()) != null) {
            str2 = language;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("country", str);
            jSONObject.put("lang_code", str2);
            jSONObject.put("comment", comment);
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
            interfaceC183977Jx.LIZ("error_2", 0, Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
        }
        pitayaModel.runTask("tiktok_promote_ad_antispam", new PTYTaskData(jSONObject), new PTYTaskConfig(false, null, 1000.0f), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.ad.comment.pitaya.CommentEmotionCheck$checkCommentEmotion$1
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                String str3;
                Integer num;
                String str4;
                List<String> stacks;
                double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                int i = 0;
                JSONObject jSONObject2 = null;
                r1 = null;
                String str5 = null;
                if (!z) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("errorCode == ");
                    if (pTYError != null) {
                        num = Integer.valueOf(pTYError.getCode());
                    } else {
                        num = null;
                    }
                    LIZ.append(num);
                    LIZ.append(", errorMsg == ");
                    if (pTYError != null) {
                        str4 = pTYError.getSummary();
                    } else {
                        str4 = null;
                    }
                    LIZ.append(str4);
                    LIZ.append("，errorStack == ");
                    if (pTYError != null && (stacks = pTYError.getStacks()) != null) {
                        str5 = stacks.toString();
                    }
                    LIZ.append(str5);
                    X1D.LIZIZ(LIZ);
                    InterfaceC183977Jx.this.LIZ("error_1", 0, Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
                    return;
                }
                if (pTYTaskData == null || (jSONObject2 = pTYTaskData.getParams()) == null || (str3 = jSONObject2.optString("is_neg_commet_ver")) == null) {
                    str3 = "error_0";
                }
                if (jSONObject2 != null) {
                    i = jSONObject2.optInt("is_neg_comment_label");
                    d = jSONObject2.optDouble("is_neg_comment_prob");
                }
                InterfaceC183977Jx.this.LIZ(str3, Integer.valueOf(i), Double.valueOf(d));
            }
        });
    }
}
