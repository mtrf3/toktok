package X;

import Y.ACallableS110S0100000_7;
import Y.AObjectS52S0101000_7;
import Y.ARunnableS40S0100000_4;
import Y.AgS124S0100000_7;
import Y.AgS43S0400000_7;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.ml.ab.SmartOHRExperiment$SmartOhrModel;
import com.ss.android.ugc.aweme.services.RnAndH5Service;
import com.ss.android.ugc.aweme.shortvideo.AVAweme;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import defpackage.s1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AqS74S1100000_7;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class HG3 implements C0K7, ITR, InterfaceC162316Yp, InterfaceC81974WFe, InterfaceC73592SuS, J7O {
    public static boolean LJLILLLLZI = false;
    public static SmartOHRExperiment$SmartOhrModel LJLJI = null;
    public static long LJLJJI = -1;
    public static volatile IAccountService LJLJL;
    public static final HG3 LJLIL = new HG3();
    public static final HG3 LJLJJL = new HG3();
    public static final HG3 LJLJJLL = new HG3();

    @Override // X.ITR
    public /* synthetic */ void LIZJ() {
    }

    @Override // X.ITR
    public /* synthetic */ void LIZLLL() {
    }

    @Override // X.ITR
    public /* synthetic */ void LJ() {
    }

    @Override // X.InterfaceC162316Yp
    public void LLILZIL(Bitmap bitmap) {
    }

    @Override // X.ITR
    public /* synthetic */ void end() {
    }

    public static void LJIIL() {
        if (LJLJL == null) {
            LJLJL = AccountService.LJIJ();
        }
    }

    public C43068GvI LJIIJ() {
        C43068GvI c43068GvI = new C43068GvI(C60342Yk.LJLIL);
        List<HGA> LIZJ = C43758HFi.LIZIZ(C60903NvH.LJ).LIZJ();
        if (!(!((ArrayList) LIZJ).isEmpty())) {
            LIZJ = null;
        }
        if (LIZJ != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(LIZJ, 10));
            Iterator<HGA> it = LIZJ.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().LJI.getExtractFramesDir());
            }
            c43068GvI.addAll(arrayList);
        }
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        ArrayList<OriginalSoundUploadTask> LIZIZ = HGH.LIZ(application).LIZIZ();
        if (!LIZIZ.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(LIZIZ, 10));
            Iterator<OriginalSoundUploadTask> it2 = LIZIZ.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().originalSoundPath);
            }
            c43068GvI.addAll(arrayList2);
        }
        return c43068GvI;
    }

    public static IBindService LJFF() {
        LJIIL();
        return LJLJL.LIZJ();
    }

    public static InterfaceC65895Ptb LJIIIIZZ() {
        LJIIL();
        return LJLJL.LJI();
    }

    public static RnAndH5Service LJIIJJI() {
        LJIIL();
        return LJLJL.LJIIJ();
    }

    public static IAccountUserService LJIILL() {
        LJIIL();
        return LJLJL.LJFF();
    }

    @Override // X.InterfaceC81974WFe
    public void LIZIZ(SmartImageView smartImageView) {
        smartImageView.animate().rotationBy(180.0f).setDuration(200L).withStartAction(new ARunnableS40S0100000_4(smartImageView, 102)).withEndAction(new ARunnableS40S0100000_4(smartImageView, 103));
    }

    public void LJI(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        ShoutOutsData shoutOutsData = model.mShoutOutsData;
        if (shoutOutsData == null || !ShoutOutsData.MODE_POST.equals(shoutOutsData.getShoutOutsMode()) || TextUtils.isEmpty(model.mShoutOutsData.getPostVideoPath()) || !model.mShoutOutsData.getPostVideoPath().contains("shoutout")) {
            return;
        }
        C44687HgJ.LJIILJJIL(model.mShoutOutsData.getPostVideoPath());
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        return !it.isEmpty();
    }

    public static final String LJII(C109544Rq message, String str) {
        o.LJIIIZ(message, "message");
        if (message.getPropertyItemListMap() == null) {
            return null;
        }
        boolean z = false;
        for (Map.Entry<String, List<C32H>> entry : message.getPropertyItemListMap().entrySet()) {
            String key = entry.getKey();
            o.LJIIIIZZ(key, "entry.key");
            if (ujb.o.LJJJLIIL(key, "e:", false)) {
                String key2 = entry.getKey();
                o.LJIIIIZZ(key2, "entry.key");
                String substring = key2.substring(2);
                o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                List<C32H> value = entry.getValue();
                o.LJIIIIZZ(value, "entry.value");
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    if (o.LJ(((C32H) it.next()).idempotent_id, str)) {
                        if (!o.LJ(substring, "love")) {
                            return substring;
                        }
                        z = true;
                    }
                }
            }
        }
        if (!z) {
            return null;
        }
        return "❤️";
    }

    @Override // X.J7O
    public InterfaceC80053VbN LIZ(Context context, C80048VbI c80048VbI) {
        o.LJIIJ(context, "context");
        return new C48642J7e(context, c80048VbI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r5 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIZ(X.ActivityC45651qj r8, X.C109544Rq r9, java.lang.String r10) {
        /*
            com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r0 = X.C1DJ.LJIILL(r9)
            if (r0 == 0) goto L6d
            com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r0 = r0.LLLL()
            if (r0 == 0) goto L6d
            com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent r0 = r0.queryData
            if (r0 == 0) goto L6d
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.extras
            if (r1 == 0) goto L6d
            java.lang.String r0 = "a:sticker_set_id"
            java.lang.Object r7 = r1.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L6d
        L1f:
            long r1 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r7)
            X.3bE r0 = X.EnumC87003bE.STICKER_STORE
            int r3 = r0.getType()
            r4 = 0
            r5 = 1
            r0 = r8
            r6 = r10
            X.C88113d1.LIZ(r0, r1, r3, r4, r5, r6)
            java.lang.String r0 = "click"
            java.lang.String r9 = "chat"
            X.C87393br.LJIJJ(r9, r0)
            X.2rR r0 = X.C71572rR.LJII
            X.2rw r0 = X.AbstractC71812rp.LJIILIIL(r0)
            DATA r0 = r0.LIZ
            java.util.List r0 = (java.util.List) r0
            r8 = 1
            if (r0 == 0) goto L6e
            java.util.Iterator r6 = r0.iterator()
        L48:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r5 = r6.next()
            r0 = r5
            com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo r0 = (com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo) r0
            java.lang.Long r0 = r0.getSetId()
            long r3 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r7)
            if (r0 != 0) goto L60
            goto L48
        L60:
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L48
            if (r5 == 0) goto L6e
        L6a:
            X.C87393br.LJIJI(r9, r7, r8)
        L6d:
            return
        L6e:
            r8 = 0
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HG3.LJIIIZ(X.1qj, X.4Rq, java.lang.String):void");
    }

    public static void LJIILJJIL(final CreateBaseAwemeResponse response, final VideoPublishEditModel model, final CountDownLatch serviceLatch) {
        o.LJIIIZ(response, "response");
        o.LJIIIZ(model, "model");
        o.LJIIIZ(serviceLatch, "serviceLatch");
        final C43776HGa c43776HGa = new C43776HGa();
        final Application application = C60903NvH.LJ;
        if (!C19N.LJ("upload_origin_audio_track", false)) {
            serviceLatch.countDown();
            return;
        }
        final boolean LIZ = C152545yk.LIZ(model);
        C41859Gbn LIZIZ = C1I0.LIZIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("need upload original sound: ");
        LIZ2.append(LIZ);
        LIZIZ.LIZJ("original_sound", X1D.LIZIZ(LIZ2));
        C10K.LIZJ(new Callable() { // from class: X.HG4
            /* JADX WARN: Removed duplicated region for block: B:101:0x025f A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:105:0x026e  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0284  */
            /* JADX WARN: Removed duplicated region for block: B:111:0x028e  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x01cc  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x01e4  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0210  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0227  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0253 A[LOOP:1: B:52:0x024d->B:54:0x0253, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:58:0x03b7  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x03d4 A[Catch: all -> 0x0443, TryCatch #0 {all -> 0x0443, blocks: (B:65:0x03c6, B:66:0x03ce, B:68:0x03d4, B:71:0x03e0, B:74:0x03f4, B:75:0x03fc, B:77:0x0402, B:83:0x040c, B:84:0x0416, B:86:0x041c, B:88:0x0429, B:89:0x0433, B:91:0x0439), top: B:64:0x03c6 }] */
            /* JADX WARN: Removed duplicated region for block: B:86:0x041c A[Catch: all -> 0x0443, TryCatch #0 {all -> 0x0443, blocks: (B:65:0x03c6, B:66:0x03ce, B:68:0x03d4, B:71:0x03e0, B:74:0x03f4, B:75:0x03fc, B:77:0x0402, B:83:0x040c, B:84:0x0416, B:86:0x041c, B:88:0x0429, B:89:0x0433, B:91:0x0439), top: B:64:0x03c6 }] */
            /* JADX WARN: Removed duplicated region for block: B:99:0x025d  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 1117
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.HG4.call():java.lang.Object");
            }
        }).LJFF(new AgS124S0100000_7(application, 10));
    }

    public void LJIILIIL(final CreateBaseAwemeResponse response, final VideoPublishEditModel model, final CountDownLatch serviceLatch) {
        String str;
        int i;
        boolean z;
        o.LJIIIZ(response, "response");
        o.LJIIIZ(model, "model");
        o.LJIIIZ(serviceLatch, "serviceLatch");
        final C43756HFg c43756HFg = new C43756HFg();
        final Application application = C60903NvH.LJ;
        final String session = "";
        if (!HFA.LIZJ(model)) {
            serviceLatch.countDown();
            if (model.extractFramesModel != null) {
                C10K.LIZJ(new ACallableS110S0100000_7(model, 55));
            }
            C43756HFg.LIZIZ(application, "");
            H78.LJI("[Original Frame] No need to Upload Frame");
            return;
        }
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getAVConverter().getClass();
        AVAweme lambda$getAVConverter$1 = AVServiceProxyImpl.lambda$getAVConverter$1(response);
        if (lambda$getAVConverter$1 != null) {
            session = lambda$getAVConverter$1.aid;
        }
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getAVConverter().getClass();
        AVAweme lambda$getAVConverter$12 = AVServiceProxyImpl.lambda$getAVConverter$1(response);
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("stage", 1);
        if (lambda$getAVConverter$12 != null) {
            str = lambda$getAVConverter$12.aid;
        } else {
            str = null;
        }
        c6bk.LIZ.put("aweme_id", str);
        c6bk.LIZ.put("match_factors", Integer.valueOf(HGU.LIZ(model).LIZ));
        String cameraIds = model.getCameraIds();
        if (cameraIds == null || cameraIds.length() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        c6bk.LIZ.put("origin", Integer.valueOf(i ^ 1));
        c6bk.LIZ.put("is_draft", Boolean.valueOf(model.mIsFromDraft));
        if (model.mRestoreType == 2) {
            z = true;
        } else {
            z = false;
        }
        c6bk.LIZ.put("is_backup", Boolean.valueOf(z));
        c6bk.LIZ.put("video_type", Integer.valueOf(H7R.LJI(model)));
        C43882HKc.LIZLLL(1, "av_video_audit", c6bk.LJ(), true);
        C43750HFa c43750HFa = new C43750HFa();
        c43750HFa.LIZLLL.LIZJ = String.valueOf(HGU.LIZ(model).LIZ);
        if (TextUtils.isEmpty(model.getCameraIds())) {
            c43750HFa.LJFF.LIZJ = CardStruct.IStatusCode.DEFAULT;
        } else {
            c43750HFa.LJFF.LIZJ = "1";
        }
        o.LJIIIZ(session, "session");
        HG2.LIZ.put(session, "init");
        HG2.LIZIZ.put(session, new StringBuilder("init"));
        HG2.LIZJ.put(session, 0);
        C43045Guv.LIZLLL(new AqS74S1100000_7(c43750HFa, session, 18), 10000L);
        HG2.LIZ(session, "audit_start");
        C45804HyK.LJJIJIL(model, model.extractFramesModel, false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Original Frame] Start extract frames -AwemeId:");
        LIZ.append(session);
        H78.LJI(X1D.LIZIZ(LIZ));
        HG7 hg7 = new HG7(HGC.POST, null);
        C10K LIZ2 = C43756HFg.LIZ(hg7, model, session);
        Objects.requireNonNull(LIZ2);
        LIZ2.LJFF(new AgS43S0400000_7(c43756HFg, response, model, hg7, 1)).LJFF(new AgS43S0400000_7(c43756HFg, response, model, hg7, 2)).LIZLLL(new C10I() { // from class: X.HFh
            @Override // X.C10I
            public final Object then(C10K c10k) {
                OSZ osz;
                LibraryMaterialInfoSv libraryMaterialInfoSv;
                Integer materialProvider;
                Integer materialType;
                ExtractFramesModel extractFramesModel;
                HGN hgn;
                int i2;
                int i3;
                boolean z2;
                boolean z3;
                C43756HFg c43756HFg2 = C43756HFg.this;
                String str2 = session;
                CreateBaseAwemeResponse response2 = response;
                VideoPublishEditModel editModel = model;
                Context context = application;
                CountDownLatch countDownLatch = serviceLatch;
                c43756HFg2.getClass();
                HG2.LIZ(str2, "extractor_done");
                if (c10k.LJIIL() || c10k.LJIILJJIL()) {
                    C43753HFd.LJII(response2, editModel, Boolean.FALSE, -1001, "");
                }
                C41778GaU c41778GaU = new C41778GaU(context);
                AObjectS52S0101000_7 aObjectS52S0101000_7 = new AObjectS52S0101000_7(4, countDownLatch, 26);
                o.LJIIIZ(response2, "response");
                boolean z4 = false;
                if (editModel instanceof VideoPublishEditModel) {
                    C5L7.LIZIZ();
                    HGM hgm = new HGM(editModel, c41778GaU, false);
                    o.LJIIIZ(editModel, "editModel");
                    if (editModel.hasImageStickers()) {
                        if (!C39579Fg7.LIZIZ(editModel.extractFramesModel.getExtractFramesDir())) {
                            hgm.LIZ(false);
                        } else {
                            ArrayList LIZ3 = EPG.LIZ(editModel.extractFramesModel.getExtractFramesDir());
                            if (LIZ3.isEmpty()) {
                                hgm.LIZ(false);
                            } else {
                                int size = LIZ3.size();
                                if (size == 0) {
                                    hgm.LIZ(false);
                                } else {
                                    C76732zl c76732zl = new C76732zl();
                                    ArrayList arrayList = new ArrayList();
                                    List<StickerItemModel> list = editModel.infoStickerModel.stickers;
                                    ArrayList LIZIZ = s1.LIZIZ(list, "editModel.infoStickerModel.stickers");
                                    for (StickerItemModel stickerItemModel : list) {
                                        if (stickerItemModel.isImageSticker()) {
                                            LIZIZ.add(stickerItemModel);
                                        }
                                    }
                                    Iterator it = LIZIZ.iterator();
                                    while (it.hasNext()) {
                                        StickerItemModel stickerItemModel2 = (StickerItemModel) it.next();
                                        String LJIILL = C44694HgQ.LJIILL(stickerItemModel2.path, z4);
                                        String[] strArr = C44694HgQ.LJFF;
                                        int length = strArr.length;
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= length) {
                                                c76732zl.element++;
                                                break;
                                            }
                                            if (s.LJJJLZIJ(LJIILL, strArr[i4], false)) {
                                                arrayList.add(stickerItemModel2.path);
                                                break;
                                            }
                                            i4++;
                                        }
                                        z4 = false;
                                    }
                                    if (arrayList.size() == 0) {
                                        if (size != c76732zl.element) {
                                            hgm.LIZ(z4);
                                        }
                                    } else {
                                        C36086EEg c36086EEg = new C36086EEg(c76732zl, hgm, size);
                                        HashMap<String, Integer> hashMap = new HashMap<>();
                                        int size2 = arrayList.size();
                                        Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            String str3 = (String) it2.next();
                                            if (!C39579Fg7.LIZIZ(str3)) {
                                                hashMap.put(str3, 0);
                                                if (hashMap.size() == size2) {
                                                    c36086EEg.LIZ(hashMap);
                                                }
                                            } else {
                                                ((AbstractC48384Iyq) W5I.LIZ().LJ(W5P.LIZLLL(android.net.Uri.fromFile(new File(str3))).LIZ(), EPG.LIZ)).LJ(new C81750W6o(new C35435DvT(hashMap, str3, size2, c36086EEg), str3), PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("CustomStickerChecker")));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    HGL hgl = new HGL(editModel, c41778GaU, false);
                    if (editModel.hasUploadFrameConditionInEdit() && (editModel.hasGalleryPhoto() || editModel.hasGalleryVideo())) {
                        if (!C39579Fg7.LIZIZ(editModel.extractFramesModel.getExtractFramesDir())) {
                            hgl.LIZ(false);
                        } else {
                            ArrayList LIZ4 = EPH.LIZ(editModel.extractFramesModel.getExtractFramesDir());
                            if (LIZ4.isEmpty()) {
                                hgl.LIZ(false);
                            } else {
                                int size3 = LIZ4.size();
                                if (size3 == 0) {
                                    hgl.LIZ(false);
                                } else {
                                    MultiEditVideoRecordData curMultiEditVideoRecordData = editModel.getCurMultiEditVideoRecordData();
                                    o.LJIIIIZZ(curMultiEditVideoRecordData, "editModel.curMultiEditVideoRecordData");
                                    List LJJIJ = C46104I7o.LJJIJ(curMultiEditVideoRecordData);
                                    int size4 = editModel.getFinalVideoList().size();
                                    int i5 = 0;
                                    for (int i6 = 0; i6 < size4; i6++) {
                                        TimeSpeedModelExtension segment = (TimeSpeedModelExtension) ListProtector.get(editModel.getFinalVideoList(), i6);
                                        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) ListProtector.get(LJJIJ, i6);
                                        o.LJIIIIZZ(segment, "segment");
                                        if (C76917UGr.LJJJIL(segment)) {
                                            i5 += (int) (1 + ((multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime()) / C54846Lfm.LIZIZ()));
                                        }
                                        if (C76917UGr.LJJJI(segment)) {
                                            i5++;
                                        }
                                    }
                                    Iterator it3 = ((ArrayList) LJJIJ).iterator();
                                    while (it3.hasNext()) {
                                        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = (MultiEditVideoSegmentRecordData) it3.next();
                                        if (multiEditVideoSegmentRecordData2.enable && (libraryMaterialInfoSv = multiEditVideoSegmentRecordData2.libraryMaterialInfo) != null && (materialProvider = libraryMaterialInfoSv.getMaterialProvider()) != null && materialProvider.intValue() == 3) {
                                            LibraryMaterialInfoSv libraryMaterialInfoSv2 = multiEditVideoSegmentRecordData2.libraryMaterialInfo;
                                            if (libraryMaterialInfoSv2 == null || (materialType = libraryMaterialInfoSv2.getMaterialType()) == null || materialType.intValue() != 3) {
                                                i5 += (int) ((multiEditVideoSegmentRecordData2.getEndTime() - multiEditVideoSegmentRecordData2.getStartTime()) / C54846Lfm.LIZIZ());
                                            } else {
                                                i5++;
                                            }
                                        }
                                    }
                                    if (Math.abs(size3 - i5) >= 3) {
                                        hgl.LIZ(false);
                                    }
                                }
                            }
                        }
                    }
                    try {
                        osz = HFU.LIZ(response2, editModel);
                    } catch (Throwable unused) {
                        osz = null;
                    }
                    C10K.LIZIZ(new HG6(osz, editModel, c41778GaU, false, aObjectS52S0101000_7), C10K.LJIIIIZZ, null);
                }
                o.LJIIIZ(editModel, "<this>");
                C44172HVg.LJIJJ.getClass();
                AVAweme lambda$getAVConverter$13 = AVServiceProxyImpl.lambda$getAVConverter$1(response2);
                if (lambda$getAVConverter$13 == null || (extractFramesModel = editModel.extractFramesModel) == null) {
                    hgn = null;
                } else {
                    extractFramesModel.setStickerIds(editModel.mStickerID);
                    hgn = new HGN();
                    HG8 hg8 = new HG8();
                    hg8.LIZ = lambda$getAVConverter$13.aid;
                    hg8.LIZIZ = H7R.LJI(editModel);
                    if (H7R.LJJJJL(editModel)) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    hg8.LJIILIIL = i2;
                    hg8.LIZJ = response2.materialId;
                    hg8.LIZLLL = "";
                    hg8.LJ = "";
                    hg8.LJFF = extractFramesModel;
                    hg8.LJIIIIZZ = HGU.LIZ(editModel).LIZ;
                    hg8.LJIIIZ = editModel.mIsFromDraft;
                    String cameraIds2 = editModel.getCameraIds();
                    if (cameraIds2 == null || cameraIds2.length() == 0) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    hg8.LJIIJ = i3 ^ 1;
                    if (editModel.mRestoreType == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hg8.LJIIJJI = z2;
                    hg8.LJI = System.currentTimeMillis();
                    ((ArrayList) hgn.LIZ).add(hg8.LIZ());
                }
                C41859Gbn LIZIZ2 = C1I0.LIZIZ();
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("will insert: ");
                if (hgn != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                LIZ5.append(z3);
                LIZIZ2.LIZJ("extract_frame", X1D.LIZIZ(LIZ5));
                if (hgn != null) {
                    try {
                        HG2.LIZ(str2, "database_insert");
                        C43758HFi.LIZIZ(context).LIZ(hgn);
                    } catch (Exception e) {
                        C43753HFd.LJII(response2, editModel, Boolean.FALSE, -1002, e.getMessage());
                        C41859Gbn LJJ = C60903NvH.LJIIJJI().getPublishService().LJJ();
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("insert sql fail : ");
                        LIZ6.append(e.getMessage());
                        LJJ.LIZJ("extract_frame", X1D.LIZIZ(LIZ6));
                    }
                }
                HG2.LIZ(str2, "enqueue_service");
                C43756HFg.LIZIZ(context, str2);
                return null;
            }
        });
    }
}
