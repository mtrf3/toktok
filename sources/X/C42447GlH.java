package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.GlH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42447GlH implements IFetchEffectListener {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ C72242sW LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        o.LJIIIZ(effect, "effect");
        this.LIZIZ.element = System.currentTimeMillis();
        H7B.LIZ("SpecialPlus, downloadSticker onStart");
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        o.LJIIIZ(effect2, "effect");
        C36478ETi c36478ETi = C45426HsE.LIZIZ;
        c36478ETi.LIZ.storeInt("special_plus_effect_version", this.LIZ);
        c36478ETi.LIZ.storeString("special_plus_effect", GsonProtectorUtils.toJson(C44172HVg.LIZIZ, effect2));
        H7B.LIZ("SpecialPlus, downloadSticker onSuccess");
        C6BK c6bk = new C6BK();
        String effectId = effect2.getEffectId();
        if (effectId == null) {
            effectId = "";
        }
        c6bk.LIZ.put("sticker_id", effectId);
        c6bk.LIZ.put("duration", Long.valueOf(System.currentTimeMillis() - this.LIZIZ.element));
        c6bk.LIZ.put("type", "prop");
        C43882HKc.LIZLLL(0, "special_plus_download", c6bk.LJ(), true);
    }

    public C42447GlH(int i, C72242sW c72242sW) {
        this.LIZ = i;
        this.LIZIZ = c72242sW;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        String str;
        o.LJIIIZ(e, "e");
        H7B.LIZ("SpecialPlus, downloadSticker onFail");
        C6BK c6bk = new C6BK();
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        c6bk.LIZ.put("sticker_id", str);
        c6bk.LIZ.put("duration", Long.valueOf(System.currentTimeMillis() - this.LIZIZ.element));
        c6bk.LIZ.put("type", "prop");
        C43882HKc.LIZLLL(1, "special_plus_download", c6bk.LJ(), true);
    }
}
