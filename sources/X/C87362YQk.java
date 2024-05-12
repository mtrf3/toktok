package X;

import android.hardware.Camera;

/* renamed from: X.YQk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87362YQk implements Camera.OnZoomChangeListener {
    public final /* synthetic */ InterfaceC87361YQj LIZ;

    public C87362YQk(InterfaceC87361YQj interfaceC87361YQj) {
        this.LIZ = interfaceC87361YQj;
    }

    @Override // android.hardware.Camera.OnZoomChangeListener
    public final void onZoomChange(int i, boolean z, Camera camera) {
        InterfaceC87361YQj interfaceC87361YQj = this.LIZ;
        if (interfaceC87361YQj != null) {
            interfaceC87361YQj.onChange(1, i, z);
        }
    }
}
