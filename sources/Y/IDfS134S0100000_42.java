package Y;

import X.AEB;
import X.AEG;
import X.AET;
import X.C2068389v;
import X.C25851ACp;
import X.C25860ACy;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C76800UCe;
import X.C93956aZE;
import X.C94302aeo;
import X.C94413agb;
import X.C94734alm;
import X.C94745alx;
import X.C94791amh;
import X.C94919aol;
import X.C94962apS;
import X.C94963apT;
import X.C94968apY;
import X.EnumC58928NAu;
import X.InterfaceC64672gJ;
import X.InterfaceC67352kd;
import X.InterfaceC79150V4o;
import X.ViewOnClickListenerC94035aaV;
import X.XKX;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.effectcreatormobile.objectselect.gif.GifsViewModel;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.TT2DSPPlatformInfo;
import com.ss.android.ugc.aweme.music.app.auth.setting.page.MusicAuthPlatformsSettingPage;
import com.ss.android.ugc.aweme.music.app.auth.setting.page.MusicSettingPage;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS47S0110000_4;
import kotlin.jvm.internal.IDqS423S0100000_42;
import ujb.o;

/* loaded from: classes34.dex */
public class IDfS134S0100000_42 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC64672gJ
    public final Object emit(String str, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, str, interfaceC67352kd);
            case 1:
                return emit$1(this, str, interfaceC67352kd);
            case 2:
                return emit$2(this, str, interfaceC67352kd);
            case 3:
                return emit$3(this, str, interfaceC67352kd);
            case 4:
                return emit$4(this, str, interfaceC67352kd);
            case 5:
                return emit$5(this, str, interfaceC67352kd);
            case 6:
                return emit$6(this, str, interfaceC67352kd);
            case 7:
                return emit$7(this, str, interfaceC67352kd);
            case 8:
                return emit$8(this, str, interfaceC67352kd);
            case 9:
                return emit$9(this, str, interfaceC67352kd);
            case 10:
                return emit$10(this, str, interfaceC67352kd);
            default:
                return null;
        }
    }

    public IDfS134S0100000_42(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object emit$0(IDfS134S0100000_42 iDfS134S0100000_42, Object obj, InterfaceC67352kd interfaceC67352kd) {
        String str = (String) obj;
        if (o.LJJJJJL(str)) {
            ((C94734alm) iDfS134S0100000_42.l0).LJLILLLLZI.vl().gv0();
        } else {
            GifsViewModel vl = ((C94734alm) iDfS134S0100000_42.l0).LJLILLLLZI.vl();
            vl.getClass();
            vl.LJLIL = 0;
            vl.LJLLILLLL = true;
            vl.LJLLI = str;
            XKX.LIZLLL(ViewModelKt.getViewModelScope(vl), null, null, new C94745alx(vl, str, null), 3);
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$1(IDfS134S0100000_42 iDfS134S0100000_42, Object obj, InterfaceC67352kd interfaceC67352kd) {
        ((Boolean) obj).booleanValue();
        ((C94791amh) iDfS134S0100000_42.l0).LJLILLLLZI.getClass();
        return C76800UCe.LIZ;
    }

    public static final Object emit$10(IDfS134S0100000_42 iDfS134S0100000_42, Object obj, InterfaceC67352kd interfaceC67352kd) {
        List list = (List) obj;
        MusicSettingPage musicSettingPage = (MusicSettingPage) iDfS134S0100000_42.l0;
        boolean z = false;
        musicSettingPage.LJLJJI = false;
        C25860ACy Al = musicSettingPage.Al();
        Al.getClass();
        Al.LJIIJ(new AqS47S0110000_4(Al, 10));
        MusicSettingPage musicSettingPage2 = (MusicSettingPage) iDfS134S0100000_42.l0;
        if (list == null || list.isEmpty()) {
            z = true;
        }
        musicSettingPage2.Dl(!z);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [com.ss.android.ugc.aweme.music.model.Music, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r30v2 */
    public static final Object emit$2(IDfS134S0100000_42 iDfS134S0100000_42, Object obj, InterfaceC67352kd interfaceC67352kd) {
        boolean z;
        Integer num;
        C2068389v c2068389v;
        Integer valueOf;
        List<TT2DSPPlatformInfo> list = (List) obj;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ((C73305Spp) ((MusicAuthPlatformsSettingPage) iDfS134S0100000_42.l0)._$_findCachedViewById(R.id.kf_)).setVisibility(8);
            MusicAuthPlatformsSettingPage musicAuthPlatformsSettingPage = (MusicAuthPlatformsSettingPage) iDfS134S0100000_42.l0;
            musicAuthPlatformsSettingPage.Al().LIZJ(musicAuthPlatformsSettingPage.Al().LIZIZ());
            View.OnClickListener onClickListener = 0;
            C2068389v c2068389v2 = null;
            musicAuthPlatformsSettingPage.Al().LIZ(new AEG(new AEB("", false, false, false, true, null, null, null, null, null, null, 16350)));
            for (TT2DSPPlatformInfo tT2DSPPlatformInfo : list) {
                DspPlatform from = DspPlatform.Companion.from(Integer.valueOf(tT2DSPPlatformInfo.getDspPlatform()));
                C25851ACp Al = musicAuthPlatformsSettingPage.Al();
                String title = from.getTitle();
                if (C94302aeo.LJIIIIZZ(onClickListener) == from) {
                    num = Integer.valueOf(R.string.bb1);
                } else {
                    num = onClickListener;
                }
                int i = C93956aZE.LIZ[from.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                valueOf = Integer.valueOf(R.raw.icon_color_spotify);
                            }
                        } else {
                            valueOf = Integer.valueOf(R.raw.icon_color_amazon_music);
                        }
                    } else {
                        valueOf = Integer.valueOf(R.raw.icon_color_apple_music);
                    }
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        c2068389v = new C2068389v();
                        c2068389v.LIZ = intValue;
                        onClickListener = 0;
                        c2068389v2 = null;
                        Al.LIZ(new C94413agb(new C94968apY(tT2DSPPlatformInfo, title, c2068389v, new ViewOnClickListenerC94035aaV(from, musicAuthPlatformsSettingPage, tT2DSPPlatformInfo), from.getEventName(), true, num, AET.NORMAL, false, null, true, false, null)));
                    }
                }
                c2068389v = c2068389v2;
                onClickListener = 0;
                c2068389v2 = null;
                Al.LIZ(new C94413agb(new C94968apY(tT2DSPPlatformInfo, title, c2068389v, new ViewOnClickListenerC94035aaV(from, musicAuthPlatformsSettingPage, tT2DSPPlatformInfo), from.getEventName(), true, num, AET.NORMAL, false, null, true, false, null)));
            }
            musicAuthPlatformsSettingPage.Al().LIZ(new AEG(new AEB("", false, false, true, false, onClickListener, onClickListener, onClickListener, onClickListener, onClickListener, onClickListener, 16366)));
        } else {
            MusicAuthPlatformsSettingPage musicAuthPlatformsSettingPage2 = (MusicAuthPlatformsSettingPage) iDfS134S0100000_42.l0;
            C73305Spp c73305Spp = (C73305Spp) musicAuthPlatformsSettingPage2._$_findCachedViewById(R.id.kf_);
            c73305Spp.setVisibility(0);
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJI(c73306Spq, new IDqS423S0100000_42(musicAuthPlatformsSettingPage2, 161));
            c73305Spp.setStatus(c73306Spq);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$3(Y.IDfS134S0100000_42 r5, java.lang.Object r6, X.InterfaceC67352kd r7) {
        /*
            boolean r0 = r7 instanceof X.C94615ajr
            if (r0 == 0) goto L3f
            r4 = r7
            X.ajr r4 = (X.C94615ajr) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L45
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r1 = r5.l0
            X.2gJ r1 = (X.InterfaceC64672gJ) r1
            boolean r0 = r6 instanceof X.C94060aau
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L20
            r4.LJLILLLLZI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L20
            return r3
        L3f:
            X.ajr r4 = new X.ajr
            r4.<init>(r5, r7)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS134S0100000_42.emit$3(Y.IDfS134S0100000_42, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$4(Y.IDfS134S0100000_42 r8, java.lang.Object r9, X.InterfaceC67352kd r10) {
        /*
            boolean r0 = r10 instanceof X.C94674ako
            if (r0 == 0) goto L7e
            r5 = r10
            X.ako r5 = (X.C94674ako) r5
            int r2 = r5.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r5.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r6 = 1
            if (r0 == 0) goto L23
            if (r0 != r6) goto L84
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r7 = r8.l0
            X.2gJ r7 = (X.InterfaceC64672gJ) r7
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L74
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r10 = r9.iterator()
        L37:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r8 = r10.next()
            r9 = r8
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.TT2DSPPlatformInfo r9 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.TT2DSPPlatformInfo) r9
            int r1 = r9.getDspPlatform()
            com.ss.android.ugc.aweme.music.model.DspPlatform r0 = com.ss.android.ugc.aweme.music.model.DspPlatform.UNKNOWN
            int r0 = r0.getValue()
            if (r1 == r0) goto L37
            boolean r0 = r9.getPlatformSelectedByUser()
            if (r0 != 0) goto L70
        L57:
            com.ss.android.ugc.aweme.music.model.DspPlatform$Companion r2 = com.ss.android.ugc.aweme.music.model.DspPlatform.Companion
            int r1 = r9.getDspPlatform()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            com.ss.android.ugc.aweme.music.model.DspPlatform r1 = r2.from(r0)
            android.content.Context r0 = X.EF7.LIZIZ()
            boolean r0 = X.C94302aeo.LJII(r1, r0)
            if (r0 == 0) goto L37
        L70:
            r3.add(r8)
            goto L37
        L74:
            r3 = 0
        L75:
            r5.LJLILLLLZI = r6
            java.lang.Object r0 = r7.emit(r3, r5)
            if (r0 != r4) goto L20
            return r4
        L7e:
            X.ako r5 = new X.ako
            r5.<init>(r8, r10)
            goto L12
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS134S0100000_42.emit$4(Y.IDfS134S0100000_42, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$5(Y.IDfS134S0100000_42 r8, java.lang.Object r9, X.InterfaceC67352kd r10) {
        /*
            boolean r0 = r10 instanceof X.C94682akw
            if (r0 == 0) goto L53
            r7 = r10
            X.akw r7 = (X.C94682akw) r7
            int r2 = r7.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r7.LJLILLLLZI = r2
        L12:
            java.lang.Object r0 = r7.LJLIL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r7.LJLILLLLZI
            r5 = 0
            r4 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L43
            if (r1 != r4) goto L59
            X.C141335gf.LIZJ(r0)
        L24:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L27:
            X.C141335gf.LIZJ(r0)
            java.lang.Object r2 = r8.l0
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            X.XGX r9 = (X.XGX) r9
            X.UtN r1 = X.C36636EZk.LIZ
            X.ao2 r0 = new X.ao2
            r0.<init>(r9, r5)
            r7.LJLJI = r2
            r7.LJLILLLLZI = r3
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r7)
            if (r0 != r6) goto L48
            return r6
        L43:
            X.2gJ r2 = r7.LJLJI
            X.C141335gf.LIZJ(r0)
        L48:
            r7.LJLJI = r5
            r7.LJLILLLLZI = r4
            java.lang.Object r0 = r2.emit(r0, r7)
            if (r0 != r6) goto L24
            return r6
        L53:
            X.akw r7 = new X.akw
            r7.<init>(r8, r10)
            goto L12
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS134S0100000_42.emit$5(Y.IDfS134S0100000_42, java.lang.Object, X.2kd):java.lang.Object");
    }

    public static final Object emit$6(IDfS134S0100000_42 iDfS134S0100000_42, Object obj, InterfaceC67352kd interfaceC67352kd) {
        ((C94919aol) iDfS134S0100000_42.l0).LJLILLLLZI.Yl("auto");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$7(Y.IDfS134S0100000_42 r5, java.lang.Object r6, X.InterfaceC67352kd r7) {
        /*
            boolean r0 = r7 instanceof X.C94705alJ
            if (r0 == 0) goto L4c
            r4 = r7
            X.alJ r4 = (X.C94705alJ) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L52
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r1 = r5.l0
            X.2gJ r1 = (X.InterfaceC64672gJ) r1
            X.aXB r0 = com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LJI()
            if (r0 == 0) goto L4a
            boolean r0 = r0.LJIIIZ()
            if (r0 != r2) goto L4a
            r0 = 1
        L37:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L20
            r4.LJLILLLLZI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L20
            return r3
        L4a:
            r0 = 0
            goto L37
        L4c:
            X.alJ r4 = new X.alJ
            r4.<init>(r5, r7)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS134S0100000_42.emit$7(Y.IDfS134S0100000_42, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$8(Y.IDfS134S0100000_42 r5, java.lang.Object r6, X.InterfaceC67352kd r7) {
        /*
            boolean r0 = r7 instanceof X.C94712alQ
            if (r0 == 0) goto L39
            r4 = r7
            X.alQ r4 = (X.C94712alQ) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L3f
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r1 = r5.l0
            X.2gJ r1 = (X.InterfaceC64672gJ) r1
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            java.util.List r0 = X.ORY.LJJIJLIJ(r6)
            r4.LJLILLLLZI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L20
            return r3
        L39:
            X.alQ r4 = new X.alQ
            r4.<init>(r5, r7)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS134S0100000_42.emit$8(Y.IDfS134S0100000_42, java.lang.Object, X.2kd):java.lang.Object");
    }

    public static final Object emit$9(IDfS134S0100000_42 iDfS134S0100000_42, Object obj, InterfaceC67352kd interfaceC67352kd) {
        InterfaceC79150V4o launchWhenStarted = LifecycleOwnerKt.getLifecycleScope(((C94963apT) iDfS134S0100000_42.l0).LJLILLLLZI).launchWhenStarted(new C94962apS(null, iDfS134S0100000_42));
        if (launchWhenStarted == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return launchWhenStarted;
        }
        return C76800UCe.LIZ;
    }
}
