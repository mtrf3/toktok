package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C43585H8r;
import X.C45735HxD;
import X.InterfaceC61312at;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CutVideoViewModel extends BaseJediViewModel<CutVideoState> {
    public C43585H8r LJLJJLL;

    public final C43585H8r Mv0() {
        C43585H8r c43585H8r = this.LJLJJLL;
        if (c43585H8r != null) {
            return c43585H8r;
        }
        o.LJIJI("cutVideoModel");
        throw null;
    }

    public final void Pv0() {
        setState(C45735HxD.LJLIL);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new CutVideoState(null, null, 3, null);
    }

    public final LibraryMaterialInfoSv Nv0() {
        return Mv0().LJJIJIIJIL;
    }

    public final boolean Ov0() {
        if (Mv0().LIZ.size() > 1) {
            return true;
        }
        return false;
    }
}
