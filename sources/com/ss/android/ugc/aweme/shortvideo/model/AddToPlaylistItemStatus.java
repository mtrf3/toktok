package com.ss.android.ugc.aweme.shortvideo.model;

import X.AI8;
import X.AI9;
import X.AIF;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AddToPlaylistItemStatus extends CommonViewStatus {
    public final MutableLiveData<String> _nameText = new MutableLiveData<>();

    @Override // com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus
    public void bindView(final View view, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        super.bindView(view, lifecycleOwner);
        this._nameText.removeObservers(lifecycleOwner);
        this._nameText.observe(lifecycleOwner, new Observer() { // from class: com.ss.android.ugc.aweme.shortvideo.model.AddToPlaylistItemStatus$bindView$1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(String str) {
                AIF aif;
                View view2 = view;
                if (view2 instanceof AI8) {
                    AI9 accessory = ((AI8) view2).getAccessory();
                    if (!(accessory instanceof AIF) || (aif = (AIF) accessory) == null) {
                        return;
                    }
                    aif.LJIILIIL(str);
                }
            }
        });
    }
}
