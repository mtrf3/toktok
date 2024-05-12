package X;

import Y.ACallableS2S2101000_7;
import Y.ACallableS33S1200000_2;
import Y.ARunnableS11S0201000_8;
import Y.ARunnableS21S0200000_2;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.medialib.jni.EffectThumb;
import com.ss.android.medialib.model.CoverInfo;
import com.ss.android.medialib.model.EffectFileInfo;
import com.ss.android.medialib.model.EffectModel;
import com.ss.android.medialib.player.EffectConfig;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.vesdk.VEUtils;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.HCh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43679HCh {
    public static final ExecutorService LIZ;

    static {
        C38027EwB LIZ2 = C38028EwC.LIZ(FSY.FIXED);
        LIZ2.LIZIZ = "EffectVideoCover";
        LIZ2.LIZJ = 3;
        LIZ = C38995FSd.LIZ(LIZ2.LIZ());
    }

    public static void LIZIZ(Bitmap bitmap, ARunnableS21S0200000_2 aRunnableS21S0200000_2, String str) {
        C10K.LIZIZ(new ACallableS33S1200000_2(bitmap, aRunnableS21S0200000_2, str, 1), LIZ, null);
    }

    public static void LIZ(List<EffectPointModel> list, String str, float f, int i, final boolean z, EditPreviewInfo editPreviewInfo, final String str2, final IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        OSJ osj;
        int size;
        float speed;
        long start;
        VEUtils.VEVideoFileInfo videoFileInfo;
        long j;
        EditVideoSegment editVideoSegment;
        long duration;
        long duration2;
        String[] reverseVideoArray;
        String str3;
        String str4;
        final EffectThumb effectThumb = new EffectThumb();
        long j2 = i;
        o.LJIIIZ(editPreviewInfo, "<this>");
        List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
        if (videoList == null || videoList.isEmpty()) {
            osj = null;
        } else {
            long[] jArr = {0, -1};
            if (!z || (reverseVideoArray = editPreviewInfo.getReverseVideoArray()) == null || (str3 = reverseVideoArray[0]) == null || str3.length() == 0) {
                int size2 = editPreviewInfo.getVideoList().size();
                int i2 = 0;
                j = 0;
                while (true) {
                    if (i2 < size2) {
                        EditVideoSegment editVideoSegment2 = (EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), i2);
                        VideoCutInfo videoCutInfo = editVideoSegment2.getVideoCutInfo();
                        if (videoCutInfo != null) {
                            duration = ((float) (videoCutInfo.getEnd() - videoCutInfo.getStart())) / videoCutInfo.getSpeed();
                        } else {
                            duration = editVideoSegment2.getVideoFileInfo().getDuration();
                        }
                        long j3 = duration + j;
                        if (j3 > j2) {
                            j2 -= j;
                            VideoCutInfo videoCutInfo2 = editVideoSegment2.getVideoCutInfo();
                            if (videoCutInfo2 != null) {
                                j2 = (videoCutInfo2.getSpeed() * ((float) j2)) + ((float) videoCutInfo2.getStart());
                            }
                        } else {
                            i2++;
                            j = j3;
                        }
                    } else {
                        i2 = 0;
                        break;
                    }
                }
                editVideoSegment = (EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), i2);
            } else {
                String[] reverseVideoArray2 = editPreviewInfo.getReverseVideoArray();
                if (reverseVideoArray2 != null) {
                    str4 = reverseVideoArray2[0];
                } else {
                    str4 = null;
                }
                o.LJI(str4);
                editVideoSegment = new EditVideoSegment(str4, null, new VideoFileInfo(0, 0, 0L, 0, 0, 0, 0, 0, 0.0f, 496, null), 2, null);
                j = 0;
            }
            jArr[0] = j;
            VideoCutInfo videoCutInfo3 = editVideoSegment.getVideoCutInfo();
            if (videoCutInfo3 != null) {
                duration2 = ((float) (videoCutInfo3.getEnd() - videoCutInfo3.getStart())) / videoCutInfo3.getSpeed();
            } else {
                duration2 = editVideoSegment.getVideoFileInfo().getDuration();
            }
            jArr[1] = j + duration2;
            osj = new OSJ(editVideoSegment, Long.valueOf(j2), jArr);
        }
        if (osj == null) {
            if (onVideoCoverCallback != null) {
                onVideoCoverCallback.onGetVideoCoverFailed(-1);
                return;
            }
            return;
        }
        final EditVideoSegment editVideoSegment3 = (EditVideoSegment) osj.getFirst();
        if (e1.LIZ(31744, "enable_import_10bit_bytevc1_video", true, false)) {
            String videoPath = editVideoSegment3.getVideoPath();
            if (!TextUtils.isEmpty(videoPath) && (videoFileInfo = VEUtils.getVideoFileInfo(videoPath)) != null && videoFileInfo.bHDR) {
                C10K.LIZIZ(new ACallableS2S2101000_7(i, onVideoCoverCallback, editVideoSegment3.getVideoPath(), str2, 0), LIZ, null);
                return;
            }
        }
        if (effectThumb.init(editVideoSegment3.getVideoPath()) < 0) {
            if (onVideoCoverCallback != null) {
                onVideoCoverCallback.onGetVideoCoverFailed(-1);
            }
            effectThumb.stopRender();
            return;
        }
        VideoCutInfo videoCutInfo4 = editVideoSegment3.getVideoCutInfo();
        long[] jArr2 = (long[]) osj.getThird();
        EffectConfig effectConfig = new EffectConfig();
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!z) {
            for (int i3 = 0; i3 < size; i3++) {
                EffectPointModel effectPointModel = (EffectPointModel) ListProtector.get(list, i3);
                String key = effectPointModel.getKey();
                if ("4".equals(key)) {
                    effectPointModel.setKey("7778");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(C164756dL.LIZ());
                    LIZ2.append(File.separator);
                    LIZ2.append("1affdb4d5f33b7e99a052b66ec941819");
                    effectPointModel.setResDir(X1D.LIZIZ(LIZ2));
                } else if ("5".equals(key)) {
                    effectPointModel.setKey("7779");
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(C164756dL.LIZ());
                    LIZ3.append(File.separator);
                    LIZ3.append("53d18e52dc34ba68a72a6c8dcb4d7038");
                    effectPointModel.setResDir(X1D.LIZIZ(LIZ3));
                } else if ("6".equals(key)) {
                    effectPointModel.setKey("7780");
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(C164756dL.LIZ());
                    LIZ4.append(File.separator);
                    LIZ4.append("53899e5b1044d0e96b075d8ac8f99f00");
                    effectPointModel.setResDir(X1D.LIZIZ(LIZ4));
                } else if ("7".equals(key)) {
                    effectPointModel.setKey("7781");
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append(C164756dL.LIZ());
                    LIZ5.append(File.separator);
                    LIZ5.append("a0e184d4d6bf7e32a629d425f8b37f69");
                    effectPointModel.setResDir(X1D.LIZIZ(LIZ5));
                } else if ("8".equals(key)) {
                    effectPointModel.setKey("7782");
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append(C164756dL.LIZ());
                    LIZ6.append(File.separator);
                    LIZ6.append("f5836e3fe6c59ee1da264e768903b713");
                    effectPointModel.setResDir(X1D.LIZIZ(LIZ6));
                } else if ("9".equals(key)) {
                    effectPointModel.setKey("7783");
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append(C164756dL.LIZ());
                    LIZ7.append(File.separator);
                    LIZ7.append("d492b66348b9dde8509ee382f61d89c9");
                    effectPointModel.setResDir(X1D.LIZIZ(LIZ7));
                }
                try {
                    int parseInt = CastIntegerProtector.parseInt(effectPointModel.getKey());
                    if (videoCutInfo4 == null) {
                        speed = 1.0f;
                        start = 0;
                    } else {
                        speed = videoCutInfo4.getSpeed();
                        start = videoCutInfo4.getStart();
                    }
                    long startPoint = (((float) (effectPointModel.getStartPoint() - jArr2[0])) * speed) + ((float) start);
                    long endPoint = ((effectPointModel.getEndPoint() - effectPointModel.getStartPoint()) * speed) + ((float) startPoint);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    arrayList.add(new EffectModel(parseInt, (int) timeUnit.toMicros(startPoint), (int) timeUnit.toMicros(endPoint)));
                    arrayList2.add(new EffectFileInfo(parseInt, effectPointModel.getResDir()));
                } catch (NumberFormatException unused) {
                }
            }
        }
        EffectModel[] effectModelArr = new EffectModel[arrayList.size()];
        EffectFileInfo[] effectFileInfoArr = new EffectFileInfo[arrayList2.size()];
        effectConfig.setEffectType(1);
        effectConfig.setEffectFileInfos((EffectFileInfo[]) arrayList2.toArray(effectFileInfoArr));
        effectConfig.setEffectModels((EffectModel[]) arrayList.toArray(effectModelArr));
        effectConfig.setEffectBuildChainType(1);
        effectConfig.setFilter(str);
        if (f != -1.0f) {
            effectConfig.setFilterIntensity(f);
        }
        int width = editVideoSegment3.getVideoFileInfo().getWidth();
        if (width <= 0 || width >= 256) {
            width = 256;
        }
        effectThumb.renderVideo(new long[]{((Long) osj.getSecond()).longValue()}, effectConfig, width, width);
        C10K.LIZIZ(new Callable() { // from class: X.HCj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i4;
                Bitmap bitmap;
                boolean z2 = z;
                EditVideoSegment editVideoSegment4 = editVideoSegment3;
                EffectThumb effectThumb2 = effectThumb;
                String str5 = str2;
                IEffectService.OnVideoCoverCallback onVideoCoverCallback2 = onVideoCoverCallback;
                if (!z2) {
                    VEUtils.VEVideoFileInfo videoFileInfo2 = VEUtils.getVideoFileInfo(editVideoSegment4.getVideoPath());
                    if (videoFileInfo2 == null) {
                        i4 = 0;
                    } else {
                        i4 = videoFileInfo2.rotation;
                    }
                    if (editVideoSegment4.getVideoCutInfo() != null) {
                        i4 += editVideoSegment4.getVideoCutInfo().getRotate();
                    }
                } else {
                    i4 = 0;
                }
                CoverInfo thumb = effectThumb2.getThumb(0);
                if (thumb != null && thumb.getData() != null) {
                    bitmap = Bitmap.createBitmap(thumb.getData(), thumb.getWidth(), thumb.getHeight(), Bitmap.Config.ARGB_8888);
                    if (i4 > 0) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(i4);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                } else {
                    bitmap = null;
                }
                if (!TextUtils.isEmpty(str5) && bitmap != null) {
                    C42299Git.LJFF(bitmap, new File(str5), 60, Bitmap.CompressFormat.PNG);
                }
                HRJ.LIZ(new ARunnableS11S0201000_8(2, onVideoCoverCallback2, bitmap, 4));
                effectThumb2.stopRender();
                return null;
            }
        }, LIZ, null);
    }
}
