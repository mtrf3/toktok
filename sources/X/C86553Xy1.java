package X;

import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Xy1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86553Xy1 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoProgressBarAssem, Integer, C76800UCe> {
    public static final C86553Xy1 LJLIL = new C86553Xy1();

    public C86553Xy1() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoProgressBarAssem videoProgressBarAssem, Integer num) {
        VideoProgressBarAssem selectSubscribe = videoProgressBarAssem;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C5S7 c5s7 = selectSubscribe.LLIFFJFJJ;
        if (c5s7 != null) {
            c5s7.setMax(((C81277Vv7) selectSubscribe.r4().getState()).LJLJJL);
        }
        C5S7 c5s72 = selectSubscribe.LLIFFJFJJ;
        if (c5s72 != null) {
            c5s72.setProgress(intValue);
        }
        return C76800UCe.LIZ;
    }
}
