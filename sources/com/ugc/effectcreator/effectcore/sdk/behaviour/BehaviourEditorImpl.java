package com.ugc.effectcreator.effectcore.sdk.behaviour;

import X.AbstractC94370afu;
import X.AbstractC94512aiC;
import X.C32I;
import X.C47261Igj;
import X.C61878OQg;
import X.C94469ahV;
import X.C94609ajl;
import X.C94610ajm;
import X.C94665akf;
import X.OJ4;
import X.ORZ;
import com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviourEditor;
import com.bytedance.ies.effectcreator.swig.EEStdEventCommandList;
import com.bytedance.ies.effectcreator.swig.EEStdFeatureList;
import com.bytedance.ies.effectcreator.swig.EffectCreatorJniJNI;
import com.bytedance.ies.effectcreator.swig.EventAction;
import com.bytedance.ies.effectcreator.swig.EventCommand;
import com.bytedance.ies.effectcreator.swig.EventCommandUnit;
import com.bytedance.ies.effectcreator.swig.EventManagerV2;
import com.bytedance.ies.effectcreator.swig.EventTrigger;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class BehaviourEditorImpl implements IBehaviourEditor {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r3 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.bytedance.ies.effectcreator.swig.EventManagerV2 getEventManager() {
        /*
            r4 = this;
            com.bytedance.ies.effectcreator.swig.Project r0 = com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LIZIZ
            if (r0 == 0) goto L21
            com.bytedance.ies.effectcreator.swig.Model r0 = r0.getWorkingModel()
            if (r0 == 0) goto L21
            com.bytedance.ies.effectcreator.swig.EventManagerV2 r3 = r0.eventManagerV2()
            if (r3 != 0) goto L20
        L10:
            com.bytedance.effectcreatormobile.ckeapi.api.monitor.IMonitor r2 = X.C93807aWp.LIZ()
            if (r2 == 0) goto L20
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r0 = "eventManager get null pointer!"
            r2.ensureNotReachHere(r1, r0)
        L20:
            return r3
        L21:
            r3 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ugc.effectcreator.effectcore.sdk.behaviour.BehaviourEditorImpl.getEventManager():com.bytedance.ies.effectcreator.swig.EventManagerV2");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r3 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.bytedance.ies.effectcreator.swig.FeatureManager getFeatureManager() {
        /*
            r4 = this;
            com.bytedance.ies.effectcreator.swig.Project r0 = com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LIZIZ
            if (r0 == 0) goto L21
            com.bytedance.ies.effectcreator.swig.Model r0 = r0.getWorkingModel()
            if (r0 == 0) goto L21
            com.bytedance.ies.effectcreator.swig.FeatureManager r3 = r0.featureManager()
            if (r3 != 0) goto L20
        L10:
            com.bytedance.effectcreatormobile.ckeapi.api.monitor.IMonitor r2 = X.C93807aWp.LIZ()
            if (r2 == 0) goto L20
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r0 = "featureManager get null pointer!"
            r2.ensureNotReachHere(r1, r0)
        L20:
            return r3
        L21:
            r3 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ugc.effectcreator.effectcore.sdk.behaviour.BehaviourEditorImpl.getFeatureManager():com.bytedance.ies.effectcreator.swig.FeatureManager");
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviourEditor
    public List<AbstractC94370afu> getCommandList() {
        EEStdEventCommandList commandList;
        EventManagerV2 eventManager = getEventManager();
        if (eventManager != null && (commandList = eventManager.getCommandList()) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(commandList, 10));
            Iterator<EventCommand> it = commandList.iterator();
            while (it.hasNext()) {
                EventCommand it2 = it.next();
                o.LJIIIIZZ(it2, "it");
                arrayList.add(new C94469ahV(it2));
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviourEditor
    public List<AbstractC94512aiC> getObjectList() {
        EEStdFeatureList features;
        List<AbstractC94512aiC> LJJIJLIJ;
        FeatureManager featureManager = getFeatureManager();
        if (featureManager != null && (features = featureManager.getFeatures()) != null && (LJJIJLIJ = C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(OJ4.LJJJJLL(OJ4.LJJJJ(ORZ.LJLIIIL(features), C94609ajl.LJLIL), C94610ajm.LJLIL)))) != null) {
            return LJJIJLIJ;
        }
        return C61878OQg.INSTANCE;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviourEditor
    public void addInvisibleGroup(List<? extends AbstractC94512aiC> objects) {
        EventCommand createCommand;
        o.LJIIIZ(objects, "objects");
        EventManagerV2 eventManager = getEventManager();
        if (eventManager != null && (createCommand = eventManager.createCommand()) != null) {
            createCommand.setExtraInfo("cke_command_add_from", "auto_objecthide");
            EventManagerV2 eventManager2 = getEventManager();
            if (eventManager2 != null) {
                eventManager2.insertCommand(createCommand, null);
            }
            EventTrigger trigger = createCommand.getTrigger();
            o.LJIIIIZZ(trigger, "newCommand.trigger");
            trigger.setKey(EffectCreatorJniJNI.kEventTriggerActionEffectStart());
            EventCommandUnit commandUnit = createCommand.getCommandUnit();
            if (commandUnit != null) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(objects, 10));
                for (AbstractC94512aiC abstractC94512aiC : objects) {
                    if (abstractC94512aiC != null) {
                        Feature feature = ((C94665akf) abstractC94512aiC).LIZ;
                        feature.setInitiallyVisible(false);
                        arrayList.add(feature);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ugc.effectcreator.effectcore.sdk.behaviour.EEBehaviourObject");
                    }
                }
                commandUnit.setFeatures(new EEStdFeatureList(arrayList));
                EventAction action = commandUnit.getAction();
                o.LJIIIIZZ(action, "commandUnit.action");
                action.setKey(EffectCreatorJniJNI.kEventActionDisappear());
            }
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviourEditor
    public AbstractC94370afu createAndInsertCommand(String addFrom) {
        EventCommand createCommand;
        o.LJIIIZ(addFrom, "addFrom");
        EventManagerV2 eventManager = getEventManager();
        if (eventManager == null || (createCommand = eventManager.createCommand()) == null) {
            return null;
        }
        createCommand.setExtraInfo("cke_command_add_from", addFrom);
        EventManagerV2 eventManager2 = getEventManager();
        if (eventManager2 != null) {
            eventManager2.insertCommand(createCommand, null);
        }
        return new C94469ahV(createCommand);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviourEditor
    public AbstractC94370afu findCommandById(long j) {
        EEStdEventCommandList commandList;
        EventManagerV2 eventManager = getEventManager();
        if (eventManager != null && (commandList = eventManager.getCommandList()) != null) {
            Iterator<EventCommand> it = commandList.iterator();
            while (it.hasNext()) {
                EventCommand next = it.next();
                if (next.id().objectId() == j) {
                    return new C94469ahV(next);
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviourEditor
    public AbstractC94512aiC findObjectById(long j) {
        for (AbstractC94512aiC abstractC94512aiC : getObjectList()) {
            if (abstractC94512aiC.LJ() == j) {
                return abstractC94512aiC;
            }
        }
        return null;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviourEditor
    public void removeCommand(int i) {
        EEStdEventCommandList commandList;
        EventCommand eventCommand;
        EventManagerV2 eventManager;
        EventManagerV2 eventManager2 = getEventManager();
        if (eventManager2 != null && (commandList = eventManager2.getCommandList()) != null && (eventCommand = commandList.get(i)) != null && (eventManager = getEventManager()) != null) {
            eventManager.removeCommand(eventCommand);
        }
    }
}
