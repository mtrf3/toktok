package X;

import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import com.ss.bduploader.BDExternalFileReader;
import fjb.a;
import java.io.File;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.PrepareParamsAndUploadHandler$handleData$2$uploadDeferred$1", f = "PrepareParamsAndUploadHandler.kt", l = {109}, m = "invokeSuspend")
/* renamed from: X.6hC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167146hC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C166546gE>, Object> {
    public int LJLIL;
    public final /* synthetic */ UploadAuthKeyConfig LJLILLLLZI;
    public final /* synthetic */ IAudioExtractUpload LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C167146hC(UploadAuthKeyConfig uploadAuthKeyConfig, IAudioExtractUpload iAudioExtractUpload, String str, InterfaceC67352kd<? super C167146hC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = uploadAuthKeyConfig;
        this.LJLJI = iAudioExtractUpload;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C167146hC(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.6hQ] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            final UploadAuthKeyConfig config = this.LJLILLLLZI;
            final IAudioExtractUpload uploadStrategy = this.LJLJI;
            o.LJIIIIZZ(uploadStrategy, "uploadStrategy");
            final String str = this.LJLJJI;
            final ?? r3 = new InterfaceC167306hS(uploadStrategy, str) { // from class: X.6hQ
                public final IAudioExtractUpload LIZ;
                public final File LIZIZ;

                @Override // X.InterfaceC167306hS
                public final void cancel() {
                }

                @Override // X.InterfaceC167306hS
                public final long getValue(int i2) {
                    if (i2 == 0) {
                        if (this.LIZ.isProduceFinish()) {
                            return this.LIZIZ.length();
                        }
                    } else if (i2 == 2) {
                        try {
                            return this.LIZ.getHeaderSize();
                        } catch (RuntimeException unused) {
                        }
                    }
                    return -1L;
                }

                {
                    o.LJIIIZ(str, "filePath");
                    this.LIZ = uploadStrategy;
                    this.LIZIZ = new File(str);
                }

                @Override // X.InterfaceC167306hS
                public final long getCrc32ByOffset(long j, int i2) {
                    return this.LIZ.getCrc32ByOffset(j, i2);
                }

                @Override // X.InterfaceC167306hS
                public final int readSlice(int i2, byte[] bArr, int i3) {
                    try {
                        IAudioExtractUpload iAudioExtractUpload = this.LIZ;
                        if (bArr == null) {
                            bArr = new byte[0];
                        }
                        return iAudioExtractUpload.consume(i2, bArr, i3);
                    } catch (RuntimeException unused) {
                        return -1;
                    }
                }

                @Override // X.InterfaceC167306hS
                public final int readSliceByOffset(long j, byte[] bArr, int i2, int i3) {
                    try {
                        return this.LIZ.streamConsume(j, bArr, i2, i3);
                    } catch (RuntimeException unused) {
                        return -1;
                    }
                }
            };
            final IAudioExtractUpload uploadStrategy2 = this.LJLJI;
            o.LJIIIIZZ(uploadStrategy2, "uploadStrategy");
            final String str2 = this.LJLJJI;
            this.LJLIL = 1;
            final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            EnumC43889HKj business = EnumC43889HKj.VOICE_CONVERSION;
            o.LJIIIZ(config, "config");
            o.LJIIIZ(business, "business");
            final C43892HKm c43892HKm = new C43892HKm(config, business);
            final C68322mC c68322mC = new C68322mC();
            try {
                c43892HKm.LIZ.setExternFileReader(new BDExternalFileReader() { // from class: X.6hR
                    @Override // com.ss.bduploader.BDExternalFileReader
                    public final void cancel() {
                        r3.cancel();
                    }

                    @Override // com.ss.bduploader.BDExternalFileReader
                    public final long getValue(int i2) {
                        return r3.getValue(i2);
                    }

                    @Override // com.ss.bduploader.BDExternalFileReader
                    public final long getCrc32ByOffset(long j, int i2) {
                        return r3.getCrc32ByOffset(j, i2);
                    }

                    @Override // com.ss.bduploader.BDExternalFileReader
                    public final int readSlice(int i2, byte[] bArr, int i3) {
                        return r3.readSlice(i2, bArr, i3);
                    }

                    @Override // com.ss.bduploader.BDExternalFileReader
                    public final int readSliceByOffset(long j, byte[] bArr, int i2, int i3) {
                        return r3.readSliceByOffset(j, bArr, i2, i3);
                    }
                });
                c43892HKm.LIZLLL(new HLJ(c43892HKm, c68322mC, uploadStrategy2, c84654XKg, str2, config) { // from class: X.6hJ
                    public final /* synthetic */ AbstractVideoUploader LIZ;
                    public final /* synthetic */ C68322mC<String> LIZIZ;
                    public final /* synthetic */ IAudioExtractUpload LIZJ;
                    public final /* synthetic */ InterfaceC67352kd<C166546gE> LIZLLL;
                    public final /* synthetic */ UploadAuthKeyConfig LJ;

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
                        UploadVideoConfig uploadVideoConfig = this.LJ.videoConfig;
                        if (uploadVideoConfig != null) {
                            return b.LIZIZ(uploadVideoConfig, "voice_conversion");
                        }
                        return -1;
                    }

                    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
                    @Override // X.HLJ
                    public final void LIZLLL(int i2, long j, AbstractVideoUploader.VideoUploadInfo videoUploadInfo) {
                        this.LIZ.LIZIZ();
                        if (i2 == 0) {
                            this.LIZIZ.element = videoUploadInfo.getMVideoId();
                            this.LIZ.LIZ();
                            this.LIZJ.disableDeleteCacheWhenEnd(true);
                            this.LIZJ.stopUpload(true);
                            InterfaceC67352kd<C166546gE> interfaceC67352kd = this.LIZLLL;
                            C166546gE c166546gE = new C166546gE();
                            C68322mC<String> c68322mC2 = this.LIZIZ;
                            c166546gE.LIZ = true;
                            c166546gE.LIZIZ = c68322mC2.element;
                            c166546gE.LIZJ = null;
                            C3C5.m7constructorimpl(c166546gE);
                            interfaceC67352kd.resumeWith(c166546gE);
                            return;
                        }
                        this.LIZ.LIZJ();
                        if (i2 != 2) {
                            return;
                        }
                        this.LIZ.LIZ();
                        this.LIZJ.disableDeleteCacheWhenEnd(true);
                        this.LIZJ.stopUpload(false);
                        InterfaceC67352kd<C166546gE> interfaceC67352kd2 = this.LIZLLL;
                        C166546gE c166546gE2 = new C166546gE();
                        c166546gE2.LIZJ = videoUploadInfo;
                        C3C5.m7constructorimpl(c166546gE2);
                        interfaceC67352kd2.resumeWith(c166546gE2);
                    }

                    {
                        this.LJ = config;
                    }
                });
                c43892HKm.LJFF();
            } catch (RuntimeException unused) {
                c43892HKm.LIZ();
                C166546gE c166546gE = new C166546gE();
                C3C5.m7constructorimpl(c166546gE);
                c84654XKg.resumeWith(c166546gE);
            }
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C166546gE> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
