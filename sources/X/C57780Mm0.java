package X;

import Y.AObserverS77S0100000_9;
import Y.ARunnableS13S0101000_9;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AdapterLoadingCell;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS108S0101000_9;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mm0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57780Mm0 extends AbstractC57781Mm1 implements InterfaceC57932MoS {
    public final InterfaceC57782Mm2 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C5H3 LJLJI;
    public C57939MoZ LJLJJI;
    public OSZ<C35583Dxr, Class<AdapterLoadingCell>> LJLJJL;
    public int LJLJJLL;
    public final java.util.Map<Integer, Class<? extends PowerCell<?>>> LJLJL;
    public final java.util.Map<Type, Integer> LJLJLJ;
    public final List<InterfaceC57784Mm4> LJLJLLL;
    public InterfaceC65784Pro<C76800UCe> LJLL;
    public boolean LJLLI;
    public String LJLLILLLL;
    public final C72808Sho<InterfaceC57784Mm4> LJLLJ;

    @Override // X.InterfaceC25773A9p
    public final void K8(InterfaceC57910Mo6 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.K8(listener);
    }

    @Override // X.InterfaceC25773A9p
    public final void LJJIJ(String str, String str2, List list) {
        this.LJLIL.LJJIJ(str, str2, list);
    }

    @Override // X.InterfaceC25773A9p
    public final void LJJLIL(InterfaceC57917MoD interfaceC57917MoD) {
        this.LJLIL.LJJLIL(interfaceC57917MoD);
    }

    @Override // X.InterfaceC25773A9p
    public final void LJLJLJ(boolean z) {
        this.LJLIL.LJLJLJ(z);
    }

    @Override // X.InterfaceC25773A9p
    public final void W7(InterfaceC57910Mo6 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.W7(listener);
    }

    @Override // X.InterfaceC25773A9p
    public final C57778Mly getCurrentState() {
        return this.LJLIL.getCurrentState();
    }

    @Override // X.InterfaceC25773A9p
    public final AbstractC030109x getItemAnimator() {
        return this.LJLIL.getItemAnimator();
    }

    @Override // X.InterfaceC25773A9p
    public final void o1() {
        this.LJLIL.o1();
    }

    @Override // X.InterfaceC25773A9p
    public final void reset() {
        this.LJLIL.reset();
    }

    @Override // X.InterfaceC57932MoS
    public final C57859MnH getConfig() {
        return this.LJLIL.getConfig();
    }

    @Override // X.InterfaceC57932MoS
    public final String LJJIFFI() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC57932MoS
    public final C72808Sho<InterfaceC57784Mm4> LJJJI() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC57932MoS
    public final boolean LJJJJZ() {
        return this.LJLLI;
    }

    public C57780Mm0(C57935MoV c57935MoV) {
        super(new C57783Mm3());
        this.LJLIL = c57935MoV;
        this.LJLILLLLZI = C221108m2.LIZIZ(C165076dr.LJLIL);
        this.LJLJI = C27484AqW.LJIIIIZZ(C35890E6s.INSTANCE);
        this.LJLJJLL = 996;
        this.LJLJL = new LinkedHashMap();
        this.LJLJLJ = new LinkedHashMap();
        this.LJLJLLL = new ArrayList();
        this.LJLLJ = new C72808Sho<>();
    }

    @Override // X.InterfaceC25773A9p
    public final void LJIILL(AbstractC57774Mlu<RecUser> abstractC57774Mlu) {
        this.LJLIL.LJJJIL(this);
        this.LJLIL.LJIILL(abstractC57774Mlu);
        C57939MoZ LJLJJLL = this.LJLIL.LJLJJLL();
        this.LJLJJI = LJLJJLL;
        if (LJLJJLL != null) {
            if (LJLJJLL.LIZJ != null) {
                this.LJLJJL = new OSZ<>(new C35583Dxr(), AdapterLoadingCell.class);
                this.LJLJL.put(-2000, AdapterLoadingCell.class);
                return;
            }
            return;
        }
        o.LJIJI("listConfig");
        throw null;
    }

    @Override // X.InterfaceC57932MoS
    public final void LJJJJZI(String str) {
        this.LJLLILLLL = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC57932MoS
    public final void LJJLIIIIJ(Class<? extends PowerCell<?>>... clazzList) {
        o.LJIIIZ(clazzList, "clazzList");
        for (Class<? extends PowerCell<?>> cls : clazzList) {
            Type genericSuperclass = cls.getGenericSuperclass();
            o.LJII(genericSuperclass, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
            Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            o.LJIIIIZZ(actualTypeArguments, "parameterizedType.actualTypeArguments");
            Object LJJIL = ORY.LJJIL(actualTypeArguments);
            if (LJJIL != null && ((LinkedHashMap) this.LJLJLJ).get(LJJIL) == null) {
                int i = this.LJLJJLL;
                this.LJLJJLL = i + 1;
                this.LJLJLJ.put(LJJIL, Integer.valueOf(i));
                this.LJLJL.put(Integer.valueOf(i), cls);
            }
        }
    }

    @Override // X.InterfaceC57932MoS
    public final void LJJLIIIJLJLI(AqS156S0200000_9 aqS156S0200000_9) {
        this.LJLL = aqS156S0200000_9;
    }

    @Override // X.AbstractC57781Mm1
    public final boolean LJLLLLLL(int i) {
        try {
            return getItem(i) instanceof C35583Dxr;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.AbstractC57781Mm1
    public final boolean LJLZ(int i) {
        if (i < 0 || i >= getItemCount()) {
            return false;
        }
        return getItem(i) instanceof C57842Mn0;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        InterfaceC57784Mm4 item = getItem(i);
        if (item instanceof SIU) {
            return ((SIU) item).LJLILLLLZI;
        }
        if (item instanceof C35583Dxr) {
            return ((C35583Dxr) item).LJLIL;
        }
        Class<?> cls = item.getClass();
        Integer num = (Integer) ((LinkedHashMap) this.LJLJLJ).get(cls);
        if (num != null) {
            return num.intValue();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("not registerCells for: ");
        LIZ.append(cls.getName());
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalStateException(LIZIZ);
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLIL.LJIJJLI(recyclerView);
        this.LJLLI = true;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        this.LJLLJ.LIZ.observe(this.LJLIL.getLifecycleOwner(), new AObserverS77S0100000_9(this, 90));
    }

    @Override // X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.LJLLJ.LIZ.removeObservers(this.LJLIL.getLifecycleOwner());
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        PowerCell holder = (PowerCell) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        holder.onViewAttachedToWindow();
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        PowerCell holder = (PowerCell) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        holder.onViewDetachedFromWindow();
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        PowerCell holder = (PowerCell) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.onViewRecycled(holder);
        holder.unBind();
    }

    @Override // X.AbstractC28801Bc
    public final void submitList(List<InterfaceC57784Mm4> list) {
        List arrayList;
        C223208pQ LIZ;
        C35583Dxr first;
        C223208pQ LIZ2;
        if (list != null) {
            arrayList = ORZ.LLJILJILJ(list);
        } else {
            arrayList = new ArrayList();
        }
        if (!arrayList.isEmpty()) {
            C57778Mly currentState = getCurrentState();
            AbstractC72932td<C223208pQ> abstractC72932td = currentState.LIZIZ;
            if (!(abstractC72932td instanceof C33X) ? !((LIZ = abstractC72932td.LIZ()) == null || !LIZ.LJLILLLLZI) : !((LIZ2 = currentState.LIZ.LIZ()) == null || !LIZ2.LJLILLLLZI)) {
                OSZ<C35583Dxr, Class<AdapterLoadingCell>> osz = this.LJLJJL;
                if (osz != null && (first = osz.getFirst()) != null) {
                    arrayList.add(first);
                }
            }
        }
        super.submitList(arrayList);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        PowerCell holder = (PowerCell) viewHolder;
        o.LJIIIZ(holder, "holder");
        InterfaceC57784Mm4 item = getItem(i);
        o.LJIIIIZZ(item, "item");
        holder.onBindItemView(item);
        ((Handler) this.LJLJI.getValue()).removeCallbacksAndMessages(null);
        ((Handler) this.LJLJI.getValue()).postDelayed(new ARunnableS13S0101000_9(i, this, 7), 100L);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        View onCreateItemView;
        o.LJIIIZ(parent, "parent");
        Class cls = (Class) ((LinkedHashMap) this.LJLJL).get(Integer.valueOf(i));
        if (cls != null) {
            PowerCell powerCell = (PowerCell) cls.newInstance();
            powerCell.setParent(this.LJLIL.getLifecycleOwner());
            int layoutId = powerCell.getLayoutId();
            if (layoutId > 0) {
                Context context = parent.getContext();
                o.LJIIIIZZ(context, "parent.context");
                C16970lZ.LIZ(layoutId, context);
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (!L0A.LIZIZ() || !L9F.LIZIZ()) {
                        onCreateItemView = C16970lZ.LIZLLL(activity, layoutId);
                        o.LJIIIIZZ(onCreateItemView, "inflate(context, layoutId)");
                    } else {
                        onCreateItemView = L9F.LIZJ(activity, layoutId, new AqS108S0101000_9(activity, layoutId, 3));
                    }
                    C16970lZ.LJ(layoutId, context);
                } else {
                    "context is not an Activity??".toString();
                    throw new IllegalStateException("context is not an Activity??");
                }
            } else {
                onCreateItemView = powerCell.onCreateItemView(parent);
            }
            Field field = (Field) this.LJLILLLLZI.getValue();
            if (field != null) {
                field.set(powerCell, onCreateItemView);
            }
            powerCell.onItemViewCreated();
            C0AX.LIZ(parent, powerCell.itemView, R.id.lj7);
            View view = powerCell.itemView;
            if (view != null) {
                view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
            }
            try {
                if (powerCell.itemView.getParent() != null) {
                    boolean z = true;
                    try {
                        SettingsManager.LIZLLL().getClass();
                        z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(powerCell.getClass().getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(parent.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C78983UzD.LJIILL(stringBuffer.toString());
                        ViewGroup viewGroup = (ViewGroup) powerCell.itemView.getParent();
                        if (viewGroup != null) {
                            C16880lQ.LJLLL(powerCell.itemView, viewGroup);
                        }
                    }
                }
            } catch (Exception e) {
                C78946Uyc.LIZIZ(e);
                C36922EeM.LIZ(e);
            }
            C29127Bbv.LIZ = powerCell.getClass().getName();
            return powerCell;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("not registerCells viewType: ");
        LIZ.append(i);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalStateException(LIZIZ);
    }
}
