package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69211REh extends ProtoAdapter<RH0> {
    public C69211REh() {
        super(FieldEncoding.LENGTH_DELIMITED, RH0.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RH0 decode(ProtoReader protoReader) {
        RH0 rh0 = new RH0();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rh0.audio_extra = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rh0.audio_quality = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    rh0.audio_meta = REL.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rh0;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RH0 rh0) {
        RH0 rh02 = rh0;
        return rh02.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(3, rh02.audio_extra) + ProtoAdapter.INT64.encodedSizeWithTag(2, rh02.audio_quality) + REL.ADAPTER.encodedSizeWithTag(1, rh02.audio_meta);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RH0 rh0) {
        RH0 rh02 = rh0;
        REL.ADAPTER.encodeWithTag(protoWriter, 1, rh02.audio_meta);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, rh02.audio_quality);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, rh02.audio_extra);
        protoWriter.writeBytes(rh02.unknownFields());
    }
}
