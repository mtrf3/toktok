package X;

import Y.ARunnableS22S0200000_3;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7xR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202697xR extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoShareAssem, C43I<? extends OSZ<? extends C80H, ? extends Object>>, C76800UCe> {
    public static final C202697xR LJLIL = new C202697xR();

    public C202697xR() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoShareAssem videoShareAssem, C43I<? extends OSZ<? extends C80H, ? extends Object>> c43i) {
        VideoShareAssem selectSubscribe = videoShareAssem;
        C43I<? extends OSZ<? extends C80H, ? extends Object>> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        Context context = selectSubscribe.getContext();
        if (context == null || !C79004UzY.LJJIJIIJI(context)) {
            C35570Dxe.LIZ(new ARunnableS22S0200000_3(selectSubscribe, c43i2, 16), selectSubscribe.Y3().findViewById(R.id.jt3));
        }
        return C76800UCe.LIZ;
    }
}
