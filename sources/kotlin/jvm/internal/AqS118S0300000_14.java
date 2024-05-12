package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C0I6;
import X.C160346Ra;
import X.C275416g;
import X.C275516h;
import X.C76732zl;
import X.C76800UCe;
import X.C78569UsX;
import X.C79409VEn;
import X.C79911VXv;
import X.C81527Vz9;
import X.C81975WFf;
import X.C82064WIq;
import X.C82068WIu;
import X.C82622Wbi;
import X.C83146WkA;
import X.C83479WpX;
import X.C83489Wph;
import X.C83495Wpn;
import X.C83496Wpo;
import X.C84003Wxz;
import X.C84004Wy0;
import X.EYY;
import X.EnumC79770VSk;
import X.InterfaceC65784Pro;
import X.InterfaceC82062WIo;
import X.InterfaceC83523WqF;
import X.InterfaceC84052Wym;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.WJZ;
import X.WMH;
import X.WOB;
import X.WOC;
import X.WOW;
import X.WOX;
import X.WPB;
import Y.IDLListenerS10S0300000_14;
import android.os.SystemClock;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautifyInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautifyTag;
import com.ss.android.ugc.aweme.ftc.countdown.FTCCountdownState;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.countdown.CountdownState;
import com.ss.android.ugc.aweme.shortvideo.model.QaUtils;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler;
import com.ss.android.vesdk.VERecorder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes15.dex */
public class AqS118S0300000_14 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$8(AqS118S0300000_14 aqS118S0300000_14, Object obj) {
        aqS118S0300000_14.invoke$1((C0I6) obj);
        return C76800UCe.LIZ;
    }

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
            default:
                return null;
        }
    }

    public final BeautifyInfo LIZ$0(ComposerBeauty composerBeauty) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        ArrayList arrayList = new ArrayList();
        C83146WkA c83146WkA = (C83146WkA) this.l0;
        c83146WkA.getClass();
        if (!composerBeauty.getExtra().isNone() && (c83146WkA.LJI(composerBeauty) || composerBeauty.getAdd2Nodes())) {
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (items != null) {
                for (ComposerBeautyExtraBeautify.ItemsBean itemsBean : items) {
                    arrayList.add(new BeautifyTag(itemsBean.getTag(), ((Number) ((C83146WkA) this.l0).LJIIL(composerBeauty).LJLIL).intValue()));
                    ((AqS176S0200000_14) this.l1).LIZ$0(composerBeauty, itemsBean);
                }
            }
            ((C76732zl) this.l2).element = 1;
        }
        return new BeautifyInfo(composerBeauty.getEffect().getEffectId(), arrayList);
    }

    public final void invoke$1(InterfaceC82062WIo it) {
        o.LJIIIZ(it, "it");
        InterfaceC82062WIo interfaceC82062WIo = it;
        List<? extends C81975WFf> list = (List) this.l0;
        if (list != null) {
            interfaceC82062WIo.a8(list);
        }
        List<? extends C81975WFf> list2 = (List) this.l1;
        if (list2 != null) {
            interfaceC82062WIo.t1(list2);
        }
        C82064WIq c82064WIq = (C82064WIq) this.l2;
        ActivityC45651qj activityC45651qj = c82064WIq.LJFF;
        if (activityC45651qj != null) {
            ShortVideoContext shortVideoContext = c82064WIq.LJ;
            if (shortVideoContext != null) {
                C82068WIu c82068WIu = c82064WIq.LIZ;
                interfaceC82062WIo.uK();
                interfaceC82062WIo.LJLLLL(WJZ.LIZLLL(activityC45651qj, shortVideoContext, c82068WIu, interfaceC82062WIo.getItemCount()));
                return;
            }
            o.LJIJI("shortVideoContext");
            throw null;
        }
        o.LJIJI("activity");
        throw null;
    }

    public final C160346Ra invoke$2(C82622Wbi it) {
        QaStruct qaStruct;
        o.LJIIIZ(it, "it");
        long uptimeMillis = SystemClock.uptimeMillis();
        WMH wmh = (WMH) this.l1;
        if (QaUtils.isDataValid((QaStruct) this.l2)) {
            qaStruct = (QaStruct) this.l2;
        } else {
            qaStruct = null;
        }
        C160346Ra c160346Ra = new C160346Ra(wmh, it, qaStruct);
        ((C275416g) this.l0).getClass();
        c160346Ra.afterInit$als_release(uptimeMillis);
        return c160346Ra;
    }

    public final C160346Ra invoke$3(C82622Wbi it) {
        QaStruct qaStruct;
        o.LJIIIZ(it, "it");
        long uptimeMillis = SystemClock.uptimeMillis();
        WMH wmh = (WMH) this.l1;
        if (QaUtils.isDataValid((QaStruct) this.l2)) {
            qaStruct = (QaStruct) this.l2;
        } else {
            qaStruct = null;
        }
        C160346Ra c160346Ra = new C160346Ra(wmh, it, qaStruct);
        ((C275416g) this.l0).getClass();
        c160346Ra.afterInit$als_release(uptimeMillis);
        return c160346Ra;
    }

    public static final Object invoke$0(AqS118S0300000_14 aqS118S0300000_14, Object obj) {
        FTCCountdownState state = (FTCCountdownState) obj;
        o.LJIIIZ(state, "state");
        WOC woc = (WOC) aqS118S0300000_14.l0;
        if (woc.LJLIL != null) {
            woc.LLJJI(r0.getStopPosition(), state.getStartTime(), state.getMaxDuration());
            ((View) aqS118S0300000_14.l1).getViewTreeObserver().removeOnGlobalLayoutListener((IDLListenerS10S0300000_14) aqS118S0300000_14.l2);
            WOW wow = ((WOC) aqS118S0300000_14.l0).LJLILLLLZI;
            if (wow == null) {
                return null;
            }
            wow.LIZJ((int) (state.getSdkRecordTime() + state.getStartTime()), (int) (state.getMaxDuration() + state.getStartTime()), state.getMusicPath());
            return C76800UCe.LIZ;
        }
        o.LJIJI("volumeTapsView");
        throw null;
    }

    public static final Object invoke$1(AqS118S0300000_14 aqS118S0300000_14, Object obj) {
        CountdownState state = (CountdownState) obj;
        o.LJIIIZ(state, "state");
        WOB wob = (WOB) aqS118S0300000_14.l0;
        if (wob.LJLILLLLZI != null) {
            wob.LLJJIII(r0.getStopPosition(), state.getStartTime(), state.getMaxDuration(), false);
            ((View) aqS118S0300000_14.l1).getViewTreeObserver().removeOnGlobalLayoutListener((IDLListenerS10S0300000_14) aqS118S0300000_14.l2);
            WOX wox = ((WOB) aqS118S0300000_14.l0).LJLJI;
            if (wox == null) {
                return null;
            }
            wox.LIZJ((int) (state.getSdkRecordTime() + state.getStartTime()), (int) (state.getMaxDuration() + state.getStartTime()), state.getMusicPath());
            return C76800UCe.LIZ;
        }
        o.LJIJI("volumeTapsView");
        throw null;
    }

    public static final Object invoke$10(AqS118S0300000_14 aqS118S0300000_14, Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int intValue = ((Number) obj).intValue();
        boolean z10 = false;
        if (intValue >= 0 && intValue < ((TextView) aqS118S0300000_14.l0).getText().length()) {
            boolean LIZ = EYY.LIZ(((TextView) aqS118S0300000_14.l0).getText().charAt(intValue));
            if (C79911VXv.LJFF(intValue, ((TextView) aqS118S0300000_14.l0).getText()) || LIZ) {
                z = true;
            } else {
                z = false;
            }
            int i = intValue + 1;
            if (C79911VXv.LJFF(i, ((TextView) aqS118S0300000_14.l0).getText()) || LIZ) {
                z2 = true;
            } else {
                z2 = false;
            }
            int length = ((TextView) aqS118S0300000_14.l0).getText().length();
            if (i >= 0 && i < length && !C79911VXv.LJFF(i, ((TextView) aqS118S0300000_14.l0).getText())) {
                z3 = true;
            } else {
                z3 = false;
            }
            int length2 = ((TextView) aqS118S0300000_14.l0).getText().length();
            if (i >= 0 && i < length2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 && ((TextView) aqS118S0300000_14.l0).getText().charAt(i) != '-') {
                z5 = true;
            } else {
                z5 = false;
            }
            if (((TextView) aqS118S0300000_14.l0).getText().charAt(intValue) != '-') {
                z6 = true;
            } else {
                z6 = false;
            }
            if (intValue == ((TextView) aqS118S0300000_14.l0).getText().length() - 1 || C79911VXv.LJ(i, (Layout) aqS118S0300000_14.l2)) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (((TextView) aqS118S0300000_14.l0).getText().charAt(intValue) == ' ') {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z7 && z5 && z6 && !z2) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z8 || (z && (z3 || z9))) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AqS118S0300000_14 aqS118S0300000_14, Object obj) {
        return aqS118S0300000_14.invoke$2((C82622Wbi) obj);
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(AqS118S0300000_14 aqS118S0300000_14, Object obj) {
        return aqS118S0300000_14.invoke$3((C82622Wbi) obj);
    }

    public static final Object invoke$13(AqS118S0300000_14 aqS118S0300000_14, Object obj) {
        WPB componentConfigure = (WPB) obj;
        o.LJIIIZ(componentConfigure, "componentConfigure");
        componentConfigure.LIZIZ = new AqS145S0200000_14((C78569UsX) aqS118S0300000_14.l0, (WMH) aqS118S0300000_14.l1, 61);
        componentConfigure.LIZ = new AqS168S0100000_2((C82622Wbi) aqS118S0300000_14.l2, 630);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS118S0300000_14 aqS118S0300000_14, Object obj) {
        C79409VEn it = (C79409VEn) obj;
        o.LJIIIZ(it, "it");
        if (it.LIZ != Integer.MAX_VALUE) {
            ((LiveData) aqS118S0300000_14.l0).removeObservers((ActivityC45651qj) aqS118S0300000_14.l1);
            ((InterfaceC88471Ynr) aqS118S0300000_14.l2).invoke(Integer.valueOf(it.LIZ), it.LIZIZ);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.Wxz] */
    public static final Object invoke$3(AqS118S0300000_14 aqS118S0300000_14, Object obj) {
        ((Number) obj).intValue();
        VERecorder vERecorder = ((C84004Wy0) aqS118S0300000_14.l0).LJII;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS118S0300000_14.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns = new C84003Wxz(interfaceC88472Yns);
        }
        vERecorder.LIZIZ.deleteLastFrag((InterfaceC84052Wym) interfaceC88472Yns);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS118S0300000_14.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$4(AqS118S0300000_14 aqS118S0300000_14, Object obj) {
        return aqS118S0300000_14.LIZ$0((ComposerBeauty) obj);
    }

    public static final Object invoke$5(AqS118S0300000_14 aqS118S0300000_14, Object obj) {
        ((Number) obj).longValue();
        C81527Vz9 c81527Vz9 = (C81527Vz9) aqS118S0300000_14.l0;
        c81527Vz9.LJIIIIZZ.LIZIZ(c81527Vz9, (EnumC79770VSk) aqS118S0300000_14.l1, (HashMap) aqS118S0300000_14.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS118S0300000_14 aqS118S0300000_14, Object it) {
        o.LJIIIZ(it, "it");
        InterfaceC83523WqF interfaceC83523WqF = (InterfaceC83523WqF) aqS118S0300000_14.l2;
        if (interfaceC83523WqF != null) {
            interfaceC83523WqF.onSuccess();
        }
        String str = ((C83489Wph) aqS118S0300000_14.l0).LIZIZ;
        if (str != null) {
            BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = ((C83495Wpn) aqS118S0300000_14.l1).LIZ;
            backgroundVideoStickerPresenter.LJLLLLLL.get().LJII(str, new AqS81S1100000_14(backgroundVideoStickerPresenter, str, 1));
            BackgroundVideoStickerPresenter backgroundVideoStickerPresenter2 = ((C83495Wpn) aqS118S0300000_14.l1).LIZ;
            backgroundVideoStickerPresenter2.LJLJLLL = 0;
            backgroundVideoStickerPresenter2.LJIILJJIL(true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS118S0300000_14 aqS118S0300000_14, Object it) {
        o.LJIIIZ(it, "it");
        InterfaceC83523WqF interfaceC83523WqF = (InterfaceC83523WqF) aqS118S0300000_14.l2;
        if (interfaceC83523WqF != null) {
            interfaceC83523WqF.onSuccess();
        }
        String str = ((C83489Wph) aqS118S0300000_14.l0).LIZIZ;
        if (str != null) {
            DiyPropVideoStickerHandler diyPropVideoStickerHandler = ((C83496Wpo) aqS118S0300000_14.l1).LIZ;
            diyPropVideoStickerHandler.LJLZ.LIZJ(str, new AqS81S1100000_14(diyPropVideoStickerHandler, str, 2));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if (r0 == false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AqS118S0300000_14 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS118S0300000_14.invoke$9(kotlin.jvm.internal.AqS118S0300000_14, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS118S0300000_14(C78569UsX c78569UsX, WMH wmh, C82622Wbi c82622Wbi, int i) {
        super(1);
        this.$t = i;
        this.l0 = c78569UsX;
        this.l1 = wmh;
        this.l2 = c82622Wbi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS118S0300000_14(C81527Vz9 c81527Vz9, C81527Vz9 c81527Vz92, EnumC79770VSk enumC79770VSk, HashMap<String, HashMap<String, Object>> hashMap) {
        super(1);
        this.$t = hashMap;
        this.l0 = c81527Vz9;
        this.l1 = c81527Vz92;
        this.l2 = enumC79770VSk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS118S0300000_14(WOB wob, View view, IDLListenerS10S0300000_14 iDLListenerS10S0300000_14, int i) {
        super(1);
        this.$t = i;
        this.l0 = wob;
        this.l1 = view;
        this.l2 = iDLListenerS10S0300000_14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS118S0300000_14(WOC woc, View view, IDLListenerS10S0300000_14 iDLListenerS10S0300000_14, int i) {
        super(1);
        this.$t = i;
        this.l0 = woc;
        this.l1 = view;
        this.l2 = iDLListenerS10S0300000_14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS118S0300000_14(C83146WkA c83146WkA, AqS176S0200000_14 aqS176S0200000_14, C76732zl c76732zl, int i) {
        super(1);
        this.$t = i;
        this.l0 = c83146WkA;
        this.l1 = aqS176S0200000_14;
        this.l2 = c76732zl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS118S0300000_14(C83489Wph c83489Wph, C83495Wpn c83495Wpn, C83479WpX c83479WpX, int i) {
        super(1);
        this.$t = i;
        this.l0 = c83489Wph;
        this.l1 = c83495Wpn;
        this.l2 = c83479WpX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS118S0300000_14(C83489Wph c83489Wph, C83496Wpo c83496Wpo, C83479WpX c83479WpX, int i) {
        super(1);
        this.$t = i;
        this.l0 = c83489Wph;
        this.l1 = c83496Wpo;
        this.l2 = c83479WpX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS118S0300000_14(C84004Wy0 c84004Wy0, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, int i) {
        super(1);
        this.$t = i;
        this.l0 = c84004Wy0;
        this.l1 = interfaceC88472Yns;
        this.l2 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS118S0300000_14(TextView textView, TextView textView2, List<Character> list, Layout layout) {
        super(1);
        this.$t = layout;
        this.l0 = textView;
        this.l1 = textView2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS118S0300000_14(MutableLiveData mutableLiveData, ActivityC45651qj activityC45651qj, AqS124S0300000_7 aqS124S0300000_7, int i) {
        super(1);
        this.$t = i;
        this.l0 = mutableLiveData;
        this.l1 = activityC45651qj;
        this.l2 = aqS124S0300000_7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS118S0300000_14(List list, List list2, C82064WIq c82064WIq, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c82064WIq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS118S0300000_14(C275416g c275416g, C275516h c275516h, WMH wmh, QaStruct qaStruct, int i) {
        super(1);
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = wmh;
        this.l2 = qaStruct;
    }
}
