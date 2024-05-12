package X;

import android.text.TextUtils;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.api.revenue.level.event.UserLevelBackEvent;
import com.bytedance.android.livesdk.impl.revenue.level.viewmodel.UserLevelViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import tikcast.api.privilege.GradeConfig;
import tikcast.api.privilege.GradeInfoResponse;
import tikcast.api.privilege.UserGrade;

/* renamed from: X.Bmk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29798Bmk<T> implements InterfaceC64592gB {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C29800Bmm LJLJJI;
    public final /* synthetic */ UserLevelViewModel LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ Boolean LJLJL;
    public final /* synthetic */ InterfaceC88472Yns<List<GradeConfig>, C76800UCe> LJLJLJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C29798Bmk(boolean z, String str, long j, C29800Bmm c29800Bmm, UserLevelViewModel userLevelViewModel, String str2, Boolean bool, InterfaceC88472Yns<? super List<GradeConfig>, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
        this.LJLJJI = c29800Bmm;
        this.LJLJJL = userLevelViewModel;
        this.LJLJJLL = str2;
        this.LJLJL = bool;
        this.LJLJLJ = interfaceC88472Yns;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        GradeInfoResponse.Data data;
        UserGrade userGrade;
        DataChannel dataChannel;
        int i;
        long j;
        BaseResponse baseResponse = (BaseResponse) obj;
        long currentTimeMillis = System.currentTimeMillis();
        Integer num = null;
        if (baseResponse != null && Integer.valueOf(baseResponse.statusCode) != null && (baseResponse == null || baseResponse.statusCode != 0)) {
            C28992BZk.LJ(this.LJLIL, this.LJLILLLLZI, currentTimeMillis - this.LJLJI, false, Integer.valueOf(baseResponse.statusCode));
            C29800Bmm c29800Bmm = this.LJLJJI;
            if (c29800Bmm != null) {
                i = c29800Bmm.LIZ;
            } else {
                i = -1;
            }
            Integer valueOf = Integer.valueOf(i);
            C29800Bmm c29800Bmm2 = this.LJLJJI;
            if (c29800Bmm2 != null) {
                j = c29800Bmm2.LIZIZ;
            } else {
                j = -1;
            }
            C28992BZk.LIZJ(valueOf, Long.valueOf(j), -1, -1L, Integer.valueOf(baseResponse.statusCode));
        }
        boolean z = this.LJLIL;
        String str = this.LJLILLLLZI;
        long j2 = currentTimeMillis - this.LJLJI;
        if (baseResponse != null) {
            num = Integer.valueOf(baseResponse.statusCode);
        }
        C28992BZk.LJ(z, str, j2, true, num);
        if (baseResponse == null || (data = (GradeInfoResponse.Data) baseResponse.data) == null || (userGrade = data.userGrade) == null) {
            return;
        }
        List<GradeConfig> list = data.gradeConfig;
        if (TextUtils.equals(this.LJLILLLLZI, "level_back") && (dataChannel = this.LJLJJL.getDataChannel()) != null) {
            dataChannel.pv0(UserLevelBackEvent.class);
        }
        this.LJLJJL.jv0(userGrade, false, 2, this.LJLILLLLZI, this.LJLJJLL, this.LJLJL);
        if (!this.LJLIL) {
            return;
        }
        C29799Bml.LIZ(list);
        if (list == null) {
            return;
        }
        List<GradeConfig> LLJILJILJ = ORZ.LLJILJILJ(list);
        InterfaceC88472Yns<List<GradeConfig>, C76800UCe> interfaceC88472Yns = this.LJLJLJ;
        if (interfaceC88472Yns == null) {
            return;
        }
        interfaceC88472Yns.invoke(LLJILJILJ);
    }
}
