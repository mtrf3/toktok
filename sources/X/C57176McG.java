package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: X.McG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57176McG<T> implements InterfaceC66992k3 {
    public final /* synthetic */ ViewOnClickListenerC57173McD LJLIL;

    public C57176McG(ViewOnClickListenerC57173McD viewOnClickListenerC57173McD) {
        this.LJLIL = viewOnClickListenerC57173McD;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<BaseResponse> interfaceC65052gv) {
        ((C73578SuE) interfaceC65052gv).onSuccess(C86034Xpe.LIZIZ.setPushPrivateSettingItem("friends_only_push", this.LJLIL.LJZ));
    }
}
