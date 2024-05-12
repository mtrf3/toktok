package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69188RDk extends ProtoAdapter<RG1> {
    public C69188RDk() {
        super(FieldEncoding.LENGTH_DELIMITED, RG1.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RG1 decode(ProtoReader protoReader) {
        RG1 rg1 = new RG1();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rg1.code = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        rg1.show_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        rg1.toast_msg = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rg1.extra = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rg1.transcode = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 6:
                        rg1.mute = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 7:
                        rg1.popup_msg = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        rg1.platform_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 9:
                        rg1.action_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rg1;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RG1 rg1) {
        RG1 rg12 = rg1;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, rg12.show_type) + protoAdapter.encodedSizeWithTag(1, rg12.code);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return rg12.unknownFields().size() + protoAdapter2.encodedSizeWithTag(9, rg12.action_id) + protoAdapter2.encodedSizeWithTag(8, rg12.platform_id) + protoAdapter2.encodedSizeWithTag(7, rg12.popup_msg) + ProtoAdapter.BOOL.encodedSizeWithTag(6, rg12.mute) + protoAdapter.encodedSizeWithTag(5, rg12.transcode) + protoAdapter2.encodedSizeWithTag(4, rg12.extra) + protoAdapter2.encodedSizeWithTag(3, rg12.toast_msg) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RG1 rg1) {
        RG1 rg12 = rg1;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rg12.code);
        protoAdapter.encodeWithTag(protoWriter, 2, rg12.show_type);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 3, rg12.toast_msg);
        protoAdapter2.encodeWithTag(protoWriter, 4, rg12.extra);
        protoAdapter.encodeWithTag(protoWriter, 5, rg12.transcode);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, rg12.mute);
        protoAdapter2.encodeWithTag(protoWriter, 7, rg12.popup_msg);
        protoAdapter2.encodeWithTag(protoWriter, 8, rg12.platform_id);
        protoAdapter2.encodeWithTag(protoWriter, 9, rg12.action_id);
        protoWriter.writeBytes(rg12.unknownFields());
    }
}
