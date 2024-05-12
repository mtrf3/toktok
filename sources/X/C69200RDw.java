package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RDw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69200RDw extends Message<C69200RDw, RKJ> {
    public static final ProtoAdapter<C69200RDw> ADAPTER = new RDJ();
    public String DebugInfo;
    public List<C69177RCz> aweme_list;
    public Integer block_code;
    public C69487ROx extra;
    public Integer has_more;
    public ROA log_pb;
    public Long max_cursor;
    public Long min_cursor;
    public Integer refresh_clear;
    public String rid;
    public Integer status_code;
    public String status_msg;

    public C69200RDw() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.aweme_list = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69200RDw, RKJ> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69200RDw, RKJ> newBuilder2() {
        newBuilder2();
        return null;
    }
}
