package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.ugc.live.sdk.msg.data.SdkUplinkPacket;

/* loaded from: classes16.dex */
public final class YNY extends ProtoAdapter<SdkUplinkPacket> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;
    public final ProtoAdapter<java.util.Map<String, String>> LJFF;

    public YNY() {
        super(FieldEncoding.LENGTH_DELIMITED, SdkUplinkPacket.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        this.LJFF = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final SdkUplinkPacket decode(ProtoReader protoReader) {
        YNX ynx = new YNX();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        ynx.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        ynx.LJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        ynx.LJFF.putAll(this.LJ.decode(protoReader));
                        break;
                    case 4:
                        ynx.LJI.putAll(this.LJFF.decode(protoReader));
                        break;
                    case 5:
                        ynx.LJII = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        ynx.LJIIIIZZ = ProtoAdapter.BYTES.decode(protoReader);
                        break;
                    case 7:
                        ynx.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        ynx.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 9:
                        ynx.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        ynx.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return ynx.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(SdkUplinkPacket sdkUplinkPacket) {
        SdkUplinkPacket sdkUplinkPacket2 = sdkUplinkPacket;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = this.LJFF.encodedSizeWithTag(4, sdkUplinkPacket2.headers) + this.LJ.encodedSizeWithTag(3, sdkUplinkPacket2.queryParams) + protoAdapter.encodedSizeWithTag(2, sdkUplinkPacket2.serviceID) + protoAdapter.encodedSizeWithTag(1, sdkUplinkPacket2.uniqueID);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = ProtoAdapter.BYTES.encodedSizeWithTag(6, sdkUplinkPacket2.payload) + protoAdapter2.encodedSizeWithTag(5, sdkUplinkPacket2.uri) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        return sdkUplinkPacket2.unknownFields().size() + protoAdapter3.encodedSizeWithTag(9, sdkUplinkPacket2.uplinkStrategy) + protoAdapter2.encodedSizeWithTag(8, sdkUplinkPacket2.statusMessage) + protoAdapter3.encodedSizeWithTag(7, sdkUplinkPacket2.statusCode) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final SdkUplinkPacket redact(SdkUplinkPacket sdkUplinkPacket) {
        YNX newBuilder2 = sdkUplinkPacket.newBuilder2();
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, SdkUplinkPacket sdkUplinkPacket) {
        SdkUplinkPacket sdkUplinkPacket2 = sdkUplinkPacket;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, sdkUplinkPacket2.uniqueID);
        protoAdapter.encodeWithTag(protoWriter, 2, sdkUplinkPacket2.serviceID);
        this.LJ.encodeWithTag(protoWriter, 3, sdkUplinkPacket2.queryParams);
        this.LJFF.encodeWithTag(protoWriter, 4, sdkUplinkPacket2.headers);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 5, sdkUplinkPacket2.uri);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 6, sdkUplinkPacket2.payload);
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 7, sdkUplinkPacket2.statusCode);
        protoAdapter2.encodeWithTag(protoWriter, 8, sdkUplinkPacket2.statusMessage);
        protoAdapter3.encodeWithTag(protoWriter, 9, sdkUplinkPacket2.uplinkStrategy);
        protoWriter.writeBytes(sdkUplinkPacket2.unknownFields());
    }
}
