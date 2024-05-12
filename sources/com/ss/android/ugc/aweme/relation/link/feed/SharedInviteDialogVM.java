package com.ss.android.ugc.aweme.relation.link.feed;

import X.C221128m4;
import X.C25620zW;
import X.C36636EZk;
import X.C48841JEv;
import X.C55773Luj;
import X.C78920UyC;
import X.EnumC55775Lul;
import X.InterfaceC70422pa;
import X.JG5;
import X.ORZ;
import X.OSZ;
import X.T2R;
import X.X1D;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* loaded from: classes10.dex */
public final class SharedInviteDialogVM extends ViewModel {
    public final InterfaceC70422pa LJLIL;
    public C221128m4 LJLILLLLZI;
    public final MutableLiveData<OSZ<EnumC55775Lul, Aweme>> LJLJI;
    public final MutableLiveData LJLJJI;
    public Bundle LJLJJL;

    public SharedInviteDialogVM() {
        this(0);
    }

    public SharedInviteDialogVM(int i) {
        this.LJLIL = C48841JEv.LIZ(C36636EZk.LIZ.plus(T2R.LJIIJJI()));
        MutableLiveData<OSZ<EnumC55775Lul, Aweme>> mutableLiveData = new MutableLiveData<>();
        this.LJLJI = mutableLiveData;
        this.LJLJJI = mutableLiveData;
    }

    public static Aweme gv0(C55773Luj c55773Luj, String str) {
        boolean z;
        String str2;
        Aweme aweme;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str3 = null;
        if (!z) {
            str2 = C78920UyC.LIZ('[', str, ']');
        } else {
            str2 = null;
        }
        BatchDetailList LIZIZ = JG5.LIZ().LIZIZ(str2, null, c55773Luj.LJIIL, c55773Luj.LJIIJ, c55773Luj.LJIIJJI);
        List<Aweme> list = LIZIZ.items;
        if (list != null && (aweme = (Aweme) ORZ.LJLLJ(list)) != null) {
            LogPbBean logPbBean = LIZIZ.logPbBean;
            if (logPbBean != null) {
                str3 = logPbBean.getImprId();
            }
            aweme.setRequestId(str3);
            return aweme;
        }
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("response can't find target aweme(", str, ")! logId: ");
        LIZIZ2.append(LIZIZ.requestId);
        String LIZIZ3 = X1D.LIZIZ(LIZIZ2);
        LIZIZ3.toString();
        throw new IllegalStateException(LIZIZ3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(X.C55773Luj r9, java.lang.String r10, X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogVM.hv0(X.Luj, java.lang.String, X.2kd):java.lang.Object");
    }
}
