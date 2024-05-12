package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RED extends Message<RED, C69335RJb> {
    public static final ProtoAdapter<RED> ADAPTER = new RDB();
    public Double duration;
    public String fext;
    public Long img_num;
    public List<String> img_uris;
    public String img_url;
    public List<String> img_urls;
    public Long img_x_len;
    public Long img_x_size;
    public Long img_y_len;
    public Long img_y_size;
    public Double interval;
    public String uri;

    public RED() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.img_uris = C63685Oz3.LJIIIIZZ();
        this.img_urls = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RED, C69335RJb> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RED, C69335RJb> newBuilder2() {
        newBuilder2();
        return null;
    }
}
