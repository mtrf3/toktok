package X;

import Y.IDhS68S0200000_5;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.EncryptedUploadMethod;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;

/* renamed from: X.Cf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C31866Cf0 implements InterfaceC86003Zc {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9 interfaceC73573Su9) {
        switch (this.LJLIL) {
            case 0:
                IDhS68S0200000_5 iDhS68S0200000_5 = (IDhS68S0200000_5) this.LJLJI;
                byte[] bArr = (byte[]) this.LJLJJI;
                String str = this.LJLILLLLZI;
                EncryptedUploadMethod encryptedUploadMethod = (EncryptedUploadMethod) iDhS68S0200000_5.l1;
                interfaceC73573Su9.onNext(new C31865Cez(str, encryptedUploadMethod.LJJIIZI(encryptedUploadMethod.LJLJLJ, encryptedUploadMethod.LJLJLLL, bArr)));
                return;
            default:
                AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) this.LJLJI;
                ((C55693LtR) awemeListFragmentImpl.LJZL.LJLIL).LJIIJJI((FeedItemList) this.LJLJJI, this.LJLILLLLZI);
                return;
        }
    }

    public /* synthetic */ C31866Cf0(String str, int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLJI = obj;
        this.LJLJJI = obj2;
        this.LJLILLLLZI = str;
    }
}
