package com.bytedance.android.live.ai.impl.trigger;

import X.AbstractC35601aW;
import X.AnonymousClass122;
import X.BFR;
import X.C18180nW;
import X.C1VD;
import X.C29927Bop;
import X.C2NN;
import X.C32150Cja;
import X.C37621dm;
import X.C37641do;
import X.C37651dp;
import X.FQE;
import X.InterfaceC24100x4;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.ai.api.trigger.ILiveTriggerService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class LiveTriggerServiceImpl implements ILiveTriggerService {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.ai.api.trigger.ILiveTriggerService
    public final void v40() {
        for (AbstractC35601aW handler : (List) AnonymousClass122.LJ.getValue()) {
            o.LJIIIZ(handler, "handler");
            FQE fqe = (FQE) C18180nW.LIZ.getValue();
            if (fqe != null) {
                fqe.LJIIIIZZ(handler.getName(), new IDqS416S0100000(handler, 257));
            }
        }
        for (Map.Entry entry : ((Map) AnonymousClass122.LIZ.getValue()).entrySet()) {
            C2NN c2nn = (C2NN) entry.getValue();
            String str = (String) entry.getKey();
            for (BFR bfr : c2nn.LJLIL) {
                String businessName = bfr.LJLJI;
                String ruleName = bfr.LJLILLLLZI;
                C37621dm c37621dm = new C37621dm(str, bfr, c2nn.LJLILLLLZI);
                o.LJIIIZ(businessName, "businessName");
                o.LJIIIZ(ruleName, "ruleName");
                FQE fqe2 = (FQE) C18180nW.LIZ.getValue();
                if (fqe2 != null) {
                    fqe2.LJIIL(businessName, ruleName, new IDqS416S0100000(c37621dm, 256), new IDqS420S0100000(c37621dm, 136), new IDqS443S0100000(c37621dm, 27));
                }
            }
        }
        C1VD.LIZ.LIZIZ(new C37651dp());
    }

    @Override // com.bytedance.android.live.ai.api.trigger.ILiveTriggerService
    public final void At(C32150Cja c32150Cja) {
        AnonymousClass122.LJFF.remove(c32150Cja.LIZIZ);
    }

    @Override // com.bytedance.android.live.ai.api.trigger.ILiveTriggerService
    public final void Xs0(C32150Cja c32150Cja) {
        AnonymousClass122.LJFF.put(c32150Cja.LIZIZ, c32150Cja);
    }

    @Override // com.bytedance.android.live.ai.api.trigger.ILiveTriggerService
    public final void bD(Fragment fragment, DataChannel dataChannel) {
        IMessageManager iMessageManager;
        o.LJIIIZ(fragment, "fragment");
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            for (Integer it : ((Map) AnonymousClass122.LIZIZ.getValue()).keySet()) {
                if (it == null || it.intValue() != -1000) {
                    o.LJIIIIZZ(it, "it");
                    iMessageManager.removeMessageListener(it.intValue(), (C37641do) AnonymousClass122.LIZJ.getValue());
                }
            }
        }
        Iterator it2 = ((List) AnonymousClass122.LIZLLL.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC24100x4) it2.next()).LIZ(fragment);
        }
        Iterator it3 = ((List) AnonymousClass122.LJ.getValue()).iterator();
        while (it3.hasNext()) {
            ((AbstractC35601aW) it3.next()).LIZJ(fragment);
        }
    }

    @Override // com.bytedance.android.live.ai.api.trigger.ILiveTriggerService
    public final void y3(Fragment fragment, DataChannel dataChannel) {
        IMessageManager iMessageManager;
        o.LJIIIZ(fragment, "fragment");
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            for (Integer it : ((Map) AnonymousClass122.LIZIZ.getValue()).keySet()) {
                if (it == null || it.intValue() != -1000) {
                    o.LJIIIIZZ(it, "it");
                    iMessageManager.addAsyncMessageListener(it.intValue(), (C37641do) AnonymousClass122.LIZJ.getValue());
                }
            }
        }
        Iterator it2 = ((List) AnonymousClass122.LIZLLL.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC24100x4) it2.next()).y3(fragment, dataChannel);
        }
        Iterator it3 = ((List) AnonymousClass122.LJ.getValue()).iterator();
        while (it3.hasNext()) {
            ((AbstractC35601aW) it3.next()).LIZIZ(fragment, dataChannel);
        }
    }
}
