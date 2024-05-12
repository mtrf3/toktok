package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.REy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69228REy extends Message<C69228REy, RIX> {
    public static final ProtoAdapter<C69228REy> ADAPTER = new RDE();
    public C69154RCc author;
    public REV cover_url;
    public String desc;
    public String extra;
    public REV icon_url;
    public String mix_id;
    public String mix_name;
    public C69199RDv share_info;
    public C69275RGt statis;
    public C69426RMo status;

    public C69228REy() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69228REy, RIX> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69228REy, RIX> newBuilder2() {
        newBuilder2();
        return null;
    }
}
