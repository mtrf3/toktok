package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W0O implements UYF {
    public final /* synthetic */ ShortVideoContext LIZ;

    public W0O(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
    }

    @Override // X.UYF
    public final void LIZ(boolean z, Effect effect, W0K stickerType) {
        String str;
        String str2;
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(stickerType, "stickerType");
        int i = W0M.LIZ[stickerType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else {
                str = "lottie";
            }
        } else {
            str = "gif";
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", this.LIZ.shootWay);
        c145995oB.LJI("prop_id", effect.getEffectId());
        c145995oB.LJI("enter_from", "EffectStickerViewHolder");
        c145995oB.LJI("hint_type", str);
        if (z) {
            str2 = "succeed";
        } else {
            str2 = "failed";
        }
        c145995oB.LJI("load_status", str2);
        GXR.LIZ("load_prop_hint_end", c145995oB.LIZ);
    }
}
