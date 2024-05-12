package X;

import android.app.Application;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.aweme.sticker.model.DiyPropVideo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class HFQ {
    public static final /* synthetic */ int LIZ = 0;

    public static final ArrayList<HFD> LIZ(VideoPublishEditModel videoPublishEditModel) {
        String videoPath;
        long j;
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        ArrayList<TimeSpeedModelExtension> LJIIJJI = CameraComponentModel.LJIIJJI(videoPublishEditModel.mVideoSegmentsDesc);
        if (C77413UZt.LJIILL(LJIIJJI)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<TimeSpeedModelExtension> it = LJIIJJI.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (next.getDiyPropVideo() != null) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it2.next();
            DiyPropVideo diyPropVideo = timeSpeedModelExtension.getDiyPropVideo();
            if (diyPropVideo != null && (videoPath = diyPropVideo.getVideoPath()) != null) {
                String str = "";
                if (!C44687HgJ.LIZIZ(videoPath)) {
                    String LJJIII = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIII(videoPublishEditModel, "");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LJJIII);
                    String separator = File.separator;
                    o.LJIIIIZZ(separator, "separator");
                    LIZ2.append((String) ORZ.LLFF(s.LJLJJL(videoPath, new String[]{separator}, 0, 6)));
                    videoPath = X1D.LIZIZ(LIZ2);
                }
                Application application = C60903NvH.LJ;
                o.LJIIIIZZ(application, "getApplication()");
                String LJI = C44694HgQ.LJI(application, videoPath);
                if (LJI != null) {
                    String separator2 = File.separator;
                    o.LJIIIIZZ(separator2, "separator");
                    str = LJI.substring(s.LJJLIIJ(LJI, separator2, 6) + 1);
                    o.LJIIIIZZ(str, "this as java.lang.String).substring(startIndex)");
                }
                String LJJIII2 = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIII(videoPublishEditModel, str);
                if (C39579Fg7.LIZIZ(LJJIII2)) {
                    LJI = LJJIII2;
                }
                if (C44687HgJ.LIZIZ(LJI)) {
                    Long l = (Long) linkedHashMap.get(String.valueOf(LJI));
                    if (timeSpeedModelExtension.getSpeed() > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        String valueOf = String.valueOf(LJI);
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
        ArrayList<HFD> arrayList2 = new ArrayList<>(LJIIJJI.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            long longValue = ((Number) entry.getValue()).longValue();
            HFD hfd = new HFD();
            hfd.LIZ = str2;
            hfd.LIZIZ = longValue;
            arrayList2.add(hfd);
        }
        return arrayList2;
    }

    public static final ArrayList<HFD> LIZIZ(List<? extends EditVideoSegment> list) {
        if (C77413UZt.LJIILL(list)) {
            return null;
        }
        o.LJI(list);
        ArrayList<HFD> arrayList = new ArrayList<>(list.size());
        for (EditVideoSegment editVideoSegment : list) {
            HFD hfd = new HFD();
            o.LJI(editVideoSegment);
            hfd.LIZ = editVideoSegment.getVideoPath();
            if (editVideoSegment.getVideoCutInfo() != null) {
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                o.LJI(videoCutInfo);
                videoCutInfo.getStart();
                VideoCutInfo videoCutInfo2 = editVideoSegment.getVideoCutInfo();
                o.LJI(videoCutInfo2);
                long end = videoCutInfo2.getEnd();
                VideoCutInfo videoCutInfo3 = editVideoSegment.getVideoCutInfo();
                o.LJI(videoCutInfo3);
                hfd.LIZIZ = end - videoCutInfo3.getStart();
            } else {
                hfd.LIZIZ = editVideoSegment.getVideoFileInfo().getDuration();
            }
            arrayList.add(hfd);
        }
        return arrayList;
    }

    public static final ArrayList<HFD> LIZJ(VideoPublishEditModel videoPublishEditModel) {
        String videoPath;
        long j;
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        ArrayList<TimeSpeedModelExtension> LJIIJJI = CameraComponentModel.LJIIJJI(videoPublishEditModel.mVideoSegmentsDesc);
        if (C77413UZt.LJIILL(LJIIJJI)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<TimeSpeedModelExtension> it = LJIIJJI.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (next.getBackgroundVideo() != null) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it2.next();
            BackgroundVideo backgroundVideo = timeSpeedModelExtension.getBackgroundVideo();
            if (backgroundVideo != null && (videoPath = backgroundVideo.getVideoPath()) != null) {
                String str = "";
                if (!C44687HgJ.LIZIZ(videoPath)) {
                    String LIZ2 = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LIZ(videoPublishEditModel, "");
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(LIZ2);
                    String separator = File.separator;
                    o.LJIIIIZZ(separator, "separator");
                    LIZ3.append((String) ORZ.LLFF(s.LJLJJL(videoPath, new String[]{separator}, 0, 6)));
                    videoPath = X1D.LIZIZ(LIZ3);
                }
                Application application = C60903NvH.LJ;
                o.LJIIIIZZ(application, "getApplication()");
                String LJI = C44694HgQ.LJI(application, videoPath);
                if (LJI != null) {
                    String separator2 = File.separator;
                    o.LJIIIIZZ(separator2, "separator");
                    str = LJI.substring(s.LJJLIIJ(LJI, separator2, 6) + 1);
                    o.LJIIIIZZ(str, "this as java.lang.String).substring(startIndex)");
                }
                String LIZ4 = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LIZ(videoPublishEditModel, str);
                if (C39579Fg7.LIZIZ(LIZ4)) {
                    LJI = LIZ4;
                }
                if (C44687HgJ.LIZIZ(LJI)) {
                    Long l = (Long) linkedHashMap.get(String.valueOf(LJI));
                    if (timeSpeedModelExtension.getSpeed() > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        String valueOf = String.valueOf(LJI);
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
        ArrayList<HFD> arrayList2 = new ArrayList<>(LJIIJJI.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            long longValue = ((Number) entry.getValue()).longValue();
            HFD hfd = new HFD();
            hfd.LIZ = str2;
            hfd.LIZIZ = longValue;
            arrayList2.add(hfd);
        }
        return arrayList2;
    }

    public static final ArrayList<HFD> LIZLLL(List<HFP> list) {
        if (C77413UZt.LJIILL(list)) {
            return null;
        }
        o.LJI(list);
        ArrayList<HFD> arrayList = new ArrayList<>(list.size());
        for (HFP hfp : list) {
            HFD hfd = new HFD();
            hfd.LIZ = hfp.LIZ;
            hfd.LIZIZ = hfp.LIZJ;
            arrayList.add(hfd);
        }
        return arrayList;
    }
}
