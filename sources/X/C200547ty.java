package X;

import Y.ACallableS106S0100000_3;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import kotlin.jvm.internal.o;

/* renamed from: X.7ty, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200547ty extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDiggAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C200547ty LJLIL = new C200547ty();

    public C200547ty() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDiggAssem videoDiggAssem, C43I<? extends C195357lb> c43i) {
        C200537tx c200537tx;
        VideoDiggAssem selectSubscribeOnAsync = videoDiggAssem;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        VideoDiggVM r4 = selectSubscribeOnAsync.r4();
        if (r4.LJLLLLLL && !r4.LJLL && (c200537tx = r4.LJZ) != null && c200537tx.LJ >= 0 && c200537tx.LIZJ >= 0) {
            C10K.LIZJ(new ACallableS106S0100000_3(c200537tx, 1));
        }
        r4.LJLLLLLL = false;
        r4.LJLZ = false;
        return C76800UCe.LIZ;
    }
}
