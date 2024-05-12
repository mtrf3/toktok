package X;

import Y.ALAdapterS1S0200000_2;
import Y.AUListenerS90S0100000_1;
import Y.IDTListenerS88S0200000_2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.57b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1296757b extends AbstractC1286553d<C1296857c> {
    public final ActivityC45651qj LJLJJI;
    public AbstractC65781Prl LJLJJL;

    public C1296757b(ActivityC45651qj activityC45651qj) {
        this.LJLJJI = activityC45651qj;
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.ars, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        C1296857c c1296857c = new C1296857c(this.LJLJJI, itemView);
        C0AX.LIZ(viewGroup, c1296857c.itemView, R.id.lj7);
        View view = c1296857c.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c1296857c.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1296857c.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1296857c.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c1296857c.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C1296857c.class.getName();
        return c1296857c;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [X.Ynt, X.Prl] */
    @Override // X.AbstractC1286553d
    public final void LJLZ(int i, C1296857c c1296857c, AnonymousClass523 anonymousClass523) {
        Object obj;
        ConstraintLayout constraintLayout;
        ViewGroup viewGroup;
        int i2;
        int i3;
        int i4;
        String LIZIZ;
        String str;
        C1296857c holder = c1296857c;
        o.LJIIIZ(holder, "holder");
        Iterator<AnonymousClass523> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            AnonymousClass523 next = it.next();
            if (next.LJIIJJI <= 0 && (str = next.LIZJ) != null && str.length() != 0) {
                next.LJIIJJI = C1296957d.LIZ(next.LIZJ);
            }
        }
        String str2 = anonymousClass523.LIZJ;
        if (str2 != null) {
            holder.LJLJI.setText(str2);
            Typeface typeface = holder.LJLILLLLZI.LJJIFFI;
            if (typeface != null) {
                holder.LJLJI.setTypeface(typeface);
            }
            C53I c53i = holder.LJLILLLLZI;
            int i5 = c53i.LJIILJJIL;
            if (i5 != 0) {
                holder.LJLJI.setTextSize(i5);
            }
            int i6 = c53i.LJIILL;
            if (i6 != 0) {
                holder.LJLJI.setMaxWidth(C134855Qz.LIZ(i6));
            }
            int i7 = c53i.LJIILLIIL;
            if (i7 != 0) {
                holder.LJLJI.setMinWidth(C134855Qz.LIZ(i7));
            }
            int i8 = c53i.LJIIZILJ;
            if (i8 != 0) {
                holder.LJLJI.setMinHeight(C134855Qz.LIZ(i8));
            }
            Integer num = holder.LJLILLLLZI.LJIJ;
            if (num != null) {
                holder.LJLJI.setTextColor(num.intValue());
            }
            if (c53i.LJIJI > 0 && (holder.LJLJI.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.LayoutParams layoutParams = holder.LJLJI.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C134855Qz.LIZ(c53i.LJIJI);
            }
            Object obj2 = anonymousClass523.LJIIIIZZ.get("is_capcut_entrance");
            if (obj2 == null) {
                obj2 = null;
            }
            if (o.LJ(obj2, Boolean.TRUE) && anonymousClass523.LIZJ != null && (i2 = anonymousClass523.LJIIJJI) > 0) {
                TextView textView = holder.LJLJI;
                int i9 = C1293855y.LIZJ;
                if (i2 > i9) {
                    i3 = C1293855y.LIZ;
                } else {
                    i3 = C1293855y.LIZIZ;
                }
                textView.setMaxWidth(i3);
                if (i2 < i9) {
                    holder.LJLJI.setText(anonymousClass523.LIZJ);
                    holder.L(anonymousClass523, true);
                } else {
                    TextView textView2 = holder.LJLJI;
                    int maxWidth = textView2.getMaxWidth();
                    textView2.measure(C134855Qz.LIZ(maxWidth), View.MeasureSpec.makeMeasureSpec(0, LiveLayoutPreloadThreadPriority.DEFAULT));
                    textView2.layout(0, 0, textView2.getMeasuredWidth(), textView2.getMeasuredHeight());
                    Layout layout = textView2.getLayout();
                    if (layout != null) {
                        i4 = layout.getLineEnd(0);
                    } else {
                        i4 = 0;
                    }
                    String charSequence = textView2.getText().toString();
                    int length = charSequence.length();
                    String substring = charSequence.substring(i4, length);
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    if (C1296957d.LIZ(substring) >= (maxWidth - C1293855y.LIZLLL) - C1293855y.LJ) {
                        int LIZ = C1296957d.LIZ(String.valueOf(C40689Fy1.LLFZ(charSequence)));
                        String substring2 = charSequence.substring(0, i4);
                        o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        StringBuilder sb = new StringBuilder(substring2);
                        if (!s.LJJJLZIJ(charSequence, "\n", false)) {
                            sb.append("\n");
                        }
                        while (true) {
                            if (length > 0) {
                                String substring3 = charSequence.substring(i4, length);
                                o.LJIIIIZZ(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                if (ujb.o.LJJJJ(substring3, " ", false)) {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    String substring4 = charSequence.substring(i4, length - 1);
                                    o.LJIIIIZZ(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                                    LIZ2.append(substring4);
                                    LIZ2.append("...");
                                    LIZIZ = X1D.LIZIZ(LIZ2);
                                } else {
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    String substring5 = charSequence.substring(i4, length);
                                    o.LJIIIIZZ(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
                                    LIZ3.append(substring5);
                                    LIZ3.append("...");
                                    LIZIZ = X1D.LIZIZ(LIZ3);
                                }
                                if (C1296957d.LIZ(LIZIZ) < (maxWidth - C1293855y.LIZLLL) - LIZ) {
                                    sb.append(LIZIZ);
                                    charSequence = sb.toString();
                                    break;
                                }
                                length--;
                            } else {
                                charSequence = textView2.getText().toString();
                                break;
                            }
                        }
                    }
                    textView2.setText(charSequence);
                    holder.L(anonymousClass523, o.LJ(holder.LJLJI.getText().toString(), anonymousClass523.LIZJ));
                }
            }
            holder.LJLJI.setVisibility(0);
        } else {
            holder.LJLJI.setVisibility(8);
        }
        Drawable drawable = anonymousClass523.LIZLLL;
        if (drawable != null) {
            holder.LJLJJI.setImageDrawable(drawable);
            holder.LJLJJI.setVisibility(0);
            C53I c53i2 = holder.LJLILLLLZI;
            int i10 = c53i2.LJIIL;
            int i11 = 20;
            if (i10 == 0) {
                i10 = 20;
            }
            int i12 = c53i2.LJIILIIL;
            if (i12 != 0) {
                i11 = i12;
            }
            ViewGroup.LayoutParams layoutParams2 = holder.LJLJJI.getLayoutParams();
            layoutParams2.width = C134855Qz.LIZ(i10);
            layoutParams2.height = C134855Qz.LIZ(i11);
        } else {
            holder.LJLJJI.setVisibility(8);
        }
        if (!anonymousClass523.LJFF) {
            holder.LJLJI.setAlpha(0.4f);
            holder.LJLJI.setEnabled(false);
            holder.LJLJJI.setAlpha(0.4f);
            holder.LJLJJI.setEnabled(false);
            obj = null;
            holder.LJLIL.setOnTouchListener(null);
        } else {
            obj = null;
            holder.LJLJI.setAlpha(1.0f);
            holder.LJLJI.setEnabled(true);
            holder.LJLJJI.setAlpha(1.0f);
            holder.LJLJJI.setEnabled(true);
            InterfaceC1286253a interfaceC1286253a = holder.LJLILLLLZI.LJJIII;
            if (interfaceC1286253a != null) {
                holder.LJLIL.setOnTouchListener(new IDTListenerS88S0200000_2(interfaceC1286253a, holder, 3));
            }
        }
        Object obj3 = anonymousClass523.LJIIIIZZ.get("key_lottie_anim");
        if (obj3 == null) {
            obj3 = obj;
        }
        C29701Eo c29701Eo = (C29701Eo) obj3;
        if (c29701Eo != null) {
            View view = holder.itemView;
            if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null && constraintLayout.indexOfChild(c29701Eo) == -1) {
                ViewParent parent = c29701Eo.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C16880lQ.LJLLL(c29701Eo, viewGroup);
                }
                C018905p c018905p = new C018905p(c29701Eo.getLayoutParams().width, c29701Eo.getLayoutParams().height);
                ((ViewGroup.MarginLayoutParams) c018905p).topMargin = 0;
                c018905p.leftToLeft = R.id.f3i;
                c018905p.rightToRight = R.id.f3i;
                c018905p.topToTop = R.id.f3i;
                c018905p.bottomToBottom = R.id.f3i;
                constraintLayout.addView(c29701Eo, c018905p);
                c29701Eo.addAnimatorListener(new ALAdapterS1S0200000_2(constraintLayout, c29701Eo, 11));
                c29701Eo.playAnimation();
            }
        }
        Object obj4 = anonymousClass523.LJIIIIZZ.get("key_view_anim");
        if (obj4 != null) {
            obj = obj4;
        }
        AnimatorSet animatorSet = (AnimatorSet) obj;
        if (animatorSet != null) {
            View findViewById = holder.itemView.findViewById(R.id.f3i);
            o.LJIIIIZZ(findViewById, "holder.itemView.findView…Id(R.id.iv_function_item)");
            ImageView imageView = (ImageView) findViewById;
            ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
            o.LJIIIIZZ(childAnimations, "animSet.childAnimations");
            Iterator<Animator> it2 = childAnimations.iterator();
            while (it2.hasNext()) {
                Animator next2 = it2.next();
                if (next2 instanceof ValueAnimator) {
                    ((ValueAnimator) next2).addUpdateListener(new AUListenerS90S0100000_1(imageView, 28));
                    next2.start();
                }
            }
        }
        ?? r2 = this.LJLJJL;
        if (r2 != 0) {
            r2.invoke(holder, this.LJLIL, Integer.valueOf(i));
        }
    }
}
