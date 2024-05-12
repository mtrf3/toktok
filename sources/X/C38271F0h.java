package X;

import android.webkit.ValueCallback;

/* renamed from: X.F0h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38271F0h implements ValueCallback<String> {
    public final /* synthetic */ ValueCallback LIZ;

    public C38271F0h(ValueCallback valueCallback) {
        this.LIZ = valueCallback;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(String str) {
        if ("true".equals(str)) {
            this.LIZ.onReceiveValue(Boolean.TRUE);
        } else {
            this.LIZ.onReceiveValue(Boolean.FALSE);
        }
    }
}
