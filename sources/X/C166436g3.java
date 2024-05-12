package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.UploadAudioHandler$handleData$2", f = "UploadAudioHandler.kt", l = {30}, m = "invokeSuspend")
/* renamed from: X.6g3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166436g3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ C166396fz LJLJJI;
    public final /* synthetic */ C166216fh LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C166436g3(C166396fz c166396fz, C166216fh c166216fh, InterfaceC67352kd<? super C166436g3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c166396fz;
        this.LJLJJL = c166216fh;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C166436g3(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        UploadAuthKeyConfig uploadAuthKeyConfig;
        List<C166116fX> list;
        int i;
        String str;
        int i2;
        C166246fk c166246fk;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i3 = this.LJLJI;
        if (i3 != 0) {
            if (i3 == 1) {
                i = this.LJLILLLLZI;
                list = (List) this.LJLIL;
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            C166396fz c166396fz = this.LJLJJI;
            C166036fP c166036fP = c166396fz.LJII;
            if (c166036fP == null || (uploadAuthKeyConfig = c166036fP.LIZIZ) == null) {
                return Boolean.FALSE;
            }
            list = c166396fz.LJFF;
            if (list != null) {
                i = 0;
                for (C166116fX c166116fX : list) {
                    long LJIIIIZZ = C44687HgJ.LJIIIIZZ(c166116fX.LIZLLL);
                    int i4 = (int) LJIIIIZZ;
                    c166116fX.LJIIJ = i4;
                    if (LJIIIIZZ > i) {
                        i = i4;
                    }
                }
                C166216fh c166216fh = this.LJLJJL;
                AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(this.LJLJJI, 424);
                C166486g8 c166486g8 = new C166486g8(uploadAuthKeyConfig, null);
                this.LJLIL = list;
                this.LJLILLLLZI = i;
                this.LJLJI = 1;
                c166216fh.getClass();
                obj2 = C48841JEv.LJI(new C65352hP(c166216fh, list, aqS168S0100000_2, c166486g8, null), this);
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        ArrayList arrayList = new ArrayList();
        C166216fh c166216fh2 = this.LJLJJL;
        C166396fz c166396fz2 = this.LJLJJI;
        int i5 = 0;
        for (Object obj3 : (List) obj2) {
            int i6 = i5 + 1;
            if (i5 >= 0) {
                C166546gE c166546gE = (C166546gE) obj3;
                C166116fX c166116fX2 = (C166116fX) ORZ.LJLLLLLL(i5, list);
                if (c166116fX2 != null) {
                    if (c166546gE.LIZ) {
                        c166116fX2.LJFF = c166546gE.LIZIZ;
                        arrayList.add(c166116fX2);
                        if (!c166546gE.LIZLLL) {
                            String str2 = c166546gE.LIZIZ;
                            if (str2 != null && (c166246fk = c166396fz2.LJIIIZ) != null) {
                                c166246fk.LJ(c166116fX2, str2);
                            }
                            c166116fX2.LJIIIIZZ = false;
                        } else {
                            c166116fX2.LJIIIIZZ = true;
                        }
                    } else {
                        c166216fh2.getClass();
                        c166116fX2.LJIILIIL = 20;
                        AbstractVideoUploader.VideoUploadInfo videoUploadInfo = c166546gE.LIZJ;
                        if (videoUploadInfo == null || (str = videoUploadInfo.getMExtra()) == null) {
                            str = "";
                        }
                        c166116fX2.LJIIL = str;
                        AbstractVideoUploader.VideoUploadInfo videoUploadInfo2 = c166546gE.LIZJ;
                        if (videoUploadInfo2 != null) {
                            i2 = (int) videoUploadInfo2.getMErrorCode();
                        } else {
                            i2 = 20000;
                        }
                        c166116fX2.LJIIJJI = i2;
                        C166386fy c166386fy = c166396fz2.LJIIJ;
                        c166386fy.LJI = i2;
                        String str3 = c166116fX2.LJIIL;
                        o.LJIIIZ(str3, "<set-?>");
                        c166386fy.LJII = str3;
                    }
                }
                i5 = i6;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        C166386fy c166386fy2 = this.LJLJJI.LJIIJ;
        c166386fy2.LIZLLL = i;
        c166386fy2.LIZ = this.LJLJJL.LIZIZ;
        c166386fy2.LIZIZ = arrayList.size();
        C166386fy c166386fy3 = this.LJLJJI.LJIIJ;
        int i7 = c166386fy3.LIZIZ;
        if (i7 == 0) {
            c166386fy3.LIZJ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        } else {
            c166386fy3.LIZJ = c166386fy3.LIZ / i7;
        }
        if (arrayList.size() == list.size()) {
            this.LJLJJI.LJFF = arrayList;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
