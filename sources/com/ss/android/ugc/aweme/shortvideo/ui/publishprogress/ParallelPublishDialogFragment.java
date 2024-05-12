package com.ss.android.ugc.aweme.shortvideo.ui.publishprogress;

import X.ActivityC45651qj;
import X.AnonymousClass064;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C1B3;
import X.C1B6;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C41625GVh;
import X.C42042Gek;
import X.C42045Gen;
import X.C42047Gep;
import X.C42048Geq;
import X.C42051Get;
import X.C43356Gzw;
import X.C57396Mfo;
import X.C74040T4a;
import X.C76800UCe;
import X.C7MY;
import X.C90903hW;
import X.InterfaceC41630GVm;
import X.InterfaceC42037Gef;
import X.LRD;
import X.O6R;
import Y.AObserverS75S0100000_7;
import Y.ARunnableS18S0300000_7;
import Y.ARunnableS26S0200000_7;
import Y.IDAListenerS233S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ParallelPublishDialogFragment extends Fragment implements IAVPublishService.PublishProgressFragment, InterfaceC41630GVm {
    public C74040T4a LJLIL;
    public TextView LJLILLLLZI;
    public ImageView LJLJI;
    public ImageView LJLJJI;
    public ImageView LJLJJL;
    public TextView LJLJJLL;
    public String LJLJL;
    public TextView LJLJLLL;
    public BaseShortVideoContext LJLL;
    public ViewGroup LJLLI;
    public final C41625GVh LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();
    public final HashSet<String> LJLJLJ = new HashSet<>();
    public final C42051Get LJLLILLLL = new C42051Get();
    public final IAVPublishService LJLLJ = AVExternalServiceImpl.LIZ().publishService();

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressFragment
    public final void setIsChangeAvatar(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressFragment
    public final void setPublishBinder(InterfaceC42037Gef interfaceC42037Gef) {
    }

    public ParallelPublishDialogFragment() {
        C41625GVh c41625GVh = new C41625GVh();
        c41625GVh.LIZLLL.setValue(-1);
        c41625GVh.LIZ.setValue(0);
        this.LJLLL = c41625GVh;
    }

    @Override // X.InterfaceC41630GVm
    public final void X3() {
        this.LJLLILLLL.LIZ();
        wl();
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            imageView.setAlpha(0.0f);
            ImageView imageView2 = this.LJLJJI;
            if (imageView2 != null) {
                imageView2.setTranslationX(C17N.LJIILL(15.0d));
                ImageView imageView3 = this.LJLJJI;
                if (imageView3 != null) {
                    imageView3.setTranslationY(C17N.LJIILL(15.0d));
                    C43356Gzw c43356Gzw = new C43356Gzw();
                    ImageView imageView4 = this.LJLJJI;
                    if (imageView4 != null) {
                        ViewPropertyAnimator withEndAction = imageView4.animate().alpha(1.0f).translationX(0.0f).translationY(0.0f).setDuration(300L).withEndAction(new ARunnableS26S0200000_7(c43356Gzw, this, 6));
                        o.LJIIIIZZ(withEndAction, "override fun startSwitch…cancellationSignal)\n    }");
                        c43356Gzw.LIZIZ(new C42045Gen(this, c43356Gzw, withEndAction));
                        this.LJLLILLLL.LIZJ(c43356Gzw);
                        return;
                    }
                    o.LJIJI("mBGCoverSecond");
                    throw null;
                }
                o.LJIJI("mBGCoverSecond");
                throw null;
            }
            o.LJIJI("mBGCoverSecond");
            throw null;
        }
        o.LJIJI("mBGCoverSecond");
        throw null;
    }

    public final void wl() {
        ImageView imageView = this.LJLJI;
        if (imageView != null) {
            imageView.setAlpha(1.0f);
            ImageView imageView2 = this.LJLJI;
            if (imageView2 != null) {
                imageView2.setTranslationX(0.0f);
                ImageView imageView3 = this.LJLJI;
                if (imageView3 != null) {
                    imageView3.setTranslationY(0.0f);
                    ImageView imageView4 = this.LJLJJI;
                    if (imageView4 != null) {
                        imageView4.setAlpha(1.0f);
                        ImageView imageView5 = this.LJLJJI;
                        if (imageView5 != null) {
                            imageView5.setTranslationX(0.0f);
                            ImageView imageView6 = this.LJLJJI;
                            if (imageView6 != null) {
                                imageView6.setTranslationY(0.0f);
                                ImageView imageView7 = this.LJLJJL;
                                if (imageView7 != null) {
                                    imageView7.setAlpha(1.0f);
                                    ImageView imageView8 = this.LJLJJL;
                                    if (imageView8 != null) {
                                        imageView8.setTranslationX(0.0f);
                                        ImageView imageView9 = this.LJLJJL;
                                        if (imageView9 != null) {
                                            imageView9.setTranslationY(0.0f);
                                            return;
                                        } else {
                                            o.LJIJI("mBGCoverThird");
                                            throw null;
                                        }
                                    }
                                    o.LJIJI("mBGCoverThird");
                                    throw null;
                                }
                                o.LJIJI("mBGCoverThird");
                                throw null;
                            }
                            o.LJIJI("mBGCoverSecond");
                            throw null;
                        }
                        o.LJIJI("mBGCoverSecond");
                        throw null;
                    }
                    o.LJIJI("mBGCoverSecond");
                    throw null;
                }
                o.LJIJI("bgCoverFirst");
                throw null;
            }
            o.LJIJI("bgCoverFirst");
            throw null;
        }
        o.LJIJI("bgCoverFirst");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressFragment
    public final void dismissAllowingStateLossNow() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            try {
                C1B3 c1b3 = new C1B3(fragmentManager);
                c1b3.LJJI(this);
                c1b3.LJII();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressFragment
    public final void hide() {
        ViewGroup viewGroup;
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJIIIZ(this);
            c1b3.LJI();
        }
        if (!this.LJLLJ.isAutoRetry() || (viewGroup = this.LJLLI) == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (mo49getActivity() != null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJI(mo49getActivity);
            LRD.LIZ(mo49getActivity).LJIIIZ(false);
        }
        if (getFragmentManager() != null) {
            FragmentManager fragmentManager = getFragmentManager();
            o.LJI(fragmentManager);
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJJI(this);
            c1b3.LJI();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // X.InterfaceC41630GVm
    public final C41625GVh getState() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC41630GVm
    public final void Bh(AqS154S0200000_7 aqS154S0200000_7) {
        this.LJLLILLLL.LIZ();
        wl();
        ImageView imageView = this.LJLJI;
        if (imageView != null) {
            float x = imageView.getX();
            ImageView imageView2 = this.LJLJJI;
            if (imageView2 != null) {
                float x2 = x - imageView2.getX();
                ImageView imageView3 = this.LJLJI;
                if (imageView3 != null) {
                    float y = imageView3.getY();
                    ImageView imageView4 = this.LJLJJI;
                    if (imageView4 != null) {
                        float y2 = y - imageView4.getY();
                        C43356Gzw c43356Gzw = new C43356Gzw();
                        ImageView imageView5 = this.LJLJI;
                        if (imageView5 != null) {
                            ViewPropertyAnimator alpha = imageView5.animate().alpha(0.0f);
                            if (this.LJLJI != null) {
                                ViewPropertyAnimator duration = alpha.translationY(((-r0.getHeight()) * 2) / 3.0f).setDuration(300L);
                                o.LJIIIIZZ(duration, "bgCoverFirst.animate()\n …ation(ANIMATION_DURATION)");
                                ImageView imageView6 = this.LJLJJI;
                                if (imageView6 != null) {
                                    ViewPropertyAnimator withEndAction = imageView6.animate().translationX(x2).translationY(y2).setDuration(300L).withEndAction(new ARunnableS18S0300000_7(this, c43356Gzw, aqS154S0200000_7, 11));
                                    o.LJIIIIZZ(withEndAction, "override fun startSwitch…cancellationSignal)\n    }");
                                    c43356Gzw.LIZIZ(new C42047Gep(this, c43356Gzw, duration, withEndAction));
                                    this.LJLLILLLL.LIZJ(c43356Gzw);
                                    return;
                                }
                                o.LJIJI("mBGCoverSecond");
                                throw null;
                            }
                            o.LJIJI("bgCoverFirst");
                            throw null;
                        }
                        o.LJIJI("bgCoverFirst");
                        throw null;
                    }
                    o.LJIJI("mBGCoverSecond");
                    throw null;
                }
                o.LJIJI("bgCoverFirst");
                throw null;
            }
            o.LJIJI("mBGCoverSecond");
            throw null;
        }
        o.LJIJI("bgCoverFirst");
        throw null;
    }

    @Override // X.InterfaceC41630GVm
    public final void Ia(AqS96S0300000_7 aqS96S0300000_7) {
        this.LJLLILLLL.LIZ();
        wl();
        ImageView imageView = this.LJLJI;
        if (imageView != null) {
            float x = imageView.getX();
            ImageView imageView2 = this.LJLJJI;
            if (imageView2 != null) {
                float x2 = x - imageView2.getX();
                ImageView imageView3 = this.LJLJI;
                if (imageView3 != null) {
                    float y = imageView3.getY();
                    ImageView imageView4 = this.LJLJJI;
                    if (imageView4 != null) {
                        float y2 = y - imageView4.getY();
                        C43356Gzw c43356Gzw = new C43356Gzw();
                        ImageView imageView5 = this.LJLJI;
                        if (imageView5 != null) {
                            ViewPropertyAnimator alpha = imageView5.animate().alpha(0.0f);
                            if (this.LJLJI != null) {
                                ViewPropertyAnimator duration = alpha.translationY(((-r0.getHeight()) * 2) / 3.0f).setDuration(300L);
                                o.LJIIIIZZ(duration, "bgCoverFirst.animate()\n …ation(ANIMATION_DURATION)");
                                ImageView imageView6 = this.LJLJJL;
                                if (imageView6 != null) {
                                    imageView6.setAlpha(0.0f);
                                    ImageView imageView7 = this.LJLJJL;
                                    if (imageView7 != null) {
                                        imageView7.setTranslationX(C17N.LJIILL(15.0d));
                                        ImageView imageView8 = this.LJLJJL;
                                        if (imageView8 != null) {
                                            imageView8.setTranslationY(C17N.LJIILL(15.0d));
                                            ImageView imageView9 = this.LJLJJL;
                                            if (imageView9 != null) {
                                                ViewPropertyAnimator duration2 = imageView9.animate().alpha(1.0f).translationX(0.0f).translationY(0.0f).setDuration(300L);
                                                o.LJIIIIZZ(duration2, "mBGCoverThird.animate().…ation(ANIMATION_DURATION)");
                                                ImageView imageView10 = this.LJLJJI;
                                                if (imageView10 != null) {
                                                    ViewPropertyAnimator withEndAction = imageView10.animate().translationX(x2).translationY(y2).setDuration(300L).withEndAction(new ARunnableS18S0300000_7(this, c43356Gzw, aqS96S0300000_7, 12));
                                                    o.LJIIIIZZ(withEndAction, "override fun startSwitch…cancellationSignal)\n    }");
                                                    c43356Gzw.LIZIZ(new C42048Geq(this, c43356Gzw, duration, duration2, withEndAction));
                                                    this.LJLLILLLL.LIZJ(c43356Gzw);
                                                    return;
                                                }
                                                o.LJIJI("mBGCoverSecond");
                                                throw null;
                                            }
                                            o.LJIJI("mBGCoverThird");
                                            throw null;
                                        }
                                        o.LJIJI("mBGCoverThird");
                                        throw null;
                                    }
                                    o.LJIJI("mBGCoverThird");
                                    throw null;
                                }
                                o.LJIJI("mBGCoverThird");
                                throw null;
                            }
                            o.LJIJI("bgCoverFirst");
                            throw null;
                        }
                        o.LJIJI("bgCoverFirst");
                        throw null;
                    }
                    o.LJIJI("mBGCoverSecond");
                    throw null;
                }
                o.LJIJI("bgCoverFirst");
                throw null;
            }
            o.LJIJI("mBGCoverSecond");
            throw null;
        }
        o.LJIJI("bgCoverFirst");
        throw null;
    }

    @Override // X.InterfaceC41630GVm
    public final boolean Ib(String publishId) {
        o.LJIIIZ(publishId, "publishId");
        if (this.LJLJLJ.contains(publishId)) {
            return false;
        }
        this.LJLJLJ.add(publishId);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        View view;
        View view2;
        ViewParent viewParent;
        View findViewById;
        View findViewById2;
        super.onActivityCreated(bundle);
        if (mo49getActivity() != null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJI(mo49getActivity);
            LRD.LIZ(mo49getActivity).LJIIIZ(true);
        }
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        ViewParent viewParent2 = null;
        if (mo49getActivity2 != null) {
            view = mo49getActivity2.findViewById(R.id.kmk);
        } else {
            view = null;
        }
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view).setClipChildren(false);
        ActivityC45651qj mo49getActivity3 = mo49getActivity();
        if (mo49getActivity3 != null) {
            view2 = mo49getActivity3.findViewById(R.id.kmk);
        } else {
            view2 = null;
        }
        o.LJII(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view2).setClipToPadding(false);
        ActivityC45651qj mo49getActivity4 = mo49getActivity();
        if (mo49getActivity4 != null && (findViewById2 = mo49getActivity4.findViewById(R.id.kmk)) != null) {
            viewParent = findViewById2.getParent();
        } else {
            viewParent = null;
        }
        o.LJII(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) viewParent).setClipChildren(false);
        ActivityC45651qj mo49getActivity5 = mo49getActivity();
        if (mo49getActivity5 != null && (findViewById = mo49getActivity5.findViewById(R.id.kmk)) != null) {
            viewParent2 = findViewById.getParent();
        }
        o.LJII(viewParent2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) viewParent2).setClipToPadding(false);
        this.LJLLL.LIZ.observe(this, new AObserverS75S0100000_7(this, 32));
        this.LJLLL.LIZJ.observe(this, new AObserverS75S0100000_7(this, 33));
        this.LJLLL.LIZLLL.observe(this, new AObserverS75S0100000_7(this, 34));
        this.LJLLL.LJII.observe(this, new AObserverS75S0100000_7(this, 35));
        this.LJLLL.LJIIIIZZ.observe(this, new AObserverS75S0100000_7(this, 36));
        this.LJLLL.LJ.observe(this, new AObserverS75S0100000_7(this, 37));
        this.LJLLL.LJFF.observe(this, new AObserverS75S0100000_7(this, 38));
        this.LJLLL.LJI.observe(this, new AObserverS75S0100000_7(this, 39));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressFragment
    public final void setPublishId(String str) {
        this.LJLJL = str;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressFragment
    public final void show(boolean z) {
        ViewGroup viewGroup = this.LJLLI;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        FragmentManager requireFragmentManager = requireFragmentManager();
        C1B3 LIZ = C1B6.LIZ(requireFragmentManager, requireFragmentManager);
        if (z) {
            LIZ.LJIIJJI(R.anim.fx, R.anim.fy, 0, 0);
        }
        LIZ.LJIIL(this);
        LIZ.LJI();
    }

    public final void vl(View view) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new C42042Gek());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            LRD.LIZ(mo49getActivity).LJIIIZ(true);
        }
        View findViewById = view.findViewById(R.id.aj6);
        if (findViewById != null) {
            this.LJLJI = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.aj8);
            if (findViewById2 != null) {
                this.LJLJJI = (ImageView) findViewById2;
                View findViewById3 = view.findViewById(R.id.aj9);
                if (findViewById3 != null) {
                    this.LJLJJL = (ImageView) findViewById3;
                    View findViewById4 = view.findViewById(R.id.f6h);
                    if (findViewById4 != null) {
                        C74040T4a c74040T4a = (C74040T4a) findViewById4;
                        this.LJLIL = c74040T4a;
                        c74040T4a.setIndeterminate(false);
                        View findViewById5 = view.findViewById(R.id.lxc);
                        if (findViewById5 != null) {
                            this.LJLILLLLZI = (TextView) findViewById5;
                            View findViewById6 = view.findViewById(R.id.n3y);
                            if (findViewById6 != null) {
                                this.LJLJJLL = (TextView) findViewById6;
                                View findViewById7 = view.findViewById(R.id.aa_);
                                if (findViewById7 != null) {
                                    this.LJLJLLL = (TextView) findViewById7;
                                    if (this.LJLLJ.needShowAnim()) {
                                        ImageView imageView = this.LJLJI;
                                        if (imageView != null) {
                                            int id = imageView.getId();
                                            if (this.LJLLJ.isMultiTaskRecover()) {
                                                ImageView imageView2 = this.LJLJJI;
                                                if (imageView2 != null) {
                                                    id = imageView2.getId();
                                                    TextView textView = this.LJLJLLL;
                                                    if (textView != null) {
                                                        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                                                        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                                        marginLayoutParams.width = C7MY.LIZIZ(116);
                                                        marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
                                                        TextView textView2 = this.LJLJLLL;
                                                        if (textView2 != null) {
                                                            textView2.setLayoutParams(marginLayoutParams);
                                                        } else {
                                                            o.LJIJI("autoUploadingText");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("autoUploadingText");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("mBGCoverSecond");
                                                    throw null;
                                                }
                                            }
                                            TextView textView3 = this.LJLJLLL;
                                            if (textView3 != null) {
                                                if (textView3.getLineCount() <= 3) {
                                                    View findViewById8 = view.findViewById(R.id.j71);
                                                    o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.root)");
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) findViewById8;
                                                    AnonymousClass064 LIZ = C57396Mfo.LIZ(constraintLayout);
                                                    TextView textView4 = this.LJLJLLL;
                                                    if (textView4 != null) {
                                                        LIZ.LJIIIIZZ(textView4.getId(), 4, id, 4);
                                                        LIZ.LIZIZ(constraintLayout);
                                                    } else {
                                                        o.LJIJI("autoUploadingText");
                                                        throw null;
                                                    }
                                                }
                                                TextView textView5 = this.LJLJLLL;
                                                if (textView5 != null) {
                                                    textView5.setVisibility(0);
                                                } else {
                                                    o.LJIJI("autoUploadingText");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("autoUploadingText");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("bgCoverFirst");
                                            throw null;
                                        }
                                    }
                                    View findViewById9 = view.findViewById(R.id.aj7);
                                    o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.bg_cover_mask)");
                                    vl(findViewById9);
                                    ImageView imageView3 = this.LJLJI;
                                    if (imageView3 != null) {
                                        vl(imageView3);
                                        ImageView imageView4 = this.LJLJJI;
                                        if (imageView4 != null) {
                                            vl(imageView4);
                                            ImageView imageView5 = this.LJLJJL;
                                            if (imageView5 != null) {
                                                vl(imageView5);
                                                return;
                                            } else {
                                                o.LJIJI("mBGCoverThird");
                                                throw null;
                                            }
                                        }
                                        o.LJIJI("mBGCoverSecond");
                                        throw null;
                                    }
                                    o.LJIJI("bgCoverFirst");
                                    throw null;
                                }
                                "ID does not reference a View inside this View".toString();
                                throw new IllegalArgumentException("ID does not reference a View inside this View");
                            }
                            "ID does not reference a View inside this View".toString();
                            throw new IllegalArgumentException("ID does not reference a View inside this View");
                        }
                        "ID does not reference a View inside this View".toString();
                        throw new IllegalArgumentException("ID does not reference a View inside this View");
                    }
                    "ID does not reference a View inside this View".toString();
                    throw new IllegalArgumentException("ID does not reference a View inside this View");
                }
                "ID does not reference a View inside this View".toString();
                throw new IllegalArgumentException("ID does not reference a View inside this View");
            }
            "ID does not reference a View inside this View".toString();
            throw new IllegalArgumentException("ID does not reference a View inside this View");
        }
        "ID does not reference a View inside this View".toString();
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressFragment
    public final void show(FragmentManager manager, String str) {
        int i;
        o.LJIIIZ(manager, "manager");
        C1B3 c1b3 = new C1B3(manager);
        if (this.LJLLJ.needShowAnim()) {
            i = R.anim.eu;
        } else {
            i = R.anim.fx;
        }
        c1b3.LJIIJJI(i, R.anim.fy, 0, 0);
        c1b3.LJIIIIZZ(R.id.kmk, 1, this, str);
        c1b3.LJI();
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        if (!this.LJLLJ.needShowAnim() || i2 != R.anim.eu) {
            return super.onCreateAnimation(i, z, i2);
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(mo49getActivity(), i2);
        loadAnimation.setAnimationListener(new IDAListenerS233S0100000_7(this, 0));
        return loadAnimation;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        this.LJLLI = viewGroup;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ax6, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressFragment
    public final void showInSpecificId(FragmentManager fragmentManager, String str, int i, boolean z) {
        int i2;
        if (fragmentManager != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            if (z) {
                if (this.LJLLJ.needShowAnim()) {
                    i2 = R.anim.eu;
                } else {
                    i2 = R.anim.fx;
                }
                c1b3.LJIIJJI(i2, R.anim.fy, 0, 0);
            }
            c1b3.LJIIIIZZ(i, 1, this, str);
            c1b3.LJI();
        }
    }
}
