package X;

import com.bytedance.ies.cutsame.cut_android.TemplateExtra;
import com.bytedance.ies.cutsame.cut_android.VideoSlot;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.cut_ui.ItemCrop;
import com.ss.android.ugc.cut_ui.MediaItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6pS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172266pS {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C172976qb.LIZ.LIZ();
    }

    public static ArrayList LIZ(String extra) {
        o.LJIIIZ(extra, "extra");
        Gson gson = new Gson();
        ArrayList arrayList = new ArrayList();
        TemplateExtra templateExtra = (TemplateExtra) GsonProtectorUtils.fromJson(gson, extra, TemplateExtra.class);
        if (templateExtra != null) {
            Object fromJson = GsonProtectorUtils.fromJson(gson, templateExtra.slots, new TypeToken<List<? extends VideoSlot>>() { // from class: X.6pR
            }.getType());
            o.LJIIIIZZ(fromJson, "gson.fromJson(extraObj.s…st<VideoSlot>>() {}.type)");
            for (VideoSlot videoSlot : (List) fromJson) {
                if (o.LJ(videoSlot.type, "video") || o.LJ(videoSlot.type, "photo")) {
                    double d = 1000;
                    arrayList.add(new MediaItem(videoSlot.uuid, (long) (videoSlot.startTime * d), (long) (videoSlot.endTime * d), true, templateExtra.alignMode, false, false, 0, "", videoSlot.volume, 0, 0, (long) ((videoSlot.clipEnd - videoSlot.clipStart) * d), videoSlot.source, 0L, 1.0f, new ItemCrop(0.0f, 0.0f, 1.0f, 1.0f), videoSlot.type, videoSlot.source, 0.0f, 524288));
                }
            }
        }
        return arrayList;
    }
}
