package com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp;

import X.InterfaceC61312at;
import X.U26;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuCommonState implements InterfaceC61312at {
    public final Object closeFragment;

    public static /* synthetic */ SkuCommonState copy$default(SkuCommonState skuCommonState, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = skuCommonState.closeFragment;
        }
        return skuCommonState.copy(obj);
    }

    public final SkuCommonState copy(Object obj) {
        return new SkuCommonState(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SkuCommonState) && o.LJ(this.closeFragment, ((SkuCommonState) obj).closeFragment);
    }

    public int hashCode() {
        Object obj = this.closeFragment;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuCommonState(closeFragment=");
        return U26.LIZJ(LIZ, this.closeFragment, ')', LIZ);
    }

    public final Object getCloseFragment() {
        return this.closeFragment;
    }

    public SkuCommonState(Object obj) {
        this.closeFragment = obj;
    }
}
