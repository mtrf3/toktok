package X;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS3S1001000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GYe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41700GYe {
    public static final C41700GYe LIZ = new C41700GYe();
    public static XKQ LIZIZ;
    public static C44428Hc8 LIZJ;
    public static C44428Hc8 LIZLLL;
    public static C44428Hc8 LJ;
    public static C44428Hc8 LJFF;
    public static CreativeInfo LJI;
    public static final boolean LJII;

    static {
        boolean z = true;
        if (!e1.LIZ(31744, "creation_inbox_topcell_on_this_day_edit", true, false)) {
            z = false;
        }
        LJII = z;
    }

    public static final int LJ(int i) {
        if (i != -16777216) {
            if (i != -1) {
                return i;
            }
            Application application = C60903NvH.LJ;
            o.LJIIIIZZ(application, "getApplication()");
            Integer LJI2 = C79045V0n.LJI(R.attr.dc, application);
            if (LJI2 == null) {
                return i;
            }
            return LJI2.intValue();
        }
        Application application2 = C60903NvH.LJ;
        o.LJIIIIZZ(application2, "getApplication()");
        Integer LJI3 = C79045V0n.LJI(R.attr.cb, application2);
        if (LJI3 == null) {
            return i;
        }
        return LJI3.intValue();
    }

    public static ArrayList LJFF(String str) {
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(str, iArr) != 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[6];
        int i4 = iArr[8];
        long j = iArr[3];
        arrayList.add(new ImportVideoInfo(i, i2, i3, i4, str, j, j, null, null, iArr[7], 1.0f, str, str, false, null));
        return arrayList;
    }

    public static void LJI(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ForwardEnvironment->");
        LIZ2.append(str);
        H7B.LIZ(X1D.LIZIZ(LIZ2));
    }

    public static void LJII(boolean z) {
        GGO ggo;
        if (z) {
            ggo = GGO.SHOW;
        } else {
            ggo = GGO.DISMISS;
        }
        C42303Gix.LIZ(1605, ggo, EnumC42283Gid.DUAL_BALL_WITH_MESSAGE, EnumC42282Gic.CLOSE_GONE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(InterfaceC64672gJ interfaceC64672gJ, ProgressDialogC43239Gy3 progressDialogC43239Gy3) {
        C38333F2r c38333F2r;
        C38306F1q c38306F1q;
        LJI("exception happen in prepareDataFlow,directly cancel");
        XKQ xkq = LIZIZ;
        String str = null;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        V1B.LJLILLLLZI(progressDialogC43239Gy3);
        int i = 0;
        LJII(false);
        C44428Hc8 c44428Hc8 = LIZJ;
        if (c44428Hc8 != null && c44428Hc8.LIZIZ) {
            c44428Hc8.LJ();
        }
        if (interfaceC64672gJ instanceof CancellationException) {
            Throwable th = (Throwable) interfaceC64672gJ;
            Throwable cause = th.getCause();
            if ((cause instanceof C38333F2r) && (c38306F1q = (C38306F1q) cause) != null) {
                i = c38306F1q.getErrorCode();
            }
            Throwable cause2 = th.getCause();
            if ((cause2 instanceof C38333F2r) && (c38333F2r = (C38333F2r) cause2) != null) {
                str = c38333F2r.getErrorMsg();
            }
            LJIIIIZZ(-1, new AqS3S1001000_7(i, str, 2));
        }
    }

    public static final void LIZLLL(ProgressDialogC43239Gy3 progressDialogC43239Gy3, boolean z) {
        long j;
        long j2;
        long j3;
        if (z) {
            V1B.LJLILLLLZI(progressDialogC43239Gy3);
        }
        LJII(false);
        C44428Hc8 c44428Hc8 = LIZJ;
        if (c44428Hc8 != null && c44428Hc8.LIZIZ) {
            c44428Hc8.LJ();
        }
        LJIIIIZZ(1, C41697GYb.LJLIL);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("finish setup environment,total cost:");
        C44428Hc8 c44428Hc82 = LIZJ;
        long j4 = -1;
        if (c44428Hc82 != null) {
            j = c44428Hc82.LIZIZ(TimeUnit.MILLISECONDS);
        } else {
            j = -1;
        }
        LIZ2.append(j);
        LIZ2.append(" ms,downloadVideo cost:");
        C44428Hc8 c44428Hc83 = LIZLLL;
        if (c44428Hc83 != null) {
            j2 = c44428Hc83.LIZIZ(TimeUnit.MILLISECONDS);
        } else {
            j2 = -1;
        }
        LIZ2.append(j2);
        LIZ2.append(" ms,downloadStyleCost:");
        C44428Hc8 c44428Hc84 = LJFF;
        if (c44428Hc84 != null) {
            j3 = c44428Hc84.LIZIZ(TimeUnit.MILLISECONDS);
        } else {
            j3 = -1;
        }
        LIZ2.append(j3);
        LIZ2.append(" ms,calculateBgCost:");
        C44428Hc8 c44428Hc85 = LJ;
        if (c44428Hc85 != null) {
            j4 = c44428Hc85.LIZIZ(TimeUnit.MILLISECONDS);
        }
        LIZ2.append(j4);
        LIZ2.append(" ms");
        LJI(X1D.LIZIZ(LIZ2));
    }

    public static void LJIIIIZZ(int i, InterfaceC88472Yns interfaceC88472Yns) {
        long j;
        long j2;
        long j3;
        C145995oB LIZIZ2 = GFJ.LIZIZ(i, "status");
        C44428Hc8 c44428Hc8 = LIZJ;
        long j4 = -1;
        if (c44428Hc8 != null) {
            j = c44428Hc8.LIZIZ(TimeUnit.MILLISECONDS);
        } else {
            j = -1;
        }
        LIZIZ2.LIZIZ(j, "total_time");
        C44428Hc8 c44428Hc82 = LIZLLL;
        if (c44428Hc82 != null) {
            j2 = c44428Hc82.LIZIZ(TimeUnit.MILLISECONDS);
        } else {
            j2 = -1;
        }
        LIZIZ2.LIZIZ(j2, "download_video_time");
        C44428Hc8 c44428Hc83 = LJFF;
        if (c44428Hc83 != null) {
            j3 = c44428Hc83.LIZIZ(TimeUnit.MILLISECONDS);
        } else {
            j3 = -1;
        }
        LIZIZ2.LIZIZ(j3, "download_style_time");
        C44428Hc8 c44428Hc84 = LJ;
        if (c44428Hc84 != null) {
            j4 = c44428Hc84.LIZIZ(TimeUnit.MILLISECONDS);
        }
        LIZIZ2.LIZIZ(j4, "calculate_bg_time");
        LIZIZ2.LIZ(0, "stream_edit_mode");
        LIZIZ2.LIZIZ(0L, "external_cache_size");
        interfaceC88472Yns.invoke(LIZIZ2);
        GXR.LIZ("tools_performance_on_this_day_pre_process", LIZIZ2.LIZ);
    }

    public static void LJIIIZ(C3CK c3ck, Object obj) {
        if (c3ck.LJII()) {
            return;
        }
        if (!(!(c3ck.LJIILLIIL(obj) instanceof C3C0))) {
            XKX.LJ(MBB.INSTANCE, new C79893Bp(c3ck, obj, null));
        }
        c3ck.LJJIFFI(null);
    }

    public static void LIZIZ(Context context, C41702GYg c41702GYg, CanvasVideoData canvasVideoData, boolean z) {
        int i;
        Intent intent = new Intent();
        C77412UZs.LJJIJIL(intent, c41702GYg.LIZ);
        String str = c41702GYg.LIZLLL.LIZ;
        ForwardMedia forwardMedia = c41702GYg.LIZIZ;
        CreativeInfo creativeInfo = c41702GYg.LIZ;
        OSZ<Integer, Integer> osz = c41702GYg.LJFF;
        CompileConfigResolution LJIIZILJ = C77123UOp.LJIIZILJ(null, str);
        int[] LIZ2 = C143205jg.LIZ(new int[]{LJIIZILJ.getWidth(), LJIIZILJ.getHeight()});
        CompileConfigResolution compileConfigResolution = new CompileConfigResolution(LIZ2[0], LIZ2[1], null, null, 12, null);
        ArrayList<? extends Parcelable> LJFF2 = LJFF(str);
        VideoFileInfo videoFileInfo = new VideoFileInfo(compileConfigResolution.getWidth(), compileConfigResolution.getHeight(), forwardMedia.getVideo().getSourceDuration(), 30, 0, 0, 0, 0, 0.0f, 496, null);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(C43073GvN.LIZLLL(C62850Ola.LJ(), creativeInfo, EnumC43649HBd.CONCAT, null, false, 12));
        LIZ3.append(C43075GvP.LIZ(".mp4"));
        String LIZIZ2 = X1D.LIZIZ(LIZ3);
        C78966Uyw.LJJJJZ(new File(LIZIZ2));
        intent.putExtra("extra_edit_preview_info", (Parcelable) new C149505tq(osz.getFirst().intValue(), osz.getSecond().intValue(), 12).LIZ(new EditVideoSegment(LIZIZ2, null, videoFileInfo)));
        intent.putParcelableArrayListExtra("extra_import_video_info_list", LJFF2);
        intent.putExtra("photo_canvas_data", canvasVideoData);
        if (z) {
            i = 4;
        } else {
            i = 3;
        }
        ForwardMedia forwardMedia2 = c41702GYg.LIZIZ;
        CreativeInfo creativeInfo2 = LJI;
        if (creativeInfo2 != null) {
            LIZ(intent, context, i, forwardMedia2, creativeInfo2);
            HZV.LIZ().LJJII(context, intent);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public static void LIZ(Intent intent, Context context, int i, ForwardMedia forwardMedia, CreativeInfo creativeInfo) {
        long j;
        AVChallenge aVChallenge = new AVChallenge();
        aVChallenge.challengeName = context.getString(R.string.p3);
        intent.putExtra("challenge", (Serializable) C47261Igj.LJJIJ(aVChallenge));
        intent.putExtra("on_this_day_day", (Serializable) new OnThisDayData(true, 0, i, forwardMedia.getPastMemoryKey(), forwardMedia.getCreateTime(), null, false, 96, null));
        intent.putExtra("workspace", HU5.LIZ(creativeInfo));
        intent.putExtra("origin", 0);
        intent.putExtra("shoot_way", "on_this_day");
        intent.putExtra("content_type", "share");
        intent.putExtra("content_source", "upload");
        intent.putExtra("extra_start_enter_edit_page", System.currentTimeMillis());
        C44428Hc8 c44428Hc8 = LIZJ;
        if (c44428Hc8 != null) {
            j = c44428Hc8.LIZIZ(TimeUnit.MILLISECONDS);
        } else {
            j = 0;
        }
        intent.putExtra("extra_import_compile_cost_time", j);
    }
}
