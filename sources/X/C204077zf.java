package X;

import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7zf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C204077zf extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoShareAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C204077zf LJLIL = new C204077zf();

    public C204077zf() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoShareAssem videoShareAssem, C43I<? extends Integer> c43i) {
        VideoShareAssem selectSubscribe = videoShareAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.z4().setState(C204097zh.LJLIL);
            selectSubscribe.LLIIIL = true;
        }
        return C76800UCe.LIZ;
    }
}
