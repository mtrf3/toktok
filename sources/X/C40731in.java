package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.1in, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40731in extends C1KD<C1EY, LiveEffect> {
    public final DataChannel LJLILLLLZI;
    public final LifecycleOwner LJLJI;
    public final KaraokeViewModel LJLJJI;
    public LiveEffect LJLJJL;

    public static void LLIL(C1EY holder, LiveEffect effect) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        C29306Beo.LJJLJLI(holder.LJLJI);
        TextView textView = holder.LJLILLLLZI;
        if (textView != null) {
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        }
        TextView textView2 = holder.LJLILLLLZI;
        if (textView2 == null) {
            return;
        }
        textView2.setSelected(true);
    }

    public static void LLILII(C1EY holder, LiveEffect effect) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        C29306Beo.LJIIIZ(holder.LJLJI);
        TextView textView = holder.LJLILLLLZI;
        if (textView != null) {
            textView.setEllipsize(null);
        }
        TextView textView2 = holder.LJLILLLLZI;
        if (textView2 == null) {
            return;
        }
        textView2.setSelected(false);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C1EY c1ey = new C1EY(parent);
        C0AX.LIZ(parent, c1ey.itemView, R.id.lj7);
        View view = c1ey.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c1ey.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1EY.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c1ey.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c1ey.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C1EY.class.getName();
        return c1ey;
    }

    public C40731in(DataChannel dataChannel, LifecycleOwner lifecycleOwner, KaraokeViewModel karaokeViewModel) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = karaokeViewModel;
    }

    @Override // X.C1KD
    public final /* bridge */ /* synthetic */ void LLIIJLIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLIL((C1EY) viewHolder, (LiveEffect) obj);
    }

    @Override // X.C1KD
    public final /* bridge */ /* synthetic */ void LLIILII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLILII((C1EY) viewHolder, (LiveEffect) obj);
    }

    @Override // X.C1KD
    public final void LLIIZ(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        ImageModel imageModel;
        C1EY holder = (C1EY) viewHolder;
        LiveEffect effect = (LiveEffect) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        C78720Uuy LIZJ = C15650jR.LIZ().LIZJ(Boolean.FALSE);
        LIZJ.LJIIIIZZ = R.drawable.d6t;
        UrlModel urlModel = effect.icon;
        if (urlModel != null) {
            imageModel = urlModel.L();
        } else {
            imageModel = null;
        }
        LIZJ.LJIIIZ(imageModel);
        LIZJ.LJIIJJI(holder.itemView.findViewById(R.id.f51));
        TextView textView = holder.LJLILLLLZI;
        if (textView != null) {
            textView.setText(effect.getName());
        }
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        C29306Beo.LJJJLL(view, 500L, new IDqS172S0200000(this, effect, 3));
        if (o.LJ(effect, this.LJLJJL)) {
            LLIL(holder, effect);
        } else {
            LLILII(holder, effect);
        }
    }
}
