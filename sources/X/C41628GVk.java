package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* renamed from: X.GVk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41628GVk<T> implements InterfaceC66992k3 {
    public final /* synthetic */ C41627GVj LJLIL;
    public final /* synthetic */ PublishModel LJLILLLLZI;

    public C41628GVk(C41627GVj c41627GVj, PublishModel publishModel) {
        this.LJLIL = c41627GVj;
        this.LJLILLLLZI = publishModel;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<Bitmap> interfaceC65052gv) {
        Bitmap cover = ((IAVPublishService) this.LJLIL.LJLJJLL.getValue()).getCover(this.LJLILLLLZI);
        if (cover != null) {
            ((C73578SuE) interfaceC65052gv).onSuccess(cover);
        }
    }
}
