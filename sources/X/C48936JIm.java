package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import defpackage.a1;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JIm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48936JIm extends FrameLayout implements InterfaceC48907JHj, JUO {
    public boolean LJLIL;
    public final JUK LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public boolean LJLJJI;
    public ImageView LJLJJL;

    @Override // X.JUO
    public final void LJ() {
        this.LJLJJI = true;
        getDataProvider();
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

    @Override // X.InterfaceC48907JHj
    public final void pause() {
    }

    @Override // X.InterfaceC48907JHj
    public final void play() {
    }

    public void setAutoPlay(boolean z) {
    }

    @Override // X.JUO
    public final void LIZ() {
        JUK juk = this.LJLILLLLZI;
        juk.LJLJLLL = true;
        ImageView imageView = juk.LJLILLLLZI;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.LJLJJI = true;
        AbstractC48937JIn abstractC48937JIn = getDataProvider().LJIIJJI;
        if (abstractC48937JIn != null) {
            abstractC48937JIn.LIZ();
        }
    }

    @Override // X.JUO
    public final void LIZLLL() {
        if (!this.LJLIL && getContext() != null) {
            setOutlineProvider(new C42513GmL(this));
            setClipToOutline(true);
        }
        getDataProvider();
    }

    @Override // X.JUO
    public final void LJII() {
        this.LJLILLLLZI.LIZIZ();
        getDataProvider();
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        JUK juk = this.LJLILLLLZI;
        juk.getClass();
        return juk;
    }

    public final C48935JIl getDataProvider() {
        return (C48935JIl) this.LJLJI.getValue();
    }

    public final String getLivePlayerTag() {
        return this.LJLILLLLZI.getLivePlayerTag();
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        return this.LJLILLLLZI.isPlaying();
    }

    @Override // X.JUO
    public final void onPause() {
        JUK juk = this.LJLILLLLZI;
        juk.LJLJLLL = true;
        ImageView imageView = juk.LJLILLLLZI;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.LJLJJI = true;
        AbstractC48937JIn abstractC48937JIn = getDataProvider().LJIIJJI;
        if (abstractC48937JIn != null) {
            abstractC48937JIn.onPause();
        }
    }

    private final InterfaceC48908JHk getMediaHelper() {
        return getDataProvider().LJ;
    }

    @Override // X.JUO
    public final void LIZIZ() {
        AbstractC48937JIn abstractC48937JIn = getDataProvider().LJIIJJI;
        if (abstractC48937JIn != null) {
            abstractC48937JIn.LIZIZ();
        }
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
        if ((liveRoomStruct == null || !liveRoomStruct.liveTypeAudio) && this.LJLJJI) {
            this.LJLJJI = false;
            this.LJLILLLLZI.LJIIIIZZ();
        }
        AbstractC48937JIn abstractC48937JIn = getDataProvider().LJIIJJI;
        if (abstractC48937JIn != null) {
            abstractC48937JIn.LJIIIZ();
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLJIL() {
        InterfaceC48908JHk mediaHelper = getMediaHelper();
        if (mediaHelper == null) {
            return;
        }
        mediaHelper.LLLLII(150L);
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
        InterfaceC48908JHk mediaHelper = getMediaHelper();
        if (mediaHelper != null) {
            mediaHelper.LLLLLJLJLL();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC48907JHj
    public final void contextPause() {
        InterfaceC48908JHk mediaHelper = getMediaHelper();
        if (mediaHelper != null) {
            mediaHelper.contextPause();
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void g9() {
        InterfaceC48908JHk mediaHelper = getMediaHelper();
        if (mediaHelper != null) {
            mediaHelper.onDestroy();
        }
    }

    @Override // X.JUO
    public final void LIZJ() {
        getDataProvider();
    }

    @Override // X.JUO
    public final void LJFF() {
        getDataProvider();
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    public final JUK getLiveCore() {
        return this.LJLILLLLZI;
    }

    public final ImageView getMCoverView() {
        return this.LJLJJL;
    }

    public final boolean getOutCorner() {
        return this.LJLIL;
    }

    @Override // X.JUO
    public final void onBind() {
        getDataProvider();
    }

    @Override // X.JUO
    public final void onDestroy() {
        getDataProvider();
    }

    @Override // X.JUO
    public final void onInit() {
        getDataProvider();
    }

    @Override // X.JUO
    public final void onLoading() {
        getDataProvider();
    }

    @Override // X.JUO
    public final void onError(String info) {
        o.LJIIIZ(info, "info");
        AbstractC48937JIn abstractC48937JIn = getDataProvider().LJIIJJI;
        if (abstractC48937JIn != null) {
            abstractC48937JIn.onError(info);
        }
    }

    public final void setMCoverView(ImageView imageView) {
        this.LJLJJL = imageView;
        this.LJLILLLLZI.setMCoverView(imageView);
    }

    public final void setOutCorner(boolean z) {
        this.LJLIL = z;
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
    public C48936JIm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        JUK juk = new JUK(context, attributeSet, 0);
        this.LJLILLLLZI = juk;
        this.LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 496));
        this.LJLJJI = true;
        juk.LIZ(new AqS158S0100000_8(this, 490));
        juk.LIZ(new AqS158S0100000_8(this, 491));
        addView(juk);
    }

    public final void LJIIIIZZ(Aweme aweme, JQA jqa) {
        getDataProvider().LJII = jqa;
        JY2.LIZIZ(this, jqa);
        this.LJLJJI = true;
        this.LJLILLLLZI.LIZJ(aweme);
        this.LJLILLLLZI.LIZIZ();
    }

    @Override // X.JUO
    public final void LJI(int i, int i2, View view) {
        AbstractC48937JIn abstractC48937JIn = getDataProvider().LJIIJJI;
        if (abstractC48937JIn != null) {
            abstractC48937JIn.LJI(i, i2, view);
        }
    }
}
