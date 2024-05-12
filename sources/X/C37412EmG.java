package X;

import com.bytedance.pia.core.setting.Settings;
import java.util.List;

/* renamed from: X.EmG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37412EmG extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public final /* synthetic */ Settings LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37412EmG(Settings settings) {
        super(0);
        this.LJLIL = settings;
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        Settings settings = this.LJLIL;
        return ORZ.LLIIIZ(settings.blockedV1Page, settings.blockedPages);
    }
}
