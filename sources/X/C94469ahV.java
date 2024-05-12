package X;

import com.bytedance.ies.effectcreator.swig.EEStdEventCommandUnitList;
import com.bytedance.ies.effectcreator.swig.EEStdFeatureList;
import com.bytedance.ies.effectcreator.swig.EventCommand;
import com.bytedance.ies.effectcreator.swig.EventCommandUnit;
import com.bytedance.ies.effectcreator.swig.EventTrigger;
import com.bytedance.ies.effectcreator.swig.Feature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ahV, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94469ahV extends AbstractC94370afu {
    public final EventCommand LIZ;

    @Override // X.AbstractC93990aZm
    public final int LIZIZ() {
        return C16880lQ.LLJIJIL(this.LIZ.id().objectId());
    }

    @Override // X.AbstractC94370afu
    public final C94470ahW LIZJ() {
        EventCommandUnit commandUnit = this.LIZ.createCommandUnit();
        this.LIZ.insertCommandUnitToBottom(commandUnit);
        o.LJIIIIZZ(commandUnit, "commandUnit");
        return new C94470ahW(commandUnit);
    }

    @Override // X.AbstractC94370afu
    public final String LJ() {
        EventCommand commandAddFrom = this.LIZ;
        o.LJIIIZ(commandAddFrom, "$this$commandAddFrom");
        String extraInfo = commandAddFrom.getExtraInfo("cke_command_add_from");
        if (extraInfo != null) {
            return extraInfo;
        }
        return "";
    }

    @Override // X.AbstractC94370afu
    public final List<AbstractC94512aiC> LJFF() {
        EEStdFeatureList appearActionConflictDetect = this.LIZ.appearActionConflictDetect();
        o.LJIIIIZZ(appearActionConflictDetect, "command.appearActionConflictDetect()");
        ArrayList arrayList = new ArrayList(C32I.LJJL(appearActionConflictDetect, 10));
        Iterator<Feature> it = appearActionConflictDetect.iterator();
        while (it.hasNext()) {
            Feature it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            arrayList.add(new C94665akf(it2));
        }
        return arrayList;
    }

    @Override // X.AbstractC94370afu
    public final List<AbstractC94372afw> LJI() {
        EEStdEventCommandUnitList commandUnitList = this.LIZ.getCommandUnitList();
        o.LJIIIIZZ(commandUnitList, "command.commandUnitList");
        ArrayList arrayList = new ArrayList(C32I.LJJL(commandUnitList, 10));
        Iterator<EventCommandUnit> it = commandUnitList.iterator();
        while (it.hasNext()) {
            EventCommandUnit it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            arrayList.add(new C94470ahW(it2));
        }
        return arrayList;
    }

    @Override // X.AbstractC94370afu
    public final C94666akg LJII() {
        EventTrigger trigger = this.LIZ.getTrigger();
        o.LJIIIIZZ(trigger, "command.trigger");
        return new C94666akg(trigger);
    }

    public C94469ahV(EventCommand eventCommand) {
        this.LIZ = eventCommand;
    }

    @Override // X.AbstractC93990aZm
    public final boolean LIZ(Object other) {
        o.LJIIIZ(other, "other");
        boolean z = true;
        if (!o.LJ(other.getClass(), C94469ahV.class)) {
            return false;
        }
        C94469ahV c94469ahV = (C94469ahV) other;
        if (this.LIZ.id().objectId() != c94469ahV.LIZ.id().objectId() || !o.LJ(LJII(), c94469ahV.LJII()) || !o.LJ(LJI(), c94469ahV.LJI())) {
            z = false;
        }
        return z;
    }

    @Override // X.AbstractC94370afu
    public final void LIZLLL(AbstractC94372afw abstractC94372afw) {
        this.LIZ.removeCommandUnit(((C94470ahW) abstractC94372afw).LIZ);
    }
}
