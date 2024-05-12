package X;

import Y.ACallableS109S0100000_6;
import Y.AgS108S0200000_3;
import Y.IDgS140S0200000_15;
import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.sticker.service.CommerceLockStickerServiceImpl;
import com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceLockStickerService;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS16S0200000_7;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IInfoService;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.List;
import java.util.UUID;

/* renamed from: X.XVj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84943XVj implements IEffectDownloadProgressListener {
    public final /* synthetic */ C84942XVi LIZ;

    public C84943XVj(C84942XVi c84942XVi) {
        this.LIZ = c84942XVi;
    }

    public final boolean LIZJ(C10K<NewFaceStickerListBean> c10k) {
        List<? extends NewFaceStickerBean> list;
        if (!c10k.LJIIL() && !c10k.LJIILJJIL() && c10k.LJIIJJI() != null && (list = c10k.LJIIJJI().mStickers) != null && list.size() != 0) {
            ICommerceLockStickerService LIZJ = CommerceLockStickerServiceImpl.LIZJ();
            NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) ListProtector.get(list, 0);
            if (LIZJ != null && LIZJ.LIZ(newFaceStickerBean)) {
                LIZJ.LIZIZ(this.LIZ.LJIIJ, newFaceStickerBean, "homepage_hot");
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.LIZ.LJJIJIIJI = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(com.ss.android.ugc.effectmanager.effect.model.Effect r23) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84943XVj.onSuccess(java.lang.Object):void");
    }

    public final void LIZ(Effect effect, String str) {
        if (TextUtils.isEmpty(str)) {
            onFail(effect, new ExceptionResult(-1));
            return;
        }
        C84942XVi c84942XVi = this.LIZ;
        Effect effect2 = c84942XVi.LJJIL;
        c84942XVi.LJJIL = null;
        if (effect != null) {
            effect2 = effect;
        } else if (effect2 == null) {
            AVExternalServiceImpl.LIZ().abilityService().effectService().buildEffectPlatform(this.LIZ.LJIIJ, new C84929XUv(this, str, effect), null);
            return;
        }
        c84942XVi.LJIIIZ = false;
        HWH hwh = c84942XVi.LJIIIIZZ;
        if (hwh != null) {
            V1B.LJLILLLLZI(hwh);
        }
        if (TextUtils.isEmpty(this.LIZ.LJIIJJI)) {
            this.LIZ.LJIIJJI = UUID.randomUUID().toString();
        }
        C84942XVi c84942XVi2 = this.LIZ;
        InterfaceC74183T9n interfaceC74183T9n = c84942XVi2.LJJ;
        if (interfaceC74183T9n != null) {
            interfaceC74183T9n.LIZ(effect2, c84942XVi2.LJIIJJI);
        } else {
            String str2 = "homepage_hot";
            if (c84942XVi2.LJIILIIL.equals("green_screen")) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("content_type", "video");
                c188727au.LJIIIZ("content_source", "shoot");
                if (!TextUtils.isEmpty(this.LIZ.LJIILLIIL)) {
                    str2 = this.LIZ.LJIILLIIL;
                }
                c188727au.LJIIIZ("enter_from", str2);
                c188727au.LJIIIZ("creation_id", this.LIZ.LJIIJJI);
                c188727au.LJIIIZ("group_id", this.LIZ.LJIILL);
                c188727au.LJIIIZ("giphy_id", this.LIZ.LJ);
                FMX.LJIIL("shoot", c188727au.LIZ);
            } else if (this.LIZ.LJIILIIL.equals("library")) {
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("creation_id", this.LIZ.LJIIJJI);
                c188727au2.LJIIIZ("shoot_way", this.LIZ.LJIILIIL);
                c188727au2.LJIIIZ("prop_id", effect.getEffectId());
                c188727au2.LJIIIZ("giphy_id", this.LIZ.LJ);
                c188727au2.LJIIIZ("enter_from", this.LIZ.LJIILLIIL);
                String str3 = this.LIZ.LJIILLIIL;
                if (str3 != "library_detail_page") {
                    str3 = "anchor_panel";
                }
                c188727au2.LJIIIZ("enter_method", str3);
                c188727au2.LJIIIZ("library_material_id", this.LIZ.LJJIZ.getId());
                c188727au2.LJ(AVExternalServiceImpl.LIZ().infoService().getDurationSinceAppForeground(this.LIZ.LJIIJJI), "time_elapsed_since_launch_app");
                FMX.LJIIL("shoot", c188727au2.LIZ);
            } else {
                C188727au c188727au3 = new C188727au();
                c188727au3.LJIIIZ("creation_id", this.LIZ.LJIIJJI);
                c188727au3.LJIIIZ("shoot_way", this.LIZ.LJIILIIL);
                c188727au3.LJIIIZ("prop_id", str);
                c188727au3.LJIIIZ("giphy_id", this.LIZ.LJ);
                if (!TextUtils.isEmpty(this.LIZ.LJIILLIIL)) {
                    str2 = this.LIZ.LJIILLIIL;
                }
                c188727au3.LJIIIZ("enter_from", str2);
                c188727au3.LJ(AVExternalServiceImpl.LIZ().infoService().getDurationSinceAppForeground(this.LIZ.LJIIJJI), "time_elapsed_since_launch_app");
                FMX.LJIIL("shoot", c188727au3.LIZ);
            }
        }
        if (TextUtils.equals(this.LIZ.LJJIII, "prop_page")) {
            FaceStickerBean.sCurPropSource = "prop_page";
        } else if (TextUtils.equals(this.LIZ.LJJIII, "prop_page_discover")) {
            FaceStickerBean.sCurPropSource = "prop_page_discover";
        }
        if (AVExternalServiceImpl.LIZ().infoService().stickerInfo().isLockSticker(effect2) && ((TextUtils.equals(this.LIZ.LJJIII, "prop_reuse") || TextUtils.equals(this.LIZ.LJJIII, "prop_page")) && !AV1.LJIIJJI())) {
            if (effect2.isBusiness()) {
                C10K.LIZJ(new ACallableS109S0100000_6(effect2, 20)).LJ(new AgS108S0200000_3(this, effect2, 5), C10K.LJIIIIZZ, null);
            } else {
                C84942XVi c84942XVi3 = this.LIZ;
                c84942XVi3.LIZJ(effect2, c84942XVi3.LJIIJJI);
            }
        } else {
            C84942XVi c84942XVi4 = this.LIZ;
            c84942XVi4.LJI(effect2, c84942XVi4.LJIIJJI, true);
        }
        InterfaceC74184T9o interfaceC74184T9o = this.LIZ.LJJI;
        if (interfaceC74184T9o != null) {
            interfaceC74184T9o.LIZ(0, effect);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        String str;
        C84942XVi c84942XVi = this.LIZ;
        if (c84942XVi.LJJJJZI) {
            return;
        }
        int i = 0;
        c84942XVi.LJIIIZ = false;
        HWH hwh = c84942XVi.LJIIIIZZ;
        if (hwh != null) {
            V1B.LJLILLLLZI(hwh);
        }
        this.LIZ.LJJIL = null;
        int errorCode = exceptionResult.getErrorCode();
        if (errorCode != 2004 && errorCode != 2002 && errorCode != 2003 && errorCode != 2006 && errorCode != 2012) {
            C5S1 c5s1 = new C5S1(this.LIZ.LJIIJ);
            c5s1.LIZLLL(this.LIZ.LJIIJ.getResources().getString(R.string.g85));
            c5s1.LJ();
            Dialog dialog = this.LIZ.LJII;
            if (dialog != null) {
                V1B.LJLILLLLZI(dialog);
            }
        } else {
            C84942XVi c84942XVi2 = this.LIZ;
            int i2 = c84942XVi2.LJI + 1;
            c84942XVi2.LJI = i2;
            if (c84942XVi2.LJIL && i2 < c84942XVi2.LIZLLL.size()) {
                IAVEffectService effectService = AVExternalServiceImpl.LIZ().abilityService().effectService();
                C84942XVi c84942XVi3 = this.LIZ;
                String str2 = (String) ListProtector.get(c84942XVi3.LIZLLL, c84942XVi3.LJI);
                java.util.Map<String, String> LJ = this.LIZ.LJ();
                C84942XVi c84942XVi4 = this.LIZ;
                effectService.fetchEffectResource(str2, true, LJ, c84942XVi4.LIZIZ, c84942XVi4.LJJJJLI);
            } else if (!this.LIZ.LIZJ) {
                if (errorCode == 2004 || errorCode == 2002) {
                    C5S1 c5s12 = new C5S1(this.LIZ.LJIIJ);
                    c5s12.LIZLLL(this.LIZ.LJIIJ.getResources().getString(R.string.fyi));
                    c5s12.LJ();
                } else if (errorCode == 2003) {
                    C5S1 c5s13 = new C5S1(this.LIZ.LJIIJ);
                    c5s13.LIZLLL(this.LIZ.LJIIJ.getResources().getString(R.string.eh_));
                    c5s13.LJ();
                } else if (errorCode == 2012) {
                    if (e1.LIZ(31744, "studio_effect_shoot_same_unlogin_optimization", true, false)) {
                        Activity LJIJJ = C45804HyK.LJIJJ(this.LIZ.LJIIJ);
                        if (!((RBX) HG3.LJIILL()).isLogin() && LJIJJ != null && !LJIJJ.isFinishing()) {
                            J9P.LIZIZ(LJIJJ, "prop_detail", "click_shoot", null, new IDgS140S0200000_15(LJIJJ, this, 1));
                        } else {
                            C5S1 c5s14 = new C5S1(this.LIZ.LJIIJ);
                            c5s14.LIZLLL(this.LIZ.LJIIJ.getResources().getString(R.string.eh_));
                            c5s14.LJ();
                        }
                    } else {
                        C5S1 c5s15 = new C5S1(this.LIZ.LJIIJ);
                        c5s15.LIZLLL(this.LIZ.LJIIJ.getResources().getString(R.string.eh_));
                        c5s15.LJ();
                    }
                } else if (errorCode == 2006) {
                    if (C2YJ.LIZIZ.LIZ.getStickerUpdateApp().booleanValue() && !C79004UzY.LJJIFFI(this.LIZ.LIZLLL) && !TextUtils.isEmpty((CharSequence) ListProtector.get(this.LIZ.LIZLLL, 0))) {
                        Activity LJIJJ2 = C45804HyK.LJIJJ(this.LIZ.LJIIJ);
                        if (LJIJJ2 != null) {
                            String str3 = (String) ListProtector.get(this.LIZ.LIZLLL, 0);
                            if (!UgCommonServiceImpl.LJIJ().LJIIIIZZ()) {
                                C5S1 c5s16 = new C5S1(LJIJJ2);
                                c5s16.LIZLLL(LJIJJ2.getResources().getString(R.string.tg4));
                                c5s16.LJ();
                            } else {
                                C26227ARb c26227ARb = new C26227ARb(LJIJJ2);
                                c26227ARb.LJ(R.string.rox);
                                c26227ARb.LIZ(R.string.rov);
                                c26227ARb.LJII = false;
                                UC0.LIZJ(c26227ARb, new C1549066c(LJIJJ2, str3, i));
                                Dialog LJ2 = c26227ARb.LJI().LJ();
                                if (!LJIJJ2.isFinishing()) {
                                    C16880lQ.LIZ(LJ2);
                                }
                            }
                        }
                        InterfaceC74184T9o interfaceC74184T9o = this.LIZ.LJJI;
                        if (interfaceC74184T9o != null) {
                            interfaceC74184T9o.LIZ(2006, null);
                        }
                    } else {
                        C5S1 c5s17 = new C5S1(this.LIZ.LJIIJ);
                        c5s17.LIZLLL(this.LIZ.LJIIJ.getResources().getString(R.string.tg4));
                        c5s17.LJ();
                        InterfaceC74184T9o interfaceC74184T9o2 = this.LIZ.LJJI;
                        if (interfaceC74184T9o2 != null) {
                            interfaceC74184T9o2.LIZ(errorCode, null);
                        }
                    }
                }
                Dialog dialog2 = this.LIZ.LJII;
                if (dialog2 != null) {
                    V1B.LJLILLLLZI(dialog2);
                }
            }
        }
        InterfaceC74184T9o interfaceC74184T9o3 = this.LIZ.LJJI;
        if (interfaceC74184T9o3 != null && errorCode != 2006) {
            interfaceC74184T9o3.LIZ(errorCode, null);
        }
        C84942XVi c84942XVi5 = this.LIZ;
        if (c84942XVi5.LJJJJIZL) {
            String str4 = c84942XVi5.LJIIJJI;
            if (effect != null && c84942XVi5.LJJIFFI.isEffectControlGame(effect)) {
                c84942XVi5.LJIIL = null;
            }
            V0N.LJLIL = c84942XVi5.LJJIII;
            C84948XVo c84948XVo = new C84948XVo(c84942XVi5);
            int i3 = c84942XVi5.LJJJJ;
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.shootWay(c84942XVi5.LJIILIIL);
            builder.creationId(str4);
            builder.startRecordTime(c84942XVi5.LJJIJ);
            builder.effectDownloadDuration(System.currentTimeMillis() - c84942XVi5.LJJIJ);
            builder.translationType(i3);
            builder.stickers(c84942XVi5.LIZLLL);
            builder.giphyGifIds(c84942XVi5.LJ);
            builder.shootExtraData(c84942XVi5.LJFF);
            builder.prepareFilter(true);
            builder.stickerMusic(c84942XVi5.LJIIL);
            builder.stickerWithMusicFilePath(c84942XVi5.LJJIJL);
            builder.isThroughAnchor(c84942XVi5.LJJJ);
            builder.stickerParams(c84942XVi5.LJ());
            builder.videoLength(Integer.valueOf(c84942XVi5.LJJIJLIJ));
            builder.extraEventParams(c84948XVo);
            builder.recordFromFeed(c84942XVi5.LJJJIL);
            String str5 = c84942XVi5.LJIILLIIL;
            if (str5 != null) {
                builder.enterFrom(str5);
            }
            LibraryMaterialInfoSv libraryMaterialInfoSv = c84942XVi5.LJJIZ;
            if (libraryMaterialInfoSv != null) {
                builder.libraryMaterialInfo(libraryMaterialInfoSv);
            }
            if (c84942XVi5.LJIIL != null && !C84942XVi.LJII(effect)) {
                if (MusicService.LJJLIIIJJI().LJJIL(c84942XVi5.LJIIL.convertToMusicModel(), c84942XVi5.LJIIJ, false)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(c84942XVi5.LJIIL.getId());
                    LIZ.append("");
                    builder.autoUseMusic(X1D.LIZIZ(LIZ));
                }
            }
            if (c84942XVi5.LJIILJJIL != null && !C84942XVi.LJII(effect)) {
                builder.musicOrigin(c84942XVi5.LJIILJJIL);
            }
            if (c84942XVi5.LJIILIIL.equals("friends_effect") && (str = c84942XVi5.LJIJJ) != null) {
                builder.enterMethod(str);
            }
            String str6 = "reuse_sticker";
            if (c84942XVi5.LJIILIIL.equals("prop_page") || c84942XVi5.LJIILIIL.equals("scan")) {
                IExternalService LIZ2 = AVExternalServiceImpl.LIZ();
                if (!TextUtils.isEmpty(c84942XVi5.LJIILIIL)) {
                    str6 = c84942XVi5.LJIILIIL;
                }
                LIZ2.asyncService(str6, new IDLCallbackS16S0200000_7(builder, c84942XVi5, 21));
            } else {
                IExternalService LIZ3 = AVExternalServiceImpl.LIZ();
                if (!TextUtils.isEmpty(c84942XVi5.LJIILIIL)) {
                    str6 = c84942XVi5.LJIILIIL;
                }
                LIZ3.asyncServiceWithOutPanel(str6, new IDLCallbackS16S0200000_7(builder, c84942XVi5, 22));
            }
        }
        IInfoService infoService = AVExternalServiceImpl.LIZ().infoService();
        C84942XVi c84942XVi6 = this.LIZ;
        infoService.endDownloadEffectAlog(c84942XVi6.LJJIIZ, c84942XVi6.LJJIJIIJI, System.currentTimeMillis() - this.LIZ.LJJIJ, -1, exceptionResult);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        if (C52265KfF.LIZ) {
            C84942XVi c84942XVi = this.LIZ;
            c84942XVi.LJJJJZ = true;
            c84942XVi.LIZIZ((int) (((((100 - r5) * i) * 1.0d) / 100.0d) + c84942XVi.LJJJJLL));
        } else {
            this.LIZ.LIZIZ(i);
        }
        C84942XVi c84942XVi2 = this.LIZ;
        if (c84942XVi2.LJJIJIIJI == 0) {
            c84942XVi2.LJJIJIIJI = j;
            AVExternalServiceImpl.LIZ().infoService().startDownloadEffectAlog(effect, j);
        }
    }
}
