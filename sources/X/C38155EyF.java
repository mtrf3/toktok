package X;

import com.ss.android.sdk.webview.BaseJsMessageHandler;

/* renamed from: X.EyF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38155EyF implements InterfaceC38147Ey7 {
    public final /* synthetic */ C38150EyA LIZ;

    public C38155EyF(C38150EyA c38150EyA) {
        this.LIZ = c38150EyA;
    }

    @Override // X.InterfaceC38147Ey7
    public final void LIZ() {
        BaseJsMessageHandler baseJsMessageHandler = this.LIZ.LIZLLL;
        if (baseJsMessageHandler != null) {
            baseJsMessageHandler.onDestroy();
        }
    }
}
