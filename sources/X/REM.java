package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class REM extends Message<REM, RJU> {
    public static final ProtoAdapter<REM> ADAPTER = new RDA();
    public Integer act_type;
    public REV click_track_url_list;
    public Long end_time;
    public REV image;
    public String jump_open_url;
    public String jump_web_url;
    public Long start_time;
    public List<RHD> time_range;
    public String title;
    public REV track_url_list;

    public REM() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.time_range = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<REM, RJU> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<REM, RJU> newBuilder2() {
        newBuilder2();
        return null;
    }
}
