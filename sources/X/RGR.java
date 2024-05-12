package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RGR extends Message<RGR, RI1> {
    public static final ProtoAdapter<RGR> ADAPTER = new C69215REl();
    public Integer aweme_type;
    public List<C69159RCh> story_videos;

    public RGR() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.story_videos = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGR, RI1> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGR, RI1> newBuilder2() {
        newBuilder2();
        return null;
    }
}
