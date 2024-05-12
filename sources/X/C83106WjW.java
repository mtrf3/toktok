package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WjW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83106WjW extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends ComposerBeauty>, C76800UCe> {
    public static final C83106WjW LJLIL = new C83106WjW();

    public C83106WjW() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<ComposerBeauty> composerBeauties) {
        ComposerBeauty composerBeauty;
        o.LJIIIZ(composerBeauties, "composerBeauties");
        Iterator<ComposerBeauty> it = composerBeauties.iterator();
        do {
            composerBeauty = null;
            if (!it.hasNext()) {
                break;
            } else {
                composerBeauty = it.next();
            }
        } while (!composerBeauty.getExtra().getDefault());
        ComposerBeauty composerBeauty2 = composerBeauty;
        if (composerBeauty2 != null) {
            composerBeauty2.setSelected(true);
        } else {
            if (!(!composerBeauties.isEmpty())) {
                return;
            }
            ((ComposerBeauty) ListProtector.get(composerBeauties, 0)).setSelected(true);
        }
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(List<? extends ComposerBeauty> list) {
        invoke2((List<ComposerBeauty>) list);
        return C76800UCe.LIZ;
    }
}
