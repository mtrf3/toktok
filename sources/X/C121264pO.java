package X;

import Y.IDComparatorS30S0000000_2;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentImageSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentSubtitleSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextTemplate;
import com.bytedance.ies.nle.editor_jni.NLEStyStickerAnim;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.ies.nle.editor_jni.NLETextTemplateClip;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.4pO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121264pO implements C5WG {
    public Boolean LIZ;
    public final HashMap<String, C121514pn> LIZIZ;
    public final HashMap<String, C121594pv> LIZJ;
    public final HashMap<String, C121504pm> LIZLLL;
    public final HashMap<String, C122244qy> LJ;
    public final HashMap<String, C121294pR> LJFF;
    public final HashMap<String, C121284pQ> LJI;
    public final C62822Ol8 LJII;
    public final InterfaceC126684y8 LJIIIIZZ;
    public final InterfaceC88472Yns<AbstractC121974qX, C76800UCe> LJIIIZ;

    @Override // X.C5WG
    public final InterfaceC153095zd LIZ() {
        return (InterfaceC153095zd) this.LJII.getValue();
    }

    @Override // X.C5WG
    public final String LJIIIIZZ(final C121294pR c121294pR) {
        InterfaceC88472Yns<AbstractC121974qX, C76800UCe> interfaceC88472Yns = this.LJIIIZ;
        final long duration = this.LJIIIIZZ.V8().getDuration();
        interfaceC88472Yns.invoke(new AbstractC121974qX(c121294pR, duration) { // from class: X.4qT
            public final C121294pR LIZIZ;
            public final long LIZJ;

            public static List LJII(NLEModel nLEModel) {
                VecNLETrackSPtr tracks = nLEModel.getTracks();
                ArrayList LIZ = C07080Po.LIZ(tracks, "nleModel.tracks");
                Iterator<NLETrack> it = tracks.iterator();
                while (it.hasNext()) {
                    NLETrack next = it.next();
                    NLETrack it2 = next;
                    o.LJIIIIZZ(it2, "it");
                    if (it2.getEnable() && C78983UzD.LJJJJLI(it2) == EnumC123864ta.STICKER) {
                        LIZ.add(next);
                    }
                }
                ArrayList arrayList = new ArrayList();
                Iterator it3 = LIZ.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (o.LJ(C77357UXp.LJJI((NLETrack) next2), EnumC121564ps.TEXT.name())) {
                        arrayList.add(next2);
                    }
                }
                return arrayList;
            }

            @Override // X.AbstractC121974qX
            public final void LIZJ(NLEEditor nleEditor) {
                boolean z;
                o.LJIIIZ(nleEditor, "nleEditor");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" 1.executeNLE ");
                LIZ.append(this.LIZIZ);
                LJFF(X1D.LIZIZ(LIZ));
                String str = this.LIZIZ.LIZ;
                int i = 0;
                if (str == null || ujb.o.LJJJJJL(str)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    NLEModel LJ = nleEditor.LJ();
                    o.LJIIIIZZ(LJ, "nleEditor.model");
                    String str2 = this.LIZIZ.LIZ;
                    o.LJI(str2);
                    if (C1DF.LJIIL(LJ, str2) != null) {
                        return;
                    }
                }
                NLETrackSlot nLETrackSlot = new NLETrackSlot();
                nLETrackSlot.LJIIL(new NLESegmentTextSticker());
                nLETrackSlot.setStartTime(0L);
                nLETrackSlot.setEndTime(this.LIZJ);
                NLEModel LJ2 = nleEditor.LJ();
                o.LJIIIIZZ(LJ2, "nleEditor.model");
                List LLJILJILJ = ORZ.LLJILJILJ(LJII(LJ2));
                ArrayList arrayList = (ArrayList) LLJILJILJ;
                if (arrayList.size() > 1) {
                    C40675Fxn.LJJLIIIJ(LLJILJILJ, new IDComparatorS30S0000000_2(60));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    NLETrack nLETrack = (NLETrack) it.next();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(nLETrack.LJIILL());
                    if (arrayList2.size() > 1) {
                        C40675Fxn.LJJLIIIJ(arrayList2, new IDComparatorS30S0000000_2(59));
                    }
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) ListProtector.get(arrayList2, i2);
                        if (arrayList2.size() == 1 && (nLETimeSpaceNode.getEndTime() < nLETrackSlot.getStartTime() || nLETimeSpaceNode.getStartTime() > nLETrackSlot.getEndTime())) {
                            nLETrack.LIZIZ(nLETrackSlot);
                            return;
                        }
                        if (i2 == arrayList2.size() - 1) {
                            if (nLETimeSpaceNode.getEndTime() < nLETrackSlot.getStartTime()) {
                                nLETrack.LIZIZ(nLETrackSlot);
                                return;
                            }
                        } else {
                            NLETimeSpaceNode nLETimeSpaceNode2 = (NLETimeSpaceNode) ListProtector.get(arrayList2, i2 + 1);
                            if (nLETimeSpaceNode.getEndTime() < nLETrackSlot.getStartTime() && nLETrackSlot.getEndTime() < nLETimeSpaceNode2.getStartTime()) {
                                nLETrack.LIZIZ(nLETrackSlot);
                                return;
                            }
                        }
                    }
                }
                NLETrack nLETrack2 = new NLETrack();
                nLETrack2.setExtra("track_type", "sticker");
                nLETrack2.setExtra("follow_max", String.valueOf(C5MK.LJFF));
                NLEModel LJ3 = nleEditor.LJ();
                o.LJIIIIZZ(LJ3, "nleEditor.model");
                List LJII = LJII(LJ3);
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(LJII, 10));
                Iterator it2 = ((ArrayList) LJII).iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Integer.valueOf(((NLETimeSpaceNode) it2.next()).getLayer()));
                }
                Iterator it3 = arrayList3.iterator();
                if (it3.hasNext()) {
                    Integer valueOf = Integer.valueOf(((Number) it3.next()).intValue());
                    while (it3.hasNext()) {
                        Integer valueOf2 = Integer.valueOf(((Number) it3.next()).intValue());
                        if (valueOf.compareTo(valueOf2) < 0) {
                            valueOf = valueOf2;
                        }
                    }
                    if (valueOf != null) {
                        i = valueOf.intValue() + 1;
                    }
                }
                nLETrack2.setLayer(i);
                nLETrack2.LJIL(EnumC123864ta.STICKER);
                nLETrack2.LIZIZ(nLETrackSlot);
                nleEditor.LJ().addTrack(nLETrack2);
                this.LIZIZ.LIZ = nLETrackSlot.getUUID();
            }

            {
                this.LIZIZ = c121294pR;
                this.LIZJ = duration;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" 0.init ");
                LIZ.append(c121294pR);
                LJFF(X1D.LIZIZ(LIZ));
            }
        });
        HashMap<String, C121294pR> hashMap = this.LJFF;
        String str = c121294pR.LIZ;
        o.LJI(str);
        hashMap.put(str, c121294pR);
        String str2 = c121294pR.LIZ;
        o.LJI(str2);
        return str2;
    }

    @Override // X.C5WG
    public final void LJIIJ(C122024qc stickerParams) {
        o.LJIIIZ(stickerParams, "stickerParams");
        if (stickerParams instanceof C121504pm) {
            final C121504pm c121504pm = (C121504pm) stickerParams;
            this.LJIIIZ.invoke(new AbstractC121974qX(c121504pm) { // from class: X.4pD
                public final C121504pm LIZIZ;

                {
                    o.LJIIIZ(c121504pm, "lyricStickerParams");
                    this.LIZIZ = c121504pm;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(" 0.init ");
                    LIZ.append(c121504pm);
                    LJFF(X1D.LIZIZ(LIZ));
                }

                @Override // X.AbstractC121974qX
                public final void LIZJ(NLEEditor nleEditor) {
                    o.LJIIIZ(nleEditor, "nleEditor");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(" 1.executeNLE ");
                    LIZ.append(this.LIZIZ);
                    LJFF(X1D.LIZIZ(LIZ));
                    NLEModel LJ = nleEditor.LJ();
                    o.LJIIIIZZ(LJ, "nleEditor.model");
                    String str = this.LIZIZ.LIZ;
                    o.LJI(str);
                    NLETrackSlot LJIIL = C1DF.LJIIL(LJ, str);
                    if (LJIIL != null) {
                        NLESegmentSubtitleSticker LJFF = NLESegmentSubtitleSticker.LJFF(LJIIL.LJI());
                        if (LJFF != null) {
                            String str2 = this.LIZIZ.LJIIJJI;
                            if (str2 != null) {
                                if (LJFF.LJII() == null) {
                                    NLEResourceNode nLEResourceNode = new NLEResourceNode();
                                    nLEResourceNode.LJIILIIL(EnumC123874tb.SRT);
                                    NLEEditorJniJNI.NLESegmentSubtitleSticker_setSRTFile(LJFF.LJ, LJFF, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
                                }
                                NLEResourceNode srtFile = LJFF.LJII();
                                o.LJIIIIZZ(srtFile, "srtFile");
                                srtFile.LJIIIZ(str2);
                            }
                            C121504pm c121504pm2 = this.LIZIZ;
                            if (c121504pm2.LJIIL != null || c121504pm2.LJIILIIL != null) {
                                if (LJFF.LJIIIIZZ() == null) {
                                    NLEStyText nLEStyText = new NLEStyText();
                                    NLEEditorJniJNI.NLESegmentSubtitleSticker_setStyle(LJFF.LJ, LJFF, nLEStyText.LIZ, nLEStyText);
                                }
                                if (this.LIZIZ.LJIIL != null) {
                                    NLEStyText style = LJFF.LJIIIIZZ();
                                    o.LJIIIIZZ(style, "style");
                                    if (style.LIZIZ() == null) {
                                        NLEStyText style2 = LJFF.LJIIIIZZ();
                                        o.LJIIIIZZ(style2, "style");
                                        NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
                                        nLEResourceNode2.LJIILIIL(EnumC123874tb.FONT);
                                        NLEEditorJniJNI.NLEStyText_setFont(style2.LIZ, style2, NLEResourceNode.LIZ(nLEResourceNode2), nLEResourceNode2);
                                    }
                                    NLEStyText style3 = LJFF.LJIIIIZZ();
                                    o.LJIIIIZZ(style3, "style");
                                    NLEResourceNode LIZIZ = style3.LIZIZ();
                                    o.LJIIIIZZ(LIZIZ, "style.font");
                                    LIZIZ.LJIIIZ(this.LIZIZ.LJIIL);
                                } else {
                                    NLEStyText style4 = LJFF.LJIIIIZZ();
                                    o.LJIIIIZZ(style4, "style");
                                    NLEEditorJniJNI.NLEStyText_setFont(style4.LIZ, style4, NLEResourceNode.LIZ(null), null);
                                }
                                if (this.LIZIZ.LJIILIIL != null) {
                                    NLEStyText style5 = LJFF.LJIIIIZZ();
                                    o.LJIIIIZZ(style5, "style");
                                    o.LJI(this.LIZIZ.LJIILIIL);
                                    NLEEditorJniJNI.NLEStyText_setTextColor(style5.LIZ, style5, r1.intValue());
                                }
                            } else {
                                NLEEditorJniJNI.NLESegmentSubtitleSticker_setStyle(LJFF.LJ, LJFF, 0L, null);
                            }
                            String str3 = this.LIZIZ.LJIILJJIL;
                            if (str3 != null) {
                                NLEEditorJniJNI.NLESegmentSubtitleSticker_setConnectedAudioSlotUUID(LJFF.LJ, LJFF, str3);
                            }
                            NLEEditorJniJNI.NLESegmentSubtitleSticker_setTimeClipStart(LJFF.LJ, LJFF, this.LIZIZ.LJIILLIIL * 1000);
                            long j = this.LIZIZ.LJIIZILJ;
                            long j2 = -2;
                            if (j != -2) {
                                j2 = j * 1000;
                            }
                            NLEEditorJniJNI.NLESegmentSubtitleSticker_setTimeClipEnd(LJFF.LJ, LJFF, j2);
                            if (LJFF.LJ() == null) {
                                NLEStyStickerAnim nLEStyStickerAnim = new NLEStyStickerAnim();
                                NLEEditorJniJNI.NLESegmentSticker_setAnimation(LJFF.LIZJ, LJFF, nLEStyStickerAnim.LIZ, nLEStyStickerAnim);
                            }
                            NLEStyStickerAnim animation = LJFF.LJ();
                            o.LJIIIIZZ(animation, "animation");
                            NLEEditorJniJNI.NLEStyStickerAnim_setLoop(animation.LIZ, animation, this.LIZIZ.LJIILL);
                        }
                        new C121174pF(this.LIZIZ).LJII(LJIIL);
                    }
                }
            });
            return;
        }
        if (stickerParams instanceof C121514pn) {
            this.LJIIIZ.invoke(new C121244pM((C121514pn) stickerParams));
            return;
        }
        if (stickerParams instanceof C121594pv) {
            this.LJIIIZ.invoke(new C121254pN((C121594pv) stickerParams));
            return;
        }
        if (stickerParams instanceof C121294pR) {
            final C121294pR c121294pR = (C121294pR) stickerParams;
            this.LJIIIZ.invoke(new AbstractC121974qX(c121294pR) { // from class: X.4pP
                public final C121294pR LIZIZ;

                {
                    o.LJIIIZ(c121294pR, "params");
                    this.LIZIZ = c121294pR;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(" 0.init ");
                    LIZ.append(c121294pR);
                    LJFF(X1D.LIZIZ(LIZ));
                }

                @Override // X.AbstractC121974qX
                public final void LIZJ(NLEEditor nleEditor) {
                    o.LJIIIZ(nleEditor, "nleEditor");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(" 1.executeNLE ");
                    LIZ.append(this.LIZIZ);
                    LJFF(X1D.LIZIZ(LIZ));
                    String str = this.LIZIZ.LIZ;
                    if (str == null || ujb.o.LJJJJJL(str)) {
                        return;
                    }
                    NLEModel LJ = nleEditor.LJ();
                    o.LJIIIIZZ(LJ, "nleEditor.model");
                    String str2 = this.LIZIZ.LIZ;
                    o.LJI(str2);
                    NLETrackSlot LJIIL = C1DF.LJIIL(LJ, str2);
                    if (LJIIL != null) {
                        new C121174pF(this.LIZIZ).LJII(LJIIL);
                    }
                }
            });
        } else if (stickerParams instanceof C122244qy) {
            final C122244qy c122244qy = (C122244qy) stickerParams;
            this.LJIIIZ.invoke(new AbstractC121974qX(c122244qy) { // from class: X.4pE
                public final C122244qy LIZIZ;

                {
                    o.LJIIIZ(c122244qy, "params");
                    this.LIZIZ = c122244qy;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(" 0.init ");
                    LIZ.append(c122244qy);
                    LJFF(X1D.LIZIZ(LIZ));
                }

                @Override // X.AbstractC121974qX
                public final void LIZJ(NLEEditor nleEditor) {
                    o.LJIIIZ(nleEditor, "nleEditor");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(" 1.executeNLE ");
                    LIZ.append(this.LIZIZ);
                    LJFF(X1D.LIZIZ(LIZ));
                    NLEModel LJ = nleEditor.LJ();
                    o.LJIIIIZZ(LJ, "nleEditor.model");
                    String str = this.LIZIZ.LIZ;
                    o.LJI(str);
                    NLETrackSlot LJIIL = C1DF.LJIIL(LJ, str);
                    if (LJIIL != null) {
                        NLESegmentTextSticker LJFF = NLESegmentTextSticker.LJFF(LJIIL.LJI());
                        if (LJFF != null && (!o.LJ(NLEEditorJniJNI.NLESegmentTextSticker_toEffectJson(LJFF.LJ, LJFF), this.LIZIZ.LJIIL))) {
                            NLEEditorJniJNI.NLESegmentTextSticker_setEffectSDKJsonString(LJFF.LJ, LJFF, this.LIZIZ.LJIIL);
                        }
                        new C121174pF(this.LIZIZ).LJII(LJIIL);
                    }
                }
            });
        } else if (stickerParams instanceof C121284pQ) {
            final C121284pQ c121284pQ = (C121284pQ) stickerParams;
            this.LJIIIZ.invoke(new AbstractC121974qX(c121284pQ) { // from class: X.4pG
                public final C121284pQ LIZIZ;

                {
                    o.LJIIIZ(c121284pQ, "params");
                    this.LIZIZ = c121284pQ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(" 0.init ");
                    LIZ.append(c121284pQ);
                    LJFF(X1D.LIZIZ(LIZ));
                }

                @Override // X.AbstractC121974qX
                public final void LIZJ(NLEEditor nleEditor) {
                    o.LJIIIZ(nleEditor, "nleEditor");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(" 1.executeNLE ");
                    LIZ.append(this.LIZIZ);
                    LJFF(X1D.LIZIZ(LIZ));
                    NLEModel LJ = nleEditor.LJ();
                    o.LJIIIIZZ(LJ, "nleEditor.model");
                    String str = this.LIZIZ.LIZ;
                    o.LJI(str);
                    NLETrackSlot LJIIL = C1DF.LJIIL(LJ, str);
                    if (LJIIL != null) {
                        LJIIL.setLayer(this.LIZIZ.LIZIZ);
                        LJIIL.setStartTime(this.LIZIZ.LIZJ * 1000);
                        long j = this.LIZIZ.LIZLLL;
                        long j2 = -2;
                        if (j != -2) {
                            j2 = j * 1000;
                        }
                        LJIIL.setEndTime(j2);
                        float f = 2;
                        LJIIL.setTransformX((this.LIZIZ.LJ - 0.5f) * f);
                        LJIIL.setTransformY((0.5f - this.LIZIZ.LJFF) * f);
                        LJIIL.setRotation(this.LIZIZ.LJI);
                        LJIIL.setScale(this.LIZIZ.LJIIIIZZ);
                        NLESegmentTextTemplate LIZLLL = NLESegmentTextTemplate.LIZLLL(LJIIL.LJI());
                        if (LIZLLL != null) {
                            if (LIZLLL.LJ().size() > 0) {
                                NLETextTemplateClip nLETextTemplateClip = LIZLLL.LJ().get(0);
                                o.LJIIIIZZ(nLETextTemplateClip, "textClips[0]");
                                NLEEditorJniJNI.NLETextTemplateClip_setContent(nLETextTemplateClip.LIZ, nLETextTemplateClip, this.LIZIZ.LJIIJJI);
                                return;
                            }
                            if (this.LIZIZ.LJIIJJI == null) {
                                return;
                            }
                            NLETextTemplateClip nLETextTemplateClip2 = new NLETextTemplateClip();
                            NLEEditorJniJNI.NLETextTemplateClip_setContent(nLETextTemplateClip2.LIZ, nLETextTemplateClip2, this.LIZIZ.LJIIJJI);
                            NLEEditorJniJNI.NLESegmentTextTemplate_addTextClip(LIZLLL.LIZJ, LIZLLL, NLETextTemplateClip.LIZ(nLETextTemplateClip2), nLETextTemplateClip2);
                        }
                    }
                }
            });
        } else {
            this.LJIIIZ.invoke(new C121174pF(stickerParams));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC121774qD
    public final void LJIILLIIL(NLEEditor editor) {
        boolean z;
        NLEResourceNode nLEResourceNode;
        String LIZJ;
        NLEResourceNode nLEResourceNode2;
        String LIZJ2;
        String[] strArr;
        NLEResourceNode LIZIZ;
        o.LJIIIZ(editor, "editor");
        AbstractC121964qW<LinkedList<C122024qc>> abstractC121964qW = new AbstractC121964qW<LinkedList<C122024qc>>() { // from class: X.4pI
            public static void LIZIZ(C122024qc c122024qc, NLETrackSlot nLETrackSlot) {
                c122024qc.LIZIZ = nLETrackSlot.getLayer();
                long j = 1000;
                c122024qc.LIZJ = nLETrackSlot.getStartTime() / j;
                long j2 = -2;
                if (nLETrackSlot.getEndTime() != -2) {
                    j2 = nLETrackSlot.getEndTime() / j;
                }
                c122024qc.LIZLLL = j2;
                c122024qc.LJ = C47261Igj.LJJJJJL(nLETrackSlot.getTransformX());
                c122024qc.LJFF = C47261Igj.LJJJJL(nLETrackSlot.getTransformY());
                c122024qc.LJI = nLETrackSlot.getRotation();
                c122024qc.LJIIIIZZ = nLETrackSlot.getScale();
                NLESegmentSticker LIZLLL = NLESegmentSticker.LIZLLL(nLETrackSlot.LJI());
                if (LIZLLL != null) {
                    c122024qc.LJII = NLEEditorJniJNI.NLESegmentSticker_getAlpha(LIZLLL.LIZJ, LIZLLL);
                    if (LIZLLL.LJ() == null) {
                        c122024qc.LJIIIZ = null;
                    } else {
                        NLEStyStickerAnim LJ = LIZLLL.LJ();
                        if (LJ != null) {
                            if (c122024qc.LJIIIZ == null) {
                                c122024qc.LJIIIZ = new C121194pH();
                            }
                            C121194pH c121194pH = c122024qc.LJIIIZ;
                            if (c121194pH != null) {
                                c121194pH.LIZJ = Integer.valueOf(LJ.LIZIZ() / 1000);
                                c121194pH.LJ = Integer.valueOf(NLEEditorJniJNI.NLEStyStickerAnim_getOutDuration(LJ.LIZ, LJ) / 1000);
                                c121194pH.LIZ = LJ.LIZJ();
                                NLEResourceNode LIZ = LJ.LIZ();
                                if (LIZ != null) {
                                    c121194pH.LIZIZ = LIZ.LIZJ();
                                }
                                NLEResourceNode LIZLLL2 = LJ.LIZLLL();
                                if (LIZLLL2 != null) {
                                    c121194pH.LIZLLL = LIZLLL2.LIZJ();
                                }
                            }
                        }
                    }
                }
                c122024qc.LIZ = nLETrackSlot.getUUID();
            }
        };
        abstractC121964qW.LIZ("fetchFromNLE:");
        LinkedList linkedList = new LinkedList();
        NLEModel LJ = editor.LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        VecNLETrackSPtr tracks = LJ.getTracks();
        o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (true ^ TextUtils.isEmpty(C77357UXp.LJJI(it2))) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            NLETrack track = (NLETrack) it3.next();
            o.LJIIIIZZ(track, "track");
            String LJJI = C77357UXp.LJJI(track);
            o.LJI(LJJI);
            Iterator<NLETrackSlot> it4 = track.LJIILL().iterator();
            while (it4.hasNext()) {
                NLETrackSlot slot = it4.next();
                o.LJIIIIZZ(slot, "slot");
                NLESegmentInfoSticker LJFF = NLESegmentInfoSticker.LJFF(slot.LJI());
                if (LJFF != null) {
                    C121514pn c121514pn = new C121514pn(EnumC121564ps.valueOf(LJJI));
                    if (NLEEditorJniJNI.NLESegmentInfoSticker_getAddWithBuffer(LJFF.LJ, LJFF)) {
                        c121514pn.LJIILIIL = z;
                    } else {
                        long NLESegmentInfoSticker_getEffectSDKFile = NLEEditorJniJNI.NLESegmentInfoSticker_getEffectSDKFile(LJFF.LJ, LJFF);
                        if (NLESegmentInfoSticker_getEffectSDKFile == 0) {
                            nLEResourceNode = null;
                        } else {
                            nLEResourceNode = new NLEResourceNode(NLESegmentInfoSticker_getEffectSDKFile);
                        }
                        o.LJIIIIZZ(nLEResourceNode, "segment.effectSDKFile");
                        c121514pn.LJIIJJI = nLEResourceNode.LIZJ();
                    }
                    c121514pn.LJIILJJIL = C77357UXp.LJJ(slot);
                    NLEResourceNode LJII = slot.LJII();
                    if (LJII != null && (LIZJ = LJII.LIZJ()) != null) {
                        c121514pn.LJIJ = LIZJ;
                    }
                    C121204pI.LIZIZ(c121514pn, slot);
                    linkedList.add(c121514pn);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("infoStickerParams ");
                    LIZ.append(c121514pn);
                    abstractC121964qW.LIZ(X1D.LIZIZ(LIZ));
                } else {
                    NLESegmentImageSticker LJFF2 = NLESegmentImageSticker.LJFF(slot.LJI());
                    if (LJFF2 != null) {
                        C121594pv c121594pv = new C121594pv(0);
                        long NLESegmentImageSticker_getImageFile = NLEEditorJniJNI.NLESegmentImageSticker_getImageFile(LJFF2.LJ, LJFF2);
                        if (NLESegmentImageSticker_getImageFile == 0) {
                            nLEResourceNode2 = null;
                        } else {
                            nLEResourceNode2 = new NLEResourceNode(NLESegmentImageSticker_getImageFile);
                        }
                        o.LJIIIIZZ(nLEResourceNode2, "segment.imageFile");
                        c121594pv.LJIIL = nLEResourceNode2.LIZJ();
                        c121594pv.LJIILIIL = slot.getRelativeWidth();
                        c121594pv.LJIILJJIL = slot.getRelativeHeight();
                        NLEResourceNode LJII2 = slot.LJII();
                        if (LJII2 != null && (LIZJ2 = LJII2.LIZJ()) != null) {
                            c121594pv.LJIIJJI = LIZJ2;
                        }
                        C121204pI.LIZIZ(c121594pv, slot);
                        linkedList.add(c121594pv);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("imageStickerParams ");
                        LIZ2.append(c121594pv);
                        abstractC121964qW.LIZ(X1D.LIZIZ(LIZ2));
                    } else {
                        NLESegmentSubtitleSticker LJFF3 = NLESegmentSubtitleSticker.LJFF(slot.LJI());
                        if (LJFF3 != null) {
                            if (new VecString(NLEEditorJniJNI.NLESegmentSticker_getInfoStringList(LJFF3.LIZJ, LJFF3), z).isEmpty()) {
                                strArr = null;
                            } else {
                                Object[] array = new VecString(NLEEditorJniJNI.NLESegmentSticker_getInfoStringList(LJFF3.LIZJ, LJFF3), z).toArray(new String[0]);
                                if (array != null) {
                                    strArr = (String[]) array;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            }
                            C121504pm c121504pm = new C121504pm(strArr, z ? 1 : 0);
                            NLEResourceNode LJI = LJFF3.LJI();
                            o.LJIIIIZZ(LJI, "segment.effectSDKFile");
                            c121504pm.LJIJ = LJI.LIZJ();
                            C77357UXp.LJJ(slot);
                            NLEResourceNode LJII3 = LJFF3.LJII();
                            if (LJII3 != null) {
                                c121504pm.LJIIJJI = LJII3.LIZJ();
                            }
                            NLEStyText LJIIIIZZ = LJFF3.LJIIIIZZ();
                            if (LJIIIIZZ != null && (LIZIZ = LJIIIIZZ.LIZIZ()) != null) {
                                c121504pm.LJIIL = LIZIZ.LIZJ();
                            }
                            NLEStyText LJIIIIZZ2 = LJFF3.LJIIIIZZ();
                            if (LJIIIIZZ2 != null) {
                                c121504pm.LJIILIIL = Integer.valueOf((int) LJIIIIZZ2.LIZJ());
                            }
                            c121504pm.LJIILJJIL = NLEEditorJniJNI.NLESegmentSubtitleSticker_getConnectedAudioSlotUUID(LJFF3.LJ, LJFF3);
                            long j = 1000;
                            c121504pm.LJIILLIIL = NLEEditorJniJNI.NLESegmentSubtitleSticker_getTimeClipStart(LJFF3.LJ, LJFF3) / j;
                            long j2 = -2;
                            if (NLEEditorJniJNI.NLESegmentSubtitleSticker_getTimeClipEnd(LJFF3.LJ, LJFF3) != -2) {
                                j2 = NLEEditorJniJNI.NLESegmentSubtitleSticker_getTimeClipEnd(LJFF3.LJ, LJFF3) / j;
                            }
                            c121504pm.LJIIZILJ = j2;
                            NLEStyStickerAnim LJ2 = LJFF3.LJ();
                            if (LJ2 != null) {
                                c121504pm.LJIILL = LJ2.LIZJ();
                            }
                            C121204pI.LIZIZ(c121504pm, slot);
                            linkedList.add(c121504pm);
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("lyricStickerParams ");
                            LIZ3.append(c121504pm);
                            abstractC121964qW.LIZ(X1D.LIZIZ(LIZ3));
                        } else {
                            NLESegmentTextSticker LJFF4 = NLESegmentTextSticker.LJFF(slot.LJI());
                            if (LJFF4 != null) {
                                C122244qy c122244qy = new C122244qy(null);
                                c122244qy.LJIIL = NLEEditorJniJNI.NLESegmentTextSticker_toEffectJson(LJFF4.LJ, LJFF4);
                                NLEStyText LJII4 = LJFF4.LJII();
                                if (LJII4 != null) {
                                    c122244qy.LJIIJJI.LIZIZ(C122244qy.LJIILIIL[0], c122244qy, Integer.valueOf((int) LJII4.LIZJ()));
                                }
                                C121204pI.LIZIZ(c122244qy, slot);
                                linkedList.add(c122244qy);
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append("textStickerParams ");
                                LIZ4.append(c122244qy);
                                abstractC121964qW.LIZ(X1D.LIZIZ(LIZ4));
                            } else {
                                NLEResourceNode nLEResourceNode3 = null;
                                NLESegmentTextTemplate LIZLLL = NLESegmentTextTemplate.LIZLLL(slot.LJI());
                                if (LIZLLL != null) {
                                    long NLESegmentTextTemplate_getEffectSDKFile = NLEEditorJniJNI.NLESegmentTextTemplate_getEffectSDKFile(LIZLLL.LIZJ, LIZLLL);
                                    if (NLESegmentTextTemplate_getEffectSDKFile != 0) {
                                        nLEResourceNode3 = new NLEResourceNode(NLESegmentTextTemplate_getEffectSDKFile);
                                    }
                                    o.LJIIIIZZ(nLEResourceNode3, "segment.effectSDKFile");
                                    nLEResourceNode3.LIZJ();
                                    C121284pQ c121284pQ = new C121284pQ(0);
                                    if (LIZLLL.LJ().size() > 0) {
                                        NLETextTemplateClip nLETextTemplateClip = LIZLLL.LJ().get(0);
                                        o.LJIIIIZZ(nLETextTemplateClip, "segment.textClips[0]");
                                        c121284pQ.LJIIJJI = NLEEditorJniJNI.NLETextTemplateClip_getContent(nLETextTemplateClip.LIZ, nLETextTemplateClip);
                                    } else {
                                        c121284pQ.LJIIJJI = "";
                                    }
                                    C121204pI.LIZIZ(c121284pQ, slot);
                                    linkedList.add(c121284pQ);
                                    StringBuilder LIZ5 = X1D.LIZ();
                                    LIZ5.append("textTemplateParams ");
                                    LIZ5.append(c121284pQ);
                                    abstractC121964qW.LIZ(X1D.LIZIZ(LIZ5));
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        Iterator it5 = linkedList.iterator();
        while (it5.hasNext()) {
            C122024qc c122024qc = (C122024qc) it5.next();
            if (c122024qc instanceof C121514pn) {
                HashMap<String, C121514pn> hashMap = this.LIZIZ;
                String str = c122024qc.LIZ;
                o.LJI(str);
                hashMap.put(str, c122024qc);
            } else if (c122024qc instanceof C121594pv) {
                HashMap<String, C121594pv> hashMap2 = this.LIZJ;
                String str2 = c122024qc.LIZ;
                o.LJI(str2);
                hashMap2.put(str2, c122024qc);
            } else if (c122024qc instanceof C121504pm) {
                HashMap<String, C121504pm> hashMap3 = this.LIZLLL;
                String str3 = c122024qc.LIZ;
                o.LJI(str3);
                hashMap3.put(str3, c122024qc);
            } else if (c122024qc instanceof C122244qy) {
                HashMap<String, C122244qy> hashMap4 = this.LJ;
                String str4 = c122024qc.LIZ;
                o.LJI(str4);
                hashMap4.put(str4, c122024qc);
            } else if (c122024qc instanceof C121284pQ) {
                HashMap<String, C121284pQ> hashMap5 = this.LJI;
                String str5 = c122024qc.LIZ;
                o.LJI(str5);
                hashMap5.put(str5, c122024qc);
            }
        }
    }

    @Override // X.C5WG
    public final String LJIJI(final C121514pn infoStickerParams) {
        o.LJIIIZ(infoStickerParams, "infoStickerParams");
        InterfaceC88472Yns<AbstractC121974qX, C76800UCe> interfaceC88472Yns = this.LJIIIZ;
        final Boolean bool = this.LIZ;
        interfaceC88472Yns.invoke(new AbstractC121974qX(infoStickerParams, bool) { // from class: X.4pV
            public final C121514pn LIZIZ;
            public final Boolean LIZJ;

            @Override // X.AbstractC121974qX
            public final void LIZJ(NLEEditor nleEditor) {
                boolean z;
                long j;
                String str;
                o.LJIIIZ(nleEditor, "nleEditor");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" 1.executeNLE ");
                LIZ.append(this.LIZIZ);
                LJFF(X1D.LIZIZ(LIZ));
                NLETrack nLETrack = new NLETrack();
                nLETrack.LJIL(EnumC123864ta.STICKER);
                nLETrack.setEnable(true);
                String stickerType = this.LIZIZ.LJIIJ.name();
                o.LJIIIZ(stickerType, "stickerType");
                nLETrack.setExtra("StickerTrackType", stickerType);
                if (o.LJ(this.LIZJ, Boolean.TRUE) && C5MK.LJFF) {
                    z = true;
                } else {
                    z = false;
                }
                nLETrack.setExtra("follow_max", String.valueOf(z));
                if (C121344pW.LIZ(nLETrack)) {
                    NLEModel LJ = nleEditor.LJ();
                    o.LJIIIIZZ(LJ, "nleEditor.model");
                    nLETrack.setRewind(LJ.getRewind());
                }
                NLETrackSlot nLETrackSlot = new NLETrackSlot();
                NLESegmentInfoSticker nLESegmentInfoSticker = new NLESegmentInfoSticker();
                NLEResourceNode nLEResourceNode = new NLEResourceNode();
                nLEResourceNode.LJIIIZ(this.LIZIZ.LJIIJJI);
                nLEResourceNode.LJIILIIL(EnumC123874tb.INFO_STICKER);
                if (C5MK.LJI && (str = this.LIZIZ.LJIILL) != null && str.length() != 0) {
                    C121514pn c121514pn = this.LIZIZ;
                    nLEResourceNode.setExtra("biz_res_id", C134305Ow.LIZ(c121514pn.LJIILLIIL, c121514pn.LJIILL));
                }
                NLEEditorJniJNI.NLESegmentInfoSticker_setEffectSDKFile(nLESegmentInfoSticker.LJ, nLESegmentInfoSticker, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
                String[] strArr = this.LIZIZ.LJIIL;
                if (strArr != null && strArr.length != 0) {
                    VecString vecString = new VecString();
                    ORS.LJJLIIIJJIZ(vecString, strArr);
                    NLEEditorJniJNI.NLESegmentSticker_setInfoStringList(nLESegmentInfoSticker.LIZJ, nLESegmentInfoSticker, VecString.LIZJ(vecString), vecString);
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        String str2 = strArr[i];
                        if (!s.LJJJLZIJ(str2, "info_sticker_default_params", false)) {
                            i++;
                        } else {
                            try {
                                LJII(new JSONObject(str2).optJSONObject("info_sticker_default_params"), nLETrackSlot, nLESegmentInfoSticker);
                                break;
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
                nLETrackSlot.LJIIL(nLESegmentInfoSticker);
                nLETrackSlot.setStartTime(0L);
                C121514pn c121514pn2 = this.LIZIZ;
                long j2 = c121514pn2.LIZJ;
                long j3 = c121514pn2.LIZLLL;
                if (j2 == j3) {
                    j = -2;
                } else {
                    j = 1000 * j3;
                }
                nLETrackSlot.setEndTime(j);
                String str3 = this.LIZIZ.LJIILJJIL;
                if (str3 != null) {
                    nLETrackSlot.setExtra("d_stickerId", str3);
                }
                new C121244pM(this.LIZIZ).LJII(nLETrackSlot);
                nLETrack.LIZIZ(nLETrackSlot);
                nleEditor.LJ().addTrack(nLETrack);
                this.LIZIZ.LIZ = nLETrackSlot.getUUID();
            }

            {
                o.LJIIIZ(infoStickerParams, "params");
                this.LIZIZ = infoStickerParams;
                this.LIZJ = bool;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" 0.init ");
                LIZ.append(infoStickerParams);
                LJFF(X1D.LIZIZ(LIZ));
            }

            public static void LJII(JSONObject jSONObject, NLETrackSlot nLETrackSlot, NLESegmentInfoSticker nLESegmentInfoSticker) {
                if (jSONObject != null) {
                    double optDouble = jSONObject.optDouble("pos_x", Double.MAX_VALUE);
                    if (optDouble != Double.MAX_VALUE) {
                        nLETrackSlot.setTransformX((float) optDouble);
                    }
                    double optDouble2 = jSONObject.optDouble("pos_y", Double.MAX_VALUE);
                    if (optDouble2 != Double.MAX_VALUE) {
                        nLETrackSlot.setTransformY((float) optDouble2);
                    }
                    double optDouble3 = jSONObject.optDouble("rotate", Double.MAX_VALUE);
                    if (optDouble3 != Double.MAX_VALUE) {
                        nLETrackSlot.setRotation((float) optDouble3);
                    }
                    double optDouble4 = jSONObject.optDouble("alpha", Double.MAX_VALUE);
                    if (optDouble4 != Double.MAX_VALUE) {
                        NLEEditorJniJNI.NLESegmentSticker_setAlpha(nLESegmentInfoSticker.LIZJ, nLESegmentInfoSticker, (float) optDouble4);
                    }
                    nLETrackSlot.setMirror_X(jSONObject.optBoolean("flip_x", false));
                    nLETrackSlot.setMirror_Y(jSONObject.optBoolean("flip_y", false));
                }
            }
        });
        HashMap<String, C121514pn> hashMap = this.LIZIZ;
        String str = infoStickerParams.LIZ;
        o.LJI(str);
        hashMap.put(str, infoStickerParams);
        String str2 = infoStickerParams.LIZ;
        o.LJI(str2);
        return str2;
    }

    @Override // X.C5WG
    public final int LJIL(String uuid) {
        o.LJIIIZ(uuid, "uuid");
        final C122024qc LJJJJLI = LJJJJLI(uuid);
        if (LJJJJLI != null) {
            this.LJIIIZ.invoke(new AbstractC121974qX(LJJJJLI) { // from class: X.4pU
                public final C122024qc LIZIZ;

                {
                    this.LIZIZ = LJJJJLI;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(" 0.init ");
                    LIZ.append(LJJJJLI);
                    LJFF(X1D.LIZIZ(LIZ));
                }

                @Override // X.AbstractC121974qX
                public final void LIZJ(NLEEditor nleEditor) {
                    o.LJIIIZ(nleEditor, "nleEditor");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(" 1.executeNLE ");
                    LIZ.append(this.LIZIZ);
                    LJFF(X1D.LIZIZ(LIZ));
                    NLEModel LJ = nleEditor.LJ();
                    o.LJIIIIZZ(LJ, "nleEditor.model");
                    String str = this.LIZIZ.LIZ;
                    o.LJI(str);
                    OSZ LJIILIIL = C1DF.LJIILIIL(LJ, str);
                    if (LJIILIIL != null) {
                        ((NLETrack) LJIILIIL.getFirst()).LJIJJLI((NLETrackSlot) LJIILIIL.getSecond());
                        if (((NLETrack) LJIILIIL.getFirst()).LJIILL().size() <= 0) {
                            nleEditor.LJ().removeTrack((NLETrack) LJIILIIL.getFirst());
                        }
                    }
                }
            });
            this.LIZIZ.remove(uuid);
            this.LIZJ.remove(uuid);
            this.LIZLLL.remove(uuid);
            this.LJ.remove(uuid);
            this.LJI.remove(uuid);
            this.LJFF.remove(uuid);
            return 0;
        }
        return -1;
    }

    @Override // X.C5WG
    public final void LJJIFFI(Boolean bool) {
        this.LIZ = bool;
    }

    @Override // X.C5WG
    public final String LJJIIJ(final C121514pn c121514pn) {
        c121514pn.LJIILIIL = true;
        this.LJIIIZ.invoke(new AbstractC121974qX(c121514pn) { // from class: X.4pS
            public final C121514pn LIZIZ;

            public final NLETrack LJII() {
                NLETrack nLETrack = new NLETrack();
                nLETrack.setEndTime(-2);
                nLETrack.LJIL(EnumC123864ta.STICKER);
                nLETrack.setEnable(true);
                String stickerType = this.LIZIZ.LJIIJ.name();
                o.LJIIIZ(stickerType, "stickerType");
                nLETrack.setExtra("StickerTrackType", stickerType);
                return nLETrack;
            }

            {
                this.LIZIZ = c121514pn;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" 0.init ");
                LIZ.append(c121514pn);
                LJFF(X1D.LIZIZ(LIZ));
            }

            @Override // X.AbstractC121974qX
            public final void LIZJ(NLEEditor nleEditor) {
                NLETrack LJII;
                Object obj;
                o.LJIIIZ(nleEditor, "nleEditor");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" 1.executeNLE ");
                LIZ.append(this.LIZIZ);
                LJFF(X1D.LIZIZ(LIZ));
                if (this.LIZIZ.LJIIZILJ) {
                    Iterator LIZ2 = C0FS.LIZ(nleEditor, "nleEditor.model", "nleEditor.model.tracks");
                    while (true) {
                        if (LIZ2.hasNext()) {
                            obj = LIZ2.next();
                            NLETrack it = (NLETrack) obj;
                            o.LJIIIIZZ(it, "it");
                            if (o.LJ(C77357UXp.LJJI(it), this.LIZIZ.LJIIJ.name())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    LJII = (NLETrack) obj;
                    if (LJII == null) {
                        LJII = LJII();
                        nleEditor.LJ().addTrack(LJII);
                    }
                } else {
                    LJII = LJII();
                    nleEditor.LJ().addTrack(LJII);
                }
                NLETrackSlot nLETrackSlot = new NLETrackSlot();
                NLESegmentInfoSticker nLESegmentInfoSticker = new NLESegmentInfoSticker();
                NLEEditorJniJNI.NLESegmentInfoSticker_setAddWithBuffer(nLESegmentInfoSticker.LJ, nLESegmentInfoSticker, true);
                nLETrackSlot.LJIIL(nLESegmentInfoSticker);
                String str = this.LIZIZ.LJIILJJIL;
                if (str != null) {
                    nLETrackSlot.setExtra("d_stickerId", str);
                }
                new C121244pM(this.LIZIZ).LJII(nLETrackSlot);
                LJII.LIZIZ(nLETrackSlot);
                this.LIZIZ.LIZ = nLETrackSlot.getUUID();
            }
        });
        HashMap<String, C121514pn> hashMap = this.LIZIZ;
        String str = c121514pn.LIZ;
        o.LJI(str);
        hashMap.put(str, c121514pn);
        String str2 = c121514pn.LIZ;
        o.LJI(str2);
        return str2;
    }

    @Override // X.C5WG
    public final String LJJJJIZL(final C121594pv c121594pv) {
        InterfaceC88472Yns<AbstractC121974qX, C76800UCe> interfaceC88472Yns = this.LJIIIZ;
        final Boolean bool = this.LIZ;
        interfaceC88472Yns.invoke(new AbstractC121974qX(c121594pv, bool) { // from class: X.4pT
            public final C121594pv LIZIZ;
            public final Boolean LIZJ;

            @Override // X.AbstractC121974qX
            public final void LIZJ(NLEEditor nleEditor) {
                o.LJIIIZ(nleEditor, "nleEditor");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" 1.executeNLE ");
                LIZ.append(this.LIZIZ);
                LJFF(X1D.LIZIZ(LIZ));
                NLETrack nLETrack = new NLETrack();
                nLETrack.LJIL(EnumC123864ta.STICKER);
                boolean z = true;
                nLETrack.setEnable(true);
                String stickerType = this.LIZIZ.LJIIJ.name();
                o.LJIIIZ(stickerType, "stickerType");
                nLETrack.setExtra("StickerTrackType", stickerType);
                if (!o.LJ(this.LIZJ, Boolean.TRUE) || !C5MK.LJFF) {
                    z = false;
                }
                nLETrack.setExtra("follow_max", String.valueOf(z));
                if (C121344pW.LIZ(nLETrack)) {
                    NLEModel LJ = nleEditor.LJ();
                    o.LJIIIIZZ(LJ, "nleEditor.model");
                    nLETrack.setRewind(LJ.getRewind());
                }
                NLETrackSlot nLETrackSlot = new NLETrackSlot();
                NLESegmentImageSticker nLESegmentImageSticker = new NLESegmentImageSticker();
                NLEResourceNode nLEResourceNode = new NLEResourceNode();
                nLEResourceNode.LJIIIZ(this.LIZIZ.LJIIL);
                nLEResourceNode.LJIILIIL(EnumC123874tb.IMAGE_STICKER);
                NLEEditorJniJNI.NLESegmentImageSticker_setImageFile(nLESegmentImageSticker.LJ, nLESegmentImageSticker, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
                nLETrackSlot.LJIIL(nLESegmentImageSticker);
                nLETrackSlot.setRelativeWidth(this.LIZIZ.LJIILIIL);
                nLETrackSlot.setRelativeHeight(this.LIZIZ.LJIILJJIL);
                new C121254pN(this.LIZIZ).LJII(nLETrackSlot);
                nLETrack.LIZIZ(nLETrackSlot);
                nleEditor.LJ().addTrack(nLETrack);
                this.LIZIZ.LIZ = nLETrackSlot.getUUID();
            }

            {
                this.LIZIZ = c121594pv;
                this.LIZJ = bool;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" 0.init ");
                LIZ.append(c121594pv);
                LJFF(X1D.LIZIZ(LIZ));
            }
        });
        HashMap<String, C121594pv> hashMap = this.LIZJ;
        String str = c121594pv.LIZ;
        o.LJI(str);
        hashMap.put(str, c121594pv);
        String str2 = c121594pv.LIZ;
        o.LJI(str2);
        return str2;
    }

    @Override // X.C5WG
    public final C122024qc LJJJJLI(String uuid) {
        o.LJIIIZ(uuid, "uuid");
        C121514pn c121514pn = this.LIZIZ.get(uuid);
        if (c121514pn != null) {
            return c121514pn;
        }
        C121594pv c121594pv = this.LIZJ.get(uuid);
        if (c121594pv != null) {
            return c121594pv;
        }
        C121504pm c121504pm = this.LIZLLL.get(uuid);
        if (c121504pm != null) {
            return c121504pm;
        }
        C122244qy c122244qy = this.LJ.get(uuid);
        if (c122244qy != null) {
            return c122244qy;
        }
        C121284pQ c121284pQ = this.LJI.get(uuid);
        if (c121284pQ != null) {
            return c121284pQ;
        }
        C121294pR c121294pR = this.LJFF.get(uuid);
        if (c121294pR != null) {
            return c121294pR;
        }
        return null;
    }

    public C121264pO(InterfaceC126684y8 nleSession, AqS168S0100000_2 aqS168S0100000_2) {
        o.LJIIIZ(nleSession, "nleSession");
        this.LJIIIIZZ = nleSession;
        this.LJIIIZ = aqS168S0100000_2;
        C221108m2.LIZIZ(C2V5.LJLIL);
        C221108m2.LIZIZ(C2V4.LJLIL);
        C221108m2.LIZIZ(C2V6.LJLIL);
        C221108m2.LIZIZ(C2V7.LJLIL);
        C221108m2.LIZIZ(C2V3.LJLIL);
        this.LIZ = Boolean.FALSE;
        this.LIZIZ = new HashMap<>();
        this.LIZJ = new HashMap<>();
        this.LIZLLL = new HashMap<>();
        this.LJ = new HashMap<>();
        this.LJFF = new HashMap<>();
        this.LJI = new HashMap<>();
        this.LJII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 719));
    }

    @Override // X.C5WG
    public final void LJI(final List<String> list, final Float f, final Float f2) {
        this.LJIIIZ.invoke(new AbstractC121974qX(list, f, f2) { // from class: X.4oe
            public final String LIZIZ;
            public final String LIZJ;
            public final List<String> LIZLLL;
            public final Float LJ;
            public final Float LJFF;
            public final boolean LJI = false;

            @Override // X.AbstractC121974qX
            public final void LIZJ(NLEEditor nleEditor) {
                o.LJIIIZ(nleEditor, "nleEditor");
                NLEModel LJ = nleEditor.LJ();
                o.LJIIIIZZ(LJ, "nleEditor.model");
                VecNLETrackSPtr tracks = LJ.getTracks();
                o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
                ArrayList arrayList = new ArrayList();
                Iterator<NLETrack> it = tracks.iterator();
                while (it.hasNext()) {
                    NLETrack next = it.next();
                    NLETrack it2 = next;
                    o.LJIIIIZZ(it2, "it");
                    if (true ^ TextUtils.isEmpty(C77357UXp.LJJI(it2))) {
                        arrayList.add(next);
                    }
                }
                Iterator it3 = arrayList.iterator();
                boolean z = false;
                while (it3.hasNext()) {
                    NLETrack track = (NLETrack) it3.next();
                    o.LJIIIIZZ(track, "track");
                    Iterator<NLETrackSlot> it4 = track.LJIILL().iterator();
                    while (it4.hasNext()) {
                        NLETrackSlot slot = it4.next();
                        List<String> list2 = this.LIZLLL;
                        o.LJIIIIZZ(slot, "slot");
                        if (list2.contains(slot.getUUID())) {
                            Float f3 = this.LJ;
                            if (f3 != null) {
                                slot.setTransformX((f3.floatValue() - 0.5f) * 2);
                            }
                            Float f4 = this.LJFF;
                            if (f4 != null) {
                                slot.setTransformY((0.5f - f4.floatValue()) * 2);
                            }
                            if (this.LJI) {
                                slot.setTransientExtra(this.LIZIZ, this.LIZJ);
                            }
                            z = true;
                        }
                    }
                }
                if (this.LJI && z) {
                    NLEModel LJ2 = nleEditor.LJ();
                    o.LJIIIIZZ(LJ2, "nleEditor.model");
                    LJ2.setTransientExtra(this.LIZIZ, this.LIZJ);
                }
            }

            {
                this.LIZLLL = list;
                this.LJ = f;
                this.LJFF = f2;
                String NLEInstantMode_Key_get = NLEEditorJniJNI.NLEInstantMode_Key_get();
                o.LJIIIIZZ(NLEInstantMode_Key_get, "NLEInstantMode.getKey()");
                this.LIZIZ = NLEInstantMode_Key_get;
                String NLEInstantMode_InstantStickerTransform_get = NLEEditorJniJNI.NLEInstantMode_InstantStickerTransform_get();
                o.LJIIIIZZ(NLEInstantMode_InstantStickerTransform_get, "NLEInstantMode.getInstantStickerTransform()");
                this.LIZJ = NLEInstantMode_InstantStickerTransform_get;
            }
        });
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C122024qc LJJJJLI = LJJJJLI((String) it.next());
            if (LJJJJLI != null) {
                if (f != null) {
                    LJJJJLI.LJ = f.floatValue();
                }
                if (f2 != null) {
                    LJJJJLI.LJFF = f2.floatValue();
                }
            }
        }
    }

    @Override // X.C5WG
    public final void LJIIL(final Float f, final Float f2, final String uuid) {
        o.LJIIIZ(uuid, "uuid");
        this.LJIIIZ.invoke(new AbstractC121974qX(f, f2, uuid) { // from class: X.4p9
            public final String LIZIZ;
            public final Float LIZJ;
            public final Float LIZLLL;

            @Override // X.AbstractC121974qX
            public final void LIZJ(NLEEditor nleEditor) {
                o.LJIIIZ(nleEditor, "nleEditor");
                NLEModel LJ = nleEditor.LJ();
                o.LJIIIIZZ(LJ, "nleEditor.model");
                NLETrackSlot LJIIL = C1DF.LJIIL(LJ, this.LIZIZ);
                if (LJIIL != null) {
                    Float f3 = this.LIZJ;
                    if (f3 != null) {
                        LJIIL.setTransformX((f3.floatValue() - 0.5f) * 2);
                    }
                    Float f4 = this.LIZLLL;
                    if (f4 != null) {
                        LJIIL.setTransformY((0.5f - f4.floatValue()) * 2);
                    }
                }
            }

            {
                o.LJIIIZ(uuid, "uuid");
                this.LIZIZ = uuid;
                this.LIZJ = f;
                this.LIZLLL = f2;
            }
        });
        C122024qc LJJJJLI = LJJJJLI(uuid);
        if (LJJJJLI != null) {
            if (f != null) {
                LJJJJLI.LJ = f.floatValue();
            }
            if (f2 != null) {
                LJJJJLI.LJFF = f2.floatValue();
            }
        }
    }
}
