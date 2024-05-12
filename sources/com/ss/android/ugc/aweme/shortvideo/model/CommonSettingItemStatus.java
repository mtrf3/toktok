package com.ss.android.ugc.aweme.shortvideo.model;

import X.AI2;
import X.AI8;
import X.AI9;
import X.C35N;
import X.C40981G6n;
import X.InterfaceC29911Fj;
import X.T5R;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class CommonSettingItemStatus extends CommonViewStatus {
    public boolean _isDisabled;
    public final MutableLiveData<Boolean> _checked = new MutableLiveData<>();
    public final MutableLiveData<String> _leftText = new MutableLiveData<>();

    @Override // com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus
    public void bindView(final View view, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        super.bindView(view, lifecycleOwner);
        if (view instanceof AI8) {
            AI8 ai8 = (AI8) view;
            if (ai8.getAccessory() instanceof AI2) {
                AI9 accessory = ai8.getAccessory();
                o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
                final AI2 ai2 = (AI2) accessory;
                this._checked.observe(lifecycleOwner, new InterfaceC29911Fj() { // from class: com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus$bindView$1
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Boolean it) {
                        AI2 ai22 = AI2.this;
                        o.LJIIIIZZ(it, "it");
                        ai22.LJIILIIL(it.booleanValue());
                    }
                });
                this._leftText.observe(lifecycleOwner, new InterfaceC29911Fj() { // from class: com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus$bindView$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(String str) {
                        AI8 ai82 = (AI8) view;
                        if (C40981G6n.LIZ()) {
                            T5R t5r = new T5R(str);
                            t5r.LIZ(42);
                            str = t5r;
                        }
                        ai82.setTitle(str);
                    }
                });
                return;
            }
        }
        if (!(view instanceof C35N)) {
            return;
        }
        this._checked.observe(lifecycleOwner, new InterfaceC29911Fj() { // from class: com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus$bindView$3
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Boolean it) {
                C35N c35n = (C35N) view;
                o.LJIIIIZZ(it, "it");
                boolean booleanValue = it.booleanValue();
                if (booleanValue != c35n.LJLIL) {
                    c35n.LJLIL = booleanValue;
                    if (booleanValue) {
                        ((TuxIconView) c35n.LIZ()).setTintColorRes(R.attr.eb);
                    } else {
                        ((TuxIconView) c35n.LIZ()).setTintColorRes(R.attr.gp);
                    }
                }
            }
        });
    }
}
