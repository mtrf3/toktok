package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MultiGuestSeiAbnormalDetectorSetting_OptTypeAdapter extends TypeAdapter<MultiGuestSeiAbnormalDetectorSetting> {
    public final Gson LIZ;

    public MultiGuestSeiAbnormalDetectorSetting_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestSeiAbnormalDetectorSetting read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MultiGuestSeiAbnormalDetectorSetting multiGuestSeiAbnormalDetectorSetting = new MultiGuestSeiAbnormalDetectorSetting(false, 0, 0, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1036937701) {
                    if (hashCode != -297542374) {
                        if (hashCode == 699193987 && LJJ.equals("max_upload_times")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                multiGuestSeiAbnormalDetectorSetting.maxUploadTimes = reader.LJIJI();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("no_sei_app_data_threshold")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            multiGuestSeiAbnormalDetectorSetting.noSeiAppDataThreshold = reader.LJIJI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("open_detector")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        multiGuestSeiAbnormalDetectorSetting.isOpenDetector = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return multiGuestSeiAbnormalDetectorSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MultiGuestSeiAbnormalDetectorSetting multiGuestSeiAbnormalDetectorSetting) {
        MultiGuestSeiAbnormalDetectorSetting multiGuestSeiAbnormalDetectorSetting2 = multiGuestSeiAbnormalDetectorSetting;
        o.LJIIIZ(writer, "writer");
        if (multiGuestSeiAbnormalDetectorSetting2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("open_detector");
        writer.LJJIII(multiGuestSeiAbnormalDetectorSetting2.isOpenDetector);
        writer.LJI("max_upload_times");
        C79062V1e.LJFF(multiGuestSeiAbnormalDetectorSetting2.maxUploadTimes, writer, "no_sei_app_data_threshold");
        C77339UWx.LJFF(multiGuestSeiAbnormalDetectorSetting2.noSeiAppDataThreshold, writer);
    }
}
