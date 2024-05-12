package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import X.AbstractC86004XpA;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C20110qd;
import X.C27331Ao3;
import X.C29S;
import X.C2IP;
import X.C2U8;
import X.C3C5;
import X.C73318Sq2;
import X.C73969T1h;
import X.C74275TDb;
import X.C76800UCe;
import X.C77123UOp;
import X.C77800Ug8;
import X.C79045V0n;
import X.C86002Xp8;
import X.C86006XpC;
import X.C86007XpD;
import X.C86008XpE;
import X.C86009XpF;
import X.C86010XpG;
import X.C86011XpH;
import X.C90903hW;
import X.EnumC35494DwQ;
import X.FMX;
import X.HG3;
import X.ProgressDialogC44073HRl;
import X.SY4;
import X.T16;
import X.X1D;
import Y.ACListenerS35S0100000_15;
import Y.IDxS312S0100000_15;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.CountDownStickerApi;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class FeedCountStickerDialogFragment extends BottomSheetDialogFragment {
    public static final /* synthetic */ int LJLLLL = 0;
    public CountDownStickerStruct LJLIL;
    public Aweme LJLILLLLZI;
    public LinearLayout LJLJI;
    public SY4 LJLJJI;
    public SY4 LJLJJL;
    public TuxTextView LJLJJLL;
    public AbstractC86004XpA LJLJL;
    public final CountDownStickerApi LJLJLJ;
    public C73318Sq2 LJLJLLL;
    public ProgressDialogC44073HRl LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public boolean LJLLL;

    public FeedCountStickerDialogFragment() {
        new LinkedHashMap();
        this.LJLJL = C86010XpG.LIZ;
        CountDownStickerApi.LIZ.getClass();
        IRetrofitFactory iRetrofitFactory = C86002Xp8.LIZIZ;
        String str = Api.LIZ;
        this.LJLJLJ = (CountDownStickerApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", iRetrofitFactory, str, CountDownStickerApi.class);
    }

    public final void Al() {
        String str;
        String str2;
        long j;
        int i;
        LinearLayout linearLayout = this.LJLJI;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        CountDownStickerStruct countDownStickerStruct = this.LJLIL;
        Long l = null;
        if (countDownStickerStruct != null) {
            str = countDownStickerStruct.getTitle();
        } else {
            str = null;
        }
        linearLayout.addView(wl(linearLayout, str, 22, 20.0f, R.attr.go));
        StringBuilder LIZ = X1D.LIZ();
        CountDownStickerStruct countDownStickerStruct2 = this.LJLIL;
        if (countDownStickerStruct2 != null) {
            str2 = countDownStickerStruct2.getTextAlreadyExpired();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append('\n');
        CountDownStickerStruct countDownStickerStruct3 = this.LJLIL;
        if (countDownStickerStruct3 != null) {
            l = Long.valueOf(countDownStickerStruct3.getMillSecond());
        }
        LIZ.append(Gl(l));
        linearLayout.addView(wl(linearLayout, X1D.LIZIZ(LIZ), 41, 12.0f, R.attr.gu));
        CountDownStickerStruct countDownStickerStruct4 = this.LJLIL;
        if (countDownStickerStruct4 != null) {
            j = countDownStickerStruct4.getSubscribeNum();
        } else {
            j = 0;
        }
        String LJJIIJ = C77123UOp.LJJIIJ(j);
        Resources resources = linearLayout.getResources();
        CountDownStickerStruct countDownStickerStruct5 = this.LJLIL;
        if (countDownStickerStruct5 != null) {
            i = (int) countDownStickerStruct5.getSubscribeNum();
        } else {
            i = 0;
        }
        String quantityString = resources.getQuantityString(R.plurals.ch, i);
        o.LJIIIIZZ(quantityString, "resources.getQuantityStr…bscribeNum?.toInt() ?: 0)");
        String LLLZ = C16880lQ.LLLZ(quantityString, Arrays.copyOf(new Object[]{a1.LJ("<b>", LJJIIJ, "</b>")}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        LJJIIJ.getClass();
        TuxTextView wl = wl(linearLayout, LLLZ, 41, 32.0f, R.attr.gu);
        this.LJLJJLL = wl;
        linearLayout.addView(wl);
        String string = linearLayout.getResources().getString(R.string.dx2);
        o.LJIIIIZZ(string, "resources.getString(R.st…untdown_expire_ok_button)");
        Context context = linearLayout.getContext();
        o.LJIIIIZZ(context, "contentView.context");
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.go, context);
        Context context2 = linearLayout.getContext();
        o.LJII(context2, "null cannot be cast to non-null type android.content.Context");
        SY4 vl = vl(linearLayout, string, LJIIIIZZ, C20110qd.LIZ(context2, R.drawable.a25));
        this.LJLJJI = vl;
        C16880lQ.LJJIZ(vl, new ACListenerS35S0100000_15(this, 136));
        linearLayout.addView(this.LJLJJI);
    }

    public final void xl() {
        String str;
        String str2;
        int i;
        LinearLayout linearLayout = this.LJLJI;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        CountDownStickerStruct countDownStickerStruct = this.LJLIL;
        Long l = null;
        if (countDownStickerStruct != null) {
            str = countDownStickerStruct.getTitle();
        } else {
            str = null;
        }
        linearLayout.addView(wl(linearLayout, str, 22, 20.0f, R.attr.go));
        StringBuilder LIZ = X1D.LIZ();
        CountDownStickerStruct countDownStickerStruct2 = this.LJLIL;
        if (countDownStickerStruct2 != null) {
            str2 = countDownStickerStruct2.getTextAlreadyExpired();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append('\n');
        CountDownStickerStruct countDownStickerStruct3 = this.LJLIL;
        if (countDownStickerStruct3 != null) {
            l = Long.valueOf(countDownStickerStruct3.getMillSecond());
        }
        LIZ.append(Gl(l));
        linearLayout.addView(wl(linearLayout, X1D.LIZIZ(LIZ), 41, 12.0f, R.attr.gu));
        String string = linearLayout.getResources().getString(R.string.dx2);
        o.LJIIIIZZ(string, "resources.getString(R.st…untdown_expire_ok_button)");
        Context context = linearLayout.getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.go, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        Context context2 = linearLayout.getContext();
        o.LJII(context2, "null cannot be cast to non-null type android.content.Context");
        SY4 vl = vl(linearLayout, string, i, C20110qd.LIZ(context2, R.drawable.a25));
        this.LJLJJI = vl;
        C16880lQ.LJJIZ(vl, new ACListenerS35S0100000_15(this, 135));
        linearLayout.addView(this.LJLJJI);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        if (this.LJLJLLL == null) {
            this.LJLJLLL = new C73318Sq2();
        }
        C73318Sq2 c73318Sq2 = this.LJLJLLL;
        if (c73318Sq2 != null) {
            c73318Sq2.dispose();
        }
        this.LJLJLLL = null;
    }

    public final String Gl(Long l) {
        if (l == null) {
            return "";
        }
        String formatDateTime = DateUtils.formatDateTime(getContext(), l.longValue(), 87);
        o.LJIIIIZZ(formatDateTime, "formatDateTime(context, … DateUtils.FORMAT_12HOUR)");
        return formatDateTime;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        Serializable serializable;
        CountDownStickerStruct countDownStickerStruct;
        AbstractC86004XpA abstractC86004XpA;
        String string;
        Serializable serializable2;
        Aweme aweme;
        super.onCreate(bundle);
        setStyle(0, R.style.a8r);
        String str4 = null;
        if (this.LJLILLLLZI == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable2 = arguments.getSerializable("countdown_sticker_aweme");
            } else {
                serializable2 = null;
            }
            if (serializable2 instanceof Aweme) {
                aweme = (Aweme) serializable2;
            } else {
                aweme = null;
            }
            this.LJLILLLLZI = aweme;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("group_id");
        } else {
            str = null;
        }
        String str5 = "";
        if (str == null) {
            str = "";
        }
        this.LJLLI = str;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str2 = arguments3.getString("author_id")) == null) {
            str2 = "";
        }
        this.LJLLILLLL = str2;
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (string = arguments4.getString("enter_from")) != null) {
            str5 = string;
        }
        this.LJLLJ = str5;
        String curUserId = HG3.LJIILL().getCurUserId();
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 != null) {
            str3 = aweme2.getAuthorUid();
        } else {
            str3 = null;
        }
        this.LJLLL = TextUtils.equals(curUserId, str3);
        if (this.LJLIL == null) {
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                serializable = arguments5.getSerializable("countdown_sticker_data");
            } else {
                serializable = null;
            }
            if (serializable instanceof CountDownStickerStruct) {
                countDownStickerStruct = (CountDownStickerStruct) serializable;
            } else {
                countDownStickerStruct = null;
            }
            this.LJLIL = countDownStickerStruct;
            String curUserId2 = HG3.LJIILL().getCurUserId();
            Aweme aweme3 = this.LJLILLLLZI;
            if (aweme3 != null) {
                str4 = aweme3.getAuthorUid();
            }
            long j = 0;
            if (TextUtils.equals(curUserId2, str4)) {
                long currentTimeMillis = System.currentTimeMillis();
                CountDownStickerStruct countDownStickerStruct2 = this.LJLIL;
                if (countDownStickerStruct2 != null) {
                    j = countDownStickerStruct2.getMillSecond();
                }
                if (currentTimeMillis > j) {
                    abstractC86004XpA = C86009XpF.LIZ;
                } else {
                    abstractC86004XpA = C86010XpG.LIZ;
                }
            } else {
                long currentTimeMillis2 = System.currentTimeMillis();
                CountDownStickerStruct countDownStickerStruct3 = this.LJLIL;
                if (countDownStickerStruct3 != null) {
                    j = countDownStickerStruct3.getMillSecond();
                }
                if (currentTimeMillis2 > j) {
                    abstractC86004XpA = C86006XpC.LIZ;
                } else {
                    CountDownStickerStruct countDownStickerStruct4 = this.LJLIL;
                    if (countDownStickerStruct4 != null && o.LJ(countDownStickerStruct4.getSubscribe(), Boolean.TRUE)) {
                        abstractC86004XpA = C86008XpE.LIZ;
                    } else {
                        abstractC86004XpA = C86007XpD.LIZ;
                    }
                }
            }
            this.LJLJL = abstractC86004XpA;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        C2U8.LIZ(new C2IP(false, false));
    }

    public final void Dl(AbstractC86004XpA state, boolean z) {
        String str;
        long j;
        int i;
        String str2;
        Long l;
        String str3;
        Long l2;
        o.LJIIIZ(state, "state");
        if (o.LJ(this.LJLJL, state) && !z) {
            return;
        }
        this.LJLJL = state;
        if (o.LJ(state, C86006XpC.LIZ)) {
            xl();
            return;
        }
        int i2 = 0;
        Long l3 = null;
        String str4 = null;
        String str5 = null;
        if (o.LJ(state, C86007XpD.LIZ)) {
            LinearLayout linearLayout = this.LJLJI;
            if (linearLayout == null) {
                return;
            }
            linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
            CountDownStickerStruct countDownStickerStruct = this.LJLIL;
            if (countDownStickerStruct != null) {
                str3 = countDownStickerStruct.getTitle();
            } else {
                str3 = null;
            }
            linearLayout.addView(wl(linearLayout, str3, 22, 20.0f, R.attr.go));
            CountDownStickerStruct countDownStickerStruct2 = this.LJLIL;
            if (countDownStickerStruct2 != null) {
                l2 = Long.valueOf(countDownStickerStruct2.getMillSecond());
            } else {
                l2 = null;
            }
            linearLayout.addView(wl(linearLayout, Gl(l2), 41, 12.0f, R.attr.gu));
            CountDownStickerStruct countDownStickerStruct3 = this.LJLIL;
            if (countDownStickerStruct3 != null) {
                str4 = countDownStickerStruct3.getTextTobeSubscribed();
            }
            linearLayout.addView(wl(linearLayout, str4, 41, 12.0f, R.attr.gu));
            String string = linearLayout.getResources().getString(R.string.dxo);
            o.LJIIIIZZ(string, "resources.getString(R.st…g.countdown_set_reminder)");
            Context context = linearLayout.getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.dj, context);
            if (LJI != null) {
                i2 = LJI.intValue();
            }
            Context context2 = linearLayout.getContext();
            o.LJII(context2, "null cannot be cast to non-null type android.content.Context");
            SY4 vl = vl(linearLayout, string, i2, C20110qd.LIZ(context2, R.drawable.a24));
            this.LJLJJL = vl;
            C16880lQ.LJJIZ(vl, new ACListenerS35S0100000_15(this, 263));
            linearLayout.addView(this.LJLJJL);
            return;
        }
        if (o.LJ(state, C86008XpE.LIZ)) {
            LinearLayout linearLayout2 = this.LJLJI;
            if (linearLayout2 == null) {
                return;
            }
            linearLayout2.removeViews(1, linearLayout2.getChildCount() - 1);
            CountDownStickerStruct countDownStickerStruct4 = this.LJLIL;
            if (countDownStickerStruct4 != null) {
                str2 = countDownStickerStruct4.getTitle();
            } else {
                str2 = null;
            }
            linearLayout2.addView(wl(linearLayout2, str2, 22, 20.0f, R.attr.go));
            CountDownStickerStruct countDownStickerStruct5 = this.LJLIL;
            if (countDownStickerStruct5 != null) {
                l = Long.valueOf(countDownStickerStruct5.getMillSecond());
            } else {
                l = null;
            }
            linearLayout2.addView(wl(linearLayout2, Gl(l), 41, 12.0f, R.attr.gu));
            CountDownStickerStruct countDownStickerStruct6 = this.LJLIL;
            if (countDownStickerStruct6 != null) {
                str5 = countDownStickerStruct6.getTextAlreadySubscribed();
            }
            linearLayout2.addView(wl(linearLayout2, str5, 41, 12.0f, R.attr.gu));
            String string2 = linearLayout2.getResources().getString(R.string.dx9);
            o.LJIIIIZZ(string2, "resources.getString(R.st…ountdown_remove_reminder)");
            Context context3 = linearLayout2.getContext();
            o.LJIIIIZZ(context3, "context");
            Integer LJI2 = C79045V0n.LJI(R.attr.gq, context3);
            if (LJI2 != null) {
                i2 = LJI2.intValue();
            }
            Context context4 = linearLayout2.getContext();
            o.LJII(context4, "null cannot be cast to non-null type android.content.Context");
            SY4 vl2 = vl(linearLayout2, string2, i2, C20110qd.LIZ(context4, R.drawable.a25));
            this.LJLJJL = vl2;
            C16880lQ.LJJIZ(vl2, new ACListenerS35S0100000_15(this, 264));
            linearLayout2.addView(this.LJLJJL);
            return;
        }
        if (o.LJ(state, C86009XpF.LIZ)) {
            Al();
            return;
        }
        if (o.LJ(state, C86010XpG.LIZ)) {
            LinearLayout linearLayout3 = this.LJLJI;
            if (linearLayout3 == null) {
                return;
            }
            linearLayout3.removeViews(1, linearLayout3.getChildCount() - 1);
            CountDownStickerStruct countDownStickerStruct7 = this.LJLIL;
            if (countDownStickerStruct7 != null) {
                str = countDownStickerStruct7.getTitle();
            } else {
                str = null;
            }
            linearLayout3.addView(wl(linearLayout3, str, 22, 20.0f, R.attr.go));
            CountDownStickerStruct countDownStickerStruct8 = this.LJLIL;
            if (countDownStickerStruct8 != null) {
                l3 = Long.valueOf(countDownStickerStruct8.getMillSecond());
            }
            linearLayout3.addView(wl(linearLayout3, Gl(l3), 41, 12.0f, R.attr.gu));
            CountDownStickerStruct countDownStickerStruct9 = this.LJLIL;
            if (countDownStickerStruct9 != null) {
                j = countDownStickerStruct9.getSubscribeNum();
            } else {
                j = 0;
            }
            String LJJIIJ = C77123UOp.LJJIIJ(j);
            Resources resources = linearLayout3.getResources();
            CountDownStickerStruct countDownStickerStruct10 = this.LJLIL;
            if (countDownStickerStruct10 != null) {
                i = (int) countDownStickerStruct10.getSubscribeNum();
            } else {
                i = 0;
            }
            String quantityString = resources.getQuantityString(R.plurals.cr, i);
            o.LJIIIIZZ(quantityString, "resources.getQuantityStr…bscribeNum?.toInt() ?: 0)");
            String LLLZ = C16880lQ.LLLZ(quantityString, Arrays.copyOf(new Object[]{a1.LJ("<b>", LJJIIJ, "</b>")}, 1));
            o.LJIIIIZZ(LLLZ, "format(this, *args)");
            LJJIIJ.getClass();
            TuxTextView wl = wl(linearLayout3, LLLZ, 41, 32.0f, R.attr.gu);
            this.LJLJJLL = wl;
            linearLayout3.addView(wl);
            String string3 = linearLayout3.getResources().getString(R.string.dx2);
            o.LJIIIIZZ(string3, "resources.getString(R.st…untdown_expire_ok_button)");
            Context context5 = linearLayout3.getContext();
            o.LJIIIIZZ(context5, "context");
            Integer LJI3 = C79045V0n.LJI(R.attr.go, context5);
            if (LJI3 != null) {
                i2 = LJI3.intValue();
            }
            Context context6 = linearLayout3.getContext();
            o.LJII(context6, "null cannot be cast to non-null type android.content.Context");
            SY4 vl3 = vl(linearLayout3, string3, i2, C20110qd.LIZ(context6, R.drawable.a25));
            this.LJLJJI = vl3;
            C16880lQ.LJJIZ(vl3, new ACListenerS35S0100000_15(this, 265));
            linearLayout3.addView(this.LJLJJI);
            return;
        }
        if (!o.LJ(state, C86011XpH.LIZ)) {
            return;
        }
        if (this.LJLLL) {
            Al();
        } else {
            xl();
        }
    }

    public final void Hl(Long l, String str) {
        long j;
        int ordinal;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        AbstractC86004XpA abstractC86004XpA = this.LJLJL;
        C86007XpD c86007XpD = C86007XpD.LIZ;
        if (o.LJ(abstractC86004XpA, c86007XpD)) {
            C188727au c188727au = new C188727au();
            String str3 = this.LJLLI;
            if (str3 != null) {
                c188727au.LJIIIZ("group_id", str3);
                String str4 = this.LJLLILLLL;
                if (str4 != null) {
                    c188727au.LJIIIZ("author_id", str4);
                    String str5 = this.LJLLJ;
                    if (str5 != null) {
                        c188727au.LJIIIZ("enter_from", str5);
                        c188727au.LJ(C27331Ao3.LIZ(this.LJLIL), "countdown_time");
                        c188727au.LJIIIZ("enter_method", "live_cd_sticker");
                        FMX.LJIIL("livesdk_live_subscirbe", c188727au.LIZ);
                    } else {
                        o.LJIJI("enterFrom");
                        throw null;
                    }
                } else {
                    o.LJIJI("authorId");
                    throw null;
                }
            } else {
                o.LJIJI("groupId");
                throw null;
            }
        } else if (o.LJ(this.LJLJL, C86008XpE.LIZ)) {
            C188727au c188727au2 = new C188727au();
            String str6 = this.LJLLI;
            if (str6 != null) {
                c188727au2.LJIIIZ("group_id", str6);
                String str7 = this.LJLLILLLL;
                if (str7 != null) {
                    c188727au2.LJIIIZ("author_id", str7);
                    String str8 = this.LJLLJ;
                    if (str8 != null) {
                        c188727au2.LJIIIZ("enter_from", str8);
                        c188727au2.LJ(C27331Ao3.LIZ(this.LJLIL), "countdown_time");
                        c188727au2.LJIIIZ("enter_method", "live_cd_sticker");
                        FMX.LJIIL("livesdk_live_unsubscirbe", c188727au2.LIZ);
                    } else {
                        o.LJIJI("enterFrom");
                        throw null;
                    }
                } else {
                    o.LJIJI("authorId");
                    throw null;
                }
            } else {
                o.LJIJI("groupId");
                throw null;
            }
        }
        CountDownStickerApi countDownStickerApi = this.LJLJLJ;
        if (str2 == null) {
            str2 = "";
        }
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long j2 = j / 1000;
        if (o.LJ(this.LJLJL, c86007XpD)) {
            ordinal = EnumC35494DwQ.Subscribe.ordinal();
        } else {
            ordinal = EnumC35494DwQ.CancelSubscribe.ordinal();
        }
        countDownStickerApi.subscribe(str2, j2, ordinal).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS312S0100000_15(this, 5));
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void showNow(FragmentManager manager, String str) {
        long j;
        String aid;
        o.LJIIIZ(manager, "manager");
        super.showNow(manager, str);
        C2U8.LIZ(new C2IP(true, false));
        long currentTimeMillis = System.currentTimeMillis();
        CountDownStickerStruct countDownStickerStruct = this.LJLIL;
        if (countDownStickerStruct != null) {
            j = countDownStickerStruct.getMillSecond();
        } else {
            j = 0;
        }
        if (currentTimeMillis > j) {
            Dl(C86011XpH.LIZ, false);
        }
        Aweme aweme = this.LJLILLLLZI;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return;
        }
        this.LJLJLJ.getDetail(aid).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS312S0100000_15(this, 4));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aw9, viewGroup, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) LLLLIILL;
        this.LJLJI = linearLayout;
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.bf7);
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, new ACListenerS35S0100000_15(this, 137));
        }
        Dl(this.LJLJL, true);
        LinearLayout linearLayout2 = this.LJLJI;
        C29S c29s = null;
        if (!(linearLayout2 instanceof View)) {
            linearLayout2 = null;
        }
        if (linearLayout2 != null) {
            try {
                ViewTreeLifecycleOwner.set(linearLayout2, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(linearLayout2, this);
                C10A.LIZIZ(linearLayout2, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return linearLayout2;
    }

    public static SY4 vl(LinearLayout linearLayout, String str, int i, Drawable drawable) {
        Context context = linearLayout.getContext();
        o.LJIIIIZZ(context, "context");
        SY4 sy4 = new SY4(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        sy4.setText(str);
        sy4.setTextColor(i);
        sy4.setBackground(drawable);
        sy4.setTextSize(15.0f);
        sy4.setStateListAnimator(null);
        Context context2 = linearLayout.getContext();
        if (context2 != null) {
            layoutParams.topMargin = (int) C74275TDb.LIZIZ(context2, 36.0f);
            layoutParams.bottomMargin = (int) C74275TDb.LIZIZ(context2, 46.0f);
            layoutParams.leftMargin = (int) C74275TDb.LIZIZ(context2, 16.0f);
            layoutParams.rightMargin = (int) C74275TDb.LIZIZ(context2, 16.0f);
            sy4.setLayoutParams(layoutParams);
        }
        return sy4;
    }

    public static TuxTextView wl(LinearLayout linearLayout, String str, int i, float f, int i2) {
        Context context = linearLayout.getContext();
        o.LJIIIIZZ(context, "context");
        int i3 = 0;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        tuxTextView.setText(Html.fromHtml(str));
        Context context2 = linearLayout.getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(i2, context2);
        if (LJI != null) {
            i3 = LJI.intValue();
        }
        tuxTextView.setTextColor(i3);
        tuxTextView.setTuxFont(i);
        Context context3 = linearLayout.getContext();
        if (context3 != null) {
            layoutParams.topMargin = (int) C74275TDb.LIZIZ(context3, f);
            layoutParams.bottomMargin = (int) C74275TDb.LIZIZ(context3, 0.0f);
            layoutParams.setMarginStart((int) C74275TDb.LIZIZ(context3, 24.0f));
            layoutParams.setMarginEnd((int) C74275TDb.LIZIZ(context3, 24.0f));
            tuxTextView.setLayoutParams(layoutParams);
        }
        tuxTextView.setGravity(17);
        return tuxTextView;
    }
}
