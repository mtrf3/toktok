package X;

import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8mG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221248mG extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoExposeSharerInformationAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C221248mG LJLIL = new C221248mG();

    public C221248mG() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoExposeSharerInformationAssem videoExposeSharerInformationAssem, C43I<? extends Boolean> c43i) {
        VideoExposeSharerInformationAssem selectSubscribe = videoExposeSharerInformationAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            ((Boolean) c43i2.LIZ).booleanValue();
            selectSubscribe.Y3().findViewById(R.id.m71).setVisibility(0);
            selectSubscribe.Y3().findViewById(R.id.m71).setAlpha(1.0f);
            selectSubscribe.Y3().findViewById(R.id.gvf).setAlpha(0.0f);
            selectSubscribe.u4(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), false);
        }
        return C76800UCe.LIZ;
    }
}
