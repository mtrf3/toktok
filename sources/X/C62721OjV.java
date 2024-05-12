package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.friendlist.cell.InviteFriendUserCell;
import com.zhiliaoapp.musically.R;

/* renamed from: X.OjV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62721OjV implements InterfaceC108394Nf {
    public final /* synthetic */ InviteFriendUserCell LIZ;
    public final /* synthetic */ User LIZIZ;

    @Override // X.InterfaceC108394Nf
    public final void LIZ(AbstractC108384Ne abstractC108384Ne) {
        if (abstractC108384Ne instanceof C108364Nc) {
            Integer LIZIZ = C19N.LIZIZ(this.LIZ.itemView, "itemView.context", R.attr.e8);
            if (LIZIZ != null) {
                InviteFriendUserCell inviteFriendUserCell = this.LIZ;
                int intValue = LIZIZ.intValue();
                C5S1 c5s1 = new C5S1(inviteFriendUserCell.itemView.getContext());
                c5s1.LIZLLL(inviteFriendUserCell.itemView.getContext().getString(R.string.j39));
                c5s1.LIZ(R.raw.icon_tick_fill_small);
                C26045AKb c26045AKb = c5s1.LIZIZ;
                if (c26045AKb != null) {
                    c26045AKb.LJI(intValue);
                }
                c5s1.LJ();
            }
            C62722OjW.LIZ(this.LIZIZ.getUid(), EnumC62723OjX.SEND_SUCCESS, this.LIZ.getAbsoluteAdapterPosition());
            return;
        }
        if (!(abstractC108384Ne instanceof C108344Na)) {
            return;
        }
        C62722OjW.LIZ(this.LIZIZ.getUid(), EnumC62723OjX.SEND_FAIL, this.LIZ.getAbsoluteAdapterPosition());
    }

    public C62721OjV(InviteFriendUserCell inviteFriendUserCell, User user) {
        this.LIZ = inviteFriendUserCell;
        this.LIZIZ = user;
    }
}
