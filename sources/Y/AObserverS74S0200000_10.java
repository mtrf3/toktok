package Y;

import X.AI8;
import X.AI9;
import X.AIF;
import X.C16880lQ;
import X.C60984Nwa;
import X.C60986Nwc;
import X.InterfaceC60761Nsz;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.compliance.business.contentpreferences.ContentPreferencesPage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class AObserverS74S0200000_10 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS74S0200000_10 aObserverS74S0200000_10, Object obj) {
        AIF aif;
        int i;
        Boolean nonPersonalized = (Boolean) obj;
        AI9 accessory = ((AI8) ((ContentPreferencesPage) aObserverS74S0200000_10.l0)._$_findCachedViewById(R.id.hmp)).getAccessory();
        if ((accessory instanceof AIF) && (aif = (AIF) accessory) != null) {
            Context context = (Context) aObserverS74S0200000_10.l1;
            o.LJIIIIZZ(nonPersonalized, "nonPersonalized");
            if (nonPersonalized.booleanValue()) {
                i = R.string.j8d;
            } else {
                i = R.string.j9u;
            }
            aif.LJIILIIL(context.getString(i));
        }
    }

    public static final void onChanged$1(AObserverS74S0200000_10 aObserverS74S0200000_10, Object obj) {
        AIF aif;
        int i;
        Boolean nonPersonalized = (Boolean) obj;
        AI9 accessory = ((AI8) ((ContentPreferencesPage) aObserverS74S0200000_10.l0)._$_findCachedViewById(R.id.hmq)).getAccessory();
        if ((accessory instanceof AIF) && (aif = (AIF) accessory) != null) {
            Context context = (Context) aObserverS74S0200000_10.l1;
            o.LJIIIIZZ(nonPersonalized, "nonPersonalized");
            if (nonPersonalized.booleanValue()) {
                i = R.string.j8d;
            } else {
                i = R.string.j9u;
            }
            aif.LJIILIIL(context.getString(i));
        }
    }

    public static final void onChanged$2(AObserverS74S0200000_10 aObserverS74S0200000_10, Object obj) {
        ViewParent parent;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        if ((C60986Nwc.LIZIZ >= 2 || C60986Nwc.LIZ || C60986Nwc.LIZLLL) && (parent = ((View) ((InterfaceC60761Nsz) aObserverS74S0200000_10.l0)).getParent()) != null && (parent instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && (parent instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) parent) != null) {
            C16880lQ.LJZ(((C60984Nwa) aObserverS74S0200000_10.l1).LJLJJL, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
    }

    public AObserverS74S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
