package X;

import com.ss.android.ugc.aweme.notificationlive.ui.NotificationChoiceState;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AYg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26414AYg extends AbstractC65781Prl implements InterfaceC88472Yns<NotificationChoiceState, Boolean> {
    public static final C26414AYg LJLIL = new C26414AYg();

    public C26414AYg() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(NotificationChoiceState notificationChoiceState) {
        List<Object> LIZ;
        NotificationChoiceState it = notificationChoiceState;
        o.LJIIIZ(it, "it");
        List<Object> LIZ2 = it.getListState().getRefresh().LIZ();
        boolean z = false;
        if ((LIZ2 == null || LIZ2.size() < 2) && ((LIZ = it.getListState().getLoadMore().LIZ()) == null || LIZ.isEmpty())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
