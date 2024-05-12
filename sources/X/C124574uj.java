package X;

import Y.IDComparatorS30S0000000_2;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextTemplate;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoFrameModel;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.ugc.android.editor.core.EditorProContext;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.4uj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124574uj {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C122264r0.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C122274r1.LJLIL);

    public static final float LIZ(NLESegmentVideo nLESegmentVideo) {
        if (nLESegmentVideo.LJFF() == 1.0d) {
            return nLESegmentVideo.getAbsSpeed();
        }
        return (float) nLESegmentVideo.LJFF();
    }

    public static final long LIZLLL(NLEModel newModel) {
        o.LJIIIZ(newModel, "newModel");
        VecNLETrackSPtr tracks = newModel.getTracks();
        o.LJIIIIZZ(tracks, "newModel.tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (LJ(it2)) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        long j = 0;
        while (it3.hasNext()) {
            NLETrack nLETrack = (NLETrack) it3.next();
            if (nLETrack.LJIIJJI() > j) {
                j = nLETrack.LJIIJJI();
            }
        }
        return j;
    }

    public static final boolean LJ(NLETrack nLETrack) {
        if (!o.LJ(nLETrack.getExtra("follow_max"), "FALSE") && nLETrack.getEnable()) {
            return true;
        }
        return false;
    }

    public static final int LJFF(NLEModel nLEModel) {
        o.LJIIIZ(nLEModel, "<this>");
        NLEVideoFrameModel cover = nLEModel.getCover();
        if (cover != null && cover.getEnable()) {
            return LJIIZILJ(nLEModel) + 1;
        }
        int LJIIZILJ = LJIIZILJ(nLEModel) + 1;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (!nLETrack.LJIIJ() && o.LJ(LJJIIZ(nLETrack), "sticker")) {
                LIZ2.add(next);
            }
        }
        for (NLETrack nLETrack2 : ORZ.LLILII(new IDComparatorS30S0000000_2(80), LIZ2)) {
            if (nLETrack2.LJIILL().size() == 0) {
                nLEModel.removeTrack(nLETrack2);
                return nLETrack2.getLayer();
            }
        }
        return LJIIZILJ;
    }

    public static final int LJI(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (nLETrack.getEnable() && LJJJIL(nLETrack)) {
                LIZ2.add(next);
            }
        }
        Iterator it2 = LIZ2.iterator();
        int i = 0;
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr LJIILL = ((NLETrack) it2.next()).LJIILL();
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrackSlot> it3 = LJIILL.iterator();
            while (it3.hasNext()) {
                NLETrackSlot next2 = it3.next();
                NLETrackSlot effect = next2;
                o.LJIIIIZZ(effect, "effect");
                NLESegmentEffect LIZLLL = NLESegmentEffect.LIZLLL(effect.LJI());
                if (LIZLLL != null) {
                    NLEResourceNode LJ = LIZLLL.LJ();
                    if (EnumC123834tX.swigToEnum(NLEEditorJniJNI.NLEResourceNode_getResourceTag(LJ.LIZ, LJ)) == EnumC123834tX.AMAZING) {
                        arrayList.add(next2);
                    }
                }
            }
            i += arrayList.size();
        }
        return i;
    }

    public static final List<NLETrack> LJII(NLEModel nLEModel) {
        o.LJIIIZ(nLEModel, "<this>");
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        o.LJIIIIZZ(tracks, "tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (nLETrack.getEnable() && C79057V0z.LJJIJIL(nLETrack) == EnumC123864ta.AUDIO && !LJJJJIZL(nLETrack) && !LJJJJZ(nLETrack)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final List<NLETrack> LJIIIIZZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (nLETrack.getEnable() && LJJJIL(nLETrack) && !nLETrack.LJIILL().isEmpty()) {
                LIZ2.add(next);
            }
        }
        return ORZ.LLILII(new IDComparatorS30S0000000_2(77), LIZ2);
    }

    public static final List<NLETrack> LJIIIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (nLETrack.getEnable() && LJJJLIIL(nLETrack) && !nLETrack.LJIILL().isEmpty()) {
                LIZ2.add(next);
            }
        }
        return LIZ2;
    }

    public static final NLESegmentTextSticker LJIIJ(EditorProContext editorProContext) {
        NLETrackSlot selectedTrackSlot;
        NLETrackSlot LJJJJI;
        o.LJIIIZ(editorProContext, "<this>");
        if (LJJIZ(C79057V0z.LJJI(editorProContext))) {
            NLETrack LJJJJ = C79057V0z.LJJJJ(editorProContext);
            if (LJJJJ == null || (LJJJJI = C79057V0z.LJJJJI(editorProContext)) == null || !LJJJLL(LJJJJ)) {
                return null;
            }
            return NLESegmentTextSticker.LJFF(LJJJJI.LJI());
        }
        NLETrack selectedTrack = editorProContext.getSelectedTrack();
        if (selectedTrack == null || (selectedTrackSlot = editorProContext.getSelectedTrackSlot()) == null || !LJJJLL(selectedTrack)) {
            return null;
        }
        return NLESegmentTextSticker.LJFF(selectedTrackSlot.LJI());
    }

    public static final int LJIIJJI(NLEModel nLEModel) {
        int i;
        int i2;
        int i3;
        int i4;
        if (LJIIIIZZ(nLEModel).isEmpty()) {
            return 0;
        }
        Iterator<NLETrack> it = LJIIIIZZ(nLEModel).iterator();
        if (it.hasNext()) {
            Iterator<NLETrackSlot> it2 = it.next().LJIILL().iterator();
            if (it2.hasNext()) {
                NLETrackSlot next = it2.next();
                if (next.hasExtra("slot_add_order")) {
                    i = C64504PTg.LIZ(next, "slot_add_order", "slot.getExtra(ExtraKeys.SLOT_ADD_ORDER)");
                } else {
                    i = 0;
                }
                while (it2.hasNext()) {
                    NLETrackSlot next2 = it2.next();
                    if (next2.hasExtra("slot_add_order")) {
                        i4 = C64504PTg.LIZ(next2, "slot_add_order", "slot.getExtra(ExtraKeys.SLOT_ADD_ORDER)");
                    } else {
                        i4 = 0;
                    }
                    if (i < i4) {
                        i = i4;
                    }
                }
                while (it.hasNext()) {
                    Iterator<NLETrackSlot> it3 = it.next().LJIILL().iterator();
                    if (it3.hasNext()) {
                        NLETrackSlot next3 = it3.next();
                        if (next3.hasExtra("slot_add_order")) {
                            i2 = C64504PTg.LIZ(next3, "slot_add_order", "slot.getExtra(ExtraKeys.SLOT_ADD_ORDER)");
                        } else {
                            i2 = 0;
                        }
                        while (it3.hasNext()) {
                            NLETrackSlot next4 = it3.next();
                            if (next4.hasExtra("slot_add_order")) {
                                i3 = C64504PTg.LIZ(next4, "slot_add_order", "slot.getExtra(ExtraKeys.SLOT_ADD_ORDER)");
                            } else {
                                i3 = 0;
                            }
                            if (i2 < i3) {
                                i2 = i3;
                            }
                        }
                        if (i < i2) {
                            i = i2;
                        }
                    } else {
                        throw new NoSuchElementException();
                    }
                }
                return i + 1;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public static final int LJIIL(NLEModel nLEModel) {
        int i;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (nLETrack.getEnable() && LJJJIL(nLETrack)) {
                LIZ2.add(next);
            }
        }
        Iterator it2 = LIZ2.iterator();
        while (it2.hasNext()) {
            i += ((NLETrack) it2.next()).LJIILL().size();
        }
        return i;
    }

    public static final List<NLETrack> LJIILIIL(NLEModel nLEModel) {
        o.LJIIIZ(nLEModel, "<this>");
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        o.LJIIIIZZ(tracks, "tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (nLETrack.getEnable() && LJJJIL(nLETrack)) {
                arrayList.add(next);
            }
        }
        return ORZ.LLILII(new IDComparatorS30S0000000_2(78), arrayList);
    }

    public static Integer LJIILLIIL(NLETrackSlot nLETrackSlot) {
        o.LJIIIZ(nLETrackSlot, "<this>");
        try {
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (nLETrackSlot.hasExtra("ep_crop_mode")) {
            String extra = nLETrackSlot.getExtra("ep_crop_mode");
            o.LJIIIIZZ(extra, "getExtra(key)");
            return Integer.valueOf(CastIntegerProtector.parseInt(extra));
        }
        return null;
    }

    public static final int LJIIZILJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        o.LJIIIZ(nLEModel, "<this>");
        NLEVideoFrameModel cover = nLEModel.getCover();
        if (cover != null && cover.getEnable()) {
            tracks = nLEModel.getCover().getTracks();
        } else {
            tracks = nLEModel.getTracks();
        }
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "realTracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (!nLETrack.LJIIJ() && o.LJ(LJJIIZ(nLETrack), "sticker")) {
                LIZ2.add(next);
            }
        }
        Iterator it2 = LIZ2.iterator();
        int i = -1;
        while (it2.hasNext()) {
            NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) it2.next();
            if (nLETimeSpaceNode.getLayer() > i) {
                i = nLETimeSpaceNode.getLayer();
            }
        }
        return i;
    }

    public static final int LJIJ(NLEModel nLEModel) {
        int i;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (nLETrack.getEnable() && C79057V0z.LJJIJIL(nLETrack) == EnumC123864ta.VIDEO && !nLETrack.LJIIJ()) {
                LIZ2.add(next);
            }
        }
        Iterator it2 = LIZ2.iterator();
        while (it2.hasNext()) {
            i += ((NLETrack) it2.next()).LJIILL().size();
        }
        return i;
    }

    public static final List<NLETrack> LJIJI(NLEModel nLEModel) {
        o.LJIIIZ(nLEModel, "<this>");
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        o.LJIIIIZZ(tracks, "tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (nLETrack.getEnable() && C79057V0z.LJJIJIL(nLETrack) == EnumC123864ta.VIDEO && !nLETrack.LJIIJ()) {
                arrayList.add(next);
            }
        }
        return ORZ.LLILII(new IDComparatorS30S0000000_2(79), arrayList);
    }

    public static final String LJIJJ(NLETrackSlot nLETrackSlot) {
        o.LJIIIZ(nLETrackSlot, "<this>");
        NLESegmentEffect LIZLLL = NLESegmentEffect.LIZLLL(nLETrackSlot.LJI());
        if (LIZLLL != null) {
            return LIZLLL.LJ().LIZLLL();
        }
        NLESegmentComposerFilter LJIIIIZZ = NLESegmentComposerFilter.LJIIIIZZ(nLETrackSlot.LJI());
        if (LJIIIIZZ != null) {
            return LJIIIIZZ.LJ().LIZLLL();
        }
        return null;
    }

    public static final EnumC123944ti LJIJJLI(NLETrackSlot nLETrackSlot) {
        o.LJIIIZ(nLETrackSlot, "<this>");
        if (NLESegmentTextTemplate.LIZLLL(nLETrackSlot.LJI()) != null) {
            return EnumC123944ti.TEXT_TEMPLATE;
        }
        if (NLESegmentTextSticker.LJFF(nLETrackSlot.LJI()) != null) {
            return EnumC123944ti.TEXT_STICKER;
        }
        if (NLESegmentInfoSticker.LJFF(nLETrackSlot.LJI()) != null) {
            return EnumC123944ti.INFO_STICKER;
        }
        return EnumC123944ti.TEXT_ANIM;
    }

    public static final int LJIL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (LJJJJLL(it2)) {
                LIZ2.add(next);
            }
        }
        Iterator it3 = LIZ2.iterator();
        int i = 0;
        while (it3.hasNext()) {
            i += ((NLETrack) it3.next()).LJIILL().size();
        }
        return i;
    }

    public static final List<NLETrack> LJJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (LJJJJLL(it2)) {
                LIZ2.add(next);
            }
        }
        return LIZ2;
    }

    public static final float LJJI(NLESegment nLESegment) {
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLESegment);
        if (LJJ != null) {
            return LJJ.getAbsSpeed();
        }
        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLESegment);
        if (LIZLLL != null) {
            return LIZLLL.getAbsSpeed();
        }
        return 1.0f;
    }

    public static final List<NLETrack> LJJIFFI(NLEModel nLEModel) {
        o.LJIIIZ(nLEModel, "<this>");
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        o.LJIIIIZZ(tracks, "tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (nLETrack.getEnable() && C79057V0z.LJJIJIL(nLETrack) == EnumC123864ta.STICKER) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final int LJJII(NLEModel nLEModel) {
        int i;
        int i2;
        int i3;
        int i4;
        if (((ArrayList) LJIIIZ(nLEModel)).isEmpty()) {
            return 0;
        }
        Iterator it = ((ArrayList) LJIIIZ(nLEModel)).iterator();
        if (it.hasNext()) {
            Iterator<NLETrackSlot> it2 = ((NLETrack) it.next()).LJIILL().iterator();
            if (it2.hasNext()) {
                NLETrackSlot next = it2.next();
                if (next.hasExtra("slot_add_order")) {
                    i = C64504PTg.LIZ(next, "slot_add_order", "slot.getExtra(ExtraKeys.SLOT_ADD_ORDER)");
                } else {
                    i = 0;
                }
                while (it2.hasNext()) {
                    NLETrackSlot next2 = it2.next();
                    if (next2.hasExtra("slot_add_order")) {
                        i4 = C64504PTg.LIZ(next2, "slot_add_order", "slot.getExtra(ExtraKeys.SLOT_ADD_ORDER)");
                    } else {
                        i4 = 0;
                    }
                    if (i < i4) {
                        i = i4;
                    }
                }
                while (it.hasNext()) {
                    Iterator<NLETrackSlot> it3 = ((NLETrack) it.next()).LJIILL().iterator();
                    if (it3.hasNext()) {
                        NLETrackSlot next3 = it3.next();
                        if (next3.hasExtra("slot_add_order")) {
                            i2 = C64504PTg.LIZ(next3, "slot_add_order", "slot.getExtra(ExtraKeys.SLOT_ADD_ORDER)");
                        } else {
                            i2 = 0;
                        }
                        while (it3.hasNext()) {
                            NLETrackSlot next4 = it3.next();
                            if (next4.hasExtra("slot_add_order")) {
                                i3 = C64504PTg.LIZ(next4, "slot_add_order", "slot.getExtra(ExtraKeys.SLOT_ADD_ORDER)");
                            } else {
                                i3 = 0;
                            }
                            if (i2 < i3) {
                                i2 = i3;
                            }
                        }
                        if (i < i2) {
                            i = i2;
                        }
                    } else {
                        throw new NoSuchElementException();
                    }
                }
                return i + 1;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public static final int LJJIII(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            if (LJJJLIIL(next)) {
                LIZ2.add(next);
            }
        }
        Iterator it2 = LIZ2.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += ((NLETrack) it2.next()).LJIILL().size();
        }
        return i;
    }

    public static final List<NLETrack> LJJIIJ(NLEModel nLEModel) {
        o.LJIIIZ(nLEModel, "<this>");
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        o.LJIIIIZZ(tracks, "tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            if (LJJJLIIL(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final String LJJIIZ(NLETrack nLETrack) {
        o.LJIIIZ(nLETrack, "<this>");
        String extra = nLETrack.getExtra("track_type");
        o.LJIIIIZZ(extra, "getExtra(Constants.TRACK_TYPE)");
        return extra;
    }

    public static final float LJJIIZI(NLESegment nLESegment) {
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLESegment);
        if (LJJ != null) {
            return LJJ.LJIILJJIL();
        }
        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLESegment);
        if (LIZLLL != null) {
            return LIZLLL.LJIILJJIL();
        }
        return 0.0f;
    }

    public static final boolean LJJIJIIJI(NLETrackSlot nLETrackSlot) {
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
        if (LJJ == null) {
            return false;
        }
        return LJJ.LJ().LJIIZILJ();
    }

    public static final boolean LJJIJIIJIL(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot.hasExtra("has_origin_audio_slot") && Boolean.parseBoolean(nLETrackSlot.getExtra("has_origin_audio_slot"))) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJIL(NLETrack nLETrack) {
        o.LJIIIZ(nLETrack, "<this>");
        if (C79057V0z.LJJIJIL(nLETrack) == EnumC123864ta.AUDIO && o.LJ(nLETrack.getExtra("AudioTrackType"), "AUDIO_RECORD")) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJL(NLETrackSlot nLETrackSlot) {
        o.LJIIIZ(nLETrackSlot, "<this>");
        if (NLESegmentAudio.LIZLLL(nLETrackSlot.LJI()) != null && NLESegmentVideo.LJJ(nLETrackSlot.LJI()) == null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJLIJ(NLETrack nLETrack) {
        if (nLETrack == null) {
            return false;
        }
        EnumC123864ta LJIIZILJ = nLETrack.LJIIZILJ();
        EnumC123864ta enumC123864ta = EnumC123864ta.AUDIO;
        if (LJIIZILJ != enumC123864ta && nLETrack.LJII() != enumC123864ta) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIL(NLETrack nLETrack) {
        if (nLETrack == null || C79057V0z.LJJIJIL(nLETrack) != EnumC123864ta.AUDIO || !o.LJ(nLETrack.getExtra("AudioTrackType"), "BGM")) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIZ(NLEModel nLEModel) {
        NLEVideoFrameModel cover = nLEModel.getCover();
        if (cover != null) {
            return cover.getEnable();
        }
        return false;
    }

    public static final boolean LJJJ(NLETrack nLETrack) {
        if (nLETrack == null || C79057V0z.LJJIJIL(nLETrack) != EnumC123864ta.AUDIO || !o.LJ(nLETrack.getExtra("AudioTrackType"), "EDITOR_MUSIC")) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJI(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null) {
            return false;
        }
        if (NLESegmentEffect.LIZLLL(nLETrackSlot.LJI()) == null && NLESegmentComposerFilter.LJIIIIZZ(nLETrackSlot.LJI()) == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJIL(NLETrack nLETrack) {
        if (nLETrack == null || C79057V0z.LJJIJIL(nLETrack) != EnumC123864ta.EFFECT || !o.LJ(nLETrack.getExtra("EffectTrackType"), "NORMAL")) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJ(NLETrackSlot nLETrackSlot) {
        NLEResourceNode LIZIZ2;
        EnumC123874tb enumC123874tb;
        o.LJIIIZ(nLETrackSlot, "<this>");
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
        if (LJJ == null) {
            return false;
        }
        if (C124614un.LJIILIIL(nLETrackSlot)) {
            LIZIZ2 = C124614un.LJIIIIZZ(nLETrackSlot);
        } else {
            LIZIZ2 = LJJ.LIZIZ();
        }
        if (LIZIZ2 != null) {
            enumC123874tb = LIZIZ2.LJFF();
        } else {
            enumC123874tb = null;
        }
        if (enumC123874tb != EnumC123874tb.IMAGE) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJI(NLETrackSlot nLETrackSlot) {
        NLESegment mainSegment = nLETrackSlot.LJI();
        o.LJIIIIZZ(mainSegment, "mainSegment");
        if (LJJIIZI(mainSegment) == 0.0f) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJIZL(NLETrack nLETrack) {
        o.LJIIIZ(nLETrack, "<this>");
        if (C79057V0z.LJJIJIL(nLETrack) == EnumC123864ta.AUDIO && o.LJ(nLETrack.getExtra("AudioTrackType"), "ORIGIN")) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJJ(NLETrackSlot nLETrackSlot) {
        EnumC123874tb enumC123874tb;
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
        if (LJJ == null) {
            return false;
        }
        NLEResourceAV LJ = LJJ.LJ();
        if (LJ != null) {
            enumC123874tb = LJ.LJFF();
        } else {
            enumC123874tb = null;
        }
        if (enumC123874tb != EnumC123874tb.IMAGE) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJJL(NLETrack nLETrack) {
        if (nLETrack == null || !LJJL(nLETrack) || nLETrack.LJIIJ()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJL(InterfaceC124924vI interfaceC124924vI) {
        NLETrack selectedTrack;
        o.LJIIIZ(interfaceC124924vI, "<this>");
        NLETrack selectedTrack2 = interfaceC124924vI.getSelectedTrack();
        if (selectedTrack2 != null && LJJL(selectedTrack2) && (selectedTrack = interfaceC124924vI.getSelectedTrack()) != null && !selectedTrack.LJIIJ()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJLL(NLETrack nLETrack) {
        o.LJIIIZ(nLETrack, "<this>");
        if (C79057V0z.LJJIJIL(nLETrack) == EnumC123864ta.AUDIO && o.LJ(nLETrack.getExtra("AudioTrackType"), "SOUND_EFFECT")) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJZ(NLETrack nLETrack) {
        if (C79057V0z.LJJIJIL(nLETrack) == EnumC123864ta.AUDIO && o.LJ(nLETrack.getExtra("AudioTrackType"), "TEXT_SPEAK")) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJZI(NLETrackSlot nLETrackSlot) {
        o.LJIIIZ(nLETrackSlot, "<this>");
        if (NLESegmentTextSticker.LJFF(nLETrackSlot.LJI()) != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJLIIL(NLETrack nLETrack) {
        if (nLETrack == null || C79057V0z.LJJIJIL(nLETrack) != EnumC123864ta.STICKER || !o.LJ(nLETrack.getExtra("StickerTrackType"), "TEXT")) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJLL(NLETrack nLETrack) {
        o.LJIIIZ(nLETrack, "<this>");
        return o.LJ(LJJIIZ(nLETrack), "sticker");
    }

    public static final boolean LJJJLZIJ(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot.hasExtra("slot_extra_source_type") && (C64504PTg.LIZ(nLETrackSlot, "slot_extra_source_type", "getExtra(key)") == EnumC124594ul.UploadFromRecordPage.getValue() || C64504PTg.LIZ(nLETrackSlot, "slot_extra_source_type", "getExtra(\n        key\n    )") == EnumC124594ul.UploadFromEditorPro.getValue())) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJZ(NLETrack nLETrack) {
        if (C79057V0z.LJJIJIL(nLETrack) == EnumC123864ta.AUDIO && o.LJ(nLETrack.getExtra("AudioTrackType"), "ORIGIN_VOICE_CONVERSION")) {
            return true;
        }
        return false;
    }

    public static final boolean LJJL(NLETrack nLETrack) {
        if (nLETrack == null) {
            return false;
        }
        EnumC123864ta LJIIZILJ = nLETrack.LJIIZILJ();
        EnumC123864ta enumC123864ta = EnumC123864ta.VIDEO;
        if (LJIIZILJ != enumC123864ta && nLETrack.LJII() != enumC123864ta) {
            return false;
        }
        return true;
    }

    public static final void LJJLI(NLETrack nLETrack) {
        String str;
        o.LJIIIZ(nLETrack, "<this>");
        if (C51M.LIZIZ) {
            str = "TRUE";
        } else {
            str = "FALSE";
        }
        nLETrack.setExtra("follow_max", str);
    }

    public static final void LJJLIIIIJ(NLESegment nLESegment) {
        float f;
        if (C1JD.LIZLLL()) {
            f = ((Number) C5BA.LIZ(EnumC127484zQ.VOLUME_DEFAULT, Float.valueOf(0.0f))).floatValue();
        } else {
            f = 1.0f;
        }
        LJJLIIIJJI(nLESegment, f);
    }

    public static final long LJJLIIIJJIZ(long j) {
        return TimeUnit.MILLISECONDS.toMicros(j);
    }

    public static final long LJJLIIIJL(long j) {
        return TimeUnit.MICROSECONDS.toMillis(j);
    }

    public static final C145715nj LIZIZ(Context context, String path) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(context, "context");
        return C152205yC.LIZ.LIZJ(context, path);
    }

    public static final String LJIILJJIL(String str, EditorProContext editorProContext) {
        o.LJIIIZ(editorProContext, "<this>");
        return C79057V0z.LJJI(editorProContext).getExtra(str);
    }

    public static final NLETrack LJJIIJZLJL(NLEModel nLEModel, String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator LIZJ = t1.LIZJ(nLEModel, "tracks");
        while (LIZJ.hasNext()) {
            NLETrack nLETrack = (NLETrack) LIZJ.next();
            Iterator<NLETrackSlot> it = nLETrack.LJIILL().iterator();
            while (it.hasNext()) {
                if (it.next().getUUID().equals(str)) {
                    return nLETrack;
                }
            }
            Iterator<NLETrackSlot> it2 = nLETrack.LJIJ().iterator();
            while (true) {
                if (it2.hasNext()) {
                    NLETrackSlot next = it2.next();
                    if (o.LJ(next.getUUID(), str)) {
                        if (next != null) {
                            return nLETrack;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final boolean LJJIJ(String str, EditorProContext editorProContext) {
        o.LJIIIZ(editorProContext, "<this>");
        return C79057V0z.LJJI(editorProContext).hasExtra(str);
    }

    public static final boolean LJJJJLI(boolean z, NLETrack nLETrack) {
        boolean z2;
        List LLJILJILJ;
        if (C79057V0z.LJJIJIL(nLETrack) == EnumC123864ta.AUDIO) {
            z2 = true;
        } else {
            z2 = false;
        }
        String extra = nLETrack.getExtra("AudioTrackType");
        if (z) {
            LLJILJILJ = (List) LIZ.getValue();
        } else {
            LLJILJILJ = ORZ.LLJILJILJ((Collection) LIZ.getValue());
            ((ArrayList) LLJILJILJ).removeAll((Collection) LIZIZ.getValue());
        }
        if (!z2 || !LLJILJILJ.contains(extra)) {
            return false;
        }
        return true;
    }

    public static final void LJJLIIIJILLIZJL(NLETrack nLETrack, String str) {
        o.LJIIIZ(nLETrack, "<this>");
        nLETrack.setExtra("track_type", str);
    }

    public static final void LJJLIIIJJI(NLESegment nLESegment, float f) {
        if (!C1JD.LIZLLL()) {
            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLESegment);
            if (LJJ != null) {
                LJJ.LJIL(f);
            }
            NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLESegment);
            if (LIZLLL == null) {
                return;
            }
            LIZLLL.LJIL(f);
            return;
        }
        NLESegmentVideo LJJ2 = NLESegmentVideo.LJJ(nLESegment);
        if (LJJ2 != null) {
            LJJ2.LJIILLIIL(((Number) C5BA.LIZ(EnumC127484zQ.VOLUME_DB_RANGE, Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX))).doubleValue());
            LJJ2.LJIL(f);
        }
        NLESegmentAudio LIZLLL2 = NLESegmentAudio.LIZLLL(nLESegment);
        if (LIZLLL2 != null) {
            LIZLLL2.LJIILLIIL(((Number) C5BA.LIZ(EnumC127484zQ.VOLUME_DB_RANGE, Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX))).doubleValue());
            LIZLLL2.LJIL(f);
        }
    }

    public static final C145715nj LIZJ(String path, EnumC123874tb enumC123874tb, Context context) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(context, "context");
        int i = C122464rK.LIZ[enumC123874tb.ordinal()];
        if (i == 1 || i == 2) {
            EnumC123874tb.VIDEO.swigValue();
        }
        return LIZIZ(context, path);
    }

    public static final Float LJIILL(NLETrackSlot nLETrackSlot, String str, Float f) {
        o.LJIIIZ(nLETrackSlot, "<this>");
        try {
            if (!nLETrackSlot.hasExtra(str)) {
                return f;
            }
            String extra = nLETrackSlot.getExtra(str);
            o.LJIIIIZZ(extra, "getExtra(key)");
            return Float.valueOf(CastFloatProtector.parseFloat(extra));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return f;
        }
    }

    public static final void LJJLIIIJ(EditorProContext editorProContext, String str, String str2) {
        o.LJIIIZ(editorProContext, "<this>");
        C79057V0z.LJJI(editorProContext).setExtra(str, str2);
    }
}
