package com.ss.android.ugc.aweme.following.ui.adapter;

import X.AMA;
import X.AMB;
import X.AMG;
import X.AMH;
import X.AMK;
import X.AP9;
import X.AbstractC73230Soc;
import X.C16880lQ;
import X.C1FL;
import X.C221108m2;
import X.C25939AFz;
import X.C26426AYs;
import X.C26910AhG;
import X.C26911AhH;
import X.C26912AhI;
import X.C26913AhJ;
import X.C26914AhK;
import X.C26915AhL;
import X.C53691L5j;
import X.C53882LCs;
import X.C58049MqL;
import X.C58065Mqb;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73156SnQ;
import X.C73242Soo;
import X.C78685UuP;
import X.EnumC26917AhN;
import X.EnumC53722L6o;
import X.InterfaceC72022SOk;
import X.LB1;
import X.TBT;
import X.X1D;
import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveViewModel;
import com.ss.android.ugc.aweme.live.notification.ResponseState;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.AqS94S0101000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FollowListAdapter extends AbstractC73230Soc<Object> {
    public final LifecycleOwner LJLJJI;
    public final String LJLJJL;
    public final boolean LJLJJLL;
    public final String LJLJL;
    public boolean LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public C53882LCs LJLLI;

    /* loaded from: classes5.dex */
    public final class FollowItemViewHolder extends JediBaseViewHolder {
        public final AP9 LJLILLLLZI;
        public final C58065Mqb LJLJI;
        public final TextView LJLJJI;
        public final TextView LJLJJL;
        public final RelationButton LJLJJLL;
        public final ImageView LJLJL;
        public final TuxIconView LJLJLJ;
        public final View LJLJLLL;
        public final C58049MqL LJLL;
        public final C25939AFz LJLLI;
        public final C53691L5j LJLLILLLL;
        public final Context LJLLJ;
        public SlimRoom LJLLL;
        public final C62822Ol8 LJLLLL;
        public final C62822Ol8 LJLLLLLL;
        public final C62822Ol8 LJLZ;
        public final /* synthetic */ FollowListAdapter LJZ;

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        public final NotificationLiveViewModel L() {
            AMB amb = AMB.LJLIL;
            AMK proxy = getProxy();
            if (proxy != null) {
                AMH LIZ = AMG.LIZ(this.LJLIL, proxy.r6());
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(FollowItemViewHolder.class.getName());
                LIZ2.append('_');
                LIZ2.append(NotificationLiveViewModel.class.getName());
                JediViewModel jediViewModel = (JediViewModel) LIZ.LIZ(X1D.LIZIZ(LIZ2), NotificationLiveViewModel.class);
                InterfaceC72022SOk create = jediViewModel.LJLJJI.create(NotificationLiveViewModel.class);
                if (create != null) {
                    create.binding(jediViewModel);
                }
                jediViewModel.ov0(amb);
                return (NotificationLiveViewModel) jediViewModel;
            }
            throw new IllegalStateException("proxy not bound to viewHolder yet");
        }

        public final UserViewModel M() {
            AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 385);
            AMK proxy = getProxy();
            if (proxy != null) {
                AMH LIZ = AMG.LIZ(this.LJLIL, proxy.r6());
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(FollowItemViewHolder.class.getName());
                LIZ2.append('_');
                LIZ2.append(UserViewModel.class.getName());
                JediViewModel jediViewModel = (JediViewModel) LIZ.LIZ(X1D.LIZIZ(LIZ2), UserViewModel.class);
                InterfaceC72022SOk create = jediViewModel.LJLJJI.create(UserViewModel.class);
                if (create != null) {
                    create.binding(jediViewModel);
                }
                jediViewModel.ov0(aqS170S0100000_4);
                return (UserViewModel) jediViewModel;
            }
            throw new IllegalStateException("proxy not bound to viewHolder yet");
        }

        public final void N() {
            TypedValue typedValue = new TypedValue();
            this.itemView.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
            this.itemView.setBackgroundResource(typedValue.resourceId);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            super.onCreate();
            C73156SnQ.LJIIL(this, M(), new AqS191S0100000_9(this.LJZ, 18));
            L().Hv0(((LB1) getItem()).LJLILLLLZI.getSecUid());
            C73156SnQ.LJII(this, L(), new TBT() { // from class: X.AM9
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ResponseState) obj).getCacheEvent();
                }
            }, new TBT() { // from class: X.AM8
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((ResponseState) obj).getPushState());
                }
            }, AMA.LJLIL);
        }

        public final void P(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.LJLJLJ.setIconRes(com.zhiliaoapp.musically.R.raw.icon_bell_slash);
                    this.LJLJLJ.setTintColorRes(com.zhiliaoapp.musically.R.attr.gv);
                    return;
                }
                this.LJLJLJ.setIconRes(com.zhiliaoapp.musically.R.raw.icon_bell);
                this.LJLJLJ.setTintColorRes(com.zhiliaoapp.musically.R.attr.gv);
                return;
            }
            this.LJLJLJ.setIconRes(com.zhiliaoapp.musically.R.raw.icon_bell_activation);
            this.LJLJLJ.setTintColorRes(com.zhiliaoapp.musically.R.attr.gv);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FollowItemViewHolder(FollowListAdapter followListAdapter, ViewGroup parent) {
            super(C1FL.LIZIZ(parent, com.zhiliaoapp.musically.R.layout.c48, parent, false, "from(parent.context)\n   …wing_item, parent, false)"));
            o.LJIIIZ(parent, "parent");
            this.LJZ = followListAdapter;
            View findViewById = this.itemView.findViewById(com.zhiliaoapp.musically.R.id.eye);
            o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_avatar)");
            AP9 ap9 = (AP9) findViewById;
            this.LJLILLLLZI = ap9;
            View findViewById2 = this.itemView.findViewById(com.zhiliaoapp.musically.R.id.acl);
            o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.avatar_live_circle)");
            this.LJLJI = (C58065Mqb) findViewById2;
            View findViewById3 = this.itemView.findViewById(com.zhiliaoapp.musically.R.id.msf);
            o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.txt_user_name)");
            this.LJLJJI = (TextView) findViewById3;
            View findViewById4 = this.itemView.findViewById(com.zhiliaoapp.musically.R.id.mrr);
            o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.txt_desc)");
            this.LJLJJL = (TextView) findViewById4;
            View findViewById5 = this.itemView.findViewById(com.zhiliaoapp.musically.R.id.iu_);
            o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.relationBtn)");
            this.LJLJJLL = (RelationButton) findViewById5;
            View findViewById6 = this.itemView.findViewById(com.zhiliaoapp.musically.R.id.gml);
            o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.more_iv)");
            this.LJLJL = (ImageView) findViewById6;
            View findViewById7 = this.itemView.findViewById(com.zhiliaoapp.musically.R.id.ai9);
            o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.bell_iv)");
            this.LJLJLJ = (TuxIconView) findViewById7;
            View findViewById8 = this.itemView.findViewById(com.zhiliaoapp.musically.R.id.nco);
            View findViewById9 = this.itemView.findViewById(com.zhiliaoapp.musically.R.id.acg);
            o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.avatar_layout)");
            this.LJLJLLL = findViewById9;
            View findViewById10 = this.itemView.findViewById(com.zhiliaoapp.musically.R.id.iuj);
            o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.relation_label)");
            this.LJLL = (C58049MqL) findViewById10;
            View findViewById11 = this.itemView.findViewById(com.zhiliaoapp.musically.R.id.jy0);
            o.LJIIIIZZ(findViewById11, "itemView.findViewById(R.id.shop_entrance_link)");
            this.LJLLI = (C25939AFz) findViewById11;
            View findViewById12 = this.itemView.findViewById(com.zhiliaoapp.musically.R.id.dfe);
            o.LJIIIIZZ(findViewById12, "itemView.findViewById(R.id.fl_now_avatar)");
            this.LJLLILLLL = (C53691L5j) findViewById12;
            this.LJLLJ = this.itemView.getContext();
            C65776Prg LIZ = C65352Pkq.LIZ(FollowRelationTabViewModel.class);
            this.LJLLLL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 143));
            C65776Prg LIZ2 = C65352Pkq.LIZ(FollowerRelationViewModel.class);
            this.LJLLLLLL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ2, LIZ2, 144));
            this.LJLZ = C221108m2.LIZIZ(new AqS156S0200000_9(this, followListAdapter, 11));
            ViewParent parent2 = findViewById8.getParent();
            o.LJII(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(findViewById8, (ViewGroup) parent2);
            ap9.addView(findViewById8, 1);
        }
    }

    public final String LL() {
        if (TextUtils.equals(this.LJLJJL, "following_relation")) {
            if (this.LJLJJLL) {
                return "following";
            }
            return "other_following";
        }
        if (TextUtils.equals(this.LJLJJL, "follower_relation")) {
            if (this.LJLJJLL) {
                return "fans";
            }
            return "other_fans";
        }
        return "";
    }

    public final String LLD() {
        if (C78685UuP.LJJJZ(this.LJLJL)) {
            return this.LJLJL;
        }
        if (this.LJLJJLL) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    @Override // X.MK7
    public final boolean isNestedFlingStopCompat() {
        return true;
    }

    @Override // X.AbstractC73237Soj
    public final void LJZ(C73242Soo c73242Soo) {
        c73242Soo.LJFF(new AqS94S0101000_4(0, this, 16), new AqS170S0100000_4(this, 890), null);
        c73242Soo.LJFF(new AqS94S0101000_4(1, this, 16), new AqS170S0100000_4(this, 891), null);
        c73242Soo.LJFF(new AqS94S0101000_4(7, this, 16), C26910AhG.LJLIL, null);
        c73242Soo.LJFF(new AqS94S0101000_4(8, this, 16), C26911AhH.LJLIL, null);
        c73242Soo.LJFF(new AqS94S0101000_4(9, this, 16), C26912AhI.LJLIL, null);
        c73242Soo.LJFF(new AqS94S0101000_4(10, this, 16), C26913AhJ.LJLIL, null);
        c73242Soo.LJFF(new AqS94S0101000_4(11, this, 16), C26914AhK.LJLIL, null);
        c73242Soo.LJFF(new AqS94S0101000_4(12, this, 16), C26915AhL.LJLIL, null);
    }

    public final void LLF(int i) {
        String str;
        if (i == EnumC26917AhN.DEFAULT.getValue()) {
            str = "default";
        } else {
            str = "latest";
        }
        this.LJLL = str;
        if (this.LJLLI == null) {
            C53882LCs c53882LCs = new C53882LCs(EnumC53722L6o.SKYLIGHT);
            this.LJLLI = c53882LCs;
            c53882LCs.LIZLLL();
        }
    }

    @Override // X.AbstractC73237Soj, X.C4II
    public final int getBasicItemViewType(int i) {
        int basicItemViewType = super.getBasicItemViewType(i);
        if (basicItemViewType != 0) {
            return basicItemViewType;
        }
        return this.LJLILLLLZI.LIZIZ(i - LJLLLLLL());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowListAdapter(LifecycleOwner parent, String str, boolean z, String str2) {
        super(parent, new C26426AYs(), 4);
        o.LJIIIZ(parent, "parent");
        this.LJLJJI = parent;
        this.LJLJJL = str;
        this.LJLJJLL = z;
        this.LJLJL = str2;
        this.LJLJLLL = "";
        this.LJLL = "";
    }
}
