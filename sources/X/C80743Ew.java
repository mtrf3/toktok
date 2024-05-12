package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AppStatus;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticePushStatus;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;
import fjb.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel$fetchTopNotice$1", f = "TopNoticeViewModel.kt", l = {109, 129}, m = "invokeSuspend")
/* renamed from: X.3Ew, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80743Ew extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SessionListTopNoticeViewModel LJLILLLLZI;
    public final /* synthetic */ TopChatNoticePushStatus LJLJI;
    public final /* synthetic */ AppStatus LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80743Ew(SessionListTopNoticeViewModel sessionListTopNoticeViewModel, TopChatNoticePushStatus topChatNoticePushStatus, AppStatus appStatus, int i, boolean z, InterfaceC67352kd<? super C80743Ew> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = sessionListTopNoticeViewModel;
        this.LJLJI = topChatNoticePushStatus;
        this.LJLJJI = appStatus;
        this.LJLJJL = i;
        this.LJLJJLL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C80743Ew(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        IMNoticeMsgStruct noticeMsgStruct;
        IMNoticeMsgStruct iMNoticeMsgStruct;
        String str;
        String str2;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj2);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj2);
        } else {
            C141335gf.LIZJ(obj2);
            SessionListTopNoticeViewModel sessionListTopNoticeViewModel = this.LJLILLLLZI;
            sessionListTopNoticeViewModel.LJLLLL = 0;
            TikTokImApi tikTokImApi = sessionListTopNoticeViewModel.LJLILLLLZI;
            int status = this.LJLJI.getStatus();
            int status2 = this.LJLJJI.getStatus();
            int i2 = this.LJLJJL;
            boolean z = this.LJLJJLL;
            this.LJLIL = 1;
            obj2 = C80753Ex.LIZIZ(tikTokImApi, null, null, null, "inbox", i2, status, false, status2, z, false, this, 583);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ImChatTopTipModel imChatTopTipModel = (ImChatTopTipModel) obj2;
        this.LJLILLLLZI.LJLJLLL.LIZ(this.LJLJJI.getStatus(), this.LJLJJLL);
        List<IMNoticeMsgStruct> noticeMsgStructArr = imChatTopTipModel.getNoticeMsgStructArr();
        if (noticeMsgStructArr == null || (noticeMsgStruct = (IMNoticeMsgStruct) ORZ.LJLLLLLL(0, noticeMsgStructArr)) == null) {
            noticeMsgStruct = imChatTopTipModel.getNoticeMsgStruct();
        }
        List<IMNoticeMsgStruct> noticeMsgStructArr2 = imChatTopTipModel.getNoticeMsgStructArr();
        if (noticeMsgStructArr2 != null) {
            iMNoticeMsgStruct = (IMNoticeMsgStruct) ORZ.LJLLLLLL(1, noticeMsgStructArr2);
        } else {
            iMNoticeMsgStruct = null;
        }
        SessionListTopNoticeViewModel sessionListTopNoticeViewModel2 = this.LJLILLLLZI;
        String[] strArr = new String[2];
        if (noticeMsgStruct != null) {
            str = noticeMsgStruct.getNoticeCode();
        } else {
            str = null;
        }
        strArr[0] = str;
        if (iMNoticeMsgStruct != null) {
            str2 = iMNoticeMsgStruct.getNoticeCode();
        } else {
            str2 = null;
        }
        strArr[1] = str2;
        sessionListTopNoticeViewModel2.LJLLL = ORZ.LLJILJILJ(ORY.LJJIJLIJ(strArr));
        if (((ArrayList) this.LJLILLLLZI.LJLLL).size() == 2 && SessionListTopNoticeViewModel.jv0((String) ORZ.LJLLLLLL(1, this.LJLILLLLZI.LJLLL))) {
            Collections.swap(this.LJLILLLLZI.LJLLL, 0, 1);
        }
        SessionListTopNoticeViewModel sessionListTopNoticeViewModel3 = this.LJLILLLLZI;
        XKW xkw = sessionListTopNoticeViewModel3.LJLJJL;
        C66002iS c66002iS = new C66002iS(sessionListTopNoticeViewModel3, null);
        this.LJLIL = 2;
        if (XKX.LJI(xkw, c66002iS, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
