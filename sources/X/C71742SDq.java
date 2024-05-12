package X;

import android.text.Editable;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS16S0010000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS35S1000000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SDq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C71742SDq extends AbstractC71743SDr implements SEP {
    public final C71746SDu<C71740SDo> LJLJJI;
    public final MutableLiveData LJLJJL;
    public final MutableLiveData LJLJJLL;
    public C68249QqT LJLJL;
    public final XLL LJLJLJ;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C71742SDq() {
        C71746SDu<C71740SDo> c71746SDu = new C71746SDu<>(new C71740SDo(null, null, null, 0, null, null, 0, 16383));
        this.LJLJJI = c71746SDu;
        this.LJLJJL = (MutableLiveData) c71746SDu.LIZJ.getValue();
        this.LJLJJLL = (MutableLiveData) new C71746SDu(new SE9(0)).LIZJ.getValue();
        this.LJLJLJ = C79853Bl.LIZ(0, 0, null, 7);
    }

    @Override // X.AbstractC71743SDr
    public final <T> InterfaceC88472Yns<T, T> LIZ(T t) {
        o.LJIIIZ(t, "t");
        C68249QqT c68249QqT = this.LJLJL;
        if ((t instanceof C71740SDo) && c68249QqT != null) {
            return new AqS143S0200000_12((Object) t, c68249QqT, (C68249QqT) 76);
        }
        return super.LIZ(t);
    }

    public final void LIZLLL(AbstractC71736SDk event) {
        o.LJIIIZ(event, "event");
        XKX.LIZLLL((InterfaceC70422pa) this.LJLJI.getValue(), null, null, new C59126NIk(this, event, null), 3);
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        LIZIZ(this.LJLJJI, new AqS16S0010000_12(z, 6));
        C71739SDn c71739SDn = (C71739SDn) this;
        if (z) {
            c71739SDn.LIZIZ(c71739SDn.LJLJJI, new AqS35S1000000_12("", 16));
        } else {
            C71746SDu<C71740SDo> stateOwner = c71739SDn.LJLJJI;
            AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12(c71739SDn, 473);
            o.LJIIIZ(stateOwner, "stateOwner");
            aqS178S0100000_12.invoke(stateOwner.LIZ);
        }
        C68249QqT c68249QqT = this.LJLJL;
        if (c68249QqT != null) {
            Iterator it = ((List) c68249QqT.LIZ).iterator();
            while (it.hasNext()) {
                ((SEI) it.next()).LIZIZ(z);
            }
        }
    }
}
