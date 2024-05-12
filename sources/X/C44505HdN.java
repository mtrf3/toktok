package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.vesdk.VETimelineParams;

/* renamed from: X.HdN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44505HdN implements InterfaceC46047I5j {
    public static final /* synthetic */ int LJ = 0;
    public final InterfaceC153045zY LIZ;
    public VETimelineParams LIZIZ;
    public int LIZJ;
    public VideoSegment LIZLLL;

    @Override // X.InterfaceC46047I5j
    public final void LIZIZ(OSZ osz, boolean z) {
    }

    public C44505HdN(InterfaceC153045zY interfaceC153045zY, VETimelineParams vETimelineParams) {
        this.LIZ = interfaceC153045zY;
        this.LIZIZ = vETimelineParams;
    }

    @Override // X.InterfaceC46047I5j
    public final boolean LIZ(float f, float f2, float f3, int i, int i2) {
        this.LIZ.LLJJIJI(f2, f3, f, i, i2);
        return true;
    }
}
