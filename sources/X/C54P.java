package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.54P, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C54P implements InterfaceC131385Dq {
    public final C54R LIZ;
    public List<? extends NLETrackSlot> LIZIZ;
    public NLETrackSlot LIZJ;
    public java.util.Map<NLETrackSlot, java.util.Set<C1290754t>> LIZLLL;
    public final List<C54S> LJ;

    @Override // X.InterfaceC131385Dq
    public final C5E1 LIZ() {
        boolean z;
        String str;
        boolean z2;
        NLEResourceNode LIZIZ;
        NLETrackSlot nLETrackSlot = this.LIZJ;
        if (nLETrackSlot == null) {
            List LJJLI = C32I.LJJLI(((LinkedHashMap) this.LIZLLL).values());
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            return new C5E1(LJJLI, c61878OQg, c61878OQg);
        }
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
        if (nLETrackSlot.LJI().LIZJ() == EnumC123874tb.IMAGE) {
            z = true;
        } else {
            z = false;
        }
        String LIZJ = C5DZ.LIZJ(nLETrackSlot);
        int duration = (int) (LJJ.LIZIZ().getDuration() / 1000);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int LIZJ2 = (int) (this.LIZ.LIZJ() / this.LIZ.LIZIZ());
        int LIZJ3 = (int) (C134845Qy.LIZJ(C58S.LIZ()) / this.LIZ.LIZIZ());
        float LIZ = this.LIZ.LIZ() / this.LIZ.LIZIZ();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        List<? extends NLETrackSlot> list = this.LIZIZ;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                NLETrackSlot nLETrackSlot2 = (NLETrackSlot) it.next();
                NLESegment LJI = nLETrackSlot2.LJI();
                EnumC123874tb enumC123874tb = null;
                if (LJI == null || (LIZIZ = LJI.LIZIZ()) == null || (str = LIZIZ.LIZJ()) == null) {
                    str = "";
                }
                NLESegment LJI2 = nLETrackSlot2.LJI();
                if (LJI2 != null) {
                    enumC123874tb = LJI2.LIZJ();
                }
                if (enumC123874tb == EnumC123874tb.IMAGE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                linkedHashSet4.add(new C1290754t(str, C5DZ.LIZ(0), 3, z2));
            }
        }
        if (z) {
            String LIZJ4 = LJJ.LIZIZ().LIZJ();
            o.LJIIIIZZ(LIZJ4, "videoSeg.resource.resourceFile");
            linkedHashSet4.add(new C1290754t(LIZJ4, 0, 3, true));
        } else {
            int max = (int) (Math.max(0, LIZJ2 - LIZJ3) / LIZ);
            int min = (int) (Math.min(duration, (LIZJ3 * 2) + LIZJ2) / LIZ);
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            if (max <= min) {
                while (true) {
                    linkedHashSet5.add(new C1290754t(LIZJ, C5DZ.LIZ((int) (max * LIZ)), 3, false));
                    if (max == min) {
                        break;
                    }
                    max++;
                }
            }
            linkedHashSet4.addAll(linkedHashSet5);
        }
        java.util.Set<C1290754t> remove = this.LIZLLL.remove(nLETrackSlot);
        if (remove == null) {
            linkedHashSet2.addAll(linkedHashSet4);
        } else {
            linkedHashSet.addAll(F5P.LJIIIZ(remove, linkedHashSet4));
            linkedHashSet2.addAll(F5P.LJIIIZ(linkedHashSet4, remove));
        }
        linkedHashSet3.addAll(linkedHashSet4);
        linkedHashMap.put(nLETrackSlot, linkedHashSet4);
        Iterator it2 = ((LinkedHashMap) this.LIZLLL).entrySet().iterator();
        while (it2.hasNext()) {
            linkedHashSet.addAll((Collection) ((Map.Entry) it2.next()).getValue());
        }
        this.LIZLLL = linkedHashMap;
        return new C5E1(ORZ.LLJILJILJ(linkedHashSet), ORZ.LLJILJILJ(linkedHashSet2), ORZ.LLJILJILJ(linkedHashSet3));
    }

    public C54P(C54R callBack) {
        o.LJIIIZ(callBack, "callBack");
        this.LIZ = callBack;
        this.LIZLLL = new LinkedHashMap();
        this.LJ = new ArrayList();
    }

    @Override // X.InterfaceC131385Dq
    public final void LIZIZ(C5DY key) {
        o.LJIIIZ(key, "key");
        C6QQ.LIZ(new C54Q(this, key));
    }
}
