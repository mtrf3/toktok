package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RRS extends ProtoAdapter<RRT> {
    public RRS() {
        super(FieldEncoding.LENGTH_DELIMITED, RRT.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RRT decode(ProtoReader protoReader) {
        RRT rrt = new RRT();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rrt.bg_color = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rrt.bg_corner_radius = ProtoAdapter.FLOAT.decode(protoReader);
                        break;
                    case 3:
                        rrt.text_label_alignment = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        rrt.text_label_insets.add(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 5:
                        rrt.caption_text_size = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 6:
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                    case 7:
                        rrt.caption_text_color = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        rrt.caption_text_stroke_width = ProtoAdapter.FLOAT.decode(protoReader);
                        break;
                    case 9:
                        rrt.caption_text_stroke_color = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        rrt.should_show_caption_icon = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rrt.should_show_instruction_text = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 12:
                        rrt.instruction_text_size = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        rrt.instruction_text_color = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 14:
                        rrt.instruction_text_stroke_width = ProtoAdapter.FLOAT.decode(protoReader);
                        break;
                    case 15:
                        rrt.instruction_text_stroke_color = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        rrt.expansion_direction = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 17:
                        rrt.text_label_inset_info = RKL.ADAPTER.decode(protoReader);
                        break;
                    case 18:
                        rrt.should_show_control_when_collapsed = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 19:
                        rrt.should_show_control_when_expanded = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 20:
                        rrt.should_show_caption_on = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 21:
                        rrt.should_show_caption_off = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 22:
                        rrt.tooltip_hide_enabled = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rrt;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RRT rrt) {
        RRT rrt2 = rrt;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, rrt2.bg_color);
        ProtoAdapter<Float> protoAdapter2 = ProtoAdapter.FLOAT;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, rrt2.bg_corner_radius) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(9, rrt2.caption_text_stroke_color) + protoAdapter2.encodedSizeWithTag(8, rrt2.caption_text_stroke_width) + protoAdapter.encodedSizeWithTag(7, rrt2.caption_text_color) + protoAdapter3.encodedSizeWithTag(5, rrt2.caption_text_size) + protoAdapter3.asRepeated().encodedSizeWithTag(4, rrt2.text_label_insets) + protoAdapter3.encodedSizeWithTag(3, rrt2.text_label_alignment) + encodedSizeWithTag2;
        ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
        return rrt2.unknownFields().size() + protoAdapter4.encodedSizeWithTag(22, rrt2.tooltip_hide_enabled) + protoAdapter4.encodedSizeWithTag(21, rrt2.should_show_caption_off) + protoAdapter4.encodedSizeWithTag(20, rrt2.should_show_caption_on) + protoAdapter4.encodedSizeWithTag(19, rrt2.should_show_control_when_expanded) + protoAdapter4.encodedSizeWithTag(18, rrt2.should_show_control_when_collapsed) + RKL.ADAPTER.encodedSizeWithTag(17, rrt2.text_label_inset_info) + protoAdapter3.encodedSizeWithTag(16, rrt2.expansion_direction) + protoAdapter.encodedSizeWithTag(15, rrt2.instruction_text_stroke_color) + protoAdapter2.encodedSizeWithTag(14, rrt2.instruction_text_stroke_width) + protoAdapter.encodedSizeWithTag(13, rrt2.instruction_text_color) + protoAdapter3.encodedSizeWithTag(12, rrt2.instruction_text_size) + protoAdapter4.encodedSizeWithTag(11, rrt2.should_show_instruction_text) + protoAdapter4.encodedSizeWithTag(10, rrt2.should_show_caption_icon) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RRT rrt) {
        RRT rrt2 = rrt;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rrt2.bg_color);
        ProtoAdapter<Float> protoAdapter2 = ProtoAdapter.FLOAT;
        protoAdapter2.encodeWithTag(protoWriter, 2, rrt2.bg_corner_radius);
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 3, rrt2.text_label_alignment);
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 4, rrt2.text_label_insets);
        protoAdapter3.encodeWithTag(protoWriter, 5, rrt2.caption_text_size);
        protoAdapter.encodeWithTag(protoWriter, 7, rrt2.caption_text_color);
        protoAdapter2.encodeWithTag(protoWriter, 8, rrt2.caption_text_stroke_width);
        protoAdapter.encodeWithTag(protoWriter, 9, rrt2.caption_text_stroke_color);
        ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
        protoAdapter4.encodeWithTag(protoWriter, 10, rrt2.should_show_caption_icon);
        protoAdapter4.encodeWithTag(protoWriter, 11, rrt2.should_show_instruction_text);
        protoAdapter3.encodeWithTag(protoWriter, 12, rrt2.instruction_text_size);
        protoAdapter.encodeWithTag(protoWriter, 13, rrt2.instruction_text_color);
        protoAdapter2.encodeWithTag(protoWriter, 14, rrt2.instruction_text_stroke_width);
        protoAdapter.encodeWithTag(protoWriter, 15, rrt2.instruction_text_stroke_color);
        protoAdapter3.encodeWithTag(protoWriter, 16, rrt2.expansion_direction);
        RKL.ADAPTER.encodeWithTag(protoWriter, 17, rrt2.text_label_inset_info);
        protoAdapter4.encodeWithTag(protoWriter, 18, rrt2.should_show_control_when_collapsed);
        protoAdapter4.encodeWithTag(protoWriter, 19, rrt2.should_show_control_when_expanded);
        protoAdapter4.encodeWithTag(protoWriter, 20, rrt2.should_show_caption_on);
        protoAdapter4.encodeWithTag(protoWriter, 21, rrt2.should_show_caption_off);
        protoAdapter4.encodeWithTag(protoWriter, 22, rrt2.tooltip_hide_enabled);
        protoWriter.writeBytes(rrt2.unknownFields());
    }
}
