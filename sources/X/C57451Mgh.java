package X;

import Y.ACListenerS38S0200000_3;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Mgh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57451Mgh extends C8HS<IMUser> {
    public String LJLIL = "";

    static {
        C16880lQ.LJLLJ(C57451Mgh.class);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final C57452Mgi c57452Mgi = (C57452Mgi) viewHolder;
        final IMUser iMUser = (IMUser) ListProtector.get(this.mmItems, i);
        c57452Mgi.getClass();
        final User user = IMUser.toUser(iMUser);
        if (user.getFollowStatus() == 2) {
            user.setFollowerStatus(1);
        }
        C16880lQ.LJIIJ(new ACListenerS38S0200000_3(user, c57452Mgi, 60), c57452Mgi.itemView);
        c57452Mgi.LJLIL.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
        c57452Mgi.LJLILLLLZI.setText(C56331M8x.LIZJ(iMUser.getNickName(), iMUser.getDisplayId(), true, false));
        TextView textView = c57452Mgi.LJLJI;
        String nickName = iMUser.getNickName();
        String displayId = iMUser.getDisplayId();
        User user2 = new User();
        user2.setNickname(nickName);
        user2.setUniqueId(displayId);
        textView.setText(C56331M8x.LIZ(user2, true, false));
        RelationButton relationButton = c57452Mgi.LJLJJI;
        C226668v0 c226668v0 = new C226668v0();
        c226668v0.LIZ = user;
        c226668v0.LIZIZ = false;
        c226668v0.LIZIZ(EnumC112694bZ.FRIENDS);
        relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
        c57452Mgi.LJLJJI.setFollowClickListener(new InterfaceC88471Ynr() { // from class: X.MgW
            @Override // X.InterfaceC88471Ynr
            public final Object invoke(Object obj, Object obj2) {
                final String str;
                C57452Mgi c57452Mgi2 = C57452Mgi.this;
                final User user3 = user;
                c57452Mgi2.getClass();
                if (obj2 == EnumC57435MgR.FOLLOWED) {
                    str = "1007";
                } else {
                    str = "1036";
                }
                c57452Mgi2.LJLJJI.setTracker(new InterfaceC65784Pro() { // from class: X.MgV
                    @Override // X.InterfaceC65784Pro
                    public final Object invoke() {
                        return new C57430MgM("common_relation", User.this, "follow_button", null, "others_homepage", null, null, null, str, null, null, null, null, null, null, null, null, null, 0, 0, null, -1, false, -1, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null);
                    }
                });
                return null;
            }
        });
        c57452Mgi.LJLJJI.setDataChangeListener(new InterfaceC88472Yns() { // from class: X.Mgj
            @Override // X.InterfaceC88472Yns
            public final Object invoke(Object obj) {
                C57452Mgi c57452Mgi2 = C57452Mgi.this;
                IMUser iMUser2 = iMUser;
                c57452Mgi2.LJLILLLLZI.setText(iMUser2.getDisplayId());
                c57452Mgi2.LJLJI.setText(iMUser2.getNickName());
                iMUser2.setFollowStatus(((EnumC57435MgR) obj).getValue());
                return null;
            }
        });
        c57452Mgi.LJLJJLL.getLayoutParams().width = 0;
        c57452Mgi.LJLIL.LIZ();
        AJ9.LJ(c57452Mgi.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), c57452Mgi.LJLILLLLZI);
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        return new C57452Mgi(this, C28289B8j.LIZ(viewGroup, R.layout.c5d, viewGroup, false));
    }
}
