package X;

import Y.AObserverS77S0100000_9;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.LRe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54258LRe {
    public static final C54259LRf LIZJ = new C54259LRf();
    public final FeedPanelStateViewModel LIZ;
    public final Context LIZIZ;

    public final boolean LIZIZ() {
        return LIZ("comment_panel");
    }

    public final boolean LIZJ() {
        return LIZ("not_interested_tutorial");
    }

    public final boolean LIZLLL() {
        return LIZ("share_panel");
    }

    public final boolean LJ() {
        return LIZ("swipe_up_guide");
    }

    public final boolean LIZ(String str) {
        Boolean value;
        FeedPanelStateViewModel.DialogStateLiveData LJFF = LJFF(str);
        if (LJFF == null || (value = LJFF.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final FeedPanelStateViewModel.DialogStateLiveData LJFF(String str) {
        FeedPanelStateViewModel feedPanelStateViewModel;
        FeedPanelStateViewModel feedPanelStateViewModel2;
        FeedPanelStateViewModel feedPanelStateViewModel3;
        FeedPanelStateViewModel feedPanelStateViewModel4;
        FeedPanelStateViewModel feedPanelStateViewModel5;
        FeedPanelStateViewModel feedPanelStateViewModel6;
        FeedPanelStateViewModel feedPanelStateViewModel7;
        FeedPanelStateViewModel feedPanelStateViewModel8;
        FeedPanelStateViewModel feedPanelStateViewModel9;
        FeedPanelStateViewModel feedPanelStateViewModel10;
        FeedPanelStateViewModel feedPanelStateViewModel11;
        FeedPanelStateViewModel feedPanelStateViewModel12;
        FeedPanelStateViewModel feedPanelStateViewModel13;
        FeedPanelStateViewModel feedPanelStateViewModel14;
        FeedPanelStateViewModel feedPanelStateViewModel15;
        FeedPanelStateViewModel feedPanelStateViewModel16;
        FeedPanelStateViewModel feedPanelStateViewModel17;
        FeedPanelStateViewModel feedPanelStateViewModel18;
        FeedPanelStateViewModel feedPanelStateViewModel19;
        switch (str.hashCode()) {
            case -2144360174:
                if (str.equals("long_press_layer") && (feedPanelStateViewModel = this.LIZ) != null) {
                    return feedPanelStateViewModel.LJLLLL;
                }
                return null;
            case -2140676667:
                if (str.equals("long_press_panel") && (feedPanelStateViewModel2 = this.LIZ) != null) {
                    return feedPanelStateViewModel2.LJLLLLLL;
                }
                return null;
            case -1835633107:
                if (str.equals("show_danmaku_rethink") && (feedPanelStateViewModel3 = this.LIZ) != null) {
                    return feedPanelStateViewModel3.LJLLL;
                }
                return null;
            case -1109403612:
                if (str.equals("comment_panel") && (feedPanelStateViewModel4 = this.LIZ) != null) {
                    return feedPanelStateViewModel4.LJLJJI;
                }
                return null;
            case -208635325:
                if (str.equals("gif_share_dialog") && (feedPanelStateViewModel5 = this.LIZ) != null) {
                    return feedPanelStateViewModel5.LJLL;
                }
                return null;
            case -67089052:
                if (str.equals("upload_progress_fragment") && (feedPanelStateViewModel6 = this.LIZ) != null) {
                    return feedPanelStateViewModel6.LJLZ;
                }
                return null;
            case -50729574:
                if (str.equals("input_danmaku") && (feedPanelStateViewModel7 = this.LIZ) != null) {
                    return feedPanelStateViewModel7.LJLLJ;
                }
                return null;
            case -18099452:
                if (str.equals("downloaded_video_share_dialog") && (feedPanelStateViewModel8 = this.LIZ) != null) {
                    return feedPanelStateViewModel8.LJLLI;
                }
                return null;
            case 106825951:
                if (str.equals("download_dialog") && (feedPanelStateViewModel9 = this.LIZ) != null) {
                    return feedPanelStateViewModel9.LJLJLJ;
                }
                return null;
            case 333438392:
                if (str.equals("permission_dialog") && (feedPanelStateViewModel10 = this.LIZ) != null) {
                    return feedPanelStateViewModel10.LJZI;
                }
                return null;
            case 403708324:
                if (str.equals("share_panel") && (feedPanelStateViewModel11 = this.LIZ) != null) {
                    return feedPanelStateViewModel11.LJLJJL;
                }
                return null;
            case 684302462:
                if (str.equals("privacy_policy_dialog") && (feedPanelStateViewModel12 = this.LIZ) != null) {
                    return feedPanelStateViewModel12.LJLJL;
                }
                return null;
            case 975552040:
                if (str.equals("not_interested_tutorial") && (feedPanelStateViewModel13 = this.LIZ) != null) {
                    return feedPanelStateViewModel13.LJZ;
                }
                return null;
            case 1049683556:
                if (str.equals("gif_download_dialog") && (feedPanelStateViewModel14 = this.LIZ) != null) {
                    return feedPanelStateViewModel14.LJLJLLL;
                }
                return null;
            case 1316323261:
                if (str.equals("swipe_up_guide") && (feedPanelStateViewModel15 = this.LIZ) != null) {
                    return feedPanelStateViewModel15.LJLILLLLZI;
                }
                return null;
            case 1494381465:
                if (str.equals("story_page") && (feedPanelStateViewModel16 = this.LIZ) != null) {
                    return feedPanelStateViewModel16.LJLJJLL;
                }
                return null;
            case 1654221230:
                if (str.equals("login_panel") && (feedPanelStateViewModel17 = this.LIZ) != null) {
                    return feedPanelStateViewModel17.LJLJI;
                }
                return null;
            case 2050924370:
                if (str.equals("ad_explain_static_dynamic") && (feedPanelStateViewModel18 = this.LIZ) != null) {
                    return feedPanelStateViewModel18.LJZL;
                }
                return null;
            case 2144107035:
                if (str.equals("follow_guide_popup") && (feedPanelStateViewModel19 = this.LIZ) != null) {
                    return feedPanelStateViewModel19.LJLLILLLL;
                }
                return null;
            default:
                return null;
        }
    }

    public final void LJI(boolean z) {
        LJIIJ("not_interested_tutorial", z, null);
    }

    public final void LJII(boolean z) {
        LJIIJ("permission_dialog", z, null);
    }

    public final void LJIIIZ(boolean z) {
        LJIIJ("upload_progress_fragment", z, null);
    }

    public C54258LRe(FeedPanelStateViewModel feedPanelStateViewModel, Context context) {
        this.LIZ = feedPanelStateViewModel;
        this.LIZIZ = context;
    }

    public final void LJIIIIZZ(String str, InterfaceC54260LRg interfaceC54260LRg) {
        FeedPanelStateViewModel.DialogStateLiveData LJFF;
        if (this.LIZ != null && (this.LIZIZ instanceof LifecycleOwner) && (LJFF = LJFF(str)) != null) {
            LJFF.observe((LifecycleOwner) this.LIZIZ, new AObserverS77S0100000_9(interfaceC54260LRg, 44));
        }
    }

    public final void LJIIJ(String str, boolean z, InterfaceC59622Vq interfaceC59622Vq) {
        FeedPanelStateViewModel.DialogStateLiveData LJFF = LJFF(str);
        if (LJFF != null && !o.LJ(LJFF.getValue(), Boolean.valueOf(z))) {
            LJFF.setValue(z);
            if (z) {
                LJFF.setStateRequestHandler(interfaceC59622Vq);
            } else {
                LJFF.setStateRequestHandler(null);
            }
        }
    }
}
