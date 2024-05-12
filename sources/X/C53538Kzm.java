package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Kzm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53538Kzm extends AbstractC53477Kyn {
    public final Boolean LJLJI;

    public final int hashCode() {
        Boolean bool = this.LJLJI;
        if (bool != null) {
            return bool.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NoneStory(isMine=");
        return C78920UyC.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.AbstractC53477Kyn
    public final Boolean LIZ() {
        return this.LJLJI;
    }

    public C53538Kzm(Boolean bool) {
        super(LiveGiftNewGifterBadgeSetting.DEFAULT, bool);
        this.LJLJI = bool;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C53538Kzm) && o.LJ(((C53538Kzm) obj).LJLJI, this.LJLJI)) {
            return true;
        }
        return false;
    }
}
