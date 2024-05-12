package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.liveevent.LiveEventModule;
import com.ss.android.ugc.aweme.liveevent.LiveEventSelectionFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gqh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42783Gqh extends C8BR<C3I3, InterfaceC42777Gqb> implements InterfaceC51034K1e<Object> {
    public LiveEventSelectionFragment LJLJJI;

    @Override // X.InterfaceC51034K1e
    public final void onItemDeleted(int i) {
    }

    @Override // X.InterfaceC51034K1e
    public final void onItemInserted(List<Object> list, int i) {
    }

    @Override // X.InterfaceC51034K1e
    public final /* synthetic */ boolean onItemInsertedNew(C2KF<Object> c2kf) {
        return false;
    }

    @Override // X.C8BR, X.InterfaceC223218pR
    public final void LJII() {
        T t = this.LJLIL;
        if (t == 0 || this.LJLILLLLZI == 0) {
            return;
        }
        o.LJI(t);
        int i = ((AbstractC51036K1g) t).mListQueryType;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return;
                }
                K k = this.LJLILLLLZI;
                o.LJI(k);
                ((InterfaceC223218pR) k).showLoadMoreLoading();
                return;
            }
            K k2 = this.LJLILLLLZI;
            o.LJI(k2);
            ((InterfaceC223218pR) k2).Iw();
            return;
        }
        K k3 = this.LJLILLLLZI;
        o.LJI(k3);
        ((InterfaceC223218pR) k3).LJII();
    }

    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        T t = this.LJLIL;
        if (t == 0 || this.LJLILLLLZI == 0) {
            return;
        }
        o.LJI(t);
        K k = this.LJLILLLLZI;
        o.LJI(k);
        ((InterfaceC42777Gqb) k).PK();
        T t2 = this.LJLIL;
        o.LJI(t2);
        int i = ((AbstractC51036K1g) t2).mListQueryType;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return;
                }
                K k2 = this.LJLILLLLZI;
                o.LJI(k2);
                T t3 = this.LJLIL;
                o.LJI(t3);
                List<Object> list = ((C3I3) t3).LJLIL;
                o.LJI(this.LJLIL);
                ((InterfaceC223218pR) k2).j0(list, false);
                return;
            }
            K k3 = this.LJLILLLLZI;
            o.LJI(k3);
            T t4 = this.LJLIL;
            o.LJI(t4);
            List<Object> list2 = ((C3I3) t4).LJLIL;
            T t5 = this.LJLIL;
            o.LJI(t5);
            ((InterfaceC223218pR) k3).jh(list2, true ^ ((AbstractC51036K1g) t5).isNewDataEmpty());
            return;
        }
        T t6 = this.LJLIL;
        o.LJI(t6);
        List<LiveEventModule> list3 = ((C3I3) t6).LJLILLLLZI;
        if (list3 == null || ((ArrayList) list3).isEmpty()) {
            K k4 = this.LJLILLLLZI;
            o.LJI(k4);
            ((InterfaceC223218pR) k4).Ne();
        } else {
            K k5 = this.LJLILLLLZI;
            o.LJI(k5);
            T t7 = this.LJLIL;
            o.LJI(t7);
            List<Object> list4 = ((C3I3) t7).LJLIL;
            o.LJI(this.LJLIL);
            ((InterfaceC223218pR) k5).J5(list4, false);
        }
        o.LJI(this.LJLIL);
        if (this.LJLJJI == null || TextUtils.isEmpty(null)) {
            return;
        }
        o.LJI(this.LJLJJI);
        o.LJI(null);
        throw null;
    }

    @Override // X.C8BR
    public final void LIZIZ() {
        super.LIZIZ();
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        T t = this.LJLIL;
        if (t == 0 || this.LJLILLLLZI == 0) {
            return;
        }
        o.LJI(t);
        K k = this.LJLILLLLZI;
        o.LJI(k);
        ((InterfaceC42777Gqb) k).PK();
        T t2 = this.LJLIL;
        o.LJI(t2);
        int i = ((AbstractC51036K1g) t2).mListQueryType;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return;
                }
                K k2 = this.LJLILLLLZI;
                o.LJI(k2);
                ((InterfaceC223218pR) k2).nc(e);
                return;
            }
            K k3 = this.LJLILLLLZI;
            o.LJI(k3);
            ((InterfaceC223218pR) k3).Qw(e);
            return;
        }
        K k4 = this.LJLILLLLZI;
        o.LJI(k4);
        ((InterfaceC223218pR) k4).cb0(e);
    }
}
