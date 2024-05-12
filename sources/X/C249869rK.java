package X;

import com.ss.android.ugc.aweme.ug.settings.SparkPreloadModel;
import com.ss.android.ugc.aweme.ug.settings.SparkReUseModel;
import java.util.Collection;
import java.util.List;

/* renamed from: X.9rK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249869rK extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C249869rK LJLIL = new C249869rK();

    public C249869rK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        Collection collection;
        Iterable iterable;
        C249879rL c249879rL = C249879rL.LIZ;
        c249879rL.getClass();
        SparkReUseModel LIZIZ = C249879rL.LIZIZ();
        if (LIZIZ == null || (collection = LIZIZ.denySchemaList) == null) {
            collection = C61878OQg.INSTANCE;
        }
        c249879rL.getClass();
        SparkPreloadModel LIZ = C249879rL.LIZ();
        if (LIZ == null || (iterable = LIZ.denySchemaList) == null) {
            iterable = C61878OQg.INSTANCE;
        }
        return ORZ.LLIIIZ(iterable, collection);
    }
}
