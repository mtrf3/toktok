package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* loaded from: classes6.dex */
public final class B3S implements B3W {
    public final /* synthetic */ B3X LIZ;

    public B3S(B3X b3x) {
        this.LIZ = b3x;
    }

    @Override // X.B3W
    public final void LIZIZ(Room room) {
        B3W b3w = this.LIZ.LJFF;
        if (b3w != null) {
            b3w.LIZIZ(room);
        }
        B3X b3x = this.LIZ;
        b3x.LJII = b3x.LIZ;
    }

    @Override // X.B3W
    public final void LIZ(int i, String str) {
        B3W b3w = this.LIZ.LJFF;
        if (b3w != null) {
            b3w.LIZ(i, str);
        }
        B3X b3x = this.LIZ;
        b3x.LJII = b3x.LIZIZ;
    }
}
