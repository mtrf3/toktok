package X;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TCw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74270TCw extends AbstractC28801Bc<EffectCategoryModel, C74271TCx> {
    public String LJLIL;
    public final /* synthetic */ C81283VvD LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74270TCw(C81283VvD c81283VvD) {
        super(new C74269TCv());
        this.LJLILLLLZI = c81283VvD;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean LJ;
        float f;
        C74271TCx viewHolder2 = (C74271TCx) viewHolder;
        o.LJIIIZ(viewHolder2, "viewHolder");
        EffectCategoryModel item = getItem(i);
        String str = this.LJLIL;
        if (str == null) {
            this.LJLIL = item.getName();
            LJ = true;
        } else {
            LJ = o.LJ(str, item.getName());
        }
        o.LJIIIIZZ(item, "item");
        viewHolder2.LJLIL.setText(item.getName());
        TextView textView = viewHolder2.LJLIL;
        if (LJ) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        textView.setAlpha(f);
        if (LJ) {
            TextView textView2 = viewHolder2.LJLIL;
            textView2.setTypeface(textView2.getTypeface(), 1);
            return;
        }
        Typeface LIZ = C78882Uxa.LIZ(EnumC49617Jdd.MEDIUM.getFONT_NAME());
        if (LIZ != null) {
            viewHolder2.LJLIL.setTypeface(LIZ);
        } else {
            TextView textView3 = viewHolder2.LJLIL;
            textView3.setTypeface(textView3.getTypeface(), 0);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.j0, viewGroup, false);
        if (LIZIZ != null) {
            C74271TCx c74271TCx = new C74271TCx(this, (FrameLayout) LIZIZ);
            C0AX.LIZ(viewGroup, c74271TCx.itemView, R.id.lj7);
            View view = c74271TCx.itemView;
            if (view != null) {
                view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
            }
            try {
                if (c74271TCx.itemView.getParent() != null) {
                    boolean z = true;
                    try {
                        SettingsManager.LIZLLL().getClass();
                        z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(C74271TCx.class.getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(viewGroup.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C78983UzD.LJIILL(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) c74271TCx.itemView.getParent();
                        if (viewGroup2 != null) {
                            C16880lQ.LJLLL(c74271TCx.itemView, viewGroup2);
                        }
                    }
                }
            } catch (Exception e) {
                C78946Uyc.LIZIZ(e);
                C36922EeM.LIZ(e);
            }
            C29127Bbv.LIZ = C74271TCx.class.getName();
            return c74271TCx;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }
}
