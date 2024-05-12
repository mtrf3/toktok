package com.ss.android.ugc.gamora.editor.filter.indicator;

import X.InterfaceC147145q2;
import X.TIW;
import X.TIX;
import X.TIY;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.filter.FilterBean;

/* loaded from: classes13.dex */
public final class EditFilterIndicatorViewModel extends LifecycleAwareViewModel<EditFilterIndicatorState> implements InterfaceC147145q2 {
    public boolean LJLJL;
    public boolean LJLJLJ = true;
    public boolean LJLJLLL = true;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public EditFilterIndicatorState kv0() {
        boolean z = true;
        return new EditFilterIndicatorState(z, z, null, 0 == true ? 1 : 0, 12, 0 == true ? 1 : 0);
    }

    @Override // X.InterfaceC147145q2
    public void jb0() {
        setStateImmediate(TIX.LJLIL);
    }

    @Override // X.InterfaceC147145q2
    public void nh0() {
        setStateImmediate(TIW.LJLIL);
    }

    @Override // X.InterfaceC147145q2
    public void SX(boolean z, FilterBean filterBean, boolean z2, boolean z3) {
        this.LJLJL = z;
        this.LJLJLJ = z2;
        this.LJLJLLL = z3;
        setState(new TIY(z, filterBean, z2));
    }
}
