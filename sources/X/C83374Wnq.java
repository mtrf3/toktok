package X;

import Y.ACListenerS34S0100000_14;
import Y.AObjectS89S0100000_14;
import Y.AObserverS82S0100000_14;
import Y.ARunnableS25S0300000_14;
import Y.ARunnableS33S0200000_14;
import Y.IDAListenerS81S0100000_14;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.actionai.jni.ActionAILogger;
import com.bytedance.ies.actionai.jni.ActionAIMonitor;
import com.bytedance.ies.actionai.jni.LogLevel;
import com.ss.android.ugc.aweme.actionai.config.ActionAIHintConfig;
import com.ss.android.ugc.aweme.actionai.net.ActionAINetworkClient;
import com.ss.android.ugc.aweme.actionai.sdk.ActionAISDKAgent;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsOfflineService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS44S1000000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Wnq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83374Wnq extends AbstractC29891Fh<InterfaceC83402WoI> implements InterfaceC83402WoI, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLII;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public InterfaceC82134WLi LJLJJI;
    public InterfaceC83370Wnm LJLJJL;
    public InterfaceC137005Zg LJLJJLL;
    public InterfaceC134335Oz LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public long LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public final C29901Fi<C76800UCe> LJLLILLLL;
    public final C5ZZ LJLLJ;
    public final C5H3 LJLLL;
    public final C83376Wns LJLLLL;
    public final C83364Wng LJLLLLLL;
    public final C83349WnR LJLZ;
    public InterfaceC83373Wnp<Integer, Boolean> LJZ;
    public final C83352WnU LJZI;
    public final java.util.Map<Class<?>, OSZ<Integer, Object>> LJZL;
    public final InterfaceC65784Pro<C76800UCe> LL;
    public final C83375Wnr LLD;
    public ActionAISDKAgent LLF;
    public C83383Wnz LLFF;
    public boolean LLFFF;
    public final List<InterfaceC83391Wo7> LLFII;
    public final List<InterfaceC83391Wo7> LLFZ;
    public final C5H3 LLI;
    public final C5H3 LLIFFJFJJ;

    static {
        TBT tbt = new TBT(C83374Wnq.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLII = new InterfaceC74236TBo[]{tbt};
    }

    private final void LJJLL() {
        this.LJLLI = true;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cbe, C16880lQ.LLZIL(C78688UuS.LJJIII(this)), null);
        SY4 sy4 = (SY4) LLLZIIL.findViewById(R.id.br0);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
        c110614Vt.LIZJ = C61328O5c.LIZJ(8);
        Context context = LLLZIIL.getContext();
        o.LJIIIIZZ(context, "context");
        sy4.setBackground(c110614Vt.LIZ(context));
        C16880lQ.LJJIZ(sy4, new ACListenerS34S0100000_14(this, 7));
        C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 8), LLLZIIL.findViewById(R.id.il_));
        View findViewById = this.LJLLJ.findViewById(R.id.nh);
        if (findViewById != null) {
            ((ViewGroup) findViewById).addView(LLLZIIL);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public InterfaceC83402WoI LJJLI() {
        return this;
    }

    private final GHB LJJLIIIIJ() {
        return (GHB) this.LLIFFJFJJ.getValue();
    }

    private final C82133WLh LJJLIIIJILLIZJL() {
        return (C82133WLh) this.LLI.getValue();
    }

    private final C83381Wnx LJJLIIIJJI() {
        return (C83381Wnx) this.LJLLL.getValue();
    }

    private final void LJJLIIIJJIZ() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLLJ.mView, "translationY", 0.0f, TypedValue.applyDimension(1, 160.0f, this.LJLLJ.mView.getResources().getDisplayMetrics()));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJLLJ.mView, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(C55953Lxd.LIZLLL());
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(C55953Lxd.LIZLLL());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new IDAListenerS81S0100000_14(this, 2));
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    private final void LJJLIIJ() {
        C83383Wnz c83383Wnz = new C83383Wnz(C78688UuS.LJIJJ(this));
        this.LLFF = c83383Wnz;
        c83383Wnz.LIZJ = LJJLIIIJILLIZJL();
        View view = c83383Wnz.LIZ;
        if (view != null && c83383Wnz.LJ != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(c83383Wnz.LJ);
        }
        View findViewById = this.LJLLJ.findViewById(R.id.nb);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 6), findViewById);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    private final void LJJLJ() {
        EditText Ec;
        LiveEvent<AbstractC83369Wnl> Hx;
        LiveEvent<String> Ld;
        InterfaceC82134WLi interfaceC82134WLi = this.LJLJJI;
        if (interfaceC82134WLi != null && (Ld = interfaceC82134WLi.Ld()) != null) {
            Ld.LIZLLL(this, new AObjectS89S0100000_14(this, 17));
        }
        LJJLIIIJJI().LIZJ.observe(this, new AObserverS82S0100000_14(this, 7));
        InterfaceC83370Wnm interfaceC83370Wnm = this.LJLJJL;
        if (interfaceC83370Wnm != null && (Hx = interfaceC83370Wnm.Hx()) != null) {
            Hx.LIZLLL(this, new AObjectS89S0100000_14(this, 18));
        }
        InterfaceC82134WLi interfaceC82134WLi2 = this.LJLJJI;
        if (interfaceC82134WLi2 != null && (Ec = interfaceC82134WLi2.Ec()) != null) {
            Ec.addTextChangedListener(new C82132WLg(this, Ec));
        }
    }

    private final void LJJLJLI() {
        float applyDimension = TypedValue.applyDimension(1, 160.0f, this.LJLLJ.mView.getResources().getDisplayMetrics());
        this.LJLLJ.mView.setTranslationY(applyDimension);
        this.LJLLJ.mView.setAlpha(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLLJ.mView, "translationY", applyDimension, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJLLJ.mView, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(C55953Lxd.LIZLLL());
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(C55953Lxd.LIZLLL());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void LJJLIIIJLLLLLLLZ() {
        if (this.LJLL) {
            return;
        }
        this.LJLLI = false;
        String uid = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(uid, "uid");
        java.util.Set<String> set = C36651EZz.LIZ;
        if (!set.contains(uid)) {
            java.util.Set<String> stringSet = C36651EZz.LIZIZ().getStringSet("action_ai_disclaimer_show_times", OQY.INSTANCE);
            o.LJIIIIZZ(stringSet, "stringSet");
            set.addAll(stringSet);
            if (!stringSet.contains(uid)) {
                C83376Wns c83376Wns = this.LJLLLL;
                String string = C78688UuS.LJJIII(this).getString(R.string.e0x);
                o.LJIIIIZZ(string, "context.getString(R.stri…hatbot_legalMessage_body)");
                c83376Wns.LIZ(new C83351WnT(string, null, null, null, null, false, EnumC83359Wnb.DISCLAIMER, 1534));
                InterfaceC82134WLi interfaceC82134WLi = this.LJLJJI;
                if (interfaceC82134WLi != null) {
                    interfaceC82134WLi.hide();
                }
                LJJLL();
                this.LJLL = true;
            }
        }
        InterfaceC82134WLi interfaceC82134WLi2 = this.LJLJJI;
        if (interfaceC82134WLi2 != null) {
            interfaceC82134WLi2.show();
        }
        java.util.Set<String> set2 = C36651EZz.LIZIZ;
        if (set2.contains(uid)) {
            return;
        }
        java.util.Set<String> stringSet2 = C36651EZz.LIZIZ().getStringSet("action_ai_guidance_hints_show_times", OQY.INSTANCE);
        o.LJIIIIZZ(stringSet2, "stringSet");
        set2.addAll(stringSet2);
        if (stringSet2.contains(uid)) {
            return;
        }
        C83376Wns c83376Wns2 = this.LJLLLL;
        String string2 = C78688UuS.LJJIII(this).getString(R.string.e0s);
        o.LJIIIIZZ(string2, "context.getString(R.stri…bot_greetingMessage_body)");
        C83351WnT c83351WnT = new C83351WnT(string2, null, null, null, null, false, EnumC83359Wnb.DEFAULT, 1534);
        C83355WnX c83355WnX = new C83355WnX(EnumC83354WnW.INIT_HINT_LIST, null, ActionAIHintConfig.LIZ(), 58);
        c83376Wns2.getClass();
        c83376Wns2.LIZJ.execute(new ARunnableS25S0300000_14(c83355WnX, c83376Wns2, c83351WnT, 31));
        C36651EZz.LIZJ(uid, true);
        this.LJLL = true;
    }

    public final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLJLJ.LIZ(this, LLII[0]);
    }

    @Override // X.InterfaceC83402WoI
    public void Qk() {
        InterfaceC137005Zg interfaceC137005Zg = this.LJLJJLL;
        if (interfaceC137005Zg != null) {
            interfaceC137005Zg.LLLIIIIL();
        }
    }

    @Override // X.InterfaceC83402WoI
    public void show() {
        this.LJLILLLLZI.show(this.LJLLJ);
        LJJLJLI();
        Iterator<InterfaceC83391Wo7> it = this.LLFII.iterator();
        while (it.hasNext()) {
            it.next().LIZ(true);
        }
        C78923UyF.LJIILLIIL(this.LJLLJ).LLJILJILJ(this, LJJLIIIIJ());
        LJJLIIIJLLLLLLLZ();
        this.LJLJLLL = System.currentTimeMillis();
        InterfaceC83370Wnm interfaceC83370Wnm = this.LJLJJL;
        if (interfaceC83370Wnm != null) {
            interfaceC83370Wnm.IR();
        }
    }

    @Override // X.InterfaceC83402WoI
    public void LLZLI() {
        View currentFocus = C78688UuS.LJIJJ(this).getCurrentFocus();
        Object LLILIL = C16880lQ.LLILIL(C78688UuS.LJIJJ(this), "input_method");
        o.LJII(LLILIL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) LLILIL;
        if (currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    @Override // X.InterfaceC83402WoI
    public void hide() {
        VideoPublishEditModel model = LLLLIL();
        String str = ActionAISDKAgent.LJLJJLL;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJLLL;
        o.LJIIIZ(model, "model");
        C188727au c188727au = new C188727au();
        C83348WnQ.LIZLLL(model, c188727au);
        c188727au.LJIIIZ("enter_from", "video_edit_page_tikbot");
        c188727au.LJIIIZ("process_id", str);
        c188727au.LJ(currentTimeMillis, "duration");
        FMX.LJIIL("stay_time", c188727au.LIZ);
        this.LJLLLL.LIZJ(new C83355WnX(EnumC83354WnW.CANCEL_WITH_QUIT, C78688UuS.LJJIII(this).getString(R.string.e0p), null, 60));
        LJJLIIIJJIZ();
        Iterator<InterfaceC83391Wo7> it = this.LLFII.iterator();
        while (it.hasNext()) {
            it.next().LIZ(false);
        }
        C78923UyF.LJIILLIIL(this.LJLLJ).LLJJL(LJJLIIIIJ());
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        InterfaceC82134WLi interfaceC82134WLi;
        InterfaceC83370Wnm interfaceC83370Wnm;
        InterfaceC137005Zg interfaceC137005Zg;
        super.onCreate();
        C79234V7u.LIZIZ(this.LJLILLLLZI, this.LJLJI, this.LJLLJ, "ActionAIScene");
        C82622Wbi c82622Wbi = C44384HbQ.LJJJ(this.LJLLJ).LJLLL;
        InterfaceC134335Oz interfaceC134335Oz = null;
        if (c82622Wbi != null) {
            interfaceC82134WLi = (InterfaceC82134WLi) c82622Wbi.LJIIIIZZ(null, InterfaceC82134WLi.class);
        } else {
            interfaceC82134WLi = null;
        }
        this.LJLJJI = interfaceC82134WLi;
        C82622Wbi c82622Wbi2 = C44384HbQ.LJJJ(this.LJLLJ).LJLLL;
        if (c82622Wbi2 != null) {
            interfaceC83370Wnm = (InterfaceC83370Wnm) c82622Wbi2.LJIIIIZZ(null, InterfaceC83370Wnm.class);
        } else {
            interfaceC83370Wnm = null;
        }
        this.LJLJJL = interfaceC83370Wnm;
        C82622Wbi c82622Wbi3 = C44384HbQ.LJJJ(this.LJLLJ).LJLLL;
        if (c82622Wbi3 != null) {
            interfaceC137005Zg = (InterfaceC137005Zg) c82622Wbi3.LJIIIIZZ(null, InterfaceC137005Zg.class);
        } else {
            interfaceC137005Zg = null;
        }
        this.LJLJJLL = interfaceC137005Zg;
        C82622Wbi c82622Wbi4 = C44384HbQ.LJJJ(this.LJLLJ).LJLLL;
        if (c82622Wbi4 != null) {
            interfaceC134335Oz = (InterfaceC134335Oz) c82622Wbi4.LJIIIIZZ(null, InterfaceC134335Oz.class);
        }
        this.LJLJL = interfaceC134335Oz;
        LJJLIIJ();
        LJJLJ();
    }

    @Override // X.InterfaceC83402WoI
    public LiveEvent<C76800UCe> fS() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC83402WoI getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC83402WoI
    public Object Mx(Class<?> clazz) {
        o.LJIIIZ(clazz, "clazz");
        OSZ<Integer, Object> osz = this.LJZL.get(clazz);
        if (osz == null) {
            return null;
        }
        if (osz.getFirst().intValue() >= 2) {
            this.LJZL.remove(clazz);
        } else {
            this.LJZL.put(clazz, new OSZ<>(Integer.valueOf(osz.getFirst().intValue() + 1), osz.getSecond()));
        }
        return osz.getSecond();
    }

    @Override // X.InterfaceC83402WoI
    public void RI(InterfaceC83391Wo7 listener) {
        o.LJIIIZ(listener, "listener");
        this.LLFII.add(listener);
    }

    @Override // X.InterfaceC83402WoI
    public void eO(C83361Wnd message) {
        o.LJIIIZ(message, "message");
        C83376Wns c83376Wns = this.LJLLLL;
        c83376Wns.getClass();
        c83376Wns.LIZJ.execute(new ARunnableS33S0200000_14(c83376Wns, (AbstractC83369Wnl) message, 93));
    }

    @Override // X.InterfaceC83402WoI
    public void ia0(List<? extends AbstractC83417WoX> actions) {
        o.LJIIIZ(actions, "actions");
        ActionAISDKAgent actionAISDKAgent = new ActionAISDKAgent(this, actions);
        this.LLF = actionAISDKAgent;
        C83375Wnr messageCallback = this.LLD;
        o.LJIIIZ(messageCallback, "messageCallback");
        actionAISDKAgent.LJLJJI = new C83385Wo1(messageCallback);
        C83375Wnr c83375Wnr = this.LLD;
        ActionAISDKAgent actionAISDKAgent2 = this.LLF;
        if (actionAISDKAgent2 != null) {
            c83375Wnr.getClass();
            c83375Wnr.LJII = actionAISDKAgent2;
            for (AbstractC83417WoX abstractC83417WoX : actions) {
                C42428Gky.LIZIZ.put(abstractC83417WoX.LIZ(), abstractC83417WoX.LIZIZ());
            }
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId, "userService().curUserId");
            C2VQ.LIZ(new AqS44S1000000_6(curUserId, 0));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC83402WoI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object ra(X.InterfaceC67352kd<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C83380Wnw
            if (r0 == 0) goto L35
            r4 = r6
            X.Wnw r4 = (X.C83380Wnw) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r1 = 1
            if (r0 == 0) goto L25
            if (r0 != r1) goto L3b
            X.C141335gf.LIZJ(r3)
        L20:
            if (r3 != 0) goto L24
        L22:
            java.lang.String r3 = ""
        L24:
            return r3
        L25:
            X.C141335gf.LIZJ(r3)
            X.5Oz r0 = r5.LJLJL
            if (r0 == 0) goto L22
            r4.LJLJI = r1
            java.lang.Object r3 = r0.ra(r4)
            if (r3 != r2) goto L20
            return r2
        L35:
            X.Wnw r4 = new X.Wnw
            r4.<init>(r5, r6)
            goto L12
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83374Wnq.ra(X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC83402WoI
    public void wL(InterfaceC83391Wo7 listener) {
        o.LJIIIZ(listener, "listener");
        this.LLFZ.add(listener);
    }

    public C83374Wnq(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        C78688UuS.LJJIII(this);
        if (!C83398WoE.LIZ) {
            ((IToolsOfflineService) ServiceManager.get().getService(IToolsOfflineService.class)).LJ();
            try {
                C83377Wnt c83377Wnt = C83377Wnt.LIZ;
                c83377Wnt.LIZ();
                LogLevel value = LogLevel.LEVEL_DEBUG;
                o.LJIIIZ(value, "value");
                C83377Wnt.LJ = value;
                if (C83377Wnt.LIZJ) {
                    ActionAILogger.obtain().setLogLevel(value);
                }
                C83384Wo0 c83384Wo0 = new C83384Wo0();
                if (C83377Wnt.LIZJ) {
                    ActionAILogger.obtain().setDelegate(c83384Wo0);
                }
                C83377Wnt.LIZLLL = c83384Wo0;
                C83382Wny c83382Wny = new C83382Wny();
                synchronized (c83377Wnt) {
                    C83377Wnt.LJII = c83382Wny;
                    if (C83377Wnt.LIZJ) {
                        ActionAIMonitor.obtain().setListener(c83382Wny);
                    }
                }
                c83377Wnt.LIZJ(ActionAINetworkClient.LIZ);
                c83377Wnt.LIZIZ(C83390Wo6.LIZ);
                C83398WoE.LIZ = true;
            } catch (Throwable unused) {
                C83398WoE.LIZIZ = true;
            }
        }
        this.LJLJLJ = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJLLL = System.currentTimeMillis();
        this.LJLLILLLL = new C29901Fi<>();
        this.LJLLJ = new C5ZZ();
        this.LJLLL = C221108m2.LIZIZ(C83387Wo3.LJLIL);
        C83376Wns c83376Wns = new C83376Wns(LJJLIIIJJI());
        this.LJLLLL = c83376Wns;
        C83364Wng c83364Wng = new C83364Wng(this);
        this.LJLLLLLL = c83364Wng;
        C83349WnR c83349WnR = new C83349WnR(this);
        this.LJLZ = c83349WnR;
        C83352WnU c83352WnU = new C83352WnU(this);
        this.LJZI = c83352WnU;
        this.LJZL = new LinkedHashMap();
        AqS164S0100000_14 aqS164S0100000_14 = new AqS164S0100000_14(this, 51);
        this.LL = aqS164S0100000_14;
        this.LLD = new C83375Wnr(C78688UuS.LJJIII(this), LLLLIL(), c83376Wns, c83349WnR, c83352WnU, aqS164S0100000_14, c83364Wng);
        this.LLFII = new ArrayList();
        this.LLFZ = new ArrayList();
        this.LLI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 52));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 50));
    }

    @Override // X.InterfaceC83402WoI
    public void X20(AbstractC83369Wnl message, InterfaceC83373Wnp<Integer, Boolean> onOptionsChange, Object obj) {
        o.LJIIIZ(message, "message");
        o.LJIIIZ(onOptionsChange, "onOptionsChange");
        this.LJZ = onOptionsChange;
        this.LJLLLL.LIZIZ(message);
        if (obj != null) {
            this.LJZL.put(obj.getClass(), new OSZ<>(0, obj));
        }
        if (message instanceof C83351WnT) {
            C83351WnT c83351WnT = (C83351WnT) message;
            C83348WnQ.LJII(LLLLIL(), ActionAISDKAgent.LJLJJLL, c83351WnT.LJFF, c83351WnT.LJ, "success", null);
        }
    }
}
