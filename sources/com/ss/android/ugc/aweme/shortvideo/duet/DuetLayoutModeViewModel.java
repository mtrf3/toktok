package com.ss.android.ugc.aweme.shortvideo.duet;

import X.C0IB;
import X.C29901Fi;
import X.C40871j1;
import X.C81572Vzs;
import X.InterfaceC45921I0n;
import com.bytedance.als.LiveEvent;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS18S0010000_14;
import kotlin.jvm.internal.AqS37S1000000_14;
import kotlin.jvm.internal.AqS38S0001000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class DuetLayoutModeViewModel extends LifecycleAwareViewModel<DuetLayoutModeState> implements InterfaceC45921I0n {
    public final C29901Fi<Boolean> LJLJL = new C29901Fi<>();
    public final C29901Fi<ImageUrlModel> LJLJLJ = new C29901Fi<>();
    public final C0IB<Integer> LJLJLLL = new C40871j1(0);
    public final C0IB<Effect> LJLL = new C40871j1(null);

    @Override // X.InterfaceC45921I0n
    public void oP() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Lv0, reason: merged with bridge method [inline-methods] */
    public DuetLayoutModeState kv0() {
        int i = 0;
        return new DuetLayoutModeState(i, i, i, i, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    @Override // X.InterfaceC45921I0n
    public C0IB<Effect> YZ() {
        return this.LJLL;
    }

    @Override // X.InterfaceC45921I0n
    public C0IB<Integer> qc() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC45921I0n
    public /* bridge */ /* synthetic */ LiveEvent t5() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC45921I0n
    public /* bridge */ /* synthetic */ LiveEvent tA() {
        return this.LJLJLJ;
    }

    public final void Kv0(int i) {
        setState(new AqS38S0001000_14(i, 4));
    }

    @Override // X.InterfaceC45921I0n
    public void Su(Effect effect) {
        setState(new AqS180S0100000_14(effect, 130));
    }

    @Override // X.InterfaceC45921I0n
    public void Zi0(ImageUrlModel imageUrlModel) {
        this.LJLJLJ.LJII(imageUrlModel);
    }

    @Override // X.InterfaceC45921I0n
    public void show(boolean z) {
        setStateImmediate(new AqS18S0010000_14(z, 15));
    }

    @Override // X.InterfaceC45921I0n
    public void showToast(String toast) {
        o.LJIIIZ(toast, "toast");
        setStateImmediate(new AqS37S1000000_14(toast, 2));
    }

    @Override // X.InterfaceC45921I0n
    public void vL(boolean z) {
        this.LJLJL.LJII(Boolean.valueOf(z));
    }

    public final void Jv0(Effect effect, int i, int i2, int i3) {
        o.LJIIIZ(effect, "effect");
        setState(new C81572Vzs(i, i2, i3));
        YZ().LJ(effect);
    }
}
