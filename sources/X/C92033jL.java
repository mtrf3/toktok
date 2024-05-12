package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.schema.SendStickerRoute;

/* renamed from: X.3jL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92033jL extends AbstractC65781Prl implements InterfaceC88472Yns<Emoji, C76800UCe> {
    public final /* synthetic */ SendStickerRoute LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ Bundle LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ java.util.Map<String, String> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92033jL(SendStickerRoute sendStickerRoute, Context context, Bundle bundle, boolean z, long j, java.util.Map<String, String> map) {
        super(1);
        this.LJLIL = sendStickerRoute;
        this.LJLILLLLZI = context;
        this.LJLJI = bundle;
        this.LJLJJI = z;
        this.LJLJJL = j;
        this.LJLJJLL = map;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Emoji emoji) {
        boolean z;
        String str;
        String param;
        Emoji emoji2 = emoji;
        if (emoji2 != null) {
            z = true;
        } else {
            z = false;
        }
        C85323Wm LIZ = C772831o.LIZ();
        C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "onEventV3");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.put("is_sticker_emoji_config_exist", str);
        LIZ.LIZIZ("check_sticker_emoji_config", LIZ2);
        if (emoji2 != null && (param = this.LJLIL.getParam("conversation_id")) != null) {
            C101543yg c101543yg = C101543yg.LIZ;
            Context context = this.LJLILLLLZI;
            C92043jM c92043jM = new C92043jM(this.LJLIL, this.LJLJI, this.LJLJJI, this.LJLJJL, param, emoji2, this.LJLJJLL);
            c101543yg.getClass();
            C101543yg.LIZ(context, param, c92043jM);
        }
        return C76800UCe.LIZ;
    }
}
