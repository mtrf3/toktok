package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RRT extends Message<RRT, RRU> {
    public static final ProtoAdapter<RRT> ADAPTER = new RRS();
    public String bg_color;
    public Float bg_corner_radius;
    public String caption_text_color;
    public Integer caption_text_size;
    public String caption_text_stroke_color;
    public Float caption_text_stroke_width;
    public Integer expansion_direction;
    public String instruction_text_color;
    public Integer instruction_text_size;
    public String instruction_text_stroke_color;
    public Float instruction_text_stroke_width;
    public Boolean should_show_caption_icon;
    public Boolean should_show_caption_off;
    public Boolean should_show_caption_on;
    public Boolean should_show_control_when_collapsed;
    public Boolean should_show_control_when_expanded;
    public Boolean should_show_instruction_text;
    public Integer text_label_alignment;
    public RKL text_label_inset_info;
    public List<Integer> text_label_insets;
    public Boolean tooltip_hide_enabled;

    public RRT() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.text_label_insets = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RRT, RRU> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RRT, RRU> newBuilder2() {
        newBuilder2();
        return null;
    }
}
