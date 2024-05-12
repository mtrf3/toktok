package com.bytedance.android.live.effect.panel;

import X.C10A;
import X.C12890ez;
import X.C15380j0;
import X.C16880lQ;
import X.C1VL;
import X.C28507BGt;
import X.C29602Bja;
import X.C32011Nl;
import X.C32021Nm;
import X.C78983UzD;
import X.EnumC29596BjU;
import X.InterfaceC08010Td;
import X.InterfaceC30442Bx8;
import X.SJC;
import Y.IDTListenerS110S0100000;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.effect.OnFilterSelectedByClickEvent;
import com.bytedance.android.live.effect.api.EffectRedDotStatusChangeEvent;
import com.bytedance.android.live.effect.panel.LiveEffectNewDialogFragmentOpt;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LiveEffectNewDialogFragmentOpt extends LiveDialogFragment implements View.OnLayoutChangeListener {
    public InterfaceC08010Td LJLIL;
    public FrameLayout LJLILLLLZI;
    public long LJLJI;
    public VelocityTracker LJLJJI;
    public GestureDetector LJLJJL;
    public final float LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    public LiveEffectNewDialogFragmentOpt() {
        int LJIIL;
        if (C15380j0.LJIIZILJ()) {
            LJIIL = -C15380j0.LJIIL();
        } else {
            LJIIL = C15380j0.LJIIL();
        }
        this.LJLJJLL = LJIIL;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.ddy);
        C78983UzD.LJIILIIL(c28507BGt);
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        FrameLayout frameLayout;
        View view;
        super.onDestroyView();
        InterfaceC08010Td interfaceC08010Td = this.LJLIL;
        if (interfaceC08010Td != null) {
            interfaceC08010Td.LIZ();
        }
        View view2 = getView();
        if (view2 != null && (frameLayout = (FrameLayout) view2.findViewById(R.id.crm)) != null) {
            InterfaceC08010Td interfaceC08010Td2 = this.LJLIL;
            if (interfaceC08010Td2 != null) {
                view = interfaceC08010Td2.getView();
            } else {
                view = null;
            }
            C16880lQ.LJLLLL(view, frameLayout);
        }
        this.LJLIL = null;
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C78983UzD.LJJLIIIJJIZ(this);
        InterfaceC08010Td interfaceC08010Td = this.LJLIL;
        if (interfaceC08010Td != null) {
            interfaceC08010Td.onDialogForeground();
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        InterfaceC08010Td interfaceC08010Td = this.LJLIL;
        if (interfaceC08010Td != null) {
            interfaceC08010Td.onDialogBackground();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        C12890ez.LIZ().LJJIFFI();
        if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
            C1VL.LJIIL = false;
        }
        InterfaceC08010Td interfaceC08010Td = this.LJLIL;
        if (interfaceC08010Td != null) {
            interfaceC08010Td.LIZ();
        }
        VelocityTracker velocityTracker = this.LJLJJI;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        VelocityTracker velocityTracker2 = this.LJLJJI;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
        }
        this.LJLJJI = null;
        super.onDismiss(dialog);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(LiveDialogStatusChannel.class, new C29602Bja(false, 0, hashCode(), EnumC29596BjU.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
        }
        DataChannel dataChannel2 = this.dataChannel;
        InterfaceC30442Bx8.A.LIZ(Boolean.FALSE);
        if (dataChannel2 != null) {
            dataChannel2.pv0(EffectRedDotStatusChangeEvent.class);
        }
        C32011Nl c32011Nl = C32011Nl.LIZ;
        c32011Nl.LIZLLL(false);
        C32011Nl.LJIIIZ(SystemClock.uptimeMillis() - this.LJLJI, this.dataChannel);
        C32011Nl.LJIIJJI();
        c32011Nl.LJFF(this.dataChannel, false);
        c32011Nl.LIZ(this.dataChannel, false);
        c32011Nl.LIZJ(this.dataChannel);
        C32011Nl.LJIIIIZZ(this.dataChannel);
        c32011Nl.LJ();
        C32021Nm c32021Nm = C32021Nm.LIZ;
        c32021Nm.LIZJ("LiveBeautyFilterDialogFragmentOpt#onDismiss", false);
        C32021Nm.LJIIIZ();
        c32021Nm.LJI(this.dataChannel, "LiveBeautyFilterDialogFragmentOpt#onDismiss", false, this.LJLJL);
        C32021Nm.LJFF(this.dataChannel, "LiveBeautyFilterDialogFragmentOpt#onDismiss", false, this.LJLJL);
        C32021Nm.LJIIIIZZ(this.dataChannel, "LiveBeautyFilterDialogFragmentOpt#onDismiss");
        C32021Nm.LJ(this.dataChannel);
        C32021Nm.LIZ("LiveBeautyFilterDialogFragmentOpt#onDismiss");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJI = SystemClock.uptimeMillis();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, OnFilterSelectedByClickEvent.class, new IDqS416S0100000(this, 77));
        }
        this.LJLILLLLZI = (FrameLayout) view.findViewById(R.id.cc0);
        InterfaceC08010Td interfaceC08010Td = this.LJLIL;
        if (interfaceC08010Td == null || (view2 = interfaceC08010Td.getView()) == null || view2.getParent() != null) {
            dismiss();
        } else {
            ((ViewGroup) view.findViewById(R.id.crm)).addView(view2);
        }
        this.LJLJJL = new GestureDetector(getContext(), new SJC() { // from class: X.1ae
            @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
                    C1VL.LIZ.LIZIZ(LiveEffectNewDialogFragmentOpt.this.dataChannel, true);
                    C1VL.LJIIL = true;
                }
                return super.onDown(motionEvent);
            }

            @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                LiveEffectNewDialogFragmentOpt.this.dismiss();
                return true;
            }

            @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                boolean z;
                int i;
                if (motionEvent2 == null || motionEvent == null) {
                    return false;
                }
                float x = motionEvent2.getX() - motionEvent.getX();
                if (Math.abs(motionEvent.getRawX() - motionEvent2.getRawX()) > Math.abs(motionEvent.getRawY() - motionEvent2.getRawY())) {
                    z = true;
                } else {
                    z = false;
                }
                LiveComposerFilterSetting liveComposerFilterSetting = LiveComposerFilterSetting.INSTANCE;
                if (!liveComposerFilterSetting.isComposerSupported() && !C29306Beo.LJJI() && Math.abs(x) > 200.0f && Math.abs(f) > 100.0f) {
                    C73943T0h LIZ = C73943T0h.LIZ();
                    if (x > 0.0f) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    LIZ.LIZIZ(new C11040c0(i));
                    return true;
                }
                if (!liveComposerFilterSetting.isComposerSupported() || !z) {
                    return false;
                }
                C1VL.LIZ.LJII(null);
                return true;
            }

            @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                float abs;
                boolean z;
                if (!LiveComposerFilterSetting.INSTANCE.isComposerSupported() || motionEvent2 == null || motionEvent == null) {
                    return false;
                }
                float rawX = motionEvent.getRawX();
                C1VL c1vl = C1VL.LIZ;
                if (C1VL.LJ) {
                    if (motionEvent2.getRawX() - rawX > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1VL.LJFF = z;
                    c1vl.LIZIZ(LiveEffectNewDialogFragmentOpt.this.dataChannel, false);
                    c1vl.LJIIIIZZ();
                }
                if (C1VL.LJFF) {
                    abs = Math.abs(Math.max(motionEvent2.getRawX() - motionEvent.getRawX(), 0.0f) / LiveEffectNewDialogFragmentOpt.this.LJLJJLL);
                } else {
                    abs = 1 - Math.abs(Math.min(motionEvent2.getRawX() - motionEvent.getRawX(), 0.0f) / LiveEffectNewDialogFragmentOpt.this.LJLJJLL);
                }
                c1vl.LIZLLL(abs);
                return true;
            }
        });
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(new IDTListenerS110S0100000(this, 7));
        }
        InterfaceC08010Td interfaceC08010Td2 = this.LJLIL;
        if (interfaceC08010Td2 != null) {
            interfaceC08010Td2.LIZIZ(this);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        View view2 = getView();
        if (view2 != null && this.LJLJLJ != (height = view2.getHeight() - _$_findCachedViewById(R.id.cc0).getHeight())) {
            this.LJLJLJ = height;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(LiveDialogStatusChannel.class, new C29602Bja(true, height, hashCode(), EnumC29596BjU.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
            }
        }
    }
}
