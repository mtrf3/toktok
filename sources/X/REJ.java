package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class REJ extends ProtoAdapter<RG2> {
    public REJ() {
        super(FieldEncoding.LENGTH_DELIMITED, RG2.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RG2 decode(ProtoReader protoReader) {
        RG2 rg2 = new RG2();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rg2.duet = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        rg2.stitch = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        rg2.duet_privacy_setting = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        rg2.stitch_privacy_setting = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        rg2.upvote = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 6:
                        rg2.allow_adding_to_story = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 7:
                        rg2.allow_create_sticker = RLD.ADAPTER.decode(protoReader);
                        break;
                    case 8:
                        rg2.allow_story_switch_to_post = RLD.ADAPTER.decode(protoReader);
                        break;
                    case 9:
                        rg2.allow_adding_as_post = RLD.ADAPTER.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rg2;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RG2 rg2) {
        RG2 rg22 = rg2;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(6, rg22.allow_adding_to_story) + protoAdapter.encodedSizeWithTag(5, rg22.upvote) + protoAdapter.encodedSizeWithTag(4, rg22.stitch_privacy_setting) + protoAdapter.encodedSizeWithTag(3, rg22.duet_privacy_setting) + protoAdapter.encodedSizeWithTag(2, rg22.stitch) + protoAdapter.encodedSizeWithTag(1, rg22.duet);
        ProtoAdapter<RLD> protoAdapter2 = RLD.ADAPTER;
        return rg22.unknownFields().size() + protoAdapter2.encodedSizeWithTag(9, rg22.allow_adding_as_post) + protoAdapter2.encodedSizeWithTag(8, rg22.allow_story_switch_to_post) + protoAdapter2.encodedSizeWithTag(7, rg22.allow_create_sticker) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RG2 rg2) {
        RG2 rg22 = rg2;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rg22.duet);
        protoAdapter.encodeWithTag(protoWriter, 2, rg22.stitch);
        protoAdapter.encodeWithTag(protoWriter, 3, rg22.duet_privacy_setting);
        protoAdapter.encodeWithTag(protoWriter, 4, rg22.stitch_privacy_setting);
        protoAdapter.encodeWithTag(protoWriter, 5, rg22.upvote);
        protoAdapter.encodeWithTag(protoWriter, 6, rg22.allow_adding_to_story);
        ProtoAdapter<RLD> protoAdapter2 = RLD.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 7, rg22.allow_create_sticker);
        protoAdapter2.encodeWithTag(protoWriter, 8, rg22.allow_story_switch_to_post);
        protoAdapter2.encodeWithTag(protoWriter, 9, rg22.allow_adding_as_post);
        protoWriter.writeBytes(rg22.unknownFields());
    }
}
