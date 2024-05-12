package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import kotlin.jvm.internal.o;

/* renamed from: X.HoT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45193HoT extends AbstractC65781Prl implements InterfaceC88472Yns<AutoCutMediaModel, CharSequence> {
    public static final C45193HoT LJLIL = new C45193HoT();

    public C45193HoT() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(AutoCutMediaModel autoCutMediaModel) {
        AutoCutMediaModel it = autoCutMediaModel;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(it.filePath);
        LIZ.append(": ");
        LIZ.append(C44687HgJ.LIZIZ(it.filePath));
        LIZ.append(", duration = ");
        return C47135Ieh.LIZIZ(LIZ, it.duration, '\n', LIZ);
    }
}
