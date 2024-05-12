package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.OpenLiveIconResetSwitch;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C0N extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final ArrayList<C0M> LJLIL;
    public final /* synthetic */ PreviewLiveModeWidget LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return C29306Beo.LJJIFFI(Boolean.valueOf(C28509BGv.LJI(((C0M) ListProtector.get(this.LJLIL, i + (-1))).LJ))) ? 1 : 0;
    }

    public C0N(PreviewLiveModeWidget previewLiveModeWidget, ArrayList<C0M> data) {
        o.LJIIIZ(data, "data");
        this.LJLILLLLZI = previewLiveModeWidget;
        this.LJLIL = data;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        Drawable drawable;
        float f;
        Resources resources;
        String string;
        Resources resources2;
        String string2;
        o.LJIIIZ(viewHolder, "viewHolder");
        boolean z = viewHolder instanceof C0P;
        if (!z && !(viewHolder instanceof C0O)) {
            return;
        }
        Object obj = ListProtector.get(this.LJLIL, i);
        o.LJIIIIZZ(obj, "mData[position]");
        C0M c0m = (C0M) obj;
        Context context = viewHolder.itemView.getContext();
        int i3 = c0m.LIZIZ;
        if (c0m.LIZ) {
            i2 = c0m.LIZJ;
            drawable = c0m.LJI;
            f = 0.9f;
        } else {
            i2 = c0m.LIZLLL;
            drawable = c0m.LJII;
            f = 0.5f;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(C0N.class));
        LIZ.append(" onBindViewHolder pos:");
        LIZ.append(i);
        LIZ.append(" show:");
        C19U.LIZJ(LIZ, c0m.LJFF, LIZ, "voice_chat");
        String str = "";
        if (z) {
            if (drawable != null) {
                C0P c0p = (C0P) viewHolder;
                c0p.LJLILLLLZI.setImageDrawable(drawable);
                if (OpenLiveIconResetSwitch.getValue()) {
                    c0p.LJLILLLLZI.setBackgroundResource(0);
                }
            } else {
                C0P c0p2 = (C0P) viewHolder;
                c0p2.LJLILLLLZI.setBackgroundResource(i2);
                if (OpenLiveIconResetSwitch.getValue()) {
                    c0p2.LJLILLLLZI.setImageDrawable(null);
                }
            }
            C0P c0p3 = (C0P) viewHolder;
            TextView textView = c0p3.LJLIL;
            if (context != null && (resources2 = context.getResources()) != null && (string2 = resources2.getString(i3)) != null) {
                str = string2;
            }
            textView.setText(str);
            c0p3.LJLIL.setAlpha(f);
            C29306Beo.LJJLIIIJJI(c0p3.LJLJI, c0m.LJFF);
            return;
        }
        if (!(viewHolder instanceof C0O)) {
            return;
        }
        C0O c0o = (C0O) viewHolder;
        c0o.LJLILLLLZI.setBackgroundResource(i2);
        TextView textView2 = c0o.LJLIL;
        if (context != null && (resources = context.getResources()) != null && (string = resources.getString(i3)) != null) {
            str = string;
        }
        textView2.setText(str);
        c0o.LJLIL.setAlpha(f);
        C29306Beo.LJJLIIIJJI(c0o.LJLJJI, c0m.LJFF);
        if (!LivePreviewNetworkSpeedSetting.INSTANCE.enable()) {
            return;
        }
        c0o.LJLJI.setFragment(this.LJLILLLLZI.widgetCallback.getFragment());
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c0p;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i == 1) {
            c0p = new C0O(C1FL.LIZIZ(parent, R.layout.dqc, parent, false, "from(parent.context).inf…tem_speed, parent, false)"));
        } else {
            c0p = new C0P(C1FL.LIZIZ(parent, R.layout.dqb, parent, false, "from(parent.context).inf…xtra_item, parent, false)"));
        }
        C0AX.LIZ(parent, c0p.itemView, R.id.lj7);
        View view = c0p.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c0p.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0p.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c0p.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c0p.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c0p.getClass().getName();
        return c0p;
    }
}
