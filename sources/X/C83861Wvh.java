package X;

import Y.AObjectS123S0200000_7;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.asve.recorder.VERecorderImpl;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEFocusSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import com.ss.android.vesdk.runtime.VERuntime;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.IDqS456S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wvh */
/* loaded from: classes15.dex */
public final class C83861Wvh extends FrameLayout implements InterfaceC83624Wrs {
    public LifecycleOwner LJLIL;
    public SurfaceView LJLILLLLZI;
    public TextureView LJLJI;
    public View LJLJJI;
    public final AqS164S0100000_14 LJLJJL;
    public C83866Wvm LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final EnumC83876Wvw LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C83877Wvx LJLLL;
    public boolean LJLLLL;
    public volatile boolean LJLLLLLL;
    public long LJLZ;
    public final C62822Ol8 LJZ;
    public final CopyOnWriteArrayList<InterfaceC88474Ynu<Integer, Integer, String, VERecorder, C76800UCe>> LJZI;
    public final IDqS456S0100000_14 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public final WSL LLFF;
    public final C62822Ol8 LLFFF;
    public String LLFII;
    public String LLFZ;
    public String LLI;
    public final InterfaceC83697Wt3 LLIFFJFJJ;

    private final C83870Wvq getOnFrameAvailableListenerDispatcher() {
        return (C83870Wvq) this.LL.getValue();
    }

    private final C83869Wvp getOnRecordCommonCallbackDispatcher() {
        return (C83869Wvp) this.LLF.getValue();
    }

    private final C83854Wva getOnRecordInfoListenerDispatcher() {
        return (C83854Wva) this.LLD.getValue();
    }

    public final C83887Ww7 getAttrsHelper() {
        return (C83887Ww7) this.LJLLILLLL.getValue();
    }

    @Override // X.InterfaceC83624Wrs
    public InterfaceC83670Wsc getAudioController() {
        return (InterfaceC83670Wsc) this.LJLL.getValue();
    }

    @Override // X.InterfaceC83624Wrs
    public InterfaceC83863Wvj getCameraController() {
        return (InterfaceC83863Wvj) this.LJLJLJ.getValue();
    }

    public final InterfaceC83879Wvz getCameraViewHelper$lib_asve_release() {
        return (InterfaceC83879Wvz) this.LJZ.getValue();
    }

    @Override // X.InterfaceC83624Wrs
    public Runnable getDataSourceVideoCompleteListener() {
        return null;
    }

    @Override // X.InterfaceC83624Wrs
    public InterfaceC83727WtX getEffectController() {
        return (InterfaceC83727WtX) this.LJLJL.getValue();
    }

    public final InterfaceC83721WtR getGestureDispatcher() {
        return (InterfaceC83721WtR) this.LLFFF.getValue();
    }

    @Override // X.InterfaceC83624Wrs
    public InterfaceC83865Wvl getMediaController() {
        return (InterfaceC83865Wvl) this.LJLJLLL.getValue();
    }

    public final C83666WsY getTouchHelper() {
        return (C83666WsY) this.LJLLJ.getValue();
    }

    @Override // X.InterfaceC83624Wrs
    public final void E9() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().LJJIIJZLJL();
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean H9() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().LJIJJ();
        }
        o.LJIJI("recorder");
        throw null;
    }

    public final void LIZLLL() {
        View childAt;
        if (this.LJLJI != null) {
            return;
        }
        int i = 0;
        View view = null;
        if (getChildCount() > 0) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                childAt = getChildAt(i2);
                if (childAt instanceof TextureView) {
                    break;
                }
            }
        }
        childAt = null;
        TextureView textureView = (TextureView) childAt;
        this.LJLJI = textureView;
        if (textureView != null || this.LJLILLLLZI != null) {
            return;
        }
        if (getChildCount() > 0) {
            int childCount2 = getChildCount();
            while (true) {
                if (i >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i);
                if (childAt2 instanceof SurfaceView) {
                    view = childAt2;
                    break;
                }
                i++;
            }
        }
        this.LJLILLLLZI = (SurfaceView) view;
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean LLJIJIL() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().LJIIIZ().LLJIJIL();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean LLLLLLZZ() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().LLLLLLZZ();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean LLLLZI() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().LLLLZI();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZ() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().LLZ();
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZIL() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().LLZIL();
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean LLZLLLL() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getMediaController().LLZLLLL();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public int getBackCameraPos() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().LJIIIZ().LIZLLL();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public int getCameraPosition() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().getCameraPosition();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public int getCameraPreviewHeight() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().getCameraPreviewHeight();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public int getCameraPreviewWidth() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().getCameraPreviewWidth();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public String getCameraTypeString() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().getCameraTypeString();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public List<Integer> getCameraZoomList() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().getCameraZoomList();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public int getCurrentCameraType() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().getCurrentCameraType();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public VEDisplaySettings getDisplayingSettings() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getMediaController().O7();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public long getEndFrameTimeUS() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return Math.max(c83866Wvm.getMediaController().getEndFrameTimeUS(), 0L);
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public boolean getExposureCompensationEnable() {
        if (this.LJLLLL && getCameraECInfo() != null && getCameraController().isSupportedExposureCompensation()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC83624Wrs
    public int getFPS() {
        return this.LJLLL.LJLIL;
    }

    @Override // X.InterfaceC83624Wrs
    public int getFlashMode() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().getFlashMode();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public int getFrontCameraPos() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().LJIIIZ().LJII();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public boolean getHasSetFocusAreas() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().getHasSetFocusAreas();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public VEMapBufferInfo getIntermediatePathFromEffect() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getMediaController().getIntermediatePathFromEffect();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public int getLastFlashMode() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().getLastFlashMode();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public int getLastRecordFrameNum() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getMediaController().getLastRecordFrameNum();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public LifecycleOwner getLifecycleOwner() {
        LifecycleOwner lifecycleOwner = this.LJLIL;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        o.LJIJI("lifecycleOwner");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public float getMaxCameraZoom() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().LLJJJJJIL();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public int getNextFlashMode() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().getNextFlashMode();
        }
        o.LJIJI("recorder");
        throw null;
    }

    public final View getPresentView() {
        View view = this.LJLJJI;
        if (view != null) {
            return view;
        }
        o.LJIJI("presentView");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public InterfaceC83927Wwl getRecordContext() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.LJLJL;
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public long getSegmentAudioLength() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getMediaController().getSegmentAudioLength();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public float[] getSuggestVolume() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getMediaController().getSuggestVolume();
        }
        return new float[]{1.0f, 1.0f};
    }

    @Override // X.InterfaceC83624Wrs
    public final void init() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.LJIIL();
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean o9() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().LJIIIZ().LJFF();
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final InterfaceC83867Wvn t9() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm;
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean x9() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().LIZIZ(0.0f);
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final void y9() {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            InterfaceC83867Wvn interfaceC83867Wvn = c83866Wvm.LJLJJLL;
            if (!(interfaceC83867Wvn instanceof VERecorderImpl)) {
                interfaceC83867Wvn = null;
            }
            VERecorderImpl vERecorderImpl = (VERecorderImpl) interfaceC83867Wvn;
            if (vERecorderImpl != null) {
                if (c83866Wvm.getCameraController().LJJJJI() == 1) {
                    C83866Wvm c83866Wvm2 = this.LJLJJLL;
                    if (c83866Wvm2 != null) {
                        c83866Wvm2.getCameraController().LJJJIL(0);
                        vERecorderImpl.LJ().LJIIJ(EnumC83975WxX.BACK_PRIMARY);
                        return;
                    } else {
                        o.LJIJI("recorder");
                        throw null;
                    }
                }
                C83866Wvm c83866Wvm3 = this.LJLJJLL;
                if (c83866Wvm3 != null) {
                    c83866Wvm3.getCameraController().LJJJIL(1);
                    vERecorderImpl.LJ().LJIIJ(EnumC83975WxX.FRONT_PRIMARY);
                    return;
                } else {
                    o.LJIJI("recorder");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLILLIL() {
        getCameraViewHelper$lib_asve_release().LLLLLILLIL();
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLLL() {
        C83869Wvp onRecordCommonCallbackDispatcher = getOnRecordCommonCallbackDispatcher();
        onRecordCommonCallbackDispatcher.LJLIL.clear();
        if (onRecordCommonCallbackDispatcher.LJLJI) {
            onRecordCommonCallbackDispatcher.LJLILLLLZI.LJIIJ(onRecordCommonCallbackDispatcher);
        } else {
            onRecordCommonCallbackDispatcher.LJLILLLLZI.LJIIIZ(null);
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLLZ() {
        C83854Wva onRecordInfoListenerDispatcher = getOnRecordInfoListenerDispatcher();
        onRecordInfoListenerDispatcher.LJLIL.clear();
        onRecordInfoListenerDispatcher.LJLILLLLZI.LJIIIIZZ(null);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLZIL() {
        getCameraViewHelper$lib_asve_release().LLLLZIL();
    }

    @Override // X.InterfaceC83624Wrs
    public C63824P3c getCameraECInfo() {
        return getCameraController().getCameraECInfo();
    }

    @Override // X.InterfaceC83624Wrs
    public boolean getIsExposureSeekBarShowing() {
        return getCameraViewHelper$lib_asve_release().getIsExposureSeekBarShowing();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LIZLLL();
        View view = this.LJLJI;
        if (view == null) {
            if (this.LJLILLLLZI != null) {
                view = this.LJLILLLLZI;
                if (view == null) {
                    throw new IllegalStateException("no present view!");
                }
            } else {
                "ASCameraView must contain one SurfaceView or TextureView at least!".toString();
                throw new IllegalStateException("ASCameraView must contain one SurfaceView or TextureView at least!");
            }
        }
        this.LJLJJI = view;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        LIZLLL();
    }

    public final String getBeautyFaceRes() {
        return this.LLFII;
    }

    public final String getFaceMakeUpRes() {
        return this.LLI;
    }

    @Override // X.InterfaceC83624Wrs
    public long getInitRecorderTime() {
        return this.LJLZ;
    }

    public final EnumC83876Wvw getMode() {
        return this.LJLLI;
    }

    public final String getReshapeRes() {
        return this.LLFZ;
    }

    @Override // X.InterfaceC83624Wrs
    public InterfaceC82309WSb getViewFunction() {
        return this.LLFF;
    }

    public static final /* synthetic */ C83866Wvm LIZJ(C83861Wvh c83861Wvh) {
        C83866Wvm c83866Wvm = c83861Wvh.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm;
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final void A9(boolean z) {
        getTouchHelper().LIZ.LIZ = z;
    }

    @Override // X.InterfaceC83624Wrs
    public final void B9(Cert cert) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().LJIIIZ().LJIIIZ(cert);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void C0(boolean z) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getEffectController().C0(z);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void C9(InterfaceC83974WxW interfaceC83974WxW) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getEffectController().C9(interfaceC83974WxW);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean D7(VEFocusSettings vEFocusSettings) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().D7(vEFocusSettings);
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final void F9(IBA iba) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getAudioController().LIZJ(iba);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void K8(C84046Wyg c84046Wyg) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getEffectController().K8(c84046Wyg);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void L9(InterfaceC88474Ynu<? super Integer, ? super Integer, ? super String, ? super VERecorder, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.LJZI.remove(callback);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LIZ(InterfaceC83707WtD listener) {
        o.LJIIIZ(listener, "listener");
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.LIZ(listener);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LIZIZ(AqS173S0100000_7 aqS173S0100000_7) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.LIZIZ(aqS173S0100000_7);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LJJIJLIJ(boolean z) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getEffectController().LJJIJLIJ(z);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LJJJJJ(int i) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().LJJJJJ(i);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLJJIJIIJIL(boolean z) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().LLJJIJIIJIL(z);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean LLJJJJLIIL(boolean z) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().LJIIIZ().LLJJJJLIIL(z);
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean LLJJL(float f) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().LLJJL(f);
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLJLJLL(InterfaceC83707WtD listener) {
        o.LJIIIZ(listener, "listener");
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.LLLLLJLJLL(listener);
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLLIL(HJ0 hj0) {
        C83869Wvp onRecordCommonCallbackDispatcher = getOnRecordCommonCallbackDispatcher();
        onRecordCommonCallbackDispatcher.getClass();
        if (onRecordCommonCallbackDispatcher.LJLIL.isEmpty()) {
            if (onRecordCommonCallbackDispatcher.LJLJI) {
                onRecordCommonCallbackDispatcher.LJLILLLLZI.LJFF(onRecordCommonCallbackDispatcher);
            } else {
                onRecordCommonCallbackDispatcher.LJLILLLLZI.LJIIIZ(onRecordCommonCallbackDispatcher);
            }
        }
        onRecordCommonCallbackDispatcher.LJLIL.add(hj0);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLLJ(InterfaceC83889Ww9 listener) {
        o.LJIIIZ(listener, "listener");
        C83870Wvq onFrameAvailableListenerDispatcher = getOnFrameAvailableListenerDispatcher();
        onFrameAvailableListenerDispatcher.getClass();
        synchronized (onFrameAvailableListenerDispatcher) {
            if (onFrameAvailableListenerDispatcher.LIZ.contains(listener)) {
                onFrameAvailableListenerDispatcher.LIZ.remove(listener);
                if (onFrameAvailableListenerDispatcher.LIZ.isEmpty()) {
                    if (onFrameAvailableListenerDispatcher.LIZJ) {
                        onFrameAvailableListenerDispatcher.LIZIZ.getCameraController().LLLLLZ(onFrameAvailableListenerDispatcher);
                    } else {
                        onFrameAvailableListenerDispatcher.LIZIZ.LJI(null);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLLLLL(IAF listener) {
        o.LJIIIZ(listener, "listener");
        C83854Wva onRecordInfoListenerDispatcher = getOnRecordInfoListenerDispatcher();
        onRecordInfoListenerDispatcher.getClass();
        if (onRecordInfoListenerDispatcher.LJLIL.isEmpty()) {
            onRecordInfoListenerDispatcher.LJLILLLLZI.LJIIIIZZ(onRecordInfoListenerDispatcher);
        }
        onRecordInfoListenerDispatcher.LJLIL.add(listener);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLLLLLL(boolean z) {
        getCameraViewHelper$lib_asve_release().LLLLLLLLLL(z);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLZ(InterfaceC83996Wxs interfaceC83996Wxs) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().LLLLLZ(interfaceC83996Wxs);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLZL(int i) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().LLLLLZL(i);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLZ(InterfaceC83991Wxn zoomListener) {
        o.LJIIIZ(zoomListener, "zoomListener");
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().LLLLZ(zoomListener);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLZLL(int i) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().LLLLZLL(i);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLZLLLI(InterfaceC83889Ww9 listener) {
        o.LJIIIZ(listener, "listener");
        C83870Wvq onFrameAvailableListenerDispatcher = getOnFrameAvailableListenerDispatcher();
        onFrameAvailableListenerDispatcher.getClass();
        synchronized (onFrameAvailableListenerDispatcher) {
            if (onFrameAvailableListenerDispatcher.LIZ.isEmpty()) {
                if (onFrameAvailableListenerDispatcher.LIZJ) {
                    onFrameAvailableListenerDispatcher.LIZIZ.getCameraController().LJIJ(onFrameAvailableListenerDispatcher);
                } else {
                    onFrameAvailableListenerDispatcher.LIZIZ.LJI(onFrameAvailableListenerDispatcher);
                }
            }
            if (!onFrameAvailableListenerDispatcher.LIZ.contains(listener)) {
                onFrameAvailableListenerDispatcher.LIZ.add(listener);
            }
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLZ(IAF listener) {
        o.LJIIIZ(listener, "listener");
        C83854Wva onRecordInfoListenerDispatcher = getOnRecordInfoListenerDispatcher();
        onRecordInfoListenerDispatcher.getClass();
        onRecordInfoListenerDispatcher.LJLIL.remove(listener);
        if (onRecordInfoListenerDispatcher.LJLIL.isEmpty()) {
            onRecordInfoListenerDispatcher.LJLILLLLZI.LJIIIIZZ(null);
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLZI(InterfaceC88474Ynu<? super Integer, ? super Integer, ? super String, ? super VERecorder, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.LJZI.add(callback);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZILL(InterfaceC83962WxK listener) {
        o.LJIIIZ(listener, "listener");
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().LLZILL(listener);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZL(boolean z) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().LLZL(z);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZLI(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().LLZLI(interfaceC88472Yns);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void a(InterfaceC83962WxK listener) {
        o.LJIIIZ(listener, "listener");
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().a(listener);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean b(boolean z) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getMediaController().b(z);
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean c(String str) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getMediaController().c(str);
        }
        return false;
    }

    @Override // X.InterfaceC83624Wrs
    public final void enableAudio(boolean z) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().enableAudio(z);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        C83666WsY touchHelper = getTouchHelper();
        touchHelper.getClass();
        C83631Wrz c83631Wrz = touchHelper.LIZ;
        c83631Wrz.getClass();
        c83631Wrz.LIZIZ.onTouchEvent(event);
        c83631Wrz.LIZJ.LIZ(event);
        return true;
    }

    @Override // X.InterfaceC83624Wrs
    public final void p9(Cert cert) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().p9(cert);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void pauseEffectAudio(boolean z) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getEffectController().pauseEffectAudio(z);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void q9(HJ0 callback) {
        o.LJIIIZ(callback, "callback");
        C83869Wvp onRecordCommonCallbackDispatcher = getOnRecordCommonCallbackDispatcher();
        onRecordCommonCallbackDispatcher.getClass();
        onRecordCommonCallbackDispatcher.LJLIL.remove(callback);
        if (onRecordCommonCallbackDispatcher.LJLIL.isEmpty()) {
            if (onRecordCommonCallbackDispatcher.LJLJI) {
                onRecordCommonCallbackDispatcher.LJLILLLLZI.LJIIJ(onRecordCommonCallbackDispatcher);
            } else {
                onRecordCommonCallbackDispatcher.LJLILLLLZI.LJIIIZ(null);
            }
        }
    }

    @Override // X.InterfaceC83624Wrs
    public void setARCoreParam(boolean z) {
        VEARCoreParam vEARCoreParam = new VEARCoreParam();
        vEARCoreParam.setEnableARCore(z);
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getEffectController().setARCoreParam(vEARCoreParam);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public void setAudioCaptureDevice(IC8 device) {
        o.LJIIIZ(device, "device");
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getAudioController().LJFF().setAudioDevice(device);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public void setAudioDevice(IC8 device) {
        VERecorder LJ;
        VEAudioCapture vEAudioCapture;
        o.LJIIIZ(device, "device");
        C83866Wvm c83866Wvm = this.LJLJJLL;
        InterfaceC83867Wvn interfaceC83867Wvn = null;
        if (c83866Wvm != null) {
            InterfaceC83867Wvn interfaceC83867Wvn2 = c83866Wvm.LJLJJLL;
            if (interfaceC83867Wvn2 instanceof VERecorderImpl) {
                interfaceC83867Wvn = interfaceC83867Wvn2;
            }
            VERecorderImpl vERecorderImpl = (VERecorderImpl) interfaceC83867Wvn;
            if (vERecorderImpl != null && (LJ = vERecorderImpl.LJ()) != null && (vEAudioCapture = LJ.LIZIZ.mVEAudioCapture) != null) {
                vEAudioCapture.setAudioDevice(device);
                return;
            }
            return;
        }
        o.LJIJI("recorder");
        throw null;
    }

    public final void setBeautyFaceRes(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LLFII = str;
    }

    @Override // X.InterfaceC83624Wrs
    public void setBodyBeautyLevel(int i) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().setBodyBeautyLevel(i);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public void setCameraPreviewSizeInterface(InterfaceC83997Wxt interfaceC83997Wxt) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().setCameraPreviewSizeInterface(interfaceC83997Wxt);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public void setCloseCameraListener(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().LJJIII(listener);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public void setControllerCallback(InterfaceC83970WxS interfaceC83970WxS) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().setControllerCallback(interfaceC83970WxS);
            C83866Wvm c83866Wvm2 = this.LJLJJLL;
            if (c83866Wvm2 != null) {
                c83866Wvm2.getMediaController().setControllerCallback(interfaceC83970WxS);
                C83866Wvm c83866Wvm3 = this.LJLJJLL;
                if (c83866Wvm3 != null) {
                    if (c83866Wvm3.LJLJL.LJJIIJ()) {
                        C83866Wvm c83866Wvm4 = this.LJLJJLL;
                        if (c83866Wvm4 != null) {
                            c83866Wvm4.getAudioController().setControllerCallback(interfaceC83970WxS);
                            return;
                        } else {
                            o.LJIJI("recorder");
                            throw null;
                        }
                    }
                    return;
                }
                o.LJIJI("recorder");
                throw null;
            }
            o.LJIJI("recorder");
            throw null;
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public void setDataSourceVideoCompleteListener(Runnable runnable) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.LIZLLL().LIZLLL(runnable);
        }
    }

    @Override // X.InterfaceC83624Wrs
    public void setDetectInterval(int i) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getEffectController().setDetectInterval(i);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public void setDeviceRotation(int i) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().setDeviceRotation(i);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public void setDuetSupportChangeLayout(boolean z) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.LIZLLL().LIZIZ(z);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public void setExposureCompensation(int i) {
        getCameraController().setExposureCompensation(i);
    }

    @Override // X.InterfaceC83624Wrs
    public void setExposureCompensationEnable(boolean z) {
        this.LJLLLL = z;
    }

    @Override // X.InterfaceC83624Wrs
    public void setExposureSeekBarProgress(float f) {
        getCameraViewHelper$lib_asve_release().setExposureSeekBarProgress(f);
    }

    public final void setFaceMakeUpRes(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LLI = str;
    }

    @Override // X.InterfaceC83624Wrs
    public void setFilter(String str) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getEffectController().setFilter(str);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public void setHandDetectLowpower(boolean z) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getEffectController().setHandDetectLowpower(z);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "<set-?>");
        this.LJLIL = lifecycleOwner;
    }

    @Override // X.InterfaceC83624Wrs
    public void setMusicPath(String str) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().setMusicPath(str);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public void setRecordMaxDuration(long j) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().setRecordMaxDuration(j);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public void setRecordMode(EnumC84128X0a mode) {
        o.LJIIIZ(mode, "mode");
        getCameraController().setRecordMode(mode);
    }

    public final void setReshapeRes(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LLFZ = str;
    }

    @Override // X.InterfaceC83624Wrs
    public void setSATZoomListener(InterfaceC83712WtI interfaceC83712WtI) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().setSATZoomListener(interfaceC83712WtI);
        }
    }

    @Override // X.InterfaceC83624Wrs
    public void setSensitiveApiCallback(InterfaceC83723WtT interfaceC83723WtT) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().setSensitiveApiCallback(interfaceC83723WtT);
            C83866Wvm c83866Wvm2 = this.LJLJJLL;
            if (c83866Wvm2 != null) {
                c83866Wvm2.getAudioController().setSensitiveApiCallback(interfaceC83723WtT);
                return;
            } else {
                o.LJIJI("recorder");
                throw null;
            }
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public void setUseAudioGraph(boolean z) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getAudioController().LIZIZ(z);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void t8(Surface surface) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().t8(surface);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void u4(boolean z) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getEffectController().u4(z);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void u9(Cert cert) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().T8(false, cert);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void w4(boolean z) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getEffectController().w4(z);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void w9(CameraModule cameraModule) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().LJIIJ(cameraModule);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void z9(C83656WsO c83656WsO) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().LJIJ(c83656WsO);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public void setAudioDevice(boolean z) {
        VERecorder LJ;
        C83866Wvm c83866Wvm = this.LJLJJLL;
        InterfaceC83867Wvn interfaceC83867Wvn = null;
        if (c83866Wvm != null) {
            InterfaceC83867Wvn interfaceC83867Wvn2 = c83866Wvm.LJLJJLL;
            if (interfaceC83867Wvn2 instanceof VERecorderImpl) {
                interfaceC83867Wvn = interfaceC83867Wvn2;
            }
            VERecorderImpl vERecorderImpl = (VERecorderImpl) interfaceC83867Wvn;
            if (vERecorderImpl != null && (LJ = vERecorderImpl.LJ()) != null) {
                LJ.LIZIZ.setAudioDevice(z);
                return;
            }
            return;
        }
        o.LJIJI("recorder");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83861Wvh(C29S context, InterfaceC83697Wt3 interfaceC83697Wt3) {
        super(context, null, 0);
        EnumC83876Wvw enumC83876Wvw;
        o.LJIIIZ(context, "context");
        this.LLIFFJFJJ = interfaceC83697Wt3;
        this.LJLJJL = new AqS164S0100000_14(this, 276);
        this.LJLJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 274));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 273));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 277));
        this.LJLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 272));
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            enumC83876Wvw = c83866Wvm.LJLJJI;
        } else {
            enumC83876Wvw = EnumC83876Wvw.CUSTOM;
        }
        this.LJLLI = enumC83876Wvw;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS164S0100000_14(context, 271));
        this.LJLLJ = C221108m2.LIZIZ(new AqS161S0200000_14(this, context, 32));
        C83877Wvx c83877Wvx = new C83877Wvx();
        this.LJLLL = c83877Wvx;
        this.LJZ = C221108m2.LIZIZ(new AqS161S0200000_14(this, context, 31));
        CopyOnWriteArrayList<InterfaceC88474Ynu<Integer, Integer, String, VERecorder, C76800UCe>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(c83877Wvx);
        this.LJZI = copyOnWriteArrayList;
        this.LJZL = new IDqS456S0100000_14(this, 0);
        this.LL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 278));
        this.LLD = C221108m2.LIZIZ(new AqS164S0100000_14(this, 280));
        this.LLF = C221108m2.LIZIZ(new AqS164S0100000_14(this, 279));
        getAttrsHelper().getClass();
        this.LLFF = new WSL(this);
        this.LLFFF = C221108m2.LIZIZ(new AqS164S0100000_14(this, 275));
        this.LLFII = "";
        this.LLFZ = "";
        this.LLI = "";
    }

    @Override // X.InterfaceC83624Wrs
    public final void C7(boolean z, Cert cert) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().LJIILLIIL(cert, z);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void D9(C78862UxG c78862UxG, boolean z) {
        if (this.LJLLLLLL != z) {
            this.LJLLLLLL = z;
            C83866Wvm c83866Wvm = this.LJLJJLL;
            if (c83866Wvm != null) {
                c83866Wvm.getMediaController().T8(z, c78862UxG);
            } else {
                o.LJIJI("recorder");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void K9(C83639Ws7 c83639Ws7, Cert cert) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().LJFF(c83639Ws7, cert);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean LLJJLIIIJLLLLLLLZ(float f, float f2) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getCameraController().LLJJLIIIJLLLLLLLZ(f, f2);
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLJIL(C83932Wwq c83932Wwq, String workSpacePath) {
        o.LJIIIZ(workSpacePath, "workSpacePath");
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.LLLLLJIL(c83932Wwq, workSpacePath);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLL(int i, int i2) {
        getCameraViewHelper$lib_asve_release().LLLLLL(i, i2);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLZLLIL(float f, float f2) {
        getCameraViewHelper$lib_asve_release().LLLLZLLIL(f, f2);
    }

    @Override // X.InterfaceC83624Wrs
    public final int LLZLLIL(ActivityC45651qj context, I86 i86) {
        o.LJIIIZ(context, "context");
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getMediaController().LLZLLIL(context, i86);
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZZ(InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().LLZZ(interfaceC88472Yns, z);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final int LLZZLLIL(C29S context, I86 i86) {
        o.LJIIIZ(context, "context");
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getMediaController().LLZZLLIL(context, i86);
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZZZIL(InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().LLZZZIL(interfaceC65784Pro, interfaceC88472Yns);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void s9(Cert cert, boolean z) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getAudioController().LJI(cert, z);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void v9(InterfaceC83927Wwl recorderContext, C83733Wtd c83733Wtd) {
        TextureView.SurfaceTextureListener surfaceTextureListener;
        o.LJIIIZ(recorderContext, "recorderContext");
        if (this.LJLIL != null) {
            C83924Wwi c83924Wwi = new C83924Wwi(this, recorderContext);
            if (c83924Wwi.LLJL().invoke().booleanValue()) {
                VERuntime.getInstance().enableRefactorRecorder(true);
                if (!c83924Wwi.LJLJJL) {
                    VERuntime.getInstance().enableAudioCapture(true);
                }
            }
            this.LJLZ = System.currentTimeMillis();
            C83866Wvm LIZ = C83764Wu8.LIZ(getLifecycleOwner(), c83924Wwi, c83733Wtd, this.LJLJJL, this.LLIFFJFJJ);
            this.LJLJJLL = LIZ;
            TextureView textureView = this.LJLJI;
            if (textureView != null) {
                surfaceTextureListener = textureView.getSurfaceTextureListener();
            } else {
                surfaceTextureListener = null;
            }
            TextureView textureView2 = this.LJLJI;
            if (textureView2 != null) {
                textureView2.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC83872Wvs(surfaceTextureListener, LIZ, c83924Wwi));
            }
            C83866Wvm c83866Wvm = this.LJLJJLL;
            if (c83866Wvm != null) {
                c83866Wvm.LJIIJJI(this.LJZL);
                return;
            } else {
                o.LJIJI("recorder");
                throw null;
            }
        }
        "must set lifecycleOwner before start".toString();
        throw new IllegalStateException("must set lifecycleOwner before start");
    }

    @Override // X.InterfaceC83624Wrs
    public final void G9(int i, int i2, WS2 ws2) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getEffectController().ga(i, i2, ws2);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void I9(int i, C83639Ws7 c83639Ws7, Cert cert) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().LJJIJIL(i, c83639Ws7, cert);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void J1(String[] strArr, double[] dArr, boolean[] zArr) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getEffectController().J1(strArr, dArr, zArr);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZZZZ(String str, double d, AObjectS123S0200000_7 aObjectS123S0200000_7) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().LLZZZZ(str, d, aObjectS123S0200000_7);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        LIZLLL();
    }

    @Override // X.InterfaceC83624Wrs
    public final void r9(int i, C83660WsS c83660WsS, Cert cert) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getCameraController().LJJIJL(i, c83660WsS, cert);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void u8(Surface surface, String deviceName, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(surface, "surface");
        o.LJIIIZ(deviceName, "deviceName");
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().u8(surface, deviceName, interfaceC88472Yns);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void J9(long j, long j2, String str, boolean z) {
        LLZZJLIL(j, j2, str, z, false);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LJJIJL(int i, long j, long j2, String msg) {
        o.LJIIIZ(msg, "msg");
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getEffectController().LJJIJL(i, j, j2, msg);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final int LLLII(String strImagePath, int i, int i2, InterfaceC88472Yns<? super Integer, C76800UCe> callback) {
        o.LJIIIZ(strImagePath, "strImagePath");
        o.LJIIIZ(callback, "callback");
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            return c83866Wvm.getMediaController().LLLII(strImagePath, i, i2, callback);
        }
        o.LJIJI("recorder");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLLLZIL(C83817Wuz c83817Wuz, InterfaceC88472Yns interfaceC88472Yns, InterfaceC83737Wth cameraOpenListener, Cert cert) {
        o.LJIIIZ(cameraOpenListener, "cameraOpenListener");
        LLLLLLIL(new C83873Wvt(this, cameraOpenListener));
        getCameraController().LLLLLLLZIL(c83817Wuz, interfaceC88472Yns, cameraOpenListener, cert);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZZJLIL(long j, long j2, String str, boolean z, boolean z2) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().LLZZJLIL(j, j2, str, z, z2);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZLL(double d, boolean z, float f, int i, int i2, AObjectS123S0200000_7 aObjectS123S0200000_7) {
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().LLZLL(d, z, f, i, i2, aObjectS123S0200000_7);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLZZIL(String strImagePath, int i, int i2, boolean z, Bitmap.CompressFormat format, InterfaceC88472Yns<? super Integer, C76800UCe> callback, boolean z2) {
        o.LJIIIZ(strImagePath, "strImagePath");
        o.LJIIIZ(format, "format");
        o.LJIIIZ(callback, "callback");
        C83866Wvm c83866Wvm = this.LJLJJLL;
        if (c83866Wvm != null) {
            c83866Wvm.getMediaController().LLLZZIL(strImagePath, i, i2, z, format, callback, z2);
        } else {
            o.LJIJI("recorder");
            throw null;
        }
    }
}
