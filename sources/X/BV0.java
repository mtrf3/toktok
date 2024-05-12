package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.ShouldDoubleCheckAgeVerifyStatus;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAgeVerifySchema;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BV0 implements C0K7 {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ DataChannel LJLILLLLZI;

    public BV0(Context context, DataChannel dataChannel) {
        this.LJLIL = context;
        this.LJLILLLLZI = dataChannel;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        String uri;
        android.net.Uri ageVerifyUrl = UriProtector.parse(LiveAgeVerifySchema.INSTANCE.getValue()).buildUpon().appendQueryParameter("lang", C04520Fs.LIZIZ()).appendQueryParameter("object_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId())).build();
        o.LJIIIIZZ(ageVerifyUrl, "ageVerifyUrl");
        try {
            android.net.Uri parse = UriProtector.parse(UriProtector.getQueryParameter(ageVerifyUrl, "url"));
            Uri.Builder buildUpon = parse.buildUpon();
            for (Map.Entry entry : ((LinkedHashMap) C28346BAo.LIZIZ()).entrySet()) {
                if (UriProtector.getQueryParameter(parse, (String) entry.getKey()) == null) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
            }
            String uri2 = buildUpon.build().toString();
            o.LJIIIIZZ(uri2, "innerUriBuilder.build().toString()");
            Uri.Builder clearQuery = ageVerifyUrl.buildUpon().clearQuery();
            java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(ageVerifyUrl);
            if (queryParameterNames != null) {
                for (String str : queryParameterNames) {
                    if (!o.LJ(str, "url")) {
                        clearQuery.appendQueryParameter(str, UriProtector.getQueryParameter(ageVerifyUrl, str));
                    }
                }
            }
            uri = clearQuery.appendQueryParameter("url", uri2).toString();
            o.LJIIIIZZ(uri, "resultUri\n              …              .toString()");
        } catch (Exception unused) {
            uri = ageVerifyUrl.toString();
            o.LJIIIIZZ(uri, "{\n            originUri.toString()\n        }");
        }
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.LJLIL, uri);
        this.LJLILLLLZI.rv0(ShouldDoubleCheckAgeVerifyStatus.class, Boolean.TRUE);
        C0N7.LJIILIIL(this.LJLILLLLZI, "verify");
        liveDialog.dismiss();
    }
}
