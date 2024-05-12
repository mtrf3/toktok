package X;

import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersivePlayAreaComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8M5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8M5 extends AbstractC65781Prl implements InterfaceC88472Yns<C8NK, C76800UCe> {
    public static final C8M5 LJLIL = new C8M5();

    public C8M5() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NK c8nk) {
        C8NK reusedUiContentAssem = c8nk;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZLLL = R.id.hrl;
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(StoryImmersivePlayAreaComponent.class);
        reusedUiContentAssem.LIZJ = new StoryImmersivePlayAreaComponent();
        return C76800UCe.LIZ;
    }
}
