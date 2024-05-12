package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import java.util.Iterator;
import kotlin.jvm.internal.AqS48S0400000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C125214vl extends AbstractC125294vt {
    @Override // X.AbstractC125294vt
    public final void LIZJ(C125284vs request, AqS48S0400000_2 aqS48S0400000_2) {
        String extra;
        String extra2;
        o.LJIIIZ(request, "request");
        C125184vi c125184vi = request.LIZIZ;
        C125244vo c125244vo = c125184vi.LJLIL;
        String str = c125244vo.LIZIZ;
        String str2 = c125244vo.LIZJ;
        NLETrackSlot nLETrackSlot = c125184vi.LJLILLLLZI;
        Iterator<NLEVideoEffect> it = nLETrackSlot.LJIIJ().iterator();
        while (it.hasNext()) {
            NLEVideoEffect next = it.next();
            if (next.hasExtra("ep_magic_resource_id") && (extra2 = next.getExtra("ep_magic_resource_id")) != null && (!ujb.o.LJJJJJL(extra2)) && o.LJ(str, extra2)) {
                NLEEditorJniJNI.NLETrackSlot_removeVideoEffect(nLETrackSlot.LIZ, nLETrackSlot, NLEVideoEffect.LIZ(next), next);
                C125204vk.LIZLLL(nLETrackSlot, str, str2);
                aqS48S0400000_2.invoke(new C125234vn(true, null));
                return;
            }
        }
        Iterator<NLEFilter> it2 = nLETrackSlot.LJ().iterator();
        while (it2.hasNext()) {
            NLEFilter next2 = it2.next();
            if (next2.hasExtra("ep_magic_resource_id") && (extra = next2.getExtra("ep_magic_resource_id")) != null && (!ujb.o.LJJJJJL(extra)) && o.LJ(str, extra)) {
                NLEEditorJniJNI.NLETrackSlot_removeFilter(nLETrackSlot.LIZ, nLETrackSlot, NLEFilter.LIZ(next2), next2);
                C125204vk.LIZLLL(nLETrackSlot, str, str2);
                aqS48S0400000_2.invoke(new C125234vn(true, null));
                return;
            }
        }
        aqS48S0400000_2.invoke(new C125234vn(true, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        if (r5.isEmpty() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        r0 = r23.LIZIZ;
        r15 = r0.LJLILLLLZI;
        r1 = r0.LJLIL;
        r2 = r1.LIZIZ;
        r0 = r1.LIZJ;
        r5 = r1.LIZLLL;
        X.C125204vk.LIZIZ(r15, r2, r0);
        r0 = r8.LJIIJ();
        r7 = new java.util.ArrayList();
        r6 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r6.hasNext() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
    
        r1 = r6.next();
        r0 = r1;
        kotlin.jvm.internal.o.LJIIIIZZ(r0, "it");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        if ((!X.C125204vk.LJFF(r0)) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        r7.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
    
        r12 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        if (r12.hasNext() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        r0 = (com.bytedance.ies.nle.editor_jni.NLENode) r12.next();
        r0.setExtra("ep_magic_resource_id", r2);
        r0.setExtra("ep_client_magic_resource_path", r5);
        r0.setExtra("is_from_ep_magic", "true");
        r6 = r0.deepClone(true);
        r0 = com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLEVideoEffect_dynamicCast(com.bytedance.ies.nle.editor_jni.NLENode.getCPtr(r6), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e1, code lost:
    
        if (r0 != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e3, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e4, code lost:
    
        com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLETrackSlot_addVideoEffect(r15.LIZ, r15, com.bytedance.ies.nle.editor_jni.NLEVideoEffect.LIZ(r6), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f0, code lost:
    
        r6 = new com.bytedance.ies.nle.editor_jni.NLEVideoEffect(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f6, code lost:
    
        r12 = r8.LJ().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
    
        if (r12.hasNext() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0104, code lost:
    
        r0 = r12.next();
        r0.setExtra("ep_magic_resource_id", r2);
        r0.setExtra("ep_client_magic_resource_path", r5);
        r0.setExtra("is_from_ep_magic", "true");
        r8 = r0.deepClone(true);
        r0 = com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLEFilter_dynamicCast(com.bytedance.ies.nle.editor_jni.NLENode.getCPtr(r8), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0121, code lost:
    
        if (r0 != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0123, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0124, code lost:
    
        com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLETrackSlot_addFilter(r15.LIZ, r15, com.bytedance.ies.nle.editor_jni.NLEFilter.LIZ(r8), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0134, code lost:
    
        r8 = new com.bytedance.ies.nle.editor_jni.NLEFilter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013a, code lost:
    
        r24.invoke(new X.C125234vn(true, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0142, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a7, code lost:
    
        r24.invoke(new X.C125234vn(true, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00af, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0067, code lost:
    
        if (r0 != false) goto L17;
     */
    @Override // X.AbstractC125294vt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZ(X.C125284vs r23, kotlin.jvm.internal.AqS48S0400000_2 r24, X.InterfaceC88472Yns r25) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125214vl.LIZ(X.4vs, kotlin.jvm.internal.AqS48S0400000_2, X.Yns):void");
    }
}
