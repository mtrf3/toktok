package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentHDRFilter;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4pd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121414pd implements InterfaceC122134qn {
    public C121574pt LIZ;
    public final C62822Ol8 LIZIZ;
    public final InterfaceC126684y8 LIZJ;
    public final InterfaceC88472Yns<AbstractC121974qX, C76800UCe> LIZLLL;

    @Override // X.InterfaceC122134qn
    public final InterfaceC121644q0 LIZ() {
        return (InterfaceC121644q0) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC122134qn
    public final C121574pt LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC122134qn
    public final void LJIIIZ(C121464pi c121464pi) {
        this.LIZLLL.invoke(new C121444pg(c121464pi));
    }

    @Override // X.InterfaceC121774qD
    public final void LJIILLIIL(NLEEditor editor) {
        NLETrackSlot nLETrackSlot;
        NLETrack nLETrack;
        boolean z;
        NLETrackSlot it;
        C121574pt c121574pt;
        o.LJIIIZ(editor, "editor");
        ArrayList arrayList = new ArrayList();
        NLEModel LJ = editor.LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        VecNLETrackSPtr tracks = LJ.getTracks();
        o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
        ArrayList arrayList2 = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            NLETrack next = it2.next();
            NLETrack it3 = next;
            o.LJIIIIZZ(it3, "it");
            if (true ^ TextUtils.isEmpty(C77357UXp.LJIIZILJ(it3))) {
                arrayList2.add(next);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (true) {
            int i = 0;
            if (!it4.hasNext()) {
                break;
            }
            NLETrack it5 = (NLETrack) it4.next();
            o.LJIIIIZZ(it5, "it");
            String LJIIZILJ = C77357UXp.LJIIZILJ(it5);
            EnumC121534pp enumC121534pp = EnumC121534pp.COLOR;
            if (o.LJ(LJIIZILJ, enumC121534pp.name())) {
                c121574pt = new C121574pt(enumC121534pp);
            } else {
                EnumC121534pp enumC121534pp2 = EnumC121534pp.BEAUTY;
                if (o.LJ(LJIIZILJ, enumC121534pp2.name())) {
                    c121574pt = new C121574pt(enumC121534pp2);
                } else {
                    EnumC121534pp enumC121534pp3 = EnumC121534pp.MULTI_SEGMENT;
                    if (o.LJ(LJIIZILJ, enumC121534pp3.name())) {
                        c121574pt = new C121574pt(enumC121534pp3);
                    } else {
                        c121574pt = new C121574pt(EnumC121534pp.Unknown);
                    }
                }
            }
            c121574pt.LIZ = it5.getUUID();
            Iterator<NLETrackSlot> it6 = it5.LJIILL().iterator();
            while (it6.hasNext()) {
                NLETrackSlot slot = it6.next();
                o.LJIIIIZZ(slot, "slot");
                NLESegmentComposerFilter LJIIIIZZ = NLESegmentComposerFilter.LJIIIIZZ(slot.LJI());
                if (LJIIIIZZ != null) {
                    NLEResourceNode LJ2 = LJIIIIZZ.LJ();
                    o.LJIIIIZZ(LJ2, "segment.effectSDKFilter");
                    String filePath = LJ2.LIZJ();
                    o.LJIIIIZZ(filePath, "filePath");
                    NLEResourceNode LJ3 = LJIIIIZZ.LJ();
                    o.LJIIIIZZ(LJ3, "segment.effectSDKFilter");
                    String LIZLLL = LJ3.LIZLLL();
                    o.LJIIIIZZ(LIZLLL, "segment.effectSDKFilter.resourceId");
                    c121574pt.LIZLLL(filePath, LIZLLL);
                    if (LJIIIIZZ.getExtraKeys().size() > 0) {
                        VecString extraKeys = LJIIIIZZ.getExtraKeys();
                        String VecString_doGet = NLEEditorJniJNI.VecString_doGet(extraKeys.LJLIL, extraKeys, i);
                        o.LJIIIIZZ(VecString_doGet, "segment.extraKeys[0]");
                        c121574pt.LIZIZ(filePath, VecString_doGet);
                    }
                    Iterator<NLEStringFloatPair> it7 = LJIIIIZZ.LJIIIZ().iterator();
                    while (it7.hasNext()) {
                        NLEStringFloatPair effectNodeKeyValuePair = it7.next();
                        o.LJIIIIZZ(effectNodeKeyValuePair, "effectNodeKeyValuePair");
                        String NLEStringFloatPair_getFirst = NLEEditorJniJNI.NLEStringFloatPair_getFirst(effectNodeKeyValuePair.LIZ, effectNodeKeyValuePair);
                        o.LJIIIIZZ(NLEStringFloatPair_getFirst, "effectNodeKeyValuePair.first");
                        c121574pt.LIZJ(filePath, NLEStringFloatPair_getFirst, Float.valueOf(NLEEditorJniJNI.NLEStringFloatPair_getSecond(effectNodeKeyValuePair.LIZ, effectNodeKeyValuePair)));
                        i = 0;
                    }
                }
            }
            if (it5.getEnable()) {
                EnumC121524po enumC121524po = EnumC121524po.ENABLE;
                o.LJIIIZ(enumC121524po, "<set-?>");
                c121574pt.LIZIZ = enumC121524po;
            } else {
                String extra = it5.getExtra("FilterEnableReason");
                if (extra == null || extra.length() == 0) {
                    EnumC121524po enumC121524po2 = EnumC121524po.EMPTY;
                    o.LJIIIZ(enumC121524po2, "<set-?>");
                    c121574pt.LIZIZ = enumC121524po2;
                } else {
                    EnumC121524po valueOf = EnumC121524po.valueOf(extra);
                    o.LJIIIZ(valueOf, "<set-?>");
                    c121574pt.LIZIZ = valueOf;
                }
            }
            arrayList.add(c121574pt);
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            C121574pt c121574pt2 = (C121574pt) it8.next();
            if (C121424pe.LIZ[c121574pt2.LJ.ordinal()] == 1) {
                this.LIZ = c121574pt2;
            }
        }
        NLEModel LJ4 = editor.LJ();
        o.LJIIIIZZ(LJ4, "nleEditor.model");
        VecNLETrackSPtr tracks2 = LJ4.getTracks();
        o.LJIIIIZZ(tracks2, "nleEditor.model.tracks");
        Iterator<NLETrack> it9 = tracks2.iterator();
        while (true) {
            nLETrackSlot = null;
            if (it9.hasNext()) {
                nLETrack = it9.next();
                NLETrack it10 = nLETrack;
                o.LJIIIIZZ(it10, "it");
                if (o.LJ(C77357UXp.LJIIZILJ(it10), EnumC121544pq.HDR.name())) {
                    break;
                }
            } else {
                nLETrack = null;
                break;
            }
        }
        NLETrack nLETrack2 = nLETrack;
        if (nLETrack2 != null) {
            Iterator<NLETrackSlot> it11 = nLETrack2.LJIILL().iterator();
            loop6: while (true) {
                z = false;
                while (it11.hasNext()) {
                    it = it11.next();
                    o.LJIIIIZZ(it, "it");
                    NLESegmentHDRFilter LJIIIIZZ2 = NLESegmentHDRFilter.LJIIIIZZ(it.LJI());
                    if (LJIIIIZZ2 != null) {
                        if (o.LJ(LJIIIIZZ2.LJFF(), NLEEditorJniJNI.NLEFilterName_getVIDEO_LENS_HDR())) {
                            nLETrackSlot = it;
                            z = true;
                        } else if (o.LJ(LJIIIIZZ2.LJFF(), NLEEditorJniJNI.NLEFilterName_getLENS_HDR())) {
                            break;
                        }
                    }
                }
                nLETrackSlot = it;
            }
            if (nLETrackSlot != null) {
                if (z) {
                    new C121454ph();
                    NLESegmentHDRFilter LJIIIIZZ3 = NLESegmentHDRFilter.LJIIIIZZ(nLETrackSlot.LJI());
                    if (LJIIIIZZ3 == null) {
                        return;
                    }
                    NLEResourceNode LJ5 = LJIIIIZZ3.LJ();
                    o.LJIIIIZZ(LJ5, "hdrFilter.effectSDKFilter");
                    LJ5.LIZJ();
                    NLEEditorJniJNI.NLESegmentHDRFilter_getFrameType(LJIIIIZZ3.LJ, LJIIIIZZ3);
                    NLEEditorJniJNI.NLESegmentHDRFilter_getFilePath(LJIIIIZZ3.LJ, LJIIIIZZ3);
                    NLEEditorJniJNI.NLESegmentHDRFilter_getDenoise(LJIIIIZZ3.LJ, LJIIIIZZ3);
                    if (NLEEditorJniJNI.NLESegmentHDRFilter_hasAsfMode(LJIIIIZZ3.LJ, LJIIIIZZ3)) {
                        Integer.valueOf(NLEEditorJniJNI.NLESegmentHDRFilter_getAsfMode(LJIIIIZZ3.LJ, LJIIIIZZ3));
                    }
                    if (!NLEEditorJniJNI.NLESegmentHDRFilter_hasHdrMode(LJIIIIZZ3.LJ, LJIIIIZZ3)) {
                        return;
                    }
                    Integer.valueOf(NLEEditorJniJNI.NLESegmentHDRFilter_getHdrMode(LJIIIIZZ3.LJ, LJIIIIZZ3));
                    return;
                }
                new C121464pi();
                NLESegmentHDRFilter LJIIIIZZ4 = NLESegmentHDRFilter.LJIIIIZZ(nLETrackSlot.LJI());
                if (LJIIIIZZ4 == null) {
                    return;
                }
                NLEResourceNode LJ6 = LJIIIIZZ4.LJ();
                o.LJIIIIZZ(LJ6, "hdrFilter.effectSDKFilter");
                LJ6.LIZJ();
                return;
            }
        }
        new C121464pi();
    }

    @Override // X.InterfaceC122134qn
    public final void LJJIIJZLJL(final C121574pt c121574pt) {
        if (c121574pt == null) {
            final C121574pt c121574pt2 = this.LIZ;
            if (c121574pt2 != null) {
                this.LIZLLL.invoke(new AbstractC121974qX(c121574pt2) { // from class: X.4pc
                    public final C121574pt LIZIZ;

                    {
                        this.LIZIZ = c121574pt2;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(" 0.init ");
                        LIZ.append(c121574pt2);
                        LJFF(X1D.LIZIZ(LIZ));
                    }

                    @Override // X.AbstractC121974qX
                    public final void LIZJ(NLEEditor nleEditor) {
                        NLETrack nLETrack;
                        o.LJIIIZ(nleEditor, "nleEditor");
                        NLEModel LJ = nleEditor.LJ();
                        o.LJIIIIZZ(LJ, "nleEditor.model");
                        VecNLETrackSPtr tracks = LJ.getTracks();
                        o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
                        Iterator<NLETrack> it = tracks.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                nLETrack = it.next();
                                NLETrack it2 = nLETrack;
                                o.LJIIIIZZ(it2, "it");
                                if (o.LJ(C77357UXp.LJIIZILJ(it2), this.LIZIZ.LJ.name())) {
                                    break;
                                }
                            } else {
                                nLETrack = null;
                                break;
                            }
                        }
                        NLETrack nLETrack2 = nLETrack;
                        if (nLETrack2 != null) {
                            nleEditor.LJ().removeTrack(nLETrack2);
                        }
                    }
                });
                this.LIZ = null;
                return;
            }
            return;
        }
        this.LIZLLL.invoke(new AbstractC121974qX(c121574pt) { // from class: X.4pj
            public final C121574pt LIZIZ;

            {
                o.LJIIIZ(c121574pt, "params");
                this.LIZIZ = c121574pt;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" 0.init ");
                LIZ.append(c121574pt);
                LJFF(X1D.LIZIZ(LIZ));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0145  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x017c A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
            @Override // X.AbstractC121974qX
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(com.bytedance.ies.nle.editor_jni.NLEEditor r24) {
                /*
                    Method dump skipped, instructions count: 859
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C121474pj.LIZJ(com.bytedance.ies.nle.editor_jni.NLEEditor):void");
            }

            public static void LJII(NLESegmentComposerFilter nLESegmentComposerFilter, C121494pl c121494pl) {
                String[] strArr = new String[1];
                String str = c121494pl.LIZ;
                if (str == null) {
                    str = "";
                }
                strArr[0] = str;
                nLESegmentComposerFilter.LJIIJ(new VecString(strArr));
                for (Map.Entry<String, Float> entry : c121494pl.LIZIZ.entrySet()) {
                    String key = entry.getKey();
                    float floatValue = entry.getValue().floatValue();
                    Iterator<NLEStringFloatPair> it = nLESegmentComposerFilter.LJIIIZ().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            NLEStringFloatPair it2 = it.next();
                            o.LJIIIIZZ(it2, "it");
                            if (o.LJ(NLEEditorJniJNI.NLEStringFloatPair_getFirst(it2.LIZ, it2), key)) {
                                it2.LIZIZ(floatValue);
                                break;
                            }
                        } else {
                            NLEStringFloatPair nLEStringFloatPair = new NLEStringFloatPair();
                            NLEEditorJniJNI.NLEStringFloatPair_setFirst(nLEStringFloatPair.LIZ, nLEStringFloatPair, key);
                            nLEStringFloatPair.LIZIZ(floatValue);
                            NLEEditorJniJNI.NLESegmentComposerFilter_addEffectNodeKeyValuePair(nLESegmentComposerFilter.LJ, nLESegmentComposerFilter, NLEStringFloatPair.LIZ(nLEStringFloatPair), nLEStringFloatPair);
                            break;
                        }
                    }
                }
            }
        });
        this.LIZ = c121574pt;
    }

    public C121414pd(InterfaceC126684y8 nleSession, AqS168S0100000_2 aqS168S0100000_2) {
        o.LJIIIZ(nleSession, "nleSession");
        this.LIZJ = nleSession;
        this.LIZLLL = aqS168S0100000_2;
        new C121574pt(EnumC121534pp.BEAUTY);
        this.LIZIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 720));
    }
}
