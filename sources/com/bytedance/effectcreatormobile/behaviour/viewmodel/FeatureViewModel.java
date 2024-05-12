package com.bytedance.effectcreatormobile.behaviour.viewmodel;

import X.AbstractC94370afu;
import X.AbstractC94372afw;
import X.AbstractC94512aiC;
import X.AbstractC94513aiD;
import X.C93624aTs;
import X.C93991aZn;
import X.C94665akf;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes34.dex */
public final class FeatureViewModel extends StateViewModel {
    public final C93624aTs<List<AbstractC94512aiC>> LJLILLLLZI = new C93624aTs<>();
    public final C93624aTs<List<AbstractC94512aiC>> LJLJI = new C93624aTs<>();
    public AbstractC94372afw LJLJJI;
    public AbstractC94513aiD LJLJJL;

    public final void iv0(AbstractC94370afu abstractC94370afu, int i) {
        AbstractC94372afw abstractC94372afw;
        StateViewModel.hv0(this.LJLILLLLZI, C93991aZn.LIZ().getObjectList());
        List<AbstractC94372afw> LJI = abstractC94370afu.LJI();
        if (i < 0 || i >= LJI.size() || (abstractC94372afw = (AbstractC94372afw) ListProtector.get(LJI, i)) == null) {
            C93624aTs<List<AbstractC94512aiC>> c93624aTs = this.LJLJI;
            ArrayList arrayList = new ArrayList();
            C94665akf LJFF = abstractC94370afu.LJII().LJFF();
            if (LJFF != null) {
                arrayList.add(LJFF);
            }
            StateViewModel.hv0(c93624aTs, arrayList);
        } else {
            this.LJLJJI = abstractC94372afw;
            StateViewModel.hv0(this.LJLJI, abstractC94372afw.LJ());
        }
        this.LJLJJL = abstractC94370afu.LJII();
    }
}
