package X;

import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0F extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCLACaptionAssem, C43I<? extends String>, C76800UCe> {
    public static final Y0F LJLIL = new Y0F();

    public Y0F() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCLACaptionAssem videoCLACaptionAssem, C43I<? extends String> c43i) {
        T t;
        VideoCLACaptionAssem selectSubscribe = videoCLACaptionAssem;
        C43I<? extends String> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (t = c43i2.LIZ) != 0) {
            VideoCLACaptionViewModel r4 = selectSubscribe.r4();
            r4.getClass();
            if (o.LJ(t, r4.lv0())) {
                r4.LLFII = new ArrayList();
            }
            if (r4.wv0()) {
                r4.LJLLL = AK4.LIZ().LJI();
            }
            C46290IEs.LIZ().onFirstFrameRendered();
        }
        return C76800UCe.LIZ;
    }
}
