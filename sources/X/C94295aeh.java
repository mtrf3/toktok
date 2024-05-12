package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;
import com.ss.android.ugc.aweme.music.model.DspAuthToken;
import com.ss.android.ugc.aweme.music.model.DspPlatform;

/* renamed from: X.aeh, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94295aeh implements InterfaceC64672gJ<XGX<C94474aha>> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ DspAuthParam LJLILLLLZI;
    public final /* synthetic */ Fragment LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ DspAuthToken LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ int LJLJLLL;
    public final /* synthetic */ DspPlatform LJLL;
    public final /* synthetic */ long LJLLI;
    public final /* synthetic */ String LJLLILLLL;
    public final /* synthetic */ Activity LJLLJ;

    @Override // X.InterfaceC64672gJ
    public final Object emit(XGX<C94474aha> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = XKX.LJI(C36636EZk.LIZ, new C94857anl(xgx, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    public C94295aeh(boolean z, DspAuthParam dspAuthParam, Fragment fragment, String str, boolean z2, boolean z3, DspAuthToken dspAuthToken, boolean z4, int i, DspPlatform dspPlatform, long j, String str2, Activity activity) {
        this.LJLIL = z;
        this.LJLILLLLZI = dspAuthParam;
        this.LJLJI = fragment;
        this.LJLJJI = str;
        this.LJLJJL = z2;
        this.LJLJJLL = z3;
        this.LJLJL = dspAuthToken;
        this.LJLJLJ = z4;
        this.LJLJLLL = i;
        this.LJLL = dspPlatform;
        this.LJLLI = j;
        this.LJLLILLLL = str2;
        this.LJLLJ = activity;
    }
}
