package X;

import Y.IDComparatorS42S0000000_14;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS112S0101000_14;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.IDqS456S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WpV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83477WpV extends AbstractC029409q<RecyclerView.ViewHolder> {
    public int LJLIL;
    public C44946HkU LJLILLLLZI;
    public C83489Wph LJLJI;
    public final List<C83489Wph> LJLJJI;
    public final java.util.Map<C83489Wph, Integer> LJLJJL;
    public boolean LJLJJLL;
    public InterfaceC83485Wpd LJLJL;
    public final C62822Ol8 LJLJLJ;
    public C169546l4 LJLJLLL;
    public Effect LJLL;
    public final Context LJLLI;
    public final InterfaceC83481WpZ LJLLILLLL;
    public final boolean LJLLJ;
    public final boolean LJLLL;
    public final InterfaceC88474Ynu<Boolean, C83489Wph, List<IB3>, java.util.Map<C83489Wph, Integer>, C76800UCe> LJLLLL;

    public final void LJLLLLLL() {
        Iterator<C83489Wph> it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().LJIIIZ = -1;
        }
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    public final List<IB3> LJLZ() {
        List LLILII = ORZ.LLILII(new IDComparatorS42S0000000_14(12), ((LinkedHashMap) this.LJLJJL).entrySet());
        ArrayList arrayList = new ArrayList();
        Iterator it = LLILII.iterator();
        while (it.hasNext()) {
            C83489Wph c83489Wph = (C83489Wph) ((Map.Entry) it.next()).getKey();
            String str = c83489Wph.LIZIZ;
            if (str != null) {
                long j = c83489Wph.LJFF;
                int i = c83489Wph.LJI;
                String str2 = c83489Wph.LIZ;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = c83489Wph.LJII;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList.add(new IB3(i, str, str2, j, str3, "media_tray"));
            }
        }
        return arrayList;
    }

    public final void LJZ() {
        C169546l4 c169546l4 = this.LJLJLLL;
        if (c169546l4 != null) {
            ObjectAnimator objectAnimator = c169546l4.LJLIL;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            View itemView = c169546l4.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
            layoutParams.height = 0;
            layoutParams.width = 0;
            View itemView2 = c169546l4.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            itemView2.setLayoutParams(layoutParams);
            View itemView3 = c169546l4.itemView;
            o.LJIIIIZZ(itemView3, "itemView");
            itemView3.setVisibility(8);
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJJI).size() + 1;
    }

    public final boolean LJZI(C83489Wph c83489Wph) {
        String str;
        String str2;
        C83489Wph c83489Wph2 = this.LJLJI;
        if (c83489Wph2 == null || (str = c83489Wph2.LIZIZ) == null || str.length() == 0) {
            return false;
        }
        String str3 = c83489Wph2.LIZIZ;
        if (c83489Wph != null) {
            str2 = c83489Wph.LIZIZ;
        } else {
            str2 = null;
        }
        return o.LJ(str3, str2);
    }

    public final void LJZL(T49 t49) {
        int adapterPosition = t49.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < ((ArrayList) this.LJLJJI).size()) {
            int i = this.LJLIL;
            if (adapterPosition == i) {
                this.LJLJI = null;
                notifyItemChanged(i);
                InterfaceC83481WpZ interfaceC83481WpZ = this.LJLLILLLL;
                if (interfaceC83481WpZ != null) {
                    interfaceC83481WpZ.LLLIIIIL();
                }
                this.LJLIL = -1;
                return;
            }
            AqS112S0101000_14 aqS112S0101000_14 = new AqS112S0101000_14(this, adapterPosition, 8);
            if (this.LJLLILLLL != null) {
                this.LJLLILLLL.LIZLLL((C83489Wph) ListProtector.get(this.LJLJJI, adapterPosition), new C83479WpX(aqS112S0101000_14));
            } else {
                aqS112S0101000_14.invoke$0();
            }
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i == getItemCount() - 1) {
            return 1;
        }
        return 2;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        int i2;
        int i3;
        float f;
        float f2;
        int i4;
        o.LJIIIZ(holder, "holder");
        if ((holder instanceof C169546l4) || !(holder instanceof T49)) {
            return;
        }
        T49 t49 = (T49) holder;
        C83489Wph c83489Wph = (C83489Wph) ListProtector.get(this.LJLJJI, i);
        ImageView imageView = t49.LJLIL;
        if (!LJZI(c83489Wph) || this.LJLLL) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        imageView.setVisibility(i2);
        float f3 = 44.0f;
        if (this.LJLLL) {
            FrameLayout frameLayout = t49.LJLJJLL;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                Context context = frameLayout.getContext();
                o.LJIIIIZZ(context, "context");
                marginLayoutParams.width = (int) C74275TDb.LIZIZ(context, 50.0f);
                Context context2 = frameLayout.getContext();
                o.LJIIIIZZ(context2, "context");
                marginLayoutParams.height = (int) C74275TDb.LIZIZ(context2, 50.0f);
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
            }
            frameLayout.setLayoutParams(marginLayoutParams);
            C72790ShW c72790ShW = t49.LJLILLLLZI;
            ViewGroup.LayoutParams layoutParams2 = c72790ShW.getLayoutParams();
            Context context3 = c72790ShW.getContext();
            o.LJIIIIZZ(context3, "context");
            if (LJZI(c83489Wph) || this.LJLJJL.containsKey(c83489Wph)) {
                f = 48.0f;
            } else {
                f = 44.0f;
            }
            layoutParams2.width = (int) C74275TDb.LIZIZ(context3, f);
            Context context4 = c72790ShW.getContext();
            o.LJIIIIZZ(context4, "context");
            if (LJZI(c83489Wph) || this.LJLJJL.containsKey(c83489Wph)) {
                f2 = 48.0f;
            } else {
                f2 = 44.0f;
            }
            layoutParams2.height = (int) C74275TDb.LIZIZ(context4, f2);
            c72790ShW.setLayoutParams(layoutParams2);
            c72790ShW.setRectFRadius(C74275TDb.LIZ(12.0f));
            if (LJZI(c83489Wph)) {
                if (this.LJLLJ) {
                    i4 = R.drawable.a7o;
                } else {
                    i4 = R.drawable.a7m;
                }
                View view = t49.LJLJL;
                view.setBackground(C04270Et.LIZIZ(view.getContext(), i4));
                view.setVisibility(0);
            } else {
                t49.LJLJL.setVisibility(8);
            }
        }
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(t49.LJLJJI.getLayoutParams());
        if (this.LJLLL) {
            layoutParams3.gravity = 17;
        } else {
            layoutParams3.gravity = 8388661;
            if (this.LJLJJLL) {
                Context context5 = t49.LJLJJI.getContext();
                o.LJIIIIZZ(context5, "holder.tvIndicator.context");
                layoutParams3.topMargin = (int) C74275TDb.LIZIZ(context5, 4.0f);
                Context context6 = t49.LJLJJI.getContext();
                o.LJIIIIZZ(context6, "holder.tvIndicator.context");
                layoutParams3.rightMargin = (int) C74275TDb.LIZIZ(context6, 4.0f);
            } else {
                Context context7 = t49.LJLJJI.getContext();
                o.LJIIIIZZ(context7, "holder.tvIndicator.context");
                layoutParams3.topMargin = (int) C74275TDb.LIZIZ(context7, 3.0f);
                Context context8 = t49.LJLJJI.getContext();
                o.LJIIIIZZ(context8, "holder.tvIndicator.context");
                layoutParams3.rightMargin = (int) C74275TDb.LIZIZ(context8, 3.0f);
            }
        }
        TextView textView = t49.LJLJJI;
        textView.setLayoutParams(layoutParams3);
        if (this.LJLLL) {
            Context context9 = textView.getContext();
            o.LJIIIIZZ(context9, "context");
            textView.setTextColor(context9.getResources().getColor(R.color.acm));
            textView.setBackground(null);
        }
        if (c83489Wph.LJIIIZ != -1) {
            t49.LJLJJI.setVisibility(0);
            if (this.LJLLL) {
                View view2 = t49.LJLJL;
                Context context10 = view2.getContext();
                o.LJIIIIZZ(context10, "context");
                view2.setBackground(context10.getResources().getDrawable(R.drawable.a7n));
                view2.setVisibility(0);
            }
            t49.LJLJJI.setText(String.valueOf(c83489Wph.LJIIIZ));
            t49.LJLJJL.setVisibility(8);
        } else {
            t49.LJLJJI.setVisibility(8);
            if (this.LJLJJLL) {
                int size = this.LJLJJL.size();
                C44946HkU c44946HkU = this.LJLILLLLZI;
                if (c44946HkU != null) {
                    i3 = c44946HkU.LJLJJL;
                } else {
                    i3 = 0;
                }
                if (size >= i3) {
                    t49.LJLJJL.setVisibility(0);
                } else {
                    t49.LJLJJL.setVisibility(8);
                }
            }
        }
        android.net.Uri LJIIIIZZ = C44694HgQ.LJIIIIZZ(c83489Wph.LIZIZ);
        if (this.LJLLL && (LJZI(c83489Wph) || this.LJLJJL.containsKey(c83489Wph))) {
            f3 = 48.0f;
        } else if (!this.LJLLL) {
            f3 = 50.0f;
        }
        Context context11 = t49.LJLILLLLZI.getContext();
        o.LJIIIIZZ(context11, "holder.imageView.context");
        int LIZIZ = (int) C74275TDb.LIZIZ(context11, f3);
        if (c83489Wph.LJI == 3) {
            C78764Uvg.LIZIZ(t49.LJLILLLLZI, LJIIIIZZ.toString(), LIZIZ, LIZIZ);
        } else {
            C78764Uvg.LIZJ(t49.LJLILLLLZI, LJIIIIZZ, LIZIZ, LIZIZ);
        }
        if (c83489Wph.LJI == 2) {
            float f4 = (((float) c83489Wph.LJFF) * 1.0f) / 1000;
            TextView textView2 = t49.LJLJI;
            StringBuilder LIZ = X1D.LIZ();
            String LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f4)}, 1));
            o.LJIIIIZZ(LLLZI, "java.lang.String.format(locale, format, *args)");
            LIZ.append(LLLZI);
            LIZ.append("s");
            textView2.setText(X1D.LIZIZ(LIZ));
            textView2.setVisibility(0);
            return;
        }
        t49.LJLJI.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        int i2;
        T49 t49;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i == 1) {
            View footerView = (View) this.LJLJLJ.getValue();
            o.LJIIIIZZ(footerView, "footerView");
            C169546l4 c169546l4 = new C169546l4(footerView);
            this.LJLJLLL = c169546l4;
            t49 = c169546l4;
        } else {
            LayoutInflater LLZIL = C16880lQ.LLZIL(parent.getContext());
            if (this.LJLLJ) {
                i2 = R.layout.bbb;
            } else {
                i2 = R.layout.bba;
            }
            View view = C16880lQ.LLLLIILL(LLZIL, i2, parent, false);
            o.LJIIIIZZ(view, "view");
            T49 t492 = new T49(view);
            C16880lQ.LJIIJ(new C83478WpW(this, t492), view);
            t49 = t492;
        }
        C0AX.LIZ(parent, t49.itemView, R.id.lj7);
        View view2 = t49.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (t49.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(t49.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) t49.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(t49.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = t49.getClass().getName();
        return t49;
    }

    public C83477WpV(ActivityC45651qj context, InterfaceC83481WpZ interfaceC83481WpZ, boolean z, boolean z2, IDqS456S0100000_14 iDqS456S0100000_14) {
        o.LJIIIZ(context, "context");
        this.LJLLI = context;
        this.LJLLILLLL = interfaceC83481WpZ;
        this.LJLLJ = z;
        this.LJLLL = z2;
        this.LJLLLL = iDqS456S0100000_14;
        this.LJLIL = -1;
        this.LJLJJI = new ArrayList();
        this.LJLJJL = new LinkedHashMap();
        this.LJLJLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 505));
    }
}
