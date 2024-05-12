package X;

import com.bytedance.ies.effectcreator.swig.DataChangeObserver;
import com.bytedance.ies.effectcreator.swig.DataChanges;
import com.bytedance.ies.effectcreator.swig.EEStdElementSet;
import com.bytedance.ies.effectcreator.swig.EEStdStringMap;
import com.bytedance.ies.effectcreator.swig.EEStdStringSet;
import com.bytedance.ies.effectcreator.swig.Element;
import com.bytedance.ies.effectcreator.swig.Error;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.acI, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94146acI extends DataChangeObserver {
    @Override // com.bytedance.ies.effectcreator.swig.DataChangeObserver
    public final void onDataChanged(DataChanges dataChanges, Error error) {
        if (error != null) {
            Boolean.valueOf(error.isSuccess()).booleanValue();
            if (dataChanges != null) {
                EEStdElementSet added = dataChanges.getAdded();
                o.LJIIIIZZ(added, "added");
                if (!added.isEmpty()) {
                    Iterator<InterfaceC93604aTY> it = CKEffectEditorContext.LJIILIIL.iterator();
                    while (it.hasNext()) {
                        InterfaceC93604aTY next = it.next();
                        EEStdElementSet added2 = dataChanges.getAdded();
                        o.LJIIIIZZ(added2, "added");
                        next.LIZJ(added2);
                    }
                    EEStdElementSet added3 = dataChanges.getAdded();
                    o.LJIIIIZZ(added3, "added");
                    CKEffectEditorContext.LJIIIZ(added3, EnumC93799aWh.ADD);
                }
                o.LJIIIIZZ(dataChanges.getModified(), "modified");
                if (!r0.isEmpty()) {
                    Iterator<InterfaceC93604aTY> it2 = CKEffectEditorContext.LJIILIIL.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ();
                    }
                    EEStdStringMap modified = dataChanges.getModified();
                    o.LJIIIIZZ(modified, "modified");
                    ArrayList arrayList = new ArrayList(modified.size());
                    Iterator<Map.Entry<Element, EEStdStringSet>> it3 = modified.entrySet().iterator();
                    while (it3.hasNext()) {
                        arrayList.add(it3.next().getKey());
                    }
                    CKEffectEditorContext.LJIIIZ(new EEStdElementSet(arrayList), EnumC93799aWh.MODIFY);
                }
                EEStdElementSet removed = dataChanges.getRemoved();
                o.LJIIIIZZ(removed, "removed");
                if (!removed.isEmpty()) {
                    Iterator<InterfaceC93604aTY> it4 = CKEffectEditorContext.LJIILIIL.iterator();
                    while (it4.hasNext()) {
                        it4.next().LIZIZ();
                    }
                    EEStdElementSet removed2 = dataChanges.getRemoved();
                    o.LJIIIIZZ(removed2, "removed");
                    CKEffectEditorContext.LJIIIZ(removed2, EnumC93799aWh.REMOVE);
                }
            }
        }
    }
}
