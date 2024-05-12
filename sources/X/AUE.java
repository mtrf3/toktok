package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity;

/* loaded from: classes5.dex */
public final class AUE implements InterfaceC26329AUz {
    public final /* synthetic */ I18nHeaderDetailActivity LIZ;

    public AUE(I18nHeaderDetailActivity i18nHeaderDetailActivity) {
        this.LIZ = i18nHeaderDetailActivity;
    }

    @Override // X.InterfaceC26329AUz
    public final void onData(String str) {
        I18nHeaderDetailActivity i18nHeaderDetailActivity = this.LIZ;
        i18nHeaderDetailActivity.getClass();
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("file://");
            LIZ.append(str);
            android.net.Uri parse = UriProtector.parse(X1D.LIZIZ(LIZ));
            if (parse != null) {
                W5I.LIZ().LIZIZ(parse);
                i18nHeaderDetailActivity.LLFII(i18nHeaderDetailActivity.LJLILLLLZI, false, parse.toString());
            }
        } catch (Exception unused) {
        }
    }
}
