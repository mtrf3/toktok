package X;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.notificationlive.ui.NotificationChoiceState;
import kotlin.jvm.internal.o;

/* renamed from: X.SjK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72902SjK extends AbstractC65781Prl implements InterfaceC88472Yns<NotificationChoiceState, NotificationChoiceState> {
    public static final C72902SjK LJLIL = new C72902SjK();

    public C72902SjK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final NotificationChoiceState invoke(NotificationChoiceState notificationChoiceState) {
        NotificationChoiceState setState = notificationChoiceState;
        o.LJIIIZ(setState, "$this$setState");
        ListState listState = setState.getListState();
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        return NotificationChoiceState.copy$default(setState, null, null, false, ListState.copy$default(listState, null, null, new C173936s9(c61878OQg), new C173936s9(c61878OQg), null, 19, null), false, 0, null, false, null, null, 1015, null);
    }
}
