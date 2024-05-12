package X;

import Y.AObjectS117S0200000_7;
import Y.AObjectS86S0100000_7;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.LibraryContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.LibraryVideo;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import java.io.File;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.I6d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46067I6d extends AbstractC29891Fh<InterfaceC44303Ha7> implements InterfaceC44303Ha7, InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final C46067I6d LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public C45709Hwn LJLJLLL;

    static {
        TBT tbt = new TBT(C46067I6d.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C46067I6d.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C46067I6d.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(C46067I6d.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC73141SnB
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    /* renamed from: getReceiver, reason: avoid collision after fix types in other method */
    public AML getReceiver2() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    private final void LJJLIIIIJ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", android.util.Log.getStackTraceString(new Throwable("delete last segments")));
            C43882HKc.LIZLLL(0, "service_creative_record_segments_delete_illegal", jSONObject, true);
        } catch (Exception unused) {
        }
    }

    private final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LJLJJLL.LIZ(this, LJLL[1]);
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LJLJJL.LIZ(this, LJLL[0]);
    }

    public final InterfaceC45995I3j LJJLI() {
        return (InterfaceC45995I3j) this.LJLJLJ.LIZ(this, LJLL[3]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJL.LIZ(this, LJLL[2]);
    }

    @Override // X.InterfaceC44303Ha7
    public void j6() {
        C45709Hwn c45709Hwn = this.LJLJLLL;
        if (c45709Hwn != null) {
            c45709Hwn.LLJJ(false, false);
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        C0IB<C44225HXh> ys0;
        super.onCreate();
        Bundle LIZIZ = C163796bn.LIZIZ(this.LJLILLLLZI);
        InterfaceC45999I3n planCUIApiComponent = getPlanCUIApiComponent();
        if (planCUIApiComponent != null && (ys0 = planCUIApiComponent.ys0()) != null) {
            ys0.LIZIZ(this, new AObjectS117S0200000_7(LIZIZ, this, 1));
        }
        LJJLI().pj0().LIZLLL(this, new AObjectS86S0100000_7(this, 62));
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC44303Ha7 getApiComponent() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at> S1 getState(VM1 vm1) {
        return (S1) C73297Sph.LIZIZ(this, vm1);
    }

    @Override // X.InterfaceC44303Ha7
    public void qi0(ShortVideoContext shortVideoContext, boolean z) {
        String audioPath;
        String videoPath;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        HCA LIZIZ = shortVideoContext.cameraComponentModel.LIZIZ();
        if (LIZIZ != null) {
            if (!LIZIZ.isEmpty()) {
                TimeSpeedModelExtension remove = LIZIZ.remove(LIZIZ.size() - 1);
                if (!LIZIZ.isEmpty()) {
                    LibraryVideo libraryVideo = remove.getLibraryVideo();
                    if (libraryVideo != null && (videoPath = libraryVideo.getVideoPath()) != null) {
                        C16880lQ.LLLZZIL(new File(videoPath));
                    }
                    LibraryVideo libraryVideo2 = remove.getLibraryVideo();
                    if (libraryVideo2 != null && (audioPath = libraryVideo2.getAudioPath()) != null) {
                        C16880lQ.LLLZZIL(new File(audioPath));
                    }
                }
                shortVideoContext.cameraComponentModel.LJIIJ(TimeSpeedModelExtension.calculateRealTime(LIZIZ));
                LibraryContext libraryContext = shortVideoContext.libraryContext;
                int i = libraryContext.libraryMaterialCount;
                if (i > 0) {
                    libraryContext.libraryMaterialCount = i - 1;
                }
                if (z) {
                    getRecordControlApi().mv(IAO.LLLLZ(shortVideoContext.cameraComponentModel.LIZLLL(), LIZIZ, true));
                    return;
                }
                return;
            }
            throw new NoSuchElementException("List is empty.");
        }
        try {
            LJJLIIIIJ();
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIL(c73139Sn9, interfaceC88472Yns);
    }

    public C46067I6d(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = this;
        this.LJLJJL = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLJJLL = UCI.LJII(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), InterfaceC45995I3j.class, null);
    }

    @Override // X.InterfaceC44303Ha7
    public void b20(Context context, ShortVideoContext shortVideoContext, ProviderEffect providerEffect) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        shortVideoContext.creativeFlowData.setEnterMethod("click_add");
        C43712HDo.LIZIZ(context, C46104I7o.LJIILJJIL(providerEffect, null), shortVideoContext, null, false, 40);
    }

    @Override // X.InterfaceC44303Ha7
    public void gm0(ShortVideoContext shortVideoContext, EnumC45707Hwl panelStyle, LibraryMaterialInfoSv libraryMaterialInfoSv) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(panelStyle, "panelStyle");
        C45709Hwn c45709Hwn = (C45709Hwn) this.LJLILLLLZI.findSceneByTag("LibraryChooseMediaScene");
        if (c45709Hwn == null) {
            c45709Hwn = new C45709Hwn(getDiContainer(), panelStyle, shortVideoContext, null, libraryMaterialInfoSv, "Record_Page");
        }
        if (!this.LJLILLLLZI.isAdded(c45709Hwn)) {
            this.LJLILLLLZI.add(this.LJLJI, c45709Hwn, "LibraryChooseMediaScene");
        }
        LibraryMaterialInfoSv libraryMaterialInfoSv2 = shortVideoContext.libraryContext.libraryMaterialInfo;
        boolean z = false;
        if (libraryMaterialInfoSv2 != null && !libraryMaterialInfoSv2.isLibraryMaterialConsumed()) {
            z = true;
        }
        c45709Hwn.LLJJ(true, z);
        this.LJLJLLL = c45709Hwn;
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C73297Sph.LJIILLIIL(vm1, vm2, interfaceC88471Ynr);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, InterfaceC88471Ynr<? super PROP1, ? super PROP2, ? extends R> interfaceC88471Ynr) {
        return (R) C73297Sph.LJIJJLI(c73139Sn9, c73139Sn92, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC44303Ha7
    public void Hf0(ShortVideoContext shortVideoContext, LibraryParams params, LibraryMaterialInfoSv libraryMaterialInfo, boolean z) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(params, "params");
        o.LJIIIZ(libraryMaterialInfo, "libraryMaterialInfo");
        EditVideoSegment videoSegment = params.getVideoSegment();
        if (videoSegment != null) {
            TimeSpeedModelExtension timeSpeedModelExtension = new TimeSpeedModelExtension();
            timeSpeedModelExtension.setSpeed(1.0d);
            EditVideoSegment videoSegment2 = params.getVideoSegment();
            o.LJI(videoSegment2);
            timeSpeedModelExtension.setDuration((int) videoSegment2.getVideoFileInfo().getDuration());
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_key_library_material", libraryMaterialInfo);
            timeSpeedModelExtension.setRecordExtras(bundle);
            timeSpeedModelExtension.setLibraryVideo(new LibraryVideo(null, videoSegment.getVideoPath(), videoSegment.getAudioPath(), Long.valueOf(videoSegment.getVideoFileInfo().getDuration()), Long.valueOf(videoSegment.getVideoFileInfo().getDuration()), params.getOriginalImageCopyPath(), null, libraryMaterialInfo.getMaterialProvider(), null, 321, null));
            shortVideoContext.cameraComponentModel.mDurings.add(timeSpeedModelExtension);
            shortVideoContext.libraryContext.libraryMaterialCount++;
            CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
            cameraComponentModel.LJIIJ(cameraComponentModel.LIZLLL() + timeSpeedModelExtension.getDuration());
            j6();
            if (z) {
                getRecordControlApi().mv(IAO.LLLLZIL(shortVideoContext.cameraComponentModel.LIZIZ(), shortVideoContext.cameraComponentModel.LIZLLL(), timeSpeedModelExtension));
            }
        }
    }

    @Override // X.InterfaceC143795kd
    public <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public <S extends InterfaceC61312at, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C2KE<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIL(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C73297Sph.LJIILL(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, InterfaceC88473Ynt<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC88473Ynt) {
        return (R) C73297Sph.LJIJJ(c73139Sn9, c73139Sn92, c73139Sn93, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC88474Ynu<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC88474Ynu) {
        return (R) C73297Sph.LJIILJJIL(vm1, vm2, vm3, vm4, interfaceC88474Ynu);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, InterfaceC88474Ynu<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC88474Ynu) {
        return (R) C73297Sph.LJIJI(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, VM5 extends JediViewModel<S5>, S5 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC88475Ynv<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC88475Ynv) {
        return (R) C73297Sph.LJIILIIL(vm1, vm2, vm3, vm4, vm5, interfaceC88475Ynv);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, M5 extends C73139Sn9<S5, PROP5>, PROP5 extends InterfaceC61312at, S5 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, C73139Sn9<S5, PROP5> c73139Sn95, InterfaceC88475Ynv<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC88475Ynv) {
        return (R) C73297Sph.LJIJ(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, c73139Sn95, interfaceC88475Ynv);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }

    public <S extends InterfaceC61312at, A, B, C, D, E> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C73165SnZ<TMF> c73165SnZ, InterfaceC88476Ynw<? super AML, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C73297Sph.LJIIIIZZ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c73165SnZ, interfaceC88476Ynw);
    }
}
