package X;

import android.view.KeyEvent;
import android.view.View;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import java.util.List;
import kotlin.jvm.internal.AqS0S0000001_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6aH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162856aH extends AbstractC48231ut<InterfaceC147215q9, ViewOnClickListenerC82415WWd, WVY, C82414WWc> implements InterfaceC147215q9, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLF;
    public final ActivityC45651qj LJLL;
    public final WMH LJLLI;
    public final C82622Wbi LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public boolean LJLLLLLL;
    public View LJLZ;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJZ;
    public InterfaceC65784Pro<C76800UCe> LJZI;
    public InterfaceC88472Yns<? super InterfaceC65784Pro<C76800UCe>, C76800UCe> LJZL;
    public InterfaceC65784Pro<Boolean> LL;
    public final InterfaceC65784Pro<ViewOnClickListenerC82415WWd> LLD;

    static {
        TBT tbt = new TBT(C162856aH.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLF = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C162856aH.class, "avListenableActivityRegistry", "getAvListenableActivityRegistry()Lcom/ss/android/ugc/tools/view/activity/AVListenableActivityRegistry;", 0, c65351Pkp), C61845OOz.LIZJ(C162856aH.class, "editExitComponent", "getEditExitComponent()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC147215q9
    public void G2(int i) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.6aV] */
    @Override // X.InterfaceC147215q9
    public void S30() {
        Integer num;
        final int i;
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(1, 2);
        NowsShootModel nowsShootModel = LLF().creativeModel.nowsShootModel;
        if (nowsShootModel != null) {
            num = Integer.valueOf(nowsShootModel.type);
        } else {
            num = null;
        }
        if (ORZ.LJLJJI(num, LJJIJIIJI) || (LLF().getEditorProModel().isAdvancedEditDraft() && !H7R.LJJIL(LLF()))) {
            i = 7;
        } else {
            i = 6;
        }
        C60903NvH.LJIIJJI().getPublishService().LJJIL().LIZ(new InterfaceC162796aB() { // from class: X.6aV
            @Override // X.InterfaceC162796aB
            public final void LIZIZ() {
                C162856aH.this.LJJZZI(new AqS27S0001000_2(i, 9));
            }

            @Override // X.InterfaceC162796aB
            public final void LIZ(float f) {
                C162856aH.this.LJJZZI(new AqS0S0000001_2(f, 0));
            }

            @Override // X.InterfaceC162796aB
            public final void onFinish(boolean z) {
                C162856aH.this.LJJZZI(new AqS7S0010000_2(z, 9));
            }
        }, new C162756a7(this.LJLL, i, LLF(), AY4.LIZ(LLF()), this.LL.invoke().booleanValue(), this.LJZL));
        H8F.LJJIIJ(LLF());
    }

    private final InterfaceC45540Hu4 LJLZ() {
        return (InterfaceC45540Hu4) this.LJLLL.LIZ(this, LLF[1]);
    }

    private final InterfaceC148865so LJZI() {
        return (InterfaceC148865so) this.LJLLLL.LIZ(this, LLF[2]);
    }

    @Override // X.InterfaceC147215q9
    public void LJIJI() {
        LJJZZI(C162896aL.LJLIL);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C82414WWc> LJJLIIIJJIZ() {
        return new AqS152S0100000_2(this, 131);
    }

    public final VideoPublishEditModel LLF() {
        return (VideoPublishEditModel) this.LJLLJ.LIZ(this, LLF[0]);
    }

    public final void LLIIZ() {
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LJZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(C149235tP.LIZ()));
        }
    }

    public final void LLILL() {
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LJZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
    }

    public final void Ru() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJZI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJLZ().registerActivityOnKeyDownListener(new C5HC() { // from class: X.6aI
            @Override // X.C5HC
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                C162856aH c162856aH = C162856aH.this;
                if (!c162856aH.LJLLLLLL) {
                    return false;
                }
                return c162856aH.LLIIIL(c162856aH.LJLZ);
            }
        });
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<WVY> LJJLIIIJJI() {
        return C162886aK.LJLIL;
    }

    @Override // X.AbstractC48231ut
    public InterfaceC65784Pro<ViewOnClickListenerC82415WWd> LJLJJLL() {
        return this.LLD;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLILLLL;
    }

    private final void LLFFF(String actionType) {
        String str;
        NowsShootModel nowsShootModel = LLF().creativeModel.nowsShootModel;
        if (nowsShootModel != null) {
            String str2 = LLF().mShootWay;
            o.LJIIIIZZ(str2, "model.mShootWay");
            String str3 = LLF().shootEnterMethod;
            o.LJIIIIZZ(str3, "model.shootEnterMethod");
            ShootExtraData shootExtraData = LLF().creativeFlowData.getShootExtraData();
            if (shootExtraData == null || (str = shootExtraData.getShootEnterFrom()) == null) {
                str = "unknown";
            }
            o.LJIIIZ(actionType, "actionType");
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("shoot_way", str2);
            c145995oB.LJI("shoot_page", "now_shoot_page");
            c145995oB.LJI("action_type", actionType);
            c145995oB.LJI("enter_from", "video_post_page");
            c145995oB.LJI("shoot_enter_from", str3);
            c145995oB.LJI("shoot_enter_method", str);
            HC6.LIZIZ(c145995oB, nowsShootModel);
            GXR.LIZ("retake_pop_up", c145995oB.LIZ);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void LLILZIL(View view) {
        if (LJZI() != null && view != null) {
            InterfaceC148865so LJZI = LJZI();
            if (LJZI != null) {
                LJZI.yV(view);
                return;
            }
            return;
        }
        this.LJLL.finish();
    }

    @Override // X.InterfaceC147215q9
    public void LLFII(boolean z) {
        this.LJLLLLLL = z;
        if (z) {
            show();
        } else {
            hide();
        }
    }

    public final void LLIFFJFJJ(View view) {
        LLIIIL(view);
    }

    public final boolean LLIIIL(View view) {
        LLILZIL(view);
        return true;
    }

    public final void LLIZ(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LL = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C162856aH(ActivityC45651qj activity, WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = activity;
        this.LJLLI = parentScene;
        this.LJLLILLLL = diContainer;
        this.LJLLJ = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLLL = UCI.LJI(getDiContainer(), InterfaceC45540Hu4.class, null);
        this.LJLLLL = UCI.LJII(getDiContainer(), InterfaceC148865so.class, null);
        this.LJLLLLLL = true;
        this.LL = C142905jC.LJLIL;
        this.LLD = C162876aJ.LJLIL;
    }

    public static /* synthetic */ boolean LLIILZL(C162856aH c162856aH, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            view = null;
        }
        return c162856aH.LLIIIL(view);
    }

    public static /* synthetic */ void LLILZLL(C162856aH c162856aH, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            view = null;
        }
        c162856aH.LLILZIL(view);
    }
}
