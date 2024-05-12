package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.vesdk.VEUtils;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import com.ss.ugc.android.editor.core.tracklinkage.TrackLinkageManagerProvider;
import defpackage.g0;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.4vD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124874vD extends C124704uw implements InterfaceC125474wB {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C124874vD(InterfaceC124924vI editorContext) {
        super(editorContext);
        o.LJIIIZ(editorContext, "editorContext");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9  */
    @Override // X.InterfaceC125474wB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.ies.nle.editor_jni.NLETrackSlot LJIIJ(com.ss.ugc.android.editor.core.api.params.EditMedia r22, X.C124884vE r23) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124874vD.LJIIJ(com.ss.ugc.android.editor.core.api.params.EditMedia, X.4vE):com.bytedance.ies.nle.editor_jni.NLETrackSlot");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149  */
    @Override // X.InterfaceC125474wB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(java.util.List<com.ss.ugc.android.editor.core.api.params.EditMedia> r25, X.C124884vE r26) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124874vD.LJIJ(java.util.List, X.4vE):void");
    }

    @Override // X.InterfaceC125474wB
    public final boolean LJIJI(List selectedMedias, Boolean bool, AqS152S0100000_2 aqS152S0100000_2) {
        boolean z;
        EnumC123874tb enumC123874tb;
        o.LJIIIZ(selectedMedias, "selectedMedias");
        NLETrackSlot LJJLIIIJ = LJJLIIIJ();
        boolean z2 = false;
        if (LJJLIIIJ == null) {
            return false;
        }
        EditMedia editMedia = (EditMedia) ListProtector.get(selectedMedias, 0);
        String LJIIIZ = C44729Hgz.LJIIIZ(editMedia);
        C44729Hgz.LJJI(editMedia);
        C145715nj LIZIZ = C124574uj.LIZIZ(C125444w8.LIZ().LIZ(), LJIIIZ);
        float measuredEndTime = (float) (LJJLIIIJ.getMeasuredEndTime() - LJJLIIIJ.getMeasuredStartTime());
        NLESegment LJI = LJJLIIIJ.LJI();
        o.LJIIIIZZ(LJI, "curSlot.mainSegment");
        float LJJI = C124574uj.LJJI(LJI) * measuredEndTime;
        if (editMedia.isVideo() && Math.abs((LJJI / 1000) - ((float) LIZIZ.LJLJJL)) >= 10.0f) {
            z = true;
        } else {
            z = false;
        }
        if (editMedia.isVideo()) {
            o.LJIIIIZZ(VEUtils.getAudioFileInfoForAllTracks(LJIIIZ), "getAudioFileInfoForAllTracks(realPath)");
            if (!r1.isEmpty()) {
                z2 = true;
            }
        }
        C124864vC.LJI(C79057V0z.LJJI(this.LJLIL), LJJLIIIJ);
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(LJJLIIIJ.LJI().deepClone());
        if (LJJ != null) {
            NLEResourceAV LJ = LJJ.LJ();
            if (editMedia.isVideo()) {
                enumC123874tb = EnumC123874tb.VIDEO;
            } else {
                enumC123874tb = EnumC123874tb.IMAGE;
            }
            LJ.LJIILIIL(enumC123874tb);
            if (editMedia.isVideo()) {
                LJ.setDuration(TimeUnit.MILLISECONDS.toMicros(LIZIZ.LJLJJL));
            } else {
                LJ.setDuration(LJJI);
            }
            int i = LIZIZ.LJLJJI;
            if (i == 90 || i == 270) {
                LJ.LJIIIIZZ(LIZIZ.LJLILLLLZI);
                LJ.LJIILJJIL(LIZIZ.LJLJI);
            } else {
                LJ.LJIIIIZZ(LIZIZ.LJLJI);
                LJ.LJIILJJIL(LIZIZ.LJLILLLLZI);
            }
            LJ.LJIIIZ(LJIIIZ);
            LJ.LJIJI(z2);
            long j = 0;
            if (z) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Long clipStartTime = editMedia.getClipStartTime();
                if (clipStartTime != null) {
                    j = clipStartTime.longValue();
                }
                LJJ.LJIJJLI(timeUnit.toMicros(j));
                LJJ.LJIJJ(LJJ.LJIILIIL() + LJJI);
                if (LJJ.LJIIL() > LJJ.LJ().getDuration()) {
                    LJJ.LJIJJ(LJJ.LJ().getDuration());
                }
            } else {
                LJJ.LJIJJLI(0L);
                LJJ.LJIJJ(LJJ.LJ().getDuration());
            }
            LJJLIIIJ.setEndTime(LJJ.getDuration() + LJJLIIIJ.getStartTime());
            LJJ.LJJIIJ(null);
        } else {
            LJJ = null;
        }
        LJJLIIIJ.removeExtraWithKey("ep_crop_scale");
        LJJLIIIJ.removeExtraWithKey("ep_crop_transX");
        LJJLIIIJ.removeExtraWithKey("ep_crop_transY");
        LJJLIIIJ.removeExtraWithKey("ep_crop_degree");
        LJJLIIIJ.removeExtraWithKey("ep_crop_ratio");
        LJJLIIIJ.removeExtraWithKey("ep_crop_mode");
        LJJLIIIJ.removeExtraWithKey("is_editorpro_crop_video");
        LJJLIIIJ.setExtra("slot_extra_source_type", String.valueOf(EnumC124594ul.UploadFromEditorPro.getValue()));
        LJJLIIIJ.removeExtraWithKey("has_origin_audio_slot");
        LJJLIIIJ.setExtra("is_editorpro_replace_video_clip", "1");
        LJJLIIIJ.LJIIL(LJJ);
        if (LJJLIIIJ.LJIIIIZZ() != null) {
            LJJLIIIJ.LJIILJJIL(null);
        }
        VecNLEVideoEffectSPtr LJIIJ = LJJLIIIJ.LJIIJ();
        ArrayList arrayList = new ArrayList();
        Iterator<NLEVideoEffect> it = LJIIJ.iterator();
        while (it.hasNext()) {
            NLEVideoEffect next = it.next();
            NLEVideoEffect it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (C124614un.LJIIJ(it2)) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            NLEVideoEffect nLEVideoEffect = (NLEVideoEffect) it3.next();
            NLEEditorJniJNI.NLETrackSlot_removeVideoEffect(LJJLIIIJ.LIZ, LJJLIIIJ, NLEVideoEffect.LIZ(nLEVideoEffect), nLEVideoEffect);
        }
        VecNLEFilterSPtr LJ2 = LJJLIIIJ.LJ();
        ArrayList arrayList2 = new ArrayList();
        Iterator<NLEFilter> it4 = LJ2.iterator();
        while (it4.hasNext()) {
            NLEFilter next2 = it4.next();
            NLEFilter it5 = next2;
            o.LJIIIIZZ(it5, "it");
            if (C124614un.LJIIJJI(it5)) {
                arrayList2.add(next2);
            }
        }
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            NLEFilter nLEFilter = (NLEFilter) it6.next();
            NLEEditorJniJNI.NLETrackSlot_removeFilter(LJJLIIIJ.LIZ, LJJLIIIJ, NLEFilter.LIZ(nLEFilter), nLEFilter);
        }
        if (LJJLIIIJ.hasExtra("ep_magic_resource_id")) {
            LJJLIIIJ.removeExtraWithKey("ep_magic_resource_id");
        }
        if (LJJLIIIJ.hasExtra("ep_magic_effect_id")) {
            LJJLIIIJ.removeExtraWithKey("ep_magic_effect_id");
        }
        C124864vC.LJ(r9());
        C124864vC.LIZLLL(r9());
        this.LJLIL.getMainTrack().LJJIFFI();
        if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
            C124614un.LIZJ(this.LJLIL);
        }
        aqS152S0100000_2.invoke();
        LJJJZ(EnumC124724uy.DONE, C6YK.LIZ(new C139795eB(EnumC126814yL.REPLACE.getNameId(), null, null, null, null, 30)));
        return true;
    }

    @Override // X.InterfaceC125474wB
    public final void LJIIIIZZ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, boolean z, boolean z2) {
        String str;
        long j;
        Float f;
        Float f2;
        String str2;
        String extra;
        String uuid;
        NLESegment LJI;
        NLESegment LJI2;
        NLETrack selectedTrack = this.LJLIL.getSelectedTrack();
        NLETrackSlot selectedTrackSlot = this.LJLIL.getSelectedTrackSlot();
        if (selectedTrackSlot != null) {
            str = selectedTrackSlot.getUUID();
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        InterfaceC124924vI interfaceC124924vI = this.LJLIL;
        NLETrackSlot selectedTrackSlot2 = interfaceC124924vI.getSelectedTrackSlot();
        if (selectedTrackSlot2 != null) {
            j = selectedTrackSlot2.getStartTime();
        } else {
            j = 0;
        }
        interfaceC124924vI.setLastSelectSlotStartTime(j);
        if (!o.LJ(nLETrack, selectedTrack)) {
            C79057V0z.LJJJJL(this.LJLIL, "track_select_change_event", new C124954vL(z));
        }
        C79057V0z.LJJJJL(this.LJLIL, "selected_nle_track_slot", new C124894vF(nLETrackSlot));
        C79057V0z.LJJJJL(this.LJLIL, "selected_nle_track", new C122724rk(nLETrack));
        InterfaceC124924vI interfaceC124924vI2 = this.LJLIL;
        if (nLETrackSlot != null && (LJI2 = nLETrackSlot.LJI()) != null) {
            f = Float.valueOf(C124574uj.LJJIIZI(LJI2));
        } else {
            f = null;
        }
        C79057V0z.LJJJJL(interfaceC124924vI2, "volume_changed_event", new C2ZY(f));
        InterfaceC124924vI interfaceC124924vI3 = this.LJLIL;
        if (nLETrackSlot != null && (LJI = nLETrackSlot.LJI()) != null) {
            f2 = Float.valueOf(C124574uj.LJJI(LJI));
        } else {
            f2 = null;
        }
        C79057V0z.LJJJJL(interfaceC124924vI3, "speed_changed_event", new C60632Zn(f2));
        C79057V0z.LJJJJL(this.LJLIL, "slot_select_change_event", new C127594zb(nLETrackSlot, null, 14));
        C124904vG c124904vG = (C124904vG) C79057V0z.LJJIIJ(this.LJLIL, "magic_changed_event");
        if (c124904vG == null || (str2 = c124904vG.LJLIL) == null) {
            str2 = "";
        }
        if (nLETrackSlot == null || !nLETrackSlot.hasExtra("ep_magic_resource_id") || (extra = nLETrackSlot.getExtra("ep_magic_resource_id")) == null) {
            extra = "";
        }
        String str4 = (String) ORZ.LJLLLL(s.LJLJJL(extra, new String[]{","}, 0, 6));
        if (str4 == null) {
            str4 = "";
        }
        if (nLETrackSlot != null && (uuid = nLETrackSlot.getUUID()) != null) {
            str3 = uuid;
        }
        if (!o.LJ(str4, str2) || !o.LJ(str3, str)) {
            C79057V0z.LJJJJL(this.LJLIL, "magic_changed_event", new C124904vG(str4));
        }
    }

    @Override // X.InterfaceC125474wB
    public final void LJIIIZ(NLETrackSlot slot, long j, long j2, EnumC124724uy enumC124724uy) {
        int i;
        String str;
        String str2;
        long LJII;
        EnumC123864ta LJJIJIL;
        EnumC124724uy enumC124724uy2 = enumC124724uy;
        long j3 = j;
        long j4 = j2;
        o.LJIIIZ(slot, "slot");
        this.LJLIL.getPlayer().pause();
        if (slot.getStartTime() + j3 <= 1000) {
            j3 = -slot.getStartTime();
        }
        if (C124574uj.LJJJI(slot)) {
            C131935Ft.LIZ("onClip track slot");
            slot.setStartTime(slot.getStartTime() + j3);
            slot.setEndTime(slot.getStartTime() + j4);
            LJJJZ(enumC124724uy2, null);
            return;
        }
        NLETrack trackBySlot = r9().getTrackBySlot(slot);
        if (trackBySlot == null || (LJJIJIL = C79057V0z.LJJIJIL(trackBySlot)) == null) {
            i = -1;
        } else {
            i = C122564rU.LIZ[LJJIJIL.ordinal()];
        }
        if (i == 1) {
            str = "audio";
        } else if (i == 2) {
            str = "video";
        } else if (i == 3) {
            str = "sticker";
        } else if (i != 4) {
            NLETrack trackBySlot2 = r9().getTrackBySlot(slot);
            if (trackBySlot2 != null) {
                str = C124574uj.LJJIIZ(trackBySlot2);
            } else {
                str = null;
            }
        } else if (C124574uj.LJJJIL(trackBySlot)) {
            str = "video_effect";
        } else {
            str = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onClipTrackSlot trackType = ");
        if (str == null) {
            str2 = "null";
        } else {
            str2 = str;
        }
        LIZ.append(str2);
        C131935Ft.LIZIZ("EditorProContext", X1D.LIZIZ(LIZ));
        if (str == null) {
            return;
        }
        switch (str.hashCode()) {
            case -1890252483:
                if (!str.equals("sticker")) {
                    return;
                }
                InterfaceC124924vI interfaceC124924vI = this.LJLIL;
                if (enumC124724uy2 == null) {
                    enumC124724uy2 = EnumC124724uy.NONE;
                }
                C79057V0z.LJJJJL(interfaceC124924vI, "clip_sticker_slot_event", new C125034vT(slot, j3, j4, enumC124724uy2));
                return;
            case -422099471:
                if (!str.equals("type_filter_adjust")) {
                    return;
                }
                break;
            case -409423403:
                if (!str.equals("video_effect")) {
                    return;
                }
                slot.setStartTime(slot.getStartTime() + j3);
                slot.setEndTime(j3 + j4);
                this.LJLIL.getKeyframeEditor().LJJJJLL(slot);
                LJJJZ(enumC124724uy2, null);
                return;
            case -274277926:
                if (!str.equals("type_filter_filter")) {
                    return;
                }
                break;
            case 93166550:
                if (!str.equals("audio")) {
                    return;
                }
                NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(slot.LJI());
                slot.setStartTime(slot.getStartTime() + j3);
                slot.setEndTime(slot.getStartTime() + j4);
                LIZLLL.LJIJJLI(LIZLLL.LJIILIIL() + j3);
                LIZLLL.LJIJJ((LIZLLL.getAbsSpeed() * ((float) j4)) + ((float) LIZLLL.LJIILIIL()));
                if (LIZLLL.LJII() >= j4) {
                    LJII = j4;
                } else {
                    LJII = LIZLLL.LJII();
                }
                LIZLLL.LJIIZILJ(LJII);
                if (LIZLLL.LJIIIIZZ() < j4) {
                    j4 = LIZLLL.LJIIIIZZ();
                }
                LIZLLL.LJIJ(j4);
                if (!trackBySlot.hasExtra("track_extra_is_audio_adjust_duration")) {
                    trackBySlot.setExtra("track_extra_is_audio_adjust_duration", "true");
                }
                this.LJLIL.getKeyframeEditor().LJJJJLL(slot);
                LJJJZ(enumC124724uy2, null);
                return;
            case 112202875:
                if (!str.equals("video")) {
                    return;
                }
                NLESegmentVideo LJJ = NLESegmentVideo.LJJ(slot.LJI());
                slot.setStartTime(slot.getStartTime() + j3);
                slot.setEndTime(slot.getStartTime() + j4);
                if (C124574uj.LJJJJ(slot)) {
                    LJJ.LJIJJ(LJJ.LJIILIIL() + (LJJ.getAbsSpeed() * ((float) j4)));
                    NLEResourceNode LIZIZ = LJJ.LIZIZ();
                    if (LIZIZ != null) {
                        LIZIZ.setDuration(j4);
                    }
                } else {
                    LJJ.LJIJJLI(LJJ.LJIILIIL() + (LJJ.getAbsSpeed() * ((float) j3)));
                    LJJ.LJIJJ(LJJ.LJIILIIL() + (LJJ.getAbsSpeed() * ((float) j4)));
                }
                this.LJLIL.getKeyframeEditor().LJJJJLL(slot);
                LJJJZ(enumC124724uy2, null);
                return;
            default:
                return;
        }
        slot.setStartTime(slot.getStartTime() + j3);
        slot.setEndTime(j3 + j4);
        this.LJLIL.getKeyframeEditor().LJJJJLL(slot);
        g0.LJIIJJI((NLEEditor) this.LJLJI.getValue(), false, false, 3);
    }

    @Override // X.InterfaceC125474wB
    public final void LJJIFFI(NLETrackSlot nleTrackSlot, int i, int i2, EnumC124724uy enumC124724uy) {
        NLETrack LIZIZ;
        o.LJIIIZ(nleTrackSlot, "nleTrackSlot");
        if (i != i2 && NLESegmentVideo.LJJ(nleTrackSlot.LJI()) != null) {
            NLEModel beforeActionNLEModel = NLEModel.dynamicCast(C79057V0z.LJJI(this.LJLIL).deepClone());
            NLETrackSlot LIZ = NLETrackSlot.LIZ(nleTrackSlot.deepClone());
            Iterator<NLEVideoAnimation> it = nleTrackSlot.LJIIIZ().iterator();
            while (it.hasNext()) {
                it.next();
                this.LJLJJL.W9(null);
            }
            NLEModel nleModel = r9();
            o.LJIIIZ(nleModel, "nleModel");
            if (C124864vC.LJFF(nleModel)) {
                nleModel.setExtra("extra_key_realign_origin_slots", "true");
            }
            if (C124864vC.LIZJ && (LIZIZ = C141335gf.LIZIZ(nleModel)) != null) {
                int LIZ2 = C124864vC.LIZ(nleModel, nleTrackSlot);
                if (LIZ2 == -1) {
                    nleModel.setExtra("extra_key_realign_origin_slots", "true");
                } else {
                    NLETrackSlot LJIILIIL = LIZIZ.LJIILIIL(LIZ2);
                    if (LJIILIIL != null) {
                        LIZIZ.LJIJJLI(LJIILIIL);
                        LIZIZ.LIZLLL(LJIILIIL, i2);
                        nleModel.setExtra("extra_key_realign_origin_slots", "true");
                    }
                }
            }
            this.LJLIL.getMainTrack().LJIJJLI(nleTrackSlot);
            this.LJLIL.getMainTrack().LIZLLL(nleTrackSlot, i2);
            if (i2 == this.LJLIL.getMainTrack().LJIILL().size() - 1) {
                nleTrackSlot.LJIIJJI(null);
            }
            Iterator<NLETrackSlot> it2 = this.LJLIL.getMainTrack().LJIILLIIL().iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                NLETrackSlot next = it2.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    NLETrackSlot nLETrackSlot = next;
                    if (i3 == this.LJLIL.getMainTrack().LJIILL().size() - 1) {
                        nLETrackSlot.LJIIJJI(null);
                    }
                    i3 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            if (!this.LJLIL.getMainTrack().hasExtra("track_extra_is_video_edit_location")) {
                this.LJLIL.getMainTrack().setExtra("track_extra_is_video_edit_location", "true");
            }
            if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_TRACK_LINKAGE, Boolean.FALSE)).booleanValue()) {
                TrackLinkageManagerProvider.Companion.getClass();
                AbstractC123304sg businessTrackLinkageManager = C124944vK.LIZ().getBusinessTrackLinkageManager();
                if (businessTrackLinkageManager != null) {
                    ArrayList LJII = C47261Igj.LJII(new C123434st(LIZ, nleTrackSlot, new OSZ(Integer.valueOf(i), Integer.valueOf(i2)), null, 8));
                    o.LJIIIIZZ(beforeActionNLEModel, "beforeActionNLEModel");
                    businessTrackLinkageManager.LIZIZ(new C123314sh("adjust_video_order", LJII, beforeActionNLEModel));
                }
            }
            LJJJZ(enumC124724uy, C6YK.LIZ(new C139795eB(EnumC126814yL.VIDEO_ORDER.getNameId(), null, null, null, null, 30)));
            C79057V0z.LJJJJL(this.LJLIL, "seek_to_slot_start", nleTrackSlot);
        }
    }

    @Override // X.InterfaceC125474wB
    public final void LJIILLIIL(NLETrackSlot slot, long j, long j2, int i, EnumC124724uy enumC124724uy) {
        long j3;
        long j4;
        NLETrackSlot LJIILIIL;
        float f;
        NLETrackSlot LJIIIIZZ;
        NLESegment LJI;
        NLERenderProxySegment LIZLLL;
        NLEResourceAV LJ;
        long j5;
        long endTime;
        o.LJIIIZ(slot, "slot");
        this.LJLIL.getPlayer().pause();
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(slot.LJI());
        if (Math.abs(j2 - C124574uj.LJJLIIIJL(LJJ.LJIIL() - LJJ.LJIILIIL())) < 3) {
            if (i == 0) {
                endTime = slot.getStartTime();
            } else {
                endTime = slot.getEndTime();
            }
            this.LJLIL.getPlayer().M9(endTime);
            return;
        }
        if (Boolean.parseBoolean(slot.getExtra("is_black_frame"))) {
            NLEModel LJJI = C79057V0z.LJJI(this.LJLIL);
            NLETrack mainTrack = LJJI.getMainTrack();
            if (mainTrack != null) {
                j5 = mainTrack.LJIIJJI();
            } else {
                j5 = 0;
            }
            long j6 = (1000 * j2) + j5;
            Iterator LIZJ = t1.LIZJ(LJJI, "model.tracks");
            while (LIZJ.hasNext()) {
                NLETrack nLETrack = (NLETrack) LIZJ.next();
                if (!nLETrack.LJIIJ()) {
                    Iterator<T> it = ORS.LJJLIIIJL(nLETrack.LJIILL()).iterator();
                    while (it.hasNext()) {
                        NLETrackSlot nLETrackSlot = (NLETrackSlot) it.next();
                        if (((int) nLETrackSlot.getEndTime()) != -2 && nLETrackSlot.getEndTime() > j6) {
                            if (nLETrackSlot.getStartTime() > j6) {
                                if (C124574uj.LJJIL(nLETrack) || C124574uj.LJJJ(nLETrack)) {
                                    C79057V0z.LJJJJL(this.LJLIL, "value_black_slot_delete_music", C76800UCe.LIZ);
                                } else {
                                    nLETrack.LJIJJLI(nLETrackSlot);
                                }
                            } else {
                                NLESegment LJI2 = nLETrackSlot.LJI();
                                o.LJIIIIZZ(LJI2, "slot.mainSegment");
                                long endTime2 = ((float) (nLETrackSlot.getEndTime() - j6)) * C124574uj.LJJI(LJI2);
                                nLETrackSlot.setEndTime(j6);
                                NLESegmentAudio LIZLLL2 = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
                                if (LIZLLL2 != null) {
                                    LIZLLL2.LJIJJ(LIZLLL2.LJIIL() - endTime2);
                                }
                            }
                        }
                    }
                }
            }
            LJJJZ(enumC124724uy, C6YK.LIZ(new C139795eB(EnumC126814yL.CLIP.getNameId(), null, null, null, null, 30)));
            return;
        }
        NLEModel beforeActionNLEModel = NLEModel.dynamicCast(C79057V0z.LJJI(this.LJLIL).deepClone());
        NLETrackSlot LIZ = NLETrackSlot.LIZ(slot.deepClone());
        NLETrack mainTrack2 = r9().getMainTrack();
        if (mainTrack2 != null) {
            j3 = mainTrack2.LJIIJJI();
        } else {
            j3 = 0;
        }
        long j7 = 1000;
        long j8 = j * j7;
        LJJ.LJIJJLI(j8);
        long j9 = (j7 * j2) + j8;
        LJJ.LJIJJ(j9);
        slot.setEndTime(LJJ.getDuration() + slot.getStartTime());
        if (j2 < 200) {
            slot.LJIIJJI(null);
            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) ORZ.LJLLLLLL(this.LJLIL.getMainTrack().LJIILLIIL().indexOf(slot) - 1, this.LJLIL.getMainTrack().LJIILLIIL());
            if (nLETrackSlot2 != null) {
                nLETrackSlot2.LJIIJJI(null);
            }
        }
        if (C124574uj.LJJJJ(slot)) {
            if (C124614un.LJIILIIL(slot) && (LJIIIIZZ = slot.LJIIIIZZ()) != null && (LJI = LJIIIIZZ.LJI()) != null && (LIZLLL = NLERenderProxySegment.LIZLLL(LJI)) != null && (LJ = LIZLLL.LJ()) != null) {
                LJ.setDuration(j9);
            }
            NLEResourceNode LIZIZ = LJJ.LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.setDuration(j9);
            }
        }
        this.LJLIL.getMainTrack().LJJIFFI();
        if (!this.LJLIL.getMainTrack().hasExtra("track_extra_is_video_adjust_duration")) {
            this.LJLIL.getMainTrack().setExtra("track_extra_is_video_adjust_duration", "true");
        }
        NLEModel nleModel = r9();
        long LJIILIIL2 = LJJ.LJIILIIL();
        long LJIIL = LJJ.LJIIL();
        o.LJIIIZ(nleModel, "nleModel");
        if (C124864vC.LJFF(nleModel)) {
            nleModel.setExtra("extra_key_realign_origin_slots", "true");
        }
        if (C124864vC.LIZJ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("syncClip::slot.startTime=");
            LIZ2.append(slot.getStartTime());
            LIZ2.append(", slot.endTime=");
            LIZ2.append(slot.getEndTime());
            LIZ2.append(", startTime=");
            LIZ2.append(LJIILIIL2);
            LIZ2.append(", duration=");
            LIZ2.append(LJIIL);
            C131935Ft.LIZ(X1D.LIZIZ(LIZ2));
            int LIZ3 = C124864vC.LIZ(nleModel, slot);
            NLETrack LIZIZ2 = C141335gf.LIZIZ(nleModel);
            if (LIZIZ2 == null || (LJIILIIL = LIZIZ2.LJIILIIL(LIZ3)) == null) {
                nleModel.setExtra("extra_key_realign_origin_slots", "true");
            } else {
                String extra = LJIILIIL.getExtra("original_audio_speed_rate");
                o.LJIIIIZZ(extra, "originSlot.getExtra(SLOT…RIGINAL_AUDIO_SPEED_RATE)");
                Float LJJIJLIJ = C38350F3i.LJJIJLIJ(extra);
                if (LJJIJLIJ != null) {
                    f = LJJIJLIJ.floatValue();
                } else {
                    f = 1.0f;
                }
                NLESegmentAudio LIZLLL3 = NLESegmentAudio.LIZLLL(LJIILIIL.LJI());
                LIZLLL3.LJIJJLI(((float) LJIILIIL2) * f);
                LIZLLL3.LJIJJ(((float) LJIIL) * f);
                LJIILIIL.setEndTime(slot.getEndTime());
                LJIILIIL.setDuration(slot.getDuration());
                NLETrack LIZIZ3 = C141335gf.LIZIZ(nleModel);
                if (LIZIZ3 != null) {
                    LIZIZ3.LJJIFFI();
                }
                nleModel.setExtra("extra_key_realign_origin_slots", "true");
            }
        }
        this.LJLIL.getKeyframeEditor().LJJJJLL(slot);
        EnumC127484zQ enumC127484zQ = EnumC127484zQ.ENABLE_TRACK_LINKAGE;
        Boolean bool = Boolean.FALSE;
        if (((Boolean) C5BA.LIZ(enumC127484zQ, bool)).booleanValue()) {
            TrackLinkageManagerProvider.Companion.getClass();
            AbstractC123304sg businessTrackLinkageManager = C124944vK.LIZ().getBusinessTrackLinkageManager();
            if (businessTrackLinkageManager != null) {
                ArrayList LJII = C47261Igj.LJII(new C123434st(LIZ, slot, null, Integer.valueOf(i), 4));
                o.LJIIIIZZ(beforeActionNLEModel, "beforeActionNLEModel");
                businessTrackLinkageManager.LIZIZ(new C123314sh("clip_video", LJII, beforeActionNLEModel));
            }
        }
        if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
            C124614un.LIZJ(this.LJLIL);
        }
        if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_AUTO_ALIGN_BGM, bool)).booleanValue()) {
            NLETrack mainTrack3 = r9().getMainTrack();
            if (mainTrack3 != null) {
                j4 = mainTrack3.LJIIJJI();
            } else {
                j4 = 0;
            }
            if (j4 > j3) {
                C124614un.LIZIZ(j3, this.LJLIL);
            }
        }
        LJJJZ(enumC124724uy, C6YK.LIZ(new C139795eB(EnumC126814yL.CLIP.getNameId(), null, null, null, null, 30)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0058, code lost:
    
        if (r9 != null) goto L10;
     */
    @Override // X.InterfaceC125474wB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(int r23, int r24, com.bytedance.ies.nle.editor_jni.NLETrackSlot r25, long r26, long r28, long r30, boolean r32, X.EnumC124724uy r33) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124874vD.LJIILL(int, int, com.bytedance.ies.nle.editor_jni.NLETrackSlot, long, long, long, boolean, X.4uy):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0218, code lost:
    
        if (r28.equals("type_filter_adjust") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x023d, code lost:
    
        r9.LJIL(X.EnumC123864ta.FILTER);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0239, code lost:
    
        if (r28.equals("type_filter_filter") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03a3, code lost:
    
        if (r33 != r1) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03a5, code lost:
    
        r9.LIZIZ(r29);
        r9.setExtra("track_layer", r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03af, code lost:
    
        r9().addTrack(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03b7, code lost:
    
        r15 = X.X1D.LIZ();
        r15.append("onMove track layer ");
        r15.append(r1);
        r15.append(" not exist---- new track，not target track---- No action required");
        X.C131935Ft.LIZ(X.X1D.LIZIZ(r15));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJILLIZJL(java.lang.String r28, com.bytedance.ies.nle.editor_jni.NLETrackSlot r29, long r30, int r32, int r33, long r34, boolean r36, X.EnumC124724uy r37) {
        /*
            Method dump skipped, instructions count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124874vD.LJJLIIIJILLIZJL(java.lang.String, com.bytedance.ies.nle.editor_jni.NLETrackSlot, long, int, int, long, boolean, X.4uy):void");
    }
}
