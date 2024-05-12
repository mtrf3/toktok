package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.AdjustVideoIntervalFragment;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.SelectSegmentInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS66S0201000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.577, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass577 extends AbstractC029409q<C57C> {
    public final C53W LJLIL;
    public final List<SelectSegmentInfo> LJLILLLLZI = new ArrayList();
    public final /* synthetic */ AdjustVideoIntervalFragment LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public AnonymousClass577(AdjustVideoIntervalFragment adjustVideoIntervalFragment, C53O c53o) {
        this.LJLJI = adjustVideoIntervalFragment;
        this.LJLIL = c53o;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C57C c57c, int i) {
        final C57C holder = c57c;
        o.LJIIIZ(holder, "holder");
        AdjustVideoIntervalFragment adjustVideoIntervalFragment = this.LJLJI;
        final SelectSegmentInfo selectSegmentInfo = (SelectSegmentInfo) ORZ.LJLLLLLL(i, this.LJLILLLLZI);
        if (selectSegmentInfo == null) {
            return;
        }
        holder.LJLILLLLZI.setTag(selectSegmentInfo.getPath());
        double d = 1000;
        int i2 = 0;
        holder.LJLIL.setText(C63144OqK.LIZIZ(new Object[]{Double.valueOf((selectSegmentInfo.getDuration() / d) / d)}, 1, Locale.ENGLISH, "%.1fs", "format(locale, format, *args)"));
        final int LIZ = C5DZ.LIZ(0);
        Bitmap LIZ2 = this.LJLIL.LIZ(LIZ, selectSegmentInfo.getPath());
        if (LIZ2 != null) {
            holder.LJLILLLLZI.setImageBitmap(LIZ2);
        } else {
            this.LJLIL.LIZIZ(new C54S() { // from class: X.56k
                @Override // X.C54S
                public final boolean LIZ(int i3, String path) {
                    o.LJIIIZ(path, "path");
                    if (o.LJ(path, SelectSegmentInfo.this.getPath()) && i3 == LIZ) {
                        holder.LJLILLLLZI.setImageBitmap(this.LJLIL.LIZ(i3, path));
                        return true;
                    }
                    return false;
                }
            });
        }
        View view = holder.LJLJI;
        if (i != adjustVideoIntervalFragment.LLFII) {
            i2 = 8;
        }
        view.setVisibility(i2);
        C146035oF.LIZJ(holder.LJLILLLLZI, new AqS66S0201000_2(this, i, adjustVideoIntervalFragment, 4));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C57C com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "p0", R.layout.ass, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C57C c57c = new C57C(view, this.LJLIL);
        C0AX.LIZ(viewGroup, c57c.itemView, R.id.lj7);
        View view2 = c57c.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c57c.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C57C.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c57c.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c57c.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C57C.class.getName();
        return c57c;
    }
}
