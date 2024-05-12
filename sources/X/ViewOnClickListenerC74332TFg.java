package X;

import Y.ACListenerS46S0200000_12;
import Y.ACallableS89S0200000_12;
import Y.ALAdapterS3S0110000_12;
import Y.ARunnableS31S0200000_12;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.OriginalFragment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TFg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnClickListenerC74332TFg implements View.OnClickListener, InterfaceC72860Sie {
    public static String LLILIL = "";
    public LinearLayout LJLIL;
    public W5G LJLILLLLZI;
    public TextView LJLJI;
    public TextView LJLJJI;
    public Context LJLJJL;
    public final HashMap<String, InterfaceC74334TFi> LJLJJLL;
    public Effect LJLJL;
    public W5G LJLJLJ;
    public C8HN LJLJLLL;
    public LinearLayout LJLL;
    public C8HN LJLLI;
    public InterfaceC74334TFi LJLLILLLL;
    public C8HN LJLLJ;
    public OPX LJLLL;
    public C8HN LJLLLL;
    public C8HN LJLLLLLL;
    public C8HN LJLZ;
    public int LJZ;
    public VWH LJZI;
    public OriginalFragment LJZL;
    public LinearLayout LL;
    public FrameLayout LLD;
    public C170736mz LLF;
    public C170736mz LLFF;
    public LinearLayout LLFFF;
    public LinearLayout LLFII;
    public W5G LLFZ;
    public C8HN LLI;
    public boolean LLIFFJFJJ;
    public FrameLayout LLII;
    public View LLIIII;
    public Effect LLIIIILZ;
    public ACListenerS46S0200000_12 LLIIIJ;
    public final boolean LLIIIL;
    public final boolean LLIIIZ;
    public final InterfaceC88471Ynr<String, String, InterfaceC74334TFi> LLIIJI;
    public final InterfaceC65784Pro<Drawable> LLIIJLIL;
    public final TEZ LLIIL;
    public final InterfaceC46204IBk LLIILII;
    public final InterfaceC74343TFr LLIILZL;
    public final C29S LLIIZ;
    public final InterfaceC74336TFk LLIL;
    public final boolean LLILII;

    @Override // X.InterfaceC72860Sie
    public final void LIZ() {
        this.LJLJL = null;
        LinearLayout linearLayout = this.LJLIL;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.LJLL;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    public final void LJ() {
        LIZLLL(false);
        if (this.LLIIZ.getSupportFragmentManager().LJJJJIZL() > 0) {
            this.LLIIZ.getSupportFragmentManager().LJJLIIIJJI();
        }
        this.LLIFFJFJJ = false;
        this.LLIL.LJIIIZ();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destory() {
        LinearLayout linearLayout = this.LL;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    @Override // X.InterfaceC72860Sie
    public final EnumC72858Sic priority() {
        return EnumC72858Sic.DesignerInfoHandlerPriority;
    }

    @Override // X.InterfaceC72860Sie
    public final void LIZJ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        this.LLIIII = stickerView;
        Context context = stickerView.getContext();
        this.LJLJJL = context;
        if (context != null) {
            LinearLayout linearLayout = (LinearLayout) stickerView.findViewById(R.id.fme);
            this.LJLL = linearLayout;
            if (this.LLIIIZ) {
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                this.LLFZ = (W5G) stickerView.findViewById(R.id.ki0);
                this.LLI = (C8HN) stickerView.findViewById(R.id.kik);
                this.LJLJLJ = (W5G) stickerView.findViewById(R.id.h05);
                this.LJLJLLL = (C8HN) stickerView.findViewById(R.id.h06);
                this.LLFII = (LinearLayout) stickerView.findViewById(R.id.gzp);
                this.LJLLI = (C8HN) stickerView.findViewById(R.id.hde);
                this.LJLLJ = (C8HN) stickerView.findViewById(R.id.hdh);
                this.LJLLL = (OPX) stickerView.findViewById(R.id.ejo);
                this.LJLLLL = (C8HN) stickerView.findViewById(R.id.hdg);
                this.LJLLLLLL = (C8HN) stickerView.findViewById(R.id.hdc);
                this.LL = (LinearLayout) stickerView.findViewById(R.id.hdf);
                this.LJLZ = (C8HN) stickerView.findViewById(R.id.dk2);
                this.LJZI = (VWH) stickerView.findViewById(R.id.nd5);
                this.LLII = (FrameLayout) stickerView.findViewById(R.id.fnr);
                this.LLD = (FrameLayout) stickerView.findViewById(R.id.fmq);
                this.LLFF = (C170736mz) stickerView.findViewById(R.id.ejn);
                this.LLF = (C170736mz) stickerView.findViewById(R.id.e0w);
                this.LLFFF = (LinearLayout) stickerView.findViewById(R.id.hdq);
            } else {
                this.LJLJLJ = (W5G) stickerView.findViewById(R.id.ki0);
                this.LJLJLLL = (C8HN) stickerView.findViewById(R.id.kik);
            }
            LinearLayout linearLayout2 = (LinearLayout) stickerView.findViewById(R.id.flw);
            if (linearLayout2 != null) {
                C78866UxK.LJJIIJZLJL(linearLayout2);
                this.LJLIL = linearLayout2;
                W5G avatar = (W5G) linearLayout2.findViewById(R.id.flz);
                o.LJIIIIZZ(avatar, "avatar");
                Drawable invoke = this.LLIIJLIL.invoke();
                if (invoke != null) {
                    avatar.getHierarchy().LJIJJ(invoke, InterfaceC78716Uuu.LJJLIIIJILLIZJL);
                }
                this.LJLILLLLZI = avatar;
                this.LJLJI = (TextView) linearLayout2.findViewById(R.id.fm1);
                this.LJLJJI = (TextView) linearLayout2.findViewById(R.id.fly);
                C16880lQ.LJIIZILJ(linearLayout2, this);
                linearLayout2.post(new ARunnableS31S0200000_12(context, this, 21));
            }
        }
    }

    public final void LIZLLL(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float LIZ;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        FrameLayout frameLayout = this.LLD;
        if (frameLayout != null) {
            float[] fArr = new float[2];
            float f11 = 0.0f;
            if (z) {
                f = 0.0f;
            } else {
                Context LLLLLIL = C16880lQ.LLLLLIL(this.LLIIZ);
                o.LJIIIIZZ(LLLLLIL, "activity.applicationContext");
                f = -C5R9.LIZ(LLLLLIL);
            }
            fArr[0] = f;
            if (z) {
                Context LLLLLIL2 = C16880lQ.LLLLLIL(this.LLIIZ);
                o.LJIIIIZZ(LLLLLIL2, "activity.applicationContext");
                f2 = -C5R9.LIZ(LLLLLIL2);
            } else {
                f2 = 0.0f;
            }
            fArr[1] = f2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, "translationX", fArr);
            VWH vwh = this.LJZI;
            if (vwh != null) {
                float[] fArr2 = new float[2];
                if (z) {
                    f3 = 0.0f;
                } else {
                    Context LLLLLIL3 = C16880lQ.LLLLLIL(this.LLIIZ);
                    o.LJIIIIZZ(LLLLLIL3, "activity.applicationContext");
                    f3 = -C5R9.LIZ(LLLLLIL3);
                }
                fArr2[0] = f3;
                if (z) {
                    Context LLLLLIL4 = C16880lQ.LLLLLIL(this.LLIIZ);
                    o.LJIIIIZZ(LLLLLIL4, "activity.applicationContext");
                    f4 = -C5R9.LIZ(LLLLLIL4);
                } else {
                    f4 = 0.0f;
                }
                fArr2[1] = f4;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(vwh, "translationX", fArr2);
                LinearLayout linearLayout = this.LL;
                if (linearLayout != null) {
                    float[] fArr3 = new float[2];
                    if (z) {
                        Context LLLLLIL5 = C16880lQ.LLLLLIL(this.LLIIZ);
                        o.LJIIIIZZ(LLLLLIL5, "activity.applicationContext");
                        f5 = C5R9.LIZ(LLLLLIL5);
                    } else {
                        f5 = 0.0f;
                    }
                    fArr3[0] = f5;
                    if (z) {
                        LIZ = 0.0f;
                    } else {
                        C29S c29s = this.LLIIZ;
                        o.LJI(c29s);
                        Context LLLLLIL6 = C16880lQ.LLLLLIL(c29s);
                        o.LJIIIIZZ(LLLLLIL6, "activity!!.applicationContext");
                        LIZ = C5R9.LIZ(LLLLLIL6);
                    }
                    fArr3[1] = LIZ;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(linearLayout, "translationX", fArr3);
                    VWH vwh2 = this.LJZI;
                    if (vwh2 != null) {
                        float[] fArr4 = new float[2];
                        if (z) {
                            f6 = 1.0f;
                        } else {
                            f6 = 0.0f;
                        }
                        fArr4[0] = f6;
                        if (z) {
                            f7 = 0.0f;
                        } else {
                            f7 = 1.0f;
                        }
                        fArr4[1] = f7;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(vwh2, "alpha", fArr4);
                        FrameLayout frameLayout2 = this.LLD;
                        if (frameLayout2 != null) {
                            float[] fArr5 = new float[2];
                            if (z) {
                                f8 = 1.0f;
                            } else {
                                f8 = 0.0f;
                            }
                            fArr5[0] = f8;
                            if (z) {
                                f9 = 0.0f;
                            } else {
                                f9 = 1.0f;
                            }
                            fArr5[1] = f9;
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(frameLayout2, "alpha", fArr5);
                            LinearLayout linearLayout2 = this.LL;
                            if (linearLayout2 != null) {
                                float[] fArr6 = new float[2];
                                if (z) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = 1.0f;
                                }
                                fArr6[0] = f10;
                                if (z) {
                                    f11 = 1.0f;
                                }
                                fArr6[1] = f11;
                                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(linearLayout2, "alpha", fArr6);
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6);
                                animatorSet.addListener(new ALAdapterS3S0110000_12(this, z, 4));
                                animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                                animatorSet.setDuration(300L);
                                animatorSet.start();
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    @Override // X.InterfaceC72860Sie
    public final boolean LIZIZ(T4Q session, InterfaceC72857Sib interfaceC72857Sib) {
        o.LJIIIZ(session, "session");
        Effect effect = session.LIZ;
        this.LLIIIILZ = effect;
        if (ID0.LJIIL(effect) && !this.LLILII) {
            this.LJLJL = effect;
            C10K.LIZJ(new ACallableS89S0200000_12(this, effect, 3)).LJ(new C74333TFh(this, effect, interfaceC72857Sib), C10K.LJIIIIZZ, null);
            return true;
        }
        LIZ();
        return false;
    }

    public ViewOnClickListenerC74332TFg(C73096SmS queryUser, AqS162S0100000_12 aqS162S0100000_12, TEZ stickerManger, InterfaceC46204IBk stickerSelectedController, IAS ias, C29S activity, C44192HWa c44192HWa, boolean z) {
        o.LJIIIZ(queryUser, "queryUser");
        o.LJIIIZ(stickerManger, "stickerManger");
        o.LJIIIZ(stickerSelectedController, "stickerSelectedController");
        o.LJIIIZ(activity, "activity");
        this.LLIIIL = true;
        this.LLIIIZ = true;
        this.LLIIJI = queryUser;
        this.LLIIJLIL = aqS162S0100000_12;
        this.LLIIL = stickerManger;
        this.LLIILII = stickerSelectedController;
        this.LLIILZL = ias;
        this.LLIIZ = activity;
        this.LLIL = c44192HWa;
        this.LLILII = z;
        this.LJLJJLL = new HashMap<>();
    }
}
