package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import kotlin.jvm.internal.o;

/* renamed from: X.Tzh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76465Tzh extends AbstractC65781Prl implements InterfaceC88472Yns<ItemInfo4FE, Boolean> {
    public static final C76465Tzh LJLIL = new C76465Tzh();

    public C76465Tzh() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(ItemInfo4FE itemInfo4FE) {
        boolean z;
        ItemInfo4FE it = itemInfo4FE;
        o.LJIIIZ(it, "it");
        if ((it.endAt * 1000) - 1000 <= System.currentTimeMillis()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
