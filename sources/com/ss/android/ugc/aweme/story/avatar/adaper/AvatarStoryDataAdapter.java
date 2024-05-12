package com.ss.android.ugc.aweme.story.avatar.adaper;

import X.AUM;
import X.AUU;
import X.AbstractC53477Kyn;
import X.C09G;
import X.C12460eI;
import X.C162476Zf;
import X.C212068Ty;
import X.C53472Kyi;
import X.C53473Kyj;
import X.C53474Kyk;
import X.C53476Kym;
import X.C53538Kzm;
import X.C53592L1o;
import X.C53693L5l;
import X.C76800UCe;
import X.EnumC53663L4h;
import X.EnumC53695L5n;
import X.EnumC53719L6l;
import X.ExecutorC142245i8;
import X.InterfaceC100393wp;
import X.InterfaceC53586L1i;
import X.InterfaceC53591L1n;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.L4O;
import X.L5Q;
import X.L5S;
import X.L5U;
import X.L5V;
import X.L61;
import X.L69;
import X.L6B;
import X.L6C;
import X.L6F;
import X.L6R;
import X.X1D;
import Y.ARunnableS28S0200000_9;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AvatarStoryDataAdapter implements GenericLifecycleObserver, InterfaceC53586L1i, InterfaceC53591L1n, DefaultLifecycleObserver, L6R {
    public final C53592L1o LJLIL;
    public L5S LJLILLLLZI = L5S.PROGRESS_BAR;
    public boolean LJLJI = true;
    public EnumC53695L5n LJLJJI = EnumC53695L5n.NONE;
    public float LJLJJL;
    public L69 LJLJJLL;
    public AUM LJLJL;
    public String LJLJLJ;
    public L5U LJLJLLL;
    public InterfaceC100393wp LJLL;
    public AbstractC53477Kyn LJLLI;

    @Override // X.L6R
    public final View getView() {
        return null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C09G.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C09G.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C09G.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    @Override // X.L6R
    public final EnumC53695L5n getMode() {
        return this.LJLJJI;
    }

    public AvatarStoryDataAdapter(C53592L1o c53592L1o) {
        this.LJLIL = c53592L1o;
    }

    @Override // X.InterfaceC53586L1i
    public final L4O LIZ(Object data) {
        o.LJIIIZ(data, "data");
        ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS28S0200000_9(this, data, 70));
        return LJ(this.LJLJJI);
    }

    @Override // X.InterfaceC53591L1n
    public final L4O LIZIZ(Object obj) {
        if (obj instanceof EnumC53695L5n) {
            return LJ((EnumC53695L5n) obj);
        }
        return null;
    }

    public final AbstractC53477Kyn LJ(EnumC53695L5n enumC53695L5n) {
        if (enumC53695L5n == null) {
            return null;
        }
        int i = C53693L5l.LIZ[enumC53695L5n.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return new C53472Kyi(Boolean.valueOf(this.LJLJI), this.LJLL);
                        }
                        throw new C162476Zf();
                    }
                    return new C53473Kyj(Boolean.valueOf(this.LJLJI), this.LJLL);
                }
                return new C53476Kym(Boolean.valueOf(this.LJLJI), new L5Q(this.LJLJJL, this.LJLILLLLZI), this.LJLL);
            }
            return new C53474Kyk(Boolean.valueOf(this.LJLJI), this.LJLL);
        }
        return new C53538Kzm(Boolean.valueOf(this.LJLJI));
    }

    public final void LJFF(L4O l4o) {
        InterfaceC100393wp interfaceC100393wp;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        if (l4o == null) {
            return;
        }
        C53592L1o c53592L1o = this.LJLIL;
        if ((c53592L1o == null || (interfaceC65784Pro = c53592L1o.LJ) == null || !interfaceC65784Pro.invoke().booleanValue()) && (interfaceC100393wp = this.LJLL) != null) {
            interfaceC100393wp.LJFF(this.LJLJJI);
        }
    }

    @Override // X.L6R
    public final void setMine(boolean z) {
        this.LJLJI = z;
    }

    @Override // X.L6R
    public final void setMode(EnumC53695L5n value) {
        L5U l5u;
        o.LJIIIZ(value, "value");
        this.LJLJJI = value;
        String str = this.LJLJLJ;
        if (str != null && value != EnumC53695L5n.PROGRESS && (l5u = this.LJLJLLL) != null) {
            L5V.LIZ(l5u, str, LJ(value), EnumC53663L4h.STORY, null, 24);
        }
    }

    @Override // X.L6R
    public final void setProgress(float f) {
        String str;
        L5U l5u;
        this.LJLJJL = f;
        if (f >= 0.0f && this.LJLJJI == EnumC53695L5n.PROGRESS && (str = this.LJLJLJ) != null && (l5u = this.LJLJLLL) != null) {
            L5V.LIZ(l5u, str, new C53476Kym(Boolean.valueOf(this.LJLJI), new L5Q(f, this.LJLILLLLZI), this.LJLL), EnumC53663L4h.STORY, null, 24);
        }
    }

    @Override // X.L6R
    public final void setProgressMode(L5S l5s) {
        this.LJLILLLLZI = l5s;
    }

    @Override // X.InterfaceC53591L1n
    public final void LIZLLL(L69 l69, LifecycleOwner lifecycleOwner) {
        EnumC53719L6l enumC53719L6l;
        String str;
        Integer valueOf;
        L69 l692;
        InterfaceC88472Yns<C212068Ty, C76800UCe> interfaceC88472Yns;
        String str2;
        this.LJLJJLL = l69;
        AUU config = l69.getConfig();
        AUM aum = null;
        if (config != null) {
            aum = config.LIZJ;
        }
        this.LJLJL = aum;
        if (lifecycleOwner == null) {
            return;
        }
        L61 l61 = L61.STORY;
        C53592L1o c53592L1o = this.LJLIL;
        if (c53592L1o == null || (enumC53719L6l = c53592L1o.LIZ) == null) {
            enumC53719L6l = EnumC53719L6l.PROFILE;
        }
        C212068Ty c212068Ty = new C212068Ty(l61, this, lifecycleOwner, enumC53719L6l);
        c212068Ty.LJIIL = new AqS191S0100000_9(this, 52);
        c212068Ty.LJIIIZ = false;
        AUM aum2 = this.LJLJL;
        String str3 = "";
        if (aum2 == null || (str = aum2.LIZ) == null) {
            str = "";
        }
        c212068Ty.LJ = str;
        if (aum2 != null && (str2 = aum2.LIZJ) != null) {
            str3 = str2;
        }
        c212068Ty.LJFF = str3;
        c212068Ty.LJIIIIZZ = true;
        C53592L1o c53592L1o2 = this.LJLIL;
        if (c53592L1o2 != null && (interfaceC88472Yns = c53592L1o2.LIZIZ) != null) {
            interfaceC88472Yns.invoke(c212068Ty);
        }
        this.LJLL = L6F.LIZIZ.LIZ.LIZIZ(c212068Ty);
        L69 l693 = this.LJLJJLL;
        if (l693 != null) {
            l693.LJI(EnumC53663L4h.STORY, new AqS175S0100000_9(this, 573));
        }
        C53592L1o c53592L1o3 = this.LJLIL;
        if (c53592L1o3 == null || (valueOf = Integer.valueOf(c53592L1o3.LJFF)) == null) {
            return;
        }
        if (valueOf.intValue() == 2) {
            L69 l694 = this.LJLJJLL;
            if (l694 == null) {
                return;
            }
            C12460eI.LIZJ(l694, new L6B(l694, EnumC53663L4h.STORY, new AqS191S0100000_9(this, 97)));
            return;
        }
        if (valueOf.intValue() != 1 || (l692 = this.LJLJJLL) == null) {
            return;
        }
        C12460eI.LIZLLL(l692, new L6C(l692, EnumC53663L4h.STORY, new AqS191S0100000_9(this, 98)));
    }

    @Override // X.InterfaceC53591L1n
    public final void LIZJ(String uid, WeakReference weakReference, L5U observer, Object obj) {
        InterfaceC100393wp interfaceC100393wp;
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(observer, "observer");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("subscribe: NOW, lifecycleOwner: ");
        LIZ.append(weakReference.get());
        LIZ.append(", data = ");
        LIZ.append(obj);
        LIZ.append(", entry = ");
        LIZ.append(this.LJLL);
        X1D.LIZIZ(LIZ);
        this.LJLJLLL = observer;
        this.LJLJLJ = uid;
        if (obj instanceof User) {
            InterfaceC100393wp interfaceC100393wp2 = this.LJLL;
            if (interfaceC100393wp2 != null) {
                interfaceC100393wp2.LJI((User) obj);
                return;
            }
            return;
        }
        if (!(obj instanceof Aweme) || (interfaceC100393wp = this.LJLL) == null) {
            return;
        }
        interfaceC100393wp.LIZLLL((Aweme) obj);
    }
}
