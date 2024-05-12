package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RCu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69172RCu extends Message<C69172RCu, RK5> {
    public static final ProtoAdapter<C69172RCu> ADAPTER = new C69162RCk();
    public RM8 additional_stream_url;
    public Long create_time;
    public Integer digg_count;
    public REV dynamic_cover;
    public String extra;
    public Long finish_time;
    public Boolean in_sandbox;
    public Boolean live_type_audio;
    public Boolean live_type_linkmic;
    public Boolean live_type_normal;
    public Boolean live_type_official;
    public Boolean live_type_sandbox;
    public Boolean live_type_screenshot;
    public Boolean live_type_third_party;
    public C69154RCc owner;
    public REV room_cover;
    public Long room_id;
    public String room_type_tag;
    public C69199RDv share_info;
    public Integer status;
    public Long stream_id;
    public RM8 stream_url;
    public String title;
    public Integer total_user_count;
    public Integer user_count;
    public REV webp_cover;
    public Boolean with_linkmic;

    public C69172RCu() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69172RCu, RK5> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69172RCu, RK5> newBuilder2() {
        newBuilder2();
        return null;
    }
}
