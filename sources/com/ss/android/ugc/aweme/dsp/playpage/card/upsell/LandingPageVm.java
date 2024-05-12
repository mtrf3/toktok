package com.ss.android.ugc.aweme.dsp.playpage.card.upsell;

import X.C61878OQg;
import X.C65352Pkq;
import X.C78404Ups;
import X.C78613UtF;
import X.C91226ZrC;
import X.C91395Ztv;
import X.C91463Zv1;
import X.C91464Zv2;
import X.C91508Zvk;
import X.C91509Zvl;
import X.C91606ZxK;
import X.EV6;
import X.EnumC91294ZsI;
import X.InterfaceC57784Mm4;
import X.ORZ;
import X.XKX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dsp.common.model.DspDetailListResponse;
import com.ss.android.ugc.aweme.dsp.common.model.DspMusicStruct;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.dsp.common.model.TTMArtistStruct;
import com.ss.android.ugc.aweme.music.model.Dsp;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicPerformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class LandingPageVm extends AssemViewModel<C91464Zv2> {
    public final EV6 LJLIL = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C91463Zv1.class));
    public List<? extends InterfaceC57784Mm4> LJLILLLLZI = C61878OQg.INSTANCE;
    public C91395Ztv LJLJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C91464Zv2 defaultState() {
        return new C91464Zv2(EnumC91294ZsI.LOADING, C61878OQg.INSTANCE);
    }

    public final void gv0() {
        XKX.LIZLLL(getAssemVMScope(), C78613UtF.LIZJ, null, new C91606ZxK(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(X.InterfaceC67352kd<? super X.C76800UCe> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C91534ZwA
            if (r0 == 0) goto L22
            r3 = r6
            X.ZwA r3 = (X.C91534ZwA) r3
            int r2 = r3.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r3.LJLJJI = r2
        L12:
            java.lang.Object r4 = r3.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJJI
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            java.lang.Object r3 = r3.LJLIL
            com.ss.android.ugc.aweme.dsp.playpage.card.upsell.LandingPageVm r3 = (com.ss.android.ugc.aweme.dsp.playpage.card.upsell.LandingPageVm) r3
            goto L63
        L22:
            X.ZwA r3 = new X.ZwA
            r3.<init>(r5, r6)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r4)
            java.util.List<? extends X.Mm4> r0 = r5.LJLILLLLZI
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L71
            X.ZwB r0 = X.C91535ZwB.LJLIL     // Catch: java.lang.Exception -> L73
            r5.setState(r0)     // Catch: java.lang.Exception -> L73
            X.EV6 r0 = r5.LJLIL     // Catch: java.lang.Exception -> L73
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L73
            X.8aw r0 = (X.InterfaceC214228aw) r0     // Catch: java.lang.Exception -> L73
            X.3e4 r0 = r0.getOperator()     // Catch: java.lang.Exception -> L73
            X.Zv0 r0 = (X.C91462Zv0) r0     // Catch: java.lang.Exception -> L73
            r3.LJLIL = r5     // Catch: java.lang.Exception -> L73
            r3.LJLJJI = r1     // Catch: java.lang.Exception -> L73
            r0.getClass()     // Catch: java.lang.Exception -> L73
            com.ss.android.ugc.aweme.dsp.common.api.MusicDspApi$MusicDspOperatorApi r1 = X.C91086Zow.LIZ()     // Catch: java.lang.Exception -> L73
            r0 = 2
            java.lang.Object r4 = r1.getLandingPageInfo(r0, r3)     // Catch: java.lang.Exception -> L73
            if (r4 != r2) goto L61
            return r2
        L61:
            r3 = r5
            goto L66
        L63:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Exception -> L6f
        L66:
            com.ss.android.ugc.aweme.dsp.common.model.DspDetailListResponse r4 = (com.ss.android.ugc.aweme.dsp.common.model.DspDetailListResponse) r4     // Catch: java.lang.Exception -> L6f
            java.util.List r0 = r3.iv0(r4)     // Catch: java.lang.Exception -> L6f
            r3.LJLILLLLZI = r0     // Catch: java.lang.Exception -> L6f
            goto L94
        L6f:
            r2 = move-exception
            goto L75
        L71:
            r3 = r5
            goto L94
        L73:
            r2 = move-exception
            r3 = r5
        L75:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = " error :"
            r1.append(r0)
            java.lang.Class r0 = r2.getClass()
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            X.X1D.LIZIZ(r1)
        L94:
            java.util.List<? extends X.Mm4> r0 = r3.LJLILLLLZI
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La4
            X.ZwC r0 = X.C91536ZwC.LJLIL
            r3.setState(r0)
        La1:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        La4:
            java.util.List<? extends X.Mm4> r0 = r3.LJLILLLLZI
            r0.size()
            kotlin.jvm.internal.IDqS417S0100000_29 r1 = new kotlin.jvm.internal.IDqS417S0100000_29
            r0 = 7
            r1.<init>(r3, r0)
            r3.setState(r1)
            goto La1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playpage.card.upsell.LandingPageVm.hv0(X.2kd):java.lang.Object");
    }

    public final List<InterfaceC57784Mm4> iv0(DspDetailListResponse dspDetailListResponse) {
        List<DspStruct> dspList;
        UrlModel urlModel;
        String fullClipAuthor;
        Object c91509Zvl;
        MatchedSoundInfo matchedSongInfo;
        List<MusicPerformer> performers;
        MusicPerformer musicPerformer;
        String name;
        String str;
        long j;
        String name2;
        if (dspDetailListResponse.error_code != 0 || (dspList = dspDetailListResponse.getDspList()) == null || dspList.isEmpty()) {
            return C61878OQg.INSTANCE;
        }
        List<DspStruct> dspList2 = dspDetailListResponse.getDspList();
        ArrayList arrayList = new ArrayList();
        for (DspStruct dspStruct : dspList2) {
            String str2 = "";
            String str3 = null;
            UrlModel urlModel2 = null;
            if (dspStruct.getTtmArtist() != null) {
                TTMArtistStruct ttmArtist = dspStruct.getTtmArtist();
                if (ttmArtist == null || (str = ttmArtist.getId()) == null) {
                    str = "";
                }
                TTMArtistStruct ttmArtist2 = dspStruct.getTtmArtist();
                if (ttmArtist2 != null) {
                    urlModel2 = ttmArtist2.getCover();
                }
                TTMArtistStruct ttmArtist3 = dspStruct.getTtmArtist();
                if (ttmArtist3 != null && (name2 = ttmArtist3.getName()) != null) {
                    str2 = name2;
                }
                TTMArtistStruct ttmArtist4 = dspStruct.getTtmArtist();
                if (ttmArtist4 != null) {
                    j = ttmArtist4.getCountAlbums();
                } else {
                    j = 0;
                }
                c91509Zvl = new C91508Zvk(str, urlModel2, str2, j, dspStruct.getDspExtra(), this.LJLJI, null, null);
            } else {
                String LIZ = C91226ZrC.LIZ(dspStruct.getDspMusic());
                Music music = dspStruct.getDspMusic().getMusic();
                if (music != null) {
                    urlModel = music.getCoverMedium();
                } else {
                    urlModel = null;
                }
                Music music2 = dspStruct.getDspMusic().getMusic();
                if (music2 != null) {
                    str3 = music2.getMusicName();
                }
                DspMusicStruct dspMusic = dspStruct.getDspMusic();
                Music music3 = dspMusic.getMusic();
                if (music3 == null || (matchedSongInfo = music3.getMatchedSongInfo()) == null || (performers = matchedSongInfo.getPerformers()) == null || (musicPerformer = (MusicPerformer) ORZ.LJLLLL(performers)) == null || (name = musicPerformer.getName()) == null) {
                    Dsp musicDspInfo = dspMusic.getMusicDspInfo();
                    if (musicDspInfo != null && (fullClipAuthor = musicDspInfo.getFullClipAuthor()) != null) {
                        str2 = fullClipAuthor;
                    }
                } else {
                    str2 = name;
                }
                Long newReleaseStartTime = dspStruct.getDspMusic().getNewReleaseStartTime();
                Long countPlayed = dspStruct.getDspMusic().getCountPlayed();
                Boolean isNewRelease = dspStruct.getDspMusic().isNewRelease();
                Boolean bool = Boolean.TRUE;
                c91509Zvl = new C91509Zvl(LIZ, urlModel, str3, str2, newReleaseStartTime, countPlayed, o.LJ(isNewRelease, bool), o.LJ(dspStruct.getDspMusic().isHot(), bool), dspStruct.getDspExtra(), this.LJLJI, null, null);
            }
            arrayList.add(c91509Zvl);
        }
        return ORZ.LLJI(arrayList);
    }
}
