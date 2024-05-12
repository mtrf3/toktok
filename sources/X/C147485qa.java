package X;

import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.5qa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147485qa extends F9E {
    public final Effect LJLIL;
    public final CustomStickerInfo LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C147485qa(Effect effect, CustomStickerInfo info) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(info, "info");
        this.LJLIL = effect;
        this.LJLILLLLZI = info;
    }
}
