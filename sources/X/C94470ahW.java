package X;

import com.bytedance.ies.effectcreator.swig.EEStdFeatureList;
import com.bytedance.ies.effectcreator.swig.EEStdStringList;
import com.bytedance.ies.effectcreator.swig.EventAction;
import com.bytedance.ies.effectcreator.swig.EventCommandUnit;
import com.bytedance.ies.effectcreator.swig.Feature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ahW, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94470ahW extends AbstractC94372afw {
    public final EventCommandUnit LIZ;

    @Override // X.AbstractC93990aZm
    public final int LIZIZ() {
        return C16880lQ.LLJIJIL(this.LIZ.id().objectId());
    }

    @Override // X.AbstractC94372afw
    public final boolean LIZJ() {
        return this.LIZ.actionSupportDetect();
    }

    @Override // X.AbstractC94372afw
    public final C94664ake LIZLLL() {
        EventAction action = this.LIZ.getAction();
        o.LJIIIIZZ(action, "commandUnit.action");
        return new C94664ake(action);
    }

    @Override // X.AbstractC94372afw
    public final List<AbstractC94512aiC> LJ() {
        EEStdFeatureList features = this.LIZ.getFeatures();
        o.LJIIIIZZ(features, "commandUnit.features");
        ArrayList arrayList = new ArrayList(C32I.LJJL(features, 10));
        Iterator<Feature> it = features.iterator();
        while (it.hasNext()) {
            Feature it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            arrayList.add(new C94665akf(it2));
        }
        return arrayList;
    }

    @Override // X.AbstractC94372afw
    public final List<String> LJFF() {
        EEStdStringList actionKeyShowList = this.LIZ.actionKeyShowList();
        o.LJIIIIZZ(actionKeyShowList, "commandUnit.actionKeyShowList()");
        return actionKeyShowList;
    }

    public C94470ahW(EventCommandUnit eventCommandUnit) {
        this.LIZ = eventCommandUnit;
    }

    @Override // X.AbstractC93990aZm
    public final boolean LIZ(Object other) {
        o.LJIIIZ(other, "other");
        boolean z = true;
        if (!o.LJ(other.getClass(), C94470ahW.class)) {
            return false;
        }
        C94470ahW c94470ahW = (C94470ahW) other;
        if (this.LIZ.id().objectId() != c94470ahW.LIZ.id().objectId() || !o.LJ(LJ(), c94470ahW.LJ()) || !o.LJ(LIZLLL(), c94470ahW.LIZLLL())) {
            z = false;
        }
        return z;
    }

    @Override // X.AbstractC94372afw
    public final void LJI(String key) {
        o.LJIIIZ(key, "key");
        EventAction action = this.LIZ.getAction();
        o.LJIIIIZZ(action, "commandUnit.action");
        action.setKey(key);
    }

    @Override // X.AbstractC94372afw
    public final void LJII(List<? extends AbstractC94512aiC> list) {
        EventCommandUnit eventCommandUnit = this.LIZ;
        EEStdFeatureList eEStdFeatureList = new EEStdFeatureList();
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (AbstractC94512aiC abstractC94512aiC : list) {
            if (abstractC94512aiC != null) {
                arrayList.add(((C94665akf) abstractC94512aiC).LIZ);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.ugc.effectcreator.effectcore.sdk.behaviour.EEBehaviourObject");
            }
        }
        eEStdFeatureList.addAll(arrayList);
        eventCommandUnit.setFeatures(eEStdFeatureList);
    }
}
