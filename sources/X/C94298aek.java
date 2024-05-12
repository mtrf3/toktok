package X;

import Y.IDfS15S0300000_42;
import android.app.Activity;
import com.ss.android.ugc.aweme.music.model.DspPlatform;

/* renamed from: X.aek, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94298aek implements InterfaceC65462ha<Boolean> {
    public final /* synthetic */ InterfaceC65462ha LJLIL;
    public final /* synthetic */ DspPlatform LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;

    @Override // X.InterfaceC65462ha
    public final Object collect(InterfaceC64672gJ<? super Boolean> interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = this.LJLIL.collect(new IDfS15S0300000_42(interfaceC64672gJ, this.LJLILLLLZI, this.LJLJI, 1), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public C94298aek(InterfaceC65462ha interfaceC65462ha, DspPlatform dspPlatform, Activity activity) {
        this.LJLIL = interfaceC65462ha;
        this.LJLILLLLZI = dspPlatform;
        this.LJLJI = activity;
    }
}
