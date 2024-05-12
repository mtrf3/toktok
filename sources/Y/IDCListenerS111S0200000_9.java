package Y;

import X.AYY;
import X.C4LD;
import X.C55096Ljo;
import X.C55230Lly;
import X.C57826Mmk;
import X.C65352Pkq;
import X.C79234V7u;
import X.InterfaceC57932MoS;
import X.MFV;
import X.MFX;
import X.MH9;
import X.X1D;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDCListenerS111S0200000_9 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            default:
                return false;
        }
    }

    public static final boolean onLongClick$0(IDCListenerS111S0200000_9 iDCListenerS111S0200000_9, View view) {
        Fragment LJIIIZ;
        Lifecycle lifecycle;
        String str;
        AbsRecUserCell absRecUserCell = (AbsRecUserCell) iDCListenerS111S0200000_9.l0;
        Object obj = null;
        try {
            if (!o.LJ(absRecUserCell.itemView.getTag(R.id.n1_), Boolean.TRUE)) {
                LifecycleOwner lifecycleOwner = absRecUserCell.getLifecycleOwner();
                if ((((lifecycleOwner instanceof Fragment) && (LJIIIZ = (Fragment) lifecycleOwner) != null) || (LJIIIZ = C79234V7u.LJIIIZ(absRecUserCell.itemView)) != null) && (LJIIIZ.isDetached() || !LJIIIZ.isAdded())) {
                    AYY.LIZ.getClass();
                    AYY.LIZ("Ability", "attach fragment illegal!", null);
                } else {
                    LifecycleOwner lifecycleOwner2 = absRecUserCell.getLifecycleOwner();
                    if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                            AYY.LIZ.getClass();
                            AYY.LIZ("Ability", "get ability illegal!", null);
                        } else {
                            InterfaceC57932MoS L = absRecUserCell.L();
                            if (L != null) {
                                str = L.LJJIFFI();
                            } else {
                                str = null;
                            }
                            View itemView = absRecUserCell.itemView;
                            o.LJIIIIZZ(itemView, "itemView");
                            Object LIZ = C55096Ljo.LIZ(C55230Lly.LJ(itemView), IUserCardListAbility.class, str);
                            if (LIZ == null) {
                                AYY ayy = AYY.LIZ;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(str);
                                LIZ2.append("'s ");
                                LIZ2.append(C65352Pkq.LIZ(IUserCardListAbility.class).LJFF());
                                LIZ2.append(" not found, parent: ");
                                LIZ2.append(absRecUserCell.itemView.getParent());
                                String LIZIZ = X1D.LIZIZ(LIZ2);
                                ayy.getClass();
                                AYY.LIZ("Ability", LIZIZ, null);
                            }
                            obj = LIZ;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            AYY.LIZ.getClass();
            AYY.LIZ("Ability", "get ability error!", th);
        }
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) obj;
        if (iUserCardListAbility != null) {
            iUserCardListAbility.Ju0(new AqS140S0200000_9((RecUser) iDCListenerS111S0200000_9.l1, (RecUser) iDCListenerS111S0200000_9.l0, (AbsRecUserCell<C57826Mmk>) 90));
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$1(IDCListenerS111S0200000_9 iDCListenerS111S0200000_9, View view) {
        MFV mfv = (MFV) iDCListenerS111S0200000_9.l0;
        MH9 mh9 = (MH9) iDCListenerS111S0200000_9.l1;
        Aweme aweme = mfv.LJLIL;
        if (aweme != null && mh9 != null) {
            mh9.bl(mfv.LLIIIJ, view, aweme, mfv.LJLJLLL);
        }
        return C4LD.LIZIZ.LJJJJJ(MFX.LIZ(Integer.valueOf(mfv.LLIIIJ)));
    }

    public IDCListenerS111S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
