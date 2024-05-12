package X;

import com.ss.android.ugc.aweme.story.feed.common.newarch.component.FeedCollectionPlayerViewComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8MA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MA extends AbstractC65781Prl implements InterfaceC88472Yns<C8NK, C76800UCe> {
    public static final C8MA LJLIL = new C8MA();

    public C8MA() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NK c8nk) {
        C8NK reusedUiContentAssem = c8nk;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZLLL = R.id.player_view;
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(FeedCollectionPlayerViewComponent.class);
        reusedUiContentAssem.LIZJ = new FeedCollectionPlayerViewComponent();
        return C76800UCe.LIZ;
    }
}
