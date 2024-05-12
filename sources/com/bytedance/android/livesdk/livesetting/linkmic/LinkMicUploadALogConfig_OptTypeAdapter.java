package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LinkMicUploadALogConfig_OptTypeAdapter extends TypeAdapter<LinkMicUploadALogConfig> {
    public final Gson LIZ;

    public LinkMicUploadALogConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicUploadALogConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LinkMicUploadALogConfig linkMicUploadALogConfig = new LinkMicUploadALogConfig(null, null, null, null, null, 0, 0, 0, 255, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1298848381:
                        if (!LJJ.equals("enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkMicUploadALogConfig.enable = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 143424988:
                        if (!LJJ.equals("sample_100")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkMicUploadALogConfig.sample100ExceptionType = (int[]) this.LIZ.LJIIJ(int[].class).read(reader);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1113005268:
                        if (!LJJ.equals("sample_10")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkMicUploadALogConfig.sample10ExceptionType = (int[]) this.LIZ.LJIIJ(int[].class).read(reader);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1113005392:
                        if (!LJJ.equals("sample_50")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkMicUploadALogConfig.sample50ExceptionType = (int[]) this.LIZ.LJIIJ(int[].class).read(reader);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1602207074:
                        if (!LJJ.equals("upload_freq_threshold")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkMicUploadALogConfig.uploadThreshold = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1975566043:
                        if (!LJJ.equals("sample_0")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkMicUploadALogConfig.sample0ExceptionType = (int[]) this.LIZ.LJIIJ(int[].class).read(reader);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1975566044:
                        if (!LJJ.equals("sample_1")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkMicUploadALogConfig.sample1ExceptionType = (int[]) this.LIZ.LJIIJ(int[].class).read(reader);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 2138259816:
                        if (!LJJ.equals("default_sample")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkMicUploadALogConfig.defaultSample = reader.LJIJI();
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
        return linkMicUploadALogConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LinkMicUploadALogConfig linkMicUploadALogConfig) {
        LinkMicUploadALogConfig linkMicUploadALogConfig2 = linkMicUploadALogConfig;
        o.LJIIIZ(writer, "writer");
        if (linkMicUploadALogConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("upload_freq_threshold");
        C79062V1e.LJFF(linkMicUploadALogConfig2.uploadThreshold, writer, "sample_0");
        TypeAdapter LJIIJ = this.LIZ.LJIIJ(int[].class);
        LJIIJ.write(writer, linkMicUploadALogConfig2.sample0ExceptionType);
        writer.LJI("sample_1");
        LJIIJ.write(writer, linkMicUploadALogConfig2.sample1ExceptionType);
        writer.LJI("sample_10");
        LJIIJ.write(writer, linkMicUploadALogConfig2.sample10ExceptionType);
        writer.LJI("sample_50");
        LJIIJ.write(writer, linkMicUploadALogConfig2.sample50ExceptionType);
        writer.LJI("sample_100");
        LJIIJ.write(writer, linkMicUploadALogConfig2.sample100ExceptionType);
        writer.LJI("default_sample");
        C79062V1e.LJFF(linkMicUploadALogConfig2.defaultSample, writer, "enable");
        C77339UWx.LJFF(linkMicUploadALogConfig2.enable, writer);
    }
}