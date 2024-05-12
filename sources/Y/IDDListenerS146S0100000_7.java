package Y;

import X.AI8;
import X.AIF;
import X.ASQ;
import X.AST;
import X.ASW;
import X.ASX;
import X.ASY;
import X.ActivityC45651qj;
import X.C141365gi;
import X.C244009hs;
import X.C41047G9b;
import X.C44336Hae;
import X.C46074I6k;
import X.C60903NvH;
import X.C63804P2i;
import X.C76800UCe;
import X.C79004UzY;
import X.C86343Xud;
import X.ED5;
import X.FMX;
import X.G6Y;
import X.G73;
import X.G9M;
import X.GO2;
import X.I9C;
import X.InterfaceC153045zY;
import X.InterfaceC43129GwH;
import X.InterfaceC65784Pro;
import X.LRD;
import X.M78;
import android.content.DialogInterface;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDDListenerS146S0100000_7 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            case 2:
                onDismiss$2(this, dialogInterface);
                return;
            case 3:
                onDismiss$3(this, dialogInterface);
                return;
            case 4:
                onDismiss$4(this, dialogInterface);
                return;
            case 5:
                onDismiss$5(this, dialogInterface);
                return;
            case 6:
                onDismiss$6(this, dialogInterface);
                return;
            case 7:
                onDismiss$7(this, dialogInterface);
                return;
            case 8:
                onDismiss$8(this, dialogInterface);
                return;
            case 9:
                onDismiss$9(this, dialogInterface);
                return;
            case 10:
                onDismiss$10(this, dialogInterface);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onDismiss$11(this, dialogInterface);
                return;
            case 12:
                onDismiss$12(this, dialogInterface);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onDismiss$13(this, dialogInterface);
                return;
            case 14:
                onDismiss$14(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDDListenerS146S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(IDDListenerS146S0100000_7 iDDListenerS146S0100000_7, DialogInterface dialogInterface) {
        LRD.LIZ((ActivityC45651qj) iDDListenerS146S0100000_7.l0).LJIIJ("ad_explain_static_dynamic", false, null);
    }

    public static final void onDismiss$1(IDDListenerS146S0100000_7 iDDListenerS146S0100000_7, DialogInterface dialogInterface) {
        ((M78) iDDListenerS146S0100000_7.l0).LIZ();
    }

    public static final void onDismiss$10(IDDListenerS146S0100000_7 iDDListenerS146S0100000_7, DialogInterface dialogInterface) {
        C46074I6k c46074I6k = (C46074I6k) iDDListenerS146S0100000_7.l0;
        c46074I6k.LJIIJ = true;
        InterfaceC153045zY interfaceC153045zY = c46074I6k.LIZ;
        if (interfaceC153045zY != null) {
            interfaceC153045zY.cancelGenVideoFrame(c46074I6k.LIZLLL);
        }
        c46074I6k.LJIIL.removeCallbacksAndMessages(null);
    }

    public static final void onDismiss$11(IDDListenerS146S0100000_7 iDDListenerS146S0100000_7, DialogInterface dialogInterface) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((G73) iDDListenerS146S0100000_7.l0).LJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onDismiss$12(IDDListenerS146S0100000_7 iDDListenerS146S0100000_7, DialogInterface dialogInterface) {
        ((C44336Hae) iDDListenerS146S0100000_7.l0).LJLJJLL = false;
    }

    public static final void onDismiss$13(IDDListenerS146S0100000_7 iDDListenerS146S0100000_7, DialogInterface it) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        o.LJIIIIZZ(it, "it");
        AST LJIIIIZZ = ASQ.LJIIIIZZ(it);
        if (o.LJ(LJIIIIZZ, ASX.LIZ)) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = ((C63804P2i) iDDListenerS146S0100000_7.l0).LJFF;
            if (interfaceC65784Pro2 != null) {
                interfaceC65784Pro2.invoke();
                return;
            }
            return;
        }
        if (!o.LJ(LJIIIIZZ, ASY.LIZ) || (interfaceC65784Pro = ((C63804P2i) iDDListenerS146S0100000_7.l0).LJI) == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public static final void onDismiss$14(IDDListenerS146S0100000_7 iDDListenerS146S0100000_7, DialogInterface it) {
        o.LJIIIIZZ(it, "it");
        AST LJIIIIZZ = ASQ.LJIIIIZZ(it);
        if (LJIIIIZZ instanceof ASX) {
            I9C.LIZ((C86343Xud) iDDListenerS146S0100000_7.l0, "close");
        } else if (LJIIIIZZ instanceof ASY) {
            I9C.LIZ((C86343Xud) iDDListenerS146S0100000_7.l0, "close");
        } else {
            if (!(LJIIIIZZ instanceof ASW)) {
                return;
            }
            I9C.LIZ((C86343Xud) iDDListenerS146S0100000_7.l0, "back");
        }
    }

    public static final void onDismiss$2(IDDListenerS146S0100000_7 iDDListenerS146S0100000_7, DialogInterface dialogInterface) {
        ((M78) iDDListenerS146S0100000_7.l0).LIZ();
    }

    public static final void onDismiss$3(IDDListenerS146S0100000_7 iDDListenerS146S0100000_7, DialogInterface dialogInterface) {
        ((M78) iDDListenerS146S0100000_7.l0).LIZ();
    }

    public static final void onDismiss$4(IDDListenerS146S0100000_7 iDDListenerS146S0100000_7, DialogInterface dialogInterface) {
        M78 m78 = (M78) iDDListenerS146S0100000_7.l0;
        if (m78 != null) {
            m78.LIZ();
        }
    }

    public static final void onDismiss$5(IDDListenerS146S0100000_7 iDDListenerS146S0100000_7, DialogInterface dialogInterface) {
        M78 m78 = (M78) iDDListenerS146S0100000_7.l0;
        if (m78 != null) {
            m78.LIZ();
        }
    }

    public static final void onDismiss$6(IDDListenerS146S0100000_7 iDDListenerS146S0100000_7, DialogInterface dialog) {
        C41047G9b c41047G9b = (C41047G9b) iDDListenerS146S0100000_7.l0;
        o.LJIIIIZZ(dialog, "dialog");
        c41047G9b.LJJLIIJ(dialog);
    }

    public static final void onDismiss$7(IDDListenerS146S0100000_7 iDDListenerS146S0100000_7, DialogInterface dialogInterface) {
        boolean z;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) iDDListenerS146S0100000_7.l0;
        videoPublishContainerScene.getClass();
        AST LJIIIIZZ = ASQ.LJIIIIZZ(dialogInterface);
        int LIZ = videoPublishContainerScene.LLIIIILZ.LIZ();
        if (G6Y.LIZ()) {
            if (LIZ == 0) {
                z = true;
            } else {
                z = false;
            }
            AI8 ai8 = videoPublishContainerScene.LLJLL;
            if (ai8 != null) {
                PUgcTemplateData pUgcTemplateData = videoPublishContainerScene.LLILZLL.creativeModel.pugcTemplateData;
                boolean z2 = pUgcTemplateData.canPostTemplate;
                if (z) {
                    if (videoPublishContainerScene.LLJLLIL) {
                        pUgcTemplateData.canPostTemplate = true;
                        ((AIF) ai8.getAccessory()).LJIILIIL("On");
                        videoPublishContainerScene.LLJLLIL = false;
                    }
                } else {
                    if (z2) {
                        videoPublishContainerScene.LLJLLIL = true;
                    }
                    pUgcTemplateData.canPostTemplate = false;
                    ((AIF) ai8.getAccessory()).LJIILIIL("Off");
                }
                if (C141365gi.LIZIZ(videoPublishContainerScene.LLILZLL) && videoPublishContainerScene.LLILZLL.isPrivate == 0) {
                    videoPublishContainerScene.LLJLL.setAlpha(1.0f);
                } else {
                    videoPublishContainerScene.LLJLL.setAlpha(0.34f);
                }
                videoPublishContainerScene.k();
            }
        }
        String str = videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJJIIJZLJL;
        C60903NvH.LJIIJJI().getPublishService().LJJIIZI().getClass();
        if (str == null) {
            str = "";
        }
        G9M.LIZLLL(LIZ, "video_post_page", str, LJIIIIZZ);
    }

    public static final void onDismiss$8(IDDListenerS146S0100000_7 iDDListenerS146S0100000_7, DialogInterface it) {
        o.LJIIIIZZ(it, "it");
        boolean z = ASQ.LJIIIIZZ(it) instanceof ASY;
        String enterFrom = ((DraftFragment) iDDListenerS146S0100000_7.l0).getEnterFrom();
        String pageType = ((DraftFragment) iDDListenerS146S0100000_7.l0).Al();
        GO2.LIZ.getClass();
        boolean z2 = GO2.LIZJ.getBoolean("posted_draft_status", true);
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(pageType, "pageType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C244009hs.LIZ(enterFrom, pageType, linkedHashMap);
        linkedHashMap.put("is_auto_save_draft", C79004UzY.LJJJJLL(z2));
        linkedHashMap.put("is_click_dismiss", C79004UzY.LJJJJLL(z));
        FMX.LJIIL("draft_settings_dismiss", linkedHashMap);
    }

    public static final void onDismiss$9(IDDListenerS146S0100000_7 iDDListenerS146S0100000_7, DialogInterface dialogInterface) {
        ((CompletionBlock) iDDListenerS146S0100000_7.l0).onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC43129GwH.class, null), "");
    }
}
