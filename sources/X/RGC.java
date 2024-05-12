package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RGC extends Message<RGC, RJM> {
    public static final ProtoAdapter<RGC> ADAPTER = new RGB();
    public Long CdnUrlExpired;
    public List<RGA> TtsInfos;
    public List<RLM> original_sound_infos;

    public RGC() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.TtsInfos = C63685Oz3.LJIIIIZZ();
        this.original_sound_infos = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGC, RJM> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGC, RJM> newBuilder2() {
        newBuilder2();
        return null;
    }
}
