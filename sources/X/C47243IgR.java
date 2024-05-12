package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.models.NowFeedResponse;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import com.ss.android.ugc.aweme.now.NowIntroductionVideoInfo;
import com.ss.android.ugc.aweme.now.NowIntroductionVideoReplica;
import com.ss.android.ugc.aweme.nows.api.NowFeedPreload;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.IgR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47243IgR implements X8Q {
    @Override // X.X8Q
    public final void LIZ(Exception exception) {
        o.LJIIIZ(exception, "exception");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.X8Q
    public final void onSuccess(Object obj) {
        Integer num;
        int i;
        if (obj instanceof C64797Pbt) {
            C64797Pbt c64797Pbt = (C64797Pbt) obj;
            if ((c64797Pbt.LIZIZ instanceof NowFeedResponse) && !Z89.LIZIZ.LJIIL()) {
                T t = c64797Pbt.LIZIZ;
                o.LJII(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.models.NowFeedResponse");
                NowFeedResponse nowFeedResponse = (NowFeedResponse) t;
                C78596Usy.LJJIFFI().LIZLLL.LLIIIZ(nowFeedResponse);
                List<Aweme> awemes = nowFeedResponse.getData();
                o.LJIIIZ(awemes, "awemes");
                C72085SQv.LJ(new AqS153S0100000_3((List) awemes, (List<? extends Aweme>) 1552));
                C7XC c7xc = NowFeedPreload.Companion;
                NowIntroductionVideoInfo nowIntroductionVideoInfo = nowFeedResponse.introductionVideoInfo;
                c7xc.getClass();
                if (nowIntroductionVideoInfo == null) {
                    return;
                }
                C46988IcK LJIIJ = C1DG.LIZ().LJIIJ();
                C44421Hc1 c44421Hc1 = new C44421Hc1();
                c44421Hc1.LIZIZ = nowIntroductionVideoInfo.videoId;
                List<NowIntroductionVideoReplica> list = nowIntroductionVideoInfo.videoModels;
                if (list != null) {
                    for (NowIntroductionVideoReplica nowIntroductionVideoReplica : list) {
                        if (nowIntroductionVideoReplica != null && (num = nowIntroductionVideoReplica.codecType) != null) {
                            if (num.intValue() == 0) {
                                i = 0;
                            } else if (num.intValue() == 1) {
                                i = 1;
                            } else if (num.intValue() == 2) {
                                i = 2;
                            }
                            C44398Hbe c44398Hbe = new C44398Hbe(c44421Hc1);
                            c44398Hbe.LIZIZ = nowIntroductionVideoReplica.fileId;
                            c44398Hbe.LIZJ = i;
                            c44398Hbe.LIZLLL = nowIntroductionVideoReplica.urls;
                            Long l = nowIntroductionVideoReplica.size;
                            if (l != null) {
                                c44398Hbe.LJ = l.longValue();
                            }
                            o.LJIIIIZZ(c44398Hbe.LIZ(), "createPlayItem()\n       …}\n        .addToBuilder()");
                        }
                    }
                }
                C44412Hbs LIZ = c44421Hc1.LIZ();
                C46812IYu c46812IYu = LIZ.LIZIZ;
                c46812IYu.LJII = true;
                c46812IYu.LJIIIIZZ = false;
                c46812IYu.LIZIZ = false;
                c46812IYu.LJ = 0;
                LIZ.LIZJ = 0L;
                C44421Hc1 c44421Hc12 = LIZ.LIZ;
                c44421Hc12.LJ = LIZ;
                List LJJIJ = C47261Igj.LJJIJ(new C197057oL(EnumC197067oM.VIDEO, new C44388HbU(c44421Hc12).LIZ(), 4).LIZIZ);
                LJIIJ.getClass();
                if (LJJIJ.size() != 0) {
                    Iterator it = LJJIJ.iterator();
                    while (it.hasNext()) {
                        SimVideoUrlModel LJFF = IXM.LJFF(C46810IYs.LIZIZ((InterfaceC46811IYt) it.next()));
                        if (LJFF != null && LJFF.getUrlList() != null && LJFF.getUrlList().size() != 0) {
                            C16880lQ.LLLZ("user actively preload --> URI:%s, size:%sKB, url:%s", new Object[]{LJFF.getUri(), 524288, ListProtector.get(LJFF.getUrlList(), 0)});
                            C47242IgQ.LIZ().preload(LJFF, 524288);
                        }
                    }
                    return;
                }
                C16880lQ.LLLZ("user actively preload, error -->playList:%s, size:%s", new Object[]{LJJIJ, 512});
                return;
            }
        }
        NowFeedPreload.Companion.getClass();
        NowFeedPreload.preloadAbort = true;
        PowerPreloadServiceImpl.LIZIZ().LIZ("/tiktok/v1/now/feed", null);
    }
}
