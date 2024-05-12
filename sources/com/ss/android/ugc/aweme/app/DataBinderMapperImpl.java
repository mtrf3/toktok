package com.ss.android.ugc.aweme.app;

import X.AbstractC024407s;
import X.InterfaceC024507t;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class DataBinderMapperImpl extends AbstractC024407s {
    public static final SparseIntArray LIZ = new SparseIntArray(0);

    @Override // X.AbstractC024407s
    public final List<AbstractC024407s> LIZ() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.ss.android.ugc.aweme.ecommerce.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // X.AbstractC024407s
    public final ViewDataBinding LIZIZ(InterfaceC024507t interfaceC024507t, View view, int i) {
        if (LIZ.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // X.AbstractC024407s
    public final ViewDataBinding LIZJ(InterfaceC024507t interfaceC024507t, View[] viewArr, int i) {
        if (viewArr.length == 0 || LIZ.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
