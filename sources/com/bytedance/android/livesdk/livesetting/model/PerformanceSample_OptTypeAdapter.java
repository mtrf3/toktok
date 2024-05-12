package com.bytedance.android.livesdk.livesetting.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PerformanceSample_OptTypeAdapter extends TypeAdapter<PerformanceSample> {
    public final Gson LIZ;

    public PerformanceSample_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PerformanceSample read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        PerformanceSample performanceSample = new PerformanceSample();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1611918519:
                        if (!LJJ.equals("live_performance_host_cpu_sample_rate")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            performanceSample.hostCpuSampleRate = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -850121051:
                        if (!LJJ.equals("live_performance_audience_cpu_sample_rate")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            performanceSample.audienceCpuSampleRate = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -164571284:
                        if (!LJJ.equals("live_performance_auidence_opt_experiment")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            performanceSample.isAudienceExperiment = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -102867978:
                        if (!LJJ.equals("live_performance_host_mem_sample_rate")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            performanceSample.hostMemSampleRate = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 658929490:
                        if (!LJJ.equals("live_performance_audience_mem_sample_rate")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            performanceSample.audienceMemSampleRate = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 866398878:
                        if (!LJJ.equals("live_performance_host_opt_experiment")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            performanceSample.isHostExperiment = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 885118889:
                        if (!LJJ.equals("live_performance_audience_gpu_sample_rate")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            performanceSample.audienceGpuSampleRate = reader.LJIJI();
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
        return performanceSample;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, PerformanceSample performanceSample) {
        PerformanceSample performanceSample2 = performanceSample;
        o.LJIIIZ(writer, "writer");
        if (performanceSample2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_performance_auidence_opt_experiment");
        writer.LJJIII(performanceSample2.isAudienceExperiment);
        writer.LJI("live_performance_audience_cpu_sample_rate");
        C79062V1e.LJFF(performanceSample2.audienceCpuSampleRate, writer, "live_performance_audience_gpu_sample_rate");
        C79062V1e.LJFF(performanceSample2.audienceGpuSampleRate, writer, "live_performance_audience_mem_sample_rate");
        C79062V1e.LJFF(performanceSample2.audienceMemSampleRate, writer, "live_performance_host_opt_experiment");
        writer.LJJIII(performanceSample2.isHostExperiment);
        writer.LJI("live_performance_host_cpu_sample_rate");
        C79062V1e.LJFF(performanceSample2.hostCpuSampleRate, writer, "live_performance_host_mem_sample_rate");
        C77339UWx.LJFF(performanceSample2.hostMemSampleRate, writer);
    }
}
