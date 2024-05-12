package kotlin.jvm.internal;

import X.AET;
import X.AbstractC65781Prl;
import X.AbstractC94370afu;
import X.ActivityC45651qj;
import X.C04330Ez;
import X.C0A2;
import X.C141335gf;
import X.C16330kX;
import X.C16880lQ;
import X.C2068389v;
import X.C25991AHz;
import X.C26045AKb;
import X.C36636EZk;
import X.C3C4;
import X.C3C5;
import X.C43I;
import X.C76800UCe;
import X.C93410aQQ;
import X.C93478aRW;
import X.C93607aTb;
import X.C93622aTq;
import X.C93670aUc;
import X.C93696aV2;
import X.C93729aVZ;
import X.C93742aVm;
import X.C93794aWc;
import X.C93804aWm;
import X.C93902aYM;
import X.C93922aYg;
import X.C94033aaT;
import X.C94194ad4;
import X.C94203adD;
import X.C94255ae3;
import X.C94270aeI;
import X.C94302aeo;
import X.C94379ag3;
import X.C94413agb;
import X.C94510aiA;
import X.C94530aiU;
import X.C94618aju;
import X.C94620ajw;
import X.C94661akb;
import X.C94757am9;
import X.C94952apI;
import X.C94968apY;
import X.EnumC93823aX5;
import X.EnumC93896aYG;
import X.InterfaceC88472Yns;
import X.InterfaceC93654aUM;
import X.OSZ;
import X.SY4;
import X.XJL;
import X.XKS;
import X.XKX;
import Y.IDCListenerS262S0100000_42;
import Y.IDCListenerS86S0200000_42;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.effectcreatormobile.behaviour.viewmodel.PreviewViewModel;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.ckeapi.api.text.TextModel;
import com.bytedance.effectcreatormobile.modelselect.model.ModelViewModel;
import com.bytedance.effectcreatormobile.objectselect.AssetsFragment;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.TT2DSPPlatformInfo;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.MusicDspSheetAssem;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.MusicDspSheetDialogFragment;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel;
import com.ss.android.ugc.aweme.music.app.auth.setting.page.MusicAuthPlatformsSettingPage;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* loaded from: classes34.dex */
public class IDqS175S0200000_42 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case 20:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(SY4 button) {
        o.LJIIIZ(button, "button");
        button.setText(R.string.pyj);
        button.setButtonStartIcon(Integer.valueOf(R.raw.icon_arrow_clockwise));
        button.setButtonVariant(1);
        button.setButtonSize(3);
        C16880lQ.LJJIZ(button, new IDCListenerS86S0200000_42((MusicDspSheetAssem) this.l0, (ActivityC45651qj) this.l1, 0));
    }

    public static final Object invoke$0(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        Integer num;
        C94968apY it = (C94968apY) obj;
        o.LJIIIZ(it, "it");
        if (((DspPlatform) iDqS175S0200000_42.l0).getValue() == ((C94413agb) iDqS175S0200000_42.l1).LJLJJI.LJZI.getDspPlatform()) {
            num = Integer.valueOf(R.string.bb1);
        } else {
            num = null;
        }
        TT2DSPPlatformInfo dspPlatformInfo = it.LJZI;
        String title = it.LJZL;
        C2068389v c2068389v = it.LL;
        View.OnClickListener onClickListener = it.LLD;
        Object obj2 = it.LLF;
        boolean z = it.LLFF;
        AET cellVariant = it.LLFII;
        boolean z2 = it.LLFZ;
        String str = it.LLI;
        boolean z3 = it.LLIFFJFJJ;
        boolean z4 = it.LLII;
        View.OnClickListener onClickListener2 = it.LLIIII;
        o.LJIIIZ(dspPlatformInfo, "dspPlatformInfo");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(cellVariant, "cellVariant");
        return new C94968apY(dspPlatformInfo, title, c2068389v, onClickListener, obj2, z, num, cellVariant, z2, str, z3, z4, onClickListener2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(IDqS175S0200000_42 iDqS175S0200000_42, Object it) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        o.LJIIIZ(it, "it");
        PreviewViewModel Jl = ((C94530aiU) iDqS175S0200000_42.l0).LJLIL.Jl();
        AbstractC94370afu command = ((C94530aiU) iDqS175S0200000_42.l0).LJLILLLLZI;
        Jl.getClass();
        o.LJIIIZ(command, "command");
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("interaction_add_newaction");
        }
        command.LIZJ();
        Jl.jv0(null);
        C94530aiU c94530aiU = (C94530aiU) iDqS175S0200000_42.l0;
        c94530aiU.LJLIL.Ll(c94530aiU.LJLILLLLZI);
        C94194ad4 c94194ad4 = (C94194ad4) ((C94530aiU) iDqS175S0200000_42.l0).LJLIL.Al();
        if (c94194ad4 != null && (recyclerView = c94194ad4.LJLJI) != null) {
            if (C16330kX.LIZJ(recyclerView) && !recyclerView.isLayoutRequested()) {
                C94194ad4 c94194ad42 = (C94194ad4) ((C94530aiU) iDqS175S0200000_42.l0).LJLIL.Al();
                if (c94194ad42 != null && (recyclerView2 = c94194ad42.LJLJI) != null) {
                    C0A2 layoutManager = recyclerView2.getLayoutManager();
                    if (layoutManager != null) {
                        RecyclerView.ViewHolder LJJIJIL = recyclerView2.LJJIJIL((View) iDqS175S0200000_42.l1);
                        int LLILLJJLI = ((LinearLayoutManager) layoutManager).LLILLJJLI();
                        if (LJJIJIL != null && LLILLJJLI == LJJIJIL.getAdapterPosition()) {
                            View view = LJJIJIL.itemView;
                            o.LJIIIIZZ(view, "vh.itemView");
                            int i = C93729aVZ.LIZ(view).bottom - C93729aVZ.LIZ(recyclerView2).bottom;
                            if (i > 0) {
                                recyclerView2.LJLIIIL(0, i);
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    }
                }
            } else {
                recyclerView.addOnLayoutChangeListener(new IDCListenerS262S0100000_42(iDqS175S0200000_42, 3));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS175S0200000_42 iDqS175S0200000_42, Object it) {
        o.LJIIIZ(it, "it");
        C94618aju c94618aju = (C94618aju) iDqS175S0200000_42.l0;
        c94618aju.LJLJI.invoke((C94033aaT) iDqS175S0200000_42.l1, c94618aju);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS175S0200000_42 iDqS175S0200000_42, Object it) {
        o.LJIIIZ(it, "it");
        C94620ajw c94620ajw = (C94620ajw) iDqS175S0200000_42.l0;
        c94620ajw.LJLJI.invoke((C94033aaT) iDqS175S0200000_42.l1, c94620ajw);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        View receiver = (View) obj;
        o.LJIIIZ(receiver, "$receiver");
        ((C93696aV2) iDqS175S0200000_42.l0).LJLJL = receiver;
        C93729aVZ.LIZJ(receiver);
        receiver.setBackground(((Context) iDqS175S0200000_42.l1).getDrawable(R.drawable.dfp));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        AppCompatImageView receiver = (AppCompatImageView) obj;
        o.LJIIIZ(receiver, "$receiver");
        receiver.setPadding(C93742aVm.LIZIZ(6), C93742aVm.LIZIZ(6), C93742aVm.LIZIZ(6), C93742aVm.LIZIZ(6));
        receiver.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ((C93794aWc) iDqS175S0200000_42.l0).LJLIL = receiver;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.mutate();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C93742aVm.LIZIZ(4));
        gradientDrawable.setColor(C04330Ez.LIZIZ((Context) iDqS175S0200000_42.l1, R.color.adm));
        receiver.setBackground(gradientDrawable);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        TextView receiver = (TextView) obj;
        o.LJIIIZ(receiver, "$receiver");
        receiver.setPadding(0, C93410aQQ.LIZIZ(5), 0, C93410aQQ.LIZIZ(5));
        receiver.setMaxLines(1);
        receiver.setEllipsize(TextUtils.TruncateAt.END);
        receiver.setTypeface(Typeface.DEFAULT);
        receiver.setTextColor(C04330Ez.LIZIZ((Context) iDqS175S0200000_42.l1, R.color.adn));
        receiver.setTextSize(15.0f);
        receiver.setText(((C93622aTq) iDqS175S0200000_42.l0).LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        AppCompatTextView receiver = (AppCompatTextView) obj;
        o.LJIIIZ(receiver, "$receiver");
        ((C93804aWm) iDqS175S0200000_42.l0).LJLILLLLZI = receiver;
        receiver.setTypeface(Typeface.DEFAULT_BOLD);
        receiver.setTextSize(2, 17.0f);
        receiver.setTextColor(C04330Ez.LIZIZ((Context) iDqS175S0200000_42.l1, R.color.adn));
        receiver.setMaxLines(1);
        receiver.setEllipsize(TextUtils.TruncateAt.END);
        receiver.setGravity(8388611);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        LinearLayout receiver = (LinearLayout) obj;
        o.LJIIIZ(receiver, "$receiver");
        ((C93607aTb) iDqS175S0200000_42.l0).LIZIZ = receiver;
        receiver.setGravity(1);
        receiver.setOrientation(1);
        receiver.setBackground(((Context) iDqS175S0200000_42.l1).getDrawable(((C93607aTb) iDqS175S0200000_42.l0).LIZLLL.getDrawerViewBgRes()));
        C93902aYM.LIZ(((C93607aTb) iDqS175S0200000_42.l0).LIZLLL.LJFF(receiver), receiver);
        FrameLayout frameLayout = new FrameLayout((Context) iDqS175S0200000_42.l1);
        frameLayout.setLayoutParams(C93902aYM.LIZJ(receiver, -1, -1, 0, 0, null, null, null, null, null, null, 1020));
        new IDqS419S0100000_42(iDqS175S0200000_42, 112).invoke(frameLayout);
        C93902aYM.LIZ(frameLayout, receiver);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        C94379ag3 state = (C94379ag3) obj;
        o.LJIIIZ(state, "state");
        ((C25991AHz) iDqS175S0200000_42.l0).LJIILIIL(o.LJ(((C94510aiA) iDqS175S0200000_42.l1).LJLIL.LIZLLL, state.LJLILLLLZI));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        C94952apI setState = (C94952apI) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C94952apI.LIZ(setState, null, new C43I(new OSZ((TT2DSPPlatformInfo) iDqS175S0200000_42.l0, (TT2DSPSongInfo) iDqS175S0200000_42.l1)), null, null, null, 29);
    }

    public static final Object invoke$19(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        ((AssetsFragment) iDqS175S0200000_42.l1).LJLJI.LIZ.set(true);
        ((AssetsFragment) iDqS175S0200000_42.l1).U0(((C94203adD) iDqS175S0200000_42.l0).LJLJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        String str = (String) obj;
        if (str == null || str.length() == 0) {
            XJL xjl = (XJL) iDqS175S0200000_42.l0;
            C3C4 LIZ = C141335gf.LIZ(new Exception("fetch face model picture fail"));
            C3C5.m7constructorimpl(LIZ);
            xjl.resumeWith(LIZ);
        } else {
            C94255ae3 c94255ae3 = (C94255ae3) iDqS175S0200000_42.l1;
            c94255ae3.getClass();
            o.LJIIIZ(str, "<set-?>");
            c94255ae3.LJLJLJ = str;
            XJL xjl2 = (XJL) iDqS175S0200000_42.l0;
            C94255ae3 c94255ae32 = (C94255ae3) iDqS175S0200000_42.l1;
            C3C5.m7constructorimpl(c94255ae32);
            xjl2.resumeWith(c94255ae32);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        String str;
        String str2;
        String res = (String) obj;
        o.LJIIIZ(res, "res");
        AssetsFragment assetsFragment = (AssetsFragment) iDqS175S0200000_42.l0;
        String str3 = ((TextModel) iDqS175S0200000_42.l1).text;
        Bundle arguments = assetsFragment.getArguments();
        if (arguments == null || (str = arguments.getString("type_name")) == null) {
            str = "";
        }
        String Hl = ((AssetsFragment) iDqS175S0200000_42.l0).Hl();
        EnumC93823aX5 enumC93823aX5 = EnumC93823aX5.Text;
        Bundle arguments2 = ((AssetsFragment) iDqS175S0200000_42.l0).getArguments();
        if (arguments2 == null || (str2 = arguments2.getString("key_effect_identity")) == null) {
            str2 = "";
        }
        String json = GsonProtectorUtils.toJson(new Gson(), (TextModel) iDqS175S0200000_42.l1);
        o.LJIIIIZZ(json, "Gson().toJson(textModel)");
        assetsFragment.Jl(new C94270aeI(str3, str, Hl, res, enumC93823aX5, str2, json, ((AssetsFragment) iDqS175S0200000_42.l0).Gl(), ((AssetsFragment) iDqS175S0200000_42.l0).Dl()), false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        String str;
        String num;
        Integer num2 = (Integer) obj;
        C26045AKb c26045AKb = new C26045AKb((MusicAuthPlatformsSettingPage) iDqS175S0200000_42.l0);
        c26045AKb.LJIIIZ(((MusicAuthPlatformsSettingPage) iDqS175S0200000_42.l0).getString(R.string.dtj));
        c26045AKb.LJIIJ();
        DspPlatform dspPlatform = (DspPlatform) iDqS175S0200000_42.l1;
        DspPlatform dspPlatform2 = DspPlatform.SPOTIFY;
        String str2 = "";
        if (dspPlatform != dspPlatform2 || C93922aYg.LJFF(dspPlatform2).length() != 0) {
            str = "";
        } else {
            str = "1";
        }
        if (num2 != null && (num = num2.toString()) != null) {
            str2 = num;
        }
        C94302aeo.LJJII(CardStruct.IStatusCode.DEFAULT, str2, (DspPlatform) iDqS175S0200000_42.l1, null, null, false, "unlink", "music_setting", "null", str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(IDqS175S0200000_42 iDqS175S0200000_42, Object it) {
        o.LJIIIZ(it, "it");
        ActivityC45651qj mo49getActivity = ((MusicAuthPlatformsSettingPage) iDqS175S0200000_42.l0).mo49getActivity();
        DspPlatform dspPlatform = (DspPlatform) iDqS175S0200000_42.l1;
        C94302aeo.LJJIJ(mo49getActivity, dspPlatform, EnumC93896aYG.UNLINK, new IDqS179S0200000_42((MusicAuthPlatformsSettingPage) iDqS175S0200000_42.l0, dspPlatform, 18), new IDqS175S0200000_42((MusicAuthPlatformsSettingPage) iDqS175S0200000_42.l0, (DspPlatform) iDqS175S0200000_42.l1, 21));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope((ModelViewModel) iDqS175S0200000_42.l0), C36636EZk.LIZ, null, new C94757am9(iDqS175S0200000_42, null), 2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        String res = (String) obj;
        o.LJIIIZ(res, "res");
        long longValue = ((Long) iDqS175S0200000_42.l1).longValue();
        EnumC93823aX5 resourceFromType = EnumC93823aX5.Text;
        String json = GsonProtectorUtils.toJson(new Gson(), (TextModel) iDqS175S0200000_42.l0);
        o.LJIIIIZZ(json, "Gson().toJson(textModel)");
        o.LJIIIZ(resourceFromType, "resourceFromType");
        CKEffectEditorContext.LIZLLL(new C94661akb(longValue, res, json, resourceFromType));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        ((C93478aRW) iDqS175S0200000_42.l0).LIZJ.invoke();
        InterfaceC93654aUM interfaceC93654aUM = (InterfaceC93654aUM) iDqS175S0200000_42.l1;
        if (interfaceC93654aUM != null) {
            interfaceC93654aUM.LIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        String str;
        Integer num = (Integer) obj;
        C94302aeo c94302aeo = C94302aeo.LJLIL;
        if (num == null || (str = num.toString()) == null) {
            str = "";
        }
        DspPlatform dspPlatform = (DspPlatform) iDqS175S0200000_42.l0;
        MusicDspSheetDialogFragment musicDspSheetDialogFragment = (MusicDspSheetDialogFragment) iDqS175S0200000_42.l1;
        C94302aeo.LJJIII(c94302aeo, CardStruct.IStatusCode.DEFAULT, str, dspPlatform, null, null, false, "link", musicDspSheetDialogFragment.LJLILLLLZI, musicDspSheetDialogFragment.LJLJJLL);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        iDqS175S0200000_42.invoke$0((SY4) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        TT2DSPPlatformInfo it = (TT2DSPPlatformInfo) obj;
        o.LJIIIZ(it, "it");
        ((MusicDspSheetViewModel) iDqS175S0200000_42.l0).setState(new IDqS175S0200000_42(it, (TT2DSPSongInfo) iDqS175S0200000_42.l1, 9));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS175S0200000_42 iDqS175S0200000_42, Object obj) {
        C94952apI setState = (C94952apI) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C94952apI.LIZ(setState, null, new C43I(new OSZ((TT2DSPPlatformInfo) iDqS175S0200000_42.l0, (TT2DSPSongInfo) iDqS175S0200000_42.l1)), null, null, null, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(C25991AHz c25991AHz, C94510aiA c94510aiA, int i) {
        super(1);
        this.$t = i;
        this.l0 = c25991AHz;
        this.l1 = c94510aiA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(XKS xks, C94255ae3 c94255ae3, int i) {
        super(1);
        this.$t = i;
        this.l0 = xks;
        this.l1 = c94255ae3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(C93478aRW c93478aRW, InterfaceC93654aUM interfaceC93654aUM, int i) {
        super(1);
        this.$t = i;
        this.l0 = c93478aRW;
        this.l1 = interfaceC93654aUM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(C93607aTb c93607aTb, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = c93607aTb;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(C93622aTq c93622aTq, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = c93622aTq;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(C93696aV2 c93696aV2, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = c93696aV2;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(C93794aWc c93794aWc, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = c93794aWc;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(C93804aWm c93804aWm, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = c93804aWm;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(C94033aaT c94033aaT, C94618aju c94618aju, int i) {
        super(1);
        this.$t = i;
        this.l0 = c94618aju;
        this.l1 = c94033aaT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(C94033aaT c94033aaT, C94620ajw c94620ajw, int i) {
        super(1);
        this.$t = i;
        this.l0 = c94620ajw;
        this.l1 = c94033aaT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(C94203adD c94203adD, AssetsFragment assetsFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = c94203adD;
        this.l1 = assetsFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(C94530aiU c94530aiU, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = c94530aiU;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(TextModel textModel, Long l, int i) {
        super(1);
        this.$t = i;
        this.l0 = textModel;
        this.l1 = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(ModelViewModel modelViewModel, WeakReference weakReference, int i) {
        super(1);
        this.$t = i;
        this.l0 = modelViewModel;
        this.l1 = weakReference;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(AssetsFragment assetsFragment, TextModel textModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = assetsFragment;
        this.l1 = textModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(TT2DSPPlatformInfo tT2DSPPlatformInfo, TT2DSPSongInfo tT2DSPSongInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = tT2DSPPlatformInfo;
        this.l1 = tT2DSPSongInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(MusicDspSheetAssem musicDspSheetAssem, ActivityC45651qj activityC45651qj, int i) {
        super(1);
        this.$t = i;
        this.l0 = musicDspSheetAssem;
        this.l1 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(MusicDspSheetViewModel musicDspSheetViewModel, TT2DSPSongInfo tT2DSPSongInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = musicDspSheetViewModel;
        this.l1 = tT2DSPSongInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(MusicAuthPlatformsSettingPage musicAuthPlatformsSettingPage, DspPlatform dspPlatform, int i) {
        super(1);
        this.$t = i;
        this.l0 = musicAuthPlatformsSettingPage;
        this.l1 = dspPlatform;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(DspPlatform dspPlatform, C94413agb c94413agb, int i) {
        super(1);
        this.$t = i;
        this.l0 = dspPlatform;
        this.l1 = c94413agb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS175S0200000_42(DspPlatform dspPlatform, MusicDspSheetDialogFragment musicDspSheetDialogFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = dspPlatform;
        this.l1 = musicDspSheetDialogFragment;
    }
}
