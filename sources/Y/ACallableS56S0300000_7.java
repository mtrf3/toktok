package Y;

import X.ActivityC45651qj;
import X.C142285iC;
import X.C145995oB;
import X.C170626mo;
import X.C1B3;
import X.C1E5;
import X.C42299Git;
import X.C42606Gnq;
import X.C42614Gny;
import X.C43768HFs;
import X.C43772HFw;
import X.C43773HFx;
import X.C43910HLe;
import X.C44228HXk;
import X.C44694HgQ;
import X.C45498HtO;
import X.C45505HtV;
import X.C45507HtX;
import X.C45509HtZ;
import X.C48841JEv;
import X.C54846Lfm;
import X.C5H3;
import X.C65859Pt1;
import X.C76800UCe;
import X.C78613UtF;
import X.C78685UuP;
import X.C78983UzD;
import X.C79238V7y;
import X.C81392Vwy;
import X.C81810W8w;
import X.FMX;
import X.HG7;
import X.HGQ;
import X.InterfaceC65784Pro;
import X.W5C;
import X.W5I;
import X.W5N;
import X.W5O;
import X.W5P;
import X.W8A;
import X.W8E;
import X.X1D;
import X.XKX;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.provider.MediaStore;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.beauty.MBeautyStateInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.external.ui.MusVideoChooseFragmentWrapper;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadMediaBitmapTask;
import com.ss.android.vesdk.VEUtils;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import v5.n;

/* loaded from: classes8.dex */
public class ACallableS56S0300000_7 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            case 10:
                return call$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return call$11(this);
            case 12:
                return call$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return call$16(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS56S0300000_7 aCallableS56S0300000_7) {
        FragmentManager supportFragmentManager = ((ActivityC45651qj) aCallableS56S0300000_7.l0).getSupportFragmentManager();
        if (supportFragmentManager != null) {
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            Integer num = (Integer) aCallableS56S0300000_7.l1;
            o.LJI(num);
            c1b3.LJIIIIZZ(num.intValue(), 1, (MusVideoChooseFragmentWrapper) aCallableS56S0300000_7.l2, null);
            c1b3.LJI();
        }
        return null;
    }

    public static final Object call$1(ACallableS56S0300000_7 aCallableS56S0300000_7) {
        C145995oB c145995oB = (C145995oB) aCallableS56S0300000_7.l0;
        c145995oB.LIZ(C44228HXk.LJIIIIZZ((ComposerBeautyBuriedInfo) aCallableS56S0300000_7.l1), "is_composer");
        c145995oB.LIZ(C44228HXk.LIZJ(), "beautify_used");
        c145995oB.LJI("beautify_info", C44228HXk.LJII((ComposerBeautyBuriedInfo) aCallableS56S0300000_7.l1));
        c145995oB.LIZ(C44228HXk.LIZIZ((ComposerBeautyBuriedInfo) aCallableS56S0300000_7.l1, (MBeautyStateInfo) aCallableS56S0300000_7.l2), "beautify_status");
        FMX.LJIIL("record_frame_rate_info", c145995oB.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$10(ACallableS56S0300000_7 aCallableS56S0300000_7) {
        Object obj = aCallableS56S0300000_7.l0;
        HG7 hg7 = (HG7) aCallableS56S0300000_7.l1;
        n nVar = (n) aCallableS56S0300000_7.l2;
        if (obj instanceof VideoPublishEditModel) {
            new C43773HFx(hg7, (VideoPublishEditModel) obj).LJFF(new C65859Pt1(nVar));
        } else {
            nVar.LIZJ(null);
        }
        return null;
    }

    public static final Object call$11(ACallableS56S0300000_7 aCallableS56S0300000_7) {
        int[] iArr;
        String frameDir = ((C43768HFs) aCallableS56S0300000_7.l0).LIZIZ.LIZIZ;
        o.LJIIIIZZ(frameDir, "frameDir");
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        if (!ujb.o.LJJJJ(frameDir, separator, false)) {
            frameDir = i0.LJFF(frameDir, separator);
        }
        Iterator it = ((List) aCallableS56S0300000_7.l1).iterator();
        int i = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            iArr = C54846Lfm.LJLJJI;
            if (!hasNext) {
                break;
            }
            AutoCutMediaModel autoCutMediaModel = (AutoCutMediaModel) it.next();
            String str = autoCutMediaModel.filePath;
            ((C43768HFs) aCallableS56S0300000_7.l0).getClass();
            long j = autoCutMediaModel.cutStartTime;
            int LIZIZ = ((int) (autoCutMediaModel.cutDuration / C54846Lfm.LIZIZ())) + 1;
            int[] iArr2 = new int[LIZIZ];
            for (int i2 = 0; i2 < LIZIZ; i2++) {
                iArr2[i2] = (C54846Lfm.LIZIZ() * i2) + ((int) j);
            }
            int i3 = iArr[0];
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append("extract_frame");
            VEUtils.saveVideoFrames(str, iArr2, i3, -1, false, frameDir, X1D.LIZIZ(LIZ), 1);
            i++;
        }
        File[] listFiles = new File(frameDir).listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file : listFiles) {
                ExtractFramesModel extractFramesModel = ((C43768HFs) aCallableS56S0300000_7.l0).LIZ;
                String absolutePath = file.getAbsolutePath();
                o.LJIIIIZZ(absolutePath, "frameImage.absolutePath");
                extractFramesModel.addFrameAtLastSegment(new FrameItem(absolutePath, 0, 0, false, null, null, 62, null));
            }
        }
        Iterator it2 = ((List) aCallableS56S0300000_7.l2).iterator();
        while (it2.hasNext()) {
            Bitmap LIZ2 = C42299Git.LIZ(((AutoCutMediaModel) it2.next()).filePath, iArr);
            if (LIZ2 != null) {
                String LIZIZ2 = ((C43768HFs) aCallableS56S0300000_7.l0).LIZIZ.LIZIZ();
                o.LJIIIIZZ(LIZIZ2, "photoPathGenerator.generatePhotoPath()");
                C42299Git.LJFF(LIZ2, new File(LIZIZ2), 70, Bitmap.CompressFormat.JPEG);
                ((C43768HFs) aCallableS56S0300000_7.l0).LIZ.addFrameAtLastSegment(new FrameItem(LIZIZ2, 0, 0, false, null, null, 62, null));
            }
        }
        return null;
    }

    public static final Object call$12(ACallableS56S0300000_7 aCallableS56S0300000_7) {
        ArrayList arrayList = new ArrayList();
        for (MusicModel musicModel : (List) aCallableS56S0300000_7.l0) {
            if (C170626mo.LIZJ((Context) aCallableS56S0300000_7.l1, musicModel.getLocalPath()) && ((IAVInfoService.IFilterMedia) aCallableS56S0300000_7.l2).filter(Integer.valueOf(((List) aCallableS56S0300000_7.l0).indexOf(musicModel)))) {
                arrayList.add(musicModel);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r2 != 4) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$13(Y.ACallableS56S0300000_7 r8) {
        /*
            java.lang.Object r3 = r8.l0
            X.GWN r3 = (X.GWN) r3
            java.lang.Object r4 = r8.l1
            android.app.Activity r4 = (android.app.Activity) r4
            kotlin.jvm.internal.AqS111S0300000_7 r7 = new kotlin.jvm.internal.AqS111S0300000_7
            java.lang.Object r1 = r8.l2
            X.Pro r1 = (X.InterfaceC65784Pro) r1
            r0 = 37
            r7.<init>(r3, r4, r1, r0)
            r3.getClass()
            int r2 = X.HB4.LIZ()
            r0 = 0
            r3.LIZIZ = r0
            r1 = 1
            if (r2 == 0) goto L3c
            if (r2 == r1) goto L2e
            r0 = 2
            if (r2 == r0) goto L2e
            r0 = 3
            if (r2 == r0) goto L3c
            r0 = 4
            if (r2 == r0) goto L2e
        L2b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2e:
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r5 = r3.LJIIIZ()
            if (r5 != 0) goto L35
            goto L2b
        L35:
            r6 = 0
            r8 = 12
            X.GWN.LJIJI(r3, r4, r5, r6, r7, r8)
            goto L2b
        L3c:
            X.OSZ r0 = r3.LJIIZILJ(r1)
            if (r0 == 0) goto L2b
            java.lang.Object r5 = r0.getFirst()
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r5 = (com.ss.android.ugc.aweme.draft.model.AwemeDraft) r5
            java.lang.Object r6 = r0.getSecond()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r6
            r8 = 8
            X.GWN.LJIJI(r3, r4, r5, r6, r7, r8)
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS56S0300000_7.call$13(Y.ACallableS56S0300000_7):java.lang.Object");
    }

    public static final Object call$14(ACallableS56S0300000_7 aCallableS56S0300000_7) {
        String LIZIZ = ((C43910HLe) aCallableS56S0300000_7.l0).LIZIZ(4);
        if (C78685UuP.LJJJZ(LIZIZ)) {
            C43910HLe c43910HLe = (C43910HLe) aCallableS56S0300000_7.l0;
            C145995oB c145995oB = (C145995oB) aCallableS56S0300000_7.l1;
            c43910HLe.getClass();
            C43910HLe.LIZ(c145995oB, LIZIZ);
        }
        ((InterfaceC65784Pro) aCallableS56S0300000_7.l2).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object call$15(ACallableS56S0300000_7 aCallableS56S0300000_7) {
        String LIZIZ = ((C43910HLe) aCallableS56S0300000_7.l0).LIZIZ(3);
        if (C78685UuP.LJJJZ(LIZIZ)) {
            C43910HLe c43910HLe = (C43910HLe) aCallableS56S0300000_7.l0;
            C145995oB c145995oB = (C145995oB) aCallableS56S0300000_7.l1;
            c43910HLe.getClass();
            C43910HLe.LIZ(c145995oB, LIZIZ);
        }
        ((InterfaceC65784Pro) aCallableS56S0300000_7.l2).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object call$16(ACallableS56S0300000_7 aCallableS56S0300000_7) {
        String LIZIZ = ((C43910HLe) aCallableS56S0300000_7.l0).LIZIZ(2);
        if (C78685UuP.LJJJZ(LIZIZ)) {
            C43910HLe c43910HLe = (C43910HLe) aCallableS56S0300000_7.l0;
            C145995oB c145995oB = (C145995oB) aCallableS56S0300000_7.l1;
            c43910HLe.getClass();
            C43910HLe.LIZ(c145995oB, LIZIZ);
        }
        ((InterfaceC65784Pro) aCallableS56S0300000_7.l2).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS56S0300000_7 aCallableS56S0300000_7) {
        PreloadMediaBitmapTask preloadMediaBitmapTask = (PreloadMediaBitmapTask) aCallableS56S0300000_7.l0;
        ArrayList arrayList = (ArrayList) aCallableS56S0300000_7.l1;
        ArrayList arrayList2 = (ArrayList) aCallableS56S0300000_7.l2;
        preloadMediaBitmapTask.getClass();
        C5H3 c5h3 = C42614Gny.LIZ;
        ArrayList arrayList3 = new ArrayList(((Number) c5h3.getValue()).intValue());
        int intValue = ((Number) c5h3.getValue()).intValue();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < intValue; i3++) {
            if (i < arrayList.size() && i2 < arrayList2.size()) {
                MediaModel mediaModel = (MediaModel) ListProtector.get(arrayList, i);
                MediaModel mediaModel2 = (MediaModel) ListProtector.get(arrayList2, i2);
                if (mediaModel.date >= mediaModel2.date) {
                    arrayList3.add(mediaModel);
                    i++;
                } else {
                    arrayList3.add(mediaModel2);
                    i2++;
                }
            } else if (i < arrayList.size()) {
                arrayList3.add(ListProtector.get(arrayList, i));
                i++;
            } else {
                if (i2 >= arrayList2.size()) {
                    break;
                }
                arrayList3.add(ListProtector.get(arrayList, i2));
                i2++;
            }
        }
        if (!arrayList3.isEmpty()) {
            for (int size = arrayList3.size() - 1; -1 < size; size--) {
                ActivityC45651qj context = preloadMediaBitmapTask.LJLIL;
                Object obj = ListProtector.get(arrayList3, size);
                o.LJIIIIZZ(obj, "tmpList[i]");
                MediaModel mediaModel3 = (MediaModel) obj;
                o.LJIIIZ(context, "context");
                HashMap<String, Bitmap> hashMap = C42606Gnq.LIZIZ;
                if (hashMap != null && !hashMap.containsKey(mediaModel3.fileLocalUriPath)) {
                    if (mediaModel3.LJI()) {
                        ContentResolver contentResolver = context.getContentResolver();
                        String str = mediaModel3.id;
                        o.LJIIIIZZ(str, "mediaModel.id");
                        Bitmap thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, CastLongProtector.parseLong(str), 1, (BitmapFactory.Options) C42606Gnq.LIZ.getValue());
                        if (thumbnail != null) {
                            hashMap.put(mediaModel3.fileLocalUriPath, thumbnail);
                        }
                    } else {
                        ContentResolver contentResolver2 = context.getContentResolver();
                        String str2 = mediaModel3.id;
                        o.LJIIIIZZ(str2, "mediaModel.id");
                        Bitmap thumbnail2 = MediaStore.Images.Thumbnails.getThumbnail(contentResolver2, CastLongProtector.parseLong(str2), 1, (BitmapFactory.Options) C42606Gnq.LIZ.getValue());
                        if (thumbnail2 != null) {
                            hashMap.put(mediaModel3.fileLocalUriPath, thumbnail2);
                            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C142285iC(mediaModel3, thumbnail2, null), 3);
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$3(ACallableS56S0300000_7 aCallableS56S0300000_7) {
        Bitmap bitmap;
        C45505HtV c45505HtV = (C45505HtV) aCallableS56S0300000_7.l0;
        C45507HtX c45507HtX = (C45507HtX) aCallableS56S0300000_7.l1;
        MyMediaModel myMediaModel = (MyMediaModel) aCallableS56S0300000_7.l2;
        C45498HtO c45498HtO = c45505HtV.LJLJLJ;
        c45498HtO.getClass();
        if (c45507HtX.LJLIL.getDrawable() instanceof BitmapDrawable) {
            try {
                W5P LIZLLL = W5P.LIZLLL(C44694HgQ.LJIIIIZZ(myMediaModel.fileLocalUriPath));
                LIZLLL.LIZJ = new C79238V7y(c45498HtO.LJLJL.getWidth(), c45498HtO.LJLJL.getHeight());
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
                imageDecodeOptionsBuilder.getClass();
                LIZLLL.LJ = new C81810W8w(imageDecodeOptionsBuilder);
                W5O LIZ = LIZLLL.LIZ();
                if (!W5I.LIZ().LJIIIIZZ(LIZ) && (bitmap = ((BitmapDrawable) c45507HtX.LJLIL.getDrawable()).getBitmap()) != null && !bitmap.isRecycled()) {
                    W8E.LJII().LIZJ().LIZJ(W5N.LJI().LIZIZ(LIZ, null), C81392Vwy.LJIIL(new W5C(bitmap.copy(Bitmap.Config.RGB_565, true), C1E5.LJFF(), W8A.LIZLLL, 0)));
                }
            } catch (OutOfMemoryError unused) {
                C78983UzD.LJIILL("album cache bitmap oom");
            }
        }
        return null;
    }

    public static final Object call$4(ACallableS56S0300000_7 aCallableS56S0300000_7) {
        C45505HtV c45505HtV = (C45505HtV) aCallableS56S0300000_7.l0;
        C45507HtX c45507HtX = (C45507HtX) aCallableS56S0300000_7.l1;
        MyMediaModel myMediaModel = (MyMediaModel) aCallableS56S0300000_7.l2;
        c45505HtV.LJLJLJ.getClass();
        C45498HtO.LJZ(c45507HtX, myMediaModel);
        return null;
    }

    public static final Object call$5(ACallableS56S0300000_7 aCallableS56S0300000_7) {
        C45509HtZ c45509HtZ = (C45509HtZ) aCallableS56S0300000_7.l0;
        C45507HtX c45507HtX = (C45507HtX) aCallableS56S0300000_7.l1;
        MyMediaModel myMediaModel = (MyMediaModel) aCallableS56S0300000_7.l2;
        c45509HtZ.LJLJL.getClass();
        C45498HtO.LJZ(c45507HtX, myMediaModel);
        return null;
    }

    public static final Object call$6(ACallableS56S0300000_7 aCallableS56S0300000_7) {
        C45498HtO c45498HtO = (C45498HtO) aCallableS56S0300000_7.l0;
        C45507HtX c45507HtX = (C45507HtX) aCallableS56S0300000_7.l1;
        MyMediaModel myMediaModel = (MyMediaModel) aCallableS56S0300000_7.l2;
        c45498HtO.getClass();
        C45498HtO.LJZ(c45507HtX, myMediaModel);
        return null;
    }

    public static final Object call$7(ACallableS56S0300000_7 aCallableS56S0300000_7) {
        C45498HtO c45498HtO = (C45498HtO) aCallableS56S0300000_7.l0;
        MyMediaModel myMediaModel = (MyMediaModel) aCallableS56S0300000_7.l1;
        C45507HtX c45507HtX = (C45507HtX) aCallableS56S0300000_7.l2;
        c45498HtO.getClass();
        if (VEUtils.getVEVideoFileInfo(myMediaModel.fileLocalUriPath) != null) {
            myMediaModel.duration = r0.duration;
            c45498HtO.LLIIIILZ(c45507HtX, myMediaModel);
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (ujb.s.LJJJLZIJ(r1, ((X.C43786HGk) r9.l0).LJIILIIL, false) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$8(Y.ACallableS56S0300000_7 r9) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS56S0300000_7.call$8(Y.ACallableS56S0300000_7):java.lang.Object");
    }

    public static final Object call$9(ACallableS56S0300000_7 aCallableS56S0300000_7) {
        HG7 hg7 = (HG7) aCallableS56S0300000_7.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS56S0300000_7.l1;
        final n nVar = (n) aCallableS56S0300000_7.l2;
        new C43772HFw(hg7, videoPublishEditModel).LJFF(new HGQ() { // from class: X.HGO
            @Override // X.HGQ
            public final void onFinish(boolean z) {
                n.this.LIZJ(null);
            }
        });
        return null;
    }

    public ACallableS56S0300000_7(C45507HtX c45507HtX, C45498HtO c45498HtO, MyMediaModel myMediaModel, int i) {
        this.$t = i;
        switch (i) {
            case 6:
                this.l0 = c45498HtO;
                this.l1 = c45507HtX;
                this.l2 = myMediaModel;
                return;
            default:
                this.l0 = c45498HtO;
                this.l1 = myMediaModel;
                this.l2 = c45507HtX;
                return;
        }
    }

    public ACallableS56S0300000_7(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
