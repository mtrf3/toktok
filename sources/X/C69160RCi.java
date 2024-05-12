package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RCi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69160RCi extends Message<C69160RCi, C69317RIj> {
    public static final ProtoAdapter<C69160RCi> ADAPTER = new C69157RCf();
    public Boolean allow_upload_cover;
    public RNO announcement_info;
    public C69154RCc author;
    public REV background_image_url;
    public RL1 button;
    public C69484ROu category_cover_info;
    public List<String> cha_attrs;
    public String cha_name;
    public String cid;
    public Integer collect_stat;
    public List<C69156RCe> connect_music;
    public REV cover_item;
    public String cover_photo;
    public String desc;
    public RNC disclaimer;
    public String hashtag_profile;
    public Integer is_challenge;
    public Boolean is_commerce;
    public Integer is_hot_search;
    public Boolean is_pgcshow;
    public String link_action;
    public String link_text;
    public Integer link_type;
    public Integer module_type;
    public String profile_tag;
    public String schema;
    public C69199RDv share_info;
    public String sticker_id;
    public Integer sub_type;
    public Integer type;
    public Integer user_count;
    public Long view_count;

    public C69160RCi() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.connect_music = C63685Oz3.LJIIIIZZ();
        this.cha_attrs = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69160RCi, C69317RIj> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69160RCi, C69317RIj> newBuilder2() {
        newBuilder2();
        return null;
    }
}
