package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RCn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69165RCn extends Message<C69165RCn, RKH> {
    public static final ProtoAdapter<C69165RCn> ADAPTER = new C69164RCm();
    public String account_region;
    public C69214REk avatar_168x168;
    public C69214REk avatar_300x300;
    public C69214REk avatar_larger;
    public C69214REk avatar_medium;
    public C69214REk avatar_thumb;
    public String avatar_uri;
    public String country;
    public List<C69214REk> cover_url;
    public Long create_time;
    public String custom_verify;
    public Boolean is_minor;
    public Boolean is_star;
    public String iso_country_code;
    public String language;
    public String nickname;
    public String region;
    public Long register_time;
    public String remark_name;
    public String sec_uid;
    public Integer secret;
    public String short_id;
    public Integer status;
    public List<Long> type_label;
    public String uid;
    public String unique_id;
    public Integer unique_id_modify_time;
    public Boolean user_canceled;
    public Integer user_mode;
    public Integer user_period;

    public C69165RCn() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.type_label = C63685Oz3.LJIIIIZZ();
        this.cover_url = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69165RCn, RKH> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69165RCn, RKH> newBuilder2() {
        newBuilder2();
        return null;
    }
}
