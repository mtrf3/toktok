package X;

import com.bytedance.pia.core.setting.Settings;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Elo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37384Elo extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends Boolean>> {
    public final /* synthetic */ Settings LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37384Elo(Settings settings) {
        super(0);
        this.LJLIL = settings;
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends Boolean> invoke() {
        List LJJIJIIJI = C47261Igj.LJJIJIIJI("prefetch", "nsr", "snapshot", "cache", "streaming");
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(LJJIJIIJI, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (Object obj : LJJIJIIJI) {
            linkedHashMap.put(obj, Boolean.valueOf(this.LJLIL.enabledFeatures.contains(obj)));
        }
        return linkedHashMap;
    }
}
