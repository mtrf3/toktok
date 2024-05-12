package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.ui.CountDownTimer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.XkU, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85714XkU extends TuxTextView implements InterfaceC85737Xkr {
    public InterfaceC85737Xkr LJLLLL;
    public CountDownTimer LJLLLLLL;
    public long LJLZ;
    public long LJZ;
    public String LJZI;
    public final java.util.Map<Integer, View> LJZL;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJZL;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC85737Xkr
    public final void LIZ() {
        InterfaceC85737Xkr interfaceC85737Xkr = this.LJLLLL;
        if (interfaceC85737Xkr != null) {
            interfaceC85737Xkr.LIZ();
        }
    }

    public final CountDownTimer LJJJIL() {
        if (this.LJLLLLLL == null) {
            this.LJLLLLLL = new CountDownTimer(this.LJLZ, this.LJZ, this);
        }
        CountDownTimer countDownTimer = this.LJLLLLLL;
        o.LJI(countDownTimer);
        countDownTimer.start();
        CountDownTimer countDownTimer2 = this.LJLLLLLL;
        o.LJI(countDownTimer2);
        return countDownTimer2;
    }

    @Override // X.InterfaceC85737Xkr
    public final void onStart() {
        InterfaceC85737Xkr interfaceC85737Xkr = this.LJLLLL;
        if (interfaceC85737Xkr != null) {
            interfaceC85737Xkr.onStart();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CountDownTimer countDownTimer = this.LJLLLLLL;
        if (countDownTimer != null) {
            countDownTimer.setCountDownTimerListener(null);
        }
        this.LJLLLL = null;
    }

    @Override // X.InterfaceC85737Xkr
    public final void LJIILIIL(long j) {
        String str = this.LJZI;
        o.LJI(str);
        setText(String.valueOf(j / 1000) + str);
        InterfaceC85737Xkr interfaceC85737Xkr = this.LJLLLL;
        if (interfaceC85737Xkr != null) {
            interfaceC85737Xkr.LJIILIIL(j);
        }
    }

    public final void LJJJJ(CountDownTimer countDownTimer) {
        this.LJLLLLLL = countDownTimer;
        if (countDownTimer.isRunning()) {
            onStart();
            countDownTimer.setCountDownTimerListener(this);
        } else {
            countDownTimer.start();
        }
    }

    public final void setCallback(InterfaceC85737Xkr listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLLL = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85714XkU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ku);
        this.LJZL = C62850Ola.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aak, R.attr.bfm});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr….styleable.TimerTextView)");
        this.LJLZ = obtainStyledAttributes.getInteger(0, 60000);
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 1);
        this.LJZI = LLLZLZ == null ? "" : LLLZLZ;
        obtainStyledAttributes.recycle();
        this.LJZ = 1000L;
    }
}
