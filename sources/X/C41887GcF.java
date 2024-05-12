package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GcF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41887GcF<T> implements InterfaceC66992k3 {
    public final /* synthetic */ RecordScene LJLIL;
    public final /* synthetic */ WeakReference<SmartImageView> LJLILLLLZI;

    public C41887GcF(RecordScene recordScene, WeakReference<SmartImageView> weakReference) {
        this.LJLIL = recordScene;
        this.LJLILLLLZI = weakReference;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<C41881Gc9> interfaceC65052gv) {
        int LIZ = HB4.LIZ();
        if (LIZ != 0 && LIZ != 3) {
            WeakReference<SmartImageView> weakReference = this.LJLILLLLZI;
            AwemeDraft LJIIIZ = C44172HVg.LJJ.LJIIJ().LJIIIZ();
            if (LJIIIZ == null) {
                ((C73578SuE) interfaceC65052gv).tryOnError(new NullPointerException());
                return;
            }
            new C43542H7a("CheckPointServiceImpl");
            VideoPublishEditModel LIZJ = C43542H7a.LIZJ(LJIIIZ);
            if (LIZJ.isCurrentAutoCutMode()) {
                String videoCoverPath = LIZJ.getVideoCoverPath();
                if (videoCoverPath != null && videoCoverPath.length() != 0) {
                    String videoCoverPath2 = LIZJ.getVideoCoverPath();
                    if (videoCoverPath2 != null) {
                        if (new File(videoCoverPath2).exists()) {
                            String videoCoverPath3 = LIZJ.getVideoCoverPath();
                            if (videoCoverPath3 != null) {
                                Bitmap LIZ2 = C41802Gas.LIZ(null, videoCoverPath3);
                                if (LIZ2 != null && (true ^ LIZ2.isRecycled())) {
                                    ((C73578SuE) interfaceC65052gv).onSuccess(C41884GcC.LIZ(LIZ2));
                                    if (C76800UCe.LIZ != null) {
                                        return;
                                    }
                                }
                                ((C73578SuE) interfaceC65052gv).onSuccess(new C41881Gc9(null, null));
                                return;
                            }
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                if (LIZJ.nleData == null) {
                    return;
                }
                final AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7((C73578SuE) interfaceC65052gv, 418);
                C5K0.LIZ(2);
                String draftDir = LIZJ.draftDir();
                o.LJIIIIZZ(draftDir, "model.draftDir()");
                C133765Mu c133765Mu = new C133765Mu(draftDir, null, null, null, 62);
                String str = LIZJ.nleData;
                if (str != null && (!ujb.o.LJJJJJL(str))) {
                    c133765Mu.LIZJ.LJI(str);
                }
                c133765Mu.LLLF();
                c133765Mu.LIZJ.LIZJ();
                c133765Mu.prepare();
                c133765Mu.LLLII(new int[]{(int) (LIZJ.mVideoCoverStartTm * 1000)}, -1, -1, VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL, new InterfaceC134015Nt() { // from class: X.5YT
                    @Override // X.InterfaceC134015Nt
                    public final int LIZ(byte[] bArr, int i, int i2, int i3, float f) {
                        if (bArr == null) {
                            aqS173S0100000_7.invoke(null);
                            return -1;
                        }
                        try {
                            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
                            aqS173S0100000_7.invoke(createBitmap);
                            return 0;
                        } catch (Exception unused) {
                            aqS173S0100000_7.invoke(null);
                            return -1;
                        }
                    }
                });
                return;
            }
            if (LIZJ.isDuet()) {
                String LIZ3 = GWZ.LIZ(LIZJ, weakReference);
                if (LIZ3 != null) {
                    ((C73578SuE) interfaceC65052gv).onSuccess(C41884GcC.LIZIZ(LIZ3));
                    return;
                } else {
                    ((C73578SuE) interfaceC65052gv).tryOnError(new NullPointerException());
                    return;
                }
            }
            if (LIZJ.isMvThemeVideoType()) {
                if (TextUtils.isEmpty(LIZJ.mvCreateVideoData.videoCoverImgPath) || !C44687HgJ.LIZIZ(LIZJ.mvCreateVideoData.videoCoverImgPath)) {
                    MvCreateVideoData mvCreateVideoData = LIZJ.mvCreateVideoData;
                    HHF LIZ4 = C78934UyQ.LJLIL.LJI().LIZ();
                    CreativeInfo creativeInfo = LIZJ.creativeInfo;
                    o.LJIIIIZZ(creativeInfo, "mModel.creativeInfo");
                    mvCreateVideoData.videoCoverImgPath = LIZ4.LJII(creativeInfo);
                    Bitmap LIZLLL = C44694HgQ.LIZLLL((String) ListProtector.get(LIZJ.mvCreateVideoData.selectMediaList, 0), null);
                    if (LIZLLL != null && (true ^ LIZLLL.isRecycled())) {
                        C42300Giu.LIZ(OUP.LJJIJL(LIZLLL, LIZJ.getCoverPublishModel()), new File(LIZJ.mvCreateVideoData.videoCoverImgPath), 70, Bitmap.CompressFormat.JPEG);
                    }
                }
                ((C73578SuE) interfaceC65052gv).onSuccess(C41884GcC.LIZIZ(LIZJ.mvCreateVideoData.videoCoverImgPath));
                return;
            }
            if (LIZJ.isMultiVideoEdit()) {
                String videoCoverPath4 = LIZJ.getVideoCoverPath();
                if (videoCoverPath4 != null && videoCoverPath4.length() != 0) {
                    String videoCoverPath5 = LIZJ.getVideoCoverPath();
                    if (videoCoverPath5 != null) {
                        if (new File(videoCoverPath5).exists()) {
                            String videoCoverPath6 = LIZJ.getVideoCoverPath();
                            if (videoCoverPath6 != null) {
                                Bitmap LIZ5 = C41802Gas.LIZ(null, videoCoverPath6);
                                if (LIZ5 != null && (true ^ LIZ5.isRecycled())) {
                                    ((C73578SuE) interfaceC65052gv).onSuccess(C41884GcC.LIZ(LIZ5));
                                    if (C76800UCe.LIZ != null) {
                                        return;
                                    }
                                }
                                ((C73578SuE) interfaceC65052gv).onSuccess(new C41881Gc9(null, null));
                                return;
                            }
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                if (C44687HgJ.LIZIZ(LIZJ.multiEditVideoRecordData.coverImagePath)) {
                    Bitmap LIZ6 = C41802Gas.LIZ(null, LIZJ.multiEditVideoRecordData.coverImagePath);
                    if (LIZ6 != null && (true ^ LIZ6.isRecycled())) {
                        ((C73578SuE) interfaceC65052gv).onSuccess(C41884GcC.LIZ(LIZ6));
                        if (C76800UCe.LIZ != null) {
                            return;
                        }
                    }
                    ((C73578SuE) interfaceC65052gv).onSuccess(new C41881Gc9(null, null));
                    return;
                }
                o.LJIIIIZZ(LIZJ.importInfoList, "mModel.importInfoList");
                if ((!r3.isEmpty()) && ((ImportVideoInfo) ListProtector.get(LIZJ.importInfoList, 0)).getBitRate() == 0 && ((ImportVideoInfo) ListProtector.get(LIZJ.importInfoList, 0)).getOriginFps() == 0) {
                    Bitmap LIZLLL2 = C44694HgQ.LIZLLL(((ImportVideoInfo) ListProtector.get(LIZJ.importInfoList, 0)).getRealImportPath(), null);
                    if (LIZLLL2 == null || !(true ^ LIZLLL2.isRecycled())) {
                        return;
                    }
                    ((C73578SuE) interfaceC65052gv).onSuccess(C41884GcC.LIZ(OUP.LJJIJL(LIZLLL2, LIZJ.getCoverPublishModel())));
                    return;
                }
                String LIZ7 = GWZ.LIZ(LIZJ, weakReference);
                if (LIZ7 != null) {
                    ((C73578SuE) interfaceC65052gv).onSuccess(C41884GcC.LIZIZ(LIZ7));
                    return;
                } else {
                    ((C73578SuE) interfaceC65052gv).tryOnError(new NullPointerException());
                    return;
                }
            }
            C41802Gas.LJIIIIZZ(LJIIIZ, null, new C41886GcE((C73578SuE) interfaceC65052gv));
            return;
        }
        RecordScene recordScene = this.LJLIL;
        if (recordScene == null) {
            recordScene = HB4.LIZIZ();
        }
        VERecordData create = VERecordData.create(new C41888GcG(recordScene), false);
        C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
        VEUtils.getVideoFrames(((VERecordData.VERecordSegmentData) ListProtector.get(create.getSegmentData(), 0)).mVideo, new int[]{0}, new C41885GcD(recordScene, (C73578SuE) interfaceC65052gv));
    }
}
