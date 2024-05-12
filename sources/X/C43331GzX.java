package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.detail.api.DetailApiProxyImpl;
import com.ss.android.ugc.aweme.editpost.EditPostPushBody;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.GzX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43331GzX<T> implements InterfaceC86003Zc {
    public final /* synthetic */ String LJLIL;

    public C43331GzX(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Aweme> interfaceC73573Su9) {
        try {
            Object LIZ = C75792yF.LIZ(this.LJLIL, EditPostPushBody.class);
            o.LJIIIIZZ(LIZ, "fromJson(data, EditPostPushBody::class.java)");
            EditPostPushBody editPostPushBody = (EditPostPushBody) LIZ;
            if (editPostPushBody.getPushScene() == EnumC43332GzY.SUCCESS.getValue()) {
                try {
                    Aweme LIZ2 = DetailApiProxyImpl.LIZIZ().LIZ(editPostPushBody.getAwemeId());
                    ((IAwemeService) C41379GLv.LIZ.getValue()).R1(LIZ2);
                    interfaceC73573Su9.onNext(LIZ2);
                    interfaceC73573Su9.onComplete();
                    return;
                } catch (Exception unused) {
                    interfaceC73573Su9.onComplete();
                    return;
                }
            }
            C41379GLv.LIZIZ(editPostPushBody.getAwemeId(), editPostPushBody.getEditPostPermission());
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("This video fail to pass moderation: aid : ");
            LIZ3.append(editPostPushBody.getAwemeId());
            C36922EeM.LIZLLL(2, "FrontierReeditPushImpl", X1D.LIZIZ(LIZ3));
            interfaceC73573Su9.onComplete();
        } catch (Exception unused2) {
            interfaceC73573Su9.onComplete();
        }
    }
}
