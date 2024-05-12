package X;

import android.app.Application;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLELokiResourceProtocol;
import com.bytedance.ies.nle.editor_jni.NLEResourceCallback;
import com.bytedance.ies.nle.editor_jni.NLEResourceManager;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS104S0300000_15;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class XF5 extends NLEResourceManager {
    public final XCT LIZ;
    public final java.util.Map<String, Effect> LIZIZ;
    public final java.util.Map<String, OSZ<Boolean, Boolean>> LIZJ;
    public final java.util.Map<String, Effect> LIZLLL;

    public XF5() {
        XCT xct;
        EffectManager LJLJJLL;
        IEffectService effectService = AVServiceImpl.LIZ().effectService();
        if (effectService != null) {
            Application application = C60903NvH.LJ;
            C60903NvH.LJIIJJI().getRegionService();
            InterfaceC84498XEg createEffectPlatform = effectService.createEffectPlatform(application, C44296Ha0.LIZ());
            if (createEffectPlatform != null && (LJLJJLL = createEffectPlatform.LJLJJLL()) != null) {
                xct = LJLJJLL.getEffectPlatform();
                this.LIZ = xct;
                this.LIZIZ = new LinkedHashMap();
                this.LIZJ = new LinkedHashMap();
                this.LIZLLL = new LinkedHashMap();
                new EffectManager();
            }
        }
        xct = null;
        this.LIZ = xct;
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = new LinkedHashMap();
        this.LIZLLL = new LinkedHashMap();
        new EffectManager();
    }

    public final void LIZ(String str) {
        String sdk_extra;
        String str2;
        boolean z;
        try {
            Effect effect = (Effect) ((LinkedHashMap) this.LIZIZ).get(str);
            boolean z2 = false;
            if (effect != null && (sdk_extra = effect.getSdk_extra()) != null && C78857UxB.LJJJIL(sdk_extra)) {
                Effect effect2 = (Effect) ((LinkedHashMap) this.LIZIZ).get(str);
                if (effect2 != null) {
                    str2 = effect2.getSdk_extra();
                } else {
                    str2 = null;
                }
                JSONObject optJSONObject = new JSONObject(str2).optJSONObject("info_effect");
                java.util.Map<String, OSZ<Boolean, Boolean>> map = this.LIZJ;
                if (optJSONObject != null) {
                    z = optJSONObject.optBoolean("time");
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                if (optJSONObject != null) {
                    z2 = optJSONObject.optBoolean("location");
                }
                map.put(str, new OSZ<>(valueOf, Boolean.valueOf(z2)));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceManager
    public final int cancelTask(String str) {
        XCT xct;
        Effect effect = (Effect) ((LinkedHashMap) this.LIZIZ).get(str);
        if (effect != null && (xct = this.LIZ) != null) {
            xct.LIZ(effect);
            return 0;
        }
        return 0;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceManager
    public final int pauseTask(String str) {
        XCT xct;
        Effect effect = (Effect) ((LinkedHashMap) this.LIZIZ).get(str);
        if (effect != null && (xct = this.LIZ) != null) {
            xct.LJIILL(effect);
            return 0;
        }
        return 0;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceManager
    public final int resumeTask(String str) {
        XCT xct;
        Effect effect = (Effect) ((LinkedHashMap) this.LIZIZ).get(str);
        if (effect != null && (xct = this.LIZ) != null) {
            xct.LJIIZILJ(effect, false, false);
        }
        return 0;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceManager
    public final String fetchResource(String str, NLEResourceCallback nLEResourceCallback) {
        int i;
        EnumC159056Mb swigToEnum;
        NLELokiResourceProtocol lokiResourceProtocol = NLELokiResourceProtocol.LIZIZ(str);
        if (lokiResourceProtocol == null || (swigToEnum = EnumC159056Mb.swigToEnum(NLEEditorJniJNI.NLELokiResourceProtocol_type_get(lokiResourceProtocol.LIZJ, lokiResourceProtocol))) == null) {
            i = -1;
        } else {
            i = C159076Md.LIZ[swigToEnum.ordinal()];
        }
        if (i == 1) {
            o.LJIIIIZZ(lokiResourceProtocol, "lokiResourceProtocol");
            if (((LinkedHashMap) this.LIZIZ).get(lokiResourceProtocol.LIZJ()) == null) {
                if (((LinkedHashMap) this.LIZLLL).get(lokiResourceProtocol.LIZJ()) == null) {
                    XCT xct = this.LIZ;
                    if (xct != null) {
                        String LIZJ = lokiResourceProtocol.LIZJ();
                        o.LJIIIIZZ(LIZJ, "lokiResourceProtocol.effectId");
                        xct.LJFF(C47261Igj.LJII(LIZJ), null, new XF6(lokiResourceProtocol, nLEResourceCallback, this, str));
                    }
                } else {
                    Effect effect = (Effect) ((LinkedHashMap) this.LIZLLL).get(lokiResourceProtocol.LIZJ());
                    if (effect != null) {
                        C43045Guv.LIZIZ(new AqS104S0300000_15(lokiResourceProtocol, this, effect, 6));
                        XCT xct2 = this.LIZ;
                        if (xct2 != null) {
                            xct2.LIZLLL(effect, true, true, true, new XF8(lokiResourceProtocol, nLEResourceCallback, this, str));
                        }
                    }
                }
            } else {
                String LIZJ2 = lokiResourceProtocol.LIZJ();
                o.LJIIIIZZ(LIZJ2, "lokiResourceProtocol.effectId");
                C77357UXp.LJJJ(LIZJ2, "1");
                C6QQ.LIZ(new XF7(lokiResourceProtocol, nLEResourceCallback, this, str));
            }
        }
        String LIZJ3 = lokiResourceProtocol.LIZJ();
        o.LJIIIIZZ(LIZJ3, "lokiResourceProtocol.effectId");
        return LIZJ3;
    }
}
