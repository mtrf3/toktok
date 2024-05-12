package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T45 extends AbstractC029409q<RecyclerView.ViewHolder> implements T43 {
    public List<Effect> LJLIL = new ArrayList();
    public InterfaceC74343TFr LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public final TEF LJLJJLL;
    public final TEZ LJLJL;
    public final T4I<Effect> LJLJLJ;
    public final TKR LJLJLLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<Effect> list = this.LJLIL;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        DATA data;
        if (i < 0 || i >= getItemCount()) {
            data = 0;
        } else {
            data = ListProtector.get(this.LJLIL, i);
        }
        OSZ<TEA, Integer> oQ = this.LJLJLJ.oQ(data, false);
        C73365Sqn c73365Sqn = (C73365Sqn) viewHolder;
        TEA state = oQ.getFirst();
        Integer second = oQ.getSecond();
        c73365Sqn.getClass();
        o.LJIIIZ(state, "state");
        c73365Sqn.LJLIL = data;
        c73365Sqn.LJLILLLLZI = -1;
        c73365Sqn.L(i, data);
        c73365Sqn.M(data, state, second);
        if (this.LJLJLLL.LLIIIJ) {
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            layoutParams.width = (int) C74275TDb.LIZ(44.0f);
            layoutParams.height = (int) C74275TDb.LIZ(44.0f);
            viewHolder.itemView.setLayoutParams(layoutParams);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        OSZ LIZ;
        TKR tkr = this.LJLJLLL;
        if (tkr.LLIIIJ) {
            Context context = viewGroup.getContext();
            o.LJIIIZ(context, "context");
            LIZ = TKQ.LIZ(tkr, context, 44.0f, 44.0f, true, 48);
        } else {
            Context context2 = viewGroup.getContext();
            o.LJIIIZ(context2, "context");
            float f = -2;
            LIZ = TKO.LIZ(tkr, context2, false, 54.0f, 54.0f, f, f, f, 58.0f, null, 770);
        }
        C74250TCc c74250TCc = new C74250TCc((View) LIZ.getFirst(), (TDE) LIZ.getSecond(), this.LJLJL, this.LJLJJLL, this.LJLJLJ, this.LJLJI);
        c74250TCc.LJLJJL = this;
        C0AX.LIZ(viewGroup, c74250TCc.itemView, R.id.lj7);
        View view = c74250TCc.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c74250TCc.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C74250TCc.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c74250TCc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c74250TCc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C74250TCc.class.getName();
        return c74250TCc;
    }

    @Override // X.T43
    public final boolean LJJIJIIJIL(Effect effect, int i, int i2) {
        int i3 = this.LJLJJI;
        boolean z = false;
        if (i3 >= 0 && ID0.LJIJJ((Effect) ListProtector.get(this.LJLIL, i3))) {
            boolean z2 = !ID0.LJIJJ((Effect) ListProtector.get(this.LJLIL, i2));
            if (this.LJLJJL || !z2) {
                return false;
            }
            this.LJLJJL = true;
            return true;
        }
        if (this.LJLJJI == i2) {
            z = true;
        }
        if (!this.LJLJJL && z) {
            this.LJLJJL = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [DATA, java.lang.Object] */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        ?? LJLLLL = ORZ.LJLLLL(list);
        if (LJLLLL instanceof Effect) {
            OSZ<TEA, Integer> oQ = this.LJLJLJ.oQ(LJLLLL, false);
            C73365Sqn c73365Sqn = (C73365Sqn) viewHolder;
            TEA state = oQ.getFirst();
            Integer second = oQ.getSecond();
            c73365Sqn.getClass();
            o.LJIIIZ(state, "state");
            c73365Sqn.LJLIL = LJLLLL;
            c73365Sqn.M(LJLLLL, state, second);
            return;
        }
        super.onBindViewHolder(viewHolder, i, list);
    }

    public T45(TEZ tez, TEF tef, T46 t46, TKR tkr) {
        this.LJLJL = tez;
        this.LJLJLJ = t46;
        this.LJLJJLL = tef;
        this.LJLJLLL = tkr;
    }
}
