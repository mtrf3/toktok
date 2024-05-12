package com.ss.android.ugc.aweme.setting.unit.privacy;

import X.C221108m2;
import X.C62822Ol8;
import X.C77259UTv;
import X.EnumC77154UPu;
import X.UU8;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class FindCtxViewModel extends ViewModel {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public final MutableLiveData<C77259UTv> LJLJJI = new MutableLiveData<>();
    public final MutableLiveData<C77259UTv> LJLJJL = new MutableLiveData<>();
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(UU8.LJLIL);
    public final MutableLiveData<C77259UTv> LJLJL = new MutableLiveData<>();

    public final void gv0(C77259UTv c77259UTv) {
        if (((Boolean) this.LJLJJLL.getValue()).booleanValue()) {
            if (o.LJ(c77259UTv.LJLILLLLZI, "contact")) {
                this.LJLJJI.postValue(c77259UTv);
            }
            if (o.LJ(c77259UTv.LJLILLLLZI, "facebook")) {
                this.LJLJJL.postValue(c77259UTv);
            }
        } else if (c77259UTv.LJLIL.LJLIL == EnumC77154UPu.SYNC_STATUS) {
            if (o.LJ(c77259UTv.LJLILLLLZI, "contact")) {
                this.LJLJJI.postValue(c77259UTv);
            }
            if (o.LJ(c77259UTv.LJLILLLLZI, "facebook")) {
                this.LJLJJL.postValue(c77259UTv);
            }
        }
        if (o.LJ(c77259UTv.LJLILLLLZI, "mlbb")) {
            this.LJLJL.postValue(c77259UTv);
        }
    }
}
