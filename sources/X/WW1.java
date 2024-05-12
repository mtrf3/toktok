package X;

import Y.ACListenerS34S0100000_14;
import Y.AUListenerS101S0100000_14;
import Y.AUListenerS102S0200000_13;
import Y.IDAListenerS81S0100000_14;
import Y.IDObjectS185S0100000_14;
import Y.IDrS52S0100000_14;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.slideslip.rv.CenterLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WW1 extends WM7 implements InterfaceC74398THu {
    public static final /* synthetic */ int LLIZ = 0;
    public final WW6 LJLIL;
    public final C34380DeS LJLILLLLZI;
    public final InterfaceC74398THu LJLJI;
    public final TEZ LJLJJI;
    public View LJLJJL;
    public FrameLayout LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public RecyclerView LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public ImageView LJLLJ;
    public TextView LJLLL;
    public View LJLLLL;
    public View LJLLLLLL;
    public TuxIconView LJLZ;
    public TextView LJZ;
    public TEW LJZI;
    public ViewGroup LJZL;
    public View LL;
    public View LLD;
    public TextView LLF;
    public ImageView LLFF;
    public View LLFFF;
    public View LLFII;
    public TDV LLFZ;
    public LinearLayout LLI;
    public View LLIFFJFJJ;
    public View LLII;
    public ImageView LLIIII;
    public ViewGroup LLIIIILZ;
    public ViewGroup LLIIIJ;
    public ValueAnimator LLIIIL;
    public View LLIIIZ;
    public View LLIIJI;
    public IDH LLIIJLIL;
    public AbstractC77369UYb LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public boolean LLIIZ;
    public boolean LLIL;
    public String LLILII;
    public boolean LLILIL;
    public final C62822Ol8 LLILL;
    public final C62822Ol8 LLILLIZIL;
    public final C62822Ol8 LLILLJJLI;
    public int LLILLL;
    public Vibrator LLILZ;
    public Animator LLILZIL;
    public WW2 LLILZLL;

    public final void LLJILJIL() {
        View findViewById;
        ViewParent viewParent;
        ViewGroup viewGroup;
        View cb;
        LinearLayout linearLayout = this.LLI;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            ViewGroup viewGroup2 = this.LLIIIILZ;
            if (viewGroup2 != null) {
                if (this.LLIIJI == null) {
                    View findViewById2 = viewGroup2.findViewById(R.id.kgf);
                    if (findViewById2 != null) {
                        this.LLIIJI = findViewById2;
                    }
                }
                viewGroup2.removeAllViews();
                LinearLayout linearLayout2 = this.LLI;
                if (linearLayout2 != null) {
                    linearLayout2.addView(this.LLIIJI, new FrameLayout.LayoutParams(-1, -2));
                    View view = this.LLIIJI;
                    if (view != null && (findViewById = view.findViewById(R.id.fmc)) != null) {
                        findViewById.setVisibility(8);
                    }
                } else {
                    o.LJIJI("stickerBarCanRemove");
                    throw null;
                }
            }
            if (this.LLIIIZ == null) {
                IDH idh = this.LLIIJLIL;
                if (idh == null || (cb = idh.cb()) == null) {
                    return;
                } else {
                    this.LLIIIZ = cb;
                }
            }
            View view2 = this.LLIIIZ;
            if (view2 != null) {
                viewParent = view2.getParent();
            } else {
                viewParent = null;
            }
            if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
                viewGroup.removeAllViews();
            }
            LinearLayout linearLayout3 = this.LLI;
            if (linearLayout3 != null) {
                linearLayout3.addView(this.LLIIIZ, new FrameLayout.LayoutParams(-2, -2));
                return;
            } else {
                o.LJIJI("stickerBarCanRemove");
                throw null;
            }
        }
        o.LJIJI("stickerBarCanRemove");
        throw null;
    }

    public final OSZ<Effect, String> LLJILJILJ() {
        Object obj = this.LLIIL;
        if (obj == null || !(obj instanceof InterfaceC47392Iiq)) {
            return null;
        }
        InterfaceC47392Iiq interfaceC47392Iiq = (InterfaceC47392Iiq) obj;
        return new OSZ<>(interfaceC47392Iiq.LIZ(), interfaceC47392Iiq.getTabName());
    }

    public final boolean LLJJIJIL() {
        if (this.LJLJJL != null) {
            return true;
        }
        return false;
    }

    public final UYQ LLJJJ() {
        return (UYQ) this.LLILL.getValue();
    }

    public final void LLJJL() {
        ViewGroup viewGroup;
        View findViewById;
        ViewGroup viewGroup2;
        LinearLayout linearLayout = this.LLI;
        ViewParent viewParent = null;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            if (this.LLIIJI != null && (viewGroup = this.LLIIIILZ) != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(this.LLIIJI, new FrameLayout.LayoutParams(-1, -2));
                View view = this.LLIIJI;
                if (view != null && (findViewById = view.findViewById(R.id.fmc)) != null) {
                    findViewById.setVisibility(0);
                }
            }
            View view2 = this.LLIIIZ;
            if (view2 != null) {
                viewParent = view2.getParent();
            }
            if ((viewParent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewParent) != null) {
                viewGroup2.removeAllViews();
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            if (this.LLIIIZ != null && this.LJLILLLLZI.LJI.invoke().booleanValue()) {
                layoutParams.gravity = 17;
            }
            ViewGroup viewGroup3 = this.LLIIIJ;
            if (viewGroup3 != null) {
                viewGroup3.addView(this.LLIIIZ, layoutParams);
                return;
            }
            return;
        }
        o.LJIJI("stickerBarCanRemove");
        throw null;
    }

    public final void LLLF() {
        if (this.LLILZ == null) {
            Activity activity = this.mActivity;
            if (activity != null) {
                Object LLILIL = C16880lQ.LLILIL(activity, "vibrator");
                o.LJII(LLILIL, "null cannot be cast to non-null type android.os.Vibrator");
                this.LLILZ = (Vibrator) LLILIL;
            } else {
                Activity requireActivity = requireActivity();
                if (requireActivity != null) {
                    Object LLILIL2 = C16880lQ.LLILIL(requireActivity, "vibrator");
                    o.LJII(LLILIL2, "null cannot be cast to non-null type android.os.Vibrator");
                    this.LLILZ = (Vibrator) LLILIL2;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = this.LLILZ;
            if (vibrator != null) {
                vibrator.vibrate(VibrationEffect.createOneShot(35L, 100));
                return;
            }
            return;
        }
        Vibrator vibrator2 = this.LLILZ;
        if (vibrator2 == null) {
            return;
        }
        vibrator2.vibrate(35L);
    }

    public final TEN LLJJJIL() {
        if (!LLJJIJIL()) {
            return TEN.NONE;
        }
        TEW tew = this.LJZI;
        if (tew != null) {
            return (TEN) tew.getState();
        }
        o.LJIJI("statusView");
        throw null;
    }

    @Override // X.InterfaceC74398THu
    public final void LLILLIZIL(Effect effect) {
        LLJZIJLIL(0, effect);
        this.LJLJI.LLILLIZIL(effect);
    }

    public final void LLJJIII(TEN state) {
        o.LJIIIZ(state, "state");
        if (!LLJJIJIL()) {
            return;
        }
        if (state == TEN.ERROR || state == TEN.LOADING) {
            ViewGroup viewGroup = this.LJZL;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                View view = this.LJLJLLL;
                if (view != null) {
                    view.setVisibility(8);
                    LLJLIL(false, false);
                } else {
                    o.LJIJI("rootSticker");
                    throw null;
                }
            } else {
                o.LJIJI("stateViewRoot");
                throw null;
            }
        } else {
            ViewGroup viewGroup2 = this.LJZL;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
                View view2 = this.LJLJLLL;
                if (view2 != null) {
                    view2.setVisibility(0);
                    LLJLIL(true, false);
                } else {
                    o.LJIJI("rootSticker");
                    throw null;
                }
            } else {
                o.LJIJI("stateViewRoot");
                throw null;
            }
        }
        TEW tew = this.LJZI;
        if (tew != null) {
            tew.setState(state);
        } else {
            o.LJIJI("statusView");
            throw null;
        }
    }

    public final void LLJJIJI(boolean z) {
        if (z) {
            View view = this.LJLJJL;
            if (view != null) {
                view.setVisibility(0);
                View view2 = this.LJLJL;
                if (view2 != null) {
                    view2.setVisibility(0);
                    View view3 = this.LJLJLLL;
                    if (view3 != null) {
                        view3.setVisibility(0);
                        View view4 = this.LL;
                        if (view4 != null) {
                            view4.setVisibility(0);
                            LLJLIL(true, false);
                            LLJILJIL();
                            this.LLIILZL = true;
                            return;
                        }
                        o.LJIJI("stickerIconCancel");
                        throw null;
                    }
                    o.LJIJI("rootSticker");
                    throw null;
                }
                o.LJIJI("rootSlideSlipContainer");
                throw null;
            }
            o.LJIJI("rootView");
            throw null;
        }
        View view5 = this.LJLJJL;
        if (view5 != null) {
            view5.setVisibility(8);
            View view6 = this.LJLJL;
            if (view6 != null) {
                view6.setVisibility(8);
                View view7 = this.LJLJLLL;
                if (view7 != null) {
                    view7.setVisibility(8);
                    View view8 = this.LL;
                    if (view8 != null) {
                        view8.setVisibility(8);
                        LLJLIL(false, false);
                        LLJJL();
                        this.LLIILZL = false;
                        return;
                    }
                    o.LJIJI("stickerIconCancel");
                    throw null;
                }
                o.LJIJI("rootSticker");
                throw null;
            }
            o.LJIJI("rootSlideSlipContainer");
            throw null;
        }
        o.LJIJI("rootView");
        throw null;
    }

    public final void LLJJJJ(int i) {
        if (this.LLILLL <= 0 && LLJJIJIL()) {
            View view = this.LJLJJL;
            if (view != null) {
                int LJ = C74275TDb.LJ(view.getContext()) / 2;
                View view2 = this.LJLJJL;
                if (view2 != null) {
                    Context context = view2.getContext();
                    o.LJIIIIZZ(context, "rootView.context");
                    this.LLILLL = LJ - ((int) C74275TDb.LIZIZ(context, 30.0f));
                } else {
                    o.LJIJI("rootView");
                    throw null;
                }
            } else {
                o.LJIJI("rootView");
                throw null;
            }
        }
        RecyclerView recyclerView = this.LJLL;
        if (recyclerView != null) {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).LJFF(i, this.LLILLL);
            return;
        }
        o.LJIJI("rvSlideSlip");
        throw null;
    }

    public final void LLJJLIIIJLLLLLLLZ(boolean z) {
        TEZ tez = this.LJLJJI;
        if (tez != null && !tez.LJJII()) {
            return;
        }
        if (z) {
            TDV tdv = this.LLFZ;
            if (tdv != null) {
                tdv.setVisibility(0);
                View view = this.LLIFFJFJJ;
                if (view != null) {
                    view.setVisibility(0);
                    return;
                } else {
                    o.LJIJI("downloadBgView");
                    throw null;
                }
            }
            o.LJIJI("circleProcessView");
            throw null;
        }
        TDV tdv2 = this.LLFZ;
        if (tdv2 != null) {
            tdv2.setVisibility(8);
            View view2 = this.LLIFFJFJJ;
            if (view2 != null) {
                view2.setVisibility(8);
                return;
            } else {
                o.LJIJI("downloadBgView");
                throw null;
            }
        }
        o.LJIJI("circleProcessView");
        throw null;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        int i;
        GradientDrawable gradientDrawable;
        int i2;
        super.onActivityCreated(bundle);
        if (LLJJIJIL()) {
            Activity requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            RecyclerView recyclerView = this.LJLL;
            if (recyclerView != null) {
                recyclerView.setAdapter(LLJJJ());
                recyclerView.setLayoutManager(new CenterLayoutManager(requireActivity));
                ((AbstractC28951Br) this.LLILLJJLI.getValue()).LIZIZ(recyclerView);
                recyclerView.LJIIJJI(new IDrS52S0100000_14(this, 2));
                WW8 LIZLLL = this.LJLIL.LIZLLL();
                if (LIZLLL != null) {
                    recyclerView.LJIIJJI(LIZLLL);
                }
                recyclerView.LJII(new C4KW((int) C74275TDb.LIZIZ(requireActivity, 5.0f), (C74275TDb.LJ(requireActivity) / 2) - ((int) C74275TDb.LIZIZ(requireActivity, 25.0f))), -1);
                this.LJLIL.LJIIJJI(recyclerView);
                TextView textView = this.LJZ;
                if (textView != null) {
                    if (this.LJLILLLLZI.LIZ.invoke().booleanValue()) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    textView.setVisibility(i);
                    if (this.LJLILLLLZI.LJIILJJIL.invoke().booleanValue()) {
                        TuxIconView tuxIconView = this.LJLZ;
                        if (tuxIconView != null) {
                            tuxIconView.setIconRes(R.raw.icon_chevron_up);
                        } else {
                            o.LJIJI("exploreIconView");
                            throw null;
                        }
                    } else {
                        TuxIconView tuxIconView2 = this.LJLZ;
                        if (tuxIconView2 != null) {
                            tuxIconView2.setIconRes(R.drawable.vp);
                        } else {
                            o.LJIJI("exploreIconView");
                            throw null;
                        }
                    }
                    if (this.LJLILLLLZI.LIZIZ.invoke().booleanValue()) {
                        TextView textView2 = this.LJLLL;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            View view = this.LJLLLLLL;
                            if (view != null) {
                                view.setVisibility(0);
                            } else {
                                o.LJIJI("exploreTextView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("favoriteTextView");
                            throw null;
                        }
                    } else {
                        TextView textView3 = this.LJLLL;
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                            View view2 = this.LJLLLLLL;
                            if (view2 != null) {
                                view2.setVisibility(8);
                            } else {
                                o.LJIJI("exploreTextView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("favoriteTextView");
                            throw null;
                        }
                    }
                    if (this.LJLILLLLZI.LIZJ.invoke().booleanValue()) {
                        ImageView imageView = this.LLIIII;
                        if (imageView != null) {
                            imageView.setImageResource(R.drawable.vl);
                            View view3 = this.LL;
                            if (view3 != null) {
                                Drawable background = view3.getBackground();
                                if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                                    Integer LJI = C79045V0n.LJI(R.attr.ef, requireActivity);
                                    if (LJI != null) {
                                        i2 = LJI.intValue();
                                    } else {
                                        i2 = 0;
                                    }
                                    gradientDrawable.setColor(i2);
                                }
                            } else {
                                o.LJIJI("stickerIconCancel");
                                throw null;
                            }
                        } else {
                            o.LJIJI("ivRecordCancel");
                            throw null;
                        }
                    }
                    if (!this.LJLILLLLZI.LJIILL.invoke().booleanValue()) {
                        View view4 = this.LLD;
                        if (view4 != null) {
                            view4.setVisibility(8);
                        } else {
                            o.LJIJI("stickerIconCancelRoot");
                            throw null;
                        }
                    }
                    if (!this.LJLILLLLZI.LJIILLIIL.invoke().booleanValue()) {
                        View view5 = this.LLFFF;
                        if (view5 != null) {
                            view5.setVisibility(8);
                        } else {
                            o.LJIJI("stickerCenterCancelRoot");
                            throw null;
                        }
                    } else {
                        View view6 = this.LLFFF;
                        if (view6 != null) {
                            view6.setVisibility(0);
                            ImageView imageView2 = this.LLFF;
                            if (imageView2 != null) {
                                C78866UxK.LJJIIJZLJL(imageView2);
                                ImageView imageView3 = this.LLFF;
                                if (imageView3 != null) {
                                    C16880lQ.LJIILLIIL(imageView3, new ACListenerS34S0100000_14(this, 60));
                                    TextView textView4 = this.LLF;
                                    if (textView4 != null) {
                                        textView4.addTextChangedListener(new IDObjectS185S0100000_14(this, 3));
                                    } else {
                                        o.LJIJI("stickerCenterCancelText");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("stickerCenterCancelIcon");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("stickerCenterCancelIcon");
                                throw null;
                            }
                        } else {
                            o.LJIJI("stickerCenterCancelRoot");
                            throw null;
                        }
                    }
                    if (this.LJLILLLLZI.LJIIZILJ.invoke().booleanValue()) {
                        View view7 = this.LJLJL;
                        if (view7 != null) {
                            view7.setBackgroundResource(android.R.color.transparent);
                        } else {
                            o.LJIJI("rootSlideSlipContainer");
                            throw null;
                        }
                    }
                    if (this.LJLILLLLZI.LJIJ.invoke().booleanValue()) {
                        View view8 = this.LLFII;
                        if (view8 != null) {
                            view8.setVisibility(8);
                        } else {
                            o.LJIJI("llFakeShadow");
                            throw null;
                        }
                    }
                    if (this.LJLILLLLZI.LJIJI.invoke().booleanValue()) {
                        View view9 = this.LJLLILLLL;
                        if (view9 != null) {
                            view9.setVisibility(8);
                            View view10 = this.LJLLLL;
                            if (view10 != null) {
                                view10.setVisibility(8);
                            } else {
                                o.LJIJI("exploreView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("favoriteView");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("stickerNameView");
                    throw null;
                }
            } else {
                o.LJIJI("rvSlideSlip");
                throw null;
            }
        }
        if (!LLJJIJIL()) {
            return;
        }
        View view11 = this.LJLLILLLL;
        if (view11 != null) {
            C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 57), view11);
            View view12 = this.LJLLLL;
            if (view12 != null) {
                C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 58), view12);
                View view13 = this.LL;
                if (view13 != null) {
                    C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 59), view13);
                    return;
                } else {
                    o.LJIJI("stickerIconCancel");
                    throw null;
                }
            }
            o.LJIJI("exploreView");
            throw null;
        }
        o.LJIJI("favoriteView");
        throw null;
    }

    @Override // X.InterfaceC74398THu
    public final void onSuccess(Effect effect) {
        LLJZIJLIL(100, effect);
        this.LJLJI.onSuccess(effect);
    }

    @Override // X.InterfaceC74398THu
    public final void LJFF(int i, Effect effect) {
        LLJZIJLIL(i, effect);
        this.LJLJI.LJFF(i, effect);
    }

    @Override // X.InterfaceC74398THu
    public final void LJLIIL(Effect effect, ExceptionResult exceptionResult) {
        LLJZIJLIL(0, effect);
        this.LJLJI.LJLIIL(effect, exceptionResult);
    }

    public final void LLJJ(boolean z, boolean z2) {
        int i;
        if (!LLJJIJIL()) {
            return;
        }
        if (z2) {
            ImageView imageView = this.LJLLJ;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            } else {
                o.LJIJI("favoriteIcon");
                throw null;
            }
        }
        ImageView imageView2 = this.LJLLJ;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
            InterfaceC88472Yns<Boolean, Integer> interfaceC88472Yns = this.LJLILLLLZI.LJIJJLI;
            if (interfaceC88472Yns != null) {
                ImageView imageView3 = this.LJLLJ;
                if (imageView3 != null) {
                    imageView3.setImageResource(interfaceC88472Yns.invoke(Boolean.valueOf(z)).intValue());
                } else {
                    o.LJIJI("favoriteIcon");
                    throw null;
                }
            }
            TextView textView = this.LJLLL;
            if (textView != null) {
                if (z) {
                    i = R.string.dgs;
                } else {
                    i = R.string.ros;
                }
                textView.setText(i);
                return;
            }
            o.LJIJI("favoriteTextView");
            throw null;
        }
        o.LJIJI("favoriteIcon");
        throw null;
    }

    public final void LLJLIL(boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (z2) {
            if (z) {
                ValueAnimator valueAnimator3 = this.LLIIIL;
                if (valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator2 = this.LLIIIL) != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.LLIIIL = ofFloat;
                ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 19));
                ofFloat.addListener(new IDAListenerS81S0100000_14(this, 4));
                ofFloat.setInterpolator(new InterpolatorC61446O9q(0.25d, 0.1d, 0.25d));
                ofFloat.setDuration(200L);
                ofFloat.start();
                return;
            }
            ValueAnimator valueAnimator4 = this.LLIIIL;
            if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator = this.LLIIIL) != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.LLIIIL = ofFloat2;
            ofFloat2.addUpdateListener(new AUListenerS101S0100000_14(this, 20));
            ofFloat2.addListener(new IDAListenerS81S0100000_14(this, 5));
            ofFloat2.setInterpolator(new InterpolatorC61446O9q(0.25d, 0.1d, 0.25d));
            ofFloat2.setDuration(200L);
            ofFloat2.start();
            return;
        }
        if (z) {
            View view = this.LJLLI;
            if (view != null) {
                view.setVisibility(0);
                return;
            } else {
                o.LJIJI("rootToolsContainer");
                throw null;
            }
        }
        View view2 = this.LJLLI;
        if (view2 != null) {
            view2.setVisibility(8);
            LLJJLIIIJLLLLLLLZ(false);
        } else {
            o.LJIJI("rootToolsContainer");
            throw null;
        }
    }

    public final void LLJZIJLIL(int i, Effect effect) {
        String str;
        if (this.LLIILII) {
            return;
        }
        OSZ<Effect, String> LLJILJILJ = LLJILJILJ();
        if (LLJILJILJ != null) {
            String effectId = LLJILJILJ.getFirst().getEffectId();
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            if (o.LJ(effectId, str) && LLJILJILJ.getFirst().getEffectId().length() > 0) {
                if (i == 100) {
                    LLJJLIIIJLLLLLLLZ(false);
                    this.LJLIL.LJII();
                    return;
                }
                LLJJLIIIJLLLLLLLZ(true);
                TDV tdv = this.LLFZ;
                if (tdv != null) {
                    tdv.setProgress(i);
                    return;
                } else {
                    o.LJIJI("circleProcessView");
                    throw null;
                }
            }
            return;
        }
        LLJJLIIIJLLLLLLLZ(false);
    }

    public final void LLL(Effect effect, boolean z) {
        String name;
        OSZ<Effect, String> LLJILJILJ;
        if (z && effect != null && (LLJILJILJ = LLJILJILJ()) != null && !o.LJ(LLJILJILJ.getFirst(), effect)) {
            return;
        }
        if (effect != null) {
            TextView textView = this.LJZ;
            if (textView != null) {
                textView.setText(effect.getName());
                if (this.LJLILLLLZI.LJIILLIIL.invoke().booleanValue() && (name = effect.getName()) != null && name.length() != 0) {
                    TextView textView2 = this.LLF;
                    if (textView2 != null) {
                        textView2.setText(effect.getName());
                    } else {
                        o.LJIJI("stickerCenterCancelText");
                        throw null;
                    }
                }
                LLJJ(this.LJLIL.LJIILIIL(effect), this.LJLIL.LJIIL(effect));
                return;
            }
            o.LJIJI("stickerNameView");
            throw null;
        }
        TextView textView3 = this.LJZ;
        if (textView3 != null) {
            textView3.setText("");
            TextView textView4 = this.LLF;
            if (textView4 != null) {
                textView4.setText("");
                LLJJ(false, false);
                return;
            } else {
                o.LJIJI("stickerCenterCancelText");
                throw null;
            }
        }
        o.LJIJI("stickerNameView");
        throw null;
    }

    public static final void LLJLLL(WW1 ww1, boolean z, AbstractC77369UYb abstractC77369UYb) {
        int LJLLLLLL = ww1.LLJJJ().LJLLLLLL(abstractC77369UYb, false);
        if (z) {
            int i = LJLLLLLL + 1;
            if (i < ww1.LLJJJ().getItemCount()) {
                RecyclerView recyclerView = ww1.LJLL;
                if (recyclerView != null) {
                    recyclerView.LJLIL(i);
                    return;
                } else {
                    o.LJIJI("rvSlideSlip");
                    throw null;
                }
            }
            return;
        }
        int i2 = LJLLLLLL - 1;
        if (i2 < 0) {
            return;
        }
        RecyclerView recyclerView2 = ww1.LJLL;
        if (recyclerView2 != null) {
            recyclerView2.LJLIL(i2);
        } else {
            o.LJIJI("rvSlideSlip");
            throw null;
        }
    }

    public final void LLJJIJIIJIL(AbstractC77369UYb abstractC77369UYb, Effect effect, String str) {
        if (o.LJ(this.LLIIL, abstractC77369UYb)) {
            if (effect != null) {
                LLL(effect, false);
                return;
            }
            return;
        }
        this.LLILII = str;
        this.LJLIL.LJFF(abstractC77369UYb, effect, this, new WWK(str, LLJJJ().LJLLLLLL(abstractC77369UYb, true) + 1));
        this.LLIIZ = false;
        this.LLILIL = false;
        this.LLIIL = abstractC77369UYb;
        if (effect == null) {
            OSZ<Effect, String> LLJILJILJ = LLJILJILJ();
            if (LLJILJILJ != null) {
                effect = LLJILJILJ.getFirst();
            } else {
                effect = null;
            }
        }
        LLL(effect, false);
        LLLF();
    }

    public final void LLJLLIL(int i, long j, boolean z) {
        int intValue;
        int i2;
        View view = this.LJLJL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            View view2 = this.LJLJL;
            if (view2 != null) {
                view2.clearAnimation();
                View view3 = this.LLFFF;
                if (view3 != null) {
                    view3.clearAnimation();
                    Animator animator = this.LLILZIL;
                    if (animator != null) {
                        animator.cancel();
                    }
                    if (i != -1) {
                        if (i != 0) {
                            return;
                        }
                        if (z) {
                            intValue = 1;
                            i2 = ((Number) this.LLILLIZIL.getValue()).intValue();
                        } else {
                            intValue = ((Number) this.LLILLIZIL.getValue()).intValue();
                            i2 = 1;
                        }
                        layoutParams.height = intValue;
                        View view4 = this.LJLJL;
                        if (view4 != null) {
                            view4.setLayoutParams(layoutParams);
                            ValueAnimator ofInt = ValueAnimator.ofInt(intValue, i2);
                            ofInt.setDuration(200L);
                            ofInt.setInterpolator(new InterpolatorC61446O9q(0.25d, 0.1d, 0.25d));
                            ofInt.addUpdateListener(new AUListenerS102S0200000_13(layoutParams, this, 5));
                            ofInt.addListener(new WWQ(z, this, j));
                            ofInt.start();
                            this.LLILZIL = ofInt;
                            if (!z) {
                                return;
                            }
                            LLJJIJI(z);
                            return;
                        }
                        o.LJIJI("rootSlideSlipContainer");
                        throw null;
                    }
                    layoutParams.height = ((Number) this.LLILLIZIL.getValue()).intValue();
                    View view5 = this.LJLJL;
                    if (view5 != null) {
                        view5.setLayoutParams(layoutParams);
                        LLJJIJI(z);
                        if (!z) {
                            return;
                        }
                        this.LJLIL.LJIIIZ(j, false);
                        return;
                    }
                    o.LJIJI("rootSlideSlipContainer");
                    throw null;
                }
                o.LJIJI("stickerCenterCancelRoot");
                throw null;
            }
            o.LJIJI("rootSlideSlipContainer");
            throw null;
        }
        o.LJIJI("rootSlideSlipContainer");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        View it = C16880lQ.LLLLIILL(inflater, R.layout.li, container, false);
        InterfaceC88472Yns<ViewGroup, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI.LJIL;
        if (interfaceC88472Yns != 0) {
            o.LJII(it, "null cannot be cast to non-null type android.view.ViewGroup");
            interfaceC88472Yns.invoke(it);
        }
        o.LJIIIIZZ(it, "it");
        this.LJLJJL = it;
        View findViewById = it.findViewById(R.id.j7k);
        o.LJIIIIZZ(findViewById, "it.findViewById(R.id.root_guide)");
        this.LJLJJLL = (FrameLayout) findViewById;
        View findViewById2 = it.findViewById(R.id.j7w);
        o.LJIIIIZZ(findViewById2, "it.findViewById(R.id.root_slide_slip)");
        this.LJLJL = findViewById2;
        View findViewById3 = it.findViewById(R.id.j7y);
        o.LJIIIIZZ(findViewById3, "it.findViewById(R.id.root_slide_slip_sticker)");
        this.LJLJLLL = findViewById3;
        View findViewById4 = it.findViewById(R.id.j_k);
        o.LJIIIIZZ(findViewById4, "it.findViewById(R.id.rv_slide_slip)");
        this.LJLL = (RecyclerView) findViewById4;
        View findViewById5 = it.findViewById(R.id.j81);
        o.LJIIIIZZ(findViewById5, "it.findViewById(R.id.root_tools)");
        this.LJLLI = findViewById5;
        View findViewById6 = it.findViewById(R.id.j7g);
        o.LJIIIIZZ(findViewById6, "it.findViewById(R.id.root_favorite_sticker)");
        this.LJLLILLLL = findViewById6;
        View findViewById7 = it.findViewById(R.id.m6n);
        o.LJIIIIZZ(findViewById7, "it.findViewById(R.id.tv_favorite)");
        this.LJLLL = (TextView) findViewById7;
        View findViewById8 = it.findViewById(R.id.j7q);
        o.LJIIIIZZ(findViewById8, "it.findViewById(R.id.root_more_sticker)");
        this.LJLLLL = findViewById8;
        View findViewById9 = it.findViewById(R.id.mbc);
        o.LJIIIIZZ(findViewById9, "it.findViewById(R.id.tv_more)");
        this.LJLLLLLL = findViewById9;
        View findViewById10 = it.findViewById(R.id.d1w);
        o.LJIIIIZZ(findViewById10, "it.findViewById(R.id.explore_sticker_icon)");
        this.LJLZ = (TuxIconView) findViewById10;
        View findViewById11 = it.findViewById(R.id.kij);
        o.LJIIIIZZ(findViewById11, "it.findViewById(R.id.sticker_name)");
        this.LJZ = (TextView) findViewById11;
        View findViewById12 = it.findViewById(R.id.j80);
        o.LJIIIIZZ(findViewById12, "it.findViewById(R.id.root_status_view)");
        ViewGroup viewGroup = (ViewGroup) findViewById12;
        this.LJZL = viewGroup;
        java.util.Map LJJL = C113554cx.LJJL(new OSZ(TEN.LOADING, C72089SQz.LJLIL), new OSZ(TEN.ERROR, new AqS179S0100000_13(this, 339)));
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "root.context");
        TEW tew = new TEW(context, LJJL, TEN.NONE);
        tew.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewGroup.addView(tew);
        this.LJZI = tew;
        View findViewById13 = it.findViewById(R.id.f34);
        o.LJIIIIZZ(findViewById13, "it.findViewById(R.id.iv_favorite)");
        this.LJLLJ = (ImageView) findViewById13;
        View findViewById14 = it.findViewById(R.id.k4i);
        o.LJIIIIZZ(findViewById14, "it.findViewById(R.id.sli…lip_sticker_up_container)");
        this.LJLJLJ = findViewById14;
        View findViewById15 = it.findViewById(R.id.kj0);
        o.LJIIIIZZ(findViewById15, "it.findViewById(R.id.sticker_record_cancel)");
        this.LL = findViewById15;
        View findViewById16 = it.findViewById(R.id.cfz);
        o.LJIIIIZZ(findViewById16, "it.findViewById(R.id.download_progress)");
        this.LLFZ = (TDV) findViewById16;
        View findViewById17 = it.findViewById(R.id.kkc);
        o.LJIIIIZZ(findViewById17, "it.findViewById(R.id.sticker_toolbar)");
        this.LLI = (LinearLayout) findViewById17;
        View findViewById18 = it.findViewById(R.id.cfn);
        o.LJIIIIZZ(findViewById18, "it.findViewById(R.id.download_background)");
        this.LLIFFJFJJ = findViewById18;
        View findViewById19 = it.findViewById(R.id.kj1);
        o.LJIIIIZZ(findViewById19, "it.findViewById(R.id.sticker_record_cancel_root)");
        this.LLD = findViewById19;
        View findViewById20 = it.findViewById(R.id.m1w);
        o.LJIIIIZZ(findViewById20, "it.findViewById(R.id.tv_center_cancel_view)");
        this.LLF = (TextView) findViewById20;
        View findViewById21 = it.findViewById(R.id.ej1);
        o.LJIIIIZZ(findViewById21, "it.findViewById(R.id.img_center_cancel_view)");
        this.LLFF = (ImageView) findViewById21;
        View findViewById22 = it.findViewById(R.id.j79);
        o.LJIIIIZZ(findViewById22, "it.findViewById(R.id.root_center_cancel_view)");
        this.LLFFF = findViewById22;
        View findViewById23 = it.findViewById(R.id.g3a);
        o.LJIIIIZZ(findViewById23, "it.findViewById(R.id.ll_fake_shadow)");
        this.LLFII = findViewById23;
        View findViewById24 = it.findViewById(R.id.g7j);
        o.LJIIIIZZ(findViewById24, "it.findViewById(R.id.load_more)");
        this.LLII = findViewById24;
        View findViewById25 = it.findViewById(R.id.f9n);
        o.LJIIIIZZ(findViewById25, "it.findViewById(R.id.iv_record_cancel)");
        this.LLIIII = (ImageView) findViewById25;
        return it;
    }

    public WW1(WW6 actionConfig, C34380DeS uiConfig, InterfaceC74398THu stickerDownloadDelegate, TEZ tez) {
        o.LJIIIZ(actionConfig, "actionConfig");
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(stickerDownloadDelegate, "stickerDownloadDelegate");
        this.LJLIL = actionConfig;
        this.LJLILLLLZI = uiConfig;
        this.LJLJI = stickerDownloadDelegate;
        this.LJLJJI = tez;
        this.LLIL = true;
        this.LLILII = "";
        this.LLILL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 272));
        this.LLILLIZIL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 273));
        this.LLILLJJLI = C221108m2.LIZIZ(WWP.LJLIL);
    }

    public static /* synthetic */ void LLJLL(WW1 ww1, int i, boolean z, AbstractC77369UYb abstractC77369UYb, Effect effect, String str, int i2) {
        String str2 = str;
        boolean z2 = z;
        Effect effect2 = effect;
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        if ((i2 & 16) != 0) {
            effect2 = null;
        }
        if ((i2 & 64) != 0) {
            str2 = "";
        }
        ww1.LLJLILLLLZIIL(i, false, z2, abstractC77369UYb, effect2, false, str2);
    }

    public final void LLJLILLLLZIIL(int i, boolean z, boolean z2, AbstractC77369UYb abstractC77369UYb, Effect effect, boolean z3, String str) {
        WW2 ww2 = new WW2(this, i, z2, abstractC77369UYb, effect, z3, str);
        View view = this.LJLJJL;
        if (view != null) {
            view.removeCallbacks(this.LLILZLL);
            this.LLILZLL = ww2;
            if (z) {
                if (!LLJJIJIL()) {
                    return;
                }
                View view2 = this.LJLJJL;
                if (view2 != null) {
                    view2.postDelayed(ww2, 500L);
                    return;
                } else {
                    o.LJIJI("rootView");
                    throw null;
                }
            }
            ww2.run();
            return;
        }
        o.LJIJI("rootView");
        throw null;
    }

    public static void LLJJI(WW1 ww1, List list, AbstractC77369UYb abstractC77369UYb, Effect effect, boolean z, boolean z2, String str, boolean z3, int i) {
        List list2;
        boolean z4;
        int indexOf;
        AbstractC77369UYb abstractC77369UYb2 = abstractC77369UYb;
        String chooseMethod = str;
        Effect effect2 = null;
        if ((i & 2) != 0) {
            abstractC77369UYb2 = null;
        }
        if ((i & 4) == 0) {
            effect2 = effect;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            chooseMethod = "";
        }
        if ((i & 64) != 0) {
            z3 = false;
        }
        ww1.getClass();
        o.LJIIIZ(list, "list");
        o.LJIIIZ(chooseMethod, "chooseMethod");
        UYQ LLJJJ = ww1.LLJJJ();
        LLJJJ.getClass();
        if (list.isEmpty()) {
            ((ArrayList) LLJJJ.LJLJLJ).clear();
            LLJJJ.notifyDataSetChanged();
        } else {
            List LLJI = ORZ.LLJI(LLJJJ.LJLJLJ);
            ((ArrayList) LLJJJ.LJLJLJ).clear();
            if (LLJJJ.LJLJJL.invoke().booleanValue()) {
                list2 = ORZ.LLIIIZ(C47261Igj.LJJIJ(C77371UYd.LIZ), list);
            } else {
                list2 = list;
            }
            ((ArrayList) LLJJJ.LJLJLJ).addAll(list2);
            C03200Aq.LIZ(new UYZ(LLJI, list2), false).LIZJ(LLJJJ);
        }
        if (z3) {
            return;
        }
        if (z2) {
            if (abstractC77369UYb2 == null) {
                return;
            }
            ww1.LLJJJJ(list.indexOf(abstractC77369UYb2));
            return;
        }
        if (z) {
            int size = list.size() / 2;
            LLJLL(ww1, size, true, (AbstractC77369UYb) ListProtector.get(list, size), effect2, chooseMethod, 32);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" start changeSlipData, has defaultChoose: ");
        if (abstractC77369UYb2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        LIZ.append(z4);
        LIZ.append("，chooseMethod=");
        LIZ.append(chooseMethod);
        X1D.LIZIZ(LIZ);
        if (abstractC77369UYb2 == null || (indexOf = list.indexOf(abstractC77369UYb2)) < 0) {
            return;
        }
        if (ww1.LJLILLLLZI.LJJ.invoke().booleanValue()) {
            ww1.LLJLILLLLZIIL(indexOf, false, true, abstractC77369UYb2, effect2, true, chooseMethod);
        } else {
            ww1.LLJLILLLLZIIL(indexOf, true, !ww1.LLIL, abstractC77369UYb2, effect2, true, chooseMethod);
        }
        ww1.LLIL = false;
    }
}
