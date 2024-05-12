package X;

import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: X.25w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C529225w extends AbstractC65781Prl implements InterfaceC88472Yns<Map.Entry<Long, List<? extends String>>, C76800UCe> {
    public static final C529225w LJLIL = new C529225w();

    public C529225w() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Map.Entry<Long, List<? extends String>> entry) {
        Map.Entry<Long, List<? extends String>> entry2 = entry;
        if (entry2 != null) {
            long longValue = entry2.getKey().longValue();
            entry2.getValue();
            OR7.LLLIIL(new File(String.valueOf(longValue)));
        }
        return C76800UCe.LIZ;
    }
}
