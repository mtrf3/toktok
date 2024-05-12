package Y;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C188727au;
import X.C242549fW;
import X.C2NU;
import X.C31268COy;
import X.C34T;
import X.C38352F3k;
import X.C39223FaN;
import X.C39579Fg7;
import X.C41823GbD;
import X.C45804HyK;
import X.C50741Jvl;
import X.C58096Mr6;
import X.C5S1;
import X.C60734NsY;
import X.C61740OKy;
import X.C62011OVj;
import X.C65352Pkq;
import X.C65776Prg;
import X.C77321UWf;
import X.C78966Uyw;
import X.C79004UzY;
import X.C84779XPb;
import X.EnumC67182kM;
import X.FD5;
import X.FMX;
import X.HG3;
import X.JBR;
import X.NC7;
import X.NC9;
import X.O26;
import X.O6R;
import X.OBS;
import X.OIA;
import X.OL1;
import X.OL2;
import X.OL3;
import X.OR0;
import X.OW4;
import X.OW6;
import X.PVC;
import X.ProgressDialogC43241Gy5;
import X.RBX;
import X.X1D;
import X.X5R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.lynx.tasm.LynxTemplateRender;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.api.FeedFragmentClassService;
import com.ss.android.ugc.aweme.feed.api.IFeedRecommendFragmentClass;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.search.performance.preload.core.viewmodel.PresetQueries;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ARunnableS9S1200000_10 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        VideoUrlModel playAddrH264;
        String str;
        C31268COy.LJI.LIZLLL.setThumbnailPath(this.s0);
        OW6 ow6 = (OW6) this.l2;
        Aweme aweme = (Aweme) this.l1;
        if (aweme != null) {
            ow6.getClass();
            if ((aweme.getAuthor() == null || !TextUtils.equals(((RBX) HG3.LJIILL()).getCurUserId(), aweme.getAuthorUid())) && aweme.getStatus() != null && aweme.getStatus().getPrivateStatus() == 1) {
                C5S1 c5s1 = new C5S1(ow6.LIZIZ);
                c5s1.LIZJ(R.string.tmd);
                c5s1.LJ();
            } else if (C2NU.LIZ.LIZIZ()) {
                Video video = aweme.getVideo();
                if (video != null && (playAddrH264 = video.getPlayAddrH264()) != null) {
                    List<String> urlList = playAddrH264.getUrlList();
                    if (!C79004UzY.LJJIFFI(urlList)) {
                        if (urlList.size() > 2) {
                            str = (String) ListProtector.get(urlList, 2);
                        } else {
                            str = (String) ListProtector.get(urlList, 0);
                        }
                        ow6.LIZLLL = C41823GbD.LIZ(aweme, str);
                        if (!(!(!TextUtils.isEmpty(r0)))) {
                            ow6.LIZ = aweme;
                            if (aweme != null) {
                                ow6.LJ = C62011OVj.LIZIZ();
                                ow6.LJFF = C38352F3k.LIZJ(ow6.LIZ.getVideo().getPlayAddrH264().getUri());
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(ow6.LJ);
                                ow6.LJII = JBR.LJFF(LIZ, ow6.LJFF, ".mp4", LIZ);
                                StringBuilder LIZ2 = X1D.LIZ();
                                String LJFF = JBR.LJFF(LIZ2, ow6.LJ, "temp/", LIZ2);
                                ow6.LJI = LJFF;
                                if (!C39579Fg7.LIZIZ(LJFF)) {
                                    C39579Fg7.LJ(ow6.LJI, false);
                                }
                            }
                            String str2 = "";
                            if (C39579Fg7.LIZIZ(ow6.LJII)) {
                                ow6.LIZIZ(ow6.LJII);
                                C62011OVj.LJII(0, "");
                                ow6.LIZ();
                                return;
                            }
                            Activity activity = ow6.LIZIZ;
                            if (activity != null && !activity.isFinishing()) {
                                str2 = ow6.LIZIZ.getString(R.string.hv9);
                            }
                            if (ow6.LIZJ == null) {
                                ProgressDialogC43241Gy5 LIZIZ = ProgressDialogC43241Gy5.LIZIZ(ow6.LIZIZ, str2);
                                ow6.LIZJ = LIZIZ;
                                LIZIZ.setIndeterminate(false);
                            }
                            ow6.LIZJ.setProgress(0);
                            OW4 ow4 = new OW4(ow6);
                            X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(ow6.LIZLLL);
                            StringBuilder LIZ3 = X1D.LIZ();
                            with.LIZJ = JBR.LJFF(LIZ3, ow6.LJFF, ".mp4", LIZ3);
                            StringBuilder LIZ4 = X1D.LIZ();
                            with.LJ = JBR.LJFF(LIZ4, ow6.LJ, "temp", LIZ4);
                            with.LJII = 3;
                            with.LJIIJ = "live_wall_paper_share";
                            with.LJJI = true;
                            with.LJIIL = ow4;
                            with.LIZJ();
                            C188727au c188727au = new C188727au();
                            c188727au.LJIIIZ("enter_from", "share");
                            FMX.LJIIL("wallpaper_start_download", c188727au.LIZ);
                            ow6.LJIIIZ.postDelayed(new ARunnableS46S0100000_10(ow6, 100), 60000L);
                            return;
                        }
                    }
                }
            } else {
                C5S1 c5s12 = new C5S1(ow6.LIZIZ);
                c5s12.LIZLLL(ow6.LIZIZ.getString(R.string.qdj));
                c5s12.LJ();
            }
        }
        ow6.LIZ();
    }

    public final void LIZ$1() {
        Fragment fragment;
        IFeedRecommendFragmentClass iFeedRecommendFragmentClass;
        C65776Prg c65776Prg;
        if (!OL3.LIZJ(this.s0) || (fragment = (Fragment) this.l1) == null) {
            return;
        }
        Object LIZ = C58096Mr6.LIZ(IFeedRecommendFragmentClass.class, false);
        if (LIZ != null) {
            iFeedRecommendFragmentClass = (IFeedRecommendFragmentClass) LIZ;
        } else {
            if (C58096Mr6.z0 == null) {
                synchronized (IFeedRecommendFragmentClass.class) {
                    if (C58096Mr6.z0 == null) {
                        C58096Mr6.z0 = new FeedFragmentClassService();
                    }
                }
            }
            iFeedRecommendFragmentClass = C58096Mr6.z0;
        }
        if (iFeedRecommendFragmentClass != null) {
            c65776Prg = iFeedRecommendFragmentClass.LIZ();
        } else {
            c65776Prg = null;
        }
        if (!o.LJ(C65352Pkq.LIZ(fragment.getClass()), c65776Prg)) {
            return;
        }
        OL1.LJIIJJI((Aweme) this.l2);
    }

    public final void LIZ$2() {
        ActivityC45651qj LJJIFFI;
        if (OL3.LIZJ(this.s0)) {
            OL3.LIZIZ = true;
            if (OL1.LJIIIZ((Aweme) this.l1)) {
                if (!OL3.LJ) {
                    OL1.LJIIJJI((Aweme) this.l1);
                    OL3.LJIIIIZZ((Context) this.l2, OL1.LIZIZ);
                    OL3.LJII((Context) this.l2);
                    return;
                }
                return;
            }
            Context context = (Context) this.l2;
            OL2.LIZIZ(context, OL1.LIZIZ, false, false);
            C61740OKy c61740OKy = OL3.LJFF;
            if (c61740OKy == null || context == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null) {
                return;
            }
            try {
                Hox.LJLLI.LIZ(LJJIFFI).zv0("page_profile", c61740OKy);
            } catch (Throwable unused) {
            }
        }
    }

    public final void LIZ$3() {
        String str;
        File file;
        String str2;
        BufferedReader bufferedReader;
        List<String> list;
        try {
            try {
                OR0 or0 = new OR0(C34T.LLLIIII(O26.LIZIZ((O26) this.l1), EnumC67182kM.TOP_DOWN));
                while (true) {
                    str = null;
                    if (or0.hasNext()) {
                        file = or0.next();
                        if (!file.isDirectory()) {
                            break;
                        }
                    } else {
                        file = null;
                        break;
                    }
                }
                File file2 = file;
                if (file2 != null && file2.exists()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Target file found: ");
                    if (file2 == null) {
                        str2 = null;
                    } else {
                        str2 = file2.getName();
                    }
                    LIZ.append(str2);
                    X1D.LIZIZ(LIZ);
                    if (file2 != null) {
                        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file2), PVC.LIZ);
                        if (inputStreamReader instanceof BufferedReader) {
                            bufferedReader = (BufferedReader) inputStreamReader;
                        } else {
                            bufferedReader = new BufferedReader(inputStreamReader, FileUtils.BUFFER_SIZE);
                        }
                        OBS obs = (OBS) this.l2;
                        String str3 = this.s0;
                        try {
                            PresetQueries presetQueries = (PresetQueries) C78966Uyw.LJJJJJL((Gson) obs.LIZ.getValue(), C77321UWf.LJIILJJIL(bufferedReader), PresetQueries.class);
                            if (presetQueries != null && (list = presetQueries.queries) != null && (true ^ list.isEmpty())) {
                                HashSet hashSet = new HashSet();
                                hashSet.addAll(list);
                                obs.LIZJ = new C50741Jvl(hashSet, str3);
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("Local queries loaded to cache, size: ");
                                LIZ2.append(obs.LIZJ.LJLIL.size());
                                X1D.LIZIZ(LIZ2);
                            }
                            AnonymousClass636.LJFF(bufferedReader, null);
                        } finally {
                        }
                    }
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("File not found: ");
                    if (file2 != null) {
                        str = file2.getPath();
                    }
                    LIZ3.append(str);
                    X1D.LIZIZ(LIZ3);
                }
            } catch (FileNotFoundException | NullPointerException unused) {
            }
        } finally {
            ((OBS) this.l2).LIZJ().LIZIZ();
        }
    }

    public final void LIZ$4() {
        ((C60734NsY) this.l1).LJLIL.LJIILIIL(this.s0, (byte[]) this.l2);
        String str = ((C60734NsY) this.l1).LJLIL.getHybridContext().containerId;
        C60734NsY c60734NsY = (C60734NsY) this.l1;
        FD5.LJIIIZ(str, "container_resource_preload", "use", null, c60734NsY.LJLJJI, c60734NsY.LJLIL.getHybridContext().bid, null, null, 200);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$5() {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS9S1200000_10.LIZ$5():void");
    }

    public static final void run$0(ARunnableS9S1200000_10 aRunnableS9S1200000_10) {
        boolean LIZ;
        try {
            ((LynxTemplateRender) aRunnableS9S1200000_10.l2).LJIJI(aRunnableS9S1200000_10.s0, (byte[]) aRunnableS9S1200000_10.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS9S1200000_10 aRunnableS9S1200000_10) {
        boolean LIZ;
        try {
            aRunnableS9S1200000_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS9S1200000_10 aRunnableS9S1200000_10) {
        boolean LIZ;
        try {
            aRunnableS9S1200000_10.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS9S1200000_10 aRunnableS9S1200000_10) {
        try {
            ((C84779XPb) aRunnableS9S1200000_10.l1).LJ((Aweme) aRunnableS9S1200000_10.l2, aRunnableS9S1200000_10.s0);
        } catch (Exception unused) {
        } catch (Throwable th) {
            if (C39223FaN.LIZ(th)) {
            } else {
                throw th;
            }
        }
    }

    public static final void run$3(ARunnableS9S1200000_10 aRunnableS9S1200000_10) {
        boolean LIZ;
        try {
            aRunnableS9S1200000_10.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS9S1200000_10 aRunnableS9S1200000_10) {
        boolean LIZ;
        try {
            aRunnableS9S1200000_10.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS9S1200000_10 aRunnableS9S1200000_10) {
        boolean LIZ;
        try {
            Aweme LIZ2 = OL3.LIZ((Aweme) aRunnableS9S1200000_10.l1, aRunnableS9S1200000_10.s0);
            if (LIZ2 != null && !OL3.LJ) {
                OL3.LJIIIIZZ((Context) aRunnableS9S1200000_10.l2, LIZ2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS9S1200000_10 aRunnableS9S1200000_10) {
        boolean LIZ;
        try {
            ((OIA) aRunnableS9S1200000_10.l2).LIZ.LJIIJJI(aRunnableS9S1200000_10.s0, (Throwable) aRunnableS9S1200000_10.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS9S1200000_10 aRunnableS9S1200000_10) {
        boolean LIZ;
        try {
            if (!O6R.LJIJI((NC7) aRunnableS9S1200000_10.l1, aRunnableS9S1200000_10.s0, (AnoleComponentAppearModel) aRunnableS9S1200000_10.l2)) {
                C242549fW.LIZ("checkHideComponentPreconditions = false");
            } else {
                NC7 nc7 = (NC7) aRunnableS9S1200000_10.l1;
                String str = aRunnableS9S1200000_10.s0;
                AnoleComponentAppearModel anoleComponentAppearModel = (AnoleComponentAppearModel) aRunnableS9S1200000_10.l2;
                NC9 nc9 = nc7.LJI.get(str);
                if (nc9 != null) {
                    nc9.L0(anoleComponentAppearModel);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS9S1200000_10 aRunnableS9S1200000_10) {
        boolean LIZ;
        try {
            aRunnableS9S1200000_10.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS9S1200000_10 aRunnableS9S1200000_10) {
        boolean LIZ;
        try {
            aRunnableS9S1200000_10.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS9S1200000_10(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj2;
        this.l2 = obj;
    }
}
