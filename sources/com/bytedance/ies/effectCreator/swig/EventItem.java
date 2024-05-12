package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EventItem extends Event {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_EventItem(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.EventItem_getClassName(this.swigCPtr, this);
    }

    public boolean isEdited() {
        return EffectCreatorJniJNI.EventItem_isEdited(this.swigCPtr, this);
    }

    public EventItem() {
        this(EffectCreatorJniJNI.new_EventItem__SWIG_1(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.EventItem_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public EventItem(Project project) {
        this(EffectCreatorJniJNI.new_EventItem__SWIG_0(Project.getCPtr(project), project), true);
    }

    public static EventItem dynamicCast(Element element) {
        long EventItem_dynamicCast__SWIG_0 = EffectCreatorJniJNI.EventItem_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (EventItem_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new EventItem(EventItem_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(EventItem eventItem) {
        if (eventItem == null) {
            return 0L;
        }
        return eventItem.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public EventItem(long j, boolean z) {
        super(EffectCreatorJniJNI.EventItem_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
