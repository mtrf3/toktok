package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDS extends ProtoAdapter<C69242RFm> {
    public RDS() {
        super(FieldEncoding.LENGTH_DELIMITED, C69242RFm.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69242RFm decode(ProtoReader protoReader) {
        C69242RFm c69242RFm = new C69242RFm();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69242RFm.show_mask = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 2:
                        c69242RFm.mask_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        c69242RFm.status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        c69242RFm.title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        c69242RFm.content = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        c69242RFm.cancel_mask_label = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        c69242RFm.pop_window = C69282RHa.ADAPTER.decode(protoReader);
                        break;
                    case 8:
                        c69242RFm.birthday_edit_module = C69282RHa.ADAPTER.decode(protoReader);
                        break;
                    case 9:
                        c69242RFm.policy_module = C69282RHa.ADAPTER.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69242RFm;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69242RFm c69242RFm) {
        C69242RFm c69242RFm2 = c69242RFm;
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, c69242RFm2.show_mask);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, c69242RFm2.status) + protoAdapter.encodedSizeWithTag(2, c69242RFm2.mask_type) + encodedSizeWithTag;
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(6, c69242RFm2.cancel_mask_label) + protoAdapter2.encodedSizeWithTag(5, c69242RFm2.content) + protoAdapter2.encodedSizeWithTag(4, c69242RFm2.title) + encodedSizeWithTag2;
        ProtoAdapter<C69282RHa> protoAdapter3 = C69282RHa.ADAPTER;
        return c69242RFm2.unknownFields().size() + protoAdapter3.encodedSizeWithTag(9, c69242RFm2.policy_module) + protoAdapter3.encodedSizeWithTag(8, c69242RFm2.birthday_edit_module) + protoAdapter3.encodedSizeWithTag(7, c69242RFm2.pop_window) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69242RFm c69242RFm) {
        C69242RFm c69242RFm2 = c69242RFm;
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c69242RFm2.show_mask);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, c69242RFm2.mask_type);
        protoAdapter.encodeWithTag(protoWriter, 3, c69242RFm2.status);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, c69242RFm2.title);
        protoAdapter2.encodeWithTag(protoWriter, 5, c69242RFm2.content);
        protoAdapter2.encodeWithTag(protoWriter, 6, c69242RFm2.cancel_mask_label);
        ProtoAdapter<C69282RHa> protoAdapter3 = C69282RHa.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 7, c69242RFm2.pop_window);
        protoAdapter3.encodeWithTag(protoWriter, 8, c69242RFm2.birthday_edit_module);
        protoAdapter3.encodeWithTag(protoWriter, 9, c69242RFm2.policy_module);
        protoWriter.writeBytes(c69242RFm2.unknownFields());
    }
}
