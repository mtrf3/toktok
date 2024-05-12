package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.google.gson.internal.n;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class TCM implements n, InterfaceC36604EYe, TCO, X09 {
    public static final AnimationSet LJFF() {
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100L);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    @Override // com.google.gson.internal.n
    public Object LJI() {
        return new ArrayDeque();
    }

    public static long LJII() {
        C43023GuZ LIZIZ = C43014GuQ.LIZIZ();
        if (LIZIZ != null) {
            return LIZIZ.LIZIZ;
        }
        return -1L;
    }

    public static boolean LJIIJJI() {
        if (C43014GuQ.LIZIZ() == null) {
            return true;
        }
        C43023GuZ LIZIZ = C43014GuQ.LIZIZ();
        o.LJI(LIZIZ);
        List<? extends MusicModel> list = LIZIZ.LIZ;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public static List LJIIL() {
        List<? extends MusicModel> list;
        C43023GuZ LIZIZ = C43014GuQ.LIZIZ();
        if (LIZIZ != null) {
            list = LIZIZ.LIZ;
        } else {
            list = null;
        }
        return I9S.LIZIZ(list);
    }

    public static Integer LJIILLIIL() {
        C43023GuZ LIZIZ = C43014GuQ.LIZIZ();
        if (LIZIZ != null) {
            return Integer.valueOf(LIZIZ.LIZJ);
        }
        return null;
    }

    public void LJIILL() {
        C43023GuZ LIZIZ = C43014GuQ.LIZIZ();
        if (LIZIZ == null) {
            return;
        }
        LIZIZ.LIZIZ = -1L;
    }

    public static final String LJIIIIZZ(Aweme aweme) {
        o.LJIIIZ(aweme, "<this>");
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        o.LJIIIIZZ(anchors, "anchors");
        for (AnchorCommonStruct anchorCommonStruct : anchors) {
            if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_UGC_TEMPLATE.getTYPE()) {
                return anchorCommonStruct.getId();
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final boolean LJIIIZ(Aweme aweme) {
        AnchorCommonStruct anchorCommonStruct;
        String str;
        o.LJIIIZ(aweme, "<this>");
        if (aweme.getAnchors() == null) {
            return false;
        }
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        o.LJIIIIZZ(anchors, "anchors");
        if (!(!anchors.isEmpty())) {
            return false;
        }
        List<AnchorCommonStruct> anchors2 = aweme.getAnchors();
        o.LJIIIIZZ(anchors2, "anchors");
        Iterator<AnchorCommonStruct> it = anchors2.iterator();
        while (it.hasNext()) {
            if (it.next().getType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                List<AnchorCommonStruct> anchors3 = aweme.getAnchors();
                o.LJIIIIZZ(anchors3, "anchors");
                Iterator<AnchorCommonStruct> it2 = anchors3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        anchorCommonStruct = it2.next();
                        if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                            break;
                        }
                    } else {
                        anchorCommonStruct = null;
                        break;
                    }
                }
                AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                String str2 = "";
                if (anchorCommonStruct2 == null || (str = anchorCommonStruct2.getExtra()) == null) {
                    str = "";
                }
                try {
                    Object opt = new JSONObject(str).opt("author_id");
                    if (opt != null) {
                        String obj = opt.toString();
                        if (obj != null) {
                            str2 = obj;
                        }
                    }
                } catch (Exception unused) {
                }
                if (!o.LJ(str2, HG3.LJIILL().getCurUserId())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIIJ(Aweme aweme) {
        AnchorCommonStruct anchorCommonStruct;
        String str;
        o.LJIIIZ(aweme, "<this>");
        if (aweme.getAnchors() == null) {
            return false;
        }
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        o.LJIIIIZZ(anchors, "anchors");
        if (!(!anchors.isEmpty())) {
            return false;
        }
        List<AnchorCommonStruct> anchors2 = aweme.getAnchors();
        o.LJIIIIZZ(anchors2, "anchors");
        Iterator<AnchorCommonStruct> it = anchors2.iterator();
        while (it.hasNext()) {
            if (it.next().getType() == EnumC42934Gt8.ANCHOR_UGC_TEMPLATE.getTYPE()) {
                List<AnchorCommonStruct> anchors3 = aweme.getAnchors();
                o.LJIIIIZZ(anchors3, "anchors");
                Iterator<AnchorCommonStruct> it2 = anchors3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        anchorCommonStruct = it2.next();
                        if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_UGC_TEMPLATE.getTYPE()) {
                            break;
                        }
                    } else {
                        anchorCommonStruct = null;
                        break;
                    }
                }
                AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                String str2 = "";
                if (anchorCommonStruct2 == null || (str = anchorCommonStruct2.getExtra()) == null) {
                    str = "";
                }
                try {
                    Object opt = new JSONObject(str).opt("author_id");
                    if (opt != null) {
                        String obj = opt.toString();
                        if (obj != null) {
                            str2 = obj;
                        }
                    }
                } catch (Exception unused) {
                }
                if (!o.LJ(str2, HG3.LJIILL().getCurUserId())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIILIIL(LifecycleOwner lifecycleOwner) {
        if ((lifecycleOwner instanceof BottomBarPriorityProtocol) && ((Number) C52887KpH.LIZ.getValue()).intValue() == 0) {
            return true;
        }
        if ((lifecycleOwner instanceof VideoTagCategoryProtocol) && ((Number) C52683Klz.LIZ.getValue()).intValue() == 0) {
            return true;
        }
        if (!(lifecycleOwner instanceof PriorityProtocol) || ((Number) C52889KpJ.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        return true;
    }

    @Override // X.X09
    public BefTextLayoutResult LIZLLL(String str, BefTextLayout befTextLayout) {
        StaticLayout staticLayout;
        BefTextLayoutResult befTextLayoutResult = new BefTextLayoutResult();
        TCN tcn = new TCN(befTextLayout);
        if (tcn.LIZLLL != 2) {
            staticLayout = new StaticLayout(str, tcn.LIZ, tcn.LIZIZ, Layout.Alignment.ALIGN_NORMAL, tcn.LJI, 0.0f, false);
        } else {
            staticLayout = new StaticLayout(str, 0, str.length(), tcn.LIZ, tcn.LIZIZ, Layout.Alignment.ALIGN_NORMAL, tcn.LJI, 0.0f, false, TextUtils.TruncateAt.END, tcn.LIZIZ * tcn.LIZJ);
        }
        int i = tcn.LIZJ;
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        tcn.LJII = Math.min(i, staticLayout.getLineCount());
        Bitmap createBitmap = Bitmap.createBitmap(staticLayout.getWidth(), staticLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i2 = (int) tcn.LJ;
        canvas.drawColor(((i2 >> 8) & 16777215) | ((i2 << 24) & (-16777216)));
        staticLayout.draw(canvas);
        Bitmap bitmap = Bitmap.createBitmap(createBitmap, 0, 0, tcn.LIZIZ, Math.min(Math.round((tcn.LJII * tcn.LJI * tcn.LJFF) + tcn.LIZ.getFontMetrics().descent), createBitmap.getHeight()));
        befTextLayoutResult.setBitmap(bitmap);
        befTextLayoutResult.setLineCount(tcn.LJII);
        o.LJIIIIZZ(bitmap, "bitmap");
        befTextLayoutResult.setHeight(bitmap.getHeight());
        befTextLayoutResult.setWidth(bitmap.getWidth());
        return befTextLayoutResult;
    }

    public static final void LJIILJJIL(Assembler assembler, ReusedUIAssem reusedUIAssem, InterfaceC88472Yns assemBuilder) {
        BaseFeedPageParams rp0;
        o.LJIIIZ(reusedUIAssem, "<this>");
        o.LJIIIZ(assembler, "assembler");
        o.LJIIIZ(assemBuilder, "assemBuilder");
        C209808Lg c209808Lg = new C209808Lg();
        assemBuilder.invoke(c209808Lg);
        BaseCellTriggerComponent<? extends C3C8> baseCellTriggerComponent = c209808Lg.LIZIZ;
        if (baseCellTriggerComponent == null) {
            InterfaceC65350Pko<? extends BaseCellTriggerComponent<? extends C3C8>> interfaceC65350Pko = c209808Lg.LIZ;
            if (interfaceC65350Pko != null) {
                Object newInstance = C39557Ffl.LIZ(interfaceC65350Pko).newInstance();
                o.LJIIIIZZ(newInstance, "type.java.newInstance()");
                baseCellTriggerComponent = (BaseCellTriggerComponent) newInstance;
            } else {
                o.LJIJI("type");
                throw null;
            }
        }
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(reusedUIAssem), IVideoCellAbility.class, null);
        if (iVideoCellAbility == null || (rp0 = iVideoCellAbility.rp0()) == null || !baseCellTriggerComponent.c4(rp0, iVideoCellAbility.x20())) {
            return;
        }
        baseCellTriggerComponent.LL = rp0;
        assembler.rv0(reusedUIAssem, new AqS134S0200000_3((BaseCellTriggerComponent) baseCellTriggerComponent, (BaseCellTriggerComponent<? extends C3C8>) c209808Lg, (C209808Lg) 226));
    }

    @Override // X.InterfaceC36604EYe
    public void LJ(String url, java.util.Map map, InterfaceC36606EYg callback) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(callback, "callback");
        C36780Ec4 c36780Ec4 = C36992EfU.LJ;
        if (c36780Ec4 != null) {
            c36780Ec4.LJ(url, map, callback);
        }
    }

    @Override // X.InterfaceC36604EYe
    public void LIZ(String str, java.util.Map map, boolean z, java.util.Map map2, InterfaceC36606EYg interfaceC36606EYg) {
        C36603EYd.LIZ(this, str, map, interfaceC36606EYg);
    }

    @Override // X.InterfaceC36604EYe
    public void LIZIZ(String url, java.util.Map map, String str, JSONObject jSONObject, InterfaceC36606EYg callback) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(callback, "callback");
        C36780Ec4 c36780Ec4 = C36992EfU.LJ;
        if (c36780Ec4 != null) {
            c36780Ec4.LIZIZ(url, map, str, jSONObject, callback);
        }
    }

    @Override // X.InterfaceC36604EYe
    public void LIZJ(String str, java.util.Map map, String str2, JSONObject jSONObject, boolean z, java.util.Map map2, InterfaceC36606EYg interfaceC36606EYg) {
        C36603EYd.LIZIZ(this, str, map, str2, jSONObject, interfaceC36606EYg);
    }
}
