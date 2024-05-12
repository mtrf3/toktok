package X;

import Y.ACListenerS19S0201000_1;
import Y.AObserverS69S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3X9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3X9 extends AbstractC28801Bc<C3H6, C3XA> {
    public int LJLIL;
    public InterfaceC88471Ynr<? super IMUser, ? super Integer, C76800UCe> LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public C3X9() {
        super(new AbstractC03160Am<C3H6>() { // from class: X.3X6
            @Override // X.AbstractC03160Am
            public final boolean LIZ(C3H6 c3h6, C3H6 c3h62) {
                C3H6 c3h63 = c3h6;
                C3H6 c3h64 = c3h62;
                if (c3h63.LJLILLLLZI == c3h64.LJLILLLLZI && c3h63.LJLJI == c3h64.LJLJI) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC03160Am
            public final boolean LIZIZ(C3H6 c3h6, C3H6 c3h62) {
                return o.LJ(c3h6.LJLIL.getUid(), c3h62.LJLIL.getUid());
            }
        });
        this.LJLJI = C221108m2.LIZIZ(C3XB.LJLIL);
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        LiveData<ActivityStatus> liveData;
        C3XA holder = (C3XA) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        ActivityC45651qj LJ = C1DG.LJ(holder.LJLIL, "itemView.context");
        if (LJ != null && (liveData = holder.LJLJLJ) != null) {
            liveData.observe(LJ, new AObserverS69S0100000_1(holder, 151));
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        LiveData<ActivityStatus> liveData;
        C3XA holder = (C3XA) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        ActivityC45651qj LJ = C1DG.LJ(holder.LJLIL, "itemView.context");
        if (LJ != null && (liveData = holder.LJLJLJ) != null) {
            liveData.removeObservers(LJ);
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        String displayName;
        C3B2 c3b2;
        C3XA holder = (C3XA) viewHolder;
        o.LJIIIZ(holder, "holder");
        C3H6 item = getItem(i);
        o.LJIIIIZZ(item, "getItem(position)");
        C3H6 c3h6 = item;
        W5F LJ = C45S.LJ(holder.LJLJJI, C78939UyV.LJ(c3h6.LJLIL.getDisplayAvatar()), R.drawable.b0p, 0, null, 24);
        LJ.LJJIII = EnumC62195Ob1.SMALL;
        C43659HBn.LJIIZILJ(LJ, "GroupMentionViewHolder", c3h6.LJLIL.getUid(), 0, null, 28);
        View view = holder.LJLJJL;
        if (c3h6.LJLILLLLZI) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        TuxTextView tuxTextView = holder.LJLJL;
        if (o.LJ(c3h6.LJLIL.getUid(), CardStruct.IStatusCode.DEFAULT)) {
            int i3 = c3h6.LJLJI;
            if (i3 > 0) {
                displayName = holder.LJLIL.getContext().getString(R.string.eov, Integer.valueOf(i3));
            } else {
                displayName = holder.LJLIL.getContext().getString(R.string.eow);
            }
        } else {
            displayName = c3h6.LJLIL.getDisplayName();
        }
        tuxTextView.setText(displayName);
        C16880lQ.LJIIJ(new ACListenerS19S0201000_1(holder, c3h6, i, 11), holder.LJLIL);
        LiveData<ActivityStatus> liveData = null;
        if (!o.LJ(c3h6.LJLIL.getUid(), CardStruct.IStatusCode.DEFAULT) && (c3b2 = holder.LJLILLLLZI) != null) {
            String uid = c3h6.LJLIL.getUid();
            o.LJIIIIZZ(uid, "data.user.uid");
            liveData = C3B3.LIZ(c3b2, uid, null, null, 14);
        }
        holder.LJLJLJ = liveData;
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.b36, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C3XA c3xa = new C3XA(view, (C3B2) this.LJLJI.getValue(), this.LJLILLLLZI, this.LJLIL);
        C0AX.LIZ(viewGroup, c3xa.itemView, R.id.lj7);
        View view2 = c3xa.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c3xa.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C3XA.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c3xa.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c3xa.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C3XA.class.getName();
        return c3xa;
    }
}
