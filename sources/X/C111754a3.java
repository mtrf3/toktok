package X;

import Y.ALAdapterS0S0100000_1;
import Y.ALAdapterS0S0110000_1;
import Y.AUListenerS90S0100000_1;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4a3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111754a3 extends AbstractC029409q<C111844aC> {
    public final Context LJLIL;
    public final List<C111784a6> LJLILLLLZI;
    public View.OnClickListener LJLJI;
    public View.OnLongClickListener LJLJJI;
    public boolean LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public C111754a3(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = new ArrayList();
        this.LJLJJL = true;
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(C111844aC holder) {
        C111734a1 c111734a1;
        o.LJIIIZ(holder, "holder");
        View view = holder.itemView;
        if ((view instanceof C111734a1) && (c111734a1 = (C111734a1) view) != null) {
            C34B.LIZIZ("ReactionItemView", "detach");
            Animator animator = c111734a1.LJLIL;
            if (animator != null) {
                animator.cancel();
            }
            c111734a1.LJLIL = null;
            Animator animator2 = c111734a1.LJLILLLLZI;
            if (animator2 != null) {
                animator2.cancel();
            }
            c111734a1.LJLILLLLZI = null;
            TuxTextView tuxTextView = c111734a1.LJLJI;
            if (C78996UzQ.LJJIIJZLJL(tuxTextView)) {
                C78996UzQ.LJI();
            }
            c111734a1.removeView(tuxTextView);
            c111734a1.LJLJI = null;
        }
    }

    public final void LJLLLLLL(final List<C111784a6> list, boolean z) {
        o.LJIIIZ(list, "list");
        this.LJLJJL = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reaction group: ");
        LIZ.append(list);
        LIZ.append(", isCounterVisible: ");
        LIZ.append(z);
        C34B.LIZIZ("IMReactionAdapter", X1D.LIZIZ(LIZ));
        C03150Al LIZ2 = C03200Aq.LIZ(new AbstractC03120Ai() { // from class: X.4a7
            @Override // X.AbstractC03120Ai
            public final int LIZLLL() {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("getNewListSize ");
                LIZ3.append(list.size());
                C34B.LIZIZ("IMReactionAdapter", X1D.LIZIZ(LIZ3));
                return list.size();
            }

            @Override // X.AbstractC03120Ai
            public final int LJ() {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("getOldListSize ");
                LIZ3.append(((ArrayList) C111754a3.this.LJLILLLLZI).size());
                C34B.LIZIZ("IMReactionAdapter", X1D.LIZIZ(LIZ3));
                return ((ArrayList) C111754a3.this.LJLILLLLZI).size();
            }

            @Override // X.AbstractC03120Ai
            public final boolean LIZ(int i, int i2) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("oldItemPosition: ");
                LIZ3.append(i);
                LIZ3.append(" newItemPosition: ");
                LIZ3.append(i2);
                C34B.LIZIZ("IMReactionAdapter", X1D.LIZIZ(LIZ3));
                return o.LJ(ORZ.LJLLLLLL(i, C111754a3.this.LJLILLLLZI), ORZ.LJLLLLLL(i2, list));
            }

            @Override // X.AbstractC03120Ai
            public final boolean LIZIZ(int i, int i2) {
                String str;
                String str2;
                Long l;
                C111784a6 c111784a6 = (C111784a6) ORZ.LJLLLLLL(i, C111754a3.this.LJLILLLLZI);
                C111784a6 c111784a62 = (C111784a6) ORZ.LJLLLLLL(i2, list);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("oldItem: ");
                LIZ3.append(c111784a6);
                LIZ3.append("; newItem: ");
                LIZ3.append(c111784a62);
                C34B.LIZIZ("IMReactionAdapter", X1D.LIZIZ(LIZ3));
                Long l2 = null;
                if (c111784a6 != null) {
                    str = c111784a6.LJLIL;
                } else {
                    str = null;
                }
                if (c111784a62 != null) {
                    str2 = c111784a62.LJLIL;
                } else {
                    str2 = null;
                }
                if (o.LJ(str, str2)) {
                    if (c111784a6 != null) {
                        l = c111784a6.LJLJJLL;
                    } else {
                        l = null;
                    }
                    if (c111784a62 != null) {
                        l2 = c111784a62.LJLJJLL;
                    }
                    if (o.LJ(l, l2)) {
                        return true;
                    }
                }
                return false;
            }
        }, true);
        ((ArrayList) this.LJLILLLLZI).clear();
        ((ArrayList) this.LJLILLLLZI).addAll(list);
        LIZ2.LIZIZ(new C0AK() { // from class: X.4a8
            @Override // X.C0AK
            public final void LJJIJLIJ(int i, int i2) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onRemoved position: ");
                LIZ3.append(i);
                LIZ3.append(", count: ");
                LIZ3.append(i2);
                C34B.LIZIZ("IMReactionAdapter", X1D.LIZIZ(LIZ3));
                C111754a3.this.notifyItemRemoved(i);
            }

            @Override // X.C0AK
            public final void LJLIIIL(int i, int i2) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onInserted position: ");
                LIZ3.append(i);
                LIZ3.append(", count: ");
                LIZ3.append(i2);
                C34B.LIZIZ("IMReactionAdapter", X1D.LIZIZ(LIZ3));
                C111754a3.this.notifyItemInserted(i);
            }

            @Override // X.C0AK
            public final void LJLJLLL(int i, int i2) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("fromPosition position: ");
                LIZ3.append(i);
                LIZ3.append(", count: ");
                LIZ3.append(i2);
                C34B.LIZIZ("IMReactionAdapter", X1D.LIZIZ(LIZ3));
                C111754a3.this.notifyItemMoved(i, i2);
            }

            @Override // X.C0AK
            public final void LJJLIIIJILLIZJL(int i, int i2, Object obj) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onChanged position: ");
                LIZ3.append(i);
                LIZ3.append(", count: ");
                LIZ3.append(i2);
                C34B.LIZIZ("IMReactionAdapter", X1D.LIZIZ(LIZ3));
                C111754a3.this.notifyItemRangeChanged(i, i2, obj);
            }
        });
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C111844aC holder, int i) {
        C111734a1 c111734a1;
        String str;
        int i2;
        int i3;
        o.LJIIIZ(holder, "holder");
        C111784a6 item = (C111784a6) ListProtector.get(this.LJLILLLLZI, i);
        View.OnClickListener onClickListener = this.LJLJI;
        View.OnLongClickListener onLongClickListener = this.LJLJJI;
        boolean z = this.LJLJJL;
        o.LJIIIZ(item, "item");
        View view = holder.itemView;
        if ((view instanceof C111734a1) && (c111734a1 = (C111734a1) view) != null) {
            ((TextView) c111734a1.LIZ(R.id.cue)).setText(item.LJLIL);
            String str2 = Build.MANUFACTURER;
            if (str2 != null) {
                Locale locale = Locale.ROOT;
                str = C141415gn.LIZIZ(locale, "ROOT", str2, locale, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (o.LJ(str, "samsung") && o.LJ(item.LJLIL, "❤️")) {
                ((TuxTextView) c111734a1.LIZ(R.id.cue)).setTuxFont(71);
            } else {
                ((TuxTextView) c111734a1.LIZ(R.id.cue)).setTuxFont(61);
            }
            c111734a1.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
            c111734a1.setOnLongClickListener(onLongClickListener);
            View reaction_count = c111734a1.LIZ(R.id.iot);
            o.LJIIIIZZ(reaction_count, "reaction_count");
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            reaction_count.setVisibility(i2);
            String valueOf = String.valueOf(item.LJLJI);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valueOf);
            spannableStringBuilder.setSpan(new C156756Df(), 0, valueOf.length(), 33);
            ((TextView) c111734a1.LIZ(R.id.iot)).setText(spannableStringBuilder.toString());
            if (item.LJLJJI) {
                ((TextView) c111734a1.LIZ(R.id.iot)).setTypeface(Typeface.defaultFromStyle(1));
            } else {
                ((TextView) c111734a1.LIZ(R.id.iot)).setTypeface(Typeface.defaultFromStyle(0));
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isAnimation: ");
            LIZ.append(item.LJLJJL);
            LIZ.append("; isReactionCountChange: ");
            LIZ.append(item.LJLJL);
            LIZ.append(", isSelf: ");
            LIZ.append(item.LJLJJI);
            C34B.LIZIZ("ReactionItemView", X1D.LIZIZ(LIZ));
            if (item.LJLJJL) {
                if (item.LJLJI == 1 && item.LJLJL) {
                    boolean z2 = item.LJLJLJ;
                    AppCompatTextView emoji_iv_dm = (AppCompatTextView) c111734a1.LIZ(R.id.cue);
                    o.LJIIIIZZ(emoji_iv_dm, "emoji_iv_dm");
                    AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(c111734a1, 376);
                    c111734a1.measure(View.MeasureSpec.makeMeasureSpec(C1DF.LJIIIZ(10000), LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(C1DF.LJIIIZ(10000), LiveLayoutPreloadThreadPriority.DEFAULT));
                    int measuredWidth = c111734a1.getMeasuredWidth();
                    int measuredWidth2 = emoji_iv_dm.getMeasuredWidth();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("expectedItemViewWidth: ");
                    LIZ2.append(measuredWidth);
                    LIZ2.append("; emojiTextViewWidth: ");
                    LIZ2.append(measuredWidth2);
                    C34B.LIZIZ("ReactionItemExpandAnimatorUtils", X1D.LIZIZ(LIZ2));
                    String charSequence = emoji_iv_dm.getText().toString();
                    Context context = emoji_iv_dm.getContext();
                    o.LJIIIIZZ(context, "realEmojiTextView.context");
                    String str3 = null;
                    TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                    if (str2 != null) {
                        Locale locale2 = Locale.ROOT;
                        str3 = C141415gn.LIZIZ(locale2, "ROOT", str2, locale2, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (o.LJ(str3, "samsung") && o.LJ(charSequence, "❤️")) {
                        tuxTextView.setTuxFont(71);
                    } else {
                        tuxTextView.setTuxFont(61);
                    }
                    tuxTextView.setGravity(17);
                    tuxTextView.setText(charSequence);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(measuredWidth2, -2);
                    if (z2) {
                        i3 = 8388629;
                    } else {
                        i3 = 8388627;
                    }
                    layoutParams.gravity = i3;
                    layoutParams.setMarginStart(C1DF.LJIIIZ(2));
                    layoutParams.setMarginEnd((measuredWidth - measuredWidth2) - C1DF.LJIIIZ(2));
                    tuxTextView.setLayoutParams(layoutParams);
                    c111734a1.addView(tuxTextView);
                    aqS167S0100000_1.invoke(tuxTextView);
                    ValueAnimator ofInt = ValueAnimator.ofInt(1, measuredWidth);
                    ofInt.setDuration(150L);
                    ofInt.setInterpolator(C55953Lxd.LJ());
                    ofInt.addListener(new ALAdapterS0S0100000_1(c111734a1, 10));
                    ofInt.addUpdateListener(new AUListenerS90S0100000_1(c111734a1, 68));
                    ofInt.addListener(new ALAdapterS0S0110000_1(z, c111734a1, 1));
                    ofInt.start();
                    c111734a1.LJLILLLLZI = ofInt;
                    return;
                }
                TuxTextView emoji_iv_dm2 = (TuxTextView) c111734a1.LIZ(R.id.cue);
                o.LJIIIIZZ(emoji_iv_dm2, "emoji_iv_dm");
                c111734a1.LIZIZ(emoji_iv_dm2, false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, X.4aC] */
    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C111844aC com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        Context context = this.LJLIL;
        o.LJIIIZ(context, "context");
        final C111734a1 c111734a1 = new C111734a1(context);
        ?? r2 = new RecyclerView.ViewHolder(c111734a1) { // from class: X.4aC
            public static final /* synthetic */ int LJLIL = 0;
        };
        C0AX.LIZ(parent, r2.itemView, R.id.lj7);
        View view = r2.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (r2.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C111844aC.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) r2.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(r2.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C111844aC.class.getName();
        return r2;
    }
}
