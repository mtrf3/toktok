package X;

import Y.ACListenerS29S0101000_12;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Sdh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72553Sdh extends AbstractC029409q<C72554Sdi> {
    public final C72549Sdd LJLIL;
    public final InterfaceC72558Sdm LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.LIZ.size();
    }

    public C72553Sdh(C72549Sdd data, InterfaceC72558Sdm clickListener) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(clickListener, "clickListener");
        this.LJLIL = data;
        this.LJLILLLLZI = clickListener;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C72554Sdi c72554Sdi, int i) {
        C72554Sdi holder = c72554Sdi;
        o.LJIIIZ(holder, "holder");
        Object obj = ListProtector.get(this.LJLIL.LIZ, i);
        o.LJIIIIZZ(obj, "data.colors[position]");
        C72556Sdk c72556Sdk = (C72556Sdk) obj;
        boolean LJ = o.LJ(c72556Sdk, this.LJLIL.LIZIZ);
        holder.LJLILLLLZI.setRotation(0.0f);
        holder.LJLILLLLZI.setVisibility(0);
        holder.LJLIL.setVisibility(8);
        holder.LJLJI.setVisibility(8);
        if (LJ) {
            holder.LJLJI.setVisibility(0);
        }
        holder.LJLILLLLZI.setRadius((int) holder.LJLJJI);
        if (c72556Sdk instanceof C72555Sdj) {
            C72555Sdj c72555Sdj = (C72555Sdj) c72556Sdk;
            GradientDrawable gradientDrawable = new GradientDrawable();
            int[] iArr = new int[c72555Sdj.LJ.size()];
            int size = c72555Sdj.LJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = ListProtector.get(c72555Sdj.LJ, i2);
                o.LJIIIIZZ(obj2, "color.colorPercentageMap[i]");
                String str = ((C72556Sdk) obj2).LIZIZ;
                if (str != null) {
                    iArr[i2] = ColorProtector.parseColor(str);
                }
            }
            gradientDrawable.setColors(iArr);
            holder.LJLILLLLZI.setBackground(gradientDrawable);
            holder.LJLILLLLZI.setRotation(c72555Sdj.LIZLLL);
        } else if (c72556Sdk.LIZJ != null) {
            S3I s3i = new S3I();
            s3i.LIZ = true;
            s3i.LIZLLL = holder.LJLJJI;
            S3L LIZ = s3i.LIZ();
            holder.LJLIL.setCircleOptions(LIZ);
            holder.LJLIL.setVisibility(0);
            holder.LJLILLLLZI.setVisibility(8);
            W5F LJII = W5U.LJII(c72556Sdk.LIZJ);
            LJII.LIZJ = holder.LJLIL.getContext();
            LJII.LJJIIJ = holder.LJLIL;
            LJII.LJIJJLI = LIZ;
            C16880lQ.LLJJJ(LJII);
        } else if (c72556Sdk.LIZIZ != null) {
            holder.LJLIL.setVisibility(8);
            holder.LJLILLLLZI.setVisibility(0);
            holder.LJLILLLLZI.setBackgroundColor(ColorProtector.parseColor(c72556Sdk.LIZIZ));
        }
        C16880lQ.LJIIJ(new ACListenerS29S0101000_12(i, this, 5), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C72554Sdi com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C72554Sdi c72554Sdi = new C72554Sdi(C1FL.LIZIZ(parent, R.layout.c6y, parent, false, "from(parent.context)\n   …item_view, parent, false)"));
        C0AX.LIZ(parent, c72554Sdi.itemView, R.id.lj7);
        View view = c72554Sdi.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c72554Sdi.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C72554Sdi.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c72554Sdi.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c72554Sdi.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C72554Sdi.class.getName();
        return c72554Sdi;
    }
}
