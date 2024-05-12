package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFSocialAssem;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.main.assems.mainfragment.MFSocialAssem$onViewCreated$4", f = "MFSocialAssem.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class LMS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ MFSocialAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LMS(MFSocialAssem mFSocialAssem, InterfaceC67352kd<? super LMS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = mFSocialAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new LMS(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Bundle arguments;
        C141335gf.LIZJ(obj);
        MFSocialAssem mFSocialAssem = this.LJLIL;
        mFSocialAssem.getClass();
        Fragment LIZLLL = C212428Vi.LIZLLL(mFSocialAssem);
        String str = null;
        if (LIZLLL != null && (arguments = LIZLLL.getArguments()) != null) {
            int i = arguments.getInt("tab", -1);
            ActivityC45651qj LIZ = C212428Vi.LIZ(mFSocialAssem);
            if (LIZ != null && i >= 0) {
                LGE.Companion.getClass();
                LGE LIZ2 = LGF.LIZ(i);
                if (LIZ2 != null) {
                    if (LIZ2 == LGE.FOLLOW) {
                        LMU lmu = new LMU();
                        if (LIZ instanceof MainActivity) {
                            LMU lmu2 = C3SZ.LIZ(LIZ).LJLIL;
                            String str2 = lmu2.LIZIZ;
                            lmu2.LIZIZ = null;
                            lmu.LIZIZ = str2;
                            String str3 = lmu2.LIZJ;
                            lmu2.LIZJ = null;
                            lmu.LIZJ = str3;
                            String str4 = lmu2.LIZLLL;
                            lmu2.LIZLLL = null;
                            lmu.LIZLLL = str4;
                            String str5 = lmu2.LJ;
                            lmu2.LJ = null;
                            lmu.LJ = str5;
                            String str6 = lmu2.LJFF;
                            lmu2.LJFF = null;
                            lmu.LJFF = str6;
                            lmu.LIZ = lmu2.LIZ;
                        }
                        lmu.LJI = true;
                        mFSocialAssem.LJLILLLLZI = lmu;
                        if (!((RBX) HG3.LJIILL()).isLogin()) {
                            Intent intent = LIZ.getIntent();
                            if (intent != null) {
                                str = C16880lQ.LLJJIJIIJIL(intent, "gd_label");
                            }
                            mFSocialAssem.vt(str);
                        }
                    }
                    ActivityC45651qj LIZ3 = C212428Vi.LIZ(mFSocialAssem);
                    if (LIZ3 != null) {
                        List<InterfaceC54080LKi> pU = LNZ.LIZIZ.getHomeTabViewModel(LIZ3).pU();
                        int size = pU.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                break;
                            }
                            InterfaceC54080LKi interfaceC54080LKi = (InterfaceC54080LKi) ListProtector.get(pU, i2);
                            if ((interfaceC54080LKi instanceof InterfaceC53909LDt) && ((InterfaceC53909LDt) interfaceC54080LKi).LJI() == LIZ2) {
                                if (i2 >= 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("fromStart", "MainFragment");
                                    com.bytedance.hox.Hox.LJLLI.LIZ(LIZ).Bv0(i2, bundle);
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
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
