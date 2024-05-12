package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.account.login.loginmethods.EncryptedLoginMethod;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.QtJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68425QtJ<TResult> implements InterfaceC67677QhF {
    public final /* synthetic */ C68518Quo LJLIL;
    public final /* synthetic */ C68322mC<List<EncryptedLoginMethod>> LJLILLLLZI;
    public final /* synthetic */ InterfaceC67677QhF<List<EncryptedLoginMethod>> LJLJI;

    @Override // X.InterfaceC67677QhF
    public final void onSuccess(Object it) {
        List<EncryptedLoginMethod> list;
        this.LJLIL.getClass();
        if (C68518Quo.LIZ() && ((list = this.LJLILLLLZI.element) == null || list.isEmpty())) {
            C68529Quz c68529Quz = this.LJLIL.LIZJ;
            o.LJIIIIZZ(it, "it");
            c68529Quz.getClass();
            ((Keva) c68529Quz.LIZ.getValue()).storeString("OCL_DATA", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), it));
        }
        this.LJLJI.onSuccess(it);
    }

    public C68425QtJ(C68518Quo c68518Quo, C68322mC c68322mC) {
        C68429QtN<TResult> c68429QtN = C68429QtN.LJLIL;
        this.LJLIL = c68518Quo;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = c68429QtN;
    }
}
