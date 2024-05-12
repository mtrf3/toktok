package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.3bl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87333bl extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87333bl(long j, String str, String str2) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View it) {
        o.LJIIIZ(it, "it");
        C96093pt.LIZJ(String.valueOf(this.LJLIL), "video_sticker_rank_list", "click_name", null, null);
        C87393br.LJIL("chat", "click", this.LJLILLLLZI, this.LJLJI, Boolean.TRUE, "more_stickers");
        return C76800UCe.LIZ;
    }
}
