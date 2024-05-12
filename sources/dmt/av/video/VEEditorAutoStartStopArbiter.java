package dmt.av.video;

import X.AnonymousClass028;
import X.C16880lQ;
import X.C5NP;
import X.C82891Wg3;
import X.InterfaceC145625na;
import X.InterfaceC145645nc;
import X.InterfaceC145655nd;
import X.InterfaceC153045zY;
import X.X1D;
import Y.IDBReceiverS7S0100000_7;
import android.content.Context;
import android.content.IntentFilter;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEException;
import dmt.av.video.VEEditorAutoStartStopArbiter;

/* loaded from: classes3.dex */
public final class VEEditorAutoStartStopArbiter implements GenericLifecycleObserver {
    public final Context LJLIL;
    public IDBReceiverS7S0100000_7 LJLILLLLZI;
    public final InterfaceC153045zY LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public InterfaceC145625na LJLLILLLL;
    public boolean LJLLI = true;
    public VEEditor.VEState LJLLJ = VEEditor.VEState.STARTED;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    public final void LIZ() {
        InterfaceC145625na interfaceC145625na = this.LJLLILLLL;
        if (interfaceC145625na != null && interfaceC145625na.LJJJIL()) {
            return;
        }
        VEEditor.VEState vEState = VEEditor.VEState.STARTED;
        this.LJLLJ = vEState;
        if (!this.LJLJJI) {
            try {
                if (this.LJLJI.getState() != vEState) {
                    this.LJLJI.play();
                }
                Object obj = this.LJLIL;
                if (obj instanceof InterfaceC145645nc) {
                    ((InterfaceC145645nc) obj).LIZ();
                }
            } catch (Exception e) {
                C82891Wg3.LIZLLL().LIZ(e.toString());
            }
        }
    }

    public final void LIZIZ() {
        InterfaceC145625na interfaceC145625na = this.LJLLILLLL;
        if ((interfaceC145625na == null || !interfaceC145625na.LIZJ()) && !this.LJLJJI) {
            try {
                if (this.LJLJI.getState() != VEEditor.VEState.PAUSED) {
                    this.LJLJI.pause();
                }
                Object obj = this.LJLIL;
                if (obj instanceof InterfaceC145645nc) {
                    ((InterfaceC145645nc) obj).LIZIZ();
                }
            } catch (VEException e) {
                if (e.getRetCd() == -105) {
                } else {
                    throw e;
                }
            }
        }
    }

    public final void LIZLLL() {
        if (!this.LJLJJL && !this.LJLJJLL) {
            VEEditor.VEState vEState = this.LJLLJ;
            if ((vEState != VEEditor.VEState.PAUSED && vEState != VEEditor.VEState.COMPLETED && vEState != VEEditor.VEState.SEEKING) || this.LJLJL) {
                LIZ();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (this.LJLILLLLZI != null) {
            try {
                C5NP LIZLLL = C82891Wg3.LIZLLL();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unregister Receiver ");
                LIZ.append(this.LJLIL);
                LIZ.append(" ");
                LIZ.append(this.LJLILLLLZI);
                LIZLLL.i(X1D.LIZIZ(LIZ));
                C16880lQ.LJJLIIIJL(this.LJLIL, this.LJLILLLLZI);
                this.LJLILLLLZI = null;
            } catch (Exception e) {
                C82891Wg3.LIZLLL().LIZ(e.toString());
            }
        } else {
            C82891Wg3.LIZLLL().LIZ("Receiver not registered");
        }
        this.LJLLI = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        this.LJLLJ = this.LJLJI.getState();
        if (!this.LJLJJL && !this.LJLJLJ && !this.LJLL) {
            LIZIZ();
        }
        this.LJLLI = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (this.LJLJLLL) {
            LIZLLL();
        }
        this.LJLLI = true;
    }

    public final void LIZJ(boolean z, boolean z2) {
        boolean z3 = this.LJLJJI;
        if (z3 != z) {
            if (z3) {
                if (!z2) {
                    this.LJLJI.play();
                }
                Object obj = this.LJLIL;
                if (obj instanceof InterfaceC145655nd) {
                    ((InterfaceC145655nd) obj).LJLIIIL();
                }
            } else {
                this.LJLJI.pause();
            }
            this.LJLJJI = z;
        }
    }

    public VEEditorAutoStartStopArbiter(Context context, final LifecycleOwner lifecycleOwner, InterfaceC153045zY interfaceC153045zY, SurfaceView surfaceView, boolean z) {
        this.LJLJL = z;
        this.LJLIL = context;
        this.LJLJI = interfaceC153045zY;
        IntentFilter LIZ = AnonymousClass028.LIZ("android.intent.action.SCREEN_OFF");
        this.LJLILLLLZI = new IDBReceiverS7S0100000_7(this, 0);
        Object parent = surfaceView.getParent();
        if (parent != null) {
            ((View) parent).getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.5UM
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z2) {
                    if (z2 && lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                        VEEditorAutoStartStopArbiter.this.getClass();
                        VEEditorAutoStartStopArbiter.this.getClass();
                        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = VEEditorAutoStartStopArbiter.this;
                        VEEditor.VEState vEState = vEEditorAutoStartStopArbiter.LJLLJ;
                        if ((vEState != VEEditor.VEState.PAUSED && vEState != VEEditor.VEState.COMPLETED && vEState != VEEditor.VEState.SEEKING) || vEEditorAutoStartStopArbiter.LJLJL) {
                            InterfaceC145625na interfaceC145625na = vEEditorAutoStartStopArbiter.LJLLILLLL;
                            if (interfaceC145625na != null && interfaceC145625na.LJJIJ()) {
                                return;
                            }
                            VEEditorAutoStartStopArbiter.this.LIZ();
                        }
                    }
                }
            });
        }
        C16880lQ.LJJLIIIJILLIZJL(this.LJLILLLLZI, context, LIZ);
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Register Receiver ");
        LIZ2.append(context);
        LIZ2.append(" ");
        LIZ2.append(this.LJLILLLLZI);
        LIZLLL.i(X1D.LIZIZ(LIZ2));
        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback2() { // from class: X.5nb
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback2
            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
            }
        });
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
