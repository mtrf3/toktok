package X;

import android.webkit.ValueCallback;

/* renamed from: X.EpZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37617EpZ<T> implements ValueCallback<String> {
    public final /* synthetic */ BQ6 LIZ;

    public C37617EpZ(BQ6 bq6) {
        this.LIZ = bq6;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(String str) {
        BQ6 bq6 = this.LIZ;
        if (bq6 != null) {
            bq6.accept(str);
        }
    }
}
