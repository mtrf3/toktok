package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RFV extends Message<RFV, C69344RJk> {
    public static final ProtoAdapter<RFV> ADAPTER = new C69183RDf();
    public List<C69160RCi> challenge_list;
    public REV head_image_url;
    public List<RHE> offline_info_list;
    public String quick_shop_name;
    public String quick_shop_url;
    public String site_id;

    public RFV() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.offline_info_list = C63685Oz3.LJIIIIZZ();
        this.challenge_list = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RFV, C69344RJk> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RFV, C69344RJk> newBuilder2() {
        newBuilder2();
        return null;
    }
}
