package X;

import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0U extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCLACaptionAssem, C43I<? extends Integer>, C76800UCe> {
    public static final Y0U LJLIL = new Y0U();

    public Y0U() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCLACaptionAssem videoCLACaptionAssem, C43I<? extends Integer> c43i) {
        VideoCLACaptionAssem selectSubscribe = videoCLACaptionAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.r4().LJLL = true;
            Y1B y1b = (Y1B) selectSubscribe.LLIIJI.getValue();
            y1b.LIZLLL = null;
            y1b.LIZJ = VLK.NONE;
            selectSubscribe.LLIIIJ = true;
        }
        return C76800UCe.LIZ;
    }
}
