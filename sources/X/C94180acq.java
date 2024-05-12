package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.acq, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94180acq extends AbstractC029409q<C94450ahC> {
    public final List<C94178aco> LJLIL = new ArrayList();
    public final InterfaceC88471Ynr<C94178aco, Integer, C76800UCe> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLIL).size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C94180acq(InterfaceC88471Ynr<? super C94178aco, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        this.LJLILLLLZI = interfaceC88471Ynr;
    }

    @Override // X.AbstractC029409q
    /* renamed from: LJLLLLLL, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C94450ahC holder, int i) {
        o.LJIIIZ(holder, "holder");
        C94178aco prefab = (C94178aco) ListProtector.get(this.LJLIL, i);
        o.LJIIIZ(prefab, "prefab");
        holder.LJLJLLL = prefab;
        holder.P(prefab);
        ImageLoaderService imageLoaderService = ImageLoaderService.INSTANCE;
        View itemView = holder.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        Context context = itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        String str = prefab.LJLILLLLZI;
        ImageView imageView = holder.LJLJJL;
        C94019aaF c94019aaF = new C94019aaF();
        c94019aaF.LIZIZ(ImageView.ScaleType.FIT_CENTER);
        c94019aaF.LIZ(R.drawable.dfx);
        imageLoaderService.loadBitmap(context, str, imageView, new C94020aaG(c94019aaF));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C94450ahC com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.dvp, parent, false);
        if (LLLLIILL != null) {
            FrameLayout frameLayout = (FrameLayout) LLLLIILL;
            View findViewById = frameLayout.findViewById(R.id.nnm);
            o.LJIIIIZZ(findViewById, "item.findViewById(R.id.iv_prefab_icon_container)");
            C94450ahC c94450ahC = new C94450ahC(frameLayout, (ViewGroup) findViewById, this.LJLILLLLZI);
            c94450ahC.itemView.setTag(R.id.lj7, Integer.valueOf(parent.hashCode()));
            View view = c94450ahC.itemView;
            if (view != null) {
                view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
            }
            try {
                if (c94450ahC.itemView.getParent() != null) {
                    boolean z = true;
                    try {
                        SettingsManager.LIZLLL().getClass();
                        z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(C94450ahC.class.getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(parent.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C78983UzD.LJIILL(stringBuffer.toString());
                        ViewGroup viewGroup = (ViewGroup) c94450ahC.itemView.getParent();
                        if (viewGroup != null) {
                            C16880lQ.LJLLL(c94450ahC.itemView, viewGroup);
                        }
                    }
                }
            } catch (Exception e) {
                C78946Uyc.LIZIZ(e);
                C36922EeM.LIZ(e);
            }
            C29127Bbv.LIZ = C94450ahC.class.getName();
            return c94450ahC;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C94450ahC c94450ahC, int i, List payloads) {
        C94450ahC holder = c94450ahC;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i);
        } else {
            holder.P((C94178aco) ListProtector.get(this.LJLIL, i));
        }
    }
}
