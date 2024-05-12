package com.ss.android.ugc.aweme.avatar;

import X.AV1;
import X.C04650Gf;
import X.C0GU;
import X.C0GY;
import X.C12460eI;
import X.C16880lQ;
import X.C188727au;
import X.C1DH;
import X.C221108m2;
import X.C2304092m;
import X.C26045AKb;
import X.C26308AUe;
import X.C29S;
import X.C47261Igj;
import X.C48203Ivv;
import X.C53691L5j;
import X.C53708L6a;
import X.C53710L6c;
import X.C54838Lfe;
import X.C62822Ol8;
import X.C73098SmU;
import X.C76800UCe;
import X.EnumC53695L5n;
import X.EnumC53719L6l;
import X.FMX;
import X.InterfaceC100393wp;
import X.InterfaceC53712L6e;
import X.InterfaceC54403LWt;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.L61;
import X.L63;
import X.L6J;
import X.L6K;
import X.L6M;
import X.L6O;
import X.L6R;
import X.L6T;
import X.L6V;
import X.X1D;
import Y.ARunnableS28S0200000_9;
import android.app.Activity;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SocialAvatarEntry implements GenericLifecycleObserver, InterfaceC100393wp, InterfaceC53712L6e, View.OnClickListener, InterfaceC54403LWt {
    public final L61 LJLIL;
    public final L6R LJLILLLLZI;
    public final LifecycleOwner LJLJI;
    public final EnumC53719L6l LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public InterfaceC65784Pro<Boolean> LJLJL;
    public InterfaceC88472Yns<? super EnumC53695L5n, C76800UCe> LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public InterfaceC65784Pro<Boolean> LJLLI;
    public User LJLLILLLL;
    public String LJLLJ;
    public float LJLLL;
    public InterfaceC88471Ynr<? super SmartRoute, ? super String, C76800UCe> LJLLLL;
    public InterfaceC88471Ynr<? super String, ? super HashMap<String, String>, Boolean> LJLLLLLL;
    public boolean LJLZ;
    public final C62822Ol8 LJZ;
    public final String LJZI;

    @Override // X.InterfaceC54403LWt
    public final void onStart() {
        this.LJLLL = 0.0f;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC100393wp
    public final void reset() {
        LJI(null);
    }

    public final L6O LJII() {
        return (L6O) this.LJZ.getValue();
    }

    public final boolean LJIIIIZZ() {
        C62822Ol8 c62822Ol8;
        String anywhereChannelPath;
        C53691L5j c53691L5j;
        Object obj;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        if (this.LJLZ) {
            return false;
        }
        this.LJLZ = true;
        this.LJLILLLLZI.setProgressMode(LJII().LJII().LIZ());
        if (this.LJLJLLL && (lifecycleOwner = this.LJLJI) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        C0GU<C0GY> c0gu = null;
        if (this.LJLL && (obj = this.LJLILLLLZI) != null) {
            C12460eI.LIZLLL((View) obj, new L6J(this));
        }
        if (C2304092m.LIZ()) {
            C0GY c0gy = L6M.LIZIZ;
            if (c0gy != null) {
                L6R l6r = this.LJLILLLLZI;
                if ((l6r instanceof C53691L5j) && (c53691L5j = (C53691L5j) l6r) != null) {
                    c53691L5j.setLottieComposition(c0gy);
                }
            } else {
                try {
                    IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
                    c62822Ol8 = L6M.LIZ;
                    anywhereChannelPath = createIMainServicebyMonsterPlugin.getAnywhereChannelPath(((C26308AUe) c62822Ol8.getValue()).LIZ);
                } catch (Throwable unused) {
                }
                if (anywhereChannelPath != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(anywhereChannelPath);
                    LIZ.append(File.separator);
                    LIZ.append(((C26308AUe) c62822Ol8.getValue()).LIZIZ);
                    c0gu = C04650Gf.LJI(new FileInputStream(new File(X1D.LIZIZ(LIZ))), ((C26308AUe) c62822Ol8.getValue()).LIZIZ);
                    if (c0gu != null) {
                        c0gu.LIZIZ(new L6K(this));
                    }
                }
            }
        }
        return true;
    }

    public final void LJIIL() {
        LifecycleOwner lifecycleOwner = this.LJLJI;
        if (lifecycleOwner != null) {
            C53708L6a.LIZIZ.LIZIZ(lifecycleOwner, this.LJLIL, this.LJLLJ, null, this);
        }
        LJII().LJI(this.LJZI);
        LJIIJ(EnumC53695L5n.NONE);
        this.LJLLJ = null;
        this.LJLLILLLL = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LJII().LJI(this.LJZI);
    }

    @Override // X.InterfaceC54403LWt
    public final void LIZ(float f) {
        this.LJLLL = f;
        LJIIJ(EnumC53695L5n.PROGRESS);
    }

    @Override // X.InterfaceC54403LWt
    public final void LIZIZ(C53710L6c c53710L6c) {
        LJIILIIL(Boolean.TRUE);
    }

    @Override // X.InterfaceC100393wp
    public final boolean LIZLLL(Aweme aweme) {
        String uid;
        LifecycleOwner lifecycleOwner;
        o.LJIIIZ(aweme, "aweme");
        User author = aweme.getAuthor();
        String str = null;
        if (author == null || (uid = author.getUid()) == null) {
            LJIIL();
            return false;
        }
        LJIIJJI(uid);
        User user = this.LJLLILLLL;
        if (user != null) {
            str = user.getUid();
        }
        this.LJLLJ = str;
        this.LJLLILLLL = author;
        this.LJLILLLLZI.setMine(AV1.LJIJ(author));
        C53710L6c LIZIZ = LJII().LIZIZ(aweme);
        L61 l61 = this.LJLIL;
        String uid2 = author.getUid();
        o.LJIIIIZZ(uid2, "user.uid");
        LIZJ(L6V.LIZJ(l61, uid2, LIZIZ, Boolean.TRUE).LIZ, author.getUid(), Boolean.FALSE);
        if (!o.LJ(this.LJLLJ, uid) && (lifecycleOwner = this.LJLJI) != null) {
            C53708L6a.LIZIZ.LIZIZ(lifecycleOwner, this.LJLIL, this.LJLLJ, uid, this);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC54403LWt
    public final void LJ(C53710L6c c53710L6c) {
        LJIILIIL(Boolean.TRUE);
    }

    @Override // X.InterfaceC100393wp
    public final void LJFF(EnumC53695L5n mode) {
        o.LJIIIZ(mode, "mode");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.getTagName());
        LIZ.append("_show");
        LJIIIZ(X1D.LIZIZ(LIZ), mode);
    }

    @Override // X.InterfaceC100393wp
    public final boolean LJI(User user) {
        String str;
        LifecycleOwner lifecycleOwner;
        String str2 = null;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        User user2 = this.LJLLILLLL;
        if (user2 != null) {
            str2 = user2.getUid();
        }
        this.LJLLJ = str2;
        this.LJLLILLLL = user;
        if (user != null && str != null) {
            boolean LJIIZILJ = AV1.LJIIZILJ(user, AV1.LJIJ(user));
            if (!user.isBlock() && !user.isBlocked() && !LJIIZILJ) {
                user.getUid();
                LJIIJJI(str);
                this.LJLILLLLZI.setMine(AV1.LJIJ(user));
                C53710L6c LIZ = LJII().LIZ(user);
                L61 l61 = this.LJLIL;
                String uid = user.getUid();
                o.LJIIIIZZ(uid, "user.uid");
                LIZJ(L6V.LIZJ(l61, uid, LIZ, Boolean.TRUE).LIZ, str, Boolean.FALSE);
                if (!o.LJ(this.LJLLJ, str) && (lifecycleOwner = this.LJLJI) != null) {
                    C53708L6a.LIZIZ.LIZIZ(lifecycleOwner, this.LJLIL, this.LJLLJ, str, this);
                }
                return true;
            }
        }
        LJIIL();
        return false;
    }

    public final void LJIIJ(EnumC53695L5n enumC53695L5n) {
        boolean LJIIIIZZ;
        InterfaceC88472Yns<? super EnumC53695L5n, C76800UCe> interfaceC88472Yns;
        if (!C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            C1DH.LJJIJIIJI(new ARunnableS28S0200000_9(enumC53695L5n, this, 7));
            return;
        }
        EnumC53695L5n mode = this.LJLILLLLZI.getMode();
        this.LJLILLLLZI.setMode(enumC53695L5n);
        EnumC53695L5n enumC53695L5n2 = EnumC53695L5n.PROGRESS;
        if (enumC53695L5n == enumC53695L5n2) {
            this.LJLILLLLZI.setProgress(this.LJLLL);
        }
        if (enumC53695L5n == EnumC53695L5n.NONE) {
            View view = this.LJLILLLLZI.getView();
            if (view != null) {
                C16880lQ.LJIIJ(null, view);
            }
            View view2 = this.LJLILLLLZI.getView();
            LJIIIIZZ = false;
            if (view2 != null) {
                view2.setClickable(false);
            }
            if (this.LJLJLLL) {
                LJIIIIZZ = LJIIIIZZ();
            }
        } else {
            View view3 = this.LJLILLLLZI.getView();
            if (view3 != null) {
                C16880lQ.LJIIJ(this, view3);
            }
            LJIIIIZZ = LJIIIIZZ();
        }
        if ((mode != enumC53695L5n || LJIIIIZZ || enumC53695L5n == enumC53695L5n2) && (interfaceC88472Yns = this.LJLJLJ) != null) {
            interfaceC88472Yns.invoke(enumC53695L5n);
        }
    }

    public final void LJIIJJI(String str) {
        if (C54838Lfe.LJIIJJI(str) && this.LJLJLLL) {
            LJII().LIZJ(this.LJZI, this);
        } else {
            LJII().LJI(this.LJZI);
        }
    }

    public final void LJIILIIL(Boolean bool) {
        String str;
        String uid;
        C53710L6c LJ = LJII().LJ();
        C47261Igj.LJJJJLI(LJ, Boolean.TRUE, Long.valueOf(System.currentTimeMillis()));
        User user = this.LJLLILLLL;
        if (user != null && (uid = user.getUid()) != null) {
            L6V.LIZJ(L61.STORY, uid, LJ, Boolean.FALSE);
        }
        User user2 = this.LJLLILLLL;
        if (user2 != null) {
            str = user2.getUid();
        } else {
            str = null;
        }
        LIZJ(LJ.LIZ, str, bool);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        String uid;
        o.LJIIIZ(v, "v");
        User user = this.LJLLILLLL;
        if (user == null || (uid = user.getUid()) == null) {
            return;
        }
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLLI;
        if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.getTagName());
        LIZ.append("_click");
        LJIIIZ(X1D.LIZIZ(LIZ), this.LJLILLLLZI.getMode());
        System.currentTimeMillis();
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (!(validTopActivity instanceof C29S) || validTopActivity == null || validTopActivity.isFinishing()) {
            return;
        }
        if (!C48203Ivv.LJ(validTopActivity)) {
            C26045AKb c26045AKb = new C26045AKb(validTopActivity);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
            return;
        }
        SmartRoute route = SmartRouter.buildRoute(validTopActivity, LJII().LIZLLL());
        L6T LJIIL = LJII().LJIIL(this.LJLJJI);
        o.LJIIIIZZ(route, "route");
        LJIIL.onEnterPlayer(route, this.LJLJJL);
        InterfaceC88471Ynr<? super SmartRoute, ? super String, C76800UCe> interfaceC88471Ynr = this.LJLLLL;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(route, uid);
        }
        LJII().LJIIJ(uid);
        route.open();
    }

    public final void LJIIIZ(String str, EnumC53695L5n enumC53695L5n) {
        String str2;
        int i;
        if (enumC53695L5n == EnumC53695L5n.ON || enumC53695L5n == EnumC53695L5n.OFF) {
            HashMap hashMap = new HashMap();
            InterfaceC88471Ynr<? super String, ? super HashMap<String, String>, Boolean> interfaceC88471Ynr = this.LJLLLLLL;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(str, hashMap);
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", this.LJLJJL);
            c188727au.LJIIIZ("enter_method", this.LJLJJLL);
            User user = this.LJLLILLLL;
            Integer num = null;
            if (user != null) {
                str2 = user.getUid();
            } else {
                str2 = null;
            }
            c188727au.LJIIIZ("author_id", str2);
            User user2 = this.LJLLILLLL;
            if (user2 != null) {
                num = Integer.valueOf(user2.getFollowStatus());
            }
            c188727au.LJFF(num, "follow_status");
            if (enumC53695L5n == EnumC53695L5n.OFF) {
                i = 0;
            } else {
                i = 1;
            }
            c188727au.LIZLLL(i, "is_unread");
            c188727au.LJII(hashMap);
            FMX.LJIIL(str, c188727au.LIZ);
        }
    }

    @Override // X.InterfaceC53712L6e
    public final void LIZJ(int i, String str, Boolean bool) {
        String str2;
        EnumC53695L5n enumC53695L5n;
        User user = this.LJLLILLLL;
        if (user != null) {
            str2 = user.getUid();
        } else {
            str2 = null;
        }
        if (!o.LJ(str, str2)) {
            return;
        }
        if (this.LJLJL.invoke().booleanValue()) {
            enumC53695L5n = EnumC53695L5n.NONE;
        } else if (this.LJLJLLL && LJII().LJIIIZ().LJI() && AV1.LJIJ(this.LJLLILLLL) && !o.LJ(bool, Boolean.TRUE)) {
            enumC53695L5n = EnumC53695L5n.PROGRESS;
        } else if (this.LJLJLLL && LJII().LJIIIZ().LJFF() && AV1.LJIJ(this.LJLLILLLL)) {
            enumC53695L5n = EnumC53695L5n.FAIL;
        } else if (i == 1) {
            enumC53695L5n = EnumC53695L5n.ON;
        } else if (i == 2 && !LJII().LJIIL(this.LJLJJI).skipGray()) {
            enumC53695L5n = EnumC53695L5n.OFF;
        } else {
            enumC53695L5n = EnumC53695L5n.NONE;
        }
        LJIIJ(enumC53695L5n);
    }

    public SocialAvatarEntry(L61 bizTag, L6R view, LifecycleOwner lifecycleOwner, EnumC53719L6l scene) {
        o.LJIIIZ(bizTag, "bizTag");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(scene, "scene");
        this.LJLIL = bizTag;
        this.LJLILLLLZI = view;
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = scene;
        this.LJLJL = L63.LJLIL;
        this.LJLL = true;
        this.LJZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 63));
        this.LJZI = String.valueOf(hashCode());
    }
}
