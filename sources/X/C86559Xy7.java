package X;

import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Xy7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86559Xy7 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoProgressBarAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C86559Xy7 LJLIL = new C86559Xy7();

    public C86559Xy7() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoProgressBarAssem videoProgressBarAssem, C43I<? extends Boolean> c43i) {
        VideoProgressBarAssem selectSubscribe = videoProgressBarAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (!C53324KwK.LIZ() || ((Boolean) it.LIZ).booleanValue()) {
            C8YN.LJIJI(selectSubscribe.r4(), new AqS180S0100000_14(selectSubscribe, 44));
        }
        return C76800UCe.LIZ;
    }
}
