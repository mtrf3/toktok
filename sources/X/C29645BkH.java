package X;

import com.bytedance.android.livesdk.model.RoomSticker;
import kotlin.jvm.internal.o;

/* renamed from: X.BkH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29645BkH extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final RoomSticker LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public C29645BkH(int i, int i2, RoomSticker roomSticker) {
        o.LJIIIZ(roomSticker, "roomSticker");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = roomSticker;
    }
}
