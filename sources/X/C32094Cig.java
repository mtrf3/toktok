package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Cig, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32094Cig extends F9E {
    public List<? extends GiftPage> LJLIL;
    public String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C32094Cig() {
        C61878OQg currentGiftPages = C61878OQg.INSTANCE;
        o.LJIIIZ(currentGiftPages, "currentGiftPages");
        this.LJLIL = currentGiftPages;
        this.LJLILLLLZI = "";
    }
}
