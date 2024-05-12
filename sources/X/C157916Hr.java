package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextFontExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.6Hr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157916Hr extends C157816Hh {
    public final EffectTextFontExtra LJLIL;

    public final int hashCode() {
        return this.effect.getEffectId().hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C157776Hd) {
            return o.LJ(((C157816Hh) obj).effect.getResourceId(), this.effect.getResourceId());
        }
        return false;
    }

    public C157916Hr(Effect effect, EffectTextFontExtra effectTextFontExtra) {
        super(effect);
        this.LJLIL = effectTextFontExtra;
    }
}
