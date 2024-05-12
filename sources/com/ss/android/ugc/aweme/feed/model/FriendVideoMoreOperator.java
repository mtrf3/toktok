package com.ss.android.ugc.aweme.feed.model;

import X.AbstractC50421Jqb;
import X.AbstractC51036K1g;
import X.C51031K1b;
import X.InterfaceC50391Jq7;
import X.InterfaceC51032K1c;
import X.M89;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendVideoMoreOperator extends AbstractC50421Jqb<AbstractC51036K1g<?, ?>, C51031K1b<AbstractC51036K1g<?, ?>>> implements InterfaceC50391Jq7 {
    public static final Companion Companion = new Companion();

    @Override // X.InterfaceC50391Jq7
    public void bindPreLoadView(InterfaceC51032K1c interfaceC51032K1c) {
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public /* bridge */ /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public /* bridge */ /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
    }

    @Override // X.InterfaceC50391Jq7
    public void setPreLoad(boolean z) {
    }

    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public FriendVideoMoreOperator(AbstractC51036K1g<?, ?> abstractC51036K1g) {
    }
}
