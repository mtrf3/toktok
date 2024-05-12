package X;

import com.ss.texturerender.VideoSurface;
import com.ss.ttm.player.h;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: X.IpH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47791IpH implements h {
    public final WeakReference<TTVideoEngineImpl> LIZ;

    @Override // com.ss.ttm.player.h
    public final void LIZ(int i, long j, long j2) {
    }

    @Override // com.ss.ttm.player.h
    public final /* synthetic */ void LIZIZ(int i, long j, long j2, java.util.Map map) {
    }

    @Override // com.ss.ttm.player.h
    public final /* synthetic */ void LIZJ(long j, String str) {
    }

    @Override // com.ss.ttm.player.h
    public final void LIZLLL(int i, long j, long j2) {
    }

    @Override // com.ss.ttm.player.h
    public final void LJ(ByteBuffer byteBuffer) {
    }

    public C47791IpH(TTVideoEngineImpl tTVideoEngineImpl) {
        this.LIZ = new WeakReference<>(tTVideoEngineImpl);
    }

    @Override // com.ss.ttm.player.h
    public final void onFrameAboutToBeRendered(int i, long j, long j2, java.util.Map<Integer, String> map) {
        VideoSurface videoSurface;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl != null && (videoSurface = tTVideoEngineImpl.O0) != null) {
            videoSurface.LIZ(j, j2, map);
        }
        if (tTVideoEngineImpl.b5.LIZIZ()) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", Integer.valueOf(i));
            hashMap.put("pts", Long.valueOf(j));
            hashMap.put("wallClockTime", Long.valueOf(j2));
            hashMap.put("frameData", map);
            tTVideoEngineImpl.b5.LJFF(421, 0, 0, hashMap);
            return;
        }
        tTVideoEngineImpl.LLZL.onFrameAboutToBeRendered(tTVideoEngineImpl.L7, i, j, j2, map);
    }
}
