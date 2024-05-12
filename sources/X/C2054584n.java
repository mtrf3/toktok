package X;

import Y.ACallableS34S1200000_3;
import Y.AgS73S0300000_3;
import android.content.Context;
import android.text.Layout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextLayoutView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.84n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C2054584n extends TBS implements InterfaceC88472Yns<AnonymousClass860, C76800UCe> {
    public C2054584n(Object obj) {
        super(1, obj, C2054084i.class, "showTranslated", "showTranslated(Lcom/ss/android/ugc/aweme/translation/state/DescriptionData;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AnonymousClass860 anonymousClass860) {
        Aweme aweme;
        String str;
        String str2;
        boolean z;
        C2055584x c2055584x;
        boolean z2;
        List list;
        AnonymousClass853 anonymousClass853;
        AnonymousClass860 p0 = anonymousClass860;
        o.LJIIIZ(p0, "p0");
        C2054084i c2054084i = (C2054084i) this.receiver;
        VideoItemParams gv0 = c2054084i.LJLILLLLZI.gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null && (str = p0.LIZ) != null) {
            C2058586b c2058586b = c2054084i.LJLZ.LJFF;
            if (c2058586b != null) {
                str2 = c2058586b.LIZ;
            } else {
                str2 = null;
            }
            boolean z3 = !o.LJ(str2, str);
            if (!c2054084i.LJLZ.LIZ(aweme) || z3) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Desc: Trigger aid ");
                LIZ.append(aweme.getAid());
                LIZ.append(" switch to translated; translated data: ");
                LIZ.append(str);
                C36922EeM.LIZLLL(4, "VideoDescView", X1D.LIZIZ(LIZ));
                if (c2054084i.LLFFF == null || z3) {
                    if (c2054084i.LJLILLLLZI.pv0() && aweme.getOriginalClientText() != null) {
                        C10K LIZJ = C10K.LIZJ(new ACallableS34S1200000_3(c2054084i, str, aweme, 0));
                        o.LJIIIIZZ(LIZJ, "private fun showTranslat…anslationEllipsize)\n    }");
                        o.LJIIIIZZ(LIZJ.LJIILLIIL(new AgS73S0300000_3(LIZJ, aweme, c2054084i, 0), C10K.LJIIIIZZ), "Task<TResult>.onSuccessR… Task.UI_THREAD_EXECUTOR)");
                    } else {
                        boolean LIZJ2 = AnonymousClass843.LIZJ(aweme);
                        if (c2054084i.LJLLL != null) {
                            float LJIIJJI = KL2.LJIIJJI(r0.getContext()) - c2054084i.LJLJJL.lv0(LIZJ2);
                            C2055684y c2055684y = c2054084i.LJLZ;
                            TuxTextLayoutView tuxTextLayoutView = c2054084i.LJLLL;
                            if (tuxTextLayoutView != null) {
                                Context context = tuxTextLayoutView.getContext();
                                o.LJIIIIZZ(context, "descView.context");
                                if (aweme.isAd()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c2055684y.getClass();
                                boolean qv0 = c2055684y.LIZ.qv0();
                                C2054684o c2054684o = c2055684y.LIZLLL;
                                if (c2054684o != null) {
                                    Iterator<AnonymousClass850> it = c2054684o.LIZ.iterator();
                                    int i = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        if (it.next().LIZJ == AnonymousClass853.PURE) {
                                            if (i != -1) {
                                                ArrayList arrayList = new ArrayList();
                                                int i2 = 0;
                                                for (AnonymousClass850 anonymousClass850 : c2054684o.LIZ) {
                                                    int i3 = i2 + 1;
                                                    if (i2 >= 0) {
                                                        AnonymousClass850 anonymousClass8502 = anonymousClass850;
                                                        AnonymousClass853 anonymousClass8532 = anonymousClass8502.LIZJ;
                                                        if (anonymousClass8532 != AnonymousClass853.PURE && (anonymousClass8532 != (anonymousClass853 = AnonymousClass853.WRAP) || (anonymousClass8532 == anonymousClass853 && i2 < i))) {
                                                            arrayList.add(anonymousClass8502);
                                                        }
                                                        i2 = i3;
                                                    } else {
                                                        C47261Igj.LJJJJJ();
                                                        throw null;
                                                    }
                                                }
                                                List LJLJJL = s.LJLJJL(str, new String[]{"\n"}, 0, 6);
                                                if (LJLJJL.isEmpty() || !qv0) {
                                                    list = C47261Igj.LJJIJ(C2055784z.LIZIZ(str));
                                                } else {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    int size = LJLJJL.size() - 1;
                                                    for (int i4 = 0; i4 < size; i4++) {
                                                        arrayList2.add(C2055784z.LIZIZ((String) ListProtector.get(LJLJJL, i4)));
                                                        arrayList2.add(new AnonymousClass850("\n", (List) null, AnonymousClass853.WRAP, 10));
                                                    }
                                                    arrayList2.add(C2055784z.LIZIZ((String) ORZ.LLFF(LJLJJL)));
                                                    list = arrayList2;
                                                }
                                                arrayList.addAll(i, list);
                                                C2054684o c2054684o2 = new C2054684o(arrayList);
                                                c2054684o2.LIZIZ = c2054684o.LIZIZ;
                                                if (C86R.LIZ()) {
                                                    String string = context.getString(R.string.dal);
                                                    o.LJIIIIZZ(string, "ctx\n            .getStri…nsTagAutoTranslate_title)");
                                                    String LJJJJZ = ujb.o.LJJJJZ(string, "%s", "", false);
                                                    Integer LJI = C79045V0n.LJI(R.attr.dl, context);
                                                    if (LJI != null) {
                                                        c2054684o2.LIZ(new C85D(LJJJJZ, LJI.intValue()));
                                                    }
                                                }
                                                c2054684o2.LJ(new C2055384v(LJIIJJI, context, c2054684o2.LIZLLL(), z));
                                                c2055684y.LJFF = new C2058586b(c2054684o2.LIZIZ(), str, C61878OQg.INSTANCE);
                                                CharSequence LIZJ3 = c2054684o2.LIZJ();
                                                c2055584x = new C2055584x(c2054684o2.LIZIZ());
                                                c2055584x.LIZLLL = LIZJ3;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                                c2055584x = null;
                                c2054084i.LJLLLLLL = c2055584x;
                                z2 = true;
                                c2054084i.LJIIIIZZ(c2055584x, aweme, true, LIZJ2);
                            } else {
                                o.LJIJI("descView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("descView");
                            throw null;
                        }
                    }
                } else {
                    z2 = true;
                }
                Layout layout = c2054084i.LLFFF;
                if (layout != null) {
                    c2054084i.LJLZ.LJI = z2;
                    c2054084i.LJIIJ(layout, c2054084i.LLFII);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
