package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RFf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69235RFf extends Message<C69235RFf, RJ5> {
    public static final ProtoAdapter<C69235RFf> ADAPTER = new C69193RDp();
    public Boolean allow_download;
    public Boolean allow_duet;
    public Boolean allow_dynamic_wallpaper;
    public Boolean allow_music;
    public Boolean allow_react;
    public Boolean allow_stitch;
    public Integer draft_progress_bar;
    public Integer prevent_download_type;
    public Integer share_type;
    public Integer show_progress_bar;
    public Integer timer_status;

    public C69235RFf() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69235RFf, RJ5> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69235RFf, RJ5> newBuilder2() {
        newBuilder2();
        return null;
    }
}
