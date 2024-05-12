package X;

import Y.ACallableS105S0100000_2;
import Y.AgS120S0100000_2;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.UploadSingleSelectData;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.o;

/* renamed from: X.Gw5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43117Gw5 {
    public static final C43117Gw5 LIZ = new C43117Gw5();
    public static final int LIZIZ = 35;

    public static boolean LIZLLL() {
        UploadSingleSelectData LIZ2;
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
        if (!C43119Gw7.LIZ() || C1DG.LJIIIIZZ()) {
            if (!C43326GzS.LIZ.contains(Integer.valueOf(C43326GzS.LIZIZ)) || (LIZ2 = HRV.LIZ()) == null || !LIZ2.getUploadAllTabNonStory() || !HRV.LIZIZ()) {
                return false;
            }
        }
        return C45771Hxn.LIZIZ;
    }

    public static int LJII() {
        if (C45771Hxn.LIZIZ) {
            return LIZIZ;
        }
        return 12;
    }

    public static String LJIIIIZZ() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(simpleDateFormat.format(time));
        LIZ2.append(".png");
        return X1D.LIZIZ(LIZ2);
    }

    public static void LIZJ(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            o.LJIIIIZZ(files, "files");
            for (File file2 : files) {
                LIZJ(file2);
            }
        }
        C16880lQ.LLLZZIL(file);
    }

    public static String LJFF(CreativeInfo creativeInfo) {
        return C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJIILJJIL(creativeInfo);
    }

    public static String LJI(Context context) {
        String str;
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            str = resources.getString(R.string.e8n);
        } else {
            str = null;
        }
        o.LJI(str);
        return Q8U.LIZIZ(new Object[]{Integer.valueOf(LJII())}, 1, str, "format(format, *args)");
    }

    public static boolean LJIIIZ(String str) {
        Boolean mediaTypeCache = C60903NvH.LJIIJJI().LJIIZILJ().getMediaTypeCache(str);
        if (mediaTypeCache != null) {
            return mediaTypeCache.booleanValue();
        }
        return C44694HgQ.LJIJI(str, true);
    }

    public static void LIZ(List list, InterfaceC141565h2 interfaceC141565h2) {
        if (C77413UZt.LJIILL(list)) {
            interfaceC141565h2.LIZ(false);
        } else {
            C10K.LIZJ(new ACallableS105S0100000_2(list, 1)).LJ(new AgS120S0100000_2(interfaceC141565h2, 2), C10K.LJIIIIZZ, null);
        }
    }

    public static String LIZIZ(CreativeInfo creativeInfo, String path) {
        Bitmap LJFF;
        o.LJIIIZ(path, "path");
        int[] photoInfo = AVExternalServiceImpl.LIZ().abilityService().infoService().photoInfo(path);
        int i = photoInfo[0];
        int i2 = photoInfo[1];
        double d = i2;
        double d2 = i;
        double d3 = d2 * 2.4d;
        if (d > d3) {
            LJFF = C42307Gj1.LJFF(i, (int) d3, C42307Gj1.LIZIZ(path), 1, path);
        } else {
            double d4 = d * 2.4d;
            if (d2 > d4) {
                LJFF = C42307Gj1.LJFF((int) d4, i2, C42307Gj1.LIZIZ(path), 1, path);
            }
            return path;
        }
        if (LJFF != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LJFF(creativeInfo));
            LIZ2.append(LJIIIIZZ());
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            if (C42307Gj1.LJ(LJFF, new File(LIZIZ2), 100, Bitmap.CompressFormat.PNG)) {
                return LIZIZ2;
            }
        }
        return path;
    }

    public static boolean LJ(int i, boolean z) {
        if (i == 15) {
            return false;
        }
        if (i == 6 || i == 18 || i == 22 || i == 24 || i == 36) {
            return true;
        }
        if (i == 29) {
            if (HRX.LIZ() == 0) {
                return true;
            }
        } else if (i == 16) {
            return true;
        }
        if (!C45771Hxn.LIZIZ) {
            if (!C43118Gw6.LIZ() || !e1.LIZ(31744, "support_multiple_selection_of_the_same_material", true, false) || i != 2) {
                return false;
            }
        } else {
            if (i == 3 || i == 12) {
                if (!z) {
                    return false;
                }
            } else if (i == 19) {
                return true;
            }
            if (i == 4 || i == 10 || i == 27 || i == 37 || i == 30 || i == 35) {
                return false;
            }
        }
        return true;
    }

    public static List LJIIJ(CreativeInfo creativeInfo, List list) {
        if (!C42117Gfx.LJ()) {
            return list;
        }
        String LJFF = LJFF(creativeInfo);
        if (!C1B6.LIZIZ(LJFF)) {
            C1I0.LIZJ(LJFF);
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    LIZ.getClass();
                    if (!LJIIIZ(str)) {
                        Bitmap frameAtTime = C44694HgQ.LJIILLIIL(str).getFrameAtTime(0L);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(LJFF);
                        LIZ2.append(LJIIIIZZ());
                        String LIZIZ2 = X1D.LIZIZ(LIZ2);
                        if (C42299Git.LJFF(frameAtTime, new File(LIZIZ2), 100, Bitmap.CompressFormat.PNG)) {
                            arrayList.add(LIZIZ2);
                        } else {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("video2Image->paths->");
                            LIZ3.append(str);
                            LIZ3.append("->");
                            LIZ3.append(frameAtTime);
                            C78983UzD.LJIILL(X1D.LIZIZ(LIZ3));
                        }
                    } else {
                        arrayList.add(str);
                    }
                }
            } catch (Exception e) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("video2Image:");
                LIZ4.append(e.getLocalizedMessage());
                C78983UzD.LJIILL(X1D.LIZIZ(LIZ4));
                return null;
            }
        }
        return arrayList;
    }

    public static boolean LJIIJJI(C43117Gw5 c43117Gw5, CreativeInfo creativeInfo, ArrayList arrayList, ArrayList arrayList2, long j, int i) {
        ArrayList arrayList3;
        Bitmap frameAtTime;
        String LIZIZ2;
        ArrayList arrayList4 = null;
        if ((i & 2) != 0) {
            arrayList = null;
        }
        if ((i & 4) != 0) {
            arrayList2 = null;
        }
        if ((i & 8) != 0) {
            j = 1000;
        }
        c43117Gw5.getClass();
        o.LJIIIZ(creativeInfo, "creativeInfo");
        if (!C42117Gfx.LJ()) {
            return true;
        }
        String LJFF = LJFF(creativeInfo);
        if (!C1B6.LIZIZ(LJFF)) {
            C1I0.LIZJ(LJFF);
        }
        if (arrayList != null) {
            arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                VideoSegment videoSegment = (VideoSegment) next;
                if (!videoSegment.isImageType && videoSegment.duration < j) {
                    arrayList3.add(next);
                }
            }
        } else {
            arrayList3 = null;
        }
        if (arrayList2 != null) {
            arrayList4 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                MediaModel mediaModel = (MediaModel) next2;
                if (mediaModel.LJI() && mediaModel.duration < j) {
                    arrayList4.add(next2);
                }
            }
        }
        if (arrayList3 != null) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                VideoSegment videoSegment2 = (VideoSegment) it3.next();
                try {
                    Bitmap frameAtTime2 = C44694HgQ.LJIILLIIL(videoSegment2.LJII(false)).getFrameAtTime(0L);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LJFF);
                    LIZ.getClass();
                    LIZ2.append(LJIIIIZZ());
                    String LIZIZ3 = X1D.LIZIZ(LIZ2);
                    if (C42299Git.LJFF(frameAtTime2, new File(LIZIZ3), 100, Bitmap.CompressFormat.PNG)) {
                        videoSegment2.LJIIL(LIZIZ3);
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("video2Image->segments->");
                        LIZ3.append(videoSegment2.LJII(false));
                        LIZ3.append("->");
                        LIZ3.append(frameAtTime2);
                        C78983UzD.LJIILL(X1D.LIZIZ(LIZ3));
                        break;
                    }
                } catch (Exception e) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("video2Image:");
                    LIZ4.append(e.getLocalizedMessage());
                    C78983UzD.LJIILL(X1D.LIZIZ(LIZ4));
                }
            }
        }
        if (arrayList4 == null) {
            return true;
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            MediaModel mediaModel2 = (MediaModel) it4.next();
            try {
                frameAtTime = C44694HgQ.LJIILLIIL(mediaModel2.fileLocalUriPath).getFrameAtTime(0L);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(LJFF);
                LIZ.getClass();
                LIZ5.append(LJIIIIZZ());
                LIZIZ2 = X1D.LIZIZ(LIZ5);
            } catch (Exception e2) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("video2Image:");
                LIZ6.append(e2.getLocalizedMessage());
                C78983UzD.LJIILL(X1D.LIZIZ(LIZ6));
            }
            if (C42299Git.LJFF(frameAtTime, new File(LIZIZ2), 100, Bitmap.CompressFormat.PNG)) {
                mediaModel2.fileLocalUriPath = LIZIZ2;
                mediaModel2.type = 1;
                mediaModel2.mimeType = "image/png";
            } else {
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("video2Image->mediaList->");
                LIZ7.append(mediaModel2.fileLocalUriPath);
                LIZ7.append("->");
                LIZ7.append(frameAtTime);
                C78983UzD.LJIILL(X1D.LIZIZ(LIZ7));
                return false;
            }
        }
        return true;
    }
}
