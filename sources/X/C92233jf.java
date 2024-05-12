package X;

import Y.ACListenerS21S0100000_1;
import Y.ACListenerS36S0200000_1;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.3jf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92233jf extends LinearLayout implements C3PY {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public C73318Sq2 LJLIL;

    @Override // X.C3PY
    public final void onDestroy() {
        C3PX.onDestroy(this);
        this.LJLIL.LIZLLL();
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C3PX.onCreate(this);
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C3PX.onPause(this);
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C3PX.onResume(this);
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C3PX.onStart(this);
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C3PX.onStop(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92233jf(Context context) {
        super(context, null, 0);
        Lifecycle lifecycle;
        a1.LJFF(context, "context");
        this.LJLIL = new C73318Sq2();
        setOrientation(1);
        setGravity(1);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.b0x, C16880lQ.LLZIL(getContext()), this);
        C16880lQ.LJJJ((TuxIconView) LLLZIIL.findViewById(R.id.f0h), new ACListenerS21S0100000_1(this, 219));
        C33381Ss c33381Ss = new C33381Ss();
        c33381Ss.LJLIL = R.drawable.b_4;
        Context context2 = LLLZIIL.getContext();
        o.LJIIIIZZ(context2, "context");
        ((ImageView) LLLZIIL.findViewById(R.id.f05)).setImageDrawable(c33381Ss.LIZ(context2));
        C16880lQ.LJJJ((TuxIconView) LLLZIIL.findViewById(R.id.f71), new ACListenerS21S0100000_1(LLLZIIL, 220));
        ARV arv = (ARV) LLLZIIL.findViewById(R.id.d0n);
        SY4 sy4 = (SY4) LLLZIIL.findViewById(R.id.i4c);
        if (C99W.LIZ) {
            sy4.getClass();
        }
        C16880lQ.LJJIZ(sy4, new ACListenerS36S0200000_1(this, arv, 58));
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context3);
        if (LJJIFFI != null && (lifecycle = LJJIFFI.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }
}
