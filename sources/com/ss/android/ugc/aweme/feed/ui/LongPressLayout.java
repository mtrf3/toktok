package com.ss.android.ugc.aweme.feed.ui;

import X.C2PI;
import X.C2QB;
import X.C36922EeM;
import X.C38816FLg;
import X.C92D;
import X.InterfaceC222528oK;
import X.InterfaceC86322XuI;
import X.OM3;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS32S0101000_15;
import Y.ACListenerS49S0200000_15;
import Y.ACListenerS55S0000000_15;
import Y.ARunnableS51S0100000_15;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class LongPressLayout extends View {
    public static final /* synthetic */ int LJZ = 0;
    public float LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public final int LJLJJL;
    public int LJLJJLL;
    public C92D LJLJL;
    public View.OnTouchListener LJLJLJ;
    public OM3 LJLJLLL;
    public InterfaceC86322XuI LJLL;
    public InterfaceC222528oK LJLLI;
    public long LJLLILLLL;
    public View.OnClickListener LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public final ARunnableS51S0100000_15 LJLZ;

    public LongPressLayout() {
        throw null;
    }

    public void setInLongPressMode(boolean z) {
    }

    public void setScrollMode(boolean z) {
    }

    public final boolean LIZ() {
        OM3 om3 = this.LJLJLLL;
        if (om3 != null && om3.LIZIZ()) {
            return true;
        }
        return false;
    }

    public int getTimeInterval() {
        return this.LJLJJLL;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!isEnabled()) {
            C2PI.LIZ("LongPressLayout isNotEnable");
            return false;
        }
        this.LJLLL = true;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            C38816FLg.LIZ(this.LJLZ);
                            View.OnTouchListener onTouchListener = this.LJLJLJ;
                            if (onTouchListener != null) {
                                onTouchListener.onTouch(this, motionEvent);
                            }
                        }
                    }
                } else {
                    this.LJLJI = motionEvent.getX();
                    this.LJLJJI = motionEvent.getY();
                    float abs = Math.abs(this.LJLIL - this.LJLJI);
                    float abs2 = Math.abs(this.LJLILLLLZI - this.LJLJJI);
                    float f = this.LJLJJL;
                    if (abs > f || abs2 > f) {
                        C38816FLg.LIZ(this.LJLZ);
                    }
                    View.OnTouchListener onTouchListener2 = this.LJLJLJ;
                    if (onTouchListener2 != null) {
                        onTouchListener2.onTouch(this, motionEvent);
                    }
                }
            }
            C38816FLg.LIZ(this.LJLZ);
            if (SystemClock.elapsedRealtime() - this.LJLLILLLL < this.LJLJJLL && this.LJLJLJ != null && !LIZ()) {
                this.LJLJLJ.onTouch(this, motionEvent);
            }
            InterfaceC86322XuI interfaceC86322XuI = this.LJLL;
            if (interfaceC86322XuI != null && this.LJLLLL) {
                interfaceC86322XuI.X2();
            }
            this.LJLLLL = false;
        } else {
            this.LJLIL = motionEvent.getX();
            this.LJLILLLLZI = motionEvent.getY();
            this.LJLLILLLL = SystemClock.elapsedRealtime();
            if (!LIZ()) {
                C38816FLg.LIZLLL(this.LJLZ, this.LJLJJLL);
            }
            if (this.LJLJLJ != null && !LIZ()) {
                this.LJLJLJ.onTouch(this, motionEvent);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mTapListener do not onTouch ");
                if (this.LJLJLJ != null) {
                    z = true;
                }
                LIZ.append(z);
                C2PI.LIZ(X1D.LIZIZ(LIZ));
            }
        }
        OM3 om3 = this.LJLJLLL;
        if (om3 != null) {
            om3.LIZJ(motionEvent);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setEnableSimulateClick(boolean z) {
        this.LJLLLLLL = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (!z && ((Boolean) C2QB.LIZ.getValue()).booleanValue()) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            StringBuilder sb = new StringBuilder("LongPressLayout set not enable: ");
            int length = stackTrace.length;
            if (length > 3) {
                length = 3;
            }
            for (int i = 0; i < length; i++) {
                sb.append(stackTrace[i].getClassName());
                sb.append(".");
                sb.append(stackTrace[i].getMethodName());
                sb.append(" ");
                sb.append(stackTrace[i].getLineNumber());
                sb.append("\n");
            }
            String sb2 = sb.toString();
            o.LJIIIIZZ(sb2, "stringBuilder.toString()");
            C36922EeM.LIZLLL(3, "MotionEventALog", sb2);
        }
        super.setEnabled(z);
    }

    public void setListener(C92D c92d) {
        this.LJLJL = c92d;
    }

    public void setLongPressInterceptor(InterfaceC222528oK interfaceC222528oK) {
        this.LJLLI = interfaceC222528oK;
    }

    public void setLongPressMonitor(InterfaceC86322XuI interfaceC86322XuI) {
        this.LJLL = interfaceC86322XuI;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LJLLJ = onClickListener;
    }

    public void setTapListener(View.OnTouchListener onTouchListener) {
        this.LJLJLJ = onTouchListener;
    }

    public void setTimeInterval(int i) {
        this.LJLJJLL = i;
    }

    public void setVideoScalingListener(OM3 om3) {
        this.LJLJLLL = om3;
    }

    public LongPressLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJL = -1;
        this.LJLJJLL = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        this.LJLLLLLL = true;
        this.LJLZ = new ARunnableS51S0100000_15(this, 30);
        this.LJLJJL = ViewConfiguration.get(context).getScaledTouchSlop();
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS55S0000000_15(2)));
        super.setOnClickListener(new ACListenerS49S0200000_15(this, new ACListenerS32S0101000_15(4, this, 2), 40));
    }
}
