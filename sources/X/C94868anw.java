package X;

import android.app.Activity;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlaylist;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.Arrays;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.AddToMusicDspAuthUtil$selectDspPlaylist$3$1$1$1", f = "AddToMusicDspAuthUtil.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.anw, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94868anw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ XGX<C94492ahs> LJLIL;
    public final /* synthetic */ DspPlatform LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final /* synthetic */ Activity LJLJJLL;
    public final /* synthetic */ DspPlaylist LJLJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94868anw(XGX<C94492ahs> xgx, DspPlatform dspPlatform, boolean z, long j, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Activity activity, DspPlaylist dspPlaylist, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC67352kd<? super C94868anw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = xgx;
        this.LJLILLLLZI = dspPlatform;
        this.LJLJI = z;
        this.LJLJJI = j;
        this.LJLJJL = interfaceC65784Pro;
        this.LJLJJLL = activity;
        this.LJLJL = dspPlaylist;
        this.LJLJLJ = interfaceC65784Pro2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94868anw(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C38306F1q c38306F1q;
        C141335gf.LIZJ(obj);
        XGX<C94492ahs> xgx = this.LJLIL;
        if (!(xgx instanceof XGW)) {
            if (xgx instanceof XGT) {
                C57301MeH c57301MeH = ((XGV) xgx).LIZLLL;
                if (c57301MeH instanceof C57300MeG) {
                    o.LJII(c57301MeH, "null cannot be cast to non-null type com.bytedance.mota.exception.MotaNetException");
                    Throwable e = ((C57300MeG) c57301MeH).getE();
                    Integer num = null;
                    if ((e instanceof C38333F2r) && (c38306F1q = (C38306F1q) e) != null) {
                        num = new Integer(c38306F1q.getErrorCode());
                    }
                    C94302aeo.LJJI(CardStruct.IStatusCode.DEFAULT, String.valueOf(num), "playlist", this.LJLILLLLZI, this.LJLJI, SystemClock.elapsedRealtime() - this.LJLJJI, "1");
                }
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJLJ;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                C26045AKb c26045AKb = new C26045AKb(this.LJLJJLL);
                c26045AKb.LJIIIIZZ(R.string.bam);
                c26045AKb.LJIIJ();
            } else {
                C94302aeo.LJJI(CardStruct.IStatusCode.DEFAULT, "", "playlist", this.LJLILLLLZI, this.LJLJI, SystemClock.elapsedRealtime() - this.LJLJJI, "1");
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJLJLJ;
                if (interfaceC65784Pro2 != null) {
                    interfaceC65784Pro2.invoke();
                }
                C26045AKb c26045AKb2 = new C26045AKb(this.LJLJJLL);
                c26045AKb2.LJIIIIZZ(R.string.bam);
                c26045AKb2.LJIIJ();
            }
        } else {
            C94302aeo.LJJI("1", "", "playlist", this.LJLILLLLZI, this.LJLJI, SystemClock.elapsedRealtime() - this.LJLJJI, "1");
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = this.LJLJJL;
            if (interfaceC65784Pro3 != null) {
                interfaceC65784Pro3.invoke();
            }
            C26045AKb c26045AKb3 = new C26045AKb(this.LJLJJLL);
            String string = this.LJLJJLL.getString(R.string.bao);
            o.LJIIIIZZ(string, "activity.getString(R.str…icToDSP_fyp_successToast)");
            Object[] objArr = new Object[1];
            String name = this.LJLJL.getName();
            if (name == null) {
                name = "";
            }
            objArr[0] = name;
            String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(objArr, 1));
            o.LJIIIIZZ(LLLZ, "format(this, *args)");
            c26045AKb3.LJIIIZ(LLLZ);
            c26045AKb3.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb3.LJII(R.attr.e8);
            c26045AKb3.LJIIJ();
        }
        return C76800UCe.LIZ;
    }
}
