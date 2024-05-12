package com.ss.android.ugc.now.interaction.assem;

import X.AbstractC13940gg;
import X.AnonymousClass729;
import X.C12460eI;
import X.C16880lQ;
import X.C188627ak;
import X.C19N;
import X.C1DI;
import X.C221108m2;
import X.C56331M8x;
import X.C62562cu;
import X.C62822Ol8;
import X.C71799SFv;
import X.InterfaceC100393wp;
import Y.ACListenerS38S0200000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.assem.ViewerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ViewerCell extends PowerCell<ViewerItem> {
    public User LJLJJLL;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1394));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1398));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1399));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1395));
    public String LJLJJL = "";
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1397));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        if (C19N.LJ("2860_avatar_distribute_expansion_switch", true)) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C12460eI.LIZJ(itemView, new AbstractC13940gg(this) { // from class: X.7Cj
                public InterfaceC65784Pro<String> LJ;
                public final C182007Ci LJFF;

                @Override // X.AbstractC13940gg
                public final InterfaceC65784Pro<String> LIZJ() {
                    return this.LJ;
                }

                @Override // X.AbstractC13940gg
                public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
                    return this.LJFF;
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [X.7Ci] */
                {
                    this.LJ = new AqS153S0100000_3(this, 1396);
                    this.LJFF = new InterfaceC19530ph() { // from class: X.7Ci
                        @Override // X.InterfaceC19530ph
                        public final void LIZ(View view, String itemID) {
                            InterfaceC100393wp interfaceC100393wp;
                            o.LJIIIZ(itemID, "itemID");
                            Object value = ViewerCell.this.LJLILLLLZI.getValue();
                            o.LJIIIIZZ(value, "<get-socPubAvatarFrameLayout>(...)");
                            if (((C53691L5j) value).getMode() != EnumC53695L5n.NONE && (interfaceC100393wp = (InterfaceC100393wp) ViewerCell.this.LJLJL.getValue()) != null) {
                                Object value2 = ViewerCell.this.LJLILLLLZI.getValue();
                                o.LJIIIIZZ(value2, "<get-socPubAvatarFrameLayout>(...)");
                                interfaceC100393wp.LJFF(((C53691L5j) value2).getMode());
                            }
                        }
                    };
                }

                @Override // X.AbstractC13940gg
                public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                    this.LJ = interfaceC65784Pro;
                }
            });
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(ViewerItem viewerItem) {
        String str;
        Integer valueOf;
        ViewerItem t = viewerItem;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        this.LJLJJLL = t.getUser();
        NowFeedMobHierarchyData interactionHierarchyData = t.getInteractionHierarchyData();
        String str2 = "";
        if (interactionHierarchyData == null || (str = interactionHierarchyData.getEnterFrom()) == null) {
            str = "";
        }
        this.LJLJJL = str;
        TextView textView = (TextView) this.LJLJI.getValue();
        User user = this.LJLJJLL;
        String str3 = null;
        if (user != null) {
            str3 = C56331M8x.LIZIZ(user, true, true);
        }
        textView.setText(str3);
        User user2 = this.LJLJJLL;
        if (user2 != null && (valueOf = Integer.valueOf(user2.getViewerType())) != null) {
            if (valueOf.intValue() == 1) {
                str2 = this.itemView.getContext().getResources().getString(R.string.j7l);
            } else if (valueOf.intValue() == 2) {
                str2 = this.itemView.getContext().getResources().getString(R.string.j81);
            }
        }
        o.LJIIIIZZ(str2, "when (user?.viewerType) …\"\n            }\n        }");
        if (str2.length() == 0) {
            ((View) this.LJLJJI.getValue()).setVisibility(8);
        } else {
            ((C188627ak) this.LJLJJI.getValue()).getTvDesc().setText(str2);
            ((View) this.LJLJJI.getValue()).setVisibility(0);
        }
        Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gv);
        if (LIZIZ != null) {
            ((C188627ak) this.LJLJJI.getValue()).setTextColor(LIZIZ.intValue());
        }
        C62562cu LIZ = AnonymousClass729.LIZ(this.LJLJJLL);
        if (LIZ != null) {
            C71799SFv ivAvatar = (C71799SFv) this.LJLIL.getValue();
            o.LJIIIIZZ(ivAvatar, "ivAvatar");
            C71799SFv.LJIIJ(ivAvatar, LIZ, null, false, null, 110);
        }
        C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, t, 80), this.itemView);
        InterfaceC100393wp interfaceC100393wp = (InterfaceC100393wp) this.LJLJL.getValue();
        if (interfaceC100393wp != null) {
            interfaceC100393wp.LJI(this.LJLJJLL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bau, viewGroup, false, "from(parent.context).inf…em_viewer, parent, false)");
    }
}
