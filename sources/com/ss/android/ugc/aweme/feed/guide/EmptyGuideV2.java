package com.ss.android.ugc.aweme.feed.guide;

import X.ActivityC45651qj;
import X.C00F;
import X.C0IF;
import X.C16880lQ;
import X.C16970lZ;
import X.C19N;
import X.C1A7;
import X.C2PH;
import X.C31633CbF;
import X.C35971E9v;
import X.C37067Egh;
import X.C53295Kvr;
import X.C53322KwI;
import X.C53946LFe;
import X.C57460Mgq;
import X.C57526Mhu;
import X.C57534Mi2;
import X.C57535Mi3;
import X.C57536Mi4;
import X.C57538Mi6;
import X.C57539Mi7;
import X.C57544MiC;
import X.C57545MiD;
import X.C73305Spp;
import X.C79004UzY;
import X.HG3;
import X.I4X;
import X.I4Y;
import X.InterfaceC54422LXm;
import X.InterfaceC54976Lhs;
import X.InterfaceC57542MiA;
import X.InterfaceC57543MiB;
import X.InterfaceC57556MiO;
import X.InterfaceC62173Oaf;
import X.JWG;
import X.LLQ;
import X.LNZ;
import X.LOG;
import X.RBX;
import X.ViewOnClickListenerC57520Mho;
import X.ViewOnClickListenerC57522Mhq;
import X.ViewOnClickListenerC57546MiE;
import Y.IDCListenerS300S0100000_9;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.experiment.FollowFeedCombineOptimizeExpObject;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.impl.OptimizerHelperServiceImpl;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import yq4.a;

/* loaded from: classes10.dex */
public class EmptyGuideV2 implements GenericLifecycleObserver, InterfaceC54422LXm, InterfaceC57542MiA, I4Y, JWG, InterfaceC57556MiO {
    public static final /* synthetic */ int LJLLLL = 0;
    public final Fragment LJLIL;
    public final View LJLILLLLZI;
    public final C2PH LJLJI;
    public C73305Spp LJLJJI;
    public final ViewOnClickListenerC57522Mhq LJLJJL;
    public C57545MiD LJLJJLL;
    public TuxTextView LJLJL;
    public final ActivityC45651qj LJLJLJ;
    public List<String> LJLJLLL;
    public String LJLL;
    public I4X LJLLI;
    public final InterfaceC57543MiB LJLLILLLL;
    public final IDCListenerS300S0100000_9 LJLLJ = new IDCListenerS300S0100000_9(this, 0);
    public InterfaceC54976Lhs LJLLL;

    @Override // X.InterfaceC54422LXm
    public final void LJFF() {
        LJIIZILJ(true);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.JWG
    public final /* synthetic */ void p(RecyclerView.ViewHolder viewHolder) {
    }

    static {
        C16880lQ.LJLLJ(EmptyGuideV2.class);
    }

    @Override // X.InterfaceC54422LXm
    public final void LIZIZ() {
        C57545MiD c57545MiD;
        InterfaceC54976Lhs interfaceC54976Lhs = this.LJLLL;
        if (interfaceC54976Lhs != null) {
            interfaceC54976Lhs.setRefreshing(false);
        }
        if (!this.LJLLILLLL.M1()) {
            return;
        }
        if (LOG.LIZIZ() && (c57545MiD = this.LJLJJLL) != null) {
            c57545MiD.setVisibility(8);
            this.LJLJI.setVisibility(8);
            this.LJLJJLL.LIZIZ();
        } else {
            this.LJLJJL.setVisibility(8);
        }
        LJIJJ(HG3.LJIILL().isLogin());
        this.LJLLILLLL.Bk();
    }

    public final C57545MiD LJIIIZ() {
        C57545MiD c57545MiD = this.LJLJJLL;
        if (c57545MiD == null) {
            C57545MiD c57545MiD2 = (C57545MiD) C0IF.LIZIZ(this.LJLILLLLZI, c57545MiD, R.id.ku1, R.id.nfu);
            this.LJLJJLL = c57545MiD2;
            c57545MiD2.setContainer(new WeakReference<>(this.LJLJLJ));
            LJIILLIIL();
        }
        return this.LJLJJLL;
    }

    public final C73305Spp LJIIJJI() {
        C73305Spp c73305Spp = this.LJLJJI;
        if (c73305Spp == null) {
            this.LJLJJI = (C73305Spp) C0IF.LIZIZ(this.LJLILLLLZI, c73305Spp, R.id.kf_, R.id.nfs);
        }
        return this.LJLJJI;
    }

    public final void LJIJ() {
        InterfaceC54976Lhs interfaceC54976Lhs = this.LJLLL;
        if (interfaceC54976Lhs != null) {
            interfaceC54976Lhs.setRefreshing(false);
        }
        if (!this.LJLLILLLL.M1()) {
            return;
        }
        LJIJJ(HG3.LJIILL().isLogin());
        if (LOG.LIZIZ()) {
            this.LJLJI.setVisibility(0);
            LJIIIZ().setVisibility(0);
            LJIIIZ().setOnViewFirstShowListener(this);
        } else {
            this.LJLJJL.setVisibility(0);
            this.LJLJJL.setReminderText(R.string.pfc);
            this.LJLJJL.setBackgroundResource(R.color.cz);
            this.LJLJJL.setOnViewAttachedToWindowListener(this);
        }
        this.LJLLILLLL.Bb();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C73305Spp c73305Spp = this.LJLJJI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        }
    }

    @Override // X.InterfaceC54422LXm
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C57545MiD c57545MiD = this.LJLJJLL;
        if (c57545MiD != null) {
            c57545MiD.LIZIZ();
        }
    }

    @Override // X.InterfaceC54422LXm
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C57545MiD c57545MiD;
        if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).isOnFollowPage(this.LJLJLJ) && (c57545MiD = this.LJLJJLL) != null && c57545MiD.getVisibility() == 0) {
            C57545MiD c57545MiD2 = this.LJLJJLL;
            RecyclerView.ViewHolder LJJIZ = c57545MiD2.getList().LJJIZ(c57545MiD2.getLayoutManager().LJZL);
            if (LJJIZ != null) {
                ((ViewOnClickListenerC57546MiE) LJJIZ).LJIILLIIL();
            }
        }
    }

    public final void LJIIIIZZ() {
        if (C53295Kvr.LIZIZ()) {
            try {
                LLQ Xm0 = LNZ.LIZIZ.getHomeTabViewModel(this.LJLJLJ).Xm0();
                if (Xm0 != null) {
                    Xm0.LJJI("Following");
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void LJIILIIL() {
        if (LOG.LIZ()) {
            C2PH c2ph = this.LJLJI;
            c2ph.LJLIL.setText(R.string.gj3);
            c2ph.LJLIL.setTuxFont(22);
            c2ph.LJLILLLLZI.setText(R.string.gj2);
            return;
        }
        if (!((RBX) HG3.LJIILL()).isLogin() || ((RBX) HG3.LJIILL()).getCurUser().getFollowingCount() == 0) {
            this.LJLJI.LJLIL.setText(R.string.gjs);
        } else {
            this.LJLJI.LJLIL.setText("");
        }
        this.LJLJI.LJLILLLLZI.setText(R.string.gjk);
    }

    public final void LJIILLIIL() {
        if (C53322KwI.LIZ()) {
            ViewGroup.LayoutParams layoutParams = this.LJLJJLL.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) (((C53946LFe.LIZJ(this.LJLJLJ, null).LIZIZ * 0.712f) * 1.34f) / 0.93f);
            }
            this.LJLJJLL.setLayoutParams(layoutParams);
        }
    }

    @Override // X.InterfaceC54422LXm
    public final View LIZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC54422LXm
    public final void LIZLLL(FollowStatusEvent followStatusEvent) {
        C57545MiD c57545MiD;
        String str = followStatusEvent.status.userId;
        if (!TextUtils.isEmpty(str) && (c57545MiD = this.LJLJJLL) != null && !C79004UzY.LJJIFFI(c57545MiD.getMCardItems())) {
            List<UserWithAweme> mCardItems = this.LJLJJLL.getMCardItems();
            int size = mCardItems.size();
            for (int i = 0; i < size; i++) {
                User user = ((UserWithAweme) ListProtector.get(mCardItems, i)).getUser();
                if (TextUtils.equals(user.getUid(), str)) {
                    int i2 = followStatusEvent.status.followStatus;
                    if (user.getFollowStatus() == i2) {
                        return;
                    }
                    user.setFollowStatus(i2);
                    if (this.LJLLI instanceof C57536Mi4) {
                        this.LJLJJLL.LIZJ();
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC54422LXm
    public final void LJ(C31633CbF c31633CbF) {
        if (c31633CbF.LJLILLLLZI instanceof User) {
            ViewOnClickListenerC57522Mhq viewOnClickListenerC57522Mhq = this.LJLJJL;
            int i = 0;
            if (viewOnClickListenerC57522Mhq != null && !C79004UzY.LJJIFFI(viewOnClickListenerC57522Mhq.getData())) {
                List<User> data = this.LJLJJL.getData();
                User user = (User) c31633CbF.LJLILLLLZI;
                int size = data.size();
                while (i < size) {
                    User user2 = (User) ListProtector.get(data, i);
                    if (TextUtils.equals(user2.getUid(), user.getUid())) {
                        user2.setFollowStatus(c31633CbF.LJLIL);
                        I4X i4x = this.LJLLI;
                        if (i4x instanceof C57539Mi7) {
                            InterfaceC62173Oaf interfaceC62173Oaf = (InterfaceC62173Oaf) i4x.LJLILLLLZI;
                            if (interfaceC62173Oaf != null) {
                                ((RecommendCommonUserModel) interfaceC62173Oaf).setData(data);
                            }
                            this.LJLJJL.LIZIZ(user2.getRequestId(), data);
                            return;
                        }
                        return;
                    }
                    i++;
                }
                return;
            }
            C57545MiD c57545MiD = this.LJLJJLL;
            if (c57545MiD != null && !C79004UzY.LJJIFFI(c57545MiD.getMCardItems())) {
                List<UserWithAweme> mCardItems = this.LJLJJLL.getMCardItems();
                User user3 = (User) c31633CbF.LJLILLLLZI;
                int size2 = mCardItems.size();
                while (i < size2) {
                    User user4 = ((UserWithAweme) ListProtector.get(mCardItems, i)).getUser();
                    if (TextUtils.equals(user4.getUid(), user3.getUid())) {
                        user4.setFollowStatus(c31633CbF.LJLIL);
                        if (this.LJLLI instanceof C57536Mi4) {
                            this.LJLJJLL.LIZJ();
                            return;
                        }
                        return;
                    }
                    i++;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC54422LXm
    public final void LJI(InterfaceC54976Lhs interfaceC54976Lhs) {
        this.LJLLL = interfaceC54976Lhs;
        LJIIIIZZ();
        LJIJJ(((RBX) HG3.LJIILL()).isLogin());
        if (!((Boolean) a.LJFF().LJFF().getValue()).booleanValue()) {
            LJIIZILJ(false);
        }
    }

    @Override // X.InterfaceC57542MiA
    public final void LJII(Exception exc) {
        C73305Spp c73305Spp = this.LJLJJI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        }
        InterfaceC54976Lhs interfaceC54976Lhs = this.LJLLL;
        if (interfaceC54976Lhs != null) {
            interfaceC54976Lhs.setRefreshing(false);
        }
        if (exc instanceof C37067Egh) {
            LIZIZ();
            return;
        }
        boolean LJIJJ = C1A7.LJIJJ(this.LJLJLJ, exc);
        if (!C19N.LJ("emptyGuide_show_network_error_ui", true) || LJIJJ) {
            return;
        }
        LIZIZ();
        try {
            Field declaredField = this.LJLIL.getClass().getDeclaredField("mFollowFeedFragmentPanel");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this.LJLIL);
            if (obj == null) {
                return;
            }
            Method declaredMethod = obj.getClass().getDeclaredMethod("showLoadError", Exception.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(obj, new Exception("NetWork Error"));
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    @Override // X.InterfaceC57542MiA
    public final void LJIIL(RecommendList recommendList) {
        LJIILL(recommendList);
    }

    @Override // X.InterfaceC57542MiA
    public final void LJIILL(RecommendList recommendList) {
        RecyclerView recyclerView;
        C73305Spp c73305Spp = this.LJLJJI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        }
        if (recommendList != null && recommendList.getUserList() != null) {
            boolean z = true;
            if (recommendList.getUserList().size() >= 1) {
                this.LJLL = recommendList.getRid();
                this.LJLJJL.LIZIZ(recommendList.getRid(), recommendList.getUserList());
                boolean hasMore = recommendList.hasMore();
                ViewOnClickListenerC57522Mhq viewOnClickListenerC57522Mhq = this.LJLJJL;
                if (!HG3.LJIILL().isLogin() || !hasMore) {
                    z = false;
                }
                viewOnClickListenerC57522Mhq.setShowLookMore(z);
                if (LOG.LIZ() && (recyclerView = this.LJLJJL.LJLLI) != null) {
                    recyclerView.LJLI(0);
                }
                this.LJLJJL.setOnItemOperationListener(new C57535Mi3(this));
                this.LJLJJL.setOnLookMoreUserListener(new C57526Mhu(this));
                LJIJ();
                return;
            }
        }
        LIZIZ();
    }

    public final void LJIIZILJ(boolean z) {
        String str;
        ViewOnClickListenerC57522Mhq viewOnClickListenerC57522Mhq;
        C57545MiD c57545MiD;
        if (!this.LJLLILLLL.M1()) {
            return;
        }
        LIZIZ();
        if (this.LJLLL != null && (((viewOnClickListenerC57522Mhq = this.LJLJJL) != null && viewOnClickListenerC57522Mhq.getVisibility() == 0) || ((c57545MiD = this.LJLJJLL) != null && c57545MiD.getVisibility() == 0))) {
            this.LJLLL.setRefreshing(true);
        }
        if (LOG.LIZIZ()) {
            if (this.LJLLI == null) {
                this.LJLLI = new C57536Mi4(new C57538Mi6(), this);
            }
            I4X i4x = this.LJLLI;
            if (i4x instanceof C57536Mi4) {
                C57536Mi4 c57536Mi4 = (C57536Mi4) i4x;
                if (!c57536Mi4.LJLJJI) {
                    c57536Mi4.LJLJJI = true;
                    ((C57538Mi6) ((InterfaceC62173Oaf) c57536Mi4.LJLILLLLZI)).LIZ();
                }
            }
        } else {
            if (!z && this.LJLLI != null && !LOG.LIZ()) {
                return;
            }
            if (this.LJLLI == null) {
                this.LJLLI = new C57539Mi7(new RecommendCommonUserModel(), this);
            }
            I4X i4x2 = this.LJLLI;
            if (i4x2 instanceof C57539Mi7) {
                if (((RBX) HG3.LJIILL()).isLogin()) {
                    str = ((RBX) HG3.LJIILL()).getCurUserId();
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                ((RecommendCommonUserModel) ((InterfaceC62173Oaf) i4x2.LJLILLLLZI)).fetchData(30, str, 2, 0, C57460Mgq.LIZ(), 2, null, C00F.LIZ(31744, 0, "show_super_accounts_to_unlogged_users", true));
            }
        }
        if (LJIIJJI() != null) {
            LJIIJJI().LJFF();
            LJIIJJI().setVisibility(0);
        }
    }

    public final void LJIJJ(boolean z) {
        this.LJLJI.LJLJI.setVisibility(8);
        if (z || LOG.LIZ()) {
            if (C57544MiC.LIZIZ.LIZ()) {
                if (SharePrefCache.inst().getIsContactsUploaded().LIZ().booleanValue()) {
                    LJIILIIL();
                    return;
                } else {
                    LJIILIIL();
                    return;
                }
            }
            LJIILIIL();
        }
    }

    public final void LJJ(User user) {
        if (this.LJLJLLL == null) {
            this.LJLJLLL = new ArrayList();
        }
        if (!((ArrayList) this.LJLJLLL).contains(user.getUid())) {
            ((ArrayList) this.LJLJLLL).add(user.getUid());
        }
    }

    @Override // X.JWG
    public final void vk(RecyclerView.ViewHolder viewHolder) {
        User user;
        ViewOnClickListenerC57520Mho viewOnClickListenerC57520Mho = (ViewOnClickListenerC57520Mho) viewHolder;
        if (viewOnClickListenerC57520Mho != null && (user = viewOnClickListenerC57520Mho.LJLJJLL) != null) {
            LJJ(user);
        }
    }

    public EmptyGuideV2(Fragment fragment, InterfaceC57543MiB interfaceC57543MiB) {
        this.LJLLILLLL = InterfaceC57543MiB.LJI;
        this.LJLIL = fragment;
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        this.LJLJLJ = mo49getActivity;
        if (OptimizerHelperServiceImpl.LJIIIZ().LIZJ()) {
            this.LJLILLLLZI = C16970lZ.LIZLLL(mo49getActivity, R.layout.au0);
        } else {
            this.LJLILLLLZI = C16880lQ.LLLZIIL(R.layout.au0, C16880lQ.LLZIL(mo49getActivity), null);
        }
        this.LJLJI = (C2PH) this.LJLILLLLZI.findViewById(R.id.c63);
        this.LJLJJL = (ViewOnClickListenerC57522Mhq) this.LJLILLLLZI.findViewById(R.id.nbl);
        if (!FollowFeedCombineOptimizeExpObject.INSTANCE.isHit()) {
            C57545MiD c57545MiD = (C57545MiD) this.LJLILLLLZI.findViewById(R.id.ku1);
            this.LJLJJLL = c57545MiD;
            c57545MiD.setContainer(new WeakReference<>(mo49getActivity));
            LJIILLIIL();
            this.LJLJL = (TuxTextView) this.LJLILLLLZI.findViewById(R.id.mo8);
            this.LJLJJI = (C73305Spp) this.LJLILLLLZI.findViewById(R.id.kf_);
        }
        LJIJJ(((RBX) HG3.LJIILL()).isLogin());
        this.LJLLILLLL = interfaceC57543MiB;
        fragment.getLifecycle().addObserver(this);
        if (C35971E9v.LIZ()) {
            a.LJFF().LJFF().observe(fragment, new C57534Mi2(1, this));
        }
    }
}
