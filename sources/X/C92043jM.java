package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GifContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.schema.SendStickerRoute;

/* renamed from: X.3jM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92043jM extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ SendStickerRoute LJLIL;
    public final /* synthetic */ Bundle LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Emoji LJLJJLL;
    public final /* synthetic */ java.util.Map<String, String> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92043jM(SendStickerRoute sendStickerRoute, Bundle bundle, boolean z, long j, String str, Emoji emoji, java.util.Map<String, String> map) {
        super(1);
        this.LJLIL = sendStickerRoute;
        this.LJLILLLLZI = bundle;
        this.LJLJI = z;
        this.LJLJJI = j;
        this.LJLJJL = str;
        this.LJLJJLL = emoji;
        this.LJLJL = map;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String str2 = str;
        String param = this.LJLIL.getParam("title");
        if (param == null) {
            param = "";
        }
        java.util.Map<String, String> localExtMap = this.LJLIL.getLocalExtMap(param, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        if (C78685UuP.LJJJZ(str2)) {
            localExtMap.put("enter_method", str2);
        }
        C4MW c4mw = (C4MW) C88903eI.LIZ();
        c4mw.LIZ.LIZIZ = this.LJLJJL;
        c4mw.LIZLLL(GifContent.Companion.obtain(this.LJLJJLL));
        java.util.Map<String, String> map = this.LJLJL;
        C4MX c4mx = c4mw.LIZ;
        c4mx.LJFF = map;
        c4mx.LJII = localExtMap;
        c4mw.LJI();
        return C76800UCe.LIZ;
    }
}
