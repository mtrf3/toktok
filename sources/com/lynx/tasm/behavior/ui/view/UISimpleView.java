package com.lynx.tasm.behavior.ui.view;

import X.VNU;
import android.content.Context;
import android.view.ViewGroup;
import com.lynx.tasm.behavior.ui.UIGroup;

/* loaded from: classes11.dex */
public abstract class UISimpleView<T extends ViewGroup> extends UIGroup<T> {
    public UISimpleView(Context context) {
        this((VNU) context);
    }

    public UISimpleView(VNU vnu) {
        this(vnu, null);
    }

    public UISimpleView(VNU vnu, Object obj) {
        super(vnu, obj);
    }
}
