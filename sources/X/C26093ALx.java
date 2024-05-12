package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ALx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C26093ALx implements InterfaceC65784Pro {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        C76800UCe lambda$onViewCreated$2;
        switch (this.LJLIL) {
            case 0:
                lambda$onViewCreated$2 = ((I18nSettingNewVersionFragment) this.LJLILLLLZI).lambda$onViewCreated$2((View) this.LJLJI, (Bundle) this.LJLJJI);
                return lambda$onViewCreated$2;
            default:
                ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) this.LJLILLLLZI;
                AbstractC243009gG action = (AbstractC243009gG) this.LJLJI;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) this.LJLJJI;
                C26227ARb c26227ARb = new C26227ARb(contextThemeWrapper);
                c26227ARb.LJFF(contextThemeWrapper.getResources().getString(R.string.a0v));
                c26227ARb.LIZIZ(contextThemeWrapper.getResources().getString(R.string.a0s));
                o.LJIIIZ(action, "action");
                c26227ARb.LJIIL = action;
                o.LJIIIZ(onDismissListener, "onDismissListener");
                c26227ARb.LIZLLL = onDismissListener;
                c26227ARb.LJI().LIZLLL();
                return C76800UCe.LIZ;
        }
    }

    public /* synthetic */ C26093ALx(int i, Object obj, Object obj2, Object obj3) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = obj3;
    }
}
