package X;

import android.view.MotionEvent;

/* loaded from: classes15.dex */
public interface VPY {
    boolean blockNativeEvent(MotionEvent motionEvent);

    boolean consumeSlideEvent(float f);

    boolean dispatchEvent(C40154FpO c40154FpO);

    boolean dispatchTouch(MotionEvent motionEvent);

    boolean enableTouchPseudoPropagation();

    boolean eventThrough();

    java.util.Map<String, VNA> getEvents();

    int getPseudoStatus();

    int getSign();

    boolean ignoreFocus();

    boolean isFocusable();

    void offResponseChain();

    void onFocusChanged(boolean z, boolean z2);

    void onPseudoStatusChanged(int i, int i2);

    void onResponseChain();

    VPY parent();
}
