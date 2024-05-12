package a04;

import X.QXX;
import android.graphics.Path;

/* loaded from: classes.dex */
public class IDfS0S0000000 extends QXX {
    public final int $t;

    @Override // X.QXX
    public final Path LLILZ(float f, float f2, float f3, float f4) {
        switch (this.$t) {
            case 0:
                return LLILZ$0(this, f, f2, f3, f4);
            default:
                return super.LLILZ(f, f2, f3, f4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDfS0S0000000(int i) {
        super((Object) null);
        this.$t = i;
        switch (i) {
            case 0:
                return;
            default:
                return;
        }
    }

    public static final Path LLILZ$0(IDfS0S0000000 iDfS0S0000000, float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }
}
