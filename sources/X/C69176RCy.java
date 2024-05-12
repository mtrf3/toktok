package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RCy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69176RCy extends ProtoAdapter<C69199RDv> {
    public C69176RCy() {
        super(FieldEncoding.LENGTH_DELIMITED, C69199RDv.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69199RDv decode(ProtoReader protoReader) {
        C69199RDv c69199RDv = new C69199RDv();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69199RDv.share_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c69199RDv.share_weibo_desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        c69199RDv.share_desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        c69199RDv.share_title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        c69199RDv.share_qrcode_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        c69199RDv.manage_goods_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        c69199RDv.share_image_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case 8:
                        c69199RDv.bool_persist = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 9:
                        c69199RDv.goods_rec_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        c69199RDv.share_title_myself = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69199RDv.share_title_other = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 12:
                        c69199RDv.share_link_desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c69199RDv.share_signature_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 14:
                        c69199RDv.share_signature_desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 15:
                        c69199RDv.share_quote = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c69199RDv.whatsapp_desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 17:
                        c69199RDv.share_desc_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 18:
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                    case 19:
                        c69199RDv.share_button_display_mode = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 20:
                        c69199RDv.button_display_stratege_source = ProtoAdapter.STRING.decode(protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69199RDv;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69199RDv c69199RDv) {
        C69199RDv c69199RDv2 = c69199RDv;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, c69199RDv2.share_title) + protoAdapter.encodedSizeWithTag(3, c69199RDv2.share_desc) + protoAdapter.encodedSizeWithTag(2, c69199RDv2.share_weibo_desc) + protoAdapter.encodedSizeWithTag(1, c69199RDv2.share_url);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(7, c69199RDv2.share_image_url) + protoAdapter.encodedSizeWithTag(6, c69199RDv2.manage_goods_url) + protoAdapter2.encodedSizeWithTag(5, c69199RDv2.share_qrcode_url) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        return c69199RDv2.unknownFields().size() + protoAdapter.encodedSizeWithTag(20, c69199RDv2.button_display_stratege_source) + protoAdapter3.encodedSizeWithTag(19, c69199RDv2.share_button_display_mode) + protoAdapter.encodedSizeWithTag(17, c69199RDv2.share_desc_info) + protoAdapter.encodedSizeWithTag(16, c69199RDv2.whatsapp_desc) + protoAdapter.encodedSizeWithTag(15, c69199RDv2.share_quote) + protoAdapter.encodedSizeWithTag(14, c69199RDv2.share_signature_desc) + protoAdapter.encodedSizeWithTag(13, c69199RDv2.share_signature_url) + protoAdapter.encodedSizeWithTag(12, c69199RDv2.share_link_desc) + protoAdapter.encodedSizeWithTag(11, c69199RDv2.share_title_other) + protoAdapter.encodedSizeWithTag(10, c69199RDv2.share_title_myself) + protoAdapter.encodedSizeWithTag(9, c69199RDv2.goods_rec_url) + protoAdapter3.encodedSizeWithTag(8, c69199RDv2.bool_persist) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69199RDv c69199RDv) {
        C69199RDv c69199RDv2 = c69199RDv;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69199RDv2.share_url);
        protoAdapter.encodeWithTag(protoWriter, 2, c69199RDv2.share_weibo_desc);
        protoAdapter.encodeWithTag(protoWriter, 3, c69199RDv2.share_desc);
        protoAdapter.encodeWithTag(protoWriter, 4, c69199RDv2.share_title);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 5, c69199RDv2.share_qrcode_url);
        protoAdapter.encodeWithTag(protoWriter, 6, c69199RDv2.manage_goods_url);
        protoAdapter2.encodeWithTag(protoWriter, 7, c69199RDv2.share_image_url);
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 8, c69199RDv2.bool_persist);
        protoAdapter.encodeWithTag(protoWriter, 9, c69199RDv2.goods_rec_url);
        protoAdapter.encodeWithTag(protoWriter, 10, c69199RDv2.share_title_myself);
        protoAdapter.encodeWithTag(protoWriter, 11, c69199RDv2.share_title_other);
        protoAdapter.encodeWithTag(protoWriter, 12, c69199RDv2.share_link_desc);
        protoAdapter.encodeWithTag(protoWriter, 13, c69199RDv2.share_signature_url);
        protoAdapter.encodeWithTag(protoWriter, 14, c69199RDv2.share_signature_desc);
        protoAdapter.encodeWithTag(protoWriter, 15, c69199RDv2.share_quote);
        protoAdapter.encodeWithTag(protoWriter, 16, c69199RDv2.whatsapp_desc);
        protoAdapter.encodeWithTag(protoWriter, 17, c69199RDv2.share_desc_info);
        protoAdapter3.encodeWithTag(protoWriter, 19, c69199RDv2.share_button_display_mode);
        protoAdapter.encodeWithTag(protoWriter, 20, c69199RDv2.button_display_stratege_source);
        protoWriter.writeBytes(c69199RDv2.unknownFields());
    }
}
