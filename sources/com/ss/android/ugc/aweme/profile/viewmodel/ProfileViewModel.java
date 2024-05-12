package com.ss.android.ugc.aweme.profile.viewmodel;

import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileViewModel extends JediViewModel<ProfileState> {
    public static final /* synthetic */ int LJLJJLL = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final ProfileState kv0() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        return new ProfileState(null, objArr, objArr2, objArr3, objArr4, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr5, objArr6, objArr7, 0 == true ? 1 : 0, objArr8, objArr9, objArr10, objArr11, objArr12, objArr13, 0 == true ? 1 : 0, objArr14, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr15, 0 == true ? 1 : 0, objArr16, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, -1, 1, objArr25);
    }

    public final void Hv0(boolean z) {
        setState(new AqS9S0010000_4(z, 18));
    }

    public final void Iv0(boolean z) {
        setState(new AqS9S0010000_4(z, 19));
    }

    public final void Jv0(boolean z) {
        setState(new AqS9S0010000_4(z, 20));
    }

    public final void Kv0(User u) {
        o.LJIIIZ(u, "u");
        setState(new AqS170S0100000_4(u, 627));
    }
}
