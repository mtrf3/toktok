package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TEW extends FrameLayout implements TLG<TEN> {
    public final java.util.Map<TEN, View> LJLIL;
    public final java.util.Map<TEN, InterfaceC88472Yns<ViewGroup, View>> LJLILLLLZI;
    public TEN LJLJI;

    public TEW() {
        throw null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.TLG
    public TEN getState() {
        return this.LJLJI;
    }

    @Override // X.TLG
    public void setState(TEN state) {
        o.LJIIIZ(state, "state");
        View view = (View) ((LinkedHashMap) this.LJLIL).get(this.LJLJI);
        if (view != null) {
            view.setVisibility(8);
        }
        this.LJLJI = state;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) ((LinkedHashMap) this.LJLILLLLZI).get(state);
        if (interfaceC88472Yns != null) {
            if (!this.LJLIL.containsKey(this.LJLJI)) {
                View view2 = (View) interfaceC88472Yns.invoke(this);
                view2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                addView(view2);
                this.LJLIL.put(this.LJLJI, view2);
            }
            View view3 = (View) ((LinkedHashMap) this.LJLIL).get(this.LJLJI);
            if (view3 != null) {
                view3.setVisibility(0);
            }
        }
    }

    public final void LIZ(TEN state, InterfaceC88472Yns<? super ViewGroup, ? extends View> provider) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(provider, "provider");
        this.LJLILLLLZI.put(state, provider);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TEW(Context context, java.util.Map map, TEN initState) {
        super(context, null);
        o.LJIIIZ(initState, "initState");
        this.LJLIL = new LinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LJLILLLLZI = linkedHashMap;
        linkedHashMap.putAll(map);
        this.LJLJI = initState;
    }
}
