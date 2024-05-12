package X;

import com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody;
import com.bytedance.im.core.proto.ModifyPropertyBody;
import com.squareup.wire.Message;

/* renamed from: X.Ow0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63496Ow0 extends Message.Builder<ModifyMessagePropertyRequestBody, C63496Ow0> {
    public ModifyPropertyBody LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ModifyMessagePropertyRequestBody build() {
        return new ModifyMessagePropertyRequestBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
