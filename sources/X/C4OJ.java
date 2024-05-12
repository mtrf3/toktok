package X;

import android.os.Bundle;
import android.text.Editable;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4OJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4OJ extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends IMUser>, C76800UCe> {
    public final /* synthetic */ C4OF LJLIL;
    public final /* synthetic */ InterfaceC108504Nq LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4OJ(C4OF c4of, InterfaceC108504Nq interfaceC108504Nq) {
        super(1);
        this.LJLIL = c4of;
        this.LJLILLLLZI = interfaceC108504Nq;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<? extends IMUser> list) {
        C4OT c4ot;
        Bundle bundle;
        List<? extends IMUser> mafIMUserList = list;
        o.LJIIIZ(mafIMUserList, "mafIMUserList");
        SharePackage sharePackage = this.LJLIL.LJLIL;
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            bundle.putBoolean("show_tips_until_cancel", false);
        }
        C4OF c4of = this.LJLIL;
        SharePackage sharePackage2 = c4of.LJLIL;
        String str = null;
        if (sharePackage2 != null) {
            sharePackage2.extras.putString("is_share_pop_up", "1");
        } else {
            sharePackage2 = null;
        }
        KeyboardUtils.LIZIZ(c4of.LIZ(R.id.gpk));
        if (!c4of.LJLLILLLL && (c4ot = c4of.LJLJJLL) != null) {
            c4ot.LJIIIZ();
        }
        Editable text = ((C19K) c4of.LIZ(R.id.gpk)).getText();
        if (text != null) {
            str = text.toString();
        }
        if (sharePackage2 != null) {
            C101243yC.LIZJ(sharePackage2, str, mafIMUserList, c4of.LJLJJLL, null, null, null, 112);
            C4OF.LIZJ(sharePackage2, str, mafIMUserList);
        }
        this.LJLILLLLZI.dismiss();
        this.LJLILLLLZI.destroy();
        return C76800UCe.LIZ;
    }
}
