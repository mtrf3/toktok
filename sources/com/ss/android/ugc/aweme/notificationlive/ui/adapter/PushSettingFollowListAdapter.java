package com.ss.android.ugc.aweme.notificationlive.ui.adapter;

import X.AEY;
import X.AI2;
import X.AI8;
import X.AI9;
import X.AJ9;
import X.AMC;
import X.AME;
import X.AMG;
import X.AMH;
import X.AMK;
import X.AP9;
import X.AV1;
import X.AbstractC73230Soc;
import X.C110614Vt;
import X.C16880lQ;
import X.C1DI;
import X.C1FL;
import X.C221108m2;
import X.C26045AKb;
import X.C26074ALe;
import X.C26423AYp;
import X.C26424AYq;
import X.C26425AYr;
import X.C26426AYs;
import X.C32151Nz;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73156SnQ;
import X.C73242Soo;
import X.C73893SzJ;
import X.C85940Xo8;
import X.C86034Xpe;
import X.C8BR;
import X.C8BS;
import X.InterfaceC72022SOk;
import X.InterfaceC85901XnV;
import X.InterfaceC85903XnX;
import X.TBT;
import X.X1D;
import Y.ACListenerS30S0300000_4;
import Y.IDCListenerS142S0200000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveViewModel;
import com.ss.android.ugc.aweme.live.notification.ResponseState;
import com.ss.android.ugc.aweme.notificationlive.ui.NotificationChoiceState;
import com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS67S0000000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.AqS94S0101000_4;
import kotlin.jvm.internal.IDqS429S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PushSettingFollowListAdapter extends AbstractC73230Soc<Object> {
    public final LifecycleOwner LJLJJI;
    public final String LJLJJL;
    public boolean LJLJJLL;

    /* loaded from: classes5.dex */
    public final class FollowItemViewHolder extends JediBaseViewHolder {
        public final AP9 LJLILLLLZI;
        public final TextView LJLJI;
        public final TuxIconView LJLJJI;
        public final TuxIconView LJLJJL;
        public boolean LJLJJLL;
        public final C62822Ol8 LJLJL;
        public final /* synthetic */ PushSettingFollowListAdapter LJLJLJ;

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        public final NotificationLiveViewModel L() {
            AMC amc = AMC.LJLIL;
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
                jediViewModel.ov0(amc);
                return (NotificationLiveViewModel) jediViewModel;
            }
            throw new IllegalStateException("proxy not bound to viewHolder yet");
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            super.onCreate();
            View findViewById = this.itemView.findViewById(R.id.am5);
            C110614Vt c110614Vt = new C110614Vt();
            Integer valueOf = Integer.valueOf(R.attr.ci);
            c110614Vt.LIZIZ = valueOf;
            c110614Vt.LJIIIIZZ = Float.valueOf(C32151Nz.LJIIZILJ(4));
            c110614Vt.LJIIIZ = Float.valueOf(C32151Nz.LJIIZILJ(4));
            Context context = findViewById.getContext();
            o.LJIIIIZZ(context, "it.context");
            findViewById.setBackground(c110614Vt.LIZ(context));
            View findViewById2 = this.itemView.findViewById(R.id.am8);
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LIZIZ = valueOf;
            c110614Vt2.LJIIJ = Float.valueOf(C32151Nz.LJIIZILJ(4));
            c110614Vt2.LJIIJJI = Float.valueOf(C32151Nz.LJIIZILJ(4));
            Context context2 = findViewById2.getContext();
            o.LJIIIIZZ(context2, "it.context");
            findViewById2.setBackground(c110614Vt2.LIZ(context2));
            AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 459);
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
                C73156SnQ.LJIIL(this, jediViewModel, AME.LJLIL);
                C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLJL.getValue(), new TBT() { // from class: X.AM5
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((NotificationChoiceState) obj).getPushSwitchState());
                    }
                }, new AqS186S0100000_4(this.LJLJLJ, 128));
                return;
            }
            throw new IllegalStateException("proxy not bound to viewHolder yet");
        }

        public final void M(User user) {
            this.LJLILLLLZI.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
            this.LJLILLLLZI.LIZ();
            ACListenerS30S0300000_4 aCListenerS30S0300000_4 = new ACListenerS30S0300000_4(this, this.LJLJLJ, user, 6);
            C16880lQ.LJJJJJ(this.LJLILLLLZI, aCListenerS30S0300000_4);
            C16880lQ.LJIJI(this.LJLJI, aCListenerS30S0300000_4);
            C16880lQ.LJIIJ(new ACListenerS30S0300000_4(this, this.LJLJLJ, user, 5), this.itemView);
            this.LJLJI.setText(AV1.LIZLLL(user));
            AJ9.LJ(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.LJLJI);
            N(user.getLivePushNotificationStatus());
            P(this.LJLJLJ.LJLJJLL);
            L().Hv0(user.getSecUid());
            C73156SnQ.LJII(this, L(), new TBT() { // from class: X.AM7
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ResponseState) obj).getCacheEvent();
                }
            }, new TBT() { // from class: X.AM6
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((ResponseState) obj).getPushState());
                }
            }, new IDqS429S0100000_4(user, 7));
            if (this.latestItemPositionInternal == 2) {
                this.itemView.findViewById(R.id.am5).setVisibility(0);
            } else {
                this.itemView.findViewById(R.id.am5).setVisibility(8);
            }
            if (this.latestItemPositionInternal == this.LJLJLJ.getItemCount() - 2) {
                this.itemView.findViewById(R.id.am8).setVisibility(0);
            } else {
                this.itemView.findViewById(R.id.am8).setVisibility(8);
            }
        }

        public final void N(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.LJLJJI.setIconRes(R.raw.icon_bell_slash);
                    this.LJLJJI.setTintColorRes(R.attr.go);
                    return;
                }
                this.LJLJJI.setIconRes(R.raw.icon_bell);
                this.LJLJJI.setTintColorRes(R.attr.go);
                return;
            }
            this.LJLJJI.setIconRes(R.raw.icon_bell_activation);
            this.LJLJJI.setTintColorRes(R.attr.go);
        }

        public final void P(boolean z) {
            float f;
            float f2;
            float f3;
            AP9 ap9 = this.LJLILLLLZI;
            float f4 = 1.0f;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            ap9.setAlpha(f);
            TextView textView = this.LJLJI;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.34f;
            }
            textView.setAlpha(f2);
            TuxIconView tuxIconView = this.LJLJJI;
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.34f;
            }
            tuxIconView.setAlpha(f3);
            TuxIconView tuxIconView2 = this.LJLJJL;
            if (!z) {
                f4 = 0.34f;
            }
            tuxIconView2.setAlpha(f4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FollowItemViewHolder(PushSettingFollowListAdapter pushSettingFollowListAdapter, ViewGroup parent) {
            super(C1FL.LIZIZ(parent, R.layout.c4e, parent, false, "from(parent.context)\n   … false,\n                )"));
            o.LJIIIZ(parent, "parent");
            this.LJLJLJ = pushSettingFollowListAdapter;
            View findViewById = this.itemView.findViewById(R.id.eye);
            o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_avatar)");
            this.LJLILLLLZI = (AP9) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.msf);
            o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.txt_user_name)");
            this.LJLJI = (TextView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.ai6);
            o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.bell)");
            this.LJLJJI = (TuxIconView) findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.a7n);
            o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.arrow)");
            this.LJLJJL = (TuxIconView) findViewById4;
            C65776Prg LIZ = C65352Pkq.LIZ(PushSettingNotificationChoiceViewModel.class);
            this.LJLJL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 145));
        }
    }

    /* loaded from: classes5.dex */
    public final class FollowItemViewSwitchHolder extends JediBaseViewHolder implements InterfaceC85901XnV, InterfaceC85903XnX {
        public final AI8 LJLILLLLZI;
        public C73893SzJ<AI8> LJLJI;
        public final C62822Ol8 LJLJJI;
        public final /* synthetic */ PushSettingFollowListAdapter LJLJJL;

        @Override // X.InterfaceC85901XnV
        public final void onFailed(Exception exc) {
        }

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // X.InterfaceC85903XnX
        public final void vx() {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26045AKb c26045AKb = new C26045AKb(itemView);
            c26045AKb.LJIIIIZZ(R.string.im9);
            c26045AKb.LJIIJ();
        }

        @Override // X.InterfaceC85903XnX
        public final void LLJJ() {
            LiveOuterService.LJJJLL().LJJIZ().LJJJZ();
            AI9 accessory = this.LJLILLLLZI.getAccessory();
            o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
            C26074ALe.LIZJ(((AEY) accessory).LJIIL());
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            super.onCreate();
            this.LJLILLLLZI.LJ(true, true);
            AI9 accessory = this.LJLILLLLZI.getAccessory();
            o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
            AI2 ai2 = (AI2) accessory;
            ai2.LJIILL(new IDCListenerS142S0200000_4(this, ai2, 1));
            C8BR<C8BS<PushSettings>, InterfaceC85901XnV> providePushSettingFetchPresenter = C86034Xpe.LIZIZ.providePushSettingFetchPresenter();
            providePushSettingFetchPresenter.LJJI(this);
            providePushSettingFetchPresenter.LJIILL(new Object[0]);
            C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLJJI.getValue(), new TBT() { // from class: X.AM4
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((NotificationChoiceState) obj).getPushSwitchState());
                }
            }, new AqS186S0100000_4(this.LJLJJL, 127));
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:2|3)|4|(2:6|(7:8|9|10|11|(1:16)|13|14))|20|9|10|11|(0)|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            X.C16880lQ.LLLLIIL(r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
        @Override // X.InterfaceC85901XnV
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void A1(com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings r6) {
            /*
                r5 = this;
                r4 = 1
                X.Ol8 r0 = r5.LJLJJI     // Catch: java.lang.Exception -> L17
                java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Exception -> L17
                com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel r2 = (com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel) r2     // Catch: java.lang.Exception -> L17
                r2.getClass()     // Catch: java.lang.Exception -> L17
                kotlin.jvm.internal.AqS9S0010000_4 r1 = new kotlin.jvm.internal.AqS9S0010000_4     // Catch: java.lang.Exception -> L17
                r0 = 63
                r1.<init>(r4, r0)     // Catch: java.lang.Exception -> L17
                r2.setState(r1)     // Catch: java.lang.Exception -> L17
                goto L1b
            L17:
                r0 = move-exception
                X.C16880lQ.LLLLIIL(r0)
            L1b:
                int r0 = r6.livePush
                if (r0 != r4) goto L36
                com.ss.android.ugc.aweme.live.ILiveOuterService r0 = com.ss.android.ugc.aweme.live.LiveOuterService.LJJJLL()
                X.LoQ r0 = r0.LJJIZ()
                X.ALe r0 = r0.LJJJZ()
                r0.getClass()
                boolean r0 = X.C26073ALd.LIZ()
                if (r0 == 0) goto L36
                r3 = 1
                goto L37
            L36:
                r3 = 0
            L37:
                X.Ol8 r0 = r5.LJLJJI     // Catch: java.lang.Exception -> L4d
                java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Exception -> L4d
                com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel r2 = (com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel) r2     // Catch: java.lang.Exception -> L4d
                r2.getClass()     // Catch: java.lang.Exception -> L4d
                kotlin.jvm.internal.AqS9S0010000_4 r1 = new kotlin.jvm.internal.AqS9S0010000_4     // Catch: java.lang.Exception -> L4d
                r0 = 63
                r1.<init>(r3, r0)     // Catch: java.lang.Exception -> L4d
                r2.setState(r1)     // Catch: java.lang.Exception -> L4d
                goto L51
            L4d:
                r0 = move-exception
                X.C16880lQ.LLLLIIL(r0)
            L51:
                com.ss.android.ugc.aweme.live.ILiveOuterService r0 = com.ss.android.ugc.aweme.live.LiveOuterService.LJJJLL()
                X.LoQ r0 = r0.LJJIZ()
                r0.LJJJZ()
                int r0 = r6.livePush
                if (r0 != r4) goto L64
            L60:
                X.C26074ALe.LIZJ(r4)
                return
            L64:
                r4 = 0
                goto L60
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter.FollowItemViewSwitchHolder.A1(com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FollowItemViewSwitchHolder(PushSettingFollowListAdapter pushSettingFollowListAdapter, ViewGroup parent) {
            super(C1FL.LIZIZ(parent, R.layout.c4g, parent, false, "from(parent.context)\n   …itch_item, parent, false)"));
            o.LJIIIZ(parent, "parent");
            this.LJLJJL = pushSettingFollowListAdapter;
            View findViewById = this.itemView.findViewById(R.id.eum);
            o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.item_push_live)");
            this.LJLILLLLZI = (AI8) findViewById;
            C65776Prg LIZ = C65352Pkq.LIZ(PushSettingNotificationChoiceViewModel.class);
            this.LJLJJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 146));
        }
    }

    /* loaded from: classes5.dex */
    public final class RewardItemViewSwitchHolder extends JediBaseViewHolder implements InterfaceC85901XnV, InterfaceC85903XnX {
        public final AI8 LJLILLLLZI;
        public C73893SzJ<AI8> LJLJI;

        @Override // X.InterfaceC85903XnX
        public final void LLJJ() {
        }

        @Override // X.InterfaceC85901XnV
        public final void onFailed(Exception exc) {
        }

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // X.InterfaceC85903XnX
        public final void vx() {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26045AKb c26045AKb = new C26045AKb(itemView);
            c26045AKb.LJIIIIZZ(R.string.im9);
            c26045AKb.LJIIJ();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            AEY aey;
            super.onCreate();
            boolean z = true;
            this.LJLILLLLZI.LJ(true, true);
            AI9 accessory = this.LJLILLLLZI.getAccessory();
            o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
            AI2 ai2 = (AI2) accessory;
            ai2.LJIILL(new IDCListenerS142S0200000_4(this, ai2, 2));
            PushSettings LJ = C85940Xo8.LIZIZ.LJ();
            if (LJ != null) {
                if (LJ.liveRewardPush != 1) {
                    z = false;
                }
                AI9 accessory2 = this.LJLILLLLZI.getAccessory();
                if ((accessory2 instanceof AI2) && (aey = (AEY) accessory2) != null) {
                    aey.LJIILIIL(z);
                }
            }
            C8BR<C8BS<PushSettings>, InterfaceC85901XnV> providePushSettingFetchPresenter = C86034Xpe.LIZIZ.providePushSettingFetchPresenter();
            providePushSettingFetchPresenter.LJJI(this);
            providePushSettingFetchPresenter.LJIILL(new Object[0]);
        }

        public RewardItemViewSwitchHolder(ViewGroup viewGroup) {
            super(C1DI.LIZ(viewGroup, "parent", R.layout.c4v, viewGroup, false, "from(parent.context)\n   …itch_item, parent, false)"));
            View findViewById = this.itemView.findViewById(R.id.eun);
            o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.item_push_live_reward)");
            this.LJLILLLLZI = (AI8) findViewById;
        }

        @Override // X.InterfaceC85901XnV
        public final void A1(PushSettings pushSettings) {
            AEY aey;
            boolean z = true;
            if (pushSettings.liveRewardPush != 1) {
                z = false;
            }
            AI9 accessory = this.LJLILLLLZI.getAccessory();
            if (!(accessory instanceof AI2) || (aey = (AEY) accessory) == null) {
                return;
            }
            aey.LJIILIIL(z);
        }
    }

    /* loaded from: classes5.dex */
    public final class FollowItemViewTitleHolder extends JediBaseViewHolder {
        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        public FollowItemViewTitleHolder(ViewGroup viewGroup) {
            super(C1DI.LIZ(viewGroup, "parent", R.layout.c4i, viewGroup, false, "from(parent.context)\n   … false,\n                )"));
        }
    }

    @Override // X.AbstractC73237Soj
    public final void LJZ(C73242Soo c73242Soo) {
        c73242Soo.LJFF(new AqS94S0101000_4(0, this, 20), new AqS170S0100000_4(this, 1538), null);
        c73242Soo.LJFF(new AqS94S0101000_4(7, this, 20), C26423AYp.LJLIL, null);
        c73242Soo.LJFF(new AqS94S0101000_4(9, this, 20), C26424AYq.LJLIL, null);
        c73242Soo.LJFF(new AqS94S0101000_4(12, this, 20), C26425AYr.LJLIL, null);
        c73242Soo.LJFF(new AqS94S0101000_4(17, this, 20), new AqS67S0000000_4(this, 1), null);
        c73242Soo.LJFF(new AqS94S0101000_4(18, this, 20), new AqS170S0100000_4(this, 1539), null);
        c73242Soo.LJFF(new AqS94S0101000_4(19, this, 20), new AqS67S0000000_4(this, 2), null);
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
    public PushSettingFollowListAdapter(LifecycleOwner parent, String str) {
        super(parent, new C26426AYs(), 4);
        o.LJIIIZ(parent, "parent");
        this.LJLJJI = parent;
        this.LJLJJL = str;
        this.LJLJJLL = true;
    }
}
