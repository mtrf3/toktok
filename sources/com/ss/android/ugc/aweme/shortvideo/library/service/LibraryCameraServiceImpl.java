package com.ss.android.ugc.aweme.shortvideo.library.service;

import X.C45709Hwn;
import X.C58096Mr6;
import X.C82622Wbi;
import X.EnumC45707Hwl;
import X.I80;
import X.WMH;
import android.app.Activity;
import com.ss.android.ugc.aweme.library.library.ILibraryCameraService;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import kotlin.jvm.internal.AqS14S0200100_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LibraryCameraServiceImpl implements ILibraryCameraService {
    public C45709Hwn LIZ;

    public static ILibraryCameraService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(ILibraryCameraService.class, false);
        if (LIZ != null) {
            return (ILibraryCameraService) LIZ;
        }
        if (C58096Mr6.a7 == null) {
            synchronized (ILibraryCameraService.class) {
                if (C58096Mr6.a7 == null) {
                    C58096Mr6.a7 = new LibraryCameraServiceImpl();
                }
            }
        }
        return C58096Mr6.a7;
    }

    @Override // com.ss.android.ugc.aweme.library.library.ILibraryCameraService
    public final void LIZ() {
        C45709Hwn c45709Hwn = this.LIZ;
        if (c45709Hwn != null) {
            c45709Hwn.LLJJ(false, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.library.library.ILibraryCameraService
    public final void LIZIZ(Activity activity, VideoPublishEditModel videoContext, LibraryMaterialInfoSv libraryMaterialInfoSv) {
        String str;
        o.LJIIIZ(videoContext, "videoContext");
        long currentTimeMillis = System.currentTimeMillis();
        AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(libraryMaterialInfoSv, 232);
        LibraryMaterialInfoSv libraryMaterialInfoSv2 = videoContext.libraryMaterialInfo;
        if (libraryMaterialInfoSv2 == null || (str = libraryMaterialInfoSv2.getId()) == null) {
            str = "";
        }
        I80.LIZ(aqS157S0100000_7, activity, str, new AqS14S0200100_7(videoContext, currentTimeMillis, activity, 0), 24);
    }

    @Override // com.ss.android.ugc.aweme.library.library.ILibraryCameraService
    public final void LIZJ(C82622Wbi diContainer, VideoPublishEditModel videoContext, WMH parentScene, int i, LibraryMaterialInfoSv libraryMaterialInfoSv) {
        EnumC45707Hwl enumC45707Hwl;
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(videoContext, "videoContext");
        o.LJIIIZ(parentScene, "parentScene");
        C45709Hwn c45709Hwn = (C45709Hwn) parentScene.findSceneByTag("LibraryChooseMediaScene");
        boolean z = false;
        if (c45709Hwn == null) {
            if (libraryMaterialInfoSv != null) {
                enumC45707Hwl = EnumC45707Hwl.GRID_VIEW_WITH_CARD;
            } else {
                enumC45707Hwl = EnumC45707Hwl.GRID_VIEW;
            }
            c45709Hwn = new C45709Hwn(diContainer, enumC45707Hwl, new ShortVideoContext(new CameraComponentModel(0)), videoContext, libraryMaterialInfoSv, "Edit_Page");
        }
        if (!parentScene.isAdded(c45709Hwn)) {
            parentScene.add(i, c45709Hwn, "LibraryChooseMediaScene");
        }
        LibraryMaterialInfoSv libraryMaterialInfoSv2 = videoContext.libraryMaterialInfo;
        if (libraryMaterialInfoSv2 != null && !libraryMaterialInfoSv2.isLibraryMaterialConsumed()) {
            z = true;
        }
        c45709Hwn.LLJJ(true, z);
        this.LIZ = c45709Hwn;
    }
}
