package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6ZR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ZR {
    public static final /* synthetic */ int LIZ = 0;

    public static EditPreviewInfo LIZ(boolean z, Workspace workspace, List videoSegment, long[] jArr) {
        Object next;
        int i;
        Object next2;
        int i2;
        int i3;
        VideoCutInfo videoCutInfo;
        VideoCutInfo videoCutInfo2;
        o.LJIIIZ(videoSegment, "videoSegment");
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator it = videoSegment.iterator();
            Object obj = null;
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int i4 = ((VideoSegment) next).height;
                    do {
                        Object next3 = it.next();
                        int i5 = ((VideoSegment) next3).height;
                        if (i4 < i5) {
                            next = next3;
                            i4 = i5;
                        }
                    } while (it.hasNext());
                }
            }
            VideoSegment videoSegment2 = (VideoSegment) next;
            if (videoSegment2 != null) {
                i = videoSegment2.height;
            } else {
                i = 0;
            }
            C44422Hc2.LIZ("video_height", Integer.valueOf(i));
            Iterator it2 = videoSegment.iterator();
            if (!it2.hasNext()) {
                next2 = null;
            } else {
                next2 = it2.next();
                if (it2.hasNext()) {
                    int i6 = ((VideoSegment) next2).width;
                    do {
                        Object next4 = it2.next();
                        int i7 = ((VideoSegment) next4).width;
                        if (i6 < i7) {
                            next2 = next4;
                            i6 = i7;
                        }
                    } while (it2.hasNext());
                }
            }
            VideoSegment videoSegment3 = (VideoSegment) next2;
            if (videoSegment3 != null) {
                i2 = videoSegment3.width;
            } else {
                i2 = 0;
            }
            C44422Hc2.LIZ("video_width", Integer.valueOf(i2));
            Iterator it3 = videoSegment.iterator();
            if (it3.hasNext()) {
                obj = it3.next();
                if (it3.hasNext()) {
                    int LJI = ((VideoSegment) obj).LJI();
                    do {
                        Object next5 = it3.next();
                        int LJI2 = ((VideoSegment) next5).LJI();
                        if (LJI < LJI2) {
                            obj = next5;
                            LJI = LJI2;
                        }
                    } while (it3.hasNext());
                }
            }
            VideoSegment videoSegment4 = (VideoSegment) obj;
            if (videoSegment4 != null) {
                i3 = videoSegment4.LJI();
            } else {
                i3 = 0;
            }
            C44422Hc2.LIZ("video_fps", Integer.valueOf(i3));
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(videoSegment, 10));
            Iterator it4 = videoSegment.iterator();
            while (it4.hasNext()) {
                arrayList2.add(C78926UyI.LJJJJJL((VideoSegment) it4.next()));
            }
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
            long j = jArr[0];
            long j2 = jArr[1];
            if (j >= 0 && (videoCutInfo2 = ((EditVideoSegment) ListProtector.get(arrayList, 0)).getVideoCutInfo()) != null) {
                ListProtector.set(arrayList, 0, EditVideoSegment.copy$default((EditVideoSegment) ListProtector.get(arrayList, 0), null, null, null, new VideoCutInfo(videoCutInfo2.getStart() + j, videoCutInfo2.getEnd(), videoCutInfo2.getSpeed(), videoCutInfo2.getRotate()), 7, null));
            }
            if (j2 >= 0 && (videoCutInfo = ((EditVideoSegment) AnonymousClass028.LIZIZ(arrayList, 1, arrayList)).getVideoCutInfo()) != null) {
                ListProtector.set(arrayList, arrayList.size() - 1, EditVideoSegment.copy$default((EditVideoSegment) AnonymousClass028.LIZIZ(arrayList, 1, arrayList), null, null, null, new VideoCutInfo(videoCutInfo.getStart(), videoCutInfo.getEnd() - j2, videoCutInfo.getSpeed(), videoCutInfo.getRotate()), 7, null));
            }
            return new C6NR(C60903NvH.LJIIJJI().LJJIJLIJ().getVideoWidth(), C60903NvH.LJIIJJI().LJJIJLIJ().getVideoHeight(), 28).LIZ(arrayList);
        }
        C149505tq c149505tq = new C149505tq(0, 0, 15);
        String path = workspace.E().getPath();
        o.LJIIIIZZ(path, "workspace.concatVideoFile.path");
        return c149505tq.LIZ(new EditVideoSegment(path, workspace.LJJJJLI().getPath(), C78926UyI.LJJJLZIJ(workspace.E().getPath())));
    }
}
