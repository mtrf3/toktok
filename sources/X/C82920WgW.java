package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WgW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82920WgW extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends BeautyCategory>, C76800UCe> {
    public static final C82920WgW LJLIL = new C82920WgW();

    public C82920WgW() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<BeautyCategory> categories) {
        BeautyCategory beautyCategory;
        o.LJIIIZ(categories, "categories");
        Iterator<BeautyCategory> it = categories.iterator();
        do {
            beautyCategory = null;
            if (!it.hasNext()) {
                break;
            } else {
                beautyCategory = it.next();
            }
        } while (!beautyCategory.getBeautyCategoryExtra().getDefault());
        BeautyCategory beautyCategory2 = beautyCategory;
        if (beautyCategory2 != null) {
            beautyCategory2.setSelected(true);
        } else {
            if (!(!categories.isEmpty())) {
                return;
            }
            ((BeautyCategory) ListProtector.get(categories, 0)).setSelected(true);
        }
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(List<? extends BeautyCategory> list) {
        invoke2((List<BeautyCategory>) list);
        return C76800UCe.LIZ;
    }
}
