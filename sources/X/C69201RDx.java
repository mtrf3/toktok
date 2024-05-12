package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69201RDx extends ProtoAdapter<RFQ> {
    public C69201RDx() {
        super(FieldEncoding.LENGTH_DELIMITED, RFQ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RFQ decode(ProtoReader protoReader) {
        RFQ rfq = new RFQ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    if (nextTag != 100) {
                                        C1EW.LIZJ(protoReader, protoReader);
                                    } else {
                                        rfq.post_extra = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    rfq.photomode_image_quality_info = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                rfq.title = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            rfq.music_volume = ProtoAdapter.FLOAT.decode(protoReader);
                        }
                    } else {
                        rfq.image_post_cover = C69247RFr.ADAPTER.decode(protoReader);
                    }
                } else {
                    rfq.images.add(C69247RFr.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rfq;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RFQ rfq) {
        RFQ rfq2 = rfq;
        ProtoAdapter<C69247RFr> protoAdapter = C69247RFr.ADAPTER;
        int encodedSizeWithTag = ProtoAdapter.FLOAT.encodedSizeWithTag(3, rfq2.music_volume) + protoAdapter.encodedSizeWithTag(2, rfq2.image_post_cover) + protoAdapter.asRepeated().encodedSizeWithTag(1, rfq2.images);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return rfq2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(100, rfq2.post_extra) + protoAdapter2.encodedSizeWithTag(5, rfq2.photomode_image_quality_info) + protoAdapter2.encodedSizeWithTag(4, rfq2.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RFQ rfq) {
        RFQ rfq2 = rfq;
        ProtoAdapter<C69247RFr> protoAdapter = C69247RFr.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, rfq2.images);
        protoAdapter.encodeWithTag(protoWriter, 2, rfq2.image_post_cover);
        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, rfq2.music_volume);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, rfq2.title);
        protoAdapter2.encodeWithTag(protoWriter, 5, rfq2.photomode_image_quality_info);
        protoAdapter2.encodeWithTag(protoWriter, 100, rfq2.post_extra);
        protoWriter.writeBytes(rfq2.unknownFields());
    }
}
