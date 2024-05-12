package com.ss.android.ugc.aweme.relation.mutual;

import X.AbstractC13940gg;
import X.C12460eI;
import X.C16880lQ;
import X.C1DI;
import X.C226668v0;
import X.C3GU;
import X.C56331M8x;
import X.C71799SFv;
import X.C78939UyV;
import X.EnumC112694bZ;
import Y.ACListenerS36S0200000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.mutual.MutualRelationCell;
import com.zhiliaoapp.musically.R;
import java.util.Objects;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MutualRelationCell extends PowerCell<C3GU> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C12460eI.LIZIZ(itemView, new AbstractC13940gg(this) { // from class: X.4Wy
            public final C110894Wv LJ;

            @Override // X.AbstractC13940gg
            public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
                return this.LJ;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.4Wv] */
            {
                this.LJ = new InterfaceC19530ph() { // from class: X.4Wv
                    @Override // X.InterfaceC19530ph
                    public final void LIZ(View view, String itemID) {
                        o.LJIIIZ(itemID, "itemID");
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("on simple expose for ");
                        LIZ.append(MutualRelationCell.this.getAbsoluteAdapterPosition());
                        C221018lt.LIZ("MutualRelationCell", X1D.LIZIZ(LIZ));
                        C3GU item = MutualRelationCell.this.getItem();
                        if (item != null) {
                            final User user = item.LJLIL;
                            final int i = item.LJLILLLLZI;
                            new AbstractC238349Xa(user, i) { // from class: X.4Ww
                                public final User LIZIZ;
                                public final int LIZJ;
                                public final String LIZLLL;
                                public final java.util.Map<String, String> LJ;

                                public final Object[] LJ() {
                                    return new Object[]{this.LIZIZ, Integer.valueOf(this.LIZJ)};
                                }

                                public final boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj instanceof C110904Ww) {
                                        return C78966Uyw.LJIIIZ(((C110904Ww) obj).LJ(), LJ());
                                    }
                                    return false;
                                }

                                public final int hashCode() {
                                    return Objects.hash(LJ());
                                }

                                public final String toString() {
                                    return C78966Uyw.LJJJLL("MutualConnectionListUserTracker:%s,%s", LJ());
                                }

                                @Override // X.AbstractC238349Xa
                                public final String LIZ() {
                                    return this.LIZLLL;
                                }

                                @Override // X.AbstractC238349Xa
                                public final java.util.Map<String, String> LIZIZ() {
                                    return this.LJ;
                                }

                                {
                                    String str;
                                    o.LJIIIZ(user, "user");
                                    this.LIZIZ = user;
                                    this.LIZJ = i;
                                    this.LIZLLL = "mutual_connection_list_user_show";
                                    C188727au c188727au = new C188727au();
                                    c188727au.LJIIIZ("enter_from", "mutual_connection_page");
                                    if (user.getFollowStatus() == 2) {
                                        str = "mutual";
                                    } else {
                                        str = "single";
                                    }
                                    c188727au.LJIIIZ("follow_type", str);
                                    c188727au.LIZLLL(i, "impr_order");
                                    c188727au.LJIIIZ("to_user_id", user.getUid());
                                    java.util.Map<String, String> map = c188727au.LIZ;
                                    o.LJIIIIZZ(map, "newBuilder()\n        .ap…r.uid)\n        .builder()");
                                    this.LJ = map;
                                }
                            }.LIZLLL(null);
                        }
                    }
                };
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C3GU c3gu) {
        C3GU curItem = c3gu;
        o.LJIIIZ(curItem, "curItem");
        View view = this.itemView;
        C71799SFv user_avatar = (C71799SFv) view.findViewById(R.id.my0);
        o.LJIIIIZZ(user_avatar, "user_avatar");
        C71799SFv.LJIIJ(user_avatar, C78939UyV.LJ(curItem.LJLIL.getAvatarThumb()), null, false, null, 126);
        ((TextView) view.findViewById(R.id.mzt)).setText(C56331M8x.LIZIZ(curItem.LJLIL, true, false));
        ((TextView) view.findViewById(R.id.myt)).setText(C56331M8x.LIZ(curItem.LJLIL, true, false));
        RelationButton relationButton = (RelationButton) view.findViewById(R.id.n09);
        C226668v0 c226668v0 = new C226668v0();
        c226668v0.LIZ = curItem.LJLIL;
        c226668v0.LIZIZ = true;
        c226668v0.LJIIIIZZ = false;
        c226668v0.LIZIZ(EnumC112694bZ.MESSAGE);
        relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
        ((RelationButton) view.findViewById(R.id.n09)).setTracker(new AqS151S0100000_1(curItem, 837));
        C16880lQ.LJIIJ(new ACListenerS36S0200000_1(curItem, this, 33), view);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bvq, viewGroup, false, "from(parent.context)\n   …list_cell, parent, false)");
    }
}
