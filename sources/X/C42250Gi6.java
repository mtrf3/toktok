package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;

/* renamed from: X.Gi6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42250Gi6 implements InterfaceC42037Gef {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ MainActivityCallback LIZIZ;

    @Override // X.InterfaceC42037Gef
    public final boolean LIZ() {
        return this.LIZIZ.LJLJJI.isStoryPublish;
    }

    @Override // X.InterfaceC42037Gef
    public final String LIZIZ() {
        return this.LIZIZ.LJLJJI.creationId;
    }

    @Override // X.InterfaceC42037Gef
    public final int LIZLLL() {
        return this.LIZIZ.LJLJJI.videoType;
    }

    @Override // X.InterfaceC42037Gef
    public final Bitmap LJ() {
        MainActivityCallback mainActivityCallback = this.LIZIZ;
        return mainActivityCallback.LJLJI.getCover(mainActivityCallback.LJLJJI);
    }

    public final int LJFF() {
        return this.LIZIZ.LJLJJI.publishPermission;
    }

    @Override // X.InterfaceC42037Gef
    public final BaseShortVideoContext getArgs() {
        return this.LIZIZ.LJLJJI.editModel;
    }

    @Override // X.InterfaceC42037Gef
    public final void LIZJ(InterfaceC41605GUn interfaceC41605GUn) {
        this.LIZIZ.LJLJI.removePublishCallback(interfaceC41605GUn);
    }

    public final void LJI(InterfaceC41605GUn interfaceC41605GUn) {
        this.LIZIZ.LJLJI.addPublishCallback(interfaceC41605GUn, this.LIZ);
    }

    public C42250Gi6(MainActivityCallback mainActivityCallback, String str) {
        this.LIZIZ = mainActivityCallback;
        this.LIZ = str;
    }
}
