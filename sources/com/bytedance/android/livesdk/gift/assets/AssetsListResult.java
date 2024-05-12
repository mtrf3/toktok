package com.bytedance.android.livesdk.gift.assets;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class AssetsListResult extends F9E {

    @InterfaceC65349Pkn("assets")
    public List<AssetsModel> assets;

    /* JADX WARN: Multi-variable type inference failed */
    public AssetsListResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetsListResult copy$default(AssetsListResult assetsListResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = assetsListResult.assets;
        }
        return assetsListResult.copy(list);
    }

    public final List<AssetsModel> component1() {
        return this.assets;
    }

    public final AssetsListResult copy(List<AssetsModel> list) {
        return new AssetsListResult(list);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.assets};
    }

    public AssetsListResult(List<AssetsModel> list) {
        this.assets = list;
    }

    public /* synthetic */ AssetsListResult(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
