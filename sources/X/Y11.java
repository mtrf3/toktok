package X;

import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y11 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCLACaptionAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final Y11 LJLIL = new Y11();

    public Y11() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCLACaptionAssem videoCLACaptionAssem, C43I<? extends C195357lb> c43i) {
        VideoCLACaptionAssem selectSubscribe = videoCLACaptionAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.r4().LJLL = false;
            selectSubscribe.LLIIIJ = false;
        }
        return C76800UCe.LIZ;
    }
}
