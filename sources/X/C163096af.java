package X;

import Y.AObserverS70S0100000_2;
import Y.AObserverS82S0100000_14;
import Y.AfS54S0100000_2;
import android.graphics.PointF;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CanvasVideoEditorTrackViewModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;
import v5.n;

/* renamed from: X.6af, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163096af extends AbstractC29891Fh<InterfaceC1542063k> implements InterfaceC1542063k, InterfaceC135635Tz {
    public static final C163146ak LJLZ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZ;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC65784Pro<InterfaceC152085y0> LJLJJI;
    public C163066ac LJLJJL;
    public final InterfaceC1542063k LJLJJLL;
    public final C73318Sq2 LJLJL;
    public final MutableLiveData<VESize> LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final C5H3 LJLLI;
    public final C5H3 LJLLILLLL;
    public final C5H3 LJLLJ;
    public final C5H3 LJLLL;
    public int LJLLLL;
    public CanvasFilterParam LJLLLLLL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.6ak] */
    static {
        TBT tbt = new TBT(C163096af.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJZ = new InterfaceC74236TBo[]{tbt, new TBT(C163096af.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0)};
        LJLZ = new Object() { // from class: X.6ak
        };
    }

    private final InterfaceC163116ah LJJLIIJ() {
        return (InterfaceC163116ah) this.LJLLI.getValue();
    }

    public final VideoPublishEditModel LJJLIIIIJ() {
        return (VideoPublishEditModel) this.LJLJLLL.LIZ(this, LJZ[0]);
    }

    public final InterfaceC143655kP LJJLIIIJILLIZJL() {
        return (InterfaceC143655kP) this.LJLL.LIZ(this, LJZ[1]);
    }

    public final C83062Wio LJJLIIIJJI() {
        return (C83062Wio) this.LJLLJ.getValue();
    }

    public final C83058Wik LJJLIIIJJIZ() {
        return (C83058Wik) this.LJLLL.getValue();
    }

    public final InterfaceC163126ai LJJLIIIJLLLLLLLZ() {
        return (InterfaceC163126ai) this.LJLLILLLL.getValue();
    }

    private final void LJJLJ() {
        InterfaceC142545ic interfaceC142545ic;
        LiveData<C76800UCe> cM;
        LiveData<Boolean> LLIIII;
        LiveData<C163166am> YN;
        LJJLIIIJLLLLLLLZ().LJI().observe(this, new AObserverS70S0100000_2(this, 86));
        LJJLIIIJILLIZJL().wf0().observe(this, new AObserverS70S0100000_2(this, 87));
        InterfaceC163116ah LJJLIIJ = LJJLIIJ();
        if (LJJLIIJ != null && (YN = LJJLIIJ.YN()) != null) {
            YN.observe(this, new AObserverS70S0100000_2(this, 88));
        }
        InterfaceC163116ah LJJLIIJ2 = LJJLIIJ();
        if (LJJLIIJ2 != null && (LLIIII = LJJLIIJ2.LLIIII()) != null) {
            LLIIII.observe(this, new AObserverS82S0100000_14(this, 41));
        }
        InterfaceC143655kP LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if ((LJJLIIIJILLIZJL instanceof InterfaceC142545ic) && (interfaceC142545ic = (InterfaceC142545ic) LJJLIIIJILLIZJL) != null && (cM = interfaceC142545ic.cM()) != null) {
            cM.observe(this, new AObserverS82S0100000_14(this, 42));
        }
    }

    @Override // X.InterfaceC1542063k
    public List<InteractStickerStruct> getInteractStickerStruct() {
        boolean z;
        List<CanvasFilterParam> transformList;
        VideoShareInfoStruct videoShareInfoStruct;
        ForwardCanvasExtra forwardCanvasExtra;
        CanvasExtra extra;
        CanvasVideoData canvasVideoData = LJJLIIIIJ().canvasVideoData;
        if (canvasVideoData != null && (extra = canvasVideoData.getExtra()) != null) {
            z = extra.getEnableVVInteract();
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        C83062Wio LJJLIIIJJI = LJJLIIIJJI();
        C163086ae c163086ae = C83062Wio.LJIILJJIL;
        VESize vESize = LJJLIIIJJI.LIZIZ;
        OSZ<OSZ<Float, Float>, OSZ<Float, Float>> LJIIJJI = LJJLIIIJJI.LJIIJJI();
        c163086ae.getClass();
        OSZ LIZIZ = C163086ae.LIZIZ(vESize, LJIIJJI);
        if (canvasVideoData == null || (transformList = canvasVideoData.getTransformList()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(transformList, 10));
        for (CanvasFilterParam canvasFilterParam : transformList) {
            InteractStickerStruct LJJIJIIJIL = C78609UtB.LJJIJIIJIL(canvasFilterParam.getDegree() * 1.0f, canvasFilterParam.getScaleFactor(), (PointF) LIZIZ.getFirst(), (PointF) LIZIZ.getSecond(), LJJLIIIIJ().getVideoLength());
            CanvasExtra extra2 = canvasVideoData.getExtra();
            if (extra2 != null && (forwardCanvasExtra = extra2.getForwardCanvasExtra()) != null) {
                videoShareInfoStruct = forwardCanvasExtra.getVideoShareInfoStruct();
            } else {
                videoShareInfoStruct = null;
            }
            LJJIJIIJIL.setVideoShareInfoStruct(videoShareInfoStruct);
            arrayList.add(LJJIJIIJIL);
        }
        return arrayList;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        C163066ac c163066ac = new C163066ac(getDiContainer(), LJJLIIIJJI());
        this.LJLILLLLZI.add(this.LJLJI, c163066ac, "EditCanvasScene");
        this.LJLJJL = c163066ac;
        LJJLJ();
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        this.LJLJL.dispose();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC1542063k getApiComponent() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    private final void LJJLI(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        CanvasFilterParam canvasFilterParam;
        CanvasVideoData canvasVideoData;
        List<CanvasFilterParam> transformList;
        int i;
        if (this.LJLLLLLL != null) {
            if (this.LJLLLL < 0) {
                CanvasVideoEditorTrackViewModel canvasVideoEditorTrackViewModel = CanvasVideoEditorTrackViewModel.Companion.get(this.LJLILLLLZI.mView);
                if (canvasVideoEditorTrackViewModel != null) {
                    i = canvasVideoEditorTrackViewModel.filterIndex;
                } else {
                    i = 1;
                }
                this.LJLLLL = i;
            }
            interfaceC88472Yns.invoke(Integer.valueOf(this.LJLLLL));
            return;
        }
        CanvasVideoEditorTrackViewModel canvasVideoEditorTrackViewModel2 = CanvasVideoEditorTrackViewModel.Companion.get(this.LJLILLLLZI.mView);
        if (canvasVideoEditorTrackViewModel2 != null && canvasVideoEditorTrackViewModel2.isFilterIndexValid()) {
            this.LJLLLL = canvasVideoEditorTrackViewModel2.filterIndex;
            CanvasVideoData canvasVideoData2 = LJJLIIIIJ().canvasVideoData;
            if (canvasVideoData2 != null && (transformList = canvasVideoData2.getTransformList()) != null) {
                canvasFilterParam = (CanvasFilterParam) ORZ.LJLLLL(transformList);
            } else {
                canvasFilterParam = null;
            }
            this.LJLLLLLL = canvasFilterParam;
            if (canvasFilterParam == null && (canvasVideoData = LJJLIIIIJ().canvasVideoData) != null) {
                CanvasFilterParam canvasFilterParam2 = new CanvasFilterParam();
                canvasFilterParam2.setClipIndex(0);
                this.LJLLLLLL = canvasFilterParam2;
                canvasVideoData.putTransform(canvasFilterParam2);
            }
            interfaceC88472Yns.invoke(Integer.valueOf(canvasVideoEditorTrackViewModel2.filterIndex));
        }
    }

    @Override // X.InterfaceC1542063k
    public C10K<C76800UCe> Kb0(InterfaceC137115Zr compileCallback) {
        o.LJIIIZ(compileCallback, "compileCallback");
        AbstractC73672Svk<List<StickerItemModel>> LJFF = LJJLIIIJLLLLLLLZ().LJFF();
        if (LJFF == null) {
            return null;
        }
        n nVar = new n();
        this.LJLJL.LIZ(LJFF.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS54S0100000_2(nVar, 5), C73674Svm.LIZLLL));
        return nVar.LIZ;
    }

    public final void LJJLJLI(VEVideoTransformFilterParam vEVideoTransformFilterParam) {
        LJJLI(new AqS133S0200000_2(this, vEVideoTransformFilterParam, 65));
    }

    @Override // X.InterfaceC1542063k
    public void vM(C163166am style) {
        o.LJIIIZ(style, "style");
        LJJLI(new AqS133S0200000_2(this, style, 64));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C163096af(C82622Wbi diContainer, WMH parentScene, int i, InterfaceC65784Pro<? extends InterfaceC152085y0> gestureServiceProvider) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(gestureServiceProvider, "gestureServiceProvider");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = gestureServiceProvider;
        this.LJLJJLL = this;
        this.LJLJL = new C73318Sq2();
        this.LJLJLJ = new MutableLiveData<>();
        this.LJLJLLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLLI = C269113v.LIZIZ(this, InterfaceC163116ah.class);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 410));
        this.LJLLJ = C221108m2.LIZIZ(C163136aj.LJLIL);
        this.LJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 409));
        this.LJLLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
    }
}
