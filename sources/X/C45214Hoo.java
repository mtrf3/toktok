package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* renamed from: X.Hoo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45214Hoo implements InterfaceC84907XTz {
    public final /* synthetic */ C45199HoZ LIZ;
    public final /* synthetic */ InterfaceC45222How LIZIZ;

    @Override // X.InterfaceC84907XTz
    public final void LIZ(Exception exc) {
        C45199HoZ.LJLZ(this.LIZ, 1002, null, null, null, 14, null);
    }

    @Override // X.InterfaceC84907XTz
    public final void LIZIZ(AVMusic aVMusic) {
        if (aVMusic == null) {
            C45199HoZ.LJLZ(this.LIZ, 1003, null, null, null, 14, null);
        } else {
            this.LIZ.LJJZZI(aVMusic, this.LIZIZ);
        }
    }

    public C45214Hoo(C45199HoZ c45199HoZ, InterfaceC45222How interfaceC45222How) {
        this.LIZ = c45199HoZ;
        this.LIZIZ = interfaceC45222How;
    }
}
