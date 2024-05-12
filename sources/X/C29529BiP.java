package X;

import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BiP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29529BiP extends AbstractC03120Ai {
    public final List<RoomSticker> LIZ;
    public final List<RoomSticker> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public C29529BiP(List<RoomSticker> oldData, List<RoomSticker> list) {
        o.LJIIIZ(oldData, "oldData");
        this.LIZ = oldData;
        this.LIZIZ = list;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        if (o.LJ(((RoomSticker) ListProtector.get(this.LIZ, i)).image, ((RoomSticker) ListProtector.get(this.LIZIZ, i2)).image) && o.LJ(((RoomSticker) ListProtector.get(this.LIZ, i)).ninePatchImage, ((RoomSticker) ListProtector.get(this.LIZIZ, i2)).ninePatchImage)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        if (((Sticker) ListProtector.get(this.LIZ, i)).id == ((Sticker) ListProtector.get(this.LIZIZ, i2)).id && ((Sticker) ListProtector.get(this.LIZ, i)).type == ((Sticker) ListProtector.get(this.LIZIZ, i2)).type) {
            return true;
        }
        return false;
    }
}
