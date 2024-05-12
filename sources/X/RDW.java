package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDW extends ProtoAdapter<C69229REz> {
    public RDW() {
        super(FieldEncoding.LENGTH_DELIMITED, C69229REz.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69229REz decode(ProtoReader protoReader) {
        C69229REz c69229REz = new C69229REz();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69229REz.suffix = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c69229REz.sub_tags.add(RHC.ADAPTER.decode(protoReader));
                        break;
                    case 3:
                        c69229REz.sub_tag_exp_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        c69229REz.sub_tag_exp_time = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        c69229REz.has_sub_arrow = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 6:
                        c69229REz.track_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        c69229REz.hide_list.add(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69229REz;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69229REz c69229REz) {
        C69229REz c69229REz2 = c69229REz;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = RHC.ADAPTER.asRepeated().encodedSizeWithTag(2, c69229REz2.sub_tags) + protoAdapter.encodedSizeWithTag(1, c69229REz2.suffix);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return c69229REz2.unknownFields().size() + protoAdapter2.asRepeated().encodedSizeWithTag(7, c69229REz2.hide_list) + protoAdapter.encodedSizeWithTag(6, c69229REz2.track_info) + ProtoAdapter.BOOL.encodedSizeWithTag(5, c69229REz2.has_sub_arrow) + protoAdapter2.encodedSizeWithTag(4, c69229REz2.sub_tag_exp_time) + protoAdapter2.encodedSizeWithTag(3, c69229REz2.sub_tag_exp_type) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69229REz c69229REz) {
        C69229REz c69229REz2 = c69229REz;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69229REz2.suffix);
        RHC.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c69229REz2.sub_tags);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, c69229REz2.sub_tag_exp_type);
        protoAdapter2.encodeWithTag(protoWriter, 4, c69229REz2.sub_tag_exp_time);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, c69229REz2.has_sub_arrow);
        protoAdapter.encodeWithTag(protoWriter, 6, c69229REz2.track_info);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 7, c69229REz2.hide_list);
        protoWriter.writeBytes(c69229REz2.unknownFields());
    }
}
