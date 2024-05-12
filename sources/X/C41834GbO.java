package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardResult;
import com.ss.android.ugc.aweme.services.story.forward.ForwardVideoPlayerCacheProvider;
import com.ss.android.ugc.aweme.services.story.forward.IStoryForwardService;
import com.ss.android.ugc.aweme.services.story.forward.NormalForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.QuickForwardPublishLock;
import com.ss.android.ugc.aweme.services.story.forward.QuickForwardResult;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS45S1000000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GbO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41834GbO implements GZP {
    public static final C41834GbO LIZ = new C41834GbO();
    public static final C62822Ol8 LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static final C62822Ol8 LIZLLL;
    public static long LJ;

    static {
        C221108m2.LIZIZ(C115484g4.LJLIL);
        LIZIZ = C221108m2.LIZIZ(C41837GbR.LJLIL);
        LIZJ = C221108m2.LIZIZ(C41838GbS.LJLIL);
        LIZLLL = C221108m2.LIZIZ(C41836GbQ.LJLIL);
        LJ = -1L;
    }

    @Override // X.GZP
    public final ForwardImageDownloader LJ() {
        return new GZJ();
    }

    @Override // X.GZP
    public final long LIZIZ() {
        return LJ;
    }

    @Override // X.GZP
    public final ForwardMediaDownloader LJI() {
        return C41821GbB.LIZ;
    }

    @Override // X.GZP
    public final ForwardVideoPlayerCacheProvider LJIIIIZZ() {
        return C41821GbB.LIZ;
    }

    @Override // X.GZP
    public final void LIZ(long j) {
        LJ = j;
    }

    @Override // X.GZP
    public final void LJFF(C41831GbL c41831GbL) {
        View findViewById;
        AKR akr;
        if (L1F.LIZIZ()) {
            if (!C41825GbF.LIZ) {
                C43921HLp.LIZ.LJIIL("QuickShareMgr", (C41833GbN) C41825GbF.LJFF.getValue());
                C41825GbF.LIZ = true;
            }
            QuickForwardPublishLock quickForwardPublishLock = new QuickForwardPublishLock(new MutableLiveData(Boolean.FALSE));
            ForwardResult LJ2 = C41825GbF.LJ(c41831GbL, quickForwardPublishLock, true, C41827GbH.LJLIL);
            o.LJII(LJ2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.story.forward.QuickForwardResult");
            QuickForwardResult quickForwardResult = (QuickForwardResult) LJ2;
            C41825GbF.LIZJ.put(quickForwardResult.getCreationId(), new C41826GbG(quickForwardResult, quickForwardPublishLock));
            return;
        }
        if (((Boolean) L1F.LIZIZ.getValue()).booleanValue()) {
            if (!C41825GbF.LIZ) {
                C43921HLp.LIZ.LJIIL("QuickShareMgr", (C41833GbN) C41825GbF.LJFF.getValue());
                C41825GbF.LIZ = true;
            }
            AKT akt = C41825GbF.LIZIZ;
            if (akt != null && (akr = akt.LIZLLL) != null && akr.isShowing()) {
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(c41831GbL.LJLIL);
                if (LJJIFFI == null) {
                    return;
                }
                C40328FsC.LIZLLL(LJJIFFI, R.string.r6j);
                return;
            }
            QuickForwardPublishLock quickForwardPublishLock2 = new QuickForwardPublishLock(new MutableLiveData(Boolean.FALSE));
            ForwardResult LJ3 = C41825GbF.LJ(c41831GbL, quickForwardPublishLock2, false, null);
            o.LJII(LJ3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.story.forward.QuickForwardResult");
            QuickForwardResult quickForwardResult2 = (QuickForwardResult) LJ3;
            C41825GbF.LIZJ.put(quickForwardResult2.getCreationId(), new C41826GbG(quickForwardResult2, quickForwardPublishLock2));
            String creationId = quickForwardResult2.getCreationId();
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ == null || (findViewById = LJIIIIZZ.getWindow().getDecorView().findViewById(R.id.ncx)) == null) {
                return;
            }
            View decorView = LJIIIIZZ.getWindow().getDecorView();
            o.LJIIIIZZ(decorView, "it.window.decorView");
            int LIZJ2 = C47959Irz.LIZJ(12, C47959Irz.LIZJ(49, C73098SmU.LIZJ(decorView).bottom - C73098SmU.LIZJ(findViewById).bottom));
            AKT akt2 = new AKT(LJIIIIZZ);
            akt2.LJ(R.style.ux);
            akt2.LJI(C86V.LJFF(R.string.ps0));
            C208158Ex c208158Ex = akt2.LIZ;
            c208158Ex.LJLILLLLZI = 0;
            c208158Ex.LJLJJI = 2;
            String LJFF = C86V.LJFF(R.string.prz);
            C208158Ex c208158Ex2 = akt2.LIZ;
            c208158Ex2.LJLJJLL = LJFF;
            c208158Ex2.LJLJL = LIZJ2;
            akt2.LIZJ(((Number) C41839GbT.LIZ.getValue()).longValue() * 1000);
            C41825GbF.LIZIZ = akt2;
            akt2.LIZIZ(new AqS45S1000000_7(creationId, 8));
            AKT akt3 = C41825GbF.LIZIZ;
            if (akt3 == null) {
                return;
            }
            akt3.LIZ.LJLJLJ = new ViewOnClickListenerC41829GbJ(c41831GbL, creationId);
            akt3.LJII();
            return;
        }
        Aweme aweme = c41831GbL.LJLILLLLZI;
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        String authorUid = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid, "aweme.authorUid");
        String secUid = aweme.getAuthor().getSecUid();
        o.LJIIIIZZ(secUid, "aweme.author.secUid");
        String nickname = aweme.getAuthor().getNickname();
        o.LJIIIIZZ(nickname, "aweme.author.nickname");
        IStoryForwardService.DefaultImpls.forward2Story$default(GZM.LIZIZ, c41831GbL.LJLIL, C41821GbB.LIZIZ(aweme, c41831GbL.LJLJI, null, c41831GbL.LJLJJL, 4), new NormalForwardConfig(new VideoShareInfoStruct(aid, authorUid, secUid, nickname)), null, 8, null);
    }

    @Override // X.GZP
    public final boolean LJII(Aweme aweme) {
        InteractPermission interactPermission;
        int i;
        o.LJIIIZ(aweme, "aweme");
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            return false;
        }
        C53578L1a.LIZ.getClass();
        if (!C53578L1a.LIZ() || (interactPermission = aweme.getInteractPermission()) == null || interactPermission.getAllowAddingToStory() != 0) {
            return false;
        }
        Video video = aweme.getVideo();
        if (video != null) {
            i = video.getDuration();
        } else {
            i = Integer.MAX_VALUE;
        }
        if (i > ((Number) LIZJ.getValue()).longValue()) {
            return false;
        }
        if (!C78996UzQ.LJJIIZI(aweme) && !C80S.LJI(aweme)) {
            return false;
        }
        return true;
    }

    @Override // X.GZP
    public final long LJIIIZ(long j) {
        C62822Ol8 c62822Ol8 = LIZLLL;
        Long l = (Long) ((HashMap) c62822Ol8.getValue()).get(Long.valueOf(j));
        if (l != null) {
            ((HashMap) c62822Ol8.getValue()).remove(Long.valueOf(j));
            return l.longValue();
        }
        return -1L;
    }

    @Override // X.GZP
    public final void LIZJ(long j, long j2) {
        ((HashMap) LIZLLL.getValue()).put(Long.valueOf(j), Long.valueOf(j2));
    }

    @Override // X.GZP
    public final void LIZLLL(C41831GbL c41831GbL, InterfaceC65784Pro<C76800UCe> shareFinish) {
        o.LJIIIZ(shareFinish, "shareFinish");
        Aweme aweme = c41831GbL.LJLILLLLZI;
        GZM gzm = GZM.LIZIZ;
        Context context = c41831GbL.LJLIL;
        C41822GbC LIZIZ2 = C41821GbB.LIZIZ(aweme, c41831GbL.LJLJI, c41831GbL.LJLJJI, null, 8);
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        String authorUid = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid, "aweme.authorUid");
        String secUid = aweme.getAuthor().getSecUid();
        o.LJIIIIZZ(secUid, "aweme.author.secUid");
        String nickname = aweme.getAuthor().getNickname();
        o.LJIIIIZZ(nickname, "aweme.author.nickname");
        gzm.forwardOnThisDay(context, LIZIZ2, new NormalForwardConfig(new VideoShareInfoStruct(aid, authorUid, secUid, nickname)), shareFinish);
    }

    @Override // X.GZP
    public final void LJIIJ(String str, Aweme aweme, InterfaceC88472Yns<? super C41835GbP, C41835GbP> interfaceC88472Yns) {
        String str2;
        int i;
        o.LJIIIZ(aweme, "aweme");
        C62822Ol8 c62822Ol8 = LIZIZ;
        Keva keva = (Keva) c62822Ol8.getValue();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("is_first_share_to_story_");
        boolean LIZIZ2 = C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ2, LIZ2, keva, true);
        boolean LJ2 = o.LJ(aweme.getAuthorUid(), ((RBX) HG3.LJIILL()).getCurUserId());
        if (LIZIZ2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aid");
        String authorUid = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid, "authorUid");
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            i = (int) statistics.getShareCount();
        } else {
            i = 0;
        }
        C41835GbP invoke = interfaceC88472Yns.invoke(new C41835GbP(str2, "", aid, authorUid, "", i, "", C222578oP.LJFF(aweme.getAuthor()), 0, "", LJ2 ? 1 : 0));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", invoke.LJLILLLLZI);
        c188727au.LJIIIZ("enter_method", invoke.LJLJJL);
        c188727au.LJIIIZ("is_first", invoke.LJLIL);
        c188727au.LJIIIZ("group_id", invoke.LJLJI);
        c188727au.LJIIIZ("author_id", invoke.LJLJJI);
        c188727au.LIZLLL(invoke.LJLJJLL, "share_cnt");
        c188727au.LIZLLL(invoke.LJLJL, "follow_status");
        c188727au.LIZLLL(invoke.LJLJLJ, "num");
        c188727au.LIZLLL(invoke.LJLJLLL, "is_own_video");
        c188727au.LJIIIZ("position", invoke.LJLL);
        c188727au.LJIIIZ("icon", invoke.LJLLI);
        FMX.LJIIL(str, c188727au.LIZ);
        if (o.LJ(str, "share_to_story_click")) {
            Keva keva2 = (Keva) c62822Ol8.getValue();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("is_first_share_to_story_");
            LIZ3.append(((RBX) HG3.LJIILL()).getCurUserId());
            keva2.storeBoolean(X1D.LIZIZ(LIZ3), false);
        }
    }
}
