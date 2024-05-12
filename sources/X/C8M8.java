package X;

import com.ss.android.ugc.aweme.story.feed.common.newarch.component.StorySharedPlayerViewComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8M8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8M8 extends AbstractC65781Prl implements InterfaceC88472Yns<C8NK, C76800UCe> {
    public static final C8M8 LJLIL = new C8M8();

    public C8M8() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NK c8nk) {
        C8NK reusedUiContentAssem = c8nk;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZLLL = R.id.dgn;
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(StorySharedPlayerViewComponent.class);
        reusedUiContentAssem.LIZJ = new StorySharedPlayerViewComponent();
        return C76800UCe.LIZ;
    }
}
