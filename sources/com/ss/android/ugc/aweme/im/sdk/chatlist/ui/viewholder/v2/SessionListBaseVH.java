package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2;

import X.AbstractC72439Sbr;
import X.ActivityC45651qj;
import X.C09G;
import X.C105004Ae;
import X.C116724i4;
import X.C118824lS;
import X.C16880lQ;
import X.C19N;
import X.C1DG;
import X.C221108m2;
import X.C34B;
import X.C3K3;
import X.C3ML;
import X.C43659HBn;
import X.C45S;
import X.C53341Kwb;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78769Uvl;
import X.C78897Uxp;
import X.C81843Jc;
import X.C81929WDl;
import X.C82543Lu;
import X.C96503qY;
import X.C96533qb;
import X.C96613qj;
import X.C96783r0;
import X.C96793r1;
import X.C96803r2;
import X.EnumC62195Ob1;
import X.EnumC96543qc;
import X.InterfaceC82723Mm;
import X.InterfaceC88472Yns;
import X.MMN;
import X.ViewTreeObserverOnPreDrawListenerC16840lM;
import X.W5F;
import X.W5U;
import X.X1D;
import Y.ACListenerS21S0100000_1;
import Y.ARunnableS37S0100000_1;
import Y.IDCListenerS294S0100000_1;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public abstract class SessionListBaseVH extends C96803r2 implements GenericLifecycleObserver, DefaultLifecycleObserver, MMN {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C96793r1 LJLJJLL;
    public final C96783r0 LJLJL;
    public ActivityC45651qj LJLJLJ;
    public C96533qb LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public InterfaceC82723Mm LJLLILLLL;
    public EnumC96543qc LJLLJ;
    public final C62822Ol8 LJLLL;

    public Map<String, String> X() {
        return null;
    }

    @Override // X.MMN
    public void onAttach() {
        String sessionId;
        Lifecycle lifecycle;
        this.LJLL = true;
        ActivityC45651qj activity = getActivity();
        if (activity != null && (lifecycle = activity.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        C82543Lu LIZ = C3K3.LIZ();
        InterfaceC82723Mm interfaceC82723Mm = this.LJLLILLLL;
        if (interfaceC82723Mm == null || (sessionId = interfaceC82723Mm.getSessionId()) == null) {
            return;
        }
        LIZ.getClass();
        LIZ.LJZL.add(sessionId);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C09G.LIZIZ(this, lifecycleOwner);
    }

    @Override // X.MMN
    public void onDetach() {
        String sessionId;
        Lifecycle lifecycle;
        this.LJLL = false;
        ActivityC45651qj activity = getActivity();
        if (activity != null && (lifecycle = activity.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        C82543Lu LIZ = C3K3.LIZ();
        InterfaceC82723Mm interfaceC82723Mm = this.LJLLILLLL;
        if (interfaceC82723Mm == null || (sessionId = interfaceC82723Mm.getSessionId()) == null) {
            return;
        }
        LIZ.getClass();
        LIZ.LJZL.remove(sessionId);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    public final SmartAvatarImageView P() {
        return (SmartAvatarImageView) this.LJLIL.getValue();
    }

    public final TuxTextView U() {
        return (TuxTextView) this.LJLJI.getValue();
    }

    public final TuxTextView V() {
        return (TuxTextView) this.LJLILLLLZI.getValue();
    }

    public final ActivityC45651qj getActivity() {
        ActivityC45651qj activityC45651qj = this.LJLJLJ;
        if (activityC45651qj == null) {
            ActivityC45651qj LJ = C1DG.LJ(this.itemView, "itemView.context");
            this.LJLJLJ = LJ;
            return LJ;
        }
        return activityC45651qj;
    }

    public InterfaceC88472Yns<InterfaceC82723Mm, C76800UCe> Q() {
        return this.LJLJL;
    }

    public InterfaceC88472Yns<InterfaceC82723Mm, C76800UCe> T() {
        return this.LJLJJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionListBaseVH(View view) {
        super(view);
        o.LJIIIZ(view, "view");
        this.LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 593));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 598));
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 597));
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 594));
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 595));
        this.LJLJJLL = C96793r1.LJLIL;
        this.LJLJL = C96783r0.LJLIL;
        this.LJLJLLL = C96613qj.LIZ();
        this.LJLLJ = EnumC96543qc.INIT;
        this.LJLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 596));
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(itemView, new ARunnableS37S0100000_1(itemView, 40));
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 93), this.itemView);
        this.itemView.setOnLongClickListener(new IDCListenerS294S0100000_1(this, 1));
    }

    public void L(InterfaceC82723Mm interfaceC82723Mm) {
        Object obj;
        EnumC96543qc enumC96543qc;
        Object avatar = interfaceC82723Mm.getAvatar();
        InterfaceC82723Mm interfaceC82723Mm2 = this.LJLLILLLL;
        if (interfaceC82723Mm2 != null) {
            obj = interfaceC82723Mm2.getAvatar();
        } else {
            obj = null;
        }
        if (o.LJ(avatar, obj) && ((enumC96543qc = this.LJLLJ) == EnumC96543qc.COMPLETE || enumC96543qc == EnumC96543qc.LOADING)) {
            return;
        }
        this.LJLLJ = EnumC96543qc.INIT;
        Object avatar2 = interfaceC82723Mm.getAvatar();
        if (avatar2 instanceof UrlModel) {
            W5F LJII = W5U.LJII(avatar2);
            SmartAvatarImageView P = P();
            if (P == null) {
                return;
            }
            LJII.LJJIIJ = P;
            LJII.LJIILLIIL = (Drawable) C96503qY.LIZJ.getValue();
            LJII.LJJIII = EnumC62195Ob1.SMALL;
            C43659HBn.LJIJ(LJII, "SessionRefactor-SessionListBaseVH:bindAvatar", false, (C81929WDl) this.LJLLL.getValue(), 2);
            return;
        }
        if (avatar2 instanceof C78769Uvl) {
            W5F LJII2 = W5U.LJII(avatar2);
            SmartAvatarImageView P2 = P();
            if (P2 == null) {
                return;
            }
            LJII2.LJJIIJ = P2;
            LJII2.LJIILLIIL = (Drawable) C96503qY.LIZJ.getValue();
            LJII2.LJJIII = EnumC62195Ob1.SMALL;
            C43659HBn.LJIJ(LJII2, "SessionRefactor-SessionListBaseVH:bindAvatar", false, (C81929WDl) this.LJLLL.getValue(), 2);
            return;
        }
        if (avatar2 instanceof String) {
            SmartAvatarImageView P3 = P();
            if (P3 == null) {
                return;
            }
            String urlModel = (String) avatar2;
            int i = this.LJLJLLL.LIZIZ;
            Drawable drawable = (Drawable) C96503qY.LIZJ.getValue();
            o.LJIIIZ(urlModel, "urlModel");
            C45S.LIZ(urlModel, P3);
            W5F LJIIIIZZ = W5U.LJIIIIZZ(urlModel);
            LJIIIIZZ.LJJIIJ = P3;
            LJIIIIZZ.LJII = i;
            LJIIIIZZ.LJIIIIZZ = i;
            LJIIIIZZ.LJIILLIIL = drawable;
            LJIIIIZZ.LJJIII = EnumC62195Ob1.SMALL;
            C43659HBn.LJIJI(LJIIIIZZ, "SessionRefactor-SessionListBaseVH:group", (C81929WDl) this.LJLLL.getValue(), 2);
            return;
        }
        W5F LJII3 = W5U.LJII(C96503qY.LIZJ.getValue());
        SmartAvatarImageView P4 = P();
        if (P4 == null) {
            return;
        }
        LJII3.LJJIIJ = P4;
        LJII3.LJJIII = EnumC62195Ob1.SMALL;
        LJII3.LIZLLL((AbstractC72439Sbr) this.LJLLL.getValue());
        C34B.LIZJ("SessionRefactor-SessionListBaseVH", "Avatar object is unknown");
    }

    @Override // X.C3X3
    public void LLL(C96533qb c96533qb) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TuxTextView U;
        TuxTextView U2;
        TuxTextView V;
        TuxTextView V2;
        SmartAvatarImageView P;
        ViewGroup.LayoutParams layoutParams2;
        if (this.LJLJLLL == c96533qb) {
            return;
        }
        this.LJLJLLL = c96533qb;
        if (c96533qb.LIZIZ != -1 && (P = P()) != null && (layoutParams2 = P.getLayoutParams()) != null) {
            int i = c96533qb.LIZIZ;
            layoutParams2.width = i;
            layoutParams2.height = i;
        }
        if (c96533qb.LJ != -1 && (V2 = V()) != null) {
            V2.setTuxFont(c96533qb.LJ);
        }
        if (c96533qb.LJFF != -1 && (V = V()) != null) {
            V.LJJJ(c96533qb.LJFF);
        }
        if (c96533qb.LJI != -1 && (U2 = U()) != null) {
            U2.setTuxFont(c96533qb.LJI);
        }
        if (c96533qb.LJIIIIZZ != -1 && (U = U()) != null) {
            U.setTextColor(c96533qb.LJIIIIZZ);
        }
        if (c96533qb.LJIIJ != -1 && this.LJLJJI.getValue() != null) {
            View view = (View) this.LJLJJI.getValue();
            ViewGroup.LayoutParams layoutParams3 = null;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                View view2 = (View) this.LJLJJI.getValue();
                if (view2 != null) {
                    layoutParams3 = view2.getLayoutParams();
                }
                if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) == null) {
                    return;
                }
                marginLayoutParams.topMargin = c96533qb.LJIIJ;
            }
        }
    }

    public void M(InterfaceC82723Mm interfaceC82723Mm) {
        CharSequence content = interfaceC82723Mm.getContent();
        C116724i4 c116724i4 = new C116724i4();
        c116724i4.LIZIZ(content);
        TuxTextView U = U();
        if (U != null) {
            U.setText(c116724i4.LIZ);
        }
        if (interfaceC82723Mm.isCheckEmoji()) {
            C118824lS.LIZJ(U(), null);
        }
    }

    public void N(InterfaceC82723Mm interfaceC82723Mm) {
        TuxTextView V = V();
        if (V == null) {
            return;
        }
        V.setText(interfaceC82723Mm.getName());
    }

    public boolean Y(InterfaceC82723Mm interfaceC82723Mm) {
        CharSequence charSequence;
        CharSequence content = interfaceC82723Mm.getContent();
        InterfaceC82723Mm interfaceC82723Mm2 = this.LJLLILLLL;
        if (interfaceC82723Mm2 != null) {
            charSequence = interfaceC82723Mm2.getContent();
        } else {
            charSequence = null;
        }
        if (o.LJ(content, charSequence)) {
            return false;
        }
        return true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onPause(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZJ(this, owner);
        this.LJLLI = false;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZLLL(this, owner);
        this.LJLLI = true;
    }

    /* renamed from: a0 */
    public void v0(InterfaceC82723Mm interfaceC82723Mm, int i) {
        N(interfaceC82723Mm);
        if (Y(interfaceC82723Mm)) {
            M(interfaceC82723Mm);
        }
        if (interfaceC82723Mm.getPriority() > 0) {
            if (!(this instanceof SessionListTakoChatVH)) {
                if (C53341Kwb.LIZ()) {
                    Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.cv);
                    if (LIZIZ != null) {
                        int intValue = LIZIZ.intValue();
                        View itemView = this.itemView;
                        o.LJIIIIZZ(itemView, "itemView");
                        C78897Uxp.LJJJJJ(itemView, intValue);
                    }
                } else {
                    Integer LIZIZ2 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.cv);
                    if (LIZIZ2 != null) {
                        this.itemView.setBackgroundColor(LIZIZ2.intValue());
                    }
                    View itemView2 = this.itemView;
                    o.LJIIIIZZ(itemView2, "itemView");
                    C78897Uxp.LJJJJJL(itemView2, 0.0f);
                }
            }
        } else if (C53341Kwb.LIZ()) {
            Integer LIZIZ3 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.cl);
            if (LIZIZ3 != null) {
                int intValue2 = LIZIZ3.intValue();
                View itemView3 = this.itemView;
                o.LJIIIIZZ(itemView3, "itemView");
                C78897Uxp.LJJJJJ(itemView3, intValue2);
            }
        } else {
            Integer LIZIZ4 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.cl);
            if (LIZIZ4 != null) {
                this.itemView.setBackgroundColor(LIZIZ4.intValue());
            }
            View itemView4 = this.itemView;
            o.LJIIIIZZ(itemView4, "itemView");
            C78897Uxp.LJJJJJL(itemView4, 0.0f);
        }
        Keva kevaRepo = C105004Ae.LIZ();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        View view = (View) this.LJLJJL.getValue();
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // X.MMN
    public final void bind(Object obj, int i) {
        InterfaceC82723Mm interfaceC82723Mm;
        C3ML c3ml = (C3ML) obj;
        Object obj2 = c3ml.LJLJJL;
        if ((obj2 instanceof InterfaceC82723Mm) && (interfaceC82723Mm = (InterfaceC82723Mm) obj2) != null) {
            L(interfaceC82723Mm);
            if (!o.LJ(interfaceC82723Mm, this.LJLLILLLL)) {
                v0(interfaceC82723Mm, i);
                this.LJLLILLLL = interfaceC82723Mm;
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("type convert failed: ");
        LIZ.append(c3ml);
        C81843Jc.LIZIZ("SessionRefactor-SessionListBaseVH", X1D.LIZIZ(LIZ));
    }
}
