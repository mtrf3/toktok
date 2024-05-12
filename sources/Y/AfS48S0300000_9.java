package Y;

import X.C221018lt;
import X.C26045AKb;
import X.C38891fp;
import X.C56760MPk;
import X.C56805MRd;
import X.C56818MRq;
import X.C68322mC;
import X.EnumC56806MRe;
import X.InterfaceC64592gB;
import X.InterfaceC73573Su9;
import X.MP1;
import android.content.Context;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class AfS48S0300000_9 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS48S0300000_9 afS48S0300000_9, Object obj) {
        Throwable th = (Throwable) obj;
        C221018lt.LIZJ("MiddleDataSource", "refresh error", th);
        if (C56805MRd.LIZJ()) {
            EnumC56806MRe.LJLJLJ.LIZLLL();
        }
        InterfaceC73573Su9 emitter = (InterfaceC73573Su9) afS48S0300000_9.l0;
        o.LJIIIIZZ(emitter, "emitter");
        MP1 mp1 = (MP1) afS48S0300000_9.l1;
        mp1.LJIILJJIL((NoticeListsResponse) ((C68322mC) afS48S0300000_9.l2).element, true);
        mp1.LJIILJJIL = false;
        mp1.LJIILL = false;
        C38891fp.LJJIJ(emitter, mp1.LJIILIIL(mp1.LIZIZ(), th));
    }

    public static final void accept$1(AfS48S0300000_9 afS48S0300000_9, Object obj) {
        Throwable th = (Throwable) obj;
        C221018lt.LIZJ("NoticeCardAdapter", "deleteData error", th);
        C56760MPk.LIZLLL((BaseNotice) afS48S0300000_9.l0, null, th);
        C26045AKb c26045AKb = new C26045AKb(((C56818MRq) afS48S0300000_9.l1).LJLIL);
        c26045AKb.LJIIIZ(((Context) afS48S0300000_9.l2).getString(R.string.hfw));
        c26045AKb.LJIIJ();
    }

    public AfS48S0300000_9(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
