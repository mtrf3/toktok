package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import java.util.List;

/* loaded from: classes10.dex */
public final class MVM implements InterfaceC56825MRx {
    @Override // X.InterfaceC56825MRx
    public final void LIZ(C56890MUk c56890MUk) {
    }

    @Override // X.InterfaceC56825MRx
    public final boolean LIZJ(C56889MUj c56889MUj) {
        return false;
    }

    @Override // X.InterfaceC56825MRx
    public final void LIZIZ(C56890MUk c56890MUk) {
        NoticeUITemplate noticeUITemplate;
        String str;
        GeneralTemplateNotice generalTemplateNotice = c56890MUk.LIZ.templateNotice;
        if (generalTemplateNotice != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (str = noticeUITemplate.rightSchemaUrl) != null) {
            List LJJIJ = C47261Igj.LJJIJ(UriProtector.getQueryParameter(UriProtector.parse(str), "channel"));
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            if (LJJI != null) {
                LJJI.LJI();
                NHG.LIZ.LJIILL(null, C78886Uxe.LJJLIIIJL(LJJIJ));
            }
        }
    }
}
