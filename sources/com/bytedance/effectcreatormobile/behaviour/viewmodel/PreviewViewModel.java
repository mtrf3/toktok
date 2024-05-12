package com.bytedance.effectcreatormobile.behaviour.viewmodel;

import X.AbstractC94370afu;
import X.C32I;
import X.C93624aTs;
import X.C93815aWx;
import X.C93991aZn;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class PreviewViewModel extends StateViewModel {
    public final C93624aTs<List<C93815aWx>> LJLILLLLZI = new C93624aTs<>();
    public boolean LJLJI;

    public final void iv0(AbstractC94370afu command) {
        o.LJIIIZ(command, "command");
        List<C93815aWx> value = this.LJLILLLLZI.LIZ.getValue();
        if (value != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(value, 10));
            Iterator<C93815aWx> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().LIZ);
            }
            C93991aZn.LIZ().removeCommand(arrayList.indexOf(command));
            jv0(null);
        }
    }

    public final void jv0(AbstractC94370afu abstractC94370afu) {
        C93624aTs<List<C93815aWx>> c93624aTs = this.LJLILLLLZI;
        List<AbstractC94370afu> commandList = C93991aZn.LIZ().getCommandList();
        ArrayList arrayList = new ArrayList(C32I.LJJL(commandList, 10));
        for (AbstractC94370afu abstractC94370afu2 : commandList) {
            arrayList.add(new C93815aWx(abstractC94370afu2, o.LJ(abstractC94370afu2, abstractC94370afu)));
        }
        StateViewModel.hv0(c93624aTs, arrayList);
    }
}
