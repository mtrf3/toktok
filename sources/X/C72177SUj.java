package X;

import com.ss.android.ugc.aweme.topicfeed.ui.TopicFeedEmptyAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SUj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72177SUj extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final C72177SUj LJLIL = new C72177SUj();

    public C72177SUj() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(TopicFeedEmptyAssem.class);
        uiSlotAssem.LJIIIZ = new TopicFeedEmptyAssem();
        uiSlotAssem.LJI = R.id.dhh;
        return C76800UCe.LIZ;
    }
}
