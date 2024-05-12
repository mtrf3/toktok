package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.brdatagift.BemobiGiftServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class LX3 extends C51031K1b<C54883LgN> {
    public boolean LJLJJL;
    public InterfaceC51032K1c LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public final Fragment LJLJLLL;
    public InterfaceC51033K1d LJLL;

    public final void LJJIIZ() {
        if (this.LJLJJL) {
            this.LJLJJL = false;
            ((C54883LgN) this.LJLIL).LJLJI = false;
        }
        if (this.LJLJLJ) {
            C2U8.LIZ(new C54409LWz("DISCOVER"));
        } else {
            C2U8.LIZ(new C54409LWz());
        }
    }

    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public final void onSuccess() {
        K k;
        C48027It5.LJ("feed", "follow");
        LJJIIZ();
        InterfaceC51032K1c interfaceC51032K1c = this.LJLJJLL;
        boolean z = true;
        if (interfaceC51032K1c != null) {
            interfaceC51032K1c.c0(true);
        }
        this.LJLJL = false;
        T t = this.LJLIL;
        if (t == 0) {
            return;
        }
        C54883LgN c54883LgN = (C54883LgN) t;
        int i = c54883LgN.mListQueryType;
        if (i != 1) {
            if (i != 2) {
                if (i == 4 && (k = this.LJLILLLLZI) != 0) {
                    InterfaceC223218pR interfaceC223218pR = (InterfaceC223218pR) k;
                    List<Aweme> LJIIJJI = c54883LgN.LJIIJJI();
                    if (!((AbstractC51036K1g) this.LJLIL).isHasMore() || ((AbstractC51036K1g) this.LJLIL).isNewDataEmpty()) {
                        z = false;
                    }
                    interfaceC223218pR.j0(LJIIJJI, z);
                }
            } else {
                K k2 = this.LJLILLLLZI;
                if (k2 != 0) {
                    ((InterfaceC223218pR) k2).jh(c54883LgN.LJIIJJI(), true ^ ((AbstractC51036K1g) this.LJLIL).isNewDataEmpty());
                }
            }
        } else if (c54883LgN.isDataEmpty()) {
            K k3 = this.LJLILLLLZI;
            if (k3 != 0) {
                ((InterfaceC223218pR) k3).Ne();
            }
        } else {
            K k4 = this.LJLILLLLZI;
            if (k4 != 0) {
                ((InterfaceC223218pR) k4).J5(((C54883LgN) this.LJLIL).LJIIJJI(), ((AbstractC51036K1g) this.LJLIL).isHasMore());
            }
        }
        LYH.LIZJ(MG5.FOLLOW_FEED);
    }

    @Override // X.C51031K1b, X.C8BR
    public final void LIZIZ() {
        super.LIZIZ();
        this.LJLL = null;
    }

    public LX3(Fragment fragment) {
        this.LJLJLLL = fragment;
    }

    @Override // X.C8BR
    public final boolean LJIILL(Object... objArr) {
        InterfaceC51032K1c interfaceC51032K1c = this.LJLJJLL;
        if (interfaceC51032K1c != null) {
            interfaceC51032K1c.c0(this.LJLJL);
        }
        LYH.LIZLLL(MG5.FOLLOW_FEED, this.LJLJLLL.mo49getActivity());
        BemobiGiftServiceImpl.LIZIZ().LIZ("follow");
        return super.LJIILL(objArr);
    }

    @Override // X.C51031K1b
    public final void LJJIII(InterfaceC51033K1d interfaceC51033K1d) {
        this.LJLL = interfaceC51033K1d;
    }

    @Override // X.C51031K1b
    public final boolean LJJIIJ(Object obj) {
        if (obj instanceof Aweme) {
            List items = ((AbstractC51036K1g) this.LJLIL).getItems();
            if (!C79004UzY.LJJIFFI(items)) {
                int size = items.size();
                for (int i = 0; i < size; i++) {
                    AbstractC49325JXl abstractC49325JXl = (AbstractC49325JXl) ListProtector.get(items, i);
                    if (TextUtils.equals(((Aweme) obj).getAid(), C227768wm.LIZIZ(abstractC49325JXl.getAweme()))) {
                        ((AbstractC51036K1g) this.LJLIL).deleteItem(abstractC49325JXl);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public final void onFailed(final Exception exc) {
        C48027It5.LIZIZ(C64920Pds.LIZ(EF7.LIZIZ(), exc), "feed", "follow");
        LJJIIZ();
        InterfaceC51032K1c interfaceC51032K1c = this.LJLJJLL;
        final int i = 1;
        if (interfaceC51032K1c != null) {
            interfaceC51032K1c.c0(true);
        }
        this.LJLJL = false;
        T t = this.LJLIL;
        if (t == 0) {
            return;
        }
        int i2 = ((AbstractC51036K1g) t).mListQueryType;
        if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                if (i2 != 4) {
                    i = -1;
                } else {
                    K k = this.LJLILLLLZI;
                    if (k != 0) {
                        ((InterfaceC223218pR) k).nc(exc);
                    }
                }
            } else {
                K k2 = this.LJLILLLLZI;
                if (k2 != 0) {
                    ((InterfaceC223218pR) k2).Qw(exc);
                }
                i = 3;
            }
        } else {
            K k3 = this.LJLILLLLZI;
            if (k3 != 0) {
                ((InterfaceC223218pR) k3).cb0(exc);
            }
        }
        C10K.LIZJ(new Callable() { // from class: X.3dv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i3;
                Exception exc2 = exc;
                int i4 = i;
                if (exc2 instanceof C38306F1q) {
                    i3 = ((C38306F1q) exc2).getErrorCode();
                } else if (exc2 instanceof C64698PaI) {
                    i3 = -10001;
                } else if (exc2 instanceof IOException) {
                    i3 = -10002;
                } else {
                    i3 = -10000;
                }
                String message = exc2.getMessage();
                String stackTraceString = android.util.Log.getStackTraceString(exc2);
                C188727au LIZJ = C0RN.LIZJ(i4, "type", i3, "error_code");
                LIZJ.LJIIIZ("error_msg", message);
                LIZJ.LJIIIZ("stack_msg", stackTraceString);
                FMX.LJIIL("follow_feed_request_monitor", LIZJ.LIZ);
                return null;
            }
        });
        LYH.LIZJ(MG5.FOLLOW_FEED);
    }

    @Override // X.C51031K1b, X.InterfaceC51034K1e
    public final void onItemDeleted(int i) {
        InterfaceC51033K1d interfaceC51033K1d = this.LJLL;
        if (interfaceC51033K1d != null) {
            interfaceC51033K1d.onItemDeleted(i);
        }
    }

    @Override // X.C51031K1b
    public final boolean LJJIIJZLJL(Object obj, int i) {
        List items = ((AbstractC51036K1g) this.LJLIL).getItems();
        if (C79004UzY.LJJIFFI(items)) {
            items = new ArrayList();
        }
        if (i < 0 || i > items.size()) {
            return false;
        }
        ListProtector.add(items, i, obj);
        ((AbstractC51036K1g) this.LJLIL).setItems(items);
        if (this.LJLILLLLZI != 0) {
            if (((AbstractC51036K1g) this.LJLIL).isDataEmpty()) {
                ((InterfaceC223218pR) this.LJLILLLLZI).Ne();
                return true;
            }
            onItemInserted(((C54883LgN) this.LJLIL).LJIIJJI(), i);
            return true;
        }
        return true;
    }

    @Override // X.C51031K1b, X.InterfaceC51034K1e
    public final void onItemInserted(List list, int i) {
        InterfaceC51033K1d interfaceC51033K1d = this.LJLL;
        if (interfaceC51033K1d != null) {
            interfaceC51033K1d.onItemInserted(list, i);
        }
    }
}
