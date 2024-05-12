package X;

import android.content.Intent;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GYk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41706GYk {
    public static Intent LIZ(C41702GYg canvasDataWrapper, List stickerList, long j) {
        o.LJIIIZ(canvasDataWrapper, "canvasDataWrapper");
        o.LJIIIZ(stickerList, "stickerList");
        Intent intent = new Intent();
        C77412UZs.LJJIJIL(intent, canvasDataWrapper.LIZ);
        ForwardMedia forwardMedia = canvasDataWrapper.LIZIZ;
        CreativeInfo creativeInfo = canvasDataWrapper.LIZ;
        OSZ<Integer, Integer> osz = canvasDataWrapper.LJFF;
        VideoFileInfo videoFileInfo = new VideoFileInfo(forwardMedia.getVideo().getSourceWidth(), forwardMedia.getVideo().getSourceHeight(), forwardMedia.getVideo().getSourceDuration(), 30, 0, 0, 0, 0, 0.0f, 496, null);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C43073GvN.LIZLLL(C62850Ola.LJ(), creativeInfo, EnumC43649HBd.CONCAT, null, false, 12));
        LIZ.append(C43075GvP.LIZ(".mp4"));
        String LIZIZ = X1D.LIZIZ(LIZ);
        C78966Uyw.LJJJJZ(new File(LIZIZ));
        intent.putExtra("extra_edit_preview_info", (Parcelable) new C149505tq(osz.getFirst().intValue(), osz.getSecond().intValue(), 12).LIZ(new EditVideoSegment(LIZIZ, null, videoFileInfo)));
        InfoStickerModel infoStickerModel = new InfoStickerModel(C43073GvN.LIZLLL(C62850Ola.LJ(), canvasDataWrapper.LIZ, EnumC43649HBd.INFO_STICKER, null, false, 12));
        Iterator it = stickerList.iterator();
        while (it.hasNext()) {
            infoStickerModel.addSticker((StickerItemModel) it.next());
        }
        intent.putExtra("infosticker_model", (Parcelable) infoStickerModel);
        CanvasVideoData canvasVideoData = new CanvasVideoData(C47261Igj.LJJIJIL(canvasDataWrapper.LIZLLL.LIZ), null, canvasDataWrapper.LIZLLL.LIZIZ, C41708GYm.LIZIZ(canvasDataWrapper, 1), 1, null, canvasDataWrapper.LJI, 32, null);
        canvasVideoData.putTransform(C41708GYm.LIZJ(canvasDataWrapper.LJ, 0.0f, 0.0f, 0.68f));
        intent.putExtra("photo_canvas_data", canvasVideoData);
        intent.putExtra("workspace", HU5.LIZ(canvasDataWrapper.LIZ));
        intent.putExtra("origin", 0);
        intent.putExtra("creative_flow_data", (Parcelable) new CreativeFlowData(null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 262143, null));
        intent.putExtra("shoot_way", "share_to_story");
        intent.putExtra("content_type", "share");
        intent.putExtra("content_source", "upload");
        intent.putExtra("enter_from", canvasDataWrapper.LIZIZ.getEventType());
        intent.putExtra("enter_method", canvasDataWrapper.LIZIZ.getEnterMethod());
        intent.putExtra("extra_start_enter_edit_page", System.currentTimeMillis());
        intent.putExtra("extra_import_compile_cost_time", j);
        intent.putExtra("extra_auto_caption_setting", 0);
        return intent;
    }
}
