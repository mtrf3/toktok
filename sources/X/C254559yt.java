package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import kotlin.jvm.internal.o;

/* renamed from: X.9yt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254559yt implements InterfaceC57784Mm4 {
    public final CollectionDetailModel LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LJLIL.getCollectionId());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidContentCollectionItem(model=");
        LIZ.append(this.LJLIL);
        LIZ.append(", price=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", discountedPrice=");
        LIZ.append(this.LJLJI);
        LIZ.append(", sessionId=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isPriceLoading=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", isAnchorSelected=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C254559yt) {
            C254559yt c254559yt = (C254559yt) interfaceC57784Mm4;
            if (c254559yt.LJLIL.getCollectionId() != this.LJLIL.getCollectionId() || c254559yt.LJLIL.getCollectionRating() != this.LJLIL.getCollectionRating() || c254559yt.LJLIL.getHasPurchasedCollection() != this.LJLIL.getHasPurchasedCollection() || !o.LJ(c254559yt.LJLILLLLZI, this.LJLILLLLZI) || c254559yt.LJLJJLL != this.LJLJJLL) {
                return false;
            }
            return true;
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C254559yt) {
            if (((C254559yt) interfaceC57784Mm4).LJLIL.getCollectionId() == this.LJLIL.getCollectionId()) {
                return true;
            }
            return false;
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C254559yt) {
            if (((C254559yt) obj).LJLIL.getCollectionId() == this.LJLIL.getCollectionId()) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        final boolean z;
        if (interfaceC57784Mm4 instanceof C254559yt) {
            C254559yt c254559yt = (C254559yt) interfaceC57784Mm4;
            if (c254559yt.LJLIL.getHasPurchasedCollection() != this.LJLIL.getHasPurchasedCollection()) {
                z = true;
            } else {
                z = false;
            }
            final boolean z2 = !o.LJ(c254559yt.LJLILLLLZI, this.LJLILLLLZI);
            return new F9E(z, z2) { // from class: X.9yu
                public final boolean LJLIL;
                public final boolean LJLILLLLZI;
                public final boolean LJLJI = false;

                @Override // X.F9E
                public final Object[] getObjects() {
                    return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
                }

                {
                    this.LJLIL = z;
                    this.LJLILLLLZI = z2;
                }
            };
        }
        return null;
    }

    public /* synthetic */ C254559yt(CollectionDetailModel collectionDetailModel, String str, String str2, String str3, boolean z) {
        this(collectionDetailModel, str, str2, str3, z, false);
    }

    public C254559yt(CollectionDetailModel model, String price, String discountedPrice, String sessionId, boolean z, boolean z2) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(price, "price");
        o.LJIIIZ(discountedPrice, "discountedPrice");
        o.LJIIIZ(sessionId, "sessionId");
        this.LJLIL = model;
        this.LJLILLLLZI = price;
        this.LJLJI = discountedPrice;
        this.LJLJJI = sessionId;
        this.LJLJJL = z;
        this.LJLJJLL = z2;
    }
}
