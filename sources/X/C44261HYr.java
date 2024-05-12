package X;

import Y.ACListenerS27S0100000_7;
import Y.AObjectS86S0100000_7;
import android.content.ComponentCallbacks2;
import android.text.TextUtils;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.als.LiveEvent;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HYr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44261HYr extends AbstractC29891Fh<C0I6> implements C0I6, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final C82622Wbi LJLIL;
    public final InterfaceC82353WTt LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final I0N LJLJJI;
    public FrameLayout LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;

    static {
        TBT tbt = new TBT(C44261HYr.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.AbstractC29891Fh
    public C0I6 getApiComponent() {
        return this;
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJI.LIZ(this, LJLJLJ[0]);
    }

    public final void LJJLIIIIJ() {
        String stickerId;
        Mission mission = getShortVideoContext().creativeModel.commerceModel.getMission();
        if (mission != null && (stickerId = mission.getStickerId()) != null && stickerId.length() != 0 && this.LJLJJLL) {
            C2315296u.LIZ(this.LJLJJL, SFS.LJI(-100.0d), 0, false);
            this.LJLJJLL = false;
        }
    }

    public final void LJJLIIIJJI() {
        InterfaceC44086HRy interfaceC44086HRy;
        FrameLayout LLIILZL;
        TextView textView;
        Mission mission = getShortVideoContext().creativeModel.commerceModel.getMission();
        if (mission == null || this.LJLJL) {
            return;
        }
        TuxIconView tuxIconView = null;
        WM7 wm7 = (WM7) getDiContainer().LJIIIIZZ(null, AbstractC42651GoZ.class);
        if (wm7 != null) {
            interfaceC44086HRy = HRQ.LIZ(wm7);
        } else {
            ComponentCallbacks2 LJIJJ = C78688UuS.LJIJJ(this);
            if (!(LJIJJ instanceof InterfaceC44086HRy)) {
                return;
            } else {
                interfaceC44086HRy = (InterfaceC44086HRy) LJIJJ;
            }
        }
        if (interfaceC44086HRy == null || (LLIILZL = interfaceC44086HRy.LLIILZL()) == null) {
            return;
        }
        ViewStub viewStub = (ViewStub) LLIILZL.findViewById(R.id.n4m);
        if (viewStub != null && viewStub.getParent() != null) {
            viewStub.bringToFront();
            viewStub.setLayoutResource(R.layout.bj_);
            this.LJLJJL = (FrameLayout) viewStub.inflate();
        }
        FrameLayout frameLayout = this.LJLJJL;
        if (frameLayout == null || (textView = (TextView) frameLayout.findViewById(R.id.aql)) == null) {
            return;
        }
        FrameLayout frameLayout2 = this.LJLJJL;
        if (frameLayout2 != null) {
            tuxIconView = (TuxIconView) frameLayout2.findViewById(R.id.aqj);
        }
        textView.setText(C16880lQ.LLLLJ(C78688UuS.LJIJJ(this)).getText(R.string.i5z));
        C2315296u.LIZ(this.LJLJJL, SFS.LJI(-100.0d), 0, false);
        C2315296u.LIZ(this.LJLJJL, SFS.LJI(40.0d), 300, true);
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS27S0100000_7(this, 13));
        }
        this.LJLJJLL = true;
        new H9C().LJIILJJIL(mission, 0);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        LiveEvent<T4S> CY;
        LiveEvent<Boolean> sF;
        super.onCreate();
        if (this.LJLILLLLZI != null) {
            I0N i0n = this.LJLJJI;
            if (i0n != null && (sF = i0n.sF()) != null) {
                sF.LIZLLL(this, new AObjectS86S0100000_7(this, 7));
            }
            I0N i0n2 = this.LJLJJI;
            if (i0n2 != null && (CY = i0n2.CY()) != null) {
                CY.LIZLLL(this, new AObjectS86S0100000_7(this, 8));
            }
        }
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C44261HYr(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = (InterfaceC82353WTt) getDiContainer().LJIIIIZZ(null, InterfaceC82353WTt.class);
        this.LJLJI = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLJJI = (I0N) getDiContainer().LJIIIIZZ(null, I0N.class);
    }

    private final void LJJLIIIJILLIZJL(String str) {
        Mission mission = getShortVideoContext().creativeModel.commerceModel.getMission();
        if (mission == null || TextUtils.equals(mission.getStickerId(), str) || mission.getStickerId() == null) {
            return;
        }
        this.LJLJL = true;
        mission.setUserEverChoseDifferentSticker(true);
        new H9C().LJIIJJI(mission, 0);
    }

    public final void LJJLI(T4S t4s) {
        Effect effect;
        EnumC44267HYx enumC44267HYx = EnumC44267HYx.UI_CLICK;
        String str = null;
        if (t4s instanceof T4Q) {
            T4Q t4q = (T4Q) t4s;
            effect = t4q.LIZ;
            enumC44267HYx = t4q.LIZJ;
        } else {
            if (t4s instanceof T4R) {
                enumC44267HYx = ((T4R) t4s).LIZJ;
            }
            effect = null;
        }
        if (enumC44267HYx != EnumC44267HYx.MANUAL_SET) {
            if (effect != null) {
                str = effect.getEffectId();
            }
            LJJLIIIJILLIZJL(str);
        }
    }
}
