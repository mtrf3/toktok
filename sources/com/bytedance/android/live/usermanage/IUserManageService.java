package com.bytedance.android.live.usermanage;

import X.AbstractC73638SvC;
import X.BEO;
import X.BEX;
import X.BFA;
import X.BFC;
import X.C05490Jl;
import X.C28555BIp;
import X.C28565BIz;
import X.C29930Bos;
import X.C73318Sq2;
import X.C76800UCe;
import X.DialogC28454BEs;
import X.InterfaceC06390Mx;
import X.InterfaceC28453BEr;
import X.InterfaceC28456BEu;
import X.InterfaceC28459BEx;
import X.InterfaceC28558BIs;
import X.InterfaceC88472Yns;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* loaded from: classes6.dex */
public interface IUserManageService extends InterfaceC06390Mx {
    String Ab0();

    void EG(InterfaceC28456BEu interfaceC28456BEu, long j);

    void HR(BFA bfa, boolean z, BFC bfc, long j, long j2, String str);

    void Ns(long j, User user, C05490Jl c05490Jl, InterfaceC28558BIs interfaceC28558BIs);

    void Qp0(Context context, C28555BIp c28555BIp);

    void Qu(long j, User user, InterfaceC28558BIs interfaceC28558BIs);

    void TI(BEX bex, long j, int i);

    C28565BIz UZ(BaseFragment baseFragment, DataChannel dataChannel, C73318Sq2 c73318Sq2);

    void Us(Context context, C29930Bos c29930Bos);

    boolean X00();

    DialogC28454BEs XI(Context context, long j, long j2, long j3, InterfaceC28453BEr interfaceC28453BEr);

    void Ye0(long j, DataChannel dataChannel, int i);

    void Z20(long j, long j2, BEO beo);

    void Zo0(InterfaceC88472Yns<? super List<C05490Jl>, C76800UCe> interfaceC88472Yns);

    AbstractC73638SvC<C05490Jl> af0();

    void ar(BEX bex, long j, int i);

    void cW(InterfaceC28459BEx interfaceC28459BEx, boolean z, long j, long j2, String str);

    boolean ef0();

    void fk0(BEO beo);

    boolean jf0();

    void oo(Context context, C28555BIp c28555BIp, DataChannel dataChannel);

    boolean qZ();

    void zr(C05490Jl c05490Jl);
}
