package X;

import com.ss.android.ugc.aweme.story.feed.common.newarch.component.FeedCollectionContainerComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8MB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MB extends AbstractC65781Prl implements InterfaceC88472Yns<C8NH, C76800UCe> {
    public static final C8MB LJLIL = new C8MB();

    public C8MB() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NH c8nh) {
        C8NH reusedUiSlotAssem = c8nh;
        o.LJIIIZ(reusedUiSlotAssem, "$this$reusedUiSlotAssem");
        reusedUiSlotAssem.LIZLLL = R.id.player_view;
        reusedUiSlotAssem.LIZ = C65352Pkq.LIZ(FeedCollectionContainerComponent.class);
        reusedUiSlotAssem.LIZJ = new FeedCollectionContainerComponent();
        return C76800UCe.LIZ;
    }
}
