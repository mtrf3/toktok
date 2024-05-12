package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RD8 extends Message<RD8, C69310RIc> {
    public static final ProtoAdapter<RD8> ADAPTER = new RD9();
    public REW add_yours_sticker;
    public String attr;
    public C69402RLq auto_video_caption_info;
    public C69481ROr comment_post_sticker;
    public RGL countdown_info;
    public C69478ROo duet_with_me;
    public RLG hashtag_info;
    public Integer index;
    public Boolean is_non_global;
    public Integer material_index;
    public C69274RGs mention_info;
    public C69340RJg nature_classification_sticker_info;
    public RPR nature_info;
    public RO7 poi_info;
    public RFW question_info;
    public String text_info;
    public RGM text_sticker_info;
    public String track_info;
    public Integer type;
    public RHI video_share_info;
    public RFT vote_info;

    public RD8() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RD8, C69310RIc> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RD8, C69310RIc> newBuilder2() {
        newBuilder2();
        return null;
    }
}
