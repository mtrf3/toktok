package X;

import Y.ACListenerS23S0201000_5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordRecommend;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BRd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28777BRd extends AbstractC029409q<C28780BRg> {
    public final InterfaceC28781BRh LJLIL;
    public List<BlockWordRecommend> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<BlockWordRecommend> list = this.LJLILLLLZI;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C28777BRd(C28776BRc onSelectChangeListener) {
        o.LJIIIZ(onSelectChangeListener, "onSelectChangeListener");
        this.LJLIL = onSelectChangeListener;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C28780BRg c28780BRg, int i) {
        BlockWordRecommend blockWordRecommend;
        int i2;
        float f;
        C28780BRg holder = c28780BRg;
        o.LJIIIZ(holder, "holder");
        List<BlockWordRecommend> list = this.LJLILLLLZI;
        if (list == null || (blockWordRecommend = (BlockWordRecommend) ListProtector.get(list, i)) == null) {
            return;
        }
        C47121t6 c47121t6 = holder.LJLJJI;
        if (c47121t6 != null) {
            c47121t6.setText(blockWordRecommend.content);
        }
        View view = holder.LJLIL;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0201000_5(i, this, blockWordRecommend, 5), view);
        }
        boolean z = blockWordRecommend.selected;
        View view2 = holder.LJLJI;
        int i3 = 8;
        if (view2 != null) {
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
        View view3 = holder.LJLILLLLZI;
        if (view3 != null) {
            if (z) {
                i3 = 0;
            }
            view3.setVisibility(i3);
        }
        C47121t6 c47121t62 = holder.LJLJJI;
        if (c47121t62 == null) {
            return;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        c47121t62.setAlpha(f);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C28780BRg com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.d7e, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C28780BRg c28780BRg = new C28780BRg(view);
        C0AX.LIZ(viewGroup, c28780BRg.itemView, R.id.lj7);
        View view2 = c28780BRg.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c28780BRg.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C28780BRg.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c28780BRg.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c28780BRg.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C28780BRg.class.getName();
        return c28780BRg;
    }
}
