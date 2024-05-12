package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RDd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69181RDd extends Message<C69181RDd, RJ0> {
    public static final ProtoAdapter<C69181RDd> ADAPTER = new RD0();
    public RD2 appearance;
    public List<C69216REm> caption_infos;
    public Integer captions_type;
    public Long creator_edited_caption_id;
    public Integer enable_auto_caption;
    public Integer has_original_audio;
    public Boolean hide_original_caption;
    public Integer no_caption_reason;
    public RG5 original_language_info;
    public C69408RLw position;
    public List<Float> vertical_positions;

    public C69181RDd() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.caption_infos = C63685Oz3.LJIIIIZZ();
        this.vertical_positions = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69181RDd, RJ0> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69181RDd, RJ0> newBuilder2() {
        newBuilder2();
        return null;
    }
}
