package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.REk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69214REk extends Message<C69214REk, RKG> {
    public static final ProtoAdapter<C69214REk> ADAPTER = new C69180RDc();
    public Long data_size;
    public String file_cs;
    public String file_hash;
    public Integer height;
    public String player_access_key;
    public String uri;
    public String url_key;
    public List<String> url_list;
    public Integer width;

    public C69214REk() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.url_list = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69214REk, RKG> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69214REk, RKG> newBuilder2() {
        newBuilder2();
        return null;
    }
}
