package X;

import com.ss.android.ttve.nativePort.TEVideoUtils;

/* renamed from: X.YNt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87293YNt implements TEVideoUtils.ExecuteCommandListener {
    public final /* synthetic */ YO1 LIZ;

    public C87293YNt(YO1 yo1) {
        this.LIZ = yo1;
    }

    @Override // com.ss.android.ttve.nativePort.TEVideoUtils.ExecuteCommandListener
    public final void onProgressChanged(int i) {
        YO1 yo1 = this.LIZ;
        if (yo1 != null) {
            yo1.onProgressChanged(i);
        }
    }
}
