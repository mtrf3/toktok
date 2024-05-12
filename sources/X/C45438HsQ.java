package X;

import com.ss.android.ugc.asve.recorder.RecorderConcatResult;
import kotlin.jvm.internal.o;

/* renamed from: X.HsQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45438HsQ implements InterfaceC84051Wyl {
    public final /* synthetic */ InterfaceC88472Yns LJLIL;

    public C45438HsQ(InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC84051Wyl
    public final void LIZIZ(int i, String reallyVideoPath, String reallyAudioPath) {
        InterfaceC88472Yns interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns != null) {
            o.LJIIIIZZ(reallyVideoPath, "reallyVideoPath");
            o.LJIIIIZZ(reallyAudioPath, "reallyAudioPath");
            interfaceC88472Yns.invoke(new RecorderConcatResult(i, reallyVideoPath, reallyAudioPath));
        }
    }
}
