package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.4sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC123304sg {
    public final C62822Ol8 LIZ;
    public final java.util.Map<String, InterfaceC123284se> LIZIZ;
    public final java.util.Set<EnumC123874tb> LIZJ;

    public abstract boolean LIZ(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2);

    public AbstractC123304sg(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = C221108m2.LIZIZ(C123404sq.LJLIL);
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = new LinkedHashSet();
    }

    public final void LIZIZ(C123314sh c123314sh) {
        int i;
        int i2;
        ArrayList arrayList;
        String str = c123314sh.LJLIL;
        if (this.LIZIZ.containsKey(str)) {
            InterfaceC123284se interfaceC123284se = (InterfaceC123284se) ((LinkedHashMap) this.LIZIZ).get(str);
            NLEModel nLEModel = c123314sh.LJLJI;
            NLEModel LJJI = C79057V0z.LJJI((EditorProContext) this.LIZ.getValue());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            VecNLETrackSPtr tracks = LJJI.getTracks();
            ArrayList LIZ = C07080Po.LIZ(tracks, "afterActionNLEModel.tracks");
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                NLETrack next = it.next();
                NLETrack nLETrack = next;
                if (!nLETrack.LJIIJ() && this.LIZJ.contains(nLETrack.LJIIL())) {
                    LIZ.add(next);
                }
            }
            Iterator<NLETrackSlot> it2 = nLEModel.getMainTrack().LJIILLIIL().iterator();
            while (it2.hasNext()) {
                NLETrackSlot next2 = it2.next();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                String uuid = next2.getUUID();
                o.LJIIIIZZ(uuid, "mainSlot.uuid");
                linkedHashMap.put(uuid, new ArrayList());
                Iterator it3 = LIZ.iterator();
                while (it3.hasNext()) {
                    NLETrack nLETrack2 = (NLETrack) it3.next();
                    int size = nLETrack2.LJIILL().size();
                    Integer num = (Integer) linkedHashMap2.get(nLETrack2.getUUID());
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    if (i < size) {
                        Integer num2 = (Integer) linkedHashMap2.get(nLETrack2.getUUID());
                        if (num2 != null) {
                            i2 = num2.intValue();
                        } else {
                            i2 = 0;
                        }
                        while (true) {
                            if (i2 < size) {
                                NLETrackSlot slot = nLETrack2.LJIILLIIL().get(i2);
                                o.LJIIIIZZ(slot, "slot");
                                if (LIZ(slot, next2) && (arrayList = (ArrayList) linkedHashMap.get(next2.getUUID())) != null) {
                                    arrayList.add(slot);
                                }
                                if (i2 == size - 1) {
                                    String uuid2 = nLETrack2.getUUID();
                                    o.LJIIIIZZ(uuid2, "track.uuid");
                                    linkedHashMap2.put(uuid2, Integer.valueOf(size));
                                    break;
                                } else {
                                    if (slot.getStartTime() >= next2.getEndTime()) {
                                        String uuid3 = nLETrack2.getUUID();
                                        o.LJIIIIZZ(uuid3, "track.uuid");
                                        linkedHashMap2.put(uuid3, Integer.valueOf(i2));
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                }
            }
            if (interfaceC123284se != null) {
                interfaceC123284se.LIZ(c123314sh.LJLILLLLZI, linkedHashMap);
            }
        }
    }
}
