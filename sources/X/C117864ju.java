package X;

import com.ss.android.ugc.aweme.services.dm.DMPath;
import com.ss.android.ugc.aweme.services.dm.DMPublishService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4ju, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117864ju extends AbstractC65781Prl implements InterfaceC88471Ynr<C63120Opw, C109544Rq, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C68322mC<C117844js> LJLILLLLZI;
    public final /* synthetic */ BaseShortVideoContext LJLJI;
    public final /* synthetic */ C117994k7 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C117864ju(boolean z, C68322mC<C117844js> c68322mC, BaseShortVideoContext baseShortVideoContext, C117994k7 c117994k7) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = baseShortVideoContext;
        this.LJLJJI = c117994k7;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(C63120Opw c63120Opw, C109544Rq c109544Rq) {
        final C109544Rq c109544Rq2 = c109544Rq;
        if (c109544Rq2 != null) {
            boolean z = this.LJLIL;
            final C68322mC<C117844js> c68322mC = this.LJLILLLLZI;
            BaseShortVideoContext baseShortVideoContext = this.LJLJI;
            final C117994k7 c117994k7 = this.LJLJJI;
            if (!z) {
                String uuid = c109544Rq2.getUuid();
                o.LJIIIIZZ(uuid, "msg.uuid");
                C117874jv.LJII(uuid, c68322mC.element, false);
            } else if (baseShortVideoContext != null) {
                String creationId = baseShortVideoContext.getCreationId();
                o.LJIIIIZZ(creationId, "editModel.creationId");
                DMPath dMPath = new DMPath(creationId);
                String uuid2 = c109544Rq2.getUuid();
                o.LJIIIIZZ(uuid2, "msg.uuid");
                dMPath.genCreativeMsgResourceDirPath(uuid2, true);
                String uuid3 = c109544Rq2.getUuid();
                o.LJIIIIZZ(uuid3, "msg.uuid");
                PublishModel LIZLLL = C117874jv.LIZLLL(baseShortVideoContext);
                DMPublishService dMPublishService = DMPublishService.INSTANCE;
                String publishDMMedia = dMPublishService.publishDMMedia(LIZLLL);
                C41769GaL LIZJ = C117874jv.LIZJ(uuid3, publishDMMedia);
                dMPublishService.addPublishCallback(publishDMMedia, LIZJ);
                C117874jv.LIZ.put(uuid3, LIZJ);
            }
            String uuid4 = c109544Rq2.getUuid();
            o.LJIIIIZZ(uuid4, "msg.uuid");
            C117874jv.LIZ(new InterfaceC41771GaN() { // from class: X.4jy
                @Override // X.InterfaceC41771GaN
                public final void onProgress(int i) {
                }

                @Override // X.InterfaceC41771GaN
                public final void LIZ(C118004k8 result) {
                    o.LJIIIZ(result, "result");
                    C109544Rq c109544Rq3 = C109544Rq.this;
                    C68322mC<C117844js> c68322mC2 = c68322mC;
                    C117714jf.LJ(c109544Rq3, c68322mC2.element, result, this, c117994k7, new AqS167S0100000_1(c68322mC2, (C68322mC<C117814jp>) 245));
                }

                @Override // X.InterfaceC41771GaN
                public final void LIZIZ(String str) {
                    C109544Rq c109544Rq3 = C109544Rq.this;
                    C68322mC<C117844js> c68322mC2 = c68322mC;
                    C117714jf.LIZIZ(c109544Rq3, str, c68322mC2.element, new AqS167S0100000_1(c68322mC2, (C68322mC<C117814jp>) 243));
                }

                @Override // X.InterfaceC41771GaN
                public final void LIZJ(C117914jz c117914jz) {
                    C109544Rq c109544Rq3 = C109544Rq.this;
                    C68322mC<C117844js> c68322mC2 = c68322mC;
                    C117714jf.LIZJ(c109544Rq3, c117914jz, c68322mC2.element, new AqS167S0100000_1(c68322mC2, (C68322mC<C117814jp>) 244));
                }

                @Override // X.InterfaceC41771GaN
                public final void onFailed(String errMsg) {
                    o.LJIIIZ(errMsg, "errMsg");
                    C117714jf.LIZLLL(C109544Rq.this, this, c117994k7);
                }
            }, uuid4);
        }
        return C76800UCe.LIZ;
    }
}
