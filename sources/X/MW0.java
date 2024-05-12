package X;

import android.view.View;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TextLinkConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MW0 implements InterfaceC56934MWc {
    public final /* synthetic */ C56912MVg LIZ;
    public final /* synthetic */ TextLinkConfig LIZIZ;

    public MW0(C56912MVg c56912MVg, TextLinkConfig textLinkConfig) {
        this.LIZ = c56912MVg;
        this.LIZIZ = textLinkConfig;
    }

    @Override // X.InterfaceC56934MWc
    public final void LIZ(View v, User user, int i) {
        InterfaceC56930MVy mBridge;
        String str;
        InterfaceC56930MVy mBridge2;
        o.LJIIIZ(v, "v");
        InterfaceC56930MVy mBridge3 = this.LIZ.getMBridge();
        if (mBridge3 != null) {
            mBridge3.s();
        }
        TextLinkConfig textLinkConfig = this.LIZIZ;
        if (textLinkConfig != null && textLinkConfig.needTrack && (mBridge2 = this.LIZ.getMBridge()) != null) {
            mBridge2.D();
        }
        String str2 = AX5.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        TextLinkConfig textLinkConfig2 = this.LIZIZ;
        if (textLinkConfig2 != null && textLinkConfig2.schemaType == 1 && (mBridge = this.LIZ.getMBridge()) != null) {
            MusNotice mBaseNotice = this.LIZ.getMBaseNotice();
            if (mBaseNotice != null) {
                str = mBaseNotice.getAccountType();
            } else {
                str = null;
            }
            mBridge.LLLJL(user, "click_name", str2, str);
        }
        C61200O0e.LIZLLL().LJFF(this.LIZIZ.schemaUrl, C03660Ck.LIZJ("inbox_position", str2));
        InterfaceC56930MVy mBridge4 = this.LIZ.getMBridge();
        if (mBridge4 != null) {
            mBridge4.LLJJJIL();
        }
    }
}
