package com.bytedance.ies.bullet.service.popup;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C39973FmT;
import X.C39976FmW;
import X.C3C5;
import X.C47261Igj;
import X.C60193Njp;
import X.C60373Nmj;
import X.C60415NnP;
import X.C60556Npg;
import X.C60561Npl;
import X.C60562Npm;
import X.C60565Npp;
import X.C60575Npz;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.DialogC60568Nps;
import X.EnumC39958FmE;
import X.EnumC60567Npr;
import X.EnumC60571Npv;
import X.EnumC60573Npx;
import X.F21;
import X.F3T;
import X.InterfaceC39974FmU;
import X.InterfaceC40516FvE;
import X.InterfaceC59504NWy;
import X.InterfaceC60311Nlj;
import X.InterfaceC60324Nlw;
import X.InterfaceC60381Nmr;
import X.InterfaceC60443Nnr;
import X.InterfaceC60447Nnv;
import X.InterfaceC60581Nq5;
import X.InterfaceC60582Nq6;
import X.InterfaceC60585Nq9;
import X.InterfaceC65784Pro;
import X.InterpolatorC61444O9o;
import X.JF7;
import X.JF9;
import X.KMP;
import X.ORZ;
import X.X1D;
import Y.ARunnableS29S0200000_10;
import Y.ARunnableS46S0100000_10;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class BulletPopUpFragment extends AppCompatDialogFragment implements InterfaceC39974FmU, InterfaceC60381Nmr, InterfaceC60447Nnv {
    public static final List<BulletPopUpFragment> LLFFF = new ArrayList();
    public static final List<BulletPopUpFragment> LLFII = new ArrayList();
    public F3T LJLIL;
    public C60193Njp LJLILLLLZI;
    public InterfaceC60585Nq9 LJLJI;
    public InterfaceC40516FvE LJLJJI;
    public InterfaceC60582Nq6 LJLJJL;
    public InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public View LJLJLJ;
    public boolean LJLL;
    public Boolean LJLLI;
    public Boolean LJLLILLLL;
    public Activity LJLLLLLL;
    public InterfaceC59504NWy LJLZ;
    public C60556Npg LJZ;
    public InterfaceC60443Nnr LJZI;
    public Throwable LLFF;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 35));
    public boolean LJLJLLL = true;
    public EnumC60567Npr LJLLJ = EnumC60567Npr.UNKNOWN;
    public EnumC60571Npv LJLLL = EnumC60571Npv.NONE;
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 36));
    public String LJZL = "default_bid";
    public final C62822Ol8 LL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 34));
    public final C62822Ol8 LLD = C221108m2.LIZIZ(new AqS160S0100000_10(this, 32));
    public EnumC60573Npx LLF = EnumC60573Npx.NONE;

    public final FrameLayout Gl() {
        return (FrameLayout) this.LJLJL.getValue();
    }

    public final InterfaceC60581Nq5 Hl() {
        return (InterfaceC60581Nq5) this.LJLLLL.getValue();
    }

    @Override // X.InterfaceC39974FmU
    public final C39976FmW getLoggerWrapper() {
        return (C39976FmW) this.LL.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final C60556Npg Dl() {
        C60556Npg c60556Npg = this.LJZ;
        if (c60556Npg != null) {
            return c60556Npg;
        }
        o.LJIJI("config");
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        xl(new AqS160S0100000_10(this, 33));
    }

    @Override // X.InterfaceC60381Nmr
    public final Uri getSchema() {
        C60556Npg c60556Npg = this.LJZ;
        if (c60556Npg != null) {
            return c60556Npg.LJLJJL;
        }
        o.LJIJI("config");
        throw null;
    }

    public final String wl() {
        F21 LLLLLLJ;
        String str;
        InterfaceC40516FvE interfaceC40516FvE = this.LJLJJI;
        if (interfaceC40516FvE != null && (LLLLLLJ = interfaceC40516FvE.LLLLLLJ()) != null && (str = LLLLLLJ.LJLIL) != null) {
            return str;
        }
        return "";
    }

    @Override // X.InterfaceC60381Nmr
    public final String getChannel() {
        String string;
        InterfaceC60324Nlw LIZIZ = C60373Nmj.LIZIZ();
        C60556Npg c60556Npg = this.LJZ;
        if (c60556Npg != null) {
            InterfaceC60311Nlj<String, Object> LIZIZ2 = LIZIZ.LIZIZ(c60556Npg.LJLIL);
            if (LIZIZ2 != null && (string = LIZIZ2.getString("__x_param_channel")) != null) {
                return string;
            }
            return "";
        }
        o.LJIJI("config");
        throw null;
    }

    @Override // X.InterfaceC60381Nmr
    public final String k3() {
        String string;
        InterfaceC60324Nlw LIZIZ = C60373Nmj.LIZIZ();
        C60556Npg c60556Npg = this.LJZ;
        if (c60556Npg != null) {
            InterfaceC60311Nlj<String, Object> LIZIZ2 = LIZIZ.LIZIZ(c60556Npg.LJLIL);
            if (LIZIZ2 != null && (string = LIZIZ2.getString("__x_param_bundle")) != null) {
                return string;
            }
            return "";
        }
        o.LJIJI("config");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        BulletPopUpFragment LIZIZ;
        InterfaceC60582Nq6 interfaceC60582Nq6;
        InterfaceC60582Nq6 interfaceC60582Nq62;
        super.onDestroy();
        if (this.LJLLLLLL == null || this.LJZ == null) {
            return;
        }
        InterfaceC40516FvE interfaceC40516FvE = this.LJLJJI;
        if (interfaceC40516FvE != null) {
            interfaceC40516FvE.onEvent(new C60565Npp(this));
        }
        InterfaceC60443Nnr interfaceC60443Nnr = this.LJZI;
        if (interfaceC60443Nnr != null) {
            interfaceC60443Nnr.LIZ(this);
        }
        new Handler().postDelayed(new ARunnableS46S0100000_10(this, 3), 100L);
        List<BulletPopUpFragment> list = LLFFF;
        ((ArrayList) list).remove(this);
        BulletPopUpFragment bulletPopUpFragment = (BulletPopUpFragment) ORZ.LLFII(list);
        if (bulletPopUpFragment != null) {
            C60556Npg c60556Npg = bulletPopUpFragment.LJZ;
            if (c60556Npg != null) {
                if (c60556Npg.LJLJJI == 3 && (interfaceC60582Nq62 = bulletPopUpFragment.LJLJJL) != null) {
                    interfaceC60582Nq62.LIZ();
                }
            } else {
                o.LJIJI("config");
                throw null;
            }
        }
        ((ArrayList) LLFII).add(this);
        C60556Npg c60556Npg2 = this.LJZ;
        if (c60556Npg2 != null) {
            if (c60556Npg2.LJLJJI == 1 && (LIZIZ = C60415NnP.LIZIZ(c60556Npg2.LJLZ)) != null && (interfaceC60582Nq6 = LIZIZ.LJLJJL) != null) {
                interfaceC60582Nq6.LIZ();
                return;
            }
            return;
        }
        o.LJIJI("config");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC40516FvE interfaceC40516FvE;
        super.onPause();
        this.LJLLILLLL = Boolean.FALSE;
        if (o.LJ(this.LJLLI, Boolean.TRUE) && (interfaceC40516FvE = this.LJLJJI) != null) {
            interfaceC40516FvE.LLJILJIL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC40516FvE interfaceC40516FvE;
        super.onResume();
        Boolean bool = Boolean.TRUE;
        this.LJLLILLLL = bool;
        if (o.LJ(this.LJLLI, bool) && (interfaceC40516FvE = this.LJLJJI) != null) {
            interfaceC40516FvE.g();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        try {
            C16880lQ.LIZ(getDialog());
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // X.InterfaceC60381Nmr
    public final String zk() {
        return wl();
    }

    @Override // X.InterfaceC60381Nmr
    public final void close() {
        dismissAllowingStateLoss();
    }

    @Override // X.InterfaceC60381Nmr
    public final String getBid() {
        return this.LJZL;
    }

    public static final /* synthetic */ void vl(BulletPopUpFragment bulletPopUpFragment) {
        super.dismiss();
    }

    public final void Al(AqS157S0200000_10 aqS157S0200000_10) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new C60561Npl(this, aqS157S0200000_10));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new InterpolatorC61444O9o(0));
        Animator[] animatorArr = new Animator[1];
        View view = this.LJLJLJ;
        float[] fArr = new float[2];
        if (view != null) {
            fArr[0] = view.getTranslationY();
            fArr[1] = Gl().getHeight();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", fArr);
            o.LJFF(ofFloat, "ObjectAnimator.ofFloat(p…eLayout.height.toFloat())");
            animatorArr[0] = ofFloat;
            List LJJIJIL = C47261Igj.LJJIJIL(animatorArr);
            if (Hl() != null) {
                InterfaceC60581Nq5 Hl = Hl();
                if (Hl != null) {
                    LJJIJIL.add(Hl.LIZ());
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            animatorSet.playTogether(LJJIJIL);
            animatorSet.start();
            return;
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        if (context != null) {
            o.LJFF(context, "context!!");
            DialogC60568Nps dialogC60568Nps = new DialogC60568Nps(this, context);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                dialogC60568Nps.setOwnerActivity(mo49getActivity);
            }
            return dialogC60568Nps;
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.LJLLJ == EnumC60567Npr.UNKNOWN) {
            this.LJLLJ = EnumC60567Npr.TAP_MASK;
        }
        super.onDismiss(dialogInterface);
    }

    public final void xl(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        EnumC60573Npx enumC60573Npx;
        Animator animator;
        String str;
        try {
            if (this.LJLJLJ == null || this.LJLLL == EnumC60571Npv.NONE || (enumC60573Npx = this.LLF) == EnumC60573Npx.DONE) {
                interfaceC65784Pro.invoke();
                return;
            }
            if (this.LLFF != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("reAnimEnd with msg:");
                Throwable th = this.LLFF;
                if (th != null) {
                    str = th.getMessage();
                } else {
                    str = null;
                }
                LIZ.append(str);
                C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), null, "popup", 2);
                interfaceC65784Pro.invoke();
                return;
            }
            EnumC60573Npx enumC60573Npx2 = EnumC60573Npx.DOING;
            if (enumC60573Npx == enumC60573Npx2) {
                return;
            }
            this.LLF = enumC60573Npx2;
            AqS157S0200000_10 aqS157S0200000_10 = new AqS157S0200000_10(this, interfaceC65784Pro, 3);
            int i = C60575Npz.LIZ[this.LJLLL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        aqS157S0200000_10.invoke();
                        return;
                    }
                    InterfaceC60581Nq5 Hl = Hl();
                    if (Hl != null) {
                        animator = Hl.LIZ();
                    } else {
                        animator = null;
                    }
                    if (Hl() != null && animator != null) {
                        animator.setDuration(300L);
                        animator.addListener(new C60561Npl(this, aqS157S0200000_10));
                        animator.start();
                        return;
                    }
                    aqS157S0200000_10.invoke();
                    return;
                }
                Al(aqS157S0200000_10);
                return;
            }
            View view = this.LJLJLJ;
            if (view != null) {
                view.animate().translationX(Gl().getWidth()).setDuration(300L).setListener(new C60561Npl(this, aqS157S0200000_10)).start();
            } else {
                o.LJIIZILJ();
                throw null;
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            C39973FmT.LIZIZ(this, KMP.LJFF(LIZ2, "dismiss failed with: ", e, LIZ2), null, "popup", 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C60556Npg c60556Npg;
        InterfaceC60582Nq6 interfaceC60582Nq6;
        BulletPopUpFragment LIZIZ;
        Dialog dialog;
        Window window;
        o.LJIIJ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LJLLLLLL == null || (c60556Npg = this.LJZ) == null) {
            C39973FmT.LIZIZ(this, "act and config is not init, dismiss dialog fragment", null, "popup", 2);
            dismissAllowingStateLoss();
            return;
        }
        this.LJLJLLL = c60556Npg.LLFII;
        view.post(new ARunnableS29S0200000_10(this, view, 8));
        C60556Npg c60556Npg2 = this.LJZ;
        if (c60556Npg2 != null) {
            view.setBackgroundColor(ColorProtector.parseColor(c60556Npg2.LJLL));
            InterfaceC60581Nq5 Hl = Hl();
            if (Hl != null) {
                Hl.onInit();
            }
            C60556Npg c60556Npg3 = this.LJZ;
            if (c60556Npg3 != null) {
                if (c60556Npg3.LJLLLLLL && (dialog = getDialog()) != null && (window = dialog.getWindow()) != null) {
                    Context context = window.getContext();
                    o.LJFF(context, "context");
                    C60562Npm c60562Npm = new C60562Npm(window, this);
                    if ((window.getAttributes().flags & 512) != 0) {
                        window.clearFlags(512);
                    }
                    View contentView = window.findViewById(R.id.content);
                    JF9 jf9 = new JF9(window, context, new int[]{JF7.LIZ(context, window)}, c60562Npm);
                    o.LJFF(contentView, "contentView");
                    contentView.getViewTreeObserver().addOnGlobalLayoutListener(jf9);
                    contentView.setTag(-8, jf9);
                }
                C60556Npg c60556Npg4 = this.LJZ;
                if (c60556Npg4 != null) {
                    int i = c60556Npg4.LJLJJI;
                    if (i != 0) {
                        if (i != 3 || (LIZIZ = C60415NnP.LIZIZ(c60556Npg4.LJLZ)) == null) {
                            return;
                        }
                        LIZIZ.LJLJJLL = null;
                        InterfaceC60582Nq6 interfaceC60582Nq62 = LIZIZ.LJLJJL;
                        if (interfaceC60582Nq62 == null) {
                            return;
                        }
                        interfaceC60582Nq62.LIZLLL();
                        return;
                    }
                    BulletPopUpFragment LIZIZ2 = C60415NnP.LIZIZ(c60556Npg4.LJLZ);
                    if (LIZIZ2 == null || (interfaceC60582Nq6 = LIZIZ2.LJLJJL) == null) {
                        return;
                    }
                    interfaceC60582Nq6.LIZIZ();
                    return;
                }
                o.LJIJI("config");
                throw null;
            }
            o.LJIJI("config");
            throw null;
        }
        o.LJIJI("config");
        throw null;
    }

    @Override // X.InterfaceC39974FmU
    public final void printReject(Throwable th, String extraMsg) {
        o.LJIIJ(extraMsg, "extraMsg");
        C39973FmT.LIZJ(this, th, extraMsg);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        FrameLayout Gl = Gl();
        C29S c29s = null;
        if (!(Gl instanceof View)) {
            Gl = null;
        }
        if (Gl != null) {
            try {
                ViewTreeLifecycleOwner.set(Gl, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(Gl, this);
                C10A.LIZIZ(Gl, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return Gl;
    }

    @Override // X.InterfaceC39974FmU
    public final void printLog(String msg, EnumC39958FmE logLevel, String subModule) {
        o.LJIIJ(msg, "msg");
        o.LJIIJ(logLevel, "logLevel");
        o.LJIIJ(subModule, "subModule");
        C39973FmT.LIZ(this, msg, logLevel, subModule);
    }
}
