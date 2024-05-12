package X;

import Y.ACListenerS21S0100000_1;
import Y.IDCSpanS0S0200000_1;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3zQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102003zQ extends RelativeLayout implements C3PY, C3WY {
    public final /* synthetic */ C3WQ LJLIL;
    public C73318Sq2 LJLILLLLZI;
    public final boolean LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public EnumC101413yT LJLJL;
    public InterfaceC65784Pro<C76800UCe> LJLJLJ;

    public final void LIZIZ() {
        this.LJLIL.LIZ();
    }

    @Override // X.C3WY
    public final void LLIIJLIL(C3WR l) {
        o.LJIIIZ(l, "l");
        this.LJLIL.LLIIJLIL(l);
    }

    @Override // X.C3WY
    public final void LLJILLL(C3WR c3wr) {
        this.LJLIL.LLJILLL(c3wr);
    }

    private final View getIvClose() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-ivClose>(...)");
        return (View) value;
    }

    private final int getLayoutRes() {
        if (this.LJLJI) {
            return R.layout.b18;
        }
        return R.layout.b17;
    }

    private final SY4 getTbButton() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-tbButton>(...)");
        return (SY4) value;
    }

    private final TuxTextView getTvContent() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-tvContent>(...)");
        return (TuxTextView) value;
    }

    private final View getParentView() {
        Object parent = getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    public final void dismiss() {
        View parentView = getParentView();
        if (parentView != null) {
            parentView.setVisibility(8);
        }
        LIZIZ();
    }

    @Override // X.C3PY
    public final void onDestroy() {
        C3PX.onDestroy(this);
        this.LJLILLLLZI.LIZLLL();
    }

    public final InterfaceC65784Pro<C76800UCe> getOnDismissEventListener() {
        return this.LJLJLJ;
    }

    public final EnumC101413yT getStyle() {
        return this.LJLJL;
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
    public C102003zQ(Context context) {
        super(context, null, 0);
        Lifecycle lifecycle;
        new LinkedHashMap();
        this.LJLIL = new C3WQ();
        this.LJLILLLLZI = new C73318Sq2();
        this.LJLJI = C110594Vr.LIZ();
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 967));
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 969));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 968));
        C16880lQ.LLLZIIL(getLayoutRes(), C16880lQ.LLZIL(context), this);
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (lifecycle = LJJIFFI.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 210), getIvClose());
        getTvContent().setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void setText(EnumC101413yT enumC101413yT) {
        String LIZIZ;
        String string = getContext().getString(R.string.rld);
        o.LJIIIIZZ(string, "context.getString(R.stri…tus_label_banner_txt_btn)");
        int i = C101423yU.LIZ[enumC101413yT.ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            String string2 = getContext().getString(R.string.rlc);
            o.LJIIIIZZ(string2, "context.getString(R.string.status_label_18_banner)");
            LIZIZ = Q8U.LIZIZ(new Object[]{string}, 1, string2, "format(format, *args)");
        } else {
            String string3 = getContext().getString(R.string.rlv);
            o.LJIIIIZZ(string3, "context.getString(R.stri….status_label_u18_banner)");
            LIZIZ = Q8U.LIZIZ(new Object[]{string}, 1, string3, "format(format, *args)");
        }
        int LJJLIIIJL = s.LJJLIIIJL(LIZIZ, string, 0, false, 6);
        int length = string.length() + LJJLIIIJL;
        SpannableString spannableString = new SpannableString(LIZIZ);
        if (LJJLIIIJL > 0 && length > 0) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.go, context);
            if (LJI != null) {
                i2 = LJI.intValue();
            }
            spannableString.setSpan(new ForegroundColorSpan(i2), LJJLIIIJL, length, 33);
            spannableString.setSpan(new IDCSpanS0S0200000_1(this, enumC101413yT, 2), LJJLIIIJL, length, 33);
        }
        getTvContent().setText(spannableString);
    }

    public final void LIZ(boolean z) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJLJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C32151Nz.LJJIJIIJIL(z);
    }

    public final void setOnDismissEventListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJLJ = interfaceC65784Pro;
    }

    public final void setStyle(EnumC101413yT enumC101413yT) {
        this.LJLJL = enumC101413yT;
        if (enumC101413yT == null) {
            return;
        }
        int i = C101423yU.LIZ[enumC101413yT.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            getTbButton().setVisibility(8);
            setText(enumC101413yT);
            return;
        }
        SY4 tbButton = getTbButton();
        tbButton.setVisibility(0);
        C16880lQ.LJJIZ(tbButton, new ACListenerS21S0100000_1(this, 69));
        setText(enumC101413yT);
    }
}
