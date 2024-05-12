package X;

import Y.IDComparatorS30S0000000_2;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextTemplate;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyClip;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETextTemplateClip;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETextTemplateClipSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.cut_ui.ItemCrop;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.cut_ui.TextItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4zB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127334zB {
    public static final ArrayList<MediaItem> LIZ(NLETemplateModel nLETemplateModel) {
        ItemCrop LIZ;
        String str;
        NLEStyCrop LJJIFFI;
        o.LJIIIZ(nLETemplateModel, "<this>");
        ArrayList arrayList = new ArrayList();
        VecNLETrackSlotSPtr nleSlots = nLETemplateModel.getMutableAssetItems();
        o.LJIIIIZZ(nleSlots, "nleSlots");
        Iterator<NLETrackSlot> it = nleSlots.iterator();
        while (it.hasNext()) {
            NLETrackSlot next = it.next();
            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(next.LJI());
            if (LJJ != null) {
                long NLESegmentVideo_getClip = NLEEditorJniJNI.NLESegmentVideo_getClip(LJJ.LJ, LJJ);
                if ((NLESegmentVideo_getClip == 0 || (LIZ = C120644oO.LIZ(new NLEStyClip(NLESegmentVideo_getClip))) == null) && ((LJJIFFI = LJJ.LJJIFFI()) == null || (LIZ = C120644oO.LIZJ(LJJIFFI)) == null)) {
                    LIZ = C120644oO.LIZ(new NLEStyClip());
                }
                String uuid = next.getUUID();
                o.LJIIIIZZ(uuid, "slot.uuid");
                long j = 1000;
                long startTime = next.getStartTime() / j;
                long endTime = next.getEndTime() / j;
                String alignMode = nLETemplateModel.getAlignMode();
                o.LJIIIIZZ(alignMode, "this.alignMode");
                boolean rewind = LJJ.getRewind();
                float LJIILJJIL = LJJ.LJIILJJIL();
                int LJI = (int) LJJ.LIZIZ().LJI();
                int LIZIZ = (int) LJJ.LIZIZ().LIZIZ();
                long LJIIL = (LJJ.LJIIL() - LJJ.LJIILIIL()) / j;
                float scale = next.getScale();
                EnumC123874tb LJFF = LJJ.LIZIZ().LJFF();
                if (LJFF != null) {
                    int i = C124154u3.LIZ[LJFF.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            str = "photo";
                        }
                    } else {
                        str = "video";
                    }
                    MediaItem mediaItem = new MediaItem(uuid, startTime, endTime, true, alignMode, false, rewind, 0, "", LJIILJJIL, LJI, LIZIZ, LJIIL, null, 0L, scale, LIZ, str, null, LJJ.getSpeed(), 270336);
                    C172586py.LIZ("NLETemplateUtils", o.LJIILLIIL(mediaItem, "createMediaItem[] = "));
                    arrayList.add(mediaItem);
                }
                str = "";
                MediaItem mediaItem2 = new MediaItem(uuid, startTime, endTime, true, alignMode, false, rewind, 0, "", LJIILJJIL, LJI, LIZIZ, LJIIL, null, 0L, scale, LIZ, str, null, LJJ.getSpeed(), 270336);
                C172586py.LIZ("NLETemplateUtils", o.LJIILLIIL(mediaItem2, "createMediaItem[] = "));
                arrayList.add(mediaItem2);
            }
        }
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(35));
        }
        return new ArrayList<>(arrayList);
    }

    public static final ArrayList<TextItem> LIZIZ(NLETemplateModel nLETemplateModel) {
        o.LJIIIZ(nLETemplateModel, "<this>");
        ArrayList arrayList = new ArrayList();
        VecNLETrackSlotSPtr nleSlots = nLETemplateModel.getMutableTextItems();
        o.LJIIIIZZ(nleSlots, "nleSlots");
        Iterator<NLETrackSlot> it = nleSlots.iterator();
        while (it.hasNext()) {
            NLETrackSlot next = it.next();
            NLESegmentTextSticker LJFF = NLESegmentTextSticker.LJFF(next.LJI());
            int i = 1000;
            if (LJFF == null) {
                if (NLESegmentTextTemplate.LIZLLL(next.LJI()) != null) {
                    VecNLETextTemplateClipSPtr textClips = nLETemplateModel.getAllMutableTextClipsFromSlot(next);
                    o.LJIIIIZZ(textClips, "textClips");
                    Iterator<NLETextTemplateClip> it2 = textClips.iterator();
                    while (it2.hasNext()) {
                        NLETextTemplateClip next2 = it2.next();
                        long duration = next.getDuration();
                        String uuid = next2.getUUID();
                        o.LJIIIIZZ(uuid, "textClip.uuid");
                        double rotation = next.getRotation();
                        long startTime = next.getStartTime() / i;
                        String NLETextTemplateClip_getContent = NLEEditorJniJNI.NLETextTemplateClip_getContent(next2.LIZ, next2);
                        if (NLETextTemplateClip_getContent == null) {
                            NLETextTemplateClip_getContent = "";
                        }
                        TextItem textItem = new TextItem(duration, true, uuid, rotation, startTime, NLETextTemplateClip_getContent);
                        C172586py.LIZ("NLETemplateUtils", o.LJIILLIIL(textItem, "createTextItems "));
                        arrayList.add(textItem);
                        i = 1000;
                    }
                }
            } else {
                long duration2 = next.getDuration();
                String uuid2 = LJFF.getUUID();
                o.LJIIIIZZ(uuid2, "nleSegmentText.uuid");
                double rotation2 = next.getRotation();
                long startTime2 = next.getStartTime() / 1000;
                String LJI = LJFF.LJI();
                o.LJIIIIZZ(LJI, "nleSegmentText.content");
                TextItem textItem2 = new TextItem(duration2, true, uuid2, rotation2, startTime2, LJI);
                C172586py.LIZ("NLETemplateUtils", o.LJIILLIIL(textItem2, "createTextItems "));
                arrayList.add(textItem2);
            }
        }
        return new ArrayList<>(arrayList);
    }

    public static final void LIZJ(NLETemplateModel nLETemplateModel, Context context, ArrayList<MediaItem> arrayList) {
        MediaItem mediaItem;
        EnumC123874tb enumC123874tb;
        o.LJIIIZ(nLETemplateModel, "<this>");
        o.LJIIIZ(context, "context");
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        VecNLETrackSlotSPtr nleSlots = nLETemplateModel.getMutableAssetItems();
        o.LJIIIIZZ(nleSlots, "nleSlots");
        Iterator<NLETrackSlot> it = nleSlots.iterator();
        while (it.hasNext()) {
            NLETrackSlot next = it.next();
            Iterator<MediaItem> it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    mediaItem = it2.next();
                    if (o.LJ(mediaItem.materialId, next.getUUID())) {
                        break;
                    }
                } else {
                    mediaItem = null;
                    break;
                }
            }
            MediaItem mediaItem2 = mediaItem;
            if (mediaItem2 != null) {
                long j = 1000;
                next.setStartTime(mediaItem2.targetStartTime * j);
                next.setEndTime(mediaItem2.targetEndTime * j);
                next.setScale(mediaItem2.cropScale);
                NLESegmentVideo LJJ = NLESegmentVideo.LJJ(next.LJI());
                if (LJJ != null) {
                    if (mediaItem2.isReverse) {
                        LJJ.LIZIZ().LJIIIZ(mediaItem2.mediaSrcPath);
                        LJJ.LJIIJJI().LJIIIZ(mediaItem2.source);
                    } else {
                        LJJ.LIZIZ().LJIIIZ(mediaItem2.source);
                    }
                    ItemCrop LIZIZ = C120644oO.LIZIZ(context, mediaItem2.crop, mediaItem2.alignMode, mediaItem2.source, mediaItem2.width, mediaItem2.height);
                    NLEResourceNode LIZIZ2 = LJJ.LIZIZ();
                    String str = mediaItem2.type;
                    if (o.LJ(str, "video")) {
                        enumC123874tb = EnumC123874tb.VIDEO;
                    } else if (o.LJ(str, "photo")) {
                        enumC123874tb = EnumC123874tb.IMAGE;
                    } else {
                        enumC123874tb = EnumC123874tb.VIDEO;
                    }
                    LIZIZ2.LJIILIIL(enumC123874tb);
                    NLEStyClip LJ = C120644oO.LJ(LIZIZ);
                    NLEEditorJniJNI.NLESegmentVideo_setClip(LJJ.LJ, LJJ, LJ.LIZ, LJ);
                    LJJ.LJJIIJ(C120644oO.LJFF(LIZIZ));
                    LJJ.LJIJJLI(mediaItem2.sourceStartTime * j);
                    LJJ.LJIJJ((mediaItem2.duration * j) + LJJ.LJIILIIL());
                    LJJ.LJIL(mediaItem2.volume);
                    LJJ.setSpeed(mediaItem2.speed);
                }
                C172586py.LIZ("NLETemplateUtils", o.LJIILLIIL(next, "insertMediaItems[] success:  NLETrackSlot = "));
            }
        }
    }
}
