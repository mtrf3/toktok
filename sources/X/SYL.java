package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.ies.powerlist.header.FixedViewCell;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class SYL extends RecyclerView implements View.OnAttachStateChangeListener {
    public PowerAdapter LLLF;

    public SYL() {
        throw null;
    }

    private PowerStub getPrimaryStub() {
        return this.LLLF.LLIIIJ();
    }

    public List<SIT> getAllChunks() {
        List<PowerStub> list = this.LLLF.LJLJI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((PowerStub) it.next()).LJLILLLLZI);
        }
        return arrayList;
    }

    public List<InterfaceC57784Mm4> getListItems() {
        return this.LLLF.LLFF;
    }

    public C72808Sho<InterfaceC57784Mm4> getState() {
        return this.LLLF.LJZ();
    }

    public final void LJLL() {
        PowerStub primaryStub = getPrimaryStub();
        CopyOnWriteArrayList<SIU> copyOnWriteArrayList = primaryStub.LJLLLL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(copyOnWriteArrayList, 10));
        Iterator<SIU> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LJLIL);
        }
        primaryStub.LJII(copyOnWriteArrayList, arrayList);
    }

    public final void LJLLI() {
        getPrimaryStub().LJFF();
    }

    public int getFooterCount() {
        return getPrimaryStub().LJLLLL.size();
    }

    public int getHeaderCount() {
        return getPrimaryStub().LJLLL.size();
    }

    public final void LJLJJL(SIT sit) {
        this.LLLF.LLD(sit);
    }

    public final void LJLJJLL(View view) {
        PowerStub primaryStub = getPrimaryStub();
        if (view == null) {
            primaryStub.getClass();
            return;
        }
        int i = primaryStub.LJLJLJ;
        primaryStub.LJLJLJ = i + 1;
        CopyOnWriteArrayList<SIU> copyOnWriteArrayList = primaryStub.LJLLLL;
        copyOnWriteArrayList.add(copyOnWriteArrayList.size(), new SIU(view, i));
        ((HashMap) primaryStub.LJLJLLL).put(Integer.valueOf(i), FixedViewCell.class);
        primaryStub.LIZJ();
    }

    public final void LJLJLJ(SYX syx) {
        ((CopyOnWriteArrayList) this.LLLF.LJLLLL.getValue()).add(syx);
    }

    public final void LJLJLLL(AbstractC72278SYg<?> abstractC72278SYg) {
        this.LLLF.LJZI(abstractC72278SYg, null, getState());
    }

    public final void LJLLILLLL(View view) {
        getPrimaryStub().LJI(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.LLLF.LJLLLLLL();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.LLLF.LJLZ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(AbstractC029409q abstractC029409q) {
        if (abstractC029409q instanceof PowerAdapter) {
            super.setAdapter(abstractC029409q);
            return;
        }
        throw new RuntimeException("Not Allow setAdapter in PowerList");
    }

    public void setLifecycleOwner(LifecycleOwner newLifecycleOwner) {
        Lifecycle lifecycle;
        PowerAdapter powerAdapter = this.LLLF;
        powerAdapter.getClass();
        o.LJIIIZ(newLifecycleOwner, "newLifecycleOwner");
        LifecycleOwner LLIIIILZ = powerAdapter.LLIIIILZ();
        powerAdapter.LLFZ = newLifecycleOwner;
        if (powerAdapter.LLI && !o.LJ(powerAdapter.LLIIIILZ(), LLIIIILZ)) {
            Lifecycle lifecycle2 = LLIIIILZ.getLifecycle();
            if (lifecycle2 != null) {
                lifecycle2.removeObserver(powerAdapter);
            }
            Lifecycle lifecycle3 = powerAdapter.LLIIIILZ().getLifecycle();
            if (lifecycle3 != null) {
                lifecycle3.addObserver(powerAdapter);
            }
            Iterator it = ((ArrayList) powerAdapter.LLIIJI()).iterator();
            while (it.hasNext()) {
                PowerStub powerStub = (PowerStub) it.next();
                LifecycleOwner LLIIIILZ2 = powerAdapter.LLIIIILZ();
                powerStub.getClass();
                LifecycleOwner lifecycleOwner = powerStub.LJLZ;
                if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                    lifecycle.removeObserver(powerStub);
                }
                LLIIIILZ2.getLifecycle().addObserver(powerStub);
            }
        }
    }

    public void setListConfig(C57939MoZ c57939MoZ) {
        this.LLLF.LL(c57939MoZ, SYU.Direct);
    }

    public void setOrientation(int i) {
        getContext();
        setLayoutManager(new LinearLayoutManager(i, false));
    }

    public void setViewTypeMap(java.util.Map<Class<? extends PowerCell<?>>, Object> map) {
        PowerAdapter powerAdapter = this.LLLF;
        powerAdapter.getClass();
        if (map != null) {
            for (Map.Entry<Class<? extends PowerCell<?>>, Object> entry : map.entrySet()) {
                Class<? extends PowerCell<?>> key = entry.getKey();
                o.LJII(key, "null cannot be cast to non-null type java.lang.Class<out com.bytedance.ies.powerlist.PowerCell<*>>");
                ((java.util.Map) powerAdapter.LJLLL.getValue()).put(key, entry.getValue());
            }
        }
    }

    public SYL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LJLJL(int i, View view) {
        getPrimaryStub().LIZIZ(i, view);
    }

    public SYL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        PowerAdapter powerAdapter = new PowerAdapter(this);
        this.LLLF = powerAdapter;
        setAdapter(powerAdapter);
        getContext();
        setLayoutManager(new LinearLayoutManager());
        addOnAttachStateChangeListener(this);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
