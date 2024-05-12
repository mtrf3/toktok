package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.DiyPropVideo;
import com.ss.android.vesdk.VEUtils;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.HFj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC43759HFj<V> implements Callable {
    public final /* synthetic */ C43764HFo LJLIL;

    public CallableC43759HFj(C43764HFo c43764HFo) {
        this.LJLIL = c43764HFo;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        String videoPath;
        long j;
        ArrayList<TimeSpeedModelExtension> LJIIJJI = CameraComponentModel.LJIIJJI(this.LJLIL.LJ.mVideoSegmentsDesc);
        C43764HFo c43764HFo = this.LJLIL;
        if (c43764HFo.LIZLLL.LIZ == HGC.WATERMARK_MODERATION) {
            str = C43073GvN.LIZIZ(C62850Ola.LJ(), new CreativeInfo(null, 0, null, 7, null), EnumC43650HBe.WATERMARK_MODERATION, "diy_prop_video", 8);
        } else {
            str = c43764HFo.LIZIZ.LIZIZ;
            o.LJIIIIZZ(str, "{\n            photoPathG…ator.currentDir\n        }");
        }
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        if (!ujb.o.LJJJJ(str, separator, false)) {
            str = i0.LJFF(str, separator);
        }
        C78966Uyw.LJJJJLL(new File(str));
        C43764HFo c43764HFo2 = this.LJLIL;
        ArrayList arrayList = new ArrayList();
        Iterator<TimeSpeedModelExtension> it = LJIIJJI.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (next.getDiyPropVideo() != null) {
                arrayList.add(next);
            }
        }
        c43764HFo2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it2.next();
            DiyPropVideo diyPropVideo = timeSpeedModelExtension.getDiyPropVideo();
            if (diyPropVideo != null && (videoPath = diyPropVideo.getVideoPath()) != null) {
                String separator2 = File.separator;
                o.LJIIIIZZ(separator2, "separator");
                String substring = videoPath.substring(s.LJJLIIJ(videoPath, separator2, 6) + 1);
                o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                String LJJIII = C5YW.LIZIZ().LJJIII(c43764HFo2.LJ, substring);
                if (C44687HgJ.LIZIZ(LJJIII)) {
                    videoPath = LJJIII;
                }
                if (C44687HgJ.LIZIZ(videoPath)) {
                    Long l = (Long) linkedHashMap.get(String.valueOf(videoPath));
                    if (timeSpeedModelExtension.getSpeed() > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        String valueOf = String.valueOf(videoPath);
                        if (l != null) {
                            j = l.longValue();
                        } else {
                            j = 0;
                        }
                        linkedHashMap.put(valueOf, Long.valueOf(j + TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed())));
                    }
                }
            }
        }
        int i = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            long longValue = ((Number) entry.getValue()).longValue();
            this.LJLIL.getClass();
            int LIZIZ = (((int) longValue) / C54846Lfm.LIZIZ()) + 1;
            int[] iArr = new int[LIZIZ];
            for (int i2 = 0; i2 < LIZIZ; i2++) {
                iArr[i2] = C54846Lfm.LIZIZ() * i2;
            }
            int i3 = C54846Lfm.LJLJJI[0];
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append("_extract_frame");
            VEUtils.saveVideoFrames(str2, iArr, i3, -1, false, str, X1D.LIZIZ(LIZ), 1);
            i++;
        }
        String extractFramesDir = this.LJLIL.LJI().getExtractFramesDir();
        String separator3 = File.separator;
        o.LJIIIIZZ(separator3, "separator");
        if (!ujb.o.LJJJJ(extractFramesDir, separator3, false)) {
            extractFramesDir = extractFramesDir.concat(separator3);
        }
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null && listFiles.length != 0) {
            for (File file : listFiles) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(extractFramesDir);
                LIZ2.append(file.getName());
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                C39579Fg7.LIZLLL(file.getAbsolutePath(), LIZIZ2);
                this.LJLIL.LJI().addFrameAtLastSegment(new FrameItem(LIZIZ2, 0, 0, false, null, null, 62, null));
            }
        }
        C39579Fg7.LJIJJLI(str);
        C39579Fg7.LJIL(str);
        return null;
    }
}