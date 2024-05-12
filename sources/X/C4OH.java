package X;

import android.text.Editable;
import android.widget.EditText;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4OH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4OH extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends IMUser>, C76800UCe> {
    public final /* synthetic */ SharePanelWidget LJLIL;
    public final /* synthetic */ InterfaceC108504Nq LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4OH(SharePanelWidget sharePanelWidget, InterfaceC108504Nq interfaceC108504Nq) {
        super(1);
        this.LJLIL = sharePanelWidget;
        this.LJLILLLLZI = interfaceC108504Nq;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<? extends IMUser> list) {
        List<? extends IMUser> mafIMUserList = list;
        o.LJIIIZ(mafIMUserList, "mafIMUserList");
        this.LJLIL.LJLILLLLZI.LIZIZ.extras.putBoolean("show_tips_until_cancel", false);
        SharePanelWidget sharePanelWidget = this.LJLIL;
        SharePackage sharePackage = sharePanelWidget.LJLILLLLZI.LIZIZ;
        sharePackage.extras.putString("is_share_pop_up", "1");
        EditText editText = sharePanelWidget.LJLL;
        String str = null;
        if (editText != null) {
            KeyboardUtils.LIZIZ(editText);
            if (!sharePanelWidget.LLD) {
                sharePanelWidget.LJLJI.LJIIIZ();
            }
            EditText editText2 = sharePanelWidget.LJLL;
            if (editText2 != null) {
                Editable text = editText2.getText();
                if (text != null) {
                    str = text.toString();
                }
                C101243yC.LIZJ(sharePackage, str, mafIMUserList, sharePanelWidget.LJLJI, null, null, null, 112);
                sharePanelWidget.LJFF(sharePackage, str, mafIMUserList);
                this.LJLILLLLZI.dismiss();
                this.LJLILLLLZI.destroy();
                return C76800UCe.LIZ;
            }
            o.LJIJI("editText");
            throw null;
        }
        o.LJIJI("editText");
        throw null;
    }
}
