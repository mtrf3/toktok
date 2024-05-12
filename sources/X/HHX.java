package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HHX extends AbstractC65781Prl implements InterfaceC88472Yns<AutoCutMediaModel, CharSequence> {
    public static final HHX LJLIL = new HHX();

    public HHX() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(AutoCutMediaModel autoCutMediaModel) {
        AutoCutMediaModel it = autoCutMediaModel;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start = ");
        LIZ.append(it.cutStartTime);
        LIZ.append(", duration = ");
        LIZ.append(it.cutDuration);
        LIZ.append(", file = ");
        LIZ.append(it.filePath);
        return X1D.LIZIZ(LIZ);
    }
}
