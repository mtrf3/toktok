package com.ss.android.ugc.aweme.ui.common;

import X.C33Q;
import X.C76800UCe;
import X.EnumC201127uu;
import X.InterfaceC201357vH;
import X.InterfaceC65784Pro;
import android.graphics.Bitmap;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeEgressEtData;

/* loaded from: classes4.dex */
public final class PhotoSharedViewModel extends AssemViewModel<C33Q> implements InterfaceC201357vH {
    public VideoItemParams LJLIL;
    public Aweme LJLILLLLZI;
    public Bitmap LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public PostModeEgressEtData LJLJL;
    public int LJLJLJ;
    public float LJLJLLL;
    public long LJLL = -1;
    public EnumC201127uu LJLLI;
    public InterfaceC65784Pro<C76800UCe> LJLLILLLL;
    public InterfaceC65784Pro<C76800UCe> LJLLJ;

    @Override // X.InterfaceC201357vH
    public final void aI() {
        this.LJLJI = null;
    }

    public final void reset() {
        this.LJLIL = null;
        this.LJLILLLLZI = null;
        this.LJLJJI = false;
        this.LJLJJL = false;
        this.LJLJJLL = false;
        this.LJLJL = null;
        this.LJLJLJ = 0;
        this.LJLJLLL = 0.0f;
        this.LJLLI = null;
        this.LJLJI = null;
        this.LJLLILLLL = null;
        this.LJLLJ = null;
        this.LJLL = -1L;
    }

    @Override // X.InterfaceC201357vH
    public final void up0() {
        this.LJLJJL = false;
    }

    @Override // X.InterfaceC201357vH
    public final void Du() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLLJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C33Q() { // from class: X.7vI
        };
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        reset();
    }

    @Override // X.InterfaceC201357vH
    public final Bitmap Zv() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC201357vH
    public final int qd() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC201357vH
    public final void Gc0(EnumC201127uu enumC201127uu) {
        this.LJLLI = enumC201127uu;
    }

    @Override // X.InterfaceC201357vH
    public final void Iz(long j) {
        this.LJLL = j;
    }

    @Override // X.InterfaceC201357vH
    public final void Pc(boolean z) {
        this.LJLJJLL = z;
    }

    @Override // X.InterfaceC201357vH
    public final void Sc(int i) {
        this.LJLJLJ = i;
    }

    @Override // X.InterfaceC201357vH
    public final void ZX(PostModeEgressEtData postModeEgressEtData) {
        this.LJLJL = postModeEgressEtData;
    }

    @Override // X.InterfaceC201357vH
    public final void up(boolean z) {
        this.LJLJJI = z;
    }
}
