package Y;

import X.AbstractC73672Svk;
import X.AbstractC77394UZa;
import X.C10I;
import X.C10K;
import X.C158056If;
import X.C63081OpJ;
import X.C73969T1h;
import X.C76800UCe;
import X.C77395UZb;
import X.C77396UZc;
import X.C77397UZd;
import X.C77398UZe;
import X.C77403UZj;
import X.C77404UZk;
import X.C77405UZl;
import X.C77406UZm;
import X.InterfaceC77407UZn;
import X.KL2;
import X.T16;
import X.UZR;
import X.UZS;
import X.UZV;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AgS114S0200000_13 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS114S0200000_13 agS114S0200000_13, C10K c10k) {
        int i;
        UgNewFeedPendant newFeedPendant;
        List<UrlModel> resourceUrl;
        List<String> list;
        List<String> list2;
        UgNewFeedPendant newFeedPendant2;
        UgNewFeedPendant newFeedPendant3;
        UgNewFeedPendant newFeedPendant4;
        List<UrlModel> resourceUrl2;
        String str;
        List<String> list3;
        UgNewFeedPendant newFeedPendant5;
        UgNewFeedPendant newFeedPendant6;
        Boolean shouldShow = (Boolean) c10k.LJIIJJI();
        o.LJIIIIZZ(shouldShow, "shouldShow");
        if (shouldShow.booleanValue()) {
            C77396UZc c77396UZc = new C77396UZc();
            AqS160S0200000_13 aqS160S0200000_13 = new AqS160S0200000_13((C77397UZd) agS114S0200000_13.l0, (Context) agS114S0200000_13.l1, 103);
            AqS156S0100000_6 aqS156S0100000_6 = new AqS156S0100000_6((C77397UZd) agS114S0200000_13.l0, 163);
            AqS160S0200000_13 aqS160S0200000_132 = new AqS160S0200000_13((C77397UZd) agS114S0200000_13.l0, (Context) agS114S0200000_13.l1, 104);
            C77397UZd c77397UZd = (C77397UZd) agS114S0200000_13.l0;
            c77396UZc.LIZ = c77397UZd.LJIIJ;
            c77396UZc.LIZIZ = aqS160S0200000_13;
            c77396UZc.LIZJ = aqS156S0100000_6;
            c77396UZc.LIZLLL = aqS160S0200000_132;
            c77397UZd.LIZJ = new UZV(((C77397UZd) agS114S0200000_13.l0).LJI, new C77395UZb(c77396UZc), (Context) agS114S0200000_13.l1);
            float LJJJJLI = C63081OpJ.LJJJJLI((Context) agS114S0200000_13.l1) + 0.0f;
            C77397UZd c77397UZd2 = (C77397UZd) agS114S0200000_13.l0;
            View view = c77397UZd2.LIZLLL;
            if (view instanceof FrameLayout) {
                ((ViewGroup) view).addView(c77397UZd2.LIZJ);
            }
            int LJIILL = KL2.LJIILL(((C77397UZd) agS114S0200000_13.l0).LIZ, LJJJJLI);
            C77397UZd c77397UZd3 = (C77397UZd) agS114S0200000_13.l0;
            int LJIIJJI = KL2.LJIIJJI(c77397UZd3.LIZ);
            if (KL2.LJIIIZ(c77397UZd3.LIZ) > 1280 && LJIIJJI > 720) {
                i = 64;
            } else {
                i = 54;
            }
            int i2 = LJIILL + i;
            UZV uzv = ((C77397UZd) agS114S0200000_13.l0).LIZJ;
            o.LJI(uzv);
            ViewGroup.LayoutParams layoutParams = uzv.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).topMargin = (int) KL2.LIZJ(((C77397UZd) agS114S0200000_13.l0).LIZ, i2);
                UZV uzv2 = ((C77397UZd) agS114S0200000_13.l0).LIZJ;
                o.LJI(uzv2);
                uzv2.setLayoutParams(layoutParams);
            }
            UZS uzs = new UZS();
            C77397UZd c77397UZd4 = (C77397UZd) agS114S0200000_13.l0;
            int i3 = c77397UZd4.LJI;
            try {
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            C77398UZe c77398UZe = new C77398UZe(c77397UZd4, uzs);
                            UgAwemeActivitySetting ugAwemeActivitySetting = c77397UZd4.LIZIZ;
                            if (ugAwemeActivitySetting != null && (newFeedPendant6 = ugAwemeActivitySetting.getNewFeedPendant()) != null) {
                                str = newFeedPendant6.getLottieFileMd5();
                            } else {
                                str = null;
                            }
                            UgAwemeActivitySetting ugAwemeActivitySetting2 = ((C77397UZd) agS114S0200000_13.l0).LIZIZ;
                            if (ugAwemeActivitySetting2 != null && (newFeedPendant5 = ugAwemeActivitySetting2.getNewFeedPendant()) != null) {
                                list3 = newFeedPendant5.getLottieFileZip();
                            } else {
                                list3 = null;
                            }
                            if (str != null && list3 != null) {
                                C77397UZd c77397UZd5 = (C77397UZd) agS114S0200000_13.l0;
                                c77397UZd5.LJIIL.LIZIZ(c77397UZd5.LJIILIIL, str, list3);
                            }
                            C77403UZj c77403UZj = ((C77397UZd) agS114S0200000_13.l0).LJIIL;
                            c77403UZj.getClass();
                            synchronized (c77403UZj.LJIIIZ) {
                                ((ArrayList) c77403UZj.LJII).add(c77398UZe);
                            }
                            ((C77397UZd) agS114S0200000_13.l0).LJIIL.LIZJ((Context) agS114S0200000_13.l1);
                        }
                    } else {
                        UgAwemeActivitySetting ugAwemeActivitySetting3 = c77397UZd4.LIZIZ;
                        if (ugAwemeActivitySetting3 != null && (newFeedPendant4 = ugAwemeActivitySetting3.getNewFeedPendant()) != null && (resourceUrl2 = newFeedPendant4.getResourceUrl()) != null && resourceUrl2.size() == 2) {
                            uzs.LIZLLL = (UrlModel) ListProtector.get(resourceUrl2, 0);
                            uzs.LJ = (UrlModel) ListProtector.get(resourceUrl2, 1);
                            UZV uzv3 = ((C77397UZd) agS114S0200000_13.l0).LIZJ;
                            if (uzv3 != null) {
                                UZR uzr = new UZR(uzs);
                                AbstractC77394UZa abstractC77394UZa = uzv3.LJLJI;
                                if (abstractC77394UZa != null) {
                                    abstractC77394UZa.LIZ(uzr);
                                }
                            }
                        }
                    }
                } else {
                    try {
                        UgAwemeActivitySetting ugAwemeActivitySetting4 = c77397UZd4.LIZIZ;
                        if (ugAwemeActivitySetting4 != null && (newFeedPendant3 = ugAwemeActivitySetting4.getNewFeedPendant()) != null) {
                            list = newFeedPendant3.getBigPngFragmentsUrls();
                        } else {
                            list = null;
                        }
                        uzs.LJFF = list;
                        UgAwemeActivitySetting ugAwemeActivitySetting5 = ((C77397UZd) agS114S0200000_13.l0).LIZIZ;
                        if (ugAwemeActivitySetting5 != null && (newFeedPendant2 = ugAwemeActivitySetting5.getNewFeedPendant()) != null) {
                            list2 = newFeedPendant2.getSmallPngFragmentsUrls();
                        } else {
                            list2 = null;
                        }
                        uzs.LJI = list2;
                    } catch (C158056If unused) {
                    }
                    UgAwemeActivitySetting ugAwemeActivitySetting6 = ((C77397UZd) agS114S0200000_13.l0).LIZIZ;
                    if (ugAwemeActivitySetting6 != null && (newFeedPendant = ugAwemeActivitySetting6.getNewFeedPendant()) != null && (resourceUrl = newFeedPendant.getResourceUrl()) != null && resourceUrl.size() == 2) {
                        uzs.LIZLLL = (UrlModel) ListProtector.get(resourceUrl, 0);
                        uzs.LJ = (UrlModel) ListProtector.get(resourceUrl, 1);
                        UZV uzv4 = ((C77397UZd) agS114S0200000_13.l0).LIZJ;
                        if (uzv4 != null) {
                            UZR uzr2 = new UZR(uzs);
                            AbstractC77394UZa abstractC77394UZa2 = uzv4.LJLJI;
                            if (abstractC77394UZa2 != null) {
                                abstractC77394UZa2.LIZ(uzr2);
                            }
                        }
                    }
                }
            } catch (C158056If unused2) {
            }
        }
        return null;
    }

    public static final Object then$1(AgS114S0200000_13 agS114S0200000_13, C10K c10k) {
        Object LJIIJJI = c10k.LJIIJJI();
        o.LJIIIIZZ(LJIIJJI, "task.result");
        if (((Boolean) LJIIJJI).booleanValue()) {
            C77403UZj c77403UZj = (C77403UZj) agS114S0200000_13.l0;
            c77403UZj.LJIIIIZZ = false;
            Iterator it = ((ArrayList) c77403UZj.LJII).iterator();
            while (it.hasNext()) {
                ((InterfaceC77407UZn) it.next()).onSuccess();
            }
            ((ArrayList) ((C77403UZj) agS114S0200000_13.l0).LJII).clear();
        } else {
            C77403UZj c77403UZj2 = (C77403UZj) agS114S0200000_13.l0;
            C77405UZl c77405UZl = new C77405UZl(c77403UZj2);
            C77404UZk c77404UZk = c77403UZj2.LJFF;
            if (c77404UZk != null) {
                Context context = (Context) agS114S0200000_13.l1;
                o.LJIIIZ(context, "context");
                AbstractC73672Svk.LJIIJ(new IDuS323S0100000_13(c77404UZk, 8)).LJJJJJL(Long.MAX_VALUE, new C77406UZm(c77404UZk)).LJJIII(new IDhS97S0100000_4(c77404UZk, 5), false).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS311S0100000_13(c77405UZl, 0));
            }
        }
        return C76800UCe.LIZ;
    }

    public AgS114S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
