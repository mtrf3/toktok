package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Xf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85513Xf extends MK7 {
    public List<? extends IMUser> LJLIL;
    public final C73318Sq2 LJLILLLLZI;

    @Override // X.C4II
    public final int getBasicItemCount() {
        return this.LJLIL.size();
    }

    public C85513Xf(C61878OQg data) {
        o.LJIIIZ(data, "data");
        this.LJLIL = data;
        this.LJLILLLLZI = new C73318Sq2();
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.LJLILLLLZI.dispose();
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        o.LJII(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qainvitation.invitedYou.QAInvitedYouUsersListAdapter.QAInvitedYouUsersListViewHolder");
        ((C89913fv) viewHolder).bind(i, (IMUser) ListProtector.get(this.LJLIL, i));
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        return new C89913fv(C1FL.LIZIZ(parent, R.layout.c_o, parent, false, "from(parent.context)\n   …user_item, parent, false)"), this, this.LJLIL);
    }
}
