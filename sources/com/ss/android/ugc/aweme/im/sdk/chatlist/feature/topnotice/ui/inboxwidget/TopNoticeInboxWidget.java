package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.inboxwidget;

import X.AbstractC029409q;
import X.AbstractC28801Bc;
import X.C40322Fs6;
import X.C52548Kjo;
import X.C76800UCe;
import X.C79673At;
import X.C84763XOl;
import X.C97603sK;
import X.C97793sd;
import X.C97843si;
import X.EnumC94693nd;
import X.EnumC97613sL;
import X.InterfaceC65784Pro;
import X.InterfaceC79693Av;
import Y.ACListenerS36S0200000_1;
import Y.ACListenerS41S1100000_1;
import Y.AObserverS69S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.inboxwidget.TopNoticeInboxWidget;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TopNoticeInboxWidget extends InboxAdapterWidget {
    public final InterfaceC65784Pro<C76800UCe> LJLJL;
    public final SessionListTopNoticeViewModel LJLJLJ;
    public final C97603sK LJLJLLL;
    public final InterfaceC65784Pro<Integer> LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public final MutableLiveData<EnumC94693nd> LJLLJ;
    public final MutableLiveData LJLLL;
    public final MutableLiveData<Boolean> LJLLLL;
    public final C97603sK LJLLLLLL;

    public TopNoticeInboxWidget() {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final int LJIIIZ(int i) {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, X.MLD
    public final void LJ() {
        boolean LIZJ;
        int intValue = this.LJLL.invoke().intValue();
        if (C97843si.LIZ()) {
            LIZJ = C40322Fs6.LIZIZ(this.LJLIL.requireContext());
        } else {
            LIZJ = C40322Fs6.LIZJ(this.LJLIL.requireContext());
        }
        SessionListTopNoticeViewModel.hv0(this.LJLJLJ, intValue, LIZJ);
        this.LJLLJ.setValue(EnumC94693nd.LOADING);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        this.LJLJLJ.LJLZ.observe(this.LJLIL, new AObserverS69S0100000_1(this, 49));
        this.LJLJLJ.LJLLI.observe(this.LJLIL, new AObserverS69S0100000_1(this, 50));
        this.LJLJLJ.LJLLJ.observe(this.LJLIL, new AObserverS69S0100000_1(this, 51));
        LJ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (!C84763XOl.LJIIJJI) {
            this.LJLJLJ.gv0();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        int i;
        Integer M;
        if (C52548Kjo.LIZ()) {
            PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
            if (privacyUserSettings != null && (M = privacyUserSettings.M("direct_message")) != null) {
                i = M.intValue();
            } else {
                i = 0;
            }
            if (this.LJLLI) {
                this.LJLLI = false;
                this.LJLLILLLL = i;
            } else if (i > 0 && i != this.LJLLILLLL) {
                this.LJLLILLLL = i;
                LJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final AbstractC029409q<?> LJIIJ() {
        return this.LJLLLLLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<EnumC94693nd> LJIILIIL() {
        return this.LJLLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final MutableLiveData<Boolean> LJIILJJIL() {
        return this.LJLLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.3sK] */
    public TopNoticeInboxWidget(InboxFragment fragment, LiveData parentWidgetState, AqS151S0100000_1 aqS151S0100000_1) {
        super(fragment, parentWidgetState);
        final SessionListTopNoticeViewModel sessionListTopNoticeViewModel = new SessionListTopNoticeViewModel("notification_page", new AqS183S0100000_1(fragment, 106), new AqS183S0100000_1(fragment, 107), 638);
        ?? r2 = new AbstractC28801Bc<EnumC97613sL, RecyclerView.ViewHolder>(sessionListTopNoticeViewModel) { // from class: X.3sK
            public final String LJLIL;
            public final SessionListTopNoticeViewModel LJLILLLLZI;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                /*
                    r3 = this;
                    X.3sQ r2 = new X.3sQ
                    r1 = 1
                    r2.<init>(r1)
                    java.lang.String r0 = "topNoticeViewModel"
                    kotlin.jvm.internal.o.LJIIIZ(r4, r0)
                    r3.<init>(r2)
                    java.lang.String r0 = "inbox"
                    r3.LJLIL = r0
                    r3.LJLILLLLZI = r4
                    r3.setHasStableIds(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C97603sK.<init>(com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel):void");
            }

            @Override // X.AbstractC029409q
            public final long getItemId(int i) {
                return getItem(i).hashCode();
            }

            @Override // X.AbstractC029409q
            public final int getItemViewType(int i) {
                InterfaceC97753sZ config = getItem(i).getConfig();
                if (!(config instanceof C97803se)) {
                    if (config instanceof C97533sD) {
                        return 1;
                    }
                    if (config instanceof C97543sE) {
                        return 2;
                    }
                    throw new C162476Zf();
                }
                "invalid config, you should not add this item to the list".toString();
                throw new IllegalStateException("invalid config, you should not add this item to the list");
            }

            @Override // X.AbstractC029409q
            public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
                EnumC97633sN defaultPermission;
                o.LJIIIZ(holder, "holder");
                EnumC97613sL item = getItem(i);
                if ((item.getConfig() instanceof C97533sD) && (holder instanceof C97523sC)) {
                    ((C97523sC) holder).L(this.LJLIL, (C97533sD) item.getConfig(), this.LJLILLLLZI);
                    return;
                }
                if ((item.getConfig() instanceof C97543sE) && (holder instanceof C97673sR)) {
                    int i2 = C97643sO.LIZ[item.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3 && i2 != 4) {
                                if (i2 == 5) {
                                    defaultPermission = EnumC97633sN.EVERYONE_CREATORS;
                                } else {
                                    "unknown permission type".toString();
                                    throw new IllegalStateException("unknown permission type");
                                }
                            } else {
                                defaultPermission = EnumC97633sN.FRIENDS;
                            }
                        } else {
                            defaultPermission = EnumC97633sN.SUGGESTED_FRIENDS;
                        }
                    } else {
                        defaultPermission = EnumC97633sN.EVERYONE;
                    }
                    C97673sR c97673sR = (C97673sR) holder;
                    String source = this.LJLIL;
                    C97543sE config = (C97543sE) item.getConfig();
                    SessionListTopNoticeViewModel topNoticeViewModel = this.LJLILLLLZI;
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(config, "config");
                    o.LJIIIZ(topNoticeViewModel, "topNoticeViewModel");
                    o.LJIIIZ(defaultPermission, "defaultPermission");
                    InterfaceC97573sH interfaceC97573sH = config.LIZIZ;
                    if (interfaceC97573sH instanceof C97593sJ) {
                        c97673sR.LJLIL.setVisibility(8);
                    } else if (interfaceC97573sH instanceof C97553sF) {
                        c97673sR.LJLIL.setVisibility(0);
                        c97673sR.LJLIL.setText(c97673sR.itemView.getContext().getString(((C97553sF) config.LIZIZ).LIZ));
                    } else if (interfaceC97573sH instanceof C97563sG) {
                        c97673sR.LJLIL.setVisibility(0);
                        TuxTextView tuxTextView = c97673sR.LJLIL;
                        config.LIZIZ.getClass();
                        tuxTextView.setText((CharSequence) null);
                    }
                    C16880lQ.LJJJ(c97673sR.LJLILLLLZI, new ACListenerS41S1100000_1(topNoticeViewModel, source, 4));
                    C16880lQ.LJJIZ(c97673sR.LJLJI, new ACListenerS36S0200000_1(defaultPermission, topNoticeViewModel, 76));
                    return;
                }
                "unknown item config type or invalid view holder".toString();
                throw new IllegalStateException("unknown item config type or invalid view holder");
            }

            @Override // X.AbstractC029409q
            /* renamed from: onCreateViewHolder */
            public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
                RecyclerView.ViewHolder LIZ;
                o.LJIIIZ(parent, "parent");
                boolean z = true;
                if (i != 1) {
                    if (i == 2) {
                        View itemView = C28289B8j.LIZ(parent, R.layout.b9t, parent, false);
                        o.LJIIIIZZ(itemView, "itemView");
                        LIZ = new C97673sR(itemView);
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("unknown view type: ");
                        LIZ2.append(i);
                        String LIZIZ = X1D.LIZIZ(LIZ2);
                        LIZIZ.toString();
                        throw new IllegalStateException(LIZIZ);
                    }
                } else {
                    LIZ = C97473s7.LIZ(parent);
                }
                C0AX.LIZ(parent, LIZ.itemView, R.id.lj7);
                View view = LIZ.itemView;
                if (view != null) {
                    view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
                }
                try {
                    if (LIZ.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                            z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (z) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(LIZ.getClass().getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(parent.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C78983UzD.LJIILL(stringBuffer.toString());
                            ViewGroup viewGroup = (ViewGroup) LIZ.itemView.getParent();
                            if (viewGroup != null) {
                                C16880lQ.LJLLL(LIZ.itemView, viewGroup);
                            }
                        }
                    }
                } catch (Exception e) {
                    C78946Uyc.LIZIZ(e);
                    C36922EeM.LIZ(e);
                }
                C29127Bbv.LIZ = LIZ.getClass().getName();
                return LIZ;
            }
        };
        C97793sd getUnreadCount = C97793sd.LJLIL;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(parentWidgetState, "parentWidgetState");
        o.LJIIIZ(getUnreadCount, "getUnreadCount");
        this.LJLJL = aqS151S0100000_1;
        this.LJLJLJ = sessionListTopNoticeViewModel;
        this.LJLJLLL = r2;
        this.LJLL = getUnreadCount;
        this.LJLLI = true;
        MutableLiveData<EnumC94693nd> mutableLiveData = new MutableLiveData<>();
        this.LJLLJ = mutableLiveData;
        this.LJLLL = mutableLiveData;
        this.LJLLLL = new MutableLiveData<>();
        C79673At.LIZIZ.add(new InterfaceC79693Av() { // from class: X.3sa
            @Override // X.InterfaceC79693Av
            public final void LIZ(boolean z) {
                if (!z) {
                    TopNoticeInboxWidget.this.LJLJLJ.gv0();
                }
            }
        });
        this.LJLLLLLL = r2;
    }
}
