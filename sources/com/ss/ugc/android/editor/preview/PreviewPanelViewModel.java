package com.ss.ugc.android.editor.preview;

import X.C132885Jk;
import X.C16880lQ;
import X.C5HP;
import X.C5HQ;
import X.C5PT;
import X.C76800UCe;
import X.EnumC132175Gr;
import X.InterfaceC132925Jo;
import X.InterfaceC65784Pro;
import X.OSZ;
import Y.ARunnableS13S0300000_2;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class PreviewPanelViewModel extends ViewModel {
    public final MutableLiveData<NLEModel> LJLIL = new MutableLiveData<>();
    public final MutableLiveData<Long> LJLILLLLZI;
    public final MutableLiveData LJLJI;
    public final MutableLiveData<OSZ<Float, Float>> LJLJJI;
    public final MutableLiveData LJLJJL;
    public final MutableLiveData<Boolean> LJLJJLL;
    public final MutableLiveData<Boolean> LJLJL;
    public volatile C132885Jk LJLJLJ;
    public volatile long LJLJLLL;
    public boolean LJLL;
    public final Handler LJLLI;
    public final MutableLiveData<C76800UCe> LJLLILLLL;
    public final MutableLiveData LJLLJ;
    public final MutableLiveData<OSZ<NLETrack, NLETrackSlot>> LJLLL;
    public final MutableLiveData LJLLLL;
    public final MutableLiveData<OSZ<OSZ<NLETrack, NLETrackSlot>, OSZ<NLETrack, NLETrackSlot>>> LJLLLLLL;
    public NLEEditor LJLZ;
    public final Handler LJZ;
    public long LJZI;
    public boolean LJZL;

    public final void lv0() {
        this.LJLLILLLL.setValue(C76800UCe.LIZ);
    }

    public PreviewPanelViewModel() {
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        this.LJLILLLLZI = mutableLiveData;
        this.LJLJI = mutableLiveData;
        MutableLiveData<OSZ<Float, Float>> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJJI = mutableLiveData2;
        this.LJLJJL = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.LJLJJLL = mutableLiveData3;
        this.LJLJL = mutableLiveData3;
        this.LJLL = true;
        this.LJLLI = new Handler(C16880lQ.LLJJJJ());
        MutableLiveData<C76800UCe> mutableLiveData4 = new MutableLiveData<>();
        this.LJLLILLLL = mutableLiveData4;
        this.LJLLJ = mutableLiveData4;
        MutableLiveData<OSZ<NLETrack, NLETrackSlot>> mutableLiveData5 = new MutableLiveData<>();
        this.LJLLL = mutableLiveData5;
        this.LJLLLL = mutableLiveData5;
        this.LJLLLLLL = new MutableLiveData<>();
        this.LJZ = new Handler(C16880lQ.LLJJJJ());
        this.LJZL = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OSZ<Float, Float> jv0(View viewParent) {
        float f;
        o.LJIIIZ(viewParent, "viewParent");
        OSZ<Float, Float> osz = (OSZ) this.LJLJJL.getValue();
        if (osz != null) {
            return osz;
        }
        NLEModel value = this.LJLIL.getValue();
        if (value != null) {
            f = value.getCanvasRatio();
        } else {
            f = 0.5625f;
        }
        OSZ<Float, Float> hv0 = hv0(f, viewParent.getMeasuredWidth(), viewParent.getMeasuredHeight());
        this.LJLJJI.setValue(hv0);
        return hv0;
    }

    public final void mv0(OSZ<? extends NLETrack, ? extends NLETrackSlot> osz) {
        this.LJLLLLLL.setValue(new OSZ<>(this.LJLLLL.getValue(), osz));
        this.LJLLL.setValue(osz);
    }

    public final void gv0(int i, int i2) {
        float f;
        NLEModel value = this.LJLIL.getValue();
        if (value != null) {
            f = value.getCanvasRatio();
        } else {
            f = 0.5625f;
        }
        this.LJLJLJ = new C132885Jk(f, i, i2);
        this.LJLJJI.setValue(hv0(f, i, i2));
    }

    public static OSZ hv0(float f, float f2, float f3) {
        float f4 = f2 / f3;
        Float valueOf = Float.valueOf(1280.0f);
        Float valueOf2 = Float.valueOf(720.0f);
        if (f4 > f) {
            float f5 = f * f3;
            if (!Float.isInfinite(f5) && !Float.isNaN(f5) && !Float.isInfinite(f3) && !Float.isNaN(f3)) {
                return new OSZ(Float.valueOf(f5), Float.valueOf(f3));
            }
            return new OSZ(valueOf2, valueOf);
        }
        float f6 = f2 / f;
        if (!Float.isInfinite(f2) && !Float.isNaN(f2) && !Float.isInfinite(f6) && !Float.isNaN(f6)) {
            return new OSZ(Float.valueOf(f2), Float.valueOf(f6));
        }
        return new OSZ(valueOf2, valueOf);
    }

    public static void iv0(PreviewPanelViewModel previewPanelViewModel, NLEEditor nLEEditor, InterfaceC65784Pro interfaceC65784Pro) {
        if (previewPanelViewModel.LJZI == 0) {
            previewPanelViewModel.LJZI = SystemClock.elapsedRealtime();
            interfaceC65784Pro.invoke();
            nLEEditor.LIZIZ();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - previewPanelViewModel.LJZI;
        if (j < 0) {
            return;
        }
        long j2 = 16;
        if (j >= j2) {
            previewPanelViewModel.LJZI = elapsedRealtime;
            interfaceC65784Pro.invoke();
            nLEEditor.LIZIZ();
        } else {
            previewPanelViewModel.LJZI = (elapsedRealtime + j2) - j;
            previewPanelViewModel.LJZ.postDelayed(new ARunnableS13S0300000_2(interfaceC65784Pro, nLEEditor, (Object) null, 21), j2 - j);
        }
    }

    public final C5PT kv0(InterfaceC132925Jo material, View view, NLETrackSlot nLETrackSlot) {
        Float f;
        float f2;
        float f3;
        float rotation;
        o.LJIIIZ(material, "material");
        NLEModel value = this.LJLIL.getValue();
        if (value != null) {
            f = Float.valueOf(value.getCanvasRatio());
        } else {
            f = null;
        }
        if (nLETrackSlot == null || view == null || f == null) {
            return null;
        }
        o.LIZJ(f, 0.0f);
        OSZ<Float, Float> jv0 = jv0(view);
        float floatValue = jv0.getFirst().floatValue();
        float floatValue2 = jv0.getSecond().floatValue();
        if (material.LJIJJ() == C5HP.RIGHT) {
            f2 = nLETrackSlot.getTransformX();
        } else {
            f2 = -nLETrackSlot.getTransformX();
        }
        if (material.LJIIIIZZ() == C5HQ.DOWN) {
            f3 = nLETrackSlot.getTransformY();
        } else {
            f3 = -nLETrackSlot.getTransformY();
        }
        float measuredWidth = (view.getMeasuredWidth() * 0.5f) + ((floatValue * f2) / material.LJIIJJI());
        float measuredHeight = (view.getMeasuredHeight() * 0.5f) + ((floatValue2 * f3) / material.LJIIJJI());
        OSZ<Float, Float> LJI = material.LJI(nLETrackSlot);
        if (material.LJIJJLI() == EnumC132175Gr.ANTICLOCKWISE) {
            rotation = -nLETrackSlot.getRotation();
        } else {
            rotation = nLETrackSlot.getRotation();
        }
        return new C5PT(nLETrackSlot.getScale() * LJI.getFirst().floatValue(), nLETrackSlot.getScale() * LJI.getSecond().floatValue(), measuredWidth, measuredHeight, (int) rotation);
    }
}
