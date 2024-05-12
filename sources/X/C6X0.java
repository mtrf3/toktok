package X;

import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.musicreplace.handlers.MusicReplaceUploadHandler$handleData$2", f = "MusicReplaceUploadHandler.kt", l = {24}, m = "invokeSuspend")
/* renamed from: X.6X0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6X0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C161896Wz LJLILLLLZI;
    public final /* synthetic */ C158886Lk LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6X0(C161896Wz c161896Wz, C158886Lk c158886Lk, InterfaceC67352kd<? super C6X0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c161896Wz;
        this.LJLJI = c158886Lk;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C6X0(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        final UploadAuthKeyConfig uploadAuthKeyConfig;
        boolean z;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z2 = false;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            StringBuilder LIZIZ = C43881HKb.LIZIZ(obj, "JDW: MusicReplacePipeline: Start ");
            getClass();
            LIZIZ.append(2);
            LIZIZ.append(' ');
            LIZIZ.append(LIZ());
            LIZIZ.append(" time=");
            LIZIZ.append((System.currentTimeMillis() - this.LJLJI.LJI) / 1000);
            H78.LJI(X1D.LIZIZ(LIZIZ));
            C158886Lk c158886Lk = this.LJLJI;
            C166036fP c166036fP = c158886Lk.LJII;
            if (c166036fP == null || (uploadAuthKeyConfig = c166036fP.LIZIZ) == null) {
                return Boolean.FALSE;
            }
            String str = c158886Lk.LJIIIIZZ;
            if (str == null) {
                return Boolean.FALSE;
            }
            this.LJLIL = 1;
            final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || !C44687HgJ.LIZIZ(str)) {
                C3C5.m7constructorimpl("");
                c84654XKg.resumeWith("");
            } else {
                EnumC43889HKj business = EnumC43889HKj.VOICE_REPLACE;
                o.LJIIIZ(business, "business");
                final C43886HKg c43886HKg = new C43886HKg(uploadAuthKeyConfig, business);
                try {
                    c43886HKg.LIZLLL(new HLJ() { // from class: X.6hL
                        @Override // X.HLJ
                        public final void LIZ() {
                        }

                        @Override // X.HLJ
                        public final void LIZJ() {
                        }

                        @Override // X.HLJ
                        public final void LJ() {
                        }

                        @Override // X.HLJ
                        public final int LIZIZ() {
                            UploadVideoConfig uploadVideoConfig = uploadAuthKeyConfig.videoConfig;
                            if (uploadVideoConfig != null) {
                                return b.LIZIZ(uploadVideoConfig, "MusicReplaceUtil.uploadAudioFile");
                            }
                            return -1;
                        }

                        @Override // X.HLJ
                        public final void LIZLLL(int i2, long j, AbstractVideoUploader.VideoUploadInfo videoUploadInfo) {
                            c43886HKg.LIZIZ();
                            String str2 = "";
                            if (i2 == 0) {
                                c43886HKg.LIZ();
                                InterfaceC67352kd<String> interfaceC67352kd = c84654XKg;
                                String mVideoId = videoUploadInfo.getMVideoId();
                                if (mVideoId != null) {
                                    str2 = mVideoId;
                                }
                                C3C5.m7constructorimpl(str2);
                                interfaceC67352kd.resumeWith(str2);
                                return;
                            }
                            c43886HKg.LIZJ();
                            if (i2 != 2) {
                                return;
                            }
                            c43886HKg.LIZ();
                            InterfaceC67352kd<String> interfaceC67352kd2 = c84654XKg;
                            C3C5.m7constructorimpl("");
                            interfaceC67352kd2.resumeWith("");
                        }
                    });
                    c43886HKg.LJ(str);
                    c43886HKg.LJFF();
                } catch (C6X1 unused) {
                    c43886HKg.LIZ();
                    C3C5.m7constructorimpl("");
                    c84654XKg.resumeWith("");
                }
            }
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        String str2 = (String) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JDW: Uploaded audio VID \"");
        LIZ.append(str2);
        LIZ.append('\"');
        H78.LJI(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("JDW: MusicReplacePipeline: End ");
        getClass();
        LIZ2.append(2);
        LIZ2.append(' ');
        LIZ2.append(LIZ());
        LIZ2.append(" time=");
        LIZ2.append((System.currentTimeMillis() - this.LJLJI.LJI) / 1000);
        H78.LJI(X1D.LIZIZ(LIZ2));
        if (str2.length() > 0) {
            z2 = true;
        }
        if (z2) {
            this.LJLJI.LJIIIZ = str2;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
