package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RLq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69402RLq extends Message<C69402RLq, C69403RLr> {
    public static final ProtoAdapter<C69402RLq> ADAPTER = new C69401RLp();
    public RRT appearance;
    public String audio_uri;
    public List<C69405RLt> auto_captions;
    public Long caption_lines;
    public Long disable;
    public Boolean is_translatable;
    public Integer location;
    public RON position;
    public String src_lang;
    public List<C69253RFx> utterances;

    public C69402RLq() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.utterances = C63685Oz3.LJIIIIZZ();
        this.auto_captions = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69402RLq, C69403RLr> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69402RLq, C69403RLr> newBuilder2() {
        newBuilder2();
        return null;
    }
}
