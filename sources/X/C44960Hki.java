package X;

import Y.AObjectS86S0100000_7;
import Y.AObserverS75S0100000_7;
import Y.AfS59S0100000_7;
import com.ss.android.ugc.aweme.creative.model.record.RecordDowngradeModel;
import com.ss.android.ugc.aweme.setting.performance.videoquality.StickerPreviewResolutionConfig;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VESize;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hki, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44960Hki implements F4V {
    public final InterfaceC65784Pro<VEDisplaySettings> LJLIL;
    public final TEZ LJLILLLLZI;
    public final ShortVideoContext LJLJI;
    public final InterfaceC88472Yns<VEDisplaySettings, C76800UCe> LJLJJI;
    public final InterfaceC88471Ynr<Integer, Integer, C76800UCe> LJLJJL;
    public final InterfaceC88472Yns<Float, C76800UCe> LJLJJLL;
    public final C62822Ol8 LJLJL;
    public String LJLJLJ;
    public IDH LJLJLLL;
    public final C62822Ol8 LJLL;
    public AqS154S0200000_7 LJLLI;
    public final HashSet<String> LJLLILLLL;

    public final StickerPreviewResolutionConfig LIZ() {
        return (StickerPreviewResolutionConfig) this.LJLJL.getValue();
    }

    public final C44833Hif LIZJ() {
        return (C44833Hif) this.LJLL.getValue();
    }

    public final void LJFF() {
        AbstractC73672Svk<THZ> Rc;
        IDH idh = this.LJLJLLL;
        if (idh != null) {
            idh.Ce(new AObserverS75S0100000_7(this, 142));
        }
        IDH idh2 = this.LJLJLLL;
        if (idh2 != null && (Rc = idh2.Rc()) != null) {
            Rc.LJJJJZI(new AfS59S0100000_7(this, 93));
        }
    }

    public final boolean LJIIJJI() {
        ShortVideoContext shortVideoContext = this.LJLJI;
        if (shortVideoContext.cameraComponentModel.isRetakeMode) {
            LJII("sticker canceled already record clips do nothing, isRetake:true");
            return false;
        }
        o.LJIIIIZZ(shortVideoContext.LJII(), "shortVideoContext.curShootingSegments");
        if ((!r0.isEmpty()) && this.LJLJI.LJIIIIZZ() > 0) {
            if (LIZIZ()) {
                HCA LJII = this.LJLJI.LJII();
                o.LJIIIIZZ(LJII, "shortVideoContext.curShootingSegments");
                if (!LJII.isEmpty()) {
                    Iterator<TimeSpeedModelExtension> it = LJII.iterator();
                    while (it.hasNext()) {
                        if (LJI(it.next())) {
                        }
                    }
                }
            }
            LJII("sticker canceled already record clips do nothing, isRetake:false");
            return false;
        }
        return true;
    }

    public final void LJIILIIL() {
        String str;
        String str2;
        int[] LJIIJ;
        String str3 = this.LJLJLJ;
        Effect LLJJIJIIJIL = this.LJLILLLLZI.LLJJIJIIJIL();
        if (LLJJIJIIJIL != null) {
            str = LLJJIJIIJIL.getEffect_id();
        } else {
            str = null;
        }
        if (LJ(str3, str)) {
            return;
        }
        o.LJIIIIZZ(this.LJLJI.LJII(), "shortVideoContext.curShootingSegments");
        if (!(!r1.isEmpty()) || this.LJLJI.LJIIIIZZ() <= 0 || (str2 = this.LJLJI.creativeModel.recordDowngradeModel.resolution) == null || ujb.o.LJJJJJL(str2) || (LJIIJ = C44739Hh9.LJIIJ(this.LJLJI.creativeModel.recordDowngradeModel.resolution)) == null) {
            return;
        }
        int[] LJIIIZ = C44739Hh9.LJIIIZ(false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("backToRecord updateDowngradeResolutionIfNeeded size: ");
        LIZ.append(Arrays.toString(LJIIJ));
        LIZ.append(", origin_size: ");
        LIZ.append(Arrays.toString(LJIIIZ));
        LJII(X1D.LIZIZ(LIZ));
        VESize vESize = new VESize(LJIIJ[0], LJIIJ[1]);
        if (LIZJ().LIZ()) {
            int[] LIZJ = LIZJ().LIZJ();
            if (LIZJ.length == 2) {
                vESize = new VESize(LIZJ[0], LIZJ[1]);
            }
        }
        Float f = this.LJLJI.creativeModel.recordDowngradeModel.bitrate;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("backToRecord updateDowngradeResolutionIfNeeded bitrate: ");
        LIZ2.append(f);
        LJII(X1D.LIZIZ(LIZ2));
        LJIILJJIL(vESize, false);
        LJIIL(f);
    }

    public final boolean LIZIZ() {
        StickerPreviewResolutionConfig LIZ;
        StickerPreviewResolutionConfig LIZ2 = LIZ();
        if (LIZ2 != null && LIZ2.enable && (LIZ = LIZ()) != null && LIZ.enableDowngradeMultiSegments) {
            return true;
        }
        return false;
    }

    public final void LJIIJ() {
        if (!LJIIJJI()) {
            return;
        }
        int[] LIZJ = LIZJ().LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sticker canceled render&output resolution back to:");
        String arrays = Arrays.toString(LIZJ);
        o.LJIIIIZZ(arrays, "toString(this)");
        LIZ.append(arrays);
        LJII(X1D.LIZIZ(LIZ));
        VESize vESize = new VESize(LIZJ[0], LIZJ[1]);
        LJIILJJIL(vESize, false);
        LIZJ().getClass();
        float LIZIZ = C44833Hif.LIZIZ(vESize);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("sticker canceled render&output bitrate back to:");
        LIZ2.append(LIZIZ);
        LJII(X1D.LIZIZ(LIZ2));
        LJIIL(Float.valueOf(LIZIZ));
        RecordDowngradeModel recordDowngradeModel = this.LJLJI.creativeModel.recordDowngradeModel;
        recordDowngradeModel.resolution = null;
        recordDowngradeModel.bitrate = null;
    }

    @Override // X.F4V
    public final int getPriority() {
        return T4L.LIZ();
    }

    public static final void LJII(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("downgrade_sticker_preview_resolution_tag ");
        LIZ.append(str);
        H7B.LJ(X1D.LIZIZ(LIZ));
    }

    public final boolean LJI(TimeSpeedModelExtension timeSpeedModelExtension) {
        if (InterfaceC44963Hkl.LJIIL.enableUseDynamicEffectLabel()) {
            if (timeSpeedModelExtension != null && timeSpeedModelExtension.isEnable() && C78685UuP.LJJJZ(timeSpeedModelExtension.getStickerId()) && this.LJLLILLLL.contains(timeSpeedModelExtension.getStickerId())) {
                return true;
            }
        } else if (timeSpeedModelExtension != null && timeSpeedModelExtension.isEnable() && C78685UuP.LJJJZ(timeSpeedModelExtension.getStickerId())) {
            return true;
        }
        return false;
    }

    public final void LJIIIIZZ(Effect effect) {
        String str;
        StickerPreviewResolutionConfig LIZ = LIZ();
        if (LIZ != null && LIZ.enable) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("modifyStickerChosen sticker:");
            String str2 = null;
            if (effect != null) {
                str = effect.getEffect_id();
            } else {
                str = null;
            }
            LIZ2.append(str);
            LJII(X1D.LIZIZ(LIZ2));
            if (effect != null && (!ujb.o.LJJJJJL(effect.getEffect_id()))) {
                LJIIIZ(new T4Q(effect, 0, EnumC44267HYx.RECOVER, false, null));
                return;
            }
            T4R t4r = new T4R(null, 0, EnumC44267HYx.RECOVER, false, null);
            String str3 = this.LJLJLJ;
            Effect LIZ3 = t4r.LIZ();
            if (LIZ3 != null) {
                str2 = LIZ3.getEffect_id();
            }
            if (LJ(str3, str2)) {
                return;
            }
            LJIIJ();
        }
    }

    public final void LJIIIZ(T4S t4s) {
        String str;
        String effect_id;
        StickerPreviewResolutionConfig LIZ;
        StickerPreviewResolutionConfig LIZ2;
        String str2 = this.LJLJLJ;
        Effect LIZ3 = t4s.LIZ();
        String str3 = null;
        if (LIZ3 != null) {
            str = LIZ3.getEffect_id();
        } else {
            str = null;
        }
        if (LJ(str2, str)) {
            LJIIJ();
            return;
        }
        boolean z = false;
        if (InterfaceC44963Hkl.LJIIL.enableUseDynamicEffectLabel() && (LIZ = LIZ()) != null && LIZ.enable && (LIZ2 = C44961Hkj.LIZ()) != null && LIZ2.disableDowngradeByPPI) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("sticker:");
            Effect LIZ5 = t4s.LIZ();
            if (LIZ5 != null) {
                str3 = LIZ5.getEffect_id();
            }
            LIZ4.append(str3);
            LIZ4.append(" not need downgrade because of dynamic strategy");
            LJII(X1D.LIZIZ(LIZ4));
            LJIIJ();
            return;
        }
        Effect LIZ6 = t4s.LIZ();
        if (LIZ6 != null && (effect_id = LIZ6.getEffect_id()) != null) {
            this.LJLLILLLL.add(effect_id);
        }
        ShortVideoContext shortVideoContext = this.LJLJI;
        if (shortVideoContext.cameraComponentModel.isRetakeMode) {
            LJII("sticker selected already record clips do nothing , isRetake: true");
            return;
        }
        o.LJIIIIZZ(shortVideoContext.LJII(), "shortVideoContext.curShootingSegments");
        if ((!r0.isEmpty()) && this.LJLJI.LJIIIIZZ() > 0 && !LIZIZ()) {
            LJII("sticker selected already record clips do nothing , isRetake: false");
            return;
        }
        RecordDowngradeModel recordDowngradeModel = this.LJLJI.creativeModel.recordDowngradeModel;
        if (recordDowngradeModel.hasDowngradeBeforeCameraInit) {
            recordDowngradeModel.hasDowngradeBeforeCameraInit = false;
            return;
        }
        VESize LIZLLL = LIZJ().LIZLLL(this.LJLJI.creativeModel.recordDowngradeModel.resolution);
        if (LIZLLL == null) {
            return;
        }
        LIZJ().getClass();
        float LIZIZ = C44833Hif.LIZIZ(LIZLLL);
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("sticker selected size = (");
        LIZ7.append(LIZLLL.width);
        LIZ7.append(", ");
        LIZ7.append(LIZLLL.height);
        LIZ7.append(") bitrate = ");
        LIZ7.append(LIZIZ);
        LJII(X1D.LIZIZ(LIZ7));
        if (LIZIZ()) {
            o.LJIIIIZZ(this.LJLJI.LJII(), "shortVideoContext.curShootingSegments");
            if ((!r0.isEmpty()) && this.LJLJI.LJIIIIZZ() > 0) {
                z = true;
            }
        }
        LJIILJJIL(LIZLLL, z);
        LJIIL(Float.valueOf(LIZIZ));
        this.LJLJI.creativeModel.recordDowngradeModel.resolution = C79146V4k.LJJIJIIJI(LIZLLL);
        this.LJLJI.creativeModel.recordDowngradeModel.bitrate = Float.valueOf(LIZIZ);
    }

    public final void LJIIL(Float f) {
        if (f != null) {
            float floatValue = f.floatValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("-> update bitrate: ");
            LIZ.append(floatValue);
            LJII(X1D.LIZIZ(LIZ));
            this.LJLJJLL.invoke(Float.valueOf(floatValue));
        }
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        String str;
        o.LJIIIZ(session, "session");
        StickerPreviewResolutionConfig LIZ = LIZ();
        if (LIZ == null || !LIZ.enable || ORY.LJJIJIIJIL(Integer.valueOf(this.LJLJI.shootMode), new Integer[]{16, 19})) {
            return ern.LIZ(session);
        }
        if (session instanceof T4Q) {
            LJIIIZ(session);
        } else if (session instanceof T4R) {
            String str2 = this.LJLJLJ;
            Effect LIZ2 = session.LIZ();
            if (LIZ2 != null) {
                str = LIZ2.getEffect_id();
            } else {
                str = null;
            }
            if (!LJ(str2, str)) {
                LJIIJ();
            }
        }
        return ern.LIZ(session);
    }

    public final boolean LJ(String str, String str2) {
        boolean z;
        List<String> list;
        List<String> list2;
        StickerPreviewResolutionConfig LIZ = LIZ();
        if (LIZ != null && LIZ.enable) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("sticker:");
            LIZ2.append(str2);
            LIZ2.append(" resolution downgrade experiment not open");
            LJII(X1D.LIZIZ(LIZ2));
            return true;
        }
        StickerPreviewResolutionConfig LIZ3 = LIZ();
        if (LIZ3 != null && (list2 = LIZ3.blockCategories) != null && ORZ.LJLJJI(str, list2)) {
            LJII(UPJ.LIZIZ("sticker:", str2, " category:", str, " resolution downgrade block by category"));
            return true;
        }
        StickerPreviewResolutionConfig LIZ4 = LIZ();
        if (LIZ4 == null || (list = LIZ4.blockEffects) == null || !ORZ.LJLJJI(str2, list)) {
            return false;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("sticker:");
        LIZ5.append(str2);
        LIZ5.append(" resolution downgrade block by effect id");
        LJII(X1D.LIZIZ(LIZ5));
        return true;
    }

    public final void LJIILJJIL(VESize vESize, boolean z) {
        EnumC84107Wzf enumC84107Wzf;
        VEDisplaySettings.Builder builder = new VEDisplaySettings.Builder(this.LJLIL.invoke());
        builder.setRenderSize(vESize);
        if (LIZJ().LIZ()) {
            enumC84107Wzf = EnumC84107Wzf.SCALE_MODE_CENTER_CROP;
        } else {
            enumC84107Wzf = EnumC84107Wzf.SCALE_MODE_CENTER_INSIDE;
        }
        builder.setFitMode(enumC84107Wzf);
        InterfaceC88472Yns<VEDisplaySettings, C76800UCe> interfaceC88472Yns = this.LJLJJI;
        VEDisplaySettings build = builder.build();
        o.LJIIIIZZ(build, "displaySettingsBuilder.build()");
        interfaceC88472Yns.invoke(build);
        this.LJLJJL.invoke(Integer.valueOf(vESize.width), Integer.valueOf(vESize.height));
        this.LJLLI = null;
        if (z) {
            this.LJLLI = new AqS154S0200000_7(this, vESize, 152);
            return;
        }
        ShortVideoContext shortVideoContext = this.LJLJI;
        int i = vESize.width;
        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
        cameraComponentModel.mVideoWidth = i;
        cameraComponentModel.mVideoHeight = vESize.height;
    }

    public C44960Hki(IDH idh, C46193IAz lifecycleOwner, I3X recordControlApi, AqS157S0100000_7 aqS157S0100000_7, TEZ stickerDataManager, ShortVideoContext shortVideoContext, AqS173S0100000_7 aqS173S0100000_7, AqS189S0100000_7 aqS189S0100000_7, AqS173S0100000_7 aqS173S0100000_72) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(recordControlApi, "recordControlApi");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJLIL = aqS157S0100000_7;
        this.LJLILLLLZI = stickerDataManager;
        this.LJLJI = shortVideoContext;
        this.LJLJJI = aqS173S0100000_7;
        this.LJLJJL = aqS189S0100000_7;
        this.LJLJJLL = aqS173S0100000_72;
        this.LJLJL = C221108m2.LIZIZ(C44965Hkn.LJLIL);
        this.LJLJLJ = "";
        this.LJLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 769));
        this.LJLLILLLL = new HashSet<>();
        if (idh != null) {
            this.LJLJLLL = idh;
            LJFF();
        }
        recordControlApi.Gg0().LIZLLL(lifecycleOwner, new AObjectS86S0100000_7(this, 270));
        recordControlApi.Rr0().LIZLLL(lifecycleOwner, new AObjectS86S0100000_7(this, 271));
        recordControlApi.w90().LIZLLL(lifecycleOwner, new AObjectS86S0100000_7(this, 272));
        recordControlApi.vf0().LIZLLL(lifecycleOwner, new AObjectS86S0100000_7(this, 273));
        recordControlApi.UG().LIZLLL(lifecycleOwner, new AObjectS86S0100000_7(this, 274));
    }
}
