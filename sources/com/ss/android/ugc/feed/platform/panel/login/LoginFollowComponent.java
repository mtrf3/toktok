package com.ss.android.ugc.feed.platform.panel.login;

import X.C221108m2;
import X.C221138m5;
import X.C2K0;
import X.C3U1;
import X.C51781KTx;
import X.C5H3;
import X.C62822Ol8;
import X.EnumC221088m0;
import X.InterfaceC55102Lju;
import X.JAK;
import X.KU4;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS60S0110000_3;

/* loaded from: classes4.dex */
public final class LoginFollowComponent extends BasePanelComponent implements ILoginFollowAbility, InterfaceC55102Lju {
    public static final /* synthetic */ int LJLJJL = 0;
    public final C5H3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1431079234) {
            return null;
        }
        return this;
    }

    public final C3U1 v3() {
        return (C3U1) this.LJLJJI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoginFollowComponent() {
        C62822Ol8 c62822Ol8;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS153S0100000_3((KU4) this, 1327), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS60S0110000_3(false, (KU4) this, 3));
        }
        this.LJLIL = c62822Ol8;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1328));
        C221108m2.LIZIZ(new AqS153S0100000_3(this, 1325));
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1324));
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1326));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0311, code lost:
    
        if (r0 == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0347, code lost:
    
        if (r10.equals("share_user_info_card") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0353, code lost:
    
        r10 = 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0351, code lost:
    
        if (r10.equals("share_user_info_popup") != false) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025f  */
    @Override // com.ss.android.ugc.feed.platform.panel.login.ILoginFollowAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean uD(final X.C50420Jqa r19, final kotlin.jvm.internal.AqS150S0200000_3 r20) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.login.LoginFollowComponent.uD(X.Jqa, kotlin.jvm.internal.AqS150S0200000_3):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0313, code lost:
    
        if (r21.getIsStoryToNormal() == true) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04a4, code lost:
    
        if (r25 != null) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x3(com.ss.android.ugc.aweme.feed.model.Aweme r21, java.lang.String r22, boolean r23, int r24, X.C50420Jqa r25) {
        /*
            Method dump skipped, instructions count: 1287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.login.LoginFollowComponent.x3(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, boolean, int, X.Jqa):void");
    }
}
