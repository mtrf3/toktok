package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.ss.android.ugc.aweme.notification.lego.FetchTutorialVideoRequest;

/* renamed from: X.MUo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56894MUo<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ String LIZ;

    public C56894MUo(FetchTutorialVideoRequest fetchTutorialVideoRequest, String str) {
        this.LIZ = str;
    }

    @Override // X.C10I
    public final Object then(C10K<TutorialVideoResp> c10k) {
        TutorialVideoInfo info;
        int i;
        if (c10k.LJIILIIL()) {
            InterfaceC56896MUq interfaceC56896MUq = (InterfaceC56896MUq) C54366LVi.LIZ(InterfaceC56896MUq.class);
            TutorialVideoResp LJIIJJI = c10k.LJIIJJI();
            if (LJIIJJI != null && (info = LJIIJJI.getInfo()) != null) {
                String str = this.LIZ;
                if (!TextUtils.isEmpty(info.getMsgId()) && !TextUtils.isEmpty(info.getDeepLink()) && !TextUtils.equals(str, info.getMsgId())) {
                    i = 1;
                } else {
                    i = 0;
                }
                C54362LVe.LJIJJLI(1000, i);
                C2U8.LIZIZ(new C54251LQx(1000, i));
                if (interfaceC56896MUq != null) {
                    interfaceC56896MUq.LJII(info.getMsgId());
                    interfaceC56896MUq.LIZJ(info.getIcon());
                    interfaceC56896MUq.LJFF(info.getTitle());
                    interfaceC56896MUq.LJIIJ(info.getDesc());
                    interfaceC56896MUq.LJIIIIZZ(info.getButton());
                    interfaceC56896MUq.LJI(info.getDeepLink());
                }
            } else if (interfaceC56896MUq != null) {
                interfaceC56896MUq.LJII("");
                interfaceC56896MUq.LIZJ("");
                interfaceC56896MUq.LJFF("");
                interfaceC56896MUq.LJIIJ("");
                interfaceC56896MUq.LJIIIIZZ("");
                interfaceC56896MUq.LJI("");
            }
        }
        return null;
    }
}
