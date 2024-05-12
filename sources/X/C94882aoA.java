package X;

import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.SongCheckResponse;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import fjb.a;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.AddToMusicDspAuthUtil$songCheckForDsp$1$1$1$1", f = "AddToMusicDspAuthUtil.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aoA, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94882aoA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ XGX<C94494ahu> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ DspPlatform LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94882aoA(XGX<C94494ahu> xgx, String str, DspPlatform dspPlatform, boolean z, InterfaceC67352kd<? super C94882aoA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = xgx;
        this.LJLILLLLZI = str;
        this.LJLJI = dspPlatform;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94882aoA(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        C141335gf.LIZJ(obj);
        XGX<C94494ahu> xgx = this.LJLIL;
        if (xgx instanceof XGW) {
            HashMap<String, Boolean> hashMap = C94302aeo.LJZL;
            String str2 = this.LJLILLLLZI;
            SongCheckResponse songCheckResponse = ((C94494ahu) ((XGW) xgx).LJ).LIZ;
            if (songCheckResponse != null && songCheckResponse.available) {
                z = true;
            } else {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
            DspPlatform dspPlatform = this.LJLJI;
            SongCheckResponse songCheckResponse2 = ((C94494ahu) ((XGW) this.LJLIL).LJ).LIZ;
            if (songCheckResponse2 != null) {
                str = songCheckResponse2.region;
            } else {
                str = null;
            }
            o.LJIIIZ(dspPlatform, "dspPlatform");
            if (str != null && str.length() != 0 && C93921aYf.LIZ[dspPlatform.ordinal()] == 1) {
                C93922aYg.LJFF = str;
                C93922aYg.LIZ.storeString("apple_music_account_region", str);
            }
            if (!this.LJLJJI) {
                HashSet<String> hashSet = C94302aeo.LLD;
                if (!hashSet.contains(this.LJLILLLLZI)) {
                    hashSet.add(this.LJLILLLLZI);
                    C2U8.LIZ(new SU3(this.LJLILLLLZI));
                }
            }
        } else if ((xgx instanceof XGT) && (((XGV) xgx).LIZLLL instanceof C57300MeG)) {
            C94302aeo c94302aeo = C94302aeo.LJLIL;
            DspAuthParam dspAuthParam = new DspAuthParam(this.LJLJI, null, null, C94302aeo.LJLLL, C94302aeo.LJLLLL, C94302aeo.LJLLJ, C94302aeo.LJLLLLLL, C94302aeo.LJLZ, C94302aeo.LJZ, false);
            C57301MeH c57301MeH = ((XGV) this.LJLIL).LIZLLL;
            o.LJII(c57301MeH, "null cannot be cast to non-null type com.bytedance.mota.exception.MotaNetException");
            c94302aeo.LJIIL(dspAuthParam, (C57300MeG) c57301MeH, false);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
