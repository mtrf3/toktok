package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EkH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37289EkH extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends EEY>> {
    public static final C37289EkH LJLIL = new C37289EkH();

    public C37289EkH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends EEY> invoke() {
        EE1 initTask = AVExternalServiceImpl.LIZ().initService().initTask(1);
        o.LJI(initTask);
        return C47261Igj.LJJIJIL(initTask);
    }
}
