package com.bytedance.android.livesdk.broadcast.preview;

import X.ActivityC45651qj;
import X.BHA;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C15450j7;
import X.C16880lQ;
import X.C20910rv;
import X.C221108m2;
import X.C29306Beo;
import X.C29S;
import X.C39187FZn;
import X.C39188FZo;
import X.C39519Ff9;
import X.C3C5;
import X.C61712OJw;
import X.C61713OJx;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C76800UCe;
import X.C78857UxB;
import X.C78862UxG;
import X.C90903hW;
import X.InterfaceC30045Bqj;
import X.InterfaceC65784Pro;
import X.ViewOnClickListenerC13880ga;
import X.Y58;
import X.Y59;
import Y.ACListenerS32S0100000_12;
import Y.ACListenerS35S0100000_15;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.broadcast.LiveCoverCameraRetryEvent;
import com.bytedance.android.livesdk.broadcast.LiveCoverCameraTypeChannel;
import com.bytedance.android.livesdk.broadcast.LiveCoverFlashModeChannel;
import com.bytedance.android.livesdk.broadcast.LiveCoverIsFlashSupportedChannel;
import com.bytedance.android.livesdk.broadcast.LiveCoverManualFocusEvent;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;
import q03.IDaS491S0100000_15;

/* loaded from: classes16.dex */
public final class LiveCoverCameraFragment extends BaseFragment implements InterfaceC30045Bqj, SensorEventListener {
    public Uri LJLIL;
    public boolean LJLILLLLZI;
    public DataChannel LJLJI;
    public Y58 LJLJJI;
    public boolean LJLJJLL;
    public SensorManager LJLL;
    public Sensor LJLLI;
    public double LJLLILLLL;
    public double LJLLJ;
    public InterfaceC65784Pro<C76800UCe> LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 25));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 64));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 65));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 63));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C39187FZn c39187FZn = C39188FZo.LIZ;
        SensorManager sensorManager = this.LJLL;
        if (sensorManager != null) {
            Sensor sensor = this.LJLLI;
            C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476415490, "bpea-live_anchor_cover_focus");
            c39187FZn.getClass();
            C39187FZn.LIZJ(sensorManager, this, sensor, 3, LJJIIJ);
            super.onResume();
            return;
        }
        o.LJIJI("sensorManager");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        _$_findCachedViewById(R.id.l0v).clearAnimation();
        _$_findCachedViewById(R.id.l0w).clearAnimation();
        _$_findCachedViewById(R.id.djh).clearAnimation();
        _$_findCachedViewById(R.id.b36).clearAnimation();
        C16880lQ.LJLJJL((AnimatorSet) this.LJLJL.getValue());
        ((Animation) this.LJLJLJ.getValue()).cancel();
        ((Animation) this.LJLJLLL.getValue()).cancel();
        Y58 y58 = this.LJLJJI;
        if (y58 != null) {
            ((Handler) y58.LJII.getValue()).removeCallbacksAndMessages(null);
            ((LinkedHashMap) this.LJLLLL).clear();
        } else {
            o.LJIJI("cameraProxy");
            throw null;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C39187FZn c39187FZn = C39188FZo.LIZ;
        SensorManager sensorManager = this.LJLL;
        if (sensorManager != null) {
            C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476415490, "bpea-live_anchor_cover_focus");
            c39187FZn.getClass();
            C39187FZn.LIZLLL(sensorManager, this, LJJIIJ);
            ((AnimatorSet) this.LJLJL.getValue()).end();
            return;
        }
        o.LJIJI("sensorManager");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (C29306Beo.LIZIZ(getContext()) != null) {
            C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
            LIZIZ.LIZIZ(false, false);
            LIZIZ.LIZIZ.LJIIL();
            LIZIZ.LJFF(-16777216);
            LIZIZ.LIZIZ.LJII(false);
            LIZIZ.LIZJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "6640974686428236120");
        if (c03880Dg.LIZJ(10501, "com/bytedance/android/livesdk/broadcast/preview/LiveCoverCameraFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/bytedance/android/livesdk/broadcast/preview/LiveCoverCameraFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        if (z) {
            Y59 y59 = (Y59) _$_findCachedViewById(R.id.kuq);
            SurfaceHolder holder = ((SurfaceView) _$_findCachedViewById(R.id.kuq)).getHolder();
            o.LJIIIIZZ(holder, "surface_view.holder");
            y59.surfaceDestroyed(holder);
            C39187FZn c39187FZn = C39188FZo.LIZ;
            SensorManager sensorManager = this.LJLL;
            if (sensorManager != null) {
                C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476415490, "bpea-live_anchor_cover_focus");
                c39187FZn.getClass();
                C39187FZn.LIZLLL(sensorManager, this, LJJIIJ);
            } else {
                o.LJIJI("sensorManager");
                throw null;
            }
        } else {
            Y59 y592 = (Y59) _$_findCachedViewById(R.id.kuq);
            SurfaceHolder holder2 = ((SurfaceView) _$_findCachedViewById(R.id.kuq)).getHolder();
            o.LJIIIIZZ(holder2, "surface_view.holder");
            y592.surfaceChanged(holder2, 1, 0, 0);
            C39187FZn c39187FZn2 = C39188FZo.LIZ;
            SensorManager sensorManager2 = this.LJLL;
            if (sensorManager2 != null) {
                Sensor sensor = this.LJLLI;
                C78862UxG LJJIIJ2 = C78857UxB.LJJIIJ(1476415490, "bpea-live_anchor_cover_focus");
                c39187FZn2.getClass();
                C39187FZn.LIZJ(sensorManager2, this, sensor, 3, LJJIIJ2);
                this.LJLJJLL = false;
            } else {
                o.LJIJI("sensorManager");
                throw null;
            }
        }
        super.onHiddenChanged(z);
        c03880Dg.LIZIZ(10501, "com/bytedance/android/livesdk/broadcast/preview/LiveCoverCameraFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor;
        String str;
        Y58 y58 = this.LJLJJI;
        if (y58 != null) {
            synchronized (Integer.valueOf(y58.LIZLLL)) {
                Y58 y582 = this.LJLJJI;
                if (y582 != null) {
                    if (y582.LJ && sensorEvent != null && (sensor = sensorEvent.sensor) != null && sensor.getType() == 1) {
                        Y58 y583 = this.LJLJJI;
                        if (y583 != null) {
                            Camera.Parameters LIZIZ = y583.LIZIZ();
                            if (LIZIZ != null) {
                                str = LIZIZ.getFocusMode();
                            } else {
                                str = null;
                            }
                            if (o.LJ(str, "continuous-picture")) {
                                return;
                            }
                            double d = ((int) sensorEvent.values[0]) / 9.80665f;
                            double d2 = ((int) r3[1]) / 9.80665f;
                            double d3 = ((int) r3[2]) / 9.80665f;
                            double sqrt = Math.sqrt((d3 * d3) + (d2 * d2) + (d * d));
                            double d4 = this.LJLLILLLL;
                            this.LJLLILLLL = sqrt;
                            double d5 = (this.LJLLJ * 0.9f) + (sqrt - d4);
                            this.LJLLJ = d5;
                            if (d5 > 0.03d) {
                                Y58 y584 = this.LJLJJI;
                                if (y584 != null) {
                                    Camera.Parameters LIZIZ2 = y584.LIZIZ();
                                    if (LIZIZ2 != null) {
                                        LIZIZ2.setFocusMode("continuous-picture");
                                    }
                                    Y58 y585 = this.LJLJJI;
                                    if (y585 != null) {
                                        y585.LJ(LIZIZ2);
                                    } else {
                                        o.LJIJI("cameraProxy");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("cameraProxy");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("cameraProxy");
                            throw null;
                        }
                    }
                    return;
                }
                o.LJIJI("cameraProxy");
                throw null;
            }
        }
        o.LJIJI("cameraProxy");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Uri uri;
        boolean z;
        Sensor defaultSensor;
        Intent intent;
        Intent intent2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C29306Beo.LJJLIIIJILLIZJL(C15450j7.LIZ(getContext()), _$_findCachedViewById(R.id.kek));
        ActivityC45651qj mo49getActivity = mo49getActivity();
        Object obj = null;
        if (mo49getActivity != null && (intent2 = mo49getActivity.getIntent()) != null) {
            uri = (Uri) intent2.getParcelableExtra("photoUri");
        } else {
            uri = null;
        }
        this.LJLIL = uri;
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null && (intent = mo49getActivity2.getIntent()) != null && intent.getBooleanExtra("isFromLiveCover", false)) {
            z = true;
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
        ViewModelProvider of = ViewModelProviders.of(this);
        o.LJIIIIZZ(of, "of(this)");
        this.LJLJI = BHA.LIZ(of, this);
        Context context = getContext();
        if (context != null) {
            DataChannel dataChannel = this.LJLJI;
            if (dataChannel != null) {
                this.LJLJJI = new Y58(context, dataChannel, this.LJLILLLLZI);
                Y59 y59 = (Y59) _$_findCachedViewById(R.id.kuq);
                DataChannel dataChannel2 = this.LJLJI;
                if (dataChannel2 != null) {
                    y59.getClass();
                    y59.LJLILLLLZI = dataChannel2;
                    dataChannel2.lv0(this, LiveCoverCameraTypeChannel.class, new AqS181S0100000_15(y59, 9));
                    dataChannel2.lv0(this, LiveCoverCameraRetryEvent.class, new AqS181S0100000_15(y59, 10));
                    Y58 y58 = this.LJLJJI;
                    if (y58 != null) {
                        y59.setCameraProxy(y58);
                        SurfaceHolder holder = y59.getHolder();
                        if (holder != null) {
                            holder.addCallback((Y59) _$_findCachedViewById(R.id.kuq));
                        }
                        y59.setCheckFragVisibleCallback(new AqS165S0100000_15(this, 929));
                        DataChannel dataChannel3 = this.LJLJI;
                        if (dataChannel3 != null) {
                            dataChannel3.lv0(this, LiveCoverFlashModeChannel.class, new AqS181S0100000_15(this, 299));
                            dataChannel3.lv0(this, LiveCoverIsFlashSupportedChannel.class, new AqS181S0100000_15(this, 300));
                            dataChannel3.lv0(this, LiveCoverManualFocusEvent.class, new AqS178S0100000_12(this, 729));
                            C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.b3r), new ACListenerS32S0100000_12(this, 207));
                            _$_findCachedViewById(R.id.l0v).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS35S0100000_15(this, 289)));
                            View camera_flip_layout = _$_findCachedViewById(R.id.b37);
                            o.LJIIIIZZ(camera_flip_layout, "camera_flip_layout");
                            C16880lQ.LJIIJ(new IDaS491S0100000_15(this, 6), camera_flip_layout);
                            C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.b35), new ACListenerS35S0100000_15(this, BuildConfig.VERSION_CODE));
                            ActivityC45651qj mo49getActivity3 = mo49getActivity();
                            if (mo49getActivity3 != null) {
                                obj = C16880lQ.LLILLJJLI(mo49getActivity3, "sensor");
                            }
                            o.LJII(obj, "null cannot be cast to non-null type android.hardware.SensorManager");
                            SensorManager sensorManager = (SensorManager) obj;
                            this.LJLL = sensorManager;
                            C03880Dg c03880Dg = new C03880Dg(2);
                            Object[] objArr = {1};
                            C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "6640974686428236120");
                            C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
                            if (LIZJ.LIZ) {
                                c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
                                defaultSensor = (Sensor) LIZJ.LIZIZ;
                            } else {
                                defaultSensor = sensorManager.getDefaultSensor(1);
                                c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
                            }
                            this.LJLLI = defaultSensor;
                            return;
                        }
                        o.LJIJI("dataChannel");
                        throw null;
                    }
                    o.LJIJI("cameraProxy");
                    throw null;
                }
                o.LJIJI("dataChannel");
                throw null;
            }
            o.LJIJI("dataChannel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LJI = C20910rv.LJI(R.layout.d3m, viewGroup, false, 12);
        try {
            ViewTreeLifecycleOwner.set(LJI, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LJI, this);
            C10A.LIZIZ(LJI, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LJI;
    }
}
