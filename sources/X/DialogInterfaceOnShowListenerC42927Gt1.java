package X;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Gt1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class DialogInterfaceOnShowListenerC42927Gt1 implements DialogInterface.OnShowListener {
    public final /* synthetic */ DialogC42922Gsw LJLIL;

    public DialogInterfaceOnShowListenerC42927Gt1(DialogC42922Gsw dialogC42922Gsw) {
        this.LJLIL = dialogC42922Gsw;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        AnchorPublishStruct anchorPublishStruct;
        ExtensionMisc extensionMisc;
        MobParam mobParam;
        String creationId;
        int i;
        ExtensionMisc extensionMisc2;
        MobParam mobParam2;
        String creationId2;
        AnchorPublishStruct anchorPublishStruct2;
        AnchorPublishStruct anchorPublishStruct3;
        String str;
        o.LJII(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        View findViewById = ((C18Z) dialogInterface).findViewById(R.id.c8m);
        if (findViewById != null) {
            BottomSheetBehavior from = BottomSheetBehavior.from(findViewById);
            o.LJIIIIZZ(from, "from(layout)");
            from.setPeekHeight(findViewById.getHeight());
            from.setSkipCollapsed(false);
            from.setBottomSheetCallback(new C42928Gt2(this.LJLIL));
            DialogC42922Gsw dialogC42922Gsw = this.LJLIL;
            Iterator<AnchorPublishStruct> it = dialogC42922Gsw.LJLJLLL.iterator();
            while (true) {
                if (it.hasNext()) {
                    anchorPublishStruct = it.next();
                    if (anchorPublishStruct.type == EnumC42934Gt8.PAID_COLLECTION.getTYPE()) {
                        break;
                    }
                } else {
                    anchorPublishStruct = null;
                    break;
                }
            }
            AnchorPublishStruct anchorPublishStruct4 = anchorPublishStruct;
            if (anchorPublishStruct4 != null) {
                C188727au c188727au = new C188727au();
                AnchorPublishStruct anchorPublishStruct5 = (AnchorPublishStruct) ORZ.LJLLLLLL(0, dialogC42922Gsw.LJLJLLL);
                if (anchorPublishStruct5 != null && (extensionMisc = anchorPublishStruct5.extensionMisc) != null && (mobParam = extensionMisc.getMobParam()) != null && (creationId = mobParam.getCreationId()) != null) {
                    c188727au.LJI("creation_id", creationId);
                }
                if (anchorPublishStruct4.enable) {
                    c188727au.LIZLLL(1, "is_available");
                } else {
                    c188727au.LIZLLL(0, "is_available");
                    c188727au.LJI("na_reason", "sound_not_compliant");
                }
                c188727au.LJI("button_for", String.valueOf(anchorPublishStruct4.type));
                c188727au.LJI("anchor_type", AnchorListManager.LJII(anchorPublishStruct4));
                c188727au.LJI("EVENT_ORIGIN_FEATURE", "TEMAI");
                FMX.LJIIL("tiktokec_video_add_link_show", c188727au.LIZ);
            }
            DialogC42922Gsw dialogC42922Gsw2 = this.LJLIL;
            boolean z = false;
            boolean z2 = false;
            for (AnchorPublishStruct anchorPublishStruct6 : dialogC42922Gsw2.LJLJLLL) {
                if (anchorPublishStruct6.type == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE()) {
                    z2 = anchorPublishStruct6.enable;
                    z = true;
                }
            }
            if (z) {
                C188727au LJIIIIZZ = JBR.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI", "anchor_type", "product");
                LJIIIIZZ.LJI("author_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
                LJIIIIZZ.LJI("button_for", "6");
                LJIIIIZZ.LJI("page_name", "video_add_link");
                if (z2) {
                    LJIIIIZZ.LIZLLL(1, "is_available");
                    i = 0;
                } else {
                    i = 0;
                    LJIIIIZZ.LIZLLL(0, "is_available");
                    LJIIIIZZ.LJI("na_reason", "sound_not_compliant");
                }
                AnchorPublishStruct anchorPublishStruct7 = (AnchorPublishStruct) ORZ.LJLLLLLL(i, dialogC42922Gsw2.LJLJLLL);
                if (anchorPublishStruct7 != null && (extensionMisc2 = anchorPublishStruct7.extensionMisc) != null && (mobParam2 = extensionMisc2.getMobParam()) != null && (creationId2 = mobParam2.getCreationId()) != null) {
                    LJIIIIZZ.LJI("creation_id", creationId2);
                }
                LJIIIIZZ.LJI("traceparent", PII.LIZIZ());
                FMX.LJIIL("tiktokec_video_add_link_show", LJIIIIZZ.LIZ);
            }
            Iterator<AnchorPublishStruct> it2 = this.LJLIL.LJLJLLL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    anchorPublishStruct2 = it2.next();
                    if (anchorPublishStruct2.type == EnumC42934Gt8.UG_PICK.getTYPE()) {
                        break;
                    }
                } else {
                    anchorPublishStruct2 = null;
                    break;
                }
            }
            AnchorPublishStruct anchorPublishStruct8 = anchorPublishStruct2;
            if (anchorPublishStruct8 != null) {
                C188727au LIZ = CK3.LIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
                LIZ.LJI("anchor_type", AnchorListManager.LJII(anchorPublishStruct8));
                LIZ.LJI("author_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
                LIZ.LJI("button_for", String.valueOf(anchorPublishStruct8.type));
                LIZ.LJI("page_name", "video_add_link");
                FMX.LJIIL("tiktokmusic_video_add_link_show", LIZ.LIZ);
            }
            Iterator<AnchorPublishStruct> it3 = this.LJLIL.LJLJLLL.iterator();
            while (true) {
                if (it3.hasNext()) {
                    anchorPublishStruct3 = it3.next();
                    if (anchorPublishStruct3.type == EnumC42934Gt8.MUSIC_PLAYLIST.getTYPE()) {
                        break;
                    }
                } else {
                    anchorPublishStruct3 = null;
                    break;
                }
            }
            AnchorPublishStruct anchorPublishStruct9 = anchorPublishStruct3;
            if (anchorPublishStruct9 != null) {
                C188727au LIZ2 = CK3.LIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
                LIZ2.LJI("anchor_type", AnchorListManager.LJII(anchorPublishStruct9));
                LIZ2.LJI("author_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
                LIZ2.LJI("button_for", String.valueOf(anchorPublishStruct9.type));
                LIZ2.LJI("page_name", "video_add_link");
                FMX.LJIIL("tiktokmusic_video_add_link_show", LIZ2.LIZ);
            }
            for (AnchorPublishStruct anchorPublishStruct10 : this.LJLIL.LJLJLLL) {
                if (anchorPublishStruct10.type == EnumC42934Gt8.GET_LEADS.getTYPE()) {
                    C237559Tz c237559Tz = new C237559Tz();
                    if (anchorPublishStruct10.enable) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    c237559Tz.LJI("ttelite_ba_lead_ba_video_show_getleads", new OSZ<>("enable", str), new OSZ<>("author_id", c237559Tz.LIZLLL("from_uid_id")));
                }
            }
            for (AnchorPublishStruct anchorPublishStruct11 : this.LJLIL.LJLJLLL) {
                if (anchorPublishStruct11.type == EnumC42934Gt8.BA_PRODUCT_ANCHOR.getTYPE()) {
                    new C237559Tz().LJI("ttelite_ba_video_product_publish_addlink_exp", new OSZ<>("link_status", Integer.valueOf(anchorPublishStruct11.baProductLinkState)));
                }
            }
        }
    }
}
