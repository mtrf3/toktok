package X;

import android.app.Dialog;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.internal.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.property.EditorProIconServiceImpl;
import com.ss.android.ugc.aweme.services.IEditorProIconService;
import com.ss.android.ugc.aweme.services.external.IAnchorService;
import com.ss.android.ugc.aweme.services.external.ui.EditorProAnchorConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS74S1100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HS8 extends HSS {
    public long LJLJLLL;
    public int LJLJLJ = -1;
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 465));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(HSA.LJLIL);
    public String LJLLILLLL = "";

    public final EditorProAnchorConfig LJJJJJ() {
        return (EditorProAnchorConfig) this.LJLL.getValue();
    }

    public final IAnchorService LJJJJJL() {
        return (IAnchorService) this.LJLLI.getValue();
    }

    @Override // X.S1E
    public final S1E clone() {
        return new HS8();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.ANCHOR_EDITOR_PRO.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final String LIZ() {
        String keyword = LJJJJJ().getKeyword();
        if (keyword.length() == 0) {
            String LJFF = C86V.LJFF(R.string.bp6);
            o.LJIIIIZZ(LJFF, "getString(R.string.anchor_fyp_effect_editcreate)");
            return LJFF;
        }
        return keyword;
    }

    @Override // X.HSS, X.S1E
    public final void LIZLLL(SmartImageView imageView) {
        IEditorProIconService editorProIconService;
        AnchorCommonStruct anchorCommonStruct;
        UrlModel newStyleBubbleIcon;
        o.LJIIIZ(imageView, "imageView");
        String iconUrl = LJJJJJ().getIconUrl();
        if (iconUrl.length() == 0) {
            iconUrl = "https://p16.tiktokcdn.com/obj/tiktok-obj/editor_pro_general_edit_anchor_icon.png";
        }
        Object LIZ = C58096Mr6.LIZ(IEditorProIconService.class, false);
        if (LIZ != null) {
            editorProIconService = (IEditorProIconService) LIZ;
        } else {
            if (C58096Mr6.i4 == null) {
                synchronized (IEditorProIconService.class) {
                    if (C58096Mr6.i4 == null) {
                        C58096Mr6.i4 = new EditorProIconServiceImpl();
                    }
                }
            }
            editorProIconService = C58096Mr6.i4;
        }
        o.LJIIIIZZ(editorProIconService, "editorProIconService");
        if (C00F.LIZ(31744, 0, "studio_editor_pro_anchor_type", true) != 0 && H5U.LIZ() != 0 && o.LJ(LJJJJJ().getAnchorSubType(), EnumC1289754j.GENERAL.getType()) && editorProIconService.enableNewEditorProIcon() && (anchorCommonStruct = this.LJLJJL) != null && (newStyleBubbleIcon = anchorCommonStruct.getNewStyleBubbleIcon()) != null && this.LJLJJI) {
            newStyleBubbleIcon.setUri(editorProIconService.getTransparentEditorProIconUrl());
            List<String> urlList = newStyleBubbleIcon.getUrlList();
            urlList.clear();
            urlList.add(newStyleBubbleIcon.getUri());
        }
        LJJJJI(imageView, new AqS74S1100000_7(imageView, iconUrl, 10));
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        this.LJLJLJ = AVExternalServiceImpl.LIZ().anchorService().downloadIntroVideoIfNeed(LJJJJJ().getAnchorSubType(), LJJJJJ().getVideoGuideUrl());
        C188727au LJJIJIIJI = LJJIJIIJI();
        LJJJJL(LJJIJIIJI);
        C211648Si.LIZ(LJJIJIIJI, LJJII(), LJJIIZI(), true);
        FMX.LJIIL("multi_anchor_entrance_show", LJJIJIIJI.LIZ);
    }

    @Override // X.HSS, X.S1E
    public final EnumC26289ATl LJFF(List<AnchorCommonStruct> list) {
        Object obj;
        if (PrivacyServiceImpl.LIZIZ().isChildrenMode()) {
            return EnumC26289ATl.NOT_FOUND;
        }
        if (!LJJJJJL().isEditorProEnabled()) {
            return EnumC26289ATl.NOT_FOUND;
        }
        if (C00F.LIZ(31744, 0, "studio_editor_pro_anchor_type", true) != 0) {
            if (C00F.LIZ(31744, 0, "studio_editor_pro_anchor_type", true) == 3) {
                Iterator it = ((ArrayList) list).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((AnchorCommonStruct) obj).getType() == type()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) obj;
                this.LJLJJL = anchorCommonStruct;
                if (anchorCommonStruct != null && o.LJ(LJJJJJ().getAnchorSubType(), EnumC1289754j.GENERAL.getType())) {
                    return EnumC26289ATl.NOT_FOUND;
                }
            }
            return super.LJFF(list);
        }
        return EnumC26289ATl.NOT_FOUND;
    }

    @Override // X.HSS, X.S1E
    public final void LJI(C188727au c188727au) {
        C188727au LJJIJIIJI = LJJIJIIJI();
        LJJJJL(LJJIJIIJI);
        C211648Si.LIZ(LJJIJIIJI, LJJII(), LJJIIZI(), false);
        FMX.LJIIL("multi_anchor_entrance_click", LJJIJIIJI.LIZ);
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LJLJLLL < 500) {
            return;
        }
        this.LJLJLLL = currentTimeMillis;
        if (this.LJLJLJ != -1) {
            Downloader.getInstance(LJJI()).cancel(this.LJLJLJ, true);
            this.LJLJLJ = -1;
        }
        LJJJJIZL(new AqS138S0200000_7(this, eventMapBuilder, 60));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJL(X.C188727au r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HS8.LJJJJL(X.7au):void");
    }

    public final void LJJJJLI(C188727au c188727au) {
        SmartRoute buildRoute = SmartRouter.buildRoute(LJJI(), "//tools/anchor/editor_pro_guide_page");
        buildRoute.withParam("anchor_event_map", (HashMap) LJJIII(c188727au));
        buildRoute.withParam("editor_pro_anchor_config", LJJJJJ());
        buildRoute.open();
    }

    @Override // X.HSS, X.S1E
    public final void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        o.LJIIIZ(dialog, "dialog");
        LJJJJIZL(new AqS111S0300000_7(viewGroup, this, c188727au, 19));
    }
}
