package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.4vM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124964vM extends C124704uw implements InterfaceC125094vZ {
    public NLETrackSlot LJLJJLL;
    public NLETrackSlot LJLJL;
    public final long LJLJLJ;

    public final long LJJLIIIJILLIZJL() {
        long duration;
        NLETrackSlot nLETrackSlot = this.LJLJJLL;
        if (nLETrackSlot == null || this.LJLJL == null) {
            return 0L;
        }
        o.LJI(nLETrackSlot);
        long duration2 = nLETrackSlot.getDuration();
        NLETrackSlot nLETrackSlot2 = this.LJLJL;
        o.LJI(nLETrackSlot2);
        if (duration2 > nLETrackSlot2.getDuration()) {
            NLETrackSlot nLETrackSlot3 = this.LJLJL;
            o.LJI(nLETrackSlot3);
            duration = nLETrackSlot3.getDuration() / 2;
        } else {
            NLETrackSlot nLETrackSlot4 = this.LJLJJLL;
            o.LJI(nLETrackSlot4);
            duration = nLETrackSlot4.getDuration() / 2;
        }
        long j = this.LJLJLJ;
        if (duration > j) {
            return j;
        }
        return duration;
    }

    @Override // X.InterfaceC125094vZ
    public final NLETrackSlot LIZ() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC125094vZ
    public final NLETrackSlot LJ() {
        return this.LJLJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C124964vM(InterfaceC124924vI editorContext) {
        super(editorContext);
        o.LJIIIZ(editorContext, "editorContext");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.toMicros(1000L);
        timeUnit.toMicros(100L);
        this.LJLJLJ = timeUnit.toMicros(5000L);
    }

    @Override // X.InterfaceC125094vZ
    public final void LJJI(long j) {
        long j2;
        NLESegmentTransition LIZLLL;
        this.LJLIL.getMainTrack();
        NLETrackSlot nLETrackSlot = this.LJLJJLL;
        if (nLETrackSlot != null) {
            long measuredEndTime = nLETrackSlot.getMeasuredEndTime();
            NLETrackSlot nLETrackSlot2 = this.LJLJJLL;
            if (nLETrackSlot2 != null && (LIZLLL = nLETrackSlot2.LIZLLL()) != null && LIZLLL.LJ()) {
                j2 = j;
            } else {
                j2 = j / 2;
            }
            long j3 = measuredEndTime - j2;
            this.LJLJJL.aa(j3, j3 + j, false, false);
        }
    }

    @Override // X.InterfaceC125094vZ
    public final void LJIIZILJ(C124984vO c124984vO, EnumC124724uy enumC124724uy) {
        VecNLETrackSlotSPtr LJIILLIIL = this.LJLIL.getMainTrack().LJIILLIIL();
        if (LJIILLIIL.size() <= 1) {
            return;
        }
        Iterator<NLETrackSlot> it = LJIILLIIL.iterator();
        int i = 0;
        while (it.hasNext()) {
            NLETrackSlot next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                NLETrackSlot nLETrackSlot = next;
                if (i != LJIILLIIL.size() - 1) {
                    if (c124984vO.LIZJ.length() == 0) {
                        nLETrackSlot.LJIIJJI(null);
                    } else {
                        NLESegmentTransition LIZLLL = nLETrackSlot.LIZLLL();
                        if (LIZLLL == null) {
                            LIZLLL = new NLESegmentTransition();
                        }
                        NLEEditorJniJNI.NLESegmentTransition_setTransitionDuration(LIZLLL.LIZJ, LIZLLL, c124984vO.LIZLLL);
                        NLEResourceNode nLEResourceNode = new NLEResourceNode();
                        nLEResourceNode.LJIIIZ(c124984vO.LIZJ);
                        NLEEditorJniJNI.NLESegmentTransition_setEffectSDKTransition(LIZLLL.LIZJ, LIZLLL, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
                        NLEEditorJniJNI.NLESegmentTransition_setOverlap(LIZLLL.LIZJ, LIZLLL, c124984vO.LJ);
                        if (c124984vO.LJ) {
                            C124864vC.LIZLLL(r9());
                        }
                        LIZLLL.setExtra("transition_tab", c124984vO.LIZ);
                        LIZLLL.setExtra("transition_position", String.valueOf(c124984vO.LIZIZ));
                        LIZLLL.setExtra("transition_max_duration", String.valueOf(LJJLIIIJILLIZJL()));
                        String str = c124984vO.LJI;
                        if (str != null && str.length() != 0) {
                            LIZLLL.setExtra("transition_name", c124984vO.LJI);
                        }
                        nLETrackSlot.LJIIJJI(LIZLLL);
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        this.LJLIL.getMainTrack().LJJIFFI();
        LJJJZ(enumC124724uy, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L10;
     */
    @Override // X.InterfaceC125094vZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(X.C124984vO r13, X.EnumC124724uy r14) {
        /*
            r12 = this;
            java.lang.String r0 = "param"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r4 = r12.LJLJJLL
            r5 = 0
            if (r4 != 0) goto L47
        La:
            java.lang.String r2 = r13.LJFF
            java.lang.String r1 = "slot_extra_transition_effect_id"
            if (r2 == 0) goto L1b
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r12.LJLJJLL
            if (r0 == 0) goto L1b
            r0.setExtra(r1, r2)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L22
        L1b:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r12.LJLJJLL
            if (r0 == 0) goto L22
            r0.removeExtraWithKey(r1)
        L22:
            java.lang.String r2 = r13.LJII
            java.lang.String r1 = "slot_extra_transition_resource_id"
            if (r2 == 0) goto L33
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r12.LJLJJLL
            if (r0 == 0) goto L33
            r0.setExtra(r1, r2)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L3a
        L33:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r12.LJLJJLL
            if (r0 == 0) goto L3a
            r0.removeExtraWithKey(r1)
        L3a:
            X.4vI r0 = r12.LJLIL
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r0.getMainTrack()
            r0.LJJIFFI()
            r12.LJJJZ(r14, r5)
            return
        L47:
            java.lang.String r0 = r13.LIZJ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L54
            r8 = r5
        L50:
            r4.LJIIJJI(r8)
            goto La
        L54:
            com.bytedance.ies.nle.editor_jni.NLESegmentTransition r8 = new com.bytedance.ies.nle.editor_jni.NLESegmentTransition
            r8.<init>()
            long r2 = r13.LIZLLL
            long r0 = r8.LIZJ
            com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLESegmentTransition_setTransitionDuration(r0, r8, r2)
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r11 = new com.bytedance.ies.nle.editor_jni.NLEResourceNode
            r11.<init>()
            java.lang.String r0 = r13.LIZJ
            r11.LJIIIZ(r0)
            long r6 = r8.LIZJ
            long r9 = com.bytedance.ies.nle.editor_jni.NLEResourceNode.LIZ(r11)
            com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLESegmentTransition_setEffectSDKTransition(r6, r8, r9, r11)
            boolean r2 = r13.LJ
            long r0 = r8.LIZJ
            com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLESegmentTransition_setOverlap(r0, r8, r2)
            boolean r0 = r13.LJ
            if (r0 == 0) goto L85
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r12.r9()
            X.C124864vC.LIZLLL(r0)
        L85:
            int r0 = r13.LIZIZ
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "transition_position"
            r8.setExtra(r0, r1)
            java.lang.String r1 = "transition_tab"
            java.lang.String r0 = r13.LIZ
            r8.setExtra(r1, r0)
            long r0 = r12.LJJLIIIJILLIZJL()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "transition_max_duration"
            r8.setExtra(r0, r1)
            java.lang.String r1 = r13.LJI
            if (r1 == 0) goto L50
            java.lang.String r0 = "transition_name"
            r8.setExtra(r0, r1)
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124964vM.LJIJJ(X.4vO, X.4uy):void");
    }

    @Override // X.InterfaceC125094vZ
    public final void LJJJLL(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        this.LJLJJLL = nLETrackSlot;
        this.LJLJL = nLETrackSlot2;
    }
}
