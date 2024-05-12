package X;

import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryDownloadPlaceHolderComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8LK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8LK extends AbstractC65781Prl implements InterfaceC88472Yns<C8NK, C76800UCe> {
    public static final C8LK LJLIL = new C8LK();

    public C8LK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NK c8nk) {
        C8NK reusedUiContentAssem = c8nk;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZLLL = R.id.ddl;
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(StoryDownloadPlaceHolderComponent.class);
        reusedUiContentAssem.LIZJ = new StoryDownloadPlaceHolderComponent();
        return C76800UCe.LIZ;
    }
}
