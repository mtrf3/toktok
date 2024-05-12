package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AuN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27723AuN implements C33Q {
    public final List<AbstractC27664AtQ<?, ?>> LJLIL;
    public final ImageSelectData LJLILLLLZI;
    public final int LJLJI;

    public C27723AuN() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27723AuN)) {
            return false;
        }
        C27723AuN c27723AuN = (C27723AuN) obj;
        return o.LJ(this.LJLIL, c27723AuN.LJLIL) && o.LJ(this.LJLILLLLZI, c27723AuN.LJLILLLLZI) && this.LJLJI == c27723AuN.LJLJI;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        ImageSelectData imageSelectData = this.LJLILLLLZI;
        return ((hashCode + (imageSelectData == null ? 0 : imageSelectData.hashCode())) * 31) + this.LJLJI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpBodyState(contentList=");
        LIZ.append(this.LJLIL);
        LIZ.append(", selectImage=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", bodyContent=");
        return b0.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C27723AuN(int i) {
        this(C61878OQg.INSTANCE, null, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C27723AuN(List<? extends AbstractC27664AtQ<?, ?>> contentList, ImageSelectData imageSelectData, int i) {
        o.LJIIIZ(contentList, "contentList");
        this.LJLIL = contentList;
        this.LJLILLLLZI = imageSelectData;
        this.LJLJI = i;
    }

    public static C27723AuN LIZ(C27723AuN c27723AuN, List contentList, ImageSelectData imageSelectData, int i) {
        int i2;
        if ((i & 1) != 0) {
            contentList = c27723AuN.LJLIL;
        }
        if ((i & 2) != 0) {
            imageSelectData = c27723AuN.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            i2 = c27723AuN.LJLJI;
        } else {
            i2 = 0;
        }
        c27723AuN.getClass();
        o.LJIIIZ(contentList, "contentList");
        return new C27723AuN(contentList, imageSelectData, i2);
    }
}
