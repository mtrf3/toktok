package X;

import com.ss.android.ugc.aweme.inbox.ab.ReverseInboxNotifyMetaSetting;
import java.util.List;

/* renamed from: X.Kxc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53404Kxc extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, Boolean> {
    public static final C53404Kxc LJLIL = new C53404Kxc();

    public C53404Kxc() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Integer num) {
        int intValue = num.intValue();
        ReverseInboxNotifyMetaSetting.LIZ.getClass();
        return Boolean.valueOf(((List) ReverseInboxNotifyMetaSetting.LIZLLL.getValue()).contains(Integer.valueOf(intValue)));
    }
}
