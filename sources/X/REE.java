package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class REE extends ProtoAdapter<C69247RFr> {
    public REE() {
        super(FieldEncoding.LENGTH_DELIMITED, C69247RFr.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69247RFr decode(ProtoReader protoReader) {
        C69247RFr c69247RFr = new C69247RFr();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    C1EW.LIZJ(protoReader, protoReader);
                                } else {
                                    c69247RFr.bitrate_images.add(RHT.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c69247RFr.thumbnail = REV.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c69247RFr.user_watermark_image = REV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c69247RFr.owner_watermark_image = REV.ADAPTER.decode(protoReader);
                    }
                } else {
                    c69247RFr.display_image = REV.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69247RFr;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69247RFr c69247RFr) {
        C69247RFr c69247RFr2 = c69247RFr;
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        return c69247RFr2.unknownFields().size() + RHT.ADAPTER.asRepeated().encodedSizeWithTag(5, c69247RFr2.bitrate_images) + protoAdapter.encodedSizeWithTag(4, c69247RFr2.thumbnail) + protoAdapter.encodedSizeWithTag(3, c69247RFr2.user_watermark_image) + protoAdapter.encodedSizeWithTag(2, c69247RFr2.owner_watermark_image) + protoAdapter.encodedSizeWithTag(1, c69247RFr2.display_image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69247RFr c69247RFr) {
        C69247RFr c69247RFr2 = c69247RFr;
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, c69247RFr2.display_image);
        protoAdapter.encodeWithTag(protoWriter, 2, c69247RFr2.owner_watermark_image);
        protoAdapter.encodeWithTag(protoWriter, 3, c69247RFr2.user_watermark_image);
        protoAdapter.encodeWithTag(protoWriter, 4, c69247RFr2.thumbnail);
        RHT.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, c69247RFr2.bitrate_images);
        protoWriter.writeBytes(c69247RFr2.unknownFields());
    }
}
