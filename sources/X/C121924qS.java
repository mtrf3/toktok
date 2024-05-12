package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AqS121S0300000_2;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4qS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121924qS extends AbstractC121974qX {
    public EnumC135185Sg LIZIZ;
    public final C121914qR LIZJ;

    public C121924qS(C121914qR c121914qR) {
        this.LIZJ = c121914qR;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" 0.init ");
        LIZ.append(String.valueOf(c121914qR));
        LJFF(X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC121974qX
    public final void LIZ(InterfaceC126684y8 nleSession) {
        o.LJIIIZ(nleSession, "nleSession");
        nleSession.V8().prepare();
        if (this.LIZIZ == EnumC135185Sg.STARTED) {
            nleSession.V8().play();
        }
    }

    @Override // X.AbstractC121974qX
    public final void LIZIZ(InterfaceC126684y8 nleSession) {
        o.LJIIIZ(nleSession, "nleSession");
        EnumC135185Sg LJJIL = nleSession.V8().LJJIL();
        this.LIZIZ = LJJIL;
        if (LJJIL == EnumC135185Sg.STARTED) {
            nleSession.V8().pause();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.bytedance.ies.nle.editor_jni.NLETrack, T] */
    @Override // X.AbstractC121974qX
    public final void LIZJ(NLEEditor nleEditor) {
        Object obj;
        String str;
        String str2;
        NLESegment nLESegment;
        String str3;
        String str4;
        String str5;
        o.LJIIIZ(nleEditor, "nleEditor");
        C68322mC c68322mC = new C68322mC();
        String str6 = null;
        c68322mC.element = null;
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = null;
        Iterator LIZ = C0FS.LIZ(nleEditor, "nleEditor.model", "nleEditor.model.tracks");
        while (true) {
            if (LIZ.hasNext()) {
                obj = LIZ.next();
                NLETrack it = (NLETrack) obj;
                o.LJIIIIZZ(it, "it");
                if (o.LJ(C77357UXp.LJIILIIL(it), EnumC122254qz.BGM.name())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ?? r5 = (NLETrack) obj;
        if (r5 != 0) {
            c68322mC.element = r5;
            Iterator<NLETrackSlot> it2 = r5.LJIILL().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ?? next = it2.next();
                if (C62850Ola.LIZLLL((NLETrackSlot) next, "it") != null) {
                    if (next != 0) {
                        c68322mC2.element = next;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder(" 1.find track ");
        NLENode nLENode = (NLENode) c68322mC.element;
        if (nLENode != null) {
            str = nLENode.getName();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(" slot ");
        NLENode nLENode2 = (NLENode) c68322mC2.element;
        if (nLENode2 != null) {
            str2 = nLENode2.getName();
        } else {
            str2 = null;
        }
        sb.append(str2);
        LJFF(sb.toString());
        if (this.LIZJ == null) {
            if (c68322mC.element != 0) {
                StringBuilder sb2 = new StringBuilder(" 2.delete track ");
                NLENode nLENode3 = (NLENode) c68322mC.element;
                if (nLENode3 != null) {
                    str6 = nLENode3.getName();
                }
                sb2.append(str6);
                sb2.append(' ');
                LJFF(sb2.toString());
                NLETrack nLETrack = (NLETrack) c68322mC.element;
                o.LJI(nLETrack);
                LJIIIIZZ(nleEditor, nLETrack, new AqS149S0200000_2(c68322mC, c68322mC2, 77));
                return;
            }
            LJFF(" 2.delete but noting");
            return;
        }
        if (c68322mC.element == 0) {
            LJFF(" 2.add track start ");
            LJII(nleEditor, this.LIZJ, new AqS121S0300000_2(this, c68322mC, c68322mC2, 2));
            return;
        }
        NLETrackSlot nLETrackSlot = (NLETrackSlot) c68322mC2.element;
        if (nLETrackSlot != null) {
            nLESegment = nLETrackSlot.LJI();
        } else {
            nLESegment = null;
        }
        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLESegment);
        if (LIZLLL != null) {
            NLEResourceAV LJ = LIZLLL.LJ();
            if (LJ != null) {
                str4 = LJ.LIZJ();
            } else {
                str4 = null;
            }
            if (o.LJ(str4, this.LIZJ.LIZ)) {
                StringBuilder sb3 = new StringBuilder(" 2.update ");
                NLENode nLENode4 = (NLENode) c68322mC.element;
                if (nLENode4 != null) {
                    str5 = nLENode4.getName();
                } else {
                    str5 = null;
                }
                sb3.append(str5);
                sb3.append(" slot ");
                NLENode nLENode5 = (NLENode) c68322mC2.element;
                if (nLENode5 != null) {
                    str6 = nLENode5.getName();
                }
                sb3.append(str6);
                sb3.append("  tips: only update ");
                sb3.append(C121704q6.class.getName());
                sb3.append(" get better performance");
                LJFF(sb3.toString());
                C121704q6 c121704q6 = new C121704q6(this.LIZJ);
                NLETrackSlot nLETrackSlot2 = (NLETrackSlot) c68322mC2.element;
                o.LJI(nLETrackSlot2);
                c121704q6.LJII(nLETrackSlot2);
                return;
            }
        }
        StringBuilder sb4 = new StringBuilder(" 2.delete and re-add ");
        NLENode nLENode6 = (NLENode) c68322mC.element;
        if (nLENode6 != null) {
            str3 = nLENode6.getName();
        } else {
            str3 = null;
        }
        sb4.append(str3);
        sb4.append(" slot ");
        NLENode nLENode7 = (NLENode) c68322mC2.element;
        if (nLENode7 != null) {
            str6 = nLENode7.getName();
        }
        sb4.append(str6);
        sb4.append(' ');
        LJFF(sb4.toString());
        NLETrack nLETrack2 = (NLETrack) c68322mC.element;
        o.LJI(nLETrack2);
        LJIIIIZZ(nleEditor, nLETrack2, new AqS149S0200000_2(c68322mC, c68322mC2, 78));
        LJII(nleEditor, this.LIZJ, new AqS121S0300000_2(this, c68322mC, c68322mC2, 3));
    }

    public static void LJII(NLEEditor nLEEditor, C121914qR c121914qR, InterfaceC88471Ynr interfaceC88471Ynr) {
        int i;
        NLETrack nLETrack = new NLETrack();
        C77357UXp.LJJJJL(nLETrack, c121914qR.LJIILIIL.name());
        NLEModel LJ = nLEEditor.LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        List LJIIZILJ = V0N.LJIIZILJ(LJ);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJIIZILJ, 10));
        Iterator it = ((ArrayList) LJIIZILJ).iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((NLETimeSpaceNode) it.next()).getLayer()));
        }
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                int intValue = ((Number) it2.next()).intValue();
                while (it2.hasNext()) {
                    int intValue2 = ((Number) it2.next()).intValue();
                    if (intValue < intValue2) {
                        intValue = intValue2;
                    }
                }
                i = intValue + 1;
            } else {
                throw new NoSuchElementException();
            }
        }
        nLETrack.setLayer(i);
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
        String str = c121914qR.LIZ;
        if (str != null) {
            NLEResourceAV nLEResourceAV = new NLEResourceAV();
            nLEResourceAV.LJIIIZ(str);
            nLEResourceAV.setDuration((c121914qR.LIZLLL - c121914qR.LIZJ) * 1000);
            nLESegmentAudio.LJIILL(nLEResourceAV);
        }
        nLETrackSlot.LJIIL(nLESegmentAudio);
        new C121704q6(c121914qR).LJII(nLETrackSlot);
        nLETrack.LIZIZ(nLETrackSlot);
        nLEEditor.LJ().addTrack(nLETrack);
        interfaceC88471Ynr.invoke(nLETrack, nLETrackSlot);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r3 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        r4 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r4.hasNext() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        r3 = r4.next();
        r2 = (com.bytedance.ies.nle.editor_jni.NLETrack) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r2.getLayer() != (r6.size() - 1)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r2.LJIILL().isEmpty() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        r5 = (com.bytedance.ies.nle.editor_jni.NLETrack) r5;
        r0 = r10.LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r0 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        r0.removeTrack(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(com.bytedance.ies.nle.editor_jni.NLEEditor r10, com.bytedance.ies.nle.editor_jni.NLETrack r11, X.InterfaceC65784Pro r12) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121924qS.LJIIIIZZ(com.bytedance.ies.nle.editor_jni.NLEEditor, com.bytedance.ies.nle.editor_jni.NLETrack, X.Pro):void");
    }
}
