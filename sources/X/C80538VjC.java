package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.android.material.datepicker.MaterialCalendar;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.VjC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80538VjC extends AbstractC029409q<C80559VjX> {
    public final MaterialCalendar<?> LJLIL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.LJLJJI.yearSpan;
    }

    public C80538VjC(MaterialCalendar<?> materialCalendar) {
        this.LJLIL = materialCalendar;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C80559VjX c80559VjX, int i) {
        C80339Vfz c80339Vfz;
        C80559VjX c80559VjX2 = c80559VjX;
        int i2 = this.LJLIL.LJLJJI.start.LJLILLLLZI + i;
        String string = c80559VjX2.LJLIL.getContext().getString(R.string.i_4);
        c80559VjX2.LJLIL.setText(C16880lQ.LLLZI(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i2)}));
        c80559VjX2.LJLIL.setContentDescription(C16880lQ.LLLZ(string, new Object[]{Integer.valueOf(i2)}));
        C80546VjK c80546VjK = this.LJLIL.LJLJL;
        Calendar LJII = C80561VjZ.LJII();
        if (LJII.get(1) == i2) {
            c80339Vfz = c80546VjK.LJFF;
        } else {
            c80339Vfz = c80546VjK.LIZLLL;
        }
        Iterator<Long> it = this.LJLIL.LJLJI.LJLLILLLL().iterator();
        while (it.hasNext()) {
            LJII.setTimeInMillis(it.next().longValue());
            if (LJII.get(1) == i2) {
                c80339Vfz = c80546VjK.LJ;
            }
        }
        c80339Vfz.LIZIZ(c80559VjX2.LJLIL);
        C16880lQ.LJIJI(c80559VjX2.LJLIL, new ViewOnClickListenerC80549VjN(this, i2));
    }

    @Override // X.AbstractC029409q
    public final C80559VjX onCreateViewHolder(ViewGroup viewGroup, int i) {
        C80559VjX c80559VjX = new C80559VjX((TextView) C28289B8j.LIZ(viewGroup, R.layout.bu1, viewGroup, false));
        C0AX.LIZ(viewGroup, c80559VjX.itemView, R.id.lj7);
        View view = c80559VjX.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c80559VjX.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C80559VjX.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c80559VjX.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c80559VjX.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C80559VjX.class.getName();
        return c80559VjX;
    }
}
