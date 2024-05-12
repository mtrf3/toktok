package X;

import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS38S0301000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.JIf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48929JIf extends FrameLayout implements JUO, InterfaceC48907JHj {
    public volatile Long LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public InterfaceC88471Ynr<? super String, ? super java.util.Map<String, ? extends Object>, C76800UCe> LJLJL;
    public InterfaceC65784Pro<C76800UCe> LJLJLJ;
    public String LJLJLLL;
    public SmartImageView LJLL;
    public ARunnableS44S0100000_8 LJLLI;
    public final Handler LJLLILLLL;
    public final long LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public boolean LJLZ;
    public final C48927JId LJZ;
    public int LJZI;

    @Override // X.JUO
    public final void LIZ() {
        LJIILJJIL(true);
        LJIIL("ended", new HashMap());
        this.LJLJJLL = false;
    }

    @Override // X.JUO
    public final void LIZIZ() {
        this.LJLJJLL = true;
    }

    @Override // X.JUO
    public final void LIZJ() {
    }

    @Override // X.JUO
    public final void LIZLLL() {
    }

    @Override // X.JUO
    public final void LJ() {
        this.LJLZ = true;
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.JUO
    public final void LJFF() {
    }

    @Override // X.JUO
    public final void LJI(int i, int i2, View view) {
    }

    public final void LJIIJJI() {
        JLU.LJIIIIZZ(getLiveCore());
        InterfaceC48908JHk interfaceC48908JHk = getDataProvider().LJ;
        if (interfaceC48908JHk != null) {
            interfaceC48908JHk.onDestroy();
        }
        C49153JQv mScrollStateManager = getMScrollStateManager();
        if (mScrollStateManager != null) {
            mScrollStateManager.LJIIIIZZ(getMScrollStateObserver());
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void LJIILL() {
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return true;
    }

    @Override // X.InterfaceC49148JQq
    public View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public InterfaceC46334IGk getPreload() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public InterfaceC49137JQf getPriority() {
        return null;
    }

    @Override // X.JUO
    public final void onBind() {
    }

    @Override // X.JUO
    public final void onDestroy() {
    }

    @Override // X.JUO
    public final void onInit() {
    }

    @Override // X.JUO
    public final void onPause() {
        LJIILJJIL(false);
        LJIIL("stop", new HashMap());
        this.LJLJJLL = false;
    }

    @Override // X.InterfaceC48907JHj
    public final void pause() {
    }

    private final C48928JIe getContainerStatusProvider() {
        return (C48928JIe) this.LJLLLL.getValue();
    }

    public final void LJIIIIZZ() {
        C49153JQv c49153JQv;
        if (!this.LJLJJI) {
            return;
        }
        g9();
        JLU.LJII(getLiveCore());
        JI2 LIZ = C48923JHz.LIZ(this);
        if (LIZ != null) {
            c49153JQv = LIZ.LJLIL;
        } else {
            c49153JQv = null;
        }
        setMScrollStateManager(c49153JQv);
        C49153JQv mScrollStateManager = getMScrollStateManager();
        if (mScrollStateManager != null) {
            mScrollStateManager.LJII(getMScrollStateObserver());
        }
    }

    public final void LJIILLIIL() {
        long j;
        InterfaceC48908JHk interfaceC48908JHk;
        Long l;
        if (this.LJLJJL) {
            String roomId = getRoomId();
            if (roomId != null) {
                j = CastLongProtector.parseLong(roomId);
            } else {
                j = -1;
            }
            if ((this.LJLIL == null || (l = this.LJLIL) == null || l.longValue() != j) && (interfaceC48908JHk = getDataProvider().LJ) != null) {
                interfaceC48908JHk.LLLLLJLJLL();
            }
        } else {
            InterfaceC48908JHk interfaceC48908JHk2 = getDataProvider().LJ;
            if (interfaceC48908JHk2 != null) {
                interfaceC48908JHk2.LLLLLJLJLL();
            }
        }
        LJIILJJIL(false);
    }

    public final C48935JIl getDataProvider() {
        return (C48935JIl) this.LJLLLLLL.getValue();
    }

    public final JUK getLiveCore() {
        return (JUK) this.LJLLL.getValue();
    }

    @Override // X.JUO
    public final void onLoading() {
        LJIIL("loading", new HashMap());
    }

    @Override // X.InterfaceC48907JHj
    public final void play() {
        long j;
        if (this.LJLJJL) {
            String roomId = getRoomId();
            if (roomId != null) {
                j = CastLongProtector.parseLong(roomId);
            } else {
                j = 1;
            }
            Long l = this.LJLIL;
            if (l != null && j == l.longValue()) {
                this.LJLZ = false;
                this.LJLIL = null;
                LJIILLIIL();
            }
            getLiveCore().setMute(true);
        }
        InterfaceC48908JHk interfaceC48908JHk = getDataProvider().LJ;
        if (interfaceC48908JHk == null) {
            return;
        }
        interfaceC48908JHk.LLLLII(150L);
    }

    private final AbstractC49155JQx getMScrollStateObserver() {
        return getDataProvider().LIZLLL;
    }

    @Override // X.JUO
    public final void LJII() {
        getLiveCore().LIZIZ();
    }

    @Override // X.JUO
    public final void LJIIIZ() {
        LiveRoomStruct liveRoomStruct;
        Aweme aweme = getDataProvider().LJI;
        if (aweme != null) {
            liveRoomStruct = aweme.getNewLiveRoomData();
        } else {
            liveRoomStruct = null;
        }
        if ((liveRoomStruct == null || !liveRoomStruct.liveTypeAudio) && this.LJLZ) {
            this.LJLZ = false;
            getLiveCore().LJIIIIZZ();
        }
        JUK liveCore = getLiveCore();
        if (liveCore != null) {
            liveCore.setMute(J1C.LIZ(this.LJZI, 0, null));
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJLJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        J1C.LJ();
        LJIIL("play", C113554cx.LJJJLZIJ(new OSZ("muted", Integer.valueOf(J1C.LIZIZ))));
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        JUK liveCore = getLiveCore();
        liveCore.getClass();
        return liveCore;
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLJIL() {
        InterfaceC48908JHk interfaceC48908JHk = getDataProvider().LJ;
        if (interfaceC48908JHk != null) {
            interfaceC48908JHk.LLLLII(0L);
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
        InterfaceC48908JHk interfaceC48908JHk = getDataProvider().LJ;
        if (interfaceC48908JHk != null) {
            interfaceC48908JHk.LLLLLJLJLL();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC48907JHj
    public final void contextPause() {
        InterfaceC48908JHk interfaceC48908JHk = getDataProvider().LJ;
        if (interfaceC48908JHk != null) {
            interfaceC48908JHk.contextPause();
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void g9() {
        InterfaceC48908JHk interfaceC48908JHk = getDataProvider().LJ;
        if (interfaceC48908JHk != null) {
            interfaceC48908JHk.onDestroy();
        }
    }

    public final Aweme getMAweme() {
        return getDataProvider().LJI;
    }

    public final C49153JQv getMScrollStateManager() {
        return getDataProvider().LIZJ;
    }

    public final String getRoomId() {
        User author;
        Aweme mAweme = getMAweme();
        if (mAweme != null && (author = mAweme.getAuthor()) != null) {
            return author.roomIdStr;
        }
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        return getLiveCore().isPlaying();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        C34X c34x;
        super.onAttachedToWindow();
        EventBus.LIZJ().LJIILJJIL(this);
        getDataProvider().LIZ = getContainerStatusProvider();
        LJIIIIZZ();
        ConcurrentHashMap<String, WeakReference<JQA>> concurrentHashMap = C49621Jdh.LJIJ;
        Aweme mAweme = getMAweme();
        if (mAweme == null || (str = mAweme.getAid()) == null) {
            str = "";
        }
        concurrentHashMap.put(str, new WeakReference<>(getDataProvider().LJII));
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        InterfaceC36571c5 LJJIFFI = C45804HyK.LJJIFFI(context);
        if ((LJJIFFI instanceof C34X) && (c34x = (C34X) LJJIFFI) != null) {
            c34x.registerActivityOnKeyDownListener(this.LJZ);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C34X c34x;
        super.onDetachedFromWindow();
        LJIIJJI();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        InterfaceC36571c5 LJJIFFI = C45804HyK.LJJIFFI(context);
        if ((LJJIFFI instanceof C34X) && (c34x = (C34X) LJJIFFI) != null) {
            c34x.unRegisterActivityOnKeyDownListener(this.LJZ);
        }
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    public final Long getJumpRoomId() {
        return this.LJLIL;
    }

    public final boolean getOutCorner() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48929JIf(Context context) {
        super(context, null, 0);
        JSE LIZ;
        SmartImageView smartImageView;
        a1.LJFF(context, "context");
        this.LJLJI = -1;
        this.LJLJJI = true;
        this.LJLLILLLL = new Handler(C16880lQ.LLJJJJ());
        this.LJLLJ = 500L;
        this.LJLLL = C221108m2.LIZIZ(new AqS38S0301000_8(context, (AttributeSet) null, 0, this, 1));
        this.LJLLLL = C221108m2.LIZIZ(new AqS155S0200000_8(this, context, 48));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 720));
        this.LJLZ = true;
        this.LJZ = new C48927JId(this);
        getDataProvider().LJII = new JQA();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.cjg, this, true);
        this.LJLL = (SmartImageView) findViewById(R.id.etr);
        if (C34127DaN.LJFF() && (smartImageView = this.LJLL) != null) {
            C49421JaT.LJ(smartImageView, false);
        }
        getLiveCore().setMCoverView(this.LJLL);
        AqS174S0100000_8 aqS174S0100000_8 = new AqS174S0100000_8(this, 285);
        C48942JIs c48942JIs = new C48942JIs();
        aqS174S0100000_8.invoke(c48942JIs);
        getDataProvider().LJ = c48942JIs;
        InterfaceC48908JHk interfaceC48908JHk = getDataProvider().LJ;
        if (interfaceC48908JHk != null && (LIZ = C49995Jjj.LIZ.LIZ(this.LJLJI)) != null) {
            LIZ.LIZIZ = new WeakReference<>(interfaceC48908JHk);
        }
        getDataProvider().LIZIZ = new C48885JGn(getLiveCore());
        AqS139S0200000_8 aqS139S0200000_8 = new AqS139S0200000_8(this, c48942JIs, 57);
        C48909JHl c48909JHl = new C48909JHl();
        aqS139S0200000_8.invoke(c48909JHl);
        setMScrollStateObserver(c48909JHl);
        getLiveCore().LIZ(new AqS158S0100000_8(this, 725));
    }

    private final void setMAweme(Aweme aweme) {
        getDataProvider().LJI = aweme;
    }

    private final void setMScrollStateObserver(AbstractC49155JQx abstractC49155JQx) {
        getDataProvider().LIZLLL = abstractC49155JQx;
    }

    public final void LJIIJ(Aweme aweme) {
        UrlModel urlModel;
        if (o.LJ(getMAweme(), aweme)) {
            return;
        }
        g9();
        this.LJLZ = true;
        SmartImageView smartImageView = this.LJLL;
        User author = aweme.getAuthor();
        JQA jqa = null;
        if (author != null) {
            urlModel = author.roomCover;
        } else {
            urlModel = null;
        }
        if (smartImageView != null && urlModel != null) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
            LJII.LJJIIJ = smartImageView;
            C16880lQ.LLJJJ(LJII);
        }
        getLiveCore().LIZJ(aweme);
        getLiveCore().LIZIZ();
        ConcurrentHashMap<String, WeakReference<JQA>> concurrentHashMap = C49621Jdh.LJIJ;
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        C48935JIl dataProvider = getDataProvider();
        if (dataProvider != null) {
            jqa = dataProvider.LJII;
        }
        concurrentHashMap.put(aid, new WeakReference<>(jqa));
        setMAweme(aweme);
    }

    public final void LJIILJJIL(boolean z) {
        if (!this.LJLZ) {
            this.LJLZ = true;
            JUK liveCore = getLiveCore();
            liveCore.LJLJLLL = true;
            ImageView imageView = liveCore.LJLILLLLZI;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(0);
        }
    }

    @Override // X.JUO
    public final void onError(String info) {
        o.LJIIIZ(info, "info");
        LJIIL("error", C113554cx.LJJJLZIJ(new OSZ("error", info)));
        LJIILJJIL(true);
        this.LJLJJLL = false;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onLiveCardJump(C2UR jumpEvent) {
        o.LJIIIZ(jumpEvent, "jumpEvent");
        this.LJLIL = jumpEvent.LJLIL;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (!this.LJLJJL) {
            return;
        }
        C2U8.LIZ(new C48932JIi(getRoomId(), i, this.LJLJJLL));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void searchShopTabVisible(IGH visibleEvent) {
        o.LJIIIZ(visibleEvent, "visibleEvent");
        if (!this.LJLJJL) {
            return;
        }
        if (this.LJLJJLL && visibleEvent.LJLIL) {
            play();
        } else {
            LJIILLIIL();
        }
    }

    public void setAutoPlay(boolean z) {
        this.LJLJJI = z;
        if (!z) {
            LJIIJJI();
        } else {
            LJIIIIZZ();
        }
    }

    public void setAwemeIndex(C48930JIg awemeIndex) {
        DynamicPatch dynamicPatch;
        List<Aweme> awemeList;
        Aweme aweme;
        List<SearchLiveStruct> list;
        List<Aweme> awemeList2;
        o.LJIIIZ(awemeIndex, "awemeIndex");
        C48935JIl dataProvider = getDataProvider();
        if (dataProvider != null) {
            int i = awemeIndex.LJLILLLLZI;
            int i2 = -1;
            if (i >= 0) {
                int i3 = 0;
                while (true) {
                    JSE LIZ = C49995Jjj.LIZ.LIZ(this.LJLJI);
                    if (LIZ != null && (dynamicPatch = LIZ.LIZ) != null && (awemeList = dynamicPatch.getAwemeList()) != null && (aweme = (Aweme) ListProtector.get(awemeList, i3)) != null && aweme.getAid() != null) {
                        i2++;
                    }
                    if (i3 == i) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            dataProvider.LJFF = i2;
        }
        JSE LIZ2 = C49995Jjj.LIZ.LIZ(this.LJLJI);
        if (LIZ2 != null) {
            DynamicPatch dynamicPatch2 = LIZ2.LIZ;
            if (dynamicPatch2 != null && (awemeList2 = dynamicPatch2.getAwemeList()) != null) {
                Object obj = ListProtector.get(awemeList2, awemeIndex.LJLILLLLZI);
                o.LJIIIIZZ(obj, "it[awemeIndex.index]");
                LJIIJ((Aweme) obj);
            }
            if (LIZ2.LJI && (list = LIZ2.LJ) != null) {
                Aweme liveAweme = ((SearchLiveStruct) ListProtector.get(list, awemeIndex.LJLILLLLZI)).getLiveAweme();
                o.LJIIIIZZ(liveAweme, "it[awemeIndex.index].liveAweme");
                LJIIJ(liveAweme);
                getDataProvider().LIZ = LIZ2.LJFF;
            }
        }
    }

    public void setEventChangeListener(InterfaceC88471Ynr<? super String, ? super java.util.Map<String, ? extends Object>, C76800UCe> interfaceC88471Ynr) {
        this.LJLJL = interfaceC88471Ynr;
    }

    public void setFirstFrameHandler(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJLJ = interfaceC65784Pro;
    }

    public final void setIsECommerce(boolean z) {
        this.LJLJJL = z;
    }

    public final void setJumpRoomId(Long l) {
        this.LJLIL = l;
    }

    public void setLogExtra(HashMap<String, Object> logExtra) {
        o.LJIIIZ(logExtra, "logExtra");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : logExtra.entrySet()) {
            if (entry.getValue() != null) {
                if (entry.getValue() instanceof JavaOnlyMap) {
                    String key = entry.getKey();
                    String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), entry.getValue());
                    o.LJIIIIZZ(json, "get().gson.toJson(item.value)");
                    hashMap.put(key, json);
                } else {
                    hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
        }
        JQA jqa = getDataProvider().LJII;
        if (jqa == null) {
            return;
        }
        jqa.LJJIIJ = hashMap;
    }

    public final void setMScrollStateManager(C49153JQv c49153JQv) {
        getDataProvider().LIZJ = c49153JQv;
    }

    public void setMuted(int i) {
        if (i == -1) {
            return;
        }
        J1C.LIZJ(i);
        if (i == 0) {
            JYH jyh = JYH.LIZIZ;
            if (jyh.LJIIJ()) {
                J1C.LIZ = false;
                jyh.LIZLLL("general_search", J1M.CLICK_UNMUTE_BUTTON, J1O.STYLE_NO_BUTTON);
            }
        }
        getLiveCore().setMute(J1C.LIZ(this.LJZI, 0, null));
    }

    public void setObjectFit(String objectFit) {
        o.LJIIIZ(objectFit, "objectFit");
        getLiveCore().setFitType(!o.LJ(objectFit, "fill") ? 1 : 0);
    }

    public final void setOutCorner(boolean z) {
        this.LJLILLLLZI = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r2 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSessionId(int r4) {
        /*
            r3 = this;
            r3.LJLJI = r4
            X.Jjj r0 = X.C49995Jjj.LIZ
            X.JSE r2 = r0.LIZ(r4)
            if (r2 != 0) goto L3a
        La:
            X.JIl r0 = r3.getDataProvider()
            X.JHk r1 = r0.LJ
            if (r1 == 0) goto L26
            if (r2 != 0) goto L29
        L14:
            r3.getDataProvider()
            Y.ARunnableS44S0100000_8 r1 = new Y.ARunnableS44S0100000_8
            r0 = 205(0xcd, float:2.87E-43)
            r1.<init>(r3, r0)
            r3.LJLLI = r1
            android.os.Handler r0 = r3.LJLLILLLL
            r0.post(r1)
            return
        L26:
            if (r2 != 0) goto L30
            goto L14
        L29:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r2.LIZIZ = r0
        L30:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            X.JUK r0 = r3.getLiveCore()
            r1.<init>(r0)
            goto L14
        L3a:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48929JIf.setSessionId(int):void");
    }

    public void setSoundControl(int i) {
        this.LJZI = i;
        getLiveCore().setMute(J1C.LIZ(i, 0, null));
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        C48905JHh.LIZJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    public final void LJIIL(String str, java.util.Map<String, ? extends Object> map) {
        if (!TextUtils.equals(this.LJLJLLL, str)) {
            this.LJLJLLL = str;
            InterfaceC88471Ynr<? super String, ? super java.util.Map<String, ? extends Object>, C76800UCe> interfaceC88471Ynr = this.LJLJL;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(str, map);
            }
        }
    }

    public final void LJIILIIL(JIB jib, JQA jqa) {
        Aweme mAweme;
        User author;
        String str;
        getDataProvider().LIZ = jib;
        JQA jqa2 = getDataProvider().LJII;
        java.util.Map<String, String> map = null;
        if (jqa2 != null) {
            map = jqa2.LJJIIJ;
        }
        if (jqa != null) {
            if (map != null) {
                jqa.LJJIIJ = map;
            }
            getDataProvider().LJII = jqa;
        }
        JQA jqa3 = getDataProvider().LJII;
        if (jqa3 != null && (mAweme = getMAweme()) != null && (author = mAweme.getAuthor()) != null && (str = author.roomIdStr) != null) {
            jqa3.LJIILJJIL = str;
        }
    }
}
