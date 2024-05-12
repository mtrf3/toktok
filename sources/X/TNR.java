package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TNR implements InterfaceC43942HMk {
    public final C79043V0l LIZ = new C79043V0l();
    public final InterfaceC74394THq LIZIZ;
    public final TNV LIZJ;

    public TNR(C74536TNc c74536TNc, TNV tnv) {
        this.LIZIZ = c74536TNc;
        this.LIZJ = tnv;
    }

    public final void LIZIZ(Effect targetEffect, IFetchEffectListener listener) {
        List<String> music;
        String str;
        o.LJIIIZ(targetEffect, "targetEffect");
        o.LJIIIZ(listener, "listener");
        if (!V3N.LJJII(targetEffect) || (music = targetEffect.getMusic()) == null || music.isEmpty()) {
            this.LIZIZ.fetchEffect(targetEffect, listener);
            return;
        }
        this.LIZ.getClass();
        TNT tnt = new TNT(targetEffect, new C44373HbF(listener));
        List<String> music2 = targetEffect.getMusic();
        if (music2 != null && (str = (String) ListProtector.get(music2, 0)) != null) {
            this.LIZJ.LIZIZ(str, new TNQ(tnt), new TNO(tnt), new TNM(tnt), true);
        } else {
            tnt.onFailed();
        }
        this.LIZIZ.fetchEffect(targetEffect, tnt);
    }

    @Override // X.InterfaceC43942HMk
    public final void LIZ(String effectId, String str, IFetchEffectListener listener) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(listener, "listener");
        HashMap hashMap = new HashMap();
        hashMap.put(WM7.SCENE_SERVICE, str);
        LIZLLL(effectId, hashMap, listener);
    }

    @Override // X.InterfaceC43942HMk
    public final void LIZLLL(String effectId, java.util.Map<String, String> map, IFetchEffectListener listener) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(listener, "listener");
        EffectListResponse LIZ = C44027HPr.LIZ(effectId);
        if (LIZ != null) {
            List<Effect> data = LIZ.getData();
            if (!data.isEmpty()) {
                LIZIZ((Effect) ListProtector.get(data, 0), listener);
                return;
            } else {
                listener.onFail(null, new ExceptionResult(-1, new IllegalStateException("get effect info error")));
                return;
            }
        }
        this.LIZIZ.LIZJ(C47261Igj.LJJIJ(effectId), false, map, new TNS(this, listener));
    }
}
