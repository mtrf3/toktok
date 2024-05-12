package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69215REl extends ProtoAdapter<RGR> {
    public C69215REl() {
        super(FieldEncoding.LENGTH_DELIMITED, RGR.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGR decode(ProtoReader protoReader) {
        RGR rgr = new RGR();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rgr.story_videos.add(C69159RCh.ADAPTER.decode(protoReader));
                    }
                } else {
                    rgr.aweme_type = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgr;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGR rgr) {
        RGR rgr2 = rgr;
        return rgr2.unknownFields().size() + C69159RCh.ADAPTER.asRepeated().encodedSizeWithTag(2, rgr2.story_videos) + ProtoAdapter.INT32.encodedSizeWithTag(1, rgr2.aweme_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGR rgr) {
        RGR rgr2 = rgr;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, rgr2.aweme_type);
        C69159RCh.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, rgr2.story_videos);
        protoWriter.writeBytes(rgr2.unknownFields());
    }
}
