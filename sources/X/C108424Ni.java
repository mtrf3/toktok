package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ni, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108424Ni extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends IMUser>, C76800UCe> {
    public final /* synthetic */ C108464Nm LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC108504Nq LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C108424Ni(C108464Nm c108464Nm, boolean z, InterfaceC108504Nq interfaceC108504Nq) {
        super(1);
        this.LJLIL = c108464Nm;
        this.LJLILLLLZI = z;
        this.LJLJI = interfaceC108504Nq;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<? extends IMUser> list) {
        String str;
        List<? extends IMUser> imUserList = list;
        o.LJIIIZ(imUserList, "imUserList");
        C108464Nm c108464Nm = this.LJLIL;
        ShareTextBoxViewModel shareTextBoxViewModel = c108464Nm.LJI;
        Editable text = c108464Nm.LJIIIIZZ.getText();
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        boolean z = this.LJLILLLLZI;
        shareTextBoxViewModel.getClass();
        shareTextBoxViewModel.LJLIL.extras.putBoolean("show_tips_until_cancel", false);
        shareTextBoxViewModel.LJLIL.extras.putString("is_share_pop_up", "1");
        Boolean value = shareTextBoxViewModel.LJLJJL.getValue();
        Boolean bool = Boolean.TRUE;
        if (!o.LJ(value, bool)) {
            shareTextBoxViewModel.LJLJJL.postValue(bool);
        }
        String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, "randomUUID().toString()");
        shareTextBoxViewModel.gv0(imUserList);
        C107274Ix.LJI(imUserList, str, shareTextBoxViewModel.LJLIL, null, null, null, uuid, !z, null);
        C57428MgK.LJFF(shareTextBoxViewModel.LJLIL, str, ORZ.LLJILJILJ(imUserList), 0, 56);
        shareTextBoxViewModel.LJZL.setValue(bool);
        this.LJLJI.dismiss();
        return C76800UCe.LIZ;
    }
}
