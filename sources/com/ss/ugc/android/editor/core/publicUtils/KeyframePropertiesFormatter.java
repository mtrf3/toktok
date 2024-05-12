package com.ss.ugc.android.editor.core.publicUtils;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentMask;
import com.bytedance.ies.nle.editor_jni.NLESegmentSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class KeyframePropertiesFormatter {
    public static final KeyframePropertiesFormatter INSTANCE = new KeyframePropertiesFormatter();

    public final String format(NLESegment segment, NLETrackSlot slot, String filterType, Gson gson, NLEMatrix nLEMatrix) {
        o.LJIIIZ(segment, "segment");
        o.LJIIIZ(slot, "slot");
        o.LJIIIZ(filterType, "filterType");
        o.LJIIIZ(gson, "gson");
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(segment);
        if (LJJ != null) {
            if (o.LJ(filterType, "canvas blend")) {
                String json = GsonProtectorUtils.toJson(gson, new VideoProperty(LJJ, slot, nLEMatrix));
                o.LJIIIIZZ(json, "gson.toJson(\n           …      )\n                )");
                return json;
            }
            if (o.LJ(filterType, "audio volume filter")) {
                String json2 = GsonProtectorUtils.toJson(gson, new VideoVolumeProperty(LJJ, slot, nLEMatrix));
                o.LJIIIIZZ(json2, "gson.toJson(\n           …      )\n                )");
                return json2;
            }
        }
        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(segment);
        if (LIZLLL != null && o.LJ(filterType, "audio volume filter")) {
            String json3 = GsonProtectorUtils.toJson(gson, new VideoVolumeProperty(LIZLLL, slot, nLEMatrix));
            o.LJIIIIZZ(json3, "gson.toJson(\n           …      )\n                )");
            return json3;
        }
        NLESegmentSticker LIZLLL2 = NLESegmentSticker.LIZLLL(segment);
        if (LIZLLL2 != null) {
            if (o.LJ(filterType, "sticker_text")) {
                NLESegmentTextSticker LJFF = NLESegmentTextSticker.LJFF(segment);
                if (LJFF != null) {
                    String json4 = GsonProtectorUtils.toJson(gson, new TextProperty(LJFF, slot, nLEMatrix));
                    o.LJIIIIZZ(json4, "gson.toJson(\n           …                        )");
                    return json4;
                }
            } else {
                String json5 = GsonProtectorUtils.toJson(gson, new StickerProperty(LIZLLL2, slot, nLEMatrix));
                o.LJIIIIZZ(json5, "gson.toJson(\n           …  )\n                    )");
                return json5;
            }
        }
        NLESegmentFilter LIZLLL3 = NLESegmentFilter.LIZLLL(segment);
        if (LIZLLL3 != null) {
            String json6 = GsonProtectorUtils.toJson(gson, new IntensityProperty(LIZLLL3, slot, nLEMatrix));
            o.LJIIIIZZ(json6, "gson.toJson(\n           …          )\n            )");
            return json6;
        }
        long NLESegmentMask_dynamicCast = NLEEditorJniJNI.NLESegmentMask_dynamicCast(NLENode.getCPtr(segment), segment);
        if (NLESegmentMask_dynamicCast == 0) {
            long NLESegmentChromaChannel_dynamicCast = NLEEditorJniJNI.NLESegmentChromaChannel_dynamicCast(NLENode.getCPtr(segment), segment);
            if (NLESegmentChromaChannel_dynamicCast == 0) {
                return "";
            }
            String json7 = GsonProtectorUtils.toJson(gson, new ChromaProperty(new NLESegmentChromaChannel(NLESegmentChromaChannel_dynamicCast), slot, nLEMatrix));
            o.LJIIIIZZ(json7, "gson.toJson(\n           …          )\n            )");
            return json7;
        }
        String json8 = GsonProtectorUtils.toJson(gson, new MaskProperty(new NLESegmentMask(NLESegmentMask_dynamicCast), slot, nLEMatrix));
        o.LJIIIIZZ(json8, "gson.toJson(\n           …          )\n            )");
        return json8;
    }
}
