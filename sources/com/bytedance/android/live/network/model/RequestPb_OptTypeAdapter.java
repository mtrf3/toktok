package com.bytedance.android.live.network.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RequestPb_OptTypeAdapter extends TypeAdapter<RequestPb> {
    public final Gson LIZ;

    public RequestPb_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final RequestPb read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        RequestPb requestPb = new RequestPb();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1298848381) {
                    if (hashCode != -606897550) {
                        if (hashCode == -85276958 && LJJ.equals("switches")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                requestPb.switches = reader.LJJIIZI();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("pass_through_api")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            requestPb.passThroughApi = reader.LJJIIZI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("enable")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        requestPb.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return requestPb;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, RequestPb requestPb) {
        RequestPb requestPb2 = requestPb;
        o.LJIIIZ(writer, "writer");
        if (requestPb2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(requestPb2.enable);
        writer.LJI("switches");
        writer.LJJ(requestPb2.switches);
        writer.LJI("pass_through_api");
        writer.LJJ(requestPb2.passThroughApi);
        writer.LJFF();
    }
}
