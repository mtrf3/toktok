package Y;

import X.C16880lQ;
import X.C170736mz;
import X.C74040T4a;
import X.C74041T4b;
import X.C74063T4x;
import X.C78764Uvg;
import X.C8HN;
import X.C90193gN;
import X.InterfaceC74334TFi;
import X.OPX;
import X.ViewOnClickListenerC13880ga;
import X.ViewOnClickListenerC74332TFg;
import X.ViewOnClickListenerC74335TFj;
import X.XXG;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ALAdapterS3S0110000_12 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 1:
                this.z1 = true;
                return;
            case 2:
                this.z1 = true;
                return;
            case 3:
                this.z1 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public ALAdapterS3S0110000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(ALAdapterS3S0110000_12 aLAdapterS3S0110000_12, Animator animator) {
        ((XXG) aLAdapterS3S0110000_12.l0).LJLLLL.setClickable(true);
        if (aLAdapterS3S0110000_12.z1) {
            ((XXG) aLAdapterS3S0110000_12.l0).LJLL.setVisibility(8);
            ((XXG) aLAdapterS3S0110000_12.l0).LJLL.clearAnimation();
            if (C90193gN.LIZIZ(((XXG) aLAdapterS3S0110000_12.l0).LLFF)) {
                ((ViewGroup.MarginLayoutParams) ((XXG) aLAdapterS3S0110000_12.l0).LJLLL.getLayoutParams()).leftMargin = 0;
            } else {
                ((ViewGroup.MarginLayoutParams) ((XXG) aLAdapterS3S0110000_12.l0).LJLLL.getLayoutParams()).rightMargin = 0;
            }
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS3S0110000_12 aLAdapterS3S0110000_12, Animator animator) {
        if (!aLAdapterS3S0110000_12.z1) {
            ((C74041T4b) aLAdapterS3S0110000_12.l0).LIZ();
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS3S0110000_12 aLAdapterS3S0110000_12, Animator animator) {
        if (!aLAdapterS3S0110000_12.z1) {
            ((C74040T4a) aLAdapterS3S0110000_12.l0).LIZ();
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS3S0110000_12 aLAdapterS3S0110000_12, Animator animator) {
        if (!aLAdapterS3S0110000_12.z1) {
            ((C74063T4x) aLAdapterS3S0110000_12.l0).LIZ();
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS3S0110000_12 aLAdapterS3S0110000_12, Animator animation) {
        UrlModel urlModel;
        String str;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        boolean z = false;
        if (aLAdapterS3S0110000_12.z1) {
            LinearLayout linearLayout = ((ViewOnClickListenerC74332TFg) aLAdapterS3S0110000_12.l0).LL;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            FrameLayout frameLayout = ((ViewOnClickListenerC74332TFg) aLAdapterS3S0110000_12.l0).LLD;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            ViewOnClickListenerC74332TFg viewOnClickListenerC74332TFg = (ViewOnClickListenerC74332TFg) aLAdapterS3S0110000_12.l0;
            FrameLayout frameLayout2 = viewOnClickListenerC74332TFg.LLII;
            if (frameLayout2 != null) {
                C16880lQ.LJLLLL(viewOnClickListenerC74332TFg.LJZI, frameLayout2);
            }
            ViewOnClickListenerC74332TFg viewOnClickListenerC74332TFg2 = (ViewOnClickListenerC74332TFg) aLAdapterS3S0110000_12.l0;
            View view = viewOnClickListenerC74332TFg2.LLIIII;
            if (view != null) {
                viewOnClickListenerC74332TFg2.LJLLI = (C8HN) view.findViewById(R.id.hde);
                View view2 = viewOnClickListenerC74332TFg2.LLIIII;
                if (view2 != null) {
                    viewOnClickListenerC74332TFg2.LJLLJ = (C8HN) view2.findViewById(R.id.hdh);
                    View view3 = viewOnClickListenerC74332TFg2.LLIIII;
                    if (view3 != null) {
                        viewOnClickListenerC74332TFg2.LJLZ = (C8HN) view3.findViewById(R.id.dk2);
                        View view4 = viewOnClickListenerC74332TFg2.LLIIII;
                        if (view4 != null) {
                            viewOnClickListenerC74332TFg2.LJLLL = (OPX) view4.findViewById(R.id.ejo);
                            View view5 = viewOnClickListenerC74332TFg2.LLIIII;
                            if (view5 != null) {
                                viewOnClickListenerC74332TFg2.LLFF = (C170736mz) view5.findViewById(R.id.ejn);
                                View view6 = viewOnClickListenerC74332TFg2.LLIIII;
                                if (view6 != null) {
                                    viewOnClickListenerC74332TFg2.LJLLLLLL = (C8HN) view6.findViewById(R.id.hdc);
                                    View view7 = viewOnClickListenerC74332TFg2.LLIIII;
                                    if (view7 != null) {
                                        viewOnClickListenerC74332TFg2.LJLLLL = (C8HN) view7.findViewById(R.id.hdg);
                                        C8HN c8hn = viewOnClickListenerC74332TFg2.LJLLJ;
                                        if (c8hn != null) {
                                            Locale locale = Locale.getDefault();
                                            Context context = viewOnClickListenerC74332TFg2.LJLJJL;
                                            o.LJI(context);
                                            String string = context.getString(R.string.e8j);
                                            o.LJIIIIZZ(string, "mContext!!.getString(R.s…eation_tools_effect_text)");
                                            Object[] objArr = new Object[1];
                                            InterfaceC74334TFi interfaceC74334TFi = viewOnClickListenerC74332TFg2.LJLLILLLL;
                                            if (interfaceC74334TFi != null) {
                                                str = interfaceC74334TFi.getNickname();
                                            } else {
                                                str = null;
                                            }
                                            objArr[0] = str;
                                            String LLLZI = C16880lQ.LLLZI(locale, string, Arrays.copyOf(objArr, 1));
                                            o.LJIIIIZZ(LLLZI, "java.lang.String.format(locale, format, *args)");
                                            c8hn.setText(LLLZI);
                                        }
                                        OPX opx = viewOnClickListenerC74332TFg2.LJLLL;
                                        if (opx != null) {
                                            InterfaceC74334TFi interfaceC74334TFi2 = viewOnClickListenerC74332TFg2.LJLLILLLL;
                                            if (interfaceC74334TFi2 != null) {
                                                urlModel = interfaceC74334TFi2.getAvatarThumb();
                                            } else {
                                                urlModel = null;
                                            }
                                            C78764Uvg.LJI(opx, urlModel, -1, -1);
                                        }
                                        C8HN c8hn2 = viewOnClickListenerC74332TFg2.LJLLLLLL;
                                        if (c8hn2 != null) {
                                            Locale locale2 = Locale.getDefault();
                                            Context context2 = viewOnClickListenerC74332TFg2.LJLJJL;
                                            o.LJI(context2);
                                            String string2 = context2.getString(R.string.ibl);
                                            o.LJIIIIZZ(string2, "mContext!!.getString(R.string.mus_fans_cnt)");
                                            InterfaceC74334TFi interfaceC74334TFi3 = viewOnClickListenerC74332TFg2.LJLLILLLL;
                                            o.LJI(interfaceC74334TFi3);
                                            String LLLZI2 = C16880lQ.LLLZI(locale2, string2, Arrays.copyOf(new Object[]{Integer.valueOf(interfaceC74334TFi3.getFollowCount())}, 1));
                                            o.LJIIIIZZ(LLLZI2, "java.lang.String.format(locale, format, *args)");
                                            c8hn2.setText(LLLZI2);
                                        }
                                        C8HN c8hn3 = viewOnClickListenerC74332TFg2.LJLLLL;
                                        if (c8hn3 != null) {
                                            InterfaceC74334TFi interfaceC74334TFi4 = viewOnClickListenerC74332TFg2.LJLLILLLL;
                                            o.LJI(interfaceC74334TFi4);
                                            c8hn3.setText(interfaceC74334TFi4.getNickname());
                                        }
                                        C170736mz c170736mz = viewOnClickListenerC74332TFg2.LLFF;
                                        if (c170736mz != null) {
                                            C16880lQ.LJJJZ(c170736mz, new ACListenerS32S0100000_12(viewOnClickListenerC74332TFg2, 116));
                                        }
                                        Effect effect = viewOnClickListenerC74332TFg2.LLIIIILZ;
                                        if (effect != null) {
                                            String stickerId = effect.getDesignerId();
                                            Effect effect2 = viewOnClickListenerC74332TFg2.LLIIIILZ;
                                            if (effect2 != null) {
                                                String encryptedId = effect2.getDesignerEncryptedId();
                                                InterfaceC74334TFi interfaceC74334TFi5 = viewOnClickListenerC74332TFg2.LJLLILLLL;
                                                if (interfaceC74334TFi5 != null && interfaceC74334TFi5.LIZLLL() == 1) {
                                                    z = true;
                                                }
                                                o.LJIIIZ(stickerId, "stickerId");
                                                o.LJIIIZ(encryptedId, "encryptedId");
                                                C8HN c8hn4 = viewOnClickListenerC74332TFg2.LJLZ;
                                                if (c8hn4 != null) {
                                                    c8hn4.setOnClickListener(new ViewOnClickListenerC13880ga(new ViewOnClickListenerC74335TFj(viewOnClickListenerC74332TFg2, stickerId, encryptedId, z)));
                                                    return;
                                                }
                                                return;
                                            }
                                            o.LJIJI("currentSticker");
                                            throw null;
                                        }
                                        o.LJIJI("currentSticker");
                                        throw null;
                                    }
                                    o.LJIJI("currentStickerView");
                                    throw null;
                                }
                                o.LJIJI("currentStickerView");
                                throw null;
                            }
                            o.LJIJI("currentStickerView");
                            throw null;
                        }
                        o.LJIJI("currentStickerView");
                        throw null;
                    }
                    o.LJIJI("currentStickerView");
                    throw null;
                }
                o.LJIJI("currentStickerView");
                throw null;
            }
            o.LJIJI("currentStickerView");
            throw null;
        }
        LinearLayout linearLayout2 = ((ViewOnClickListenerC74332TFg) aLAdapterS3S0110000_12.l0).LL;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        FrameLayout frameLayout3 = ((ViewOnClickListenerC74332TFg) aLAdapterS3S0110000_12.l0).LLD;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(0);
        }
        ViewOnClickListenerC74332TFg viewOnClickListenerC74332TFg3 = (ViewOnClickListenerC74332TFg) aLAdapterS3S0110000_12.l0;
        FrameLayout frameLayout4 = viewOnClickListenerC74332TFg3.LLII;
        if (frameLayout4 == null) {
            return;
        }
        frameLayout4.addView(viewOnClickListenerC74332TFg3.LJZI);
    }

    public ALAdapterS3S0110000_12(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
