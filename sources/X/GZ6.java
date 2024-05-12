package X;

import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.story.IStoryService;

/* loaded from: classes8.dex */
public final class GZ6 extends AbstractC41806Gaw<GZB, GY8> {
    public static final /* synthetic */ int LIZIZ = 0;

    @Override // X.AbstractC41806Gaw
    public final Object LIZIZ(Object obj, C41805Gav c41805Gav) {
        GZB gzb = (GZB) obj;
        boolean streamEditMode = gzb.LIZIZ.getStreamEditMode();
        ForwardMediaDownloader LJI = ((IStoryService) ((C43119Gw7) AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService()).LIZ.get()).LJII().LJI();
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(c41805Gav));
        LJI.download(gzb.LIZ, gzb.LIZIZ, null, new GZD(c84654XKg, streamEditMode, gzb));
        return c84654XKg.LIZ();
    }
}
