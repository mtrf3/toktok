package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;

/* renamed from: X.8ob, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC222698ob extends InterfaceC222708oc, InterfaceC222728oe, OnUIPlayListener, InterfaceC215228cY {
    void HM(EnumC215438ct enumC215438ct);

    void KJ(int i, String str);

    void LJJIFFI(DataCenter dataCenter);

    void LLLZ(int i, Aweme aweme);

    void N7(InterfaceC47667InH interfaceC47667InH);

    void O(boolean z);

    void Qg0(int i);

    void V3(boolean z);

    C2MA Y6();

    void Zo(boolean z);

    InterfaceC47247IgV getSurfaceHolder();

    C2MA getViewHolderByAwemeId(String str);

    void onDestroyView();

    void onPagePause();

    void r5(int i, int i2);

    void unBind();
}
