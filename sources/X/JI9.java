package X;

import Y.ARunnableS27S0200000_8;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.performance.core.config.UserHorizontalVideoPreloadConfig;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JI9 extends JNU implements InterfaceC48907JHj, JIG {
    public static final C48946JIw LLFZ = new C48946JIw(C48947JIx.LIZJ);
    public final C46338IGo LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public C48946JIw LJLL;
    public TextView LJLLI;
    public C164086cG LJLLILLLL;
    public TextView LJLLJ;
    public C48887JGp LJLLL;
    public C71898SJq LJLLLL;
    public ConstraintLayout LJLLLLLL;
    public View LJLZ;
    public int LJZ;
    public Aweme LJZI;
    public InterfaceC88473Ynt<? super View, ? super Integer, ? super Aweme, C76800UCe> LJZL;
    public JON LL;
    public final boolean LLD;
    public final C62822Ol8 LLF;
    public final J1Z LLFF;
    public final C46333IGj LLFFF;
    public final C46545IOn LLFII;

    @Override // X.InterfaceC48907JHj
    public final void LJIILL() {
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return true;
    }

    @Override // X.InterfaceC48907JHj
    public final void contextPause() {
    }

    @Override // X.InterfaceC48907JHj
    public final void g9() {
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
        return null;
    }

    @Override // X.InterfaceC48907JHj
    public final void pause() {
    }

    @Override // X.InterfaceC48907JHj
    public final void play() {
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        JGI core;
        C48887JGp c48887JGp = this.LJLLL;
        boolean z = false;
        if (c48887JGp != null && (core = c48887JGp.getCore()) != null && core.LLFFF().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
        JGI core;
        C48887JGp c48887JGp = this.LJLLL;
        if (c48887JGp != null && (core = c48887JGp.getCore()) != null) {
            core.LLLLLJLJLL();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        JGI core;
        C48887JGp c48887JGp = this.LJLLL;
        if (c48887JGp == null || (core = c48887JGp.getCore()) == null || !core.isPlaying()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLJIL() {
        JGI core;
        if (C34259DcV.LIZ() != 0 && LJLJL().LIZIZ == 3) {
            Thread.sleep(C34259DcV.LIZ());
        }
        C48887JGp c48887JGp = this.LJLLL;
        if (c48887JGp != null && (core = c48887JGp.getCore()) != null) {
            JIC.LIZ(core);
        }
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        return this.LLFII;
    }

    @Override // X.JIG
    public final void LL(JIB jib) {
        JGI core;
        JIA jia = new JIA(this, jib);
        C48887JGp c48887JGp = this.LJLLL;
        if (c48887JGp != null && (core = c48887JGp.getCore()) != null) {
            core.setContainerStatusProvider(jia);
        }
    }

    public final void P(Aweme aweme) {
        String str;
        Video video;
        UrlModel cover;
        List<String> urlList;
        UrlModel cover2;
        List<String> urlList2;
        Video video2 = aweme.getVideo();
        boolean z = true;
        if (C34251DcN.LIZ() != 0) {
            long LIZ = C34251DcN.LIZ();
            Video video3 = aweme.getVideo();
            if (video3 == null || (cover2 = video3.getCover()) == null || (urlList2 = cover2.getUrlList()) == null || urlList2.isEmpty()) {
                z = false;
            }
            if (z && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null) {
                str = (String) ListProtector.get(urlList, 0);
            } else {
                str = null;
            }
            if (W5I.LIZ().LJII(UriProtector.parse(str))) {
                LIZ = 0;
            }
            C164086cG c164086cG = this.LJLLILLLL;
            if (c164086cG != null) {
                c164086cG.postDelayed(new ARunnableS27S0200000_8(video2, this, 52), LIZ);
                return;
            } else {
                o.LJIJI("coverView");
                throw null;
            }
        }
        Q(video2);
    }

    public final void Q(Video video) {
        UrlModel urlModel;
        String str;
        Integer num = null;
        if (video != null) {
            urlModel = video.getCover();
        } else {
            urlModel = null;
        }
        W5F LIZLLL = C40084FoG.LIZLLL(urlModel, "AwemeCardListAdapter");
        C164086cG c164086cG = this.LJLLILLLL;
        if (c164086cG != null) {
            LIZLLL.LJJIIJ = c164086cG;
            int i = LJLJL().LJIIL;
            Aweme aweme = this.LJZI;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            C50652JuK.Companion.getClass();
            C50321Joz LIZIZ = C50651JuJ.LIZIZ();
            if (LIZIZ != null) {
                num = Integer.valueOf(LIZIZ.getTabIndex());
            }
            LIZLLL.LJJIZ = new OF7(i, str, num, LJLJL().LJII, false);
            LIZLLL.LJ();
            return;
        }
        o.LJIJI("coverView");
        throw null;
    }

    public final void T(J1M j1m) {
        String str;
        JON jon;
        JGI core;
        JYH jyh = JYH.LIZIZ;
        if (jyh.LJIIJ()) {
            J1C.LIZ = false;
            jyh.LIZLLL("general_search", j1m, J1O.STYLE_NO_BUTTON);
        }
        J1C.LIZJ(!J1C.LIZIZ() ? 1 : 0);
        JQA LJLJL = LJLJL();
        Aweme aweme = this.LJZI;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        LJLJL.LJIILL = str;
        JII.LIZ(J1C.LIZIZ(), LJLJL(), null);
        C48887JGp c48887JGp = this.LJLLL;
        if (c48887JGp != null && (core = c48887JGp.getCore()) != null) {
            core.setMute(J1C.LIZ(C46314IFq.LIZIZ() ? 1 : 0, 0, this.LJZI));
        }
        JHK jhk = EnumC48916JHs.Companion;
        J1C.LJ();
        int i = J1C.LIZIZ;
        jhk.getClass();
        EnumC48916JHs LIZ = JHK.LIZ(i);
        if (LIZ != null && (jon = this.LL) != null) {
            jon.LIZ(LIZ, false);
        }
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        C34X c34x;
        o.LJIIIZ(v, "v");
        super.onViewAttachedToWindow(v);
        InterfaceC36571c5 activity = getActivity();
        if ((activity instanceof C34X) && (c34x = (C34X) activity) != null) {
            c34x.registerActivityOnKeyDownListener(this.LLFF);
        }
        if (!C46447IKt.LJLJLJ) {
            JLU.LJII(this);
        }
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        C34X c34x;
        o.LJIIIZ(v, "v");
        super.onViewDetachedFromWindow(v);
        if (!C46447IKt.LJLJLJ) {
            JLU.LJIIIIZZ(this);
        }
        LLLLLJLJLL();
        InterfaceC36571c5 activity = getActivity();
        if ((activity instanceof C34X) && (c34x = (C34X) activity) != null) {
            c34x.unRegisterActivityOnKeyDownListener(this.LLFF);
        }
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

    public JI9(View view, C46338IGo c46338IGo) {
        super(view);
        boolean z;
        C46545IOn c46545IOn;
        this.LJLJL = c46338IGo;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS158S0100000_8(view, 472));
        this.LJLJLLL = C221108m2.LIZIZ(JIE.LJLIL);
        C46337IGn.LJLJLJ.getClass();
        if (((UserHorizontalVideoPreloadConfig) C46337IGn.LJLL.getValue()).enableUserVideoPreload && C46442IKo.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        this.LLD = z;
        this.LLF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 473));
        this.LLFF = new J1Z(this);
        this.LLFFF = new C46333IGj(this);
        if (z) {
            c46545IOn = new C46545IOn(this);
        } else {
            c46545IOn = null;
        }
        this.LLFII = c46545IOn;
    }
}
