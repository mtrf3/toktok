package X;

import com.bytedance.realx.video.TextureBufferImpl;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;

/* renamed from: X.ZUb, reason: case insensitive filesystem */
/* loaded from: classes33.dex */
public final /* synthetic */ class RunnableC90005ZUb implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                TextureBufferImpl.lambda$semisugar$release$0((TextureBufferImpl) this.LJLILLLLZI);
                return;
            default:
                RTCVideoImpl.LIZLLL((RTCVideoImpl) this.LJLILLLLZI);
                return;
        }
    }

    public /* synthetic */ RunnableC90005ZUb(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
