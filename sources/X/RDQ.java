package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDQ extends ProtoAdapter<RFS> {
    public RDQ() {
        super(FieldEncoding.LENGTH_DELIMITED, RFS.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RFS decode(ProtoReader protoReader) {
        RFS rfs = new RFS();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rfs.words.add(RHV.ADAPTER.decode(protoReader));
                        break;
                    case 2:
                        rfs.icon_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case 3:
                        rfs.scene = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rfs.hint_text = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rfs.extra_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rfs.qrec_virtual_enable = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        rfs.redirect_page = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rfs;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RFS rfs) {
        RFS rfs2 = rfs;
        int encodedSizeWithTag = REV.ADAPTER.encodedSizeWithTag(2, rfs2.icon_url) + RHV.ADAPTER.asRepeated().encodedSizeWithTag(1, rfs2.words);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rfs2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(7, rfs2.redirect_page) + protoAdapter.encodedSizeWithTag(6, rfs2.qrec_virtual_enable) + protoAdapter.encodedSizeWithTag(5, rfs2.extra_info) + protoAdapter.encodedSizeWithTag(4, rfs2.hint_text) + protoAdapter.encodedSizeWithTag(3, rfs2.scene) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RFS rfs) {
        RFS rfs2 = rfs;
        RHV.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, rfs2.words);
        REV.ADAPTER.encodeWithTag(protoWriter, 2, rfs2.icon_url);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, rfs2.scene);
        protoAdapter.encodeWithTag(protoWriter, 4, rfs2.hint_text);
        protoAdapter.encodeWithTag(protoWriter, 5, rfs2.extra_info);
        protoAdapter.encodeWithTag(protoWriter, 6, rfs2.qrec_virtual_enable);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, rfs2.redirect_page);
        protoWriter.writeBytes(rfs2.unknownFields());
    }
}
