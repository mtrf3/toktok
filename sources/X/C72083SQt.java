package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.KtfInfo;
import com.ss.android.ugc.aweme.poi.tag.IPoiTagService;
import com.ss.android.ugc.aweme.service.CaptionServiceImpl;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SQt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72083SQt implements InterfaceC54922Lh0, PHH, IPoiTagService, InterfaceC64097PDp, InterfaceC212498Vp {
    public static final char[] LJLIL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static String LJLILLLLZI = "";
    public static C72083SQt LJLJI;

    @Override // X.PHH
    public void LIZIZ(boolean z) {
    }

    @Override // X.PHH
    public long LIZJ() {
        return -1L;
    }

    @Override // X.PHH
    public long LJFF() {
        return -1L;
    }

    @Override // X.InterfaceC64097PDp
    public boolean LJIILJJIL(String str) {
        return false;
    }

    @Override // X.PHH
    public long LJIILL() {
        return -1L;
    }

    @Override // X.PHH
    public long LJIILLIIL() {
        return -1L;
    }

    @Override // X.InterfaceC64097PDp
    public boolean LJIIZILJ(String str) {
        return false;
    }

    @Override // X.PHH
    public long LJJI() {
        return -1L;
    }

    @Override // X.PHH
    public long LJJIIJZLJL() {
        return -1L;
    }

    @Override // X.InterfaceC64097PDp
    public boolean LJJIIZI(String str, String str2) {
        return false;
    }

    @Override // X.InterfaceC64097PDp
    public boolean LJJJJJL(String str) {
        return false;
    }

    @Override // X.PHH
    public long LJJL() {
        return -1L;
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public void appendPoiTagParamsIfHave(String str, HashMap params, Aweme aweme) {
        o.LJIIIZ(params, "params");
    }

    @Override // X.InterfaceC64097PDp
    public boolean getLogTypeSwitch(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public VideoTagCategoryProtocol getPoiTagTrigger() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public InterfaceC211228Qs getPoiTagView(Context context) {
        o.LJIIIZ(context, "context");
        return null;
    }

    @Override // X.InterfaceC64097PDp
    public boolean getServiceSwitch(String str) {
        return false;
    }

    @Override // X.PHH
    public void init() {
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public boolean isPoiTagShow(String str, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return false;
    }

    public static Aweme LJJLIIIJJIZ(C2MA c2ma) {
        if (c2ma == null) {
            return null;
        }
        return c2ma.getAweme();
    }

    public static boolean LJJLIIIJL(Aweme aweme) {
        if (aweme != null && aweme.getInteractStickerStructs() != null && aweme.getInteractStickerStructs().size() > 0) {
            for (InteractStickerStruct interactStickerStruct : aweme.getInteractStickerStructs()) {
                if (interactStickerStruct.getCaptionStruct() != null && !C79004UzY.LJJIFFI(interactStickerStruct.getCaptionStruct().getAutoCaptions()) && interactStickerStruct.getType() == 11) {
                    if (interactStickerStruct.getCaptionStruct().getDisable() != 0) {
                        if (interactStickerStruct.getCaptionStruct().getDisable() > 0 && !CaptionServiceImpl.LJIILIIL().LJIIIIZZ(aweme)) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean LJJLIIIJLLLLLLLZ(C2MA c2ma) {
        if (c2ma != null && c2ma.getAweme() != null && c2ma.getAweme().isAd()) {
            return true;
        }
        return false;
    }

    public static boolean LJJLL(C2MA c2ma) {
        if (c2ma != null && c2ma.getAweme() != null && c2ma.getAweme().getAwemeType() == 31) {
            return true;
        }
        return false;
    }

    public static boolean LJJZ(Aweme aweme) {
        if (aweme == null || C78996UzQ.LJIILJJIL(aweme) == null) {
            return false;
        }
        Aweme LJIILJJIL = C78996UzQ.LJIILJJIL(aweme);
        if (LJIILJJIL.getAwemeType() != 502 && LJIILJJIL.getAwemeType() != 501) {
            return false;
        }
        return true;
    }

    public static boolean LJJZZI(Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            return true;
        }
        return false;
    }

    public static boolean LJJZZIII(C2MA c2ma) {
        if (c2ma != null && LJJZZI(c2ma.getAweme())) {
            return true;
        }
        return false;
    }

    public static boolean LJL(Aweme aweme) {
        if (aweme != null && aweme.getAwemeType() == 327) {
            return true;
        }
        return false;
    }

    public static boolean LJLI(Aweme aweme) {
        if (aweme != null && aweme.getAwemeType() == 326) {
            return true;
        }
        return false;
    }

    public static boolean LJLIIIL(Aweme aweme) {
        if (aweme != null && aweme.getAuthor() != null && TextUtils.equals(aweme.getAuthor().getUid(), HG3.LJIILL().getCurUser().getUid())) {
            return true;
        }
        return false;
    }

    public static boolean LJLIIL(Aweme aweme) {
        KtfInfo ktfInfo;
        if (aweme == null || (ktfInfo = aweme.getUploadMiscInfoStruct().ktfInfo) == null || !ktfInfo.getShowWarning()) {
            return false;
        }
        return true;
    }

    public static boolean LJLIL(Aweme aweme) {
        if (aweme != null && aweme.getAwemeType() == 328) {
            return true;
        }
        return false;
    }

    public static boolean LJLILLLLZI(C2MA c2ma) {
        if (c2ma != null && c2ma.LLLJ() != null && c2ma.LLLJ().UU() == 1) {
            return true;
        }
        return false;
    }

    public static void LJLJI(Aweme aweme) {
        List<AwemeLabelModel> videoLabels = aweme.getVideoLabels();
        if (C79004UzY.LJJIFFI(videoLabels)) {
            return;
        }
        for (int i = 0; i < videoLabels.size(); i++) {
            AwemeLabelModel awemeLabelModel = (AwemeLabelModel) ListProtector.get(videoLabels, i);
            if (awemeLabelModel != null && awemeLabelModel.getLabelType() == 1 && !C78996UzQ.LJJIIZI(aweme) && aweme.getStatus() != null && aweme.isPrivate()) {
                videoLabels.remove(awemeLabelModel);
            }
        }
    }

    public static C73296Spg LJLJJLL(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        return new C73296Spg(context, null);
    }

    public static final View LJLJJI(ViewGroup viewGroup, InterfaceC88471Ynr interfaceC88471Ynr) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.cqm, viewGroup, false);
        View title = LIZIZ.findViewById(R.id.mo6);
        View desc = LIZIZ.findViewById(R.id.m4n);
        if (interfaceC88471Ynr != null) {
            o.LJIIIIZZ(title, "title");
            o.LJIIIIZZ(desc, "desc");
            interfaceC88471Ynr.invoke(title, desc);
        }
        return LIZIZ;
    }

    public static final View LJLJJL(ViewGroup viewGroup, InterfaceC88473Ynt interfaceC88473Ynt) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.cqn, viewGroup, false);
        View title = LIZIZ.findViewById(R.id.mo6);
        View desc = LIZIZ.findViewById(R.id.m4n);
        View button = LIZIZ.findViewById(R.id.m18);
        o.LJIIIIZZ(title, "title");
        o.LJIIIIZZ(desc, "desc");
        o.LJIIIIZZ(button, "button");
        interfaceC88473Ynt.invoke(title, desc, button);
        return LIZIZ;
    }

    @Override // X.InterfaceC212498Vp
    public void LJ(Context context, C212518Vr mode, int i, View view, InterfaceC88472Yns interfaceC88472Yns) {
        ViewGroup viewGroup;
        o.LJIIIZ(mode, "mode");
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        interfaceC88472Yns.invoke(C38619FDr.LIZIZ(i, context, viewGroup, false));
    }
}
