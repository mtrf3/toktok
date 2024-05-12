package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RNU extends Message<RNU, RNV> {
    public static final ProtoAdapter<RNU> ADAPTER = new RNT();
    public String button_label;
    public String redirect_uri;

    public RNU() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RNU, RNV> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RNU, RNV> newBuilder2() {
        newBuilder2();
        return null;
    }
}
