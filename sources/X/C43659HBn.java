package X;

import Y.ARunnableS17S0201000_14;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import defpackage.e1;
import defpackage.m0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.HBn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43659HBn implements InterfaceC73592SuS, InterfaceC82518Wa2, InterfaceC38688FGi, C68K, InterfaceC48038ItG {
    public static Boolean LJLIL = null;
    public static int LJLILLLLZI = -1;
    public static final C43659HBn LJLJI = new C43659HBn();
    public static final C43659HBn LJLJJI = new C43659HBn();

    @Override // X.C68K
    public boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC82518Wa2
    public void LIZIZ() {
    }

    public boolean LJ() {
        return false;
    }

    public boolean LJFF() {
        return false;
    }

    public void LJI(String str) {
    }

    public void LJJII() {
        throw null;
    }

    public void LJJIII() {
    }

    public String getCurrentUid() {
        return "";
    }

    public void onEvent(String eventName) {
        o.LJIIJ(eventName, "eventName");
    }

    public static final S3L LJIIL() {
        S3I s3i = new S3I();
        s3i.LIZ = true;
        return s3i.LIZ();
    }

    public static boolean LJJ() {
        if (FRE.LIZ) {
            if (LJLIL == null) {
                LJLIL = m0.LIZIZ(31744, "enable_benchmark_performance", true, false);
            }
            return LJLIL.booleanValue();
        }
        return e1.LIZ(31744, "enable_benchmark_performance", true, false);
    }

    public static boolean LJJI() {
        if (LJLILLLLZI == -1) {
            if (C19N.LJ("benchmark_poor_perf_device", false)) {
                LJLILLLLZI = 1;
            } else {
                LJLILLLLZI = 0;
            }
        }
        if (LJLILLLLZI > 0) {
            return true;
        }
        return false;
    }

    public static final void LJIIIIZZ(AwemeDraft awemeDraft) {
        EditPreviewInfo editPreviewInfo;
        List<EditVideoSegment> videoList;
        MultiEditVideoRecordData multiEditVideoRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        MultiEditVideoRecordData multiEditVideoRecordData3;
        MultiEditVideoRecordData multiEditVideoRecordData4;
        List<EditVideoSegment> LJ;
        EditPreviewInfo LIZJ = C41802Gas.LIZJ(awemeDraft);
        if (LIZJ != null && (LJ = C41802Gas.LJ(awemeDraft)) != null && !LJ.isEmpty() && LJ.size() == LIZJ.getVideoList().size()) {
            int size = LJ.size();
            for (int i = 0; i < size; i++) {
                ListProtector.set(LIZJ.getVideoList(), i, EditVideoSegment.copy$default((EditVideoSegment) ListProtector.get(LJ, i), null, null, null, null, 15, null));
            }
        }
        HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(new OSZ(C43075GvP.LIZIZ, LJIJJLI(awemeDraft)), new OSZ(C43075GvP.LJ, LJIJJ(awemeDraft)));
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = awemeDraft.LJJJJI.multiEditVideoData;
        if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData4 = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null) {
            LJIIIZ(multiEditVideoRecordData4, LJJJLZIJ, awemeDraft.LIZIZ());
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = awemeDraft.LJJJJI.multiEditVideoData;
        if (multiEditVideoStatusRecordData2 != null && (multiEditVideoRecordData3 = multiEditVideoStatusRecordData2.originMultiEditRecordData) != null) {
            LJIIIZ(multiEditVideoRecordData3, LJJJLZIJ, awemeDraft.LIZIZ());
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData3 = awemeDraft.LJJJJI.multiEditVideoData;
        if (multiEditVideoStatusRecordData3 != null && (multiEditVideoRecordData2 = multiEditVideoStatusRecordData3.restoreMultiEditVideoRecordData) != null) {
            LJIIIZ(multiEditVideoRecordData2, LJJJLZIJ, awemeDraft.LIZIZ());
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData4 = awemeDraft.LJJJJI.multiEditVideoData;
        if (multiEditVideoStatusRecordData4 != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData4.singleRestoreMultiEditRecordData) != null) {
            LJIIIZ(multiEditVideoRecordData, LJJJLZIJ, awemeDraft.LIZIZ());
        }
        if ((awemeDraft.LJIIL() || awemeDraft.LJJJJI.canvasVideoData != null) && (editPreviewInfo = awemeDraft.LJJJJI.previewInfo) != null && (videoList = editPreviewInfo.getVideoList()) != null) {
            for (EditVideoSegment editVideoSegment : videoList) {
                if (editVideoSegment.getVideoPath().length() > 0) {
                    C78966Uyw.LJJJJZ(new File(editVideoSegment.getVideoPath()));
                }
            }
        }
        HashMap LJJJLZIJ2 = C113554cx.LJJJLZIJ(new OSZ(C43075GvP.LIZIZ, LJIJJLI(awemeDraft)), new OSZ(C43075GvP.LJ, LJIJJ(awemeDraft)));
        try {
            C42083GfP.LIZ(AVDraftExtras.class, InterfaceC43620HAa.class).LIZIZ(awemeDraft.LJJJJI, new GPZ(LJJJLZIJ2));
        } catch (Throwable unused) {
        }
        try {
            C42083GfP.LIZ(CreativeModel.class, InterfaceC43620HAa.class).LIZIZ(awemeDraft.LIZ, new GPZ(LJJJLZIJ2));
        } catch (Throwable unused2) {
        }
    }

    public static final void LJIIJ(AwemeDraft awemeDraft) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        MultiEditVideoRecordData multiEditVideoRecordData3;
        MultiEditVideoRecordData multiEditVideoRecordData4;
        o.LJIIIZ(awemeDraft, "<this>");
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = awemeDraft.LJJJJI.multiEditVideoData;
        if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData4 = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null) {
            LJIIJJI(multiEditVideoRecordData4);
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = awemeDraft.LJJJJI.multiEditVideoData;
        if (multiEditVideoStatusRecordData2 != null && (multiEditVideoRecordData3 = multiEditVideoStatusRecordData2.originMultiEditRecordData) != null) {
            LJIIJJI(multiEditVideoRecordData3);
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData3 = awemeDraft.LJJJJI.multiEditVideoData;
        if (multiEditVideoStatusRecordData3 != null && (multiEditVideoRecordData2 = multiEditVideoStatusRecordData3.restoreMultiEditVideoRecordData) != null) {
            LJIIJJI(multiEditVideoRecordData2);
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData4 = awemeDraft.LJJJJI.multiEditVideoData;
        if (multiEditVideoStatusRecordData4 != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData4.singleRestoreMultiEditRecordData) != null) {
            LJIIJJI(multiEditVideoRecordData);
        }
    }

    public static final void LJIIJJI(MultiEditVideoRecordData multiEditVideoRecordData) {
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        if (list != null) {
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                multiEditVideoSegmentRecordData.draftVideoPath = multiEditVideoSegmentRecordData.videoPath;
                multiEditVideoSegmentRecordData.draftAudioPath = multiEditVideoSegmentRecordData.audioPath;
            }
        }
    }

    public static void LJIILJJIL(List list) {
        HME.LIZ = list;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ShareChannelInfo shareChannelInfo = (ShareChannelInfo) it.next();
                W5U.LJIIIIZZ(shareChannelInfo.iconRes).LJIIIZ(new HMF(shareChannelInfo));
                arrayList.add(C76800UCe.LIZ);
            }
        }
    }

    public static void LJIILL(List list) {
        C62397OeH.LIZJ().LIZIZ = list;
    }

    public static void LJIILLIIL(List list) {
        C62397OeH.LIZJ().LIZ = list;
    }

    public static final String LJIJJ(AwemeDraft awemeDraft) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C43075GvP.LJFF);
        LIZ.append(C38352F3k.LIZJ(LJIL(awemeDraft)));
        LIZ.append(File.separator);
        return X1D.LIZIZ(LIZ);
    }

    public static final String LJIJJLI(AwemeDraft awemeDraft) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C43075GvP.LIZJ);
        LIZ.append(C38352F3k.LIZJ(LJIL(awemeDraft)));
        LIZ.append(File.separator);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String LJIL(AwemeDraft awemeDraft) {
        EditPreviewInfo LIZJ;
        String str;
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        MultiEditVideoRecordData multiEditVideoRecordData;
        String str2;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = awemeDraft.LJJJJI.multiEditVideoData;
        if (multiEditVideoStatusRecordData == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) == null || (str2 = multiEditVideoRecordData.concatVideo) == null || str2.length() == 0) {
            StitchParams stitchParams = awemeDraft.LJJJJI.stitchParams;
            if ((stitchParams == null || (str = stitchParams.getConcatVideoPath()) == null || str.length() == 0) && ((LIZJ = C41802Gas.LIZJ(awemeDraft)) == null || (videoList = LIZJ.getVideoList()) == null || (editVideoSegment = (EditVideoSegment) ORZ.LJLLLL(videoList)) == null || (str = editVideoSegment.getVideoPath()) == null)) {
                str = "";
            }
        } else {
            str = multiEditVideoRecordData.concatVideo;
        }
        String valueOf = String.valueOf(str);
        if (awemeDraft.LJJJJI.isFastImport) {
            if (TextUtils.isEmpty(awemeDraft.LIZIZ().getCreationId())) {
                awemeDraft.LJIILIIL(new CreativeInfo(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
            }
            return awemeDraft.LIZIZ().getCreationId();
        }
        return valueOf;
    }

    public static final void LJJIIJ(AwemeDraft awemeDraft) {
        o.LJIIIZ(awemeDraft, "<this>");
        String str = awemeDraft.LJJJJI.videoCoverPath;
        if (str == null || str.length() == 0) {
            return;
        }
        if ((awemeDraft.LJJJJI.canvasVideoData != null || awemeDraft.LJIIJJI() || awemeDraft.LJIIL()) && !C1B6.LIZIZ(str)) {
            awemeDraft.LJJJJI.videoCoverPath = "";
        }
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        int i;
        C81154Vt8 output = (C81154Vt8) obj;
        o.LJIIIZ(output, "output");
        Integer LIZJ = output.LIZJ();
        if (LIZJ != null) {
            i = LIZJ.intValue();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        CJ5 event = (CJ5) obj;
        o.LJIIIZ(event, "event");
        if (event.LIZ != null) {
            return true;
        }
        return false;
    }

    public static final void LJIILIIL(W5F w5f, EnumC61782be cacheChoice) {
        o.LJIIIZ(cacheChoice, "cacheChoice");
        if (HK5.LIZIZ) {
            w5f.LJJIII = EnumC62195Ob1.CUSTOM;
            w5f.LJJJ = cacheChoice.getSpace();
        }
    }

    public static final boolean LJJIFFI(android.net.Uri uri, InterfaceC65784Pro getNtpTime) {
        int i;
        o.LJIIIZ(getNtpTime, "getNtpTime");
        String queryParameter = UriProtector.getQueryParameter(uri, "x-expires");
        if (queryParameter != null) {
            i = CastIntegerProtector.parseInt(queryParameter);
        } else {
            i = Integer.MAX_VALUE;
        }
        if (((Number) getNtpTime.invoke()).intValue() >= i) {
            return true;
        }
        return false;
    }

    public static final void LJII(java.util.Map map, String str, InterfaceC88472Yns interfaceC88472Yns) {
        Object obj;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (ujb.o.LJJJLIIL(str, (String) obj, false)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append((String) map.get(str2));
            LIZ.append(s.LJJLL(str2, str));
            interfaceC88472Yns.invoke(X1D.LIZIZ(LIZ));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIIIZ(MultiEditVideoRecordData multiEditVideoRecordData, java.util.Map map, CreativeInfo creativeInfo) {
        Object obj;
        String LIZLLL;
        String str = multiEditVideoRecordData.curRecordingDir;
        if (str == null || str.length() == 0) {
            return;
        }
        String curRecordingDir = multiEditVideoRecordData.curRecordingDir;
        o.LJIIIIZZ(curRecordingDir, "curRecordingDir");
        multiEditVideoRecordData.curRecordingDir = C78966Uyw.LJIJJLI(curRecordingDir);
        HashMap hashMap = (HashMap) map;
        Iterator it = hashMap.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                String curRecordingDir2 = multiEditVideoRecordData.curRecordingDir;
                o.LJIIIIZZ(curRecordingDir2, "curRecordingDir");
                if (ujb.o.LJJJLIIL(curRecordingDir2, (String) obj, false)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append((String) hashMap.get(str2));
            String curRecordingDir3 = multiEditVideoRecordData.curRecordingDir;
            o.LJIIIIZZ(curRecordingDir3, "curRecordingDir");
            LIZ.append(s.LJJLL(str2, curRecordingDir3));
            multiEditVideoRecordData.curRecordingDir = X1D.LIZIZ(LIZ);
        }
        CreativeInfo creativeInfo2 = new CreativeInfo(creativeInfo.getCreationId(), creativeInfo.getVersion() + 1, null, 4, 0 == true ? 1 : 0);
        String LIZIZ = C60903NvH.LJIIJJI().LJJIJL().getPathService().LIZIZ(creativeInfo);
        String LIZIZ2 = C60903NvH.LJIIJJI().LJJIJL().getPathService().LIZIZ(creativeInfo2);
        String curRecordingDir4 = multiEditVideoRecordData.curRecordingDir;
        o.LJIIIIZZ(curRecordingDir4, "curRecordingDir");
        if (ujb.o.LJJJLIIL(curRecordingDir4, LIZIZ, false)) {
            StringBuilder LIZJ = C278817o.LIZJ(LIZIZ2);
            String curRecordingDir5 = multiEditVideoRecordData.curRecordingDir;
            o.LJIIIIZZ(curRecordingDir5, "curRecordingDir");
            LIZJ.append(s.LJJLL(LIZIZ, curRecordingDir5));
            LIZLLL = LIZJ.toString();
        } else {
            InterfaceC43072GvM LJ = C62850Ola.LJ();
            EnumC43649HBd enumC43649HBd = EnumC43649HBd.EXTERNAL_RESTORE;
            String curRecordingDir6 = multiEditVideoRecordData.curRecordingDir;
            o.LJIIIIZZ(curRecordingDir6, "curRecordingDir");
            String absolutePath = C60903NvH.LJ.getFilesDir().getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "getApplication().filesDir.absolutePath");
            LIZLLL = C43073GvN.LIZLLL(LJ, creativeInfo2, enumC43649HBd, s.LJJLL(C78966Uyw.LJIJJLI(absolutePath), curRecordingDir6), false, 8);
        }
        multiEditVideoRecordData.curRecordingDir = LIZLLL;
    }

    public static void LJIJI(W5F w5f, String str, C81929WDl c81929WDl, int i) {
        int i2;
        if ((i & 2) != 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            c81929WDl = null;
        }
        w5f.LIZLLL(new C49L(i2, w5f, c81929WDl, str));
    }

    public static void LJIJ(W5F w5f, final String scene, final boolean z, final C81929WDl c81929WDl, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            c81929WDl = null;
        }
        o.LJIIIZ(w5f, "<this>");
        o.LJIIIZ(scene, "scene");
        w5f.LIZLLL(new C81929WDl(scene, z) { // from class: X.49M
            @Override // X.C81929WDl, X.AbstractC72439Sbr, X.InterfaceC70769Rq1
            public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
                super.T1(uri, smartImageView);
                C81929WDl c81929WDl2 = c81929WDl;
                if (c81929WDl2 != null) {
                    c81929WDl2.T1(uri, smartImageView);
                }
            }

            @Override // X.C81929WDl, X.InterfaceC70769Rq1
            public final void s2(android.net.Uri uri, View view, Throwable th) {
                super.s2(uri, view, th);
                C81929WDl c81929WDl2 = c81929WDl;
                if (c81929WDl2 != null) {
                    c81929WDl2.s2(uri, view, th);
                }
            }

            @Override // X.C81929WDl, X.InterfaceC70769Rq1
            public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
                super.U0(uri, view, c2047581v, animatable);
                C81929WDl c81929WDl2 = c81929WDl;
                if (c81929WDl2 != null) {
                    c81929WDl2.U0(uri, view, c2047581v, animatable);
                }
            }
        });
    }

    public static void LJIIZILJ(final W5F w5f, final String scene, final String str, int i, AqS167S0100000_1 aqS167S0100000_1, int i2) {
        final C80303De fetchUserFromRemote;
        final int i3 = i;
        final AqS167S0100000_1 aqS167S0100000_12 = aqS167S0100000_1;
        if ((i2 & 4) != 0) {
            i3 = 2;
        }
        C62562cu c62562cu = null;
        if ((i2 & 8) != 0) {
            fetchUserFromRemote = new C80303De(C80533Eb.LIZ);
        } else {
            fetchUserFromRemote = null;
        }
        if ((i2 & 16) != 0) {
            aqS167S0100000_12 = null;
        }
        o.LJIIIZ(w5f, "<this>");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(fetchUserFromRemote, "fetchUserFromRemote");
        if (str == null || str.length() == 0) {
            LJIJ(w5f, scene, false, null, 6);
            return;
        }
        final W5E LIZ = w5f.LIZ();
        if (LIZ != null) {
            c62562cu = LIZ.LJJJ;
        }
        C38995FSd.LIZLLL().execute(new ARunnableS17S0201000_14(1, c62562cu, new InterfaceC47046IdG() { // from class: X.3dP
            @Override // X.InterfaceC47046IdG
            public final void onResult(Object obj) {
                boolean z;
                android.net.Uri uri;
                C62562cu c62562cu2;
                android.net.Uri uri2;
                String imageUrl = (String) obj;
                o.LJIIIIZZ(imageUrl, "imageUrl");
                if (imageUrl.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C43659HBn.LJIJ(W5F.this, scene, true, null, 4);
                    return;
                }
                W5E w5e = LIZ;
                if (w5e != null && (c62562cu2 = w5e.LJJJ) != null) {
                    C73142ty getNtpTime = C73142ty.LJLIL;
                    o.LJIIIZ(getNtpTime, "getNtpTime");
                    List<String> list = c62562cu2.LIZ;
                    if (list != null && !((ArrayList) list).isEmpty()) {
                        try {
                            uri2 = UriProtector.parse((String) ListProtector.get(c62562cu2.LIZ, 0));
                            o.LJIIIIZZ(uri2, "uri");
                        } catch (Exception unused) {
                        }
                        if (!C43659HBn.LJJIFFI(uri2, getNtpTime)) {
                            C43659HBn.LJIJ(W5F.this, scene, false, null, 6);
                        }
                    }
                }
                W5E w5e2 = LIZ;
                if (w5e2 == null || (uri = w5e2.LIZ) == null || C43659HBn.LJJIFFI(uri, C73232u7.LJLIL)) {
                    InterfaceC88474Ynu<String, String, Boolean, C3EU, C76800UCe> interfaceC88474Ynu = fetchUserFromRemote;
                    final String str2 = str;
                    Boolean bool = Boolean.TRUE;
                    final W5F w5f2 = W5F.this;
                    final String str3 = scene;
                    final int i4 = i3;
                    final InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = aqS167S0100000_12;
                    interfaceC88474Ynu.invoke(str2, null, bool, new C3EU(w5f2, str3, i4, interfaceC88472Yns, str2) { // from class: X.3dQ
                        public final W5F LIZ;
                        public final /* synthetic */ String LIZIZ;
                        public final /* synthetic */ int LIZJ;
                        public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZLLL;
                        public final /* synthetic */ String LJ;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.C3EU
                        public final void LIZ(IMUser result) {
                            W5F LJII;
                            o.LJIIIZ(result, "result");
                            ImageUrlModel LJ = C78939UyV.LJ(result.getDisplayAvatar());
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("expired refresh onQueryResult ");
                            LIZ2.append(this.LIZJ);
                            LIZ2.append(' ');
                            LIZ2.append(LJ);
                            C34B.LJI("IMLighten", X1D.LIZIZ(LIZ2));
                            W5F w5f3 = this.LIZ;
                            o.LJIIIZ(w5f3, "<this>");
                            if (w5f3.LJJIIJZLJL != null) {
                                LJII = W5U.LJII(LJ);
                                LJII.LJJIIJZLJL = w5f3.LJJIIJZLJL;
                                LJII.LJIJJLI = C43659HBn.LJIIL();
                                int i5 = w5f3.LJII;
                                int i6 = w5f3.LJIIIIZZ;
                                LJII.LJII = i5;
                                LJII.LJIIIIZZ = i6;
                                LJII.LJJIII = w5f3.LJJIII;
                                LJII.LJIILL = w5f3.LJIILL;
                            } else {
                                LJII = W5U.LJII(LJ);
                                LJII.LJJIIJ = w5f3.LJJIIJ;
                                int i7 = w5f3.LJII;
                                int i8 = w5f3.LJIIIIZZ;
                                LJII.LJII = i7;
                                LJII.LJIIIIZZ = i8;
                                LJII.LJJIII = w5f3.LJJIII;
                                LJII.LJIILL = w5f3.LJIILL;
                            }
                            Object obj2 = null;
                            C43659HBn.LJIJ(LJII, this.LIZIZ, false, null, 6);
                            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns2 = this.LIZLLL;
                            if (interfaceC88472Yns2 != 0) {
                                List<String> list2 = LJ.mUrls;
                                if (list2 != null) {
                                    obj2 = ORZ.LJLLLL(list2);
                                }
                                interfaceC88472Yns2.invoke(obj2);
                            }
                        }

                        @Override // X.C3EU
                        public final void LIZIZ(Throwable throwable) {
                            o.LJIIIZ(throwable, "throwable");
                            if (this.LIZJ > 0) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("expired refresh onQueryError retry ");
                                LIZ2.append(this.LIZJ);
                                C34B.LJI("IMLighten", X1D.LIZIZ(LIZ2));
                                C43659HBn.LJIIZILJ(this.LIZ, this.LIZIZ, this.LJ, this.LIZJ - 1, null, 24);
                                return;
                            }
                            C34B.LJI("IMLighten", "expired refresh onQueryError end");
                            C43659HBn.LJIJ(this.LIZ, this.LIZIZ, false, null, 6);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.LIZIZ = str3;
                            this.LIZJ = i4;
                            this.LIZLLL = interfaceC88472Yns;
                            this.LJ = str2;
                            this.LIZ = w5f2;
                        }
                    });
                    return;
                }
                C43659HBn.LJIJ(W5F.this, scene, false, null, 6);
            }
        }, 11));
    }
}
