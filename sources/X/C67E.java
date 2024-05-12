package X;

import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.67E, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C67E implements InterfaceC137125Zs {
    public C6J6 LJLIL;
    public InteractStickerStruct LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;

    public C67E() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67E)) {
            return false;
        }
        C67E c67e = (C67E) obj;
        return o.LJ(this.LJLIL, c67e.LJLIL) && o.LJ(this.LJLILLLLZI, c67e.LJLILLLLZI) && this.LJLJI == c67e.LJLJI && this.LJLJJI == c67e.LJLJJI;
    }

    public final int hashCode() {
        C6J6 c6j6 = this.LJLIL;
        int hashCode = (c6j6 == null ? 0 : c6j6.hashCode()) * 31;
        InteractStickerStruct interactStickerStruct = this.LJLILLLLZI;
        return ((((hashCode + (interactStickerStruct != null ? interactStickerStruct.hashCode() : 0)) * 31) + this.LJLJI) * 31) + this.LJLJJI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DonationStickerData(org=");
        LIZ.append(this.LJLIL);
        LIZ.append(", interactStruct=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", startTime=");
        LIZ.append(this.LJLJI);
        LIZ.append(", endTime=");
        return b0.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public /* synthetic */ C67E(C6J6 c6j6, int i) {
        this((i & 1) != 0 ? null : c6j6, null, 0, 0);
    }

    public C67E(C6J6 c6j6, InteractStickerStruct interactStickerStruct, int i, int i2) {
        this.LJLIL = c6j6;
        this.LJLILLLLZI = interactStickerStruct;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }
}
