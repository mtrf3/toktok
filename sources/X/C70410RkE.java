package X;

import android.text.method.NumberKeyListener;

/* renamed from: X.RkE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70410RkE extends NumberKeyListener {
    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return 3;
    }

    @Override // android.text.method.NumberKeyListener
    public final char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    }
}
