package X;

import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OyW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63652OyW extends ProtoAdapter<Response> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    public C63652OyW() {
        super(FieldEncoding.LENGTH_DELIMITED, Response.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Response decode(ProtoReader protoReader) {
        C63653OyX c63653OyX = new C63653OyX();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c63653OyX.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        c63653OyX.LJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        c63653OyX.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        c63653OyX.LJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        c63653OyX.LJII = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 6:
                        c63653OyX.LJIIIIZZ = ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 7:
                        c63653OyX.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        c63653OyX.LJIIJ.putAll(this.LJ.decode(protoReader));
                        break;
                    case 9:
                        c63653OyX.LJIIJJI = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 10:
                        c63653OyX.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c63653OyX.LJIILIIL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 12:
                        c63653OyX.LJIILJJIL = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c63653OyX.LJIILL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63653OyX.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63653OyX.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Response response) {
        Response response2 = response;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, response2.cmd);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, response2.status_code) + protoAdapter2.encodedSizeWithTag(2, response2.sequence_id) + encodedSizeWithTag;
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        return response2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(13, response2.server_start_time) + protoAdapter.encodedSizeWithTag(12, response2.retry_count) + protoAdapter2.encodedSizeWithTag(11, response2.server_execution_end_time) + protoAdapter2.encodedSizeWithTag(10, response2.request_arrived_time) + protoAdapter2.encodedSizeWithTag(9, response2.start_time_stamp) + this.LJ.encodedSizeWithTag(8, response2.headers) + protoAdapter3.encodedSizeWithTag(7, response2.log_id) + ResponseBody.ADAPTER.encodedSizeWithTag(6, response2.body) + protoAdapter.encodedSizeWithTag(5, response2.inbox_type) + protoAdapter3.encodedSizeWithTag(4, response2.error_desc) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Response response) {
        Response response2 = response;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, response2.cmd);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, response2.sequence_id);
        protoAdapter.encodeWithTag(protoWriter, 3, response2.status_code);
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(protoWriter, 4, response2.error_desc);
        protoAdapter.encodeWithTag(protoWriter, 5, response2.inbox_type);
        ResponseBody.ADAPTER.encodeWithTag(protoWriter, 6, response2.body);
        protoAdapter3.encodeWithTag(protoWriter, 7, response2.log_id);
        this.LJ.encodeWithTag(protoWriter, 8, response2.headers);
        protoAdapter2.encodeWithTag(protoWriter, 9, response2.start_time_stamp);
        protoAdapter2.encodeWithTag(protoWriter, 10, response2.request_arrived_time);
        protoAdapter2.encodeWithTag(protoWriter, 11, response2.server_execution_end_time);
        protoAdapter.encodeWithTag(protoWriter, 12, response2.retry_count);
        protoAdapter2.encodeWithTag(protoWriter, 13, response2.server_start_time);
        protoWriter.writeBytes(response2.unknownFields());
    }
}
