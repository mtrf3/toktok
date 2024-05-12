package com.ss.android.ugc.aweme.tools.live.sticker;

import X.C16880lQ;
import X.C29S;
import X.C41944GdA;
import X.C46245ICz;
import X.C58096Mr6;
import X.C74355TGd;
import X.C78840Uwu;
import X.C82398WVm;
import X.C83492Wpk;
import X.HB7;
import X.I2W;
import X.I2Y;
import X.I2Z;
import X.ID6;
import X.IDF;
import X.IDH;
import X.IDJ;
import X.InterfaceC139745e6;
import X.InterfaceC45328Hqe;
import X.InterfaceC78118UlG;
import X.InterfaceC84497XEf;
import X.InterfaceC89879ZPf;
import X.J86;
import X.TEZ;
import X.TGB;
import X.TGC;
import X.TGD;
import X.TH7;
import X.THX;
import Y.IDHandlerS24S0100000_14;
import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.sticker.IStickerViewService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AqS60S1100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class StickerViewServiceImpl implements IStickerViewService {
    public I2Z liveGalleryModule;
    public C46245ICz liveStickerModule;
    public InterfaceC139745e6<InterfaceC45328Hqe> processorSupplier;
    public InterfaceC89879ZPf stickerMobHelper;

    public String getFaceTrackPath() {
        return "face_track.model";
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void hideStickerView() {
        C46245ICz hideStickerView = this.liveStickerModule;
        if (hideStickerView != null) {
            o.LJIIIZ(hideStickerView, "$this$hideStickerView");
            IDH LLLF = hideStickerView.LLLF();
            if (LLLF != null) {
                LLLF.hide();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public boolean isGalleryModuleInitialized() {
        if (this.liveGalleryModule != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public boolean isShowStickerView() {
        C46245ICz c46245ICz = this.liveStickerModule;
        if (c46245ICz != null && C82398WVm.LIZLLL(c46245ICz)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void release() {
        C46245ICz c46245ICz = this.liveStickerModule;
        if (c46245ICz != null) {
            c46245ICz.LJFF();
            this.liveStickerModule = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void releaseGalleryModule() {
        I2Z i2z = this.liveGalleryModule;
        if (i2z != null) {
            C83492Wpk c83492Wpk = (C83492Wpk) i2z.LIZIZ.getValue();
            c83492Wpk.LIZIZ.quitSafely();
            IDHandlerS24S0100000_14 iDHandlerS24S0100000_14 = c83492Wpk.LIZJ;
            if (iDHandlerS24S0100000_14 != null) {
                iDHandlerS24S0100000_14.removeCallbacksAndMessages(null);
            }
            i2z.LIZJ.clear();
        }
        this.liveGalleryModule = null;
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void scanPhotoList() {
        I2Z i2z = this.liveGalleryModule;
        if (i2z != null) {
            ((C83492Wpk) i2z.LIZIZ.getValue()).LIZ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r1 != null) goto L15;
     */
    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void selectFromGallery() {
        /*
            r6 = this;
            X.I2Z r5 = r6.liveGalleryModule
            if (r5 == 0) goto L6c
            java.lang.String r2 = "key_choose_scene"
            r1 = 3
            java.lang.String r0 = "key_photo_select_min_count"
            r3 = 1
            android.os.Bundle r2 = X.C1DG.LIZLLL(r2, r1, r0, r3)
            java.lang.String r0 = "key_photo_select_max_count"
            r2.putInt(r0, r3)
            java.lang.String r1 = "upload_photo_min_height"
            r0 = 480(0x1e0, float:6.73E-43)
            r2.putInt(r1, r0)
            java.lang.String r1 = "upload_photo_min_width"
            r0 = 360(0x168, float:5.04E-43)
            r2.putInt(r1, r0)
            java.lang.String r0 = "key_support_flag"
            r2.putInt(r0, r3)
            X.Uwt r1 = X.IDM.LIZ()
            android.app.Activity r0 = r5.LIZ
            r4 = 10001(0x2711, float:1.4014E-41)
            android.content.Intent r3 = r1.LIZJ(r0, r2, r4)
            com.ss.android.ugc.aweme.services.ICreativeSAAService r2 = com.ss.android.ugc.aweme.adaptation.saa.SAAService.LIZ()
            r1 = 0
            if (r2 == 0) goto L3f
            android.app.Activity r0 = r5.LIZ
            X.WM7 r1 = r2.getCurrentScene(r0)
        L3f:
            boolean r0 = r1 instanceof X.InterfaceC45540Hu4
            if (r0 == 0) goto L47
            X.Hu4 r1 = (X.InterfaceC45540Hu4) r1
            if (r1 != 0) goto L51
        L47:
            android.app.Activity r1 = r5.LIZ
            boolean r0 = r1 instanceof X.InterfaceC45540Hu4
            if (r0 == 0) goto L67
            X.Hu4 r1 = (X.InterfaceC45540Hu4) r1
            if (r1 == 0) goto L67
        L51:
            X.Ol8 r0 = r5.LIZLLL
            java.lang.Object r0 = r0.getValue()
            X.5lG r0 = (X.InterfaceC144185lG) r0
            r1.unRegisterActivityResultListener(r0)
            X.Ol8 r0 = r5.LIZLLL
            java.lang.Object r0 = r0.getValue()
            X.5lG r0 = (X.InterfaceC144185lG) r0
            r1.registerActivityResultListener(r0)
        L67:
            android.app.Activity r0 = r5.LIZ
            X.C16880lQ.LJFF(r0, r4, r3)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.live.sticker.StickerViewServiceImpl.selectFromGallery():void");
    }

    public static IStickerViewService createIStickerViewServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IStickerViewService.class, z);
        if (LIZ != null) {
            return (IStickerViewService) LIZ;
        }
        if (C58096Mr6.w7 == null) {
            synchronized (IStickerViewService.class) {
                if (C58096Mr6.w7 == null) {
                    C58096Mr6.w7 = new StickerViewServiceImpl();
                }
            }
        }
        return C58096Mr6.w7;
    }

    public String getStickerFilePath(IStickerService.FaceSticker faceSticker) {
        return faceSticker.localPath;
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void removeScanPhotoListListener(I2Y onScanPhotoListListener) {
        I2Z i2z = this.liveGalleryModule;
        if (i2z != null) {
            i2z.getClass();
            o.LJIIIZ(onScanPhotoListListener, "onScanPhotoListListener");
            i2z.LIZJ.remove(onScanPhotoListListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void setPixelLoopStickerPresenterSupplier(InterfaceC139745e6<InterfaceC45328Hqe> interfaceC139745e6) {
        this.processorSupplier = interfaceC139745e6;
        C46245ICz c46245ICz = this.liveStickerModule;
        if (c46245ICz != null) {
            c46245ICz.LJ(interfaceC139745e6);
        }
    }

    public void setStickerMobHelper(InterfaceC89879ZPf interfaceC89879ZPf) {
        C46245ICz c46245ICz = this.liveStickerModule;
        if (c46245ICz != null) {
            c46245ICz.LLFF.getClass();
        }
    }

    private void initLiveModuleIfNeeded(C29S c29s, String str) {
        C46245ICz c46245ICz = this.liveStickerModule;
        Effect effect = null;
        if (c46245ICz == null || c46245ICz.LJLLILLLL != c29s || !c46245ICz.LJLLJ.equals(str)) {
            C46245ICz c46245ICz2 = this.liveStickerModule;
            if (c46245ICz2 != null) {
                effect = c46245ICz2.LJLLLLLL.LLJJIJIIJIL();
                this.liveStickerModule.LJFF();
            }
            this.liveStickerModule = new C46245ICz(c29s, str);
            if (effect != null && this.liveStickerModule.LJLLLLLL.LJJJJLL().LJ().LIZ(effect)) {
                this.liveStickerModule.LJLLLLLL.LJIIIIZZ().LJIILJJIL(effect);
            }
        }
        InterfaceC139745e6<InterfaceC45328Hqe> interfaceC139745e6 = this.processorSupplier;
        if (interfaceC139745e6 != null) {
            this.liveStickerModule.LJ(interfaceC139745e6);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void initGalleryModule(Activity activity, I2Y onScanPhotoListListener) {
        if (this.liveGalleryModule == null) {
            this.liveGalleryModule = new I2Z(activity);
        }
        I2Z i2z = this.liveGalleryModule;
        i2z.getClass();
        o.LJIIIZ(onScanPhotoListListener, "onScanPhotoListListener");
        i2z.LIZJ.add(onScanPhotoListListener);
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void resizePhoto(String key, String path) {
        I2Z i2z = this.liveGalleryModule;
        if (i2z != null) {
            i2z.getClass();
            o.LJIIIZ(key, "key");
            o.LJIIIZ(path, "path");
            String LIZIZ = C41944GdA.LIZIZ(HB7.LIZ);
            Context LLLLJ = C16880lQ.LLLLJ(i2z.LIZ);
            o.LJIIIIZZ(LLLLJ, "activity.applicationContext");
            C41944GdA.LIZLLL(path, LIZIZ, null, LLLLJ, new AqS60S1100000_7(i2z, key, 13));
        }
    }

    public void showStickerView(C29S c29s, String str, FrameLayout frameLayout, I2W i2w) {
        showStickerView(c29s, c29s.getSupportFragmentManager(), str, frameLayout, i2w);
    }

    public void showStickerView(C29S c29s, FragmentManager manager, String str, FrameLayout root, I2W i2w) {
        initLiveModuleIfNeeded(c29s, str);
        C46245ICz c46245ICz = this.liveStickerModule;
        if (c46245ICz != null) {
            o.LJIIIZ(root, "root");
            o.LJIIIZ(manager, "manager");
            if (c46245ICz.LJLJLJ == null || !o.LJ(c46245ICz.LL, root) || !o.LJ(c46245ICz.LLD, manager)) {
                c46245ICz.LLD = manager;
                c46245ICz.LL = root;
                TGB LIZLLL = C74355TGd.LIZLLL((TGD) c46245ICz.LLFII.getValue(), c46245ICz.LJLLLLLL, c46245ICz.LJZ, (InterfaceC84497XEf) c46245ICz.LJLLL.getValue(), c46245ICz.LLFF, c46245ICz.LLFFF);
                C29S c29s2 = c46245ICz.LJLLILLLL;
                LifecycleOwner LJIIL = C78840Uwu.LJIIL(root);
                if (LJIIL == null) {
                    LJIIL = c46245ICz.LJLLILLLL;
                }
                TGC LIZ = LIZLLL.LIZ(c29s2, root, LJIIL, manager);
                c46245ICz.LLFFF.LJ(TH7.class, null);
                C29S lifecycleOwner = c46245ICz.LJLLILLLL;
                c46245ICz.LLFFF.LJ(THX.class, null);
                TEZ stickerDataManager = c46245ICz.LJLLLLLL;
                c46245ICz.LLFFF.LJ(InterfaceC78118UlG.class, null);
                o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
                o.LJIIIZ(stickerDataManager, "stickerDataManager");
                LIZ.Xi(new ID6(c46245ICz));
                LIZ.LJLJI.observe(LIZ.LJLL, new J86());
                LIZ.LIZJ(new IDF(c46245ICz));
                c46245ICz.LJLJLJ = LIZ;
                LIZ.Xi(new IDJ(c46245ICz));
            }
            C46245ICz showStickerView = this.liveStickerModule;
            o.LJIIIZ(showStickerView, "$this$showStickerView");
            IDH idh = showStickerView.LJLJLJ;
            if (idh != null) {
                idh.show();
            }
        }
    }

    public void addStickersWithModel(C29S c29s, FrameLayout frameLayout, List<Effect> effects, boolean z, boolean z2, String str) {
        initLiveModuleIfNeeded(c29s, str);
        C46245ICz c46245ICz = this.liveStickerModule;
        c46245ICz.getClass();
        o.LJIIIZ(effects, "effects");
        if (!effects.isEmpty()) {
            C82398WVm.LJ(c46245ICz, effects, z, z2, null, false, null, 0, 16376);
        }
    }
}
