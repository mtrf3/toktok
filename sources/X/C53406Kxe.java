package X;

import com.ss.android.ugc.aweme.inbox.ab.ReverseInboxNotifyMetaSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Kxe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53406Kxe extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, Boolean> {
    public static final C53406Kxe LJLIL = new C53406Kxe();

    public C53406Kxe() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Integer num) {
        int intValue = num.intValue();
        ReverseInboxNotifyMetaSetting.LIZ.getClass();
        ReverseInboxNotifyMetaSetting.Meta meta = (ReverseInboxNotifyMetaSetting.Meta) ReverseInboxNotifyMetaSetting.LIZJ.getValue();
        o.LJIIIIZZ(meta, "ReverseInboxNotifyMetaSetting.value");
        return Boolean.valueOf(meta.groups.contains(Integer.valueOf(intValue)));
    }
}
