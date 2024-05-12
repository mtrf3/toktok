package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RCp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69167RCp extends Message<C69167RCp, RIF> {
    public static final ProtoAdapter<C69167RCp> ADAPTER = new C69161RCj();
    public C69381RKv attributes;
    public REV back_image;
    public REV back_image_thumbnail;
    public C69156RCe background_music;
    public REV composite_image_ltr;
    public REV composite_image_ltr_without_watermark;
    public REV composite_image_rtl;
    public REV composite_image_rtl_without_watermark;
    public RNZ consumption_info;
    public ROZ content_info;
    public String create_time_in_author_timezone;
    public Boolean disable_interaction;
    public REV front_image;
    public REV front_image_thumbnail;
    public REV fuzzy_front_image_thumbnail;
    public REV fuzzy_front_image_thumbnail_with_logo;
    public REV fuzzy_image;
    public REV fuzzy_image_rtl_with_watermark;
    public REV fuzzy_image_with_watermark;
    public C69398RLm incompatibility_info;
    public Long last_pushed_at_sec;
    public C69258RGc now_interaction_control;
    public String now_media_type;
    public Integer now_post_source;
    public Integer now_status;
    public REV watermark_image_ltr;
    public REV watermark_image_rtl;

    public C69167RCp() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69167RCp, RIF> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69167RCp, RIF> newBuilder2() {
        newBuilder2();
        return null;
    }
}
