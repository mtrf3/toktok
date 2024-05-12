package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class SLJ extends AbstractC029409q<SKV> {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final Context LJLIL;
    public final ArrayList<SKZ> LJLILLLLZI;
    public final SparseArray<InterfaceC71908SKa> LJLJI;
    public ArrayList<SKZ> LJLJJI;
    public SLJ LJLJJL;
    public SLJ LJLJJLL;
    public final HashMap<Class<? extends SKZ>, Integer> LJLJL;
    public int LJLJLJ;

    public boolean LL() {
        return true;
    }

    public final OSZ<List<SKZ>, List<SKZ>> LLFII() {
        List LLJI = ORZ.LLJI(this.LJLJJI);
        this.LJLJJI = new ArrayList<>();
        if (LL()) {
            Iterator<SKZ> it = this.LJLILLLLZI.iterator();
            while (it.hasNext()) {
                SKZ next = it.next();
                if (next.LJI()) {
                    this.LJLJJI.add(next);
                }
            }
        }
        return new OSZ<>(LLJI, ORZ.LLJI(this.LJLJJI));
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        LLFII();
        return this.LJLJJI.size();
    }

    public SLJ(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = new ArrayList<>();
        this.LJLJI = new SparseArray<>();
        this.LJLJJI = new ArrayList<>();
        this.LJLJL = new HashMap<>();
    }

    public static void LLD(SLJ slj) {
        OSZ<List<SKZ>, List<SKZ>> LLFII = slj.LLFII();
        List<SKZ> first = LLFII.getFirst();
        List<SKZ> second = LLFII.getSecond();
        slj.LJLZ(C03200Aq.LIZ(new SLN(first, second, slj, null), true), first, second, null, true);
    }

    public final void LJLLLLLL(SKZ item) {
        o.LJIIIZ(item, "item");
        this.LJLILLLLZI.add(item);
        if (this.LJLJI.get(LJZL(item)) == null) {
            this.LJLJI.put(LJZL(item), item.LJ());
        }
        if (item.LJI()) {
            this.LJLJJI.add(item);
        }
    }

    public final OSZ<SLJ, SKZ> LJZ(int i) {
        if (i >= C47261Igj.LJJI(this.LJLJJI)) {
            SLJ slj = this.LJLJJLL;
            Object obj = null;
            while (slj != null) {
                obj = ORZ.LJLLLL(slj.LJLJJI);
                if (obj != null) {
                    break;
                }
                slj = slj.LJLJJLL;
            }
            return new OSZ<>(slj, obj);
        }
        return new OSZ<>(this, ORZ.LJLLLLLL(i + 1, this.LJLJJI));
    }

    public final OSZ<SLJ, SKZ> LJZI(int i) {
        if (i <= 0) {
            SLJ slj = this.LJLJJL;
            Object obj = null;
            while (slj != null) {
                obj = ORZ.LLFII(slj.LJLJJI);
                if (obj != null) {
                    break;
                }
                slj = slj.LJLJJL;
            }
            return new OSZ<>(slj, obj);
        }
        return new OSZ<>(this, ORZ.LJLLLLLL(i - 1, this.LJLJJI));
    }

    public final int LJZL(SKZ skz) {
        Class<? extends SKZ> LJFF = skz.LJFF();
        if (!this.LJLJL.containsKey(LJFF)) {
            this.LJLJL.put(LJFF, Integer.valueOf(this.LJLJLJ));
            this.LJLJLJ++;
        }
        Integer num = this.LJLJL.get(LJFF);
        o.LJI(num);
        return num.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    /* renamed from: LLFFF, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(SKV holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (holder instanceof SLQ) {
            ((SLQ) holder).onViewAttachedToWindow();
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LJLJJI, i);
        o.LJIIIIZZ(obj, "_visibleItemList[position]");
        return LJZL((SKZ) obj);
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(SKV skv) {
        SKV holder = skv;
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if (holder instanceof SLQ) {
            ((SLQ) holder).onViewDetachedFromWindow();
        }
    }

    public final void LLF(SKZ item, Object obj) {
        o.LJIIIZ(item, "item");
        OSZ<List<SKZ>, List<SKZ>> LLFII = LLFII();
        List<SKZ> first = LLFII.getFirst();
        List<SKZ> second = LLFII.getSecond();
        LJLZ(C03200Aq.LIZ(new SLM(first, second, this, item, obj), true), first, second, obj, false);
    }

    @Override // X.AbstractC029409q
    /* renamed from: LLFF, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(SKV holder, int i) {
        SLP slp;
        o.LJIIIZ(holder, "holder");
        ((SKZ) ListProtector.get(this.LJLJJI, i)).LIZLLL(holder);
        Object obj = ListProtector.get(this.LJLJJI, i);
        if ((obj instanceof SLP) && (slp = (SLP) obj) != null) {
            slp.LIZ(LJZI(i).getSecond(), LJZ(i).getSecond(), holder, i);
        }
    }

    @Override // X.AbstractC029409q
    public final SKV onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        SKV LIZ = this.LJLJI.get(i).LIZ(this.LJLIL, parent);
        C0AX.LIZ(parent, LIZ.itemView, R.id.lj7);
        View view = LIZ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (LIZ.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(SKV.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) LIZ.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(LIZ.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = SKV.class.getName();
        return LIZ;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(SKV skv, int i, List payloads) {
        SLP slp;
        SKV holder = skv;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i);
            return;
        }
        SKZ skz = (SKZ) ListProtector.get(this.LJLJJI, i);
        skz.getClass();
        skz.LIZLLL(holder);
        Object obj = ListProtector.get(this.LJLJJI, i);
        if (!(obj instanceof SLP) || (slp = (SLP) obj) == null) {
            return;
        }
        slp.LIZIZ(LJZI(i).getSecond(), LJZ(i).getSecond(), holder, i);
    }

    public final void LJLZ(C03150Al c03150Al, List<? extends SKZ> list, List<? extends SKZ> list2, Object obj, boolean z) {
        Object obj2;
        ArrayList arrayList = new ArrayList();
        c03150Al.LIZIZ(new SLK(this, c03150Al, arrayList, list, list2));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            SLJ slj = (SLJ) osz.getFirst();
            SKZ skz = (SKZ) osz.getSecond();
            if (o.LJ(slj, this)) {
                if (!z) {
                    int indexOf = this.LJLJJI.indexOf(skz);
                    if (indexOf != -1) {
                        notifyItemRangeChanged(indexOf, 1);
                    }
                }
            } else if (!z) {
                obj2 = null;
                slj.LLF(skz, obj2);
            }
            obj2 = obj;
            slj.LLF(skz, obj2);
        }
    }
}
