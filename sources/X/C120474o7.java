package X;

import com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.4o7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120474o7 extends Message.Builder<SetConversationSettingInfoRequestBody, C120474o7> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Boolean LJI;
    public Boolean LJII;
    public Boolean LJIIIIZZ;
    public EnumC96103pu LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SetConversationSettingInfoRequestBody build() {
        return new SetConversationSettingInfoRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
    }
}
