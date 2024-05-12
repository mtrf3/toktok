package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.depend.IDDListenerS58S0100000_7;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.canvas.ForwardMusic;
import com.ss.android.ugc.aweme.canvas.ForwardVideo;
import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardVideoPlayerCacheProvider;
import com.ss.android.ugc.aweme.services.story.forward.MediaAuthor;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GbB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41821GbB implements ForwardMediaDownloader, ForwardVideoPlayerCacheProvider {
    public static final C41821GbB LIZ = new C41821GbB();

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0028 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZJ(java.util.List r5, boolean r6) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r5, r0)
            r4.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        Lf:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r3 = r5.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r6 == 0) goto L25
            if (r3 == 0) goto L28
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L2e
        L25:
            r0 = r3
        L26:
            if (r0 != 0) goto L2c
        L28:
            r4.add(r3)
            goto Lf
        L2c:
            r3 = r0
            goto L28
        L2e:
            r1 = 0
            java.lang.String r0 = "http://"
            boolean r0 = ujb.o.LJJJLIIL(r3, r0, r1)
            if (r0 == 0) goto L3d
            com.ss.android.ugc.aweme.share.ShareExtService r0 = X.C4LD.LIZIZ
            r0.LJIIIZ(r3)
            goto L25
        L3d:
            X.PXy r1 = X.C64626PXy.LJIIJJI(r3)
            if (r1 == 0) goto L25
            java.lang.String r2 = "ss_is_p_v_ss"
            java.lang.String r0 = r1.LJIILL(r2)
            if (r0 != 0) goto L25
            X.PXz r1 = r1.LJIIJ()
            java.lang.String r0 = "1"
            r1.LJIIIIZZ(r2, r0)
            java.lang.String r0 = r1.toString()
            goto L26
        L59:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41821GbB.LIZJ(java.util.List, boolean):java.util.List");
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardVideoPlayerCacheProvider
    public final Object copyCache2File(String str, SimVideoUrlModel simVideoUrlModel, InterfaceC67352kd<? super String> interfaceC67352kd) {
        if (simVideoUrlModel == null || !C47242IgQ.LIZ().isCacheCompleted(simVideoUrlModel)) {
            return null;
        }
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        C46728IVo.LJI(simVideoUrlModel, str, false, new GZT(str, c84654XKg));
        return c84654XKg.LIZ();
    }

    public static final void LIZ(List<String> urls, String str, String str2, ForwardMediaDownloader.DownloadListener downloadListener) {
        List<String> list;
        o.LJIIIZ(urls, "urls");
        if (urls.isEmpty()) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(str2);
        if (C39579Fg7.LIZIZ(X1D.LIZIZ(LIZ2)) && downloadListener != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str);
            LIZ3.append(str2);
            downloadListener.onSuccess(X1D.LIZIZ(LIZ3));
        }
        if (urls.size() > 1) {
            list = urls.subList(1, urls.size());
        } else {
            list = C61878OQg.INSTANCE;
        }
        IDDListenerS58S0100000_7 iDDListenerS58S0100000_7 = new IDDListenerS58S0100000_7(downloadListener, 8);
        DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
        X5R with = downloadServiceManager.getDownloadService().with((String) ListProtector.get(urls, 0));
        with.LJIIIIZZ = list;
        with.LIZJ = str2;
        with.LJ = str;
        with.LJII = 3;
        with.LJIJJLI = 3;
        with.LJIIJ = "share_to_story_scene";
        with.LJJI = downloadServiceManager.isAutoRemoveListener();
        with.LJIIL = iDDListenerS58S0100000_7;
        with.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader
    public final void download(ForwardVideo video, ForwardMediaDownloader.DownloadConfig downloadConfig, VideoDownloadPartialResult videoDownloadPartialResult, ForwardMediaDownloader.DownloadListener callback) {
        List<String> LIZJ;
        boolean z;
        List<String> urlList;
        o.LJIIIZ(video, "video");
        o.LJIIIZ(downloadConfig, "downloadConfig");
        o.LJIIIZ(callback, "callback");
        List<String> playAddressList = video.getPlayAddressList();
        if (playAddressList.isEmpty()) {
            return;
        }
        if (downloadConfig.getStreamEditMode() && downloadConfig.getForceCopyUnfinished()) {
            IYN LJIIJJI = C46664ITc.LJIJ.LJIIJJI(video.getAwemeId());
            if (LJIIJJI != null && (urlList = LJIIJJI.urlList()) != null) {
                playAddressList = urlList;
            }
            LIZJ = LIZJ(playAddressList, video.getNeedSetCookie());
        } else {
            LIZJ = LIZJ(playAddressList, video.getNeedSetCookie());
        }
        video.setPlayAddressList(LIZJ);
        String filePath = downloadConfig.getFilePath();
        if (!downloadConfig.getStreamEditMode() && downloadConfig.getWaitDownloadFinished()) {
            z = true;
        } else {
            z = false;
        }
        if (downloadConfig.getStreamEditMode() && downloadConfig.getForce2UseStreamDownloader()) {
            ForwardMediaDownloader.DownloadListener.DefaultImpls.onError$default(callback, ForwardMediaDownloader.DownloadErrorType.LOCAL_FILE_UNAVAILABLE.getValue(), null, null, null, 8, null);
        } else if (!LocalVideoPlayerManager.LIZLLL().LJIIIIZZ(video.getAwemeId(), filePath, new GZG(callback, z, video, downloadConfig))) {
            C46728IVo.LJI(video.getSimVideoUrlModel(), filePath, z, new GZF(z, video, downloadConfig, callback, new C68322mC(), filePath));
        }
    }

    public static C41822GbC LIZIZ(Aweme aweme, String eventType, String str, String str2, int i) {
        List<String> list;
        int width;
        int height;
        String str3;
        String str4;
        String str5;
        UrlModel cover;
        String pastMemoryKey = str;
        String enterMethod = str2;
        String str6 = "";
        if ((i & 4) != 0) {
            pastMemoryKey = "";
        }
        if ((i & 8) != 0) {
            enterMethod = "";
        }
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(pastMemoryKey, "pastMemoryKey");
        o.LJIIIZ(enterMethod, "enterMethod");
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        int awemeType = aweme.getAwemeType();
        List<String> urlList = aweme.getVideo().getPlayAddrH264().getUrlList();
        o.LJIIIIZZ(urlList, "aweme.video.playAddrH264.urlList");
        Video video = aweme.getVideo();
        ForwardMusic forwardMusic = null;
        if (video == null || (cover = video.getCover()) == null || (list = cover.getUrlList()) == null) {
            list = C61878OQg.INSTANCE;
        }
        if (aweme.getVideo().getWidth() <= 0) {
            width = 720;
        } else {
            width = aweme.getVideo().getWidth();
        }
        if (aweme.getVideo().getHeight() <= 0) {
            height = 1280;
        } else {
            height = aweme.getVideo().getHeight();
        }
        int duration = aweme.getVideo().getDuration();
        String meta = aweme.getVideo().getMeta();
        String originUri = aweme.getVideo().getPlayAddr().getOriginUri();
        if (originUri == null) {
            originUri = "";
        }
        String aid2 = aweme.getAid();
        o.LJIIIIZZ(aid2, "aweme.aid");
        ForwardVideo forwardVideo = new ForwardVideo(urlList, list, width, height, duration, meta, originUri, aid2, aweme.getVideo().isNeedSetCookie(), C46728IVo.LIZLLL(aweme), aweme.getVideo().getCachedOuterCoverUrl(), aweme.getVideo().getOriginCover());
        float volLoudUnity = IUB.LIZIZ().getVolLoudUnity();
        User author = aweme.getAuthor();
        if (author != null) {
            str3 = author.getNickname();
        } else {
            str3 = null;
        }
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            str4 = author2.getUid();
        } else {
            str4 = null;
        }
        User author3 = aweme.getAuthor();
        if (author3 != null) {
            str5 = author3.getSecUid();
        } else {
            str5 = null;
        }
        User author4 = aweme.getAuthor();
        if (author4 != null) {
            str6 = C56331M8x.LIZIZ(author4, C30581Hy.LJIJI(eventType), true);
        }
        MediaAuthor mediaAuthor = new MediaAuthor(str3, str4, str5, str6);
        Music music = aweme.getMusic();
        if (music != null) {
            forwardMusic = new ForwardMusic(String.valueOf(music.getId()));
        }
        return new C41822GbC(aid, awemeType, forwardVideo, volLoudUnity, mediaAuthor, forwardMusic, aweme.getPhotoModeImageInfo(), pastMemoryKey, aweme.getCreateTime(), eventType, enterMethod, aweme.aigcInfo.getAIGCLabelType());
    }
}
