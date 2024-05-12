package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class VideoSeiEndSetting_OptTypeAdapter extends TypeAdapter<VideoSeiEndSetting> {
    public final Gson LIZ;

    public VideoSeiEndSetting_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final VideoSeiEndSetting read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        VideoSeiEndSetting videoSeiEndSetting = new VideoSeiEndSetting(0, 0, 0, null, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -588362725:
                        if (!LJJ.equals("end_layout_scene")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList<String> LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                            o.LJI(LIZ);
                            videoSeiEndSetting.enableSceneList = LIZ;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -393401994:
                        if (!LJJ.equals("enable_video_sei_end_layout")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            videoSeiEndSetting.enableVideoSeiEndLayout = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -312752124:
                        if (!LJJ.equals("enable_no_parse_sei_end_layout")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            videoSeiEndSetting.enableNoParseSeiEndLayout = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1911268055:
                        if (!LJJ.equals("enable_video_sei")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            videoSeiEndSetting.enableVideoSei = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return videoSeiEndSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, VideoSeiEndSetting videoSeiEndSetting) {
        VideoSeiEndSetting videoSeiEndSetting2 = videoSeiEndSetting;
        o.LJIIIZ(writer, "writer");
        if (videoSeiEndSetting2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_video_sei");
        C79062V1e.LJFF(videoSeiEndSetting2.enableVideoSei, writer, "enable_video_sei_end_layout");
        C79062V1e.LJFF(videoSeiEndSetting2.enableVideoSeiEndLayout, writer, "enable_no_parse_sei_end_layout");
        C79062V1e.LJFF(videoSeiEndSetting2.enableNoParseSeiEndLayout, writer, "end_layout_scene");
        C65412Plo.LIZLLL(this.LIZ, writer, videoSeiEndSetting2.enableSceneList, String.class);
        writer.LJFF();
    }
}
