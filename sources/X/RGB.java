package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RGB extends ProtoAdapter<RGC> {
    public RGB() {
        super(FieldEncoding.LENGTH_DELIMITED, RGC.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGC decode(ProtoReader protoReader) {
        RGC rgc = new RGC();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rgc.original_sound_infos.add(RLM.ADAPTER.decode(protoReader));
                        }
                    } else {
                        rgc.TtsInfos.add(RGA.ADAPTER.decode(protoReader));
                    }
                } else {
                    rgc.CdnUrlExpired = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgc;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGC rgc) {
        RGC rgc2 = rgc;
        return rgc2.unknownFields().size() + RLM.ADAPTER.asRepeated().encodedSizeWithTag(3, rgc2.original_sound_infos) + RGA.ADAPTER.asRepeated().encodedSizeWithTag(2, rgc2.TtsInfos) + ProtoAdapter.INT64.encodedSizeWithTag(1, rgc2.CdnUrlExpired);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGC rgc) {
        RGC rgc2 = rgc;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, rgc2.CdnUrlExpired);
        RGA.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, rgc2.TtsInfos);
        RLM.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, rgc2.original_sound_infos);
        protoWriter.writeBytes(rgc2.unknownFields());
    }
}
