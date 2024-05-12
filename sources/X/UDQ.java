package X;

import Y.ACListenerS47S0200000_13;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.impl.revenue.subscription.emote.preview.PreviewImageDialogFragment;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UDQ extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final ArrayList<LiveSubMediaModel> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public PreviewImageDialogFragment LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public UDQ() {
        this.LJLIL = new ArrayList<>();
        this.LJLILLLLZI = -1;
    }

    public UDQ(Integer num) {
        this();
    }

    public final Integer LJLLLLLL(LiveSubMediaModel liveSubMediaModel) {
        int i = this.LJLJI;
        this.LJLJI = this.LJLIL.indexOf(liveSubMediaModel);
        if (i > -1 && i < getItemCount()) {
            notifyItemChanged(i, "previewBorder");
        }
        int i2 = this.LJLJI;
        if (i2 > -1 && i2 < getItemCount()) {
            notifyItemChanged(this.LJLJI, "previewBorder");
            return Integer.valueOf(this.LJLJI);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.W5O, REQUEST] */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Context context;
        Context context2;
        o.LJIIIZ(viewHolder, "viewHolder");
        UDR udr = (UDR) viewHolder;
        LiveSubMediaModel liveSubMediaModel = (LiveSubMediaModel) ListProtector.get(this.LJLIL, i);
        if (liveSubMediaModel != null) {
            UDQ udq = udr.LJLJJLL;
            android.net.Uri LIZ = C28829BTd.LIZ(liveSubMediaModel.getFileLocalUriPath());
            udq.getClass();
            W5P LIZLLL = W5P.LIZLLL(LIZ);
            W5G w5g = udr.LJLILLLLZI;
            InterfaceC81252Vui interfaceC81252Vui = null;
            if (w5g != null) {
                context = w5g.getContext();
            } else {
                context = null;
            }
            int LIZ2 = (int) B9K.LIZ(context, 56.0f);
            W5G w5g2 = udr.LJLILLLLZI;
            if (w5g2 != null) {
                context2 = w5g2.getContext();
            } else {
                context2 = null;
            }
            LIZLLL.LIZJ = new C79238V7y(LIZ2, (int) B9K.LIZ(context2, 56.0f));
            ?? LIZ3 = LIZLLL.LIZ();
            C81705W4v LIZJ = W5I.LIZJ();
            W5G w5g3 = udr.LJLILLLLZI;
            if (w5g3 != null) {
                interfaceC81252Vui = w5g3.getController();
            }
            LIZJ.LJIIL = interfaceC81252Vui;
            LIZJ.LIZLLL = LIZ3;
            W4R LIZ4 = LIZJ.LIZ();
            W5G w5g4 = udr.LJLILLLLZI;
            if (w5g4 != null) {
                w5g4.setController(LIZ4);
            }
            udr.L(liveSubMediaModel, udr, i);
        }
        C16880lQ.LJIIJ(new ACListenerS47S0200000_13(udr.LJLJJLL, liveSubMediaModel, 9), udr.LJLJI);
        FrameLayout frameLayout = udr.LJLJJI;
        if (frameLayout != null) {
            C16880lQ.LJIILJJIL(frameLayout, new ACListenerS47S0200000_13(udr.LJLJJLL, liveSubMediaModel, 10));
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        o.LJIIIZ(viewGroup, "viewGroup");
        UDR udr = new UDR(this, viewGroup);
        C0AX.LIZ(viewGroup, udr.itemView, R.id.lj7);
        View view = udr.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (udr.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(UDR.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) udr.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(udr.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = UDR.class.getName();
        return udr;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
        } else {
            UDR udr = (UDR) holder;
            udr.L((LiveSubMediaModel) ListProtector.get(this.LJLIL, i), udr, i);
        }
    }
}
