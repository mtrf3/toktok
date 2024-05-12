package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RPe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69494RPe extends Message<C69494RPe, C69495RPf> {
    public static final ProtoAdapter<C69494RPe> ADAPTER = new C69493RPd();
    public List<RCZ> aweme_list;
    public List<RHB> card_insert_results;
    public Integer has_more;
    public RME log_pb;
    public Long max_cursor;
    public Long min_cursor;
    public Integer status_code;
    public String status_msg;

    public C69494RPe() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.aweme_list = C63685Oz3.LJIIIIZZ();
        this.card_insert_results = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69494RPe, C69495RPf> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69494RPe, C69495RPf> newBuilder2() {
        newBuilder2();
        return null;
    }
}
