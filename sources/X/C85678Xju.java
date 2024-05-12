package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreateAccountFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xju, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85678Xju extends C9X0 {
    public final /* synthetic */ FtcCreateAccountFragment LJLIL;

    public C85678Xju(FtcCreateAccountFragment ftcCreateAccountFragment) {
        this.LJLIL = ftcCreateAccountFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C252949wI c252949wI = (C252949wI) this.LJLIL._$_findCachedViewById(R.id.doy);
        if (c252949wI != null) {
            c252949wI.LIZ();
        }
        C85679Xjv c85679Xjv = this.LJLIL.LLFFF;
        if (c85679Xjv != null) {
            c85679Xjv.LJII.onNext(String.valueOf(editable));
        } else {
            o.LJIJI("presenter");
            throw null;
        }
    }
}
