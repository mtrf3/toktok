package X;

import Y.AObserverS66S0200000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS38S0100000_2;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.ugc.android.editor.preview.PreviewPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5QE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5QE extends AbstractC56012Ht<C5QF, C132935Jp> {
    public boolean LJLIL;
    public C87230YLi LJLILLLLZI;
    public C134585Py LJLJI;
    public ImageView LJLJJI;
    public View LJLJJL;

    public static PreviewPanelViewModel LLJILJIL() {
        return (PreviewPanelViewModel) C5G0.LIZ(PreviewPanelViewModel.class);
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        SurfaceHolder holder;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        final C87230YLi c87230YLi = this.LJLILLLLZI;
        if (c87230YLi == null) {
            return;
        }
        c87230YLi.setViewStateChange(new InterfaceC87235YLn() { // from class: X.5Jn
            @Override // X.InterfaceC87235YLn
            public final void LIZIZ() {
                C5QE c5qe = C5QE.this;
                if (c5qe.LJLIL || c5qe.getUiStates().LJ.LIZIZ.values().isEmpty()) {
                    return;
                }
                C5QE fragmentActivity = C5QE.this;
                o.LJIIIZ(fragmentActivity, "$this$fragmentActivity");
                ActivityC45651qj activityC45651qj = (ActivityC45651qj) fragmentActivity.mActivity;
                C87230YLi c87230YLi2 = c87230YLi;
                if (activityC45651qj != null) {
                    Iterator<InterfaceC132925Jo> it = fragmentActivity.getUiStates().LJ.LIZIZ.values().iterator();
                    while (it.hasNext()) {
                        it.next().LJIIL(activityC45651qj, c87230YLi2);
                    }
                    MutableLiveData mutableLiveData = C5QE.LLJILJIL().LJLJI;
                    if (mutableLiveData != null) {
                        mutableLiveData.observe(C5G5.LIZIZ(), new AObserverS70S0100000_2(fragmentActivity, 326));
                    }
                    MutableLiveData<NLEModel> mutableLiveData2 = C5QE.LLJILJIL().LJLIL;
                    if (mutableLiveData2 != null) {
                        mutableLiveData2.observe(C5G5.LIZIZ(), new AObserverS66S0200000_2(fragmentActivity, c87230YLi2, 22));
                    }
                    MutableLiveData mutableLiveData3 = C5QE.LLJILJIL().LJLLLL;
                    if (mutableLiveData3 != null) {
                        mutableLiveData3.observe(C5G5.LIZIZ(), new AObserverS70S0100000_2(fragmentActivity, 327));
                    }
                    MutableLiveData mutableLiveData4 = C5QE.LLJILJIL().LJLLJ;
                    if (mutableLiveData4 != null) {
                        mutableLiveData4.observe(C5G5.LIZIZ(), new AObserverS70S0100000_2(fragmentActivity, 328));
                    }
                    MutableLiveData mutableLiveData5 = C5QE.LLJILJIL().LJLJJL;
                    if (mutableLiveData5 != null) {
                        mutableLiveData5.observe(C5G5.LIZIZ(), new AObserverS70S0100000_2(fragmentActivity, 329));
                    }
                }
                C5QE.this.LJLIL = true;
            }

            @Override // X.InterfaceC87235YLn
            public final void LIZ(Canvas canvas) {
                o.LJIIIZ(canvas, "canvas");
                Iterator<InterfaceC132925Jo> it = C5QE.this.getUiStates().LJ.LIZIZ.values().iterator();
                while (it.hasNext()) {
                    it.next().LIZ(canvas);
                }
            }
        });
        SurfaceView surfaceView = getUiStates().LJ.LIZ;
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
            holder.addCallback(new SurfaceHolder.Callback() { // from class: X.5Jq
                @Override // android.view.SurfaceHolder.Callback
                public final void surfaceCreated(SurfaceHolder holder2) {
                    o.LJIIIZ(holder2, "holder");
                }

                @Override // android.view.SurfaceHolder.Callback
                public final void surfaceDestroyed(SurfaceHolder holder2) {
                    o.LJIIIZ(holder2, "holder");
                }

                @Override // android.view.SurfaceHolder.Callback
                public final void surfaceChanged(SurfaceHolder holder2, int i, int i2, int i3) {
                    float f;
                    NLEModel value;
                    o.LJIIIZ(holder2, "holder");
                    if (C132955Jr.LIZ) {
                        return;
                    }
                    C5QE.this.getClass();
                    MutableLiveData<NLEModel> mutableLiveData = C5QE.LLJILJIL().LJLIL;
                    if (mutableLiveData != null && (value = mutableLiveData.getValue()) != null) {
                        f = value.getCanvasRatio();
                    } else {
                        f = 0.5625f;
                    }
                    C132885Jk c132885Jk = new C132885Jk(f, i2, i3);
                    C5QE.this.getClass();
                    if (o.LJ(c132885Jk, C5QE.LLJILJIL().LJLJLJ)) {
                        return;
                    }
                    C5QE.this.getClass();
                    C5QE.LLJILJIL().gv0(i2, i3);
                    C5QE c5qe = C5QE.this;
                    C87230YLi c87230YLi2 = c5qe.LJLILLLLZI;
                    if (c87230YLi2 != null) {
                        c87230YLi2.post(new ARunnableS38S0100000_2(c5qe, 198));
                    }
                }
            });
        }
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5QG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C5QF) obj).LIZIZ;
            }
        }, null, new AqS168S0100000_2(this, 639), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5Q9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C5QF) obj).LIZJ;
            }
        }, null, new AqS168S0100000_2(this, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5QH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C5QF) obj).LJI;
            }
        }, null, new AqS168S0100000_2(this, 641), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5QI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C5QF) obj).LJIIIIZZ;
            }
        }, null, new AqS168S0100000_2(this, 638), 2, null);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ax2, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
        C87230YLi c87230YLi = (C87230YLi) viewGroup2.findViewById(R.id.dro);
        this.LJLILLLLZI = c87230YLi;
        if (c87230YLi == null) {
            return viewGroup2;
        }
        this.LJLJI = new C134585Py(c87230YLi, LLJILJIL());
        this.LJLJJI = (ImageView) viewGroup2.findViewById(R.id.i3i);
        this.LJLJJL = viewGroup2.findViewById(R.id.i3j);
        return viewGroup2;
    }
}
