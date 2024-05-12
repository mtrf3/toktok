package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: X.McH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57177McH<T> implements InterfaceC66992k3 {
    public final /* synthetic */ String LJLIL;

    public C57177McH(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<BaseResponse> interfaceC65052gv) {
        ((C73578SuE) interfaceC65052gv).onSuccess(C86034Xpe.LIZIZ.setPushPrivateSettingItem(this.LJLIL, 1));
        C85940Xo8.LIZIZ.LIZ(1, this.LJLIL);
    }
}
