package X;

import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UuL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78681UuL extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoUserCardAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C78681UuL LJLIL = new C78681UuL();

    public C78681UuL() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoUserCardAssem videoUserCardAssem, C43I<? extends C76800UCe> c43i) {
        VideoUserCardAssem selectSubscribe = videoUserCardAssem;
        C43I<? extends C76800UCe> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && c43i2.LIZ() != null) {
            C25771A9n c25771A9n = (C25771A9n) selectSubscribe.Y3().findViewById(R.id.mxv);
            o.LJIIIIZZ(c25771A9n, "contentView.userCardLayout");
            c25771A9n.LJLJLJ(false);
        }
        return C76800UCe.LIZ;
    }
}
