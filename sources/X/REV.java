package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class REV extends Message<REV, RIO> {
    public static final ProtoAdapter<REV> ADAPTER = new RDL();
    public Long data_size;
    public String file_cs;
    public String file_hash;
    public String file_id;
    public Integer height;
    public String player_access_key;
    public String uri;
    public String url_key;
    public List<String> url_list;
    public Integer width;

    public REV() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.url_list = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<REV, RIO> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<REV, RIO> newBuilder2() {
        newBuilder2();
        return null;
    }
}
