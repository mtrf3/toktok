package X;

import com.bytedance.android.livesdk.i18n.I18nDbManager;
import java.util.concurrent.Callable;

/* renamed from: X.Uud, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class CallableC78699Uud implements Callable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.LJLIL) {
            case 0:
                return I18nDbManager.LIZLLL((I18nDbManager) this.LJLILLLLZI);
            default:
                InterfaceC54215LPn interfaceC54215LPn = ((C78697Uub) this.LJLILLLLZI).LJLJJI;
                if (interfaceC54215LPn != null) {
                    interfaceC54215LPn.LIZ();
                    return null;
                }
                return null;
        }
    }

    public /* synthetic */ CallableC78699Uud(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
