package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69182RDe extends ProtoAdapter<RFG> {
    public C69182RDe() {
        super(FieldEncoding.LENGTH_DELIMITED, RFG.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RFG decode(ProtoReader protoReader) {
        RFG rfg = new RFG();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rfg.id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rfg.author = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rfg.title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rfg.h5_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rfg.cover_medium = REV.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        rfg.performers.add(RHG.ADAPTER.decode(protoReader));
                        break;
                    case 7:
                        rfg.chorus_info = C69429RMr.ADAPTER.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rfg;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RFG rfg) {
        RFG rfg2 = rfg;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rfg2.unknownFields().size() + C69429RMr.ADAPTER.encodedSizeWithTag(7, rfg2.chorus_info) + RHG.ADAPTER.asRepeated().encodedSizeWithTag(6, rfg2.performers) + REV.ADAPTER.encodedSizeWithTag(5, rfg2.cover_medium) + protoAdapter.encodedSizeWithTag(4, rfg2.h5_url) + protoAdapter.encodedSizeWithTag(3, rfg2.title) + protoAdapter.encodedSizeWithTag(2, rfg2.author) + protoAdapter.encodedSizeWithTag(1, rfg2.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RFG rfg) {
        RFG rfg2 = rfg;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rfg2.id);
        protoAdapter.encodeWithTag(protoWriter, 2, rfg2.author);
        protoAdapter.encodeWithTag(protoWriter, 3, rfg2.title);
        protoAdapter.encodeWithTag(protoWriter, 4, rfg2.h5_url);
        REV.ADAPTER.encodeWithTag(protoWriter, 5, rfg2.cover_medium);
        RHG.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, rfg2.performers);
        C69429RMr.ADAPTER.encodeWithTag(protoWriter, 7, rfg2.chorus_info);
        protoWriter.writeBytes(rfg2.unknownFields());
    }
}
