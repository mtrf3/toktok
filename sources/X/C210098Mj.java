package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.IAdapterAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.IViewPagerAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.FeedCollectionProgressBarComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.8Mj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210098Mj extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedCollectionProgressBarComponent, C43I<? extends C210108Mk>, C76800UCe> {
    public static final C210098Mj LJLIL = new C210098Mj();

    public C210098Mj() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedCollectionProgressBarComponent feedCollectionProgressBarComponent, C43I<? extends C210108Mk> c43i) {
        C210108Mk c210108Mk;
        IViewPagerAbility iViewPagerAbility;
        C222928oy LJJLIIIJJIZ;
        Aweme item;
        String aid;
        FeedCollectionProgressBarComponent selectSubscribe = feedCollectionProgressBarComponent;
        C43I<? extends C210108Mk> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (c210108Mk = (C210108Mk) c43i2.LIZ) != null) {
            String str = c210108Mk.LJLIL;
            long j = c210108Mk.LJLILLLLZI;
            long j2 = c210108Mk.LJLJI;
            if (j2 != 0 && (iViewPagerAbility = (IViewPagerAbility) selectSubscribe.LLI.getValue()) != null) {
                int LLILL = iViewPagerAbility.LLILL();
                IAdapterAbility iAdapterAbility = (IAdapterAbility) selectSubscribe.LLI.getValue();
                if (iAdapterAbility != null && (LJJLIIIJJIZ = iAdapterAbility.LJJLIIIJJIZ()) != null && (item = LJJLIIIJJIZ.getItem(LLILL)) != null && (aid = item.getAid()) != null && TextUtils.equals(str, aid)) {
                    long j3 = j2 - j;
                    if (j3 <= 300) {
                        j = j2;
                    } else {
                        j3 = 300;
                    }
                    selectSubscribe.Cy((float) (j / j2), LLILL, j3);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
