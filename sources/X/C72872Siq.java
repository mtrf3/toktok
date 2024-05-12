package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Siq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72872Siq extends AbstractC65781Prl implements InterfaceC88473Ynt<List<String>, Long, C72877Siv, List<String>> {
    public static final C72872Siq LJLIL = new C72872Siq();

    public C72872Siq() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final List<String> invoke(List<String> self, Long l, C72877Siv c72877Siv) {
        long longValue = l.longValue();
        C72877Siv handleConfig = c72877Siv;
        o.LJIIIZ(self, "self");
        o.LJIIIZ(handleConfig, "handleConfig");
        if (handleConfig.LJLJI == 0) {
            return new ArrayList();
        }
        int ceil = (int) Math.ceil((((float) longValue) / 1000.0f) / r2);
        ArrayList arrayList = new ArrayList(ceil);
        for (int i = 0; i < ceil; i++) {
            arrayList.add("");
        }
        return arrayList;
    }
}
