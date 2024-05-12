package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.54M, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C54M implements InterfaceC131385Dq {
    public List<C1280750x> LIZ;
    public java.util.Set<C1290754t> LIZIZ = new LinkedHashSet();
    public final List<C54T> LIZJ = new ArrayList();

    @Override // X.InterfaceC131385Dq
    public final C5E1 LIZ() {
        String str;
        EnumC123874tb enumC123874tb;
        long j;
        NLEResourceNode LIZIZ;
        List<C1280750x> list = this.LIZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C1280750x> it = list.iterator();
            while (it.hasNext()) {
                ORS.LJJLIIIJILLIZJL(it.next().LIZLLL, arrayList);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                boolean z = true;
                int i = 0;
                NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, ((NLETrackSlot) it2.next()).LJI());
                if (nLESegmentAudio == null || (LIZIZ = nLESegmentAudio.LIZIZ()) == null || (str = LIZIZ.LIZJ()) == null) {
                    str = "";
                }
                if (nLESegmentAudio != null) {
                    enumC123874tb = nLESegmentAudio.LIZJ();
                } else {
                    enumC123874tb = null;
                }
                if (enumC123874tb != EnumC123874tb.IMAGE) {
                    z = false;
                }
                if (nLESegmentAudio != null) {
                    j = nLESegmentAudio.LJIILIIL();
                } else {
                    j = 0;
                }
                long j2 = j / 1000;
                if (!z) {
                    i = C5DZ.LIZ((int) j2);
                }
                linkedHashSet4.add(new C1290754t(str, i, 3, z));
            }
            linkedHashSet2.addAll(F5P.LJIIIZ(linkedHashSet4, this.LIZIZ));
            linkedHashSet.addAll(F5P.LJIIIZ(this.LIZIZ, linkedHashSet4));
            linkedHashSet3.addAll(linkedHashSet4);
            this.LIZIZ = linkedHashSet4;
            return new C5E1(ORZ.LLJI(linkedHashSet), ORZ.LLJI(linkedHashSet2), ORZ.LLJI(linkedHashSet3));
        }
        List LLJI = ORZ.LLJI(this.LIZIZ);
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        return new C5E1(LLJI, c61878OQg, c61878OQg);
    }

    @Override // X.InterfaceC131385Dq
    public final void LIZIZ(C5DY key) {
        o.LJIIIZ(key, "key");
        if (((ArrayList) this.LIZJ).isEmpty()) {
            return;
        }
        C2ND.LIZIZ(new C54N(this, key), 0L);
    }
}
