package X;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.notificationlive.ui.NotificationChoiceState;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AYV extends AbstractC65781Prl implements InterfaceC88471Ynr<NotificationChoiceState, ListState, NotificationChoiceState> {
    public static final AYV LJLIL = new AYV();

    public AYV() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final NotificationChoiceState invoke(NotificationChoiceState notificationChoiceState, ListState listState) {
        NotificationChoiceState inject = notificationChoiceState;
        ListState it = listState;
        o.LJIIIZ(inject, "$this$inject");
        o.LJIIIZ(it, "it");
        return NotificationChoiceState.copy$default(inject, null, null, false, it, false, 0, null, false, null, null, 1015, null);
    }
}
