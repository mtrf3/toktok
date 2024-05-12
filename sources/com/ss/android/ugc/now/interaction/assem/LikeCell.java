package com.ss.android.ugc.now.interaction.assem;

import X.AbstractC13940gg;
import X.AnonymousClass729;
import X.C12460eI;
import X.C16880lQ;
import X.C198507qg;
import X.C19N;
import X.C1DI;
import X.C2068389v;
import X.C221108m2;
import X.C53691L5j;
import X.C56331M8x;
import X.C62562cu;
import X.C62822Ol8;
import X.C71799SFv;
import X.C7MY;
import X.InterfaceC100393wp;
import Y.ACListenerS38S0200000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.assem.LikeCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LikeCell extends PowerCell<LikeItem> {
    public User LJLJJLL;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1369));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1374));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1370));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1373));
    public String LJLJJL = "";
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1372));

    public final C53691L5j getSocPubAvatarFrameLayout() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-socPubAvatarFrameLayout>(...)");
        return (C53691L5j) value;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        if (!C198507qg.LIZIZ.LIZLLL()) {
            C53691L5j socPubAvatarFrameLayout = getSocPubAvatarFrameLayout();
            ViewGroup.LayoutParams layoutParams = socPubAvatarFrameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = -2;
                socPubAvatarFrameLayout.setLayoutParams(layoutParams);
                View ivAvatar = (View) this.LJLIL.getValue();
                o.LJIIIIZZ(ivAvatar, "ivAvatar");
                ViewGroup.LayoutParams layoutParams2 = ivAvatar.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = C7MY.LIZIZ(72);
                    layoutParams2.height = C7MY.LIZIZ(72);
                    ivAvatar.setLayoutParams(layoutParams2);
                    View likeIcon = (View) this.LJLJI.getValue();
                    o.LJIIIIZZ(likeIcon, "likeIcon");
                    ViewGroup.LayoutParams layoutParams3 = likeIcon.getLayoutParams();
                    if (layoutParams3 != null) {
                        layoutParams3.width = C7MY.LIZIZ(30);
                        layoutParams3.height = C7MY.LIZIZ(30);
                        likeIcon.setLayoutParams(layoutParams3);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        if (C19N.LJ("2860_avatar_distribute_expansion_switch", true)) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C12460eI.LIZJ(itemView, new AbstractC13940gg(this) { // from class: X.7Cm
                public final C182057Cn LJ = C182057Cn.LJLIL;
                public InterfaceC65784Pro<String> LJFF;
                public final C182037Cl LJI;

                @Override // X.AbstractC13940gg
                public final /* bridge */ /* synthetic */ java.util.Map LJFF() {
                    return null;
                }

                @Override // X.AbstractC13940gg
                public final InterfaceC65784Pro<String> LIZ() {
                    return this.LJ;
                }

                @Override // X.AbstractC13940gg
                public final InterfaceC65784Pro<String> LIZJ() {
                    return this.LJFF;
                }

                @Override // X.AbstractC13940gg
                public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
                    return this.LJI;
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [X.7Cl] */
                {
                    this.LJFF = new AqS153S0100000_3(this, 1371);
                    this.LJI = new InterfaceC19530ph() { // from class: X.7Cl
                        @Override // X.InterfaceC19530ph
                        public final void LIZ(View view, String itemID) {
                            InterfaceC100393wp interfaceC100393wp;
                            o.LJIIIZ(itemID, "itemID");
                            if (LikeCell.this.getSocPubAvatarFrameLayout().getMode() != EnumC53695L5n.NONE && (interfaceC100393wp = (InterfaceC100393wp) LikeCell.this.LJLJL.getValue()) != null) {
                                interfaceC100393wp.LJFF(LikeCell.this.getSocPubAvatarFrameLayout().getMode());
                            }
                        }
                    };
                }

                @Override // X.AbstractC13940gg
                public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                    this.LJFF = interfaceC65784Pro;
                }
            });
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(LikeItem likeItem) {
        String str;
        String str2;
        LikeItem t = likeItem;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        this.LJLJJLL = t.getUser();
        TextView textView = (TextView) this.LJLILLLLZI.getValue();
        User user = this.LJLJJLL;
        if (user != null) {
            str = C56331M8x.LIZIZ(user, true, true);
        } else {
            str = null;
        }
        textView.setText(str);
        C62562cu LIZ = AnonymousClass729.LIZ(this.LJLJJLL);
        if (LIZ != null) {
            C71799SFv ivAvatar = (C71799SFv) this.LJLIL.getValue();
            o.LJIIIIZZ(ivAvatar, "ivAvatar");
            C71799SFv.LJIIJ(ivAvatar, LIZ, null, false, null, 110);
        }
        C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, t, 83), this.itemView);
        NowFeedMobHierarchyData interactionHierarchyData = t.getInteractionHierarchyData();
        if (interactionHierarchyData == null || (str2 = interactionHierarchyData.getEnterFrom()) == null) {
            str2 = "";
        }
        this.LJLJJL = str2;
        InterfaceC100393wp interfaceC100393wp = (InterfaceC100393wp) this.LJLJL.getValue();
        if (interfaceC100393wp != null) {
            interfaceC100393wp.LJI(this.LJLJJLL);
        }
        if (C198507qg.LIZIZ.LIZLLL()) {
            ((ImageView) this.LJLJI.getValue()).setVisibility(8);
            return;
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_color_n_thumbup_outlined;
        c2068389v.LIZJ = C7MY.LIZIZ(32);
        c2068389v.LIZIZ = C7MY.LIZIZ(32);
        ((TuxIconView) this.LJLJI.getValue()).setTuxIcon(c2068389v);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bat, viewGroup, false, "from(parent.context).inf…item_like, parent, false)");
    }
}
