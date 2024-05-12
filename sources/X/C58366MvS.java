package X;

import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.lynx.tasm.behavior.ui.LynxUI;
import kotlin.jvm.internal.o;

/* renamed from: X.MvS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58366MvS extends C40197Fq5 {
    public final /* synthetic */ boolean LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58366MvS(boolean z) {
        super("x-alpha-video", false, false);
        this.LIZLLL = z;
    }

    @Override // X.C40197Fq5
    public final LynxUI<?> LIZLLL(VNU vnu) {
        o.LJI(vnu);
        LynxAlphaVideo lynxAlphaVideo = new LynxAlphaVideo(vnu, "");
        if (this.LIZLLL) {
            lynxAlphaVideo.LJLJLJ = new C60789NtR(vnu, EnumC61028NxI.LYNX_VIDEO, 2);
        }
        lynxAlphaVideo.LJLJL = false;
        return lynxAlphaVideo;
    }
}
