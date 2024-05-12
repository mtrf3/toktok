package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import com.ss.android.vesdk.VEUtils;

/* renamed from: X.GKl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41343GKl<T> implements InterfaceC66992k3 {
    public final /* synthetic */ PUgcSlotData LJLIL;
    public final /* synthetic */ C41341GKj LJLILLLLZI;

    public C41343GKl(PUgcSlotData pUgcSlotData, C41341GKj c41341GKj) {
        this.LJLIL = pUgcSlotData;
        this.LJLILLLLZI = c41341GKj;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<Bitmap> interfaceC65052gv) {
        PUgcSlotData pUgcSlotData = this.LJLIL;
        String str = pUgcSlotData.videoPath;
        int[] iArr = {(int) pUgcSlotData.startTime};
        C41341GKj c41341GKj = this.LJLILLLLZI;
        VEUtils.getVideoFrames(str, iArr, c41341GKj.LJLJL, c41341GKj.LJLJJLL, false, new C41718GYw((C73578SuE) interfaceC65052gv));
    }
}
