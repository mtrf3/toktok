package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDM extends ProtoAdapter<REX> {
    public RDM() {
        super(FieldEncoding.LENGTH_DELIMITED, REX.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final REX decode(ProtoReader protoReader) {
        REX rex = new REX();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rex.consistency_groups = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rex.final_gid_list.add(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 3:
                        rex.sort_gid_list.add(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 4:
                        rex.sati_gid_list.add(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 5:
                        rex.fyp_gid_list.add(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 6:
                        rex.client_gid_list.add(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 7:
                        rex.consistency_user_extra_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        rex.consistency_req_extra_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 9:
                        rex.consistency_extra_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        rex.c_rsp_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rex.rerank_reason_list.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rex;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(REX rex) {
        REX rex2 = rex;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, rex2.consistency_groups);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        return rex2.unknownFields().size() + protoAdapter.asRepeated().encodedSizeWithTag(11, rex2.rerank_reason_list) + ProtoAdapter.INT32.encodedSizeWithTag(10, rex2.c_rsp_type) + protoAdapter.encodedSizeWithTag(9, rex2.consistency_extra_info) + protoAdapter.encodedSizeWithTag(8, rex2.consistency_req_extra_info) + protoAdapter.encodedSizeWithTag(7, rex2.consistency_user_extra_info) + protoAdapter2.asRepeated().encodedSizeWithTag(6, rex2.client_gid_list) + protoAdapter2.asRepeated().encodedSizeWithTag(5, rex2.fyp_gid_list) + protoAdapter2.asRepeated().encodedSizeWithTag(4, rex2.sati_gid_list) + protoAdapter2.asRepeated().encodedSizeWithTag(3, rex2.sort_gid_list) + protoAdapter2.asRepeated().encodedSizeWithTag(2, rex2.final_gid_list) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, REX rex) {
        REX rex2 = rex;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rex2.consistency_groups);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 2, rex2.final_gid_list);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 3, rex2.sort_gid_list);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, rex2.sati_gid_list);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, rex2.fyp_gid_list);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 6, rex2.client_gid_list);
        protoAdapter.encodeWithTag(protoWriter, 7, rex2.consistency_user_extra_info);
        protoAdapter.encodeWithTag(protoWriter, 8, rex2.consistency_req_extra_info);
        protoAdapter.encodeWithTag(protoWriter, 9, rex2.consistency_extra_info);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, rex2.c_rsp_type);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 11, rex2.rerank_reason_list);
        protoWriter.writeBytes(rex2.unknownFields());
    }
}
