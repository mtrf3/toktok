package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WHo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82036WHo extends AbstractC029409q<C82032WHk> {
    public final Context LJLIL;
    public final WJA LJLILLLLZI;
    public final C82091WJr LJLJI;
    public final boolean LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.getItemCount();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C82032WHk c82032WHk, int i) {
        C82032WHk holder = c82032WHk;
        o.LJIIIZ(holder, "holder");
        C82033WHl LJIIIIZZ = this.LJLILLLLZI.LJIIIIZZ(i);
        if (LJIIIIZZ != null) {
            holder.L(LJIIIIZZ);
            if (LJIIIIZZ.LIZ == C6MP.BEAUTY && HYC.LIZ) {
                this.LJLILLLLZI.LJIILIIL(holder.LJLJLLL);
            }
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C82032WHk com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        View itemView;
        o.LJIIIZ(parent, "parent");
        if (this.LJLJJI) {
            itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLIL), R.layout.crt, parent, false);
        } else {
            itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLIL), R.layout.cru, parent, false);
        }
        Context context = this.LJLIL;
        o.LJIIIIZZ(itemView, "itemView");
        C82032WHk c82032WHk = new C82032WHk(context, itemView, this.LJLJI, this.LJLJJI);
        C0AX.LIZ(parent, c82032WHk.itemView, R.id.lj7);
        View view = c82032WHk.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c82032WHk.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C82032WHk.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c82032WHk.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c82032WHk.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C82032WHk.class.getName();
        return c82032WHk;
    }

    public /* synthetic */ C82036WHo(Context context, WJA wja, C82091WJr c82091WJr) {
        this(context, wja, c82091WJr, C52533KjZ.LIZJ());
    }

    public C82036WHo(Context context, WJA toolbarManager, C82091WJr uiAction, boolean z) {
        o.LJIIIZ(toolbarManager, "toolbarManager");
        o.LJIIIZ(uiAction, "uiAction");
        this.LJLIL = context;
        this.LJLILLLLZI = toolbarManager;
        this.LJLJI = uiAction;
        this.LJLJJI = z;
    }
}
