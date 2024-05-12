package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDE extends ProtoAdapter<C69228REy> {
    public RDE() {
        super(FieldEncoding.LENGTH_DELIMITED, C69228REy.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69228REy decode(ProtoReader protoReader) {
        C69228REy c69228REy = new C69228REy();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69228REy.mix_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c69228REy.mix_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        c69228REy.cover_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case 4:
                        c69228REy.icon_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case 5:
                        c69228REy.status = C69426RMo.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        c69228REy.statis = C69275RGt.ADAPTER.decode(protoReader);
                        break;
                    case 7:
                        c69228REy.desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        c69228REy.author = C69154RCc.ADAPTER.decode(protoReader);
                        break;
                    case 9:
                        c69228REy.extra = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        c69228REy.share_info = C69199RDv.ADAPTER.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69228REy;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69228REy c69228REy) {
        C69228REy c69228REy2 = c69228REy;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, c69228REy2.mix_name) + protoAdapter.encodedSizeWithTag(1, c69228REy2.mix_id);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        return c69228REy2.unknownFields().size() + C69199RDv.ADAPTER.encodedSizeWithTag(10, c69228REy2.share_info) + protoAdapter.encodedSizeWithTag(9, c69228REy2.extra) + C69154RCc.ADAPTER.encodedSizeWithTag(8, c69228REy2.author) + protoAdapter.encodedSizeWithTag(7, c69228REy2.desc) + C69275RGt.ADAPTER.encodedSizeWithTag(6, c69228REy2.statis) + C69426RMo.ADAPTER.encodedSizeWithTag(5, c69228REy2.status) + protoAdapter2.encodedSizeWithTag(4, c69228REy2.icon_url) + protoAdapter2.encodedSizeWithTag(3, c69228REy2.cover_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69228REy c69228REy) {
        C69228REy c69228REy2 = c69228REy;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69228REy2.mix_id);
        protoAdapter.encodeWithTag(protoWriter, 2, c69228REy2.mix_name);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, c69228REy2.cover_url);
        protoAdapter2.encodeWithTag(protoWriter, 4, c69228REy2.icon_url);
        C69426RMo.ADAPTER.encodeWithTag(protoWriter, 5, c69228REy2.status);
        C69275RGt.ADAPTER.encodeWithTag(protoWriter, 6, c69228REy2.statis);
        protoAdapter.encodeWithTag(protoWriter, 7, c69228REy2.desc);
        C69154RCc.ADAPTER.encodeWithTag(protoWriter, 8, c69228REy2.author);
        protoAdapter.encodeWithTag(protoWriter, 9, c69228REy2.extra);
        C69199RDv.ADAPTER.encodeWithTag(protoWriter, 10, c69228REy2.share_info);
        protoWriter.writeBytes(c69228REy2.unknownFields());
    }
}
