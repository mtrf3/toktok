package X;

import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTags;
import kotlin.jvm.internal.o;

/* renamed from: X.Af7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26777Af7 extends AbstractC65781Prl implements InterfaceC88473Ynt<TuxTag, ReviewTags, Integer, C76800UCe> {
    public static final C26777Af7 LJLIL = new C26777Af7();

    public C26777Af7() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(TuxTag tuxTag, ReviewTags reviewTags, Integer num) {
        TuxTag bindItems = tuxTag;
        ReviewTags item = reviewTags;
        num.intValue();
        o.LJIIIZ(bindItems, "$this$bindItems");
        o.LJIIIZ(item, "item");
        bindItems.setText(item.text);
        return C76800UCe.LIZ;
    }
}
