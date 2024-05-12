package X;

import Y.ACListenerS21S0100000_1;
import Y.ACListenerS36S0200000_1;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;
import yq4.a;

/* renamed from: X.3k2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92463k2 extends LinearLayout implements C3PY {
    public static final /* synthetic */ int LJLJI = 0;
    public C73318Sq2 LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLILLLLZI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZIZ() {
        AbstractC73430Srq LIZ;
        if (this.LJLIL.LJFF() > 0) {
            this.LJLIL.LIZLLL();
            this.LJLIL = new C73318Sq2();
        }
        InterfaceC101453yX LJFF = a.LJIILIIL().LJFF();
        if (LJFF != null && (LIZ = LJFF.LIZ(4)) != null) {
            C78999UzT.LJFF(LIZ.LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.3jy
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    Keva LJFF2 = C92353jr.LIZ.LJFF();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("key_dm_maf_setting");
                    LIZ2.append(C92353jr.LIZJ());
                    LJFF2.storeBoolean(X1D.LIZIZ(LIZ2), true);
                }
            }, new InterfaceC64592gB() { // from class: X.3k3
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }), this.LJLIL);
        }
    }

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
    public C92463k2(Context context) {
        super(context, null, 0);
        boolean z;
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        this.LJLILLLLZI = C62850Ola.LJFF(context, "context");
        this.LJLIL = new C73318Sq2();
        setOrientation(1);
        setGravity(1);
        if (((Number) C92493k5.LIZ.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C16880lQ.LLLZIIL(R.layout.b0z, C16880lQ.LLZIL(getContext()), this);
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
            if (LJJIFFI != null && (lifecycle2 = LJJIFFI.getLifecycle()) != null) {
                lifecycle2.addObserver(this);
            }
            C33381Ss c33381Ss = new C33381Ss();
            c33381Ss.LJLIL = R.drawable.b_4;
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            ((ImageView) findViewById(R.id.ef1)).setImageDrawable(c33381Ss.LIZ(context3));
            C16880lQ.LJJJ((TuxIconView) findViewById(R.id.f0h), new ACListenerS21S0100000_1(this, 285));
            C16880lQ.LJJJ((TuxIconView) findViewById(R.id.f71), new ACListenerS21S0100000_1(this, 286));
            ARV arv = (ARV) findViewById(R.id.kt9);
            SY4 sy4 = (SY4) findViewById(R.id.i4c);
            if (C99W.LIZ) {
                sy4.getClass();
            }
            C16880lQ.LJJIZ(sy4, new ACListenerS36S0200000_1(this, arv, 99));
            return;
        }
        C16880lQ.LLLZIIL(R.layout.b0y, C16880lQ.LLZIL(getContext()), this);
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(context4);
        if (LJJIFFI2 != null && (lifecycle = LJJIFFI2.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        C33381Ss c33381Ss2 = new C33381Ss();
        c33381Ss2.LJLIL = R.drawable.bam;
        Context context5 = getContext();
        o.LJIIIIZZ(context5, "context");
        ((ImageView) LIZ(R.id.ef1)).setImageDrawable(c33381Ss2.LIZ(context5));
        C16880lQ.LJJJ((TuxIconView) LIZ(R.id.f0h), new ACListenerS21S0100000_1(this, 281));
        C16880lQ.LJJJ((TuxIconView) LIZ(R.id.f71), new ACListenerS21S0100000_1(this, 282));
        ((TextView) LIZ(R.id.an4)).setText(getContext().getString(R.string.eod));
        String string = getContext().getString(R.string.eof);
        o.LJIIIIZZ(string, "context.getString(R.stri…_intro_body2_placeholder)");
        String string2 = getContext().getString(R.string.eoe);
        o.LJIIIIZZ(string2, "context.getString(R.string.dm_maf_intro_body2)");
        String LIZIZ = Q8U.LIZIZ(new Object[]{string}, 1, string2, "format(format, *args)");
        SpannableString spannableString = new SpannableString(LIZIZ);
        int LJJLIIIJL = s.LJJLIIIJL(LIZIZ, string, 0, false, 6);
        int length = string.length() + LJJLIIIJL;
        if (LJJLIIIJL >= 0 && length >= 0) {
            spannableString.setSpan(new T5U(42, false), LJJLIIIJL, length, 33);
            Context context6 = getContext();
            o.LJIIIIZZ(context6, "context");
            Integer LJI = C79045V0n.LJI(R.attr.go, context6);
            spannableString.setSpan(new ForegroundColorSpan(LJI != null ? LJI.intValue() : 0), LJJLIIIJL, length, 33);
        }
        ((TextView) LIZ(R.id.an7)).setText(spannableString);
        ((TextView) LIZ(R.id.an7)).setMovementMethod(LinkMovementMethod.getInstance());
        C16880lQ.LJJIZ((SY4) LIZ(R.id.i4c), new ACListenerS21S0100000_1(this, 283));
        C16880lQ.LJJIZ((SY4) LIZ(R.id.jjo), new ACListenerS21S0100000_1(this, 284));
        if (!C99W.LIZ) {
            return;
        }
        LIZ(R.id.i4c).getClass();
        LIZ(R.id.jjo).getClass();
        ((SY4) LIZ(R.id.jjo)).setButtonVariant(5);
    }
}
