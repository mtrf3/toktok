package X;

import Y.AObjectS84S0100000_2;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5rZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148095rZ extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C148195rj LJLJJL;
    public final C82631Wbr LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public final C82632Wbs LJLL;
    public final C82631Wbr LJLLI;
    public final C82632Wbs LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C148115rb LJLLLL;
    public boolean LJLLLLLL;

    static {
        TBT tbt = new TBT(C148095rZ.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C148095rZ.class, "activity", "getActivity()Landroid/app/Activity;", 0, c65351Pkp), C61845OOz.LIZJ(C148095rZ.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C148095rZ.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0, c65351Pkp), C61845OOz.LIZJ(C148095rZ.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C148095rZ.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C148095rZ.class, "stickerViewModel", "getStickerViewModel()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LIZLLL() {
        LiveEvent<C76800UCe> Yf;
        InterfaceC143855kj interfaceC143855kj = (InterfaceC143855kj) this.LJLJJLL.LIZ(this, LJLZ[0]);
        if (interfaceC143855kj != null && (Yf = interfaceC143855kj.Yf()) != null) {
            Yf.LIZLLL(this.LJLJI, new AObjectS84S0100000_2(this, 268));
        }
    }

    public final void LJIIJJI() {
        C26227ARb c26227ARb = new C26227ARb(LJIIL());
        c26227ARb.LJ(R.string.chn);
        c26227ARb.LIZ(R.string.chk);
        UC0.LIZJ(c26227ARb, new AqS168S0100000_2(this, 401));
        c26227ARb.LJI().LIZLLL();
    }

    public final Activity LJIIL() {
        return (Activity) this.LJLJL.LIZ(this, LJLZ[1]);
    }

    public final C147295qH LJIILIIL() {
        return (C147295qH) this.LJLLL.getValue();
    }

    public final VideoPublishEditModel LJIILJJIL() {
        return (VideoPublishEditModel) this.LJLJLJ.LIZ(this, LJLZ[2]);
    }

    public final void LJIILL() {
        MutableLiveData<Boolean> N4;
        MutableLiveData<Boolean> fm0;
        C82631Wbr c82631Wbr = this.LJLLI;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLZ;
        InterfaceC147865rC interfaceC147865rC = (InterfaceC147865rC) c82631Wbr.LIZ(this, interfaceC74236TBoArr[5]);
        if (interfaceC147865rC != null && (fm0 = interfaceC147865rC.fm0()) != null) {
            fm0.setValue(Boolean.TRUE);
        }
        InterfaceC147865rC interfaceC147865rC2 = (InterfaceC147865rC) this.LJLLILLLL.LIZ(this, interfaceC74236TBoArr[6]);
        if (interfaceC147865rC2 != null && (N4 = interfaceC147865rC2.N4()) != null) {
            N4.setValue(Boolean.TRUE);
        }
        InterfaceC147865rC interfaceC147865rC3 = (InterfaceC147865rC) this.LJLLI.LIZ(this, interfaceC74236TBoArr[5]);
        if (interfaceC147865rC3 != null) {
            interfaceC147865rC3.LJLL();
        }
        InterfaceC143855kj interfaceC143855kj = (InterfaceC143855kj) this.LJLJJLL.LIZ(this, interfaceC74236TBoArr[0]);
        if (interfaceC143855kj != null) {
            interfaceC143855kj.show();
        }
        ((InterfaceC153275zv) this.LJLL.LIZ(this, interfaceC74236TBoArr[4])).r3();
        if (!C44384HbQ.LLJILJIL(LJIILJJIL())) {
            return;
        }
        C63D c63d = ((C63C) this.LJLLJ.getValue()).LLJI;
        if (c63d != null) {
            c63d.Nu0(true);
        }
        InterfaceC147865rC interfaceC147865rC4 = (InterfaceC147865rC) this.LJLLI.LIZ(this, interfaceC74236TBoArr[5]);
        if (interfaceC147865rC4 != null) {
            interfaceC147865rC4.Nn(false);
        }
    }

    @Override // X.WJB
    public final void LIZ() {
        if (!LJIIIZ() && LJIILJJIL().isTimeEffectApply()) {
            C26227ARb LIZ = C3AW.LIZ(LJIIL());
            LIZ.LJ(R.string.bxt);
            LIZ.LIZ(R.string.bxs);
            UC0.LIZJ(LIZ, new AqS168S0100000_2(this, 402));
            LIZ.LJI().LIZLLL();
        }
    }

    @Override // X.WJB
    public final void LJFF() {
        String str;
        VideoPublishEditModel LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL().captionStruct == null) {
            str = "main_first";
        } else {
            str = "main_reclick";
        }
        C145995oB LJJJLIIL = H8F.LJJJLIIL(LJIILJJIL);
        LJJJLIIL.LJI("enter_from", "video_edit_page");
        Q8U.LIZJ(LJJJLIIL, "shoot_way", LJIILJJIL.mShootWay, LJIILJJIL, "creation_id");
        LJJJLIIL.LJI("enter_method", str);
        LJJJLIIL.LJI("content_source", H7R.LJIIIIZZ(LJIILJJIL));
        LJJJLIIL.LJI("content_type", H7R.LJIIIZ(LJIILJJIL));
        LJJJLIIL.LIZ(H8F.LJIIL(LJIILJJIL), "is_multi_content");
        LJJJLIIL.LJI("enter_type", H8F.LJIIIZ(LJIILJJIL));
        LJJJLIIL.LIZ(0, "is_editor_pro");
        FMX.LJIIL("click_auto_subtitle", LJJJLIIL.LIZ);
        LJIIJ();
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        DMMediaModel dMMediaModel;
        if ((!LJIILJJIL().isEnterFromDM() || (dMMediaModel = LJIILJJIL().creativeModel.dmMediaModel) == null || !C79043V0l.LJIILIIL(dMMediaModel)) && C44384HbQ.LJJIJL(LJIILJJIL()) && ((C44384HbQ.LJLJJL(LJIILJJIL()) || C44384HbQ.LJJIII(LJIILJJIL())) && !LJIILJJIL().isGifMaterialOnly())) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIZ() {
        if (!C44384HbQ.LJJIIJ(LJIILJJIL()) || (C44384HbQ.LJJIIJ(LJIILJJIL()) && LJIILJJIL().creativeModel.inlineCaptionModel == null)) {
            if (C133195Kp.LIZ()) {
                if (!C44384HbQ.LJLJJL(LJIILJJIL()) && !LJIILJJIL().hasRecord() && !LJIILJJIL().hasMusic()) {
                    C5S1 c5s1 = new C5S1(LJIIL());
                    c5s1.LIZJ(R.string.bxv);
                    c5s1.LJ();
                    return true;
                }
                if (!C44384HbQ.LJLJJLL(LJIILJJIL()) && !LJIILJJIL().hadRecordWithVolume() && (!LJIILJJIL().hasMusic() || LJIILJJIL().musicVolume <= 0.0f)) {
                    C5S1 c5s12 = new C5S1(LJIIL());
                    c5s12.LIZJ(R.string.eim);
                    c5s12.LJ();
                    return true;
                }
                if (!LJIILJJIL().hadRecordWithVolume() && LJIILJJIL().voiceVolume == 0.0f && LJIILJJIL().hasMusic() && LJIILJJIL().musicVolume > 0.0f && !C138615cH.LIZJ(LJIILJJIL())) {
                    C5S1 c5s13 = new C5S1(LJIIL());
                    c5s13.LIZJ(R.string.chh);
                    c5s13.LJ();
                    return true;
                }
            } else {
                if (!C44384HbQ.LJLJJL(LJIILJJIL()) && !LJIILJJIL().hasRecord()) {
                    C5S1 c5s14 = new C5S1(LJIIL());
                    c5s14.LIZJ(R.string.bxv);
                    c5s14.LJ();
                    return true;
                }
                if (!C44384HbQ.LJLJJLL(LJIILJJIL()) && !LJIILJJIL().hadRecordWithVolume()) {
                    C5S1 c5s15 = new C5S1(LJIIL());
                    c5s15.LIZJ(R.string.eim);
                    c5s15.LJ();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ() {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148095rZ.LJIIJ():void");
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLLLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public final void LJIILLIIL(C148115rb c148115rb) {
        CanvasVideoData canvasVideoData = LJIILJJIL().canvasVideoData;
        if (canvasVideoData != null && C79004UzY.LJJIII(canvasVideoData)) {
            WI0 wi0 = c148115rb.LJIIIZ;
            c148115rb.LJIIIZ = new WI0(wi0.LJLIL, wi0.LJLILLLLZI, true);
            return;
        }
        if ((C44384HbQ.LJLJJL(LJIILJJIL()) && LJIILJJIL().voiceVolume > 0.0f) || LJIILJJIL().hasRecord() || C138615cH.LIZ(null, LJIILJJIL())) {
            c148115rb.LJIIJ(EnumC147935rJ.ENABLE_CLICK);
            return;
        }
        if (C44384HbQ.LLJILJIL(LJIILJJIL()) && LJIILJJIL().creativeModel.inlineCaptionModel != null) {
            c148115rb.LJIIJ(EnumC147935rJ.ENABLE_CLICK);
            return;
        }
        c148115rb.LJIIJ(EnumC147935rJ.DISABLE_CLICK);
        if (!H7R.LJJLIIIIJ(LJIILJJIL())) {
            return;
        }
        WI0 wi02 = c148115rb.LJIIIZ;
        c148115rb.LJIIIZ = new WI0(wi02.LJLIL, wi02.LJLILLLLZI, true);
    }

    public C148095rZ(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, C148195rj config) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = config;
        this.LJLJJLL = UCI.LJII(diContainer, InterfaceC143855kj.class, null);
        this.LJLJL = UCI.LJI(diContainer, Activity.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJLLL = UCI.LJI(diContainer, InterfaceC145485nM.class, null);
        this.LJLL = UCI.LJI(diContainer, InterfaceC153275zv.class, null);
        this.LJLLI = UCI.LJII(diContainer, InterfaceC147865rC.class, null);
        this.LJLLILLLL = UCI.LJI(diContainer, InterfaceC147865rC.class, null);
        this.LJLLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 692));
        this.LJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 691));
        C148115rb c148115rb = new C148115rb(LJIILJJIL());
        LJIILLIIL(c148115rb);
        this.LJLLLL = c148115rb;
        this.LJLLLLLL = true;
    }
}
