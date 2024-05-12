package X;

import Y.ACListenerS37S0200000_2;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;
import o53.IDdS473S0100000_2;

/* renamed from: X.6Wf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC161696Wf extends AbstractC029409q<C161686We> implements View.OnClickListener, View.OnLongClickListener {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public final ArrayList<RecommendEffectItem> LJLILLLLZI = new ArrayList<>();
    public InterfaceC161676Wd LJLJI;
    public boolean LJLJJI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return false;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    public ViewOnClickListenerC161696Wf(AqS152S0100000_2 aqS152S0100000_2) {
        this.LJLIL = aqS152S0100000_2;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (((RecommendEffectItem) ListProtector.get(this.LJLILLLLZI, i)).LIZIZ) {
            return EnumC161706Wg.DEFAULT.getValue();
        }
        return EnumC161706Wg.NORMAL.getValue();
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(C161686We c161686We) {
        InterfaceC161676Wd interfaceC161676Wd;
        String str;
        C161686We holder = c161686We;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        RecommendEffectItem recommendEffectItem = holder.LJLIL;
        if (recommendEffectItem != null && !recommendEffectItem.LIZIZ && (interfaceC161676Wd = this.LJLJI) != null) {
            int bindingAdapterPosition = holder.getBindingAdapterPosition();
            RecommendEffectItem recommendEffectItem2 = holder.LJLIL;
            if (recommendEffectItem2 == null || (str = recommendEffectItem2.id) == null) {
                str = "";
            }
            interfaceC161676Wd.LIZ(bindingAdapterPosition, str);
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C161686We c161686We, int i) {
        IDdS473S0100000_2 iDdS473S0100000_2;
        C161686We holder = c161686We;
        o.LJIIIZ(holder, "holder");
        int itemViewType = getItemViewType(i);
        int i2 = 0;
        if (itemViewType == EnumC161706Wg.DEFAULT.getValue()) {
            Object obj = ListProtector.get(this.LJLILLLLZI, i);
            o.LJIIIIZZ(obj, "recommendEffectItemArrayList[position]");
            RecommendEffectItem recommendEffectItem = (RecommendEffectItem) obj;
            holder.L();
            boolean z = holder.LJLJJL.LJLJJI;
            ImageView imageView = holder.LJLJJI;
            if (!z) {
                i2 = 4;
            }
            imageView.setVisibility(i2);
            holder.LJLIL = recommendEffectItem;
        } else if (itemViewType == EnumC161706Wg.NORMAL.getValue()) {
            Object obj2 = ListProtector.get(this.LJLILLLLZI, i);
            o.LJIIIIZZ(obj2, "recommendEffectItemArrayList[position]");
            RecommendEffectItem recommendEffectItem2 = (RecommendEffectItem) obj2;
            holder.L();
            holder.LJLIL = recommendEffectItem2;
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
            imageDecodeOptionsBuilder.LIZIZ(1);
            imageDecodeOptionsBuilder.LJ = false;
            C81810W8w c81810W8w = new C81810W8w(imageDecodeOptionsBuilder);
            W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(recommendEffectItem2.iconUrl));
            LIZLLL.LJ = c81810W8w;
            if (recommendEffectItem2.isTTProp == 1) {
                LIZLLL.LJIIJ = new C78745UvN();
            }
            if (i == 1) {
                iDdS473S0100000_2 = new IDdS473S0100000_2(holder.LJLJJL, 0);
            } else {
                iDdS473S0100000_2 = null;
            }
            C170676mt.LIZ(holder.LJLILLLLZI, new W5O[]{LIZLLL.LIZ()}, iDdS473S0100000_2, true);
        }
        C16880lQ.LJIIJ(new ACListenerS37S0200000_2(holder, this, 5), holder.itemView);
    }

    @Override // X.AbstractC029409q
    public final C161686We onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.il, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        C161686We c161686We = new C161686We(this, itemView);
        C0AX.LIZ(viewGroup, c161686We.itemView, R.id.lj7);
        View view = c161686We.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c161686We.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C161686We.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c161686We.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c161686We.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C161686We.class.getName();
        return c161686We;
    }
}
