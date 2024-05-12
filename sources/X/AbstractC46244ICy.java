package X;

import X.I9W;
import Y.AObjectS86S0100000_7;
import Y.AObserverS67S0300000_7;
import Y.ARunnableS43S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.als.LiveEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.senor.presenter.DefaultSenorPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.ICy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46244ICy<API extends I9W> extends AbstractC29891Fh<API> implements I9W, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo[] LLIIIL;
    public final C29S LJLIL;
    public final InterfaceC74343TFr LJLILLLLZI;
    public final InterfaceC82086WJm LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC83624Wrs LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final ID3 LJLJL;
    public final C73318Sq2 LJLJLJ;
    public final IDC LJLJLLL;
    public final C0IB<Boolean> LJLL;
    public final ID9 LJLLI;
    public final C83884Ww4 LJLLILLLL;
    public final C5H3 LJLLJ;
    public final C5H3 LJLLL;
    public final C5H3 LJLLLL;
    public C81605W0z LJLLLLLL;
    public final IDA LJLZ;
    public final MessageCenter.Listener LJZ;
    public final C29901Fi<Boolean> LJZI;
    public final C29901Fi<Boolean> LJZL;
    public final C29901Fi<HY8> LL;
    public final C29901Fi<Boolean> LLD;
    public final IDO LLF;
    public final C29901Fi<Boolean> LLFF;
    public final C29901Fi<Boolean> LLFFF;
    public final C29901Fi<Effect> LLFII;
    public final C29901Fi<Boolean> LLFZ;
    public final C29901Fi<C76800UCe> LLI;
    public final C29901Fi<T4S> LLIFFJFJJ;
    public final C73893SzJ<OSZ<Effect, C44243HXz>> LLII;
    public boolean LLIIII;
    public List<String> LLIIIILZ;
    public final C82622Wbi LLIIIJ;

    static {
        TBT tbt = new TBT(AbstractC46244ICy.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(AbstractC46244ICy.class, "effectPlatform", "getEffectPlatform()Lcom/ss/android/ugc/tools/effectplatform/api/IEffectPlatformPrimitive;", 0, c65351Pkp)};
    }

    public void LJJLIIIJLLLLLLLZ(InterfaceC44448HcS addStickerFilter) {
        o.LJIIIZ(addStickerFilter, "$this$addStickerFilter");
    }

    public void LJJLJLI(TEZ stickerDataManager, InterfaceC46204IBk stickerSelectedController) {
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(stickerSelectedController, "stickerSelectedController");
    }

    public void LJJZZIII(long j) {
    }

    public final InterfaceC84497XEf LJZI() {
        return (InterfaceC84497XEf) this.LJLJJLL.LIZ(this, LLIIIL[1]);
    }

    public void LLILZLL(List<? extends Effect> list) {
    }

    @Override // X.I9W, X.InterfaceC82400WVo
    public TEZ LLLLL() {
        return (TEZ) this.LJLLJ.getValue();
    }

    public InterfaceC46204IBk LLZL() {
        return (InterfaceC46204IBk) this.LJLLL.getValue();
    }

    public T4O ch0() {
        return (T4O) this.LJLLLL.getValue();
    }

    @Override // X.I9W
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    public final I3X getRecordControlApi() {
        return (I3X) this.LJLJJI.LIZ(this, LLIIIL[0]);
    }

    private final boolean LLILL() {
        return this.LJLJL.LIZ;
    }

    private final void LLJI() {
        IDC idc = this.LJLJLLL;
        Iterator it = ((ArrayList) idc.LJLJJI).iterator();
        while (it.hasNext()) {
            TGT tgt = (TGT) it.next();
            IDH idh = idc.LJLJLJ;
            if (idh != null) {
                idh.LIZIZ(tgt);
            }
        }
    }

    private final void LLJJIII() {
        this.LJLJI.e8().C9(new C83708WtE());
    }

    public final InterfaceC83863Wvj LJLLL() {
        return this.LJLJJL.getCameraController();
    }

    public final C74385THh LJLZ() {
        return this.LJLJL.LJFF;
    }

    public final InterfaceC83727WtX LLF() {
        return this.LJLJJL.getEffectController();
    }

    public final CameraComponentModel LLIIIL() {
        return this.LJLJI.zZ();
    }

    public final InterfaceC83865Wvl LLIILZL() {
        return this.LJLJJL.getMediaController();
    }

    public C81663W3f LLIZ() {
        return new C81663W3f(this.LJLIL, (THX) getDiContainer().LJ(THX.class, null), LLLLL(), this.LJLILLLLZI, (InterfaceC78118UlG) getDiContainer().LJ(InterfaceC78118UlG.class, null), new AqS189S0100000_7(this, 4), null, new AqS157S0100000_7((AbstractC46244ICy) this, 29), 64);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LLJJI() {
        int size = this.LJLJI.zZ().LIZIZ().size() - 1;
        Effect effect = (Effect) LLLLL().LJIIIIZZ().LJIILL().getValue();
        if (!ID0.LJJIII(effect)) {
            return;
        }
        getRecordControlApi().Pk(false);
        this.LJLJI.e8().C9(new IDI(new C44349Har(this, size, effect), getRecordControlApi(), LLLZI()));
    }

    @Override // X.I9W, X.InterfaceC82400WVo
    public IDH LLLF() {
        return this.LJLJLLL.LJLJLJ;
    }

    @Override // X.I9W, X.InterfaceC82400WVo
    public SafeHandler LLLZI() {
        return this.LJLJLLL.LJLJLLL;
    }

    @Override // X.I9W
    public void Yq() {
        this.LJLJI.AJ().LIZIZ(this, new AObjectS86S0100000_7(this, 1));
    }

    @Override // X.I9W
    public void Z7() {
        this.LJLJLLL.Z7();
    }

    @Override // X.I9W
    public void g30() {
        this.LJLLI.LIZ();
    }

    @Override // X.I9W
    public AbstractC73672Svk<OSZ<Effect, C44243HXz>> ua0() {
        C73893SzJ<OSZ<Effect, C44243HXz>> c73893SzJ = this.LLII;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    private final void LLJJ() {
        Effect effect;
        GameDuetResource gameDuetResource = LLIIIL().gameDuetResource;
        if (gameDuetResource != null && (effect = gameDuetResource.gameSticker) != null && !V3N.LJIILLIIL(effect)) {
            C82398WVm.LJI(this, gameDuetResource.gameSticker);
        }
    }

    @Override // X.I9W
    public void H20() {
        LLF().H9(this.LJZ);
    }

    public void LJJLL() {
        LLLLL().LJJIFFI();
        if (o.LJ(getRecordControlApi().isRecording().LIZ(), Boolean.FALSE)) {
            W90(true, "auto_open");
        }
    }

    public FaceStickerBean LLFFF() {
        return SFS.LIZLLL(LLIFFJFJJ());
    }

    public final Effect LLIFFJFJJ() {
        return LLLLL().LJJIIZI();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (X.V3N.LJIJ(r5.getSdkExtra(), "diy_prop_video", false) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (X.V3N.LJIJ(r5.getExtra(), "half_customized", false) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x004c, code lost:
    
        if (r5 != null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.HCC LLIIZ() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r5 = r6.Z5()
            r4 = 0
            if (r5 == 0) goto L14
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = X.C82398WVm.LIZJ(r6)
            if (r0 == 0) goto Lea
            java.lang.String r0 = r0.getResourceId()
        L11:
            r5.setResourceID(r0)
        L14:
            r3 = 0
            if (r5 == 0) goto L4b
            java.lang.String r0 = "GreenScreen"
            boolean r0 = X.ID0.LJIL(r0, r5)
            if (r0 != 0) goto Le7
            java.lang.String r1 = "BackgroundVideo"
            boolean r0 = X.ID0.LJIL(r1, r5)
            if (r0 != 0) goto Le7
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r0 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.NONE
            if (r5 != r0) goto Ldd
        L2b:
            java.lang.String r0 = r5.getSdkExtra()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Laa
        L35:
            java.lang.String r0 = r5.getExtra()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L9d
        L3f:
            java.lang.String r1 = "diy_prop_video"
            boolean r0 = X.ID0.LJIL(r1, r5)
            if (r0 != 0) goto Le7
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r0 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.NONE
            if (r5 != r0) goto L92
        L4b:
            r2 = 0
            if (r5 == 0) goto L90
        L4e:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = X.C82398WVm.LIZJ(r6)
            boolean r0 = X.ID0.LJJI(r0)
            if (r0 != 0) goto L62
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = X.C82398WVm.LIZJ(r6)
            boolean r0 = X.ID0.LIZJ(r0)
            if (r0 == 0) goto L90
        L62:
            r1 = 1
        L63:
            X.0I6 r0 = r6.getApiComponent()
            X.WVo r0 = (X.InterfaceC82400WVo) r0
            java.util.List r0 = X.C63081OpJ.LJJJJLL(r0)
            if (r0 == 0) goto L75
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7b
        L75:
            X.HCC r0 = new X.HCC
            r0.<init>(r5, r4, r2, r1)
            return r0
        L7b:
            java.util.ArrayList r4 = new java.util.ArrayList
            X.0I6 r0 = r6.getApiComponent()
            X.WVo r0 = (X.InterfaceC82400WVo) r0
            java.util.List r0 = X.C63081OpJ.LJJJJLL(r0)
            if (r0 == 0) goto L8d
        L89:
            r4.<init>(r0)
            goto L75
        L8d:
            X.OQg r0 = X.C61878OQg.INSTANCE
            goto L89
        L90:
            r1 = 0
            goto L63
        L92:
            java.lang.String r0 = r5.getSdkExtra()
            boolean r0 = X.V3N.LJIJ(r0, r1, r3)
            if (r0 == 0) goto L4b
            goto Le7
        L9d:
            java.lang.String r1 = r5.getExtra()
            java.lang.String r0 = "half_customized"
            boolean r0 = X.V3N.LJIJ(r1, r0, r3)
            if (r0 != 0) goto Le7
            goto L3f
        Laa:
            java.lang.String r0 = r5.getSdkExtra()
            java.lang.String r2 = "pl"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Lb8
            goto L35
        Lb8:
            java.lang.String r1 = r5.getSdkExtra()
            java.lang.String r0 = "alg"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lc6
            goto L35
        Lc6:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld7
            java.lang.String r0 = r5.getSdkExtra()     // Catch: java.lang.Exception -> Ld7
            r1.<init>(r0)     // Catch: java.lang.Exception -> Ld7
            boolean r0 = r1.has(r2)     // Catch: java.lang.Exception -> Ld7
            if (r0 != 0) goto Le7
            goto L35
        Ld7:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L35
        Ldd:
            java.lang.String r0 = r5.getSdkExtra()
            boolean r0 = X.V3N.LJIJ(r0, r1, r3)
            if (r0 == 0) goto L2b
        Le7:
            r2 = 1
            goto L4e
        Lea:
            r0 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC46244ICy.LLIIZ():X.HCC");
    }

    public final void LLILZIL() {
        if (!ID0.LJ(C82398WVm.LIZJ(this)) && this.LJLJL.LJIILIIL.invoke().booleanValue()) {
            return;
        }
        LLLZI().post(new ARunnableS43S0100000_7(this, 8));
    }

    @Override // X.I9W
    public void PU() {
        LLF().I9(null);
    }

    @Override // X.I9W
    public FaceStickerBean Z5() {
        return LLFFF();
    }

    @Override // X.I9W
    public void bi0() {
        InterfaceC74393THp LJJJJLL = LLLLL().LJJJJLL();
        TJV LIZ = LJJJJLL.LIZ();
        LiveData LIZIZ = C74310TEk.LIZIZ(LIZ, LLLLL().LJJIL().LJLJLJ, 7);
        getLifecycleOwner();
        LIZIZ.observe(this, new AObserverS67S0300000_7(this, LIZ, LJJJJLL, 0));
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LLLLL();
        C0IB<Boolean> c0ib = this.LJLL;
        getLifecycleOwner();
        c0ib.LIZIZ(this, new AObjectS86S0100000_7(this, 5));
        LJJLIIIIJ(this, false, 1, null);
        if (getDiContainer().LIZIZ(I3X.class)) {
            whenReadyOrThrowInternal(getDiContainer(), I3X.class, new AqS173S0100000_7(this, 32));
        }
        LiveEvent<C76800UCe> Ib0 = this.LJLJI.Ib0();
        getLifecycleOwner();
        Ib0.LIZLLL(this, new AObjectS86S0100000_7(this, 6));
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        this.LJLJLJ.LIZLLL();
        LLJJIII();
    }

    @Override // X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
        g30();
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        InterfaceC84018WyE interfaceC84018WyE;
        super.onResume();
        ID9 id9 = this.LJLLI;
        id9.getClass();
        if (ID9.LIZLLL() || (interfaceC84018WyE = id9.LIZ) == null || interfaceC84018WyE.Kk()) {
            return;
        }
        interfaceC84018WyE.register();
    }

    @Override // X.AbstractC29891Fh
    public void onStart() {
        super.onStart();
        LJLJLJ(true);
    }

    @Override // X.AbstractC29891Fh
    public void onStop() {
        super.onStop();
        LJLJLJ(false);
    }

    @Override // X.I9W
    public /* bridge */ /* synthetic */ LiveEvent CY() {
        return this.LLIFFJFJJ;
    }

    @Override // X.I9W
    public /* bridge */ /* synthetic */ LiveEvent Dj() {
        return this.LJZL;
    }

    @Override // X.I9W
    public /* bridge */ /* synthetic */ LiveEvent He0() {
        return this.LLFZ;
    }

    @Override // X.I9W
    public /* bridge */ /* synthetic */ LiveEvent KL() {
        return this.LLFII;
    }

    @Override // X.I9W
    public /* bridge */ /* synthetic */ InterfaceC46134I8s SH() {
        return this.LLF;
    }

    @Override // X.I9W
    public /* bridge */ /* synthetic */ LiveEvent Tk() {
        return this.LLFF;
    }

    @Override // X.I9W
    public /* bridge */ /* synthetic */ LiveEvent V40() {
        return this.LLD;
    }

    @Override // X.I9W
    public /* bridge */ /* synthetic */ LiveEvent aZ() {
        return this.LL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LLIIIJ;
    }

    @Override // X.I9W
    public /* bridge */ /* synthetic */ LiveEvent sF() {
        return this.LLFFF;
    }

    @Override // X.I9W
    public /* bridge */ /* synthetic */ LiveEvent xU() {
        return this.LLI;
    }

    @Override // X.I9W
    public /* bridge */ /* synthetic */ LiveEvent yn() {
        return this.LJZI;
    }

    private final void LJLJJLL(Effect effect) {
        if (effect != null) {
            LLLLL().LJJIIJ(new C74397THt(effect, true, null, 4), null);
        }
    }

    @Override // X.I9W
    public void D8(InterfaceC88472Yns<? super F4V, Boolean> predicate) {
        o.LJIIIZ(predicate, "predicate");
        IDC idc = this.LJLJLLL;
        idc.getClass();
        Iterator it = ((ArrayList) idc.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                it.remove();
            }
        }
        T4K LIZJ = idc.LIZJ();
        LIZJ.getClass();
        Iterator<F4V> it2 = LIZJ.LJLIL.iterator();
        o.LJIIIIZZ(it2, "childHandlerList.iterator()");
        while (it2.hasNext()) {
            F4V next = it2.next();
            o.LJIIIIZZ(next, "iterator.next()");
            if (predicate.invoke(next).booleanValue()) {
                it2.remove();
            }
        }
    }

    @Override // X.I9W
    public void J20(Effect effect) {
        o.LJIIIZ(effect, "effect");
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        Looper LLJJJJ = C16880lQ.LLJJJJ();
        o.LJIIIIZZ(LLJJJJ, "Looper.getMainLooper()");
        if (o.LJ(LLLLIIIILLL, LLJJJJ.getThread())) {
            this.LLFII.LJII(effect);
        } else {
            this.LLFII.LJI(effect);
        }
    }

    public void LJJLI(boolean z) {
        LJJLIIIJJI(z);
    }

    public void LJJLIIIJILLIZJL(TEZ stickerDataManager) {
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        C37143Ehv LIZIZ = stickerDataManager.LJJJJLL().LIZJ().LIZIZ();
        if (this.LJLJI.zZ().isRetakeMode) {
            LIZIZ.LIZ(C45823Hyd.LIZ);
        }
        LJJLIIIJLLLLLLLZ(LIZIZ);
        LIZIZ.LIZIZ();
    }

    public void LJJLIIIJJI(boolean z) {
        if (LJLZ().LJLJJI) {
            InterfaceC74429TIz LJFF = LLLLL().LJJJJLL().LJFF();
            C74444TJo c74444TJo = new C74444TJo(C221108m2.LIZIZ(new AqS157S0100000_7((AbstractC46244ICy) this, 27)));
            Context LLLLLIL = C16880lQ.LLLLLIL(this.LJLIL);
            o.LJIIIIZZ(LLLLLIL, "activity.applicationContext");
            LJFF.LIZIZ(new C74446TJq(c74444TJo, LLLLLIL, z));
            P2(LLIZ());
        }
    }

    public InterfaceC84018WyE LJJZZI(boolean z) {
        C29S c29s = this.LJLIL;
        Handler handler = this.LJLLI.LIZIZ;
        ID3 id3 = this.LJLJL;
        return new DefaultSenorPresenter(c29s, c29s, z, this.LJLLILLLL, false, handler, id3.LJIIIIZZ, id3.LJIIIZ, 16);
    }

    public void LJLJJL(Effect effect) {
        LJLJJLL(effect);
    }

    public void LJLJLJ(boolean z) {
        if (z) {
            LLF().L9(this.LJZ);
        } else {
            LLF().H9(this.LJZ);
        }
    }

    public final void LLJ(boolean z) {
        this.LJLLI.LIZJ(LJJZZI(z), true);
    }

    @Override // X.I9W, X.InterfaceC63084OpM
    public F4V LLLIIII(InterfaceC88472Yns<? super F4V, Boolean> predicate) {
        o.LJIIIZ(predicate, "predicate");
        return this.LJLJLLL.LLLIIII(predicate);
    }

    @Override // X.I9W
    public void P2(F4V handler) {
        o.LJIIIZ(handler, "handler");
        IDC idc = this.LJLJLLL;
        idc.getClass();
        idc.LIZ(handler, false);
    }

    @Override // X.I9W
    public void U9(IDH stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        IDC idc = this.LJLJLLL;
        idc.getClass();
        idc.LJLJLJ = stickerView;
        stickerView.Xi(new IDJ(idc));
        stickerView.Xi(new IDE(this));
    }

    @Override // X.I9W
    public void Uf0(boolean z) {
        this.LLFZ.LJI(Boolean.valueOf(z));
    }

    @Override // X.I9W
    public void g1(F4V handler) {
        o.LJIIIZ(handler, "handler");
        IDC idc = this.LJLJLLL;
        idc.getClass();
        if (!((ArrayList) idc.LJLILLLLZI).remove(handler)) {
            T4K LIZJ = idc.LIZJ();
            LIZJ.getClass();
            LIZJ.LJLIL.remove(handler);
        }
    }

    @Override // X.I9W
    public boolean g20(T4Q session) {
        o.LJIIIZ(session, "session");
        if (session.LIZJ != EnumC44267HYx.MANUAL_SET) {
            return false;
        }
        Bundle bundle = session.LJ;
        if (bundle != null && bundle.getBoolean("share_from_green_screen_kit")) {
            return false;
        }
        LLLLL().LJJJJJ();
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLJL.LIZIZ;
        if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
            return false;
        }
        return ID0.LJII(session.LIZ);
    }

    @Override // X.I9W
    public void rJ(boolean z) {
        this.LLD.LJII(Boolean.valueOf(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r1 != null) goto L17;
     */
    @Override // X.I9W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uc0(boolean r5) {
        /*
            r4 = this;
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r4.LLIFFJFJJ()
            X.WJm r0 = r4.LJLJI
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r0.zZ()
            java.lang.String r3 = r0.mMusicPath
            if (r2 == 0) goto L1a
            java.util.List r0 = r2.getTags()
            if (r0 == 0) goto L1a
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L1b
        L1a:
            return
        L1b:
            java.util.List r1 = r2.getTags()
            if (r1 == 0) goto L1a
            java.lang.String r0 = "strong_beat"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L1a
            X.ID3 r0 = r4.LJLJL
            X.Yns<? super java.lang.String, java.lang.String> r1 = r0.LIZJ
            if (r1 == 0) goto L5a
            java.lang.String r0 = "mMusicPath"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            java.lang.Object r1 = r1.invoke(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L5a
        L3c:
            X.WtX r0 = r4.LLF()
            r0.I9(r1)
            if (r5 == 0) goto L1a
            X.IDN r0 = X.IDN.INSTANCE
            X.F4V r1 = r4.LLLIIII(r0)
            boolean r0 = r1 instanceof X.IDD
            if (r0 != 0) goto L50
            r1 = 0
        L50:
            X.IDD r1 = (X.IDD) r1
            if (r1 == 0) goto L1a
            X.W0y r0 = r1.LJLIL
            r0.i1(r2)
            goto L1a
        L5a:
            java.lang.String r1 = ""
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC46244ICy.uc0(boolean):void");
    }

    @Override // X.I9W
    public void uq0(boolean z) {
        this.LJZL.LJII(Boolean.valueOf(z));
    }

    public AbstractC46244ICy(C82622Wbi diContainer, InterfaceC88472Yns<? super ID3, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LLIIIJ = diContainer;
        this.LJLIL = (C29S) getDiContainer().LJ(C29S.class, null);
        InterfaceC74343TFr interfaceC74343TFr = (InterfaceC74343TFr) getDiContainer().LJIIIIZZ(null, InterfaceC74343TFr.class);
        this.LJLILLLLZI = interfaceC74343TFr == null ? IAT.LIZ : interfaceC74343TFr;
        InterfaceC82086WJm interfaceC82086WJm = (InterfaceC82086WJm) getDiContainer().LJ(InterfaceC82086WJm.class, null);
        this.LJLJI = interfaceC82086WJm;
        this.LJLJJI = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLJJL = interfaceC82086WJm.e8();
        this.LJLJJLL = UCI.LJI(getDiContainer(), InterfaceC84497XEf.class, null);
        ID3 id3 = new ID3(null);
        this.LJLJL = id3;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(id3);
        }
        this.LJLJLJ = new C73318Sq2();
        getLifecycleOwner();
        this.LJLJLLL = new IDC(this, this, id3.LIZLLL);
        this.LJLL = interfaceC82086WJm.bh();
        this.LJLLI = new ID9(null, new AqS157S0100000_7((AbstractC46244ICy) this, 30));
        this.LJLLILLLL = new C83884Ww4(LJLLL());
        this.LJLLJ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, new AqS157S0100000_7((AbstractC46244ICy) this, 31));
        this.LJLLL = C221108m2.LIZ(EnumC221088m0.NONE, new AqS157S0100000_7((AbstractC46244ICy) this, 33));
        this.LJLLLL = C221108m2.LIZIZ(new AqS157S0100000_7((AbstractC46244ICy) this, 32));
        this.LJLZ = new IDA(this);
        this.LJZ = new C81638W2g(this);
        this.LJZI = new C29901Fi<>();
        this.LJZL = new C29901Fi<>();
        this.LL = new C29901Fi<>();
        this.LLD = new C29901Fi<>();
        this.LLF = new IDO();
        this.LLFF = new C29901Fi<>();
        this.LLFFF = new C29901Fi<>();
        this.LLFII = new C29901Fi<>();
        this.LLFZ = new C29901Fi<>();
        this.LLI = new C29901Fi<>();
        this.LLIFFJFJJ = new C29901Fi<>();
        this.LLII = new C73893SzJ<>();
    }

    public final void LJJLIIJ(F4V handler, boolean z) {
        o.LJIIIZ(handler, "handler");
        this.LJLJLLL.LIZ(handler, z);
    }

    public void LJJLJ(FrameLayout stickerPanelContainer, InterfaceC83566Wqw onEffectShow) {
        o.LJIIIZ(stickerPanelContainer, "stickerPanelContainer");
        o.LJIIIZ(onEffectShow, "onEffectShow");
        P2(this.LJLZ);
        W0Y w0y = (W0Y) getDiContainer().LJIIIIZZ(null, W0Y.class);
        if (w0y != null) {
            InterfaceC81604W0y LIZ = w0y.LIZ(stickerPanelContainer);
            LIZ.G8(this);
            P2(new IDD(LIZ));
            getLifecycleOwner();
            this.LJLLLLLL = new C81605W0z(this, LLLLL(), LIZ, new AqS138S0200000_7(this, stickerPanelContainer, 5));
        }
    }

    public void No(InterfaceC83566Wqw onEffectTvShow, FrameLayout stickerPanelContainer) {
        o.LJIIIZ(onEffectTvShow, "onEffectTvShow");
        o.LJIIIZ(stickerPanelContainer, "stickerPanelContainer");
        LJJLJ(stickerPanelContainer, onEffectTvShow);
        LLJI();
        LJJLIIIJILLIZJL(LLLLL());
        LJJLJLI(LLLLL(), LLZL());
        Z7();
        LLJJ();
        this.LLI.LJII(null);
    }

    @Override // X.I9W
    public void W90(boolean z, String enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLILLLLZI.LJFF().start();
        this.LJZI.LJII(Boolean.valueOf(z));
        if (z) {
            if (enterMethod.length() == 0) {
                this.LJLILLLLZI.LJ("click_entrance");
            } else {
                this.LJLILLLLZI.LJ(enterMethod);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.ss.android.ugc.effectmanager.effect.model.Effect] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // X.I9W
    public void g00(List<? extends Effect> list, boolean z) {
        Effect effect;
        o.LJIIIZ(list, "list");
        if (this.LLIIII) {
            return;
        }
        Effect effect2 = (Effect) ORZ.LJLLLL(list);
        if (effect2 != null) {
            this.LLF.LIZIZ.LJII(effect2);
            LJLJJLL(effect2);
        }
        if (LLILL() && C82398WVm.LIZJ(this) == null) {
            C29901Fi c29901Fi = this.LLF.LIZ;
            if (C78886Uxe.LJJIJ(list)) {
                effect = 0;
            } else {
                Iterator<? extends Effect> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        effect = it.next();
                        if (!ID0.LJIJJ(effect)) {
                            break;
                        }
                    } else {
                        effect = ListProtector.get(list, 0);
                        break;
                    }
                }
            }
            c29901Fi.LJII(effect);
        }
        this.LLIIII = z;
    }

    public void LJLLILLLL(InterfaceC74393THp stickerRepository, InterfaceC74309TEj stickerSource, String categoryKey) {
        o.LJIIIZ(stickerRepository, "stickerRepository");
        o.LJIIIZ(stickerSource, "stickerSource");
        o.LJIIIZ(categoryKey, "categoryKey");
        LiveData LIZ = C74310TEk.LIZ(stickerSource, categoryKey, false, 14);
        getLifecycleOwner();
        LIZ.observe(this, new ID2(this, stickerSource, categoryKey, stickerRepository));
    }

    public /* synthetic */ AbstractC46244ICy(C82622Wbi c82622Wbi, InterfaceC88472Yns interfaceC88472Yns, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, (i & 2) != 0 ? null : interfaceC88472Yns);
    }

    public static /* synthetic */ void LJJLIIIIJ(AbstractC46244ICy abstractC46244ICy, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            abstractC46244ICy.LJJLI(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCustomCategories");
    }

    public static /* synthetic */ void LJJLIIIJJIZ(AbstractC46244ICy abstractC46244ICy, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            abstractC46244ICy.LJJLIIIJJI(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFavoriteCategory");
    }

    public final void LJLIIL(int i, int i2, int i3, String str) {
        u5(i, i2, i3, str);
        this.LLII.onNext(new OSZ<>(LLIFFJFJJ(), new C44243HXz(i, i2, i3, str)));
    }

    @Override // X.I9W
    public void u5(int i, int i2, int i3, String str) {
        Iterator<InterfaceC81397Vx3> it = this.LJLJLLL.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onMessageReceived(i, i2, i3, str);
        }
    }
}
