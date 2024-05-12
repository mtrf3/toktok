package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecString;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.4rs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122804rs extends C124704uw implements InterfaceC122854rx {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C122804rs(InterfaceC124924vI editorContext) {
        super(editorContext);
        o.LJIIIZ(editorContext, "editorContext");
    }

    public static NLETrackSlot LJJLIIIJILLIZJL(C122814rt c122814rt) {
        EnumC123834tX enumC123834tX;
        if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_NLE_COMPOSER_FOR_EFFECT, Boolean.FALSE)).booleanValue() && !c122814rt.LJLJL) {
            NLETrackSlot nLETrackSlot = new NLETrackSlot();
            NLESegmentComposerFilter nLESegmentComposerFilter = new NLESegmentComposerFilter();
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.LJIIL(EnumC123834tX.NORMAL);
            nLEResourceNode.LJIIIZ(c122814rt.LJLIL);
            nLEResourceNode.LJIIJJI(c122814rt.LJLILLLLZI);
            nLEResourceNode.LJIIJ(c122814rt.LJLJI);
            nLEResourceNode.LJIILIIL(EnumC123874tb.EFFECT);
            nLESegmentComposerFilter.LJI(nLEResourceNode);
            NLEEditorJniJNI.NLESegmentComposerFilter_setStatus(nLESegmentComposerFilter.LJ, nLESegmentComposerFilter, 1);
            nLESegmentComposerFilter.LJII(c122814rt.LJLILLLLZI);
            nLESegmentComposerFilter.LJIIJ(new VecString(new String[]{c122814rt.LJLJJI}));
            nLETrackSlot.LJIIL(nLESegmentComposerFilter);
            nLETrackSlot.setStartTime(c122814rt.LJLJJL);
            nLETrackSlot.setEndTime(c122814rt.LJLJJL + c122814rt.LJLJJLL);
            return nLETrackSlot;
        }
        NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
        NLESegmentEffect nLESegmentEffect = new NLESegmentEffect();
        NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
        if (c122814rt.LJLJL) {
            enumC123834tX = EnumC123834tX.AMAZING;
        } else {
            enumC123834tX = EnumC123834tX.NORMAL;
        }
        nLEResourceNode2.LJIIL(enumC123834tX);
        nLEResourceNode2.LJIIIZ(c122814rt.LJLIL);
        nLEResourceNode2.LJIIJJI(c122814rt.LJLILLLLZI);
        nLEResourceNode2.LJIIJ(c122814rt.LJLJI);
        nLEResourceNode2.LJIILIIL(EnumC123874tb.EFFECT);
        nLESegmentEffect.LJFF(nLEResourceNode2);
        if (c122814rt.LJLJL) {
            NLEEditorJniJNI.NLESegmentEffect_setApplyTargetType(nLESegmentEffect.LIZJ, nLESegmentEffect, c122814rt.LJLJLJ);
            try {
                JSONObject jSONObject = new JSONObject(c122814rt.LJLJLLL);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "adjustObj.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    NLEStringFloatPair nLEStringFloatPair = new NLEStringFloatPair();
                    NLEEditorJniJNI.NLEStringFloatPair_setFirst(nLEStringFloatPair.LIZ, nLEStringFloatPair, next);
                    nLEStringFloatPair.LIZIZ((float) jSONObject.optDouble(next));
                    NLEEditorJniJNI.NLESegmentEffect_addAdjustParams(nLESegmentEffect.LIZJ, nLESegmentEffect, NLEStringFloatPair.LIZ(nLEStringFloatPair), nLEStringFloatPair);
                }
            } catch (Exception unused) {
            }
        }
        NLEEditorJniJNI.NLESegmentEffect_setEffectName(nLESegmentEffect.LIZJ, nLESegmentEffect, c122814rt.LJLILLLLZI);
        nLETrackSlot2.LJIIL(nLESegmentEffect);
        nLETrackSlot2.setStartTime(c122814rt.LJLJJL);
        nLETrackSlot2.setEndTime(c122814rt.LJLJJL + c122814rt.LJLJJLL);
        return nLETrackSlot2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (X.C124574uj.LJJJIL(r2) == true) goto L7;
     */
    @Override // X.InterfaceC122854rx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ<com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETrackSlot> LJJIII(com.bytedance.ies.nle.editor_jni.NLETrackSlot r4, X.EnumC124724uy r5) {
        /*
            r3 = this;
            if (r4 != 0) goto L1e
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r4 = r3.LJJLIIIJ()
            com.bytedance.ies.nle.editor_jni.NLETrack r2 = r3.LJJLIIIIJ()
        La:
            if (r2 == 0) goto L1c
            boolean r1 = X.C124574uj.LJJJIL(r2)
            r0 = 1
            if (r1 != r0) goto L1c
        L13:
            r1 = 0
            if (r0 != 0) goto L29
            X.OSZ r0 = new X.OSZ
            r0.<init>(r1, r1)
            return r0
        L1c:
            r0 = 0
            goto L13
        L1e:
            X.4vI r0 = r3.LJLIL
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C79057V0z.LJJI(r0)
            com.bytedance.ies.nle.editor_jni.NLETrack r2 = r0.getTrackBySlot(r4)
            goto La
        L29:
            r2.LJIJJLI(r4)
            r3.LJJJZ(r5, r1)
            X.OSZ r0 = new X.OSZ
            r0.<init>(r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122804rs.LJJIII(com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.4uy):X.OSZ");
    }

    @Override // X.InterfaceC122854rx
    public final NLETrackSlot LJIJJLI(NLETrack nLETrack, C122834rv c122834rv, EnumC124724uy enumC124724uy) {
        NLETrackSlot nLETrackSlot = c122834rv.LIZ;
        if (nLETrackSlot == null) {
            nLETrackSlot = LJJLIIIJ();
        }
        if (nLETrackSlot == null) {
            return null;
        }
        NLETrackSlot LIZ = NLETrackSlot.LIZ(nLETrackSlot.deepClone(true));
        LIZ.setStartTime(c122834rv.LIZIZ);
        LIZ.setEndTime(c122834rv.LIZIZ + c122834rv.LIZJ);
        LIZ.setTransformZ(nLETrack.getLayer() + 10000);
        nLETrack.LIZIZ(LIZ);
        LJJJZ(enumC124724uy, null);
        return LIZ;
    }

    @Override // X.InterfaceC122854rx
    public final NLETrackSlot LJJ(NLETrackSlot nLETrackSlot, C122814rt c122814rt, EnumC124724uy enumC124724uy) {
        NLETrack trackBySlot;
        if (nLETrackSlot == null) {
            nLETrackSlot = LJJLIIIJ();
        }
        if (nLETrackSlot == null || (trackBySlot = C79057V0z.LJJI(this.LJLIL).getTrackBySlot(nLETrackSlot)) == null) {
            return null;
        }
        trackBySlot.LJIJJLI(nLETrackSlot);
        NLETrackSlot LJJLIIIJILLIZJL = LJJLIIIJILLIZJL(c122814rt);
        LJJLIIIJILLIZJL.setTransformZ(trackBySlot.getLayer() + 10000);
        trackBySlot.LIZIZ(LJJLIIIJILLIZJL);
        LJJJZ(enumC124724uy, null);
        return LJJLIIIJILLIZJL;
    }

    @Override // X.InterfaceC122854rx
    public final NLETrackSlot LJJJLZIJ(NLETrack nLETrack, C122814rt c122814rt, EnumC124724uy enumC124724uy) {
        int i;
        NLETrackSlot LJJLIIIJILLIZJL = LJJLIIIJILLIZJL(c122814rt);
        if (nLETrack != null) {
            LJJLIIIJILLIZJL.setTransformZ(nLETrack.getLayer() + 10000);
            nLETrack.LIZIZ(LJJLIIIJILLIZJL);
        } else {
            if (C124574uj.LJIILIIL(r9()).isEmpty()) {
                i = 0;
            } else {
                Iterator<NLETrack> it = C124574uj.LJIILIIL(r9()).iterator();
                if (it.hasNext()) {
                    int layer = it.next().getLayer();
                    while (it.hasNext()) {
                        int layer2 = it.next().getLayer();
                        if (layer < layer2) {
                            layer = layer2;
                        }
                    }
                    i = layer + 1;
                } else {
                    throw new NoSuchElementException();
                }
            }
            NLETrack nLETrack2 = new NLETrack();
            nLETrack2.LJJ(false);
            nLETrack2.setLayer(i);
            C124574uj.LJJLIIIJILLIZJL(nLETrack2, "video_effect");
            nLETrack2.LJIL(EnumC123864ta.EFFECT);
            nLETrack2.setExtra("EffectTrackType", "NORMAL");
            C124574uj.LJJLI(nLETrack2);
            LJJLIIIJILLIZJL.setTransformZ(i + 10000);
            nLETrack2.LIZIZ(LJJLIIIJILLIZJL);
            r9().addTrack(nLETrack2);
        }
        LJJJZ(enumC124724uy, null);
        return LJJLIIIJILLIZJL;
    }
}
