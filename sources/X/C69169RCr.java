package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RCr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69169RCr extends ProtoAdapter<RD2> {
    public C69169RCr() {
        super(FieldEncoding.LENGTH_DELIMITED, RD2.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RD2 decode(ProtoReader protoReader) {
        RD2 rd2 = new RD2();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rd2.bg_color = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rd2.bg_corner_radius = ProtoAdapter.FLOAT.decode(protoReader);
                        break;
                    case 3:
                        rd2.text_label_alignment = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        rd2.text_label_insets.add(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 5:
                        rd2.caption_text_size = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 6:
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                    case 7:
                        rd2.caption_text_color = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        rd2.caption_text_stroke_width = ProtoAdapter.FLOAT.decode(protoReader);
                        break;
                    case 9:
                        rd2.caption_text_stroke_color = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        rd2.should_show_caption_icon = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rd2.should_show_instruction_text = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 12:
                        rd2.instruction_text_size = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        rd2.instruction_text_color = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 14:
                        rd2.instruction_text_stroke_width = ProtoAdapter.FLOAT.decode(protoReader);
                        break;
                    case 15:
                        rd2.instruction_text_stroke_color = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        rd2.expansion_direction = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 17:
                        rd2.text_label_inset_info = RKL.ADAPTER.decode(protoReader);
                        break;
                    case 18:
                        rd2.should_show_control_when_collapsed = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 19:
                        rd2.should_show_control_when_expanded = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 20:
                        rd2.should_show_caption_on = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 21:
                        rd2.should_show_caption_off = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 22:
                        rd2.tooltip_hide_enabled = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rd2;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RD2 rd2) {
        RD2 rd22 = rd2;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, rd22.bg_color);
        ProtoAdapter<Float> protoAdapter2 = ProtoAdapter.FLOAT;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, rd22.bg_corner_radius) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(9, rd22.caption_text_stroke_color) + protoAdapter2.encodedSizeWithTag(8, rd22.caption_text_stroke_width) + protoAdapter.encodedSizeWithTag(7, rd22.caption_text_color) + protoAdapter3.encodedSizeWithTag(5, rd22.caption_text_size) + protoAdapter3.asRepeated().encodedSizeWithTag(4, rd22.text_label_insets) + protoAdapter3.encodedSizeWithTag(3, rd22.text_label_alignment) + encodedSizeWithTag2;
        ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
        return rd22.unknownFields().size() + protoAdapter4.encodedSizeWithTag(22, rd22.tooltip_hide_enabled) + protoAdapter4.encodedSizeWithTag(21, rd22.should_show_caption_off) + protoAdapter4.encodedSizeWithTag(20, rd22.should_show_caption_on) + protoAdapter4.encodedSizeWithTag(19, rd22.should_show_control_when_expanded) + protoAdapter4.encodedSizeWithTag(18, rd22.should_show_control_when_collapsed) + RKL.ADAPTER.encodedSizeWithTag(17, rd22.text_label_inset_info) + protoAdapter3.encodedSizeWithTag(16, rd22.expansion_direction) + protoAdapter.encodedSizeWithTag(15, rd22.instruction_text_stroke_color) + protoAdapter2.encodedSizeWithTag(14, rd22.instruction_text_stroke_width) + protoAdapter.encodedSizeWithTag(13, rd22.instruction_text_color) + protoAdapter3.encodedSizeWithTag(12, rd22.instruction_text_size) + protoAdapter4.encodedSizeWithTag(11, rd22.should_show_instruction_text) + protoAdapter4.encodedSizeWithTag(10, rd22.should_show_caption_icon) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RD2 rd2) {
        RD2 rd22 = rd2;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rd22.bg_color);
        ProtoAdapter<Float> protoAdapter2 = ProtoAdapter.FLOAT;
        protoAdapter2.encodeWithTag(protoWriter, 2, rd22.bg_corner_radius);
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 3, rd22.text_label_alignment);
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 4, rd22.text_label_insets);
        protoAdapter3.encodeWithTag(protoWriter, 5, rd22.caption_text_size);
        protoAdapter.encodeWithTag(protoWriter, 7, rd22.caption_text_color);
        protoAdapter2.encodeWithTag(protoWriter, 8, rd22.caption_text_stroke_width);
        protoAdapter.encodeWithTag(protoWriter, 9, rd22.caption_text_stroke_color);
        ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
        protoAdapter4.encodeWithTag(protoWriter, 10, rd22.should_show_caption_icon);
        protoAdapter4.encodeWithTag(protoWriter, 11, rd22.should_show_instruction_text);
        protoAdapter3.encodeWithTag(protoWriter, 12, rd22.instruction_text_size);
        protoAdapter.encodeWithTag(protoWriter, 13, rd22.instruction_text_color);
        protoAdapter2.encodeWithTag(protoWriter, 14, rd22.instruction_text_stroke_width);
        protoAdapter.encodeWithTag(protoWriter, 15, rd22.instruction_text_stroke_color);
        protoAdapter3.encodeWithTag(protoWriter, 16, rd22.expansion_direction);
        RKL.ADAPTER.encodeWithTag(protoWriter, 17, rd22.text_label_inset_info);
        protoAdapter4.encodeWithTag(protoWriter, 18, rd22.should_show_control_when_collapsed);
        protoAdapter4.encodeWithTag(protoWriter, 19, rd22.should_show_control_when_expanded);
        protoAdapter4.encodeWithTag(protoWriter, 20, rd22.should_show_caption_on);
        protoAdapter4.encodeWithTag(protoWriter, 21, rd22.should_show_caption_off);
        protoAdapter4.encodeWithTag(protoWriter, 22, rd22.tooltip_hide_enabled);
        protoWriter.writeBytes(rd22.unknownFields());
    }
}
