package X;

import com.bytedance.scalpel.protos.TimeInfo;
import com.squareup.wire.Message;

/* renamed from: X.YYw, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87582YYw extends Message.Builder<TimeInfo, C87582YYw> {
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final TimeInfo build() {
        return new TimeInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
