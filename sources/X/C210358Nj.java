package X;

import com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryPlayerViewComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8Nj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210358Nj extends AbstractC65781Prl implements InterfaceC88472Yns<C8NK, C76800UCe> {
    public static final C210358Nj LJLIL = new C210358Nj();

    public C210358Nj() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NK c8nk) {
        C8NK reusedUiContentAssem = c8nk;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZLLL = R.id.player_view;
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(StoryPlayerViewComponent.class);
        reusedUiContentAssem.LIZJ = new StoryPlayerViewComponent();
        return C76800UCe.LIZ;
    }
}
