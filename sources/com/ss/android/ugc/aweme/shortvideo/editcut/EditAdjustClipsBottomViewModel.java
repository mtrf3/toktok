package com.ss.android.ugc.aweme.shortvideo.editcut;

import X.C143575kH;
import X.C73297Sph;
import X.InterfaceC61312at;
import com.bytedance.jedi.arch.BaseJediViewModel;
import kotlin.jvm.internal.AqS2S0000001_7;
import kotlin.jvm.internal.AqS31S0001000_7;

/* loaded from: classes8.dex */
public final class EditAdjustClipsBottomViewModel extends BaseJediViewModel<EditAdjustClipsBottomViewState> {
    public C143575kH LJLJJLL;

    public static EditAdjustClipsBottomViewState Mv0() {
        return new EditAdjustClipsBottomViewState(0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public final EditAdjustClipsBottomViewState Ov0() {
        C143575kH c143575kH = this.LJLJJLL;
        if (c143575kH != null) {
            return (EditAdjustClipsBottomViewState) C73297Sph.LIZIZ(c143575kH, this);
        }
        return Mv0();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* bridge */ /* synthetic */ InterfaceC61312at kv0() {
        return Mv0();
    }

    public final void Nv0(int i) {
        setStateImmediate(new AqS31S0001000_7(i, 3));
    }

    public final void Pv0(float f) {
        setState(new AqS2S0000001_7(f, 1));
    }
}
