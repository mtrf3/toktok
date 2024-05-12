package Y;

import X.AG2;
import X.C0M6;
import X.C26045AKb;
import X.C44072HRk;
import X.C64698PaI;
import X.C73318Sq2;
import X.C77123UOp;
import X.C86006XpC;
import X.C86007XpD;
import X.C86008XpE;
import X.C86431Xw3;
import X.EnumC44076HRo;
import X.InterfaceC116954iR;
import X.InterfaceC92693kP;
import X.ProgressDialogC44073HRl;
import X.Q8U;
import X.XI6;
import X.XSK;
import X.XSL;
import X.XSM;
import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.CountDownStickerDetailResponse;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.CountDownStickerResponse;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.FeedCountStickerDialogFragment;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDxS312S0100000_15 implements InterfaceC116954iR {
    public final int $t;
    public Object l0;

    public static final void onComplete$0(IDxS312S0100000_15 iDxS312S0100000_15) {
    }

    public static final void onComplete$1(IDxS312S0100000_15 iDxS312S0100000_15) {
    }

    public static final void onComplete$2(IDxS312S0100000_15 iDxS312S0100000_15) {
    }

    public static final void onComplete$3(IDxS312S0100000_15 iDxS312S0100000_15) {
    }

    public static final void onComplete$4(IDxS312S0100000_15 iDxS312S0100000_15) {
    }

    public static final void onError$0(IDxS312S0100000_15 iDxS312S0100000_15, Throwable th) {
    }

    public static final void onSubscribe$0(IDxS312S0100000_15 iDxS312S0100000_15, InterfaceC92693kP interfaceC92693kP) {
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                return;
            case 1:
                onComplete$1(this);
                return;
            case 2:
                onComplete$2(this);
                return;
            case 3:
                onComplete$3(this);
                return;
            case 4:
                onComplete$4(this);
                return;
            case 5:
                onComplete$5(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                return;
            case 1:
                o.LJIIIZ(th, "e");
                return;
            case 2:
                o.LJIIIZ(th, "e");
                return;
            case 3:
                o.LJIIIZ(th, "e");
                return;
            case 4:
                onError$4(this, th);
                return;
            case 5:
                onError$5(this, th);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                return;
            case 1:
                onNext$1(this, obj);
                return;
            case 2:
                onNext$2(this, obj);
                return;
            case 3:
                o.LJIIIZ(obj, "t");
                return;
            case 4:
                onNext$4(this, obj);
                return;
            case 5:
                onNext$5(this, obj);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC92693kP);
                return;
            case 1:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            case 2:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            case 3:
                onSubscribe$3(this, interfaceC92693kP);
                return;
            case 4:
                onSubscribe$4(this, interfaceC92693kP);
                return;
            case 5:
                onSubscribe$5(this, interfaceC92693kP);
                return;
            default:
                return;
        }
    }

    public static final void onComplete$5(IDxS312S0100000_15 iDxS312S0100000_15) {
        ProgressDialogC44073HRl progressDialogC44073HRl = ((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0).LJLL;
        if (progressDialogC44073HRl != null) {
            progressDialogC44073HRl.dismiss();
        }
    }

    public IDxS312S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$4(IDxS312S0100000_15 iDxS312S0100000_15, Throwable e) {
        o.LJIIIZ(e, "e");
        if (e instanceof C64698PaI) {
            C26045AKb c26045AKb = new C26045AKb((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0);
            c26045AKb.LJIIIIZZ(R.string.im9);
            c26045AKb.LJIIJ();
        }
    }

    public static final void onError$5(IDxS312S0100000_15 iDxS312S0100000_15, Throwable e) {
        o.LJIIIZ(e, "e");
        if (e instanceof C64698PaI) {
            C26045AKb c26045AKb = new C26045AKb((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0);
            c26045AKb.LJIIIIZZ(R.string.im9);
            c26045AKb.LJIIJ();
        }
        ProgressDialogC44073HRl progressDialogC44073HRl = ((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0).LJLL;
        if (progressDialogC44073HRl != null) {
            progressDialogC44073HRl.dismiss();
        }
    }

    public static final void onNext$0(IDxS312S0100000_15 iDxS312S0100000_15, Object obj) {
        AG2 ag2;
        if (((Boolean) obj).booleanValue() && (ag2 = ((SettingNewVersionFragment) iDxS312S0100000_15.l0).mClearCacheItem) != null) {
            ag2.LJIILIIL(true);
        }
    }

    public static final void onNext$1(IDxS312S0100000_15 iDxS312S0100000_15, Object t) {
        o.LJIIIZ(t, "t");
        ((C0M6) ((XI6) iDxS312S0100000_15.l0).LJLILLLLZI.LIZ).LJIIIIZZ(-1);
    }

    public static final void onNext$2(IDxS312S0100000_15 iDxS312S0100000_15, Object obj) {
        String from = (String) obj;
        o.LJIIIZ(from, "from");
        XSK.LIZIZ(new XSM((XSL) iDxS312S0100000_15.l0), from);
    }

    public static final void onNext$4(IDxS312S0100000_15 iDxS312S0100000_15, Object obj) {
        int i;
        CountDownStickerDetailResponse t = (CountDownStickerDetailResponse) obj;
        o.LJIIIZ(t, "t");
        if (((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0).isAdded()) {
            CountDownStickerStruct countDownStickerStruct = ((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0).LJLIL;
            if (countDownStickerStruct != null) {
                countDownStickerStruct.setSubscribeNum(t.stickerDetail.getSubscribeNum());
                countDownStickerStruct.setSubscribe(t.stickerDetail.getSubscribe());
            }
            if (((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0).LJLLL) {
                String LJJIIJ = C77123UOp.LJJIIJ(t.stickerDetail.getSubscribeNum());
                Resources resources = ((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0).getResources();
                if (System.currentTimeMillis() > t.stickerDetail.getMillSecond()) {
                    i = R.plurals.ch;
                } else {
                    i = R.plurals.cr;
                }
                String quantityString = resources.getQuantityString(i, (int) t.stickerDetail.getSubscribeNum());
                o.LJIIIIZZ(quantityString, "resources.getQuantityStr…                    ?: 0)");
                String LIZIZ = Q8U.LIZIZ(new Object[]{a1.LJ("<b>", LJJIIJ, "</b>")}, 1, quantityString, "format(this, *args)");
                TuxTextView tuxTextView = ((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0).LJLJJLL;
                if (tuxTextView == null) {
                    return;
                }
                tuxTextView.setText(Html.fromHtml(LIZIZ));
                return;
            }
            if (System.currentTimeMillis() > t.stickerDetail.getMillSecond()) {
                ((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0).Dl(C86006XpC.LIZ, false);
            } else if (o.LJ(t.stickerDetail.getSubscribe(), Boolean.TRUE)) {
                ((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0).Dl(C86008XpE.LIZ, false);
            } else {
                ((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0).Dl(C86007XpD.LIZ, false);
            }
        }
    }

    public static final void onNext$5(IDxS312S0100000_15 iDxS312S0100000_15, Object obj) {
        CountDownStickerResponse t = (CountDownStickerResponse) obj;
        o.LJIIIZ(t, "t");
        ProgressDialogC44073HRl progressDialogC44073HRl = ((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0).LJLL;
        if (progressDialogC44073HRl != null) {
            progressDialogC44073HRl.dismiss();
        }
        if (t.subscribeState) {
            ((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0).Dl(C86008XpE.LIZ, false);
            C26045AKb c26045AKb = new C26045AKb((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0);
            c26045AKb.LJIIIZ(((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0).getResources().getString(R.string.dx8));
            c26045AKb.LJIIJ();
            return;
        }
        ((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0).Dl(C86007XpD.LIZ, false);
        C26045AKb c26045AKb2 = new C26045AKb((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0);
        c26045AKb2.LJIIIZ(((FeedCountStickerDialogFragment) iDxS312S0100000_15.l0).getResources().getString(R.string.dx7));
        c26045AKb2.LJIIJ();
    }

    public static final void onSubscribe$3(IDxS312S0100000_15 iDxS312S0100000_15, InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        ((C86431Xw3) iDxS312S0100000_15.l0).LJLLJ.LIZ(d);
    }

    public static final void onSubscribe$4(IDxS312S0100000_15 iDxS312S0100000_15, InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        FeedCountStickerDialogFragment feedCountStickerDialogFragment = (FeedCountStickerDialogFragment) iDxS312S0100000_15.l0;
        if (feedCountStickerDialogFragment.LJLJLLL == null) {
            feedCountStickerDialogFragment.LJLJLLL = new C73318Sq2();
        }
        C73318Sq2 c73318Sq2 = feedCountStickerDialogFragment.LJLJLLL;
        if (c73318Sq2 != null) {
            c73318Sq2.LIZ(d);
        }
    }

    public static final void onSubscribe$5(IDxS312S0100000_15 iDxS312S0100000_15, InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        FeedCountStickerDialogFragment feedCountStickerDialogFragment = (FeedCountStickerDialogFragment) iDxS312S0100000_15.l0;
        if (feedCountStickerDialogFragment.LJLJLLL == null) {
            feedCountStickerDialogFragment.LJLJLLL = new C73318Sq2();
        }
        C73318Sq2 c73318Sq2 = feedCountStickerDialogFragment.LJLJLLL;
        if (c73318Sq2 != null) {
            c73318Sq2.LIZ(d);
        }
        FeedCountStickerDialogFragment feedCountStickerDialogFragment2 = (FeedCountStickerDialogFragment) iDxS312S0100000_15.l0;
        Context context = feedCountStickerDialogFragment2.getContext();
        o.LJI(context);
        ProgressDialogC44073HRl progressDialogC44073HRl = new ProgressDialogC44073HRl(context, R.style.a5l, EnumC44076HRo.GONE);
        C44072HRk.LIZIZ(context, progressDialogC44073HRl);
        feedCountStickerDialogFragment2.LJLL = progressDialogC44073HRl;
    }
}
