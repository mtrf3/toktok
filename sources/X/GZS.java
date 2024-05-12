package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.vesdk.VEUtils;

/* loaded from: classes8.dex */
public final class GZS<T> implements InterfaceC66992k3 {
    public final /* synthetic */ MyMediaModel LJLIL;
    public final /* synthetic */ C43972HNo LJLILLLLZI;
    public final /* synthetic */ float LJLJI;

    public GZS(MyMediaModel myMediaModel, C43972HNo c43972HNo, float f) {
        this.LJLIL = myMediaModel;
        this.LJLILLLLZI = c43972HNo;
        this.LJLJI = f;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<Bitmap> interfaceC65052gv) {
        VEUtils.getVideoFrames(this.LJLIL.fileLocalUriPath, new int[]{0}, this.LJLILLLLZI.LJLZ, (int) this.LJLJI, false, new GZR((C73578SuE) interfaceC65052gv));
    }
}
