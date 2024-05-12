package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C221108m2;
import X.C46040I5c;
import X.C46041I5d;
import X.C46042I5e;
import X.C62822Ol8;
import X.EnumC82528WaC;
import X.InterfaceC61312at;
import androidx.lifecycle.LiveData;
import com.bytedance.jedi.arch.BaseJediViewModel;
import kotlin.jvm.internal.AqS11S0010000_6;

/* loaded from: classes8.dex */
public final class CutVideoSpeedViewModel extends BaseJediViewModel<CutVideoSpeedState> {
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C46042I5e.LJLIL);
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C46041I5d.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C46040I5c.LJLIL);

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new CutVideoSpeedState(null, null, 3, null);
    }

    public final void Mv0(EnumC82528WaC enumC82528WaC) {
        ((LiveData) this.LJLJJLL.getValue()).setValue(enumC82528WaC);
    }

    public final void setVisible(boolean z) {
        setState(new AqS11S0010000_6(z, 2));
    }
}
