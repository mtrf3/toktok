package Y;

import X.C157776Hd;
import X.C32I;
import X.C37692Eqm;
import X.C47261Igj;
import X.C58406Mw6;
import X.C58407Mw7;
import X.C58408Mw8;
import X.C58409Mw9;
import X.C60903NvH;
import X.C62Q;
import X.C65777Prh;
import X.C68322mC;
import X.C76800UCe;
import X.C78856UxA;
import X.C79704VPw;
import X.C79919VYd;
import X.C79920VYe;
import X.C79921VYf;
import X.C79922VYg;
import X.C79925VYj;
import X.C79931VYp;
import X.C79932VYq;
import X.C79935VYt;
import X.C79939VYx;
import X.C81062Vre;
import X.C81471VyF;
import X.C81473VyH;
import X.C81606W1a;
import X.C82241WPl;
import X.C82516Wa0;
import X.C82733WdV;
import X.C83223WlP;
import X.C83235Wlb;
import X.C83241Wlh;
import X.C83244Wlk;
import X.C83272WmC;
import X.C83278WmI;
import X.C83297Wmb;
import X.C83298Wmc;
import X.C83332WnA;
import X.EnumC81063Vrf;
import X.EnumC83299Wmd;
import X.EnumC83339WnH;
import X.F5B;
import X.InterfaceC58352MvE;
import X.InterfaceC83282WmM;
import X.InterfaceC83334WnC;
import X.InterfaceC88472Yns;
import X.OWU;
import X.OWV;
import X.OWW;
import X.OWX;
import X.VPR;
import X.VZM;
import X.VZV;
import X.VZW;
import X.ViewOnClickListenerC79923VYh;
import X.ViewOnClickListenerC79927VYl;
import X.ViewOnClickListenerC79928VYm;
import X.W3N;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.ies.xelement.picker.LynxPickerView;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.utils.ColorUtils;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ACListenerS48S0200000_14 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            case 12:
                onClick$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, view);
                return;
            case 14:
                onClick$14(this, view);
                return;
            case 15:
                onClick$15(this, view);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onClick$16(this, view);
                return;
            case 17:
                onClick$17(this, view);
                return;
            case 18:
                onClick$18(this, view);
                return;
            case 19:
                onClick$19(this, view);
                return;
            case 20:
                onClick$20(this, view);
                return;
            case 21:
                onClick$21(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        ((C81606W1a) aCListenerS48S0200000_14.l0).LJJLIIIJL(false);
        ((C81606W1a) aCListenerS48S0200000_14.l0).LJLJJL.invoke((FrameLayout) aCListenerS48S0200000_14.l1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$1(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        VZW vzw = ((LynxTabBarView) aCListenerS48S0200000_14.l0).LJLJJI;
        if (vzw != null) {
            C78856UxA c78856UxA = (C78856UxA) ((C68322mC) aCListenerS48S0200000_14.l1).element;
            if (c78856UxA != null) {
                vzw.LIZ.LJLJJL = c78856UxA;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
    }

    public static final void onClick$10(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        C82733WdV c82733WdV = (C82733WdV) aCListenerS48S0200000_14.l0;
        c82733WdV.LJLILLLLZI.LIZJ(c82733WdV.getAdapterPosition(), (View) aCListenerS48S0200000_14.l1);
    }

    public static final void onClick$11(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        C82241WPl c82241WPl = (C82241WPl) aCListenerS48S0200000_14.l0;
        EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) aCListenerS48S0200000_14.l1;
        c82241WPl.LIZLLL.onNext(effectCategoryResponse);
        c82241WPl.LJIILLIIL(effectCategoryResponse, true);
    }

    public static final void onClick$12(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        ((ViewPagerBottomSheetBehavior) aCListenerS48S0200000_14.l0).setState(5);
        ((LoginMethodListActivity) aCListenerS48S0200000_14.l1).getWindow().setDimAmount(0.0f);
    }

    public static final void onClick$13(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        ((InterfaceC83334WnC) aCListenerS48S0200000_14.l0).LIZ(EnumC83339WnH.DISLIKE, ((C83332WnA) aCListenerS48S0200000_14.l1).getBindingAdapterPosition());
    }

    public static final void onClick$14(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        ((InterfaceC83334WnC) aCListenerS48S0200000_14.l0).LIZ(EnumC83339WnH.LIKE, ((C83332WnA) aCListenerS48S0200000_14.l1).getBindingAdapterPosition());
    }

    public static final void onClick$15(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        ((InterfaceC83334WnC) aCListenerS48S0200000_14.l0).LIZ(EnumC83339WnH.UNDO, ((C83332WnA) aCListenerS48S0200000_14.l1).getBindingAdapterPosition());
    }

    public static final void onClick$16(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        C81471VyF c81471VyF = (C81471VyF) aCListenerS48S0200000_14.l0;
        c81471VyF.LJLJJL.invoke(ListProtector.get(c81471VyF.LJLJJI, ((C81473VyH) aCListenerS48S0200000_14.l1).getAdapterPosition()));
    }

    public static final void onClick$17(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        if (!((ComposerBeauty) aCListenerS48S0200000_14.l0).getEnable()) {
            InterfaceC83282WmM interfaceC83282WmM = C82516Wa0.LIZIZ;
            if (interfaceC83282WmM != null) {
                Context context = ((C83244Wlk) aCListenerS48S0200000_14.l1).LJLJLJ.getContext();
                o.LJIIIIZZ(context, "view.context");
                Context context2 = ((C83244Wlk) aCListenerS48S0200000_14.l1).LJLJLJ.getContext();
                o.LJIIIIZZ(context2, "view.context");
                String string = context2.getResources().getString(R.string.r8m);
                o.LJIIIIZZ(string, "context.resources.getStr…tring.shoot_Beauty_toast)");
                interfaceC83282WmM.LIZ(context, string);
                return;
            }
            return;
        }
        C83244Wlk c83244Wlk = (C83244Wlk) aCListenerS48S0200000_14.l1;
        AqS196S0100000_14 aqS196S0100000_14 = c83244Wlk.LJLLJ;
        if (aqS196S0100000_14 != null) {
            aqS196S0100000_14.invoke((ComposerBeauty) aCListenerS48S0200000_14.l0, Integer.valueOf(c83244Wlk.getLayoutPosition()));
        }
    }

    public static final void onClick$18(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        AqS196S0100000_14 aqS196S0100000_14 = ((C83241Wlh) aCListenerS48S0200000_14.l0).LJLLILLLL;
        if (aqS196S0100000_14 != null) {
            aqS196S0100000_14.invoke(((C83272WmC) aCListenerS48S0200000_14.l1).LIZIZ, Boolean.FALSE);
        }
    }

    public static final void onClick$19(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        if (!((ComposerBeauty) aCListenerS48S0200000_14.l0).getEnable()) {
            AqS164S0100000_14 aqS164S0100000_14 = ((C83223WlP) aCListenerS48S0200000_14.l1).LJLJL;
            if (aqS164S0100000_14 != null && !((Boolean) aqS164S0100000_14.invoke()).booleanValue()) {
                view.performHapticFeedback(17);
                return;
            }
            InterfaceC83282WmM interfaceC83282WmM = C82516Wa0.LIZIZ;
            if (interfaceC83282WmM == null) {
                return;
            }
            Context context = ((C83223WlP) aCListenerS48S0200000_14.l1).LJLJLJ.getContext();
            o.LJIIIIZZ(context, "view.context");
            Context context2 = ((C83223WlP) aCListenerS48S0200000_14.l1).LJLJLJ.getContext();
            o.LJIIIIZZ(context2, "view.context");
            String string = context2.getResources().getString(R.string.r8m);
            o.LJIIIIZZ(string, "context.resources.getStr…tring.shoot_Beauty_toast)");
            interfaceC83282WmM.LIZ(context, string);
            return;
        }
        C83223WlP c83223WlP = (C83223WlP) aCListenerS48S0200000_14.l1;
        AqS196S0100000_14 aqS196S0100000_14 = c83223WlP.LJLJJLL;
        if (aqS196S0100000_14 != null) {
            aqS196S0100000_14.invoke((ComposerBeauty) aCListenerS48S0200000_14.l0, Integer.valueOf(c83223WlP.getLayoutPosition()));
        }
    }

    public static final void onClick$2(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        ((ViewPagerBottomSheetBehavior) aCListenerS48S0200000_14.l0).setState(5);
        ((I18nSignUpActivity) aCListenerS48S0200000_14.l1).LLFII();
    }

    public static final void onClick$20(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        AqS180S0100000_14 aqS180S0100000_14 = ((C83235Wlb) aCListenerS48S0200000_14.l0).LJLLILLLL;
        if (aqS180S0100000_14 != null) {
            aqS180S0100000_14.invoke(Boolean.valueOf(((C83278WmI) aCListenerS48S0200000_14.l1).LIZIZ));
        }
    }

    public static final void onClick$21(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        C81062Vre c81062Vre = (C81062Vre) aCListenerS48S0200000_14.l0;
        if (c81062Vre.LJLJI) {
            int starStep = (int) c81062Vre.getStarStep();
            if (new BigDecimal(Float.toString(((C81062Vre) aCListenerS48S0200000_14.l0).getStarStep())).subtract(new BigDecimal(Integer.toString(starStep))).floatValue() == 0.0f) {
                starStep--;
            }
            LinearLayout linearLayout = ((C81062Vre) aCListenerS48S0200000_14.l0).LJLILLLLZI;
            o.LJI(linearLayout);
            if (linearLayout.indexOfChild(view) > starStep) {
                C81062Vre c81062Vre2 = (C81062Vre) aCListenerS48S0200000_14.l0;
                o.LJI(c81062Vre2.LJLILLLLZI);
                c81062Vre2.setStar(r0.indexOfChild(view) + 1);
                return;
            }
            LinearLayout linearLayout2 = ((C81062Vre) aCListenerS48S0200000_14.l0).LJLILLLLZI;
            o.LJI(linearLayout2);
            if (linearLayout2.indexOfChild(view) == starStep) {
                EnumC81063Vrf enumC81063Vrf = ((C81062Vre) aCListenerS48S0200000_14.l0).LJLLJ;
                Drawable.ConstantState constantState = null;
                if (enumC81063Vrf != null) {
                    if (enumC81063Vrf == EnumC81063Vrf.Full) {
                        return;
                    }
                    Drawable.ConstantState constantState2 = ((ImageView) aCListenerS48S0200000_14.l1).getDrawable().getCurrent().getConstantState();
                    Drawable drawable = ((C81062Vre) aCListenerS48S0200000_14.l0).LJLLI;
                    if (drawable != null) {
                        constantState = drawable.getConstantState();
                    }
                    if (o.LJ(constantState2, constantState)) {
                        C81062Vre c81062Vre3 = (C81062Vre) aCListenerS48S0200000_14.l0;
                        o.LJI(c81062Vre3.LJLILLLLZI);
                        c81062Vre3.setStar(r0.indexOfChild(view) + 1);
                        return;
                    }
                    C81062Vre c81062Vre4 = (C81062Vre) aCListenerS48S0200000_14.l0;
                    o.LJI(c81062Vre4.LJLILLLLZI);
                    c81062Vre4.setStar(r0.indexOfChild(view) + 0.5f);
                    return;
                }
                o.LJIJI("mStepSize");
                throw null;
            }
            C81062Vre c81062Vre5 = (C81062Vre) aCListenerS48S0200000_14.l0;
            o.LJI(c81062Vre5.LJLILLLLZI);
            c81062Vre5.setStar(r0.indexOfChild(view) + 1.0f);
            return;
        }
        c81062Vre.getClass();
    }

    public static final void onClick$3(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        W3N w3n = (W3N) aCListenerS48S0200000_14.l0;
        w3n.LJII.invoke((C62Q) aCListenerS48S0200000_14.l1, w3n);
    }

    public static final void onClick$4(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        VZV vzv = ((VZM) aCListenerS48S0200000_14.l0).LJZL;
        if (vzv != null) {
            vzv.LIZ((C78856UxA) aCListenerS48S0200000_14.l1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$5(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        int adapterPosition;
        if (((C83298Wmc) aCListenerS48S0200000_14.l0).getAdapterPosition() != -1) {
            int adapterPosition2 = ((C83298Wmc) aCListenerS48S0200000_14.l0).getAdapterPosition();
            C83297Wmb c83297Wmb = (C83297Wmb) aCListenerS48S0200000_14.l1;
            int i = c83297Wmb.LJLJJL;
            if (adapterPosition2 == i) {
                return;
            }
            C83298Wmc c83298Wmc = (C83298Wmc) aCListenerS48S0200000_14.l0;
            if (c83298Wmc.LJLJI != EnumC83299Wmd.DOWNLOADED) {
                InterfaceC88472Yns<C157776Hd, C76800UCe> interfaceC88472Yns = c83297Wmb.LJLJJI;
                if (interfaceC88472Yns != 0) {
                    interfaceC88472Yns.invoke(ListProtector.get(c83297Wmb.LJLIL, c83298Wmc.getAdapterPosition()));
                }
                adapterPosition = ((C83297Wmb) aCListenerS48S0200000_14.l1).LJLJJL;
            } else {
                InterfaceC88472Yns<C157776Hd, C76800UCe> interfaceC88472Yns2 = c83297Wmb.LJLJJI;
                if (interfaceC88472Yns2 != 0) {
                    interfaceC88472Yns2.invoke(ListProtector.get(c83297Wmb.LJLIL, c83298Wmc.getAdapterPosition()));
                }
                adapterPosition = ((C83298Wmc) aCListenerS48S0200000_14.l0).getAdapterPosition();
            }
            c83297Wmb.LJLJJL = adapterPosition;
            ((C83297Wmb) aCListenerS48S0200000_14.l1).notifyItemChanged(i);
            ((C83297Wmb) aCListenerS48S0200000_14.l1).notifyItemChanged(((C83298Wmc) aCListenerS48S0200000_14.l0).getAdapterPosition());
        }
    }

    public static final void onClick$6(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        ReadableArray asArray;
        String asString;
        InterfaceC58352MvE c58406Mw6;
        InterfaceC58352MvE c58409Mw9;
        SimpleDateFormat simpleDateFormat;
        InterfaceC58352MvE c58407Mw7;
        SimpleDateFormat simpleDateFormat2;
        ReadableArray asArray2;
        ArrayList<Object> arrayList;
        ArrayList arrayList2;
        InterfaceC58352MvE c58408Mw8;
        ReadableArray asArray3;
        ReadableArray asArray4;
        String string;
        LynxPickerView lynxPickerView = (LynxPickerView) aCListenerS48S0200000_14.l0;
        if (!lynxPickerView.LJLILLLLZI) {
            String str = lynxPickerView.LJLIL;
            int i = 0;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            switch (str.hashCode()) {
                case -1364270024:
                    if (!str.equals("multiSelector")) {
                        return;
                    }
                    LynxPickerView lynxPickerView2 = (LynxPickerView) aCListenerS48S0200000_14.l0;
                    Context context = (Context) aCListenerS48S0200000_14.l1;
                    F5B f5b = lynxPickerView2.LJLJJI;
                    if (f5b == null || f5b.getType() != ReadableType.Array || f5b.isNull() || (asArray2 = f5b.asArray()) == null) {
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size = asArray2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        ReadableArray array = asArray2.getArray(i2);
                        ArrayList arrayList4 = new ArrayList();
                        if (!array.isNull(i)) {
                            if (array.getType(i) == ReadableType.String) {
                                ArrayList<Object> asArrayList = array.asArrayList();
                                if (asArrayList != null) {
                                    arrayList4.addAll(C65777Prh.LIZIZ(asArrayList));
                                } else {
                                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
                                }
                            } else {
                                F5B f5b2 = lynxPickerView2.LJLJJL;
                                if (f5b2 != null && (asArray4 = f5b2.asArray()) != null && (string = asArray4.getString(i2)) != null) {
                                    int size2 = array.size();
                                    for (int i3 = 0; i3 < size2; i3++) {
                                        String string2 = array.getMap(i3).getString(string);
                                        o.LJFF(string2, "column.getMap(j).getString(key)");
                                        arrayList4.add(string2);
                                    }
                                }
                            }
                        }
                        arrayList3.add(arrayList4);
                        i2++;
                        i = 0;
                    }
                    F5B f5b3 = lynxPickerView2.LJLJI;
                    if (f5b3 != null && (asArray3 = f5b3.asArray()) != null) {
                        arrayList = asArray3.asArrayList();
                    } else {
                        arrayList = null;
                    }
                    if (!C65777Prh.LJI(arrayList) || arrayList == null) {
                        arrayList2 = null;
                    } else {
                        arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                        Iterator<Object> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(Integer.valueOf((int) ((Number) it.next()).doubleValue()));
                        }
                    }
                    C79939VYx c79939VYx = new C79939VYx(context);
                    if (lynxPickerView2.LJLL != null || lynxPickerView2.LJLLI != null || (c58408Mw8 = lynxPickerView2.LJZL) == null) {
                        c58408Mw8 = new C58408Mw8(lynxPickerView2);
                    }
                    C79925VYj c79925VYj = c79939VYx.LIZ;
                    c79925VYj.LJIILL = c58408Mw8;
                    c79925VYj.LJIIL = new OWV(lynxPickerView2);
                    c79925VYj.LJIIJJI = new C79704VPw(lynxPickerView2);
                    c79939VYx.LIZ().LIZ = new C79920VYe(lynxPickerView2);
                    c79939VYx.LIZ.LJIILIIL = new ArrayList(arrayList3);
                    if (arrayList2 == null) {
                        c79939VYx.LIZ.LJIILJJIL = null;
                    } else {
                        c79939VYx.LIZ.LJIILJJIL = new ArrayList(arrayList2);
                    }
                    String str4 = lynxPickerView2.LJLLILLLL;
                    if (str4 != null) {
                        c79939VYx.LIZ().LJ = ColorUtils.LIZ(str4);
                    }
                    String str5 = lynxPickerView2.LJLLJ;
                    if (str5 != null) {
                        c79939VYx.LIZ().LJFF = ColorUtils.LIZ(str5);
                    }
                    String str6 = lynxPickerView2.LJLLL;
                    if (str6 != null) {
                        c79939VYx.LIZ().LIZLLL = str6;
                    }
                    String str7 = lynxPickerView2.LJLLLL;
                    if (str7 != null) {
                        c79939VYx.LIZ().LJI = ColorUtils.LIZ(str7);
                    }
                    String str8 = lynxPickerView2.LJLLLLLL;
                    if (str8 != null) {
                        c79939VYx.LIZ().LJII = (int) VPR.LIZIZ(str8, 0.0f);
                    }
                    new ViewOnClickListenerC79923VYh(c79939VYx.LIZ).LJII(lynxPickerView2.mView);
                    return;
                case 3076014:
                    if (!str.equals("date")) {
                        return;
                    }
                    LynxPickerView lynxPickerView3 = (LynxPickerView) aCListenerS48S0200000_14.l0;
                    Context context2 = (Context) aCListenerS48S0200000_14.l1;
                    String str9 = lynxPickerView3.LJLJJLL;
                    String str10 = lynxPickerView3.LJLJL;
                    F5B f5b4 = lynxPickerView3.LJLJI;
                    if (f5b4 != null) {
                        str2 = f5b4.asString();
                    }
                    String str11 = lynxPickerView3.LJLJLJ;
                    String str12 = lynxPickerView3.LJLJLLL;
                    C79931VYp c79931VYp = new C79931VYp(context2);
                    if (lynxPickerView3.LJLL != null || lynxPickerView3.LJLLI != null || (c58407Mw7 = lynxPickerView3.LJZL) == null) {
                        c58407Mw7 = new C58407Mw7(lynxPickerView3);
                    }
                    C79935VYt c79935VYt = c79931VYp.LIZ;
                    c79935VYt.LJIIZILJ = c58407Mw7;
                    c79935VYt.LJIIJJI = new OWW(lynxPickerView3);
                    c79931VYp.LIZIZ().LIZ = new C79919VYd(lynxPickerView3);
                    if (str12 == null) {
                        c79931VYp.LIZIZ = "-";
                    } else {
                        c79931VYp.LIZIZ = str12;
                    }
                    if ("year".equals(str11)) {
                        c79931VYp.LIZ.LJIIL = new boolean[]{true, false, false};
                    } else if ("month".equals(str11)) {
                        c79931VYp.LIZ.LJIIL = new boolean[]{true, true, false};
                    } else if ("day".equals(str11)) {
                        c79931VYp.LIZ.LJIIL = new boolean[]{true, true, true};
                    } else {
                        c79931VYp.LIZ.LJIILIIL = new boolean[]{true, true, true};
                    }
                    c79931VYp.LIZLLL = str9;
                    c79931VYp.LJ = str10;
                    c79931VYp.LIZJ = str2;
                    String str13 = lynxPickerView3.LJLLILLLL;
                    if (str13 != null) {
                        c79931VYp.LIZIZ().LJ = ColorUtils.LIZ(str13);
                    }
                    String str14 = lynxPickerView3.LJLLJ;
                    if (str14 != null) {
                        c79931VYp.LIZIZ().LJFF = ColorUtils.LIZ(str14);
                    }
                    String str15 = lynxPickerView3.LJLLL;
                    if (str15 != null) {
                        c79931VYp.LIZIZ().LIZLLL = str15;
                    }
                    String str16 = lynxPickerView3.LJLLLL;
                    if (str16 != null) {
                        c79931VYp.LIZIZ().LJI = ColorUtils.LIZ(str16);
                    }
                    String str17 = lynxPickerView3.LJLLLLLL;
                    if (str17 != null) {
                        c79931VYp.LIZIZ().LJII = (int) VPR.LIZIZ(str17, 0.0f);
                    }
                    c79931VYp.LIZ.LJIJ = c79931VYp.LIZIZ;
                    try {
                        simpleDateFormat2 = new SimpleDateFormat(c79931VYp.LIZ(), Locale.getDefault());
                    } catch (Exception unused) {
                        String str18 = c79931VYp.LIZLLL;
                        if (str18 != null) {
                            c79931VYp.LIZLLL = str18.replace(c79931VYp.LIZIZ, "-");
                        }
                        String str19 = c79931VYp.LJ;
                        if (str19 != null) {
                            c79931VYp.LJ = str19.replace(c79931VYp.LIZIZ, "-");
                        }
                        String str20 = c79931VYp.LIZJ;
                        if (str20 != null) {
                            c79931VYp.LIZJ = str20.replace(c79931VYp.LIZIZ, "-");
                        }
                        c79931VYp.LIZIZ = "-";
                        simpleDateFormat2 = new SimpleDateFormat(c79931VYp.LIZ(), Locale.getDefault());
                    }
                    String str21 = c79931VYp.LIZLLL;
                    if (str21 != null) {
                        try {
                            Date parse = simpleDateFormat2.parse(str21);
                            c79931VYp.LIZ.LJIILL = Calendar.getInstance();
                            c79931VYp.LIZ.LJIILL.setTime(parse);
                        } catch (ParseException unused2) {
                        }
                    }
                    String str22 = c79931VYp.LJ;
                    if (str22 != null) {
                        try {
                            Date parse2 = simpleDateFormat2.parse(str22);
                            c79931VYp.LIZ.LJIILLIIL = Calendar.getInstance();
                            c79931VYp.LIZ.LJIILLIIL.setTime(parse2);
                        } catch (ParseException unused3) {
                        }
                    }
                    String str23 = c79931VYp.LIZJ;
                    if (str23 != null) {
                        try {
                            Date parse3 = simpleDateFormat2.parse(str23);
                            c79931VYp.LIZ.LJIILJJIL = Calendar.getInstance();
                            c79931VYp.LIZ.LJIILJJIL.setTime(parse3);
                        } catch (ParseException unused4) {
                        }
                    }
                    new ViewOnClickListenerC79927VYl(c79931VYp.LIZ).LJII(lynxPickerView3.mView);
                    return;
                case 3560141:
                    if (!str.equals("time")) {
                        return;
                    }
                    LynxPickerView lynxPickerView4 = (LynxPickerView) aCListenerS48S0200000_14.l0;
                    Context context3 = (Context) aCListenerS48S0200000_14.l1;
                    String str24 = lynxPickerView4.LJLJJLL;
                    String str25 = lynxPickerView4.LJLJL;
                    F5B f5b5 = lynxPickerView4.LJLJI;
                    if (f5b5 != null) {
                        str3 = f5b5.asString();
                    }
                    String str26 = lynxPickerView4.LJLJLJ;
                    String str27 = lynxPickerView4.LJLJLLL;
                    C79932VYq c79932VYq = new C79932VYq(context3);
                    if (lynxPickerView4.LJLL != null || lynxPickerView4.LJLLI != null || (c58409Mw9 = lynxPickerView4.LJZL) == null) {
                        c58409Mw9 = new C58409Mw9(lynxPickerView4);
                    }
                    C79935VYt c79935VYt2 = c79932VYq.LIZ;
                    c79935VYt2.LJIIZILJ = c58409Mw9;
                    c79935VYt2.LJIIJJI = new OWX(lynxPickerView4);
                    c79932VYq.LIZIZ().LIZ = new C79922VYg(lynxPickerView4);
                    if (str27 == null) {
                        c79932VYq.LIZIZ = ":";
                    } else {
                        c79932VYq.LIZIZ = str27;
                    }
                    if ("hour".equals(str26)) {
                        c79932VYq.LIZ.LJIILIIL = new boolean[]{true, false, false};
                    } else if ("minute".equals(str26)) {
                        c79932VYq.LIZ.LJIILIIL = new boolean[]{true, true, false};
                    } else if ("second".equals(str26)) {
                        c79932VYq.LIZ.LJIILIIL = new boolean[]{true, true, true};
                    } else {
                        c79932VYq.LIZ.LJIILIIL = new boolean[]{true, true, false};
                    }
                    c79932VYq.LIZLLL = str24;
                    c79932VYq.LJ = str25;
                    c79932VYq.LIZJ = str3;
                    String str28 = lynxPickerView4.LJLLILLLL;
                    if (str28 != null) {
                        c79932VYq.LIZIZ().LJ = ColorUtils.LIZ(str28);
                    }
                    String str29 = lynxPickerView4.LJLLJ;
                    if (str29 != null) {
                        c79932VYq.LIZIZ().LJFF = ColorUtils.LIZ(str29);
                    }
                    String str30 = lynxPickerView4.LJLLL;
                    if (str30 != null) {
                        c79932VYq.LIZIZ().LIZLLL = str30;
                    }
                    String str31 = lynxPickerView4.LJLLLL;
                    if (str31 != null) {
                        c79932VYq.LIZIZ().LJI = ColorUtils.LIZ(str31);
                    }
                    String str32 = lynxPickerView4.LJLLLLLL;
                    if (str32 != null) {
                        c79932VYq.LIZIZ().LJII = (int) VPR.LIZIZ(str32, 0.0f);
                    }
                    c79932VYq.LIZ.LJIJ = c79932VYq.LIZIZ;
                    try {
                        simpleDateFormat = new SimpleDateFormat(c79932VYq.LIZ(), Locale.getDefault());
                    } catch (Exception unused5) {
                        String str33 = c79932VYq.LIZLLL;
                        if (str33 != null) {
                            c79932VYq.LIZLLL = str33.replace(c79932VYq.LIZIZ, ":");
                        }
                        String str34 = c79932VYq.LJ;
                        if (str34 != null) {
                            c79932VYq.LJ = str34.replace(c79932VYq.LIZIZ, ":");
                        }
                        String str35 = c79932VYq.LIZJ;
                        if (str35 != null) {
                            c79932VYq.LIZJ = str35.replace(c79932VYq.LIZIZ, ":");
                        }
                        c79932VYq.LIZIZ = ":";
                        simpleDateFormat = new SimpleDateFormat(c79932VYq.LIZ(), Locale.getDefault());
                    }
                    String str36 = c79932VYq.LIZLLL;
                    if (str36 != null) {
                        try {
                            Date parse4 = simpleDateFormat.parse(str36);
                            c79932VYq.LIZ.LJIILL = Calendar.getInstance();
                            c79932VYq.LIZ.LJIILL.setTime(parse4);
                        } catch (ParseException unused6) {
                        }
                    }
                    C79935VYt c79935VYt3 = c79932VYq.LIZ;
                    if (c79935VYt3.LJIILL == null) {
                        c79935VYt3.LJIILL = Calendar.getInstance();
                        c79932VYq.LIZ.LJIILL.set(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 0, 1, 0, 0, 0);
                    }
                    String str37 = c79932VYq.LJ;
                    if (str37 != null) {
                        try {
                            Date parse5 = simpleDateFormat.parse(str37);
                            c79932VYq.LIZ.LJIILLIIL = Calendar.getInstance();
                            c79932VYq.LIZ.LJIILLIIL.setTimeInMillis(parse5.getTime());
                        } catch (ParseException unused7) {
                        }
                    }
                    C79935VYt c79935VYt4 = c79932VYq.LIZ;
                    if (c79935VYt4.LJIILLIIL == null) {
                        c79935VYt4.LJIILLIIL = Calendar.getInstance();
                        c79932VYq.LIZ.LJIILLIIL.set(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 0, 1, 23, 59, 59);
                    }
                    String str38 = c79932VYq.LIZJ;
                    if (str38 != null) {
                        try {
                            Date parse6 = simpleDateFormat.parse(str38);
                            c79932VYq.LIZ.LJIILJJIL = Calendar.getInstance();
                            c79932VYq.LIZ.LJIILJJIL.setTime(parse6);
                        } catch (ParseException unused8) {
                        }
                    }
                    C79935VYt c79935VYt5 = c79932VYq.LIZ;
                    if (c79935VYt5.LJIILJJIL == null) {
                        c79935VYt5.LJIILJJIL = Calendar.getInstance();
                    }
                    new ViewOnClickListenerC79928VYm(c79932VYq.LIZ).LJII(lynxPickerView4.mView);
                    return;
                case 1191572447:
                    if (!str.equals("selector")) {
                        return;
                    }
                    LynxPickerView lynxPickerView5 = (LynxPickerView) aCListenerS48S0200000_14.l0;
                    Context context4 = (Context) aCListenerS48S0200000_14.l1;
                    F5B f5b6 = lynxPickerView5.LJLJJI;
                    if (f5b6 == null || f5b6.getType() != ReadableType.Array || f5b6.isNull() || (asArray = f5b6.asArray()) == null || asArray.size() <= 0 || asArray.isNull(0)) {
                        return;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    if (asArray.getType(0) == ReadableType.String) {
                        ArrayList<Object> asArrayList2 = asArray.asArrayList();
                        if (asArrayList2 != null) {
                            arrayList5.addAll(asArrayList2);
                        } else {
                            throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        }
                    } else {
                        F5B f5b7 = lynxPickerView5.LJLJJL;
                        if (f5b7 != null && (asString = f5b7.asString()) != null) {
                            int size3 = asArray.size();
                            for (int i4 = 0; i4 < size3; i4++) {
                                String string3 = asArray.getMap(i4).getString(asString);
                                o.LJFF(string3, "array.getMap(i).getString(key)");
                                arrayList5.add(string3);
                            }
                        }
                    }
                    F5B f5b8 = lynxPickerView5.LJLJI;
                    if (f5b8 != null) {
                        num = Integer.valueOf(f5b8.asInt());
                    }
                    C79939VYx c79939VYx2 = new C79939VYx(context4);
                    if (lynxPickerView5.LJLL != null || lynxPickerView5.LJLLI != null || (c58406Mw6 = lynxPickerView5.LJZL) == null) {
                        c58406Mw6 = new C58406Mw6(lynxPickerView5, arrayList5);
                    }
                    C79925VYj c79925VYj2 = c79939VYx2.LIZ;
                    c79925VYj2.LJIILL = c58406Mw6;
                    c79925VYj2.LJIIL = new OWU(lynxPickerView5, arrayList5);
                    c79939VYx2.LIZ().LIZ = new C79921VYf(lynxPickerView5, arrayList5);
                    c79939VYx2.LIZ.LJIILIIL = new ArrayList(C47261Igj.LJJIJIL(arrayList5));
                    if (num != null) {
                        c79939VYx2.LIZ.LJIILJJIL = new ArrayList(C47261Igj.LJJIJIL(Integer.valueOf(num.intValue())));
                    }
                    String str39 = lynxPickerView5.LJLLILLLL;
                    if (str39 != null) {
                        c79939VYx2.LIZ().LJ = ColorUtils.LIZ(str39);
                    }
                    String str40 = lynxPickerView5.LJLLJ;
                    if (str40 != null) {
                        c79939VYx2.LIZ().LJFF = ColorUtils.LIZ(str40);
                    }
                    String str41 = lynxPickerView5.LJLLL;
                    if (str41 != null) {
                        c79939VYx2.LIZ().LIZLLL = str41;
                    }
                    String str42 = lynxPickerView5.LJLLLL;
                    if (str42 != null) {
                        c79939VYx2.LIZ().LJI = ColorUtils.LIZ(str42);
                    }
                    String str43 = lynxPickerView5.LJLLLLLL;
                    if (str43 != null) {
                        c79939VYx2.LIZ().LJII = (int) VPR.LIZIZ(str43, 0.0f);
                    }
                    new ViewOnClickListenerC79923VYh(c79939VYx2.LIZ).LJII(lynxPickerView5.mView);
                    return;
                default:
                    return;
            }
        }
    }

    public static final void onClick$7(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        C60903NvH.LJIIJJI().LJJI().sceneReport("click_music_edit");
        C82733WdV c82733WdV = (C82733WdV) aCListenerS48S0200000_14.l0;
        c82733WdV.LJLILLLLZI.LIZ(c82733WdV.getAdapterPosition(), (View) aCListenerS48S0200000_14.l1);
    }

    public static final void onClick$8(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        C82733WdV c82733WdV = (C82733WdV) aCListenerS48S0200000_14.l0;
        c82733WdV.LJLILLLLZI.LJII(c82733WdV.getAdapterPosition(), (View) aCListenerS48S0200000_14.l1);
    }

    public static final void onClick$9(ACListenerS48S0200000_14 aCListenerS48S0200000_14, View view) {
        C82733WdV c82733WdV = (C82733WdV) aCListenerS48S0200000_14.l0;
        c82733WdV.LJLILLLLZI.LJI(c82733WdV.getAdapterPosition(), (View) aCListenerS48S0200000_14.l1);
    }

    public ACListenerS48S0200000_14(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
