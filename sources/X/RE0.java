package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RE0 extends ProtoAdapter<C69213REj> {
    public RE0() {
        super(FieldEncoding.LENGTH_DELIMITED, C69213REj.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69213REj decode(ProtoReader protoReader) {
        C69213REj c69213REj = new C69213REj();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69213REj.download_general = RG1.ADAPTER.decode(protoReader);
                        break;
                    case 2:
                        c69213REj.download_mask_panel = RG1.ADAPTER.decode(protoReader);
                        break;
                    case 3:
                        c69213REj.download_share_panel = RG1.ADAPTER.decode(protoReader);
                        break;
                    case 4:
                        c69213REj.share_list_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        c69213REj.share_general = RG1.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        c69213REj.platform_list.add(RG1.ADAPTER.decode(protoReader));
                        break;
                    case 7:
                        c69213REj.share_third_platform = RG1.ADAPTER.decode(protoReader);
                        break;
                    case 8:
                        c69213REj.share_action_list.add(RG1.ADAPTER.decode(protoReader));
                        break;
                    case 9:
                        c69213REj.press_action_list.add(RG1.ADAPTER.decode(protoReader));
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69213REj;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69213REj c69213REj) {
        C69213REj c69213REj2 = c69213REj;
        ProtoAdapter<RG1> protoAdapter = RG1.ADAPTER;
        return c69213REj2.unknownFields().size() + protoAdapter.asRepeated().encodedSizeWithTag(9, c69213REj2.press_action_list) + protoAdapter.asRepeated().encodedSizeWithTag(8, c69213REj2.share_action_list) + protoAdapter.encodedSizeWithTag(7, c69213REj2.share_third_platform) + protoAdapter.asRepeated().encodedSizeWithTag(6, c69213REj2.platform_list) + protoAdapter.encodedSizeWithTag(5, c69213REj2.share_general) + ProtoAdapter.INT32.encodedSizeWithTag(4, c69213REj2.share_list_status) + protoAdapter.encodedSizeWithTag(3, c69213REj2.download_share_panel) + protoAdapter.encodedSizeWithTag(2, c69213REj2.download_mask_panel) + protoAdapter.encodedSizeWithTag(1, c69213REj2.download_general);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69213REj c69213REj) {
        C69213REj c69213REj2 = c69213REj;
        ProtoAdapter<RG1> protoAdapter = RG1.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, c69213REj2.download_general);
        protoAdapter.encodeWithTag(protoWriter, 2, c69213REj2.download_mask_panel);
        protoAdapter.encodeWithTag(protoWriter, 3, c69213REj2.download_share_panel);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, c69213REj2.share_list_status);
        protoAdapter.encodeWithTag(protoWriter, 5, c69213REj2.share_general);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 6, c69213REj2.platform_list);
        protoAdapter.encodeWithTag(protoWriter, 7, c69213REj2.share_third_platform);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 8, c69213REj2.share_action_list);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 9, c69213REj2.press_action_list);
        protoWriter.writeBytes(c69213REj2.unknownFields());
    }
}
