package X;

import android.app.Activity;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.SpotifyAccessTokenResponse;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;
import com.ss.android.ugc.aweme.music.model.DspAuthToken;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.SpotifyMusicToken;
import com.ss.android.ugc.aweme.music.report.model.ExtraData;
import com.ss.android.ugc.aweme.music.report.model.ReportData;
import com.ss.android.ugc.aweme.music.report.model.TT2DspActionInfo;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.AddToMusicDspAuthUtil$onActivityResultFromSpotifyAuth$6$1$1$1", f = "AddToMusicDspAuthUtil.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.ao7, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94879ao7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ XGX<C94484ahk> LJLIL;
    public final /* synthetic */ Fragment LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94879ao7(XGX<C94484ahk> xgx, Fragment fragment, Activity activity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C94879ao7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = xgx;
        this.LJLILLLLZI = fragment;
        this.LJLJI = activity;
        this.LJLJJI = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94879ao7(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        C38306F1q c38306F1q;
        Long l;
        String str;
        String str2;
        Long l2;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        C141335gf.LIZJ(obj);
        XGX<C94484ahk> xgx = this.LJLIL;
        String str3 = "";
        Long l3 = null;
        if (xgx instanceof XGW) {
            C94302aeo.LJLJI = ((RBX) HG3.LJIILL()).getCurSecUserId();
            DspPlatform dspPlatform = DspPlatform.SPOTIFY;
            C94302aeo.LJLJJI = dspPlatform;
            if (C78977Uz7.LJJJJI(this.LJLIL.LIZJ) == EnumC78982UzC.Optimistic) {
                C9A8 c9a8 = C94302aeo.LJLLILLLL;
                if (c9a8 != null) {
                    int i = C93875aXv.LIZ[c9a8.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3 && (interfaceC65784Pro = this.LJLJJI) != null) {
                                interfaceC65784Pro.invoke();
                            }
                        } else {
                            if (C51937KZx.LIZ() || C53205KuP.LIZ()) {
                                C93922aYg.LJIIIZ(0);
                            }
                            C94302aeo.LIZIZ(C94302aeo.LJLIL, new DspAuthParam(dspPlatform, this.LJLILLLLZI, null, C94302aeo.LJLLL, C94302aeo.LJLLLL, C94302aeo.LJLLJ, C94302aeo.LJLLLLLL, C94302aeo.LJLZ, C94302aeo.LJZ, C94302aeo.LJLLI), this.LJLJI, true, false, 56);
                        }
                    } else {
                        if (C51937KZx.LIZ() || C53205KuP.LIZ()) {
                            C93922aYg.LJIIIZ(0);
                        }
                        C2U8.LIZ(new C8UI());
                        ASQ.LJ(this.LJLILLLLZI, ASX.LIZ);
                    }
                }
            } else {
                if (C94302aeo.LJLLILLLL != C9A8.ENTER_FROM_SETTINGS) {
                    if (C53205KuP.LIZ()) {
                        int value = SWA.AUTH.getValue();
                        int value2 = SW7.TT_TO_DSP.getValue();
                        Integer num2 = new Integer(dspPlatform.getValue());
                        SWN swn = SWO.Companion;
                        String str4 = C94302aeo.LJZ;
                        swn.getClass();
                        C94001aZx.LIZ(new ReportData(value, value2, null, null, null, new ExtraData(new TT2DspActionInfo(num2, new Integer(SWN.LIZ(str4).ordinal()))), 28, null));
                    }
                    C94302aeo c94302aeo = C94302aeo.LJLIL;
                    Long l4 = C94302aeo.LJLJLLL;
                    C94302aeo.LJLJLLL = null;
                    if (l4 != null) {
                        l2 = new Long(SystemClock.elapsedRealtime() - l4.longValue());
                    } else {
                        l2 = null;
                    }
                    C94302aeo.LJJIII(c94302aeo, "1", "", dspPlatform, l2, Boolean.TRUE, true, "", C94302aeo.LJLLLL, C94302aeo.LJZ);
                } else {
                    Long l5 = C94302aeo.LJLJLLL;
                    C94302aeo.LJLJLLL = null;
                    if (l5 != null) {
                        l = new Long(SystemClock.elapsedRealtime() - l5.longValue());
                    } else {
                        l = null;
                    }
                    C94302aeo.LJLL = l;
                }
                D d = ((XGW) this.LJLIL).LJ;
                SpotifyAccessTokenResponse spotifyAccessTokenResponse = ((C94484ahk) d).LIZ;
                if (spotifyAccessTokenResponse == null || (str = spotifyAccessTokenResponse.accessToken) == null) {
                    str = "";
                }
                SpotifyAccessTokenResponse spotifyAccessTokenResponse2 = ((C94484ahk) d).LIZ;
                if (spotifyAccessTokenResponse2 != null && (str2 = spotifyAccessTokenResponse2.refreshToken) != null) {
                    str3 = str2;
                }
                C93922aYg.LJIIJ(dspPlatform);
                C93922aYg.LJIIJJI(str, dspPlatform);
                C93922aYg.LJIIL(str3, dspPlatform);
                C94302aeo.LJLJL = new DspAuthToken(null, null, new SpotifyMusicToken(str));
                C94302aeo.LIZIZ(C94302aeo.LJLIL, new DspAuthParam(dspPlatform, this.LJLILLLLZI, null, C94302aeo.LJLLL, C94302aeo.LJLLLL, C94302aeo.LJLLJ, C94302aeo.LJLLLLLL, C94302aeo.LJLZ, C94302aeo.LJZ, C94302aeo.LJLLI), this.LJLJI, true, true, 40);
            }
        } else {
            String str5 = "link";
            if (xgx instanceof XGT) {
                C57301MeH c57301MeH = ((XGV) xgx).LIZLLL;
                if (c57301MeH instanceof C57300MeG) {
                    o.LJII(c57301MeH, "null cannot be cast to non-null type com.bytedance.mota.exception.MotaNetException");
                    Throwable e = ((C57300MeG) c57301MeH).getE();
                    if ((e instanceof C38333F2r) && (c38306F1q = (C38306F1q) e) != null) {
                        num = new Integer(c38306F1q.getErrorCode());
                    } else {
                        num = null;
                    }
                    C94302aeo c94302aeo2 = C94302aeo.LJLIL;
                    String valueOf = String.valueOf(num);
                    DspPlatform dspPlatform2 = DspPlatform.SPOTIFY;
                    Long l6 = C94302aeo.LJLJLLL;
                    C94302aeo.LJLJLLL = null;
                    if (l6 != null) {
                        l3 = new Long(SystemClock.elapsedRealtime() - l6.longValue());
                    }
                    Boolean bool = Boolean.FALSE;
                    if (C94302aeo.LJLLILLLL != C9A8.ENTER_FROM_SETTINGS) {
                        str5 = "";
                    }
                    C94302aeo.LJJIII(c94302aeo2, CardStruct.IStatusCode.DEFAULT, valueOf, dspPlatform2, l3, bool, true, str5, C94302aeo.LJLLLL, C94302aeo.LJZ);
                }
                C26045AKb c26045AKb = new C26045AKb(this.LJLJI);
                c26045AKb.LJIIIIZZ(R.string.dtj);
                c26045AKb.LJIIJ();
            } else {
                C94302aeo c94302aeo3 = C94302aeo.LJLIL;
                DspPlatform dspPlatform3 = DspPlatform.SPOTIFY;
                Long l7 = C94302aeo.LJLJLLL;
                C94302aeo.LJLJLLL = null;
                if (l7 != null) {
                    l3 = new Long(SystemClock.elapsedRealtime() - l7.longValue());
                }
                Boolean bool2 = Boolean.FALSE;
                if (C94302aeo.LJLLILLLL != C9A8.ENTER_FROM_SETTINGS) {
                    str5 = "";
                }
                C94302aeo.LJJIII(c94302aeo3, CardStruct.IStatusCode.DEFAULT, "", dspPlatform3, l3, bool2, true, str5, C94302aeo.LJLLLL, C94302aeo.LJZ);
                C26045AKb c26045AKb2 = new C26045AKb(this.LJLJI);
                c26045AKb2.LJIIIIZZ(R.string.dtj);
                c26045AKb2.LJIIJ();
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
