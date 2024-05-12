package com.bytedance.effectcreatormobile.modelselect.model;

import X.C93624aTs;
import X.C93745aVp;
import X.C93996aZs;
import X.C94256ae4;
import android.content.Context;
import com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect;
import com.bytedance.effectcreatormobile.modelselect.impl.ModelSelectImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS175S0200000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class ModelViewModel extends StateViewModel {
    public int LJLJJL;
    public final C93624aTs<List<C94256ae4>> LJLILLLLZI = new C93624aTs<>();
    public final C93624aTs<List<String>> LJLJI = new C93624aTs<>();
    public final C93624aTs<Integer> LJLJJI = new C93624aTs<>(0);
    public HashMap<String, List<C94256ae4>> LJLJJLL = new HashMap<>();
    public final HashMap<String, Integer> LJLJL = new HashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public final void iv0(int i) {
        HashMap<String, Integer> hashMap = this.LJLJL;
        List<String> value = this.LJLJI.LIZ.getValue();
        o.LJI(value);
        hashMap.put(ListProtector.get(value, this.LJLJJL), Integer.valueOf(i));
    }

    public final void kv0(int i) {
        int i2;
        if (this.LJLJJLL.size() < i) {
            i2 = this.LJLJJLL.size() - 1;
        } else {
            i2 = i;
        }
        this.LJLJJL = i;
        HashMap<String, List<C94256ae4>> hashMap = this.LJLJJLL;
        List<String> value = this.LJLJI.LIZ.getValue();
        o.LJI(value);
        List<C94256ae4> list = hashMap.get(ListProtector.get(value, i2));
        if (list != null) {
            StateViewModel.hv0(this.LJLILLLLZI, list);
        }
        HashMap<String, Integer> hashMap2 = this.LJLJL;
        List<String> value2 = this.LJLJI.LIZ.getValue();
        o.LJI(value2);
        Integer num = hashMap2.get(ListProtector.get(value2, i2));
        if (num != null) {
            StateViewModel.hv0(this.LJLJJI, num);
        }
    }

    public final void jv0(Context context, C94256ae4 modelPicture) {
        o.LJIIIZ(modelPicture, "modelPicture");
        WeakReference weakReference = new WeakReference(context);
        ModelSelectImpl modelSelectImpl = (ModelSelectImpl) C93745aVp.LIZ(IModelSelect.class);
        modelSelectImpl.getModelResultManager();
        new C93996aZs(modelSelectImpl).LIZIZ(modelPicture, false, new IDqS175S0200000_42(this, weakReference, 3));
    }
}
