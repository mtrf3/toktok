package X;

import com.bytedance.pia.core.setting.Settings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ujb.s;

/* renamed from: X.EbT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36743EbT extends AbstractC65781Prl implements InterfaceC65784Pro<Collection<? extends String>> {
    public final /* synthetic */ Settings LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36743EbT(Settings settings) {
        super(0);
        this.LJLIL = settings;
    }

    @Override // X.InterfaceC65784Pro
    public final Collection<? extends String> invoke() {
        if (this.LJLIL.allowedDomains.contains("*")) {
            return C77275UUl.LJII("*");
        }
        List<String> list = this.LJLIL.allowedDomains;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (String str : list) {
            if (!s.LJLJL(str, '.')) {
                str = QZZ.LIZIZ('.', str);
            }
            arrayList.add(str);
        }
        return arrayList;
    }
}
