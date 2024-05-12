package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3zL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101953zL extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final List<InterfaceC101893zF> LJLIL;
    public int LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LJLIL, i);
        if (obj instanceof C101833z9) {
            return 2;
        }
        if (obj instanceof C101913zH) {
            return 1;
        }
        throw new C162476Zf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C101953zL(List<? extends InterfaceC101893zF> list, int i) {
        this.LJLIL = list;
        this.LJLILLLLZI = i;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, final int i) {
        o.LJIIIZ(holder, "holder");
        final InterfaceC101893zF interfaceC101893zF = (InterfaceC101893zF) ListProtector.get(this.LJLIL, i);
        if (interfaceC101893zF instanceof C101833z9) {
            View view = holder.itemView;
            o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxTextCell");
            AI8 ai8 = (AI8) view;
            C101833z9 c101833z9 = (C101833z9) interfaceC101893zF;
            ai8.setTitle(c101833z9.LIZ);
            ai8.setSubtitle(c101833z9.LIZIZ);
            AI9 accessory = ai8.getAccessory();
            o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
            AEY aey = (AEY) accessory;
            aey.LJIILIIL(c101833z9.LIZLLL);
            aey.LJIILL(new CompoundButton.OnCheckedChangeListener() { // from class: X.3zK
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    C101833z9 c101833z92;
                    int i2 = i;
                    C101953zL c101953zL = this;
                    if (i2 != c101953zL.LJLILLLLZI) {
                        int size = c101953zL.LJLIL.size();
                        C101953zL c101953zL2 = this;
                        int i3 = c101953zL2.LJLILLLLZI;
                        if (i3 >= 0 && i3 < size) {
                            Object obj = ListProtector.get(c101953zL2.LJLIL, i3);
                            if ((obj instanceof C101833z9) && (c101833z92 = (C101833z9) obj) != null) {
                                c101833z92.LIZLLL = false;
                            }
                            C101953zL c101953zL3 = this;
                            c101953zL3.notifyItemChanged(c101953zL3.LJLILLLLZI, Boolean.FALSE);
                        }
                        ((C101833z9) interfaceC101893zF).LIZLLL = true;
                        this.notifyItemChanged(i, Boolean.TRUE);
                        this.LJLILLLLZI = i;
                    }
                }
            });
            Integer num = c101833z9.LIZJ;
            if (num != null) {
                int intValue = num.intValue();
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = intValue;
                ai8.setIcon(c2068389v);
            }
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder viewHolder;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i == 2) {
            Context context = parent.getContext();
            o.LJIIIIZZ(context, "parent.context");
            final AI8 ai8 = new AI8(context, null, 6);
            ai8.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            Context context2 = parent.getContext();
            o.LJIIIIZZ(context2, "parent.context");
            ai8.setAccessory(new C25991AHz(context2));
            viewHolder = new RecyclerView.ViewHolder(ai8) { // from class: X.3zM
            };
        } else {
            final FrameLayout frameLayout = new FrameLayout(parent.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            C26338AVi.LJIIIZ(frameLayout, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), AnonymousClass391.LIZJ(22), AnonymousClass391.LIZJ(16), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(22))), 16);
            Context context3 = parent.getContext();
            o.LJIIIIZZ(context3, "parent.context");
            TuxTextView tuxTextView = new TuxTextView(context3, null, 6, 0);
            tuxTextView.setText(parent.getContext().getString(R.string.ero));
            tuxTextView.setTuxFont(33);
            TypedValue typedValue = new TypedValue();
            tuxTextView.getContext().getTheme().resolveAttribute(R.attr.go, typedValue, true);
            tuxTextView.setTextColor(typedValue.data);
            frameLayout.addView(tuxTextView);
            viewHolder = new RecyclerView.ViewHolder(frameLayout) { // from class: X.3zM
            };
        }
        C0AX.LIZ(parent, viewHolder.itemView, R.id.lj7);
        View view = viewHolder.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C101963zM.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(viewHolder.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C101963zM.class.getName();
        return viewHolder;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        Boolean bool;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i);
            return;
        }
        Object LJLLJ = ORZ.LJLLJ(payloads);
        if (!(LJLLJ instanceof Boolean) || (bool = (Boolean) LJLLJ) == null) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        View view = holder.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxTextCell");
        AI9 accessory = ((AI8) view).getAccessory();
        o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
        ((AEY) accessory).LJIILIIL(booleanValue);
    }
}
