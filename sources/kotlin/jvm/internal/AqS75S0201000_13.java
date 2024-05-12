package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C21430sl;
import X.C76800UCe;
import X.InterfaceC24520xk;
import X.InterfaceC88471Ynr;
import X.V5Q;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionCell;
import com.ss.android.ugc.aweme.favorites.business.playlist.model.MixInfo;

/* loaded from: classes14.dex */
public class AqS75S0201000_13 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS75S0201000_13 aqS75S0201000_13, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((PlaylistCollectionCell) aqS75S0201000_13.l0).L((MixInfo) aqS75S0201000_13.l1, (InterfaceC24520xk) obj, aqS75S0201000_13.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS75S0201000_13 aqS75S0201000_13, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            C21430sl.LIZ(((V5Q) aqS75S0201000_13.l0).LJIILJJIL, (InterfaceC88471Ynr) aqS75S0201000_13.l1, interfaceC24520xk, (aqS75S0201000_13.i2 >> 15) & 112);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS75S0201000_13(V5Q v5q, V5Q v5q2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i) {
        super(2);
        this.$t = i;
        this.l0 = v5q;
        this.l1 = v5q2;
        this.i2 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS75S0201000_13(PlaylistCollectionCell playlistCollectionCell, MixInfo mixInfo, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = playlistCollectionCell;
        this.l1 = mixInfo;
        this.i2 = i;
    }
}
