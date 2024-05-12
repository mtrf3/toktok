package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.ui;

import X.AbstractC029409q;
import X.AbstractC28801Bc;
import X.C221108m2;
import X.C36636EZk;
import X.C3SO;
import X.C48841JEv;
import X.C57900Mnw;
import X.C62822Ol8;
import X.C65402hU;
import X.C89403f6;
import X.C89423f8;
import X.EnumC94693nd;
import X.InterfaceC57917MoD;
import X.InterfaceC89383f4;
import X.XKX;
import Y.ACListenerS21S0100000_1;
import Y.AObserverS69S0100000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.ui.InvitationCardSharePackage;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.viewmodel.ChatInviteViewModelImpl;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InvitationCardInboxWidget extends InboxAdapterWidget implements InterfaceC89383f4, InterfaceC57917MoD {
    public final MutableLiveData<EnumC94693nd> LJLJL;
    public final MutableLiveData LJLJLJ;
    public final C89423f8 LJLJLLL;
    public final C89423f8 LJLL;
    public final C62822Ol8 LJLLI;
    public InvitationCardSharePackage LJLLILLLL;
    public boolean LJLLJ;

    @Override // X.InterfaceC89383f4
    public final void LIZIZ() {
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C3SO(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final int LJIIIZ(int i) {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, X.MLD
    public final void LJ() {
        if (!this.LJLLJ) {
            return;
        }
        this.LJLLJ = false;
        ChatInviteViewModelImpl chatInviteViewModelImpl = (ChatInviteViewModelImpl) this.LJLLI.getValue();
        if (chatInviteViewModelImpl != null) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(chatInviteViewModelImpl), chatInviteViewModelImpl.LJLJI, null, new C65402hU(chatInviteViewModelImpl, null), 2);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        MutableLiveData mutableLiveData;
        ChatInviteViewModelImpl chatInviteViewModelImpl = (ChatInviteViewModelImpl) this.LJLLI.getValue();
        if (chatInviteViewModelImpl != null && (mutableLiveData = chatInviteViewModelImpl.LJLJJLL) != null) {
            mutableLiveData.observe(this.LJLIL, new AObserverS69S0100000_1(this, 47));
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final AbstractC029409q<?> LJIIJ() {
        return this.LJLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<EnumC94693nd> LJIILIIL() {
        return this.LJLJLJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.3f8] */
    public InvitationCardInboxWidget(final InboxFragment fragment, LiveData parentWidgetState) {
        super(fragment, parentWidgetState);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(parentWidgetState, "parentWidgetState");
        MutableLiveData<EnumC94693nd> mutableLiveData = new MutableLiveData<>(EnumC94693nd.EMPTY);
        this.LJLJL = mutableLiveData;
        this.LJLJLJ = mutableLiveData;
        ?? r0 = new AbstractC28801Bc<InvitationCardSharePackage, C89403f6>(fragment, this) { // from class: X.3f8
            public final Fragment LJLIL;
            public final InterfaceC89383f4 LJLILLLLZI;

            @Override // X.AbstractC029409q
            public final long getItemId(int i) {
                return getItem(i).hashCode();
            }

            /* JADX WARN: Illegal instructions before constructor call */
            {
                /*
                    r2 = this;
                    X.3f9 r1 = new X.3f9
                    r1.<init>()
                    java.lang.String r0 = "fragment"
                    kotlin.jvm.internal.o.LJIIIZ(r3, r0)
                    java.lang.String r0 = "listener"
                    kotlin.jvm.internal.o.LJIIIZ(r4, r0)
                    r2.<init>(r1)
                    r2.LJLIL = r3
                    r2.LJLILLLLZI = r4
                    r0 = 1
                    r2.setHasStableIds(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C89423f8.<init>(com.ss.android.ugc.aweme.inbox.InboxFragment, X.3f4):void");
            }

            @Override // X.AbstractC029409q
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                ActivityC45651qj requireActivity;
                C89403f6 holder = (C89403f6) viewHolder;
                o.LJIIIZ(holder, "holder");
                InvitationCardSharePackage item = getItem(i);
                o.LJIIIIZZ(item, "getItem(position)");
                final InvitationCardSharePackage invitationCardSharePackage = item;
                final Context context = holder.LJLIL.getContext();
                Fragment fragment2 = holder.LJLJI;
                if (fragment2 != null && (requireActivity = fragment2.requireActivity()) != null) {
                    C113914dX c113914dX = holder.LJLIL;
                    C62394OeE c62394OeE = new C62394OeE();
                    C4LD.LIZ.LJJJJ(c62394OeE, requireActivity, true);
                    c62394OeE.LJIIZILJ = invitationCardSharePackage;
                    c62394OeE.LIZIZ(new CopyLinkChannel(false));
                    C62387Oe7 c62387Oe7 = new C62387Oe7(c62394OeE);
                    if (c62387Oe7.LJFF) {
                        Iterator<InterfaceC62225ObV> it = c62387Oe7.LIZ.iterator();
                        while (it.hasNext()) {
                            if (!it.next().LIZLLL(requireActivity)) {
                                it.remove();
                            }
                        }
                    }
                    c113914dX.LJIIJ(c62387Oe7.LIZ, false);
                }
                C113914dX c113914dX2 = holder.LJLIL;
                InterfaceC113814dN interfaceC113814dN = new InterfaceC113814dN() { // from class: X.4R0
                    @Override // X.InterfaceC113814dN
                    public final void LJIIIZ(InterfaceC62225ObV channel, View view) {
                        o.LJIIIZ(channel, "channel");
                        InvitationCardSharePackage invitationCardSharePackage2 = InvitationCardSharePackage.this;
                        Context context2 = context;
                        o.LJIIIIZZ(context2, "context");
                        invitationCardSharePackage2.LIZIZ(context2, channel);
                        AbstractC62625Ohx LJIIJJI = InvitationCardSharePackage.this.LJIIJJI(channel);
                        Context context3 = context;
                        o.LJIIIIZZ(context3, "context");
                        channel.LJIIJ(LJIIJJI, context3, null);
                    }
                };
                c113914dX2.getClass();
                c113914dX2.LJLJJL = interfaceC113814dN;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "notification_page");
                FMX.LJIIL("show_dm_invitation_card", c188727au.LIZ);
                C16880lQ.LJJJ(holder.LJLILLLLZI, new ACListenerS21S0100000_1(holder, 139));
            }

            @Override // X.AbstractC029409q
            /* renamed from: onCreateViewHolder */
            public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
                o.LJIIIZ(parent, "parent");
                Fragment fragment2 = this.LJLIL;
                InterfaceC89383f4 listener = this.LJLILLLLZI;
                o.LJIIIZ(fragment2, "fragment");
                o.LJIIIZ(listener, "listener");
                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.b7l, parent, false);
                View findViewById = LLLLIILL.findViewById(R.id.j7n);
                boolean z = true;
                if (findViewById != null) {
                    C110614Vt c110614Vt = new C110614Vt();
                    c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
                    c110614Vt.LJFF = Integer.valueOf(R.attr.cf);
                    c110614Vt.LIZJ = C61328O5c.LIZJ(8);
                    Context context = findViewById.getContext();
                    o.LJIIIIZZ(context, "context");
                    findViewById.setBackground(c110614Vt.LIZ(context));
                }
                C89403f6 c89403f6 = new C89403f6(LLLLIILL);
                c89403f6.LJLJI = fragment2;
                c89403f6.LJLJJI = listener;
                C0AX.LIZ(parent, c89403f6.itemView, R.id.lj7);
                View view = c89403f6.itemView;
                if (view != null) {
                    view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
                }
                try {
                    if (c89403f6.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                            z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (z) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C89403f6.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(parent.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C78983UzD.LJIILL(stringBuffer.toString());
                            ViewGroup viewGroup = (ViewGroup) c89403f6.itemView.getParent();
                            if (viewGroup != null) {
                                C16880lQ.LJLLL(c89403f6.itemView, viewGroup);
                            }
                        }
                    }
                } catch (Exception e) {
                    C78946Uyc.LIZIZ(e);
                    C36922EeM.LIZ(e);
                }
                C29127Bbv.LIZ = C89403f6.class.getName();
                return c89403f6;
            }
        };
        this.LJLJLLL = r0;
        this.LJLL = r0;
        this.LJLLI = C221108m2.LIZIZ(new AqS151S0100000_1(fragment, 784));
    }

    @Override // X.InterfaceC57917MoD
    public final List LIZLLL(List data, boolean z) {
        o.LJIIIZ(data, "data");
        if (!z && (data.isEmpty() || (data.size() == 1 && (ListProtector.get(data, 0) instanceof C57900Mnw)))) {
            this.LJLLJ = true;
            LJ();
        } else if (getCurrentList().size() > 0) {
            LIZIZ();
        }
        return data;
    }
}
