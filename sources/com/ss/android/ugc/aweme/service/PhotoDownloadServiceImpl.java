package com.ss.android.ugc.aweme.service;

import X.C188727au;
import X.C42593Gnd;
import X.C43170Gww;
import X.C44896Hjg;
import X.C44897Hjh;
import X.C44898Hji;
import X.C44905Hjp;
import X.C44915Hjz;
import X.C45374HrO;
import X.FMX;
import X.InterfaceC62486Ofi;
import X.KNV;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PhotoDownloadServiceImpl implements IPhotoDownloadService {
    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LJII() {
        C44896Hjg.LJIJJLI = true;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LIZ() {
        C44896Hjg.LJIJ = C44896Hjg.LJIIZILJ;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LIZIZ() {
        String str;
        Integer num;
        int i;
        String string;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        if (C44896Hjg.LIZIZ || (!C44896Hjg.LJIIJJI.isEmpty())) {
            String str2 = C44896Hjg.LJIJI;
            Aweme aweme = C44896Hjg.LJI;
            int i2 = C44896Hjg.LJIIIZ;
            C188727au LIZLLL = KNV.LIZLLL(str2, "enterFrom");
            LIZLLL.LJIIIZ("enter_from", str2);
            String str3 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            LIZLLL.LJIIIZ("group_id", str);
            if (aweme != null) {
                num = Integer.valueOf(aweme.getAwemeType());
            } else {
                num = null;
            }
            LIZLLL.LJFF(num, "aweme_type");
            if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                i = imageList.size();
            } else {
                i = 0;
            }
            LIZLLL.LIZLLL(i, "pic_cnt");
            LIZLLL.LIZLLL(i2, "download_pic_cnt");
            Bundle bundle = C44896Hjg.LJIL;
            if (bundle != null) {
                str3 = bundle.getString("detail_tab_name");
            }
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            LIZLLL.LJIIIZ("detail_tab_name", str3);
            Bundle bundle2 = C44896Hjg.LJIL;
            if (bundle2 != null && (string = bundle2.getString("download_method")) != null) {
                str4 = string;
            }
            LIZLLL.LJIIIZ("download_method", str4);
            FMX.LJIIL("download_cancel", LIZLLL.LIZ);
            int i3 = C44896Hjg.LJIIIIZZ;
            if (i3 != 0 && C44896Hjg.LJIILL != null) {
                DownloadServiceManager.INSTANCE.getDownloadService().cancel(i3);
            }
        }
        C44896Hjg.LIZIZ = false;
        C44896Hjg.LJFF = true;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final Observer<Aweme> LIZJ() {
        return new C44898Hji();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LJIIIIZZ() {
        C44896Hjg.LIZJ = "";
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final boolean LJFF() {
        return C44896Hjg.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final boolean LJI() {
        return C44896Hjg.LJIJJLI;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LJIIIZ(SharePackage sharePackage) {
        C44905Hjp.LIZ(sharePackage);
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void a1(int i) {
        C44896Hjg.LJIIZILJ = i;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final InterfaceC62486Ofi LIZLLL(Activity activity, Aweme aweme, String str, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str3;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(aweme, "aweme");
        String str7 = "";
        if (str5 == null) {
            str5 = "";
        }
        if (str6 == null) {
            str6 = "";
        }
        if (str4 != null) {
            str7 = str4;
        }
        return new C44915Hjz(activity, aweme, str5, str2, str6, str7);
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LJ(Activity activity, Integer num, Aweme aweme, C45374HrO c45374HrO, C42593Gnd c42593Gnd, String str) {
        String str2;
        C43170Gww c43170Gww = new C43170Gww(new WeakReference(activity), num);
        C44897Hjh c44897Hjh = new C44897Hjh(c45374HrO, aweme, str, c43170Gww);
        String LIZIZ = c43170Gww.LIZIZ(aweme, 0, c42593Gnd);
        if (LIZIZ == null) {
            str2 = "";
        } else {
            str2 = LIZIZ;
        }
        C44896Hjg.LIZJ = str2;
        if (LIZIZ != null) {
            c43170Gww.LIZ(LIZIZ, c44897Hjh, c42593Gnd);
        }
    }
}
