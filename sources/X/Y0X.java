package X;

import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0X extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCLACaptionAssem, C43I<? extends String>, C76800UCe> {
    public static final Y0X LJLIL = new Y0X();

    public Y0X() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCLACaptionAssem videoCLACaptionAssem, C43I<? extends String> c43i) {
        VideoCLACaptionAssem selectSubscribe = videoCLACaptionAssem;
        C43I<? extends String> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && c43i2.LIZ != 0) {
            VideoCLACaptionViewModel r4 = selectSubscribe.r4();
            r4.getClass();
            if (r4.wv0()) {
                r4.LJLLL = AK4.LIZ().LJI();
            }
        }
        return C76800UCe.LIZ;
    }
}
