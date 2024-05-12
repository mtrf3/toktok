package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment;
import com.ss.android.ugc.aweme.authorize.I18nAuthorizeFragment;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OTJ<T> implements Observer {
    public final /* synthetic */ BaseI18nAuthorizedFragment LJLIL;

    public OTJ(BaseI18nAuthorizedFragment baseI18nAuthorizedFragment) {
        this.LJLIL = baseI18nAuthorizedFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        List list = (List) obj;
        int size = list.size();
        String str = null;
        for (int i = 0; i < size; i++) {
            if (!o.LJ(((AuthorizedScope) ListProtector.get(list, i)).isEnabled(), Boolean.FALSE) || o.LJ(((AuthorizedScope) ListProtector.get(list, i)).getScopeRequired(), Boolean.TRUE)) {
                str = C60652Zp.LIZ(i, str, list);
            } else {
                BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = this.LJLIL;
                baseI18nAuthorizedFragment.LJLLLLLL = C60652Zp.LIZ(i, baseI18nAuthorizedFragment.LJLLLLLL, list);
            }
        }
        BaseI18nAuthorizedFragment baseI18nAuthorizedFragment2 = this.LJLIL;
        OT6 ot6 = baseI18nAuthorizedFragment2.LJLJJI;
        if (ot6 != null) {
            ot6.LJII = str;
            Bundle arguments = baseI18nAuthorizedFragment2.getArguments();
            if (arguments != null) {
                arguments.putString("_bytedance_params_scope", str);
                arguments.putString("disabled_scope", this.LJLIL.LJLLLLLL);
            }
            I18nAuthorizeFragment i18nAuthorizeFragment = new I18nAuthorizeFragment();
            if (arguments != null) {
                arguments.putBoolean("is_ttbc_auth", false);
                arguments.putBoolean("has_been_initialized", true);
            }
            i18nAuthorizeFragment.setArguments(arguments);
            BaseI18nAuthorizedFragment.LLD = i18nAuthorizeFragment;
            FragmentManager childFragmentManager = this.LJLIL.getChildFragmentManager();
            childFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(childFragmentManager);
            c1b3.LJIIJ(i18nAuthorizeFragment, null, R.id.dms);
            c1b3.LJI();
            return;
        }
        o.LJIJI("request");
        throw null;
    }
}
