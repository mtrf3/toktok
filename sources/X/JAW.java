package X;

import Y.ARunnableS19S0300000_8;
import Y.ARunnableS20S0200000_1;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdVM;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JAW extends AbstractC65781Prl implements InterfaceC88471Ynr<MidAdCellComponent, C43I<? extends Boolean>, C76800UCe> {
    public static final JAW LJLIL = new JAW();

    public JAW() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(MidAdCellComponent midAdCellComponent, C43I<? extends Boolean> c43i) {
        Aweme aweme;
        String str;
        IGM igm;
        IDP idp;
        VideoUrlModel videoUrlModel;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        IDP playerController;
        MidAdCellComponent selectSubscribe = midAdCellComponent;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        selectSubscribe.LLIIJLIL = ((Boolean) it.LIZ).booleanValue();
        if (((Boolean) it.LIZ).booleanValue() && (aweme = selectSubscribe.A4().LJLL) != null) {
            C222588oQ c222588oQ = selectSubscribe.a1().LIZLLL;
            List<String> list = null;
            if (c222588oQ != null) {
                str = c222588oQ.LJIIIZ;
            } else {
                str = null;
            }
            C46728IVo.LJIIL(0, aweme);
            NHG.LIZ.LJIILJJIL(str, C47261Igj.LJII(aweme));
            MidAdVM A4 = selectSubscribe.A4();
            Context context = selectSubscribe.getContext();
            A4.getClass();
            Iterator<InterfaceC58172Qb> it2 = FeedAdServiceImpl.LJJIJLIJ().LJIL().iterator();
            while (it2.hasNext()) {
                C38995FSd.LIZLLL().execute(new ARunnableS20S0200000_1(it2.next(), aweme, 33));
            }
            Iterator<InterfaceC48720JAe> it3 = FeedAdServiceImpl.LJJIJLIJ().LJIILIIL().iterator();
            while (it3.hasNext()) {
                C38995FSd.LIZLLL().execute(new ARunnableS19S0300000_8(it3.next(), context, aweme, 3));
            }
            IXL LJFF = ISimPlayerService.LIZ.get().LJFF(true, false);
            IWK LIZLLL = LJFF.LIZLLL();
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) selectSubscribe.LLIIIJ.getValue();
            if (iFeedPanelPlatformAbility != null && (playerController = iFeedPanelPlatformAbility.getPlayerController()) != null) {
                igm = playerController.LLLIILIL;
            } else {
                igm = null;
            }
            LIZLLL.LJ(igm);
            LJFF.LIZLLL().LIZLLL(new O5Y());
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) selectSubscribe.LLIIIJ.getValue();
            if (iFeedPanelPlatformAbility2 != null) {
                idp = iFeedPanelPlatformAbility2.getPlayerController();
            } else {
                idp = null;
            }
            LJFF.LJJJLL(idp);
            selectSubscribe.LLIL = LJFF;
            C46744IWe c46744IWe = new C46744IWe();
            Video video = aweme.getVideo();
            if (video != null) {
                videoUrlModel = video.getPlayAddr();
            } else {
                videoUrlModel = null;
            }
            c46744IWe.LIZ.LJI = b.LJJIL(videoUrlModel);
            LJFF.LJIIIIZZ(c46744IWe.LIZ());
            JAY.LJII = selectSubscribe.LLIL;
            if (C63081OpJ.LJZL(aweme) && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && (!imageList.isEmpty())) {
                UrlModel displayImageNoWatermark = ((PhotoModeImageUrlModel) ListProtector.get(imageList, 0)).getDisplayImageNoWatermark();
                if (displayImageNoWatermark != null) {
                    list = displayImageNoWatermark.getUrlList();
                }
                W5F LJIIIZ = W5U.LJIIIZ(new C62562cu(list));
                LJIIIZ.LIZJ = selectSubscribe.getContext();
                LJIIIZ.LJI();
            }
        }
        return C76800UCe.LIZ;
    }
}
