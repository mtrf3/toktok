package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* renamed from: X.Gi5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42249Gi5 implements InterfaceC42037Gef {
    public final /* synthetic */ PublishModel LIZ;
    public final /* synthetic */ MainActivityCallback LIZIZ;

    @Override // X.InterfaceC42037Gef
    public final boolean LIZ() {
        return this.LIZ.isStoryPublish;
    }

    @Override // X.InterfaceC42037Gef
    public final String LIZIZ() {
        return this.LIZ.creationId;
    }

    @Override // X.InterfaceC42037Gef
    public final int LIZLLL() {
        return this.LIZ.videoType;
    }

    @Override // X.InterfaceC42037Gef
    public final Bitmap LJ() {
        return this.LIZIZ.LJLJI.getCover(this.LIZ);
    }

    @Override // X.InterfaceC42037Gef
    public final BaseShortVideoContext getArgs() {
        return this.LIZ.editModel;
    }

    @Override // X.InterfaceC42037Gef
    public final void LIZJ(InterfaceC41605GUn interfaceC41605GUn) {
        this.LIZIZ.LJLJI.removePublishCallback(interfaceC41605GUn);
    }

    public C42249Gi5(MainActivityCallback mainActivityCallback, String str, PublishModel publishModel) {
        this.LIZIZ = mainActivityCallback;
        this.LIZ = publishModel;
    }
}
