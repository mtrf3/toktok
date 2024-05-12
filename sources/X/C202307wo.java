package X;

import Y.ARunnableS39S0100000_3;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202307wo extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDiggAssem, C43I<? extends Aweme>, C76800UCe> {
    public static final C202307wo LJLIL = new C202307wo();

    public C202307wo() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDiggAssem videoDiggAssem, C43I<? extends Aweme> c43i) {
        VideoDiggAssem selectSubscribeOnAsync = videoDiggAssem;
        C43I<? extends Aweme> c43i2 = c43i;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (c43i2 != null) {
            selectSubscribeOnAsync.r4().m6((Aweme) c43i2.LIZ);
            if (JA9.LIZIZ()) {
                C37179EiV.LIZ().post(new ARunnableS39S0100000_3(selectSubscribeOnAsync, 5));
            }
            FFL.LJIIIZ().getClass();
            FFL.LJIILL(1, "hybrid_test_experiment_string", "default", false);
        }
        return C76800UCe.LIZ;
    }
}
