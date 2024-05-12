package X;

import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.squareup.wire.Message;

/* renamed from: X.YYg, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87566YYg extends Message.Builder<ConversationInfoV2, C87566YYg> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public String LJI;
    public ParticipantsPage LJII;
    public Integer LJIIIIZZ;
    public Boolean LJIIIZ;
    public Integer LJIIJ;
    public Integer LJIIJJI;
    public Integer LJIIL;
    public Participant LJIILIIL;
    public ConversationCoreInfo LJIILJJIL;
    public ConversationSettingInfo LJIILL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationInfoV2 build() {
        return new ConversationInfoV2(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, buildUnknownFields());
    }
}
