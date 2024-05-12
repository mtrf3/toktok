package X;

import Y.ARunnableS3S0001000_8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JRp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49173JRp extends JLX {
    public final Context LJLJJI;
    public JRT LJLJJL;
    public final HashMap<String, Integer> LJLJJLL;
    public final HashMap<Long, C49181JRx> LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public final C49179JRv LJLLI;
    public int LJLLILLLL;
    public final C49176JRs LJLLJ;

    @Override // X.JLX, X.JGU
    public final void LJJJLZIJ() {
    }

    @Override // X.JLX, X.JGU
    public final void LJLLL(Aweme aweme) {
    }

    public final long LJZ() {
        C49180JRw c49180JRw;
        JRT jrt = this.LJLJJL;
        if (jrt != null && (c49180JRw = jrt.LIZJ) != null) {
            long sign = c49180JRw.LIZ.getSign() << 32;
            int i = this.LJLLILLLL;
            this.LJLLILLLL = i + 1;
            return sign + i;
        }
        return 0L;
    }

    public final JavaOnlyArray LJZI() {
        JRT jrt = this.LJLJJL;
        if (jrt != null) {
            return jrt.LIZLLL;
        }
        return null;
    }

    @Override // X.JLX, X.InterfaceC49115JPj
    public final void contextPause() {
        if (this.LJLIL.getLayoutManager() == null || this.LJLIL.getChildCount() <= 0) {
            return;
        }
        LJLZ(C49167JRj.LJLIL);
    }

    @Override // X.JLX, X.InterfaceC49115JPj
    public final void pauseAll() {
        if (this.LJLIL.getLayoutManager() == null || this.LJLIL.getChildCount() <= 0) {
            return;
        }
        LJLZ(C49168JRk.LJLIL);
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        JavaOnlyArray javaOnlyArray;
        JavaOnlyArray LJZI = LJZI();
        int i = 0;
        if (LJZI == null) {
            return 0;
        }
        int size = LJZI.size();
        JRT jrt = this.LJLJJL;
        if (jrt != null && (javaOnlyArray = jrt.LJ) != null) {
            i = javaOnlyArray.size();
        }
        return size - i;
    }

    public final void LJLZ(InterfaceC88472Yns<? super JSE, ? extends Object> interfaceC88472Yns) {
        JSE jse;
        List<Integer> list;
        JRT jrt = this.LJLJJL;
        if (jrt != null && (jse = jrt.LIZ) != null && (list = jse.LIZJ) != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                JSE LIZ = C49995Jjj.LIZ.LIZ(((Number) it.next()).intValue());
                if (LIZ != null) {
                    interfaceC88472Yns.invoke(LIZ);
                }
            }
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        Integer num;
        JavaOnlyArray LJZI = LJZI();
        if (LJZI == null || (num = this.LJLJJLL.get(LJZI.getString(i))) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (holder instanceof C49181JRx) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onViewAttachedToWindow pos:");
            C49181JRx c49181JRx = (C49181JRx) holder;
            LIZ.append(c49181JRx.getLayoutPosition());
            C15280iq.LIZIZ("LynxSearchList", X1D.LIZIZ(LIZ));
            C49176JRs c49176JRs = this.LJLLJ;
            if (c49176JRs != null) {
                c49176JRs.LIZ(new C49174JRq(c49181JRx, "nodeappear"));
            }
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if (holder instanceof C49181JRx) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onViewDetachedFromWindow pos:");
            C49181JRx c49181JRx = (C49181JRx) holder;
            LIZ.append(c49181JRx.getLayoutPosition());
            C15280iq.LIZIZ("LynxSearchList", X1D.LIZIZ(LIZ));
            C49176JRs c49176JRs = this.LJLLJ;
            if (c49176JRs != null) {
                c49176JRs.LIZ(new C49174JRq(c49181JRx, "nodedisappear"));
            }
        }
    }

    public final boolean LJZL(C49181JRx holder, int i) {
        C49180JRw c49180JRw;
        UIComponent uIComponent;
        o.LJIIIZ(holder, "holder");
        JRT jrt = this.LJLJJL;
        if (jrt == null || (c49180JRw = jrt.LIZJ) == null) {
            return false;
        }
        long LJZ = LJZ();
        if (holder.L() == null) {
            this.LJLJL.put(Long.valueOf(LJZ), holder);
            C79655VNz c79655VNz = c49180JRw.LIZIZ;
            int sign = c49180JRw.LIZ.getSign();
            TemplateAssembler templateAssembler = (TemplateAssembler) c79655VNz.LIZ;
            if (templateAssembler != null) {
                templateAssembler.LJJI(sign, i, LJZ);
            }
            LynxUI lynxUI = (LynxUI) c49180JRw.LIZJ;
            c49180JRw.LIZJ = null;
            if (!(lynxUI instanceof UIComponent) || (uIComponent = (UIComponent) lynxUI) == null) {
                return false;
            }
            this.LJLJLLL--;
            holder.LJLIL.setUIComponent(uIComponent);
            holder.LJLIL.addView(uIComponent.mView, new FrameLayout.LayoutParams(-1, -2));
            holder.LJLIL.setAdapterPosition(holder.getLayoutPosition());
            C49176JRs c49176JRs = this.LJLLJ;
            if (c49176JRs != null) {
                Iterator<C49174JRq> it = c49176JRs.LIZLLL.iterator();
                while (it.hasNext()) {
                    C49174JRq next = it.next();
                    if (next.LIZ == holder) {
                        next.LIZLLL = holder.L().LJLIL;
                    }
                }
                Iterator<C49174JRq> it2 = c49176JRs.LJ.iterator();
                while (it2.hasNext()) {
                    C49174JRq next2 = it2.next();
                    if (next2.LIZ == holder) {
                        next2.LIZLLL = holder.L().LJLIL;
                    }
                }
            }
        } else {
            this.LJLJL.put(Long.valueOf(LJZ), holder);
            holder.LJLIL.setLayoutStatus(1);
            UIComponent L = holder.L();
            o.LJII(L, "null cannot be cast to non-null type com.lynx.tasm.behavior.ui.view.UIComponent");
            C79655VNz c79655VNz2 = c49180JRw.LIZIZ;
            int sign2 = c49180JRw.LIZ.getSign();
            int sign3 = L.getSign();
            TemplateAssembler templateAssembler2 = (TemplateAssembler) c79655VNz2.LIZ;
            if (templateAssembler2 != null) {
                templateAssembler2.LJJIZ(sign2, sign3, i, LJZ);
            }
        }
        return true;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        o.LJIIIZ(viewHolder, "viewHolder");
        long currentTimeMillis = System.currentTimeMillis();
        if (viewHolder instanceof C49181JRx) {
            JVW.LIZIZ(i);
            viewHolder.itemView.post(new ARunnableS3S0001000_8(i, 4));
            LJZL((C49181JRx) viewHolder, i);
            JVW.LIZJ(i);
        }
        C15280iq.LJ("LynxSearchList", C00F.LIZJ("onBindViewHolder pos:", i, " duration:", System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C15280iq.LJ("LynxSearchList", "onCreateViewHolder");
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        C49182JRy c49182JRy = new C49182JRy(this.LJLJJI);
        c49182JRy.setLayoutParams(layoutParams);
        C49181JRx c49181JRx = new C49181JRx(c49182JRy);
        C0AX.LIZ(parent, c49181JRx.itemView, R.id.lj7);
        View view = c49181JRx.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c49181JRx.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C49181JRx.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c49181JRx.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c49181JRx.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C49181JRx.class.getName();
        return c49181JRx;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<? extends Object> payload) {
        JRT jrt;
        C49180JRw c49180JRw;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payload, "payload");
        long currentTimeMillis = System.currentTimeMillis();
        if ((holder instanceof C49181JRx) && (jrt = this.LJLJJL) != null && (c49180JRw = jrt.LIZJ) != null) {
            if (payload.isEmpty()) {
                onBindViewHolder(holder, i);
            } else {
                C49181JRx c49181JRx = (C49181JRx) holder;
                UIComponent L = c49181JRx.L();
                if (L == null) {
                    return;
                }
                long LJZ = LJZ();
                Object obj = ListProtector.get(payload, payload.size() - 1);
                o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj).intValue();
                this.LJLJL.put(Long.valueOf(LJZ), holder);
                c49181JRx.LJLIL.setLayoutStatus(1);
                C79655VNz c79655VNz = c49180JRw.LIZIZ;
                int sign = c49180JRw.LIZ.getSign();
                int sign2 = L.getSign();
                TemplateAssembler templateAssembler = (TemplateAssembler) c79655VNz.LIZ;
                if (templateAssembler != null) {
                    templateAssembler.LJJIZ(sign, sign2, intValue, LJZ);
                }
            }
        }
        C15280iq.LIZIZ("LynxSearchList", C00F.LIZJ("onBindViewHolder payload pos:", i, " cost:", System.currentTimeMillis() - currentTimeMillis));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49173JRp(Context context, VNL vnl, JIB mContainerStatusProvider, C49153JQv mScrollStateManager, RecyclerView mRecyclerView, JRT jrt) {
        super(mRecyclerView);
        o.LJIIIZ(mContainerStatusProvider, "mContainerStatusProvider");
        o.LJIIIZ(mScrollStateManager, "mScrollStateManager");
        o.LJIIIZ(mRecyclerView, "mRecyclerView");
        this.LJLJJI = context;
        this.LJLJJL = jrt;
        this.LJLJJLL = new HashMap<>();
        this.LJLJL = new HashMap<>();
        this.LJLLI = new C49179JRv(this);
        if (vnl != null) {
            this.LJLLJ = new C49176JRs(vnl);
        }
        mRecyclerView.addOnAttachStateChangeListener(new JI1(mScrollStateManager, mContainerStatusProvider, this, mRecyclerView));
    }
}
