package X;

import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.5q3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147155q3 {
    public static void LIZ(VideoPublishEditModel publishEditModel, Effect effect, String str) {
        String str2;
        String str3;
        String str4;
        String contentType;
        o.LJIIIZ(publishEditModel, "publishEditModel");
        IInternalAVService LIZ = AVServiceImpl.LIZ();
        LIZ.setLastStickerId(effect.getEffectId(), 7);
        LIZ.setLastStickerId(effect.getResourceId(), 6);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("effect_name", effect.getName());
        c145995oB.LJI("effect_id", effect.getEffectId());
        AVETParameter avetParameter = publishEditModel.getAvetParameter();
        String str5 = "";
        if (avetParameter == null || (str2 = avetParameter.getShootWay()) == null) {
            str2 = "";
        }
        c145995oB.LJI("shoot_way", str2);
        String creationId = publishEditModel.getCreationId();
        if (creationId == null) {
            creationId = "";
        }
        c145995oB.LJI("creation_id", creationId);
        AVETParameter avetParameter2 = publishEditModel.getAvetParameter();
        if (avetParameter2 == null || (str3 = avetParameter2.getContentSource()) == null) {
            str3 = "";
        }
        c145995oB.LJI("content_source", str3);
        AVETParameter avetParameter3 = publishEditModel.getAvetParameter();
        if (avetParameter3 == null || (str4 = avetParameter3.getStoryShootEntrance()) == null) {
            str4 = "";
        }
        c145995oB.LJI("shoot_entrance", str4);
        AVETParameter avetParameter4 = publishEditModel.getAvetParameter();
        if (avetParameter4 != null && (contentType = avetParameter4.getContentType()) != null) {
            str5 = contentType;
        }
        c145995oB.LJI("content_type", str5);
        c145995oB.LIZIZ(System.currentTimeMillis(), "local_time_ms");
        c145995oB.LJI("to_status", str);
        FMX.LJIIL("select_voice_effect", c145995oB.LIZ);
    }
}
