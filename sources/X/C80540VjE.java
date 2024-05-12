package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.Month;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

/* renamed from: X.VjE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80540VjE extends AbstractC029409q<C80554VjS> {
    public final Context LJLIL;
    public final CalendarConstraints LJLILLLLZI;
    public final DateSelector<?> LJLJI;
    public final InterfaceC80560VjY LJLJJI;
    public final int LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.monthSpan;
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return this.LJLILLLLZI.start.LJIIL(i).LJIIJJI();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C80554VjS c80554VjS, int i) {
        C80554VjS c80554VjS2 = c80554VjS;
        Month LJIIL = this.LJLILLLLZI.start.LJIIL(i);
        c80554VjS2.LJLIL.setText(LJIIL.LJIIJ(c80554VjS2.itemView.getContext()));
        C80539VjD c80539VjD = (C80539VjD) c80554VjS2.LJLILLLLZI.findViewById(R.id.glv);
        if (c80539VjD.getAdapter2() != null && LJIIL.equals(c80539VjD.getAdapter2().LJLIL)) {
            c80539VjD.invalidate();
            C80541VjF adapter2 = c80539VjD.getAdapter2();
            Iterator<Long> it = adapter2.LJLJI.iterator();
            while (it.hasNext()) {
                adapter2.LJFF(c80539VjD, it.next().longValue());
            }
            DateSelector<?> dateSelector = adapter2.LJLILLLLZI;
            if (dateSelector != null) {
                Iterator<Long> it2 = dateSelector.LJLLILLLL().iterator();
                while (it2.hasNext()) {
                    adapter2.LJFF(c80539VjD, it2.next().longValue());
                }
                adapter2.LJLJI = adapter2.LJLILLLLZI.LJLLILLLL();
            }
        } else {
            C80541VjF c80541VjF = new C80541VjF(LJIIL, this.LJLJI, this.LJLILLLLZI);
            c80539VjD.setNumColumns(LJIIL.LJLJI);
            c80539VjD.setAdapter((ListAdapter) c80541VjF);
        }
        c80539VjD.setOnItemClickListener(new C80542VjG(this, c80539VjD));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C80554VjS com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        C80554VjS c80554VjS;
        LinearLayout linearLayout = (LinearLayout) C28289B8j.LIZ(viewGroup, R.layout.btx, viewGroup, false);
        boolean z = true;
        if (MaterialDatePicker.wl(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.LJLJJL));
            c80554VjS = new C80554VjS(linearLayout, true);
        } else {
            c80554VjS = new C80554VjS(linearLayout, false);
        }
        C0AX.LIZ(viewGroup, c80554VjS.itemView, R.id.lj7);
        View view = c80554VjS.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c80554VjS.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C80554VjS.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c80554VjS.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c80554VjS.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C80554VjS.class.getName();
        return c80554VjS;
    }

    public C80540VjE(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, C80557VjV c80557VjV) {
        int i;
        Month month = calendarConstraints.start;
        Month month2 = calendarConstraints.end;
        Month month3 = calendarConstraints.openAt;
        if (month.compareTo(month3) <= 0) {
            if (month3.compareTo(month2) <= 0) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.a0p) * C80541VjF.LJLJJLL;
                if (MaterialDatePicker.wl(context)) {
                    i = context.getResources().getDimensionPixelSize(R.dimen.a0p);
                } else {
                    i = 0;
                }
                this.LJLIL = context;
                this.LJLJJL = dimensionPixelSize + i;
                this.LJLILLLLZI = calendarConstraints;
                this.LJLJI = dateSelector;
                this.LJLJJI = c80557VjV;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }
}
