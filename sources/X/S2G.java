package X;

import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S2G extends F9E {
    public final List<PromotionItem> LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI;
    public final boolean LJLJJI;
    public final int LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL)};
    }

    public S2G(List promotionItems, long j, long j2, boolean z, int i) {
        z = (i & 8) != 0 ? false : z;
        int i2 = (i & 16) != 0 ? -1 : 0;
        o.LJIIIZ(promotionItems, "promotionItems");
        this.LJLIL = promotionItems;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = z;
        this.LJLJJL = i2;
    }
}
