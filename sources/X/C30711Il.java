package X;

import Y.IDCListenerS83S0200000;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdk.dataChannel.BeforeStickerSelectedEvent;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Il, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30711Il extends AbstractC029409q<C30671Ih> {
    public String LJLIL;
    public WeakReference<DataChannel> LJLILLLLZI;
    public C0WF LJLJI;
    public LiveEffect LJLJJI;
    public LiveEffect LJLJJL;
    public final List<LiveEffect> LJLJJLL = new ArrayList();

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJJLL).size();
    }

    public C30711Il(String str) {
        this.LJLIL = str;
    }

    public final void LJLLLLLL(LiveEffect liveEffect) {
        WeakReference<DataChannel> weakReference;
        DataChannel dataChannel;
        if (!o.LJ(this.LJLIL, C0TY.LIZJ) && (weakReference = this.LJLILLLLZI) != null && (dataChannel = weakReference.get()) != null) {
            dataChannel.qv0(BeforeStickerSelectedEvent.class, new C19680pw(liveEffect, this.LJLIL, "", C29306Beo.LJIILJJIL()));
        }
    }

    public final void LJLZ(LiveEffect liveEffect) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        if (o.LJ(this.LJLIL, C0TY.LIZJ)) {
            C32031Nn c32031Nn = C32031Nn.LIZ;
            WeakReference<DataChannel> weakReference = this.LJLILLLLZI;
            if (weakReference != null) {
                dataChannel2 = weakReference.get();
            } else {
                dataChannel2 = null;
            }
            c32031Nn.LIZ(liveEffect, dataChannel2, 0, false);
            return;
        }
        WeakReference<DataChannel> weakReference2 = this.LJLILLLLZI;
        if (weakReference2 == null || (dataChannel = weakReference2.get()) == null) {
            return;
        }
        dataChannel.qv0(StickerSelectedEvent.class, new C19680pw(liveEffect, this.LJLIL, "", C29306Beo.LJIILJJIL()));
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C30671Ih c30671Ih, int i) {
        List<String> list;
        C30671Ih holder = c30671Ih;
        o.LJIIIZ(holder, "holder");
        LiveEffect liveEffect = (LiveEffect) ListProtector.get(this.LJLJJLL, i);
        BQO LIZ = C15650jR.LIZ();
        UrlModel urlModel = liveEffect.icon;
        if (urlModel != null) {
            list = urlModel.urlList;
        } else {
            list = null;
        }
        LIZ.LIZ(list).LJIIJJI(holder.LJLIL);
        if (o.LJ(this.LJLJJI, liveEffect)) {
            C29306Beo.LJJLJLI(holder.LJLILLLLZI);
        } else {
            C29306Beo.LJI(holder.LJLILLLLZI);
        }
        C16880lQ.LJIIJ(new IDCListenerS83S0200000(liveEffect, this, 5), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C30671Ih com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C30671Ih c30671Ih = new C30671Ih(C1FL.LIZIZ(parent, R.layout.cua, parent, false, "from(parent.context).inf…em_layout, parent, false)"));
        C0AX.LIZ(parent, c30671Ih.itemView, R.id.lj7);
        View view = c30671Ih.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c30671Ih.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C30671Ih.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c30671Ih.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c30671Ih.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C30671Ih.class.getName();
        return c30671Ih;
    }
}
