package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.preview.widget.livevoice.PreviewLiveVoiceMicListWidget;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.B9p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28321B9p extends AbstractC029409q<C28322B9q> {
    public final /* synthetic */ PreviewLiveVoiceMicListWidget LJLIL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLIL.LL()).size();
    }

    public C28321B9p(PreviewLiveVoiceMicListWidget previewLiveVoiceMicListWidget) {
        this.LJLIL = previewLiveVoiceMicListWidget;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C28322B9q c28322B9q, int i) {
        C28322B9q holder = c28322B9q;
        o.LJIIIZ(holder, "holder");
        PreviewLiveVoiceMicListWidget previewLiveVoiceMicListWidget = this.LJLIL;
        OSZ<Integer, Integer> size = previewLiveVoiceMicListWidget.LJLJJI;
        C28323B9r micData = (C28323B9r) ListProtector.get(previewLiveVoiceMicListWidget.LL(), i);
        o.LJIIIZ(size, "size");
        o.LJIIIZ(micData, "micData");
        FrameLayout frameLayout = holder.LJLILLLLZI;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = size.getSecond().intValue();
        frameLayout.setLayoutParams(layoutParams);
        int floatValue = (int) (size.getSecond().floatValue() * 0.7f);
        C47061t0 c47061t0 = holder.LJLIL;
        ViewGroup.LayoutParams layoutParams2 = c47061t0.getLayoutParams();
        layoutParams2.width = floatValue;
        layoutParams2.height = floatValue;
        c47061t0.setLayoutParams(layoutParams2);
        LiveIconView liveIconView = holder.LJLJI;
        ViewGroup.LayoutParams layoutParams3 = liveIconView.getLayoutParams();
        layoutParams3.width = floatValue;
        layoutParams3.height = floatValue;
        liveIconView.setLayoutParams(layoutParams3);
        if (micData.LIZ != null) {
            C87277YNd.LJJIJ(holder.LJLIL);
            C87277YNd.LJJIIZ(holder.LJLJI);
            C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(micData.LIZ);
            LJIIIZ.LJIIL = Boolean.TRUE;
            LJIIIZ.LJ = floatValue;
            LJIIIZ.LJFF = floatValue;
            LJIIIZ.LJIIJJI(holder.LJLIL);
            return;
        }
        C87277YNd.LJJIIZ(holder.LJLIL);
        C87277YNd.LJJIJ(holder.LJLJI);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C28322B9q com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.dnd, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…ic_avatar, parent, false)");
        C28322B9q c28322B9q = new C28322B9q(LLLLIILL);
        C0AX.LIZ(parent, c28322B9q.itemView, R.id.lj7);
        View view = c28322B9q.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c28322B9q.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C28322B9q.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c28322B9q.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c28322B9q.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C28322B9q.class.getName();
        return c28322B9q;
    }
}
