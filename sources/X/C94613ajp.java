package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS21S0101000_42;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.ajp, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94613ajp extends RecyclerView {
    public EnumC93620aTo LLLF;
    public ValueAnimator LLLFF;
    public InterfaceC93786aWU LLLFFI;
    public List<C94252ae0> LLLFZ;

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        o.LJIIIZ(changedView, "changedView");
    }

    public final InterfaceC93786aWU getActionListener() {
        return this.LLLFFI;
    }

    public final List<C94252ae0> getDatalist() {
        return this.LLLFZ;
    }

    public final void setActionListener(InterfaceC93786aWU interfaceC93786aWU) {
        this.LLLFFI = interfaceC93786aWU;
        AbstractC029409q adapter = getAdapter();
        if (adapter != null) {
            ((C94251adz) adapter).LJLIL = interfaceC93786aWU;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ugc.effectcreator.foundation.view.FunctionBarAdapter");
    }

    public final void setDataListExt(List<C94253ae1> itemList) {
        o.LJIIIZ(itemList, "itemList");
        ArrayList arrayList = new ArrayList();
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(itemList, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        Iterator<C94253ae1> it = itemList.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            arrayList.add(new C94252ae0(null, null, 0, null));
            OSZ osz = new OSZ(0, null);
            linkedHashMap.put(osz.getFirst(), osz.getSecond());
        }
        InterfaceC93786aWU c94162acY = new C94162acY(linkedHashMap);
        setDatalist(arrayList);
        setActionListener(c94162acY);
    }

    public final void setDatalist(List<C94252ae0> value) {
        o.LJIIIZ(value, "value");
        this.LLLFZ = value;
        AbstractC029409q adapter = getAdapter();
        if (adapter != null) {
            C94251adz c94251adz = (C94251adz) adapter;
            c94251adz.LJLJI.clear();
            c94251adz.LJLJI.addAll(this.LLLFZ);
            c94251adz.notifyDataSetChanged();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ugc.effectcreator.foundation.view.FunctionBarAdapter");
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i == 0) {
            EnumC93620aTo enumC93620aTo = this.LLLF;
            if (enumC93620aTo == EnumC93620aTo.Dead || enumC93620aTo == EnumC93620aTo.AnimationOut) {
                ValueAnimator valueAnimator = this.LLLFF;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                super.setVisibility(i);
                this.LLLF = EnumC93620aTo.AnimationIn;
                this.LLLFF = new C93919aYd().LIZ(this, new IDqS423S0100000_42(this, 111));
                return;
            }
            return;
        }
        EnumC93620aTo enumC93620aTo2 = this.LLLF;
        if (enumC93620aTo2 != EnumC93620aTo.Showing && enumC93620aTo2 != EnumC93620aTo.AnimationIn) {
            return;
        }
        ValueAnimator valueAnimator2 = this.LLLFF;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.LLLF = EnumC93620aTo.AnimationOut;
        this.LLLFF = new C93919aYd().LIZIZ(this, new IDqS21S0101000_42(this, i, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94613ajp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        EnumC93620aTo enumC93620aTo;
        o.LJIIIZ(context, "context");
        if (getVisibility() == 0) {
            enumC93620aTo = EnumC93620aTo.Showing;
        } else {
            enumC93620aTo = EnumC93620aTo.Dead;
        }
        this.LLLF = enumC93620aTo;
        this.LLLFZ = new ArrayList();
        setBackground(context.getResources().getDrawable(R.drawable.dgq));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        setLayoutManager(linearLayoutManager);
        setAdapter(new C94251adz(context, this.LLLFZ));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
