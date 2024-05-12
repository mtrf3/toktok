package kotlin.jvm.internal;

import X.ARN;
import X.AbstractC65781Prl;
import X.C17J;
import X.C60789NtR;
import X.C61259O2l;
import X.C61295O3v;
import X.C61593OFh;
import X.C62313Ocv;
import X.C68322mC;
import X.C76732zl;
import X.C76800UCe;
import X.EnumC61256O2i;
import X.InterfaceC62225ObV;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.NU4;
import X.O18;
import X.O39;
import X.OYP;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdAceSurveyBottomBarAssem;
import com.ss.android.ugc.aweme.commercialize.assem.AdLightWebPageAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.relation.auth.widget.ext.InviteFriendsSharePackageV2;
import com.ss.android.ugc.aweme.relation.share.InviteFriendsPageSharePackage;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import java.io.File;

/* loaded from: classes11.dex */
public class AqS32S1300000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(ARN it) {
        o.LJIIIZ(it, "it");
        Runnable runnable = (Runnable) ((C68322mC) this.l1).element;
        if (runnable != null) {
            runnable.run();
        }
        ((NetworkStandardUIServiceImpl) this.l3).onEvent(((C76732zl) this.l2).element, this.s0, "accept");
    }

    public static final Object invoke$0(AqS32S1300000_10 aqS32S1300000_10, Object obj) {
        C61593OFh setInteractionWithButton = (C61593OFh) obj;
        o.LJIIIZ(setInteractionWithButton, "$this$setInteractionWithButton");
        C61593OFh.LIZJ(setInteractionWithButton, aqS32S1300000_10.s0, new AqS114S0300000_10((AdAceSurveyBottomBarAssem) aqS32S1300000_10.l1, (Aweme) aqS32S1300000_10.l2, (VideoItemParams) aqS32S1300000_10.l3, 2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS32S1300000_10 aqS32S1300000_10, Object obj) {
        Context context;
        NU4 fill = (NU4) obj;
        o.LJIIIZ(fill, "$this$fill");
        String str = aqS32S1300000_10.s0;
        if (str != null) {
            fill.LIZ = str;
        }
        Fragment fragment = (Fragment) aqS32S1300000_10.l1;
        fill.LIZIZ = fragment;
        Aweme aweme = (Aweme) aqS32S1300000_10.l2;
        fill.LIZJ = aweme;
        ((AdLightWebPageAssem) aqS32S1300000_10.l3).getClass();
        Bundle bundle = new Bundle();
        if (fragment != null && (context = fragment.getContext()) != null && aweme != null && aweme.getAwemeRawAd() != null) {
            C17J.LJIIJJI(context, bundle, aweme);
            C17J.LJIIL(context, bundle, aweme);
            C17J.LJIILJJIL(context, bundle, aweme);
            C17J.LJIILIIL(context, bundle);
        }
        fill.LJ = bundle;
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS32S1300000_10 aqS32S1300000_10, Object obj) {
        aqS32S1300000_10.invoke$0((ARN) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS32S1300000_10 aqS32S1300000_10, Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        InterfaceC62225ObV interfaceC62225ObV = (InterfaceC62225ObV) aqS32S1300000_10.l1;
        Uri LIZ = O18.LIZ((Context) aqS32S1300000_10.l2, new File(it));
        o.LJIIIIZZ(LIZ, "getFileProviderUri(context, File(it))");
        interfaceC62225ObV.LJII(new C62313Ocv(LIZ, it, null, null, aqS32S1300000_10.s0, null, false, 220), (Context) aqS32S1300000_10.l2, null);
        ((InterfaceC88472Yns) aqS32S1300000_10.l3).invoke(Boolean.TRUE);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS32S1300000_10 aqS32S1300000_10, Object obj) {
        String result = (String) obj;
        o.LJIIIZ(result, "result");
        if (o.LJ(((InterfaceC62225ObV) aqS32S1300000_10.l1).key(), "email")) {
            ((InterfaceC62225ObV) aqS32S1300000_10.l1).LJIIJ(new OYP(result, ((InviteFriendsSharePackageV2) aqS32S1300000_10.l2).title, aqS32S1300000_10.s0), (Context) aqS32S1300000_10.l3, null);
        } else {
            ((InterfaceC62225ObV) aqS32S1300000_10.l1).LJIIJ(new OYP(result, aqS32S1300000_10.s0, 4), (Context) aqS32S1300000_10.l3, null);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS32S1300000_10 aqS32S1300000_10, Object obj) {
        EnumC61256O2i enumC61256O2i;
        O39 o39;
        C61295O3v it = (C61295O3v) obj;
        o.LJIIIZ(it, "it");
        String filePath = it.getFilePath();
        if (it.LJZL && filePath != null) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS32S1300000_10.l1;
            Uri parse = UriProtector.parse(aqS32S1300000_10.s0);
            o.LJIIIIZZ(parse, "parse(resUrl)");
            C61259O2l c61259O2l = new C61259O2l(parse);
            C60789NtR c60789NtR = (C60789NtR) aqS32S1300000_10.l3;
            c61259O2l.LJLILLLLZI = filePath;
            if (o.LJ(it.LLD, "builtin")) {
                enumC61256O2i = EnumC61256O2i.ASSET;
            } else {
                enumC61256O2i = EnumC61256O2i.DISK;
            }
            c61259O2l.LJLJI = enumC61256O2i;
            String str = it.LLD;
            c60789NtR.getClass();
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 98349) {
                    if (hashCode != 98230121) {
                        if (hashCode == 230960163 && str.equals("builtin")) {
                            o39 = O39.BUILTIN;
                            c61259O2l.LJLJJI = o39;
                            interfaceC88472Yns.invoke(c61259O2l);
                        }
                    } else if (str.equals("gecko")) {
                        o39 = O39.GECKO;
                        c61259O2l.LJLJJI = o39;
                        interfaceC88472Yns.invoke(c61259O2l);
                    }
                } else if (str.equals("cdn")) {
                    o39 = O39.CDN;
                    c61259O2l.LJLJJI = o39;
                    interfaceC88472Yns.invoke(c61259O2l);
                }
            }
            o39 = null;
            c61259O2l.LJLJJI = o39;
            interfaceC88472Yns.invoke(c61259O2l);
        } else {
            ((InterfaceC88471Ynr) aqS32S1300000_10.l2).invoke(new Throwable(it.LL.toString()), Boolean.FALSE);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS32S1300000_10 aqS32S1300000_10, Object obj) {
        String result = (String) obj;
        o.LJIIIZ(result, "result");
        if (o.LJ(((InterfaceC62225ObV) aqS32S1300000_10.l1).key(), "email")) {
            ((InterfaceC62225ObV) aqS32S1300000_10.l1).LJIIJ(new OYP(result, ((InviteFriendsPageSharePackage) aqS32S1300000_10.l2).title, aqS32S1300000_10.s0), (Context) aqS32S1300000_10.l3, null);
        } else {
            ((InterfaceC62225ObV) aqS32S1300000_10.l1).LJIIJ(new OYP(result, aqS32S1300000_10.s0, 4), (Context) aqS32S1300000_10.l3, null);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS32S1300000_10(C68322mC c68322mC, C68322mC<Runnable> c68322mC2, NetworkStandardUIServiceImpl networkStandardUIServiceImpl, C76732zl c76732zl, String str) {
        super(1);
        this.$t = str;
        this.l1 = c68322mC;
        this.l3 = c68322mC2;
        this.l2 = networkStandardUIServiceImpl;
        this.s0 = c76732zl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS32S1300000_10(InterfaceC62225ObV interfaceC62225ObV, InterfaceC62225ObV interfaceC62225ObV2, Context context, String str, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l1 = interfaceC62225ObV;
        this.l2 = interfaceC62225ObV2;
        this.s0 = context;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS32S1300000_10(InterfaceC62225ObV interfaceC62225ObV, InviteFriendsSharePackageV2 inviteFriendsSharePackageV2, String str, Context context, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC62225ObV;
        this.l2 = inviteFriendsSharePackageV2;
        this.s0 = str;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS32S1300000_10(InterfaceC62225ObV interfaceC62225ObV, InviteFriendsPageSharePackage inviteFriendsPageSharePackage, String str, Context context, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC62225ObV;
        this.l2 = inviteFriendsPageSharePackage;
        this.s0 = str;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS32S1300000_10(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super C61259O2l, C76800UCe> interfaceC88472Yns2, String str, InterfaceC88471Ynr<? super Throwable, ? super Boolean, C76800UCe> interfaceC88471Ynr, C60789NtR c60789NtR) {
        super(1);
        this.$t = c60789NtR;
        this.l1 = interfaceC88472Yns;
        this.s0 = interfaceC88472Yns2;
        this.l2 = str;
        this.l3 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS32S1300000_10(String str, Fragment fragment, Aweme aweme, AdLightWebPageAssem adLightWebPageAssem, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = fragment;
        this.l2 = aweme;
        this.l3 = adLightWebPageAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS32S1300000_10(String str, AdAceSurveyBottomBarAssem adAceSurveyBottomBarAssem, Aweme aweme, VideoItemParams videoItemParams, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = adAceSurveyBottomBarAssem;
        this.l2 = aweme;
        this.l3 = videoItemParams;
    }
}
