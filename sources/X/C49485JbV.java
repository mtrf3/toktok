package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.JbV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49485JbV extends C0A6 implements InterfaceC70422pa {
    public final OptimizeAbility LJLIL;
    public final RecyclerView LJLILLLLZI;
    public final ConcurrentHashMap<Integer, CopyOnWriteArrayList<RecyclerView.ViewHolder>> LJLJI;
    public final AtomicInteger LJLJJI;
    public final C84673XKz LJLJJL;
    public final MBA LJLJJLL;

    public final void LJIILLIIL() {
        PowerAdapter powerAdapter;
        AbstractC029409q adapter = this.LJLILLLLZI.getAdapter();
        if (!(adapter instanceof PowerAdapter) || (powerAdapter = (PowerAdapter) adapter) == null) {
            return;
        }
        XKX.LIZLLL(this, null, null, new C9Y6(powerAdapter, this, null), 3);
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLJJLL;
    }

    public final void LJIJ(SYL syl, int i) {
        int i2;
        RecyclerView.ViewHolder createViewHolder;
        AbstractC029409q adapter = syl.getAdapter();
        if (adapter == null) {
            return;
        }
        int itemViewType = adapter.getItemViewType(i);
        CopyOnWriteArrayList<RecyclerView.ViewHolder> copyOnWriteArrayList = this.LJLJI.get(Integer.valueOf(itemViewType));
        if (copyOnWriteArrayList != null) {
            i2 = copyOnWriteArrayList.size();
        } else {
            i2 = 0;
        }
        if (i2 >= this.LJLIL.preloadCount) {
            return;
        }
        if (syl.getRecycledViewPool().getRecycledViewCount(itemViewType) > 1) {
            createViewHolder = syl.getRecycledViewPool().getRecycledView(itemViewType);
            o.LJII(createViewHolder, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.ViewHolder");
            Class<?> cls = createViewHolder.getClass();
            while (!o.LJ(cls, RecyclerView.ViewHolder.class)) {
                cls = cls.getSuperclass();
                o.LJIIIIZZ(cls, "cls.superclass");
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            o.LJIIIIZZ(declaredMethods, "cls.declaredMethods");
            int length = declaredMethods.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                Method method = declaredMethods[i3];
                if (o.LJ(method.getName(), "resetInternal")) {
                    method.setAccessible(true);
                    Object[] objArr = new Object[0];
                    if (!new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{createViewHolder, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "1198135414359952463")).LIZ) {
                        method.invoke(createViewHolder, objArr);
                    }
                } else {
                    i3++;
                }
            }
        } else {
            createViewHolder = adapter.createViewHolder(syl, itemViewType);
        }
        LJIJI(createViewHolder, itemViewType);
    }

    public final void LJIJI(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        RecyclerView.LayoutParams LJJIL;
        synchronized (this.LJLJI) {
            CopyOnWriteArrayList<RecyclerView.ViewHolder> copyOnWriteArrayList = this.LJLJI.get(Integer.valueOf(i));
            if (copyOnWriteArrayList != null) {
                i2 = copyOnWriteArrayList.size();
            } else {
                i2 = 0;
            }
            if (i2 >= this.LJLIL.preloadCount) {
                return;
            }
            CopyOnWriteArrayList<RecyclerView.ViewHolder> copyOnWriteArrayList2 = this.LJLJI.get(Integer.valueOf(i));
            if (copyOnWriteArrayList2 == null) {
                copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                this.LJLJI.put(Integer.valueOf(i), copyOnWriteArrayList2);
            }
            copyOnWriteArrayList2.add(viewHolder);
            try {
                C0A2 layoutManager = this.LJLILLLLZI.getLayoutManager();
                if (layoutManager != null && (!(viewHolder.itemView.getLayoutParams() instanceof RecyclerView.LayoutParams)) && (LJJIL = layoutManager.LJJIL(viewHolder.itemView.getLayoutParams())) != null) {
                    viewHolder.itemView.setLayoutParams(LJJIL);
                }
                Reflect.on(viewHolder.itemView.getLayoutParams()).set("mViewHolder", viewHolder);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public C49485JbV(OptimizeAbility optimizeAbility, RecyclerView powerList, ConcurrentHashMap<Integer, CopyOnWriteArrayList<RecyclerView.ViewHolder>> preloadCache) {
        o.LJIIIZ(powerList, "powerList");
        o.LJIIIZ(preloadCache, "preloadCache");
        this.LJLIL = optimizeAbility;
        this.LJLILLLLZI = powerList;
        this.LJLJI = preloadCache;
        this.LJLJJI = new AtomicInteger(0);
        C84673XKz LJIILIIL = C79146V4k.LJIILIIL();
        this.LJLJJL = LJIILIIL;
        this.LJLJJLL = new XI8(C16880lQ.LLLLZLLLI(new ThreadFactoryC49486JbW(this))).plus(LJIILIIL);
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        XKX.LIZLLL(this, null, null, new C9Y5(recyclerView, this, null), 3);
    }

    public final void LJIIZILJ(SYL syl, int i, int i2) {
        int i3;
        int i4 = (i - this.LJLIL.preloadCount) - 1;
        if (i4 <= 0) {
            i4 = 0;
        }
        AbstractC029409q adapter = syl.getAdapter();
        if (adapter != null) {
            i3 = adapter.getItemCount();
        } else {
            i3 = -1;
        }
        int i5 = (this.LJLIL.preloadCount + i2) - 1;
        if (i3 > i5) {
            i3 = i5;
        }
        OSZ osz = new OSZ(Integer.valueOf(i4), Integer.valueOf(i - 1));
        OSZ osz2 = new OSZ(Integer.valueOf(i2 + 1), Integer.valueOf(i3));
        try {
            int intValue = ((Number) osz.getFirst()).intValue();
            int intValue2 = ((Number) osz.getSecond()).intValue();
            if (intValue <= intValue2) {
                while (true) {
                    LJIJ(syl, intValue);
                    if (intValue == intValue2) {
                        break;
                    } else {
                        intValue++;
                    }
                }
            }
            int intValue3 = ((Number) osz2.getFirst()).intValue();
            int intValue4 = ((Number) osz2.getSecond()).intValue();
            if (intValue3 > intValue4) {
                return;
            }
            while (true) {
                LJIJ(syl, intValue3);
                if (intValue3 != intValue4) {
                    intValue3++;
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
