package X;

import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AV0 extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final AV0 LJLIL = new AV0();

    public AV0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        String[] stringArray = EF7.LIZIZ().getResources().getStringArray(R.array.a4);
        o.LJIIIIZZ(stringArray, "AppContextManager.getApp…(R.array.kids_event_list)");
        return ORY.LJJZZIII(stringArray);
    }
}
