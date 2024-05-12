package X;

import Y.AfS60S0100000_8;
import Y.IDCListenerS245S0100000_8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.TVStationRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import defpackage.a1;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JUK extends FrameLayout implements InterfaceC48907JHj {
    public final C62822Ol8 LJLIL;
    public ImageView LJLILLLLZI;
    public final JUK LJLJI;
    public long LJLJJI;
    public final long LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public C51093K3l LJLL;
    public InterfaceC62644OiG LJLLI;

    public final void LJFF() {
        setKeepScreenOn(false);
        getStatusDelegate().onPause();
        setMLiveStarted(false);
        InterfaceC86353Xun mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper != null && (!mLivePlayHelper.b())) {
            mLivePlayHelper.d();
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void LJIILL() {
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        return this;
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

    @Override // X.InterfaceC48907JHj
    public final void pause() {
    }

    @Override // X.InterfaceC48907JHj
    public final void play() {
    }

    public void setAutoPlay(boolean z) {
    }

    public final void LIZIZ() {
        ImageView imageView = this.LJLILLLLZI;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(0);
    }

    public final void LJIIIIZZ() {
        if (this.LJLJLLL) {
            this.LJLJLLL = false;
            ImageView imageView = this.LJLILLLLZI;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public final C48935JIl getDataProvider() {
        return (C48935JIl) this.LJLIL.getValue();
    }

    public final JUL getStatusDelegate() {
        return (JUL) this.LJLJJLL.getValue();
    }

    private final boolean getAttached() {
        return getDataProvider().LJIIJ;
    }

    private final JIB getContainerStatusProvider() {
        return getDataProvider().LIZ;
    }

    private final LiveRoomStruct getLiveRoomStruct() {
        Aweme aweme = getDataProvider().LJI;
        if (aweme != null) {
            return aweme.getNewLiveRoomData();
        }
        return null;
    }

    private final Aweme getMAweme() {
        return getDataProvider().LJI;
    }

    private final boolean getMLiveStarted() {
        return getDataProvider().LJIIIZ;
    }

    public final void LJ() {
        String aid;
        Aweme mAweme = getMAweme();
        String livePlayerTag = getLivePlayerTag();
        if (mAweme != null && (aid = mAweme.getAid()) != null && aid.length() > 0) {
            C46322IFy.LIZ.put(aid, livePlayerTag);
        }
        getStatusDelegate().LJIIIZ();
    }

    public final void LJIIIZ() {
        if (System.currentTimeMillis() - this.LJLJJI < this.LJLJJL) {
            return;
        }
        this.LJLJJI = System.currentTimeMillis();
        LiveRoomStruct liveRoomStruct = getLiveRoomStruct();
        if (liveRoomStruct != null) {
            LiveOuterService.LJJJLL().LJJIJIL().LJJIJL("search", null, liveRoomStruct.id, new JUP(this));
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLJIL() {
        InterfaceC86353Xun mLivePlayHelper;
        TVStationRoomStruct tVStationRoomStruct;
        JIB containerStatusProvider;
        if (!((RBX) HG3.LJIILL()).isLogin() || !getAttached()) {
            return;
        }
        JIB containerStatusProvider2 = getContainerStatusProvider();
        if ((containerStatusProvider2 == null || !containerStatusProvider2.isActive() || ((containerStatusProvider = getContainerStatusProvider()) != null && !containerStatusProvider.LIZIZ())) && !C46447IKt.LJLJLJ) {
            return;
        }
        LiveRoomStruct liveRoomStruct = getLiveRoomStruct();
        if ((liveRoomStruct != null && liveRoomStruct.isFinish()) || getMLiveStarted()) {
            return;
        }
        LiveRoomStruct liveRoomStruct2 = getLiveRoomStruct();
        if (liveRoomStruct2 != null && (tVStationRoomStruct = liveRoomStruct2.tvStationRoomStruct) != null && tVStationRoomStruct.isIdle) {
            return;
        }
        if (((Number) DYK.LIZ.getValue()).intValue() == 1) {
            JUT.LIZ = this.LJLLI;
        }
        LiveRoomStruct liveRoomStruct3 = getLiveRoomStruct();
        if (liveRoomStruct3 != null) {
            C51093K3l c51093K3l = this.LJLL;
            if (c51093K3l != null && (mLivePlayHelper = getMLivePlayHelper()) != null) {
                mLivePlayHelper.j(c51093K3l);
            }
            InterfaceC86353Xun mLivePlayHelper2 = getMLivePlayHelper();
            if (mLivePlayHelper2 != null) {
                JUV.LIZ(mLivePlayHelper2, this.LJLJL, liveRoomStruct3, this.LJLJI, 24);
            }
        }
        setMLiveStarted(true);
        JGU jgu = getDataProvider().LIZIZ;
        if (jgu != null) {
            jgu.LJLLL(getMAweme());
        }
        getStatusDelegate().LJFF();
        setKeepScreenOn(true);
        getStatusDelegate().onLoading();
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC48907JHj
    public final void g9() {
        InterfaceC86353Xun mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper != null) {
            mLivePlayHelper.destroy();
        }
        getStatusDelegate().onDestroy();
        setMLiveStarted(false);
        C46322IFy.LIZ(getMAweme());
    }

    public final String getLivePlayerTag() {
        InterfaceC86353Xun mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper != null) {
            return mLivePlayHelper.getPlayerTag();
        }
        return null;
    }

    public final InterfaceC86353Xun getMLivePlayHelper() {
        return getDataProvider().LJIIIIZZ;
    }

    public final String getStreamData() {
        LiveRoomStruct liveRoomStruct = getLiveRoomStruct();
        if (liveRoomStruct != null) {
            return liveRoomStruct.getMultiStreamData();
        }
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        return getMLiveStarted();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAttached(true);
        getStatusDelegate().LJII();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLJLLL = true;
        setAttached(false);
        getStatusDelegate().LJ();
        LJFF();
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
        LJFF();
    }

    @Override // X.InterfaceC48907JHj
    public final void contextPause() {
        LJFF();
    }

    public final int getFitType() {
        return this.LJLJLJ;
    }

    public final C51093K3l getLivePlayerEntranceParam() {
        return this.LJLL;
    }

    public final ImageView getMCoverView() {
        return this.LJLILLLLZI;
    }

    public final boolean getMute() {
        return this.LJLJL;
    }

    public final InterfaceC62644OiG getSearchLiveCoreCallback() {
        return this.LJLLI;
    }

    private final void setAttached(boolean z) {
        getDataProvider().LJIIJ = z;
    }

    private final void setMAweme(Aweme aweme) {
        getDataProvider().LJI = aweme;
    }

    private final void setMLivePlayHelper(InterfaceC86353Xun interfaceC86353Xun) {
        getDataProvider().LJIIIIZZ = interfaceC86353Xun;
    }

    private final void setMLiveStarted(boolean z) {
        getDataProvider().LJIIIZ = z;
    }

    public final void LIZ(InterfaceC65784Pro<? extends JUO> interfaceC65784Pro) {
        Integer num;
        JUO invoke = interfaceC65784Pro.invoke();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(hashCode());
        LIZ.append(" addLiveStatusListener : ");
        if (invoke != null) {
            num = Integer.valueOf(invoke.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        JUL statusDelegate = getStatusDelegate();
        if (invoke == null) {
            return;
        }
        statusDelegate.getClass();
        statusDelegate.LJIIIIZZ().add(invoke);
    }

    public final void LIZJ(Aweme aweme) {
        this.LJLJLLL = true;
        setMAweme(aweme);
        setTag(aweme);
        this.LJLL = null;
        getStatusDelegate().onBind();
    }

    public final void LIZLLL(String str) {
        getStatusDelegate().onError(str);
        C46322IFy.LIZ(getMAweme());
    }

    public final void LJI(String str) {
        new C73594SuU(AbstractC73638SvC.LJIJ(str).LJIJI(C48693J9d.LJLILLLLZI)).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIIZILJ(new AfS60S0100000_8(new AqS174S0100000_8(this, 180), 19), new InterfaceC64592gB() { // from class: X.9FV
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    public final void setFitType(int i) {
        if (i < 0 || i > 1) {
            return;
        }
        this.LJLJLJ = i;
    }

    public final void setLivePlayerEntranceParam(C51093K3l c51093K3l) {
        this.LJLL = c51093K3l;
    }

    public final void setMCoverView(ImageView imageView) {
        this.LJLILLLLZI = imageView;
    }

    public final void setMute(boolean z) {
        this.LJLJL = z;
        InterfaceC86353Xun mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper != null) {
            mLivePlayHelper.setMute(this.LJLJL);
        }
    }

    public final void setSearchLiveCoreCallback(InterfaceC62644OiG interfaceC62644OiG) {
        o.LJIIIZ(interfaceC62644OiG, "<set-?>");
        this.LJLLI = interfaceC62644OiG;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JUK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C32186CkA LJJJJZI;
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(C48934JIk.LJLIL);
        this.LJLJI = this;
        this.LJLJJL = 5000L;
        this.LJLJJLL = C221108m2.LIZIZ(JUR.LJLIL);
        this.LJLJLLL = true;
        getStatusDelegate().LIZLLL();
        if (((Number) DYK.LIZ.getValue()).intValue() == 1) {
            LJJJJZI = LiveOuterService.LJJJLL().LJJJJZI(new C62643OiF(), EnumC72797Shd.SEARCH);
            o.LJIIIIZZ(LJJJJZI, "service.generateLivePlay…ayHelper.PageType.SEARCH)");
        } else {
            LJJJJZI = LiveOuterService.LJJJLL().LJJJJZI(new JUN(this), EnumC72797Shd.SEARCH);
            o.LJIIIIZZ(LJJJJZI, "private fun generatePlay…er.PageType.SEARCH)\n    }");
        }
        setMLivePlayHelper(LJJJJZI);
        setMLiveStarted(false);
        getStatusDelegate().onInit();
        addOnAttachStateChangeListener(new IDCListenerS245S0100000_8(this, 14));
        this.LJLLI = new JUM(this);
    }

    public final void LJII(int i, int i2, View view) {
        C28185B4j l;
        InterfaceC86353Xun mLivePlayHelper = getMLivePlayHelper();
        View view2 = null;
        if (mLivePlayHelper != null && (l = mLivePlayHelper.l()) != null) {
            view2 = l.LIZ;
        }
        if (!(view2 instanceof TextureView) || view2 == null) {
            return;
        }
        getStatusDelegate().LJI(i, i2, view);
    }
}
