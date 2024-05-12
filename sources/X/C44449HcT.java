package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.HcT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44449HcT extends EO7 {
    public final /* synthetic */ C46193IAz LIZ;

    public C44449HcT(C46193IAz c46193IAz) {
        this.LIZ = c46193IAz;
    }

    @Override // X.EO7
    public final boolean LIZ(Effect sticker, String category) {
        o.LJIIIZ(category, "category");
        o.LJIIIZ(sticker, "sticker");
        if (!TextUtils.isEmpty(this.LIZ.LLIIJLIL.presetEffectId) && o.LJ(this.LIZ.LLIIJLIL.presetEffectId, sticker.getEffectId())) {
            return false;
        }
        return sticker.isBusiness();
    }
}
