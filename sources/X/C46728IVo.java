package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.TtsInfos;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.service.CaptionServiceImpl;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IVo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46728IVo {
    public static List<SimVideoUrlModel> LIZIZ(Aweme aweme) {
        CaptionModel captionModel;
        ArrayList arrayList = new ArrayList();
        if (aweme == null) {
            return arrayList;
        }
        Video video = aweme.getVideo();
        if (video != null && (captionModel = video.getCaptionModel()) != null && captionModel.getCaptionList() != null && !captionModel.getCaptionList().isEmpty()) {
            for (CaptionItemModel captionItemModel : captionModel.getCaptionList()) {
                if (captionItemModel != null) {
                    arrayList.add(LJFF(captionItemModel));
                }
            }
        }
        return arrayList;
    }

    public static List<SimVideoUrlModel> LIZJ(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Audio audio = aweme.getAudio();
        if (audio != null && audio.getTtsInfos() != null && !audio.getTtsInfos().isEmpty()) {
            for (TtsInfos ttsInfos : audio.getTtsInfos()) {
                if (ttsInfos.getPlayAddress() != null) {
                    SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
                    if (ttsInfos.getPlayAddress().getUrlKey() != null) {
                        simVideoUrlModel.setSourceId(ttsInfos.getPlayAddress().getUrlKey());
                    }
                    if (ttsInfos.getPlayAddress().getFileHash() != null) {
                        simVideoUrlModel.setFileHash(ttsInfos.getPlayAddress().getFileHash());
                    }
                    if (ttsInfos.getPlayAddress().getHeight() != null) {
                        simVideoUrlModel.setHeight(ttsInfos.getPlayAddress().getHeight().intValue());
                    }
                    if (ttsInfos.getPlayAddress().getWidth() != null) {
                        simVideoUrlModel.setWidth(ttsInfos.getPlayAddress().getWidth().intValue());
                    }
                    if (ttsInfos.getPlayAddress().getDataSize() != null) {
                        simVideoUrlModel.setSize(ttsInfos.getPlayAddress().getDataSize().longValue());
                    }
                    if (ttsInfos.getPlayAddress().getUri() != null) {
                        simVideoUrlModel.setUri(ttsInfos.getPlayAddress().getUri());
                    }
                    if (ttsInfos.getPlayAddress().getUrlKey() != null) {
                        simVideoUrlModel.setUrlKey(ttsInfos.getPlayAddress().getUrlKey());
                    }
                    if (ttsInfos.getPlayAddress().getUrlList() != null) {
                        simVideoUrlModel.setUrlList(ttsInfos.getPlayAddress().getUrlList());
                    }
                    if (ttsInfos.getPlayAddress().getPlayerAccessKey() != null) {
                        simVideoUrlModel.setaK(ttsInfos.getPlayAddress().getPlayerAccessKey());
                    }
                    arrayList.add(simVideoUrlModel);
                }
            }
        }
        return arrayList;
    }

    public static SimVideoUrlModel LIZLLL(Aweme aweme) {
        SimVideoUrlModel LJJJJI;
        String str;
        if (IVQ.LIZ) {
            LJJJJI = C46767IXb.LIZ(C51029K0z.LJJJJ(aweme.getVideo()), IXN.LIZJ.getPlayerType());
        } else {
            LJJJJI = C51029K0z.LJJJJI(aweme.getVideo().getProperPlayAddr());
        }
        if (LJJJJI == null) {
            return null;
        }
        if (!TextUtils.isEmpty(aweme.getVideo().getVideoModelStr())) {
            LJJJJI.setDashVideoModelStr(aweme.getVideo().getVideoModelStr());
        }
        LJJJJI.setSourceId(aweme.getAid());
        if (aweme.getAwemeType() == 150) {
            str = "mp3";
        } else {
            str = "";
        }
        LJJJJI.setFormat(str);
        LJJJJI.setRatio(aweme.getVideo().getRatio());
        LJJJJI.setScCategory(aweme.isAd() ? 1 : 0);
        return LJJJJI;
    }

    public static int LJ(VideoUrlModel videoUrlModel) {
        return C47242IgQ.LIZ().cacheSize(C51029K0z.LJJJJI(videoUrlModel));
    }

    public static SimVideoUrlModel LJFF(CaptionItemModel captionItemModel) {
        SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
        simVideoUrlModel.setSourceId(String.valueOf(captionItemModel.getSubId()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(captionItemModel.getUrl());
        simVideoUrlModel.setUrlList(arrayList);
        simVideoUrlModel.setUri(String.valueOf(captionItemModel.getSubId()));
        return simVideoUrlModel;
    }

    public static List<SimVideoUrlModel> LJIIIIZZ(Aweme aweme) {
        CaptionModel captionModel;
        if (aweme == null) {
            return null;
        }
        if (C00F.LIZ(31744, 0, "player_preload_when_subtitles_are_displayed", true) == 1 && CaptionServiceImpl.LJIILIIL().LIZIZ(aweme)) {
            return null;
        }
        if (C00F.LIZ(31744, 0, "player_only_prefetch_initial_cla_caption", true) == 1) {
            ArrayList arrayList = new ArrayList();
            Video video = aweme.getVideo();
            if (video != null && (captionModel = video.getCaptionModel()) != null && captionModel.getCaptionList() != null && !captionModel.getCaptionList().isEmpty()) {
                C46259IDn LIZ = IQ6.LIZ(aweme, -1, null);
                for (CaptionItemModel captionItemModel : captionModel.getCaptionList()) {
                    if (captionItemModel != null && LIZ != null && captionItemModel.getSubId() == LIZ.LIZ) {
                        arrayList.add(LJFF(captionItemModel));
                    }
                }
            }
            return arrayList;
        }
        return LIZIZ(aweme);
    }

    public static long LJIIIZ(VideoUrlModel videoUrlModel) {
        return C47242IgQ.LIZ().LIZIZ(C51029K0z.LJJJJI(videoUrlModel));
    }

    public static boolean LJIIJ(Aweme aweme) {
        return C47242IgQ.LIZ().isCacheCompleted(LIZLLL(aweme));
    }

    public static void LJIILJJIL(Aweme aweme) {
        if (aweme != null && !aweme.isLive() && aweme.getVideo() != null && aweme.getVideo().getProperPlayAddr() != null && C47242IgQ.LIZ() != null) {
            C47335Ihv.LIZ();
            C47242IgQ.LIZ().LJIIJ(LJIIIIZZ(aweme));
        }
    }

    public static boolean LJIIL(int i, Aweme aweme) {
        int i2;
        if (aweme == null || aweme.isLive() || aweme.getVideo() == null || aweme.getVideo().getProperPlayAddr() == null || C47242IgQ.LIZ() == null) {
            return false;
        }
        C47335Ihv.LIZ();
        SimVideoUrlModel LIZLLL = LIZLLL(aweme);
        if (C00F.LIZ(31744, 0, "player_preload_subtitles_limit", true) == 1) {
            boolean LJIIIZ = C47242IgQ.LIZ().LJIIIZ(LIZLLL, i, null, 0, null, 0);
            C46464ILk.LIZ(LIZLLL, LJIIIZ, i);
            return LJIIIZ;
        }
        if (i > 0) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = 0;
        }
        List<SimVideoUrlModel> LIZJ = LIZJ(aweme);
        boolean LJIIIZ2 = C47242IgQ.LIZ().LJIIIZ(LIZLLL, i, LJIIIIZZ(aweme), i2, LIZJ, i2);
        C46464ILk.LIZ(LIZLLL, LJIIIZ2, i);
        return LJIIIZ2;
    }

    public static void LJIILIIL(int i, List list) {
        if (list == null || list.size() == 0 || i < 0 || i >= list.size()) {
            return;
        }
        LJIIL(0, (Aweme) ListProtector.get(list, i));
    }

    public static void LJIILL(int i, Aweme aweme) {
        if (aweme != null && !aweme.isLive() && aweme.getVideo() != null && aweme.getVideo().getProperPlayAddr() != null && C47242IgQ.LIZ() != null) {
            C47335Ihv.LIZ();
            C47242IgQ.LIZ().LJIIIZ(LIZLLL(aweme), i, null, 0, null, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (((java.lang.Number) r3.getValue()).doubleValue() != 1.0d) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(com.ss.android.ugc.aweme.feed.model.Aweme r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46728IVo.LJII(com.ss.android.ugc.aweme.feed.model.Aweme, int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (X.C00F.LIZ(31744, 0, "player_preload_subtitles_delay", true) == 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(com.ss.android.ugc.aweme.feed.model.Aweme[] r11, int r12, boolean r13) {
        /*
            if (r11 == 0) goto L5
            int r0 = r11.length
            if (r0 > 0) goto L6
        L5:
            return
        L6:
            int r7 = r11.length
            r6 = 0
            r5 = 0
            r3 = r5
            r4 = r5
            r2 = 0
        Lc:
            if (r2 >= r7) goto L92
            r8 = r11[r2]
            java.util.List r0 = LIZIZ(r8)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L90
            r1 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "player_preload_subtitles_delay"
            r9 = 1
            int r0 = X.C00F.LIZ(r1, r6, r0, r9)
            if (r0 != r9) goto L90
        L27:
            boolean r0 = X.FN9.LJFF
            if (r0 == 0) goto L2f
            boolean r0 = X.C35810E3q.LJFF
            if (r0 != 0) goto L31
        L2f:
            if (r13 == 0) goto L44
        L31:
            X.2NG r0 = X.C57022Lq.LIZ
            android.os.Handler r10 = r0.LJLIL
            Y.ARunnableS12S0101000_8 r9 = new Y.ARunnableS12S0101000_8
            r0 = 22
            r9.<init>(r12, r8, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r10.postDelayed(r9, r0)
        L41:
            int r2 = r2 + 1
            goto Lc
        L44:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            if (r1 != r0) goto L80
            X.Ol8 r0 = X.C2XT.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L80
            if (r5 != 0) goto L63
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
        L63:
            Y.ARunnableS1S0111000_8 r1 = new Y.ARunnableS1S0111000_8
            r0 = 0
            r1.<init>(r8, r12, r9, r0)
            r5.add(r1)
            if (r9 == 0) goto L41
            if (r3 != 0) goto L75
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
        L75:
            X.0BU r1 = new X.0BU
            r0 = 9
            r1.<init>(r0, r8)
            r3.add(r1)
            goto L41
        L80:
            LJII(r8, r12, r9)
            if (r9 == 0) goto L41
            if (r4 != 0) goto L8c
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
        L8c:
            r4.add(r8)
            goto L41
        L90:
            r9 = 0
            goto L27
        L92:
            if (r5 == 0) goto Lac
            if (r3 == 0) goto L99
            r5.addAll(r3)
        L99:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>(r5)
            android.os.MessageQueue r2 = android.os.Looper.myQueue()
            X.4eC r1 = new X.4eC
            r0 = 30
            r1.<init>()
            X.C16880lQ.LJLI(r2, r1)
        Lac:
            if (r4 == 0) goto L5
            java.util.Iterator r1 = r4.iterator()
        Lb2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            LJIILJJIL(r0)
            goto Lb2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46728IVo.LJIIJJI(com.ss.android.ugc.aweme.feed.model.Aweme[], int, boolean):void");
    }

    public static void LJI(SimVideoUrlModel simVideoUrlModel, String str, boolean z, InterfaceC47084Ids interfaceC47084Ids) {
        InterfaceC46732IVs LIZ = C47242IgQ.LIZ();
        if (LIZ != null) {
            LIZ.LIZJ(simVideoUrlModel, str, z, interfaceC47084Ids);
        }
    }

    public static void LIZ(List<Aweme> list, boolean z, boolean z2, String str, String str2) {
        if (C38891fp.LJJI(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Aweme> it = list.iterator();
        while (it.hasNext()) {
            SimVideoUrlModel LIZLLL = LIZLLL(it.next());
            if (LIZLLL != null) {
                LIZLLL.setSubTag(str2);
            }
            arrayList.add(LIZLLL);
        }
        C47242IgQ.LIZ().addMedias(arrayList, z, z2, str);
    }
}
