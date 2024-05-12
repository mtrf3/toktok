package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import java.nio.ByteBuffer;

/* renamed from: X.HMf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43937HMf implements P5A {
    public final /* synthetic */ IAVInfoService.VEFrameAvailableListener LIZ;

    public C43937HMf(IAVInfoService.VEFrameAvailableListener vEFrameAvailableListener) {
        this.LIZ = vEFrameAvailableListener;
    }

    @Override // X.P5A
    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        return this.LIZ.processFrame(byteBuffer, i, i2, i3);
    }
}
