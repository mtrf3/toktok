package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.fuctiontrack.audio.AudioItemView$getWavePointsDataSync$1$1", f = "AudioItemHolder.kt", l = {664}, m = "invokeSuspend")
/* renamed from: X.5Cp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131115Cp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ NLETrackSlot LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<ArrayList<OSZ<Long, Float>>, C76800UCe> LJLJI;
    public final /* synthetic */ ArrayList<OSZ<Long, Float>> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C131115Cp(NLETrackSlot nLETrackSlot, InterfaceC88472Yns<? super ArrayList<OSZ<Long, Float>>, C76800UCe> interfaceC88472Yns, ArrayList<OSZ<Long, Float>> arrayList, InterfaceC67352kd<? super C131115Cp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = nLETrackSlot;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = arrayList;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C131115Cp(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0094 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLIL
            r5 = 33
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto Ld7
            X.C141335gf.LIZJ(r12)
        Lf:
            float[] r12 = (float[]) r12
            java.util.ArrayList<X.OSZ<java.lang.Long, java.lang.Float>> r9 = r11.LJLJJI
            int r8 = r12.length
            r0 = 0
        L15:
            if (r4 >= r8) goto Lcd
            r7 = r12[r4]
            int r6 = r0 + 1
            X.OSZ r5 = new X.OSZ
            int r0 = r0 * 33
            long r2 = (long) r0
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r2)
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r7)
            r5.<init>(r1, r0)
            r9.add(r5)
            int r4 = r4 + 1
            r0 = r6
            goto L15
        L34:
            X.C141335gf.LIZJ(r12)
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r7 = r11.LJLILLLLZI
            java.lang.Class<com.bytedance.ies.nle.editor_jni.NLESegmentAudio> r2 = com.bytedance.ies.nle.editor_jni.NLESegmentAudio.class
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.Class<com.bytedance.ies.nle.editor_jni.NLENode> r0 = com.bytedance.ies.nle.editor_jni.NLENode.class
            r1[r4] = r0
            java.lang.String r0 = "LIZLLL"
            java.lang.reflect.Method r2 = r2.getMethod(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r7.LJI()
            r1[r4] = r0
            r0 = 0
            java.lang.Object r2 = r2.invoke(r0, r1)
            com.bytedance.ies.nle.editor_jni.NLESegmentAudio r2 = (com.bytedance.ies.nle.editor_jni.NLESegmentAudio) r2
            if (r2 == 0) goto L95
            long r0 = r2.LIZJ
            int r1 = com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLESegmentAudio_getRepeatCount(r0, r2)
            int r0 = com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLESegmentAudio_REPEAT_INFINITE_get()
            if (r1 != r0) goto L95
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r11.LJLILLLLZI
            long r1 = r0.getMeasuredEndTime()
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r11.LJLILLLLZI
            long r7 = r0.getMeasuredStartTime()
        L70:
            long r1 = r1 - r7
        L71:
            X.2tE r10 = X.C72682tE.LIZ
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r11.LJLILLLLZI
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r0.LJI()
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = r0.LIZIZ()
            java.lang.String r9 = r0.LIZJ()
            java.lang.String r0 = "slot.mainSegment.resource.resourceFile"
            kotlin.jvm.internal.o.LJIIIIZZ(r9, r0)
            r7 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r7
            long r7 = (long) r5
            long r1 = r1 / r7
            int r0 = (int) r1
            r11.LJLIL = r3
            java.lang.Object r12 = r10.LIZ(r9, r0, r11)
            if (r12 != r6) goto Lf
            return r6
        L95:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r11.LJLILLLLZI
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r0.LJI()
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = r0.LIZIZ()
            long r7 = r0.getDuration()
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto Lbe
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r11.LJLILLLLZI
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r0.LJI()
            com.bytedance.ies.nle.editor_jni.NLESegmentAudio r0 = com.bytedance.ies.nle.editor_jni.NLESegmentAudio.LIZLLL(r0)
            if (r0 == 0) goto L71
            long r1 = r0.LJIIL()
            long r7 = r0.LJIILIIL()
            goto L70
        Lbe:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r11.LJLILLLLZI
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r0.LJI()
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = r0.LIZIZ()
            long r1 = r0.getDuration()
            goto L71
        Lcd:
            X.Yns<java.util.ArrayList<X.OSZ<java.lang.Long, java.lang.Float>>, X.UCe> r1 = r11.LJLJI
            java.util.ArrayList<X.OSZ<java.lang.Long, java.lang.Float>> r0 = r11.LJLJJI
            r1.invoke(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Ld7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131115Cp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
