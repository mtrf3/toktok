package X;

import X.AbstractC49433Jaf;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JiH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49905JiH<T extends AbstractC49433Jaf<?>> extends AbstractC51030K1a<T, Aweme> {
    @Override // X.AbstractC51030K1a
    public final List<Aweme> LJJIIZI() {
        return ((AbstractC51036K1g) this.LJLIL).getItems();
    }

    @Override // X.AbstractC51030K1a
    public final List<Aweme> LJJIJ() {
        return ((AbstractC51036K1g) this.LJLIL).getItems();
    }

    @Override // X.C8BR
    public final void LJJ(C8BS c8bs) {
        AbstractC51036K1g model = (AbstractC51036K1g) c8bs;
        o.LJIIIZ(model, "model");
        super.LJJ(model);
        model.onModelBound();
    }

    @Override // X.AbstractC51030K1a
    public final String LJJIIZ(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (aweme2 == null) {
            return "";
        }
        String LIZIZ = C227768wm.LIZIZ(aweme2);
        o.LJIIIIZZ(LIZIZ, "getAid(data ?: return \"\")");
        return LIZIZ;
    }
}
