package X;

import com.ss.android.ugc.aweme.music.model.DspAuthToken;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.report.model.ExtraData;
import com.ss.android.ugc.aweme.music.report.model.ReportData;
import com.ss.android.ugc.aweme.music.report.model.TT2DspActionInfo;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.AddToMusicDspAuthUtil$updateDspPlatform$1$1$1$1", f = "AddToMusicDspAuthUtil.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.anz, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94871anz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ XGX<C94496ahw> LJLIL;
    public final /* synthetic */ EnumC93896aYG LJLILLLLZI;
    public final /* synthetic */ DspPlatform LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C94871anz(XGX<C94496ahw> xgx, EnumC93896aYG enumC93896aYG, DspPlatform dspPlatform, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C94871anz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = xgx;
        this.LJLILLLLZI = enumC93896aYG;
        this.LJLJI = dspPlatform;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94871anz(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C38306F1q c38306F1q;
        C141335gf.LIZJ(obj);
        XGX<C94496ahw> xgx = this.LJLIL;
        Integer num = null;
        DspAuthToken dspAuthToken = null;
        num = null;
        if (xgx instanceof XGW) {
            int i = C93873aXt.LIZ[this.LJLILLLLZI.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    DspPlatform dspPlatform = this.LJLJI;
                    o.LJIIIZ(dspPlatform, "dspPlatform");
                    C93920aYe.LIZIZ = dspPlatform;
                    if (C51937KZx.LIZ() || C53205KuP.LIZ()) {
                        C93922aYg.LJIIIZ(0);
                        if (C53205KuP.LIZ()) {
                            C94001aZx.LIZ(new ReportData(SWA.AUTH.getValue(), SW7.TT_TO_DSP.getValue(), null, null, null, new ExtraData(new TT2DspActionInfo(new Integer(this.LJLJI.getValue()), new Integer(SWO.UNKNOWN.ordinal()))), 28, null));
                        }
                    }
                }
            } else {
                DspPlatform dspPlatform2 = DspPlatform.UNKNOWN;
                o.LJIIIZ(dspPlatform2, "dspPlatform");
                C93920aYe.LIZIZ = dspPlatform2;
                C94302aeo.LJLJJI = dspPlatform2;
                DspAuthToken dspAuthToken2 = C94302aeo.LJLJL;
                if (dspAuthToken2 != null) {
                    dspAuthToken = DspAuthToken.copy$default(dspAuthToken2, null, null, null, 3, null);
                }
                C94302aeo.LJLJL = dspAuthToken;
                DspPlatform dspPlatform3 = this.LJLJI;
                if (dspPlatform3 == DspPlatform.SPOTIFY) {
                    C93922aYg.LIZ(dspPlatform3);
                }
            }
            if (this.LJLILLLLZI != EnumC93896aYG.SELECT) {
                z = false;
            }
            C2U8.LIZ(new C8UR(z));
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJI;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        } else if (xgx instanceof XGT) {
            C57301MeH c57301MeH = ((XGV) xgx).LIZLLL;
            o.LJII(c57301MeH, "null cannot be cast to non-null type com.bytedance.mota.exception.MotaNetException");
            Throwable e = ((C57300MeG) c57301MeH).getE();
            if ((e instanceof C38333F2r) && (c38306F1q = (C38306F1q) e) != null) {
                num = new Integer(c38306F1q.getErrorCode());
            }
            InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = this.LJLJJL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(num);
            }
        } else {
            InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns2 = this.LJLJJL;
            if (interfaceC88472Yns2 != null) {
                interfaceC88472Yns2.invoke(null);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
