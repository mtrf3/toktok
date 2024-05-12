package X;

import Y.IDcS364S0100000_1;
import com.ss.android.vesdk.VEUtils;
import fjb.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.sender.VideoMsgSender$retrySendMessage$1", f = "VideoMsgSender.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4ji, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117744ji extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C109544Rq LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C117744ji(C109544Rq c109544Rq, InterfaceC67352kd<? super C117744ji> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c109544Rq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C117744ji(this.LJLIL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, X.4js] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C117824jq c117824jq;
        C117824jq c117824jq2;
        C141335gf.LIZJ(obj);
        final C117994k7 c117994k7 = new C117994k7(System.currentTimeMillis(), false, false, EnumC117974k5.VIDEO, 0, true, 40);
        List<C117824jq> attachments = this.LJLIL.getAttachments();
        if (attachments != null) {
            Iterator<C117824jq> it = attachments.iterator();
            while (true) {
                c117824jq = null;
                if (it.hasNext()) {
                    c117824jq2 = it.next();
                    if (c117824jq2.getIndex() == 0) {
                        break;
                    }
                } else {
                    c117824jq2 = null;
                    break;
                }
            }
            C117824jq c117824jq3 = c117824jq2;
            if (c117824jq3 != null) {
                final C109544Rq c109544Rq = this.LJLIL;
                int uploadState = c117824jq3.getUploadState();
                if (uploadState == EnumC117804jo.UPLOADED.getState()) {
                    List<C117824jq> attachments2 = c109544Rq.getAttachments();
                    if (attachments2 != null) {
                        Iterator<C117824jq> it2 = attachments2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C117824jq next = it2.next();
                            if (next.getIndex() == 2) {
                                c117824jq = next;
                                break;
                            }
                        }
                        C117824jq c117824jq4 = c117824jq;
                        if (c117824jq4 != null) {
                            String vid = c117824jq4.getVid();
                            if (vid == null) {
                                return C76800UCe.LIZ;
                            }
                            int originalWidth = c117824jq4.getOriginalWidth();
                            int originalHeight = c117824jq4.getOriginalHeight();
                            c109544Rq.setScene("private_video");
                            c109544Rq.setContentPB(C117714jf.LIZ(originalWidth, originalHeight, vid).encode());
                            C106674Gp.LJIIL(new IDcS364S0100000_1(C117994k7.LIZ(c117994k7, EnumC117794jn.UPLOADED), 7), c109544Rq);
                        }
                    }
                } else if (uploadState == EnumC117804jo.SYNTHESISED.getState()) {
                    if (c117824jq3.getLocalPath() == null) {
                        return C76800UCe.LIZ;
                    }
                    final C117844js c117844js = new C117844js(c117824jq3.getLocalPath(), null, c117824jq3.getOriginalWidth(), c117824jq3.getOriginalHeight(), VEUtils.getVideoFileInfo(c117824jq3.getLocalPath()), 78);
                    String uuid = c109544Rq.getUuid();
                    o.LJIIIIZZ(uuid, "msg.uuid");
                    C117874jv.LJII(uuid, c117844js, true);
                    String uuid2 = c109544Rq.getUuid();
                    o.LJIIIIZZ(uuid2, "msg.uuid");
                    C117874jv.LIZ(new InterfaceC41771GaN() { // from class: X.4jk
                        @Override // X.InterfaceC41771GaN
                        public final void LIZIZ(String str) {
                        }

                        @Override // X.InterfaceC41771GaN
                        public final void LIZJ(C117914jz c117914jz) {
                        }

                        @Override // X.InterfaceC41771GaN
                        public final void onProgress(int i) {
                        }

                        @Override // X.InterfaceC41771GaN
                        public final void LIZ(C118004k8 result) {
                            o.LJIIIZ(result, "result");
                            C117714jf.LJ(c109544Rq, c117844js, result, this, C117994k7.LIZ(c117994k7, EnumC117794jn.SYNTHESISED), null);
                        }

                        @Override // X.InterfaceC41771GaN
                        public final void onFailed(String errMsg) {
                            o.LJIIIZ(errMsg, "errMsg");
                            C117714jf.LIZLLL(c109544Rq, this, C117994k7.LIZ(c117994k7, EnumC117794jn.SYNTHESISED));
                        }
                    }, uuid2);
                } else {
                    String localPath = c117824jq3.getLocalPath();
                    if (localPath == null) {
                        return C76800UCe.LIZ;
                    }
                    final C68322mC c68322mC = new C68322mC();
                    c68322mC.element = new C117844js(localPath, null, c117824jq3.getOriginalWidth(), c117824jq3.getOriginalHeight(), VEUtils.getVideoFileInfo(localPath), 78);
                    String uuid3 = c109544Rq.getUuid();
                    o.LJIIIIZZ(uuid3, "msg.uuid");
                    C117874jv.LJII(uuid3, (C117844js) c68322mC.element, false);
                    String uuid4 = c109544Rq.getUuid();
                    o.LJIIIIZZ(uuid4, "msg.uuid");
                    C117874jv.LIZ(new InterfaceC41771GaN() { // from class: X.4jl
                        @Override // X.InterfaceC41771GaN
                        public final void onProgress(int i) {
                        }

                        @Override // X.InterfaceC41771GaN
                        public final void LIZ(C118004k8 result) {
                            o.LJIIIZ(result, "result");
                            C117714jf.LJ(c109544Rq, c68322mC.element, result, this, C117994k7.LIZ(c117994k7, EnumC117794jn.DEFAULT), new AqS167S0100000_1(c68322mC, (C68322mC<C117814jp>) 242));
                        }

                        @Override // X.InterfaceC41771GaN
                        public final void LIZIZ(String str) {
                            C109544Rq c109544Rq2 = c109544Rq;
                            C68322mC<C117844js> c68322mC2 = c68322mC;
                            C117714jf.LIZIZ(c109544Rq2, str, c68322mC2.element, new AqS167S0100000_1(c68322mC2, (C68322mC<C117814jp>) 240));
                        }

                        @Override // X.InterfaceC41771GaN
                        public final void LIZJ(C117914jz c117914jz) {
                            C109544Rq c109544Rq2 = c109544Rq;
                            C68322mC<C117844js> c68322mC2 = c68322mC;
                            C117714jf.LIZJ(c109544Rq2, c117914jz, c68322mC2.element, new AqS167S0100000_1(c68322mC2, (C68322mC<C117814jp>) 241));
                        }

                        @Override // X.InterfaceC41771GaN
                        public final void onFailed(String errMsg) {
                            o.LJIIIZ(errMsg, "errMsg");
                            C117714jf.LIZLLL(c109544Rq, this, C117994k7.LIZ(c117994k7, EnumC117794jn.DEFAULT));
                        }
                    }, uuid4);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
