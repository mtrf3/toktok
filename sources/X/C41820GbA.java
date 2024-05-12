package X;

import com.ss.android.socialbase.downloader.depend.IDDListenerS58S0100000_7;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import defpackage.b1;
import java.util.List;

/* renamed from: X.GbA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41820GbA<T> implements InterfaceC66992k3 {
    public final /* synthetic */ Aweme LJLIL;

    public C41820GbA(Aweme aweme) {
        this.LJLIL = aweme;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<String> interfaceC65052gv) {
        List<String> list;
        List<String> list2;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel displayImageNoWatermark;
        PhotoModeImageInfo photoModeImageInfo = this.LJLIL.getPhotoModeImageInfo();
        if (photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) ORZ.LJLLLL(imageList)) == null || (displayImageNoWatermark = photoModeImageUrlModel.getDisplayImageNoWatermark()) == null || (list = displayImageNoWatermark.getUrlList()) == null) {
            list = C61878OQg.INSTANCE;
        }
        String str = (String) ORZ.LJLLLL(list);
        if (str == null) {
            str = "";
        }
        if (list.size() > 1) {
            list2 = list.subList(1, list.size());
        } else {
            list2 = C61878OQg.INSTANCE;
        }
        StringBuilder LIZ = X1D.LIZ();
        String LIZIZ = b1.LIZIZ(str, LIZ, ".png", LIZ);
        C62822Ol8 c62822Ol8 = C44890Hja.LJIIL;
        C39579Fg7.LJ((String) c62822Ol8.getValue(), false);
        X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        with.LIZJ = LIZIZ;
        with.LJ = (String) c62822Ol8.getValue();
        with.LJIIIIZZ = list2;
        with.LJIIL = new IDDListenerS58S0100000_7((C73578SuE) interfaceC65052gv, 3);
        with.LIZJ();
    }
}
