package X;

import Y.AfS56S0100000_4;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.core.model.Animation;
import com.bytedance.touchpoint.core.model.CompactPicture;
import com.bytedance.touchpoint.core.model.Picture;
import com.bytedance.touchpoint.core.model.PopupView;
import com.bytedance.touchpoint.core.model.ReferralFeedBanner;
import com.bytedance.touchpoint.core.model.TouchPoint;
import com.bytedance.touchpoint.core.model.Video;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import defpackage.b1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9nF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247339nF {
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C247889o8.INSTANCE);
    public final int LJ;
    public static final C247409nM LJI = new C247409nM();
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C59112Tr.LJLIL);

    public final String LJ() {
        return (String) this.LIZLLL.getValue();
    }

    public C247339nF(int i) {
        this.LJ = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0047, code lost:
    
        if (r1 != null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(com.bytedance.touchpoint.core.model.ReferralFeedBanner r8) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C247339nF.LIZ(com.bytedance.touchpoint.core.model.ReferralFeedBanner):boolean");
    }

    public final void LIZJ(final ReferralFeedBanner referralFeedBanner) {
        Integer valueOf;
        List<CompactPicture> list;
        CompactPicture compactPicture;
        Picture picture;
        Animation animation;
        Video video;
        final PopupView popupView;
        if (this.LIZJ || referralFeedBanner == null || (valueOf = Integer.valueOf(referralFeedBanner.bannerType)) == null) {
            return;
        }
        if (valueOf.intValue() == 2 || valueOf.intValue() == 7) {
            List<Video> list2 = referralFeedBanner.videos;
            if (list2 != null && (video = (Video) ORZ.LJLLLLLL(this.LIZIZ, list2)) != null && (popupView = video.popupView) != null) {
                StringBuilder LIZ = X1D.LIZ();
                String LIZIZ = b1.LIZIZ(popupView.widgetImage, LIZ, ".png", LIZ);
                this.LIZJ = true;
                InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                if (interfaceC247459nR == null) {
                    return;
                }
                String str = popupView.widgetImage;
                String savePath = LJ();
                o.LJIIIIZZ(savePath, "savePath");
                interfaceC247459nR.LJI(str, savePath, LIZIZ, "refferal image", new AbsDownloadListener() { // from class: X.9nG
                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onSuccessed(DownloadInfo downloadInfo) {
                        String str2;
                        int i;
                        PopupView popupView2 = popupView;
                        if (downloadInfo == null || (str2 = downloadInfo.getTargetFilePath()) == null) {
                            str2 = "";
                        }
                        popupView2.getClass();
                        popupView2.LJLIL = str2;
                        C247339nF.this.LIZJ = false;
                        ReferralFeedBanner referralFeedBanner2 = referralFeedBanner;
                        int i2 = referralFeedBanner2.LIZ;
                        Integer num = referralFeedBanner2.LIZJ;
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = -1;
                        }
                        C247749nu.LIZ(1, i2, i, "");
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                        int i;
                        C247339nF c247339nF = C247339nF.this;
                        c247339nF.LIZJ = false;
                        c247339nF.LIZIZ++;
                        c247339nF.LIZJ(referralFeedBanner);
                        ReferralFeedBanner referralFeedBanner2 = referralFeedBanner;
                        int i2 = referralFeedBanner2.LIZ;
                        Integer num = referralFeedBanner2.LIZJ;
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = -1;
                        }
                        C247749nu.LIZ(0, i2, i, "");
                    }
                }, 2, true);
                return;
            }
            return;
        }
        if (valueOf.intValue() == 1) {
            List<Picture> list3 = referralFeedBanner.pictures;
            if (list3 != null && (picture = (Picture) ORZ.LJLLLLLL(this.LIZIZ, list3)) != null && (animation = picture.animation) != null) {
                LIZIZ(referralFeedBanner, animation);
                return;
            }
            return;
        }
        if (valueOf.intValue() != 4 || (list = referralFeedBanner.compactPictures) == null || (compactPicture = (CompactPicture) ORZ.LJLLLLLL(this.LIZIZ, list)) == null) {
            return;
        }
        LIZIZ(referralFeedBanner, compactPicture.animation);
    }

    public final File LIZLLL(String str) {
        File file = null;
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJ());
            LIZ.append(str);
            File[] listFiles = new File(X1D.LIZIZ(LIZ)).listFiles();
            if (listFiles == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = listFiles.length;
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= length) {
                    break;
                }
                File it = listFiles[i];
                o.LJIIIIZZ(it, "it");
                if (!it.isFile() || !o.LJ(OR7.LLLIILIL(it), "json")) {
                    z = false;
                }
                if (z) {
                    arrayList.add(it);
                }
                i++;
            }
            if (!(!arrayList.isEmpty())) {
                arrayList = null;
            }
            if (arrayList == null) {
                return null;
            }
            file = (File) ListProtector.get(arrayList, 0);
            return file;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return file;
        }
    }

    public final void LJFF(ReferralFeedBanner referralFeedBanner) {
        String str;
        C243649hI LIZ = C95I.LIZ();
        String valueOf = String.valueOf(referralFeedBanner.LIZ);
        LJI.getClass();
        C247289nA LIZJ = C247409nM.LIZJ();
        if (LIZJ != null && LIZJ.LIZJ()) {
            str = "tiktok_now";
        } else {
            str = "";
        }
        String LJ = C247409nM.LJ();
        InterfaceC243629hG interfaceC243629hG = new InterfaceC243629hG() { // from class: X.95L
            @Override // X.InterfaceC243629hG
            public final void LIZ() {
            }

            @Override // X.InterfaceC243629hG
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC243629hG
            public final void onFail() {
                C247339nF.this.getClass();
                C247339nF.this.getClass();
                C2MW.LIZ().LIZ(C247339nF.this.LJ, null);
            }

            @Override // X.InterfaceC243629hG
            public final void onSuccess(List<TouchPoint> touchPoints) {
                C247339nF.this.getClass();
                C247339nF.this.getClass();
                if (touchPoints == null || touchPoints.isEmpty()) {
                    return;
                }
                C9O7 LIZ2 = C2MW.LIZ();
                LIZ2.getClass();
                o.LJIIIZ(touchPoints, "touchPoints");
                HashMap<Integer, TouchPoint> hashMap = new HashMap<>();
                ArrayList arrayList = new ArrayList();
                for (TouchPoint touchPoint : touchPoints) {
                    int i = touchPoint.touchPointId;
                    if (i == 8 || i == 28) {
                        arrayList.add(touchPoint);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    TouchPoint touchPoint2 = (TouchPoint) it.next();
                    LIZ2.LIZIZ.put(Integer.valueOf(touchPoint2.touchPointId), touchPoint2);
                    hashMap.put(Integer.valueOf(touchPoint2.touchPointId), touchPoint2);
                }
                new C95N().LIZ(hashMap);
            }
        };
        LIZ.getClass();
        C243649hI.LIZ(valueOf, str, LJ, interfaceC243629hG);
    }

    public final String LJII(String str) {
        String LJ = LJ();
        StringBuilder LIZ = X1D.LIZ();
        File file = new File(LJ, b1.LIZIZ(str, LIZ, ".png", LIZ));
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    public final void LIZIZ(ReferralFeedBanner referralFeedBanner, Animation animation) {
        StringBuilder LIZ = X1D.LIZ();
        String LJFF2 = JBR.LJFF(LIZ, animation.lottieMd5, ".zip", LIZ);
        File file = new File(LJ(), LJFF2);
        C247409nM c247409nM = LJI;
        String str = animation.lottieMd5;
        c247409nM.getClass();
        if (C247409nM.LIZ(file, str)) {
            File LIZLLL = LIZLLL(animation.lottieMd5);
            if (LIZLLL != null) {
                String absolutePath = LIZLLL.getAbsolutePath();
                o.LJIIIIZZ(absolutePath, "jsonFile.absolutePath");
                animation.LJLIL = absolutePath;
                return;
            }
            LJIIIIZZ(file, animation.lottieMd5, new AqS170S0100000_4(animation, 1423));
            return;
        }
        this.LIZJ = true;
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR == null) {
            return;
        }
        String str2 = animation.lottie;
        String savePath = LJ();
        o.LJIIIIZZ(savePath, "savePath");
        interfaceC247459nR.LJI(str2, savePath, LJFF2, "referral lottie", new C247359nH(this, animation, referralFeedBanner), 3, true);
    }

    public final String LJI(String zipName, String md5) {
        File LIZLLL;
        o.LJIIIZ(zipName, "zipName");
        o.LJIIIZ(md5, "md5");
        File file = new File(LJ(), zipName);
        LJI.getClass();
        if (C247409nM.LIZ(file, md5) && (LIZLLL = LIZLLL(md5)) != null) {
            return LIZLLL.getAbsolutePath();
        }
        return null;
    }

    public final void LJIIIIZZ(final File file, final String str, InterfaceC88472Yns<? super File, C76800UCe> interfaceC88472Yns) {
        AbstractC73672Svk.LJJIJIL("").LJJL(T16.LIZ()).LJJIJL(new InterfaceC48038ItG() { // from class: X.9nI
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object it) {
                o.LJIIIZ(it, "it");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C247339nF.this.LJ());
                LIZ.append(str);
                C31817CeD.LIZ(file, new File(X1D.LIZIZ(LIZ)));
                return C247339nF.this.LIZLLL(str);
            }
        }).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS56S0100000_4(interfaceC88472Yns, 134));
    }
}
