package X;

import Y.ACListenerS23S0301000_13;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uw4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78788Uw4 extends AbstractC029409q<C78790Uw6> {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final List<C78789Uw5> LJLJI;
    public final List<Integer> LJLJJI;
    public final InterfaceC88472Yns<C78820Uwa, C76800UCe> LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJI.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C78790Uw6 c78790Uw6, int i) {
        Integer LJI;
        C78790Uw6 holder = c78790Uw6;
        o.LJIIIZ(holder, "holder");
        C78789Uw5 c78789Uw5 = (C78789Uw5) ListProtector.get(this.LJLJI, i);
        if (c78789Uw5.LJIIJJI != null) {
            C1M5 c1m5 = new C1M5(holder.itemView.getResources(), c78789Uw5.LJIIJJI);
            c1m5.LIZJ(C7MY.LIZIZ(8));
            holder.LJLIL.setBackground(c1m5);
        } else if (o.LJ(c78789Uw5.LIZIZ, "")) {
            C78764Uvg.LIZ(holder.LJLIL, R.drawable.b5t);
            holder.LJLIL.setBackground(null);
        } else {
            holder.LJLIL.setBackground(null);
            C78764Uvg.LJIIIZ(holder.LJLIL, c78789Uw5.LIZIZ, -1, -1);
        }
        if (c78789Uw5.LJIIJ && !this.LJLJJI.contains(Integer.valueOf(i))) {
            this.LJLJJI.add(Integer.valueOf(i));
        }
        C16880lQ.LJIIJ(new ACListenerS23S0301000_13(this, c78789Uw5, holder, i, 1), holder.itemView);
        FrameLayout frameLayout = holder.LJLJI;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C7MY.LIZIZ(c78789Uw5.LJI), C7MY.LIZIZ(c78789Uw5.LJII));
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        int i2 = (c78789Uw5.LJI - 4) - 4;
        if (c78789Uw5.LJIIIZ == EnumC78125UlN.LOCAL) {
            if (o.LJ(c78789Uw5.LIZJ, "")) {
                FrameLayout frameLayout2 = holder.LJLJJI;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C7MY.LIZIZ(i2), C7MY.LIZIZ(i2));
                layoutParams2.gravity = 17;
                frameLayout2.setLayoutParams(layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(C7MY.LIZIZ(c78789Uw5.LJIIIIZZ));
                Context context = holder.LJLJJI.getContext();
                if (context != null && (LJI = C79045V0n.LJI(R.attr.d1, context)) != null) {
                    gradientDrawable.setColor(LJI.intValue());
                }
                holder.LJLJJI.setBackground(gradientDrawable);
                W5G w5g = holder.LJLIL;
                if (w5g != null) {
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C7MY.LIZIZ(16), C7MY.LIZIZ(16));
                    layoutParams3.gravity = 17;
                    w5g.setLayoutParams(layoutParams3);
                }
            } else {
                W5G w5g2 = holder.LJLIL;
                if (w5g2 != null) {
                    V8L LIZIZ = V8L.LIZIZ(C7MY.LIZIZ(4));
                    C79077V1t c79077V1t = new C79077V1t(w5g2.getContext().getResources());
                    c79077V1t.LJIILL = LIZIZ;
                    w5g2.setHierarchy(c79077V1t.LIZ());
                    FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(C7MY.LIZIZ(i2), C7MY.LIZIZ(i2));
                    layoutParams4.gravity = 17;
                    w5g2.setLayoutParams(layoutParams4);
                }
            }
        } else {
            holder.LJLJJI.setBackgroundColor(0);
            W5G w5g3 = holder.LJLIL;
            if (w5g3 != null) {
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(C7MY.LIZIZ(i2), C7MY.LIZIZ(i2));
                layoutParams5.gravity = 17;
                w5g3.setLayoutParams(layoutParams5);
            }
            FrameLayout frameLayout3 = holder.LJLJJI;
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams6.gravity = 17;
            frameLayout3.setLayoutParams(layoutParams6);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        if (c78789Uw5.LJIIJ) {
            Context context2 = holder.LJLIL.getContext();
            o.LJIIIIZZ(context2, "holder.imageView.context");
            Integer LJI2 = C79045V0n.LJI(R.attr.dj, context2);
            if (LJI2 != null) {
                gradientDrawable2.setStroke(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), LJI2.intValue());
            }
        }
        gradientDrawable2.setCornerRadius(C7MY.LIZIZ(c78789Uw5.LJIIIIZZ));
        if (c78789Uw5.LJIIIZ == EnumC78125UlN.REMOTE) {
            Context context3 = holder.LJLJI.getContext();
            o.LJIIIIZZ(context3, "holder.imageContainer.context");
            Integer LJI3 = C79045V0n.LJI(R.attr.d1, context3);
            if (LJI3 != null) {
                gradientDrawable2.setColor(LJI3.intValue());
            }
        }
        holder.LJLJI.setBackground(gradientDrawable2);
        FrameLayout frameLayout4 = holder.LJLJI;
        frameLayout4.setOnTouchListener(new ViewOnTouchListenerC170476mZ(0.9f, 100L, frameLayout4));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C78790Uw6 com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View v = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bz2, viewGroup, false);
        o.LJIIIIZZ(v, "v");
        C78790Uw6 c78790Uw6 = new C78790Uw6(v);
        C0AX.LIZ(viewGroup, c78790Uw6.itemView, R.id.lj7);
        View view = c78790Uw6.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c78790Uw6.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C78790Uw6.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c78790Uw6.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c78790Uw6.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C78790Uw6.class.getName();
        return c78790Uw6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C78788Uw4(int i, String parentCategory, List<C78789Uw5> children, List<Integer> selectedIndexList, InterfaceC88472Yns<? super C78820Uwa, C76800UCe> onClick) {
        o.LJIIIZ(parentCategory, "parentCategory");
        o.LJIIIZ(children, "children");
        o.LJIIIZ(selectedIndexList, "selectedIndexList");
        o.LJIIIZ(onClick, "onClick");
        this.LJLIL = i;
        this.LJLILLLLZI = parentCategory;
        this.LJLJI = children;
        this.LJLJJI = selectedIndexList;
        this.LJLJJL = onClick;
    }
}
