package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GsL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42885GsL extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ Bundle LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42885GsL(Context context, Bundle bundle) {
        super(1);
        this.LJLIL = bundle;
        this.LJLILLLLZI = context;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        Bundle bundle = new Bundle();
        Context context = this.LJLILLLLZI;
        bundle.putString("url", str);
        bundle.putString("title", context.getString(R.string.eww));
        bundle.putString("enter_from", "donation_sticker_consume");
        bundle.putString("hide_more", "false");
        Bundle bundle2 = this.LJLIL;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Context context2 = this.LJLILLLLZI;
        o.LJIIIZ(context2, "context");
        bundle.putBoolean("show_load_dialog", false);
        bundle.putBoolean("webview_progress_bar", true);
        Intent intent = new Intent(context2, (Class<?>) DonationWebPageDialogActivity.class);
        intent.putExtras(bundle);
        C16880lQ.LIZJ(context2, intent);
        return C76800UCe.LIZ;
    }
}
