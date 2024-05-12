package X;

import android.content.Context;
import android.view.KeyEvent;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightMediaListViewModel;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MLg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56652MLg {
    public static WeakReference<InterfaceC56632MKm> LIZ;
    public static final C56653MLh LIZIZ = new C56653MLh();
    public static final C56434MCw LIZJ = new C56434MCw();

    public static InterfaceC56632MKm LIZ(Context context) {
        boolean z;
        C221018lt.LJFF("SkylightController", "createViewHolderIfNeed");
        if (L2W.LIZIZ() && !C53339KwZ.LJ()) {
            z = M9O.LIZ().LIZLLL();
        } else {
            z = true;
        }
        if (C53339KwZ.LJ()) {
            C56975MXr c56975MXr = new C56975MXr(new MKT(context));
            c56975MXr.setIsRecyclable(false);
            LIZ = new WeakReference<>(c56975MXr);
            return c56975MXr;
        }
        if (L2P.LIZ()) {
            C56977MXt c56977MXt = new C56977MXt(new MKT(context), z);
            c56977MXt.setIsRecyclable(false);
            LIZ = new WeakReference<>(c56977MXt);
            return c56977MXt;
        }
        C56976MXs c56976MXs = new C56976MXs(new MKT(context), z);
        c56976MXs.setIsRecyclable(false);
        LIZ = new WeakReference<>(c56976MXs);
        return c56976MXs;
    }

    public static InterfaceC56632MKm LIZIZ(Context context) {
        InterfaceC56632MKm interfaceC56632MKm;
        WeakReference<InterfaceC56632MKm> weakReference = LIZ;
        if (weakReference == null || (interfaceC56632MKm = weakReference.get()) == null || !C54838Lfe.LJIIJJI(interfaceC56632MKm.LJIJ())) {
            return LIZ(context);
        }
        return interfaceC56632MKm;
    }

    public static SkylightListViewModel LIZJ(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C56651MLf c56651MLf = C56651MLf.LJLIL;
        return (SkylightListViewModel) new C214378bB(C65352Pkq.LIZ(SkylightListViewModel.class), c56651MLf, C214528bQ.LJLIL, C78926UyI.LJJII(owner, false), C184077Kh.LJLIL, C56654MLi.INSTANCE, null, null).getValue();
    }

    public static SkylightMediaListViewModel LIZLLL(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C56656MLk c56656MLk = C56656MLk.LJLIL;
        return (SkylightMediaListViewModel) new C214378bB(C65352Pkq.LIZ(SkylightMediaListViewModel.class), c56656MLk, C214528bQ.LJLIL, C78926UyI.LJJII(owner, false), C184077Kh.LJLIL, C56655MLj.INSTANCE, null, null).getValue();
    }

    public static void LJ(List list) {
        Object obj;
        KeyEvent.Callback callback;
        InterfaceC56632MKm interfaceC56632MKm;
        C72808Sho<InterfaceC57784Mm4> state;
        RecyclerView.ViewHolder viewHolder;
        if (list == null) {
            return;
        }
        C221018lt.LJFF("SkylightController", "start show");
        WeakReference<InterfaceC56632MKm> weakReference = LIZ;
        MKT mkt = null;
        if (weakReference != null) {
            obj = (InterfaceC56632MKm) weakReference.get();
        } else {
            obj = null;
        }
        if ((obj instanceof MMX) && (viewHolder = (RecyclerView.ViewHolder) obj) != null) {
            callback = viewHolder.itemView;
        } else {
            callback = null;
        }
        if (callback instanceof MKT) {
            mkt = (MKT) callback;
        }
        if (!list.isEmpty()) {
            if (mkt != null && (state = mkt.getState()) != null) {
                state.LJ(list);
            }
            LIZIZ.LIZJ();
            if (mkt != null) {
                mkt.LJLLJ();
                return;
            }
            return;
        }
        WeakReference<InterfaceC56632MKm> weakReference2 = LIZ;
        if (weakReference2 == null || (interfaceC56632MKm = weakReference2.get()) == null) {
            return;
        }
        interfaceC56632MKm.LJLJJL(true);
    }
}
