package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HxN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45745HxN extends AbstractC65781Prl implements InterfaceC88473Ynt<C45744HxM, C45743HxL, C45743HxL, C45743HxL> {
    public static final C45745HxN LJLIL = new C45745HxN();

    public C45745HxN() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C45743HxL invoke(C45744HxM c45744HxM, C45743HxL c45743HxL, C45743HxL c45743HxL2) {
        List<MediaModel> list;
        C45743HxL c45743HxL3 = c45743HxL;
        C45743HxL c45743HxL4 = c45743HxL2;
        o.LJIIIZ(c45744HxM, "<anonymous parameter 0>");
        if (c45743HxL3 == null || (list = c45743HxL3.LJLILLLLZI) == null) {
            return null;
        }
        if (list.size() >= 30) {
            if (c45743HxL4 == null) {
                return null;
            }
            return C45743HxL.L(c45743HxL4, list.subList(0, 30));
        }
        if (c45743HxL4 == null) {
            return null;
        }
        return C45743HxL.L(c45743HxL4, list);
    }
}
