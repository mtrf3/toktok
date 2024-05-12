package X;

import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.Epj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37627Epj implements InterfaceC37454Emw {
    public final /* synthetic */ String LIZ;

    public C37627Epj(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC37454Emw
    public final /* synthetic */ java.util.Map getRequestHeaders() {
        return null;
    }

    @Override // X.InterfaceC37454Emw
    public final /* synthetic */ boolean isForMainFrame() {
        return false;
    }

    @Override // X.InterfaceC37454Emw
    public final android.net.Uri getUrl() {
        return UriProtector.parse(this.LIZ);
    }
}
