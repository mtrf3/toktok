package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.sessionrefactor;

import X.AbstractC029409q;
import X.AbstractC73672Svk;
import X.AbstractC82423Li;
import X.C09G;
import X.C221108m2;
import X.C3K3;
import X.C3K5;
import X.C3L4;
import X.C3MD;
import X.C3N2;
import X.C3N3;
import X.C3X1;
import X.C62822Ol8;
import X.C81843Jc;
import X.C82543Lu;
import X.EnumC94693nd;
import X.MLD;
import X.ORZ;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel.InboxSocPubStatusViewModelImpl;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.zhiliaoapp.musically.R;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InboxSessionDataProvider extends InboxAdapterWidget implements MLD {
    public final LiveData<EnumC94693nd> LJLJL;
    public final /* synthetic */ C82543Lu LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C3X1 LJLL;

    public InboxSessionDataProvider() {
        throw null;
    }

    @Override // X.MLD
    public final void I0(int i, int i2) {
        this.LJLJLJ.I0(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, X.C3SW
    public final void LIZ() {
        C3K3.LIZ().getClass();
        synchronized (C3K5.LJLIL) {
            C3K5.LIZJ("first_dm_item_attach", null);
        }
    }

    @Override // X.MLD
    public final AbstractC73672Svk<C3MD> LIZJ() {
        return this.LJLJLJ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, X.MLD
    public final void LJ() {
        this.LJLJLJ.LJ();
    }

    @Override // X.MLD
    public final void LJIIJJI() {
        this.LJLJLJ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final AbstractC029409q<?> LJIIJ() {
        return this.LJLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<EnumC94693nd> LJIILIIL() {
        return this.LJLJL;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.sessionrefactor.InboxSessionDataProvider$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 implements GenericLifecycleObserver, DefaultLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
            C09G.LIZIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C09G.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C09G.LJFF(this, lifecycleOwner);
        }

        public AnonymousClass1() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final void onCreate(LifecycleOwner owner) {
            o.LJIIIZ(owner, "owner");
            C81843Jc.LIZIZ("SessionRefactor-InboxSessionDataProvider", "onCreate");
            C82543Lu LIZ = C3K3.LIZ();
            InboxSocPubStatusViewModelImpl inboxSocPubStatusViewModelImpl = (InboxSocPubStatusViewModelImpl) InboxSessionDataProvider.this.LJLJLLL.getValue();
            LIZ.getClass();
            LIZ.LJIIZILJ(new C3N2(LIZ, inboxSocPubStatusViewModelImpl, null));
            C82543Lu LIZ2 = C3K3.LIZ();
            LIZ2.getClass();
            LIZ2.LJIIZILJ(new C3N3(null));
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final void onPause(LifecycleOwner owner) {
            o.LJIIIZ(owner, "owner");
            C3K3.LIZ().LJIILIIL();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final void onStart(LifecycleOwner owner) {
            o.LJIIIZ(owner, "owner");
            C3K3.LIZ().LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final int LJIIIZ(int i) {
        AbstractC82423Li LJIIIIZZ = C3K3.LIZ().LJIIIIZZ();
        if (LJIIIIZZ != null && i >= 0) {
            Iterator it = ORZ.LLJI(ORZ.LLILII((Comparator) LJIIIIZZ.LJLIL.getValue(), ((ConcurrentHashMap) LJIIIIZZ.LJLJI).values())).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (((C3L4) it.next()).LJLLILLLL > 0) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.3X1] */
    public InboxSessionDataProvider(InboxFragment fragment, LiveData parentWidgetState) {
        super(fragment, parentWidgetState);
        MutableLiveData mutableLiveData = new MutableLiveData();
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(parentWidgetState, "parentWidgetState");
        this.LJLJL = mutableLiveData;
        this.LJLJLJ = C3K3.LIZ();
        this.LJLJLLL = C221108m2.LIZIZ(new AqS148S0200000_1(fragment, this, 38));
        this.LJLILLLLZI.postValue(Boolean.TRUE);
        fragment.getLifecycle().addObserver(new AnonymousClass1());
        this.LJLL = new AbstractC029409q<RecyclerView.ViewHolder>() { // from class: X.3X1
            @Override // X.AbstractC029409q
            public final int getItemCount() {
                return 0;
            }

            @Override // X.AbstractC029409q
            public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
                o.LJIIIZ(holder, "holder");
            }

            @Override // X.AbstractC029409q
            /* renamed from: onCreateViewHolder */
            public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
                o.LJIIIZ(parent, "parent");
                C3X5 c3x5 = new C3X5(parent);
                C0AX.LIZ(parent, c3x5.itemView, R.id.lj7);
                View view = c3x5.itemView;
                if (view != null) {
                    view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
                }
                try {
                    if (c3x5.itemView.getParent() != null) {
                        boolean z = true;
                        try {
                            SettingsManager.LIZLLL().getClass();
                            z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (z) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C3X5.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(parent.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C78983UzD.LJIILL(stringBuffer.toString());
                            ViewGroup viewGroup = (ViewGroup) c3x5.itemView.getParent();
                            if (viewGroup != null) {
                                C16880lQ.LJLLL(c3x5.itemView, viewGroup);
                            }
                        }
                    }
                } catch (Exception e) {
                    C78946Uyc.LIZIZ(e);
                    C36922EeM.LIZ(e);
                }
                C29127Bbv.LIZ = C3X5.class.getName();
                return c3x5;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final void LJIILL(int i, int i2, Intent intent) {
        C82543Lu LIZ = C3K3.LIZ();
        LIZ.getClass();
        if (i != 1101 || i2 != 11) {
            return;
        }
        C82543Lu.LJIJ(LIZ, 1);
    }
}
