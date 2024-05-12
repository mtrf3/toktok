package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.zak;

/* renamed from: X.Qjj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class BinderC67831Qjj extends BinderC67788Qj2 implements InterfaceC67706Qhi, InterfaceC67707Qhj {
    public static final C67724Qi0 LJLJLJ = C67720Qhw.LIZ;
    public final Context LJLIL;
    public final Handler LJLILLLLZI;
    public final C67724Qi0 LJLJI;
    public final java.util.Set<Scope> LJLJJI;
    public final C67736QiC LJLJJL;
    public InterfaceC67779Qit LJLJJLL;
    public InterfaceC68019Qml LJLJL;

    @Override // X.InterfaceC67784Qiy
    public final void H0(Bundle bundle) {
        this.LJLJJLL.LJII(this);
    }

    @Override // X.InterfaceC67967Qlv
    public final void LLIIJLIL(zak zakVar) {
        this.LJLILLLLZI.post(new RunnableC67827Qjf(0, this, zakVar));
    }

    @Override // X.InterfaceC67712Qho
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        ((C67829Qjh) this.LJLJL).LIZIZ(connectionResult);
    }

    @Override // X.InterfaceC67784Qiy
    public final void v7(int i) {
        this.LJLJJLL.LIZLLL();
    }

    public BinderC67831Qjj(Context context, HandlerC67272Qai handlerC67272Qai, C67736QiC c67736QiC) {
        C67724Qi0 c67724Qi0 = LJLJLJ;
        this.LJLIL = context;
        this.LJLILLLLZI = handlerC67272Qai;
        this.LJLJJL = c67736QiC;
        this.LJLJJI = c67736QiC.LIZIZ;
        this.LJLJI = c67724Qi0;
    }
}
