package X;

import Y.ACListenerS40S0200000_5;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftBottomWidget;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CqK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32568CqK extends AbstractC029409q<C32566CqI> {
    public List<C32570CqM> LJLIL = C61878OQg.INSTANCE;
    public C32136CjM LJLILLLLZI;
    public LiveNewGiftBottomWidget LJLJI;
    public View LJLJJI;
    public int LJLJJL;
    public DataChannel LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public final void LJLLLLLL(int i) {
        MutableLiveData<Integer> mutableLiveData;
        C32136CjM c32136CjM = this.LJLILLLLZI;
        if (c32136CjM != null && (mutableLiveData = c32136CjM.LIZIZ) != null) {
            mutableLiveData.setValue(Integer.valueOf(i));
        }
        this.LJLJJL = i;
        if (i == 5) {
            LiveNewGiftBottomWidget liveNewGiftBottomWidget = this.LJLJI;
            if (liveNewGiftBottomWidget != null) {
                liveNewGiftBottomWidget.LJZL(false);
            }
        } else {
            LiveNewGiftBottomWidget liveNewGiftBottomWidget2 = this.LJLJI;
            if (liveNewGiftBottomWidget2 != null) {
                liveNewGiftBottomWidget2.LJZL(true);
            }
        }
        for (C32570CqM c32570CqM : this.LJLIL) {
            if (c32570CqM.LIZJ == i) {
                c32570CqM.LJ = false;
                notifyItemChanged(this.LJLIL.indexOf(c32570CqM));
                String str = c32570CqM.LIZ;
                if (str != null) {
                    C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
                    Integer valueOf = Integer.valueOf(i);
                    c32785Ctp.getClass();
                    C32785Ctp.LJJ(valueOf, str);
                    return;
                }
                return;
            }
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return ((C32570CqM) ListProtector.get(this.LJLIL, i)).LIZJ;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C32566CqI c32566CqI, int i) {
        C32566CqI viewHolder = c32566CqI;
        o.LJIIIZ(viewHolder, "viewHolder");
        viewHolder.L((C32570CqM) ListProtector.get(this.LJLIL, i));
        C32570CqM c32570CqM = (C32570CqM) ListProtector.get(this.LJLIL, i);
        C47121t6 c47121t6 = viewHolder.LJLILLLLZI;
        o.LJII(c47121t6, "null cannot be cast to non-null type com.bytedance.android.live.design.widget.LiveTextView");
        C16880lQ.LJJIIZ(c47121t6, new ACListenerS40S0200000_5(c32570CqM, this, 78));
        Object tag = viewHolder.LJLILLLLZI.getTag();
        o.LJII(tag, "null cannot be cast to non-null type kotlin.Int");
        if (((Integer) tag).intValue() == this.LJLJJL) {
            C47121t6 c47121t62 = viewHolder.LJLILLLLZI;
            this.LJLJJI = c47121t62;
            c47121t62.setTextColor(ColorProtector.parseColor("#E6FFFFFF"));
            return;
        }
        viewHolder.LJLILLLLZI.setTextColor(ColorProtector.parseColor("#88FFFFFF"));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C32566CqI com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        o.LJIIIZ(viewGroup, "viewGroup");
        C32566CqI c32566CqI = new C32566CqI(C1FL.LIZIZ(viewGroup, R.layout.d7n, viewGroup, false, "from(viewGroup.context).…oup, false,\n            )"));
        c32566CqI.LJLILLLLZI.setTextSize(13.0f);
        c32566CqI.LJLILLLLZI.setGravity(17);
        c32566CqI.LJLILLLLZI.setTag(Integer.valueOf(i));
        C0AX.LIZ(viewGroup, c32566CqI.itemView, R.id.lj7);
        View view = c32566CqI.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c32566CqI.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C32566CqI.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c32566CqI.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c32566CqI.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C32566CqI.class.getName();
        return c32566CqI;
    }
}
