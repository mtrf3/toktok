package X;

import android.os.Bundle;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.bytedance.android.live.broadcast.utils.DumpScreenHelper$dumpImage$1", f = "DumpScreenHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2Fy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55542Fy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C22910v9 LJLIL;
    public final /* synthetic */ Bundle LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55542Fy(C22910v9 c22910v9, Bundle bundle, InterfaceC67352kd<? super C55542Fy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c22910v9;
        this.LJLILLLLZI = bundle;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55542Fy(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            C0NB.LIZIZ("DumpVideoHelper", "clear outdated effect image");
            C16880lQ.LLLZZIL(new File((String) this.LJLIL.LIZJ.getValue()));
            C0NB.LIZIZ("DumpVideoHelper", "clear outdated effect image success");
        } catch (Throwable th) {
            C0NB.LJI("DumpVideoHelper", th);
        }
        C22910v9 c22910v9 = this.LJLIL;
        c22910v9.LIZLLL = true;
        LiveCore liveCore = c22910v9.LIZ;
        if (liveCore != null) {
            liveCore.catchMediaData(this.LJLILLLLZI, new ILiveStream.CatchMediaDataCallback() { // from class: X.1Zy
                @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
                public final /* synthetic */ void onCompleteOnce(String str, long j, long j2, int i, int i2, int i3) {
                    C30533Byb.LIZ(this, str, j, j2, i, i2, i3);
                }

                @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
                public final void onComplete() {
                    C0NB.LIZIZ("DumpVideoHelper", "onComplete: effected image file dump success");
                }

                @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
                public final void onError(int i, String str) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onError: effected image file dump fail: ");
                    LIZ.append(str);
                    C0NB.LJ("DumpVideoHelper", X1D.LIZIZ(LIZ));
                }
            });
        }
        return C76800UCe.LIZ;
    }
}
