package com.ss.android.ugc.aweme.trending.viewmodel;

import X.C221108m2;
import X.C49133JQb;
import X.C50397JqD;
import X.C62822Ol8;
import X.InterfaceC50391Jq7;
import X.InterfaceC50392Jq8;
import X.InterfaceC50393Jq9;
import X.InterfaceC50394JqA;
import X.InterfaceC51032K1c;
import X.InterfaceC51679KPz;
import X.InterfaceC55340Lnk;
import X.KQA;
import X.M89;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class TrendingDetailOperatorWrapper extends TrendingDetailSharedVM implements InterfaceC50393Jq9, InterfaceC50392Jq8, InterfaceC55340Lnk, InterfaceC50391Jq7 {
    public InterfaceC51679KPz LL;
    public boolean LLFF;
    public int LLD = Integer.MAX_VALUE;
    public int LLF = -1;
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 347));
    public final C62822Ol8 LLFII = C221108m2.LIZIZ(C50397JqD.LJLIL);

    @Override // X.InterfaceC50392Jq8
    public final void Mt() {
        InterfaceC50392Jq8 interfaceC50392Jq8;
        InterfaceC51679KPz interfaceC51679KPz = this.LL;
        if ((interfaceC51679KPz instanceof InterfaceC50392Jq8) && (interfaceC50392Jq8 = (InterfaceC50392Jq8) interfaceC51679KPz) != null) {
            interfaceC50392Jq8.Mt();
        }
    }

    public final boolean nv0() {
        if (this.LL != null && this.LLF != -1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final void unInit() {
        InterfaceC51679KPz interfaceC51679KPz = this.LL;
        if (interfaceC51679KPz != null) {
            interfaceC51679KPz.unInit();
        }
        super.unInit();
    }

    @Override // X.InterfaceC55340Lnk
    public final boolean dF() {
        return nv0();
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final Object getViewModel() {
        if (nv0()) {
            InterfaceC51679KPz interfaceC51679KPz = this.LL;
            if (interfaceC51679KPz != null) {
                Object viewModel = interfaceC51679KPz.getViewModel();
                o.LJIIIIZZ(viewModel, "requireNotNull(operatorProxy).viewModel");
                return viewModel;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        super.getViewModel();
        return this;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        if (nv0()) {
            InterfaceC51679KPz interfaceC51679KPz = this.LL;
            if (interfaceC51679KPz != null) {
                return interfaceC51679KPz.isDataEmpty();
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        return super.isDataEmpty();
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final boolean isLoading() {
        if (nv0()) {
            InterfaceC51679KPz interfaceC51679KPz = this.LL;
            if (interfaceC51679KPz != null) {
                return interfaceC51679KPz.isLoading();
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        return super.isLoading();
    }

    @Override // X.InterfaceC50391Jq7
    public final void bindPreLoadView(InterfaceC51032K1c interfaceC51032K1c) {
        InterfaceC50391Jq7 interfaceC50391Jq7;
        InterfaceC51679KPz interfaceC51679KPz = this.LL;
        if ((interfaceC51679KPz instanceof InterfaceC50391Jq7) && (interfaceC50391Jq7 = (InterfaceC50391Jq7) interfaceC51679KPz) != null) {
            interfaceC50391Jq7.bindPreLoadView(interfaceC51032K1c);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final void bindView(KQA detailFragmentPanel) {
        o.LJIIIZ(detailFragmentPanel, "detailFragmentPanel");
        InterfaceC51679KPz interfaceC51679KPz = this.LL;
        if (interfaceC51679KPz != null) {
            interfaceC51679KPz.bindView(detailFragmentPanel);
        }
        super.bindView(detailFragmentPanel);
    }

    @Override // X.InterfaceC50391Jq7
    public final void setPreLoad(boolean z) {
        InterfaceC50391Jq7 interfaceC50391Jq7;
        InterfaceC51679KPz interfaceC51679KPz = this.LL;
        if ((interfaceC51679KPz instanceof InterfaceC50391Jq7) && (interfaceC50391Jq7 = (InterfaceC50391Jq7) interfaceC51679KPz) != null) {
            interfaceC50391Jq7.setPreLoad(true);
        }
    }

    @Override // X.InterfaceC50393Jq9
    public final void zj0(Aweme aweme) {
        InterfaceC51679KPz interfaceC51679KPz = this.LL;
        if (nv0() && (interfaceC51679KPz instanceof InterfaceC50393Jq9)) {
            ((InterfaceC50393Jq9) interfaceC51679KPz).zj0(aweme);
        }
    }

    @Override // X.InterfaceC55340Lnk
    public final boolean R2(int i, Aweme aweme) {
        InterfaceC50394JqA interfaceC50394JqA;
        if (!nv0()) {
            return false;
        }
        InterfaceC51679KPz interfaceC51679KPz = this.LL;
        if (!(interfaceC51679KPz instanceof InterfaceC50394JqA) || (interfaceC50394JqA = (InterfaceC50394JqA) interfaceC51679KPz) == null || !interfaceC50394JqA.R2(i, aweme)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC50392Jq8
    public final void zX(int i, int i2, Aweme aweme) {
        InterfaceC50392Jq8 interfaceC50392Jq8;
        InterfaceC51679KPz interfaceC51679KPz = this.LL;
        if ((interfaceC51679KPz instanceof InterfaceC50392Jq8) && (interfaceC50392Jq8 = (InterfaceC50392Jq8) interfaceC51679KPz) != null) {
            interfaceC50392Jq8.zX(i, i2, aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        if (nv0()) {
            if (i == 4) {
                this.LLF = 2;
                C49133JQb.LIZ("Tmark", Integer.valueOf(i), this.LL);
                InterfaceC51679KPz interfaceC51679KPz = this.LL;
                if (interfaceC51679KPz != null) {
                    interfaceC51679KPz.request(i, feedParam, i2, z);
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            return;
        }
        this.LLF = 1;
        C49133JQb.LIZ("Tmark", Integer.valueOf(i), this);
        super.request(i, feedParam, i2, z);
    }
}
