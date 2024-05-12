package X;

import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryLoadingComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8Lu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209948Lu extends AbstractC65781Prl implements InterfaceC88472Yns<C8NH, C76800UCe> {
    public static final C209948Lu LJLIL = new C209948Lu();

    public C209948Lu() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NH c8nh) {
        C8NH reusedUiSlotAssem = c8nh;
        o.LJIIIZ(reusedUiSlotAssem, "$this$reusedUiSlotAssem");
        reusedUiSlotAssem.LIZLLL = R.id.dem;
        reusedUiSlotAssem.LIZ = C65352Pkq.LIZ(StoryLoadingComponent.class);
        reusedUiSlotAssem.LIZJ = new StoryLoadingComponent();
        return C76800UCe.LIZ;
    }
}
