package com.ss.android.ugc.aweme.shortvideo.model;

import X.AEY;
import X.AI2;
import X.AI8;
import X.AI9;
import X.AIF;
import X.C16880lQ;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class CommonViewStatus extends ViewModel {
    public final MutableLiveData<Integer> _visibility = new MutableLiveData<>();
    public final MutableLiveData<Float> _alpha = new MutableLiveData<>();
    public final MutableLiveData<Boolean> _enable = new MutableLiveData<>();
    public final List<InterfaceC88472Yns<View, C76800UCe>> mClickListenerList = new ArrayList();

    public final void addOnClickListener(InterfaceC88472Yns<? super View, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.mClickListenerList.add(listener);
    }

    public final void click(View view) {
        o.LJIIIZ(view, "view");
        Iterator<InterfaceC88472Yns<View, C76800UCe>> it = this.mClickListenerList.iterator();
        while (it.hasNext()) {
            it.next().invoke(view);
        }
    }

    public final void setOnClickListener(InterfaceC88472Yns<? super View, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.mClickListenerList.clear();
        this.mClickListenerList.add(listener);
    }

    public void bindView(final View view, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this._visibility.observe(lifecycleOwner, new Observer() { // from class: com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus$bindView$1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Integer it) {
                View view2 = view;
                o.LJIIIIZZ(it, "it");
                view2.setVisibility(it.intValue());
            }
        });
        this._alpha.observe(lifecycleOwner, new Observer() { // from class: com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus$bindView$2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Float it) {
                View view2 = view;
                o.LJIIIIZZ(it, "it");
                view2.setAlpha(it.floatValue());
            }
        });
        this._enable.observe(lifecycleOwner, new Observer() { // from class: com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus$bindView$3
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Boolean it) {
                View view2 = view;
                o.LJIIIIZZ(it, "it");
                view2.setEnabled(it.booleanValue());
            }
        });
        if (view instanceof AI8) {
            AI8 ai8 = (AI8) view;
            if (ai8.getAccessory() instanceof AI2) {
                AI9 accessory = ai8.getAccessory();
                o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
                ((AEY) accessory).LJIILJJIL(new AqS154S0200000_7(this, view, 34));
            }
            if (ai8.getAccessory() instanceof AIF) {
                AI9 accessory2 = ai8.getAccessory();
                o.LJII(accessory2, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Disclosure");
                ((AIF) accessory2).LJIILJJIL(new View.OnClickListener() { // from class: com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus$bindView$5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View it) {
                        CommonViewStatus commonViewStatus = CommonViewStatus.this;
                        o.LJIIIIZZ(it, "it");
                        commonViewStatus.click(it);
                    }
                });
                return;
            }
            return;
        }
        C16880lQ.LJIIJ(new View.OnClickListener() { // from class: com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus$bindView$6
            @Override // android.view.View.OnClickListener
            public final void onClick(View it) {
                CommonViewStatus commonViewStatus = CommonViewStatus.this;
                o.LJIIIIZZ(it, "it");
                commonViewStatus.click(it);
            }
        }, view);
    }
}
